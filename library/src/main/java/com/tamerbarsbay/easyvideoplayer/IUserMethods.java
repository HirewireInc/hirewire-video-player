package com.tamerbarsbay.easyvideoplayer;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.CheckResult;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;

/**
 * @author Aidan Follestad (afollestad)
 */
interface IUserMethods {

    void setSource(@NonNull Uri source);

    void setCallback(@NonNull EasyVideoCallback callback);

    void setProgressCallback(@NonNull EasyVideoProgressCallback callback);

    void setLeftAction(@EasyVideoPlayer.LeftAction int action);

    void setRightAction(@EasyVideoPlayer.RightAction int action);

    void setLeftDrawable(@NonNull Drawable drawable);

    void setLeftDrawableRes(@DrawableRes int res);

    void setRightDrawable(@NonNull Drawable drawable);

    void setRightDrawableRes(@DrawableRes int res);

    void setPlayDrawable(@NonNull Drawable drawable);

    void setPlayDrawableRes(@DrawableRes int res);

    void setPauseDrawable(@NonNull Drawable drawable);

    void setPauseDrawableRes(@DrawableRes int res);

    void setHideControlsOnPlay(boolean hide);

    void setAutoPlay(boolean autoPlay);

    void setInitialPosition(@IntRange(from = 0, to = Integer.MAX_VALUE) int pos);

    void setQuestionNumber(String questionNumber);

    void setQuestionText(String questionText);

    void showControls();

    void hideControls();

    @CheckResult
    boolean isControlsShown();

    void toggleControls();

    void enableControls(boolean andShow);

    void disableControls();

    @CheckResult
    boolean isPrepared();

    @CheckResult
    boolean isPlaying();

    @CheckResult
    int getCurrentPosition();

    @CheckResult
    int getDuration();

    void start();

    void seekTo(@IntRange(from = 0, to = Integer.MAX_VALUE) int pos);

    void setVolume(@FloatRange(from = 0f, to = 1f) float leftVolume, @FloatRange(from = 0f, to = 1f) float rightVolume);

    void pause();

    void stop();

    void reset();

    void release();
}