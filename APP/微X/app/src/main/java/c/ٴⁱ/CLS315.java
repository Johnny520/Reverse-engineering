// Decompiled by JEB v5.42.0.202606242140

package c.ٴⁱ;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import c.ʻᵢ.CLS27;
import c.ʿˊ.CLS61;
import c.ˆٴ.CLS78;
import c.ـᵎ.CLS274;
import c.ـᵎ.CLS276;
import c.ـᵎ.CLS280;
import c.ᴵⁱ.CLS335.CLS334;
import c.ᴵⁱ.CLS335;
import c.ᵔﹶ.CLS351.CLS350;
import c.ᵔﹶ.CLS351;
import java.util.ArrayList;
import java.util.List;

public class CLS315 extends ViewGroup {
    public class CLS803 extends CLS276 {
        public final Rect FLD1372;
        public final CLS315 FLD1373;

        public CLS803() {
            this.FLD1372 = new Rect();
        }

        public final void MTH4449(CLS351 ٴˈ0, CLS351 ٴˈ1) {
            ٴˈ1.MTH4860(this.FLD1372);
            ٴˈ0.MTH4863(this.FLD1372);
            ٴˈ1.MTH4888(this.FLD1372);
            ٴˈ0.MTH4890(this.FLD1372);
            ٴˈ0.MTH4858(ٴˈ1.MTH4881());
            ٴˈ0.MTH4857(ٴˈ1.MTH4870());
            ٴˈ0.MTH4864(ٴˈ1.MTH4883());
            ٴˈ0.MTH4866(ٴˈ1.MTH4885());
            ٴˈ0.MTH4891(ٴˈ1.MTH4871());
            ٴˈ0.MTH4853(ٴˈ1.MTH4861());
            ٴˈ0.MTH4886(ٴˈ1.MTH4874());
            ٴˈ0.MTH4854(ٴˈ1.MTH4882());
            ٴˈ0.MTH4872(ٴˈ1.MTH4859());
            ٴˈ0.MTH4893(ٴˈ1.MTH4895());
            ٴˈ0.MTH4892(ٴˈ1.MTH4878());
            ٴˈ0.MTH4862(ٴˈ1.MTH4889());
        }

        // 此方法包含解密的字符串
        @Override  // c.ـᵎ.CLS276
        public void MTH4175(View view0, CLS351 ٴˈ0) {
            if(CLS315.FLD1393) {
                ((CLS276)this).super.MTH4175(view0, ٴˈ0);
            }
            else {
                CLS351 ٴˈ1 = CLS351.MTH4884(ٴˈ0);
                ((CLS276)this).super.MTH4175(view0, ٴˈ1);
                ٴˈ0.MTH4856(view0);
                ViewParent viewParent0 = CLS274.MTH4159(view0);
                if(viewParent0 instanceof View) {
                    ٴˈ0.MTH4875(((View)viewParent0));
                }
                this.MTH4449(ٴˈ0, ٴˈ1);
                ٴˈ1.MTH4867();
                this.MTH4452(ٴˈ0, ((ViewGroup)view0));
            }
            ٴˈ0.MTH4864("c.\u0674\u2071.\u0674\u2071");
            ٴˈ0.MTH4886(false);
            ٴˈ0.MTH4854(false);
            ٴˈ0.MTH4873(CLS350.FLD1539);
            ٴˈ0.MTH4873(CLS350.FLD1560);
        }

        @Override  // c.ـᵎ.CLS276
        public boolean MTH4176(View view0, AccessibilityEvent accessibilityEvent0) {
            if(accessibilityEvent0.getEventType() == 0x20) {
                List list0 = accessibilityEvent0.getText();
                View view1 = CLS315.this.MTH4551();
                if(view1 != null) {
                    int v = CLS315.this.MTH4565(view1);
                    CharSequence charSequence0 = CLS315.this.MTH4556(v);
                    if(charSequence0 != null) {
                        list0.add(charSequence0);
                    }
                }
                return true;
            }
            return ((CLS276)this).super.MTH4176(view0, accessibilityEvent0);
        }

        public final void MTH4452(CLS351 ٴˈ0, ViewGroup viewGroup0) {
            int v = viewGroup0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = viewGroup0.getChildAt(v1);
                if(CLS315.MTH4549(view0)) {
                    ٴˈ0.MTH4855(view0);
                }
            }
        }

        // 去混淆评级： 低(20)
        @Override  // c.ـᵎ.CLS276
        public boolean MTH4180(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
            return CLS315.FLD1393 || CLS315.MTH4549(view0) ? ((CLS276)this).super.MTH4180(viewGroup0, view0, accessibilityEvent0) : false;
        }

        // 此方法包含解密的字符串
        @Override  // c.ـᵎ.CLS276
        public void MTH4183(View view0, AccessibilityEvent accessibilityEvent0) {
            ((CLS276)this).super.MTH4183(view0, accessibilityEvent0);
            accessibilityEvent0.setClassName("c.\u0674\u2071.\u0674\u2071");
        }
    }

    public static class CLS310 extends ViewGroup.MarginLayoutParams {
        public float FLD1374;
        public int FLD1375;
        public boolean FLD1376;
        public int FLD1377;

        public CLS310(int v, int v1) {
            super(v, v1);
            this.FLD1375 = 0;
        }

        public CLS310(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.FLD1375 = 0;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, CLS315.FLD1429);
            this.FLD1375 = typedArray0.getInt(0, 0);
            typedArray0.recycle();
        }

        public CLS310(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.FLD1375 = 0;
        }

        public CLS310(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.FLD1375 = 0;
        }

        public CLS310(CLS310 ٴⁱ$ʿˊ0) {
            super(ٴⁱ$ʿˊ0);
            this.FLD1375 = ٴⁱ$ʿˊ0.FLD1375;
        }
    }

    public static final class CLS804 extends CLS276 {
        @Override  // c.ـᵎ.CLS276
        public void MTH4175(View view0, CLS351 ٴˈ0) {
            ((CLS276)this).super.MTH4175(view0, ٴˈ0);
            if(!CLS315.MTH4549(view0)) {
                ٴˈ0.MTH4875(null);
            }
        }
    }

    public class CLS805 extends CLS334 {
        public class CLS312 implements Runnable {
            public final CLS805 FLD1379;

            @Override
            public void run() {
                CLS805.this.MTH4469();
            }
        }

        public CLS335 FLD1380;
        public final int FLD1381;
        public final Runnable FLD1382;
        public final CLS315 FLD1383;

        public CLS805(int v) {
            this.FLD1382 = () -> {
                int v2;
                View view0;
                int v = CLS805.this.FLD1380.MTH4817();
                int v1 = 0;
                boolean z = CLS805.this.FLD1381 == 3;
                if(z) {
                    view0 = CLS315.this.MTH4541(3);
                    if(view0 != null) {
                        v1 = -view0.getWidth();
                    }
                    v2 = v1 + v;
                }
                else {
                    view0 = CLS315.this.MTH4541(5);
                    v2 = CLS315.this.getWidth() - v;
                }
                if(view0 != null && (z && view0.getLeft() < v2 || !z && view0.getLeft() > v2) && CLS315.this.MTH4553(view0) == 0) {
                    CLS310 ٴⁱ$ʿˊ0 = (CLS310)view0.getLayoutParams();
                    CLS805.this.FLD1380.MTH4794(view0, v2, view0.getTop());
                    ٴⁱ$ʿˊ0.FLD1376 = true;
                    CLS315.this.invalidate();
                    CLS805.this.MTH4472();
                    CLS315.this.MTH4535();
                }
            };
            this.FLD1381 = v;
        }

        @Override  // c.ᴵⁱ.CLS335$CLS334
        public int MTH4774(View view0, int v, int v1) {
            return view0.getTop();
        }

        @Override  // c.ᴵⁱ.CLS335$CLS334
        public void MTH4775(View view0, float f, float f1) {
            int v1;
            float f2 = CLS315.this.MTH4561(view0);
            int v = view0.getWidth();
            if(!CLS315.this.MTH4563(view0, 3)) {
                int v2 = CLS315.this.getWidth();
                if(f < 0.0f || f == 0.0f && f2 > 0.5f) {
                    v2 -= v;
                }
                v1 = v2;
            }
            else if(f <= 0.0f && (f != 0.0f || f2 <= 0.5f)) {
                v1 = -v;
            }
            else {
                v1 = 0;
            }
            this.FLD1380.MTH4828(v1, view0.getTop());
            CLS315.this.invalidate();
        }

        // 检测为 Lambda 实现
        public void MTH4469() [...]

        @Override  // c.ᴵⁱ.CLS335$CLS334
        public int MTH4777(View view0, int v, int v1) {
            if(CLS315.this.MTH4563(view0, 3)) {
                return Math.max(-view0.getWidth(), Math.min(v, 0));
            }
            int v2 = CLS315.this.getWidth();
            return Math.max(v2 - view0.getWidth(), Math.min(v, v2));
        }

        @Override  // c.ᴵⁱ.CLS335$CLS334
        public void MTH4778(View view0, int v, int v1, int v2, int v3) {
            int v4 = view0.getWidth();
            float f = (CLS315.this.MTH4563(view0, 3) ? ((float)(v + v4)) : ((float)(CLS315.this.getWidth() - v))) / ((float)v4);
            CLS315.this.MTH4558(view0, f);
            view0.setVisibility((f == 0.0f ? 4 : 0));
            CLS315.this.invalidate();
        }

        public final void MTH4472() {
            View view0 = CLS315.this.MTH4541((this.FLD1381 == 3 ? 5 : 3));
            if(view0 != null) {
                CLS315.this.MTH4572(view0);
            }
        }

        @Override  // c.ᴵⁱ.CLS335$CLS334
        public void MTH4779(View view0, int v) {
            ((CLS310)view0.getLayoutParams()).FLD1376 = false;
            this.MTH4472();
        }

        public void MTH4474() {
            CLS315.this.removeCallbacks(this.FLD1382);
        }

        public void MTH4475(CLS335 ˆٴ0) {
            this.FLD1380 = ˆٴ0;
        }

        @Override  // c.ᴵⁱ.CLS335$CLS334
        public void MTH4780(int v) {
            View view0 = this.FLD1380.MTH4830();
            CLS315.this.MTH4540(this.FLD1381, v, view0);
        }

        // 去混淆评级： 低(20)
        @Override  // c.ᴵⁱ.CLS335$CLS334
        public boolean MTH4781(View view0, int v) {
            return CLS315.this.MTH4573(view0) && CLS315.this.MTH4563(view0, this.FLD1381) && CLS315.this.MTH4553(view0) == 0;
        }

        @Override  // c.ᴵⁱ.CLS335$CLS334
        public boolean MTH4783(int v) {
            return false;
        }

        @Override  // c.ᴵⁱ.CLS335$CLS334
        public void MTH4784(int v, int v1) {
            CLS315.this.postDelayed(this.FLD1382, 0xA0L);
        }

        @Override  // c.ᴵⁱ.CLS335$CLS334
        public void MTH4785(int v, int v1) {
            int v2;
            CLS315 ٴⁱ0;
            if((v & 1) == 1) {
                ٴⁱ0 = CLS315.this;
                v2 = 3;
            }
            else {
                ٴⁱ0 = CLS315.this;
                v2 = 5;
            }
            View view0 = ٴⁱ0.MTH4541(v2);
            if(view0 != null && CLS315.this.MTH4553(view0) == 0) {
                this.FLD1380.MTH4791(view0, v1);
            }
        }

        // 去混淆评级： 低(20)
        @Override  // c.ᴵⁱ.CLS335$CLS334
        public int MTH4786(View view0) {
            return CLS315.this.MTH4573(view0) ? view0.getWidth() : 0;
        }
    }

    public static class CLS806 extends CLS61 {
        public static final class CLS313 implements Parcelable.ClassLoaderCreator {
            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.MTH4487(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                return this.MTH4486(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.MTH4488(v);
            }

            public CLS806 MTH4486(Parcel parcel0, ClassLoader classLoader0) {
                return new CLS806(parcel0, classLoader0);
            }

            public CLS806 MTH4487(Parcel parcel0) {
                return new CLS806(parcel0, null);
            }

            public CLS806[] MTH4488(int v) {
                return new CLS806[v];
            }
        }

        public static final Parcelable.Creator CREATOR;
        public int FLD1385;
        public int FLD1386;
        public int FLD1387;
        public int FLD1388;
        public int FLD1389;

        static {
            CLS806.CREATOR = new CLS313();
        }

        public CLS806(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.FLD1386 = parcel0.readInt();
            this.FLD1389 = parcel0.readInt();
            this.FLD1385 = parcel0.readInt();
            this.FLD1388 = parcel0.readInt();
            this.FLD1387 = parcel0.readInt();
        }

        public CLS806(Parcelable parcelable0) {
            super(parcelable0);
            this.FLD1386 = 0;
        }

        @Override  // c.ʿˊ.CLS61
        public void writeToParcel(Parcel parcel0, int v) {
            ((CLS61)this).super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.FLD1386);
            parcel0.writeInt(this.FLD1389);
            parcel0.writeInt(this.FLD1385);
            parcel0.writeInt(this.FLD1388);
            parcel0.writeInt(this.FLD1387);
        }
    }

    public interface CLS314 {
        void MTH4493(View arg1);

        void MTH4494(int arg1);

        void MTH4495(View arg1, float arg2);

        void MTH4496(View arg1);
    }

    public Drawable FLD1390;
    public final ArrayList FLD1391;
    public float FLD1392;
    public static final boolean FLD1393;
    public Matrix FLD1394;
    public static final boolean FLD1395;
    public boolean FLD1396;
    public float FLD1397;
    public int FLD1398;
    public final CLS804 FLD1399;
    public CharSequence FLD1400;
    public boolean FLD1401;
    public int FLD1402;
    public Drawable FLD1403;
    public Drawable FLD1404;
    public List FLD1405;
    public int FLD1406;
    public final CLS805 FLD1407;
    public int FLD1408;
    public CharSequence FLD1409;
    public Drawable FLD1410;
    public int FLD1411;
    public static final int[] FLD1412;
    public final CLS805 FLD1413;
    public boolean FLD1414;
    public boolean FLD1415;
    public CLS314 FLD1416;
    public int FLD1417;
    public float FLD1418;
    public boolean FLD1419;
    public final CLS335 FLD1420;
    public Drawable FLD1421;
    public final CLS335 FLD1422;
    public Drawable FLD1423;
    public Paint FLD1424;
    public int FLD1425;
    public Object FLD1426;
    public Drawable FLD1427;
    public Rect FLD1428;
    public static final int[] FLD1429;
    public float FLD1430;

    static {
        boolean z = true;
        CLS315.FLD1412 = new int[]{0x1010434};
        CLS315.FLD1429 = new int[]{0x10100B3};
        CLS315.FLD1393 = Build.VERSION.SDK_INT >= 19;
        if(Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        CLS315.FLD1395 = z;
    }

    public CLS315(Context context0) {
        this(context0, null);
    }

    public CLS315(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public CLS315(Context context0, AttributeSet attributeSet0, int v) {
        public class CLS311 implements View.OnApplyWindowInsetsListener {
            public final CLS315 FLD1378;

            @Override  // android.view.View$OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
                ((CLS315)view0).MTH4577(windowInsets0, windowInsets0.getSystemWindowInsetTop() > 0);
                return windowInsets0.consumeSystemWindowInsets();
            }
        }

        super(context0, attributeSet0, v);
        this.FLD1399 = new CLS804();
        this.FLD1425 = 0x99000000;
        this.FLD1424 = new Paint();
        this.FLD1414 = true;
        this.FLD1406 = 3;
        this.FLD1398 = 3;
        this.FLD1408 = 3;
        this.FLD1411 = 3;
        this.FLD1390 = null;
        this.FLD1403 = null;
        this.FLD1427 = null;
        this.FLD1423 = null;
        this.setDescendantFocusability(0x40000);
        float f = this.getResources().getDisplayMetrics().density;
        this.FLD1417 = (int)(64.0f * f + 0.5f);
        CLS805 ٴⁱ$ٴˑ0 = new CLS805(this, 3);
        this.FLD1407 = ٴⁱ$ٴˑ0;
        CLS805 ٴⁱ$ٴˑ1 = new CLS805(this, 5);
        this.FLD1413 = ٴⁱ$ٴˑ1;
        CLS335 ˆٴ0 = CLS335.MTH4805(this, 1.0f, ((CLS334)ٴⁱ$ٴˑ0));
        this.FLD1420 = ˆٴ0;
        ˆٴ0.MTH4793(1);
        ˆٴ0.MTH4811(400.0f * f);
        ٴⁱ$ٴˑ0.MTH4475(ˆٴ0);
        CLS335 ˆٴ1 = CLS335.MTH4805(this, 1.0f, ((CLS334)ٴⁱ$ٴˑ1));
        this.FLD1422 = ˆٴ1;
        ˆٴ1.MTH4793(2);
        ˆٴ1.MTH4811(400.0f * f);
        ٴⁱ$ٴˑ1.MTH4475(ˆٴ1);
        this.setFocusableInTouchMode(true);
        CLS274.MTH4153(this, 1);
        CLS274.MTH4148(this, ((CLS276)new CLS803(this)));
        this.setMotionEventSplittingEnabled(false);
        if(CLS274.MTH4149(this)) {
            if(Build.VERSION.SDK_INT >= 21) {
                this.setOnApplyWindowInsetsListener(new CLS311(this));
                this.setSystemUiVisibility(0x500);
                TypedArray typedArray0 = context0.obtainStyledAttributes(CLS315.FLD1412);
                try {
                    this.FLD1421 = typedArray0.getDrawable(0);
                }
                finally {
                    typedArray0.recycle();
                }
            }
            else {
                this.FLD1421 = null;
            }
        }
        this.FLD1392 = f * 10.0f;
        this.FLD1391 = new ArrayList();
    }

    @Override  // android.view.ViewGroup
    public void addFocusables(ArrayList arrayList0, int v, int v1) {
        if(this.getDescendantFocusability() == 0x60000) {
            return;
        }
        int v2 = this.getChildCount();
        boolean z = false;
        for(int v4 = 0; v4 < v2; ++v4) {
            View view0 = this.getChildAt(v4);
            if(!this.MTH4573(view0)) {
                this.FLD1391.add(view0);
            }
            else if(this.MTH4545(view0)) {
                view0.addFocusables(arrayList0, v, v1);
                z = true;
            }
        }
        if(!z) {
            int v5 = this.FLD1391.size();
            for(int v3 = 0; v3 < v5; ++v3) {
                View view1 = (View)this.FLD1391.get(v3);
                if(view1.getVisibility() == 0) {
                    view1.addFocusables(arrayList0, v, v1);
                }
            }
        }
        this.FLD1391.clear();
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
        CLS274.MTH4153(view0, (this.MTH4560() != null || this.MTH4573(view0) ? 4 : 1));
        if(!CLS315.FLD1393) {
            CLS274.MTH4148(view0, ((CLS276)this.FLD1399));
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof CLS310 && super.checkLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    public void computeScroll() {
        int v = this.getChildCount();
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            f = Math.max(f, ((CLS310)this.getChildAt(v1).getLayoutParams()).FLD1374);
        }
        this.FLD1397 = f;
        if(this.FLD1420.MTH4813(true) || this.FLD1422.MTH4813(true)) {
            CLS274.MTH4152(this);
        }
    }

    @Override  // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent0) {
        if((motionEvent0.getSource() & 2) != 0 && motionEvent0.getAction() != 10 && this.FLD1397 > 0.0f) {
            int v = this.getChildCount();
            if(v != 0) {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                for(int v1 = v - 1; v1 >= 0; --v1) {
                    View view0 = this.getChildAt(v1);
                    if(this.MTH4533(f, f1, view0) && !this.MTH4555(view0) && this.MTH4547(motionEvent0, view0)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent0);
    }

    @Override  // android.view.ViewGroup
    public boolean drawChild(Canvas canvas0, View view0, long v) {
        Drawable drawable0;
        int v1 = this.getHeight();
        boolean z = this.MTH4555(view0);
        int v2 = this.getWidth();
        int v3 = canvas0.save();
        int v4 = 0;
        if(z) {
            int v5 = this.getChildCount();
            int v7 = 0;
            for(int v6 = 0; v6 < v5; ++v6) {
                View view1 = this.getChildAt(v6);
                if(view1 != view0 && view1.getVisibility() == 0 && CLS315.MTH4578(view1) && this.MTH4573(view1) && view1.getHeight() >= v1) {
                    if(this.MTH4563(view1, 3)) {
                        int v8 = view1.getRight();
                        if(v8 > v7) {
                            v7 = v8;
                        }
                    }
                    else {
                        int v9 = view1.getLeft();
                        if(v9 < v2) {
                            v2 = v9;
                        }
                    }
                }
            }
            canvas0.clipRect(v7, 0, v2, this.getHeight());
            v4 = v7;
        }
        boolean z1 = super.drawChild(canvas0, view0, v);
        canvas0.restoreToCount(v3);
        float f = this.FLD1397;
        if(f > 0.0f && z) {
            this.FLD1424.setColor(this.FLD1425 & 0xFFFFFF | ((int)(((float)((0xFF000000 & this.FLD1425) >>> 24)) * f)) << 24);
            canvas0.drawRect(((float)v4), 0.0f, ((float)v2), ((float)this.getHeight()), this.FLD1424);
            return z1;
        }
        if(this.FLD1404 != null && this.MTH4563(view0, 3)) {
            int v10 = this.FLD1404.getIntrinsicWidth();
            int v11 = view0.getRight();
            this.FLD1404.setBounds(v11, view0.getTop(), v10 + v11, view0.getBottom());
            this.FLD1404.setAlpha(((int)(Math.max(0.0f, Math.min(((float)v11) / ((float)this.FLD1420.MTH4817()), 1.0f)) * 255.0f)));
            drawable0 = this.FLD1404;
        }
        else if(this.FLD1410 != null && this.MTH4563(view0, 5)) {
            int v12 = this.FLD1410.getIntrinsicWidth();
            int v13 = view0.getLeft();
            float f1 = Math.max(0.0f, Math.min(((float)(this.getWidth() - v13)) / ((float)this.FLD1422.MTH4817()), 1.0f));
            this.FLD1410.setBounds(v13 - v12, view0.getTop(), v13, view0.getBottom());
            this.FLD1410.setAlpha(((int)(f1 * 255.0f)));
            drawable0 = this.FLD1410;
        }
        else {
            return z1;
        }
        drawable0.draw(canvas0);
        return z1;
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new CLS310(-1, -1);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new CLS310(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof CLS310) {
            return new CLS310(((CLS310)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new CLS310(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new CLS310(viewGroup$LayoutParams0);
    }

    // 去混淆评级： 低(20)
    public float getDrawerElevation() {
        return CLS315.FLD1395 ? this.FLD1392 : 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.FLD1421;
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.FLD1414 = true;
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.FLD1414 = true;
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        int v;
        super.onDraw(canvas0);
        if(this.FLD1401 && this.FLD1421 != null) {
            if(Build.VERSION.SDK_INT >= 21) {
                Object object0 = this.FLD1426;
                v = object0 == null ? 0 : ((WindowInsets)object0).getSystemWindowInsetTop();
            }
            else {
                v = 0;
            }
            if(v > 0) {
                this.FLD1421.setBounds(0, 0, this.getWidth(), v);
                this.FLD1421.draw(canvas0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        int v = motionEvent0.getActionMasked();
        boolean z = this.FLD1420.MTH4792(motionEvent0);
        boolean z1 = this.FLD1422.MTH4792(motionEvent0);
        switch(v) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                this.FLD1430 = f;
                this.FLD1418 = f1;
                if(this.FLD1397 > 0.0f) {
                    View view0 = this.FLD1420.MTH4815(((int)f), ((int)f1));
                    z2 = view0 == null || !this.MTH4555(view0) ? false : true;
                }
                else {
                    z2 = false;
                }
                this.FLD1419 = false;
                this.FLD1415 = false;
                return z || z1 || z2 || this.MTH4564() || this.FLD1415;
            }
            case 2: {
                if(this.FLD1420.MTH4824(3)) {
                    this.FLD1407.MTH4474();
                    this.FLD1413.MTH4474();
                    return z || z1 || this.MTH4564() || this.FLD1415;
                }
                return z || z1 || this.MTH4564() || this.FLD1415;
            }
            case 1: 
            case 3: {
                this.MTH4566(true);
                this.FLD1419 = false;
                this.FLD1415 = false;
                return z || z1 || this.MTH4564() || this.FLD1415;
            }
            default: {
                return z || z1 || this.MTH4564() || this.FLD1415;
            }
        }
    }

    @Override  // android.view.View
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(v == 4 && this.MTH4567()) {
            keyEvent0.startTracking();
            return true;
        }
        return super.onKeyDown(v, keyEvent0);
    }

    @Override  // android.view.View
    public boolean onKeyUp(int v, KeyEvent keyEvent0) {
        if(v == 4) {
            View view0 = this.MTH4551();
            if(view0 != null && this.MTH4553(view0) == 0) {
                this.MTH4571();
            }
            return view0 != null;
        }
        return super.onKeyUp(v, keyEvent0);
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        float f;
        int v10;
        this.FLD1396 = true;
        int v4 = v2 - v;
        int v5 = this.getChildCount();
        for(int v6 = 0; v6 < v5; ++v6) {
            View view0 = this.getChildAt(v6);
            if(view0.getVisibility() != 8) {
                CLS310 ٴⁱ$ʿˊ0 = (CLS310)view0.getLayoutParams();
                if(this.MTH4555(view0)) {
                    int v7 = ٴⁱ$ʿˊ0.leftMargin;
                    view0.layout(v7, ٴⁱ$ʿˊ0.topMargin, view0.getMeasuredWidth() + v7, ٴⁱ$ʿˊ0.topMargin + view0.getMeasuredHeight());
                }
                else {
                    int v8 = view0.getMeasuredWidth();
                    int v9 = view0.getMeasuredHeight();
                    if(this.MTH4563(view0, 3)) {
                        v10 = ((int)(ٴⁱ$ʿˊ0.FLD1374 * ((float)v8))) - v8;
                        f = ((float)(v8 + v10)) / ((float)v8);
                    }
                    else {
                        int v11 = v4 - ((int)(ٴⁱ$ʿˊ0.FLD1374 * ((float)v8)));
                        f = ((float)(v4 - v11)) / ((float)v8);
                        v10 = v11;
                    }
                    boolean z1 = f != ٴⁱ$ʿˊ0.FLD1374;
                    switch(ٴⁱ$ʿˊ0.FLD1375 & 0x70) {
                        case 16: {
                            int v12 = v3 - v1;
                            int v13 = (v12 - v9) / 2;
                            int v14 = ٴⁱ$ʿˊ0.topMargin;
                            if(v13 < v14) {
                                v13 = v14;
                            }
                            else {
                                int v15 = ٴⁱ$ʿˊ0.bottomMargin;
                                if(v13 + v9 > v12 - v15) {
                                    v13 = v12 - v15 - v9;
                                }
                            }
                            view0.layout(v10, v13, v8 + v10, v9 + v13);
                            break;
                        }
                        case 80: {
                            view0.layout(v10, v3 - v1 - ٴⁱ$ʿˊ0.bottomMargin - view0.getMeasuredHeight(), v8 + v10, v3 - v1 - ٴⁱ$ʿˊ0.bottomMargin);
                            break;
                        }
                        default: {
                            view0.layout(v10, ٴⁱ$ʿˊ0.topMargin, v8 + v10, v9 + ٴⁱ$ʿˊ0.topMargin);
                        }
                    }
                    if(z1) {
                        this.MTH4558(view0, f);
                    }
                    int v16 = ٴⁱ$ʿˊ0.FLD1374 > 0.0f ? 0 : 4;
                    if(view0.getVisibility() != v16) {
                        view0.setVisibility(v16);
                    }
                }
            }
        }
        this.FLD1396 = false;
        this.FLD1414 = false;
    }

    @Override  // android.view.View
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getMode(v1);
        int v4 = View.MeasureSpec.getSize(v);
        int v5 = View.MeasureSpec.getSize(v1);
        if(v2 != 0x40000000 || v3 != 0x40000000) {
            if(!this.isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if(v2 != 0x80000000 && v2 == 0) {
                v4 = 300;
            }
            if(v3 != 0x80000000 && v3 == 0) {
                v5 = 300;
            }
        }
        this.setMeasuredDimension(v4, v5);
        boolean z = this.FLD1426 != null && CLS274.MTH4149(this);
        int v6 = CLS274.MTH4158(this);
        int v7 = this.getChildCount();
        boolean z1 = false;
        boolean z2 = false;
        for(int v8 = 0; v8 < v7; ++v8) {
            View view0 = this.getChildAt(v8);
            if(view0.getVisibility() != 8) {
                CLS310 ٴⁱ$ʿˊ0 = (CLS310)view0.getLayoutParams();
                if(z) {
                    int v9 = CLS280.MTH4187(ٴⁱ$ʿˊ0.FLD1375, v6);
                    boolean z3 = CLS274.MTH4149(view0);
                    int v10 = Build.VERSION.SDK_INT;
                    if(!z3) {
                        if(v10 >= 21) {
                            WindowInsets windowInsets1 = (WindowInsets)this.FLD1426;
                            if(v9 == 3) {
                                windowInsets1 = windowInsets1.replaceSystemWindowInsets(windowInsets1.getSystemWindowInsetLeft(), windowInsets1.getSystemWindowInsetTop(), 0, windowInsets1.getSystemWindowInsetBottom());
                            }
                            else if(v9 == 5) {
                                windowInsets1 = windowInsets1.replaceSystemWindowInsets(0, windowInsets1.getSystemWindowInsetTop(), windowInsets1.getSystemWindowInsetRight(), windowInsets1.getSystemWindowInsetBottom());
                            }
                            ٴⁱ$ʿˊ0.leftMargin = windowInsets1.getSystemWindowInsetLeft();
                            ٴⁱ$ʿˊ0.topMargin = windowInsets1.getSystemWindowInsetTop();
                            ٴⁱ$ʿˊ0.rightMargin = windowInsets1.getSystemWindowInsetRight();
                            ٴⁱ$ʿˊ0.bottomMargin = windowInsets1.getSystemWindowInsetBottom();
                        }
                    }
                    else if(v10 >= 21) {
                        WindowInsets windowInsets0 = (WindowInsets)this.FLD1426;
                        if(v9 == 3) {
                            windowInsets0 = windowInsets0.replaceSystemWindowInsets(windowInsets0.getSystemWindowInsetLeft(), windowInsets0.getSystemWindowInsetTop(), 0, windowInsets0.getSystemWindowInsetBottom());
                        }
                        else if(v9 == 5) {
                            windowInsets0 = windowInsets0.replaceSystemWindowInsets(0, windowInsets0.getSystemWindowInsetTop(), windowInsets0.getSystemWindowInsetRight(), windowInsets0.getSystemWindowInsetBottom());
                        }
                        view0.dispatchApplyWindowInsets(windowInsets0);
                    }
                }
                if(this.MTH4555(view0)) {
                    view0.measure(View.MeasureSpec.makeMeasureSpec(v4 - ٴⁱ$ʿˊ0.leftMargin - ٴⁱ$ʿˊ0.rightMargin, 0x40000000), View.MeasureSpec.makeMeasureSpec(v5 - ٴⁱ$ʿˊ0.topMargin - ٴⁱ$ʿˊ0.bottomMargin, 0x40000000));
                }
                else {
                    if(!this.MTH4573(view0)) {
                        throw new IllegalStateException("Child " + view0 + " at index " + v8 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if(CLS315.FLD1395) {
                        float f = CLS274.MTH4157(view0);
                        float f1 = this.FLD1392;
                        if(f != f1) {
                            CLS274.MTH4156(view0, f1);
                        }
                    }
                    int v11 = this.MTH4565(view0) & 7;
                    if(v11 == 3 && z1 || v11 != 3 && z2) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + CLS315.MTH4550(v11) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                    if(v11 == 3) {
                        z1 = true;
                    }
                    else {
                        z2 = true;
                    }
                    view0.measure(ViewGroup.getChildMeasureSpec(v, this.FLD1417 + ٴⁱ$ʿˊ0.leftMargin + ٴⁱ$ʿˊ0.rightMargin, ٴⁱ$ʿˊ0.width), ViewGroup.getChildMeasureSpec(v1, ٴⁱ$ʿˊ0.topMargin + ٴⁱ$ʿˊ0.bottomMargin, ٴⁱ$ʿˊ0.height));
                    continue;
                }
            }
        }
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof CLS806)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((CLS61)(((CLS806)parcelable0))).MTH1102());
        int v = ((CLS806)parcelable0).FLD1386;
        if(v != 0) {
            View view0 = this.MTH4541(v);
            if(view0 != null) {
                this.MTH4575(view0);
            }
        }
        int v1 = ((CLS806)parcelable0).FLD1389;
        if(v1 != 3) {
            this.MTH4570(v1, 3);
        }
        int v2 = ((CLS806)parcelable0).FLD1385;
        if(v2 != 3) {
            this.MTH4570(v2, 5);
        }
        int v3 = ((CLS806)parcelable0).FLD1388;
        if(v3 != 3) {
            this.MTH4570(v3, 0x800003);
        }
        int v4 = ((CLS806)parcelable0).FLD1387;
        if(v4 != 3) {
            this.MTH4570(v4, 0x800005);
        }
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        this.MTH4539();
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        CLS806 ٴⁱ$ᴵⁱ0 = new CLS806(super.onSaveInstanceState());
        int v = this.getChildCount();
        int v1 = 0;
        while(v1 < v) {
            CLS310 ٴⁱ$ʿˊ0 = (CLS310)this.getChildAt(v1).getLayoutParams();
            if(ٴⁱ$ʿˊ0.FLD1377 != 1 && ٴⁱ$ʿˊ0.FLD1377 != 2) {
                ++v1;
            }
            else {
                ٴⁱ$ᴵⁱ0.FLD1386 = ٴⁱ$ʿˊ0.FLD1375;
                if(true) {
                    break;
                }
            }
        }
        ٴⁱ$ᴵⁱ0.FLD1389 = this.FLD1406;
        ٴⁱ$ᴵⁱ0.FLD1385 = this.FLD1398;
        ٴⁱ$ᴵⁱ0.FLD1388 = this.FLD1408;
        ٴⁱ$ᴵⁱ0.FLD1387 = this.FLD1411;
        return ٴⁱ$ᴵⁱ0;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z;
        this.FLD1420.MTH4789(motionEvent0);
        this.FLD1422.MTH4789(motionEvent0);
        int v = motionEvent0.getAction();
        switch(v & 0xFF) {
            case 0: {
                float f4 = motionEvent0.getX();
                float f5 = motionEvent0.getY();
                this.FLD1430 = f4;
                this.FLD1418 = f5;
                this.FLD1419 = false;
                this.FLD1415 = false;
                break;
            }
            case 1: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                View view0 = this.FLD1420.MTH4815(((int)f), ((int)f1));
                if(view0 == null || !this.MTH4555(view0)) {
                    z = true;
                }
                else {
                    float f2 = f - this.FLD1430;
                    float f3 = f1 - this.FLD1418;
                    int v1 = this.FLD1420.MTH4803();
                    if(f2 * f2 + f3 * f3 < ((float)(v1 * v1))) {
                        View view1 = this.MTH4560();
                        z = view1 == null || this.MTH4553(view1) == 2;
                    }
                    else {
                        z = true;
                    }
                }
                this.MTH4566(z);
                this.FLD1419 = false;
                return true;
            label_25:
                if((v & 0xFF) == 3) {
                    this.MTH4566(true);
                    this.FLD1419 = false;
                    this.FLD1415 = false;
                    return true;
                }
                break;
            }
            default: {
                goto label_25;
            }
        }
        return true;
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.FLD1419 = z;
        if(z) {
            this.MTH4566(true);
        }
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if(!this.FLD1396) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.FLD1392 = f;
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(this.MTH4573(view0)) {
                CLS274.MTH4156(view0, this.FLD1392);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(CLS314 ٴⁱ$ᵔﹶ0) {
        CLS314 ٴⁱ$ᵔﹶ1 = this.FLD1416;
        if(ٴⁱ$ᵔﹶ1 != null) {
            this.MTH4557(ٴⁱ$ᵔﹶ1);
        }
        if(ٴⁱ$ᵔﹶ0 != null) {
            this.MTH4544(ٴⁱ$ᵔﹶ0);
        }
        this.FLD1416 = ٴⁱ$ᵔﹶ0;
    }

    public void setDrawerLockMode(int v) {
        this.MTH4570(v, 3);
        this.MTH4570(v, 5);
    }

    public void setScrimColor(int v) {
        this.FLD1425 = v;
        this.invalidate();
    }

    public void setStatusBarBackground(int v) {
        this.FLD1421 = v == 0 ? null : CLS78.MTH1871(this.getContext(), v);
        this.invalidate();
    }

    public void setStatusBarBackground(Drawable drawable0) {
        this.FLD1421 = drawable0;
        this.invalidate();
    }

    public void setStatusBarBackgroundColor(int v) {
        this.FLD1421 = new ColorDrawable(v);
        this.invalidate();
    }

    public final boolean MTH4533(float f, float f1, View view0) {
        if(this.FLD1428 == null) {
            this.FLD1428 = new Rect();
        }
        view0.getHitRect(this.FLD1428);
        return this.FLD1428.contains(((int)f), ((int)f1));
    }

    public void MTH4534(int v, boolean z) {
        View view0 = this.MTH4541(v);
        if(view0 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + CLS315.MTH4550(v));
        }
        this.MTH4538(view0, z);
    }

    public void MTH4535() {
        if(!this.FLD1415) {
            long v = SystemClock.uptimeMillis();
            MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
            int v1 = this.getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                this.getChildAt(v2).dispatchTouchEvent(motionEvent0);
            }
            motionEvent0.recycle();
            this.FLD1415 = true;
        }
    }

    public final Drawable MTH4536() {
        int v = CLS274.MTH4158(this);
        if(v == 0) {
            Drawable drawable0 = this.FLD1403;
            if(drawable0 != null) {
                this.MTH4548(drawable0, 0);
                return this.FLD1403;
            }
        }
        else {
            Drawable drawable1 = this.FLD1390;
            if(drawable1 != null) {
                this.MTH4548(drawable1, v);
                return this.FLD1390;
            }
        }
        return this.FLD1423;
    }

    public final void MTH4537(View view0, boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.getChildAt(v1);
            CLS274.MTH4153(view1, ((z || this.MTH4573(view1)) && (!z || view1 != view0) ? 4 : 1));
        }
    }

    public void MTH4538(View view0, boolean z) {
        if(!this.MTH4573(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a sliding drawer");
        }
        CLS310 ٴⁱ$ʿˊ0 = (CLS310)view0.getLayoutParams();
        if(this.FLD1414) {
            ٴⁱ$ʿˊ0.FLD1374 = 1.0f;
            ٴⁱ$ʿˊ0.FLD1377 = 1;
            this.MTH4537(view0, true);
        }
        else if(z) {
            ٴⁱ$ʿˊ0.FLD1377 |= 2;
            if(this.MTH4563(view0, 3)) {
                int v = view0.getTop();
                this.FLD1420.MTH4794(view0, 0, v);
            }
            else {
                int v1 = this.getWidth();
                int v2 = view0.getWidth();
                int v3 = view0.getTop();
                this.FLD1422.MTH4794(view0, v1 - v2, v3);
            }
        }
        else {
            this.MTH4574(view0, 1.0f);
            this.MTH4540(ٴⁱ$ʿˊ0.FLD1375, 0, view0);
            view0.setVisibility(0);
        }
        this.invalidate();
    }

    public final void MTH4539() {
        if(CLS315.FLD1395) {
            return;
        }
        this.FLD1404 = this.MTH4576();
        this.FLD1410 = this.MTH4536();
    }

    public void MTH4540(int v, int v1, View view0) {
        int v2 = 2;
        int v3 = this.FLD1420.MTH4809();
        int v4 = this.FLD1422.MTH4809();
        if(v3 == 1 || v4 == 1) {
            v2 = 1;
        }
        else if(v3 != 2 && v4 != 2) {
            v2 = 0;
        }
        if(view0 != null && v1 == 0) {
            float f = ((CLS310)view0.getLayoutParams()).FLD1374;
            if(f == 0.0f) {
                this.MTH4568(view0);
            }
            else if(f == 1.0f) {
                this.MTH4552(view0);
            }
        }
        if(v2 != this.FLD1402) {
            this.FLD1402 = v2;
            List list0 = this.FLD1405;
            if(list0 != null) {
                for(int v5 = list0.size() - 1; v5 >= 0; --v5) {
                    ((CLS314)this.FLD1405.get(v5)).MTH4494(v2);
                }
            }
        }
    }

    public View MTH4541(int v) {
        int v1 = CLS280.MTH4187(v, CLS274.MTH4158(this));
        int v2 = this.getChildCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            View view0 = this.getChildAt(v3);
            if((this.MTH4565(view0) & 7) == (v1 & 7)) {
                return view0;
            }
        }
        return null;
    }

    public void MTH4542(View view0, boolean z) {
        int v;
        CLS335 ˆٴ0;
        if(!this.MTH4573(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a sliding drawer");
        }
        CLS310 ٴⁱ$ʿˊ0 = (CLS310)view0.getLayoutParams();
        if(this.FLD1414) {
            ٴⁱ$ʿˊ0.FLD1374 = 0.0f;
            ٴⁱ$ʿˊ0.FLD1377 = 0;
        }
        else if(z) {
            ٴⁱ$ʿˊ0.FLD1377 |= 4;
            if(this.MTH4563(view0, 3)) {
                ˆٴ0 = this.FLD1420;
                v = -view0.getWidth();
            }
            else {
                ˆٴ0 = this.FLD1422;
                v = this.getWidth();
            }
            ˆٴ0.MTH4794(view0, v, view0.getTop());
        }
        else {
            this.MTH4574(view0, 0.0f);
            this.MTH4540(ٴⁱ$ʿˊ0.FLD1375, 0, view0);
            view0.setVisibility(4);
        }
        this.invalidate();
    }

    public int MTH4543(int v) {
        int v1 = CLS274.MTH4158(this);
        switch(v) {
            case 3: {
                int v2 = this.FLD1406;
                if(v2 != 3) {
                    return v2;
                }
                int v3 = v1 == 0 ? this.FLD1408 : this.FLD1411;
                return v3 == 3 ? 0 : v3;
            }
            case 5: {
                int v4 = this.FLD1398;
                if(v4 != 3) {
                    return v4;
                }
                int v5 = v1 == 0 ? this.FLD1411 : this.FLD1408;
                return v5 == 3 ? 0 : v5;
            }
            case 0x800003: {
                int v6 = this.FLD1408;
                if(v6 != 3) {
                    return v6;
                }
                int v7 = v1 == 0 ? this.FLD1406 : this.FLD1398;
                return v7 == 3 ? 0 : v7;
            }
            case 0x800005: {
                int v8 = this.FLD1411;
                if(v8 != 3) {
                    return v8;
                }
                int v9 = v1 == 0 ? this.FLD1398 : this.FLD1406;
                return v9 == 3 ? 0 : v9;
            }
            default: {
                return 0;
            }
        }
    }

    public void MTH4544(CLS314 ٴⁱ$ᵔﹶ0) {
        if(ٴⁱ$ᵔﹶ0 == null) {
            return;
        }
        if(this.FLD1405 == null) {
            this.FLD1405 = new ArrayList();
        }
        this.FLD1405.add(ٴⁱ$ᵔﹶ0);
    }

    public boolean MTH4545(View view0) {
        if(!this.MTH4573(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return (((CLS310)view0.getLayoutParams()).FLD1377 & 1) == 1;
    }

    public boolean MTH4546(View view0) {
        if(!this.MTH4573(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return ((CLS310)view0.getLayoutParams()).FLD1374 > 0.0f;
    }

    public final boolean MTH4547(MotionEvent motionEvent0, View view0) {
        boolean z;
        if(!view0.getMatrix().isIdentity()) {
            MotionEvent motionEvent1 = this.MTH4562(motionEvent0, view0);
            z = view0.dispatchGenericMotionEvent(motionEvent1);
            motionEvent1.recycle();
            return z;
        }
        float f = (float)(this.getScrollX() - view0.getLeft());
        float f1 = (float)(this.getScrollY() - view0.getTop());
        motionEvent0.offsetLocation(f, f1);
        z = view0.dispatchGenericMotionEvent(motionEvent0);
        motionEvent0.offsetLocation(-f, -f1);
        return z;
    }

    public final boolean MTH4548(Drawable drawable0, int v) {
        if(drawable0 != null && CLS27.MTH800(drawable0)) {
            CLS27.MTH799(drawable0, v);
            return true;
        }
        return false;
    }

    public static boolean MTH4549(View view0) {
        switch(CLS274.MTH4160(view0)) {
            case 2: 
            case 4: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    public static String MTH4550(int v) {
        if((v & 3) == 3) {
            return "LEFT";
        }
        return (v & 5) == 5 ? "RIGHT" : Integer.toHexString(v);
    }

    public View MTH4551() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(this.MTH4573(view0) && this.MTH4546(view0)) {
                return view0;
            }
        }
        return null;
    }

    public void MTH4552(View view0) {
        CLS310 ٴⁱ$ʿˊ0 = (CLS310)view0.getLayoutParams();
        if((ٴⁱ$ʿˊ0.FLD1377 & 1) == 0) {
            ٴⁱ$ʿˊ0.FLD1377 = 1;
            List list0 = this.FLD1405;
            if(list0 != null) {
                for(int v = list0.size() - 1; v >= 0; --v) {
                    ((CLS314)this.FLD1405.get(v)).MTH4493(view0);
                }
            }
            this.MTH4537(view0, true);
            if(this.hasWindowFocus()) {
                this.sendAccessibilityEvent(0x20);
            }
        }
    }

    public int MTH4553(View view0) {
        if(!this.MTH4573(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return this.MTH4543(((CLS310)view0.getLayoutParams()).FLD1375);
    }

    public boolean MTH4554(int v) {
        View view0 = this.MTH4541(v);
        return view0 == null ? false : this.MTH4545(view0);
    }

    public boolean MTH4555(View view0) {
        return ((CLS310)view0.getLayoutParams()).FLD1375 == 0;
    }

    public CharSequence MTH4556(int v) {
        int v1 = CLS280.MTH4187(v, CLS274.MTH4158(this));
        if(v1 == 3) {
            return this.FLD1409;
        }
        return v1 == 5 ? this.FLD1400 : null;
    }

    public void MTH4557(CLS314 ٴⁱ$ᵔﹶ0) {
        if(ٴⁱ$ᵔﹶ0 == null) {
            return;
        }
        List list0 = this.FLD1405;
        if(list0 == null) {
            return;
        }
        list0.remove(ٴⁱ$ᵔﹶ0);
    }

    public void MTH4558(View view0, float f) {
        CLS310 ٴⁱ$ʿˊ0 = (CLS310)view0.getLayoutParams();
        if(f == ٴⁱ$ʿˊ0.FLD1374) {
            return;
        }
        ٴⁱ$ʿˊ0.FLD1374 = f;
        this.MTH4559(view0, f);
    }

    public void MTH4559(View view0, float f) {
        List list0 = this.FLD1405;
        if(list0 != null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                ((CLS314)this.FLD1405.get(v)).MTH4495(view0, f);
            }
        }
    }

    public View MTH4560() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if((((CLS310)view0.getLayoutParams()).FLD1377 & 1) == 1) {
                return view0;
            }
        }
        return null;
    }

    public float MTH4561(View view0) {
        return ((CLS310)view0.getLayoutParams()).FLD1374;
    }

    public final MotionEvent MTH4562(MotionEvent motionEvent0, View view0) {
        int v = this.getScrollX();
        int v1 = view0.getLeft();
        int v2 = this.getScrollY();
        int v3 = view0.getTop();
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.offsetLocation(((float)(v - v1)), ((float)(v2 - v3)));
        Matrix matrix0 = view0.getMatrix();
        if(!matrix0.isIdentity()) {
            if(this.FLD1394 == null) {
                this.FLD1394 = new Matrix();
            }
            matrix0.invert(this.FLD1394);
            motionEvent1.transform(this.FLD1394);
        }
        return motionEvent1;
    }

    public boolean MTH4563(View view0, int v) {
        return (this.MTH4565(view0) & v) == v;
    }

    public final boolean MTH4564() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((CLS310)this.getChildAt(v1).getLayoutParams()).FLD1376) {
                return true;
            }
        }
        return false;
    }

    public int MTH4565(View view0) {
        return CLS280.MTH4187(((CLS310)view0.getLayoutParams()).FLD1375, CLS274.MTH4158(this));
    }

    public void MTH4566(boolean z) {
        boolean z2;
        int v = this.getChildCount();
        boolean z1 = false;
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            CLS310 ٴⁱ$ʿˊ0 = (CLS310)view0.getLayoutParams();
            if(this.MTH4573(view0) && (!z || ٴⁱ$ʿˊ0.FLD1376)) {
                int v2 = view0.getWidth();
                if(this.MTH4563(view0, 3)) {
                    int v3 = view0.getTop();
                    z2 = this.FLD1420.MTH4794(view0, -v2, v3);
                }
                else {
                    int v4 = this.getWidth();
                    int v5 = view0.getTop();
                    z2 = this.FLD1422.MTH4794(view0, v4, v5);
                }
                z1 |= z2;
                ٴⁱ$ʿˊ0.FLD1376 = false;
            }
        }
        this.FLD1407.MTH4474();
        this.FLD1413.MTH4474();
        if(z1) {
            this.invalidate();
        }
    }

    public final boolean MTH4567() {
        return this.MTH4551() != null;
    }

    public void MTH4568(View view0) {
        CLS310 ٴⁱ$ʿˊ0 = (CLS310)view0.getLayoutParams();
        if((ٴⁱ$ʿˊ0.FLD1377 & 1) == 1) {
            ٴⁱ$ʿˊ0.FLD1377 = 0;
            List list0 = this.FLD1405;
            if(list0 != null) {
                for(int v = list0.size() - 1; v >= 0; --v) {
                    ((CLS314)this.FLD1405.get(v)).MTH4496(view0);
                }
            }
            this.MTH4537(view0, false);
            if(this.hasWindowFocus()) {
                View view1 = this.getRootView();
                if(view1 != null) {
                    view1.sendAccessibilityEvent(0x20);
                }
            }
        }
    }

    public void MTH4569(int v) {
        this.MTH4534(v, true);
    }

    public void MTH4570(int v, int v1) {
        int v2 = CLS280.MTH4187(v1, CLS274.MTH4158(this));
        switch(v1) {
            case 3: {
                this.FLD1406 = v;
                break;
            }
            case 5: {
                this.FLD1398 = v;
                break;
            }
            case 0x800003: {
                this.FLD1408 = v;
                break;
            }
            case 0x800005: {
                this.FLD1411 = v;
            }
        }
        if(v != 0) {
            (v2 == 3 ? this.FLD1420 : this.FLD1422).MTH4798();
        }
        switch(v) {
            case 1: {
                View view0 = this.MTH4541(v2);
                if(view0 != null) {
                    this.MTH4572(view0);
                    return;
                }
                break;
            }
            case 2: {
                View view1 = this.MTH4541(v2);
                if(view1 != null) {
                    this.MTH4575(view1);
                    return;
                }
                break;
            }
        }
    }

    public void MTH4571() {
        this.MTH4566(false);
    }

    public void MTH4572(View view0) {
        this.MTH4542(view0, true);
    }

    public boolean MTH4573(View view0) {
        int v = CLS280.MTH4187(((CLS310)view0.getLayoutParams()).FLD1375, CLS274.MTH4158(view0));
        return (v & 3) == 0 ? (v & 5) != 0 : true;
    }

    public void MTH4574(View view0, float f) {
        float f1 = this.MTH4561(view0);
        float f2 = (float)view0.getWidth();
        view0.offsetLeftAndRight((this.MTH4563(view0, 3) ? ((int)(f2 * f)) - ((int)(f1 * f2)) : -(((int)(f2 * f)) - ((int)(f1 * f2)))));
        this.MTH4558(view0, f);
    }

    public void MTH4575(View view0) {
        this.MTH4538(view0, true);
    }

    public final Drawable MTH4576() {
        int v = CLS274.MTH4158(this);
        if(v == 0) {
            Drawable drawable0 = this.FLD1390;
            if(drawable0 != null) {
                this.MTH4548(drawable0, 0);
                return this.FLD1390;
            }
        }
        else {
            Drawable drawable1 = this.FLD1403;
            if(drawable1 != null) {
                this.MTH4548(drawable1, v);
                return this.FLD1403;
            }
        }
        return this.FLD1427;
    }

    public void MTH4577(Object object0, boolean z) {
        this.FLD1426 = object0;
        this.FLD1401 = z;
        this.setWillNotDraw(!z && this.getBackground() == null);
        this.requestLayout();
    }

    public static boolean MTH4578(View view0) {
        Drawable drawable0 = view0.getBackground();
        return drawable0 != null && drawable0.getOpacity() == -1;
    }
}

