package p000;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1158g;
import androidx.recyclerview.widget.AbstractC1166o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: R7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0738R7 extends AbstractC0887Ul {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2355d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC1158g f2356e;

    public C0738R7(AbstractC1158g r1, int r2) {
        this.f2355d = r2;
        this.f2356e = r1;
        this.f2775a = -1;
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: a */
    public final void mo1531a(RecyclerView r3, AbstractC1166o r4) {
        switch(this.f2355d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-25958782335029L);
        AbstractC0295Gu.m625r(-25971667236917L);
        super.mo1531a(r3, r4);
        r4.itemView.setPressed(false);
        return;
    L6:
        AbstractC0295Gu.m625r(-251629248968757L);
        AbstractC0295Gu.m625r(-251642133870645L);
        super.mo1531a(r3, r4);
        r4.itemView.setPressed(false);
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: d */
    public final int mo1532d() {
        switch(this.f2355d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-25847113185333L);
        long r0 = -25859998087221L;
    L5:
        AbstractC0295Gu.m625r(r0);
        return 196611;
    L7:
        AbstractC0295Gu.m625r(-251517579819061L);
        r0 = -251530464720949L;
        goto L5
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: l */
    public final void mo1533l(AbstractC1166o r4, AbstractC1166o r5) {
        switch(this.f2355d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-25872882989109L);
        AbstractC0295Gu.m625r(-25885767890997L);
        AbstractC0295Gu.m625r(-25915832662069L);
        C0696Q7 r0 = (C0696Q7) this.f2356e;
        int r42 = r4.getAdapterPosition();
        int r52 = r5.getAdapterPosition();
        ArrayList r1 = r0.f2239b;
        r1.add(r52, (EnumC0319Hb) r1.remove(r42));
        r0.notifyItemMoved(r42, r52);
        return;
    L6:
        AbstractC0295Gu.m625r(-251543349622837L);
        AbstractC0295Gu.m625r(-251556234524725L);
        AbstractC0295Gu.m625r(-251586299295797L);
        C0696Q7 r02 = (C0696Q7) this.f2356e;
        int r43 = r4.getAdapterPosition();
        int r53 = r5.getAdapterPosition();
        ArrayList r12 = r02.f2239b;
        r12.add(r53, (C0610O7) r12.remove(r43));
        r02.notifyItemMoved(r43, r53);
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: m */
    public final void mo1534m(AbstractC1166o r2, int r3) {
        switch(this.f2355d) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        if (r3 == 0) goto L16;
        if (r2 == null) goto L17;
        View r22 = r2.itemView;
        if (r22 == null) goto L18;
        r22.setPressed(true);
        return;
    L18:
        return;
    L17:
        return;
    L16:
        return;
    L10:
        if (r3 == 0) goto L19;
        if (r2 == null) goto L20;
        View r23 = r2.itemView;
        if (r23 == null) goto L21;
        r23.setPressed(true);
        return;
    L21:
        return;
    L20:
        return;
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: n */
    public final void mo1535n() {
        switch(this.f2355d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        long r0 = -25945897433141L;
    L5:
        AbstractC0295Gu.m625r(r0);
        return;
    L7:
        r0 = -251616364066869L;
        goto L5
    }
}
