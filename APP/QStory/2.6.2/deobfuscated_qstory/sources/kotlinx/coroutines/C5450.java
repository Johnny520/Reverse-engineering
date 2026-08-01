package kotlinx.coroutines;

import kotlin.C5175;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5450 extends C5459 implements InterfaceC5438 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f15104;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5450(InterfaceC5451 interfaceC5451) {
        super(true);
        boolean z = true;
        m10577(interfaceC5451);
        InterfaceC5435 interfaceC5435M10588 = m10588();
        C5439 c5439 = interfaceC5435M10588 instanceof C5439 ? (C5439) interfaceC5435M10588 : null;
        if (c5439 == null) {
            z = false;
            break;
        }
        C5459 c5459M10549 = c5439.m10549();
        while (!c5459M10549.mo10552()) {
            InterfaceC5435 interfaceC5435M105882 = c5459M10549.m10588();
            C5439 c54392 = interfaceC5435M105882 instanceof C5439 ? (C5439) interfaceC5435M105882 : null;
            if (c54392 == null) {
                z = false;
                break;
            }
            c5459M10549 = c54392.m10549();
        }
        this.f15104 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final boolean m10550(Throwable th) {
        return m10585(new C5429(th, false));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final boolean m10551() {
        return m10585(C5175.f14739);
    }

    @Override // kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final boolean mo10552() {
        return this.f15104;
    }

    @Override // kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final boolean mo10553() {
        return true;
    }
}
