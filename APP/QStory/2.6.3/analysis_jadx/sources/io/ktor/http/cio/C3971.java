package io.ktor.http.cio;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.lazy.C0753;
import androidx.core.view.C2242;
import com.materialkolor.dynamiccolor.C3807;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import p034.AbstractC6347;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3971 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2242 f12210;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3971 f12211;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f12212;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f12213;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f12214;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f12215;

    static {
        C3971 c3971 = new C3971(14);
        C3971 c39712 = new C3971(13);
        f12211 = c39712;
        f12210 = AbstractC0455.m1159(AbstractC6347.m11931(new Pair("close", c3971), new Pair("keep-alive", c39712), new Pair("upgrade", new C3971(11))), new C3807(10), new C0753(8));
    }

    public C3971(int i) {
        this((i & 1) == 0, (i & 2) == 0, (i & 4) == 0, EmptyList.INSTANCE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3971.class != obj.getClass()) {
            return false;
        }
        C3971 c3971 = (C3971) obj;
        return this.f12215 == c3971.f12215 && this.f12214 == c3971.f12214 && this.f12213 == c3971.f12213 && AbstractC4395.m8907(this.f12212, c3971.f12212);
    }

    public final int hashCode() {
        return this.f12212.hashCode() + AbstractC0053.m141(AbstractC0053.m141(Boolean.hashCode(this.f12215) * 31, 31, this.f12214), 31, this.f12213);
    }

    public final String toString() {
        if (!this.f12212.isEmpty()) {
            return m8366();
        }
        boolean z = this.f12213;
        boolean z2 = this.f12214;
        boolean z3 = this.f12215;
        return (!z3 || z2 || z) ? (z3 || !z2 || z) ? (!z3 && z2 && z) ? "keep-alive, Upgrade" : m8366() : "keep-alive" : "close";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m8366() throws IOException {
        StringBuilder sb = new StringBuilder();
        List list = this.f12212;
        ArrayList arrayList = new ArrayList(list.size() + 3);
        if (this.f12215) {
            arrayList.add("close");
        }
        if (this.f12214) {
            arrayList.add("keep-alive");
        }
        if (this.f12213) {
            arrayList.add("Upgrade");
        }
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
        AbstractC4344.m8809(arrayList, sb, null, null, null, null, 126);
        return sb.toString();
    }

    public C3971(boolean z, boolean z2, boolean z3, List list) {
        list.getClass();
        this.f12215 = z;
        this.f12214 = z2;
        this.f12213 = z3;
        this.f12212 = list;
    }
}
