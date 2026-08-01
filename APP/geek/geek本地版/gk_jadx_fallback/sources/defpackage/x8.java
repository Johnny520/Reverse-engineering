package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x8 extends android.util.Property {
    public final /* synthetic */ int a;

    public /* synthetic */ x8(java.lang.Class r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // android.util.Property
    public final java.lang.Object get(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.a
            r1 = 0
            switch(r0) {
                case 0: goto L28;
                case 1: goto L25;
                case 2: goto L22;
                case 3: goto L1f;
                case 4: goto L1c;
                case 5: goto Lf;
                default: goto L6;
            }
        L6:
            android.view.View r3 = (android.view.View) r3
            java.util.WeakHashMap r0 = defpackage.ja0.a
            android.graphics.Rect r3 = defpackage.u90.a(r3)
            return r3
        Lf:
            android.view.View r3 = (android.view.View) r3
            db0 r0 = defpackage.bb0.a
            float r3 = r0.x(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
        L1c:
            android.view.View r3 = (android.view.View) r3
            return r1
        L1f:
            android.view.View r3 = (android.view.View) r3
            return r1
        L22:
            android.view.View r3 = (android.view.View) r3
            return r1
        L25:
            a9 r3 = (defpackage.a9) r3
            return r1
        L28:
            a9 r3 = (defpackage.a9) r3
            return r1
    }

    @Override // android.util.Property
    public final void set(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.a
            r1 = 0
            switch(r0) {
                case 0: goto La5;
                case 1: goto L74;
                case 2: goto L58;
                case 3: goto L3c;
                case 4: goto L1e;
                case 5: goto L10;
                default: goto L6;
            }
        L6:
            android.view.View r6 = (android.view.View) r6
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            java.util.WeakHashMap r0 = defpackage.ja0.a
            defpackage.u90.c(r6, r7)
            return
        L10:
            android.view.View r6 = (android.view.View) r6
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            db0 r0 = defpackage.bb0.a
            r0.N(r6, r7)
            return
        L1e:
            android.view.View r6 = (android.view.View) r6
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            float r0 = r7.x
            int r0 = java.lang.Math.round(r0)
            float r7 = r7.y
            int r7 = java.lang.Math.round(r7)
            int r1 = r6.getWidth()
            int r1 = r1 + r0
            int r2 = r6.getHeight()
            int r2 = r2 + r7
            defpackage.bb0.a(r6, r0, r7, r1, r2)
            return
        L3c:
            android.view.View r6 = (android.view.View) r6
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            float r0 = r7.x
            int r0 = java.lang.Math.round(r0)
            float r7 = r7.y
            int r7 = java.lang.Math.round(r7)
            int r1 = r6.getRight()
            int r2 = r6.getBottom()
            defpackage.bb0.a(r6, r0, r7, r1, r2)
            return
        L58:
            android.view.View r6 = (android.view.View) r6
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            int r0 = r6.getLeft()
            int r1 = r6.getTop()
            float r2 = r7.x
            int r2 = java.lang.Math.round(r2)
            float r7 = r7.y
            int r7 = java.lang.Math.round(r7)
            defpackage.bb0.a(r6, r0, r1, r2, r7)
            return
        L74:
            a9 r6 = (defpackage.a9) r6
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            r6.getClass()
            float r0 = r7.x
            int r0 = java.lang.Math.round(r0)
            r6.c = r0
            float r7 = r7.y
            int r7 = java.lang.Math.round(r7)
            r6.d = r7
            int r0 = r6.g
            int r0 = r0 + 1
            r6.g = r0
            int r2 = r6.f
            if (r2 != r0) goto La4
            android.view.View r0 = r6.e
            int r2 = r6.a
            int r3 = r6.b
            int r4 = r6.c
            defpackage.bb0.a(r0, r2, r3, r4, r7)
            r6.f = r1
            r6.g = r1
        La4:
            return
        La5:
            a9 r6 = (defpackage.a9) r6
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            r6.getClass()
            float r0 = r7.x
            int r0 = java.lang.Math.round(r0)
            r6.a = r0
            float r7 = r7.y
            int r7 = java.lang.Math.round(r7)
            r6.b = r7
            int r0 = r6.f
            int r0 = r0 + 1
            r6.f = r0
            int r2 = r6.g
            if (r0 != r2) goto Ld5
            android.view.View r0 = r6.e
            int r2 = r6.a
            int r3 = r6.c
            int r4 = r6.d
            defpackage.bb0.a(r0, r2, r7, r3, r4)
            r6.f = r1
            r6.g = r1
        Ld5:
            return
    }
}
