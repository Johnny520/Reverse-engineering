package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5175;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC5217;
import kotlinx.coroutines.flow.internal.AbstractC5218;
import kotlinx.coroutines.flow.internal.AbstractC5219;
import kotlinx.coroutines.flow.internal.C5232;
import kotlinx.coroutines.flow.internal.InterfaceC5229;
import p291.AbstractC8501;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5266 extends AbstractC5219 implements InterfaceC5296, InterfaceC5318, InterfaceC5229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14851 = AtomicReferenceFieldUpdater.newUpdater(C5266.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ long f14852 = AbstractC8501.f23600.objectFieldOffset(C5266.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f14853;

    public C5266(Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final Object emit(Object obj, InterfaceC4356 interfaceC4356) {
        m10309(obj);
        return C5175.f14739;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5263
    public final Object getValue() {
        C4484 c4484 = AbstractC5218.f14807;
        f14851.getClass();
        Object objectVolatile = AbstractC8501.f23600.getObjectVolatile(this, f14852);
        if (objectVolatile == c4484) {
            return null;
        }
        return objectVolatile;
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC5229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC5318 mo10288(InterfaceC4359 interfaceC4359, int i, BufferOverflow bufferOverflow) {
        return ((((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) && !((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND)) ? new C5232(this, interfaceC4359, i, bufferOverflow) : this;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5293
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo10305(Object obj) {
        m10309(obj);
        return true;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5293
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo10306() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x007d, code lost:
    
        if (r15 != r1) goto L28;
     */
    /* JADX WARN: Path cross not found for [B:36:0x0093, B:38:0x0099], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:38:0x0099, B:36:0x0093], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:38:0x0099, B:46:0x00b4], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:58:0x00fc, B:59:0x00fd], limit reached: 65 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:14:0x0038, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f4, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x0060, B:27:0x006e), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:14:0x0038, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f4, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x0060, B:27:0x006e), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:14:0x0038, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f4, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x0060, B:27:0x006e), top: B:63:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c3 -> B:28:0x007d). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.InterfaceC5318
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8463(kotlinx.coroutines.flow.InterfaceC5317 r14, kotlin.coroutines.InterfaceC4356 r15) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C5266.mo8463(kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m10307(Object obj, Object obj2) {
        int i;
        AbstractC5217[] abstractC5217Arr;
        C4484 c4484;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14851;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC4394.m8917(obj3, obj)) {
                return false;
            }
            if (AbstractC4394.m8917(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f14853;
            if ((i2 & 1) != 0) {
                this.f14853 = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f14853 = i3;
            AbstractC5217[] abstractC5217Arr2 = this.f14812;
            while (true) {
                C5265[] c5265Arr = (C5265[]) abstractC5217Arr2;
                if (c5265Arr != null) {
                    for (C5265 c5265 : c5265Arr) {
                        if (c5265 != null) {
                            AtomicReference atomicReference = c5265.f14850;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (c4484 = AbstractC5321.f14889)) {
                                    C4484 c44842 = AbstractC5321.f14890;
                                    if (obj4 != c44842) {
                                        while (!atomicReference.compareAndSet(obj4, c44842)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C5443) obj4).resumeWith(Result.m8755constructorimpl(C5175.f14739));
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, c4484)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f14853;
                    if (i == i3) {
                        this.f14853 = i3 + 1;
                        return true;
                    }
                    abstractC5217Arr = this.f14812;
                }
                abstractC5217Arr2 = abstractC5217Arr;
                i3 = i;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5219
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final AbstractC5217[] mo10297() {
        return new C5265[2];
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5219
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC5217 mo10298() {
        return new C5265();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m10308(Object obj, Object obj2) {
        C4484 c4484 = AbstractC5218.f14807;
        if (obj == null) {
            obj = c4484;
        }
        return m10307(obj, obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m10309(Object obj) {
        if (obj == null) {
            obj = AbstractC5218.f14807;
        }
        m10307(null, obj);
    }
}
