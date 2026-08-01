package p354;

import android.view.View;
import androidx.compose.foundation.lazy.C0755;
import java.util.ArrayList;
import java.util.Iterator;
import p217.AbstractC7965;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC8879 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f25033;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f25034;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7965 f25035;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25036;

    public /* synthetic */ ViewOnClickListenerC8879(int i, ArrayList arrayList, C8877 c8877) {
        this.f25036 = 1;
        this.f25034 = i;
        this.f25033 = arrayList;
        this.f25035 = c8877;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        int i = this.f25036;
        AbstractC7965 abstractC7965 = this.f25035;
        int i2 = this.f25034;
        Object obj = this.f25033;
        switch (i) {
            case 0:
                C8875 c8875 = (C8875) obj;
                C8877 c8877 = (C8877) abstractC7965;
                c8875.f25020 = !c8875.f25020;
                c8877.f25025.put(Integer.valueOf(i2), Boolean.valueOf(c8875.f25020));
                c8877.m14537();
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                C8877 c88772 = (C8877) abstractC7965;
                z = i2 < arrayList.size();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c88772.f25029.put(((NewFriendInfo) it.next()).uin, Boolean.valueOf(z));
                }
                c88772.m4791();
                C0755 c0755 = c88772.f25028;
                if (c0755 != null) {
                    c0755.invoke();
                }
                break;
            case 2:
                C8881 c8881 = (C8881) obj;
                C8886 c8886 = (C8886) abstractC7965;
                c8881.f25039 = !c8881.f25039;
                c8886.f25050.put(Integer.valueOf(i2), Boolean.valueOf(c8881.f25039));
                c8886.m14538();
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                C8886 c88862 = (C8886) abstractC7965;
                if (!arrayList2.isEmpty()) {
                    z = i2 < arrayList2.size();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        c88862.f25052.put(((C8880) it2.next()).f25038.GroupUin, Boolean.valueOf(z));
                    }
                    c88862.m4791();
                    C0755 c07552 = c88862.f25051;
                    if (c07552 != null) {
                        c07552.invoke();
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC8879(Object obj, AbstractC7965 abstractC7965, int i, int i2) {
        this.f25036 = i2;
        this.f25033 = obj;
        this.f25035 = abstractC7965;
        this.f25034 = i;
    }

    public /* synthetic */ ViewOnClickListenerC8879(ArrayList arrayList, int i, C8886 c8886) {
        this.f25036 = 3;
        this.f25033 = arrayList;
        this.f25034 = i;
        this.f25035 = c8886;
    }
}
