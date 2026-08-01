package androidx.viewpager2.widget;

import androidx.recyclerview.widget.AbstractC3283;
import com.bumptech.glide.load.engine.C3837;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5227;
import p352.C9620;
import p358.RunnableC9644;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3376 extends AbstractC3387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f8010;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f8011;

    public C3376() {
        this.f8011 = 0;
        this.f8010 = new ArrayList(3);
    }

    @Override // androidx.viewpager2.widget.AbstractC3387
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5609(int i) {
        int i2 = this.f8011;
        Object obj = this.f8010;
        switch (i2) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((AbstractC3387) it.next()).mo5609(i);
                        break;
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    C9620.m15032("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            case 1:
                C3837 c3837 = (C3837) obj;
                C3382 c3382 = (C3382) c3837.f9880;
                if (c3382 == null) {
                    AbstractC5227.m9467("viewPager");
                    throw null;
                }
                Object tag = c3382.getTag();
                C3382 c33822 = (C3382) c3837.f9880;
                if (tag == null) {
                    if (c33822 == null) {
                        AbstractC5227.m9467("viewPager");
                        throw null;
                    }
                    c33822.setTag(Boolean.TRUE);
                    c3837.m7051();
                    return;
                }
                if (c33822 == null) {
                    AbstractC5227.m9467("viewPager");
                    throw null;
                }
                AbstractC3283 adapter = c33822.getAdapter();
                adapter.getClass();
                adapter.m5364(i);
                C3382 c33823 = (C3382) c3837.f9880;
                if (c33823 != null) {
                    c33823.post(new RunnableC9644(c3837, 1));
                    return;
                } else {
                    AbstractC5227.m9467("viewPager");
                    throw null;
                }
            default:
                C3837 c38372 = (C3837) obj;
                C3382 c33824 = (C3382) c38372.f9880;
                if (c33824 == null) {
                    AbstractC5227.m9467("viewPager");
                    throw null;
                }
                Object tag2 = c33824.getTag();
                C3382 c33825 = (C3382) c38372.f9880;
                if (tag2 == null) {
                    if (c33825 != null) {
                        c33825.setTag(Boolean.TRUE);
                        return;
                    } else {
                        AbstractC5227.m9467("viewPager");
                        throw null;
                    }
                }
                if (c33825 == null) {
                    AbstractC5227.m9467("viewPager");
                    throw null;
                }
                AbstractC3283 adapter2 = c33825.getAdapter();
                adapter2.getClass();
                adapter2.m5364(i);
                return;
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC3387
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo5610(int i, float f, int i2) {
        switch (this.f8011) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.f8010).iterator();
                    while (it.hasNext()) {
                        ((AbstractC3387) it.next()).mo5610(i, f, i2);
                        break;
                    }
                } catch (ConcurrentModificationException e) {
                    C9620.m15032("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
                break;
        }
    }

    @Override // androidx.viewpager2.widget.AbstractC3387
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5611(int i) {
        switch (this.f8011) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.f8010).iterator();
                    while (it.hasNext()) {
                        ((AbstractC3387) it.next()).mo5611(i);
                        break;
                    }
                } catch (ConcurrentModificationException e) {
                    C9620.m15032("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
                break;
        }
    }

    public /* synthetic */ C3376(Object obj, int i) {
        this.f8011 = i;
        this.f8010 = obj;
    }
}
