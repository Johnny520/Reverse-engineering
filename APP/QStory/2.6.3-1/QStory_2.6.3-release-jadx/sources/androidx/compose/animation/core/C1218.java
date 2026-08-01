package androidx.compose.animation.core;

import androidx.activity.compose.C0855;
import androidx.compose.runtime.AbstractC2182;
import kotlin.C6008;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1218 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1614;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1615;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1616;

    public /* synthetic */ C1218(C1210 c1210, Object obj, int i) {
        this.f1616 = i;
        this.f1615 = c1210;
        this.f1614 = obj;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f1616;
        int i2 = 1;
        Object obj2 = this.f1614;
        Object obj3 = this.f1615;
        switch (i) {
            case 0:
                AbstractC6231.m11036((InterfaceC6233) obj2, null, CoroutineStart.UNDISPATCHED, new Transition$animateTo$1$1$1((C1210) obj3, null), 1);
                return new C1214();
            case 1:
                C1161 c1161 = (C1161) obj2;
                C1162 c1162 = (C1162) obj3;
                c1161.f1405.m2607(c1162);
                ((AbstractC2182) c1161.f1404).setValue(Boolean.TRUE);
                return new C0855(c1161, i2, c1162);
            case 2:
                C1191 c1191 = (C1191) obj;
                ((InterfaceC7383) obj2).invoke(((AbstractC2182) c1191.f1528).getValue(), ((C1203) obj3).f1573.invoke(c1191.f1527));
                return C6008.f15084;
            case 3:
                C1210 c1210 = (C1210) obj3;
                C1210 c12102 = (C1210) obj2;
                c1210.f1594.add(c12102);
                return new C0855(c1210, 2, c12102);
            case 4:
                return new C0855((C1210) obj3, 3, (C1200) obj2);
            default:
                C1210 c12103 = (C1210) obj3;
                C1197 c1197 = (C1197) obj2;
                c12103.f1593.add(c1197);
                return new C0855(c12103, 4, c1197);
        }
    }

    public /* synthetic */ C1218(Object obj, int i, Object obj2) {
        this.f1616 = i;
        this.f1614 = obj;
        this.f1615 = obj2;
    }
}
