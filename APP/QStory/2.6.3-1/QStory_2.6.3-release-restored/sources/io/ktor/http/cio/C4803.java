package io.ktor.http.cio;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.lazy.C1594;
import androidx.core.view.C3075;
import com.materialkolor.dynamiccolor.C4639;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import p050.AbstractC7176;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3075 f12555;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4803 f12556;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f12557;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f12558;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f12559;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f12560;

    static {
        C4803 c4803 = new C4803(14);
        C4803 c48032 = new C4803(13);
        f12556 = c48032;
        f12555 = AbstractC1298.m1719(AbstractC7176.m12490(new Pair("close", c4803), new Pair("keep-alive", c48032), new Pair("upgrade", new C4803(11))), new C4639(10), new C1594(8));
    }

    public C4803(int i) {
        this((i & 1) == 0, (i & 2) == 0, (i & 4) == 0, EmptyList.INSTANCE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4803.class != obj.getClass()) {
            return false;
        }
        C4803 c4803 = (C4803) obj;
        return this.f12560 == c4803.f12560 && this.f12559 == c4803.f12559 && this.f12558 == c4803.f12558 && AbstractC5227.m9466(this.f12557, c4803.f12557);
    }

    public final int hashCode() {
        return this.f12557.hashCode() + AbstractC0900.m701(AbstractC0900.m701(Boolean.hashCode(this.f12560) * 31, 31, this.f12559), 31, this.f12558);
    }

    public final String toString() {
        if (!this.f12557.isEmpty()) {
            return m8925();
        }
        boolean z = this.f12558;
        boolean z2 = this.f12559;
        boolean z3 = this.f12560;
        return (!z3 || z2 || z) ? (z3 || !z2 || z) ? (!z3 && z2 && z) ? "keep-alive, Upgrade" : m8925() : "keep-alive" : "close";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String m8925() throws IOException {
        StringBuilder sb = new StringBuilder();
        List list = this.f12557;
        ArrayList arrayList = new ArrayList(list.size() + 3);
        if (this.f12560) {
            arrayList.add("close");
        }
        if (this.f12559) {
            arrayList.add("keep-alive");
        }
        if (this.f12558) {
            arrayList.add("Upgrade");
        }
        if (!list.isEmpty()) {
            arrayList.addAll(list);
        }
        AbstractC5176.m9368(arrayList, sb, null, null, null, null, 126);
        return sb.toString();
    }

    public C4803(boolean z, boolean z2, boolean z3, List list) {
        list.getClass();
        this.f12560 = z;
        this.f12559 = z2;
        this.f12558 = z3;
        this.f12557 = list;
    }
}
