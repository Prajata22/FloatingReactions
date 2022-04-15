package com.applex.floatingreactions

import android.os.Bundle
import android.view.ViewGroup
import android.view.animation.Animation
import androidx.appcompat.app.AppCompatActivity
import com.applex.floatingreactions.flyingReactionsView.Direction
import com.applex.floatingreactions.flyingReactionsView.ZeroGravityAnimation


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedState: Bundle?) {
        super.onCreate(savedState)
        setContentView(R.layout.activity_main)
        emoji_one()
        emoji_two()
        emoji_three()
    }

    private fun flyEmoji(resId: Int) {
        val animation = ZeroGravityAnimation()
        animation.setCount(1)
        animation.setScalingFactor(0.2f)
        animation.setOriginationDirection(Direction.BOTTOM)
        animation.setDestinationDirection(Direction.TOP)
        animation.setImage(resId)
        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {}
            override fun onAnimationEnd(animation: Animation) {}
            override fun onAnimationRepeat(animation: Animation) {}
        }
        )
        val container = findViewById<ViewGroup>(R.id.animation_holder)
        animation.play(this, container)
    }

    private fun emoji_one() {
        // You can change the number of emojis that will be flying on screen
        for (i in 0..4) {
            flyEmoji(R.drawable.ic_baseline_alarm_24)
        }
    }
    // You can change the number of emojis that will be flying on screen

    // You can change the number of emojis that will be flying on screen
    private fun emoji_two() {
        for (i in 0..4) {
            flyEmoji(R.drawable.ic_baseline_airplanemode_active_24)
        }
    }
    // You can change the number of emojis that will be flying on screen

    // You can change the number of emojis that will be flying on screen
    private fun emoji_three() {
        for (i in 0..4) {
            flyEmoji(R.drawable.ic_baseline_airline_seat_legroom_reduced_24)
        }
    }


    // This method will be used if You want to fly your Emois Over any view

//    public void flyObject(final int resId, final int duration, final Direction from, final Direction to, final float scale) {
//
//        ZeroGravityAnimation animation = new ZeroGravityAnimation();
//        animation.setCount(1);
//        animation.setScalingFactor(scale);
//        animation.setOriginationDirection(from);
//        animation.setDestinationDirection(to);
//        animation.setImage(resId);
//        animation.setDuration(duration);
//        animation.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//
//                flyObject(resId, duration, from, to, scale);
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });
//
//        ViewGroup container = (ViewGroup) findViewById(R.id.animation_bigger_objects_holder);
//        animation.play(this,container);
//
//    }
//
}