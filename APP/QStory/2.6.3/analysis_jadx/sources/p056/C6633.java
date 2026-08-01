package p056;

import androidx.window.area.C2558;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7144;
import p089.InterfaceC7181;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6633 {
    public static final C6634 Companion = new C6634();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5184[] f18020 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C2558(28)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Boolean f18021;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Integer f18022;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18023;

    public /* synthetic */ C6633(int i, List list, Integer num, Boolean bool) {
        if (7 != (i & 7)) {
            AbstractC7144.m12420(i, 7, C6623.f18008.getDescriptor());
            throw null;
        }
        this.f18023 = list;
        this.f18022 = num;
        this.f18021 = bool;
        if (list.size() <= 100) {
            return;
        }
        C5925.m11310("'values' field must not exceed 100 items");
        throw null;
    }
}
