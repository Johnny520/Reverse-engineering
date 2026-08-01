package kotlin.collections;

import androidx.core.view.C2268;
import com.alibaba.fastjson2.AbstractC2904;
import java.util.Iterator;
import kotlin.sequences.C5122;
import kotlin.sequences.C5125;
import kotlin.sequences.InterfaceC5126;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4345 implements InterfaceC5126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f12924;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f12925;

    public /* synthetic */ C4345(Object obj, int i) {
        this.f12925 = i;
        this.f12924 = obj;
    }

    @Override // kotlin.sequences.InterfaceC5126
    public final Iterator iterator() {
        int i = this.f12925;
        Object obj = this.f12924;
        switch (i) {
            case 0:
                return new C2268((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return AbstractC2904.m6249((InterfaceC6553) obj);
            case 3:
                return (Iterator) obj;
            case 4:
                return new C5125(obj, 0);
            default:
                return new C5122(this);
        }
    }
}
