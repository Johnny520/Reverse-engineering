package p000;

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
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: MD */
/* JADX INFO: loaded from: classes.dex */
public final class C0530MD extends AbstractC0143DD {

    /* JADX INFO: renamed from: j */
    public static final PorterDuff.Mode f1726j = null;

    /* JADX INFO: renamed from: b */
    public C0444KD f1727b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f1728c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f1729d;

    /* JADX INFO: renamed from: e */
    public boolean f1730e;

    /* JADX INFO: renamed from: f */
    public boolean f1731f;

    /* JADX INFO: renamed from: g */
    public final float[] f1732g;

    /* JADX INFO: renamed from: h */
    public final Matrix f1733h;

    /* JADX INFO: renamed from: i */
    public final Rect f1734i;

    static {
        f1726j = PorterDuff.Mode.SRC_IN;
    }

    public C0530MD() {
        this.f1731f = true;
        this.f1732g = new float[9];
        this.f1733h = new Matrix();
        this.f1734i = new Rect();
        C0444KD r0 = new C0444KD();
        r0.f1450c = null;
        r0.f1451d = f1726j;
        r0.f1449b = new C0401JD();
        this.f1727b = r0;
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m1025a(ColorStateList r3, PorterDuff.Mode r4) {
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
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        r0.canApplyTheme();
        return false;
    L7:
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas r19) {
        Drawable r2 = this.f373a;
        if (r2 == null) goto L6;
        r2.draw(r19);
        return;
    L6:
        Rect r22 = this.f1734i;
        copyBounds(r22);
        if (r22.width() > 0) goto L9;
        return;
    L9:
        if (r22.height() <= 0) goto L64;
        ColorFilter r3 = this.f1729d;
        if (r3 != null) goto L14;
        r3 = this.f1728c;
    L14:
        Matrix r4 = this.f1733h;
        r19.getMatrix(r4);
        float[] r5 = this.f1732g;
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
        C0444KD r92 = this.f1727b;
        Bitmap r10 = r92.f1453f;
        if (r10 != null) goto L31;
    L35:
        r92.f1453f = Bitmap.createBitmap(r54, r62, Bitmap.Config.ARGB_8888);
        r92.f1458k = true;
    L37:
        if (this.f1731f == true) goto L39;
        C0444KD r93 = this.f1727b;
        r93.f1453f.eraseColor(0);
        Canvas r15 = new Canvas(r93.f1453f);
        C0401JD r12 = r93.f1449b;
        r12.m836a(r12.f1356g, C0401JD.f1349p, r15, r54, r62);
    L51:
        C0444KD r42 = this.f1727b;
        if (r42.f1449b.getRootAlpha() < 255) goto L57;
        if (r3 != null) goto L57;
        Paint r32 = null;
    L60:
        r19.drawBitmap(r42.f1453f, null, r22, r32);
        r19.restoreToCount(r72);
        return;
    L57:
        if (r42.f1459l != null) goto L59;
        Paint r55 = new Paint();
        r42.f1459l = r55;
        r55.setFilterBitmap(true);
    L59:
        r42.f1459l.setAlpha(r42.f1449b.getRootAlpha());
        r42.f1459l.setColorFilter(r3);
        r32 = r42.f1459l;
        goto L60
    L39:
        C0444KD r56 = this.f1727b;
        if (r56.f1458k == false) goto L42;
    L50:
        C0444KD r57 = this.f1727b;
        r57.f1453f.eraseColor(0);
        Canvas r152 = new Canvas(r57.f1453f);
        C0401JD r122 = r57.f1449b;
        r122.m836a(r122.f1356g, C0401JD.f1349p, r152, r54, r62);
        C0444KD r58 = this.f1727b;
        r58.f1454g = r58.f1450c;
        r58.f1455h = r58.f1451d;
        r58.f1456i = r58.f1449b.getRootAlpha();
        r58.f1457j = r58.f1452e;
        r58.f1458k = false;
        goto L51
    L42:
        if (r56.f1454g != r56.f1450c) goto L50;
        if (r56.f1455h != r56.f1451d) goto L50;
        if (r56.f1457j != r56.f1452e) goto L50;
        if (r56.f1456i != r56.f1449b.getRootAlpha()) goto L50;
    L31:
        if (r54 != r10.getWidth()) goto L35;
        if (r62 != r92.f1453f.getHeight()) goto L35;
    L26:
        if (getLayoutDirection() != 1) goto L28;
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
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.getAlpha();
    L7:
        return this.f1727b.f1449b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.getChangingConfigurations();
    L7:
        return super.getChangingConfigurations() | this.f1727b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.getColorFilter();
    L7:
        return this.f1729d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f373a != null) goto L5;
        C0444KD r0 = this.f1727b;
        r0.f1448a = getChangingConfigurations();
        return this.f1727b;
    L5:
        return new C0487LD(this.f373a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.getIntrinsicHeight();
    L7:
        return (int) this.f1727b.f1449b.f1358i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.getIntrinsicWidth();
    L7:
        return (int) this.f1727b.f1449b.f1357h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable r0 = this.f373a;
        if (r0 != null) goto L5;
        return -3;
    L5:
        return r0.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r2, XmlPullParser r3, AttributeSet r4) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.inflate(r2, r3, r4);
        return;
    L6:
        inflate(r2, r3, r4, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.invalidateSelf();
        return;
    L6:
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.isAutoMirrored();
    L7:
        return this.f1727b.f1452e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.isStateful();
    L7:
        if (super.isStateful() == true) goto L22;
        C0444KD r02 = this.f1727b;
        if (r02 == null) goto L20;
        C0401JD r03 = r02.f1449b;
        if (r03.f1363n != null) goto L14;
        r03.f1363n = Boolean.valueOf(r03.f1356g.mo449a());
    L14:
        if (r03.f1363n.booleanValue() == true) goto L26;
        ColorStateList r04 = this.f1727b.f1450c;
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
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        r0.mutate();
        return this;
    L7:
        if (this.f1730e == false) goto L9;
    L20:
        return this;
    L9:
        if (super.mutate() != this) goto L20;
        C0444KD r1 = this.f1727b;
        C0444KD r02 = new C0444KD();
        r02.f1450c = null;
        r02.f1451d = f1726j;
        if (r1 == null) goto L19;
        r02.f1448a = r1.f1448a;
        C0401JD r2 = new C0401JD(r1.f1449b);
        r02.f1449b = r2;
        if (r1.f1449b.f1354e == null) goto L16;
        r2.f1354e = new Paint(r1.f1449b.f1354e);
    L16:
        if (r1.f1449b.f1353d == null) goto L18;
        C0401JD r22 = r02.f1449b;
        r22.f1353d = new Paint(r1.f1449b.f1353d);
    L18:
        r02.f1450c = r1.f1450c;
        r02.f1451d = r1.f1451d;
        r02.f1452e = r1.f1452e;
    L19:
        this.f1727b = r02;
        this.f1730e = true;
        goto L20
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.setBounds(r2);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r6) {
        Drawable r0 = this.f373a;
        if (r0 != null) goto L5;
        C0444KD r02 = this.f1727b;
        ColorStateList r1 = r02.f1450c;
        if (r1 == null) goto L11;
        PorterDuff.Mode r3 = r02.f1451d;
        if (r3 == null) goto L11;
        this.f1728c = m1025a(r1, r3);
        invalidateSelf();
        boolean r12 = true;
    L12:
        C0401JD r32 = r02.f1449b;
        if (r32.f1363n != null) goto L16;
        r32.f1363n = Boolean.valueOf(r32.f1356g.mo449a());
    L16:
        if (r32.f1363n.booleanValue() == false) goto L21;
        boolean r62 = r02.f1449b.f1356g.mo450b(r6);
        r02.f1458k |= r62;
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
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.scheduleSelf(r2, r3);
        return;
    L6:
        super.scheduleSelf(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        r0.setAlpha(r2);
        return;
    L7:
        if (this.f1727b.f1449b.getRootAlpha() == r2) goto L10;
        this.f1727b.f1449b.setRootAlpha(r2);
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.setAutoMirrored(r2);
        return;
    L6:
        this.f1727b.f1452e = r2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.setColorFilter(r2);
        return;
    L6:
        this.f1729d = r2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        AbstractC1406fG.m2715o0(r0, r2);
        return;
    L6:
        setTintList(ColorStateList.valueOf(r2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r3) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.setTintList(r3);
        return;
    L6:
        C0444KD r02 = this.f1727b;
        if (r02.f1450c == r3) goto L10;
        r02.f1450c = r3;
        this.f1728c = m1025a(r3, r02.f1451d);
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r3) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.setTintMode(r3);
        return;
    L6:
        C0444KD r02 = this.f1727b;
        if (r02.f1451d == r3) goto L10;
        r02.f1451d = r3;
        this.f1728c = m1025a(r02.f1450c, r3);
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L7;
        return r0.setVisible(r2, r3);
    L7:
        return super.setVisible(r2, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable r2) {
        Drawable r0 = this.f373a;
        if (r0 == null) goto L6;
        r0.unscheduleSelf(r2);
        return;
    L6:
        super.unscheduleSelf(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r29, XmlPullParser r30, AttributeSet r31, Resources.Theme r32) {
        Drawable r5 = this.f373a;
        if (r5 == null) goto L6;
        r5.inflate(r29, r30, r31, r32);
        return;
    L6:
        C0444KD r52 = this.f1727b;
        r52.f1449b = new C0401JD();
        TypedArray r6 = AbstractC0714Qj.m1471B(r29, r32, r31, AbstractC0148Dc.f384a);
        C0444KD r7 = this.f1727b;
        C0401JD r8 = r7.f1449b;
        if (AbstractC0714Qj.m1500v(r30, "tintMode") == true) goto L9;
        int r9 = -1;
    L10:
        PorterDuff.Mode r12 = PorterDuff.Mode.SRC_IN;
        if (r9 == 3) goto L20;
        if (r9 == 5) goto L21;
        if (r9 == 9) goto L19;
        switch(r9) {
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
        r7.f1451d = r12;
        ColorStateList r16 = null;
        int r10 = 1;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") == null) goto L30;
        TypedValue r92 = new TypedValue();
        r6.getValue(1, r92);
        int r14 = r92.type;
        if (r14 == 2) goto L35;
        if (r14 >= 28) goto L28;
    L31:
        Resources r93 = r6.getResources();
        int r11 = r6.getResourceId(1, 0);
        ThreadLocal r142 = AbstractC2754ya.f9383a;
        r16 = AbstractC2754ya.m5334a(r93, r93.getXml(r11), r32);     // Catch: Exception -> L204
        goto L30
    L28:
        if (r14 > 31) goto L31;
        r16 = ColorStateList.valueOf(r92.data);
        goto L30
    L35:
        throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + r92);
    L30:
        ColorStateList r94 = r16;
        if (r94 == null) goto L38;
        r7.f1450c = r94;
    L38:
        boolean r95 = r7.f1452e;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") == null) goto L41;
        r95 = r6.getBoolean(5, r95);
    L41:
        r7.f1452e = r95;
        float r72 = r8.f1359j;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") == null) goto L44;
        r72 = r6.getFloat(7, r72);
    L44:
        r8.f1359j = r72;
        float r73 = r8.f1360k;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") == null) goto L47;
        r73 = r6.getFloat(8, r73);
    L47:
        r8.f1360k = r73;
        if (r8.f1359j <= 0.0f) goto L203;
        if (r73 <= 0.0f) goto L201;
        r8.f1357h = r6.getDimension(3, r8.f1357h);
        float r74 = r6.getDimension(2, r8.f1358i);
        r8.f1358i = r74;
        if (r8.f1357h <= 0.0f) goto L199;
        if (r74 <= 0.0f) goto L197;
        float r75 = r8.getAlpha();
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") == null) goto L58;
        r75 = r6.getFloat(4, r75);
    L58:
        r8.setAlpha(r75);
        String r76 = r6.getString(0);
        if (r76 == null) goto L61;
        r8.f1362m = r76;
        r8.f1364o.put(r76, r8);
    L61:
        r6.recycle();
        r52.f1448a = getChangingConfigurations();
        r52.f1458k = true;
        C0444KD r62 = this.f1727b;
        C0401JD r77 = r62.f1449b;
        ArrayDeque r82 = new ArrayDeque();
        C0272GD r96 = r77.f1356g;
        C0521M4 r78 = r77.f1364o;
        r82.push(r96);
        int r97 = r30.getEventType();
        int r112 = r30.getDepth() + 1;
        boolean r21 = true;
    L62:
        if (r97 == r10) goto L191;
        if (r30.getDepth() >= r112) goto L68;
        if (r97 == 3) goto L191;
    L68:
        if (r97 != 2) goto L185;
        String r98 = r30.getName();
        C0272GD r102 = (C0272GD) r82.peek();
        int r25 = r112;
        if ("path".equals(r98) == false) goto L136;
        C0229FD r99 = new C0229FD();
        r99.f673e = 0.0f;
        r99.f675g = 1.0f;
        r99.f676h = 1.0f;
        r99.f677i = 0.0f;
        r99.f678j = 1.0f;
        r99.f679k = 0.0f;
        Paint.Cap r143 = Paint.Cap.BUTT;
        r99.f680l = r143;
        Paint.Join r13 = Paint.Join.MITER;
        r99.f681m = r13;
        r99.f682n = 4.0f;
        TypedArray r132 = AbstractC0714Qj.m1471B(r29, r32, r31, AbstractC0148Dc.f386c);
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) goto L132;
        String r144 = r132.getString(0);
        if (r144 == null) goto L76;
        r99.f1223b = r144;
    L76:
        String r145 = r132.getString(2);
        if (r145 == null) goto L79;
        r99.f1222a = AbstractC1406fG.m2688M(r145);
    L79:
        r99.f674f = AbstractC0714Qj.m1498t(r132, r30, r32, "fillColor", 1);
        float r113 = r99.f676h;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") == null) goto L82;
        r113 = r132.getFloat(12, r113);
    L82:
        r99.f676h = r113;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") == null) goto L85;
        int r146 = r132.getInt(8, -1);
    L86:
        Paint.Cap r114 = r99.f680l;
        if (r146 != 0) goto L89;
        Paint.Cap r147 = r143;
    L96:
        r99.f680l = r147;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") == null) goto L99;
        int r115 = r132.getInt(9, -1);
    L100:
        Paint.Join r148 = r99.f681m;
        if (r115 != 0) goto L103;
        Paint.Join r116 = r13;
    L110:
        r99.f681m = r116;
        float r117 = r99.f682n;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") == null) goto L113;
        r117 = r132.getFloat(10, r117);
    L113:
        r99.f682n = r117;
        r99.f672d = AbstractC0714Qj.m1498t(r132, r30, r32, "strokeColor", 3);
        float r118 = r99.f675g;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") == null) goto L116;
        r118 = r132.getFloat(11, r118);
    L116:
        r99.f675g = r118;
        float r119 = r99.f673e;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") == null) goto L119;
        r119 = r132.getFloat(4, r119);
    L119:
        r99.f673e = r119;
        float r1110 = r99.f678j;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") == null) goto L122;
        r1110 = r132.getFloat(6, r1110);
    L122:
        r99.f678j = r1110;
        float r1111 = r99.f679k;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") == null) goto L125;
        r1111 = r132.getFloat(7, r1111);
    L125:
        r99.f679k = r1111;
        float r1112 = r99.f677i;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") == null) goto L128;
        r1112 = r132.getFloat(5, r1112);
    L128:
        r99.f677i = r1112;
        int r1113 = r99.f1224c;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") == null) goto L131;
        r1113 = r132.getInt(13, r1113);
    L131:
        r99.f1224c = r1113;
        goto L132
    L103:
        if (r115 != 1) goto L105;
        r116 = Paint.Join.ROUND;
        goto L110
    L105:
        if (r115 == 2) goto L107;
        r116 = r148;
        goto L110
    L107:
        r116 = Paint.Join.BEVEL;
        goto L110
    L99:
        r115 = -1;
        goto L100
    L89:
        if (r146 != 1) goto L91;
        r147 = Paint.Cap.ROUND;
        goto L96
    L91:
        if (r146 == 2) goto L93;
        r147 = r114;
        goto L96
    L93:
        r147 = Paint.Cap.SQUARE;
        goto L96
    L85:
        r146 = -1;
    L132:
        r132.recycle();
        r102.f880b.add(r99);
        if (r99.getPathName() == null) goto L135;
        r78.put(r99.getPathName(), r99);
    L135:
        r62.f1448a = r62.f1448a;
        r21 = false;
        char r23 = '\b';
    L184:
        int r24 = 1;
    L190:
        r97 = r30.next();
        r10 = r24;
        r112 = r25;
        goto L62
    L136:
        r23 = '\b';
        if ("clip-path".equals(r98) == false) goto L157;
        C0186ED r910 = new C0186ED();
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) goto L151;
        TypedArray r1114 = AbstractC0714Qj.m1471B(r29, r32, r31, AbstractC0148Dc.f387d);
        String r149 = r1114.getString(0);
        if (r149 == null) goto L143;
        r910.f1223b = r149;
    L143:
        String r133 = r1114.getString(1);
        if (r133 == null) goto L147;
        r910.f1222a = AbstractC1406fG.m2688M(r133);
    L147:
        if (AbstractC0714Qj.m1500v(r30, "fillType") == true) goto L149;
        int r15 = 0;
    L150:
        r910.f1224c = r15;
        r1114.recycle();
        goto L151
    L149:
        r15 = r1114.getInt(2, 0);
    L151:
        r102.f880b.add(r910);
        if (r910.getPathName() == null) goto L154;
        r78.put(r910.getPathName(), r910);
    L154:
        r62.f1448a = r62.f1448a;
        goto L184
    L157:
        if ("group".equals(r98) == false) goto L184;
        C0272GD r911 = new C0272GD();
        TypedArray r1115 = AbstractC0714Qj.m1471B(r29, r32, r31, AbstractC0148Dc.f385b);
        float r134 = r911.f881c;
        if (AbstractC0714Qj.m1500v(r30, "rotation") == false) goto L162;
        r134 = r1115.getFloat(5, r134);
    L162:
        r911.f881c = r134;
        r911.f882d = r1115.getFloat(1, r911.f882d);
        r911.f883e = r1115.getFloat(2, r911.f883e);
        float r135 = r911.f884f;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") == null) goto L165;
        r135 = r1115.getFloat(3, r135);
    L165:
        r911.f884f = r135;
        float r136 = r911.f885g;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") == null) goto L169;
        r136 = r1115.getFloat(4, r136);
    L169:
        r911.f885g = r136;
        float r137 = r911.f886h;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") == null) goto L173;
        r137 = r1115.getFloat(6, r137);
    L173:
        r911.f886h = r137;
        float r138 = r911.f887i;
        if (r30.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") == null) goto L177;
        r138 = r1115.getFloat(7, r138);
    L177:
        r911.f887i = r138;
        String r1410 = r1115.getString(0);
        if (r1410 == null) goto L180;
        r911.f889k = r1410;
    L180:
        r911.m552c();
        r1115.recycle();
        r102.f880b.add(r911);
        r82.push(r911);
        if (r911.getGroupName() == null) goto L183;
        r78.put(r911.getGroupName(), r911);
    L183:
        r62.f1448a = r62.f1448a;
        goto L184
    L185:
        r25 = r112;
        r23 = '\b';
        r24 = 1;
        if (r97 != 3) goto L190;
        if ("group".equals(r30.getName()) == false) goto L190;
        r82.pop();
    L191:
        if (r21 == true) goto L195;
        this.f1728c = m1025a(r52.f1450c, r52.f1451d);
        return;
    L195:
        throw new XmlPullParserException("no path defined");
    L197:
        throw new XmlPullParserException(r6.getPositionDescription() + "<vector> tag requires height > 0");
    L199:
        throw new XmlPullParserException(r6.getPositionDescription() + "<vector> tag requires width > 0");
    L201:
        throw new XmlPullParserException(r6.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    L203:
        throw new XmlPullParserException(r6.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    L20:
        r12 = PorterDuff.Mode.SRC_OVER;
        goto L21
    L9:
        r9 = r6.getInt(6, -1);
        goto L10
    }

    public C0530MD(C0444KD r2) {
        this.f1731f = true;
        this.f1732g = new float[9];
        this.f1733h = new Matrix();
        this.f1734i = new Rect();
        this.f1727b = r2;
        this.f1728c = m1025a(r2.f1450c, r2.f1451d);
    }
}
