package p236;

import androidx.collection.C0265;
import io.ktor.util.InterfaceC4214;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import p052.InterfaceC6554;
import p175.AbstractC7739;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8103 implements InterfaceC8095, InterfaceC4214 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f22387;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f22388;

    public C8103(String str, List list) {
        this.f22388 = str;
        this.f22387 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC4214)) {
            return false;
        }
        InterfaceC4214 interfaceC4214 = (InterfaceC4214) obj;
        if (true != interfaceC4214.mo8352()) {
            return false;
        }
        return mo8353().equals(interfaceC4214.mo8353());
    }

    public final int hashCode() {
        Set setMo8353 = mo8353();
        return setMo8353.hashCode() + (Boolean.hashCode(true) * 961);
    }

    @Override // io.ktor.util.InterfaceC4214
    public final boolean isEmpty() {
        return false;
    }

    @Override // io.ktor.util.InterfaceC4214
    public final Set names() {
        return AbstractC7739.m13055(this.f22388);
    }

    public final String toString() {
        return "Parameters " + mo8353();
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8352() {
        return true;
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo8353() {
        return AbstractC7739.m13055(new C0265(this));
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8354(String str) {
        str.getClass();
        if (this.f22388.equalsIgnoreCase(str)) {
            return this.f22387;
        }
        return null;
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo8355(InterfaceC6554 interfaceC6554) {
        interfaceC6554.invoke(this.f22388, this.f22387);
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8356(String str) {
        if ("sessionId".equalsIgnoreCase(this.f22388)) {
            return (String) AbstractC4344.m8815(this.f22387);
        }
        return null;
    }
}
