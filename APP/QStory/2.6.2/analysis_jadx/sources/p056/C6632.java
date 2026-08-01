package p056;

import androidx.window.area.C2558;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7143;
import p089.InterfaceC7180;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6632 {
    public static final C6633 Companion = new C6633();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC5183[] f18025 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C2558(28)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Boolean f18026;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Integer f18027;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18028;

    public /* synthetic */ C6632(int i, List list, Integer num, Boolean bool) {
        if (7 != (i & 7)) {
            AbstractC7143.m12393(i, 7, C6622.f18013.getDescriptor());
            throw null;
        }
        this.f18028 = list;
        this.f18027 = num;
        this.f18026 = bool;
        if (list.size() <= 100) {
            return;
        }
        C5919.m11249("'values' field must not exceed 100 items");
        throw null;
    }
}
