package p086;

import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5092;
import p053.AbstractC6560;

/* JADX INFO: renamed from: 飘花落叶言世楪苏子哲兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7062 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5092 f18969;

    public C7062(InterfaceC5092 interfaceC5092) {
        interfaceC5092.getClass();
        this.f18969 = interfaceC5092;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7062) {
            return AbstractC4394.m8917(this.f18969, ((C7062) obj).f18969);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18969.hashCode();
    }

    public final String toString() {
        return AbstractC6560.m12029(this.f18969).getName();
    }
}
