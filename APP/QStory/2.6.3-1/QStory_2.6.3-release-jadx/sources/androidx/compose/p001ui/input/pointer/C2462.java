package androidx.compose.p001ui.input.pointer;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2631;
import androidx.compose.runtime.collection.C2059;
import androidx.window.area.AbstractC3400;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6008;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.C5194;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DispatchException;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2462 extends AbstractC2961 implements InterfaceC2470, InterfaceC8725, InterfaceC2631 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C2487 f5096;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C2059 f5097;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public long f5098;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Object f5099;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C2059 f5100;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C2059 f5101;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C2487 f5102 = AbstractC2457.f5090;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C6249 f5103;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public PointerInputEventHandler f5104;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public Object f5105;

    public C2462(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f5099 = obj;
        this.f5105 = obj2;
        this.f5104 = pointerInputEventHandler;
        C2059 c2059 = new C2059(0, new C2456[16]);
        this.f5101 = c2059;
        this.f5100 = c2059;
        this.f5097 = new C2059(0, new C2456[16]);
        this.f5098 = 0L;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1784() {
        C2487 c2487 = this.f5096;
        if (c2487 == null) {
            return;
        }
        List list = c2487.f5197;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C2478) list.get(i)).f5151) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C2478 c2478 = (C2478) list.get(i2);
                    long j = c2478.f5154;
                    long j2 = c2478.f5152;
                    long j3 = c2478.f5153;
                    float f = c2478.f5150;
                    boolean z = c2478.f5151;
                    arrayList.add(new C2478(j, j3, j2, false, f, j3, j2, z, z, c2478.f5164, 0L, 1.0f, 0L));
                }
                C2487 c24872 = new C2487(arrayList, null);
                this.f5102 = c24872;
                m3567(c24872, PointerEventPass.Initial);
                m3567(c24872, PointerEventPass.Main);
                m3567(c24872, PointerEventPass.Final);
                this.f5096 = null;
                return;
            }
        }
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1851(C2487 c2487, PointerEventPass pointerEventPass, long j) {
        this.f5098 = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.f5102 = c2487;
        }
        if (this.f5103 == null) {
            this.f5103 = AbstractC6231.m11036(m4427(), null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1);
        }
        m3567(c2487, pointerEventPass);
        List list = c2487.f5197;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c2487 = null;
                break;
            } else if (!AbstractC2481.m3587((C2478) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.f5096 = c2487;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final Object m3565(InterfaceC7383 interfaceC7383, InterfaceC5189 interfaceC5189) {
        C6276 c6276 = new C6276(1, AbstractC3400.m5624(interfaceC5189));
        c6276.m11102();
        final C2456 c2456 = new C2456(this, c6276);
        synchronized (this.f5100) {
            this.f5101.m2607(c2456);
            new C5194(AbstractC3400.m5624(AbstractC3400.m5651(interfaceC7383, c2456, c2456)), CoroutineSingletons.COROUTINE_SUSPENDED).resumeWith(Result.m9304constructorimpl(C6008.f15084));
        }
        c6276.m11100(new InterfaceC7387() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            {
                super(1);
            }

            public final void invoke(Throwable th) throws DispatchException {
                C2456 c24562 = c2456;
                C6276 c62762 = c24562.f5088;
                if (c62762 != null) {
                    c62762.mo10994(th);
                }
                c24562.f5088 = null;
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws DispatchException {
                invoke((Throwable) obj);
                return C6008.f15084;
            }
        });
        return c6276.m11099();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final void m3566() {
        C6249 c6249 = this.f5103;
        if (c6249 != null) {
            c6249.mo10844(new PointerInputResetException());
            this.f5103 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m3567(C2487 c2487, PointerEventPass pointerEventPass) {
        C6276 c6276;
        C6276 c62762;
        synchronized (this.f5100) {
            C2059 c2059 = this.f5097;
            c2059.m2606(c2059.f3865, this.f5101);
        }
        try {
            int i = AbstractC2463.f5106[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                C2059 c20592 = this.f5097;
                Object[] objArr = c20592.f3866;
                int i2 = c20592.f3865;
                for (int i3 = 0; i3 < i2; i3++) {
                    C2456 c2456 = (C2456) objArr[i3];
                    if (pointerEventPass == c2456.f5085 && (c6276 = c2456.f5088) != null) {
                        c2456.f5088 = null;
                        c6276.resumeWith(Result.m9304constructorimpl(c2487));
                    }
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                C2059 c20593 = this.f5097;
                int i4 = c20593.f3865 - 1;
                Object[] objArr2 = c20593.f3866;
                if (i4 < objArr2.length) {
                    while (i4 >= 0) {
                        C2456 c24562 = (C2456) objArr2[i4];
                        if (pointerEventPass == c24562.f5085 && (c62762 = c24562.f5088) != null) {
                            c24562.f5088 = null;
                            c62762.resumeWith(Result.m9304constructorimpl(c2487));
                        }
                        i4--;
                    }
                }
            }
            this.f5097.m2612();
        } catch (Throwable th) {
            this.f5097.m2612();
            throw th;
        }
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final void mo3568() {
        m3566();
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        m3566();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return AbstractC2620.m3906(this).f5444.mo1816();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2622, androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1856() {
        m3566();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return AbstractC2620.m3906(this).f5444.mo1817();
    }
}
