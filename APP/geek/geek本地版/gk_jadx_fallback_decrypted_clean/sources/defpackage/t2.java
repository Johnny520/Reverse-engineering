package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t2 implements defpackage.yw {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.fragment.app.FragmentActivity b;

    public /* synthetic */ t2(androidx.fragment.app.FragmentActivity r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.yw
    public final void a() {
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L2f;
                default: goto L5;
            }
        L5:
            androidx.fragment.app.FragmentActivity r0 = r5.b
            l0 r1 = r0.s
            java.lang.Object r2 = r1.b
            nl r2 = (defpackage.nl) r2
            yl r3 = r2.F
            r4 = 0
            r3.b(r2, r2, r4)
            gm r0 = r0.e
            java.lang.Object r0 = r0.c
            a3 r0 = (defpackage.a3) r0
            java.lang.String r2 = "android:support:fragments"
            android.os.Bundle r0 = r0.c(r2)
            if (r0 == 0) goto L2e
            android.os.Parcelable r0 = r0.getParcelable(r2)
            java.lang.Object r1 = r1.b
            nl r1 = (defpackage.nl) r1
            yl r1 = r1.F
            r1.K(r0)
        L2e:
            return
        L2f:
            androidx.fragment.app.FragmentActivity r0 = r5.b
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            e3 r1 = r0.l()
            r1.a()
            gm r0 = r0.e
            java.lang.Object r0 = r0.c
            a3 r0 = (defpackage.a3) r0
            java.lang.String r2 = "androidx:appcompat"
            r0.c(r2)
            r1.d()
            return
    }
}
