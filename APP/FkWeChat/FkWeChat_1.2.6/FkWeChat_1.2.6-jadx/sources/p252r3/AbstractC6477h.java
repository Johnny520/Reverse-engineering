package p252r3;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import p117i.C3043c0;
import p238q4.AbstractC6244a;
import p292u3.AbstractC8503f;

/* JADX INFO: renamed from: r3.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6477h {

    /* JADX INFO: renamed from: a */
    public static final AbstractC6482m f20352a;

    /* JADX INFO: renamed from: b */
    public static final C3043c0 f20353b;

    static {
        AbstractC6244a.m24638a("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f20352a = new C6481l();
        } else if (i10 >= 28) {
            f20352a = new C6480k();
        } else {
            f20352a = new C6479j();
        }
        f20353b = new C3043c0(16);
        AbstractC6244a.m24639b();
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m25659a(Context context, CancellationSignal cancellationSignal, AbstractC8503f.b[] bVarArr, int i10) {
        AbstractC6244a.m24638a("TypefaceCompat.createFromFontInfo");
        try {
            return f20352a.mo25660a(context, cancellationSignal, bVarArr, i10);
        } finally {
            AbstractC6244a.m24639b();
        }
    }
}
