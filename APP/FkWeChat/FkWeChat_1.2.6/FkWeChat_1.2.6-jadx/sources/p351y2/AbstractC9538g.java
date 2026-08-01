package p351y2;

import android.os.Build;
import android.text.TextPaint;

/* JADX INFO: renamed from: y2.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9538g {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC9537f m37326a(CharSequence charSequence, TextPaint textPaint) {
        return Build.VERSION.SDK_INT >= 29 ? new C9535d(charSequence, textPaint) : new C9536e(charSequence);
    }
}
