package p384;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9017 {
    public static final C9021 Companion = new C9021();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9018 f25298;

    public /* synthetic */ C9017(int i, C9018 c9018) {
        if (1 == (i & 1)) {
            this.f25298 = c9018;
        } else {
            AbstractC7144.m12420(i, 1, C9037.f25323.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9017) && AbstractC4395.m8907(this.f25298, ((C9017) obj).f25298);
    }

    public final int hashCode() {
        return this.f25298.hashCode();
    }

    public final String toString() {
        return AbstractC8405.m13972(1427) + this.f25298 + ')';
    }

    public C9017(C9018 c9018) {
        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜呜呜");
        this.f25298 = c9018;
    }
}
