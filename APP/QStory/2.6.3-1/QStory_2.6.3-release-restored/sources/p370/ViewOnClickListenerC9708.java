package p370;

import android.view.View;
import androidx.compose.foundation.lazy.C1596;
import java.util.ArrayList;
import java.util.Iterator;
import p233.AbstractC8794;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC9708 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f25378;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f25379;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8794 f25380;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25381;

    public /* synthetic */ ViewOnClickListenerC9708(int i, ArrayList arrayList, C9706 c9706) {
        this.f25381 = 1;
        this.f25379 = i;
        this.f25378 = arrayList;
        this.f25380 = c9706;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        int i = this.f25381;
        AbstractC8794 abstractC8794 = this.f25380;
        int i2 = this.f25379;
        Object obj = this.f25378;
        switch (i) {
            case 0:
                C9704 c9704 = (C9704) obj;
                C9706 c9706 = (C9706) abstractC8794;
                c9704.f25365 = !c9704.f25365;
                c9706.f25370.put(Integer.valueOf(i2), Boolean.valueOf(c9704.f25365));
                c9706.m15096();
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                C9706 c97062 = (C9706) abstractC8794;
                z = i2 < arrayList.size();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c97062.f25374.put(((NewFriendInfo) it.next()).uin, Boolean.valueOf(z));
                }
                c97062.m5351();
                C1596 c1596 = c97062.f25373;
                if (c1596 != null) {
                    c1596.invoke();
                }
                break;
            case 2:
                C9710 c9710 = (C9710) obj;
                C9715 c9715 = (C9715) abstractC8794;
                c9710.f25384 = !c9710.f25384;
                c9715.f25395.put(Integer.valueOf(i2), Boolean.valueOf(c9710.f25384));
                c9715.m15097();
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                C9715 c97152 = (C9715) abstractC8794;
                if (!arrayList2.isEmpty()) {
                    z = i2 < arrayList2.size();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        c97152.f25397.put(((C9709) it2.next()).f25383.GroupUin, Boolean.valueOf(z));
                    }
                    c97152.m5351();
                    C1596 c15962 = c97152.f25396;
                    if (c15962 != null) {
                        c15962.invoke();
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC9708(Object obj, AbstractC8794 abstractC8794, int i, int i2) {
        this.f25381 = i2;
        this.f25378 = obj;
        this.f25380 = abstractC8794;
        this.f25379 = i;
    }

    public /* synthetic */ ViewOnClickListenerC9708(ArrayList arrayList, int i, C9715 c9715) {
        this.f25381 = 3;
        this.f25378 = arrayList;
        this.f25379 = i;
        this.f25380 = c9715;
    }
}
