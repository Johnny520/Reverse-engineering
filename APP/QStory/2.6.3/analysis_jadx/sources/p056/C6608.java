package p056;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7144;
import p089.InterfaceC7181;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言世楪苏哲子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6608 implements InterfaceC6813, InterfaceC6840 {
    public static final C6609 Companion = new C6609();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6816 f17982;

    public /* synthetic */ C6608(int i, InterfaceC6816 interfaceC6816) {
        if (1 == (i & 1)) {
            this.f17982 = interfaceC6816;
        } else {
            AbstractC7144.m12420(i, 1, C6610.f17983.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6608) && AbstractC4395.m8907(this.f17982, ((C6608) obj).f17982);
    }

    @Override // p056.InterfaceC6840
    public final InterfaceC6816 getMethod() {
        return this.f17982;
    }

    public final int hashCode() {
        return this.f17982.hashCode();
    }

    public final String toString() {
        return "UnknownMethodRequestOrNotification(method=" + this.f17982 + ')';
    }
}
