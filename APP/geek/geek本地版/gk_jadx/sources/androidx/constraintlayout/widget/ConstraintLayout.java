package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;
import java.util.HashMap;
import p000.AbstractC0182ec;
import p000.AbstractC0219fc;
import p000.AbstractC0666rc;
import p000.AbstractC0688ry;
import p000.C0041ar;
import p000.C0138d4;
import p000.C0231fo;
import p000.C0256gc;
import p000.C0268go;
import p000.C0293hc;
import p000.C0554oc;
import p000.C0592pc;
import p000.C0629qc;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final SparseArray f400a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f401b;

    /* JADX INFO: renamed from: c */
    public final C0629qc f402c;

    /* JADX INFO: renamed from: d */
    public int f403d;

    /* JADX INFO: renamed from: e */
    public int f404e;

    /* JADX INFO: renamed from: f */
    public int f405f;

    /* JADX INFO: renamed from: g */
    public int f406g;

    /* JADX INFO: renamed from: h */
    public boolean f407h;

    /* JADX INFO: renamed from: i */
    public int f408i;

    /* JADX INFO: renamed from: j */
    public C0554oc f409j;

    /* JADX INFO: renamed from: k */
    public C0138d4 f410k;

    /* JADX INFO: renamed from: l */
    public int f411l;

    /* JADX INFO: renamed from: m */
    public HashMap f412m;

    /* JADX INFO: renamed from: n */
    public final SparseArray f413n;

    /* JADX INFO: renamed from: o */
    public final C0293hc f414o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f400a = new SparseArray();
        this.f401b = new ArrayList(4);
        this.f402c = new C0629qc();
        this.f403d = 0;
        this.f404e = 0;
        this.f405f = Integer.MAX_VALUE;
        this.f406g = Integer.MAX_VALUE;
        this.f407h = true;
        this.f408i = 263;
        this.f409j = null;
        this.f410k = null;
        this.f411l = -1;
        this.f412m = new HashMap();
        this.f413n = new SparseArray();
        this.f414o = new C0293hc(this);
        m210c(attributeSet, 0);
    }

    /* JADX INFO: renamed from: a */
    public static C0256gc m208a() {
        C0256gc c0256gc = new C0256gc(-2, -2);
        c0256gc.f2086a = -1;
        c0256gc.f2088b = -1;
        c0256gc.f2090c = -1.0f;
        c0256gc.f2092d = -1;
        c0256gc.f2094e = -1;
        c0256gc.f2096f = -1;
        c0256gc.f2098g = -1;
        c0256gc.f2100h = -1;
        c0256gc.f2102i = -1;
        c0256gc.f2104j = -1;
        c0256gc.f2106k = -1;
        c0256gc.f2108l = -1;
        c0256gc.f2109m = -1;
        c0256gc.f2110n = 0;
        c0256gc.f2111o = 0.0f;
        c0256gc.f2112p = -1;
        c0256gc.f2113q = -1;
        c0256gc.f2114r = -1;
        c0256gc.f2115s = -1;
        c0256gc.f2116t = -1;
        c0256gc.f2117u = -1;
        c0256gc.f2118v = -1;
        c0256gc.f2119w = -1;
        c0256gc.f2120x = -1;
        c0256gc.f2121y = -1;
        c0256gc.f2122z = 0.5f;
        c0256gc.f2060A = 0.5f;
        c0256gc.f2061B = null;
        c0256gc.f2062C = 1;
        c0256gc.f2063D = -1.0f;
        c0256gc.f2064E = -1.0f;
        c0256gc.f2065F = 0;
        c0256gc.f2066G = 0;
        c0256gc.f2067H = 0;
        c0256gc.f2068I = 0;
        c0256gc.f2069J = 0;
        c0256gc.f2070K = 0;
        c0256gc.f2071L = 0;
        c0256gc.f2072M = 0;
        c0256gc.f2073N = 1.0f;
        c0256gc.f2074O = 1.0f;
        c0256gc.f2075P = -1;
        c0256gc.f2076Q = -1;
        c0256gc.f2077R = -1;
        c0256gc.f2078S = false;
        c0256gc.f2079T = false;
        c0256gc.f2080U = null;
        c0256gc.f2081V = true;
        c0256gc.f2082W = true;
        c0256gc.f2083X = false;
        c0256gc.f2084Y = false;
        c0256gc.f2085Z = false;
        c0256gc.f2087a0 = -1;
        c0256gc.f2089b0 = -1;
        c0256gc.f2091c0 = -1;
        c0256gc.f2093d0 = -1;
        c0256gc.f2095e0 = -1;
        c0256gc.f2097f0 = -1;
        c0256gc.f2099g0 = 0.5f;
        c0256gc.f2107k0 = new C0592pc();
        return c0256gc;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* JADX INFO: renamed from: b */
    public final C0592pc m209b(View view) {
        if (view == this) {
            return this.f402c;
        }
        if (view == null) {
            return null;
        }
        return ((C0256gc) view.getLayoutParams()).f2107k0;
    }

    /* JADX INFO: renamed from: c */
    public final void m210c(AttributeSet attributeSet, int i) {
        C0629qc c0629qc = this.f402c;
        c0629qc.f3844U = this;
        C0293hc c0293hc = this.f414o;
        c0629qc.f4065g0 = c0293hc;
        c0629qc.f4064f0.f2428f = c0293hc;
        this.f400a.put(getId(), this);
        this.f409j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0688ry.f4350b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 9) {
                    this.f403d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f403d);
                } else if (index == 10) {
                    this.f404e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f404e);
                } else if (index == 7) {
                    this.f405f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f405f);
                } else if (index == 8) {
                    this.f406g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f406g);
                } else if (index == 89) {
                    this.f408i = typedArrayObtainStyledAttributes.getInt(index, this.f408i);
                } else if (index == 38) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m211d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f410k = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0554oc c0554oc = new C0554oc();
                        this.f409j = c0554oc;
                        c0554oc.m2011e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f409j = null;
                    }
                    this.f411l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i3 = this.f408i;
        c0629qc.f4074p0 = i3;
        C0041ar.f655p = (i3 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0256gc;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c A[Catch: IOException -> 0x0053, XmlPullParserException -> 0x0055, TryCatch #2 {IOException -> 0x0053, XmlPullParserException -> 0x0055, blocks: (B:3:0x0021, B:36:0x00a6, B:10:0x0030, B:11:0x0038, B:34:0x008c, B:13:0x003c, B:15:0x0044, B:17:0x004b, B:22:0x0057, B:25:0x0060, B:28:0x0069, B:30:0x0071, B:31:0x0080, B:33:0x0088, B:35:0x00a3), top: B:42:0x0021 }] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m211d(int r8) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m211d(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f401b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0182ec) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f407h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m208a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i;
        Context context = getContext();
        C0256gc c0256gc = new C0256gc(context, attributeSet);
        c0256gc.f2086a = -1;
        c0256gc.f2088b = -1;
        c0256gc.f2090c = -1.0f;
        c0256gc.f2092d = -1;
        c0256gc.f2094e = -1;
        c0256gc.f2096f = -1;
        c0256gc.f2098g = -1;
        c0256gc.f2100h = -1;
        c0256gc.f2102i = -1;
        c0256gc.f2104j = -1;
        c0256gc.f2106k = -1;
        c0256gc.f2108l = -1;
        c0256gc.f2109m = -1;
        c0256gc.f2110n = 0;
        c0256gc.f2111o = 0.0f;
        c0256gc.f2112p = -1;
        c0256gc.f2113q = -1;
        c0256gc.f2114r = -1;
        c0256gc.f2115s = -1;
        c0256gc.f2116t = -1;
        c0256gc.f2117u = -1;
        c0256gc.f2118v = -1;
        c0256gc.f2119w = -1;
        c0256gc.f2120x = -1;
        c0256gc.f2121y = -1;
        c0256gc.f2122z = 0.5f;
        c0256gc.f2060A = 0.5f;
        c0256gc.f2061B = null;
        c0256gc.f2062C = 1;
        c0256gc.f2063D = -1.0f;
        c0256gc.f2064E = -1.0f;
        c0256gc.f2065F = 0;
        c0256gc.f2066G = 0;
        c0256gc.f2067H = 0;
        c0256gc.f2068I = 0;
        c0256gc.f2069J = 0;
        c0256gc.f2070K = 0;
        c0256gc.f2071L = 0;
        c0256gc.f2072M = 0;
        c0256gc.f2073N = 1.0f;
        c0256gc.f2074O = 1.0f;
        c0256gc.f2075P = -1;
        c0256gc.f2076Q = -1;
        c0256gc.f2077R = -1;
        c0256gc.f2078S = false;
        c0256gc.f2079T = false;
        c0256gc.f2080U = null;
        c0256gc.f2081V = true;
        c0256gc.f2082W = true;
        c0256gc.f2083X = false;
        c0256gc.f2084Y = false;
        c0256gc.f2085Z = false;
        c0256gc.f2087a0 = -1;
        c0256gc.f2089b0 = -1;
        c0256gc.f2091c0 = -1;
        c0256gc.f2093d0 = -1;
        c0256gc.f2095e0 = -1;
        c0256gc.f2097f0 = -1;
        c0256gc.f2099g0 = 0.5f;
        c0256gc.f2107k0 = new C0592pc();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0688ry.f4350b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = AbstractC0219fc.f1928a.get(index);
            switch (i3) {
                case Base64.NO_PADDING /* 1 */:
                    c0256gc.f2077R = typedArrayObtainStyledAttributes.getInt(index, c0256gc.f2077R);
                    break;
                case Base64.NO_WRAP /* 2 */:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c0256gc.f2109m);
                    c0256gc.f2109m = resourceId;
                    if (resourceId == -1) {
                        c0256gc.f2109m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c0256gc.f2110n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0256gc.f2110n);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c0256gc.f2111o) % 360.0f;
                    c0256gc.f2111o = f;
                    if (f < 0.0f) {
                        c0256gc.f2111o = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c0256gc.f2086a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0256gc.f2086a);
                    break;
                case 6:
                    c0256gc.f2088b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0256gc.f2088b);
                    break;
                case 7:
                    c0256gc.f2090c = typedArrayObtainStyledAttributes.getFloat(index, c0256gc.f2090c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c0256gc.f2092d);
                    c0256gc.f2092d = resourceId2;
                    if (resourceId2 == -1) {
                        c0256gc.f2092d = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c0256gc.f2094e);
                    c0256gc.f2094e = resourceId3;
                    if (resourceId3 == -1) {
                        c0256gc.f2094e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c0256gc.f2096f);
                    c0256gc.f2096f = resourceId4;
                    if (resourceId4 == -1) {
                        c0256gc.f2096f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c0256gc.f2098g);
                    c0256gc.f2098g = resourceId5;
                    if (resourceId5 == -1) {
                        c0256gc.f2098g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c0256gc.f2100h);
                    c0256gc.f2100h = resourceId6;
                    if (resourceId6 == -1) {
                        c0256gc.f2100h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c0256gc.f2102i);
                    c0256gc.f2102i = resourceId7;
                    if (resourceId7 == -1) {
                        c0256gc.f2102i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c0256gc.f2104j);
                    c0256gc.f2104j = resourceId8;
                    if (resourceId8 == -1) {
                        c0256gc.f2104j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c0256gc.f2106k);
                    c0256gc.f2106k = resourceId9;
                    if (resourceId9 == -1) {
                        c0256gc.f2106k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c0256gc.f2108l);
                    c0256gc.f2108l = resourceId10;
                    if (resourceId10 == -1) {
                        c0256gc.f2108l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c0256gc.f2112p);
                    c0256gc.f2112p = resourceId11;
                    if (resourceId11 == -1) {
                        c0256gc.f2112p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c0256gc.f2113q);
                    c0256gc.f2113q = resourceId12;
                    if (resourceId12 == -1) {
                        c0256gc.f2113q = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c0256gc.f2114r);
                    c0256gc.f2114r = resourceId13;
                    if (resourceId13 == -1) {
                        c0256gc.f2114r = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c0256gc.f2115s);
                    c0256gc.f2115s = resourceId14;
                    if (resourceId14 == -1) {
                        c0256gc.f2115s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c0256gc.f2116t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0256gc.f2116t);
                    break;
                case 22:
                    c0256gc.f2117u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0256gc.f2117u);
                    break;
                case 23:
                    c0256gc.f2118v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0256gc.f2118v);
                    break;
                case 24:
                    c0256gc.f2119w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0256gc.f2119w);
                    break;
                case 25:
                    c0256gc.f2120x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0256gc.f2120x);
                    break;
                case 26:
                    c0256gc.f2121y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0256gc.f2121y);
                    break;
                case 27:
                    c0256gc.f2078S = typedArrayObtainStyledAttributes.getBoolean(index, c0256gc.f2078S);
                    break;
                case 28:
                    c0256gc.f2079T = typedArrayObtainStyledAttributes.getBoolean(index, c0256gc.f2079T);
                    break;
                case 29:
                    c0256gc.f2122z = typedArrayObtainStyledAttributes.getFloat(index, c0256gc.f2122z);
                    break;
                case 30:
                    c0256gc.f2060A = typedArrayObtainStyledAttributes.getFloat(index, c0256gc.f2060A);
                    break;
                case 31:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0256gc.f2067H = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0256gc.f2068I = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c0256gc.f2069J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0256gc.f2069J);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0256gc.f2069J) == -2) {
                            c0256gc.f2069J = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c0256gc.f2071L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0256gc.f2071L);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0256gc.f2071L) == -2) {
                            c0256gc.f2071L = -2;
                        }
                    }
                    break;
                case 35:
                    c0256gc.f2073N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0256gc.f2073N));
                    c0256gc.f2067H = 2;
                    break;
                case 36:
                    try {
                        c0256gc.f2070K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0256gc.f2070K);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0256gc.f2070K) == -2) {
                            c0256gc.f2070K = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c0256gc.f2072M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0256gc.f2072M);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0256gc.f2072M) == -2) {
                            c0256gc.f2072M = -2;
                        }
                    }
                    break;
                case 38:
                    c0256gc.f2074O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0256gc.f2074O));
                    c0256gc.f2068I = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c0256gc.f2061B = string;
                            c0256gc.f2062C = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = c0256gc.f2061B.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String strSubstring = c0256gc.f2061B.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        c0256gc.f2062C = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        c0256gc.f2062C = 1;
                                    }
                                    i = iIndexOf + 1;
                                }
                                int iIndexOf2 = c0256gc.f2061B.indexOf(58);
                                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                    String strSubstring2 = c0256gc.f2061B.substring(i);
                                    if (strSubstring2.length() > 0) {
                                        Float.parseFloat(strSubstring2);
                                    }
                                } else {
                                    String strSubstring3 = c0256gc.f2061B.substring(i, iIndexOf2);
                                    String strSubstring4 = c0256gc.f2061B.substring(iIndexOf2 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f2 = Float.parseFloat(strSubstring3);
                                            float f3 = Float.parseFloat(strSubstring4);
                                            if (f2 > 0.0f && f3 > 0.0f) {
                                                if (c0256gc.f2062C == 1) {
                                                    Math.abs(f3 / f2);
                                                } else {
                                                    Math.abs(f2 / f3);
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                        }
                                    }
                                }
                            }
                            break;
                        case 45:
                            c0256gc.f2063D = typedArrayObtainStyledAttributes.getFloat(index, c0256gc.f2063D);
                            break;
                        case 46:
                            c0256gc.f2064E = typedArrayObtainStyledAttributes.getFloat(index, c0256gc.f2064E);
                            break;
                        case 47:
                            c0256gc.f2065F = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0256gc.f2066G = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0256gc.f2075P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0256gc.f2075P);
                            break;
                        case 50:
                            c0256gc.f2076Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0256gc.f2076Q);
                            break;
                        case 51:
                            c0256gc.f2080U = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c0256gc.m1268a();
        return c0256gc;
    }

    public int getMaxHeight() {
        return this.f406g;
    }

    public int getMaxWidth() {
        return this.f405f;
    }

    public int getMinHeight() {
        return this.f404e;
    }

    public int getMinWidth() {
        return this.f403d;
    }

    public int getOptimizationLevel() {
        return this.f402c.f4074p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0256gc c0256gc = (C0256gc) childAt.getLayoutParams();
            C0592pc c0592pc = c0256gc.f2107k0;
            if (childAt.getVisibility() != 8 || c0256gc.f2084Y || c0256gc.f2085Z || zIsInEditMode) {
                int iM2101m = c0592pc.m2101m();
                int iM2102n = c0592pc.m2102n();
                childAt.layout(iM2101m, iM2102n, c0592pc.m2100l() + iM2101m, c0592pc.m2097i() + iM2102n);
            }
        }
        ArrayList arrayList = this.f401b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0182ec) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0812 A[PHI: r11 r12
  0x0812: PHI (r11v5 boolean) = (r11v4 boolean), (r11v30 boolean) binds: [B:381:0x07a5, B:719:0x0812] A[DONT_GENERATE, DONT_INLINE]
  0x0812: PHI (r12v8 int) = (r12v7 int), (r12v45 int) binds: [B:381:0x07a5, B:719:0x0812] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x081a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x081c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0a6f  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x0cdb  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0cdd  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x0d18  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r42, int r43) {
        /*
            Method dump skipped, instruction units count: 3360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0592pc c0592pcM209b = m209b(view);
        if ((view instanceof C0231fo) && !(c0592pcM209b instanceof C0268go)) {
            C0256gc c0256gc = (C0256gc) view.getLayoutParams();
            C0268go c0268go = new C0268go();
            c0256gc.f2107k0 = c0268go;
            c0256gc.f2084Y = true;
            c0268go.m1293B(c0256gc.f2077R);
        }
        if (view instanceof AbstractC0182ec) {
            AbstractC0182ec abstractC0182ec = (AbstractC0182ec) view;
            abstractC0182ec.m1014g();
            ((C0256gc) view.getLayoutParams()).f2085Z = true;
            ArrayList arrayList = this.f401b;
            if (!arrayList.contains(abstractC0182ec)) {
                arrayList.add(abstractC0182ec);
            }
        }
        this.f400a.put(view.getId(), view);
        this.f407h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f400a.remove(view.getId());
        C0592pc c0592pcM209b = m209b(view);
        this.f402c.f4062d0.remove(c0592pcM209b);
        c0592pcM209b.f3832I = null;
        this.f401b.remove(view);
        this.f407h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f407h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0554oc c0554oc) {
        this.f409j = c0554oc;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f400a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f406g) {
            return;
        }
        this.f406g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f405f) {
            return;
        }
        this.f405f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f404e) {
            return;
        }
        this.f404e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f403d) {
            return;
        }
        this.f403d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0666rc abstractC0666rc) {
        C0138d4 c0138d4 = this.f410k;
        if (c0138d4 != null) {
            c0138d4.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f408i = i;
        this.f402c.f4074p0 = i;
        C0041ar.f655p = (i & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f400a = new SparseArray();
        this.f401b = new ArrayList(4);
        this.f402c = new C0629qc();
        this.f403d = 0;
        this.f404e = 0;
        this.f405f = Integer.MAX_VALUE;
        this.f406g = Integer.MAX_VALUE;
        this.f407h = true;
        this.f408i = 263;
        this.f409j = null;
        this.f410k = null;
        this.f411l = -1;
        this.f412m = new HashMap();
        this.f413n = new SparseArray();
        this.f414o = new C0293hc(this);
        m210c(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0256gc c0256gc = new C0256gc(layoutParams);
        c0256gc.f2086a = -1;
        c0256gc.f2088b = -1;
        c0256gc.f2090c = -1.0f;
        c0256gc.f2092d = -1;
        c0256gc.f2094e = -1;
        c0256gc.f2096f = -1;
        c0256gc.f2098g = -1;
        c0256gc.f2100h = -1;
        c0256gc.f2102i = -1;
        c0256gc.f2104j = -1;
        c0256gc.f2106k = -1;
        c0256gc.f2108l = -1;
        c0256gc.f2109m = -1;
        c0256gc.f2110n = 0;
        c0256gc.f2111o = 0.0f;
        c0256gc.f2112p = -1;
        c0256gc.f2113q = -1;
        c0256gc.f2114r = -1;
        c0256gc.f2115s = -1;
        c0256gc.f2116t = -1;
        c0256gc.f2117u = -1;
        c0256gc.f2118v = -1;
        c0256gc.f2119w = -1;
        c0256gc.f2120x = -1;
        c0256gc.f2121y = -1;
        c0256gc.f2122z = 0.5f;
        c0256gc.f2060A = 0.5f;
        c0256gc.f2061B = null;
        c0256gc.f2062C = 1;
        c0256gc.f2063D = -1.0f;
        c0256gc.f2064E = -1.0f;
        c0256gc.f2065F = 0;
        c0256gc.f2066G = 0;
        c0256gc.f2067H = 0;
        c0256gc.f2068I = 0;
        c0256gc.f2069J = 0;
        c0256gc.f2070K = 0;
        c0256gc.f2071L = 0;
        c0256gc.f2072M = 0;
        c0256gc.f2073N = 1.0f;
        c0256gc.f2074O = 1.0f;
        c0256gc.f2075P = -1;
        c0256gc.f2076Q = -1;
        c0256gc.f2077R = -1;
        c0256gc.f2078S = false;
        c0256gc.f2079T = false;
        c0256gc.f2080U = null;
        c0256gc.f2081V = true;
        c0256gc.f2082W = true;
        c0256gc.f2083X = false;
        c0256gc.f2084Y = false;
        c0256gc.f2085Z = false;
        c0256gc.f2087a0 = -1;
        c0256gc.f2089b0 = -1;
        c0256gc.f2091c0 = -1;
        c0256gc.f2093d0 = -1;
        c0256gc.f2095e0 = -1;
        c0256gc.f2097f0 = -1;
        c0256gc.f2099g0 = 0.5f;
        c0256gc.f2107k0 = new C0592pc();
        return c0256gc;
    }
}
