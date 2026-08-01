package p217;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.activity.AbstractC0053;
import androidx.recyclerview.widget.AbstractC2484;
import com.davemorrissey.labs.subscaleview.R;
import java.util.List;
import kotlin.collections.EmptyList;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7964 extends AbstractC7968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final SparseArray f22041;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC7966 f22042;

    public AbstractC7964() {
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        this.f22045 = emptyList;
        this.f22041 = new SparseArray(1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static InterfaceC7965 m13424(AbstractC2484 abstractC2484) {
        Object tag = abstractC2484.itemView.getTag(R.id.BaseQuickAdapter_key_multi);
        if (tag instanceof InterfaceC7965) {
            return (InterfaceC7965) tag;
        }
        return null;
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int mo13425(int i, List list) {
        list.getClass();
        InterfaceC7966 interfaceC7966 = this.f22042;
        if (interfaceC7966 != null) {
            return interfaceC7966.mo11254(i, list);
        }
        return 0;
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void mo13426(AbstractC2484 abstractC2484, int i, Object obj, List list) {
        list.getClass();
        if (list.isEmpty()) {
            InterfaceC7965 interfaceC7965M13424 = m13424(abstractC2484);
            if (interfaceC7965M13424 != null) {
                interfaceC7965M13424.mo11521(abstractC2484, i, obj);
                return;
            }
            return;
        }
        InterfaceC7965 interfaceC7965M134242 = m13424(abstractC2484);
        if (interfaceC7965M134242 != null) {
            interfaceC7965M134242.mo11523(abstractC2484, i, obj, list);
        }
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC2484 mo13427(Context context, ViewGroup viewGroup, int i) {
        InterfaceC7965 interfaceC7965 = (InterfaceC7965) this.f22041.get(i);
        if (interfaceC7965 == null) {
            C5919.m11249(AbstractC0053.m161(i, "ViewType: ", " not found onViewHolderListener，please use addItemType() first!"));
            return null;
        }
        Context context2 = viewGroup.getContext();
        context2.getClass();
        AbstractC2484 abstractC2484Mo11522 = interfaceC7965.mo11522(context2, viewGroup);
        abstractC2484Mo11522.itemView.setTag(R.id.BaseQuickAdapter_key_multi, interfaceC7965);
        return abstractC2484Mo11522;
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean mo13428(int i) {
        if (super.mo13428(i)) {
            return true;
        }
        return false;
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void mo13429(AbstractC2484 abstractC2484, int i, Object obj) {
        InterfaceC7965 interfaceC7965M13424 = m13424(abstractC2484);
        if (interfaceC7965M13424 != null) {
            interfaceC7965M13424.mo11521(abstractC2484, i, obj);
        }
    }

    @Override // p217.AbstractC7968, androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo4789(AbstractC2484 abstractC2484) {
        super.mo4789(abstractC2484);
        m13424(abstractC2484);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo4790(AbstractC2484 abstractC2484) {
        abstractC2484.getClass();
        m13424(abstractC2484);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo4791(AbstractC2484 abstractC2484) {
        m13424(abstractC2484);
        return false;
    }

    @Override // p217.AbstractC7968, androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo4792(AbstractC2484 abstractC2484) {
        super.mo4792(abstractC2484);
        m13424(abstractC2484);
    }
}
