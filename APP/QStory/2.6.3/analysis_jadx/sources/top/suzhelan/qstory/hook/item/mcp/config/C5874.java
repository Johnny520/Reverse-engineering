package top.suzhelan.qstory.hook.item.mcp.config;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C5176;
import p052.InterfaceC6558;
import p287.AbstractC8405;
import p329.AbstractC8765;
import p329.C8766;
import p329.C8774;
import p329.InterfaceC8769;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5874 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16046;

    public /* synthetic */ C5874(int i) {
        this.f16046 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f16046;
        C5176 c5176 = C5176.f14739;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                C8774 c8774 = (C8774) obj;
                AbstractC8405.m13972(2337);
                c8774.getClass();
                C5871.f16030.getClass();
                ArrayList arrayListM11276 = C5873.m11276();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListM11276) {
                    if (C5873.m11275(((InterfaceC8769) obj2).getId())) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c8774.m14470(AbstractC8765.m14467(new C5875((InterfaceC8769) it.next(), 3)));
                }
                break;
            default:
                C8766 c8766 = (C8766) obj;
                AbstractC8405.m13972(2295);
                c8766.getClass();
                c8766.m14468(Boolean.TRUE, AbstractC8405.m13972(2331));
                break;
        }
        return c5176;
    }
}
