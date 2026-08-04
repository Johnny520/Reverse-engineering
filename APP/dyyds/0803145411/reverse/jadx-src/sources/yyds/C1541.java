package yyds;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: yyds.ᛷᛴᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1541 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final PorterDuff.Mode f7386 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C1541 f7387;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C1542 f7388;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static synchronized C1541 m3170() {
        try {
            if (f7387 == null) {
                m3171();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7387;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static synchronized void m3171() {
        if (f7387 == null) {
            C1541 c1541 = new C1541();
            f7387 = c1541;
            c1541.f7388 = C1542.m3174();
            C1542 c1542 = f7387.f7388;
            C1521 c1521 = new C1521(0);
            synchronized (c1542) {
                c1542.f7392 = c1521;
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final synchronized Drawable m3172(Context context, int i) {
        return this.f7388.m3181(context, i);
    }
}
