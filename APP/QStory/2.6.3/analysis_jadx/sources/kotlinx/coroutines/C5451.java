package kotlinx.coroutines;

import kotlin.C5176;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5451 extends C5460 implements InterfaceC5439 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f15104;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5451(InterfaceC5452 interfaceC5452) {
        super(true);
        boolean z = true;
        m10580(interfaceC5452);
        InterfaceC5436 interfaceC5436M10592 = m10592();
        C5440 c5440 = interfaceC5436M10592 instanceof C5440 ? (C5440) interfaceC5436M10592 : null;
        if (c5440 == null) {
            z = false;
            break;
        }
        C5460 c5460M10553 = c5440.m10553();
        while (!c5460M10553.mo10556()) {
            InterfaceC5436 interfaceC5436M105922 = c5460M10553.m10592();
            C5440 c54402 = interfaceC5436M105922 instanceof C5440 ? (C5440) interfaceC5436M105922 : null;
            if (c54402 == null) {
                z = false;
                break;
            }
            c5460M10553 = c54402.m10553();
        }
        this.f15104 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final boolean m10554(Throwable th) {
        return m10588(new C5430(th, false));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final boolean m10555() {
        return m10588(C5176.f14739);
    }

    @Override // kotlinx.coroutines.C5460
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final boolean mo10556() {
        return this.f15104;
    }

    @Override // kotlinx.coroutines.C5460
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final boolean mo10557() {
        return true;
    }
}
