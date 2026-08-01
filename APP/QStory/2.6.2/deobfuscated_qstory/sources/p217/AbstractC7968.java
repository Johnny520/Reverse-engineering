package p217;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.C2475;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.R;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import lin.xposed.hook.javaplugin.view.ViewOnLongClickListenerC5544;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import p075.C6957;
import p315.C8670;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7968 extends AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC7962 f22043;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC7963 f22044;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public List f22045;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public RecyclerView f22046;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List f22047;

    public AbstractC7968() {
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        this.f22045 = emptyList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m13430(AbstractC7968 abstractC7968, List list) {
        if (list == null) {
            abstractC7968.getClass();
            list = EmptyList.INSTANCE;
        }
        abstractC7968.getClass();
        abstractC7968.f22045.getClass();
        list.getClass();
        List list2 = abstractC7968.f22045;
        abstractC7968.f22045 = list;
        abstractC7968.m4781();
        List list3 = abstractC7968.f22045;
        list2.getClass();
        list3.getClass();
    }

    public final void removeOnViewAttachStateChangeListener(InterfaceC7961 interfaceC7961) {
        interfaceC7961.getClass();
        List list = this.f22047;
        if (list != null) {
            list.remove(interfaceC7961);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo4782(int i) {
        this.f22045.getClass();
        return mo13425(i, this.f22045);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo4783(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4784() {
        this.f22045.getClass();
        List list = this.f22045;
        list.getClass();
        return list.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public int mo13425(int i, List list) {
        list.getClass();
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Context m13431() {
        RecyclerView recyclerView = this.f22046;
        if (recyclerView == null) {
            C5919.m11250("Please get it after onAttachedToRecyclerView()");
            return null;
        }
        Context context = recyclerView.getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public void mo13426(AbstractC2484 abstractC2484, int i, Object obj, List list) {
        list.getClass();
        mo13429(abstractC2484, i, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public abstract AbstractC2484 mo13427(Context context, ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public boolean mo13428(int i) {
        return i == R.id.BaseQuickAdapter_empty_view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract void mo13429(AbstractC2484 abstractC2484, int i, Object obj);

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo4787(RecyclerView recyclerView) {
        this.f22046 = null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4788(int i, ViewGroup viewGroup) {
        if (i == R.id.BaseQuickAdapter_empty_view) {
            return new C8670(viewGroup);
        }
        Context context = viewGroup.getContext();
        context.getClass();
        AbstractC2484 abstractC2484Mo13427 = mo13427(context, viewGroup, i);
        if (this.f22044 != null) {
            abstractC2484Mo13427.itemView.setOnClickListener(new ViewOnClickListenerC5561(abstractC2484Mo13427, 9, this));
        }
        if (this.f22043 != null) {
            abstractC2484Mo13427.itemView.setOnLongClickListener(new ViewOnLongClickListenerC5544(abstractC2484Mo13427, 4, this));
        }
        return abstractC2484Mo13427;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo4789(AbstractC2484 abstractC2484) {
        List list = this.f22047;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC7961) it.next()).getClass();
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo4792(AbstractC2484 abstractC2484) {
        int bindingAdapterPosition = abstractC2484.getBindingAdapterPosition();
        if (((abstractC2484 instanceof C8670) || (bindingAdapterPosition != -1 && mo13428(mo4782(bindingAdapterPosition)))) && (abstractC2484.itemView.getLayoutParams() instanceof C2475)) {
            ViewGroup.LayoutParams layoutParams = abstractC2484.itemView.getLayoutParams();
            layoutParams.getClass();
            ((C2475) layoutParams).f7423 = true;
        }
        List list = this.f22047;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C7967) ((InterfaceC7961) it.next())).getClass();
                AbstractC2450 bindingAdapter = abstractC2484.getBindingAdapter();
                if (bindingAdapter != null) {
                    bindingAdapter.mo4784();
                }
                abstractC2484.getBindingAdapterPosition();
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4795(AbstractC2484 abstractC2484, int i) {
        if (abstractC2484 instanceof C8670) {
            C6957.m12230(((C8670) abstractC2484).f24457);
        } else {
            mo13429(abstractC2484, i, AbstractC4343.m8831(i, this.f22045));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo4796(AbstractC2484 abstractC2484, int i, List list) {
        list.getClass();
        if (list.isEmpty()) {
            mo4795(abstractC2484, i);
        } else if (abstractC2484 instanceof C8670) {
            C6957.m12230(((C8670) abstractC2484).f24457);
        } else {
            mo13426(abstractC2484, i, AbstractC4343.m8831(i, this.f22045), list);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo4798(RecyclerView recyclerView) {
        this.f22046 = recyclerView;
    }
}
