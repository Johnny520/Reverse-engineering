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
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import lin.xposed.hook.javaplugin.view.ViewOnLongClickListenerC5545;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import p075.C6958;
import p315.C8662;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7969 extends AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC7963 f22040;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC7964 f22041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public List f22042;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public RecyclerView f22043;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List f22044;

    public AbstractC7969() {
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        this.f22042 = emptyList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static void m13458(AbstractC7969 abstractC7969, List list) {
        if (list == null) {
            abstractC7969.getClass();
            list = EmptyList.INSTANCE;
        }
        abstractC7969.getClass();
        abstractC7969.f22042.getClass();
        list.getClass();
        List list2 = abstractC7969.f22042;
        abstractC7969.f22042 = list;
        abstractC7969.m4791();
        List list3 = abstractC7969.f22042;
        list2.getClass();
        list3.getClass();
    }

    public final void removeOnViewAttachStateChangeListener(InterfaceC7962 interfaceC7962) {
        interfaceC7962.getClass();
        List list = this.f22044;
        if (list != null) {
            list.remove(interfaceC7962);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo4792(int i) {
        this.f22042.getClass();
        return mo13453(i, this.f22042);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo4793(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4794() {
        this.f22042.getClass();
        List list = this.f22042;
        list.getClass();
        return list.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public int mo13453(int i, List list) {
        list.getClass();
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Context m13459() {
        RecyclerView recyclerView = this.f22043;
        if (recyclerView == null) {
            C5925.m11311("Please get it after onAttachedToRecyclerView()");
            return null;
        }
        Context context = recyclerView.getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public void mo13454(AbstractC2484 abstractC2484, int i, Object obj, List list) {
        list.getClass();
        mo13457(abstractC2484, i, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public abstract AbstractC2484 mo13455(Context context, ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public boolean mo13456(int i) {
        return i == R.id.BaseQuickAdapter_empty_view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract void mo13457(AbstractC2484 abstractC2484, int i, Object obj);

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo4797(RecyclerView recyclerView) {
        this.f22043 = null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4798(int i, ViewGroup viewGroup) {
        if (i == R.id.BaseQuickAdapter_empty_view) {
            return new C8662(viewGroup);
        }
        Context context = viewGroup.getContext();
        context.getClass();
        AbstractC2484 abstractC2484Mo13455 = mo13455(context, viewGroup, i);
        if (this.f22041 != null) {
            abstractC2484Mo13455.itemView.setOnClickListener(new ViewOnClickListenerC5562(abstractC2484Mo13455, 9, this));
        }
        if (this.f22040 != null) {
            abstractC2484Mo13455.itemView.setOnLongClickListener(new ViewOnLongClickListenerC5545(abstractC2484Mo13455, 4, this));
        }
        return abstractC2484Mo13455;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public void mo4799(AbstractC2484 abstractC2484) {
        List list = this.f22044;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC7962) it.next()).getClass();
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo4802(AbstractC2484 abstractC2484) {
        int bindingAdapterPosition = abstractC2484.getBindingAdapterPosition();
        if (((abstractC2484 instanceof C8662) || (bindingAdapterPosition != -1 && mo13456(mo4792(bindingAdapterPosition)))) && (abstractC2484.itemView.getLayoutParams() instanceof C2475)) {
            ViewGroup.LayoutParams layoutParams = abstractC2484.itemView.getLayoutParams();
            layoutParams.getClass();
            ((C2475) layoutParams).f7424 = true;
        }
        List list = this.f22044;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C7968) ((InterfaceC7962) it.next())).getClass();
                AbstractC2450 bindingAdapter = abstractC2484.getBindingAdapter();
                if (bindingAdapter != null) {
                    bindingAdapter.mo4794();
                }
                abstractC2484.getBindingAdapterPosition();
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4805(AbstractC2484 abstractC2484, int i) {
        if (abstractC2484 instanceof C8662) {
            C6958.m12259(((C8662) abstractC2484).f24448);
        } else {
            mo13457(abstractC2484, i, AbstractC4344.m8818(i, this.f22042));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo4806(AbstractC2484 abstractC2484, int i, List list) {
        list.getClass();
        if (list.isEmpty()) {
            mo4805(abstractC2484, i);
        } else if (abstractC2484 instanceof C8662) {
            C6958.m12259(((C8662) abstractC2484).f24448);
        } else {
            mo13454(abstractC2484, i, AbstractC4344.m8818(i, this.f22042), list);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo4808(RecyclerView recyclerView) {
        this.f22043 = recyclerView;
    }
}
