package p090t0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p003B0.AbstractC0055a;
import p027N0.AbstractC0223g;
import p077m0.ViewOnClickListenerC0770h;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: t0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1010e extends AbstractC1008c {

    /* JADX INFO: renamed from: h */
    public final LinearLayout f3607h;

    /* JADX INFO: renamed from: i */
    public View f3608i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C1010e(LinearLayout linearLayout) {
        Context context = linearLayout.getContext();
        AbstractC0223g.m417d(context, "getContext(...)");
        super(context, 0);
        this.f3607h = linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p090t0.AbstractC1008c
    /* JADX INFO: renamed from: e */
    public final View mo2152e(AbstractC1008c abstractC1008c) {
        abstractC1008c.setBackgroundColor(855638016);
        abstractC1008c.setOnClickListener(new ViewOnClickListenerC0770h(5, this));
        Context context = getContext();
        AbstractC0223g.m417d(context, "getContext(...)");
        C1009d c1009d = new C1009d(context, null, 0);
        c1009d.setClickable(true);
        c1009d.setBackgroundColor(0);
        c1009d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c1009d.setPadding(AbstractC0055a.m101b(32), AbstractC0055a.m101b(56), AbstractC0055a.m101b(32), AbstractC0055a.m101b(56));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        LinearLayout linearLayout = this.f3607h;
        linearLayout.setLayoutParams(layoutParams);
        c1009d.addView(linearLayout);
        return c1009d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View getNeedScrollChild() {
        return this.f3608i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p090t0.AbstractC1008c
    /* JADX INFO: renamed from: j */
    public final boolean mo2211j() {
        boolean z2 = AbstractC1126i.f3786a;
        return C1124g.m2446v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setNeedScrollChild(View view) {
        this.f3608i = view;
    }
}
