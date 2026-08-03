package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: du */
/* JADX INFO: loaded from: classes.dex */
public final class C1339du extends AbstractC0929Vk {

    /* JADX INFO: renamed from: a */
    public static final C1339du f4823a = new C1339du();

    /* JADX INFO: renamed from: b */
    public static String f4824b = AbstractC0295Gu.m625r(-525459183892533L);

    /* JADX INFO: renamed from: c */
    public static ImageView m2594c(ViewGroup viewGroup) {
        ImageView imageViewM2594c;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ImageView) {
                ImageView imageView = (ImageView) childAt;
                int i2 = imageView.getLayoutParams().width;
                if (i2 == imageView.getLayoutParams().height && i2 > 0) {
                    return imageView;
                }
            }
            if ((childAt instanceof ViewGroup) && (imageViewM2594c = m2594c((ViewGroup) childAt)) != null) {
                return imageViewM2594c;
            }
        }
        return null;
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        String strM625r = AbstractC0295Gu.m625r(-524763399190581L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int i = AbstractC1450gG.f5067a;
        C1538iG c1538iG = new C1538iG(AbstractC1406fG.m2718r0(strM625r));
        c1538iG.m2922g(View.class, ViewGroup.class);
        c1538iG.m2916a(new C0848Tp(18));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-526348242122805L);
    }
}
