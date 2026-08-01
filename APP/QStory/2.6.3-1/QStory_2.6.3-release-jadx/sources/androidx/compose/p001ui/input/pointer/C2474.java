package androidx.compose.p001ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.p001ui.layout.InterfaceC2530;
import java.util.List;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;
import p248.C8894;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2474 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C2475 f5139;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2487 f5140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public PointerInteropFilter$DispatchToViewState f5141 = PointerInteropFilter$DispatchToViewState.Unknown;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC2530 f5142;

    public C2474(C2475 c2475) {
        this.f5139 = c2475;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3578(C2487 c2487) {
        if (this.f5141 == PointerInteropFilter$DispatchToViewState.Dispatching) {
            InterfaceC2530 interfaceC2530 = this.f5142;
            if (interfaceC2530 == null) {
                C6755.m11870("layoutCoordinates not set");
                return;
            } else {
                long jMo3636 = interfaceC2530.mo3636(0L);
                final C2475 c2475 = this.f5139;
                AbstractC2481.m3593(c2487, jMo3636, new InterfaceC7387() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$stopDispatching$1
                    {
                        super(1);
                    }

                    public final void invoke(MotionEvent motionEvent) {
                        InterfaceC7387 interfaceC7387 = c2475.f5146;
                        if (interfaceC7387 != null) {
                            interfaceC7387.invoke(motionEvent);
                        } else {
                            AbstractC5227.m9467("onTouchEvent");
                            throw null;
                        }
                    }

                    @Override // p068.InterfaceC7387
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((MotionEvent) obj);
                        return C6008.f15084;
                    }
                }, true);
            }
        }
        this.f5141 = PointerInteropFilter$DispatchToViewState.NotDispatching;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3579(C2487 c2487, PointerEventPass pointerEventPass) {
        boolean z;
        boolean z2;
        boolean z3;
        List list = c2487.f5197;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2478 c2478 = (C2478) list.get(i);
            if (AbstractC2481.m3589(c2478) || AbstractC2481.m3587(c2478)) {
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
            if (((C2478) list.get(i2)).m3582()) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        C2475 c2475 = this.f5139;
        if (c2475.f5145) {
            z3 = true;
        } else {
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                if (i3 < size3) {
                    C2478 c24782 = (C2478) list.get(i3);
                    if (AbstractC2481.m3589(c24782) || AbstractC2481.m3587(c24782)) {
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
        if (this.f5141 != PointerInteropFilter$DispatchToViewState.NotDispatching) {
            if (pointerEventPass == PointerEventPass.Initial && z3) {
                this.f5140 = c2487;
                m3581(c2487, !z || c2475.f5145);
            }
            if (pointerEventPass == PointerEventPass.Main && z && c2487 == this.f5140 && c2475.f5145) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((C2478) list.get(i4)).m3584();
                }
            }
            if (pointerEventPass == PointerEventPass.Final && !z3 && c2487 != this.f5140) {
                m3581(c2487, true);
            }
        }
        if (pointerEventPass == PointerEventPass.Final) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    this.f5141 = PointerInteropFilter$DispatchToViewState.Unknown;
                    c2475.f5145 = false;
                    this.f5140 = null;
                    break;
                } else if (!AbstractC2481.m3587((C2478) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (c2487 == this.f5140 && z) {
                int size6 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        break;
                    }
                    if (!((C2478) list.get(i6)).m3582()) {
                        i6++;
                    } else if (!c2475.f5145) {
                        m3578(c2487);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((C2478) list.get(i7)).m3584();
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3580() {
        if (this.f5141 == PointerInteropFilter$DispatchToViewState.Dispatching) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final C2475 c2475 = this.f5139;
            InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                public final void invoke(MotionEvent motionEvent) {
                    InterfaceC7387 interfaceC73872 = c2475.f5146;
                    if (interfaceC73872 != null) {
                        interfaceC73872.invoke(motionEvent);
                    } else {
                        AbstractC5227.m9467("onTouchEvent");
                        throw null;
                    }
                }

                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MotionEvent) obj);
                    return C6008.f15084;
                }
            };
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            interfaceC7387.invoke(motionEventObtain);
            motionEventObtain.recycle();
            this.f5141 = PointerInteropFilter$DispatchToViewState.Unknown;
            c2475.f5145 = false;
            this.f5140 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3581(C2487 c2487, boolean z) {
        List list = c2487.f5197;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C2478) list.get(i)).m3582()) {
                m3578(c2487);
                return;
            }
        }
        InterfaceC2530 interfaceC2530 = this.f5142;
        if (interfaceC2530 == null) {
            C6755.m11870("layoutCoordinates not set");
            return;
        }
        long jMo3636 = interfaceC2530.mo3636(0L);
        final C2475 c2475 = this.f5139;
        AbstractC2481.m3593(c2487, jMo3636, new InterfaceC7387() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    InterfaceC7387 interfaceC7387 = c2475.f5146;
                    if (interfaceC7387 != null) {
                        interfaceC7387.invoke(motionEvent);
                        return;
                    } else {
                        AbstractC5227.m9467("onTouchEvent");
                        throw null;
                    }
                }
                C2474 c2474 = this.this$0;
                InterfaceC7387 interfaceC73872 = c2475.f5146;
                if (interfaceC73872 != null) {
                    c2474.f5141 = ((Boolean) interfaceC73872.invoke(motionEvent)).booleanValue() ? PointerInteropFilter$DispatchToViewState.Dispatching : PointerInteropFilter$DispatchToViewState.NotDispatching;
                } else {
                    AbstractC5227.m9467("onTouchEvent");
                    throw null;
                }
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((MotionEvent) obj);
                return C6008.f15084;
            }
        }, false);
        if (this.f5141 == PointerInteropFilter$DispatchToViewState.Dispatching) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C2478) list.get(i2)).m3584();
                }
            }
            C8894 c8894 = c2487.f5196;
            if (c8894 != null) {
                c8894.f22590 = !c2475.f5145;
            }
        }
    }
}
