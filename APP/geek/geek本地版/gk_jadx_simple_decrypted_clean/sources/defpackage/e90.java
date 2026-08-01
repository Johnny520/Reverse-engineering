package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class e90 extends v80 {
    public static final PorterDuff.Mode j = null;
    public c90 b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] g;
    public final Matrix h;
    public final Rect i;

    static {
        j = PorterDuff.Mode.SRC_IN;
    }

    public e90() {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        c90 r0 = new c90();
        r0.c = null;
        r0.d = j;
        r0.b = new b90();
        this.b = r0;
    }

    public final PorterDuffColorFilter a(ColorStateList r3, PorterDuff.Mode r4) {
        if (r3 == null) goto L7;
        if (r4 != null) goto L6;
        return null;
    L6:
        return new PorterDuffColorFilter(r3.getColorForState(getState(), 0), r4);
    L7:
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        ch.b(r0);
        return false;
    L7:
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r19) {
        Drawable r2 = this.a;
        if (r2 == null) goto L6;
        r2.draw(r19);
        return;
    L6:
        Rect r22 = this.i;
        copyBounds(r22);
        if (r22.width() > 0) goto L9;
        return;
    L9:
        if (r22.height() <= 0) goto L64;
        ColorFilter r3 = this.d;
        if (r3 != null) goto L14;
        r3 = this.c;
    L14:
        Matrix r4 = this.h;
        r19.getMatrix(r4);
        float[] r5 = this.g;
        r4.getValues(r5);
        float r6 = Math.abs(r5[0]);
        float r7 = Math.abs(r5[4]);
        float r9 = Math.abs(r5[1]);
        float r52 = Math.abs(r5[3]);
        if (r9 == 0.0f) goto L17;
    L18:
        r6 = 1.0f;
        r7 = 1.0f;
    L19:
        int r53 = (int) (r22.width() * r6);
        int r54 = Math.min(2048, r53);
        int r62 = Math.min(2048, (int) (r22.height() * r7));
        if (r54 <= 0) goto L63;
        if (r62 <= 0) goto L65;
        int r72 = r19.save();
        r19.translate(r22.left, r22.top);
        if (isAutoMirrored() == true) goto L26;
    L28:
        r22.offsetTo(0, 0);
        c90 r92 = this.b;
        Bitmap r10 = r92.f;
        if (r10 != null) goto L31;
    L35:
        r92.f = Bitmap.createBitmap(r54, r62, Bitmap.Config.ARGB_8888);
        r92.k = true;
    L37:
        if (this.f == true) goto L39;
        c90 r93 = this.b;
        r93.f.eraseColor(0);
        Canvas r15 = new Canvas(r93.f);
        b90 r12 = r93.b;
        r12.a(r12.g, b90.p, r15, r54, r62);
    L51:
        c90 r42 = this.b;
        if (r42.b.getRootAlpha() < 255) goto L57;
        if (r3 != null) goto L57;
        Paint r32 = null;
    L60:
        r19.drawBitmap(r42.f, null, r22, r32);
        r19.restoreToCount(r72);
        return;
    L57:
        if (r42.l != null) goto L59;
        Paint r55 = new Paint();
        r42.l = r55;
        r55.setFilterBitmap(true);
    L59:
        r42.l.setAlpha(r42.b.getRootAlpha());
        r42.l.setColorFilter(r3);
        r32 = r42.l;
        goto L60
    L39:
        c90 r56 = this.b;
        if (r56.k == false) goto L42;
    L50:
        c90 r57 = this.b;
        r57.f.eraseColor(0);
        Canvas r152 = new Canvas(r57.f);
        b90 r122 = r57.b;
        r122.a(r122.g, b90.p, r152, r54, r62);
        c90 r58 = this.b;
        r58.g = r58.c;
        r58.h = r58.d;
        r58.i = r58.b.getRootAlpha();
        r58.j = r58.e;
        r58.k = false;
        goto L51
    L42:
        if (r56.g != r56.c) goto L50;
        if (r56.h != r56.d) goto L50;
        if (r56.j != r56.e) goto L50;
        if (r56.i != r56.b.getRootAlpha()) goto L50;
    L31:
        if (r54 != r10.getWidth()) goto L35;
        if (r62 != r92.f.getHeight()) goto L35;
    L26:
        if (dh.a(this) != 1) goto L28;
        r19.translate(r22.width(), 0.0f);
        r19.scale(-1.0f, 1.0f);
        goto L28
    L65:
        return;
    L63:
        return;
    L17:
        if (r52 == 0.0f) goto L19;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return bh.a(r0);
    L7:
        return this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.getChangingConfigurations();
    L7:
        return super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return ch.c(r0);
    L7:
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null) goto L5;
        c90 r0 = this.b;
        r0.a = getChangingConfigurations();
        return this.b;
    L5:
        return new d90(this.a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.getIntrinsicHeight();
    L7:
        return (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.getIntrinsicWidth();
    L7:
        return (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable r0 = this.a;
        if (r0 != null) goto L5;
        return -3;
    L5:
        return r0.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r2, XmlPullParser r3, AttributeSet r4) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.inflate(r2, r3, r4);
        return;
    L6:
        inflate(r2, r3, r4, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.invalidateSelf();
        return;
    L6:
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return bh.d(r0);
    L7:
        return this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.isStateful();
    L7:
        if (super.isStateful() == true) goto L22;
        c90 r02 = this.b;
        if (r02 == null) goto L20;
        b90 r03 = r02.b;
        if (r03.n != null) goto L14;
        r03.n = Boolean.valueOf(r03.g.a());
    L14:
        if (r03.n.booleanValue() == true) goto L26;
        ColorStateList r04 = this.b.c;
        if (r04 != null) goto L18;
        return false;
    L18:
        if (r04.isStateful() == true) goto L27;
        return false;
    L27:
        return true;
    L26:
        return true;
    L20:
        return false;
    L22:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        r0.mutate();
        return this;
    L7:
        if (this.e == false) goto L9;
    L20:
        return this;
    L9:
        if (super.mutate() != this) goto L20;
        c90 r1 = this.b;
        c90 r02 = new c90();
        r02.c = null;
        r02.d = j;
        if (r1 == null) goto L19;
        r02.a = r1.a;
        b90 r2 = new b90(r1.b);
        r02.b = r2;
        if (r1.b.e == null) goto L16;
        r2.e = new Paint(r1.b.e);
    L16:
        if (r1.b.d == null) goto L18;
        b90 r22 = r02.b;
        r22.d = new Paint(r1.b.d);
    L18:
        r02.c = r1.c;
        r02.d = r1.d;
        r02.e = r1.e;
    L19:
        this.b = r02;
        this.e = true;
        goto L20
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.setBounds(r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r6) {
        Drawable r0 = this.a;
        if (r0 != null) goto L5;
        c90 r02 = this.b;
        ColorStateList r1 = r02.c;
        if (r1 == null) goto L11;
        PorterDuff.Mode r3 = r02.d;
        if (r3 == null) goto L11;
        this.c = a(r1, r3);
        invalidateSelf();
        boolean r12 = true;
    L12:
        b90 r32 = r02.b;
        if (r32.n != null) goto L16;
        r32.n = Boolean.valueOf(r32.g.a());
    L16:
        if (r32.n.booleanValue() == false) goto L21;
        boolean r62 = r02.b.g.b(r6);
        r02.k |= r62;
        if (r62 == false) goto L21;
        invalidateSelf();
        return true;
    L21:
        return r12;
    L11:
        r12 = false;
        goto L12
    L5:
        return r0.setState(r6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable r2, long r3) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.scheduleSelf(r2, r3);
        return;
    L6:
        super.scheduleSelf(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        r0.setAlpha(r2);
        return;
    L7:
        if (this.b.b.getRootAlpha() == r2) goto L10;
        this.b.b.setRootAlpha(r2);
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        bh.e(r0, r2);
        return;
    L6:
        this.b.e = r2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.setColorFilter(r2);
        return;
    L6:
        this.d = r2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        a80.E(r0, r2);
        return;
    L6:
        setTintList(ColorStateList.valueOf(r2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r3) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        ch.h(r0, r3);
        return;
    L6:
        c90 r02 = this.b;
        if (r02.c == r3) goto L10;
        r02.c = r3;
        this.c = a(r3, r02.d);
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r3) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        ch.i(r0, r3);
        return;
    L6:
        c90 r02 = this.b;
        if (r02.d == r3) goto L10;
        r02.d = r3;
        this.c = a(r02.c, r3);
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
        Drawable r0 = this.a;
        if (r0 == null) goto L7;
        return r0.setVisible(r2, r3);
    L7:
        return super.setVisible(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable r2) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        r0.unscheduleSelf(r2);
        return;
    L6:
        super.unscheduleSelf(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r29, XmlPullParser r30, AttributeSet r31, Resources.Theme r32) {
        Drawable r0 = this.a;
        if (r0 == null) goto L6;
        ch.d(r0, r29, r30, r31, r32);
        return;
    L6:
        c90 r6 = this.b;
        r6.b = new b90();
        TypedArray r7 = zt.H(r29, r32, r31, ff.a);
        c90 r8 = this.b;
        b90 r9 = r8.b;
        if (zt.y(r30, "tintMode") == true) goto L9;
        int r02 = -1;
    L10:
        PorterDuff.Mode r12 = PorterDuff.Mode.SRC_IN;
        if (r02 == 3) goto L20;
        if (r02 == 5) goto L21;
        if (r02 == 9) goto L19;
        switch(r02) {
            case 14: goto L18;
            case 15: goto L17;
            case 16: goto L16;
            default: goto L21;
        };
    L16:
        r12 = PorterDuff.Mode.ADD;
        goto L21
    L17:
        r12 = PorterDuff.Mode.SCREEN;
        goto L21
    L18:
        r12 = PorterDuff.Mode.MULTIPLY;
        goto L21
    L19:
        r12 = PorterDuff.Mode.SRC_ATOP;
    L21:
        r8.d = r12;
        ColorStateList r16 = null;
        int r10 = 1;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") == null) goto L30;
        TypedValue r03 = new TypedValue();
        r7.getValue(1, r03);
        int r14 = r03.type;
        if (r14 == 2) goto L37;
        if (r14 >= 28) goto L28;
    L31:
        Resources r04 = r7.getResources();
        int r11 = r7.getResourceId(1, 0);
        ThreadLocal r142 = hb.a;
        r16 = hb.a(r04, r04.getXml(r11), r32);     // Catch: Exception -> L34
    L34:
        e = move-exception;
        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
        goto L30
    L28:
        if (r14 > 31) goto L31;
        r16 = ColorStateList.valueOf(r03.data);
        goto L30
    L37:
        throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + r03);
    L30:
        ColorStateList r05 = r16;
        if (r05 == null) goto L40;
        r8.c = r05;
    L40:
        boolean r06 = r8.e;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") == null) goto L43;
        r06 = r7.getBoolean(5, r06);
    L43:
        r8.e = r06;
        float r07 = r9.j;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") == null) goto L46;
        r07 = r7.getFloat(7, r07);
    L46:
        r9.j = r07;
        float r08 = r9.k;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") == null) goto L49;
        r08 = r7.getFloat(8, r08);
    L49:
        r9.k = r08;
        if (r9.j <= 0.0f) goto L205;
        if (r08 <= 0.0f) goto L203;
        r9.h = r7.getDimension(3, r9.h);
        float r09 = r7.getDimension(2, r9.i);
        r9.i = r09;
        if (r9.h <= 0.0f) goto L201;
        if (r09 <= 0.0f) goto L199;
        float r010 = r9.getAlpha();
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") == null) goto L60;
        r010 = r7.getFloat(4, r010);
    L60:
        r9.setAlpha(r010);
        String r011 = r7.getString(0);
        if (r011 == null) goto L63;
        r9.m = r011;
        r9.o.put(r011, r9);
    L63:
        r7.recycle();
        r6.a = getChangingConfigurations();
        r6.k = true;
        c90 r012 = this.b;
        b90 r72 = r012.b;
        ArrayDeque r82 = new ArrayDeque();
        y80 r92 = r72.g;
        n6 r73 = r72.o;
        r82.push(r92);
        int r93 = r30.getEventType();
        int r112 = r30.getDepth() + 1;
        boolean r21 = true;
    L64:
        if (r93 == r10) goto L193;
        if (r30.getDepth() >= r112) goto L70;
        if (r93 == 3) goto L193;
    L70:
        if (r93 != 2) goto L187;
        String r94 = r30.getName();
        y80 r102 = (y80) r82.peek();
        int r25 = r112;
        if ("path".equals(r94) == false) goto L138;
        x80 r95 = new x80();
        r95.e = 0.0f;
        r95.g = 1.0f;
        r95.h = 1.0f;
        r95.i = 0.0f;
        r95.j = 1.0f;
        r95.k = 0.0f;
        Paint.Cap r143 = Paint.Cap.BUTT;
        r95.l = r143;
        Paint.Join r13 = Paint.Join.MITER;
        r95.m = r13;
        r95.n = 4.0f;
        TypedArray r132 = zt.H(r29, r32, r31, ff.c);
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) goto L134;
        String r144 = r132.getString(0);
        if (r144 == null) goto L78;
        r95.b = r144;
    L78:
        String r145 = r132.getString(2);
        if (r145 == null) goto L81;
        r95.a = ct.j(r145);
    L81:
        r95.f = zt.p(r132, r30, r32, "fillColor", 1);
        float r113 = r95.h;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") == null) goto L84;
        r113 = r132.getFloat(12, r113);
    L84:
        r95.h = r113;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") == null) goto L87;
        int r146 = r132.getInt(8, -1);
    L88:
        Paint.Cap r114 = r95.l;
        if (r146 != 0) goto L91;
        Paint.Cap r147 = r143;
    L98:
        r95.l = r147;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") == null) goto L101;
        int r115 = r132.getInt(9, -1);
    L102:
        Paint.Join r148 = r95.m;
        if (r115 != 0) goto L105;
        Paint.Join r116 = r13;
    L112:
        r95.m = r116;
        float r117 = r95.n;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") == null) goto L115;
        r117 = r132.getFloat(10, r117);
    L115:
        r95.n = r117;
        r95.d = zt.p(r132, r30, r32, "strokeColor", 3);
        float r118 = r95.g;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") == null) goto L118;
        r118 = r132.getFloat(11, r118);
    L118:
        r95.g = r118;
        float r119 = r95.e;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") == null) goto L121;
        r119 = r132.getFloat(4, r119);
    L121:
        r95.e = r119;
        float r1110 = r95.j;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") == null) goto L124;
        r1110 = r132.getFloat(6, r1110);
    L124:
        r95.j = r1110;
        float r1111 = r95.k;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") == null) goto L127;
        r1111 = r132.getFloat(7, r1111);
    L127:
        r95.k = r1111;
        float r1112 = r95.i;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") == null) goto L130;
        r1112 = r132.getFloat(5, r1112);
    L130:
        r95.i = r1112;
        int r1113 = r95.c;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") == null) goto L133;
        r1113 = r132.getInt(13, r1113);
    L133:
        r95.c = r1113;
        goto L134
    L105:
        if (r115 != 1) goto L107;
        r116 = Paint.Join.ROUND;
        goto L112
    L107:
        if (r115 == 2) goto L109;
        r116 = r148;
        goto L112
    L109:
        r116 = Paint.Join.BEVEL;
        goto L112
    L101:
        r115 = -1;
        goto L102
    L91:
        if (r146 != 1) goto L93;
        r147 = Paint.Cap.ROUND;
        goto L98
    L93:
        if (r146 == 2) goto L95;
        r147 = r114;
        goto L98
    L95:
        r147 = Paint.Cap.SQUARE;
        goto L98
    L87:
        r146 = -1;
    L134:
        r132.recycle();
        r102.b.add(r95);
        if (r95.getPathName() == null) goto L137;
        r73.put(r95.getPathName(), r95);
    L137:
        r012.a = r012.a;
        r21 = false;
        char r23 = '\b';
    L186:
        int r24 = 1;
    L192:
        r93 = r30.next();
        r10 = r24;
        r112 = r25;
        goto L64
    L138:
        r23 = '\b';
        if ("clip-path".equals(r94) == false) goto L159;
        w80 r96 = new w80();
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) goto L153;
        TypedArray r1114 = zt.H(r29, r32, r31, ff.d);
        String r149 = r1114.getString(0);
        if (r149 == null) goto L145;
        r96.b = r149;
    L145:
        String r133 = r1114.getString(1);
        if (r133 == null) goto L149;
        r96.a = ct.j(r133);
    L149:
        if (zt.y(r30, "fillType") == true) goto L151;
        int r15 = 0;
    L152:
        r96.c = r15;
        r1114.recycle();
        goto L153
    L151:
        r15 = r1114.getInt(2, 0);
    L153:
        r102.b.add(r96);
        if (r96.getPathName() == null) goto L156;
        r73.put(r96.getPathName(), r96);
    L156:
        r012.a = r012.a;
        goto L186
    L159:
        if ("group".equals(r94) == false) goto L186;
        y80 r97 = new y80();
        TypedArray r1115 = zt.H(r29, r32, r31, ff.b);
        float r134 = r97.c;
        if (zt.y(r30, "rotation") == false) goto L164;
        r134 = r1115.getFloat(5, r134);
    L164:
        r97.c = r134;
        r97.d = r1115.getFloat(1, r97.d);
        r97.e = r1115.getFloat(2, r97.e);
        float r135 = r97.f;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") == null) goto L167;
        r135 = r1115.getFloat(3, r135);
    L167:
        r97.f = r135;
        float r136 = r97.g;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") == null) goto L171;
        r136 = r1115.getFloat(4, r136);
    L171:
        r97.g = r136;
        float r137 = r97.h;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") == null) goto L175;
        r137 = r1115.getFloat(6, r137);
    L175:
        r97.h = r137;
        float r138 = r97.i;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") == null) goto L179;
        r138 = r1115.getFloat(7, r138);
    L179:
        r97.i = r138;
        String r1410 = r1115.getString(0);
        if (r1410 == null) goto L182;
        r97.k = r1410;
    L182:
        r97.c();
        r1115.recycle();
        r102.b.add(r97);
        r82.push(r97);
        if (r97.getGroupName() == null) goto L185;
        r73.put(r97.getGroupName(), r97);
    L185:
        r012.a = r012.a;
        goto L186
    L187:
        r25 = r112;
        r23 = '\b';
        r24 = 1;
        if (r93 != 3) goto L192;
        if ("group".equals(r30.getName()) == false) goto L192;
        r82.pop();
    L193:
        if (r21 == true) goto L197;
        this.c = a(r6.c, r6.d);
        return;
    L197:
        throw new XmlPullParserException("no path defined");
    L199:
        throw new XmlPullParserException(r7.getPositionDescription() + "<vector> tag requires height > 0");
    L201:
        throw new XmlPullParserException(r7.getPositionDescription() + "<vector> tag requires width > 0");
    L203:
        throw new XmlPullParserException(r7.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    L205:
        throw new XmlPullParserException(r7.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    L20:
        r12 = PorterDuff.Mode.SRC_OVER;
        goto L21
    L9:
        r02 = r7.getInt(6, -1);
        goto L10
    }

    public e90(c90 r2) {
        this.f = true;
        this.g = new float[9];
        this.h = new Matrix();
        this.i = new Rect();
        this.b = r2;
        this.c = a(r2.c, r2.d);
    }
}
