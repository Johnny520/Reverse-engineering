package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import p000.AbstractC0688ry;
import p000.C0401k7;
import p000.C0592pc;
import p000.C0674rk;
import p000.hb0;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends hb0 {

    /* JADX INFO: renamed from: i */
    public final C0674rk f399i;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1766a = new int[32];
        this.f1771f = new HashMap();
        this.f1768c = context;
        super.mo1013e(attributeSet);
        C0674rk c0674rk = new C0674rk();
        c0674rk.f4305f0 = 0;
        c0674rk.f4306g0 = 0;
        c0674rk.f4307h0 = 0;
        c0674rk.f4308i0 = 0;
        c0674rk.f4309j0 = 0;
        c0674rk.f4310k0 = 0;
        c0674rk.f4311l0 = false;
        c0674rk.f4312m0 = 0;
        c0674rk.f4313n0 = 0;
        c0674rk.f4314o0 = new C0401k7();
        c0674rk.f4315p0 = null;
        c0674rk.f4316q0 = -1;
        c0674rk.f4317r0 = -1;
        c0674rk.f4318s0 = -1;
        c0674rk.f4319t0 = -1;
        c0674rk.f4320u0 = -1;
        c0674rk.f4321v0 = -1;
        c0674rk.f4322w0 = 0.5f;
        c0674rk.f4323x0 = 0.5f;
        c0674rk.f4324y0 = 0.5f;
        c0674rk.f4325z0 = 0.5f;
        c0674rk.f4290A0 = 0.5f;
        c0674rk.f4291B0 = 0.5f;
        c0674rk.f4292C0 = 0;
        c0674rk.f4293D0 = 0;
        c0674rk.f4294E0 = 2;
        c0674rk.f4295F0 = 2;
        c0674rk.f4296G0 = 0;
        c0674rk.f4297H0 = -1;
        c0674rk.f4298I0 = 0;
        c0674rk.f4299J0 = new ArrayList();
        c0674rk.f4300K0 = null;
        c0674rk.f4301L0 = null;
        c0674rk.f4302M0 = null;
        c0674rk.f4304O0 = 0;
        this.f399i = c0674rk;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0688ry.f4350b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f399i.f4298I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C0674rk c0674rk2 = this.f399i;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0674rk2.f4305f0 = dimensionPixelSize;
                    c0674rk2.f4306g0 = dimensionPixelSize;
                    c0674rk2.f4307h0 = dimensionPixelSize;
                    c0674rk2.f4308i0 = dimensionPixelSize;
                } else if (index == 11) {
                    C0674rk c0674rk3 = this.f399i;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0674rk3.f4307h0 = dimensionPixelSize2;
                    c0674rk3.f4309j0 = dimensionPixelSize2;
                    c0674rk3.f4310k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f399i.f4308i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f399i.f4309j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f399i.f4305f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f399i.f4310k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f399i.f4306g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f399i.f4296G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f399i.f4316q0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f399i.f4317r0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f399i.f4318s0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f399i.f4320u0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f399i.f4319t0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f399i.f4321v0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f399i.f4322w0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f399i.f4324y0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f399i.f4290A0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f399i.f4325z0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f399i.f4291B0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f399i.f4323x0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f399i.f4294E0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f399i.f4295F0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f399i.f4292C0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f399i.f4293D0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f399i.f4297H0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f1769d = this.f399i;
        m1014g();
    }

    @Override // p000.AbstractC0182ec
    /* JADX INFO: renamed from: f */
    public final void mo206f(C0592pc c0592pc, boolean z) {
        C0674rk c0674rk = this.f399i;
        int i = c0674rk.f4307h0;
        if (i > 0 || c0674rk.f4308i0 > 0) {
            if (z) {
                c0674rk.f4309j0 = c0674rk.f4308i0;
                c0674rk.f4310k0 = i;
            } else {
                c0674rk.f4309j0 = i;
                c0674rk.f4310k0 = c0674rk.f4308i0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x00dd A[EDGE_INSN: B:338:0x00dd->B:64:0x00dd BREAK  A[LOOP:1: B:58:0x00c6->B:63:0x00d8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0106  */
    @Override // p000.hb0
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo207h(p000.C0674rk r37, int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.mo207h(rk, int, int):void");
    }

    @Override // p000.AbstractC0182ec, android.view.View
    public final void onMeasure(int i, int i2) {
        mo207h(this.f399i, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f399i.f4324y0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f399i.f4318s0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f399i.f4325z0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f399i.f4319t0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f399i.f4294E0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f399i.f4322w0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f399i.f4292C0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f399i.f4316q0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f399i.f4297H0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f399i.f4298I0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C0674rk c0674rk = this.f399i;
        c0674rk.f4305f0 = i;
        c0674rk.f4306g0 = i;
        c0674rk.f4307h0 = i;
        c0674rk.f4308i0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f399i.f4306g0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f399i.f4309j0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f399i.f4310k0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f399i.f4305f0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f399i.f4295F0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f399i.f4323x0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f399i.f4293D0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f399i.f4317r0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f399i.f4296G0 = i;
        requestLayout();
    }
}
