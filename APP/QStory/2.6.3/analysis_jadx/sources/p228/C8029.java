package p228;

import androidx.core.util.InterfaceC2186;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2962;
import com.bumptech.glide.load.data.InterfaceC2963;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p222.AbstractC7989;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8029 implements InterfaceC2962, InterfaceC2963 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC2963 f22170;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Priority f22171;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f22172;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f22173;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2186 f22174;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f22175;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f22176;

    public C8029(ArrayList arrayList, InterfaceC2186 interfaceC2186) {
        this.f22174 = interfaceC2186;
        if (arrayList.isEmpty()) {
            C5925.m11310("Must not be empty.");
            throw null;
        }
        this.f22176 = arrayList;
        this.f22175 = 0;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    public final void cancel() {
        this.f22173 = true;
        Iterator it = this.f22176.iterator();
        while (it.hasNext()) {
            ((InterfaceC2962) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2963
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6434(Object obj) {
        if (obj != null) {
            this.f22170.mo6434(obj);
        } else {
            m13513();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6430(Priority priority, InterfaceC2963 interfaceC2963) {
        this.f22171 = priority;
        this.f22170 = interfaceC2963;
        this.f22172 = (List) this.f22174.acquire();
        ((InterfaceC2962) this.f22176.get(this.f22175)).mo6430(priority, this);
        if (this.f22173) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6431() {
        return ((InterfaceC2962) this.f22176.get(0)).mo6431();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2963
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6435(Exception exc) {
        List list = this.f22172;
        AbstractC7989.m13469(list, "Argument must not be null");
        list.add(exc);
        m13513();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6432() {
        List list = this.f22172;
        if (list != null) {
            this.f22174.mo3989(list);
        }
        this.f22172 = null;
        Iterator it = this.f22176.iterator();
        while (it.hasNext()) {
            ((InterfaceC2962) it.next()).mo6432();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6433() {
        return ((InterfaceC2962) this.f22176.get(0)).mo6433();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13513() {
        if (this.f22173) {
            return;
        }
        if (this.f22175 < this.f22176.size() - 1) {
            this.f22175++;
            mo6430(this.f22171, this.f22170);
        } else {
            AbstractC7989.m13470(this.f22172);
            this.f22170.mo6435(new GlideException("Fetch failed", new ArrayList(this.f22172)));
        }
    }
}
