package androidx.compose.foundation.gestures;

import kotlin.C5176;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0516 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1515;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1516;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1517;

    public /* synthetic */ C0516(Object obj, int i, Object obj2) {
        this.f1517 = i;
        this.f1515 = obj;
        this.f1516 = obj2;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f1517;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f1516;
        Object obj3 = this.f1515;
        switch (i) {
            case 0:
                break;
            case 1:
                ((C0541) obj3).f1567.m2055((C0535) obj2);
                break;
            default:
                C0487 c0487 = (C0487) obj3;
                ((Long) obj).getClass();
                float f = c0487.f1463;
                c0487.f1463 = 0.0f;
                ((InterfaceC6558) obj2).invoke(Float.valueOf(f));
                break;
        }
        return c5176;
    }
}
