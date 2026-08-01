package androidx.compose.runtime.composer.gapbuffer;

import androidx.collection.C0246;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.AbstractC1392;
import androidx.compose.runtime.tooling.InterfaceC1293;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4394;
import p054.InterfaceC6566;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1233 extends AbstractC1367 implements InterfaceC1293, Iterable, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C0246 f3538;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public HashMap f3539;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f3541;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f3542;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f3543;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f3545;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f3548;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int[] f3544 = new int[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object[] f3547 = new Object[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Object f3546 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public ArrayList f3540 = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1228(this, 0, this.f3543);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C1234 m2052() {
        if (this.f3542) {
            C5919.m11250("Cannot read while a writer is pending");
            return null;
        }
        this.f3545++;
        return new C1234(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final C1235 m2053() {
        if (this.f3542) {
            AbstractC1374.m2497("Cannot start a writer when another writer is pending");
        }
        if (this.f3545 > 0) {
            AbstractC1374.m2497("Cannot start a writer when a reader is pending");
        }
        this.f3542 = true;
        this.f3541++;
        return new C1235(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m2054() {
        this.f3539 = new HashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final int m2055(C1230 c1230) {
        if (this.f3542) {
            AbstractC1374.m2497("Use active SlotWriter to determine anchor location instead");
        }
        if (!c1230.m2051()) {
            AbstractC1392.m2528("Anchor refers to a group that was removed");
        }
        return c1230.f3533;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final AbstractC1229 m2056(int i) {
        int i2;
        ArrayList arrayList;
        int iM2127;
        HashMap map = this.f3539;
        if (map != null) {
            if (this.f3542) {
                AbstractC1374.m2497("use active SlotWriter to crate an anchor for location instead");
            }
            C1230 c1230 = (i < 0 || i >= (i2 = this.f3543) || (iM2127 = AbstractC1238.m2127((arrayList = this.f3540), i, i2)) < 0) ? null : (C1230) arrayList.get(iM2127);
            if (c1230 != null) {
                return (AbstractC1229) map.get(c1230);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final boolean m2057(C1230 c1230) {
        int iM2127;
        return c1230.m2051() && (iM2127 = AbstractC1238.m2127(this.f3540, c1230.f3533, this.f3543)) >= 0 && AbstractC4394.m8917(this.f3540.get(iM2127), c1230);
    }
}
