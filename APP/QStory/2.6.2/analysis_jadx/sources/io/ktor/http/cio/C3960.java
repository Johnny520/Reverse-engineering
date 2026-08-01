package io.ktor.http.cio;

import androidx.compose.foundation.C1030;
import androidx.compose.runtime.snapshots.C1281;
import androidx.core.view.C2242;
import com.materialkolor.dynamiccolor.C3806;
import io.ktor.http.cio.internals.AbstractC3949;
import io.ktor.http.cio.internals.C3952;
import io.ktor.http.cio.internals.C3953;
import io.ktor.util.AbstractC4216;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.C5114;
import p000.AbstractC6087;
import p048.C6516;
import p048.C6518;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p236.InterfaceC8111;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3960 implements InterfaceC8111 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5183 f12187;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3973 f12188;

    public C3960(C3973 c3973) {
        c3973.getClass();
        this.f12188 = c3973;
        this.f12187 = AbstractC5186.m10211(LazyThreadSafetyMode.NONE, new C1030(this, 7));
    }

    @Override // io.ktor.util.InterfaceC4213
    public final Set names() {
        return (Set) this.f12187.getValue();
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo8362() {
        return true;
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Set mo8363() {
        C6518 c6518M11422 = AbstractC6087.m11422(0, this.f12188.f12217);
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(c6518M11422, 10));
        Iterator it = c6518M11422.iterator();
        while (true) {
            C6516 c6516 = (C6516) it;
            if (!c6516.f17827) {
                return AbstractC4343.m8800(arrayList);
            }
            arrayList.add(new C3961(this, c6516.nextInt()));
        }
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List mo8364(String str) {
        str.getClass();
        final C3973 c3973 = this.f12188;
        c3973.getClass();
        C2242 c2242 = AbstractC3949.f12159;
        final int i = 0;
        final int i2 = 1;
        List listM10106 = AbstractC5121.m10106(AbstractC5121.m10111(AbstractC5121.m10111(new C5114(AbstractC5121.m10111(AbstractC5121.m10112(0, new InterfaceC6557() { // from class: io.ktor.http.cio.飘花落叶言子楪苏世兰哲
            @Override // p052.InterfaceC6557
            public final Object invoke(Object obj) {
                int i3 = i;
                C3973 c39732 = c3973;
                int iIntValue = ((Integer) obj).intValue();
                switch (i3) {
                    case 0:
                        int i4 = iIntValue + 1;
                        if (i4 >= c39732.f12217) {
                            return null;
                        }
                        return Integer.valueOf(i4);
                    default:
                        C3952 c3952 = c39732.f12218;
                        int[] iArr = c39732.f12216;
                        return c3952.subSequence(iArr[iIntValue + 4], iArr[iIntValue + 5]);
                }
            }
        }), new C3806(11)), true, new C1281(c3973, AbstractC3949.m8342(str, 0, str.length()))), new InterfaceC6557() { // from class: io.ktor.http.cio.飘花落叶言子楪苏世兰哲
            @Override // p052.InterfaceC6557
            public final Object invoke(Object obj) {
                int i3 = i2;
                C3973 c39732 = c3973;
                int iIntValue = ((Integer) obj).intValue();
                switch (i3) {
                    case 0:
                        int i4 = iIntValue + 1;
                        if (i4 >= c39732.f12217) {
                            return null;
                        }
                        return Integer.valueOf(i4);
                    default:
                        C3952 c3952 = c39732.f12218;
                        int[] iArr = c39732.f12216;
                        return c3952.subSequence(iArr[iIntValue + 4], iArr[iIntValue + 5]);
                }
            }
        }), new C3806(9)));
        if (listM10106.isEmpty()) {
            return null;
        }
        return listM10106;
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo8365(InterfaceC6553 interfaceC6553) {
        AbstractC4216.m8644(this, interfaceC6553);
    }

    @Override // io.ktor.util.InterfaceC4213
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String mo8366(String str) {
        C3953 c3953M8390 = this.f12188.m8390(str);
        if (c3953M8390 != null) {
            return c3953M8390.toString();
        }
        return null;
    }
}
