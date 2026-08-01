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
import p000.AbstractC0014ad;
import p000.AbstractC0517nc;
import p000.AbstractC0554oc;
import p000.AbstractC0947yy;
import p000.C0138d4;
import p000.C0197er;
import p000.C0381jo;
import p000.C0418ko;
import p000.C0591pc;
import p000.C0628qc;
import p000.C0888xc;
import p000.C0925yc;
import p000.C0962zc;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final SparseArray f363a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f364b;

    /* JADX INFO: renamed from: c */
    public final C0962zc f365c;

    /* JADX INFO: renamed from: d */
    public int f366d;

    /* JADX INFO: renamed from: e */
    public int f367e;

    /* JADX INFO: renamed from: f */
    public int f368f;

    /* JADX INFO: renamed from: g */
    public int f369g;

    /* JADX INFO: renamed from: h */
    public boolean f370h;

    /* JADX INFO: renamed from: i */
    public int f371i;

    /* JADX INFO: renamed from: j */
    public C0888xc f372j;

    /* JADX INFO: renamed from: k */
    public C0138d4 f373k;

    /* JADX INFO: renamed from: l */
    public int f374l;

    /* JADX INFO: renamed from: m */
    public HashMap f375m;

    /* JADX INFO: renamed from: n */
    public final SparseArray f376n;

    /* JADX INFO: renamed from: o */
    public final C0628qc f377o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f363a = new SparseArray();
        this.f364b = new ArrayList(4);
        this.f365c = new C0962zc();
        this.f366d = 0;
        this.f367e = 0;
        this.f368f = Integer.MAX_VALUE;
        this.f369g = Integer.MAX_VALUE;
        this.f370h = true;
        this.f371i = 263;
        this.f372j = null;
        this.f373k = null;
        this.f374l = -1;
        this.f375m = new HashMap();
        this.f376n = new SparseArray();
        this.f377o = new C0628qc(this);
        m195c(attributeSet, 0);
    }

    /* JADX INFO: renamed from: a */
    public static C0591pc m193a() {
        C0591pc c0591pc = new C0591pc(-2, -2);
        c0591pc.f3668a = -1;
        c0591pc.f3670b = -1;
        c0591pc.f3672c = -1.0f;
        c0591pc.f3674d = -1;
        c0591pc.f3676e = -1;
        c0591pc.f3678f = -1;
        c0591pc.f3680g = -1;
        c0591pc.f3682h = -1;
        c0591pc.f3684i = -1;
        c0591pc.f3686j = -1;
        c0591pc.f3688k = -1;
        c0591pc.f3690l = -1;
        c0591pc.f3691m = -1;
        c0591pc.f3692n = 0;
        c0591pc.f3693o = 0.0f;
        c0591pc.f3694p = -1;
        c0591pc.f3695q = -1;
        c0591pc.f3696r = -1;
        c0591pc.f3697s = -1;
        c0591pc.f3698t = -1;
        c0591pc.f3699u = -1;
        c0591pc.f3700v = -1;
        c0591pc.f3701w = -1;
        c0591pc.f3702x = -1;
        c0591pc.f3703y = -1;
        c0591pc.f3704z = 0.5f;
        c0591pc.f3642A = 0.5f;
        c0591pc.f3643B = null;
        c0591pc.f3644C = 1;
        c0591pc.f3645D = -1.0f;
        c0591pc.f3646E = -1.0f;
        c0591pc.f3647F = 0;
        c0591pc.f3648G = 0;
        c0591pc.f3649H = 0;
        c0591pc.f3650I = 0;
        c0591pc.f3651J = 0;
        c0591pc.f3652K = 0;
        c0591pc.f3653L = 0;
        c0591pc.f3654M = 0;
        c0591pc.f3655N = 1.0f;
        c0591pc.f3656O = 1.0f;
        c0591pc.f3657P = -1;
        c0591pc.f3658Q = -1;
        c0591pc.f3659R = -1;
        c0591pc.f3660S = false;
        c0591pc.f3661T = false;
        c0591pc.f3662U = null;
        c0591pc.f3663V = true;
        c0591pc.f3664W = true;
        c0591pc.f3665X = false;
        c0591pc.f3666Y = false;
        c0591pc.f3667Z = false;
        c0591pc.f3669a0 = -1;
        c0591pc.f3671b0 = -1;
        c0591pc.f3673c0 = -1;
        c0591pc.f3675d0 = -1;
        c0591pc.f3677e0 = -1;
        c0591pc.f3679f0 = -1;
        c0591pc.f3681g0 = 0.5f;
        c0591pc.f3689k0 = new C0925yc();
        return c0591pc;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* JADX INFO: renamed from: b */
    public final C0925yc m194b(View view) {
        if (view == this) {
            return this.f365c;
        }
        if (view == null) {
            return null;
        }
        return ((C0591pc) view.getLayoutParams()).f3689k0;
    }

    /* JADX INFO: renamed from: c */
    public final void m195c(AttributeSet attributeSet, int i) {
        C0962zc c0962zc = this.f365c;
        c0962zc.f5391U = this;
        C0628qc c0628qc = this.f377o;
        c0962zc.f5568g0 = c0628qc;
        c0962zc.f5567f0.f2719f = c0628qc;
        this.f363a.put(getId(), this);
        this.f372j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0947yy.f5510b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 9) {
                    this.f366d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f366d);
                } else if (index == 10) {
                    this.f367e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f367e);
                } else if (index == 7) {
                    this.f368f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f368f);
                } else if (index == 8) {
                    this.f369g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f369g);
                } else if (index == 89) {
                    this.f371i = typedArrayObtainStyledAttributes.getInt(index, this.f371i);
                } else if (index == 38) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m196d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f373k = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0888xc c0888xc = new C0888xc();
                        this.f372j = c0888xc;
                        c0888xc.m2680e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f372j = null;
                    }
                    this.f374l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i3 = this.f371i;
        c0962zc.f5577p0 = i3;
        C0197er.f1615p = (i3 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0591pc;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c A[Catch: IOException -> 0x0053, XmlPullParserException -> 0x0055, TryCatch #2 {IOException -> 0x0053, XmlPullParserException -> 0x0055, blocks: (B:3:0x0021, B:36:0x00a6, B:10:0x0030, B:11:0x0038, B:34:0x008c, B:13:0x003c, B:15:0x0044, B:17:0x004b, B:22:0x0057, B:25:0x0060, B:28:0x0069, B:30:0x0071, B:31:0x0080, B:33:0x0088, B:35:0x00a3), top: B:42:0x0021 }] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m196d(int r8) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m196d(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f364b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0517nc) arrayList.get(i)).getClass();
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
        this.f370h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m193a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i;
        Context context = getContext();
        C0591pc c0591pc = new C0591pc(context, attributeSet);
        c0591pc.f3668a = -1;
        c0591pc.f3670b = -1;
        c0591pc.f3672c = -1.0f;
        c0591pc.f3674d = -1;
        c0591pc.f3676e = -1;
        c0591pc.f3678f = -1;
        c0591pc.f3680g = -1;
        c0591pc.f3682h = -1;
        c0591pc.f3684i = -1;
        c0591pc.f3686j = -1;
        c0591pc.f3688k = -1;
        c0591pc.f3690l = -1;
        c0591pc.f3691m = -1;
        c0591pc.f3692n = 0;
        c0591pc.f3693o = 0.0f;
        c0591pc.f3694p = -1;
        c0591pc.f3695q = -1;
        c0591pc.f3696r = -1;
        c0591pc.f3697s = -1;
        c0591pc.f3698t = -1;
        c0591pc.f3699u = -1;
        c0591pc.f3700v = -1;
        c0591pc.f3701w = -1;
        c0591pc.f3702x = -1;
        c0591pc.f3703y = -1;
        c0591pc.f3704z = 0.5f;
        c0591pc.f3642A = 0.5f;
        c0591pc.f3643B = null;
        c0591pc.f3644C = 1;
        c0591pc.f3645D = -1.0f;
        c0591pc.f3646E = -1.0f;
        c0591pc.f3647F = 0;
        c0591pc.f3648G = 0;
        c0591pc.f3649H = 0;
        c0591pc.f3650I = 0;
        c0591pc.f3651J = 0;
        c0591pc.f3652K = 0;
        c0591pc.f3653L = 0;
        c0591pc.f3654M = 0;
        c0591pc.f3655N = 1.0f;
        c0591pc.f3656O = 1.0f;
        c0591pc.f3657P = -1;
        c0591pc.f3658Q = -1;
        c0591pc.f3659R = -1;
        c0591pc.f3660S = false;
        c0591pc.f3661T = false;
        c0591pc.f3662U = null;
        c0591pc.f3663V = true;
        c0591pc.f3664W = true;
        c0591pc.f3665X = false;
        c0591pc.f3666Y = false;
        c0591pc.f3667Z = false;
        c0591pc.f3669a0 = -1;
        c0591pc.f3671b0 = -1;
        c0591pc.f3673c0 = -1;
        c0591pc.f3675d0 = -1;
        c0591pc.f3677e0 = -1;
        c0591pc.f3679f0 = -1;
        c0591pc.f3681g0 = 0.5f;
        c0591pc.f3689k0 = new C0925yc();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0947yy.f5510b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = AbstractC0554oc.f3438a.get(index);
            switch (i3) {
                case Base64.NO_PADDING /* 1 */:
                    c0591pc.f3659R = typedArrayObtainStyledAttributes.getInt(index, c0591pc.f3659R);
                    break;
                case Base64.NO_WRAP /* 2 */:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c0591pc.f3691m);
                    c0591pc.f3691m = resourceId;
                    if (resourceId == -1) {
                        c0591pc.f3691m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c0591pc.f3692n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0591pc.f3692n);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, c0591pc.f3693o) % 360.0f;
                    c0591pc.f3693o = f;
                    if (f < 0.0f) {
                        c0591pc.f3693o = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    c0591pc.f3668a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0591pc.f3668a);
                    break;
                case 6:
                    c0591pc.f3670b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0591pc.f3670b);
                    break;
                case 7:
                    c0591pc.f3672c = typedArrayObtainStyledAttributes.getFloat(index, c0591pc.f3672c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c0591pc.f3674d);
                    c0591pc.f3674d = resourceId2;
                    if (resourceId2 == -1) {
                        c0591pc.f3674d = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c0591pc.f3676e);
                    c0591pc.f3676e = resourceId3;
                    if (resourceId3 == -1) {
                        c0591pc.f3676e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c0591pc.f3678f);
                    c0591pc.f3678f = resourceId4;
                    if (resourceId4 == -1) {
                        c0591pc.f3678f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c0591pc.f3680g);
                    c0591pc.f3680g = resourceId5;
                    if (resourceId5 == -1) {
                        c0591pc.f3680g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c0591pc.f3682h);
                    c0591pc.f3682h = resourceId6;
                    if (resourceId6 == -1) {
                        c0591pc.f3682h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c0591pc.f3684i);
                    c0591pc.f3684i = resourceId7;
                    if (resourceId7 == -1) {
                        c0591pc.f3684i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c0591pc.f3686j);
                    c0591pc.f3686j = resourceId8;
                    if (resourceId8 == -1) {
                        c0591pc.f3686j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c0591pc.f3688k);
                    c0591pc.f3688k = resourceId9;
                    if (resourceId9 == -1) {
                        c0591pc.f3688k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c0591pc.f3690l);
                    c0591pc.f3690l = resourceId10;
                    if (resourceId10 == -1) {
                        c0591pc.f3690l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c0591pc.f3694p);
                    c0591pc.f3694p = resourceId11;
                    if (resourceId11 == -1) {
                        c0591pc.f3694p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c0591pc.f3695q);
                    c0591pc.f3695q = resourceId12;
                    if (resourceId12 == -1) {
                        c0591pc.f3695q = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c0591pc.f3696r);
                    c0591pc.f3696r = resourceId13;
                    if (resourceId13 == -1) {
                        c0591pc.f3696r = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c0591pc.f3697s);
                    c0591pc.f3697s = resourceId14;
                    if (resourceId14 == -1) {
                        c0591pc.f3697s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c0591pc.f3698t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0591pc.f3698t);
                    break;
                case 22:
                    c0591pc.f3699u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0591pc.f3699u);
                    break;
                case 23:
                    c0591pc.f3700v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0591pc.f3700v);
                    break;
                case 24:
                    c0591pc.f3701w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0591pc.f3701w);
                    break;
                case 25:
                    c0591pc.f3702x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0591pc.f3702x);
                    break;
                case 26:
                    c0591pc.f3703y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0591pc.f3703y);
                    break;
                case 27:
                    c0591pc.f3660S = typedArrayObtainStyledAttributes.getBoolean(index, c0591pc.f3660S);
                    break;
                case 28:
                    c0591pc.f3661T = typedArrayObtainStyledAttributes.getBoolean(index, c0591pc.f3661T);
                    break;
                case 29:
                    c0591pc.f3704z = typedArrayObtainStyledAttributes.getFloat(index, c0591pc.f3704z);
                    break;
                case 30:
                    c0591pc.f3642A = typedArrayObtainStyledAttributes.getFloat(index, c0591pc.f3642A);
                    break;
                case 31:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0591pc.f3649H = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0591pc.f3650I = i5;
                    if (i5 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c0591pc.f3651J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0591pc.f3651J);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0591pc.f3651J) == -2) {
                            c0591pc.f3651J = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c0591pc.f3653L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0591pc.f3653L);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0591pc.f3653L) == -2) {
                            c0591pc.f3653L = -2;
                        }
                    }
                    break;
                case 35:
                    c0591pc.f3655N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0591pc.f3655N));
                    c0591pc.f3649H = 2;
                    break;
                case 36:
                    try {
                        c0591pc.f3652K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0591pc.f3652K);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0591pc.f3652K) == -2) {
                            c0591pc.f3652K = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c0591pc.f3654M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0591pc.f3654M);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c0591pc.f3654M) == -2) {
                            c0591pc.f3654M = -2;
                        }
                    }
                    break;
                case 38:
                    c0591pc.f3656O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c0591pc.f3656O));
                    c0591pc.f3650I = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c0591pc.f3643B = string;
                            c0591pc.f3644C = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = c0591pc.f3643B.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String strSubstring = c0591pc.f3643B.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        c0591pc.f3644C = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        c0591pc.f3644C = 1;
                                    }
                                    i = iIndexOf + 1;
                                }
                                int iIndexOf2 = c0591pc.f3643B.indexOf(58);
                                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                    String strSubstring2 = c0591pc.f3643B.substring(i);
                                    if (strSubstring2.length() > 0) {
                                        Float.parseFloat(strSubstring2);
                                    }
                                } else {
                                    String strSubstring3 = c0591pc.f3643B.substring(i, iIndexOf2);
                                    String strSubstring4 = c0591pc.f3643B.substring(iIndexOf2 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f2 = Float.parseFloat(strSubstring3);
                                            float f3 = Float.parseFloat(strSubstring4);
                                            if (f2 > 0.0f && f3 > 0.0f) {
                                                if (c0591pc.f3644C == 1) {
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
                            c0591pc.f3645D = typedArrayObtainStyledAttributes.getFloat(index, c0591pc.f3645D);
                            break;
                        case 46:
                            c0591pc.f3646E = typedArrayObtainStyledAttributes.getFloat(index, c0591pc.f3646E);
                            break;
                        case 47:
                            c0591pc.f3647F = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c0591pc.f3648G = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c0591pc.f3657P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0591pc.f3657P);
                            break;
                        case 50:
                            c0591pc.f3658Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0591pc.f3658Q);
                            break;
                        case 51:
                            c0591pc.f3662U = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c0591pc.m2083a();
        return c0591pc;
    }

    public int getMaxHeight() {
        return this.f369g;
    }

    public int getMaxWidth() {
        return this.f368f;
    }

    public int getMinHeight() {
        return this.f367e;
    }

    public int getMinWidth() {
        return this.f366d;
    }

    public int getOptimizationLevel() {
        return this.f365c.f5577p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0591pc c0591pc = (C0591pc) childAt.getLayoutParams();
            C0925yc c0925yc = c0591pc.f3689k0;
            if (childAt.getVisibility() != 8 || c0591pc.f3666Y || c0591pc.f3667Z || zIsInEditMode) {
                int iM2750m = c0925yc.m2750m();
                int iM2751n = c0925yc.m2751n();
                childAt.layout(iM2750m, iM2751n, c0925yc.m2749l() + iM2750m, c0925yc.m2746i() + iM2751n);
            }
        }
        ArrayList arrayList = this.f364b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0517nc) arrayList.get(i6)).getClass();
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
        C0925yc c0925ycM194b = m194b(view);
        if ((view instanceof C0381jo) && !(c0925ycM194b instanceof C0418ko)) {
            C0591pc c0591pc = (C0591pc) view.getLayoutParams();
            C0418ko c0418ko = new C0418ko();
            c0591pc.f3689k0 = c0418ko;
            c0591pc.f3666Y = true;
            c0418ko.m1702B(c0591pc.f3659R);
        }
        if (view instanceof AbstractC0517nc) {
            AbstractC0517nc abstractC0517nc = (AbstractC0517nc) view;
            abstractC0517nc.m1942g();
            ((C0591pc) view.getLayoutParams()).f3667Z = true;
            ArrayList arrayList = this.f364b;
            if (!arrayList.contains(abstractC0517nc)) {
                arrayList.add(abstractC0517nc);
            }
        }
        this.f363a.put(view.getId(), view);
        this.f370h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f363a.remove(view.getId());
        C0925yc c0925ycM194b = m194b(view);
        this.f365c.f5565d0.remove(c0925ycM194b);
        c0925ycM194b.f5379I = null;
        this.f364b.remove(view);
        this.f370h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f370h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0888xc c0888xc) {
        this.f372j = c0888xc;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f363a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f369g) {
            return;
        }
        this.f369g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f368f) {
            return;
        }
        this.f368f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f367e) {
            return;
        }
        this.f367e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f366d) {
            return;
        }
        this.f366d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0014ad abstractC0014ad) {
        C0138d4 c0138d4 = this.f373k;
        if (c0138d4 != null) {
            c0138d4.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f371i = i;
        this.f365c.f5577p0 = i;
        C0197er.f1615p = (i & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f363a = new SparseArray();
        this.f364b = new ArrayList(4);
        this.f365c = new C0962zc();
        this.f366d = 0;
        this.f367e = 0;
        this.f368f = Integer.MAX_VALUE;
        this.f369g = Integer.MAX_VALUE;
        this.f370h = true;
        this.f371i = 263;
        this.f372j = null;
        this.f373k = null;
        this.f374l = -1;
        this.f375m = new HashMap();
        this.f376n = new SparseArray();
        this.f377o = new C0628qc(this);
        m195c(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0591pc c0591pc = new C0591pc(layoutParams);
        c0591pc.f3668a = -1;
        c0591pc.f3670b = -1;
        c0591pc.f3672c = -1.0f;
        c0591pc.f3674d = -1;
        c0591pc.f3676e = -1;
        c0591pc.f3678f = -1;
        c0591pc.f3680g = -1;
        c0591pc.f3682h = -1;
        c0591pc.f3684i = -1;
        c0591pc.f3686j = -1;
        c0591pc.f3688k = -1;
        c0591pc.f3690l = -1;
        c0591pc.f3691m = -1;
        c0591pc.f3692n = 0;
        c0591pc.f3693o = 0.0f;
        c0591pc.f3694p = -1;
        c0591pc.f3695q = -1;
        c0591pc.f3696r = -1;
        c0591pc.f3697s = -1;
        c0591pc.f3698t = -1;
        c0591pc.f3699u = -1;
        c0591pc.f3700v = -1;
        c0591pc.f3701w = -1;
        c0591pc.f3702x = -1;
        c0591pc.f3703y = -1;
        c0591pc.f3704z = 0.5f;
        c0591pc.f3642A = 0.5f;
        c0591pc.f3643B = null;
        c0591pc.f3644C = 1;
        c0591pc.f3645D = -1.0f;
        c0591pc.f3646E = -1.0f;
        c0591pc.f3647F = 0;
        c0591pc.f3648G = 0;
        c0591pc.f3649H = 0;
        c0591pc.f3650I = 0;
        c0591pc.f3651J = 0;
        c0591pc.f3652K = 0;
        c0591pc.f3653L = 0;
        c0591pc.f3654M = 0;
        c0591pc.f3655N = 1.0f;
        c0591pc.f3656O = 1.0f;
        c0591pc.f3657P = -1;
        c0591pc.f3658Q = -1;
        c0591pc.f3659R = -1;
        c0591pc.f3660S = false;
        c0591pc.f3661T = false;
        c0591pc.f3662U = null;
        c0591pc.f3663V = true;
        c0591pc.f3664W = true;
        c0591pc.f3665X = false;
        c0591pc.f3666Y = false;
        c0591pc.f3667Z = false;
        c0591pc.f3669a0 = -1;
        c0591pc.f3671b0 = -1;
        c0591pc.f3673c0 = -1;
        c0591pc.f3675d0 = -1;
        c0591pc.f3677e0 = -1;
        c0591pc.f3679f0 = -1;
        c0591pc.f3681g0 = 0.5f;
        c0591pc.f3689k0 = new C0925yc();
        return c0591pc;
    }
}
