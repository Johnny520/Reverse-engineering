package p233;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC3283;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.C3308;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import lin.xposed.hook.javaplugin.view.ViewOnLongClickListenerC6376;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p091.C7787;
import p331.C9491;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8798 extends AbstractC3283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC8792 f22385;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC8793 f22386;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public List f22387;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public RecyclerView f22388;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List f22389;

    public AbstractC8798() {
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        this.f22387 = emptyList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m14017(AbstractC8798 abstractC8798, List list) {
        if (list == null) {
            abstractC8798.getClass();
            list = EmptyList.INSTANCE;
        }
        abstractC8798.getClass();
        abstractC8798.f22387.getClass();
        list.getClass();
        List list2 = abstractC8798.f22387;
        abstractC8798.f22387 = list;
        abstractC8798.m5351();
        List list3 = abstractC8798.f22387;
        list2.getClass();
        list3.getClass();
    }

    public final void removeOnViewAttachStateChangeListener(InterfaceC8791 interfaceC8791) {
        interfaceC8791.getClass();
        List list = this.f22389;
        if (list != null) {
            list.remove(interfaceC8791);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo5352(int i) {
        this.f22387.getClass();
        return mo14012(i, this.f22387);
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo5353(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo5354() {
        this.f22387.getClass();
        List list = this.f22387;
        list.getClass();
        return list.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public int mo14012(int i, List list) {
        list.getClass();
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Context m14018() {
        RecyclerView recyclerView = this.f22388;
        if (recyclerView == null) {
            C6755.m11870("Please get it after onAttachedToRecyclerView()");
            return null;
        }
        Context context = recyclerView.getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public void mo14013(AbstractC3317 abstractC3317, int i, Object obj, List list) {
        list.getClass();
        mo14016(abstractC3317, i, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public abstract AbstractC3317 mo14014(Context context, ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public boolean mo14015(int i) {
        return i == C0328R.id.BaseQuickAdapter_empty_view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract void mo14016(AbstractC3317 abstractC3317, int i, Object obj);

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo5357(RecyclerView recyclerView) {
        this.f22388 = null;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC3317 mo5358(int i, ViewGroup viewGroup) {
        if (i == C0328R.id.BaseQuickAdapter_empty_view) {
            return new C9491(viewGroup);
        }
        Context context = viewGroup.getContext();
        context.getClass();
        AbstractC3317 abstractC3317Mo14014 = mo14014(context, viewGroup, i);
        if (this.f22386 != null) {
            abstractC3317Mo14014.itemView.setOnClickListener(new ViewOnClickListenerC6392(abstractC3317Mo14014, 9, this));
        }
        if (this.f22385 != null) {
            abstractC3317Mo14014.itemView.setOnLongClickListener(new ViewOnLongClickListenerC6376(abstractC3317Mo14014, 4, this));
        }
        return abstractC3317Mo14014;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo5359(AbstractC3317 abstractC3317) {
        List list = this.f22389;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC8791) it.next()).getClass();
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo5362(AbstractC3317 abstractC3317) {
        int bindingAdapterPosition = abstractC3317.getBindingAdapterPosition();
        if (((abstractC3317 instanceof C9491) || (bindingAdapterPosition != -1 && mo14015(mo5352(bindingAdapterPosition)))) && (abstractC3317.itemView.getLayoutParams() instanceof C3308)) {
            ViewGroup.LayoutParams layoutParams = abstractC3317.itemView.getLayoutParams();
            layoutParams.getClass();
            ((C3308) layoutParams).f7769 = true;
        }
        List list = this.f22389;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C8797) ((InterfaceC8791) it.next())).getClass();
                AbstractC3283 bindingAdapter = abstractC3317.getBindingAdapter();
                if (bindingAdapter != null) {
                    bindingAdapter.mo5354();
                }
                abstractC3317.getBindingAdapterPosition();
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo5365(AbstractC3317 abstractC3317, int i) {
        if (abstractC3317 instanceof C9491) {
            C7787.m12818(((C9491) abstractC3317).f24793);
        } else {
            mo14016(abstractC3317, i, AbstractC5176.m9377(i, this.f22387));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo5366(AbstractC3317 abstractC3317, int i, List list) {
        list.getClass();
        if (list.isEmpty()) {
            mo5365(abstractC3317, i);
        } else if (abstractC3317 instanceof C9491) {
            C7787.m12818(((C9491) abstractC3317).f24793);
        } else {
            mo14013(abstractC3317, i, AbstractC5176.m9377(i, this.f22387), list);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo5368(RecyclerView recyclerView) {
        this.f22388 = recyclerView;
    }
}
