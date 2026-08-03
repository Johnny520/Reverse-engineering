package p018b3;

import android.os.Build;
import android.os.Trace;
import androidx.lifecycle.C0100e0;
import p000a.AbstractC0000a;

/* JADX INFO: renamed from: b3.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0173c {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0000a f450a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC0000a.m80o("TypefaceCompat static init");
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            f450a = new C0176f();
        } else if (i9 >= 28) {
            f450a = new C0175e();
        } else {
            f450a = new C0174d();
        }
        new C0100e0(1);
        Trace.endSection();
    }
}
