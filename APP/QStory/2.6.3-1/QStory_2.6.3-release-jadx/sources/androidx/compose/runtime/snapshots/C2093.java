package androidx.compose.runtime.snapshots;

import androidx.collection.C1123;
import bsh.C3466;
import java.util.Iterator;
import java.util.Map;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2093 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Map.Entry f3994;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Map.Entry f3995;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ int f3996;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Iterator f3997;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f3998;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2112 f3999;

    public C2093(C2112 c2112, Iterator it, int i) {
        this.f3996 = i;
        this.f3999 = c2112;
        this.f3997 = it;
        this.f3998 = c2112.m2812().f4048;
        m2761();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3994 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3996) {
            case 0:
                m2761();
                if (this.f3995 == null) {
                    C3466.m5901();
                }
                break;
            case 1:
                Map.Entry entry = this.f3994;
                if (entry == null) {
                    C3466.m5901();
                } else {
                    m2761();
                }
                break;
            default:
                Map.Entry entry2 = this.f3994;
                if (entry2 == null) {
                    C3466.m5901();
                } else {
                    m2761();
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C2112 c2112 = this.f3999;
        if (c2112.m2812().f4048 != this.f3998) {
            C1123.m1400();
            return;
        }
        Map.Entry entry = this.f3995;
        if (entry == null) {
            C3466.m5901();
            return;
        }
        c2112.remove(entry.getKey());
        this.f3995 = null;
        this.f3998 = c2112.m2812().f4048;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2761() {
        this.f3995 = this.f3994;
        Iterator it = this.f3997;
        this.f3994 = it.hasNext() ? (Map.Entry) it.next() : null;
    }
}
