package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s2 implements defpackage.t10 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public s2(defpackage.a3 r2) {
            r1 = this;
            r0 = 2
            r1.a = r0
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.b = r0
            java.lang.String r0 = "androidx.savedstate.Restarter"
            r2.e(r0, r1)
            return
    }

    public /* synthetic */ s2(androidx.fragment.app.FragmentActivity r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.t10
    public final android.os.Bundle a() {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L49;
                case 1: goto L19;
                default: goto L5;
            }
        L5:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.Object r2 = r4.b
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            r1.<init>(r2)
            java.lang.String r2 = "classes_to_restore"
            r0.putStringArrayList(r2, r1)
            return r0
        L19:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Object r1 = r4.b
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            l0 r2 = r1.s
        L24:
            java.lang.Object r3 = r2.b
            nl r3 = (defpackage.nl) r3
            yl r3 = r3.F
            boolean r3 = androidx.fragment.app.FragmentActivity.k(r3)
            if (r3 != 0) goto L24
            androidx.lifecycle.a r1 = r1.t
            iq r3 = defpackage.iq.ON_STOP
            r1.d(r3)
            java.lang.Object r1 = r2.b
            nl r1 = (defpackage.nl) r1
            yl r1 = r1.F
            zl r1 = r1.L()
            if (r1 == 0) goto L48
            java.lang.String r2 = "android:support:fragments"
            r0.putParcelable(r2, r1)
        L48:
            return r0
        L49:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.Object r1 = r4.b
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
            e3 r1 = r1.l()
            r1.getClass()
            return r0
    }
}
