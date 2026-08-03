package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: Mw */
/* JADX INFO: loaded from: classes.dex */
public final class C0555Mw extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C0555Mw f1823b = null;

    static {
        AbstractC0295Gu.m625r(-17373142710325L);
        f1823b = new C0555Mw(new C1116Zz(AbstractC0295Gu.m625r(-493921237045L), AbstractC0295Gu.m625r(-515396073525L), false, AbstractC0295Gu.m625r(-38654703669L), AbstractC0295Gu.m625r(-60129540149L), null, 100));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        if (m2024e() == false) goto L13;
        C1214bG r0 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-818217039689781L));
        Method r1 = null;
        if (r0 == null) goto L7;
        Object r02 = r0.f4146a;
    L9:
        if ((r02 instanceof Method) == false) goto L11;
        r1 = (Method) r02;
    L11:
        C0848Tp r03 = new C0848Tp(22);
        AbstractC0295Gu.m625r(-577819130198069L);
        AbstractC0295Gu.m625r(-577849194969141L);
        new C1538iG(r1).m2917b(r03);
        String r04 = AbstractC0295Gu.m625r(-970662606901L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r2 = AbstractC1450gG.f5067a;
        C1538iG r12 = new C1538iG(AbstractC1406fG.m2718r0(r04));
        r12.m2921f(AbstractC0295Gu.m625r(-566935681077L));
        r12.m2916a(new C0848Tp(23));
        return;
    L7:
        r02 = null;
        goto L9
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-90194311221L);
    }

    @Override // p000.AbstractC1101Zk
    /* JADX INFO: renamed from: d */
    public final ArrayList mo1096d(Context r13) {
        AbstractC0295Gu.m625r(-158913787957L);
        ArrayList r1 = new ArrayList(super.mo1096d(r13));
        LinearLayout r0 = new LinearLayout(r13);
        if (f1823b.m2024e() == false) goto L5;
        int r2 = 0;
    L6:
        r0.setVisibility(r2);
        r0.setOrientation(0);
        r0.setGravity(16);
        r0.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int r22 = AbstractC0295Gu.m616i(40);
        C1128aA r4 = null;
        Drawable r6 = C1456gf.m2790H();     // Catch: Exception -> L19
        if ((r6 instanceof BitmapDrawable) == false) goto L10;
        Bitmap r62 = ((BitmapDrawable) r6).getBitmap();     // Catch: Exception -> L19
    L32:
    L20:
        ImageView r7 = new ImageView(r13);
        LinearLayout.LayoutParams r8 = new LinearLayout.LayoutParams(r22, r22);
        r8.setMarginStart(AbstractC0295Gu.m616i(4));
        r8.setMarginEnd(AbstractC0295Gu.m616i(12));
        r7.setLayoutParams(r8);
        r7.setScaleType(ImageView.ScaleType.CENTER_CROP);
        SharedPreferences r23 = AbstractC0599Nx.f1939a;
        String r24 = AbstractC0295Gu.m625r(-193273526325L);
        AbstractC0295Gu.m625r(-839953869174837L);
        int r25 = AbstractC0599Nx.f1939a.getInt(r24, 100);
        if (r62 != null) goto L23;
    L26:
        r0.addView(r7);
        C2734xx r82 = new C2734xx(r13);
        LinearLayout.LayoutParams r132 = new LinearLayout.LayoutParams(0, -2);
        r132.weight = 1.0f;
        r82.setLayoutParams(r132);
        r82.setKey(AbstractC0295Gu.m625r(-846108555317L));
        r82.setTitle(AbstractC0295Gu.m625r(-949187770421L));
        r82.setMax(100);
        r82.setProgress(r25);
        r82.setValueFormatter(new C0848Tp(24));
        r82.setOnValueChangedListener(new C2240mk(3, r7, r62));
        r0.addView(r82);
        r1.add(r0);
        Object r133 = r1.get(0);
        if ((r133 instanceof C1128aA) == false) goto L29;
        r4 = (C1128aA) r133;
    L29:
        if (r4 == null) goto L31;
        r4.setOnCheckedChangeListener(new C2479s(5, r0));
    L31:
        return r1;
    L23:
        if (r62.isRecycled() == true) goto L26;
        r7.setImageBitmap(AbstractC0148Dc.m279m(r62, r25));
        goto L26
    L10:
        int r72 = r6.getIntrinsicWidth();     // Catch: Exception -> L19
        int r83 = 1;
        if (r72 >= 1) goto L13;
        r72 = 1;
    L13:
        int r9 = r6.getIntrinsicHeight();     // Catch: Exception -> L19
        if (r9 < 1) goto L17;
        r83 = r9;
    L17:
        Bitmap r92 = Bitmap.createBitmap(r72, r83, Bitmap.Config.ARGB_8888);     // Catch: Exception -> L19
        Canvas r10 = new Canvas(r92);     // Catch: Exception -> L19
        r6.setBounds(0, 0, r72, r83);     // Catch: Exception -> L19
        r6.draw(r10);     // Catch: Exception -> L19
        r62 = r92;
    L19:
        r62 = null;
        goto L20
    L5:
        r2 = 8;
        goto L6
    }
}
