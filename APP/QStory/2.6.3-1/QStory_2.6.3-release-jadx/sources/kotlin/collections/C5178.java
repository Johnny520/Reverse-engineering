package kotlin.collections;

import androidx.core.view.C3101;
import java.util.Iterator;
import kotlin.sequences.C5955;
import kotlin.sequences.C5958;
import kotlin.sequences.InterfaceC5959;
import p068.InterfaceC7383;
import p069.AbstractC7390;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5178 implements InterfaceC5959 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f13273;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f13274;

    public /* synthetic */ C5178(Object obj, int i) {
        this.f13274 = i;
        this.f13273 = obj;
    }

    @Override // kotlin.sequences.InterfaceC5959
    public final Iterator iterator() {
        int i = this.f13274;
        Object obj = this.f13273;
        switch (i) {
            case 0:
                return new C3101((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return AbstractC7390.m12604((InterfaceC7383) obj);
            case 3:
                return (Iterator) obj;
            case 4:
                return new C5958(obj, 0);
            default:
                return new C5955(this);
        }
    }
}
