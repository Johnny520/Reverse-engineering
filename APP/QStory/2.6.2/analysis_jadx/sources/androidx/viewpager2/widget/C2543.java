package androidx.viewpager2.widget;

import androidx.recyclerview.widget.AbstractC2450;
import com.bumptech.glide.load.engine.C3004;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4394;
import p330.C8796;
import p343.RunnableC8829;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2543 extends AbstractC2554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f7664;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7665;

    public C2543() {
        this.f7665 = 0;
        this.f7664 = new ArrayList(3);
    }

    @Override // androidx.viewpager2.widget.AbstractC2554
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5039(int i) {
        int i2 = this.f7665;
        Object obj = this.f7664;
        switch (i2) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((AbstractC2554) it.next()).mo5039(i);
                        break;
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    C8796.m14449("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            case 1:
                C3004 c3004 = (C3004) obj;
                C2549 c2549 = (C2549) c3004.f9533;
                if (c2549 == null) {
                    AbstractC4394.m8918("viewPager");
                    throw null;
                }
                Object tag = c2549.getTag();
                C2549 c25492 = (C2549) c3004.f9533;
                if (tag == null) {
                    if (c25492 == null) {
                        AbstractC4394.m8918("viewPager");
                        throw null;
                    }
                    c25492.setTag(Boolean.TRUE);
                    c3004.m6435();
                    return;
                }
                if (c25492 == null) {
                    AbstractC4394.m8918("viewPager");
                    throw null;
                }
                AbstractC2450 adapter = c25492.getAdapter();
                adapter.getClass();
                adapter.m4794(i);
                C2549 c25493 = (C2549) c3004.f9533;
                if (c25493 != null) {
                    c25493.post(new RunnableC8829(c3004, 1));
                    return;
                } else {
                    AbstractC4394.m8918("viewPager");
                    throw null;
                }
            default:
                C3004 c30042 = (C3004) obj;
                C2549 c25494 = (C2549) c30042.f9533;
                if (c25494 == null) {
                    AbstractC4394.m8918("viewPager");
                    throw null;
                }
                Object tag2 = c25494.getTag();
                C2549 c25495 = (C2549) c30042.f9533;
                if (tag2 == null) {
                    if (c25495 != null) {
                        c25495.setTag(Boolean.TRUE);
                        return;
                    } else {
                        AbstractC4394.m8918("viewPager");
                        throw null;
                    }
                }
                if (c25495 == null) {
                    AbstractC4394.m8918("viewPager");
                    throw null;
                }
                AbstractC2450 adapter2 = c25495.getAdapter();
                adapter2.getClass();
                adapter2.m4794(i);
                return;
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC2554
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo5040(int i, float f, int i2) {
        switch (this.f7665) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.f7664).iterator();
                    while (it.hasNext()) {
                        ((AbstractC2554) it.next()).mo5040(i, f, i2);
                        break;
                    }
                } catch (ConcurrentModificationException e) {
                    C8796.m14449("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
                break;
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC2554
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5041(int i) {
        switch (this.f7665) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.f7664).iterator();
                    while (it.hasNext()) {
                        ((AbstractC2554) it.next()).mo5041(i);
                        break;
                    }
                } catch (ConcurrentModificationException e) {
                    C8796.m14449("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
                break;
        }
    }

    public /* synthetic */ C2543(Object obj, int i) {
        this.f7665 = i;
        this.f7664 = obj;
    }
}
