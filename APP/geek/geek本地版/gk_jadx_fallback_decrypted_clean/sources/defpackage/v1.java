package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends defpackage.ff {
    public final /* synthetic */ int A;

    public /* synthetic */ v1(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ff
    public final java.lang.Object D(int r6, android.content.Intent r7) {
            r5 = this;
            int r0 = r5.A
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lb;
                default: goto L5;
            }
        L5:
            u1 r0 = new u1
            r0.<init>(r6, r7)
            return r0
        Lb:
            u1 r0 = new u1
            r0.<init>(r6, r7)
            return r0
        L11:
            r0 = -1
            if (r6 == r0) goto L16
            goto L95
        L16:
            if (r7 != 0) goto L1a
            goto L95
        L1a:
            java.lang.String r6 = "androidx.activity.result.contract.extra.PERMISSIONS"
            java.lang.String[] r6 = r7.getStringArrayExtra(r6)
            java.lang.String r0 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            int[] r7 = r7.getIntArrayExtra(r0)
            if (r7 == 0) goto L95
            if (r6 != 0) goto L2c
            goto L95
        L2c:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
            r3 = r2
        L35:
            if (r3 >= r1) goto L48
            r4 = r7[r3]
            if (r4 != 0) goto L3d
            r4 = 1
            goto L3e
        L3d:
            r4 = r2
        L3e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto L35
        L48:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r1 = r6.length
        L4e:
            if (r2 >= r1) goto L5a
            r3 = r6[r2]
            if (r3 == 0) goto L57
            r7.add(r3)
        L57:
            int r2 = r2 + 1
            goto L4e
        L5a:
            java.util.Iterator r6 = r7.iterator()
            java.util.Iterator r1 = r0.iterator()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r7 = defpackage.cb.h0(r7)
            int r0 = defpackage.cb.h0(r0)
            int r7 = java.lang.Math.min(r7, r0)
            r2.<init>(r7)
        L73:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L90
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L90
            java.lang.Object r7 = r6.next()
            java.lang.Object r0 = r1.next()
            kx r3 = new kx
            r3.<init>(r7, r0)
            r2.add(r3)
            goto L73
        L90:
            java.util.Map r6 = defpackage.dt.A(r2)
            goto L97
        L95:
            zi r6 = defpackage.zi.a
        L97:
            return r6
    }
}
