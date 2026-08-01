package p217;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.activity.AbstractC0053;
import androidx.recyclerview.widget.AbstractC2484;
import com.davemorrissey.labs.subscaleview.R;
import java.util.List;
import kotlin.collections.EmptyList;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7965 extends AbstractC7969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final SparseArray f22038;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC7967 f22039;

    public AbstractC7965() {
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        this.f22042 = emptyList;
        this.f22038 = new SparseArray(1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static InterfaceC7966 m13452(AbstractC2484 abstractC2484) {
        Object tag = abstractC2484.itemView.getTag(R.id.BaseQuickAdapter_key_multi);
        if (tag instanceof InterfaceC7966) {
            return (InterfaceC7966) tag;
        }
        return null;
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int mo13453(int i, List list) {
        list.getClass();
        InterfaceC7967 interfaceC7967 = this.f22039;
        if (interfaceC7967 != null) {
            return interfaceC7967.mo11315(i, list);
        }
        return 0;
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void mo13454(AbstractC2484 abstractC2484, int i, Object obj, List list) {
        list.getClass();
        if (list.isEmpty()) {
            InterfaceC7966 interfaceC7966M13452 = m13452(abstractC2484);
            if (interfaceC7966M13452 != null) {
                interfaceC7966M13452.mo11559(abstractC2484, i, obj);
                return;
            }
            return;
        }
        InterfaceC7966 interfaceC7966M134522 = m13452(abstractC2484);
        if (interfaceC7966M134522 != null) {
            interfaceC7966M134522.mo11561(abstractC2484, i, obj, list);
        }
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC2484 mo13455(Context context, ViewGroup viewGroup, int i) {
        InterfaceC7966 interfaceC7966 = (InterfaceC7966) this.f22038.get(i);
        if (interfaceC7966 == null) {
            C5925.m11310(AbstractC0053.m162(i, "ViewType: ", " not found onViewHolderListener，please use addItemType() first!"));
            return null;
        }
        Context context2 = viewGroup.getContext();
        context2.getClass();
        AbstractC2484 abstractC2484Mo11560 = interfaceC7966.mo11560(context2, viewGroup);
        abstractC2484Mo11560.itemView.setTag(R.id.BaseQuickAdapter_key_multi, interfaceC7966);
        return abstractC2484Mo11560;
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean mo13456(int i) {
        if (super.mo13456(i)) {
            return true;
        }
        return false;
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void mo13457(AbstractC2484 abstractC2484, int i, Object obj) {
        InterfaceC7966 interfaceC7966M13452 = m13452(abstractC2484);
        if (interfaceC7966M13452 != null) {
            interfaceC7966M13452.mo11559(abstractC2484, i, obj);
        }
    }

    @Override // p217.AbstractC7969, androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo4799(AbstractC2484 abstractC2484) {
        super.mo4799(abstractC2484);
        m13452(abstractC2484);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo4800(AbstractC2484 abstractC2484) {
        abstractC2484.getClass();
        m13452(abstractC2484);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo4801(AbstractC2484 abstractC2484) {
        m13452(abstractC2484);
        return false;
    }

    @Override // p217.AbstractC7969, androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo4802(AbstractC2484 abstractC2484) {
        super.mo4802(abstractC2484);
        m13452(abstractC2484);
    }
}
