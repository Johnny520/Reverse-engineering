package p356;

import android.view.View;
import androidx.compose.foundation.lazy.C0755;
import java.util.ArrayList;
import java.util.Iterator;
import p217.AbstractC7964;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC8900 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f25072;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f25073;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7964 f25074;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f25075;

    public /* synthetic */ ViewOnClickListenerC8900(int i, ArrayList arrayList, C8898 c8898) {
        this.f25075 = 1;
        this.f25073 = i;
        this.f25072 = arrayList;
        this.f25074 = c8898;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        int i = this.f25075;
        AbstractC7964 abstractC7964 = this.f25074;
        int i2 = this.f25073;
        Object obj = this.f25072;
        switch (i) {
            case 0:
                C8896 c8896 = (C8896) obj;
                C8898 c8898 = (C8898) abstractC7964;
                c8896.f25059 = !c8896.f25059;
                c8898.f25064.put(Integer.valueOf(i2), Boolean.valueOf(c8896.f25059));
                c8898.m14527();
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                C8898 c88982 = (C8898) abstractC7964;
                z = i2 < arrayList.size();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c88982.f25068.put(((NewFriendInfo) it.next()).uin, Boolean.valueOf(z));
                }
                c88982.m4781();
                C0755 c0755 = c88982.f25067;
                if (c0755 != null) {
                    c0755.invoke();
                }
                break;
            case 2:
                C8902 c8902 = (C8902) obj;
                C8907 c8907 = (C8907) abstractC7964;
                c8902.f25078 = !c8902.f25078;
                c8907.f25089.put(Integer.valueOf(i2), Boolean.valueOf(c8902.f25078));
                c8907.m14528();
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                C8907 c89072 = (C8907) abstractC7964;
                if (!arrayList2.isEmpty()) {
                    z = i2 < arrayList2.size();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        c89072.f25091.put(((C8901) it2.next()).f25077.GroupUin, Boolean.valueOf(z));
                    }
                    c89072.m4781();
                    C0755 c07552 = c89072.f25090;
                    if (c07552 != null) {
                        c07552.invoke();
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC8900(Object obj, AbstractC7964 abstractC7964, int i, int i2) {
        this.f25075 = i2;
        this.f25072 = obj;
        this.f25074 = abstractC7964;
        this.f25073 = i;
    }

    public /* synthetic */ ViewOnClickListenerC8900(ArrayList arrayList, int i, C8907 c8907) {
        this.f25075 = 3;
        this.f25072 = arrayList;
        this.f25073 = i;
        this.f25074 = c8907;
    }
}
