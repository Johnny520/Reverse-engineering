package kotlinx.coroutines.flow;

import androidx.window.area.AbstractC3400;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC6050;
import kotlinx.coroutines.flow.internal.AbstractC6051;
import kotlinx.coroutines.flow.internal.AbstractC6052;
import kotlinx.coroutines.flow.internal.C6065;
import kotlinx.coroutines.flow.internal.InterfaceC6062;
import p307.AbstractC9322;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6099 extends AbstractC6052 implements InterfaceC6129, InterfaceC6151, InterfaceC6062 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15196 = AtomicReferenceFieldUpdater.newUpdater(C6099.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ long f15197 = AbstractC9322.f23936.objectFieldOffset(C6099.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f15198;

    public C6099(Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        m10872(obj);
        return C6008.f15084;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6096
    public final Object getValue() {
        C5317 c5317 = AbstractC6051.f15152;
        f15196.getClass();
        Object objectVolatile = AbstractC9322.f23936.getObjectVolatile(this, f15197);
        if (objectVolatile == c5317) {
            return null;
        }
        return objectVolatile;
    }

    @Override // kotlinx.coroutines.flow.internal.InterfaceC6062
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC6151 mo10851(InterfaceC5192 interfaceC5192, int i, BufferOverflow bufferOverflow) {
        return ((((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) && !((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND)) ? new C6065(this, interfaceC5192, i, bufferOverflow) : this;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6126
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo10868(Object obj) {
        m10872(obj);
        return true;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6126
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo10869() {
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
    @Override // kotlinx.coroutines.flow.InterfaceC6151
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9012(InterfaceC6150 interfaceC6150, InterfaceC5189 interfaceC5189) {
        StateFlowImpl$collect$1 stateFlowImpl$collect$1;
        C6098 c6098;
        InterfaceC6150 interfaceC61502;
        InterfaceC6284 interfaceC6284;
        Object obj;
        Object andSet;
        Object obj2;
        Object obj3;
        if (interfaceC5189 instanceof StateFlowImpl$collect$1) {
            stateFlowImpl$collect$1 = (StateFlowImpl$collect$1) interfaceC5189;
            int i = stateFlowImpl$collect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stateFlowImpl$collect$1.label = i - Integer.MIN_VALUE;
            } else {
                stateFlowImpl$collect$1 = new StateFlowImpl$collect$1(this, interfaceC5189);
            }
        }
        Object obj4 = stateFlowImpl$collect$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stateFlowImpl$collect$1.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj4);
                c6098 = (C6098) m10859();
            } else if (i2 == 1) {
                c6098 = (C6098) stateFlowImpl$collect$1.L$1;
                interfaceC6150 = (InterfaceC6150) stateFlowImpl$collect$1.L$0;
                AbstractC6017.m10769(obj4);
            } else if (i2 == 2) {
                obj = stateFlowImpl$collect$1.L$4;
                interfaceC6284 = (InterfaceC6284) stateFlowImpl$collect$1.L$2;
                c6098 = (C6098) stateFlowImpl$collect$1.L$1;
                interfaceC61502 = (InterfaceC6150) stateFlowImpl$collect$1.L$0;
                AbstractC6017.m10769(obj4);
                AtomicReference atomicReference = c6098.f15195;
                C5317 c5317 = AbstractC6154.f15235;
                andSet = atomicReference.getAndSet(c5317);
                andSet.getClass();
                if (andSet == AbstractC6154.f15234) {
                }
                obj2 = f15196.get(this);
                if (interfaceC6284 != null) {
                }
                if (obj != null) {
                }
                if (obj2 != AbstractC6051.f15152) {
                }
                stateFlowImpl$collect$1.L$0 = interfaceC61502;
                stateFlowImpl$collect$1.L$1 = c6098;
                stateFlowImpl$collect$1.L$2 = interfaceC6284;
                stateFlowImpl$collect$1.L$3 = null;
                stateFlowImpl$collect$1.L$4 = obj2;
                stateFlowImpl$collect$1.label = 2;
                if (interfaceC61502.emit(obj3, stateFlowImpl$collect$1) != coroutineSingletons) {
                }
            } else {
                if (i2 != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = stateFlowImpl$collect$1.L$3;
                interfaceC6284 = (InterfaceC6284) stateFlowImpl$collect$1.L$2;
                c6098 = (C6098) stateFlowImpl$collect$1.L$1;
                interfaceC61502 = (InterfaceC6150) stateFlowImpl$collect$1.L$0;
                AbstractC6017.m10769(obj4);
                obj2 = f15196.get(this);
                if (interfaceC6284 != null && !interfaceC6284.mo11121()) {
                    throw interfaceC6284.mo11122();
                }
                if (obj != null || !obj.equals(obj2)) {
                    obj3 = obj2 != AbstractC6051.f15152 ? null : obj2;
                    stateFlowImpl$collect$1.L$0 = interfaceC61502;
                    stateFlowImpl$collect$1.L$1 = c6098;
                    stateFlowImpl$collect$1.L$2 = interfaceC6284;
                    stateFlowImpl$collect$1.L$3 = null;
                    stateFlowImpl$collect$1.L$4 = obj2;
                    stateFlowImpl$collect$1.label = 2;
                    if (interfaceC61502.emit(obj3, stateFlowImpl$collect$1) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = obj2;
                }
                AtomicReference atomicReference2 = c6098.f15195;
                C5317 c53172 = AbstractC6154.f15235;
                andSet = atomicReference2.getAndSet(c53172);
                andSet.getClass();
                if (andSet == AbstractC6154.f15234) {
                    stateFlowImpl$collect$1.L$0 = interfaceC61502;
                    stateFlowImpl$collect$1.L$1 = c6098;
                    stateFlowImpl$collect$1.L$2 = interfaceC6284;
                    stateFlowImpl$collect$1.L$3 = obj;
                    stateFlowImpl$collect$1.L$4 = null;
                    stateFlowImpl$collect$1.label = 3;
                    C6008 c6008 = C6008.f15084;
                    C6276 c6276 = new C6276(1, AbstractC3400.m5624(stateFlowImpl$collect$1));
                    c6276.m11102();
                    AtomicReference atomicReference3 = c6098.f15195;
                    while (true) {
                        if (atomicReference3.compareAndSet(c53172, c6276)) {
                            break;
                        }
                        if (atomicReference3.get() != c53172) {
                            c6276.resumeWith(Result.m9304constructorimpl(c6008));
                            break;
                        }
                    }
                    Object objM11099 = c6276.m11099();
                    if (objM11099 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                    if (objM11099 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                obj2 = f15196.get(this);
                if (interfaceC6284 != null) {
                    throw interfaceC6284.mo11122();
                }
                if (obj != null) {
                }
                if (obj2 != AbstractC6051.f15152) {
                }
                stateFlowImpl$collect$1.L$0 = interfaceC61502;
                stateFlowImpl$collect$1.L$1 = c6098;
                stateFlowImpl$collect$1.L$2 = interfaceC6284;
                stateFlowImpl$collect$1.L$3 = null;
                stateFlowImpl$collect$1.L$4 = obj2;
                stateFlowImpl$collect$1.label = 2;
                if (interfaceC61502.emit(obj3, stateFlowImpl$collect$1) != coroutineSingletons) {
                }
            }
            interfaceC61502 = interfaceC6150;
            interfaceC6284 = (InterfaceC6284) stateFlowImpl$collect$1.getContext().get(C6285.f15450);
            obj = null;
            obj2 = f15196.get(this);
            if (interfaceC6284 != null) {
            }
            if (obj != null) {
            }
            if (obj2 != AbstractC6051.f15152) {
            }
            stateFlowImpl$collect$1.L$0 = interfaceC61502;
            stateFlowImpl$collect$1.L$1 = c6098;
            stateFlowImpl$collect$1.L$2 = interfaceC6284;
            stateFlowImpl$collect$1.L$3 = null;
            stateFlowImpl$collect$1.L$4 = obj2;
            stateFlowImpl$collect$1.label = 2;
            if (interfaceC61502.emit(obj3, stateFlowImpl$collect$1) != coroutineSingletons) {
            }
        } catch (Throwable th) {
            m10862(c6098);
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m10870(Object obj, Object obj2) {
        int i;
        AbstractC6050[] abstractC6050Arr;
        C5317 c5317;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15196;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC5227.m9466(obj3, obj)) {
                return false;
            }
            if (AbstractC5227.m9466(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f15198;
            if ((i2 & 1) != 0) {
                this.f15198 = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f15198 = i3;
            AbstractC6050[] abstractC6050Arr2 = this.f15157;
            while (true) {
                C6098[] c6098Arr = (C6098[]) abstractC6050Arr2;
                if (c6098Arr != null) {
                    for (C6098 c6098 : c6098Arr) {
                        if (c6098 != null) {
                            AtomicReference atomicReference = c6098.f15195;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (c5317 = AbstractC6154.f15234)) {
                                    C5317 c53172 = AbstractC6154.f15235;
                                    if (obj4 != c53172) {
                                        while (!atomicReference.compareAndSet(obj4, c53172)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C6276) obj4).resumeWith(Result.m9304constructorimpl(C6008.f15084));
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, c5317)) {
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
                    i = this.f15198;
                    if (i == i3) {
                        this.f15198 = i3 + 1;
                        return true;
                    }
                    abstractC6050Arr = this.f15157;
                }
                abstractC6050Arr2 = abstractC6050Arr;
                i3 = i;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6052
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final AbstractC6050[] mo10860() {
        return new C6098[2];
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC6052
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC6050 mo10861() {
        return new C6098();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m10871(Object obj, Object obj2) {
        C5317 c5317 = AbstractC6051.f15152;
        if (obj == null) {
            obj = c5317;
        }
        return m10870(obj, obj2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m10872(Object obj) {
        if (obj == null) {
            obj = AbstractC6051.f15152;
        }
        m10870(null, obj);
    }
}
