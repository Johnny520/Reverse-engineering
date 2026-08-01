package kotlinx.coroutines;

import kotlin.C6008;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6283 extends C6292 implements InterfaceC6271 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f15449;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6283(InterfaceC6284 interfaceC6284) {
        super(true);
        boolean z = true;
        m11139(interfaceC6284);
        InterfaceC6268 interfaceC6268M11151 = m11151();
        C6272 c6272 = interfaceC6268M11151 instanceof C6272 ? (C6272) interfaceC6268M11151 : null;
        if (c6272 == null) {
            z = false;
            break;
        }
        C6292 c6292M11112 = c6272.m11112();
        while (!c6292M11112.mo11115()) {
            InterfaceC6268 interfaceC6268M111512 = c6292M11112.m11151();
            C6272 c62722 = interfaceC6268M111512 instanceof C6272 ? (C6272) interfaceC6268M111512 : null;
            if (c62722 == null) {
                z = false;
                break;
            }
            c6292M11112 = c62722.m11112();
        }
        this.f15449 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final boolean m11113(Throwable th) {
        return m11147(new C6262(th, false));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final boolean m11114() {
        return m11147(C6008.f15084);
    }

    @Override // kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final boolean mo11115() {
        return this.f15449;
    }

    @Override // kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final boolean mo11116() {
        return true;
    }
}
