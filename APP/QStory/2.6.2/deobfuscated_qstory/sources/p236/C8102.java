package p236;

import androidx.collection.C0265;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import io.ktor.util.InterfaceC4213;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8102 implements InterfaceC8094, InterfaceC4213 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f22389;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f22390;

    public C8102(String str, List list) {
        this.f22390 = str;
        this.f22389 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC4213)) {
            return false;
        }
        InterfaceC4213 interfaceC4213 = (InterfaceC4213) obj;
        if (true != interfaceC4213.mo8362()) {
            return false;
        }
        return mo8363().equals(interfaceC4213.mo8363());
    }

    public final int hashCode() {
        Set setMo8363 = mo8363();
        return setMo8363.hashCode() + (Boolean.hashCode(true) * 961);
    }

    @Override // io.ktor.util.InterfaceC4213
    public final boolean isEmpty() {
        return false;
    }

    @Override // io.ktor.util.InterfaceC4213
    public final Set names() {
        return AbstractC0455.m1140(this.f22390);
    }

    public final String toString() {
        return "Parameters " + mo8363();
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8362() {
        return true;
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo8363() {
        return AbstractC0455.m1140(new C0265(this));
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8364(String str) {
        str.getClass();
        if (this.f22390.equalsIgnoreCase(str)) {
            return this.f22389;
        }
        return null;
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo8365(InterfaceC6553 interfaceC6553) {
        interfaceC6553.invoke(this.f22390, this.f22389);
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8366(String str) {
        if ("sessionId".equalsIgnoreCase(this.f22390)) {
            return (String) AbstractC4343.m8830(this.f22389);
        }
        return null;
    }
}
