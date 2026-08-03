package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import io.github.cherrywechat.lua.api.CherryMessageAPI;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC0639Ou;
import p000.AbstractC0714Qj;
import p000.AbstractC1364eb;
import p000.AbstractC1408fb;
import p000.AbstractC1449gF;
import p000.AbstractC2540tb;
import p000.AbstractC2592uk;
import p000.C0368Ih;
import p000.C0649P3;
import p000.C0757Rk;
import p000.C0830TD;
import p000.C1452gb;
import p000.C1475gy;
import p000.C1496hb;
import p000.C1540ib;
import p000.C2097jb;
import p000.C2106jk;
import p000.C2150kk;
import p000.C2197lk;
import p000.C2221m7;
import p000.C2244mo;
import p000.C2399q5;
import p000.C2411qb;
import p000.C2454rb;
import p000.C2497sb;
import p000.C2585ud;
import p000.C2656w4;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: p */
    public static C1475gy f3870p;

    /* JADX INFO: renamed from: a */
    public final SparseArray f3871a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f3872b;

    /* JADX INFO: renamed from: c */
    public final C2497sb f3873c;

    /* JADX INFO: renamed from: d */
    public int f3874d;

    /* JADX INFO: renamed from: e */
    public int f3875e;

    /* JADX INFO: renamed from: f */
    public int f3876f;

    /* JADX INFO: renamed from: g */
    public int f3877g;

    /* JADX INFO: renamed from: h */
    public boolean f3878h;

    /* JADX INFO: renamed from: i */
    public int f3879i;

    /* JADX INFO: renamed from: j */
    public C2411qb f3880j;

    /* JADX INFO: renamed from: k */
    public C0649P3 f3881k;

    /* JADX INFO: renamed from: l */
    public int f3882l;

    /* JADX INFO: renamed from: m */
    public HashMap f3883m;

    /* JADX INFO: renamed from: n */
    public final SparseArray f3884n;

    /* JADX INFO: renamed from: o */
    public final C1496hb f3885o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3871a = new SparseArray();
        this.f3872b = new ArrayList(4);
        this.f3873c = new C2497sb();
        this.f3874d = 0;
        this.f3875e = 0;
        this.f3876f = Integer.MAX_VALUE;
        this.f3877g = Integer.MAX_VALUE;
        this.f3878h = true;
        this.f3879i = 257;
        this.f3880j = null;
        this.f3881k = null;
        this.f3882l = -1;
        this.f3883m = new HashMap();
        this.f3884n = new SparseArray();
        this.f3885o = new C1496hb(this, this);
        m2125i(attributeSet, 0);
    }

    /* JADX INFO: renamed from: g */
    public static C1452gb m2123g() {
        C1452gb c1452gb = new C1452gb(-2, -2);
        c1452gb.f5106a = -1;
        c1452gb.f5108b = -1;
        c1452gb.f5110c = -1.0f;
        c1452gb.f5112d = true;
        c1452gb.f5114e = -1;
        c1452gb.f5116f = -1;
        c1452gb.f5118g = -1;
        c1452gb.f5120h = -1;
        c1452gb.f5122i = -1;
        c1452gb.f5124j = -1;
        c1452gb.f5126k = -1;
        c1452gb.f5128l = -1;
        c1452gb.f5130m = -1;
        c1452gb.f5132n = -1;
        c1452gb.f5134o = -1;
        c1452gb.f5136p = -1;
        c1452gb.f5138q = 0;
        c1452gb.f5139r = 0.0f;
        c1452gb.f5140s = -1;
        c1452gb.f5141t = -1;
        c1452gb.f5142u = -1;
        c1452gb.f5143v = -1;
        c1452gb.f5144w = Integer.MIN_VALUE;
        c1452gb.f5145x = Integer.MIN_VALUE;
        c1452gb.f5146y = Integer.MIN_VALUE;
        c1452gb.f5147z = Integer.MIN_VALUE;
        c1452gb.f5080A = Integer.MIN_VALUE;
        c1452gb.f5081B = Integer.MIN_VALUE;
        c1452gb.f5082C = Integer.MIN_VALUE;
        c1452gb.f5083D = 0;
        c1452gb.f5084E = 0.5f;
        c1452gb.f5085F = 0.5f;
        c1452gb.f5086G = null;
        c1452gb.f5087H = -1.0f;
        c1452gb.f5088I = -1.0f;
        c1452gb.f5089J = 0;
        c1452gb.f5090K = 0;
        c1452gb.f5091L = 0;
        c1452gb.f5092M = 0;
        c1452gb.f5093N = 0;
        c1452gb.f5094O = 0;
        c1452gb.f5095P = 0;
        c1452gb.f5096Q = 0;
        c1452gb.f5097R = 1.0f;
        c1452gb.f5098S = 1.0f;
        c1452gb.f5099T = -1;
        c1452gb.f5100U = -1;
        c1452gb.f5101V = -1;
        c1452gb.f5102W = false;
        c1452gb.f5103X = false;
        c1452gb.f5104Y = null;
        c1452gb.f5105Z = 0;
        c1452gb.f5107a0 = true;
        c1452gb.f5109b0 = true;
        c1452gb.f5111c0 = false;
        c1452gb.f5113d0 = false;
        c1452gb.f5115e0 = false;
        c1452gb.f5117f0 = -1;
        c1452gb.f5119g0 = -1;
        c1452gb.f5121h0 = -1;
        c1452gb.f5123i0 = -1;
        c1452gb.f5125j0 = Integer.MIN_VALUE;
        c1452gb.f5127k0 = Integer.MIN_VALUE;
        c1452gb.f5129l0 = 0.5f;
        c1452gb.f5137p0 = new C2454rb();
        return c1452gb;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C1475gy getSharedValues() {
        if (f3870p == null) {
            C1475gy c1475gy = new C1475gy();
            new SparseIntArray();
            new HashMap();
            f3870p = c1475gy;
        }
        return f3870p;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1452gb;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f3872b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC1364eb) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
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
        this.f3878h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m2123g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1452gb c1452gb = new C1452gb(context, attributeSet);
        c1452gb.f5106a = -1;
        c1452gb.f5108b = -1;
        c1452gb.f5110c = -1.0f;
        c1452gb.f5112d = true;
        c1452gb.f5114e = -1;
        c1452gb.f5116f = -1;
        c1452gb.f5118g = -1;
        c1452gb.f5120h = -1;
        c1452gb.f5122i = -1;
        c1452gb.f5124j = -1;
        c1452gb.f5126k = -1;
        c1452gb.f5128l = -1;
        c1452gb.f5130m = -1;
        c1452gb.f5132n = -1;
        c1452gb.f5134o = -1;
        c1452gb.f5136p = -1;
        c1452gb.f5138q = 0;
        c1452gb.f5139r = 0.0f;
        c1452gb.f5140s = -1;
        c1452gb.f5141t = -1;
        c1452gb.f5142u = -1;
        c1452gb.f5143v = -1;
        c1452gb.f5144w = Integer.MIN_VALUE;
        c1452gb.f5145x = Integer.MIN_VALUE;
        c1452gb.f5146y = Integer.MIN_VALUE;
        c1452gb.f5147z = Integer.MIN_VALUE;
        c1452gb.f5080A = Integer.MIN_VALUE;
        c1452gb.f5081B = Integer.MIN_VALUE;
        c1452gb.f5082C = Integer.MIN_VALUE;
        c1452gb.f5083D = 0;
        c1452gb.f5084E = 0.5f;
        c1452gb.f5085F = 0.5f;
        c1452gb.f5086G = null;
        c1452gb.f5087H = -1.0f;
        c1452gb.f5088I = -1.0f;
        c1452gb.f5089J = 0;
        c1452gb.f5090K = 0;
        c1452gb.f5091L = 0;
        c1452gb.f5092M = 0;
        c1452gb.f5093N = 0;
        c1452gb.f5094O = 0;
        c1452gb.f5095P = 0;
        c1452gb.f5096Q = 0;
        c1452gb.f5097R = 1.0f;
        c1452gb.f5098S = 1.0f;
        c1452gb.f5099T = -1;
        c1452gb.f5100U = -1;
        c1452gb.f5101V = -1;
        c1452gb.f5102W = false;
        c1452gb.f5103X = false;
        c1452gb.f5104Y = null;
        c1452gb.f5105Z = 0;
        c1452gb.f5107a0 = true;
        c1452gb.f5109b0 = true;
        c1452gb.f5111c0 = false;
        c1452gb.f5113d0 = false;
        c1452gb.f5115e0 = false;
        c1452gb.f5117f0 = -1;
        c1452gb.f5119g0 = -1;
        c1452gb.f5121h0 = -1;
        c1452gb.f5123i0 = -1;
        c1452gb.f5125j0 = Integer.MIN_VALUE;
        c1452gb.f5127k0 = Integer.MIN_VALUE;
        c1452gb.f5129l0 = 0.5f;
        c1452gb.f5137p0 = new C2454rb();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0639Ou.f2035b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = AbstractC1408fb.f4991a.get(index);
            switch (i2) {
                case 1:
                    c1452gb.f5101V = typedArrayObtainStyledAttributes.getInt(index, c1452gb.f5101V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5136p);
                    c1452gb.f5136p = resourceId;
                    if (resourceId == -1) {
                        c1452gb.f5136p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c1452gb.f5138q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1452gb.f5138q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c1452gb.f5139r) % 360.0f;
                    c1452gb.f5139r = f;
                    if (f < 0.0f) {
                        c1452gb.f5139r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c1452gb.f5106a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1452gb.f5106a);
                    break;
                case 6:
                    c1452gb.f5108b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1452gb.f5108b);
                    break;
                case 7:
                    c1452gb.f5110c = typedArrayObtainStyledAttributes.getFloat(index, c1452gb.f5110c);
                    break;
                case LuaJitConsts.LUA_TTHREAD /* 8 */:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5114e);
                    c1452gb.f5114e = resourceId2;
                    if (resourceId2 == -1) {
                        c1452gb.f5114e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5116f);
                    c1452gb.f5116f = resourceId3;
                    if (resourceId3 == -1) {
                        c1452gb.f5116f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5118g);
                    c1452gb.f5118g = resourceId4;
                    if (resourceId4 == -1) {
                        c1452gb.f5118g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5120h);
                    c1452gb.f5120h = resourceId5;
                    if (resourceId5 == -1) {
                        c1452gb.f5120h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5122i);
                    c1452gb.f5122i = resourceId6;
                    if (resourceId6 == -1) {
                        c1452gb.f5122i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5124j);
                    c1452gb.f5124j = resourceId7;
                    if (resourceId7 == -1) {
                        c1452gb.f5124j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5126k);
                    c1452gb.f5126k = resourceId8;
                    if (resourceId8 == -1) {
                        c1452gb.f5126k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5128l);
                    c1452gb.f5128l = resourceId9;
                    if (resourceId9 == -1) {
                        c1452gb.f5128l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5130m);
                    c1452gb.f5130m = resourceId10;
                    if (resourceId10 == -1) {
                        c1452gb.f5130m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5140s);
                    c1452gb.f5140s = resourceId11;
                    if (resourceId11 == -1) {
                        c1452gb.f5140s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5141t);
                    c1452gb.f5141t = resourceId12;
                    if (resourceId12 == -1) {
                        c1452gb.f5141t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5142u);
                    c1452gb.f5142u = resourceId13;
                    if (resourceId13 == -1) {
                        c1452gb.f5142u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case LuaJitConsts.LUA_MINSTACK /* 20 */:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5143v);
                    c1452gb.f5143v = resourceId14;
                    if (resourceId14 == -1) {
                        c1452gb.f5143v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c1452gb.f5144w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1452gb.f5144w);
                    break;
                case 22:
                    c1452gb.f5145x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1452gb.f5145x);
                    break;
                case 23:
                    c1452gb.f5146y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1452gb.f5146y);
                    break;
                case 24:
                    c1452gb.f5147z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1452gb.f5147z);
                    break;
                case 25:
                    c1452gb.f5080A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1452gb.f5080A);
                    break;
                case 26:
                    c1452gb.f5081B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1452gb.f5081B);
                    break;
                case 27:
                    c1452gb.f5102W = typedArrayObtainStyledAttributes.getBoolean(index, c1452gb.f5102W);
                    break;
                case 28:
                    c1452gb.f5103X = typedArrayObtainStyledAttributes.getBoolean(index, c1452gb.f5103X);
                    break;
                case 29:
                    c1452gb.f5084E = typedArrayObtainStyledAttributes.getFloat(index, c1452gb.f5084E);
                    break;
                case 30:
                    c1452gb.f5085F = typedArrayObtainStyledAttributes.getFloat(index, c1452gb.f5085F);
                    break;
                case 31:
                    c1452gb.f5091L = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    c1452gb.f5092M = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        c1452gb.f5093N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1452gb.f5093N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1452gb.f5093N) == -2) {
                            c1452gb.f5093N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c1452gb.f5095P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1452gb.f5095P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1452gb.f5095P) == -2) {
                            c1452gb.f5095P = -2;
                        }
                    }
                    break;
                case 35:
                    c1452gb.f5097R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1452gb.f5097R));
                    c1452gb.f5091L = 2;
                    break;
                case 36:
                    try {
                        c1452gb.f5094O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1452gb.f5094O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1452gb.f5094O) == -2) {
                            c1452gb.f5094O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c1452gb.f5096Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1452gb.f5096Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1452gb.f5096Q) == -2) {
                            c1452gb.f5096Q = -2;
                        }
                    }
                    break;
                case 38:
                    c1452gb.f5098S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1452gb.f5098S));
                    c1452gb.f5092M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C2411qb.m4852h(c1452gb, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c1452gb.f5087H = typedArrayObtainStyledAttributes.getFloat(index, c1452gb.f5087H);
                            break;
                        case 46:
                            c1452gb.f5088I = typedArrayObtainStyledAttributes.getFloat(index, c1452gb.f5088I);
                            break;
                        case 47:
                            c1452gb.f5089J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case CherryMessageAPI.Type.LOCATION /* 48 */:
                            c1452gb.f5090K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c1452gb.f5099T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1452gb.f5099T);
                            break;
                        case 50:
                            c1452gb.f5100U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1452gb.f5100U);
                            break;
                        case 51:
                            c1452gb.f5104Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5132n);
                            c1452gb.f5132n = resourceId15;
                            if (resourceId15 == -1) {
                                c1452gb.f5132n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c1452gb.f5134o);
                            c1452gb.f5134o = resourceId16;
                            if (resourceId16 == -1) {
                                c1452gb.f5134o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            c1452gb.f5083D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1452gb.f5083D);
                            break;
                        case 55:
                            c1452gb.f5082C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1452gb.f5082C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    C2411qb.m4851g(c1452gb, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C2411qb.m4851g(c1452gb, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c1452gb.f5105Z = typedArrayObtainStyledAttributes.getInt(index, c1452gb.f5105Z);
                                    break;
                                case 67:
                                    c1452gb.f5112d = typedArrayObtainStyledAttributes.getBoolean(index, c1452gb.f5112d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c1452gb.m2781a();
        return c1452gb;
    }

    public int getMaxHeight() {
        return this.f3877g;
    }

    public int getMaxWidth() {
        return this.f3876f;
    }

    public int getMinHeight() {
        return this.f3875e;
    }

    public int getMinWidth() {
        return this.f3874d;
    }

    public int getOptimizationLevel() {
        return this.f3873c.f8765D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C2497sb c2497sb = this.f3873c;
        if (c2497sb.f8624j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c2497sb.f8624j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c2497sb.f8624j = "parent";
            }
        }
        if (c2497sb.f8621h0 == null) {
            c2497sb.f8621h0 = c2497sb.f8624j;
        }
        for (C2454rb c2454rb : c2497sb.f8774q0) {
            View view = c2454rb.f8617f0;
            if (view != null) {
                if (c2454rb.f8624j == null && (id = view.getId()) != -1) {
                    c2454rb.f8624j = getContext().getResources().getResourceEntryName(id);
                }
                if (c2454rb.f8621h0 == null) {
                    c2454rb.f8621h0 = c2454rb.f8624j;
                }
            }
        }
        c2497sb.mo4936n(sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public final C2454rb m2124h(View view) {
        if (view == this) {
            return this.f3873c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C1452gb) {
            return ((C1452gb) view.getLayoutParams()).f5137p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C1452gb) {
            return ((C1452gb) view.getLayoutParams()).f5137p0;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m2125i(AttributeSet attributeSet, int i) {
        C2497sb c2497sb = this.f3873c;
        c2497sb.f8617f0 = this;
        C1496hb c1496hb = this.f3885o;
        c2497sb.f8778u0 = c1496hb;
        c2497sb.f8776s0.f8952f = c1496hb;
        this.f3871a.put(getId(), this);
        this.f3880j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0639Ou.f2035b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f3874d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3874d);
                } else if (index == 17) {
                    this.f3875e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3875e);
                } else if (index == 14) {
                    this.f3876f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3876f);
                } else if (index == 15) {
                    this.f3877g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3877g);
                } else if (index == 113) {
                    this.f3879i = typedArrayObtainStyledAttributes.getInt(index, this.f3879i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m2126j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f3881k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C2411qb c2411qb = new C2411qb();
                        this.f3880j = c2411qb;
                        c2411qb.m4855e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f3880j = null;
                    }
                    this.f3882l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c2497sb.f8765D0 = this.f3879i;
        C2244mo.f7925q = c2497sb.m4984W(512);
    }

    /* JADX INFO: renamed from: j */
    public final void m2126j(int i) {
        String str;
        Context context = getContext();
        C0649P3 c0649p3 = new C0649P3(12);
        c0649p3.f2089b = new SparseArray();
        c0649p3.f2090c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C1540ib c1540ib = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c0649p3.m1282M(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                C1540ib c1540ib2 = new C1540ib(context, xml);
                                ((SparseArray) c0649p3.f2089b).put(c1540ib2.f5436b, c1540ib2);
                                c1540ib = c1540ib2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C2097jb c2097jb = new C2097jb(context, xml);
                                if (c1540ib != null) {
                                    c1540ib.f5435a.add(c2097jb);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        this.f3881k = c0649p3;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0368  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2127k(C2497sb c2497sb, int i, int i2, int i3) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i4;
        char c;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        C1496hb c1496hb;
        int i7;
        boolean zM4982T;
        int i8;
        int i9;
        C1496hb c1496hb2;
        int i10;
        boolean z3;
        int i11;
        C1496hb c1496hb3;
        int i12;
        C0757Rk c0757Rk;
        C0830TD c0830td;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z4;
        boolean z5;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i20 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C1496hb c1496hb4 = this.f3885o;
        c1496hb4.f5274b = iMax3;
        c1496hb4.f5275c = iMax4;
        c1496hb4.f5276d = paddingWidth;
        c1496hb4.f5277e = i20;
        c1496hb4.f5278f = i2;
        c1496hb4.f5279g = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i21 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i22 = size - paddingWidth;
        int i23 = size2 - i20;
        int i24 = c1496hb4.f5277e;
        int i25 = c1496hb4.f5276d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    iMin = 0;
                } else {
                    iMin = Math.min(this.f3876f - i25, i22);
                    i21 = 1;
                }
            } else if (childCount == 0) {
                iMax = Math.max(0, this.f3874d);
                iMin = iMax;
                i21 = 2;
            } else {
                iMin = 0;
                i21 = 2;
            }
        } else if (childCount == 0) {
            iMax = Math.max(0, this.f3874d);
            iMin = iMax;
            i21 = 2;
        } else {
            iMin = i22;
            i21 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.f3877g - i24, i23);
                i4 = 1;
            } else if (childCount == 0) {
                iMax2 = Math.max(0, this.f3875e);
                iMin2 = iMax2;
                i4 = 2;
            } else {
                iMin2 = 0;
                i4 = 2;
            }
        } else if (childCount == 0) {
            iMax2 = Math.max(0, this.f3875e);
            iMin2 = iMax2;
            i4 = 2;
        } else {
            iMin2 = i23;
            i4 = 2;
        }
        int iM4937q = c2497sb.m4937q();
        C2585ud c2585ud = c2497sb.f8776s0;
        int[] iArr = c2497sb.f8582C;
        int i26 = iMin;
        if (i26 == iM4937q && iMin2 == c2497sb.m4933k()) {
            c = 1;
        } else {
            c2585ud.f8949c = true;
            c = 1;
        }
        c2497sb.f8604Y = 0;
        c2497sb.f8605Z = 0;
        iArr[0] = this.f3876f - i25;
        iArr[c] = this.f3877g - i24;
        c2497sb.f8609b0 = 0;
        c2497sb.f8611c0 = 0;
        c2497sb.m4922M(i21);
        c2497sb.m4924O(i26);
        c2497sb.m4923N(i4);
        c2497sb.m4921L(iMin2);
        int i27 = this.f3874d - i25;
        if (i27 < 0) {
            c2497sb.f8609b0 = 0;
        } else {
            c2497sb.f8609b0 = i27;
        }
        int i28 = this.f3875e - i24;
        if (i28 < 0) {
            c2497sb.f8611c0 = 0;
        } else {
            c2497sb.f8611c0 = i28;
        }
        c2497sb.f8781x0 = iMax5;
        c2497sb.f8782y0 = iMax3;
        C2656w4 c2656w4 = c2497sb.f8775r0;
        C2497sb c2497sb2 = (C2497sb) c2656w4.f9198d;
        ArrayList arrayList = (ArrayList) c2656w4.f9196b;
        C1496hb c1496hb5 = c2497sb.f8778u0;
        int size3 = c2497sb.f8774q0.size();
        int iM4937q2 = c2497sb.m4937q();
        int iM4933k = c2497sb.m4933k();
        boolean zM1492n = AbstractC0714Qj.m1492n(i, 128);
        boolean z6 = zM1492n || AbstractC0714Qj.m1492n(i, 64);
        if (z6) {
            int i29 = 0;
            while (i29 < size3) {
                boolean z7 = z6;
                C2454rb c2454rb = (C2454rb) c2497sb.f8774q0.get(i29);
                int i30 = i29;
                int[] iArr2 = c2454rb.f8637p0;
                i5 = size3;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c2454rb.f8602W > 0.0f;
                if ((c2454rb.m4944x() && z8) || ((c2454rb.m4945y() && z8) || (c2454rb instanceof C0368Ih) || c2454rb.m4944x() || c2454rb.m4945y())) {
                    i6 = 1073741824;
                    z = false;
                    break;
                } else {
                    i29 = i30 + 1;
                    z6 = z7;
                    size3 = i5;
                }
            }
            z = z6;
            i5 = size3;
            i6 = 1073741824;
        } else {
            z = z6;
            i5 = size3;
            i6 = 1073741824;
        }
        boolean z9 = z & ((mode == i6 && mode2 == i6) || zM1492n);
        if (z9) {
            int iMin3 = Math.min(iArr[0], i22);
            int iMin4 = Math.min(iArr[1], i23);
            int i31 = 1073741824;
            if (mode == 1073741824) {
                if (c2497sb.m4937q() != iMin3) {
                    c2497sb.m4924O(iMin3);
                    c2585ud.f8948b = true;
                }
                i31 = 1073741824;
            }
            if (mode2 == i31 && c2497sb.m4933k() != iMin4) {
                c2497sb.m4921L(iMin4);
                c2585ud.f8948b = true;
            }
            if (mode == i31 && mode2 == i31) {
                ArrayList<AbstractC1449gF> arrayList2 = c2585ud.f8951e;
                C2497sb c2497sb3 = c2585ud.f8947a;
                if (c2585ud.f8948b || c2585ud.f8949c) {
                    for (C2454rb c2454rb2 : c2497sb3.f8774q0) {
                        c2454rb2.m4931h();
                        c2454rb2.f8606a = false;
                        c2454rb2.f8612d.m1551n();
                        c2454rb2.f8614e.m1655m();
                        z9 = z9;
                    }
                    z2 = z9;
                    c2497sb3.m4931h();
                    i15 = 0;
                    c2497sb3.f8606a = false;
                    c2497sb3.f8612d.m1551n();
                    c2497sb3.f8614e.m1655m();
                    c2585ud.f8949c = false;
                } else {
                    z2 = z9;
                    i15 = 0;
                }
                c2585ud.m5088b(c2585ud.f8950d);
                c2497sb3.f8604Y = i15;
                int[] iArr3 = c2497sb3.f8637p0;
                c2497sb3.f8605Z = i15;
                int iM4932j = c2497sb3.m4932j(i15);
                int iM4932j2 = c2497sb3.m4932j(1);
                if (c2585ud.f8948b) {
                    c2585ud.m5089c();
                }
                int iM4938r = c2497sb3.m4938r();
                int iM4939s = c2497sb3.m4939s();
                c1496hb = c1496hb5;
                c2497sb3.f8612d.f5064h.mo1539d(iM4938r);
                c2497sb3.f8614e.f5064h.mo1539d(iM4939s);
                c2585ud.m5093g();
                if (iM4932j == 2 || iM4932j2 == 2) {
                    if (zM1492n) {
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!((AbstractC1449gF) it.next()).mo1550k()) {
                                    zM1492n = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (zM1492n && iM4932j == 2) {
                        c2497sb3.m4922M(1);
                        i16 = iM4938r;
                        c2497sb3.m4924O(c2585ud.m5090d(c2497sb3, 0));
                        c2497sb3.f8612d.f5061e.mo1539d(c2497sb3.m4937q());
                    } else {
                        i16 = iM4938r;
                    }
                    if (zM1492n && iM4932j2 == 2) {
                        i17 = 1;
                        c2497sb3.m4923N(1);
                        c2497sb3.m4921L(c2585ud.m5090d(c2497sb3, 1));
                        c2497sb3.f8614e.f5061e.mo1539d(c2497sb3.m4933k());
                    }
                    i18 = iArr3[0];
                    if (i18 != i17 || i18 == 4) {
                        int iM4937q3 = c2497sb3.m4937q() + i16;
                        c2497sb3.f8612d.f5065i.mo1539d(iM4937q3);
                        c2497sb3.f8612d.f5061e.mo1539d(iM4937q3 - i16);
                        c2585ud.m5093g();
                        i19 = iArr3[1];
                        if (i19 != 1 || i19 == 4) {
                            int iM4933k2 = c2497sb3.m4933k() + iM4939s;
                            c2497sb3.f8614e.f5065i.mo1539d(iM4933k2);
                            c2497sb3.f8614e.f5061e.mo1539d(iM4933k2 - iM4939s);
                        }
                        c2585ud.m5093g();
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    for (AbstractC1449gF abstractC1449gF : arrayList2) {
                        if (abstractC1449gF.f5058b != c2497sb3 || abstractC1449gF.f5063g) {
                            abstractC1449gF.mo1548e();
                        }
                    }
                    for (AbstractC1449gF abstractC1449gF2 : arrayList2) {
                        if (z4 || abstractC1449gF2.f5058b != c2497sb3) {
                            if (!abstractC1449gF2.f5064h.f9119j || ((!abstractC1449gF2.f5065i.f9119j && !(abstractC1449gF2 instanceof C2197lk)) || (!abstractC1449gF2.f5061e.f9119j && !(abstractC1449gF2 instanceof C2221m7) && !(abstractC1449gF2 instanceof C2197lk)))) {
                                z5 = false;
                                break;
                            }
                        }
                    }
                    z5 = true;
                    c2497sb3.m4922M(iM4932j);
                    c2497sb3.m4923N(iM4932j2);
                    zM4982T = z5;
                    i7 = 2;
                    i14 = 1073741824;
                } else {
                    i16 = iM4938r;
                }
                i17 = 1;
                i18 = iArr3[0];
                if (i18 != i17) {
                    int iM4937q32 = c2497sb3.m4937q() + i16;
                    c2497sb3.f8612d.f5065i.mo1539d(iM4937q32);
                    c2497sb3.f8612d.f5061e.mo1539d(iM4937q32 - i16);
                    c2585ud.m5093g();
                    i19 = iArr3[1];
                    if (i19 != 1) {
                        int iM4933k22 = c2497sb3.m4933k() + iM4939s;
                        c2497sb3.f8614e.f5065i.mo1539d(iM4933k22);
                        c2497sb3.f8614e.f5061e.mo1539d(iM4933k22 - iM4939s);
                        c2585ud.m5093g();
                        z4 = true;
                        while (r6.hasNext()) {
                        }
                        while (r6.hasNext()) {
                        }
                        z5 = true;
                        c2497sb3.m4922M(iM4932j);
                        c2497sb3.m4923N(iM4932j2);
                        zM4982T = z5;
                        i7 = 2;
                        i14 = 1073741824;
                    }
                }
            } else {
                z2 = z9;
                c1496hb = c1496hb5;
                C2497sb c2497sb4 = c2585ud.f8947a;
                if (c2585ud.f8948b) {
                    for (C2454rb c2454rb3 : c2497sb4.f8774q0) {
                        c2454rb3.m4931h();
                        c2454rb3.f8606a = false;
                        C0757Rk c0757Rk2 = c2454rb3.f8612d;
                        c0757Rk2.f5061e.f9119j = false;
                        c0757Rk2.f5063g = false;
                        c0757Rk2.m1551n();
                        C0830TD c0830td2 = c2454rb3.f8614e;
                        c0830td2.f5061e.f9119j = false;
                        c0830td2.f5063g = false;
                        c0830td2.m1655m();
                    }
                    i13 = 0;
                    c2497sb4.m4931h();
                    c2497sb4.f8606a = false;
                    C0757Rk c0757Rk3 = c2497sb4.f8612d;
                    c0757Rk3.f5061e.f9119j = false;
                    c0757Rk3.f5063g = false;
                    c0757Rk3.m1551n();
                    C0830TD c0830td3 = c2497sb4.f8614e;
                    c0830td3.f5061e.f9119j = false;
                    c0830td3.f5063g = false;
                    c0830td3.m1655m();
                    c2585ud.m5089c();
                } else {
                    i13 = 0;
                }
                c2585ud.m5088b(c2585ud.f8950d);
                c2497sb4.f8604Y = i13;
                c2497sb4.f8605Z = i13;
                c2497sb4.f8612d.f5064h.mo1539d(i13);
                c2497sb4.f8614e.f5064h.mo1539d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    zM4982T = c2497sb.m4982T(i13, zM1492n);
                    i7 = 1;
                } else {
                    i7 = 0;
                    zM4982T = true;
                }
                if (mode2 == 1073741824) {
                    zM4982T &= c2497sb.m4982T(1, zM1492n);
                    i7++;
                }
            }
            if (zM4982T) {
                c2497sb.mo4925P(mode == i14, mode2 == i14);
            }
        } else {
            z2 = z9;
            c1496hb = c1496hb5;
            i7 = 0;
            zM4982T = false;
        }
        if (zM4982T && i7 == 2) {
            return;
        }
        int i32 = c2497sb.f8765D0;
        if (i5 > 0) {
            int size4 = c2497sb.f8774q0.size();
            boolean zM4984W = c2497sb.m4984W(64);
            C1496hb c1496hb6 = c2497sb.f8778u0;
            int i33 = 0;
            while (i33 < size4) {
                C2454rb c2454rb4 = (C2454rb) c2497sb.f8774q0.get(i33);
                if ((c2454rb4 instanceof C2150kk) || (c2454rb4 instanceof C2399q5) || c2454rb4.f8585F || (zM4984W && (c0757Rk = c2454rb4.f8612d) != null && (c0830td = c2454rb4.f8614e) != null && c0757Rk.f5061e.f9119j && c0830td.f5061e.f9119j)) {
                    i12 = size4;
                } else {
                    int iM4932j3 = c2454rb4.m4932j(0);
                    int iM4932j4 = c2454rb4.m4932j(1);
                    i12 = size4;
                    boolean z10 = iM4932j3 == 3 && c2454rb4.f8639r != 1 && iM4932j4 == 3 && c2454rb4.f8640s != 1;
                    if (!z10 && c2497sb.m4984W(1) && !(c2454rb4 instanceof C0368Ih)) {
                        if (iM4932j3 == 3 && c2454rb4.f8639r == 0 && iM4932j4 != 3 && !c2454rb4.m4944x()) {
                            z10 = true;
                        }
                        if (iM4932j4 == 3 && c2454rb4.f8640s == 0 && iM4932j3 != 3 && !c2454rb4.m4944x()) {
                            z10 = true;
                        }
                        if ((iM4932j3 == 3 || iM4932j4 == 3) && c2454rb4.f8602W > 0.0f) {
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        c2656w4.m5218z(0, c1496hb6, c2454rb4);
                    }
                }
                i33++;
                size4 = i12;
            }
            ConstraintLayout constraintLayout = c1496hb6.f5273a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList3 = constraintLayout.f3872b;
            for (int i34 = 0; i34 < childCount2; i34++) {
                constraintLayout.getChildAt(i34);
            }
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i35 = 0; i35 < size5; i35++) {
                    ((AbstractC1364eb) arrayList3.get(i35)).getClass();
                }
            }
        }
        c2656w4.m5199K(c2497sb);
        int size6 = arrayList.size();
        if (i5 > 0) {
            c2656w4.m5198H(c2497sb, 0, iM4937q2, iM4933k);
        }
        if (size6 > 0) {
            int[] iArr4 = c2497sb.f8637p0;
            boolean z11 = iArr4[0] == 2;
            boolean z12 = iArr4[1] == 2;
            int iMax7 = Math.max(c2497sb.m4937q(), c2497sb2.f8609b0);
            int iMax8 = Math.max(c2497sb.m4933k(), c2497sb2.f8611c0);
            int i36 = 0;
            boolean z13 = false;
            while (i36 < size6) {
                C2454rb c2454rb5 = (C2454rb) arrayList.get(i36);
                if (c2454rb5 instanceof C0368Ih) {
                    int iM4937q4 = c2454rb5.m4937q();
                    int iM4933k3 = c2454rb5.m4933k();
                    z3 = z12;
                    i11 = i36;
                    c1496hb3 = c1496hb;
                    boolean zM5218z = z13 | c2656w4.m5218z(1, c1496hb3, c2454rb5);
                    int iM4937q5 = c2454rb5.m4937q();
                    boolean z14 = zM5218z;
                    int iM4933k4 = c2454rb5.m4933k();
                    if (iM4937q5 != iM4937q4) {
                        c2454rb5.m4924O(iM4937q5);
                        if (z11 && c2454rb5.m4938r() + c2454rb5.f8600U > iMax7) {
                            iMax7 = Math.max(iMax7, c2454rb5.mo4340i(4).m2384e() + c2454rb5.m4938r() + c2454rb5.f8600U);
                        }
                        z14 = true;
                    }
                    if (iM4933k4 != iM4933k3) {
                        c2454rb5.m4921L(iM4933k4);
                        if (z3 && c2454rb5.m4939s() + c2454rb5.f8601V > iMax8) {
                            iMax8 = Math.max(iMax8, c2454rb5.mo4340i(5).m2384e() + c2454rb5.m4939s() + c2454rb5.f8601V);
                        }
                        z14 = true;
                    }
                    z13 = z14 | ((C0368Ih) c2454rb5).f1282y0;
                } else {
                    z3 = z12;
                    i11 = i36;
                    c1496hb3 = c1496hb;
                }
                i36 = i11 + 1;
                c1496hb = c1496hb3;
                z12 = z3;
            }
            boolean z15 = z12;
            int i37 = 0;
            while (true) {
                C1496hb c1496hb7 = c1496hb;
                if (i37 >= 2) {
                    break;
                }
                boolean zM5218z2 = z13;
                int i38 = 0;
                while (i38 < size6) {
                    C2454rb c2454rb6 = (C2454rb) arrayList.get(i38);
                    if ((!(c2454rb6 instanceof AbstractC2592uk) || (c2454rb6 instanceof C0368Ih)) && !(c2454rb6 instanceof C2150kk)) {
                        i8 = size6;
                        if (c2454rb6.f8619g0 != 8 && ((!z2 || !c2454rb6.f8612d.f5061e.f9119j || !c2454rb6.f8614e.f5061e.f9119j) && !(c2454rb6 instanceof C0368Ih))) {
                            int iM4937q6 = c2454rb6.m4937q();
                            int iM4933k5 = c2454rb6.m4933k();
                            i9 = i38;
                            int i39 = c2454rb6.f8607a0;
                            zM5218z2 |= c2656w4.m5218z(i37 == 1 ? 2 : 1, c1496hb7, c2454rb6);
                            c1496hb2 = c1496hb7;
                            int iM4937q7 = c2454rb6.m4937q();
                            i10 = i37;
                            int iM4933k6 = c2454rb6.m4933k();
                            if (iM4937q7 != iM4937q6) {
                                c2454rb6.m4924O(iM4937q7);
                                if (z11 && c2454rb6.m4938r() + c2454rb6.f8600U > iMax7) {
                                    iMax7 = Math.max(iMax7, c2454rb6.mo4340i(4).m2384e() + c2454rb6.m4938r() + c2454rb6.f8600U);
                                }
                                zM5218z2 = true;
                            }
                            if (iM4933k6 != iM4933k5) {
                                c2454rb6.m4921L(iM4933k6);
                                if (z15 && c2454rb6.m4939s() + c2454rb6.f8601V > iMax8) {
                                    iMax8 = Math.max(iMax8, c2454rb6.mo4340i(5).m2384e() + c2454rb6.m4939s() + c2454rb6.f8601V);
                                }
                                zM5218z2 = true;
                            }
                            if (c2454rb6.f8584E && i39 != c2454rb6.f8607a0) {
                                zM5218z2 = true;
                            }
                        }
                        i38 = i9 + 1;
                        size6 = i8;
                        i37 = i10;
                        c1496hb7 = c1496hb2;
                    } else {
                        i8 = size6;
                    }
                    c1496hb2 = c1496hb7;
                    i10 = i37;
                    i9 = i38;
                    i38 = i9 + 1;
                    size6 = i8;
                    i37 = i10;
                    c1496hb7 = c1496hb2;
                }
                int i40 = size6;
                c1496hb = c1496hb7;
                int i41 = i37;
                if (!zM5218z2) {
                    break;
                }
                int i42 = i41 + 1;
                c2656w4.m5198H(c2497sb, i42, iM4937q2, iM4933k);
                i37 = i42;
                size6 = i40;
                z13 = false;
            }
        }
        c2497sb.f8765D0 = i32;
        C2244mo.f7925q = c2497sb.m4984W(512);
    }

    /* JADX INFO: renamed from: l */
    public final void m2128l(C2454rb c2454rb, C1452gb c1452gb, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f3871a.get(i);
        C2454rb c2454rb2 = (C2454rb) sparseArray.get(i);
        if (c2454rb2 == null || view == null || !(view.getLayoutParams() instanceof C1452gb)) {
            return;
        }
        c1452gb.f5111c0 = true;
        if (i2 == 6) {
            C1452gb c1452gb2 = (C1452gb) view.getLayoutParams();
            c1452gb2.f5111c0 = true;
            c1452gb2.f5137p0.f8584E = true;
        }
        c2454rb.mo4340i(6).m2381b(c2454rb2.mo4340i(i2), c1452gb.f5083D, c1452gb.f5082C, true);
        c2454rb.f8584E = true;
        c2454rb.mo4340i(3).m2389j();
        c2454rb.mo4340i(5).m2389j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C1452gb c1452gb = (C1452gb) childAt.getLayoutParams();
            C2454rb c2454rb = c1452gb.f5137p0;
            if (childAt.getVisibility() != 8 || c1452gb.f5113d0 || c1452gb.f5115e0 || zIsInEditMode) {
                int iM4938r = c2454rb.m4938r();
                int iM4939s = c2454rb.m4939s();
                childAt.layout(iM4938r, iM4939s, c2454rb.m4937q() + iM4938r, c2454rb.m4933k() + iM4939s);
            }
        }
        ArrayList arrayList = this.f3872b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC1364eb) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0552  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        C2454rb c2454rb;
        int i4;
        C2454rb c2454rb2;
        int i5;
        int i6;
        int i7;
        C2454rb c2454rb3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        C2454rb c2454rb4;
        int i13;
        int i14;
        C2454rb c2454rb5;
        C1452gb c1452gb;
        int i15;
        C2454rb c2454rb6;
        float f;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float fAbs;
        int i21;
        byte b;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str;
        int iM2653f;
        int i22;
        C2454rb c2454rb7;
        ConstraintLayout constraintLayout = this;
        boolean z3 = constraintLayout.f3878h;
        constraintLayout.f3878h = z3;
        int i23 = 1;
        int i24 = 0;
        if (!z3) {
            int childCount = constraintLayout.getChildCount();
            int i25 = 0;
            while (true) {
                if (i25 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i25).isLayoutRequested()) {
                    constraintLayout.f3878h = true;
                    break;
                }
                i25++;
            }
        }
        boolean z4 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        C2497sb c2497sb = constraintLayout.f3873c;
        c2497sb.f8779v0 = z4;
        if (constraintLayout.f3878h) {
            constraintLayout.f3878h = false;
            int childCount2 = constraintLayout.getChildCount();
            int i26 = 0;
            while (true) {
                if (i26 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i26).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i26++;
                }
            }
            if (z) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i27 = 0; i27 < childCount3; i27++) {
                    C2454rb c2454rbM2124h = constraintLayout.m2124h(constraintLayout.getChildAt(i27));
                    if (c2454rbM2124h != null) {
                        c2454rbM2124h.mo4914C();
                    }
                }
                SparseArray sparseArray3 = constraintLayout.f3871a;
                if (zIsInEditMode) {
                    int i28 = 0;
                    while (i28 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i28);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i22 = i23;
                                try {
                                    if (constraintLayout.f3883m == null) {
                                        constraintLayout.f3883m = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    constraintLayout.f3883m.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i22 = i23;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray3.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                if (viewFindViewById == constraintLayout) {
                                    c2454rb7 = c2497sb;
                                    c2454rb7.f8621h0 = resourceName;
                                } else {
                                    c2454rb7 = viewFindViewById == null ? null : ((C1452gb) viewFindViewById.getLayoutParams()).f5137p0;
                                    c2454rb7.f8621h0 = resourceName;
                                }
                            } else {
                                c2454rb7 = c2497sb;
                                c2454rb7.f8621h0 = resourceName;
                            }
                        } catch (Resources.NotFoundException unused2) {
                            i22 = i23;
                        }
                        i28++;
                        i23 = i22;
                    }
                }
                int i29 = i23;
                if (constraintLayout.f3882l != -1) {
                    for (int i30 = 0; i30 < childCount3; i30++) {
                        constraintLayout.getChildAt(i30).getId();
                    }
                }
                C2411qb c2411qb = constraintLayout.f3880j;
                if (c2411qb != null) {
                    c2411qb.m4853a(constraintLayout);
                }
                c2497sb.f8774q0.clear();
                ArrayList arrayList3 = constraintLayout.f3872b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i31 = 0;
                    while (i31 < size) {
                        AbstractC1364eb abstractC1364eb = (AbstractC1364eb) arrayList3.get(i31);
                        HashMap map = abstractC1364eb.f4878g;
                        if (abstractC1364eb.isInEditMode()) {
                            abstractC1364eb.setIds(abstractC1364eb.f4876e);
                        }
                        AbstractC2592uk abstractC2592uk = abstractC1364eb.f4875d;
                        if (abstractC2592uk == null) {
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                        } else {
                            abstractC2592uk.f8966r0 = i24;
                            Arrays.fill(abstractC2592uk.f8965q0, (Object) null);
                            int i32 = i24;
                            while (i32 < abstractC1364eb.f4873b) {
                                int i33 = abstractC1364eb.f4872a[i32];
                                View view = (View) sparseArray3.get(i33);
                                if (view != null || (iM2653f = abstractC1364eb.m2653f(constraintLayout, (str = (String) map.get(Integer.valueOf(i33))))) == 0) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                    abstractC1364eb.f4872a[i32] = iM2653f;
                                    map.put(Integer.valueOf(iM2653f), str);
                                    view = (View) sparseArray3.get(iM2653f);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    AbstractC2592uk abstractC2592uk2 = abstractC1364eb.f4875d;
                                    C2454rb c2454rbM2124h2 = constraintLayout.m2124h(view2);
                                    abstractC2592uk2.getClass();
                                    if (c2454rbM2124h2 == abstractC2592uk2 || c2454rbM2124h2 == null) {
                                        sparseArray2 = sparseArray3;
                                    } else {
                                        int i34 = abstractC2592uk2.f8966r0 + 1;
                                        sparseArray2 = sparseArray3;
                                        C2454rb[] c2454rbArr = abstractC2592uk2.f8965q0;
                                        if (i34 > c2454rbArr.length) {
                                            abstractC2592uk2.f8965q0 = (C2454rb[]) Arrays.copyOf(c2454rbArr, c2454rbArr.length * 2);
                                        }
                                        C2454rb[] c2454rbArr2 = abstractC2592uk2.f8965q0;
                                        int i35 = abstractC2592uk2.f8966r0;
                                        c2454rbArr2[i35] = c2454rbM2124h2;
                                        abstractC2592uk2.f8966r0 = i35 + 1;
                                    }
                                }
                                i32++;
                                sparseArray3 = sparseArray2;
                                arrayList3 = arrayList2;
                            }
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                            abstractC1364eb.f4875d.mo809S();
                        }
                        i31++;
                        sparseArray3 = sparseArray;
                        arrayList3 = arrayList;
                        i24 = 0;
                    }
                }
                int i36 = 2;
                for (int i37 = 0; i37 < childCount3; i37++) {
                    constraintLayout.getChildAt(i37);
                }
                SparseArray sparseArray4 = constraintLayout.f3884n;
                sparseArray4.clear();
                sparseArray4.put(0, c2497sb);
                sparseArray4.put(constraintLayout.getId(), c2497sb);
                for (int i38 = 0; i38 < childCount3; i38++) {
                    View childAt2 = constraintLayout.getChildAt(i38);
                    sparseArray4.put(childAt2.getId(), constraintLayout.m2124h(childAt2));
                }
                int i39 = 0;
                while (i39 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i39);
                    C2454rb c2454rbM2124h3 = constraintLayout.m2124h(childAt3);
                    if (c2454rbM2124h3 == null) {
                        i3 = i39;
                        z2 = z;
                        i18 = i36;
                    } else {
                        C1452gb c1452gb2 = (C1452gb) childAt3.getLayoutParams();
                        c2497sb.f8774q0.add(c2454rbM2124h3);
                        C2454rb c2454rb8 = c2454rbM2124h3.f8599T;
                        if (c2454rb8 != null) {
                            ((C2497sb) c2454rb8).f8774q0.remove(c2454rbM2124h3);
                            c2454rbM2124h3.mo4914C();
                        }
                        c2454rbM2124h3.f8599T = c2497sb;
                        c1452gb2.m2781a();
                        c2454rbM2124h3.f8619g0 = childAt3.getVisibility();
                        c2454rbM2124h3.f8617f0 = childAt3;
                        if (childAt3 instanceof AbstractC1364eb) {
                            ((AbstractC1364eb) childAt3).mo2120h(c2454rbM2124h3, c2497sb.f8779v0);
                        }
                        if (c1452gb2.f5113d0) {
                            C2150kk c2150kk = (C2150kk) c2454rbM2124h3;
                            int i40 = c1452gb2.f5131m0;
                            int i41 = c1452gb2.f5133n0;
                            float f2 = c1452gb2.f5135o0;
                            if (f2 != -1.0f) {
                                if (f2 > -1.0f) {
                                    c2150kk.f7518q0 = f2;
                                    b = -1;
                                    c2150kk.f7519r0 = -1;
                                    c2150kk.f7520s0 = -1;
                                    i3 = i39;
                                    z2 = z;
                                    i18 = i36;
                                }
                                i3 = i39;
                                z2 = z;
                                i18 = i36;
                            } else {
                                b = -1;
                                if (i40 != -1) {
                                    if (i40 > -1) {
                                        c2150kk.f7518q0 = -1.0f;
                                        c2150kk.f7519r0 = i40;
                                        c2150kk.f7520s0 = -1;
                                    }
                                } else if (i41 != -1 && i41 > -1) {
                                    c2150kk.f7518q0 = -1.0f;
                                    c2150kk.f7519r0 = -1;
                                    c2150kk.f7520s0 = i41;
                                    i3 = i39;
                                    z2 = z;
                                    i18 = i36;
                                }
                                i3 = i39;
                                z2 = z;
                                i18 = i36;
                            }
                        } else {
                            int i42 = c1452gb2.f5117f0;
                            int i43 = c1452gb2.f5119g0;
                            int i44 = c1452gb2.f5121h0;
                            int i45 = c1452gb2.f5123i0;
                            int i46 = c1452gb2.f5125j0;
                            int i47 = c1452gb2.f5127k0;
                            i3 = i39;
                            float f3 = c1452gb2.f5129l0;
                            int i48 = c1452gb2.f5136p;
                            z2 = z;
                            if (i48 != -1) {
                                C2454rb c2454rb9 = (C2454rb) sparseArray4.get(i48);
                                if (c2454rb9 != null) {
                                    float f4 = c1452gb2.f5139r;
                                    c2454rbM2124h3.m4942v(7, 7, c1452gb2.f5138q, 0, c2454rb9);
                                    c2454rbM2124h3.f8583D = f4;
                                }
                                constraintLayout = this;
                                c2454rb6 = c2454rbM2124h3;
                                c1452gb = c1452gb2;
                                i8 = 4;
                                i7 = 2;
                            } else {
                                if (i42 != -1) {
                                    C2454rb c2454rb10 = (C2454rb) sparseArray4.get(i42);
                                    if (c2454rb10 != null) {
                                        c2454rb = c2454rbM2124h3;
                                        i4 = 2;
                                        c2454rb.m4942v(2, 2, ((ViewGroup.MarginLayoutParams) c1452gb2).leftMargin, i46, c2454rb10);
                                    } else {
                                        c2454rb = c2454rbM2124h3;
                                        i4 = 2;
                                    }
                                } else {
                                    c2454rb = c2454rbM2124h3;
                                    i4 = 2;
                                    if (i43 != -1 && (c2454rb2 = (C2454rb) sparseArray4.get(i43)) != null) {
                                        c2454rb.m4942v(2, 4, ((ViewGroup.MarginLayoutParams) c1452gb2).leftMargin, i46, c2454rb2);
                                        i5 = 2;
                                        i6 = 4;
                                    }
                                    if (i44 == -1) {
                                        C2454rb c2454rb11 = (C2454rb) sparseArray4.get(i44);
                                        if (c2454rb11 != null) {
                                            c2454rb.m4942v(i6, i5, ((ViewGroup.MarginLayoutParams) c1452gb2).rightMargin, i47, c2454rb11);
                                        }
                                        i7 = i5;
                                    } else {
                                        i7 = i5;
                                        if (i45 != -1 && (c2454rb3 = (C2454rb) sparseArray4.get(i45)) != null) {
                                            c2454rb.m4942v(i6, i6, ((ViewGroup.MarginLayoutParams) c1452gb2).rightMargin, i47, c2454rb3);
                                        }
                                    }
                                    i8 = i6;
                                    i9 = c1452gb2.f5122i;
                                    if (i9 == -1) {
                                        C2454rb c2454rb12 = (C2454rb) sparseArray4.get(i9);
                                        if (c2454rb12 != null) {
                                            i16 = 3;
                                            c2454rb.m4942v(3, 3, ((ViewGroup.MarginLayoutParams) c1452gb2).topMargin, c1452gb2.f5145x, c2454rb12);
                                        } else {
                                            i16 = 3;
                                        }
                                        i11 = i16;
                                        i12 = 5;
                                        i10 = -1;
                                    } else {
                                        int i49 = c1452gb2.f5124j;
                                        i10 = -1;
                                        if (i49 == -1 || (c2454rb4 = (C2454rb) sparseArray4.get(i49)) == null) {
                                            i11 = 3;
                                            i12 = 5;
                                        } else {
                                            c2454rb.m4942v(3, 5, ((ViewGroup.MarginLayoutParams) c1452gb2).topMargin, c1452gb2.f5145x, c2454rb4);
                                            i11 = 3;
                                            i12 = 5;
                                        }
                                    }
                                    i13 = c1452gb2.f5126k;
                                    if (i13 == i10) {
                                        C2454rb c2454rb13 = (C2454rb) sparseArray4.get(i13);
                                        if (c2454rb13 != null) {
                                            int i50 = i11;
                                            c2454rb.m4942v(i12, i50, ((ViewGroup.MarginLayoutParams) c1452gb2).bottomMargin, c1452gb2.f5147z, c2454rb13);
                                            i14 = i50;
                                        } else {
                                            i14 = i11;
                                        }
                                    } else {
                                        i14 = i11;
                                        int i51 = c1452gb2.f5128l;
                                        if (i51 != i10 && (c2454rb5 = (C2454rb) sparseArray4.get(i51)) != null) {
                                            c2454rb.m4942v(i12, i12, ((ViewGroup.MarginLayoutParams) c1452gb2).bottomMargin, c1452gb2.f5147z, c2454rb5);
                                        }
                                    }
                                    c1452gb = c1452gb2;
                                    i15 = c1452gb.f5130m;
                                    if (i15 == -1) {
                                        constraintLayout = this;
                                        c2454rb6 = c2454rb;
                                        constraintLayout.m2128l(c2454rb6, c1452gb, sparseArray4, i15, 6);
                                    } else {
                                        int i52 = c1452gb.f5132n;
                                        if (i52 != -1) {
                                            constraintLayout = this;
                                            c2454rb6 = c2454rb;
                                            constraintLayout.m2128l(c2454rb6, c1452gb, sparseArray4, i52, i14);
                                        } else {
                                            int i53 = c1452gb.f5134o;
                                            constraintLayout = this;
                                            c2454rb6 = c2454rb;
                                            int i54 = i12;
                                            if (i53 != -1) {
                                                constraintLayout.m2128l(c2454rb6, c1452gb, sparseArray4, i53, i54);
                                            }
                                            if (f3 >= 0.0f) {
                                                c2454rb6.f8613d0 = f3;
                                            }
                                            f = c1452gb.f5085F;
                                            if (f >= 0.0f) {
                                                c2454rb6.f8615e0 = f;
                                            }
                                        }
                                    }
                                    if (f3 >= 0.0f) {
                                    }
                                    f = c1452gb.f5085F;
                                    if (f >= 0.0f) {
                                    }
                                }
                                i5 = i4;
                                i6 = 4;
                                if (i44 == -1) {
                                }
                                i8 = i6;
                                i9 = c1452gb2.f5122i;
                                if (i9 == -1) {
                                }
                                i13 = c1452gb2.f5126k;
                                if (i13 == i10) {
                                }
                                c1452gb = c1452gb2;
                                i15 = c1452gb.f5130m;
                                if (i15 == -1) {
                                }
                                if (f3 >= 0.0f) {
                                }
                                f = c1452gb.f5085F;
                                if (f >= 0.0f) {
                                }
                            }
                            if (zIsInEditMode && ((i21 = c1452gb.f5099T) != -1 || c1452gb.f5100U != -1)) {
                                int i55 = c1452gb.f5100U;
                                c2454rb6.f8604Y = i21;
                                c2454rb6.f8605Z = i55;
                            }
                            if (c1452gb.f5107a0) {
                                c2454rb6.m4922M(i29);
                                c2454rb6.m4924O(((ViewGroup.MarginLayoutParams) c1452gb).width);
                                if (((ViewGroup.MarginLayoutParams) c1452gb).width == -2) {
                                    c2454rb6.m4922M(i36);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c1452gb).width == -1) {
                                if (c1452gb.f5102W) {
                                    c2454rb6.m4922M(3);
                                } else {
                                    c2454rb6.m4922M(4);
                                }
                                c2454rb6.mo4340i(i7).f4271g = ((ViewGroup.MarginLayoutParams) c1452gb).leftMargin;
                                c2454rb6.mo4340i(i8).f4271g = ((ViewGroup.MarginLayoutParams) c1452gb).rightMargin;
                            } else {
                                c2454rb6.m4922M(3);
                                c2454rb6.m4924O(0);
                            }
                            if (c1452gb.f5109b0) {
                                i17 = -1;
                                c2454rb6.m4923N(1);
                                c2454rb6.m4921L(((ViewGroup.MarginLayoutParams) c1452gb).height);
                                if (((ViewGroup.MarginLayoutParams) c1452gb).height == -2) {
                                    c2454rb6.m4923N(2);
                                }
                            } else {
                                i17 = -1;
                                if (((ViewGroup.MarginLayoutParams) c1452gb).height == -1) {
                                    if (c1452gb.f5103X) {
                                        c2454rb6.m4923N(3);
                                    } else {
                                        c2454rb6.m4923N(4);
                                    }
                                    c2454rb6.mo4340i(3).f4271g = ((ViewGroup.MarginLayoutParams) c1452gb).topMargin;
                                    c2454rb6.mo4340i(5).f4271g = ((ViewGroup.MarginLayoutParams) c1452gb).bottomMargin;
                                } else {
                                    c2454rb6.m4923N(3);
                                    c2454rb6.m4921L(0);
                                }
                            }
                            String str2 = c1452gb.f5086G;
                            if (str2 == null || str2.length() == 0) {
                                c2454rb6.f8602W = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i19 = i17;
                                    i20 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i19 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i17;
                                    i20 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i20);
                                    fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : 0.0f;
                                    if (fAbs > 0.0f) {
                                        c2454rb6.f8602W = fAbs;
                                        c2454rb6.f8603X = i19;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i20, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f5 = Float.parseFloat(strSubstring3);
                                            float f6 = Float.parseFloat(strSubstring4);
                                            if (f5 > 0.0f && f6 > 0.0f) {
                                                fAbs = i19 == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                        if (fAbs > 0.0f) {
                                        }
                                    }
                                }
                            }
                            float f7 = c1452gb.f5087H;
                            float[] fArr = c2454rb6.f8627k0;
                            fArr[0] = f7;
                            i29 = 1;
                            fArr[1] = c1452gb.f5088I;
                            c2454rb6.f8623i0 = c1452gb.f5089J;
                            c2454rb6.f8625j0 = c1452gb.f5090K;
                            int i56 = c1452gb.f5105Z;
                            if (i56 >= 0 && i56 <= 3) {
                                c2454rb6.f8638q = i56;
                            }
                            int i57 = c1452gb.f5091L;
                            int i58 = c1452gb.f5093N;
                            int i59 = c1452gb.f5095P;
                            float f8 = c1452gb.f5097R;
                            c2454rb6.f8639r = i57;
                            c2454rb6.f8642u = i58;
                            if (i59 == Integer.MAX_VALUE) {
                                i59 = 0;
                            }
                            c2454rb6.f8643v = i59;
                            c2454rb6.f8644w = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i57 == 0) {
                                c2454rb6.f8639r = 2;
                            }
                            int i60 = c1452gb.f5092M;
                            int i61 = c1452gb.f5094O;
                            int i62 = c1452gb.f5096Q;
                            float f9 = c1452gb.f5098S;
                            c2454rb6.f8640s = i60;
                            c2454rb6.f8645x = i61;
                            if (i62 == Integer.MAX_VALUE) {
                                i62 = 0;
                            }
                            c2454rb6.f8646y = i62;
                            c2454rb6.f8647z = f9;
                            if (f9 <= 0.0f || f9 >= 1.0f || i60 != 0) {
                                i18 = 2;
                            } else {
                                i18 = 2;
                                c2454rb6.f8640s = 2;
                            }
                        }
                    }
                    i39 = i3 + 1;
                    i36 = i18;
                    z = z2;
                }
            }
            if (z) {
                c2497sb.f8775r0.m5199K(c2497sb);
            }
        }
        c2497sb.f8780w0.getClass();
        constraintLayout.m2127k(c2497sb, constraintLayout.f3879i, i, i2);
        int iM4937q = c2497sb.m4937q();
        int iM4933k = c2497sb.m4933k();
        boolean z5 = c2497sb.f8766E0;
        boolean z6 = c2497sb.f8767F0;
        C1496hb c1496hb = constraintLayout.f3885o;
        int i63 = c1496hb.f5277e;
        int iResolveSizeAndState = View.resolveSizeAndState(iM4937q + c1496hb.f5276d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iM4933k + i63, i2, 0) & 16777215;
        int iMin = Math.min(constraintLayout.f3876f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.f3877g, iResolveSizeAndState2);
        if (z5) {
            iMin |= 16777216;
        }
        if (z6) {
            iMin2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C2454rb c2454rbM2124h = m2124h(view);
        if ((view instanceof C2106jk) && !(c2454rbM2124h instanceof C2150kk)) {
            C1452gb c1452gb = (C1452gb) view.getLayoutParams();
            C2150kk c2150kk = new C2150kk();
            c1452gb.f5137p0 = c2150kk;
            c1452gb.f5113d0 = true;
            c2150kk.m4338S(c1452gb.f5101V);
        }
        if (view instanceof AbstractC1364eb) {
            AbstractC1364eb abstractC1364eb = (AbstractC1364eb) view;
            abstractC1364eb.m2654i();
            ((C1452gb) view.getLayoutParams()).f5115e0 = true;
            ArrayList arrayList = this.f3872b;
            if (!arrayList.contains(abstractC1364eb)) {
                arrayList.add(abstractC1364eb);
            }
        }
        this.f3871a.put(view.getId(), view);
        this.f3878h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f3871a.remove(view.getId());
        C2454rb c2454rbM2124h = m2124h(view);
        this.f3873c.f8774q0.remove(c2454rbM2124h);
        c2454rbM2124h.mo4914C();
        this.f3872b.remove(view);
        this.f3878h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f3878h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C2411qb c2411qb) {
        this.f3880j = c2411qb;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f3871a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f3877g) {
            return;
        }
        this.f3877g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f3876f) {
            return;
        }
        this.f3876f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f3875e) {
            return;
        }
        this.f3875e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f3874d) {
            return;
        }
        this.f3874d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC2540tb abstractC2540tb) {
        C0649P3 c0649p3 = this.f3881k;
        if (c0649p3 != null) {
            c0649p3.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f3879i = i;
        C2497sb c2497sb = this.f3873c;
        c2497sb.f8765D0 = i;
        C2244mo.f7925q = c2497sb.m4984W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3871a = new SparseArray();
        this.f3872b = new ArrayList(4);
        this.f3873c = new C2497sb();
        this.f3874d = 0;
        this.f3875e = 0;
        this.f3876f = Integer.MAX_VALUE;
        this.f3877g = Integer.MAX_VALUE;
        this.f3878h = true;
        this.f3879i = 257;
        this.f3880j = null;
        this.f3881k = null;
        this.f3882l = -1;
        this.f3883m = new HashMap();
        this.f3884n = new SparseArray();
        this.f3885o = new C1496hb(this, this);
        m2125i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1452gb c1452gb = new C1452gb(layoutParams);
        c1452gb.f5106a = -1;
        c1452gb.f5108b = -1;
        c1452gb.f5110c = -1.0f;
        c1452gb.f5112d = true;
        c1452gb.f5114e = -1;
        c1452gb.f5116f = -1;
        c1452gb.f5118g = -1;
        c1452gb.f5120h = -1;
        c1452gb.f5122i = -1;
        c1452gb.f5124j = -1;
        c1452gb.f5126k = -1;
        c1452gb.f5128l = -1;
        c1452gb.f5130m = -1;
        c1452gb.f5132n = -1;
        c1452gb.f5134o = -1;
        c1452gb.f5136p = -1;
        c1452gb.f5138q = 0;
        c1452gb.f5139r = 0.0f;
        c1452gb.f5140s = -1;
        c1452gb.f5141t = -1;
        c1452gb.f5142u = -1;
        c1452gb.f5143v = -1;
        c1452gb.f5144w = Integer.MIN_VALUE;
        c1452gb.f5145x = Integer.MIN_VALUE;
        c1452gb.f5146y = Integer.MIN_VALUE;
        c1452gb.f5147z = Integer.MIN_VALUE;
        c1452gb.f5080A = Integer.MIN_VALUE;
        c1452gb.f5081B = Integer.MIN_VALUE;
        c1452gb.f5082C = Integer.MIN_VALUE;
        c1452gb.f5083D = 0;
        c1452gb.f5084E = 0.5f;
        c1452gb.f5085F = 0.5f;
        c1452gb.f5086G = null;
        c1452gb.f5087H = -1.0f;
        c1452gb.f5088I = -1.0f;
        c1452gb.f5089J = 0;
        c1452gb.f5090K = 0;
        c1452gb.f5091L = 0;
        c1452gb.f5092M = 0;
        c1452gb.f5093N = 0;
        c1452gb.f5094O = 0;
        c1452gb.f5095P = 0;
        c1452gb.f5096Q = 0;
        c1452gb.f5097R = 1.0f;
        c1452gb.f5098S = 1.0f;
        c1452gb.f5099T = -1;
        c1452gb.f5100U = -1;
        c1452gb.f5101V = -1;
        c1452gb.f5102W = false;
        c1452gb.f5103X = false;
        c1452gb.f5104Y = null;
        c1452gb.f5105Z = 0;
        c1452gb.f5107a0 = true;
        c1452gb.f5109b0 = true;
        c1452gb.f5111c0 = false;
        c1452gb.f5113d0 = false;
        c1452gb.f5115e0 = false;
        c1452gb.f5117f0 = -1;
        c1452gb.f5119g0 = -1;
        c1452gb.f5121h0 = -1;
        c1452gb.f5123i0 = -1;
        c1452gb.f5125j0 = Integer.MIN_VALUE;
        c1452gb.f5127k0 = Integer.MIN_VALUE;
        c1452gb.f5129l0 = 0.5f;
        c1452gb.f5137p0 = new C2454rb();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) c1452gb).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c1452gb).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c1452gb).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c1452gb).bottomMargin = marginLayoutParams.bottomMargin;
            c1452gb.setMarginStart(marginLayoutParams.getMarginStart());
            c1452gb.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof C1452gb)) {
            return c1452gb;
        }
        C1452gb c1452gb2 = (C1452gb) layoutParams;
        c1452gb.f5106a = c1452gb2.f5106a;
        c1452gb.f5108b = c1452gb2.f5108b;
        c1452gb.f5110c = c1452gb2.f5110c;
        c1452gb.f5112d = c1452gb2.f5112d;
        c1452gb.f5114e = c1452gb2.f5114e;
        c1452gb.f5116f = c1452gb2.f5116f;
        c1452gb.f5118g = c1452gb2.f5118g;
        c1452gb.f5120h = c1452gb2.f5120h;
        c1452gb.f5122i = c1452gb2.f5122i;
        c1452gb.f5124j = c1452gb2.f5124j;
        c1452gb.f5126k = c1452gb2.f5126k;
        c1452gb.f5128l = c1452gb2.f5128l;
        c1452gb.f5130m = c1452gb2.f5130m;
        c1452gb.f5132n = c1452gb2.f5132n;
        c1452gb.f5134o = c1452gb2.f5134o;
        c1452gb.f5136p = c1452gb2.f5136p;
        c1452gb.f5138q = c1452gb2.f5138q;
        c1452gb.f5139r = c1452gb2.f5139r;
        c1452gb.f5140s = c1452gb2.f5140s;
        c1452gb.f5141t = c1452gb2.f5141t;
        c1452gb.f5142u = c1452gb2.f5142u;
        c1452gb.f5143v = c1452gb2.f5143v;
        c1452gb.f5144w = c1452gb2.f5144w;
        c1452gb.f5145x = c1452gb2.f5145x;
        c1452gb.f5146y = c1452gb2.f5146y;
        c1452gb.f5147z = c1452gb2.f5147z;
        c1452gb.f5080A = c1452gb2.f5080A;
        c1452gb.f5081B = c1452gb2.f5081B;
        c1452gb.f5082C = c1452gb2.f5082C;
        c1452gb.f5083D = c1452gb2.f5083D;
        c1452gb.f5084E = c1452gb2.f5084E;
        c1452gb.f5085F = c1452gb2.f5085F;
        c1452gb.f5086G = c1452gb2.f5086G;
        c1452gb.f5087H = c1452gb2.f5087H;
        c1452gb.f5088I = c1452gb2.f5088I;
        c1452gb.f5089J = c1452gb2.f5089J;
        c1452gb.f5090K = c1452gb2.f5090K;
        c1452gb.f5102W = c1452gb2.f5102W;
        c1452gb.f5103X = c1452gb2.f5103X;
        c1452gb.f5091L = c1452gb2.f5091L;
        c1452gb.f5092M = c1452gb2.f5092M;
        c1452gb.f5093N = c1452gb2.f5093N;
        c1452gb.f5095P = c1452gb2.f5095P;
        c1452gb.f5094O = c1452gb2.f5094O;
        c1452gb.f5096Q = c1452gb2.f5096Q;
        c1452gb.f5097R = c1452gb2.f5097R;
        c1452gb.f5098S = c1452gb2.f5098S;
        c1452gb.f5099T = c1452gb2.f5099T;
        c1452gb.f5100U = c1452gb2.f5100U;
        c1452gb.f5101V = c1452gb2.f5101V;
        c1452gb.f5107a0 = c1452gb2.f5107a0;
        c1452gb.f5109b0 = c1452gb2.f5109b0;
        c1452gb.f5111c0 = c1452gb2.f5111c0;
        c1452gb.f5113d0 = c1452gb2.f5113d0;
        c1452gb.f5117f0 = c1452gb2.f5117f0;
        c1452gb.f5119g0 = c1452gb2.f5119g0;
        c1452gb.f5121h0 = c1452gb2.f5121h0;
        c1452gb.f5123i0 = c1452gb2.f5123i0;
        c1452gb.f5125j0 = c1452gb2.f5125j0;
        c1452gb.f5127k0 = c1452gb2.f5127k0;
        c1452gb.f5129l0 = c1452gb2.f5129l0;
        c1452gb.f5104Y = c1452gb2.f5104Y;
        c1452gb.f5105Z = c1452gb2.f5105Z;
        c1452gb.f5137p0 = c1452gb2.f5137p0;
        return c1452gb;
    }
}
