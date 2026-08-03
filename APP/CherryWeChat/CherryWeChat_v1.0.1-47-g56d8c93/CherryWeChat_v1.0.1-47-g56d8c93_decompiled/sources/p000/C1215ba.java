package p000;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.AbstractC1166o;

/* JADX INFO: renamed from: ba */
/* JADX INFO: loaded from: classes.dex */
public final class C1215ba extends AbstractC1166o {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f4149a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1258ca f4150b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1215ba(C1258ca c1258ca, C0780S6 c0780s6) {
        super(c0780s6);
        AbstractC0295Gu.m625r(-102615358634037L);
        this.f4150b = c1258ca;
        LinearLayout linearLayout = new LinearLayout((Context) c1258ca.f4263c);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        c0780s6.addView(linearLayout);
        this.f4149a = linearLayout;
    }
}
