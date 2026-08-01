package io.ktor.http.cio;

import androidx.compose.foundation.C1030;
import androidx.compose.runtime.snapshots.C1281;
import androidx.core.view.C2242;
import androidx.window.area.AbstractC2567;
import com.materialkolor.dynamiccolor.C3807;
import io.ktor.http.cio.internals.AbstractC3950;
import io.ktor.http.cio.internals.C3953;
import io.ktor.http.cio.internals.C3954;
import io.ktor.util.AbstractC4217;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.C5115;
import p048.C6517;
import p048.C6519;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p236.InterfaceC8112;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3961 implements InterfaceC8112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5184 f12191;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3974 f12192;

    public C3961(C3974 c3974) {
        c3974.getClass();
        this.f12192 = c3974;
        this.f12191 = AbstractC5187.m10215(LazyThreadSafetyMode.NONE, new C1030(this, 7));
    }

    @Override // io.ktor.util.InterfaceC4214
    public final Set names() {
        return (Set) this.f12191.getValue();
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo8352() {
        return true;
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Set mo8353() {
        C6519 c6519M5067 = AbstractC2567.m5067(0, this.f12192.f12221);
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(c6519M5067, 10));
        Iterator it = c6519M5067.iterator();
        while (true) {
            C6517 c6517 = (C6517) it;
            if (!c6517.f17823) {
                return AbstractC4344.m8788(arrayList);
            }
            arrayList.add(new C3962(this, c6517.nextInt()));
        }
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List mo8354(String str) {
        str.getClass();
        final C3974 c3974 = this.f12192;
        c3974.getClass();
        C2242 c2242 = AbstractC3950.f12163;
        final int i = 0;
        final int i2 = 1;
        List listM10110 = AbstractC5122.m10110(AbstractC5122.m10111(AbstractC5122.m10111(new C5115(AbstractC5122.m10111(AbstractC5122.m10115(0, new InterfaceC6558() { // from class: io.ktor.http.cio.飘花落叶言子楪苏世兰哲
            @Override // p052.InterfaceC6558
            public final Object invoke(Object obj) {
                int i3 = i;
                C3974 c39742 = c3974;
                int iIntValue = ((Integer) obj).intValue();
                switch (i3) {
                    case 0:
                        int i4 = iIntValue + 1;
                        if (i4 >= c39742.f12221) {
                            return null;
                        }
                        return Integer.valueOf(i4);
                    default:
                        C3953 c3953 = c39742.f12222;
                        int[] iArr = c39742.f12220;
                        return c3953.subSequence(iArr[iIntValue + 4], iArr[iIntValue + 5]);
                }
            }
        }), new C3807(11)), true, new C1281(c3974, AbstractC3950.m8332(str, 0, str.length()))), new InterfaceC6558() { // from class: io.ktor.http.cio.飘花落叶言子楪苏世兰哲
            @Override // p052.InterfaceC6558
            public final Object invoke(Object obj) {
                int i3 = i2;
                C3974 c39742 = c3974;
                int iIntValue = ((Integer) obj).intValue();
                switch (i3) {
                    case 0:
                        int i4 = iIntValue + 1;
                        if (i4 >= c39742.f12221) {
                            return null;
                        }
                        return Integer.valueOf(i4);
                    default:
                        C3953 c3953 = c39742.f12222;
                        int[] iArr = c39742.f12220;
                        return c3953.subSequence(iArr[iIntValue + 4], iArr[iIntValue + 5]);
                }
            }
        }), new C3807(9)));
        if (listM10110.isEmpty()) {
            return null;
        }
        return listM10110;
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo8355(InterfaceC6554 interfaceC6554) {
        AbstractC4217.m8634(this, interfaceC6554);
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String mo8356(String str) {
        C3954 c3954M8380 = this.f12192.m8380(str);
        if (c3954M8380 != null) {
            return c3954M8380.toString();
        }
        return null;
    }
}
