package p087;

import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import p053.AbstractC6560;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7073 implements InterfaceC5086 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5086 f18985;

    public C7073(InterfaceC5086 interfaceC5086) {
        interfaceC5086.getClass();
        this.f18985 = interfaceC5086;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C7073 c7073 = obj instanceof C7073 ? (C7073) obj : null;
        InterfaceC5086 interfaceC5086 = c7073 != null ? c7073.f18985 : null;
        InterfaceC5086 interfaceC50862 = this.f18985;
        if (!AbstractC4394.m8917(interfaceC50862, interfaceC5086)) {
            return false;
        }
        InterfaceC5091 interfaceC5091Mo8909 = interfaceC50862.mo8909();
        if (interfaceC5091Mo8909 instanceof InterfaceC5092) {
            InterfaceC5086 interfaceC50863 = obj instanceof InterfaceC5086 ? (InterfaceC5086) obj : null;
            InterfaceC5091 interfaceC5091Mo89092 = interfaceC50863 != null ? interfaceC50863.mo8909() : null;
            if (interfaceC5091Mo89092 != null && (interfaceC5091Mo89092 instanceof InterfaceC5092)) {
                return AbstractC6560.m12029((InterfaceC5092) interfaceC5091Mo8909).equals(AbstractC6560.m12029((InterfaceC5092) interfaceC5091Mo89092));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        return this.f18985.getAnnotations();
    }

    public final int hashCode() {
        return this.f18985.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f18985;
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8906() {
        return this.f18985.mo8906();
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo8908() {
        return this.f18985.mo8908();
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5091 mo8909() {
        return this.f18985.mo8909();
    }
}
