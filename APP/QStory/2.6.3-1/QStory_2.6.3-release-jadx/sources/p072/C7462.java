package p072;

import androidx.window.area.C3391;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import p103.AbstractC7973;
import p105.InterfaceC8010;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7462 {
    public static final C7463 Companion = new C7463();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC6016[] f18365 = {AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C3391(28)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Boolean f18366;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Integer f18367;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18368;

    public /* synthetic */ C7462(int i, List list, Integer num, Boolean bool) {
        if (7 != (i & 7)) {
            AbstractC7973.m12979(i, 7, C7452.f18353.getDescriptor());
            throw null;
        }
        this.f18368 = list;
        this.f18367 = num;
        this.f18366 = bool;
        if (list.size() <= 100) {
            return;
        }
        C6755.m11869("'values' field must not exceed 100 items");
        throw null;
    }
}
