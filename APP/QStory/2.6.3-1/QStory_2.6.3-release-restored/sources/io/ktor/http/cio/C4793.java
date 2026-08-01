package io.ktor.http.cio;

import androidx.compose.foundation.C1868;
import androidx.compose.runtime.snapshots.C2116;
import androidx.core.view.C3075;
import androidx.window.area.AbstractC3400;
import com.materialkolor.dynamiccolor.C4639;
import io.ktor.http.cio.internals.AbstractC4782;
import io.ktor.http.cio.internals.C4785;
import io.ktor.http.cio.internals.C4786;
import io.ktor.util.AbstractC5049;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.C5947;
import p064.C7346;
import p064.C7348;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p252.InterfaceC8941;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4793 implements InterfaceC8941 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6016 f12536;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4806 f12537;

    public C4793(C4806 c4806) {
        c4806.getClass();
        this.f12537 = c4806;
        this.f12536 = AbstractC6019.m10774(LazyThreadSafetyMode.NONE, new C1868(this, 7));
    }

    @Override // io.ktor.util.InterfaceC5046
    public final Set names() {
        return (Set) this.f12536.getValue();
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo8911() {
        return true;
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Set mo8912() {
        C7348 c7348M5627 = AbstractC3400.m5627(0, this.f12537.f12566);
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(c7348M5627, 10));
        Iterator it = c7348M5627.iterator();
        while (true) {
            C7346 c7346 = (C7346) it;
            if (!c7346.f18168) {
                return AbstractC5176.m9347(arrayList);
            }
            arrayList.add(new C4794(this, c7346.nextInt()));
        }
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List mo8913(String str) {
        str.getClass();
        final C4806 c4806 = this.f12537;
        c4806.getClass();
        C3075 c3075 = AbstractC4782.f12508;
        final int i = 0;
        final int i2 = 1;
        List listM10669 = AbstractC5954.m10669(AbstractC5954.m10670(AbstractC5954.m10670(new C5947(AbstractC5954.m10670(AbstractC5954.m10674(0, new InterfaceC7387() { // from class: io.ktor.http.cio.飘花落叶言子楪苏世兰哲
            @Override // p068.InterfaceC7387
            public final Object invoke(Object obj) {
                int i3 = i;
                C4806 c48062 = c4806;
                int iIntValue = ((Integer) obj).intValue();
                switch (i3) {
                    case 0:
                        int i4 = iIntValue + 1;
                        if (i4 >= c48062.f12566) {
                            return null;
                        }
                        return Integer.valueOf(i4);
                    default:
                        C4785 c4785 = c48062.f12567;
                        int[] iArr = c48062.f12565;
                        return c4785.subSequence(iArr[iIntValue + 4], iArr[iIntValue + 5]);
                }
            }
        }), new C4639(11)), true, new C2116(c4806, AbstractC4782.m8891(str, 0, str.length()))), new InterfaceC7387() { // from class: io.ktor.http.cio.飘花落叶言子楪苏世兰哲
            @Override // p068.InterfaceC7387
            public final Object invoke(Object obj) {
                int i3 = i2;
                C4806 c48062 = c4806;
                int iIntValue = ((Integer) obj).intValue();
                switch (i3) {
                    case 0:
                        int i4 = iIntValue + 1;
                        if (i4 >= c48062.f12566) {
                            return null;
                        }
                        return Integer.valueOf(i4);
                    default:
                        C4785 c4785 = c48062.f12567;
                        int[] iArr = c48062.f12565;
                        return c4785.subSequence(iArr[iIntValue + 4], iArr[iIntValue + 5]);
                }
            }
        }), new C4639(9)));
        if (listM10669.isEmpty()) {
            return null;
        }
        return listM10669;
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo8914(InterfaceC7383 interfaceC7383) {
        AbstractC5049.m9193(this, interfaceC7383);
    }

    @Override // io.ktor.util.InterfaceC5046
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String mo8915(String str) {
        C4786 c4786M8939 = this.f12537.m8939(str);
        if (c4786M8939 != null) {
            return c4786M8939.toString();
        }
        return null;
    }
}
