package p228;

import androidx.core.util.InterfaceC2186;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2961;
import com.bumptech.glide.load.data.InterfaceC2962;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p222.AbstractC7988;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8028 implements InterfaceC2961, InterfaceC2962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC2962 f22173;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Priority f22174;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f22175;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f22176;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2186 f22177;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f22178;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f22179;

    public C8028(ArrayList arrayList, InterfaceC2186 interfaceC2186) {
        this.f22177 = interfaceC2186;
        if (arrayList.isEmpty()) {
            C5919.m11249("Must not be empty.");
            throw null;
        }
        this.f22179 = arrayList;
        this.f22178 = 0;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    public final void cancel() {
        this.f22176 = true;
        Iterator it = this.f22179.iterator();
        while (it.hasNext()) {
            ((InterfaceC2961) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6376(Object obj) {
        if (obj != null) {
            this.f22173.mo6376(obj);
        } else {
            m13485();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6372(Priority priority, InterfaceC2962 interfaceC2962) {
        this.f22174 = priority;
        this.f22173 = interfaceC2962;
        this.f22175 = (List) this.f22177.acquire();
        ((InterfaceC2961) this.f22179.get(this.f22178)).mo6372(priority, this);
        if (this.f22176) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6373() {
        return ((InterfaceC2961) this.f22179.get(0)).mo6373();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6377(Exception exc) {
        List list = this.f22175;
        AbstractC7988.m13441(list, "Argument must not be null");
        list.add(exc);
        m13485();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6374() {
        List list = this.f22175;
        if (list != null) {
            this.f22177.mo3979(list);
        }
        this.f22175 = null;
        Iterator it = this.f22179.iterator();
        while (it.hasNext()) {
            ((InterfaceC2961) it.next()).mo6374();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6375() {
        return ((InterfaceC2961) this.f22179.get(0)).mo6375();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13485() {
        if (this.f22176) {
            return;
        }
        if (this.f22178 < this.f22179.size() - 1) {
            this.f22178++;
            mo6372(this.f22174, this.f22173);
        } else {
            AbstractC7988.m13442(this.f22175);
            this.f22173.mo6377(new GlideException("Fetch failed", new ArrayList(this.f22175)));
        }
    }
}
