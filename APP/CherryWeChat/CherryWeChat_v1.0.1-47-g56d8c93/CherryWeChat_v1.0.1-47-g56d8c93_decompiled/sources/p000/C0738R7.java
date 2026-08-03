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

    public C0738R7(AbstractC1158g abstractC1158g, int i) {
        this.f2355d = i;
        this.f2356e = abstractC1158g;
        this.f2775a = -1;
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: a */
    public final void mo1531a(RecyclerView recyclerView, AbstractC1166o abstractC1166o) {
        switch (this.f2355d) {
            case 0:
                AbstractC0295Gu.m625r(-251629248968757L);
                AbstractC0295Gu.m625r(-251642133870645L);
                super.mo1531a(recyclerView, abstractC1166o);
                abstractC1166o.itemView.setPressed(false);
                break;
            default:
                AbstractC0295Gu.m625r(-25958782335029L);
                AbstractC0295Gu.m625r(-25971667236917L);
                super.mo1531a(recyclerView, abstractC1166o);
                abstractC1166o.itemView.setPressed(false);
                break;
        }
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: d */
    public final int mo1532d() {
        long j;
        switch (this.f2355d) {
            case 0:
                AbstractC0295Gu.m625r(-251517579819061L);
                j = -251530464720949L;
                break;
            default:
                AbstractC0295Gu.m625r(-25847113185333L);
                j = -25859998087221L;
                break;
        }
        AbstractC0295Gu.m625r(j);
        return 196611;
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: l */
    public final void mo1533l(AbstractC1166o abstractC1166o, AbstractC1166o abstractC1166o2) {
        switch (this.f2355d) {
            case 0:
                AbstractC0295Gu.m625r(-251543349622837L);
                AbstractC0295Gu.m625r(-251556234524725L);
                AbstractC0295Gu.m625r(-251586299295797L);
                C0696Q7 c0696q7 = (C0696Q7) this.f2356e;
                int adapterPosition = abstractC1166o.getAdapterPosition();
                int adapterPosition2 = abstractC1166o2.getAdapterPosition();
                ArrayList arrayList = c0696q7.f2239b;
                arrayList.add(adapterPosition2, (C0610O7) arrayList.remove(adapterPosition));
                c0696q7.notifyItemMoved(adapterPosition, adapterPosition2);
                break;
            default:
                AbstractC0295Gu.m625r(-25872882989109L);
                AbstractC0295Gu.m625r(-25885767890997L);
                AbstractC0295Gu.m625r(-25915832662069L);
                C0696Q7 c0696q72 = (C0696Q7) this.f2356e;
                int adapterPosition3 = abstractC1166o.getAdapterPosition();
                int adapterPosition4 = abstractC1166o2.getAdapterPosition();
                ArrayList arrayList2 = c0696q72.f2239b;
                arrayList2.add(adapterPosition4, (EnumC0319Hb) arrayList2.remove(adapterPosition3));
                c0696q72.notifyItemMoved(adapterPosition3, adapterPosition4);
                break;
        }
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: m */
    public final void mo1534m(AbstractC1166o abstractC1166o, int i) {
        View view;
        View view2;
        switch (this.f2355d) {
            case 0:
                if (i != 0 && abstractC1166o != null && (view = abstractC1166o.itemView) != null) {
                    view.setPressed(true);
                    break;
                }
                break;
            default:
                if (i != 0 && abstractC1166o != null && (view2 = abstractC1166o.itemView) != null) {
                    view2.setPressed(true);
                    break;
                }
                break;
        }
    }

    @Override // p000.AbstractC0887Ul
    /* JADX INFO: renamed from: n */
    public final void mo1535n() {
        long j;
        switch (this.f2355d) {
            case 0:
                j = -251616364066869L;
                break;
            default:
                j = -25945897433141L;
                break;
        }
        AbstractC0295Gu.m625r(j);
    }
}
