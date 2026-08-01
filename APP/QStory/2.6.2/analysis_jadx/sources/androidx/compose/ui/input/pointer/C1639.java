package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.layout.InterfaceC1695;
import java.util.List;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;
import p232.C8064;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1639 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C1640 f4793;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C1652 f4794;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public PointerInteropFilter$DispatchToViewState f4795 = PointerInteropFilter$DispatchToViewState.Unknown;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC1695 f4796;

    public C1639(C1640 c1640) {
        this.f4793 = c1640;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3008(C1652 c1652) {
        if (this.f4795 == PointerInteropFilter$DispatchToViewState.Dispatching) {
            InterfaceC1695 interfaceC1695 = this.f4796;
            if (interfaceC1695 == null) {
                C5919.m11250("layoutCoordinates not set");
                return;
            } else {
                long jMo3066 = interfaceC1695.mo3066(0L);
                final C1640 c1640 = this.f4793;
                AbstractC1646.m3023(c1652, jMo3066, new InterfaceC6557() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$stopDispatching$1
                    {
                        super(1);
                    }

                    public final void invoke(MotionEvent motionEvent) {
                        InterfaceC6557 interfaceC6557 = c1640.f4800;
                        if (interfaceC6557 != null) {
                            interfaceC6557.invoke(motionEvent);
                        } else {
                            AbstractC4394.m8918("onTouchEvent");
                            throw null;
                        }
                    }

                    @Override // p052.InterfaceC6557
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((MotionEvent) obj);
                        return C5175.f14739;
                    }
                }, true);
            }
        }
        this.f4795 = PointerInteropFilter$DispatchToViewState.NotDispatching;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3009(C1652 c1652, PointerEventPass pointerEventPass) {
        boolean z;
        boolean z2;
        boolean z3;
        List list = c1652.f4851;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1643 c1643 = (C1643) list.get(i);
            if (AbstractC1646.m3019(c1643) || AbstractC1646.m3017(c1643)) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((C1643) list.get(i2)).m3012()) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        C1640 c1640 = this.f4793;
        if (c1640.f4799) {
            z3 = true;
        } else {
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                if (i3 < size3) {
                    C1643 c16432 = (C1643) list.get(i3);
                    if (AbstractC1646.m3019(c16432) || AbstractC1646.m3017(c16432)) {
                        break;
                    } else {
                        i3++;
                    }
                } else if (z2) {
                    break;
                } else {
                    z3 = false;
                }
            }
            z3 = true;
        }
        if (this.f4795 != PointerInteropFilter$DispatchToViewState.NotDispatching) {
            if (pointerEventPass == PointerEventPass.Initial && z3) {
                this.f4794 = c1652;
                m3011(c1652, !z || c1640.f4799);
            }
            if (pointerEventPass == PointerEventPass.Main && z && c1652 == this.f4794 && c1640.f4799) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((C1643) list.get(i4)).m3014();
                }
            }
            if (pointerEventPass == PointerEventPass.Final && !z3 && c1652 != this.f4794) {
                m3011(c1652, true);
            }
        }
        if (pointerEventPass == PointerEventPass.Final) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    this.f4795 = PointerInteropFilter$DispatchToViewState.Unknown;
                    c1640.f4799 = false;
                    this.f4794 = null;
                    break;
                } else if (!AbstractC1646.m3017((C1643) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (c1652 == this.f4794 && z) {
                int size6 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        break;
                    }
                    if (!((C1643) list.get(i6)).m3012()) {
                        i6++;
                    } else if (!c1640.f4799) {
                        m3008(c1652);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((C1643) list.get(i7)).m3014();
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3010() {
        if (this.f4795 == PointerInteropFilter$DispatchToViewState.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final C1640 c1640 = this.f4793;
            InterfaceC6557 interfaceC6557 = new InterfaceC6557() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                public final void invoke(MotionEvent motionEvent) {
                    InterfaceC6557 interfaceC65572 = c1640.f4800;
                    if (interfaceC65572 != null) {
                        interfaceC65572.invoke(motionEvent);
                    } else {
                        AbstractC4394.m8918("onTouchEvent");
                        throw null;
                    }
                }

                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MotionEvent) obj);
                    return C5175.f14739;
                }
            };
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            interfaceC6557.invoke(motionEventObtain);
            motionEventObtain.recycle();
            this.f4795 = PointerInteropFilter$DispatchToViewState.Unknown;
            c1640.f4799 = false;
            this.f4794 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3011(C1652 c1652, boolean z) {
        List list = c1652.f4851;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C1643) list.get(i)).m3012()) {
                m3008(c1652);
                return;
            }
        }
        InterfaceC1695 interfaceC1695 = this.f4796;
        if (interfaceC1695 == null) {
            C5919.m11250("layoutCoordinates not set");
            return;
        }
        long jMo3066 = interfaceC1695.mo3066(0L);
        final C1640 c1640 = this.f4793;
        AbstractC1646.m3023(c1652, jMo3066, new InterfaceC6557() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    InterfaceC6557 interfaceC6557 = c1640.f4800;
                    if (interfaceC6557 != null) {
                        interfaceC6557.invoke(motionEvent);
                        return;
                    } else {
                        AbstractC4394.m8918("onTouchEvent");
                        throw null;
                    }
                }
                C1639 c1639 = this.this$0;
                InterfaceC6557 interfaceC65572 = c1640.f4800;
                if (interfaceC65572 != null) {
                    c1639.f4795 = ((Boolean) interfaceC65572.invoke(motionEvent)).booleanValue() ? PointerInteropFilter$DispatchToViewState.Dispatching : PointerInteropFilter$DispatchToViewState.NotDispatching;
                } else {
                    AbstractC4394.m8918("onTouchEvent");
                    throw null;
                }
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((MotionEvent) obj);
                return C5175.f14739;
            }
        }, false);
        if (this.f4795 == PointerInteropFilter$DispatchToViewState.Dispatching) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C1643) list.get(i2)).m3014();
                }
            }
            C8064 c8064 = c1652.f4850;
            if (c8064 != null) {
                c8064.f22247 = !c1640.f4799;
            }
        }
    }
}
