package p219;

import android.util.Pair;
import androidx.appcompat.widget.C0190;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2501;
import androidx.recyclerview.widget.C2461;
import androidx.recyclerview.widget.C2492;
import androidx.recyclerview.widget.C2493;
import com.chad.library.adapter4.layoutmanager.QuickGridLayoutManager;
import p217.AbstractC7969;
import p220.InterfaceC7975;

/* JADX INFO: renamed from: 飘花落叶言楪世兰苏哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7974 extends AbstractC2501 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ QuickGridLayoutManager f22047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC2501 f22048;

    public C7974(QuickGridLayoutManager quickGridLayoutManager) {
        this.f22047 = quickGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.AbstractC2501
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4960(int i) {
        QuickGridLayoutManager quickGridLayoutManager = this.f22047;
        AbstractC2450 abstractC2450 = quickGridLayoutManager.f9827;
        if (abstractC2450 == null) {
            return 1;
        }
        if (!(abstractC2450 instanceof C2493)) {
            if (abstractC2450 instanceof InterfaceC7975) {
                return quickGridLayoutManager.f7142;
            }
            if (!(abstractC2450 instanceof AbstractC7969)) {
                AbstractC2501 abstractC2501 = this.f22048;
                if (abstractC2501 != null) {
                    return abstractC2501.mo4960(i);
                }
                return 1;
            }
            AbstractC7969 abstractC7969 = (AbstractC7969) abstractC2450;
            if (abstractC7969.mo13456(abstractC7969.mo4792(i))) {
                return quickGridLayoutManager.f7142;
            }
            AbstractC2501 abstractC25012 = this.f22048;
            if (abstractC25012 != null) {
                return abstractC25012.mo4960(i);
            }
            return 1;
        }
        C2492 c2492 = ((C2493) abstractC2450).f7465;
        C0190 c0190M4932 = c2492.m4932(i);
        Pair pair = new Pair(((C2461) c0190M4932.f743).f7332, Integer.valueOf(c0190M4932.f745));
        c0190M4932.f744 = false;
        c0190M4932.f743 = null;
        c0190M4932.f745 = -1;
        c2492.f7457 = c0190M4932;
        AbstractC2450 abstractC24502 = (AbstractC2450) pair.first;
        if (abstractC24502 instanceof InterfaceC7975) {
            return quickGridLayoutManager.f7142;
        }
        if (!(abstractC24502 instanceof AbstractC7969)) {
            AbstractC2501 abstractC25013 = this.f22048;
            if (abstractC25013 != null) {
                return abstractC25013.mo4960(i);
            }
            return 1;
        }
        AbstractC7969 abstractC79692 = (AbstractC7969) abstractC24502;
        Object obj = pair.second;
        obj.getClass();
        if (abstractC79692.mo13456(abstractC79692.mo4792(((Number) obj).intValue()))) {
            return quickGridLayoutManager.f7142;
        }
        AbstractC2501 abstractC25014 = this.f22048;
        if (abstractC25014 != null) {
            return abstractC25014.mo4960(i);
        }
        return 1;
    }
}
