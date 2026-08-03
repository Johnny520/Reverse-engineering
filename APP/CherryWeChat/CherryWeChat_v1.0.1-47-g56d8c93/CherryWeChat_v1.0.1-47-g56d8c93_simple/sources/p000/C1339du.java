package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: du */
/* JADX INFO: loaded from: classes.dex */
public final class C1339du extends AbstractC0929Vk {

    /* JADX INFO: renamed from: a */
    public static final C1339du f4823a = null;

    /* JADX INFO: renamed from: b */
    public static String f4824b;

    static {
        f4823a = new C1339du();
        f4824b = AbstractC0295Gu.m625r(-525459183892533L);
    }

    /* JADX INFO: renamed from: c */
    public static ImageView m2594c(ViewGroup r6) {
        int r0 = r6.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L16;
        View r2 = r6.getChildAt(r1);
        if ((r2 instanceof ImageView) == false) goto L11;
        ImageView r3 = (ImageView) r2;
        int r4 = r3.getLayoutParams().width;
        if (r4 != r3.getLayoutParams().height) goto L11;
        if (r4 <= 0) goto L11;
        return r3;
    L11:
        if ((r2 instanceof ViewGroup) == false) goto L15;
        ImageView r22 = m2594c((ViewGroup) r2);
        if (r22 == null) goto L15;
        return r22;
    L15:
        r1 = r1 + 1;
        goto L3
    L16:
        return null;
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        String r0 = AbstractC0295Gu.m625r(-524763399190581L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r2 = AbstractC1450gG.f5067a;
        C1538iG r1 = new C1538iG(AbstractC1406fG.m2718r0(r0));
        r1.m2922g(new Object[]{View.class, ViewGroup.class});
        r1.m2916a(new C0848Tp(18));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-526348242122805L);
    }
}
