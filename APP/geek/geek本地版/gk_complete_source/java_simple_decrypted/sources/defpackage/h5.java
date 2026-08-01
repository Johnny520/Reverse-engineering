package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class h5 {
    public static StaticLayout a(CharSequence r8, Layout.Alignment r9, int r10, TextView r11, TextPaint r12) {
        return new StaticLayout(r8, r12, r10, r9, r11.getLineSpacingMultiplier(), r11.getLineSpacingExtra(), r11.getIncludeFontPadding());
    }

    public static int b(TextView r0) {
        return r0.getMaxLines();
    }
}
