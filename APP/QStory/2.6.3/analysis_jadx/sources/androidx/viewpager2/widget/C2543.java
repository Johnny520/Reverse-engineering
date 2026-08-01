package androidx.viewpager2.widget;

import androidx.recyclerview.widget.AbstractC2450;
import com.bumptech.glide.load.engine.C3005;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4395;
import p336.C8791;
import p342.RunnableC8815;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2543 extends AbstractC2554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f7665;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7666;

    public C2543() {
        this.f7666 = 0;
        this.f7665 = new ArrayList(3);
    }

    @Override // androidx.viewpager2.widget.AbstractC2554
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5049(int i) {
        int i2 = this.f7666;
        Object obj = this.f7665;
        switch (i2) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((AbstractC2554) it.next()).mo5049(i);
                        break;
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    C8791.m14473("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            case 1:
                C3005 c3005 = (C3005) obj;
                C2549 c2549 = (C2549) c3005.f9535;
                if (c2549 == null) {
                    AbstractC4395.m8908("viewPager");
                    throw null;
                }
                Object tag = c2549.getTag();
                C2549 c25492 = (C2549) c3005.f9535;
                if (tag == null) {
                    if (c25492 == null) {
                        AbstractC4395.m8908("viewPager");
                        throw null;
                    }
                    c25492.setTag(Boolean.TRUE);
                    c3005.m6491();
                    return;
                }
                if (c25492 == null) {
                    AbstractC4395.m8908("viewPager");
                    throw null;
                }
                AbstractC2450 adapter = c25492.getAdapter();
                adapter.getClass();
                adapter.m4804(i);
                C2549 c25493 = (C2549) c3005.f9535;
                if (c25493 != null) {
                    c25493.post(new RunnableC8815(c3005, 1));
                    return;
                } else {
                    AbstractC4395.m8908("viewPager");
                    throw null;
                }
            default:
                C3005 c30052 = (C3005) obj;
                C2549 c25494 = (C2549) c30052.f9535;
                if (c25494 == null) {
                    AbstractC4395.m8908("viewPager");
                    throw null;
                }
                Object tag2 = c25494.getTag();
                C2549 c25495 = (C2549) c30052.f9535;
                if (tag2 == null) {
                    if (c25495 != null) {
                        c25495.setTag(Boolean.TRUE);
                        return;
                    } else {
                        AbstractC4395.m8908("viewPager");
                        throw null;
                    }
                }
                if (c25495 == null) {
                    AbstractC4395.m8908("viewPager");
                    throw null;
                }
                AbstractC2450 adapter2 = c25495.getAdapter();
                adapter2.getClass();
                adapter2.m4804(i);
                return;
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC2554
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo5050(int i, float f, int i2) {
        switch (this.f7666) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.f7665).iterator();
                    while (it.hasNext()) {
                        ((AbstractC2554) it.next()).mo5050(i, f, i2);
                        break;
                    }
                } catch (ConcurrentModificationException e) {
                    C8791.m14473("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
                break;
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC2554
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5051(int i) {
        switch (this.f7666) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.f7665).iterator();
                    while (it.hasNext()) {
                        ((AbstractC2554) it.next()).mo5051(i);
                        break;
                    }
                } catch (ConcurrentModificationException e) {
                    C8791.m14473("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
                break;
        }
    }

    public /* synthetic */ C2543(Object obj, int i) {
        this.f7666 = i;
        this.f7665 = obj;
    }
}
