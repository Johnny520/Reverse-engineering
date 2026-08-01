package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ce implements java.util.Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ce(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.a
            r1 = 1
            r2 = -1
            r3 = 0
            switch(r0) {
                case 0: goto L6c;
                case 1: goto L37;
                case 2: goto L2e;
                case 3: goto L20;
                default: goto L8;
            }
        L8:
            mb0 r7 = (defpackage.mb0) r7
            int r7 = r7.b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            mb0 r8 = (defpackage.mb0) r8
            int r8 = r8.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            if (r7 != r8) goto L1b
            goto L1f
        L1b:
            int r3 = r7.compareTo(r8)
        L1f:
            return r3
        L20:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            int r7 = r7.getTop()
            int r8 = r8.getTop()
        L2c:
            int r7 = r7 - r8
            return r7
        L2e:
            a40 r7 = (defpackage.a40) r7
            a40 r8 = (defpackage.a40) r8
            int r7 = r7.b
            int r8 = r8.b
            goto L2c
        L37:
            cn r7 = (defpackage.cn) r7
            cn r8 = (defpackage.cn) r8
            androidx.recyclerview.widget.RecyclerView r0 = r7.d
            if (r0 != 0) goto L41
            r4 = r1
            goto L42
        L41:
            r4 = r3
        L42:
            androidx.recyclerview.widget.RecyclerView r5 = r8.d
            if (r5 != 0) goto L48
            r5 = r1
            goto L49
        L48:
            r5 = r3
        L49:
            if (r4 == r5) goto L4e
            if (r0 != 0) goto L56
            goto L6b
        L4e:
            boolean r0 = r7.a
            boolean r4 = r8.a
            if (r0 == r4) goto L58
            if (r0 == 0) goto L6b
        L56:
            r1 = r2
            goto L6b
        L58:
            int r0 = r8.b
            int r1 = r7.b
            int r1 = r0 - r1
            if (r1 == 0) goto L61
            goto L6b
        L61:
            int r7 = r7.c
            int r8 = r8.c
            int r1 = r7 - r8
            if (r1 == 0) goto L6a
            goto L6b
        L6a:
            r1 = r3
        L6b:
            return r1
        L6c:
            android.view.View r7 = (android.view.View) r7
            android.view.View r8 = (android.view.View) r8
            java.util.WeakHashMap r0 = defpackage.ja0.a
            float r7 = defpackage.y90.m(r7)
            float r8 = defpackage.y90.m(r8)
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 <= 0) goto L80
            r1 = r2
            goto L86
        L80:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L85
            goto L86
        L85:
            r1 = r3
        L86:
            return r1
    }
}
