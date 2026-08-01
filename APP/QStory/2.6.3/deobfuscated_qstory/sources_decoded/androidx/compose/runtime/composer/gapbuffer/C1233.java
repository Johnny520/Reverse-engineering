package androidx.compose.runtime.composer.gapbuffer;

import androidx.collection.C0246;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.AbstractC1392;
import androidx.compose.runtime.tooling.InterfaceC1293;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4395;
import p054.InterfaceC6567;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1233 extends AbstractC1367 implements InterfaceC1293, Iterable, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C0246 f3539;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public HashMap f3540;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f3542;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f3543;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f3544;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f3546;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f3549;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int[] f3545 = new int[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object[] f3548 = new Object[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Object f3547 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ArrayList f3541 = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1228(this, 0, this.f3544);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C1234 m2062() {
        if (this.f3543) {
            C5925.m11311("Cannot read while a writer is pending");
            return null;
        }
        this.f3546++;
        return new C1234(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final C1235 m2063() {
        if (this.f3543) {
            AbstractC1374.m2507("Cannot start a writer when another writer is pending");
        }
        if (this.f3546 > 0) {
            AbstractC1374.m2507("Cannot start a writer when a reader is pending");
        }
        this.f3543 = true;
        this.f3542++;
        return new C1235(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m2064() {
        this.f3540 = new HashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final int m2065(C1230 c1230) {
        if (this.f3543) {
            AbstractC1374.m2507("Use active SlotWriter to determine anchor location instead");
        }
        if (!c1230.m2061()) {
            AbstractC1392.m2538("Anchor refers to a group that was removed");
        }
        return c1230.f3534;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final AbstractC1229 m2066(int i) {
        int i2;
        ArrayList arrayList;
        int iM2137;
        HashMap map = this.f3540;
        if (map != null) {
            if (this.f3543) {
                AbstractC1374.m2507("use active SlotWriter to crate an anchor for location instead");
            }
            C1230 c1230 = (i < 0 || i >= (i2 = this.f3544) || (iM2137 = AbstractC1238.m2137((arrayList = this.f3541), i, i2)) < 0) ? null : (C1230) arrayList.get(iM2137);
            if (c1230 != null) {
                return (AbstractC1229) map.get(c1230);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final boolean m2067(C1230 c1230) {
        int iM2137;
        return c1230.m2061() && (iM2137 = AbstractC1238.m2137(this.f3541, c1230.f3534, this.f3544)) >= 0 && AbstractC4395.m8907(this.f3541.get(iM2137), c1230);
    }
}
