package kotlinx.coroutines.channels;

import io.ktor.util.C5043;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.InterfaceC6244;
import kotlinx.coroutines.internal.AbstractC6193;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6033 extends AbstractC6193 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f15133;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C6022 f15134;

    public C6033(long j, C6033 c6033, C6022 c6022, int i) {
        super(j, c6033, i);
        this.f15134 = c6022;
        this.f15133 = new AtomicReferenceArray(AbstractC6021.f15096 * 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m10824(int i, Object obj) {
        this.f15133.set((i * 2) + 1, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m10825(int i, Object obj) {
        this.f15133.set(i * 2, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        m10825(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.AbstractC6193
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo10826(int i, InterfaceC5192 interfaceC5192) {
        int i2 = AbstractC6021.f15096;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f15133.get(i * 2);
        while (true) {
            Object objM10827 = m10827(i);
            boolean z2 = objM10827 instanceof InterfaceC6244;
            C6022 c6022 = this.f15134;
            if (z2 || (objM10827 instanceof C6030)) {
                if (m10829(objM10827, i, z ? AbstractC6021.f15110 : AbstractC6021.f15107)) {
                    m10825(i, null);
                    m10828(i, !z);
                    if (z) {
                        c6022.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objM10827 == AbstractC6021.f15110 || objM10827 == AbstractC6021.f15107) {
                    break;
                }
                if (objM10827 != AbstractC6021.f15106 && objM10827 != AbstractC6021.f15092) {
                    if (objM10827 == AbstractC6021.f15109 || objM10827 == AbstractC6021.f15094 || objM10827 == AbstractC6021.f15108) {
                        return;
                    }
                    C5043.m9151(objM10827, "unexpected state: ");
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object m10827(int i) {
        return this.f15133.get((i * 2) + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m10828(int i, boolean z) {
        if (z) {
            C6022 c6022 = this.f15134;
            c6022.getClass();
            c6022.m10784((this.f15289 * ((long) AbstractC6021.f15096)) + ((long) i));
        }
        m10946();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m10829(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f15133;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    @Override // kotlinx.coroutines.internal.AbstractC6193
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int mo10830() {
        return AbstractC6021.f15096;
    }
}
