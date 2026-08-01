package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y80 extends defpackage.z80 {
    public final android.graphics.Matrix a;
    public final java.util.ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final android.graphics.Matrix j;
    public java.lang.String k;

    public y80() {
            r2 = this;
            r2.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.b = r0
            r0 = 0
            r2.c = r0
            r2.d = r0
            r2.e = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.f = r1
            r2.g = r1
            r2.h = r0
            r2.i = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.j = r0
            r0 = 0
            r2.k = r0
            return
    }

    public y80(defpackage.y80 r7, defpackage.n6 r8) {
            r6 = this;
            r6.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r6.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.b = r0
            r0 = 0
            r6.c = r0
            r6.d = r0
            r6.e = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r6.f = r1
            r6.g = r1
            r6.h = r0
            r6.i = r0
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r6.j = r2
            r3 = 0
            r6.k = r3
            float r3 = r7.c
            r6.c = r3
            float r3 = r7.d
            r6.d = r3
            float r3 = r7.e
            r6.e = r3
            float r3 = r7.f
            r6.f = r3
            float r3 = r7.g
            r6.g = r3
            float r3 = r7.h
            r6.h = r3
            float r3 = r7.i
            r6.i = r3
            java.lang.String r3 = r7.k
            r6.k = r3
            if (r3 == 0) goto L51
            r8.put(r3, r6)
        L51:
            android.graphics.Matrix r3 = r7.j
            r2.set(r3)
            java.util.ArrayList r7 = r7.b
            r2 = 0
        L59:
            int r3 = r7.size()
            if (r2 >= r3) goto Leb
            java.lang.Object r3 = r7.get(r2)
            boolean r4 = r3 instanceof defpackage.y80
            if (r4 == 0) goto L74
            y80 r3 = (defpackage.y80) r3
            java.util.ArrayList r4 = r6.b
            y80 r5 = new y80
            r5.<init>(r3, r8)
            r4.add(r5)
            goto Ldf
        L74:
            boolean r4 = r3 instanceof defpackage.x80
            if (r4 == 0) goto Lc8
            x80 r4 = new x80
            x80 r3 = (defpackage.x80) r3
            r4.<init>(r3)
            r4.e = r0
            r4.g = r1
            r4.h = r1
            r4.i = r0
            r4.j = r1
            r4.k = r0
            android.graphics.Paint$Cap r5 = android.graphics.Paint.Cap.BUTT
            r4.l = r5
            android.graphics.Paint$Join r5 = android.graphics.Paint.Join.MITER
            r4.m = r5
            r5 = 1082130432(0x40800000, float:4.0)
            r4.n = r5
            z3 r5 = r3.d
            r4.d = r5
            float r5 = r3.e
            r4.e = r5
            float r5 = r3.g
            r4.g = r5
            z3 r5 = r3.f
            r4.f = r5
            int r5 = r3.c
            r4.c = r5
            float r5 = r3.h
            r4.h = r5
            float r5 = r3.i
            r4.i = r5
            float r5 = r3.j
            r4.j = r5
            float r5 = r3.k
            r4.k = r5
            android.graphics.Paint$Cap r5 = r3.l
            r4.l = r5
            android.graphics.Paint$Join r5 = r3.m
            r4.m = r5
            float r3 = r3.n
            r4.n = r3
            goto Ld3
        Lc8:
            boolean r4 = r3 instanceof defpackage.w80
            if (r4 == 0) goto Le3
            w80 r4 = new w80
            w80 r3 = (defpackage.w80) r3
            r4.<init>(r3)
        Ld3:
            java.util.ArrayList r3 = r6.b
            r3.add(r4)
            java.lang.String r3 = r4.b
            if (r3 == 0) goto Ldf
            r8.put(r3, r4)
        Ldf:
            int r2 = r2 + 1
            goto L59
        Le3:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Unknown object in the tree!"
            r7.<init>(r8)
            throw r7
        Leb:
            return
    }

    @Override // defpackage.z80
    public final boolean a() {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.ArrayList r2 = r4.b
            int r3 = r2.size()
            if (r1 >= r3) goto L1b
            java.lang.Object r2 = r2.get(r1)
            z80 r2 = (defpackage.z80) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L18
            r0 = 1
            return r0
        L18:
            int r1 = r1 + 1
            goto L2
        L1b:
            return r0
    }

    @Override // defpackage.z80
    public final boolean b(int[] r5) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.ArrayList r2 = r4.b
            int r3 = r2.size()
            if (r0 >= r3) goto L18
            java.lang.Object r2 = r2.get(r0)
            z80 r2 = (defpackage.z80) r2
            boolean r2 = r2.b(r5)
            r1 = r1 | r2
            int r0 = r0 + 1
            goto L2
        L18:
            return r1
    }

    public final void c() {
            r4 = this;
            android.graphics.Matrix r0 = r4.j
            r0.reset()
            float r1 = r4.d
            float r1 = -r1
            float r2 = r4.e
            float r2 = -r2
            r0.postTranslate(r1, r2)
            float r1 = r4.f
            float r2 = r4.g
            r0.postScale(r1, r2)
            float r1 = r4.c
            r2 = 0
            r0.postRotate(r1, r2, r2)
            float r1 = r4.h
            float r2 = r4.d
            float r1 = r1 + r2
            float r2 = r4.i
            float r3 = r4.e
            float r2 = r2 + r3
            r0.postTranslate(r1, r2)
            return
    }

    public java.lang.String getGroupName() {
            r1 = this;
            java.lang.String r0 = r1.k
            return r0
    }

    public android.graphics.Matrix getLocalMatrix() {
            r1 = this;
            android.graphics.Matrix r0 = r1.j
            return r0
    }

    public float getPivotX() {
            r1 = this;
            float r0 = r1.d
            return r0
    }

    public float getPivotY() {
            r1 = this;
            float r0 = r1.e
            return r0
    }

    public float getRotation() {
            r1 = this;
            float r0 = r1.c
            return r0
    }

    public float getScaleX() {
            r1 = this;
            float r0 = r1.f
            return r0
    }

    public float getScaleY() {
            r1 = this;
            float r0 = r1.g
            return r0
    }

    public float getTranslateX() {
            r1 = this;
            float r0 = r1.h
            return r0
    }

    public float getTranslateY() {
            r1 = this;
            float r0 = r1.i
            return r0
    }

    public void setPivotX(float r2) {
            r1 = this;
            float r0 = r1.d
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.d = r2
            r1.c()
        Lb:
            return
    }

    public void setPivotY(float r2) {
            r1 = this;
            float r0 = r1.e
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.e = r2
            r1.c()
        Lb:
            return
    }

    public void setRotation(float r2) {
            r1 = this;
            float r0 = r1.c
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.c = r2
            r1.c()
        Lb:
            return
    }

    public void setScaleX(float r2) {
            r1 = this;
            float r0 = r1.f
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.f = r2
            r1.c()
        Lb:
            return
    }

    public void setScaleY(float r2) {
            r1 = this;
            float r0 = r1.g
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.g = r2
            r1.c()
        Lb:
            return
    }

    public void setTranslateX(float r2) {
            r1 = this;
            float r0 = r1.h
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.h = r2
            r1.c()
        Lb:
            return
    }

    public void setTranslateY(float r2) {
            r1 = this;
            float r0 = r1.i
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.i = r2
            r1.c()
        Lb:
            return
    }
}
