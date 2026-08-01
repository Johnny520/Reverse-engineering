package kotlin.collections;

import androidx.core.view.C2268;
import java.util.Iterator;
import kotlin.sequences.C5123;
import kotlin.sequences.C5126;
import kotlin.sequences.InterfaceC5127;
import p052.InterfaceC6554;
import p053.AbstractC6561;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4346 implements InterfaceC5127 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f12928;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f12929;

    public /* synthetic */ C4346(Object obj, int i) {
        this.f12929 = i;
        this.f12928 = obj;
    }

    @Override // kotlin.sequences.InterfaceC5127
    public final Iterator iterator() {
        int i = this.f12929;
        Object obj = this.f12928;
        switch (i) {
            case 0:
                return new C2268((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return AbstractC6561.m12045((InterfaceC6554) obj);
            case 3:
                return (Iterator) obj;
            case 4:
                return new C5126(obj, 0);
            default:
                return new C5123(this);
        }
    }
}
