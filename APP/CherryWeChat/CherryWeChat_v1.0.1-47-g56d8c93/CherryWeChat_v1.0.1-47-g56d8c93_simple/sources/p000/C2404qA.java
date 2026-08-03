package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import android.util.Xml;

/* JADX INFO: renamed from: qA */
/* JADX INFO: loaded from: classes.dex */
public final class C2404qA {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f8422a;

    /* JADX INFO: renamed from: b */
    public final String f8423b;

    /* JADX INFO: renamed from: c */
    public final String f8424c;

    /* JADX INFO: renamed from: d */
    public final int f8425d;

    /* JADX INFO: renamed from: e */
    public final int f8426e;

    /* JADX INFO: renamed from: f */
    public final float f8427f;

    /* JADX INFO: renamed from: g */
    public final float f8428g;

    /* JADX INFO: renamed from: h */
    public final float f8429h;

    /* JADX INFO: renamed from: i */
    public final boolean f8430i;

    /* JADX INFO: renamed from: j */
    public final float f8431j;

    /* JADX INFO: renamed from: k */
    public final ColorStateList f8432k;

    /* JADX INFO: renamed from: l */
    public float f8433l;

    /* JADX INFO: renamed from: m */
    public final int f8434m;

    /* JADX INFO: renamed from: n */
    public boolean f8435n;

    /* JADX INFO: renamed from: o */
    public boolean f8436o;

    /* JADX INFO: renamed from: p */
    public Typeface f8437p;

    public C2404qA(Context r8, int r9) {
        this.f8435n = false;
        this.f8436o = false;
        TypedArray r1 = r8.obtainStyledAttributes(r9, AbstractC0982Wu.f3088w);
        this.f8433l = r1.getDimension(0, 0.0f);
        int r3 = 3;
        this.f8432k = AbstractC0828TB.m1643j(r8, r1, 3);
        AbstractC0828TB.m1643j(r8, r1, 4);
        AbstractC0828TB.m1643j(r8, r1, 5);
        this.f8425d = r1.getInt(2, 0);
        this.f8426e = r1.getInt(1, 1);
        int r5 = 12;
        if (r1.hasValue(12) == true) goto L6;
        r5 = 10;
    L6:
        this.f8434m = r1.getResourceId(r5, 0);
        this.f8423b = r1.getString(r5);
        r1.getBoolean(14, false);
        this.f8422a = AbstractC0828TB.m1643j(r8, r1, 6);
        this.f8427f = r1.getFloat(7, 0.0f);
        this.f8428g = r1.getFloat(8, 0.0f);
        this.f8429h = r1.getFloat(9, 0.0f);
        r1.recycle();
        TypedArray r82 = r8.obtainStyledAttributes(r9, AbstractC0939Vu.f2951t);
        this.f8430i = r82.hasValue(0);
        this.f8431j = r82.getFloat(0, 0.0f);
        if (r82.hasValue(3) == true) goto L10;
        r3 = 1;
    L10:
        this.f8424c = r82.getString(r3);
        r82.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m4837a() {
        Typeface r0 = this.f8437p;
        int r1 = this.f8425d;
        if (r0 != null) goto L8;
        String r02 = this.f8423b;
        if (r02 == null) goto L8;
        this.f8437p = Typeface.create(r02, r1);
    L8:
        if (this.f8437p != null) goto L21;
        int r2 = this.f8426e;
        if (r2 != 1) goto L12;
        this.f8437p = Typeface.SANS_SERIF;
    L19:
        this.f8437p = Typeface.create(this.f8437p, r1);
        return;
    L12:
        if (r2 != 2) goto L14;
        this.f8437p = Typeface.SERIF;
        goto L19
    L14:
        if (r2 == 3) goto L16;
        this.f8437p = Typeface.DEFAULT;
        goto L19
    L16:
        this.f8437p = Typeface.MONOSPACE;
        goto L19
    }

    /* JADX INFO: renamed from: b */
    public final void m4838b(Context r9, AbstractC0295Gu r10) {
        if (m4839c(r9) == true) goto L5;
        m4837a();
    L5:
        int r2 = this.f8434m;
        if (r2 != 0) goto L9;
        this.f8435n = true;
    L9:
        if (this.f8435n == false) goto L21;
        r10.mo633z(this.f8437p, true);
        return;
    L21:
        C2310oA r5 = new C2310oA(this, r10);     // Catch: Exception -> L18 Resources.NotFoundException -> L19
        ThreadLocal r1 = AbstractC0125Cw.f295a;     // Catch: Exception -> L18 Resources.NotFoundException -> L19
        if (r9.isRestricted() == false) goto L16;
        r5.m1161c(-4);     // Catch: Exception -> L18 Resources.NotFoundException -> L19
        return;
    L16:
        AbstractC0125Cw.m201a(r9, r2, new TypedValue(), 0, r5, false, false);     // Catch: Exception -> L18 Resources.NotFoundException -> L19
        return;
    L19:
        this.f8435n = true;
        r10.mo632y(1);
        return;
    L18:
        this.f8435n = true;
        r10.mo632y(-3);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4839c(Context r11) {
        if (this.f8435n == false) goto L5;
        return true;
    L5:
        int r3 = this.f8434m;
        if (r3 == 0) goto L43;
        ThreadLocal r2 = AbstractC0125Cw.f295a;
        Typeface r9 = null;
        if (r11.isRestricted() == false) goto L11;
        Context r22 = r11;
        Typeface r112 = null;
    L12:
        if (r112 == null) goto L16;
        this.f8437p = r112;
        this.f8435n = true;
        return true;
    L16:
        if (this.f8436o == true) goto L40;
        this.f8436o = true;
        Resources r113 = r22.getResources();
        int r23 = this.f8434m;
        if (r23 != 0) goto L21;
    L33:
        String r24 = null;
    L34:
        if (r24 == null) goto L40;
        Typeface r114 = Typeface.create(r24, 0);
        if (r114 == Typeface.DEFAULT) goto L40;
        r9 = Typeface.create(r114, this.f8425d);
        goto L40
    L21:
        if (r113.getResourceTypeName(r23).equals("font") == false) goto L33;
        XmlResourceParser r25 = r113.getXml(r23);     // Catch: Throwable -> L44
    L25:
        if (r25.getEventType() == 1) goto L33;
        if (r25.getEventType() != 2) goto L31;
        if (r25.getName().equals("font-family") == false) goto L31;
        TypedArray r115 = r113.obtainAttributes(Xml.asAttributeSet(r25), AbstractC0725Qu.f2311b);     // Catch: Throwable -> L44
        r24 = r115.getString(7);     // Catch: Throwable -> L44
        r115.recycle();     // Catch: Throwable -> L44
    L31:
        r25.next();     // Catch: Throwable -> L44
    L40:
        if (r9 == null) goto L43;
        this.f8437p = r9;
        this.f8435n = true;
        return true;
    L11:
        r22 = r11;
        r112 = AbstractC0125Cw.m201a(r22, r3, new TypedValue(), 0, null, false, true);
    L43:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m4840d(Context r3, TextPaint r4, AbstractC0295Gu r5) {
        m4841e(r3, r4, r5);
        ColorStateList r32 = this.f8432k;
        if (r32 == null) goto L5;
        int r33 = r32.getColorForState(r4.drawableState, r32.getDefaultColor());
    L6:
        r4.setColor(r33);
        ColorStateList r34 = this.f8422a;
        if (r34 == null) goto L9;
        int r35 = r34.getColorForState(r4.drawableState, r34.getDefaultColor());
    L10:
        r4.setShadowLayer(this.f8429h, this.f8427f, this.f8428g, r35);
        return;
    L9:
        r35 = 0;
        goto L10
    L5:
        r33 = -16777216;
        goto L6
    }

    /* JADX INFO: renamed from: e */
    public final void m4841e(Context r2, TextPaint r3, AbstractC0295Gu r4) {
        if (m4839c(r2) == true) goto L5;
    L10:
        m4837a();
        m4842f(r2, r3, this.f8437p);
        m4838b(r2, new C2353pA(this, r2, r3, r4));
        return;
    L5:
        if (this.f8435n == false) goto L10;
        Typeface r0 = this.f8437p;
        if (r0 == null) goto L10;
        m4842f(r2, r3, r0);
    }

    /* JADX INFO: renamed from: f */
    public final void m4842f(Context r1, TextPaint r2, Typeface r3) {
        Typeface r12 = AbstractC0828TB.m1651u(r1.getResources().getConfiguration(), r3);
        if (r12 == null) goto L5;
        r3 = r12;
    L5:
        r2.setTypeface(r3);
        int r13 = (~r3.getStyle()) & this.f8425d;
        if ((r13 & 1) == 0) goto L8;
        boolean r32 = true;
    L9:
        r2.setFakeBoldText(r32);
        if ((r13 & 2) == 0) goto L12;
        float r14 = -0.25f;
    L13:
        r2.setTextSkewX(r14);
        r2.setTextSize(this.f8433l);
        r2.setFontVariationSettings(this.f8424c);
        if (this.f8430i == false) goto L17;
        r2.setLetterSpacing(this.f8431j);
        return;
    L17:
        return;
    L12:
        r14 = 0.0f;
        goto L13
    L8:
        r32 = false;
        goto L9
    }
}
