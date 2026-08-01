package top.suzhelan.qstory.hook.item.mcp.config;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C6008;
import p068.InterfaceC7387;
import p303.AbstractC9234;
import p345.AbstractC9594;
import p345.C9595;
import p345.C9603;
import p345.InterfaceC9598;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6704 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16391;

    public /* synthetic */ C6704(int i) {
        this.f16391 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f16391;
        C6008 c6008 = C6008.f15084;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                C9603 c9603 = (C9603) obj;
                AbstractC9234.m14531(2337);
                c9603.getClass();
                C6701.f16375.getClass();
                ArrayList arrayListM11835 = C6703.m11835();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListM11835) {
                    if (C6703.m11834(((InterfaceC9598) obj2).getId())) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c9603.m15029(AbstractC9594.m15026(new C6705((InterfaceC9598) it.next(), 3)));
                }
                break;
            default:
                C9595 c9595 = (C9595) obj;
                AbstractC9234.m14531(2295);
                c9595.getClass();
                c9595.m15027(Boolean.TRUE, AbstractC9234.m14531(2331));
                break;
        }
        return c6008;
    }
}
