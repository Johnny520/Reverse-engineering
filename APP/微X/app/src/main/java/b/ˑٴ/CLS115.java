// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.view.Window;
import android.widget.SeekBar;
import android.widget.Toolbar;
import java.io.File;
import java.util.concurrent.ThreadLocalRandom;

public final class CLS115 {
    public static String[] MTH2259() {
        return Build.SUPPORTED_ABIS;
    }

    public static void MTH2260(SeekBar seekBar0, ColorStateList colorStateList0) {
        seekBar0.setProgressTintList(colorStateList0);
    }

    public static void MTH2261(Toolbar toolbar0, String s) {
        toolbar0.setTitle(s);
    }

    public static int MTH2262(ThreadLocalRandom threadLocalRandom0, int v) {
        return threadLocalRandom0.nextInt(0, v);
    }

    public static void MTH2263(TextToSpeech textToSpeech0, CharSequence charSequence0) {
        textToSpeech0.speak(charSequence0, 0, null, null);
    }

    public static ThreadLocalRandom MTH2264() {
        return ThreadLocalRandom.current();
    }

    public static Drawable MTH2265(Activity activity0, int v) {
        return activity0.getDrawable(v);
    }

    public static void MTH2266(Drawable drawable0, int v) {
        drawable0.setTint(v);
    }

    public static void MTH2267(Window window0, int v) {
        window0.setStatusBarColor(v);
    }

    public static void MTH2268(TextToSpeech textToSpeech0, CharSequence charSequence0, File file0, String s) {
        textToSpeech0.synthesizeToFile(charSequence0, null, file0, s);
    }
}

