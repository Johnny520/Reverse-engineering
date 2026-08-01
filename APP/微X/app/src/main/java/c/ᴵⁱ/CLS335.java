// Decompiled by JEB v5.42.0.202606242140

package c.ᴵⁱ;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import c.ـᵎ.CLS274;
import java.util.Arrays;

public class CLS335 {
    public class CLS332 implements Runnable {
        public final CLS335 FLD1513;

        @Override
        public void run() {
            CLS335.this.MTH4827(0);
        }
    }

    public static final class CLS333 implements Interpolator {
        @Override  // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) + 1.0f;
        }
    }

    public static abstract class CLS334 {
        public abstract int MTH4774(View arg1, int arg2, int arg3);

        public abstract void MTH4775(View arg1, float arg2, float arg3);

        public int MTH4776(View view0) [...] // Inlined contents

        public abstract int MTH4777(View arg1, int arg2, int arg3);

        public abstract void MTH4778(View arg1, int arg2, int arg3, int arg4, int arg5);

        public abstract void MTH4779(View arg1, int arg2);

        public abstract void MTH4780(int arg1);

        public abstract boolean MTH4781(View arg1, int arg2);

        public int MTH4782(int v) [...] // Inlined contents

        public abstract boolean MTH4783(int arg1);

        public abstract void MTH4784(int arg1, int arg2);

        public abstract void MTH4785(int arg1, int arg2);

        public abstract int MTH4786(View arg1);
    }

    public int FLD1514;
    public VelocityTracker FLD1515;
    public float[] FLD1516;
    public int FLD1517;
    public int FLD1518;
    public int FLD1519;
    public final ViewGroup FLD1520;
    public float FLD1521;
    public int[] FLD1522;
    public int FLD1523;
    public OverScroller FLD1524;
    public int[] FLD1525;
    public float FLD1526;
    public View FLD1527;
    public boolean FLD1528;
    public int FLD1529;
    public static final Interpolator FLD1530;
    public final CLS334 FLD1531;
    public float[] FLD1532;
    public int[] FLD1533;
    public float[] FLD1534;
    public float[] FLD1535;
    public final Runnable FLD1536;

    static {
        CLS335.FLD1530 = new CLS333();
    }

    public CLS335(Context context0, ViewGroup viewGroup0, CLS334 ˆٴ$ـᵎ0) {
        this.FLD1529 = -1;
        this.FLD1536 = () -> {
            CLS335.this.FLD1520.removeCallbacks(CLS335.this.FLD1536);
            if(CLS335.this.FLD1518 != 0) {
                CLS335.this.FLD1518 = 0;
                CLS335.this.FLD1531.MTH4780(0);
                if(CLS335.this.FLD1518 == 0) {
                    CLS335.this.FLD1527 = null;
                }
            }
        };
        if(viewGroup0 == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if(ˆٴ$ـᵎ0 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.FLD1520 = viewGroup0;
        this.FLD1531 = ˆٴ$ـᵎ0;
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        this.FLD1517 = (int)(context0.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
        this.FLD1514 = viewConfiguration0.getScaledTouchSlop();
        this.FLD1526 = (float)viewConfiguration0.getScaledMaximumFlingVelocity();
        this.FLD1521 = (float)viewConfiguration0.getScaledMinimumFlingVelocity();
        this.FLD1524 = new OverScroller(context0, CLS335.FLD1530);
    }

    public void MTH4789(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        if(v == 0) {
            this.MTH4798();
        }
        if(this.FLD1515 == null) {
            this.FLD1515 = VelocityTracker.obtain();
        }
        this.FLD1515.addMovement(motionEvent0);
        int v2 = 0;
        switch(v) {
            case 0: {
                float f8 = motionEvent0.getX();
                float f9 = motionEvent0.getY();
                int v16 = motionEvent0.getPointerId(0);
                View view1 = this.MTH4815(((int)f8), ((int)f9));
                this.MTH4822(f8, f9, v16);
                this.MTH4829(view1, v16);
                int v17 = this.FLD1533[v16];
                int v18 = this.FLD1523;
                if((v17 & v18) != 0) {
                    this.FLD1531.MTH4784(v17 & v18, v16);
                }
                break;
            }
            case 1: {
                if(this.FLD1518 == 1) {
                    this.MTH4802();
                }
                this.MTH4798();
                return;
            }
            case 2: {
                if(this.FLD1518 != 1) {
                    int v14 = motionEvent0.getPointerCount();
                    while(v2 < v14) {
                        int v15 = motionEvent0.getPointerId(v2);
                        if(this.MTH4825(v15)) {
                            float f4 = motionEvent0.getX(v2);
                            float f5 = motionEvent0.getY(v2);
                            float f6 = f4 - this.FLD1535[v15];
                            float f7 = f5 - this.FLD1516[v15];
                            this.MTH4826(f6, f7, v15);
                            if(this.FLD1518 == 1) {
                                break;
                            }
                            View view0 = this.MTH4815(((int)f4), ((int)f5));
                            if(!this.MTH4823(view0, f6, f7) || !this.MTH4829(view0, v15)) {
                                goto label_65;
                            }
                            break;
                        }
                    label_65:
                        ++v2;
                    }
                    this.MTH4790(motionEvent0);
                    return;
                }
                else if(this.MTH4825(this.FLD1529)) {
                    int v10 = motionEvent0.findPointerIndex(this.FLD1529);
                    float f2 = motionEvent0.getX(v10);
                    float f3 = motionEvent0.getY(v10);
                    int v11 = this.FLD1529;
                    int v12 = (int)(f2 - this.FLD1534[v11]);
                    int v13 = (int)(f3 - this.FLD1532[v11]);
                    this.MTH4818(this.FLD1527.getLeft() + v12, this.FLD1527.getTop() + v13, v12, v13);
                    this.MTH4790(motionEvent0);
                    return;
                }
                break;
            }
            case 3: {
                if(this.FLD1518 != 1) {
                    this.MTH4798();
                    return;
                }
                this.MTH4807(0.0f, 0.0f);
                this.MTH4798();
                return;
            }
            case 5: {
                int v7 = motionEvent0.getPointerId(v1);
                float f = motionEvent0.getX(v1);
                float f1 = motionEvent0.getY(v1);
                this.MTH4822(f, f1, v7);
                if(this.FLD1518 == 0) {
                    this.MTH4829(this.MTH4815(((int)f), ((int)f1)), v7);
                    int v8 = this.FLD1533[v7];
                    int v9 = this.FLD1523;
                    if((v8 & v9) != 0) {
                        this.FLD1531.MTH4784(v8 & v9, v7);
                        return;
                    }
                }
                else if(this.MTH4808(((int)f), ((int)f1))) {
                    this.MTH4829(this.FLD1527, v7);
                    return;
                }
                break;
            }
            case 6: {
                int v3 = motionEvent0.getPointerId(v1);
                if(this.FLD1518 == 1 && v3 == this.FLD1529) {
                    int v4 = motionEvent0.getPointerCount();
                    while(true) {
                        int v5 = -1;
                        if(v2 >= v4) {
                            break;
                        }
                        int v6 = motionEvent0.getPointerId(v2);
                        if(v6 != this.FLD1529 && (this.MTH4815(((int)motionEvent0.getX(v2)), ((int)motionEvent0.getY(v2))) == this.FLD1527 && this.MTH4829(this.FLD1527, v6))) {
                            v5 = this.FLD1529;
                            break;
                        }
                        ++v2;
                    }
                    if(v5 == -1) {
                        this.MTH4802();
                    }
                }
                this.MTH4812(v3);
            }
        }
    }

    public final void MTH4790(MotionEvent motionEvent0) {
        int v = motionEvent0.getPointerCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = motionEvent0.getPointerId(v1);
            if(this.MTH4825(v2)) {
                float f = motionEvent0.getX(v1);
                float f1 = motionEvent0.getY(v1);
                this.FLD1534[v2] = f;
                this.FLD1532[v2] = f1;
            }
        }
    }

    public void MTH4791(View view0, int v) {
        if(view0.getParent() != this.FLD1520) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view (" + this.FLD1520 + ")");
        }
        this.FLD1527 = view0;
        this.FLD1529 = v;
        this.FLD1531.MTH4779(view0, v);
        this.MTH4827(1);
    }

    public boolean MTH4792(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        if(v == 0) {
            this.MTH4798();
        }
        if(this.FLD1515 == null) {
            this.FLD1515 = VelocityTracker.obtain();
        }
        this.FLD1515.addMovement(motionEvent0);
        switch(v) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                int v2 = motionEvent0.getPointerId(0);
                this.MTH4822(f, f1, v2);
                View view0 = this.MTH4815(((int)f), ((int)f1));
                if(view0 == this.FLD1527 && this.FLD1518 == 2) {
                    this.MTH4829(view0, v2);
                }
                int v3 = this.FLD1533[v2];
                int v4 = this.FLD1523;
                if((v3 & v4) != 0) {
                    this.FLD1531.MTH4784(v3 & v4, v2);
                    return this.FLD1518 == 1;
                }
                break;
            }
            case 2: {
                if(this.FLD1535 != null && this.FLD1516 != null) {
                    int v5 = motionEvent0.getPointerCount();
                    int v6 = 0;
                    while(v6 < v5) {
                        int v7 = motionEvent0.getPointerId(v6);
                        if(this.MTH4825(v7)) {
                            float f2 = motionEvent0.getX(v6);
                            float f3 = motionEvent0.getY(v6);
                            float f4 = f2 - this.FLD1535[v7];
                            float f5 = f3 - this.FLD1516[v7];
                            View view1 = this.MTH4815(((int)f2), ((int)f3));
                            boolean z = view1 != null && this.MTH4823(view1, f4, f5);
                            if(z) {
                                int v8 = view1.getLeft();
                                int v9 = this.FLD1531.MTH4777(view1, v8 + ((int)f4), ((int)f4));
                                int v10 = view1.getTop();
                                this.FLD1531.MTH4774(view1, v10 + ((int)f5), ((int)f5));
                                int v11 = this.FLD1531.MTH4786(view1);
                                if(v11 != 0 && (v11 <= 0 || v9 != v8)) {
                                    goto label_44;
                                }
                                break;
                            }
                        label_44:
                            this.MTH4826(f4, f5, v7);
                            if(this.FLD1518 != 1 && (!z || !this.MTH4829(view1, v7))) {
                                goto label_46;
                            }
                            break;
                        }
                    label_46:
                        ++v6;
                    }
                    this.MTH4790(motionEvent0);
                    return this.FLD1518 == 1;
                }
                break;
            }
            case 1: 
            case 3: {
                this.MTH4798();
                return this.FLD1518 == 1;
            }
            case 5: {
                int v12 = motionEvent0.getPointerId(v1);
                float f6 = motionEvent0.getX(v1);
                float f7 = motionEvent0.getY(v1);
                this.MTH4822(f6, f7, v12);
                int v13 = this.FLD1518;
                if(v13 == 0) {
                    int v14 = this.FLD1533[v12];
                    int v15 = this.FLD1523;
                    if((v14 & v15) != 0) {
                        this.FLD1531.MTH4784(v14 & v15, v12);
                        return this.FLD1518 == 1;
                    }
                }
                else if(v13 == 2) {
                    View view2 = this.MTH4815(((int)f6), ((int)f7));
                    if(view2 == this.FLD1527) {
                        this.MTH4829(view2, v12);
                        return this.FLD1518 == 1;
                    }
                }
                break;
            }
            case 6: {
                this.MTH4812(motionEvent0.getPointerId(v1));
                return this.FLD1518 == 1;
            }
            default: {
                return this.FLD1518 == 1;
            }
        }
        return this.FLD1518 == 1;
    }

    public void MTH4793(int v) {
        this.FLD1523 = v;
    }

    public boolean MTH4794(View view0, int v, int v1) {
        this.FLD1527 = view0;
        this.FLD1529 = -1;
        boolean z = this.MTH4804(v, v1, 0, 0);
        if(!z && this.FLD1518 == 0 && this.FLD1527 != null) {
            this.FLD1527 = null;
        }
        return z;
    }

    public final int MTH4795(View view0, int v, int v1, int v2, int v3) {
        float f1;
        float f;
        int v4 = this.MTH4821(v2, ((int)this.FLD1521), ((int)this.FLD1526));
        int v5 = this.MTH4821(v3, ((int)this.FLD1521), ((int)this.FLD1526));
        int v6 = Math.abs(v);
        int v7 = Math.abs(v1);
        int v8 = Math.abs(v4);
        int v9 = Math.abs(v5);
        int v10 = v8 + v9;
        int v11 = v6 + v7;
        if(v4 != 0) {
            f = (float)v8;
            f1 = (float)v10;
            return v5 == 0 ? ((int)(((float)this.MTH4801(v, v4, this.FLD1531.MTH4786(view0))) * (f / f1) + ((float)this.MTH4801(v1, 0, 0)) * (((float)v7) / ((float)v11)))) : ((int)(((float)this.MTH4801(v, v4, this.FLD1531.MTH4786(view0))) * (f / f1) + ((float)this.MTH4801(v1, v5, 0)) * (((float)v9) / ((float)v10))));
        }
        f = (float)v6;
        f1 = (float)v11;
        return v5 == 0 ? ((int)(((float)this.MTH4801(v, 0, this.FLD1531.MTH4786(view0))) * (f / f1) + ((float)this.MTH4801(v1, 0, 0)) * (((float)v7) / ((float)v11)))) : ((int)(((float)this.MTH4801(v, 0, this.FLD1531.MTH4786(view0))) * (f / f1) + ((float)this.MTH4801(v1, v5, 0)) * (((float)v9) / ((float)v10))));
    }

    public boolean MTH4796(int v, int v1) {
        if(!this.MTH4799(v1)) {
            return false;
        }
        boolean z = (v & 1) == 1;
        boolean z1 = (v & 2) == 2;
        float f = this.FLD1534[v1] - this.FLD1535[v1];
        float f1 = this.FLD1532[v1] - this.FLD1516[v1];
        if(z && z1) {
            return f * f + f1 * f1 > ((float)(this.FLD1514 * this.FLD1514));
        }
        return z ? Math.abs(f) > ((float)this.FLD1514) : z1 && Math.abs(f1) > ((float)this.FLD1514);
    }

    public static CLS335 MTH4797(ViewGroup viewGroup0, CLS334 ˆٴ$ـᵎ0) {
        return new CLS335(viewGroup0.getContext(), viewGroup0, ˆٴ$ـᵎ0);
    }

    public void MTH4798() {
        this.FLD1529 = -1;
        this.MTH4806();
        VelocityTracker velocityTracker0 = this.FLD1515;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.FLD1515 = null;
        }
    }

    public boolean MTH4799(int v) {
        return (1 << v & this.FLD1519) != 0;
    }

    public boolean MTH4800(View view0, int v, int v1) {
        return view0 == null ? false : v >= view0.getLeft() && v < view0.getRight() && v1 >= view0.getTop() && v1 < view0.getBottom();
    }

    public final int MTH4801(int v, int v1, int v2) {
        if(v == 0) {
            return 0;
        }
        int v3 = this.FLD1520.getWidth();
        int v4 = Math.abs(v1);
        return v4 <= 0 ? Math.min(((int)((((float)Math.abs(v)) / ((float)v2) + 1.0f) * 256.0f)), 600) : Math.min(Math.round(Math.abs((((float)(v3 / 2)) + this.MTH4810(Math.min(1.0f, ((float)Math.abs(v)) / ((float)v3))) * ((float)(v3 / 2))) / ((float)v4)) * 1000.0f) * 4, 600);
    }

    public final void MTH4802() {
        this.FLD1515.computeCurrentVelocity(1000, this.FLD1526);
        this.MTH4807(this.MTH4819(this.FLD1515.getXVelocity(this.FLD1529), this.FLD1521, this.FLD1526), this.MTH4819(this.FLD1515.getYVelocity(this.FLD1529), this.FLD1521, this.FLD1526));
    }

    public int MTH4803() {
        return this.FLD1514;
    }

    public final boolean MTH4804(int v, int v1, int v2, int v3) {
        int v4 = this.FLD1527.getLeft();
        int v5 = this.FLD1527.getTop();
        int v6 = v - v4;
        int v7 = v1 - v5;
        if(v6 == 0 && v7 == 0) {
            this.FLD1524.abortAnimation();
            this.MTH4827(0);
            return false;
        }
        int v8 = this.MTH4795(this.FLD1527, v6, v7, v2, v3);
        this.FLD1524.startScroll(v4, v5, v6, v7, v8);
        this.MTH4827(2);
        return true;
    }

    public static CLS335 MTH4805(ViewGroup viewGroup0, float f, CLS334 ˆٴ$ـᵎ0) {
        CLS335 ˆٴ0 = CLS335.MTH4797(viewGroup0, ˆٴ$ـᵎ0);
        ˆٴ0.FLD1514 = (int)(((float)ˆٴ0.FLD1514) * (1.0f / f));
        return ˆٴ0;
    }

    public final void MTH4806() {
        float[] arr_f = this.FLD1535;
        if(arr_f == null) {
            return;
        }
        Arrays.fill(arr_f, 0.0f);
        Arrays.fill(this.FLD1516, 0.0f);
        Arrays.fill(this.FLD1534, 0.0f);
        Arrays.fill(this.FLD1532, 0.0f);
        Arrays.fill(this.FLD1533, 0);
        Arrays.fill(this.FLD1522, 0);
        Arrays.fill(this.FLD1525, 0);
        this.FLD1519 = 0;
    }

    public final void MTH4807(float f, float f1) {
        this.FLD1528 = true;
        this.FLD1531.MTH4775(this.FLD1527, f, f1);
        this.FLD1528 = false;
        if(this.FLD1518 == 1) {
            this.MTH4827(0);
        }
    }

    public boolean MTH4808(int v, int v1) {
        return this.MTH4800(this.FLD1527, v, v1);
    }

    public int MTH4809() {
        return this.FLD1518;
    }

    public final float MTH4810(float f) {
        return (float)Math.sin((f - 0.5f) * 0.471239f);
    }

    public void MTH4811(float f) {
        this.FLD1521 = f;
    }

    public final void MTH4812(int v) {
        if(this.FLD1535 != null && this.MTH4799(v)) {
            this.FLD1535[v] = 0.0f;
            this.FLD1516[v] = 0.0f;
            this.FLD1534[v] = 0.0f;
            this.FLD1532[v] = 0.0f;
            this.FLD1533[v] = 0;
            this.FLD1522[v] = 0;
            this.FLD1525[v] = 0;
            this.FLD1519 &= ~(1 << v);
        }
    }

    public boolean MTH4813(boolean z) {
        if(this.FLD1518 == 2) {
            boolean z1 = this.FLD1524.computeScrollOffset();
            int v = this.FLD1524.getCurrX();
            int v1 = this.FLD1524.getCurrY();
            int v2 = v - this.FLD1527.getLeft();
            int v3 = v1 - this.FLD1527.getTop();
            if(v2 != 0) {
                CLS274.MTH4154(this.FLD1527, v2);
            }
            if(v3 != 0) {
                CLS274.MTH4155(this.FLD1527, v3);
            }
            if(v2 != 0 || v3 != 0) {
                this.FLD1531.MTH4778(this.FLD1527, v, v1, v2, v3);
            }
            if(z1 && v == this.FLD1524.getFinalX() && v1 == this.FLD1524.getFinalY()) {
                this.FLD1524.abortAnimation();
                z1 = false;
            }
            if(!z1) {
                if(z) {
                    this.FLD1520.post(this.FLD1536);
                    return this.FLD1518 == 2;
                }
                this.MTH4827(0);
            }
        }
        return this.FLD1518 == 2;
    }

    public final void MTH4814(int v) {
        float[] arr_f = this.FLD1535;
        if(arr_f == null || arr_f.length <= v) {
            float[] arr_f1 = new float[v + 1];
            float[] arr_f2 = new float[v + 1];
            float[] arr_f3 = new float[v + 1];
            float[] arr_f4 = new float[v + 1];
            int[] arr_v = new int[v + 1];
            int[] arr_v1 = new int[v + 1];
            int[] arr_v2 = new int[v + 1];
            if(arr_f != null) {
                System.arraycopy(arr_f, 0, arr_f1, 0, arr_f.length);
                System.arraycopy(this.FLD1516, 0, arr_f2, 0, this.FLD1516.length);
                System.arraycopy(this.FLD1534, 0, arr_f3, 0, this.FLD1534.length);
                System.arraycopy(this.FLD1532, 0, arr_f4, 0, this.FLD1532.length);
                System.arraycopy(this.FLD1533, 0, arr_v, 0, this.FLD1533.length);
                System.arraycopy(this.FLD1522, 0, arr_v1, 0, this.FLD1522.length);
                System.arraycopy(this.FLD1525, 0, arr_v2, 0, this.FLD1525.length);
            }
            this.FLD1535 = arr_f1;
            this.FLD1516 = arr_f2;
            this.FLD1534 = arr_f3;
            this.FLD1532 = arr_f4;
            this.FLD1533 = arr_v;
            this.FLD1522 = arr_v1;
            this.FLD1525 = arr_v2;
        }
    }

    public View MTH4815(int v, int v1) {
        for(int v2 = this.FLD1520.getChildCount() - 1; v2 >= 0; --v2) {
            View view0 = this.FLD1520.getChildAt(v2);
            if(v >= view0.getLeft() && v < view0.getRight() && v1 >= view0.getTop() && v1 < view0.getBottom()) {
                return view0;
            }
        }
        return null;
    }

    public final boolean MTH4816(float f, float f1, int v, int v1) {
        float f2 = Math.abs(f);
        float f3 = Math.abs(f1);
        if((this.FLD1533[v] & v1) == v1 && (this.FLD1523 & v1) != 0 && (this.FLD1525[v] & v1) != v1 && (this.FLD1522[v] & v1) != v1 && (f2 > ((float)this.FLD1514) || f3 > ((float)this.FLD1514))) {
            if(f2 < f3 * 0.5f && this.FLD1531.MTH4783(v1)) {
                this.FLD1525[v] |= v1;
                return false;
            }
            return (this.FLD1522[v] & v1) == 0 && f2 > ((float)this.FLD1514);
        }
        return false;
    }

    public int MTH4817() {
        return this.FLD1517;
    }

    public final void MTH4818(int v, int v1, int v2, int v3) {
        int v4 = this.FLD1527.getLeft();
        int v5 = this.FLD1527.getTop();
        if(v2 != 0) {
            v = this.FLD1531.MTH4777(this.FLD1527, v, v2);
            CLS274.MTH4154(this.FLD1527, v - v4);
        }
        if(v3 != 0) {
            v1 = this.FLD1531.MTH4774(this.FLD1527, v1, v3);
            CLS274.MTH4155(this.FLD1527, v1 - v5);
        }
        if(v2 != 0 || v3 != 0) {
            this.FLD1531.MTH4778(this.FLD1527, v, v1, v - v4, v1 - v5);
        }
    }

    public final float MTH4819(float f, float f1, float f2) {
        float f3 = Math.abs(f);
        if(f3 < f1) {
            return 0.0f;
        }
        if(f3 > f2) {
            return f > 0.0f ? f2 : -f2;
        }
        return f;
    }

    public final int MTH4820(int v, int v1) {
        int v2 = v >= this.FLD1520.getLeft() + this.FLD1517 ? 0 : 1;
        if(v1 < this.FLD1520.getTop() + this.FLD1517) {
            v2 |= 4;
        }
        if(v > this.FLD1520.getRight() - this.FLD1517) {
            v2 |= 2;
        }
        return v1 <= this.FLD1520.getBottom() - this.FLD1517 ? v2 : v2 | 8;
    }

    public final int MTH4821(int v, int v1, int v2) {
        int v3 = Math.abs(v);
        if(v3 < v1) {
            return 0;
        }
        if(v3 > v2) {
            return v > 0 ? v2 : -v2;
        }
        return v;
    }

    public final void MTH4822(float f, float f1, int v) {
        this.MTH4814(v);
        float[] arr_f = this.FLD1535;
        this.FLD1534[v] = f;
        arr_f[v] = f;
        float[] arr_f1 = this.FLD1516;
        this.FLD1532[v] = f1;
        arr_f1[v] = f1;
        int[] arr_v = this.FLD1533;
        arr_v[v] = this.MTH4820(((int)f), ((int)f1));
        this.FLD1519 |= 1 << v;
    }

    // 去混淆评级： 低(30)
    public final boolean MTH4823(View view0, float f, float f1) {
        return view0 == null ? false : this.FLD1531.MTH4786(view0) > 0 && Math.abs(f) > ((float)this.FLD1514);
    }

    public boolean MTH4824(int v) {
        for(int v1 = 0; v1 < this.FLD1535.length; ++v1) {
            if(this.MTH4796(v, v1)) {
                return true;
            }
        }
        return false;
    }

    public final boolean MTH4825(int v) {
        if(!this.MTH4799(v)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + v + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    public final void MTH4826(float f, float f1, int v) {
        boolean z = this.MTH4816(f, f1, v, 1);
        if(this.MTH4816(f1, f, v, 4)) {
            z |= 4;
        }
        if(this.MTH4816(f, f1, v, 2)) {
            z |= 2;
        }
        if(this.MTH4816(f1, f, v, 8)) {
            z |= 8;
        }
        if(z) {
            this.FLD1522[v] |= true;
            this.FLD1531.MTH4785(1, v);
        }
    }

    // 检测为 Lambda 实现
    public void MTH4827(int v) [...]

    public boolean MTH4828(int v, int v1) {
        if(!this.FLD1528) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return this.MTH4804(v, v1, ((int)this.FLD1515.getXVelocity(this.FLD1529)), ((int)this.FLD1515.getYVelocity(this.FLD1529)));
    }

    public boolean MTH4829(View view0, int v) {
        if(view0 == this.FLD1527 && this.FLD1529 == v) {
            return true;
        }
        if(view0 != null && this.FLD1531.MTH4781(view0, v)) {
            this.FLD1529 = v;
            this.MTH4791(view0, v);
            return true;
        }
        return false;
    }

    public View MTH4830() {
        return this.FLD1527;
    }
}

