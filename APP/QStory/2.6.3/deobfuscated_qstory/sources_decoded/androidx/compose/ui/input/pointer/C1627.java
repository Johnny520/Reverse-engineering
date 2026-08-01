package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1796;
import androidx.window.area.AbstractC2567;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5176;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.C4362;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.C5444;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DispatchException;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1627 extends AbstractC2128 implements InterfaceC1635, InterfaceC7896, InterfaceC1796 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C1652 f4751;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C1224 f4752;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public long f4753;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Object f4754;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C1224 f4755;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C1224 f4756;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C1652 f4757 = AbstractC1622.f4745;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C5417 f4758;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public PointerInputEventHandler f4759;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public Object f4760;

    public C1627(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f4754 = obj;
        this.f4760 = obj2;
        this.f4759 = pointerInputEventHandler;
        C1224 c1224 = new C1224(0, new C1621[16]);
        this.f4756 = c1224;
        this.f4755 = c1224;
        this.f4752 = new C1224(0, new C1621[16]);
        this.f4753 = 0L;
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1224() {
        C1652 c1652 = this.f4751;
        if (c1652 == null) {
            return;
        }
        List list = c1652.f4852;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C1643) list.get(i)).f4806) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C1643 c1643 = (C1643) list.get(i2);
                    long j = c1643.f4809;
                    long j2 = c1643.f4807;
                    long j3 = c1643.f4808;
                    float f = c1643.f4805;
                    boolean z = c1643.f4806;
                    arrayList.add(new C1643(j, j3, j2, false, f, j3, j2, z, z, c1643.f4819, 0L, 1.0f, 0L));
                }
                C1652 c16522 = new C1652(arrayList, null);
                this.f4757 = c16522;
                m3007(c16522, PointerEventPass.Initial);
                m3007(c16522, PointerEventPass.Main);
                m3007(c16522, PointerEventPass.Final);
                this.f4751 = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1291(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        this.f4753 = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.f4757 = c1652;
        }
        if (this.f4758 == null) {
            this.f4758 = AbstractC5399.m10477(m3867(), null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1);
        }
        m3007(c1652, pointerEventPass);
        List list = c1652.f4852;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1652 = null;
                break;
            } else if (!AbstractC1646.m3027((C1643) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.f4751 = c1652;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final Object m3005(InterfaceC6554 interfaceC6554, InterfaceC4357 interfaceC4357) {
        C5444 c5444 = new C5444(1, AbstractC2567.m5064(interfaceC4357));
        c5444.m10543();
        final C1621 c1621 = new C1621(this, c5444);
        synchronized (this.f4755) {
            this.f4756.m2047(c1621);
            new C4362(AbstractC2567.m5064(AbstractC2567.m5091(interfaceC6554, c1621, c1621)), CoroutineSingletons.COROUTINE_SUSPENDED).resumeWith(Result.m8745constructorimpl(C5176.f14739));
        }
        c5444.m10541(new InterfaceC6558() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            {
                super(1);
            }

            public final void invoke(Throwable th) throws DispatchException {
                C1621 c16212 = c1621;
                C5444 c54442 = c16212.f4743;
                if (c54442 != null) {
                    c54442.mo10435(th);
                }
                c16212.f4743 = null;
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws DispatchException {
                invoke((Throwable) obj);
                return C5176.f14739;
            }
        });
        return c5444.m10540();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final void m3006() {
        C5417 c5417 = this.f4758;
        if (c5417 != null) {
            c5417.mo10285(new PointerInputResetException());
            this.f4758 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m3007(C1652 c1652, PointerEventPass pointerEventPass) {
        C5444 c5444;
        C5444 c54442;
        synchronized (this.f4755) {
            C1224 c1224 = this.f4752;
            c1224.m2046(c1224.f3520, this.f4756);
        }
        try {
            int i = AbstractC1628.f4761[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                C1224 c12242 = this.f4752;
                Object[] objArr = c12242.f3521;
                int i2 = c12242.f3520;
                for (int i3 = 0; i3 < i2; i3++) {
                    C1621 c1621 = (C1621) objArr[i3];
                    if (pointerEventPass == c1621.f4740 && (c5444 = c1621.f4743) != null) {
                        c1621.f4743 = null;
                        c5444.resumeWith(Result.m8745constructorimpl(c1652));
                    }
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                C1224 c12243 = this.f4752;
                int i4 = c12243.f3520 - 1;
                Object[] objArr2 = c12243.f3521;
                if (i4 < objArr2.length) {
                    while (i4 >= 0) {
                        C1621 c16212 = (C1621) objArr2[i4];
                        if (pointerEventPass == c16212.f4740 && (c54442 = c16212.f4743) != null) {
                            c16212.f4743 = null;
                            c54442.resumeWith(Result.m8745constructorimpl(c1652));
                        }
                        i4--;
                    }
                }
            }
            this.f4752.m2052();
        } catch (Throwable th) {
            this.f4752.m2052();
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final void mo3008() {
        m3006();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1126() {
        m3006();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        return AbstractC1785.m3346(this).f5099.mo1256();
    }

    @Override // androidx.compose.ui.node.InterfaceC1787, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1296() {
        m3006();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        return AbstractC1785.m3346(this).f5099.mo1257();
    }
}
