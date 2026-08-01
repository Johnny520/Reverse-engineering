package androidx.compose.foundation.gestures;

import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1351 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1855;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1856;

    public /* synthetic */ C1351(Object obj, int i) {
        this.f1856 = i;
        this.f1855 = obj;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f1856;
        Object obj2 = this.f1855;
        switch (i) {
            case 0:
                return Scrollable2DNode$drag$2$1.invokeSuspend$lambda$0((InterfaceC1398) obj2, (C1321) obj);
            case 1:
                ((InterfaceC7372) obj2).invoke();
                return C6008.f15084;
            case 2:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((InterfaceC7387) ((InterfaceC2230) obj2).getValue()).invoke(f)).floatValue());
            default:
                C1343 c1343 = (C1343) obj2;
                return new C8158(c1343.m1825(c1343.f1841, ((C8158) obj).f19886, c1343.f1844));
        }
    }
}
