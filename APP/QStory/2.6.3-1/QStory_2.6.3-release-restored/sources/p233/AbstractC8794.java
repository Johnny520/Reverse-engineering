package p233;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.activity.AbstractC0900;
import androidx.recyclerview.widget.AbstractC3317;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.List;
import kotlin.collections.EmptyList;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8794 extends AbstractC8798 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final SparseArray f22383;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC8796 f22384;

    public AbstractC8794() {
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        this.f22387 = emptyList;
        this.f22383 = new SparseArray(1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static InterfaceC8795 m14011(AbstractC3317 abstractC3317) {
        Object tag = abstractC3317.itemView.getTag(C0328R.id.BaseQuickAdapter_key_multi);
        if (tag instanceof InterfaceC8795) {
            return (InterfaceC8795) tag;
        }
        return null;
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int mo14012(int i, List list) {
        list.getClass();
        InterfaceC8796 interfaceC8796 = this.f22384;
        if (interfaceC8796 != null) {
            return interfaceC8796.mo11874(i, list);
        }
        return 0;
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void mo14013(AbstractC3317 abstractC3317, int i, Object obj, List list) {
        list.getClass();
        if (list.isEmpty()) {
            InterfaceC8795 interfaceC8795M14011 = m14011(abstractC3317);
            if (interfaceC8795M14011 != null) {
                interfaceC8795M14011.mo12118(abstractC3317, i, obj);
                return;
            }
            return;
        }
        InterfaceC8795 interfaceC8795M140112 = m14011(abstractC3317);
        if (interfaceC8795M140112 != null) {
            interfaceC8795M140112.mo12120(abstractC3317, i, obj, list);
        }
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC3317 mo14014(Context context, ViewGroup viewGroup, int i) {
        InterfaceC8795 interfaceC8795 = (InterfaceC8795) this.f22383.get(i);
        if (interfaceC8795 == null) {
            C6755.m11869(AbstractC0900.m722(i, "ViewType: ", " not found onViewHolderListener，please use addItemType() first!"));
            return null;
        }
        Context context2 = viewGroup.getContext();
        context2.getClass();
        AbstractC3317 abstractC3317Mo12119 = interfaceC8795.mo12119(context2, viewGroup);
        abstractC3317Mo12119.itemView.setTag(C0328R.id.BaseQuickAdapter_key_multi, interfaceC8795);
        return abstractC3317Mo12119;
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean mo14015(int i) {
        if (super.mo14015(i)) {
            return true;
        }
        return false;
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void mo14016(AbstractC3317 abstractC3317, int i, Object obj) {
        InterfaceC8795 interfaceC8795M14011 = m14011(abstractC3317);
        if (interfaceC8795M14011 != null) {
            interfaceC8795M14011.mo12118(abstractC3317, i, obj);
        }
    }

    @Override // p233.AbstractC8798, androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo5359(AbstractC3317 abstractC3317) {
        super.mo5359(abstractC3317);
        m14011(abstractC3317);
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo5360(AbstractC3317 abstractC3317) {
        abstractC3317.getClass();
        m14011(abstractC3317);
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo5361(AbstractC3317 abstractC3317) {
        m14011(abstractC3317);
        return false;
    }

    @Override // p233.AbstractC8798, androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo5362(AbstractC3317 abstractC3317) {
        super.mo5362(abstractC3317);
        m14011(abstractC3317);
    }
}
