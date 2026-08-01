package p219;

import android.util.Pair;
import androidx.appcompat.widget.C0190;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2501;
import androidx.recyclerview.widget.C2461;
import androidx.recyclerview.widget.C2492;
import androidx.recyclerview.widget.C2493;
import com.chad.library.adapter4.layoutmanager.QuickGridLayoutManager;
import p217.AbstractC7968;
import p220.InterfaceC7974;

/* JADX INFO: renamed from: 飘花落叶言楪世兰苏哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7973 extends AbstractC2501 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ QuickGridLayoutManager f22050;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC2501 f22051;

    public C7973(QuickGridLayoutManager quickGridLayoutManager) {
        this.f22050 = quickGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.AbstractC2501
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4950(int i) {
        QuickGridLayoutManager quickGridLayoutManager = this.f22050;
        AbstractC2450 abstractC2450 = quickGridLayoutManager.f9822;
        if (abstractC2450 == null) {
            return 1;
        }
        if (!(abstractC2450 instanceof C2493)) {
            if (abstractC2450 instanceof InterfaceC7974) {
                return quickGridLayoutManager.f7141;
            }
            if (!(abstractC2450 instanceof AbstractC7968)) {
                AbstractC2501 abstractC2501 = this.f22051;
                if (abstractC2501 != null) {
                    return abstractC2501.mo4950(i);
                }
                return 1;
            }
            AbstractC7968 abstractC7968 = (AbstractC7968) abstractC2450;
            if (abstractC7968.mo13428(abstractC7968.mo4782(i))) {
                return quickGridLayoutManager.f7141;
            }
            AbstractC2501 abstractC25012 = this.f22051;
            if (abstractC25012 != null) {
                return abstractC25012.mo4950(i);
            }
            return 1;
        }
        C2492 c2492 = ((C2493) abstractC2450).f7464;
        C0190 c0190M4922 = c2492.m4922(i);
        Pair pair = new Pair(((C2461) c0190M4922.f743).f7331, Integer.valueOf(c0190M4922.f745));
        c0190M4922.f744 = false;
        c0190M4922.f743 = null;
        c0190M4922.f745 = -1;
        c2492.f7456 = c0190M4922;
        AbstractC2450 abstractC24502 = (AbstractC2450) pair.first;
        if (abstractC24502 instanceof InterfaceC7974) {
            return quickGridLayoutManager.f7141;
        }
        if (!(abstractC24502 instanceof AbstractC7968)) {
            AbstractC2501 abstractC25013 = this.f22051;
            if (abstractC25013 != null) {
                return abstractC25013.mo4950(i);
            }
            return 1;
        }
        AbstractC7968 abstractC79682 = (AbstractC7968) abstractC24502;
        Object obj = pair.second;
        obj.getClass();
        if (abstractC79682.mo13428(abstractC79682.mo4782(((Number) obj).intValue()))) {
            return quickGridLayoutManager.f7141;
        }
        AbstractC2501 abstractC25014 = this.f22051;
        if (abstractC25014 != null) {
            return abstractC25014.mo4950(i);
        }
        return 1;
    }
}
