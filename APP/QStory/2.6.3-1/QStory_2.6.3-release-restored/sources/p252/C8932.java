package p252;

import androidx.collection.C1112;
import io.ktor.util.InterfaceC5046;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import p068.InterfaceC7383;
import p191.AbstractC8568;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8932 implements InterfaceC8924, InterfaceC5046 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f22732;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f22733;

    public C8932(String str, List list) {
        this.f22733 = str;
        this.f22732 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC5046)) {
            return false;
        }
        InterfaceC5046 interfaceC5046 = (InterfaceC5046) obj;
        if (true != interfaceC5046.mo8911()) {
            return false;
        }
        return mo8912().equals(interfaceC5046.mo8912());
    }

    public final int hashCode() {
        Set setMo8912 = mo8912();
        return setMo8912.hashCode() + (Boolean.hashCode(true) * 961);
    }

    @Override // io.ktor.util.InterfaceC5046
    public final boolean isEmpty() {
        return false;
    }

    @Override // io.ktor.util.InterfaceC5046
    public final Set names() {
        return AbstractC8568.m13614(this.f22733);
    }

    public final String toString() {
        return "Parameters " + mo8912();
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8911() {
        return true;
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo8912() {
        return AbstractC8568.m13614(new C1112(this));
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final List mo8913(String str) {
        str.getClass();
        if (this.f22733.equalsIgnoreCase(str)) {
            return this.f22732;
        }
        return null;
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo8914(InterfaceC7383 interfaceC7383) {
        interfaceC7383.invoke(this.f22733, this.f22732);
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final String mo8915(String str) {
        if ("sessionId".equalsIgnoreCase(this.f22733)) {
            return (String) AbstractC5176.m9374(this.f22732);
        }
        return null;
    }
}
