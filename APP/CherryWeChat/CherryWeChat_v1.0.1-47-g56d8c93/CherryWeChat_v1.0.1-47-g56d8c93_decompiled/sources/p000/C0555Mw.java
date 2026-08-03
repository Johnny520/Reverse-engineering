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
    public static final C0555Mw f1823b;

    static {
        AbstractC0295Gu.m625r(-17373142710325L);
        f1823b = new C0555Mw(new C1116Zz(AbstractC0295Gu.m625r(-493921237045L), AbstractC0295Gu.m625r(-515396073525L), false, AbstractC0295Gu.m625r(-38654703669L), AbstractC0295Gu.m625r(-60129540149L), (C2648vx) null, 100));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        if (m2024e()) {
            C1214bG c1214bG = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-818217039689781L));
            Object obj = c1214bG != null ? c1214bG.f4146a : null;
            Method method = obj instanceof Method ? (Method) obj : null;
            C0848Tp c0848Tp = new C0848Tp(22);
            AbstractC0295Gu.m625r(-577819130198069L);
            AbstractC0295Gu.m625r(-577849194969141L);
            new C1538iG(method).m2917b(c0848Tp);
            String strM625r = AbstractC0295Gu.m625r(-970662606901L);
            AbstractC0295Gu.m625r(-578300166535221L);
            int i = AbstractC1450gG.f5067a;
            C1538iG c1538iG = new C1538iG(AbstractC1406fG.m2718r0(strM625r));
            c1538iG.m2921f(AbstractC0295Gu.m625r(-566935681077L));
            c1538iG.m2916a(new C0848Tp(23));
        }
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-90194311221L);
    }

    @Override // p000.AbstractC1101Zk
    /* JADX INFO: renamed from: d */
    public final ArrayList mo1096d(Context context) {
        Bitmap bitmap;
        AbstractC0295Gu.m625r(-158913787957L);
        ArrayList arrayList = new ArrayList(super.mo1096d(context));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setVisibility(f1823b.m2024e() ? 0 : 8);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int iM616i = AbstractC0295Gu.m616i(40);
        try {
            Drawable drawableM2790H = C1456gf.m2790H();
            if (drawableM2790H instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawableM2790H).getBitmap();
            } else {
                int intrinsicWidth = drawableM2790H.getIntrinsicWidth();
                int i = 1;
                if (intrinsicWidth < 1) {
                    intrinsicWidth = 1;
                }
                int intrinsicHeight = drawableM2790H.getIntrinsicHeight();
                if (intrinsicHeight >= 1) {
                    i = intrinsicHeight;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableM2790H.setBounds(0, 0, intrinsicWidth, i);
                drawableM2790H.draw(canvas);
                bitmap = bitmapCreateBitmap;
            }
        } catch (Exception unused) {
            bitmap = null;
        }
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iM616i, iM616i);
        layoutParams.setMarginStart(AbstractC0295Gu.m616i(4));
        layoutParams.setMarginEnd(AbstractC0295Gu.m616i(12));
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        String strM625r = AbstractC0295Gu.m625r(-193273526325L);
        AbstractC0295Gu.m625r(-839953869174837L);
        int i2 = AbstractC0599Nx.f1939a.getInt(strM625r, 100);
        if (bitmap != null && !bitmap.isRecycled()) {
            imageView.setImageBitmap(AbstractC0148Dc.m279m(bitmap, i2));
        }
        linearLayout.addView(imageView);
        C2734xx c2734xx = new C2734xx(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        c2734xx.setLayoutParams(layoutParams2);
        c2734xx.setKey(AbstractC0295Gu.m625r(-846108555317L));
        c2734xx.setTitle(AbstractC0295Gu.m625r(-949187770421L));
        c2734xx.setMax(100);
        c2734xx.setProgress(i2);
        c2734xx.setValueFormatter(new C0848Tp(24));
        c2734xx.setOnValueChangedListener(new C2240mk(3, imageView, bitmap));
        linearLayout.addView(c2734xx);
        arrayList.add(linearLayout);
        Object obj = arrayList.get(0);
        C1128aA c1128aA = obj instanceof C1128aA ? (C1128aA) obj : null;
        if (c1128aA != null) {
            c1128aA.setOnCheckedChangeListener(new C2479s(5, linearLayout));
        }
        return arrayList;
    }
}
