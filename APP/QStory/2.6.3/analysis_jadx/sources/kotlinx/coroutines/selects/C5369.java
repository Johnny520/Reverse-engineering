package kotlinx.coroutines.selects;

import androidx.activity.AbstractC0053;
import androidx.compose.animation.core.C0325;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.InterfaceC5398;
import kotlinx.coroutines.InterfaceC5446;
import kotlinx.coroutines.InterfaceC5447;
import kotlinx.coroutines.channels.C5190;
import kotlinx.coroutines.internal.AbstractC5361;
import p034.AbstractC6347;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6863;
import p291.AbstractC8493;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5369 implements InterfaceC5446, InterfaceC5375 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14964 = AtomicReferenceFieldUpdater.newUpdater(C5369.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ long f14965 = AbstractC8493.f23591.objectFieldOffset(C5369.class.getDeclaredField("state$volatile"));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f14969;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4360 f14970;
    private volatile /* synthetic */ Object state$volatile = AbstractC5372.f14985;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ArrayList f14968 = new ArrayList(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f14967 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f14966 = AbstractC5372.f14982;

    public C5369(InterfaceC4360 interfaceC4360) {
        this.f14970 = interfaceC4360;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m10414(C5370 c5370) {
        ArrayList<C5370> arrayList = this.f14968;
        if (arrayList == null) {
            return;
        }
        for (C5370 c53702 : arrayList) {
            if (c53702 != c5370) {
                c53702.m10425();
            }
        }
        f14964.getClass();
        AbstractC8493.f23591.putObjectVolatile(this, f14965, AbstractC5372.f14984);
        this.f14966 = AbstractC5372.f14982;
        this.f14968 = null;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC5368
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo10411(Object obj) {
        this.f14966 = obj;
    }

    @Override // kotlinx.coroutines.InterfaceC5446
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo10415(Throwable th) {
        C5369 c5369;
        while (true) {
            f14964.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f14965;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == AbstractC5372.f14984) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = AbstractC8493.f23591;
                c5369 = this;
                if (unsafe2.compareAndSwapObject(c5369, f14965, objectVolatile, AbstractC5372.f14983)) {
                    ArrayList arrayList = c5369.f14968;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C5370) it.next()).m10425();
                    }
                    c5369.f14966 = AbstractC5372.f14982;
                    c5369.f14968 = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(c5369, j) != objectVolatile) {
                    break;
                } else {
                    this = c5369;
                }
            }
            this = c5369;
        }
    }

    @Override // kotlinx.coroutines.selects.InterfaceC5368
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo10412(Object obj, Object obj2) {
        return m10416(obj, obj2) == 0;
    }

    @Override // kotlinx.coroutines.InterfaceC5412
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10263(AbstractC5361 abstractC5361, int i) {
        this.f14969 = abstractC5361;
        this.f14967 = i;
    }

    @Override // kotlinx.coroutines.selects.InterfaceC5368
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo10413(InterfaceC5398 interfaceC5398) {
        this.f14969 = interfaceC5398;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int m10416(Object obj, Object obj2) {
        C5369 c5369;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            f14964.getClass();
            Unsafe unsafe3 = AbstractC8493.f23591;
            long j = f14965;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof InterfaceC5447) {
                C5370 c5370M10424 = this.m10424(obj);
                if (c5370M10424 != null) {
                    InterfaceC6551 interfaceC6551 = c5370M10424.f14971;
                    InterfaceC6551 interfaceC65512 = interfaceC6551 != null ? (InterfaceC6551) interfaceC6551.invoke(this, c5370M10424.f14973, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = AbstractC8493.f23591;
                        c5369 = this;
                        if (unsafe4.compareAndSwapObject(c5369, f14965, objectVolatile, c5370M10424)) {
                            InterfaceC5447 interfaceC5447 = (InterfaceC5447) objectVolatile;
                            c5369.f14966 = obj2;
                            C4485 c4485Mo10436 = interfaceC5447.mo10436(C5176.f14739, interfaceC65512);
                            if (c4485Mo10436 == null) {
                                c5369.f14966 = AbstractC5372.f14982;
                                return 2;
                            }
                            interfaceC5447.mo10433(c4485Mo10436);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(c5369, j) != objectVolatile) {
                            break;
                        }
                        this = c5369;
                    }
                } else {
                    continue;
                }
            } else {
                c5369 = this;
                if (AbstractC4395.m8907(objectVolatile, AbstractC5372.f14984) || (objectVolatile instanceof C5370)) {
                    return 3;
                }
                if (AbstractC4395.m8907(objectVolatile, AbstractC5372.f14983)) {
                    return 2;
                }
                if (AbstractC4395.m8907(objectVolatile, AbstractC5372.f14985)) {
                    List listM11928 = AbstractC6347.m11928(obj);
                    do {
                        unsafe2 = AbstractC8493.f23591;
                        if (unsafe2.compareAndSwapObject(c5369, f14965, objectVolatile, listM11928)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(c5369, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        C4211.m8592(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    ArrayList arrayListM8794 = AbstractC4344.m8794((Collection) objectVolatile, obj);
                    do {
                        unsafe = AbstractC8493.f23591;
                        if (unsafe.compareAndSwapObject(c5369, f14965, objectVolatile, arrayListM8794)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(c5369, j) == objectVolatile);
                }
            }
            this = c5369;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m10417(C5370 c5370, boolean z) {
        Object obj = c5370.f14976;
        f14964.getClass();
        Unsafe unsafe = AbstractC8493.f23591;
        long j = f14965;
        if (unsafe.getObjectVolatile(this, j) instanceof C5370) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.f14968;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C5370) it.next()).f14976 == obj) {
                        C5925.m11312(AbstractC0053.m153(obj, "Cannot use select clauses on the same object: "));
                        return;
                    }
                }
            }
        }
        c5370.f14975.invoke(obj, this, c5370.f14973);
        if (this.f14966 != AbstractC5372.f14982) {
            AbstractC8493.f23591.putObjectVolatile(this, j, c5370);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.f14968;
            arrayList2.getClass();
            arrayList2.add(c5370);
        }
        c5370.f14978 = this.f14969;
        c5370.f14977 = this.f14967;
        this.f14969 = null;
        this.f14967 = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        r0 = r10.m10540();
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10418(kotlin.coroutines.InterfaceC4357 r13) throws kotlinx.coroutines.DispatchException {
        /*
            r12 = this;
            kotlinx.coroutines.飘花落叶言子楪苏兰世哲 r5 = new kotlinx.coroutines.飘花落叶言子楪苏兰世哲
            kotlin.coroutines.飘花落叶言子楪世哲苏兰 r0 = androidx.window.area.AbstractC2567.m5064(r13)
            r6 = 1
            r5.<init>(r6, r0)
            r5.m10543()
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.selects.C5369.f14964
            r0.getClass()
            sun.misc.Unsafe r0 = p291.AbstractC8493.f23591
            long r7 = kotlinx.coroutines.selects.C5369.f14965
            java.lang.Object r4 = r0.getObjectVolatile(r12, r7)
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5176.f14739
            r0 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r5 = kotlinx.coroutines.selects.AbstractC5372.f14985
            if (r4 != r5) goto L3b
            r5 = r0
        L22:
            sun.misc.Unsafe r0 = p291.AbstractC8493.f23591
            long r2 = kotlinx.coroutines.selects.C5369.f14965
            r1 = r12
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            r10 = r5
            if (r2 == 0) goto L32
            r10.m10542(r12)
            goto L8c
        L32:
            java.lang.Object r0 = r0.getObjectVolatile(r12, r7)
            if (r0 == r4) goto L39
            goto L72
        L39:
            r5 = r10
            goto L22
        L3b:
            r10 = r0
            boolean r0 = r4 instanceof java.util.List
            r11 = 0
            if (r0 == 0) goto L74
        L41:
            sun.misc.Unsafe r0 = p291.AbstractC8493.f23591
            long r2 = kotlinx.coroutines.selects.C5369.f14965
            r1 = r12
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L6c
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r0 = r4.iterator()
        L52:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r0.next()
            kotlinx.coroutines.selects.飘花落叶言子楪世哲兰苏 r2 = r12.m10424(r2)
            r2.getClass()
            r2.f14978 = r11
            r3 = -1
            r2.f14977 = r3
            r12.m10417(r2, r6)
            goto L52
        L6c:
            java.lang.Object r0 = r0.getObjectVolatile(r12, r7)
            if (r0 == r4) goto L41
        L72:
            r5 = r10
            goto Ld
        L74:
            boolean r0 = r4 instanceof kotlinx.coroutines.selects.C5370
            if (r0 == 0) goto L96
            kotlinx.coroutines.selects.飘花落叶言子楪世哲兰苏 r4 = (kotlinx.coroutines.selects.C5370) r4
            java.lang.Object r0 = r12.f14966
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r2 = r4.f14971
            if (r2 == 0) goto L89
            java.lang.Object r3 = r4.f14973
            java.lang.Object r0 = r2.invoke(r12, r3, r0)
            r11 = r0
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r11 = (p052.InterfaceC6551) r11
        L89:
            r10.mo10434(r9, r11)
        L8c:
            java.lang.Object r0 = r10.m10540()
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r0 != r1) goto L95
            return r0
        L95:
            return r9
        L96:
            java.lang.String r0 = "unexpected state: "
            io.ktor.util.C4211.m8592(r4, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.C5369.m10418(kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Object m10419(ContinuationImpl continuationImpl) {
        return m10422() ? m10420(continuationImpl) : m10423(continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m10420(ContinuationImpl continuationImpl) {
        f14964.getClass();
        Object objectVolatile = AbstractC8493.f23591.getObjectVolatile(this, f14965);
        objectVolatile.getClass();
        C5370 c5370 = (C5370) objectVolatile;
        Object obj = this.f14966;
        m10414(c5370);
        InterfaceC6551 interfaceC6551 = c5370.f14974;
        Object obj2 = c5370.f14976;
        Object obj3 = c5370.f14973;
        Object objInvoke = interfaceC6551.invoke(obj2, obj3, obj);
        InterfaceC6863 interfaceC6863 = c5370.f14972;
        return obj3 == AbstractC5372.f14981 ? ((InterfaceC6558) interfaceC6863).invoke(continuationImpl) : ((InterfaceC6554) interfaceC6863).invoke(objInvoke, continuationImpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m10421(C0325 c0325, InterfaceC6554 interfaceC6554) {
        m10417(new C5370(this, (C5190) c0325.f1095, (InterfaceC6551) c0325.f1096, (InterfaceC6551) c0325.f1094, null, (SuspendLambda) interfaceC6554, (InterfaceC6551) c0325.f1093), false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m10422() {
        f14964.getClass();
        return AbstractC8493.f23591.getObjectVolatile(this, f14965) instanceof C5370;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10423(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            kotlin.AbstractC5185.m10210(r6)
            return r6
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            r5 = 0
            return r5
        L31:
            kotlin.AbstractC5185.m10210(r6)
            goto L41
        L35:
            kotlin.AbstractC5185.m10210(r6)
            r0.label = r4
            java.lang.Object r6 = r5.m10418(r0)
            if (r6 != r1) goto L41
            goto L49
        L41:
            r0.label = r3
            java.lang.Object r5 = r5.m10420(r0)
            if (r5 != r1) goto L4a
        L49:
            return r1
        L4a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.C5369.m10423(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C5370 m10424(Object obj) {
        Object next;
        ArrayList arrayList = this.f14968;
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
            if (((C5370) next).f14976 == obj) {
                break;
            }
        }
        C5370 c5370 = (C5370) next;
        if (c5370 != null) {
            return c5370;
        }
        C4211.m8619(obj, "Clause with object ", " is not found");
        return null;
    }
}
