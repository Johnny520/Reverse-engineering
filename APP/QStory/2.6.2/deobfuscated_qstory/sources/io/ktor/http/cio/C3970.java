package io.ktor.http.cio;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.lazy.C0753;
import androidx.core.view.C2242;
import com.bumptech.glide.AbstractC3056;
import com.materialkolor.dynamiccolor.C3806;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import p253.AbstractC8189;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3970 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2242 f12206;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3970 f12207;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f12208;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f12209;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f12210;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f12211;

    static {
        C3970 c3970 = new C3970(14);
        C3970 c39702 = new C3970(13);
        f12207 = c39702;
        f12206 = AbstractC3056.m6680(AbstractC8189.m13659(new Pair("close", c3970), new Pair("keep-alive", c39702), new Pair("upgrade", new C3970(11))), new C3806(10), new C0753(8));
    }

    public C3970(int i) {
        this((i & 1) == 0, (i & 2) == 0, (i & 4) == 0, EmptyList.INSTANCE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3970.class != obj.getClass()) {
            return false;
        }
        C3970 c3970 = (C3970) obj;
        return this.f12211 == c3970.f12211 && this.f12210 == c3970.f12210 && this.f12209 == c3970.f12209 && AbstractC4394.m8917(this.f12208, c3970.f12208);
    }

    public final int hashCode() {
        return this.f12208.hashCode() + AbstractC0053.m140(AbstractC0053.m140(Boolean.hashCode(this.f12211) * 31, 31, this.f12210), 31, this.f12209);
    }

    public final String toString() {
        if (!this.f12208.isEmpty()) {
            return m8376();
        }
        boolean z = this.f12209;
        boolean z2 = this.f12210;
        boolean z3 = this.f12211;
        return (!z3 || z2 || z) ? (z3 || !z2 || z) ? (!z3 && z2 && z) ? "keep-alive, Upgrade" : m8376() : "keep-alive" : "close";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m8376() throws IOException {
        StringBuilder sb = new StringBuilder();
        List list = this.f12208;
        ArrayList arrayList = new ArrayList(list.size() + 3);
        if (this.f12211) {
            arrayList.add("close");
        }
        if (this.f12210) {
            arrayList.add("keep-alive");
        }
        if (this.f12209) {
            arrayList.add("Upgrade");
        }
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
        AbstractC4343.m8829(arrayList, sb, null, null, null, null, 126);
        return sb.toString();
    }

    public C3970(boolean z, boolean z2, boolean z3, List list) {
        list.getClass();
        this.f12211 = z;
        this.f12210 = z2;
        this.f12209 = z3;
        this.f12208 = list;
    }
}
