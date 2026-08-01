package androidx.compose.animation.core;

import androidx.activity.compose.C0008;
import androidx.compose.runtime.AbstractC1347;
import kotlin.C5176;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0372 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1269;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1270;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1271;

    public /* synthetic */ C0372(C0364 c0364, Object obj, int i) {
        this.f1271 = i;
        this.f1270 = c0364;
        this.f1269 = obj;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f1271;
        int i2 = 1;
        Object obj2 = this.f1269;
        Object obj3 = this.f1270;
        switch (i) {
            case 0:
                AbstractC5399.m10477((InterfaceC5401) obj2, null, CoroutineStart.UNDISPATCHED, new Transition$animateTo$1$1$1((C0364) obj3, null), 1);
                return new C0368();
            case 1:
                C0315 c0315 = (C0315) obj2;
                C0316 c0316 = (C0316) obj3;
                c0315.f1060.m2047(c0316);
                ((AbstractC1347) c0315.f1059).setValue(Boolean.TRUE);
                return new C0008(c0315, i2, c0316);
            case 2:
                C0345 c0345 = (C0345) obj;
                ((InterfaceC6554) obj2).invoke(((AbstractC1347) c0345.f1183).getValue(), ((C0357) obj3).f1228.invoke(c0345.f1182));
                return C5176.f14739;
            case 3:
                C0364 c0364 = (C0364) obj3;
                C0364 c03642 = (C0364) obj2;
                c0364.f1249.add(c03642);
                return new C0008(c0364, 2, c03642);
            case 4:
                return new C0008((C0364) obj3, 3, (C0354) obj2);
            default:
                C0364 c03643 = (C0364) obj3;
                C0351 c0351 = (C0351) obj2;
                c03643.f1248.add(c0351);
                return new C0008(c03643, 4, c0351);
        }
    }

    public /* synthetic */ C0372(Object obj, int i, Object obj2) {
        this.f1271 = i;
        this.f1269 = obj;
        this.f1270 = obj2;
    }
}
