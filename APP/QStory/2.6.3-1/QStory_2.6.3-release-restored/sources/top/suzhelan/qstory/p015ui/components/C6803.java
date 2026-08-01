package top.suzhelan.qstory.p015ui.components;

import androidx.compose.foundation.layout.AbstractC1460;
import androidx.compose.foundation.layout.AbstractC1469;
import androidx.compose.foundation.lazy.C1586;
import androidx.compose.p001ui.C2958;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2233;
import io.ktor.util.C5043;
import java.util.List;
import kotlin.C6008;
import kotlin.reflect.jvm.internal.C5860;
import p068.InterfaceC7372;
import p068.InterfaceC7381;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p366.C9684;
import p366.C9685;
import p366.C9686;
import p366.C9687;
import p366.InterfaceC9683;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6803 implements InterfaceC7381 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f16544;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f16545;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7383 f16546;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2233 f16547;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ List f16548;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7387 f16549;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ List f16550;

    public C6803(List list, List list2, InterfaceC7387 interfaceC7387, InterfaceC7383 interfaceC7383, InterfaceC7383 interfaceC73832, InterfaceC7383 interfaceC73833, InterfaceC2233 interfaceC2233) {
        this.f16550 = list;
        this.f16548 = list2;
        this.f16549 = interfaceC7387;
        this.f16545 = interfaceC7383;
        this.f16544 = interfaceC73832;
        this.f16546 = interfaceC73833;
        this.f16547 = interfaceC2233;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    @Override // p068.InterfaceC7381
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        float f;
        boolean z;
        C1586 c1586 = (C1586) obj;
        int iIntValue = ((Number) obj2).intValue();
        InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        "CN(it)214@10668L26:LazyDsl.kt#428nma";
        if ((iIntValue2 & 6) == 0) {
            i = (((C2159) interfaceC2208).m2920(c1586) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((C2159) interfaceC2208).m2922(iIntValue) ? 32 : 16;
        }
        C2159 c2159 = (C2159) interfaceC2208;
        if (c2159.m2903(i & 1, (i & 147) != 146)) {
            int i2 = i & 126;
            InterfaceC9683 interfaceC9683 = (InterfaceC9683) this.f16550.get(iIntValue);
            c2159.m2952(-1666076234);
            "CN(index,entry):SettingListContent.kt#ndgvs9";
            "items";
            List list = this.f16548;
            list.getClass();
            if (iIntValue == 0) {
                f = 16.0f;
                z = interfaceC9683 instanceof C9685;
                C2958 c2958 = C2958.f6621;
                InterfaceC2233 interfaceC2233 = this.f16547;
                if (z) {
                    c2159.m2952(-330834298);
                    "122@5077L469";
                    AbstractC6799.m11902((C9685) interfaceC9683, this.f16548, iIntValue, iIntValue == ((AbstractC2181) interfaceC2233).m2992(), AbstractC1469.m1995(AbstractC1460.m1944(c2958, 1.0f), 16.0f, f, 16.0f, 8), c2159, (i2 << 3) & 896);
                    c2159 = c2159;
                    c2159.m2937(false);
                } else if (interfaceC9683 instanceof C9687) {
                    c2159.m2952(-330817590);
                    "148@6084L32,136@5597L537";
                    C9687 c9687 = (C9687) interfaceC9683;
                    boolean z2 = iIntValue == ((AbstractC2181) interfaceC2233).m2992();
                    InterfaceC2962 interfaceC2962M1995 = AbstractC1469.m1995(AbstractC1460.m1944(c2958, 1.0f), 16.0f, f, 16.0f, 8);
                    "CC(remember):SettingListContent.kt#9igjgp";
                    InterfaceC7387 interfaceC7387 = this.f16549;
                    boolean zM2938 = c2159.m2938(interfaceC9683) | c2159.m2920(interfaceC7387);
                    Object objM2905 = c2159.m2905();
                    if (zM2938 || objM2905 == C2204.f4319) {
                        objM2905 = new C5860(interfaceC7387, 14, c9687);
                        c2159.m2946(objM2905);
                    }
                    AbstractC6799.m11904(c9687, this.f16548, iIntValue, z2, interfaceC2962M1995, (InterfaceC7372) objM2905, c2159, (i2 << 3) & 896);
                    c2159.m2937(false);
                } else if (interfaceC9683 instanceof C9686) {
                    c2159.m2952(-330798775);
                    "151@6184L568";
                    AbstractC6799.m11903((C9686) interfaceC9683, this.f16548, iIntValue, iIntValue == ((AbstractC2181) interfaceC2233).m2992(), AbstractC1469.m1995(AbstractC1460.m1944(c2958, 1.0f), 16.0f, f, 16.0f, 8), this.f16545, this.f16544, c2159, (i2 << 3) & 896);
                    c2159 = c2159;
                    c2159.m2937(false);
                } else {
                    if (!(interfaceC9683 instanceof C9684)) {
                        c2159.m2952(-330834378);
                        c2159.m2937(false);
                        C5043.m9170();
                        return null;
                    }
                    c2159.m2952(-330779150);
                    "167@6799L513";
                    AbstractC6799.m11909((C9684) interfaceC9683, this.f16548, iIntValue, iIntValue == ((AbstractC2181) interfaceC2233).m2992(), AbstractC1469.m1995(AbstractC1460.m1944(c2958, 1.0f), 16.0f, f, 16.0f, 8), this.f16546, c2159, (i2 << 3) & 896);
                    c2159.m2937(false);
                }
                c2159.m2937(false);
            } else {
                InterfaceC9683 interfaceC96832 = (InterfaceC9683) list.get(iIntValue);
                InterfaceC9683 interfaceC96833 = (InterfaceC9683) list.get(iIntValue - 1);
                if (!(interfaceC96832 instanceof C9685) && (!(interfaceC96832 instanceof C9684) || (interfaceC96833 instanceof C9684))) {
                    if ((interfaceC96832 instanceof C9686) && (interfaceC96833 instanceof C9686)) {
                        String groupPath = ((C9686) interfaceC96833).f25319.getGroupPath();
                        String groupPath2 = ((C9686) interfaceC96832).f25319.getGroupPath();
                        if (groupPath == null || groupPath.equals(groupPath2)) {
                        }
                        z = interfaceC9683 instanceof C9685;
                        C2958 c29582 = C2958.f6621;
                        InterfaceC2233 interfaceC22332 = this.f16547;
                        if (z) {
                        }
                        c2159.m2937(false);
                    }
                    f = 0.0f;
                    z = interfaceC9683 instanceof C9685;
                    C2958 c295822 = C2958.f6621;
                    InterfaceC2233 interfaceC223322 = this.f16547;
                    if (z) {
                    }
                    c2159.m2937(false);
                }
            }
        } else {
            c2159.m2899();
        }
        return C6008.f15084;
    }
}
