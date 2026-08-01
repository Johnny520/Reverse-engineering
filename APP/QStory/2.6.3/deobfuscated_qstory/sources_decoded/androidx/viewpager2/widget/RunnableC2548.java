package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.ArrayList;
import java.util.List;
import p034.AbstractC6344;
import p161.AbstractC7642;
import p167.AbstractC7710;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2548 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f7669;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f7670;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7671;

    public RunnableC2548(List list, int i, Throwable th) {
        this.f7671 = 3;
        AbstractC6344.m11870(list, "initCallbacks cannot be null");
        this.f7670 = new ArrayList(list);
        this.f7669 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7671;
        int i2 = this.f7669;
        Object obj = this.f7670;
        switch (i) {
            case 0:
                ((RecyclerView) obj).m4744(i2);
                break;
            case 1:
                ((MaterialCalendar) obj).f10257.m4744(i2);
                break;
            case 2:
                AbstractC7642 abstractC7642 = (AbstractC7642) ((C5856) obj).f16014;
                if (abstractC7642 != null) {
                    abstractC7642.mo735(i2);
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((AbstractC7710) arrayList.get(i3)).mo12990();
                        i3++;
                    }
                } else {
                    while (i3 < size) {
                        ((AbstractC7710) arrayList.get(i3)).mo13008();
                        i3++;
                    }
                }
                break;
        }
    }

    public RunnableC2548(int i, C2550 c2550) {
        this.f7671 = 0;
        this.f7669 = i;
        this.f7670 = c2550;
    }

    public /* synthetic */ RunnableC2548(Object obj, int i, int i2) {
        this.f7671 = i2;
        this.f7670 = obj;
        this.f7669 = i;
    }
}
