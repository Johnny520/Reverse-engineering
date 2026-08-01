// Decompiled by JEB v5.42.0.202606242140

package c.ᵔʼ;

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
import c.ʾʻ.CLS27;
import c.ʾʻ.CLS31;
import c.ʾʻ.CLS32;
import c.ˈᴵ.CLS56;
import c.ˉˎ.CLS86.CLS85;
import c.ˉˎ.CLS86;
import c.ˋʼ.CLS102.CLS99;
import c.ˋʼ.CLS102;
import c.ⁱˋ.CLS333;
import c.ﾞⁱ.CLS377;
import java.util.ArrayList;
import java.util.List;

public class CLS316 extends ViewGroup {
    public static final class CLS801 extends CLS27 {
        @Override  // c.ʾʻ.CLS27
        public void MTH819(View view0, CLS86 ᴵˉ0) {
            ((CLS27)this).super.MTH819(view0, ᴵˉ0);
            if(!CLS316.MTH4633(view0)) {
                ᴵˉ0.MTH1215(null);
            }
        }
    }

    public static class CLS311 extends ViewGroup.MarginLayoutParams {
        public boolean FLD1454;
        public int FLD1455;
        public int FLD1456;
        public float FLD1457;

        public CLS311(int v, int v1) {
            super(v, v1);
            this.FLD1456 = 0;
        }

        public CLS311(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.FLD1456 = 0;
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, CLS316.FLD1509);
            this.FLD1456 = typedArray0.getInt(0, 0);
            typedArray0.recycle();
        }

        public CLS311(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
            super(viewGroup$LayoutParams0);
            this.FLD1456 = 0;
        }

        public CLS311(ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0) {
            super(viewGroup$MarginLayoutParams0);
            this.FLD1456 = 0;
        }

        public CLS311(CLS311 ᵔʼ$ˈᴵ0) {
            super(ᵔʼ$ˈᴵ0);
            this.FLD1456 = ᵔʼ$ˈᴵ0.FLD1456;
        }
    }

    public interface CLS312 {
        void MTH4542(View arg1, float arg2);

        void MTH4543(View arg1);

        void MTH4544(int arg1);

        void MTH4545(View arg1);
    }

    public static class CLS802 extends CLS56 {
        public static final class CLS313 implements Parcelable.ClassLoaderCreator {
            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.MTH4551(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                return this.MTH4552(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.MTH4550(v);
            }

            public CLS802[] MTH4550(int v) {
                return new CLS802[v];
            }

            public CLS802 MTH4551(Parcel parcel0) {
                return new CLS802(parcel0, null);
            }

            public CLS802 MTH4552(Parcel parcel0, ClassLoader classLoader0) {
                return new CLS802(parcel0, classLoader0);
            }
        }

        public static final Parcelable.Creator CREATOR;
        public int FLD1459;
        public int FLD1460;
        public int FLD1461;
        public int FLD1462;
        public int FLD1463;

        static {
            CLS802.CREATOR = new CLS313();
        }

        public CLS802(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.FLD1459 = parcel0.readInt();
            this.FLD1461 = parcel0.readInt();
            this.FLD1460 = parcel0.readInt();
            this.FLD1462 = parcel0.readInt();
            this.FLD1463 = parcel0.readInt();
        }

        public CLS802(Parcelable parcelable0) {
            super(parcelable0);
            this.FLD1459 = 0;
        }

        @Override  // c.ˈᴵ.CLS56
        public void writeToParcel(Parcel parcel0, int v) {
            ((CLS56)this).super.writeToParcel(parcel0, v);
            parcel0.writeInt(this.FLD1459);
            parcel0.writeInt(this.FLD1461);
            parcel0.writeInt(this.FLD1460);
            parcel0.writeInt(this.FLD1462);
            parcel0.writeInt(this.FLD1463);
        }
    }

    public class CLS803 extends CLS99 {
        public class CLS315 implements Runnable {
            public final CLS803 FLD1465;

            @Override
            public void run() {
                CLS803.this.MTH4570();
            }
        }

        public final Runnable FLD1466;
        public final CLS316 FLD1467;
        public final int FLD1468;
        public CLS102 FLD1469;

        public CLS803(int v) {
            this.FLD1466 = () -> {
                int v2;
                View view0;
                int v = CLS803.this.FLD1469.MTH1364();
                int v1 = 0;
                boolean z = CLS803.this.FLD1468 == 3;
                if(z) {
                    view0 = CLS316.this.MTH4629(3);
                    if(view0 != null) {
                        v1 = -view0.getWidth();
                    }
                    v2 = v1 + v;
                }
                else {
                    view0 = CLS316.this.MTH4629(5);
                    v2 = CLS316.this.getWidth() - v;
                }
                if(view0 != null && (z && view0.getLeft() < v2 || !z && view0.getLeft() > v2) && CLS316.this.MTH4661(view0) == 0) {
                    CLS311 ᵔʼ$ˈᴵ0 = (CLS311)view0.getLayoutParams();
                    CLS803.this.FLD1469.MTH1368(view0, v2, view0.getTop());
                    ᵔʼ$ˈᴵ0.FLD1454 = true;
                    CLS316.this.invalidate();
                    CLS803.this.MTH4568();
                    CLS316.this.MTH4665();
                }
            };
            this.FLD1468 = v;
        }

        @Override  // c.ˋʼ.CLS102$CLS99
        public void MTH1343(View view0, int v) {
            ((CLS311)view0.getLayoutParams()).FLD1454 = false;
            this.MTH4568();
        }

        @Override  // c.ˋʼ.CLS102$CLS99
        public void MTH1344(View view0, float f, float f1) {
            int v1;
            float f2 = CLS316.this.MTH4640(view0);
            int v = view0.getWidth();
            if(!CLS316.this.MTH4624(view0, 3)) {
                int v2 = CLS316.this.getWidth();
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
            this.FLD1469.MTH1399(v1, view0.getTop());
            CLS316.this.invalidate();
        }

        // 去混淆评级： 低(20)
        @Override  // c.ˋʼ.CLS102$CLS99
        public boolean MTH1346(View view0, int v) {
            return CLS316.this.MTH4627(view0) && CLS316.this.MTH4624(view0, this.FLD1468) && CLS316.this.MTH4661(view0) == 0;
        }

        // 去混淆评级： 低(20)
        @Override  // c.ˋʼ.CLS102$CLS99
        public int MTH1347(View view0) {
            return CLS316.this.MTH4627(view0) ? view0.getWidth() : 0;
        }

        @Override  // c.ˋʼ.CLS102$CLS99
        public void MTH1348(View view0, int v, int v1, int v2, int v3) {
            int v4 = view0.getWidth();
            float f = (CLS316.this.MTH4624(view0, 3) ? ((float)(v + v4)) : ((float)(CLS316.this.getWidth() - v))) / ((float)v4);
            CLS316.this.MTH4644(view0, f);
            view0.setVisibility((f == 0.0f ? 4 : 0));
            CLS316.this.invalidate();
        }

        @Override  // c.ˋʼ.CLS102$CLS99
        public void MTH1349(int v, int v1) {
            int v2;
            CLS316 ᵔʼ0;
            if((v & 1) == 1) {
                ᵔʼ0 = CLS316.this;
                v2 = 3;
            }
            else {
                ᵔʼ0 = CLS316.this;
                v2 = 5;
            }
            View view0 = ᵔʼ0.MTH4629(v2);
            if(view0 != null && CLS316.this.MTH4661(view0) == 0) {
                this.FLD1469.MTH1402(view0, v1);
            }
        }

        public final void MTH4568() {
            View view0 = CLS316.this.MTH4629((this.FLD1468 == 3 ? 5 : 3));
            if(view0 != null) {
                CLS316.this.MTH4632(view0);
            }
        }

        public void MTH4569(CLS102 ⁱˋ0) {
            this.FLD1469 = ⁱˋ0;
        }

        // 检测为 Lambda 实现
        public void MTH4570() [...]

        @Override  // c.ˋʼ.CLS102$CLS99
        public void MTH1350(int v, int v1) {
            CLS316.this.postDelayed(this.FLD1466, 0xA0L);
        }

        @Override  // c.ˋʼ.CLS102$CLS99
        public void MTH1351(int v) {
            View view0 = this.FLD1469.MTH1387();
            CLS316.this.MTH4625(this.FLD1468, v, view0);
        }

        @Override  // c.ˋʼ.CLS102$CLS99
        public int MTH1352(View view0, int v, int v1) {
            if(CLS316.this.MTH4624(view0, 3)) {
                return Math.max(-view0.getWidth(), Math.min(v, 0));
            }
            int v2 = CLS316.this.getWidth();
            return Math.max(v2 - view0.getWidth(), Math.min(v, v2));
        }

        public void MTH4574() {
            CLS316.this.removeCallbacks(this.FLD1466);
        }

        @Override  // c.ˋʼ.CLS102$CLS99
        public boolean MTH1353(int v) {
            return false;
        }

        @Override  // c.ˋʼ.CLS102$CLS99
        public int MTH1354(View view0, int v, int v1) {
            return view0.getTop();
        }
    }

    public class CLS804 extends CLS27 {
        public final Rect FLD1470;
        public final CLS316 FLD1471;

        public CLS804() {
            this.FLD1470 = new Rect();
        }

        public final void MTH4578(CLS86 ᴵˉ0, CLS86 ᴵˉ1) {
            ᴵˉ1.MTH1192(this.FLD1470);
            ᴵˉ0.MTH1198(this.FLD1470);
            ᴵˉ1.MTH1197(this.FLD1470);
            ᴵˉ0.MTH1189(this.FLD1470);
            ᴵˉ0.MTH1190(ᴵˉ1.MTH1186());
            ᴵˉ0.MTH1210(ᴵˉ1.MTH1188());
            ᴵˉ0.MTH1204(ᴵˉ1.MTH1224());
            ᴵˉ0.MTH1207(ᴵˉ1.MTH1216());
            ᴵˉ0.MTH1185(ᴵˉ1.MTH1221());
            ᴵˉ0.MTH1213(ᴵˉ1.MTH1214());
            ᴵˉ0.MTH1201(ᴵˉ1.MTH1205());
            ᴵˉ0.MTH1220(ᴵˉ1.MTH1212());
            ᴵˉ0.MTH1206(ᴵˉ1.MTH1191());
            ᴵˉ0.MTH1222(ᴵˉ1.MTH1209());
            ᴵˉ0.MTH1208(ᴵˉ1.MTH1202());
            ᴵˉ0.MTH1219(ᴵˉ1.MTH1194());
        }

        // 此方法包含解密的字符串
        @Override  // c.ʾʻ.CLS27
        public void MTH819(View view0, CLS86 ᴵˉ0) {
            if(CLS316.FLD1473) {
                ((CLS27)this).super.MTH819(view0, ᴵˉ0);
            }
            else {
                CLS86 ᴵˉ1 = CLS86.MTH1183(ᴵˉ0);
                ((CLS27)this).super.MTH819(view0, ᴵˉ1);
                ᴵˉ0.MTH1184(view0);
                ViewParent viewParent0 = CLS31.MTH841(view0);
                if(viewParent0 instanceof View) {
                    ᴵˉ0.MTH1215(((View)viewParent0));
                }
                this.MTH4578(ᴵˉ0, ᴵˉ1);
                ᴵˉ1.MTH1195();
                this.MTH4581(ᴵˉ0, ((ViewGroup)view0));
            }
            ᴵˉ0.MTH1204("c.ᵔʼ.ᵔʼ");
            ᴵˉ0.MTH1201(false);
            ᴵˉ0.MTH1220(false);
            ᴵˉ0.MTH1223(CLS85.FLD291);
            ᴵˉ0.MTH1223(CLS85.FLD261);
        }

        @Override  // c.ʾʻ.CLS27
        public void MTH820(View view0, AccessibilityEvent accessibilityEvent0) {
            ((CLS27)this).super.MTH820(view0, accessibilityEvent0);
            accessibilityEvent0.setClassName(CLS316.class.getName());
        }

        public final void MTH4581(CLS86 ᴵˉ0, ViewGroup viewGroup0) {
            int v = viewGroup0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = viewGroup0.getChildAt(v1);
                if(CLS316.MTH4633(view0)) {
                    ᴵˉ0.MTH1225(view0);
                }
            }
        }

        @Override  // c.ʾʻ.CLS27
        public boolean MTH824(View view0, AccessibilityEvent accessibilityEvent0) {
            if(accessibilityEvent0.getEventType() == 0x20) {
                List list0 = accessibilityEvent0.getText();
                View view1 = CLS316.this.MTH4637();
                if(view1 != null) {
                    int v = CLS316.this.MTH4652(view1);
                    CharSequence charSequence0 = CLS316.this.MTH4645(v);
                    if(charSequence0 != null) {
                        list0.add(charSequence0);
                    }
                }
                return true;
            }
            return ((CLS27)this).super.MTH824(view0, accessibilityEvent0);
        }

        // 去混淆评级： 低(20)
        @Override  // c.ʾʻ.CLS27
        public boolean MTH825(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
            return CLS316.FLD1473 || CLS316.MTH4633(view0) ? ((CLS27)this).super.MTH825(viewGroup0, view0, accessibilityEvent0) : false;
        }
    }

    public Drawable FLD1472;
    public static final boolean FLD1473;
    public Drawable FLD1474;
    public float FLD1475;
    public int FLD1476;
    public final CLS803 FLD1477;
    public Object FLD1478;
    public static final boolean FLD1479;
    public boolean FLD1480;
    public float FLD1481;
    public boolean FLD1482;
    public int FLD1483;
    public Drawable FLD1484;
    public int FLD1485;
    public Paint FLD1486;
    public CharSequence FLD1487;
    public int FLD1488;
    public List FLD1489;
    public Drawable FLD1490;
    public boolean FLD1491;
    public CLS312 FLD1492;
    public boolean FLD1493;
    public int FLD1494;
    public CharSequence FLD1495;
    public Drawable FLD1496;
    public Rect FLD1497;
    public float FLD1498;
    public Matrix FLD1499;
    public boolean FLD1500;
    public Drawable FLD1501;
    public int FLD1502;
    public static final int[] FLD1503;
    public final CLS102 FLD1504;
    public final CLS803 FLD1505;
    public final CLS801 FLD1506;
    public final ArrayList FLD1507;
    public int FLD1508;
    public static final int[] FLD1509;
    public Drawable FLD1510;
    public final CLS102 FLD1511;
    public float FLD1512;

    static {
        boolean z = true;
        CLS316.FLD1503 = new int[]{0x1010434};
        CLS316.FLD1509 = new int[]{0x10100B3};
        CLS316.FLD1473 = Build.VERSION.SDK_INT >= 19;
        if(Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        CLS316.FLD1479 = z;
    }

    public CLS316(Context context0) {
        this(context0, null);
    }

    public CLS316(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public CLS316(Context context0, AttributeSet attributeSet0, int v) {
        public class CLS314 implements View.OnApplyWindowInsetsListener {
            public final CLS316 FLD1464;

            @Override  // android.view.View$OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view0, WindowInsets windowInsets0) {
                ((CLS316)view0).MTH4651(windowInsets0, windowInsets0.getSystemWindowInsetTop() > 0);
                return windowInsets0.consumeSystemWindowInsets();
            }
        }

        super(context0, attributeSet0, v);
        this.FLD1506 = new CLS801();
        this.FLD1483 = 0x99000000;
        this.FLD1486 = new Paint();
        this.FLD1482 = true;
        this.FLD1488 = 3;
        this.FLD1502 = 3;
        this.FLD1508 = 3;
        this.FLD1494 = 3;
        this.FLD1501 = null;
        this.FLD1496 = null;
        this.FLD1474 = null;
        this.FLD1490 = null;
        this.setDescendantFocusability(0x40000);
        float f = this.getResources().getDisplayMetrics().density;
        this.FLD1476 = (int)(64.0f * f + 0.5f);
        CLS803 ᵔʼ$ﾞʿ0 = new CLS803(this, 3);
        this.FLD1477 = ᵔʼ$ﾞʿ0;
        CLS803 ᵔʼ$ﾞʿ1 = new CLS803(this, 5);
        this.FLD1505 = ᵔʼ$ﾞʿ1;
        CLS102 ⁱˋ0 = CLS102.MTH1377(this, 1.0f, ((CLS99)ᵔʼ$ﾞʿ0));
        this.FLD1511 = ⁱˋ0;
        ⁱˋ0.MTH1388(1);
        ⁱˋ0.MTH1393(400.0f * f);
        ᵔʼ$ﾞʿ0.MTH4569(ⁱˋ0);
        CLS102 ⁱˋ1 = CLS102.MTH1377(this, 1.0f, ((CLS99)ᵔʼ$ﾞʿ1));
        this.FLD1504 = ⁱˋ1;
        ⁱˋ1.MTH1388(2);
        ⁱˋ1.MTH1393(400.0f * f);
        ᵔʼ$ﾞʿ1.MTH4569(ⁱˋ1);
        this.setFocusableInTouchMode(true);
        CLS31.MTH839(this, 1);
        CLS31.MTH833(this, ((CLS27)new CLS804(this)));
        this.setMotionEventSplittingEnabled(false);
        if(CLS31.MTH834(this)) {
            if(Build.VERSION.SDK_INT >= 21) {
                this.setOnApplyWindowInsetsListener(new CLS314(this));
                this.setSystemUiVisibility(0x500);
                TypedArray typedArray0 = context0.obtainStyledAttributes(CLS316.FLD1503);
                try {
                    this.FLD1472 = typedArray0.getDrawable(0);
                }
                finally {
                    typedArray0.recycle();
                }
            }
            else {
                this.FLD1472 = null;
            }
        }
        this.FLD1512 = f * 10.0f;
        this.FLD1507 = new ArrayList();
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
            if(!this.MTH4627(view0)) {
                this.FLD1507.add(view0);
            }
            else if(this.MTH4636(view0)) {
                view0.addFocusables(arrayList0, v, v1);
                z = true;
            }
        }
        if(!z) {
            int v5 = this.FLD1507.size();
            for(int v3 = 0; v3 < v5; ++v3) {
                View view1 = (View)this.FLD1507.get(v3);
                if(view1.getVisibility() == 0) {
                    view1.addFocusables(arrayList0, v, v1);
                }
            }
        }
        this.FLD1507.clear();
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
        CLS31.MTH839(view0, (this.MTH4631() != null || this.MTH4627(view0) ? 4 : 1));
        if(!CLS316.FLD1473) {
            CLS31.MTH833(view0, ((CLS27)this.FLD1506));
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof CLS311 && super.checkLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    public void computeScroll() {
        int v = this.getChildCount();
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            f = Math.max(f, ((CLS311)this.getChildAt(v1).getLayoutParams()).FLD1457);
        }
        this.FLD1481 = f;
        if(this.FLD1511.MTH1371(true) || this.FLD1504.MTH1371(true)) {
            CLS31.MTH837(this);
        }
    }

    @Override  // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent0) {
        if((motionEvent0.getSource() & 2) != 0 && motionEvent0.getAction() != 10 && this.FLD1481 > 0.0f) {
            int v = this.getChildCount();
            if(v != 0) {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                for(int v1 = v - 1; v1 >= 0; --v1) {
                    View view0 = this.getChildAt(v1);
                    if(this.MTH4653(f, f1, view0) && !this.MTH4663(view0) && this.MTH4634(motionEvent0, view0)) {
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
        boolean z = this.MTH4663(view0);
        int v2 = this.getWidth();
        int v3 = canvas0.save();
        int v4 = 0;
        if(z) {
            int v5 = this.getChildCount();
            int v7 = 0;
            for(int v6 = 0; v6 < v5; ++v6) {
                View view1 = this.getChildAt(v6);
                if(view1 != view0 && view1.getVisibility() == 0 && CLS316.MTH4649(view1) && this.MTH4627(view1) && view1.getHeight() >= v1) {
                    if(this.MTH4624(view1, 3)) {
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
        float f = this.FLD1481;
        if(f > 0.0f && z) {
            this.FLD1486.setColor(this.FLD1483 & 0xFFFFFF | ((int)(((float)((0xFF000000 & this.FLD1483) >>> 24)) * f)) << 24);
            canvas0.drawRect(((float)v4), 0.0f, ((float)v2), ((float)this.getHeight()), this.FLD1486);
            return z1;
        }
        if(this.FLD1484 != null && this.MTH4624(view0, 3)) {
            int v10 = this.FLD1484.getIntrinsicWidth();
            int v11 = view0.getRight();
            this.FLD1484.setBounds(v11, view0.getTop(), v10 + v11, view0.getBottom());
            this.FLD1484.setAlpha(((int)(Math.max(0.0f, Math.min(((float)v11) / ((float)this.FLD1511.MTH1364()), 1.0f)) * 255.0f)));
            drawable0 = this.FLD1484;
        }
        else if(this.FLD1510 != null && this.MTH4624(view0, 5)) {
            int v12 = this.FLD1510.getIntrinsicWidth();
            int v13 = view0.getLeft();
            float f1 = Math.max(0.0f, Math.min(((float)(this.getWidth() - v13)) / ((float)this.FLD1504.MTH1364()), 1.0f));
            this.FLD1510.setBounds(v13 - v12, view0.getTop(), v13, view0.getBottom());
            this.FLD1510.setAlpha(((int)(f1 * 255.0f)));
            drawable0 = this.FLD1510;
        }
        else {
            return z1;
        }
        drawable0.draw(canvas0);
        return z1;
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new CLS311(-1, -1);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet0) {
        return new CLS311(this.getContext(), attributeSet0);
    }

    @Override  // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(viewGroup$LayoutParams0 instanceof CLS311) {
            return new CLS311(((CLS311)viewGroup$LayoutParams0));
        }
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? new CLS311(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : new CLS311(viewGroup$LayoutParams0);
    }

    // 去混淆评级： 低(20)
    public float getDrawerElevation() {
        return CLS316.FLD1479 ? this.FLD1512 : 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.FLD1472;
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.FLD1482 = true;
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.FLD1482 = true;
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        int v;
        super.onDraw(canvas0);
        if(this.FLD1493 && this.FLD1472 != null) {
            if(Build.VERSION.SDK_INT >= 21) {
                Object object0 = this.FLD1478;
                v = object0 == null ? 0 : ((WindowInsets)object0).getSystemWindowInsetTop();
            }
            else {
                v = 0;
            }
            if(v > 0) {
                this.FLD1472.setBounds(0, 0, this.getWidth(), v);
                this.FLD1472.draw(canvas0);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        boolean z2;
        int v = motionEvent0.getActionMasked();
        boolean z = this.FLD1511.MTH1362(motionEvent0);
        boolean z1 = this.FLD1504.MTH1362(motionEvent0);
        switch(v) {
            case 0: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                this.FLD1498 = f;
                this.FLD1475 = f1;
                if(this.FLD1481 > 0.0f) {
                    View view0 = this.FLD1511.MTH1381(((int)f), ((int)f1));
                    z2 = view0 == null || !this.MTH4663(view0) ? false : true;
                }
                else {
                    z2 = false;
                }
                this.FLD1500 = false;
                this.FLD1491 = false;
                return z || z1 || z2 || this.MTH4623() || this.FLD1491;
            }
            case 2: {
                if(this.FLD1511.MTH1372(3)) {
                    this.FLD1477.MTH4574();
                    this.FLD1505.MTH4574();
                    return z || z1 || this.MTH4623() || this.FLD1491;
                }
                return z || z1 || this.MTH4623() || this.FLD1491;
            }
            case 1: 
            case 3: {
                this.MTH4664(true);
                this.FLD1500 = false;
                this.FLD1491 = false;
                return z || z1 || this.MTH4623() || this.FLD1491;
            }
            default: {
                return z || z1 || this.MTH4623() || this.FLD1491;
            }
        }
    }

    @Override  // android.view.View
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(v == 4 && this.MTH4620()) {
            keyEvent0.startTracking();
            return true;
        }
        return super.onKeyDown(v, keyEvent0);
    }

    @Override  // android.view.View
    public boolean onKeyUp(int v, KeyEvent keyEvent0) {
        if(v == 4) {
            View view0 = this.MTH4637();
            if(view0 != null && this.MTH4661(view0) == 0) {
                this.MTH4635();
            }
            return view0 != null;
        }
        return super.onKeyUp(v, keyEvent0);
    }

    @Override  // android.view.ViewGroup
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        float f;
        int v10;
        this.FLD1480 = true;
        int v4 = v2 - v;
        int v5 = this.getChildCount();
        for(int v6 = 0; v6 < v5; ++v6) {
            View view0 = this.getChildAt(v6);
            if(view0.getVisibility() != 8) {
                CLS311 ᵔʼ$ˈᴵ0 = (CLS311)view0.getLayoutParams();
                if(this.MTH4663(view0)) {
                    int v7 = ᵔʼ$ˈᴵ0.leftMargin;
                    view0.layout(v7, ᵔʼ$ˈᴵ0.topMargin, view0.getMeasuredWidth() + v7, ᵔʼ$ˈᴵ0.topMargin + view0.getMeasuredHeight());
                }
                else {
                    int v8 = view0.getMeasuredWidth();
                    int v9 = view0.getMeasuredHeight();
                    if(this.MTH4624(view0, 3)) {
                        v10 = ((int)(ᵔʼ$ˈᴵ0.FLD1457 * ((float)v8))) - v8;
                        f = ((float)(v8 + v10)) / ((float)v8);
                    }
                    else {
                        int v11 = v4 - ((int)(ᵔʼ$ˈᴵ0.FLD1457 * ((float)v8)));
                        f = ((float)(v4 - v11)) / ((float)v8);
                        v10 = v11;
                    }
                    boolean z1 = f != ᵔʼ$ˈᴵ0.FLD1457;
                    switch(ᵔʼ$ˈᴵ0.FLD1456 & 0x70) {
                        case 16: {
                            int v12 = v3 - v1;
                            int v13 = (v12 - v9) / 2;
                            int v14 = ᵔʼ$ˈᴵ0.topMargin;
                            if(v13 < v14) {
                                v13 = v14;
                            }
                            else {
                                int v15 = ᵔʼ$ˈᴵ0.bottomMargin;
                                if(v13 + v9 > v12 - v15) {
                                    v13 = v12 - v15 - v9;
                                }
                            }
                            view0.layout(v10, v13, v8 + v10, v9 + v13);
                            break;
                        }
                        case 80: {
                            view0.layout(v10, v3 - v1 - ᵔʼ$ˈᴵ0.bottomMargin - view0.getMeasuredHeight(), v8 + v10, v3 - v1 - ᵔʼ$ˈᴵ0.bottomMargin);
                            break;
                        }
                        default: {
                            view0.layout(v10, ᵔʼ$ˈᴵ0.topMargin, v8 + v10, v9 + ᵔʼ$ˈᴵ0.topMargin);
                        }
                    }
                    if(z1) {
                        this.MTH4644(view0, f);
                    }
                    int v16 = ᵔʼ$ˈᴵ0.FLD1457 > 0.0f ? 0 : 4;
                    if(view0.getVisibility() != v16) {
                        view0.setVisibility(v16);
                    }
                }
            }
        }
        this.FLD1480 = false;
        this.FLD1482 = false;
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
        boolean z = this.FLD1478 != null && CLS31.MTH834(this);
        int v6 = CLS31.MTH844(this);
        int v7 = this.getChildCount();
        boolean z1 = false;
        boolean z2 = false;
        for(int v8 = 0; v8 < v7; ++v8) {
            View view0 = this.getChildAt(v8);
            if(view0.getVisibility() != 8) {
                CLS311 ᵔʼ$ˈᴵ0 = (CLS311)view0.getLayoutParams();
                if(z) {
                    int v9 = CLS32.MTH846(ᵔʼ$ˈᴵ0.FLD1456, v6);
                    boolean z3 = CLS31.MTH834(view0);
                    int v10 = Build.VERSION.SDK_INT;
                    if(!z3) {
                        if(v10 >= 21) {
                            WindowInsets windowInsets1 = (WindowInsets)this.FLD1478;
                            if(v9 == 3) {
                                windowInsets1 = windowInsets1.replaceSystemWindowInsets(windowInsets1.getSystemWindowInsetLeft(), windowInsets1.getSystemWindowInsetTop(), 0, windowInsets1.getSystemWindowInsetBottom());
                            }
                            else if(v9 == 5) {
                                windowInsets1 = windowInsets1.replaceSystemWindowInsets(0, windowInsets1.getSystemWindowInsetTop(), windowInsets1.getSystemWindowInsetRight(), windowInsets1.getSystemWindowInsetBottom());
                            }
                            ᵔʼ$ˈᴵ0.leftMargin = windowInsets1.getSystemWindowInsetLeft();
                            ᵔʼ$ˈᴵ0.topMargin = windowInsets1.getSystemWindowInsetTop();
                            ᵔʼ$ˈᴵ0.rightMargin = windowInsets1.getSystemWindowInsetRight();
                            ᵔʼ$ˈᴵ0.bottomMargin = windowInsets1.getSystemWindowInsetBottom();
                        }
                    }
                    else if(v10 >= 21) {
                        WindowInsets windowInsets0 = (WindowInsets)this.FLD1478;
                        if(v9 == 3) {
                            windowInsets0 = windowInsets0.replaceSystemWindowInsets(windowInsets0.getSystemWindowInsetLeft(), windowInsets0.getSystemWindowInsetTop(), 0, windowInsets0.getSystemWindowInsetBottom());
                        }
                        else if(v9 == 5) {
                            windowInsets0 = windowInsets0.replaceSystemWindowInsets(0, windowInsets0.getSystemWindowInsetTop(), windowInsets0.getSystemWindowInsetRight(), windowInsets0.getSystemWindowInsetBottom());
                        }
                        view0.dispatchApplyWindowInsets(windowInsets0);
                    }
                }
                if(this.MTH4663(view0)) {
                    view0.measure(View.MeasureSpec.makeMeasureSpec(v4 - ᵔʼ$ˈᴵ0.leftMargin - ᵔʼ$ˈᴵ0.rightMargin, 0x40000000), View.MeasureSpec.makeMeasureSpec(v5 - ᵔʼ$ˈᴵ0.topMargin - ᵔʼ$ˈᴵ0.bottomMargin, 0x40000000));
                }
                else {
                    if(!this.MTH4627(view0)) {
                        throw new IllegalStateException("Child " + view0 + " at index " + v8 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if(CLS316.FLD1479) {
                        float f = CLS31.MTH831(view0);
                        float f1 = this.FLD1512;
                        if(f != f1) {
                            CLS31.MTH835(view0, f1);
                        }
                    }
                    int v11 = this.MTH4652(view0) & 7;
                    if(v11 == 3 && z1 || v11 != 3 && z2) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + CLS316.MTH4638(v11) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                    if(v11 == 3) {
                        z1 = true;
                    }
                    else {
                        z2 = true;
                    }
                    view0.measure(ViewGroup.getChildMeasureSpec(v, this.FLD1476 + ᵔʼ$ˈᴵ0.leftMargin + ᵔʼ$ˈᴵ0.rightMargin, ᵔʼ$ˈᴵ0.width), ViewGroup.getChildMeasureSpec(v1, ᵔʼ$ˈᴵ0.topMargin + ᵔʼ$ˈᴵ0.bottomMargin, ᵔʼ$ˈᴵ0.height));
                    continue;
                }
            }
        }
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof CLS802)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((CLS56)(((CLS802)parcelable0))).MTH969());
        int v = ((CLS802)parcelable0).FLD1459;
        if(v != 0) {
            View view0 = this.MTH4629(v);
            if(view0 != null) {
                this.MTH4648(view0);
            }
        }
        int v1 = ((CLS802)parcelable0).FLD1461;
        if(v1 != 3) {
            this.MTH4658(v1, 3);
        }
        int v2 = ((CLS802)parcelable0).FLD1460;
        if(v2 != 3) {
            this.MTH4658(v2, 5);
        }
        int v3 = ((CLS802)parcelable0).FLD1462;
        if(v3 != 3) {
            this.MTH4658(v3, 0x800003);
        }
        int v4 = ((CLS802)parcelable0).FLD1463;
        if(v4 != 3) {
            this.MTH4658(v4, 0x800005);
        }
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        this.MTH4628();
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        CLS802 ᵔʼ$ˋʼ0 = new CLS802(super.onSaveInstanceState());
        int v = this.getChildCount();
        int v1 = 0;
        while(v1 < v) {
            CLS311 ᵔʼ$ˈᴵ0 = (CLS311)this.getChildAt(v1).getLayoutParams();
            if(ᵔʼ$ˈᴵ0.FLD1455 != 1 && ᵔʼ$ˈᴵ0.FLD1455 != 2) {
                ++v1;
            }
            else {
                ᵔʼ$ˋʼ0.FLD1459 = ᵔʼ$ˈᴵ0.FLD1456;
                if(true) {
                    break;
                }
            }
        }
        ᵔʼ$ˋʼ0.FLD1461 = this.FLD1488;
        ᵔʼ$ˋʼ0.FLD1460 = this.FLD1502;
        ᵔʼ$ˋʼ0.FLD1462 = this.FLD1508;
        ᵔʼ$ˋʼ0.FLD1463 = this.FLD1494;
        return ᵔʼ$ˋʼ0;
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z;
        this.FLD1511.MTH1391(motionEvent0);
        this.FLD1504.MTH1391(motionEvent0);
        int v = motionEvent0.getAction();
        switch(v & 0xFF) {
            case 0: {
                float f4 = motionEvent0.getX();
                float f5 = motionEvent0.getY();
                this.FLD1498 = f4;
                this.FLD1475 = f5;
                this.FLD1500 = false;
                this.FLD1491 = false;
                break;
            }
            case 1: {
                float f = motionEvent0.getX();
                float f1 = motionEvent0.getY();
                View view0 = this.FLD1511.MTH1381(((int)f), ((int)f1));
                if(view0 == null || !this.MTH4663(view0)) {
                    z = true;
                }
                else {
                    float f2 = f - this.FLD1498;
                    float f3 = f1 - this.FLD1475;
                    int v1 = this.FLD1511.MTH1373();
                    if(f2 * f2 + f3 * f3 < ((float)(v1 * v1))) {
                        View view1 = this.MTH4631();
                        z = view1 == null || this.MTH4661(view1) == 2;
                    }
                    else {
                        z = true;
                    }
                }
                this.MTH4664(z);
                this.FLD1500 = false;
                return true;
            label_25:
                if((v & 0xFF) == 3) {
                    this.MTH4664(true);
                    this.FLD1500 = false;
                    this.FLD1491 = false;
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
        this.FLD1500 = z;
        if(z) {
            this.MTH4664(true);
        }
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if(!this.FLD1480) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.FLD1512 = f;
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            if(this.MTH4627(view0)) {
                CLS31.MTH835(view0, this.FLD1512);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(CLS312 ᵔʼ$ˉˎ0) {
        CLS312 ᵔʼ$ˉˎ1 = this.FLD1492;
        if(ᵔʼ$ˉˎ1 != null) {
            this.MTH4655(ᵔʼ$ˉˎ1);
        }
        if(ᵔʼ$ˉˎ0 != null) {
            this.MTH4659(ᵔʼ$ˉˎ0);
        }
        this.FLD1492 = ᵔʼ$ˉˎ0;
    }

    public void setDrawerLockMode(int v) {
        this.MTH4658(v, 3);
        this.MTH4658(v, 5);
    }

    public void setScrimColor(int v) {
        this.FLD1483 = v;
        this.invalidate();
    }

    public void setStatusBarBackground(int v) {
        this.FLD1472 = v == 0 ? null : CLS333.MTH4770(this.getContext(), v);
        this.invalidate();
    }

    public void setStatusBarBackground(Drawable drawable0) {
        this.FLD1472 = drawable0;
        this.invalidate();
    }

    public void setStatusBarBackgroundColor(int v) {
        this.FLD1472 = new ColorDrawable(v);
        this.invalidate();
    }

    public final boolean MTH4620() {
        return this.MTH4637() != null;
    }

    public final Drawable MTH4621() {
        int v = CLS31.MTH844(this);
        if(v == 0) {
            Drawable drawable0 = this.FLD1496;
            if(drawable0 != null) {
                this.MTH4647(drawable0, 0);
                return this.FLD1496;
            }
        }
        else {
            Drawable drawable1 = this.FLD1501;
            if(drawable1 != null) {
                this.MTH4647(drawable1, v);
                return this.FLD1501;
            }
        }
        return this.FLD1490;
    }

    public void MTH4622(View view0, float f) {
        float f1 = this.MTH4640(view0);
        float f2 = (float)view0.getWidth();
        view0.offsetLeftAndRight((this.MTH4624(view0, 3) ? ((int)(f2 * f)) - ((int)(f1 * f2)) : -(((int)(f2 * f)) - ((int)(f1 * f2)))));
        this.MTH4644(view0, f);
    }

    public final boolean MTH4623() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((CLS311)this.getChildAt(v1).getLayoutParams()).FLD1454) {
                return true;
            }
        }
        return false;
    }

    public boolean MTH4624(View view0, int v) {
        return (this.MTH4652(view0) & v) == v;
    }

    public void MTH4625(int v, int v1, View view0) {
        int v2 = 2;
        int v3 = this.FLD1511.MTH1400();
        int v4 = this.FLD1504.MTH1400();
        if(v3 == 1 || v4 == 1) {
            v2 = 1;
        }
        else if(v3 != 2 && v4 != 2) {
            v2 = 0;
        }
        if(view0 != null && v1 == 0) {
            float f = ((CLS311)view0.getLayoutParams()).FLD1457;
            if(f == 0.0f) {
                this.MTH4656(view0);
            }
            else if(f == 1.0f) {
                this.MTH4626(view0);
            }
        }
        if(v2 != this.FLD1485) {
            this.FLD1485 = v2;
            List list0 = this.FLD1489;
            if(list0 != null) {
                for(int v5 = list0.size() - 1; v5 >= 0; --v5) {
                    ((CLS312)this.FLD1489.get(v5)).MTH4544(v2);
                }
            }
        }
    }

    public void MTH4626(View view0) {
        CLS311 ᵔʼ$ˈᴵ0 = (CLS311)view0.getLayoutParams();
        if((ᵔʼ$ˈᴵ0.FLD1455 & 1) == 0) {
            ᵔʼ$ˈᴵ0.FLD1455 = 1;
            List list0 = this.FLD1489;
            if(list0 != null) {
                for(int v = list0.size() - 1; v >= 0; --v) {
                    ((CLS312)this.FLD1489.get(v)).MTH4545(view0);
                }
            }
            this.MTH4642(view0, true);
            if(this.hasWindowFocus()) {
                this.sendAccessibilityEvent(0x20);
            }
        }
    }

    public boolean MTH4627(View view0) {
        int v = CLS32.MTH846(((CLS311)view0.getLayoutParams()).FLD1456, CLS31.MTH844(view0));
        return (v & 3) == 0 ? (v & 5) != 0 : true;
    }

    public final void MTH4628() {
        if(CLS316.FLD1479) {
            return;
        }
        this.FLD1484 = this.MTH4662();
        this.FLD1510 = this.MTH4621();
    }

    public View MTH4629(int v) {
        int v1 = CLS32.MTH846(v, CLS31.MTH844(this));
        int v2 = this.getChildCount();
        for(int v3 = 0; v3 < v2; ++v3) {
            View view0 = this.getChildAt(v3);
            if((this.MTH4652(view0) & 7) == (v1 & 7)) {
                return view0;
            }
        }
        return null;
    }

    public void MTH4630(View view0, boolean z) {
        int v;
        CLS102 ⁱˋ0;
        if(!this.MTH4627(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a sliding drawer");
        }
        CLS311 ᵔʼ$ˈᴵ0 = (CLS311)view0.getLayoutParams();
        if(this.FLD1482) {
            ᵔʼ$ˈᴵ0.FLD1457 = 0.0f;
            ᵔʼ$ˈᴵ0.FLD1455 = 0;
        }
        else if(z) {
            ᵔʼ$ˈᴵ0.FLD1455 |= 4;
            if(this.MTH4624(view0, 3)) {
                ⁱˋ0 = this.FLD1511;
                v = -view0.getWidth();
            }
            else {
                ⁱˋ0 = this.FLD1504;
                v = this.getWidth();
            }
            ⁱˋ0.MTH1368(view0, v, view0.getTop());
        }
        else {
            this.MTH4622(view0, 0.0f);
            this.MTH4625(ᵔʼ$ˈᴵ0.FLD1456, 0, view0);
            view0.setVisibility(4);
        }
        this.invalidate();
    }

    public View MTH4631() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if((((CLS311)view0.getLayoutParams()).FLD1455 & 1) == 1) {
                return view0;
            }
        }
        return null;
    }

    public void MTH4632(View view0) {
        this.MTH4630(view0, true);
    }

    public static boolean MTH4633(View view0) {
        switch(CLS31.MTH838(view0)) {
            case 2: 
            case 4: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    public final boolean MTH4634(MotionEvent motionEvent0, View view0) {
        boolean z;
        if(!view0.getMatrix().isIdentity()) {
            MotionEvent motionEvent1 = this.MTH4641(motionEvent0, view0);
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

    public void MTH4635() {
        this.MTH4664(false);
    }

    public boolean MTH4636(View view0) {
        if(!this.MTH4627(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return (((CLS311)view0.getLayoutParams()).FLD1455 & 1) == 1;
    }

    public View MTH4637() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            if(this.MTH4627(view0) && this.MTH4643(view0)) {
                return view0;
            }
        }
        return null;
    }

    public static String MTH4638(int v) {
        if((v & 3) == 3) {
            return "LEFT";
        }
        return (v & 5) == 5 ? "RIGHT" : Integer.toHexString(v);
    }

    public void MTH4639(int v) {
        this.MTH4660(v, true);
    }

    public float MTH4640(View view0) {
        return ((CLS311)view0.getLayoutParams()).FLD1457;
    }

    public final MotionEvent MTH4641(MotionEvent motionEvent0, View view0) {
        int v = this.getScrollX();
        int v1 = view0.getLeft();
        int v2 = this.getScrollY();
        int v3 = view0.getTop();
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.offsetLocation(((float)(v - v1)), ((float)(v2 - v3)));
        Matrix matrix0 = view0.getMatrix();
        if(!matrix0.isIdentity()) {
            if(this.FLD1499 == null) {
                this.FLD1499 = new Matrix();
            }
            matrix0.invert(this.FLD1499);
            motionEvent1.transform(this.FLD1499);
        }
        return motionEvent1;
    }

    public final void MTH4642(View view0, boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view1 = this.getChildAt(v1);
            CLS31.MTH839(view1, ((z || this.MTH4627(view1)) && (!z || view1 != view0) ? 4 : 1));
        }
    }

    public boolean MTH4643(View view0) {
        if(!this.MTH4627(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return ((CLS311)view0.getLayoutParams()).FLD1457 > 0.0f;
    }

    public void MTH4644(View view0, float f) {
        CLS311 ᵔʼ$ˈᴵ0 = (CLS311)view0.getLayoutParams();
        if(f == ᵔʼ$ˈᴵ0.FLD1457) {
            return;
        }
        ᵔʼ$ˈᴵ0.FLD1457 = f;
        this.MTH4657(view0, f);
    }

    public CharSequence MTH4645(int v) {
        int v1 = CLS32.MTH846(v, CLS31.MTH844(this));
        if(v1 == 3) {
            return this.FLD1495;
        }
        return v1 == 5 ? this.FLD1487 : null;
    }

    public boolean MTH4646(int v) {
        View view0 = this.MTH4629(v);
        return view0 == null ? false : this.MTH4636(view0);
    }

    public final boolean MTH4647(Drawable drawable0, int v) {
        if(drawable0 != null && CLS377.MTH5138(drawable0)) {
            CLS377.MTH5139(drawable0, v);
            return true;
        }
        return false;
    }

    public void MTH4648(View view0) {
        this.MTH4650(view0, true);
    }

    public static boolean MTH4649(View view0) {
        Drawable drawable0 = view0.getBackground();
        return drawable0 != null && drawable0.getOpacity() == -1;
    }

    public void MTH4650(View view0, boolean z) {
        if(!this.MTH4627(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a sliding drawer");
        }
        CLS311 ᵔʼ$ˈᴵ0 = (CLS311)view0.getLayoutParams();
        if(this.FLD1482) {
            ᵔʼ$ˈᴵ0.FLD1457 = 1.0f;
            ᵔʼ$ˈᴵ0.FLD1455 = 1;
            this.MTH4642(view0, true);
        }
        else if(z) {
            ᵔʼ$ˈᴵ0.FLD1455 |= 2;
            if(this.MTH4624(view0, 3)) {
                int v = view0.getTop();
                this.FLD1511.MTH1368(view0, 0, v);
            }
            else {
                int v1 = this.getWidth();
                int v2 = view0.getWidth();
                int v3 = view0.getTop();
                this.FLD1504.MTH1368(view0, v1 - v2, v3);
            }
        }
        else {
            this.MTH4622(view0, 1.0f);
            this.MTH4625(ᵔʼ$ˈᴵ0.FLD1456, 0, view0);
            view0.setVisibility(0);
        }
        this.invalidate();
    }

    public void MTH4651(Object object0, boolean z) {
        this.FLD1478 = object0;
        this.FLD1493 = z;
        this.setWillNotDraw(!z && this.getBackground() == null);
        this.requestLayout();
    }

    public int MTH4652(View view0) {
        return CLS32.MTH846(((CLS311)view0.getLayoutParams()).FLD1456, CLS31.MTH844(this));
    }

    public final boolean MTH4653(float f, float f1, View view0) {
        if(this.FLD1497 == null) {
            this.FLD1497 = new Rect();
        }
        view0.getHitRect(this.FLD1497);
        return this.FLD1497.contains(((int)f), ((int)f1));
    }

    public int MTH4654(int v) {
        int v1 = CLS31.MTH844(this);
        switch(v) {
            case 3: {
                int v2 = this.FLD1488;
                if(v2 != 3) {
                    return v2;
                }
                int v3 = v1 == 0 ? this.FLD1508 : this.FLD1494;
                return v3 == 3 ? 0 : v3;
            }
            case 5: {
                int v4 = this.FLD1502;
                if(v4 != 3) {
                    return v4;
                }
                int v5 = v1 == 0 ? this.FLD1494 : this.FLD1508;
                return v5 == 3 ? 0 : v5;
            }
            case 0x800003: {
                int v6 = this.FLD1508;
                if(v6 != 3) {
                    return v6;
                }
                int v7 = v1 == 0 ? this.FLD1488 : this.FLD1502;
                return v7 == 3 ? 0 : v7;
            }
            case 0x800005: {
                int v8 = this.FLD1494;
                if(v8 != 3) {
                    return v8;
                }
                int v9 = v1 == 0 ? this.FLD1502 : this.FLD1488;
                return v9 == 3 ? 0 : v9;
            }
            default: {
                return 0;
            }
        }
    }

    public void MTH4655(CLS312 ᵔʼ$ˉˎ0) {
        if(ᵔʼ$ˉˎ0 == null) {
            return;
        }
        List list0 = this.FLD1489;
        if(list0 == null) {
            return;
        }
        list0.remove(ᵔʼ$ˉˎ0);
    }

    public void MTH4656(View view0) {
        CLS311 ᵔʼ$ˈᴵ0 = (CLS311)view0.getLayoutParams();
        if((ᵔʼ$ˈᴵ0.FLD1455 & 1) == 1) {
            ᵔʼ$ˈᴵ0.FLD1455 = 0;
            List list0 = this.FLD1489;
            if(list0 != null) {
                for(int v = list0.size() - 1; v >= 0; --v) {
                    ((CLS312)this.FLD1489.get(v)).MTH4543(view0);
                }
            }
            this.MTH4642(view0, false);
            if(this.hasWindowFocus()) {
                View view1 = this.getRootView();
                if(view1 != null) {
                    view1.sendAccessibilityEvent(0x20);
                }
            }
        }
    }

    public void MTH4657(View view0, float f) {
        List list0 = this.FLD1489;
        if(list0 != null) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                ((CLS312)this.FLD1489.get(v)).MTH4542(view0, f);
            }
        }
    }

    public void MTH4658(int v, int v1) {
        int v2 = CLS32.MTH846(v1, CLS31.MTH844(this));
        switch(v1) {
            case 3: {
                this.FLD1488 = v;
                break;
            }
            case 5: {
                this.FLD1502 = v;
                break;
            }
            case 0x800003: {
                this.FLD1508 = v;
                break;
            }
            case 0x800005: {
                this.FLD1494 = v;
            }
        }
        if(v != 0) {
            (v2 == 3 ? this.FLD1511 : this.FLD1504).MTH1396();
        }
        switch(v) {
            case 1: {
                View view0 = this.MTH4629(v2);
                if(view0 != null) {
                    this.MTH4632(view0);
                    return;
                }
                break;
            }
            case 2: {
                View view1 = this.MTH4629(v2);
                if(view1 != null) {
                    this.MTH4648(view1);
                    return;
                }
                break;
            }
        }
    }

    public void MTH4659(CLS312 ᵔʼ$ˉˎ0) {
        if(ᵔʼ$ˉˎ0 == null) {
            return;
        }
        if(this.FLD1489 == null) {
            this.FLD1489 = new ArrayList();
        }
        this.FLD1489.add(ᵔʼ$ˉˎ0);
    }

    public void MTH4660(int v, boolean z) {
        View view0 = this.MTH4629(v);
        if(view0 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + CLS316.MTH4638(v));
        }
        this.MTH4650(view0, z);
    }

    public int MTH4661(View view0) {
        if(!this.MTH4627(view0)) {
            throw new IllegalArgumentException("View " + view0 + " is not a drawer");
        }
        return this.MTH4654(((CLS311)view0.getLayoutParams()).FLD1456);
    }

    public final Drawable MTH4662() {
        int v = CLS31.MTH844(this);
        if(v == 0) {
            Drawable drawable0 = this.FLD1501;
            if(drawable0 != null) {
                this.MTH4647(drawable0, 0);
                return this.FLD1501;
            }
        }
        else {
            Drawable drawable1 = this.FLD1496;
            if(drawable1 != null) {
                this.MTH4647(drawable1, v);
                return this.FLD1496;
            }
        }
        return this.FLD1474;
    }

    public boolean MTH4663(View view0) {
        return ((CLS311)view0.getLayoutParams()).FLD1456 == 0;
    }

    public void MTH4664(boolean z) {
        boolean z2;
        int v = this.getChildCount();
        boolean z1 = false;
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            CLS311 ᵔʼ$ˈᴵ0 = (CLS311)view0.getLayoutParams();
            if(this.MTH4627(view0) && (!z || ᵔʼ$ˈᴵ0.FLD1454)) {
                int v2 = view0.getWidth();
                if(this.MTH4624(view0, 3)) {
                    int v3 = view0.getTop();
                    z2 = this.FLD1511.MTH1368(view0, -v2, v3);
                }
                else {
                    int v4 = this.getWidth();
                    int v5 = view0.getTop();
                    z2 = this.FLD1504.MTH1368(view0, v4, v5);
                }
                z1 |= z2;
                ᵔʼ$ˈᴵ0.FLD1454 = false;
            }
        }
        this.FLD1477.MTH4574();
        this.FLD1505.MTH4574();
        if(z1) {
            this.invalidate();
        }
    }

    public void MTH4665() {
        if(!this.FLD1491) {
            long v = SystemClock.uptimeMillis();
            MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
            int v1 = this.getChildCount();
            for(int v2 = 0; v2 < v1; ++v2) {
                this.getChildAt(v2).dispatchTouchEvent(motionEvent0);
            }
            motionEvent0.recycle();
            this.FLD1491 = true;
        }
    }
}

