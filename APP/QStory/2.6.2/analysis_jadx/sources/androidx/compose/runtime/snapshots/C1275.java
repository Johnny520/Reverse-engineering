package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.C1067;
import androidx.compose.foundation.layout.C0640;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.collection.C1224;
import io.ktor.util.C4210;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.AbstractC4343;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1275 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f3710;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6557 f3712;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C1267 f3713;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C1278 f3715;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AtomicReference f3711 = new AtomicReference(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0640 f3709 = new C0640(this, 3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1067 f3708 = new C1067(this, 11);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1224 f3707 = new C1224(0, new C1278[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f3714 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public long f3716 = -1;

    public C1275(InterfaceC6557 interfaceC6557) {
        this.f3712 = interfaceC6557;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2235() {
        C0640 c0640 = this.f3709;
        AbstractC1280.m2249(AbstractC1280.f3746);
        synchronized (AbstractC1280.f3744) {
            AbstractC1280.f3747 = AbstractC4343.m8821(AbstractC1280.f3747, c0640);
        }
        this.f3713 = new C1267(c0640);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01df  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2236(java.lang.Object r27, p052.InterfaceC6557 r28, p052.InterfaceC6542 r29) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C1275.m2236(java.lang.Object, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m2237() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.f3714) {
            z = this.f3710;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.f3711;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC1374.m2496("Unexpected notification");
                        C4210.m8612();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.f3714) {
                C1224 c1224 = this.f3707;
                Object[] objArr = c1224.f3520;
                int i = c1224.f3519;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((C1278) objArr[i2]).m2246(set) || z2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2238() {
        synchronized (this.f3714) {
            C1224 c1224 = this.f3707;
            Object[] objArr = c1224.f3520;
            int i = c1224.f3519;
            for (int i2 = 0; i2 < i; i2++) {
                C1278 c1278 = (C1278) objArr[i2];
                c1278.f3727.m753();
                c1278.f3726.m753();
                c1278.f3736.m753();
                c1278.f3732.clear();
            }
        }
    }
}
