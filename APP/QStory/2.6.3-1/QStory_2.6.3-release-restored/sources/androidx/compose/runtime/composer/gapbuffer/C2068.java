package androidx.compose.runtime.composer.gapbuffer;

import androidx.collection.C1093;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.AbstractC2227;
import androidx.compose.runtime.tooling.InterfaceC2128;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7396;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2068 extends AbstractC2202 implements InterfaceC2128, Iterable, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C1093 f3884;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public HashMap f3885;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f3887;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f3888;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f3889;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f3891;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f3894;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int[] f3890 = new int[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object[] f3893 = new Object[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Object f3892 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ArrayList f3886 = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2063(this, 0, this.f3889);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C2069 m2622() {
        if (this.f3888) {
            C6755.m11870("Cannot read while a writer is pending");
            return null;
        }
        this.f3891++;
        return new C2069(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final C2070 m2623() {
        if (this.f3888) {
            AbstractC2209.m3067("Cannot start a writer when another writer is pending");
        }
        if (this.f3891 > 0) {
            AbstractC2209.m3067("Cannot start a writer when a reader is pending");
        }
        this.f3888 = true;
        this.f3887++;
        return new C2070(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m2624() {
        this.f3885 = new HashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final int m2625(C2065 c2065) {
        if (this.f3888) {
            AbstractC2209.m3067("Use active SlotWriter to determine anchor location instead");
        }
        if (!c2065.m2621()) {
            AbstractC2227.m3098("Anchor refers to a group that was removed");
        }
        return c2065.f3879;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final AbstractC2064 m2626(int i) {
        int i2;
        ArrayList arrayList;
        int iM2697;
        HashMap map = this.f3885;
        if (map != null) {
            if (this.f3888) {
                AbstractC2209.m3067("use active SlotWriter to crate an anchor for location instead");
            }
            C2065 c2065 = (i < 0 || i >= (i2 = this.f3889) || (iM2697 = AbstractC2073.m2697((arrayList = this.f3886), i, i2)) < 0) ? null : (C2065) arrayList.get(iM2697);
            if (c2065 != null) {
                return (AbstractC2064) map.get(c2065);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final boolean m2627(C2065 c2065) {
        int iM2697;
        return c2065.m2621() && (iM2697 = AbstractC2073.m2697(this.f3886, c2065.f3879, this.f3889)) >= 0 && AbstractC5227.m9466(this.f3886.get(iM2697), c2065);
    }
}
