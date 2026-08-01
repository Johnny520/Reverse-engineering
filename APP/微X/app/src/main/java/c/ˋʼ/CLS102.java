// Decompiled by JEB v5.42.0.202606242140

package c.ˋʼ;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import c.ʾʻ.CLS31;
import java.util.Arrays;

public class CLS102 {
    public static abstract class CLS99 {
        public int MTH1342(int v) [...] // Inlined contents

        public abstract void MTH1343(View arg1, int arg2);

        public abstract void MTH1344(View arg1, float arg2, float arg3);

        public int MTH1345(View view0) [...] // Inlined contents

        public abstract boolean MTH1346(View arg1, int arg2);

        public abstract int MTH1347(View arg1);

        public abstract void MTH1348(View arg1, int arg2, int arg3, int arg4, int arg5);

        public abstract void MTH1349(int arg1, int arg2);

        public abstract void MTH1350(int arg1, int arg2);

        public abstract void MTH1351(int arg1);

        public abstract int MTH1352(View arg1, int arg2, int arg3);

        public abstract boolean MTH1353(int arg1);

        public abstract int MTH1354(View arg1, int arg2, int arg3);
    }

    public static final class CLS100 implements Interpolator {
        @Override  // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) + 1.0f;
        }
    }

    public class CLS101 implements Runnable {
        public final CLS102 FLD325;

        @Override
        public void run() {
            CLS102.this.MTH1386(0);
        }
    }

    public static final Interpolator FLD326;
    public int FLD327;
    public int[] FLD328;
    public VelocityTracker FLD329;
    public float[] FLD330;
    public float FLD331;
    public float[] FLD332;
    public int FLD333;
    public float[] FLD334;
    public float FLD335;
    public final ViewGroup FLD336;
    public View FLD337;
    public boolean FLD338;
    public OverScroller FLD339;
    public final Runnable FLD340;
    public final CLS99 FLD341;
    public int FLD342;
    public int[] FLD343;
    public int[] FLD344;
    public int FLD345;
    public int FLD346;
    public float[] FLD347;
    public int FLD348;

    static {
        CLS102.FLD326 = new CLS100();
    }

    public CLS102(Context context0, ViewGroup viewGroup0, CLS99 ⁱˋ$ʾʻ0) {
        this.FLD327 = -1;
        this.FLD340 = () -> {
            CLS102.this.FLD336.removeCallbacks(CLS102.this.FLD340);
            if(CLS102.this.FLD345 != 0) {
                CLS102.this.FLD345 = 0;
                CLS102.this.FLD341.MTH1351(0);
                if(CLS102.this.FLD345 == 0) {
                    CLS102.this.FLD337 = null;
                }
            }
        };
        if(viewGroup0 == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if(ⁱˋ$ʾʻ0 == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.FLD336 = viewGroup0;
        this.FLD341 = ⁱˋ$ʾʻ0;
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        this.FLD342 = (int)(context0.getResources().getDisplayMetrics().density * 20.0f + 0.5f);
        this.FLD348 = viewConfiguration0.getScaledTouchSlop();
        this.FLD331 = (float)viewConfiguration0.getScaledMaximumFlingVelocity();
        this.FLD335 = (float)viewConfiguration0.getScaledMinimumFlingVelocity();
        this.FLD339 = new OverScroller(context0, CLS102.FLD326);
    }

    public final int MTH1361(int v, int v1) {
        int v2 = v >= this.FLD336.getLeft() + this.FLD342 ? 0 : 1;
        if(v1 < this.FLD336.getTop() + this.FLD342) {
            v2 |= 4;
        }
        if(v > this.FLD336.getRight() - this.FLD342) {
            v2 |= 2;
        }
        return v1 <= this.FLD336.getBottom() - this.FLD342 ? v2 : v2 | 8;
    }

    public boolean MTH1362(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        if(v == 0) {
            this.MTH1396();
        }
        if(this.FLD329 == null) {
            this.FLD329 = VelocityTracker.obtain();
        }
        this.FLD329.addMovement(motionEvent0);
        switch(v) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                int v2 = motionEvent0.getPointerId(0);
                this.MTH1379(f, f1, v2);
                View view0 = this.MTH1381(((int)f), ((int)f1));
                if(view0 == this.FLD337 && this.FLD345 == 2) {
                    this.MTH1389(view0, v2);
                }
                int v3 = this.FLD343[v2];
                int v4 = this.FLD346;
                if((v3 & v4) != 0) {
                    this.FLD341.MTH1350(v3 & v4, v2);
                    return this.FLD345 == 1;
                }
                break;
            }
            case 2: {
                if(this.FLD332 != null && this.FLD330 != null) {
                    int v5 = motionEvent0.getPointerCount();
                    int v6 = 0;
                    while(v6 < v5) {
                        int v7 = motionEvent0.getPointerId(v6);
                        if(this.MTH1367(v7)) {
                            float f2 = motionEvent0.getX(v6);
                            float f3 = motionEvent0.getY(v6);
                            float f4 = f2 - this.FLD332[v7];
                            float f5 = f3 - this.FLD330[v7];
                            View view1 = this.MTH1381(((int)f2), ((int)f3));
                            boolean z = view1 != null && this.MTH1375(view1, f4, f5);
                            if(z) {
                                int v8 = view1.getLeft();
                                int v9 = this.FLD341.MTH1352(view1, v8 + ((int)f4), ((int)f4));
                                int v10 = view1.getTop();
                                this.FLD341.MTH1354(view1, v10 + ((int)f5), ((int)f5));
                                int v11 = this.FLD341.MTH1347(view1);
                                if(v11 != 0 && (v11 <= 0 || v9 != v8)) {
                                    goto label_44;
                                }
                                break;
                            }
                        label_44:
                            this.MTH1363(f4, f5, v7);
                            if(this.FLD345 != 1 && (!z || !this.MTH1389(view1, v7))) {
                                goto label_46;
                            }
                            break;
                        }
                    label_46:
                        ++v6;
                    }
                    this.MTH1397(motionEvent0);
                    return this.FLD345 == 1;
                }
                break;
            }
            case 1: 
            case 3: {
                this.MTH1396();
                return this.FLD345 == 1;
            }
            case 5: {
                int v12 = motionEvent0.getPointerId(v1);
                float f6 = motionEvent0.getX(v1);
                float f7 = motionEvent0.getY(v1);
                this.MTH1379(f6, f7, v12);
                int v13 = this.FLD345;
                if(v13 == 0) {
                    int v14 = this.FLD343[v12];
                    int v15 = this.FLD346;
                    if((v14 & v15) != 0) {
                        this.FLD341.MTH1350(v14 & v15, v12);
                        return this.FLD345 == 1;
                    }
                }
                else if(v13 == 2) {
                    View view2 = this.MTH1381(((int)f6), ((int)f7));
                    if(view2 == this.FLD337) {
                        this.MTH1389(view2, v12);
                        return this.FLD345 == 1;
                    }
                }
                break;
            }
            case 6: {
                this.MTH1395(motionEvent0.getPointerId(v1));
                return this.FLD345 == 1;
            }
            default: {
                return this.FLD345 == 1;
            }
        }
        return this.FLD345 == 1;
    }

    public final void MTH1363(float f, float f1, int v) {
        boolean z = this.MTH1365(f, f1, v, 1);
        if(this.MTH1365(f1, f, v, 4)) {
            z |= 4;
        }
        if(this.MTH1365(f, f1, v, 2)) {
            z |= 2;
        }
        if(this.MTH1365(f1, f, v, 8)) {
            z |= 8;
        }
        if(z) {
            this.FLD328[v] |= true;
            this.FLD341.MTH1349(1, v);
        }
    }

    public int MTH1364() {
        return this.FLD342;
    }

    public final boolean MTH1365(float f, float f1, int v, int v1) {
        float f2 = Math.abs(f);
        float f3 = Math.abs(f1);
        if((this.FLD343[v] & v1) == v1 && (this.FLD346 & v1) != 0 && (this.FLD344[v] & v1) != v1 && (this.FLD328[v] & v1) != v1 && (f2 > ((float)this.FLD348) || f3 > ((float)this.FLD348))) {
            if(f2 < f3 * 0.5f && this.FLD341.MTH1353(v1)) {
                this.FLD344[v] |= v1;
                return false;
            }
            return (this.FLD328[v] & v1) == 0 && f2 > ((float)this.FLD348);
        }
        return false;
    }

    public final void MTH1366() {
        float[] arr_f = this.FLD332;
        if(arr_f == null) {
            return;
        }
        Arrays.fill(arr_f, 0.0f);
        Arrays.fill(this.FLD330, 0.0f);
        Arrays.fill(this.FLD334, 0.0f);
        Arrays.fill(this.FLD347, 0.0f);
        Arrays.fill(this.FLD343, 0);
        Arrays.fill(this.FLD328, 0);
        Arrays.fill(this.FLD344, 0);
        this.FLD333 = 0;
    }

    public final boolean MTH1367(int v) {
        if(!this.MTH1376(v)) {
            Log.e("ViewDragHelper", "Ignoring pointerId=" + v + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    public boolean MTH1368(View view0, int v, int v1) {
        this.FLD337 = view0;
        this.FLD327 = -1;
        boolean z = this.MTH1378(v, v1, 0, 0);
        if(!z && this.FLD345 == 0 && this.FLD337 != null) {
            this.FLD337 = null;
        }
        return z;
    }

    public final int MTH1369(View view0, int v, int v1, int v2, int v3) {
        float f1;
        float f;
        int v4 = this.MTH1394(v2, ((int)this.FLD335), ((int)this.FLD331));
        int v5 = this.MTH1394(v3, ((int)this.FLD335), ((int)this.FLD331));
        int v6 = Math.abs(v);
        int v7 = Math.abs(v1);
        int v8 = Math.abs(v4);
        int v9 = Math.abs(v5);
        int v10 = v8 + v9;
        int v11 = v6 + v7;
        if(v4 != 0) {
            f = (float)v8;
            f1 = (float)v10;
            return v5 == 0 ? ((int)(((float)this.MTH1374(v, v4, this.FLD341.MTH1347(view0))) * (f / f1) + ((float)this.MTH1374(v1, 0, 0)) * (((float)v7) / ((float)v11)))) : ((int)(((float)this.MTH1374(v, v4, this.FLD341.MTH1347(view0))) * (f / f1) + ((float)this.MTH1374(v1, v5, 0)) * (((float)v9) / ((float)v10))));
        }
        f = (float)v6;
        f1 = (float)v11;
        return v5 == 0 ? ((int)(((float)this.MTH1374(v, 0, this.FLD341.MTH1347(view0))) * (f / f1) + ((float)this.MTH1374(v1, 0, 0)) * (((float)v7) / ((float)v11)))) : ((int)(((float)this.MTH1374(v, 0, this.FLD341.MTH1347(view0))) * (f / f1) + ((float)this.MTH1374(v1, v5, 0)) * (((float)v9) / ((float)v10))));
    }

    public boolean MTH1370(int v, int v1) {
        if(!this.MTH1376(v1)) {
            return false;
        }
        boolean z = (v & 1) == 1;
        boolean z1 = (v & 2) == 2;
        float f = this.FLD334[v1] - this.FLD332[v1];
        float f1 = this.FLD347[v1] - this.FLD330[v1];
        if(z && z1) {
            return f * f + f1 * f1 > ((float)(this.FLD348 * this.FLD348));
        }
        return z ? Math.abs(f) > ((float)this.FLD348) : z1 && Math.abs(f1) > ((float)this.FLD348);
    }

    public boolean MTH1371(boolean z) {
        if(this.FLD345 == 2) {
            boolean z1 = this.FLD339.computeScrollOffset();
            int v = this.FLD339.getCurrX();
            int v1 = this.FLD339.getCurrY();
            int v2 = v - this.FLD337.getLeft();
            int v3 = v1 - this.FLD337.getTop();
            if(v2 != 0) {
                CLS31.MTH832(this.FLD337, v2);
            }
            if(v3 != 0) {
                CLS31.MTH842(this.FLD337, v3);
            }
            if(v2 != 0 || v3 != 0) {
                this.FLD341.MTH1348(this.FLD337, v, v1, v2, v3);
            }
            if(z1 && v == this.FLD339.getFinalX() && v1 == this.FLD339.getFinalY()) {
                this.FLD339.abortAnimation();
                z1 = false;
            }
            if(!z1) {
                if(z) {
                    this.FLD336.post(this.FLD340);
                    return this.FLD345 == 2;
                }
                this.MTH1386(0);
            }
        }
        return this.FLD345 == 2;
    }

    public boolean MTH1372(int v) {
        for(int v1 = 0; v1 < this.FLD332.length; ++v1) {
            if(this.MTH1370(v, v1)) {
                return true;
            }
        }
        return false;
    }

    public int MTH1373() {
        return this.FLD348;
    }

    public final int MTH1374(int v, int v1, int v2) {
        if(v == 0) {
            return 0;
        }
        int v3 = this.FLD336.getWidth();
        int v4 = Math.abs(v1);
        return v4 <= 0 ? Math.min(((int)((((float)Math.abs(v)) / ((float)v2) + 1.0f) * 256.0f)), 600) : Math.min(Math.round(Math.abs((((float)(v3 / 2)) + this.MTH1383(Math.min(1.0f, ((float)Math.abs(v)) / ((float)v3))) * ((float)(v3 / 2))) / ((float)v4)) * 1000.0f) * 4, 600);
    }

    // 去混淆评级： 低(30)
    public final boolean MTH1375(View view0, float f, float f1) {
        return view0 == null ? false : this.FLD341.MTH1347(view0) > 0 && Math.abs(f) > ((float)this.FLD348);
    }

    public boolean MTH1376(int v) {
        return (1 << v & this.FLD333) != 0;
    }

    public static CLS102 MTH1377(ViewGroup viewGroup0, float f, CLS99 ⁱˋ$ʾʻ0) {
        CLS102 ⁱˋ0 = CLS102.MTH1392(viewGroup0, ⁱˋ$ʾʻ0);
        ⁱˋ0.FLD348 = (int)(((float)ⁱˋ0.FLD348) * (1.0f / f));
        return ⁱˋ0;
    }

    public final boolean MTH1378(int v, int v1, int v2, int v3) {
        int v4 = this.FLD337.getLeft();
        int v5 = this.FLD337.getTop();
        int v6 = v - v4;
        int v7 = v1 - v5;
        if(v6 == 0 && v7 == 0) {
            this.FLD339.abortAnimation();
            this.MTH1386(0);
            return false;
        }
        int v8 = this.MTH1369(this.FLD337, v6, v7, v2, v3);
        this.FLD339.startScroll(v4, v5, v6, v7, v8);
        this.MTH1386(2);
        return true;
    }

    public final void MTH1379(float f, float f1, int v) {
        this.MTH1380(v);
        float[] arr_f = this.FLD332;
        this.FLD334[v] = f;
        arr_f[v] = f;
        float[] arr_f1 = this.FLD330;
        this.FLD347[v] = f1;
        arr_f1[v] = f1;
        int[] arr_v = this.FLD343;
        arr_v[v] = this.MTH1361(((int)f), ((int)f1));
        this.FLD333 |= 1 << v;
    }

    public final void MTH1380(int v) {
        float[] arr_f = this.FLD332;
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
                System.arraycopy(this.FLD330, 0, arr_f2, 0, this.FLD330.length);
                System.arraycopy(this.FLD334, 0, arr_f3, 0, this.FLD334.length);
                System.arraycopy(this.FLD347, 0, arr_f4, 0, this.FLD347.length);
                System.arraycopy(this.FLD343, 0, arr_v, 0, this.FLD343.length);
                System.arraycopy(this.FLD328, 0, arr_v1, 0, this.FLD328.length);
                System.arraycopy(this.FLD344, 0, arr_v2, 0, this.FLD344.length);
            }
            this.FLD332 = arr_f1;
            this.FLD330 = arr_f2;
            this.FLD334 = arr_f3;
            this.FLD347 = arr_f4;
            this.FLD343 = arr_v;
            this.FLD328 = arr_v1;
            this.FLD344 = arr_v2;
        }
    }

    public View MTH1381(int v, int v1) {
        for(int v2 = this.FLD336.getChildCount() - 1; v2 >= 0; --v2) {
            View view0 = this.FLD336.getChildAt(v2);
            if(v >= view0.getLeft() && v < view0.getRight() && v1 >= view0.getTop() && v1 < view0.getBottom()) {
                return view0;
            }
        }
        return null;
    }

    public boolean MTH1382(View view0, int v, int v1) {
        return view0 == null ? false : v >= view0.getLeft() && v < view0.getRight() && v1 >= view0.getTop() && v1 < view0.getBottom();
    }

    public final float MTH1383(float f) {
        return (float)Math.sin((f - 0.5f) * 0.471239f);
    }

    public boolean MTH1384(int v, int v1) {
        return this.MTH1382(this.FLD337, v, v1);
    }

    public final void MTH1385() {
        this.FLD329.computeCurrentVelocity(1000, this.FLD331);
        this.MTH1398(this.MTH1401(this.FLD329.getXVelocity(this.FLD327), this.FLD335, this.FLD331), this.MTH1401(this.FLD329.getYVelocity(this.FLD327), this.FLD335, this.FLD331));
    }

    // 检测为 Lambda 实现
    public void MTH1386(int v) [...]

    public View MTH1387() {
        return this.FLD337;
    }

    public void MTH1388(int v) {
        this.FLD346 = v;
    }

    public boolean MTH1389(View view0, int v) {
        if(view0 == this.FLD337 && this.FLD327 == v) {
            return true;
        }
        if(view0 != null && this.FLD341.MTH1346(view0, v)) {
            this.FLD327 = v;
            this.MTH1402(view0, v);
            return true;
        }
        return false;
    }

    public final void MTH1390(int v, int v1, int v2, int v3) {
        int v4 = this.FLD337.getLeft();
        int v5 = this.FLD337.getTop();
        if(v2 != 0) {
            v = this.FLD341.MTH1352(this.FLD337, v, v2);
            CLS31.MTH832(this.FLD337, v - v4);
        }
        if(v3 != 0) {
            v1 = this.FLD341.MTH1354(this.FLD337, v1, v3);
            CLS31.MTH842(this.FLD337, v1 - v5);
        }
        if(v2 != 0 || v3 != 0) {
            this.FLD341.MTH1348(this.FLD337, v, v1, v - v4, v1 - v5);
        }
    }

    public void MTH1391(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getActionIndex();
        if(v == 0) {
            this.MTH1396();
        }
        if(this.FLD329 == null) {
            this.FLD329 = VelocityTracker.obtain();
        }
        this.FLD329.addMovement(motionEvent0);
        int v2 = 0;
        switch(v) {
            case 0: {
                float f8 = motionEvent0.getX();
                float f9 = motionEvent0.getY();
                int v16 = motionEvent0.getPointerId(0);
                View view1 = this.MTH1381(((int)f8), ((int)f9));
                this.MTH1379(f8, f9, v16);
                this.MTH1389(view1, v16);
                int v17 = this.FLD343[v16];
                int v18 = this.FLD346;
                if((v17 & v18) != 0) {
                    this.FLD341.MTH1350(v17 & v18, v16);
                }
                break;
            }
            case 1: {
                if(this.FLD345 == 1) {
                    this.MTH1385();
                }
                this.MTH1396();
                return;
            }
            case 2: {
                if(this.FLD345 != 1) {
                    int v14 = motionEvent0.getPointerCount();
                    while(v2 < v14) {
                        int v15 = motionEvent0.getPointerId(v2);
                        if(this.MTH1367(v15)) {
                            float f4 = motionEvent0.getX(v2);
                            float f5 = motionEvent0.getY(v2);
                            float f6 = f4 - this.FLD332[v15];
                            float f7 = f5 - this.FLD330[v15];
                            this.MTH1363(f6, f7, v15);
                            if(this.FLD345 == 1) {
                                break;
                            }
                            View view0 = this.MTH1381(((int)f4), ((int)f5));
                            if(!this.MTH1375(view0, f6, f7) || !this.MTH1389(view0, v15)) {
                                goto label_65;
                            }
                            break;
                        }
                    label_65:
                        ++v2;
                    }
                    this.MTH1397(motionEvent0);
                    return;
                }
                else if(this.MTH1367(this.FLD327)) {
                    int v10 = motionEvent0.findPointerIndex(this.FLD327);
                    float f2 = motionEvent0.getX(v10);
                    float f3 = motionEvent0.getY(v10);
                    int v11 = this.FLD327;
                    int v12 = (int)(f2 - this.FLD334[v11]);
                    int v13 = (int)(f3 - this.FLD347[v11]);
                    this.MTH1390(this.FLD337.getLeft() + v12, this.FLD337.getTop() + v13, v12, v13);
                    this.MTH1397(motionEvent0);
                    return;
                }
                break;
            }
            case 3: {
                if(this.FLD345 != 1) {
                    this.MTH1396();
                    return;
                }
                this.MTH1398(0.0f, 0.0f);
                this.MTH1396();
                return;
            }
            case 5: {
                int v7 = motionEvent0.getPointerId(v1);
                float f = motionEvent0.getX(v1);
                float f1 = motionEvent0.getY(v1);
                this.MTH1379(f, f1, v7);
                if(this.FLD345 == 0) {
                    this.MTH1389(this.MTH1381(((int)f), ((int)f1)), v7);
                    int v8 = this.FLD343[v7];
                    int v9 = this.FLD346;
                    if((v8 & v9) != 0) {
                        this.FLD341.MTH1350(v8 & v9, v7);
                        return;
                    }
                }
                else if(this.MTH1384(((int)f), ((int)f1))) {
                    this.MTH1389(this.FLD337, v7);
                    return;
                }
                break;
            }
            case 6: {
                int v3 = motionEvent0.getPointerId(v1);
                if(this.FLD345 == 1 && v3 == this.FLD327) {
                    int v4 = motionEvent0.getPointerCount();
                    while(true) {
                        int v5 = -1;
                        if(v2 >= v4) {
                            break;
                        }
                        int v6 = motionEvent0.getPointerId(v2);
                        if(v6 != this.FLD327 && (this.MTH1381(((int)motionEvent0.getX(v2)), ((int)motionEvent0.getY(v2))) == this.FLD337 && this.MTH1389(this.FLD337, v6))) {
                            v5 = this.FLD327;
                            break;
                        }
                        ++v2;
                    }
                    if(v5 == -1) {
                        this.MTH1385();
                    }
                }
                this.MTH1395(v3);
            }
        }
    }

    public static CLS102 MTH1392(ViewGroup viewGroup0, CLS99 ⁱˋ$ʾʻ0) {
        return new CLS102(viewGroup0.getContext(), viewGroup0, ⁱˋ$ʾʻ0);
    }

    public void MTH1393(float f) {
        this.FLD335 = f;
    }

    public final int MTH1394(int v, int v1, int v2) {
        int v3 = Math.abs(v);
        if(v3 < v1) {
            return 0;
        }
        if(v3 > v2) {
            return v > 0 ? v2 : -v2;
        }
        return v;
    }

    public final void MTH1395(int v) {
        if(this.FLD332 != null && this.MTH1376(v)) {
            this.FLD332[v] = 0.0f;
            this.FLD330[v] = 0.0f;
            this.FLD334[v] = 0.0f;
            this.FLD347[v] = 0.0f;
            this.FLD343[v] = 0;
            this.FLD328[v] = 0;
            this.FLD344[v] = 0;
            this.FLD333 &= ~(1 << v);
        }
    }

    public void MTH1396() {
        this.FLD327 = -1;
        this.MTH1366();
        VelocityTracker velocityTracker0 = this.FLD329;
        if(velocityTracker0 != null) {
            velocityTracker0.recycle();
            this.FLD329 = null;
        }
    }

    public final void MTH1397(MotionEvent motionEvent0) {
        int v = motionEvent0.getPointerCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = motionEvent0.getPointerId(v1);
            if(this.MTH1367(v2)) {
                float f = motionEvent0.getX(v1);
                float f1 = motionEvent0.getY(v1);
                this.FLD334[v2] = f;
                this.FLD347[v2] = f1;
            }
        }
    }

    public final void MTH1398(float f, float f1) {
        this.FLD338 = true;
        this.FLD341.MTH1344(this.FLD337, f, f1);
        this.FLD338 = false;
        if(this.FLD345 == 1) {
            this.MTH1386(0);
        }
    }

    public boolean MTH1399(int v, int v1) {
        if(!this.FLD338) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return this.MTH1378(v, v1, ((int)this.FLD329.getXVelocity(this.FLD327)), ((int)this.FLD329.getYVelocity(this.FLD327)));
    }

    public int MTH1400() {
        return this.FLD345;
    }

    public final float MTH1401(float f, float f1, float f2) {
        float f3 = Math.abs(f);
        if(f3 < f1) {
            return 0.0f;
        }
        if(f3 > f2) {
            return f > 0.0f ? f2 : -f2;
        }
        return f;
    }

    public void MTH1402(View view0, int v) {
        if(view0.getParent() != this.FLD336) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view (" + this.FLD336 + ")");
        }
        this.FLD337 = view0;
        this.FLD327 = v;
        this.FLD341.MTH1343(view0, v);
        this.MTH1386(1);
    }
}

