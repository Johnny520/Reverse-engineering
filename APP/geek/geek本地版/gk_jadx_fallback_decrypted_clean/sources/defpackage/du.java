package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class du extends android.graphics.drawable.Drawable.ConstantState {
    public defpackage.f30 a;
    public defpackage.xh b;
    public android.content.res.ColorStateList c;
    public android.content.res.ColorStateList d;
    public android.content.res.ColorStateList e;
    public android.graphics.PorterDuff.Mode f;
    public android.graphics.Rect g;
    public final float h;
    public float i;
    public float j;
    public int k;
    public float l;
    public float m;
    public int n;
    public int o;
    public final android.graphics.Paint.Style p;

    public du(defpackage.du r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.c = r0
            r2.d = r0
            r2.e = r0
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.f = r1
            r2.g = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.h = r0
            r2.i = r0
            r0 = 255(0xff, float:3.57E-43)
            r2.k = r0
            r0 = 0
            r2.l = r0
            r2.m = r0
            r0 = 0
            r2.n = r0
            r2.o = r0
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r2.p = r0
            f30 r0 = r3.a
            r2.a = r0
            xh r0 = r3.b
            r2.b = r0
            float r0 = r3.j
            r2.j = r0
            android.content.res.ColorStateList r0 = r3.c
            r2.c = r0
            android.content.res.ColorStateList r0 = r3.d
            r2.d = r0
            android.graphics.PorterDuff$Mode r0 = r3.f
            r2.f = r0
            android.content.res.ColorStateList r0 = r3.e
            r2.e = r0
            int r0 = r3.k
            r2.k = r0
            float r0 = r3.h
            r2.h = r0
            int r0 = r3.o
            r2.o = r0
            float r0 = r3.i
            r2.i = r0
            float r0 = r3.l
            r2.l = r0
            float r0 = r3.m
            r2.m = r0
            int r0 = r3.n
            r2.n = r0
            android.graphics.Paint$Style r0 = r3.p
            r2.p = r0
            android.graphics.Rect r0 = r3.g
            if (r0 == 0) goto L71
            android.graphics.Rect r0 = new android.graphics.Rect
            android.graphics.Rect r3 = r3.g
            r0.<init>(r3)
            r2.g = r0
        L71:
            return
    }

    public du(defpackage.f30 r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.c = r0
            r2.d = r0
            r2.e = r0
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.f = r1
            r2.g = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.h = r1
            r2.i = r1
            r1 = 255(0xff, float:3.57E-43)
            r2.k = r1
            r1 = 0
            r2.l = r1
            r2.m = r1
            r1 = 0
            r2.n = r1
            r2.o = r1
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            r2.p = r1
            r2.a = r3
            r2.b = r0
            return
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable() {
            r2 = this;
            eu r0 = new eu
            r0.<init>(r2)
            r1 = 1
            r0.e = r1
            return r0
    }
}
