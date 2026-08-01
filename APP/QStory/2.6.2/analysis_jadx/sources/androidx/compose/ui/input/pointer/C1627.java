package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1796;
import com.bumptech.glide.AbstractC3054;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5175;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.C4361;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DispatchException;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1627 extends AbstractC2128 implements InterfaceC1635, InterfaceC7895, InterfaceC1796 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C1652 f4750;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C1224 f4751;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public long f4752;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Object f4753;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C1224 f4754;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C1224 f4755;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C1652 f4756 = AbstractC1622.f4744;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C5416 f4757;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public PointerInputEventHandler f4758;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public Object f4759;

    public C1627(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f4753 = obj;
        this.f4759 = obj2;
        this.f4758 = pointerInputEventHandler;
        C1224 c1224 = new C1224(0, new C1621[16]);
        this.f4755 = c1224;
        this.f4754 = c1224;
        this.f4751 = new C1224(0, new C1621[16]);
        this.f4752 = 0L;
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1214() {
        C1652 c1652 = this.f4750;
        if (c1652 == null) {
            return;
        }
        List list = c1652.f4851;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C1643) list.get(i)).f4805) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C1643 c1643 = (C1643) list.get(i2);
                    long j = c1643.f4808;
                    long j2 = c1643.f4806;
                    long j3 = c1643.f4807;
                    float f = c1643.f4804;
                    boolean z = c1643.f4805;
                    arrayList.add(new C1643(j, j3, j2, false, f, j3, j2, z, z, c1643.f4818, 0L, 1.0f, 0L));
                }
                C1652 c16522 = new C1652(arrayList, null);
                this.f4756 = c16522;
                m2997(c16522, PointerEventPass.Initial);
                m2997(c16522, PointerEventPass.Main);
                m2997(c16522, PointerEventPass.Final);
                this.f4750 = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1281(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        this.f4752 = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.f4756 = c1652;
        }
        if (this.f4757 == null) {
            this.f4757 = AbstractC5398.m10473(m3857(), null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1);
        }
        m2997(c1652, pointerEventPass);
        List list = c1652.f4851;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1652 = null;
                break;
            } else if (!AbstractC1646.m3017((C1643) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.f4750 = c1652;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final Object m2995(InterfaceC6553 interfaceC6553, InterfaceC4356 interfaceC4356) {
        C5443 c5443 = new C5443(1, AbstractC3054.m6602(interfaceC4356));
        c5443.m10539();
        final C1621 c1621 = new C1621(this, c5443);
        synchronized (this.f4754) {
            this.f4755.m2037(c1621);
            new C4361(AbstractC3054.m6602(AbstractC3054.m6617(interfaceC6553, c1621, c1621)), CoroutineSingletons.COROUTINE_SUSPENDED).resumeWith(Result.m8755constructorimpl(C5175.f14739));
        }
        c5443.m10537(new InterfaceC6557() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            {
                super(1);
            }

            public final void invoke(Throwable th) throws DispatchException {
                C1621 c16212 = c1621;
                C5443 c54432 = c16212.f4742;
                if (c54432 != null) {
                    c54432.mo10431(th);
                }
                c16212.f4742 = null;
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws DispatchException {
                invoke((Throwable) obj);
                return C5175.f14739;
            }
        });
        return c5443.m10536();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final void m2996() {
        C5416 c5416 = this.f4757;
        if (c5416 != null) {
            c5416.mo10281(new PointerInputResetException());
            this.f4757 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m2997(C1652 c1652, PointerEventPass pointerEventPass) {
        C5443 c5443;
        C5443 c54432;
        synchronized (this.f4754) {
            C1224 c1224 = this.f4751;
            c1224.m2036(c1224.f3519, this.f4755);
        }
        try {
            int i = AbstractC1628.f4760[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                C1224 c12242 = this.f4751;
                Object[] objArr = c12242.f3520;
                int i2 = c12242.f3519;
                for (int i3 = 0; i3 < i2; i3++) {
                    C1621 c1621 = (C1621) objArr[i3];
                    if (pointerEventPass == c1621.f4739 && (c5443 = c1621.f4742) != null) {
                        c1621.f4742 = null;
                        c5443.resumeWith(Result.m8755constructorimpl(c1652));
                    }
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                C1224 c12243 = this.f4751;
                int i4 = c12243.f3519 - 1;
                Object[] objArr2 = c12243.f3520;
                if (i4 < objArr2.length) {
                    while (i4 >= 0) {
                        C1621 c16212 = (C1621) objArr2[i4];
                        if (pointerEventPass == c16212.f4739 && (c54432 = c16212.f4742) != null) {
                            c16212.f4742 = null;
                            c54432.resumeWith(Result.m8755constructorimpl(c1652));
                        }
                        i4--;
                    }
                }
            }
            this.f4751.m2042();
        } catch (Throwable th) {
            this.f4751.m2042();
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final void mo2998() {
        m2996();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        m2996();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1246() {
        return AbstractC1785.m3336(this).f5098.mo1246();
    }

    @Override // androidx.compose.ui.node.InterfaceC1787, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1286() {
        m2996();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1247() {
        return AbstractC1785.m3336(this).f5098.mo1247();
    }
}
