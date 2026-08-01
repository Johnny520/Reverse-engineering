package kotlinx.coroutines.selects;

import androidx.activity.AbstractC0900;
import androidx.compose.animation.core.C1171;
import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.InterfaceC6230;
import kotlinx.coroutines.InterfaceC6278;
import kotlinx.coroutines.InterfaceC6279;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.internal.AbstractC6193;
import p050.AbstractC7176;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7692;
import p307.AbstractC9322;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6201 implements InterfaceC6278, InterfaceC6207 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15309 = AtomicReferenceFieldUpdater.newUpdater(C6201.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ long f15310 = AbstractC9322.f23936.objectFieldOffset(C6201.class.getDeclaredField("state$volatile"));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f15314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5192 f15315;
    private volatile /* synthetic */ Object state$volatile = AbstractC6204.f15330;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ArrayList f15313 = new ArrayList(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f15312 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f15311 = AbstractC6204.f15327;

    public C6201(InterfaceC5192 interfaceC5192) {
        this.f15315 = interfaceC5192;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m10973(C6202 c6202) {
        ArrayList<C6202> arrayList = this.f15313;
        if (arrayList == null) {
            return;
        }
        for (C6202 c62022 : arrayList) {
            if (c62022 != c6202) {
                c62022.m10984();
            }
        }
        f15309.getClass();
        AbstractC9322.f23936.putObjectVolatile(this, f15310, AbstractC6204.f15329);
        this.f15311 = AbstractC6204.f15327;
        this.f15313 = null;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6200
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo10970(Object obj) {
        this.f15311 = obj;
    }

    @Override // kotlinx.coroutines.InterfaceC6278
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo10974(Throwable th) {
        C6201 c6201;
        while (true) {
            f15309.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15310;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == AbstractC6204.f15329) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = AbstractC9322.f23936;
                c6201 = this;
                if (unsafe2.compareAndSwapObject(c6201, f15310, objectVolatile, AbstractC6204.f15328)) {
                    ArrayList arrayList = c6201.f15313;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C6202) it.next()).m10984();
                    }
                    c6201.f15311 = AbstractC6204.f15327;
                    c6201.f15313 = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(c6201, j) != objectVolatile) {
                    break;
                } else {
                    this = c6201;
                }
            }
            this = c6201;
        }
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6200
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo10971(Object obj, Object obj2) {
        return m10975(obj, obj2) == 0;
    }

    @Override // kotlinx.coroutines.InterfaceC6244
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10822(AbstractC6193 abstractC6193, int i) {
        this.f15314 = abstractC6193;
        this.f15312 = i;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC6200
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo10972(InterfaceC6230 interfaceC6230) {
        this.f15314 = interfaceC6230;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int m10975(Object obj, Object obj2) {
        C6201 c6201;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            f15309.getClass();
            Unsafe unsafe3 = AbstractC9322.f23936;
            long j = f15310;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof InterfaceC6279) {
                C6202 c6202M10983 = this.m10983(obj);
                if (c6202M10983 != null) {
                    InterfaceC7380 interfaceC7380 = c6202M10983.f15316;
                    InterfaceC7380 interfaceC73802 = interfaceC7380 != null ? (InterfaceC7380) interfaceC7380.invoke(this, c6202M10983.f15318, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = AbstractC9322.f23936;
                        c6201 = this;
                        if (unsafe4.compareAndSwapObject(c6201, f15310, objectVolatile, c6202M10983)) {
                            InterfaceC6279 interfaceC6279 = (InterfaceC6279) objectVolatile;
                            c6201.f15311 = obj2;
                            C5317 c5317Mo10995 = interfaceC6279.mo10995(C6008.f15084, interfaceC73802);
                            if (c5317Mo10995 == null) {
                                c6201.f15311 = AbstractC6204.f15327;
                                return 2;
                            }
                            interfaceC6279.mo10992(c5317Mo10995);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(c6201, j) != objectVolatile) {
                            break;
                        }
                        this = c6201;
                    }
                } else {
                    continue;
                }
            } else {
                c6201 = this;
                if (AbstractC5227.m9466(objectVolatile, AbstractC6204.f15329) || (objectVolatile instanceof C6202)) {
                    return 3;
                }
                if (AbstractC5227.m9466(objectVolatile, AbstractC6204.f15328)) {
                    return 2;
                }
                if (AbstractC5227.m9466(objectVolatile, AbstractC6204.f15330)) {
                    List listM12487 = AbstractC7176.m12487(obj);
                    do {
                        unsafe2 = AbstractC9322.f23936;
                        if (unsafe2.compareAndSwapObject(c6201, f15310, objectVolatile, listM12487)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(c6201, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        C5043.m9151(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    ArrayList arrayListM9353 = AbstractC5176.m9353((Collection) objectVolatile, obj);
                    do {
                        unsafe = AbstractC9322.f23936;
                        if (unsafe.compareAndSwapObject(c6201, f15310, objectVolatile, arrayListM9353)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(c6201, j) == objectVolatile);
                }
            }
            this = c6201;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m10976(C6202 c6202, boolean z) {
        Object obj = c6202.f15321;
        f15309.getClass();
        Unsafe unsafe = AbstractC9322.f23936;
        long j = f15310;
        if (unsafe.getObjectVolatile(this, j) instanceof C6202) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.f15313;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C6202) it.next()).f15321 == obj) {
                        C6755.m11871(AbstractC0900.m713(obj, "Cannot use select clauses on the same object: "));
                        return;
                    }
                }
            }
        }
        c6202.f15320.invoke(obj, this, c6202.f15318);
        if (this.f15311 != AbstractC6204.f15327) {
            AbstractC9322.f23936.putObjectVolatile(this, j, c6202);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.f15313;
            arrayList2.getClass();
            arrayList2.add(c6202);
        }
        c6202.f15323 = this.f15314;
        c6202.f15322 = this.f15312;
        this.f15314 = null;
        this.f15312 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        r0 = r10.m11099();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        return r9;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10977(InterfaceC5189 interfaceC5189) throws DispatchException {
        C6276 c6276;
        C6276 c62762 = new C6276(1, AbstractC3400.m5624(interfaceC5189));
        c62762.m11102();
        loop0: while (true) {
            f15309.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15310;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            C6008 c6008 = C6008.f15084;
            C6276 c62763 = c62762;
            C5317 c5317 = AbstractC6204.f15330;
            if (objectVolatile == c5317) {
                C6276 c62764 = c62763;
                while (true) {
                    Unsafe unsafe2 = AbstractC9322.f23936;
                    c6276 = c62764;
                    if (unsafe2.compareAndSwapObject(this, f15310, objectVolatile, c62764)) {
                        c6276.m11101(this);
                        break loop0;
                    }
                    if (unsafe2.getObjectVolatile(this, j) != objectVolatile) {
                        break;
                    }
                    c62764 = c6276;
                }
                c62762 = c6276;
            } else {
                c6276 = c62763;
                if (objectVolatile instanceof List) {
                    while (true) {
                        Unsafe unsafe3 = AbstractC9322.f23936;
                        if (unsafe3.compareAndSwapObject(this, f15310, objectVolatile, c5317)) {
                            Iterator it = ((Iterable) objectVolatile).iterator();
                            while (it.hasNext()) {
                                C6202 c6202M10983 = m10983(it.next());
                                c6202M10983.getClass();
                                c6202M10983.f15323 = null;
                                c6202M10983.f15322 = -1;
                                m10976(c6202M10983, true);
                            }
                        } else if (unsafe3.getObjectVolatile(this, j) != objectVolatile) {
                            break;
                        }
                    }
                    c62762 = c6276;
                } else {
                    if (!(objectVolatile instanceof C6202)) {
                        C5043.m9151(objectVolatile, "unexpected state: ");
                        return null;
                    }
                    C6202 c6202 = (C6202) objectVolatile;
                    Object obj = this.f15311;
                    InterfaceC7380 interfaceC7380 = c6202.f15316;
                    c6276.mo10993(c6008, interfaceC7380 != null ? (InterfaceC7380) interfaceC7380.invoke(this, c6202.f15318, obj) : null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Object m10978(ContinuationImpl continuationImpl) {
        return m10981() ? m10979(continuationImpl) : m10982(continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m10979(ContinuationImpl continuationImpl) {
        f15309.getClass();
        Object objectVolatile = AbstractC9322.f23936.getObjectVolatile(this, f15310);
        objectVolatile.getClass();
        C6202 c6202 = (C6202) objectVolatile;
        Object obj = this.f15311;
        m10973(c6202);
        InterfaceC7380 interfaceC7380 = c6202.f15319;
        Object obj2 = c6202.f15321;
        Object obj3 = c6202.f15318;
        Object objInvoke = interfaceC7380.invoke(obj2, obj3, obj);
        InterfaceC7692 interfaceC7692 = c6202.f15317;
        return obj3 == AbstractC6204.f15326 ? ((InterfaceC7387) interfaceC7692).invoke(continuationImpl) : ((InterfaceC7383) interfaceC7692).invoke(objInvoke, continuationImpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m10980(C1171 c1171, InterfaceC7383 interfaceC7383) {
        m10976(new C6202(this, (C6022) c1171.f1440, (InterfaceC7380) c1171.f1441, (InterfaceC7380) c1171.f1439, null, (SuspendLambda) interfaceC7383, (InterfaceC7380) c1171.f1438), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m10981() {
        f15309.getClass();
        return AbstractC9322.f23936.getObjectVolatile(this, f15310) instanceof C6202;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10982(ContinuationImpl continuationImpl) {
        SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1;
        if (continuationImpl instanceof SelectImplementation$doSelectSuspend$1) {
            selectImplementation$doSelectSuspend$1 = (SelectImplementation$doSelectSuspend$1) continuationImpl;
            int i = selectImplementation$doSelectSuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                selectImplementation$doSelectSuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuationImpl);
            }
        }
        Object obj = selectImplementation$doSelectSuspend$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = selectImplementation$doSelectSuspend$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            selectImplementation$doSelectSuspend$1.label = 1;
            if (m10977(selectImplementation$doSelectSuspend$1) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return obj;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        selectImplementation$doSelectSuspend$1.label = 2;
        Object objM10979 = m10979(selectImplementation$doSelectSuspend$1);
        return objM10979 == obj2 ? obj2 : objM10979;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C6202 m10983(Object obj) {
        Object next;
        ArrayList arrayList = this.f15313;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C6202) next).f15321 == obj) {
                break;
            }
        }
        C6202 c6202 = (C6202) next;
        if (c6202 != null) {
            return c6202;
        }
        C5043.m9178(obj, "Clause with object ", " is not found");
        return null;
    }
}
