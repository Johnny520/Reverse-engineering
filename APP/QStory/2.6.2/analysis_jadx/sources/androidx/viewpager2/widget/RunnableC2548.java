package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.ArrayList;
import java.util.List;
import p053.AbstractC6560;
import p161.AbstractC7641;
import p167.AbstractC7709;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2548 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f7668;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f7669;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7670;

    public RunnableC2548(List list, int i, Throwable th) {
        this.f7670 = 3;
        AbstractC6560.m12036(list, "initCallbacks cannot be null");
        this.f7669 = new ArrayList(list);
        this.f7668 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7670;
        int i2 = this.f7668;
        Object obj = this.f7669;
        switch (i) {
            case 0:
                ((RecyclerView) obj).m4734(i2);
                break;
            case 1:
                ((MaterialCalendar) obj).f10252.m4734(i2);
                break;
            case 2:
                AbstractC7641 abstractC7641 = (AbstractC7641) ((C5851) obj).f16007;
                if (abstractC7641 != null) {
                    abstractC7641.mo734(i2);
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((AbstractC7709) arrayList.get(i3)).mo12958();
                        i3++;
                    }
                } else {
                    while (i3 < size) {
                        ((AbstractC7709) arrayList.get(i3)).mo12978();
                        i3++;
                    }
                }
                break;
        }
    }

    public RunnableC2548(int i, C2550 c2550) {
        this.f7670 = 0;
        this.f7668 = i;
        this.f7669 = c2550;
    }

    public /* synthetic */ RunnableC2548(Object obj, int i, int i2) {
        this.f7670 = i2;
        this.f7669 = obj;
        this.f7668 = i;
    }
}
