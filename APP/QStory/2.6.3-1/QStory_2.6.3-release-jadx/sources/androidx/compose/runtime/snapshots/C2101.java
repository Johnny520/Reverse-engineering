package androidx.compose.runtime.snapshots;

import androidx.collection.C1123;
import bsh.C3466;
import java.util.Iterator;
import p070.InterfaceC7396;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2101 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f4026;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f4027;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Iterator f4028;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f4029;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final SnapshotStateSet f4030;

    public C2101(SnapshotStateSet snapshotStateSet, Iterator it) {
        this.f4030 = snapshotStateSet;
        this.f4028 = it;
        C2100 c2100 = snapshotStateSet.f3990;
        c2100.getClass();
        this.f4026 = ((C2100) AbstractC2115.m2835(c2100)).f4024;
        this.f4029 = this.f4027;
        this.f4027 = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4027 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2100 c2100 = this.f4030.f3990;
        c2100.getClass();
        if (((C2100) AbstractC2115.m2835(c2100)).f4024 != this.f4026) {
            C1123.m1400();
            return null;
        }
        this.f4029 = this.f4027;
        Iterator it = this.f4028;
        this.f4027 = it.hasNext() ? it.next() : null;
        Object obj = this.f4029;
        if (obj != null) {
            return obj;
        }
        C3466.m5901();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        SnapshotStateSet snapshotStateSet = this.f4030;
        C2100 c2100 = snapshotStateSet.f3990;
        c2100.getClass();
        if (((C2100) AbstractC2115.m2835(c2100)).f4024 != this.f4026) {
            C1123.m1400();
            return;
        }
        Object obj = this.f4029;
        if (obj == null) {
            C3466.m5901();
            return;
        }
        snapshotStateSet.remove(obj);
        this.f4029 = null;
        C2100 c21002 = snapshotStateSet.f3990;
        c21002.getClass();
        this.f4026 = ((C2100) AbstractC2115.m2835(c21002)).f4024;
    }
}
