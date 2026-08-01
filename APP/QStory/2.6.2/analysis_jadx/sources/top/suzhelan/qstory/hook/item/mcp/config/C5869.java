package top.suzhelan.qstory.hook.item.mcp.config;

import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C5175;
import p052.InterfaceC6557;
import p325.AbstractC8757;
import p325.C8758;
import p325.C8766;
import p325.InterfaceC8761;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5869 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16039;

    public /* synthetic */ C5869(int i) {
        this.f16039 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f16039;
        C5175 c5175 = C5175.f14739;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                C8766 c8766 = (C8766) obj;
                AbstractC3056.m6668(-3937805782914172327L);
                c8766.getClass();
                C5866.f16023.getClass();
                ArrayList arrayListM11214 = C5868.m11214();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListM11214) {
                    if (C5868.m11213(((InterfaceC8761) obj2).getId())) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c8766.m14436(AbstractC8757.m14433(new C5870((InterfaceC8761) it.next(), 3)));
                }
                break;
            default:
                C8758 c8758 = (C8758) obj;
                c8758.m14434(Boolean.TRUE, AbstractC2442.m4573(-3937791360413992359L, c8758, -3937806062087046567L));
                break;
        }
        return c5175;
    }
}
