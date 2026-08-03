package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public RemoteActionCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.app.RemoteActionCompat read(a.AbstractC0253lg r3) {
            androidx.core.app.RemoteActionCompat r0 = new androidx.core.app.RemoteActionCompat
            r0.<init>()
            androidx.core.graphics.drawable.IconCompat r1 = r0.f881a
            r2 = 1
            boolean r2 = r3.h(r2)
            if (r2 != 0) goto Lf
            goto L13
        Lf:
            a.ng r1 = r3.l()
        L13:
            androidx.core.graphics.drawable.IconCompat r1 = (androidx.core.graphics.drawable.IconCompat) r1
            r0.f881a = r1
            java.lang.CharSequence r1 = r0.b
            r2 = 2
            boolean r2 = r3.h(r2)
            if (r2 != 0) goto L21
            goto L25
        L21:
            java.lang.CharSequence r1 = r3.g()
        L25:
            r0.b = r1
            java.lang.CharSequence r1 = r0.c
            r2 = 3
            boolean r2 = r3.h(r2)
            if (r2 != 0) goto L31
            goto L35
        L31:
            java.lang.CharSequence r1 = r3.g()
        L35:
            r0.c = r1
            android.app.PendingIntent r1 = r0.d
            r2 = 4
            boolean r2 = r3.h(r2)
            if (r2 != 0) goto L41
            goto L45
        L41:
            android.os.Parcelable r1 = r3.j()
        L45:
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r0.d = r1
            boolean r1 = r0.e
            r2 = 5
            boolean r2 = r3.h(r2)
            if (r2 != 0) goto L53
            goto L57
        L53:
            boolean r1 = r3.e()
        L57:
            r0.e = r1
            boolean r1 = r0.f
            r2 = 6
            boolean r2 = r3.h(r2)
            if (r2 != 0) goto L63
            goto L67
        L63:
            boolean r1 = r3.e()
        L67:
            r0.f = r1
            return r0
    }

    public static void write(androidx.core.app.RemoteActionCompat r2, a.AbstractC0253lg r3) {
            r3.getClass()
            androidx.core.graphics.drawable.IconCompat r0 = r2.f881a
            r1 = 1
            r3.m(r1)
            r3.t(r0)
            java.lang.CharSequence r0 = r2.b
            r1 = 2
            r3.m(r1)
            r3.p(r0)
            java.lang.CharSequence r0 = r2.c
            r1 = 3
            r3.m(r1)
            r3.p(r0)
            android.app.PendingIntent r0 = r2.d
            r1 = 4
            r3.m(r1)
            r3.r(r0)
            boolean r0 = r2.e
            r1 = 5
            r3.m(r1)
            r3.n(r0)
            boolean r2 = r2.f
            r0 = 6
            r3.m(r0)
            r3.n(r2)
            return
    }
}
