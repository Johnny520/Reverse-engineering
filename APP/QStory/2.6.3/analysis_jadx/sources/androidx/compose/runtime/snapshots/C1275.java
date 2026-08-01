package androidx.compose.runtime.snapshots;

import androidx.compose.foundation.C1067;
import androidx.compose.foundation.layout.C0640;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.collection.C1224;
import io.ktor.util.C4211;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.AbstractC4344;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1275 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f3711;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6558 f3713;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C1267 f3714;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C1278 f3716;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AtomicReference f3712 = new AtomicReference(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0640 f3710 = new C0640(this, 3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1067 f3709 = new C1067(this, 11);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1224 f3708 = new C1224(0, new C1278[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f3715 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public long f3717 = -1;

    public C1275(InterfaceC6558 interfaceC6558) {
        this.f3713 = interfaceC6558;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2245() {
        C0640 c0640 = this.f3710;
        AbstractC1280.m2259(AbstractC1280.f3747);
        synchronized (AbstractC1280.f3745) {
            AbstractC1280.f3748 = AbstractC4344.m8794(AbstractC1280.f3748, c0640);
        }
        this.f3714 = new C1267(c0640);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01df  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2246(java.lang.Object r27, p052.InterfaceC6558 r28, p052.InterfaceC6543 r29) {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C1275.m2246(java.lang.Object, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m2247() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.f3715) {
            z = this.f3711;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.f3712;
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
                        AbstractC1374.m2506("Unexpected notification");
                        C4211.m8602();
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
            synchronized (this.f3715) {
                C1224 c1224 = this.f3708;
                Object[] objArr = c1224.f3521;
                int i = c1224.f3520;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((C1278) objArr[i2]).m2256(set) || z2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2248() {
        synchronized (this.f3715) {
            C1224 c1224 = this.f3708;
            Object[] objArr = c1224.f3521;
            int i = c1224.f3520;
            for (int i2 = 0; i2 < i; i2++) {
                C1278 c1278 = (C1278) objArr[i2];
                c1278.f3728.m754();
                c1278.f3727.m754();
                c1278.f3737.m754();
                c1278.f3733.clear();
            }
        }
    }
}
