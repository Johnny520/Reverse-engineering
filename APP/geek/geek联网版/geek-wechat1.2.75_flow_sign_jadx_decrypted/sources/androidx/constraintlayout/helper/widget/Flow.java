package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import p000.AbstractC0947yy;
import p000.C0747tk;
import p000.C0771u7;
import p000.C0925yc;
import p000.mb0;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends mb0 {

    /* JADX INFO: renamed from: i */
    public final C0747tk f362i;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3263a = new int[32];
        this.f3268f = new HashMap();
        this.f3265c = context;
        super.mo1819e(attributeSet);
        C0747tk c0747tk = new C0747tk();
        c0747tk.f4544f0 = 0;
        c0747tk.f4545g0 = 0;
        c0747tk.f4546h0 = 0;
        c0747tk.f4547i0 = 0;
        c0747tk.f4548j0 = 0;
        c0747tk.f4549k0 = 0;
        c0747tk.f4550l0 = false;
        c0747tk.f4551m0 = 0;
        c0747tk.f4552n0 = 0;
        c0747tk.f4553o0 = new C0771u7();
        c0747tk.f4554p0 = null;
        c0747tk.f4555q0 = -1;
        c0747tk.f4556r0 = -1;
        c0747tk.f4557s0 = -1;
        c0747tk.f4558t0 = -1;
        c0747tk.f4559u0 = -1;
        c0747tk.f4560v0 = -1;
        c0747tk.f4561w0 = 0.5f;
        c0747tk.f4562x0 = 0.5f;
        c0747tk.f4563y0 = 0.5f;
        c0747tk.f4564z0 = 0.5f;
        c0747tk.f4529A0 = 0.5f;
        c0747tk.f4530B0 = 0.5f;
        c0747tk.f4531C0 = 0;
        c0747tk.f4532D0 = 0;
        c0747tk.f4533E0 = 2;
        c0747tk.f4534F0 = 2;
        c0747tk.f4535G0 = 0;
        c0747tk.f4536H0 = -1;
        c0747tk.f4537I0 = 0;
        c0747tk.f4538J0 = new ArrayList();
        c0747tk.f4539K0 = null;
        c0747tk.f4540L0 = null;
        c0747tk.f4541M0 = null;
        c0747tk.f4543O0 = 0;
        this.f362i = c0747tk;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0947yy.f5510b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f362i.f4537I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C0747tk c0747tk2 = this.f362i;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0747tk2.f4544f0 = dimensionPixelSize;
                    c0747tk2.f4545g0 = dimensionPixelSize;
                    c0747tk2.f4546h0 = dimensionPixelSize;
                    c0747tk2.f4547i0 = dimensionPixelSize;
                } else if (index == 11) {
                    C0747tk c0747tk3 = this.f362i;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0747tk3.f4546h0 = dimensionPixelSize2;
                    c0747tk3.f4548j0 = dimensionPixelSize2;
                    c0747tk3.f4549k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f362i.f4547i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f362i.f4548j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f362i.f4544f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f362i.f4549k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f362i.f4545g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f362i.f4535G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f362i.f4555q0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f362i.f4556r0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f362i.f4557s0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f362i.f4559u0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f362i.f4558t0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f362i.f4560v0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f362i.f4561w0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f362i.f4563y0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f362i.f4529A0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f362i.f4564z0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f362i.f4530B0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f362i.f4562x0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f362i.f4533E0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f362i.f4534F0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f362i.f4531C0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f362i.f4532D0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f362i.f4536H0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f3266d = this.f362i;
        m1942g();
    }

    @Override // p000.AbstractC0517nc
    /* JADX INFO: renamed from: f */
    public final void mo191f(C0925yc c0925yc, boolean z) {
        C0747tk c0747tk = this.f362i;
        int i = c0747tk.f4546h0;
        if (i > 0 || c0747tk.f4547i0 > 0) {
            if (z) {
                c0747tk.f4548j0 = c0747tk.f4547i0;
                c0747tk.f4549k0 = i;
            } else {
                c0747tk.f4548j0 = i;
                c0747tk.f4549k0 = c0747tk.f4547i0;
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
    @Override // p000.mb0
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo192h(p000.C0747tk r37, int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.mo192h(tk, int, int):void");
    }

    @Override // p000.AbstractC0517nc, android.view.View
    public final void onMeasure(int i, int i2) {
        mo192h(this.f362i, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f362i.f4563y0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f362i.f4557s0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f362i.f4564z0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f362i.f4558t0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f362i.f4533E0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f362i.f4561w0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f362i.f4531C0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f362i.f4555q0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f362i.f4536H0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f362i.f4537I0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C0747tk c0747tk = this.f362i;
        c0747tk.f4544f0 = i;
        c0747tk.f4545g0 = i;
        c0747tk.f4546h0 = i;
        c0747tk.f4547i0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f362i.f4545g0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f362i.f4548j0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f362i.f4549k0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f362i.f4544f0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f362i.f4534F0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f362i.f4562x0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f362i.f4532D0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f362i.f4556r0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f362i.f4535G0 = i;
        requestLayout();
    }
}
