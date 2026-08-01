package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.ArrayList;
import java.util.List;
import p050.AbstractC7173;
import p177.AbstractC8471;
import p183.AbstractC8539;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3381 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f8014;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f8015;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8016;

    public RunnableC3381(List list, int i, Throwable th) {
        this.f8016 = 3;
        AbstractC7173.m12429(list, "initCallbacks cannot be null");
        this.f8015 = new ArrayList(list);
        this.f8014 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f8016;
        int i2 = this.f8014;
        Object obj = this.f8015;
        switch (i) {
            case 0:
                ((RecyclerView) obj).m5304(i2);
                break;
            case 1:
                ((MaterialCalendar) obj).f10602.m5304(i2);
                break;
            case 2:
                AbstractC8471 abstractC8471 = (AbstractC8471) ((C6686) obj).f16359;
                if (abstractC8471 != null) {
                    abstractC8471.mo1295(i2);
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((AbstractC8539) arrayList.get(i3)).mo13549();
                        i3++;
                    }
                } else {
                    while (i3 < size) {
                        ((AbstractC8539) arrayList.get(i3)).mo13567();
                        i3++;
                    }
                }
                break;
        }
    }

    public RunnableC3381(int i, C3383 c3383) {
        this.f8016 = 0;
        this.f8014 = i;
        this.f8015 = c3383;
    }

    public /* synthetic */ RunnableC3381(Object obj, int i, int i2) {
        this.f8016 = i2;
        this.f8015 = obj;
        this.f8014 = i;
    }
}
