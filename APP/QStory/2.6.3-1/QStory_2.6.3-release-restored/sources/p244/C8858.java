package p244;

import androidx.core.util.InterfaceC3019;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC3794;
import com.bumptech.glide.load.data.InterfaceC3795;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p238.AbstractC8818;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8858 implements InterfaceC3794, InterfaceC3795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC3795 f22515;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Priority f22516;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f22517;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f22518;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC3019 f22519;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f22520;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f22521;

    public C8858(ArrayList arrayList, InterfaceC3019 interfaceC3019) {
        this.f22519 = interfaceC3019;
        if (arrayList.isEmpty()) {
            C6755.m11869("Must not be empty.");
            throw null;
        }
        this.f22521 = arrayList;
        this.f22520 = 0;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    public final void cancel() {
        this.f22518 = true;
        Iterator it = this.f22521.iterator();
        while (it.hasNext()) {
            ((InterfaceC3794) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3795
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6994(Object obj) {
        if (obj != null) {
            this.f22515.mo6994(obj);
        } else {
            m14072();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6990(Priority priority, InterfaceC3795 interfaceC3795) {
        this.f22516 = priority;
        this.f22515 = interfaceC3795;
        this.f22517 = (List) this.f22519.acquire();
        ((InterfaceC3794) this.f22521.get(this.f22520)).mo6990(priority, this);
        if (this.f22518) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6991() {
        return ((InterfaceC3794) this.f22521.get(0)).mo6991();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3795
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6995(Exception exc) {
        List list = this.f22517;
        AbstractC8818.m14028(list, "Argument must not be null");
        list.add(exc);
        m14072();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6992() {
        List list = this.f22517;
        if (list != null) {
            this.f22519.mo4549(list);
        }
        this.f22517 = null;
        Iterator it = this.f22521.iterator();
        while (it.hasNext()) {
            ((InterfaceC3794) it.next()).mo6992();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6993() {
        return ((InterfaceC3794) this.f22521.get(0)).mo6993();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14072() {
        if (this.f22518) {
            return;
        }
        if (this.f22520 < this.f22521.size() - 1) {
            this.f22520++;
            mo6990(this.f22516, this.f22515);
        } else {
            AbstractC8818.m14029(this.f22517);
            this.f22515.mo6995(new GlideException("Fetch failed", new ArrayList(this.f22517)));
        }
    }
}
