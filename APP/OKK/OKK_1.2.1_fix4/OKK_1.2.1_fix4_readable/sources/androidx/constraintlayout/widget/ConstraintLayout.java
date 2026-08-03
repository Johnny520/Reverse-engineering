package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p000A.C0002c;
import p018J0.C0234d;
import p069m.C0985e;
import p071n.AbstractC1004i;
import p071n.C0999d;
import p071n.C1000e;
import p071n.C1002g;
import p071n.C1003h;
import p073o.AbstractC1024m;
import p073o.C1014c;
import p073o.C1016e;
import p073o.C1018g;
import p073o.C1019h;
import p073o.C1021j;
import p073o.C1023l;
import p075p.AbstractC1037c;
import p075p.AbstractC1038d;
import p075p.AbstractC1049o;
import p075p.AbstractC1052r;
import p075p.C1039e;
import p075p.C1040f;
import p075p.C1041g;
import p075p.C1042h;
import p075p.C1048n;
import p075p.C1050p;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final SparseArray f1258a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1259b;

    /* JADX INFO: renamed from: c */
    public final C1000e f1260c;

    /* JADX INFO: renamed from: d */
    public int f1261d;

    /* JADX INFO: renamed from: e */
    public int f1262e;

    /* JADX INFO: renamed from: f */
    public int f1263f;

    /* JADX INFO: renamed from: g */
    public int f1264g;

    /* JADX INFO: renamed from: h */
    public boolean f1265h;

    /* JADX INFO: renamed from: i */
    public int f1266i;

    /* JADX INFO: renamed from: j */
    public C1048n f1267j;

    /* JADX INFO: renamed from: k */
    public C0002c f1268k;

    /* JADX INFO: renamed from: l */
    public int f1269l;

    /* JADX INFO: renamed from: m */
    public HashMap f1270m;

    /* JADX INFO: renamed from: n */
    public final SparseArray f1271n;

    /* JADX INFO: renamed from: o */
    public final C1040f f1272o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1258a = new SparseArray();
        this.f1259b = new ArrayList(4);
        this.f1260c = new C1000e();
        this.f1261d = 0;
        this.f1262e = 0;
        this.f1263f = Integer.MAX_VALUE;
        this.f1264g = Integer.MAX_VALUE;
        this.f1265h = true;
        this.f1266i = 263;
        this.f1267j = null;
        this.f1268k = null;
        this.f1269l = -1;
        this.f1270m = new HashMap();
        this.f1271n = new SparseArray();
        this.f1272o = new C1040f(this);
        m1160c(attributeSet, 0);
    }

    /* JADX INFO: renamed from: a */
    public static C1039e m1158a() {
        C1039e c1039e = new C1039e(-2, -2);
        c1039e.f3903a = -1;
        c1039e.f3905b = -1;
        c1039e.f3907c = -1.0f;
        c1039e.f3909d = -1;
        c1039e.f3911e = -1;
        c1039e.f3913f = -1;
        c1039e.f3915g = -1;
        c1039e.f3917h = -1;
        c1039e.f3919i = -1;
        c1039e.f3921j = -1;
        c1039e.f3923k = -1;
        c1039e.f3925l = -1;
        c1039e.f3926m = -1;
        c1039e.f3927n = 0;
        c1039e.f3928o = 0.0f;
        c1039e.f3929p = -1;
        c1039e.f3930q = -1;
        c1039e.f3931r = -1;
        c1039e.f3932s = -1;
        c1039e.f3933t = -1;
        c1039e.f3934u = -1;
        c1039e.f3935v = -1;
        c1039e.f3936w = -1;
        c1039e.f3937x = -1;
        c1039e.f3938y = -1;
        c1039e.f3939z = 0.5f;
        c1039e.f3877A = 0.5f;
        c1039e.f3878B = null;
        c1039e.f3879C = 1;
        c1039e.f3880D = -1.0f;
        c1039e.f3881E = -1.0f;
        c1039e.f3882F = 0;
        c1039e.f3883G = 0;
        c1039e.f3884H = 0;
        c1039e.f3885I = 0;
        c1039e.f3886J = 0;
        c1039e.f3887K = 0;
        c1039e.f3888L = 0;
        c1039e.f3889M = 0;
        c1039e.f3890N = 1.0f;
        c1039e.f3891O = 1.0f;
        c1039e.f3892P = -1;
        c1039e.f3893Q = -1;
        c1039e.f3894R = -1;
        c1039e.f3895S = false;
        c1039e.f3896T = false;
        c1039e.f3897U = null;
        c1039e.f3898V = true;
        c1039e.f3899W = true;
        c1039e.f3900X = false;
        c1039e.f3901Y = false;
        c1039e.f3902Z = false;
        c1039e.f3904a0 = -1;
        c1039e.f3906b0 = -1;
        c1039e.f3908c0 = -1;
        c1039e.f3910d0 = -1;
        c1039e.f3912e0 = -1;
        c1039e.f3914f0 = -1;
        c1039e.f3916g0 = 0.5f;
        c1039e.f3924k0 = new C0999d();
        return c1039e;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* JADX INFO: renamed from: b */
    public final C0999d m1159b(View view) {
        if (view == this) {
            return this.f1260c;
        }
        if (view == null) {
            return null;
        }
        return ((C1039e) view.getLayoutParams()).f3924k0;
    }

    /* JADX INFO: renamed from: c */
    public final void m1160c(AttributeSet attributeSet, int i2) {
        C1000e c1000e = this.f1260c;
        c1000e.f3604U = this;
        C1040f c1040f = this.f1272o;
        c1000e.f3642g0 = c1040f;
        c1000e.f3641f0.f3741f = c1040f;
        this.f1258a.put(getId(), this);
        this.f1267j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1052r.f4051b, i2, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.f1261d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1261d);
                } else if (index == 10) {
                    this.f1262e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1262e);
                } else if (index == 7) {
                    this.f1263f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1263f);
                } else if (index == 8) {
                    this.f1264g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1264g);
                } else if (index == 89) {
                    this.f1266i = typedArrayObtainStyledAttributes.getInt(index, this.f1266i);
                } else if (index == 38) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m1161d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1268k = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1048n c1048n = new C1048n();
                        this.f1267j = c1048n;
                        c1048n.m2530e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1267j = null;
                    }
                    this.f1269l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i4 = this.f1266i;
        c1000e.f3651p0 = i4;
        C0985e.f3485p = (i4 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1039e;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1161d(int i2) {
        byte b2;
        Context context = getContext();
        C0002c c0002c = new C0002c(10);
        c0002c.f7b = new SparseArray();
        c0002c.f8c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            C1041g c1041g = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            b2 = name.equals("ConstraintSet") ? (byte) 4 : (byte) -1;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b2 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b2 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b2 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b2 = 3;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    if (b2 != 0 && b2 != 1) {
                        if (b2 == 2) {
                            c1041g = new C1041g(context, xml);
                            ((SparseArray) c0002c.f7b).put(c1041g.f3947a, c1041g);
                        } else if (b2 == 3) {
                            C1042h c1042h = new C1042h(context, xml);
                            if (c1041g != null) {
                                c1041g.f3948b.add(c1042h);
                            }
                        } else if (b2 == 4) {
                            c0002c.m10k(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
        this.f1268k = c0002c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1259b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC1037c) arrayList.get(i2)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i4 = Integer.parseInt(strArrSplit[0]);
                        int i5 = Integer.parseInt(strArrSplit[1]);
                        int i6 = Integer.parseInt(strArrSplit[2]);
                        int i7 = (int) ((i4 / 1080.0f) * width);
                        int i8 = (int) ((i5 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i7;
                        float f3 = i8;
                        float f4 = i7 + ((int) ((i6 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float f5 = i8 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, f5, paint);
                        canvas.drawLine(f4, f5, f2, f5, paint);
                        canvas.drawLine(f2, f5, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, f5, paint);
                        canvas.drawLine(f2, f5, f4, f3, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0335  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1162e(C1000e c1000e, int i2, int i3, int i4) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i5;
        int i6;
        C0234d c0234d;
        C1040f c1040f;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean zM2424D;
        C0234d c0234d2;
        int i11;
        C1000e c1000e2;
        boolean z2;
        ArrayList arrayList;
        int i12;
        C1040f c1040f2;
        int i13;
        C1040f c1040f3;
        boolean z3;
        C0234d c0234d3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr;
        int i20;
        int i21;
        boolean z4;
        boolean z5;
        C1000e c1000e3 = c1000e;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i22 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C1040f c1040f4 = this.f1272o;
        c1040f4.f3941b = iMax3;
        c1040f4.f3942c = iMax4;
        c1040f4.f3943d = paddingWidth;
        c1040f4.f3944e = i22;
        c1040f4.f3945f = i3;
        c1040f4.f3946g = i4;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i23 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i24 = size - paddingWidth;
        int i25 = size2 - i22;
        int i26 = c1040f4.f3944e;
        int i27 = c1040f4.f3943d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    iMin = 0;
                } else {
                    iMin = Math.min(this.f1263f - i27, i24);
                    i23 = 1;
                }
            } else if (childCount == 0) {
                iMax = Math.max(0, this.f1261d);
                iMin = iMax;
                i23 = 2;
            } else {
                iMin = 0;
                i23 = 2;
            }
        } else if (childCount == 0) {
            iMax = Math.max(0, this.f1261d);
            iMin = iMax;
            i23 = 2;
        } else {
            iMin = i24;
            i23 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.f1264g - i26, i25);
                i5 = 1;
            } else if (childCount == 0) {
                iMax2 = Math.max(0, this.f1262e);
                iMin2 = iMax2;
                i5 = 2;
            } else {
                iMin2 = 0;
                i5 = 2;
            }
        } else if (childCount == 0) {
            iMax2 = Math.max(0, this.f1262e);
            iMin2 = iMax2;
            i5 = 2;
        } else {
            iMin2 = i25;
            i5 = 2;
        }
        int iM2407l = c1000e.m2407l();
        C1016e c1016e = c1000e3.f3641f0;
        int i28 = iMin;
        if (i28 != iM2407l || iMin2 != c1000e.m2404i()) {
            c1016e.f3738c = true;
        }
        c1000e3.f3597N = 0;
        c1000e3.f3598O = 0;
        int i29 = this.f1263f - i27;
        int[] iArr2 = c1000e3.f3633u;
        iArr2[0] = i29;
        iArr2[1] = this.f1264g - i26;
        c1000e3.f3600Q = 0;
        c1000e3.f3601R = 0;
        c1000e3.m2418w(i23);
        c1000e3.m2420y(i28);
        c1000e3.m2419x(i5);
        c1000e3.m2417v(iMin2);
        int i30 = this.f1261d - i27;
        if (i30 < 0) {
            c1000e3.f3600Q = 0;
        } else {
            c1000e3.f3600Q = i30;
        }
        int i31 = this.f1262e - i26;
        if (i31 < 0) {
            c1000e3.f3601R = 0;
        } else {
            c1000e3.f3601R = i31;
        }
        c1000e3.f3645j0 = iMax5;
        c1000e3.f3646k0 = iMax3;
        C0234d c0234d4 = c1000e3.f3640e0;
        c0234d4.getClass();
        C1040f c1040f5 = c1000e3.f3642g0;
        int size3 = c1000e3.f3639d0.size();
        int iM2407l2 = c1000e.m2407l();
        int iM2404i = c1000e.m2404i();
        boolean z6 = (i2 & 128) == 128;
        boolean z7 = z6 || (i2 & 64) == 64;
        if (z7) {
            for (int i32 = 0; i32 < size3; i32++) {
                C0999d c0999d = (C0999d) c1000e3.f3639d0.get(i32);
                int[] iArr3 = c0999d.f3615c0;
                boolean z8 = (iArr3[0] == 3) && (iArr3[1] == 3) && c0999d.f3595L > 0.0f;
                if ((c0999d.m2412q() && z8) || ((c0999d.m2413r() && z8) || (c0999d instanceof C1002g) || c0999d.m2412q() || c0999d.m2413r())) {
                    i6 = 1073741824;
                    z7 = false;
                    break;
                }
            }
            i6 = 1073741824;
        } else {
            i6 = 1073741824;
        }
        if (((mode == i6 && mode2 == i6) || z6) && z7) {
            int iMin3 = Math.min(iArr2[0], i24);
            int iMin4 = Math.min(iArr2[1], i25);
            if (mode == 1073741824 && c1000e.m2407l() != iMin3) {
                c1000e3.m2420y(iMin3);
                c1000e3.f3641f0.f3737b = true;
            }
            if (mode2 == 1073741824 && c1000e.m2404i() != iMin4) {
                c1000e3.m2417v(iMin4);
                c1000e3.f3641f0.f3737b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z9 = c1016e.f3737b;
                C1000e c1000e4 = c1016e.f3736a;
                if (z9 || c1016e.f3738c) {
                    for (C0999d c0999d2 : c1000e4.f3639d0) {
                        c0999d2.f3610a = false;
                        c0999d2.f3616d.m2466n();
                        c0999d2.f3617e.m2469m();
                    }
                    i17 = 0;
                    c1000e4.f3610a = false;
                    c1000e4.f3616d.m2466n();
                    c1000e4.f3617e.m2469m();
                    c1016e.f3738c = false;
                } else {
                    i17 = 0;
                }
                c1016e.m2454b(c1016e.f3739d);
                c1000e4.f3597N = i17;
                c1000e4.f3598O = i17;
                int iM2403h = c1000e4.m2403h(i17);
                int iM2403h2 = c1000e4.m2403h(1);
                if (c1016e.f3737b) {
                    c1016e.m2455c();
                }
                int iM2408m = c1000e4.m2408m();
                int iM2409n = c1000e4.m2409n();
                C1021j c1021j = c1000e4.f3616d;
                c1040f = c1040f5;
                c1021j.f3769h.mo2462d(iM2408m);
                C1023l c1023l = c1000e4.f3617e;
                i8 = iM2407l2;
                c1023l.f3769h.mo2462d(iM2409n);
                c1016e.m2459g();
                ArrayList<AbstractC1024m> arrayList2 = c1016e.f3740e;
                i9 = iM2404i;
                C1018g c1018g = c1021j.f3766e;
                c0234d = c0234d4;
                C1018g c1018g2 = c1023l.f3766e;
                i7 = size3;
                if (iM2403h == 2 || iM2403h2 == 2) {
                    if (z6) {
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!((AbstractC1024m) it.next()).mo2450k()) {
                                    z6 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (z6 && iM2403h == 2) {
                        c1000e4.m2418w(1);
                        i18 = mode2;
                        c1000e4.m2420y(c1016e.m2456d(c1000e4, 0));
                        c1018g.mo2462d(c1000e4.m2407l());
                    } else {
                        i18 = mode2;
                    }
                    if (z6 && iM2403h2 == 2) {
                        i19 = 1;
                        c1000e4.m2419x(1);
                        c1000e4.m2417v(c1016e.m2456d(c1000e4, 1));
                        c1018g2.mo2462d(c1000e4.m2404i());
                    }
                    iArr = c1000e4.f3615c0;
                    i20 = iArr[0];
                    if (i20 != i19 || i20 == 4) {
                        int iM2407l3 = c1000e4.m2407l() + iM2408m;
                        c1021j.f3770i.mo2462d(iM2407l3);
                        c1018g.mo2462d(iM2407l3 - iM2408m);
                        c1016e.m2459g();
                        i21 = iArr[1];
                        if (i21 != 1 || i21 == 4) {
                            int iM2404i2 = c1000e4.m2404i() + iM2409n;
                            c1023l.f3770i.mo2462d(iM2404i2);
                            c1018g2.mo2462d(iM2404i2 - iM2409n);
                        }
                        c1016e.m2459g();
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    for (AbstractC1024m abstractC1024m : arrayList2) {
                        if (abstractC1024m.f3763b != c1000e4 || abstractC1024m.f3768g) {
                            abstractC1024m.mo2447e();
                        }
                    }
                    for (AbstractC1024m abstractC1024m2 : arrayList2) {
                        if (z4 || abstractC1024m2.f3763b != c1000e4) {
                            if (!abstractC1024m2.f3769h.f3753j || ((!abstractC1024m2.f3770i.f3753j && !(abstractC1024m2 instanceof C1019h)) || (!abstractC1024m2.f3766e.f3753j && !(abstractC1024m2 instanceof C1014c) && !(abstractC1024m2 instanceof C1019h)))) {
                                z5 = false;
                                break;
                            }
                        }
                    }
                    z5 = true;
                    c1000e4.m2418w(iM2403h);
                    c1000e4.m2419x(iM2403h2);
                    c1000e3 = c1000e;
                    zM2424D = z5;
                    i16 = i18;
                    i15 = 1073741824;
                    i10 = 2;
                } else {
                    i18 = mode2;
                }
                i19 = 1;
                iArr = c1000e4.f3615c0;
                i20 = iArr[0];
                if (i20 != i19) {
                    int iM2407l32 = c1000e4.m2407l() + iM2408m;
                    c1021j.f3770i.mo2462d(iM2407l32);
                    c1018g.mo2462d(iM2407l32 - iM2408m);
                    c1016e.m2459g();
                    i21 = iArr[1];
                    if (i21 != 1) {
                        int iM2404i22 = c1000e4.m2404i() + iM2409n;
                        c1023l.f3770i.mo2462d(iM2404i22);
                        c1018g2.mo2462d(iM2404i22 - iM2409n);
                        c1016e.m2459g();
                        z4 = true;
                        while (r1.hasNext()) {
                        }
                        while (r1.hasNext()) {
                        }
                        z5 = true;
                        c1000e4.m2418w(iM2403h);
                        c1000e4.m2419x(iM2403h2);
                        c1000e3 = c1000e;
                        zM2424D = z5;
                        i16 = i18;
                        i15 = 1073741824;
                        i10 = 2;
                    }
                }
            } else {
                c0234d = c0234d4;
                c1040f = c1040f5;
                i7 = size3;
                i8 = iM2407l2;
                i9 = iM2404i;
                boolean z10 = c1016e.f3737b;
                C1000e c1000e5 = c1016e.f3736a;
                if (z10) {
                    for (C0999d c0999d3 : c1000e5.f3639d0) {
                        c0999d3.f3610a = false;
                        C1021j c1021j2 = c0999d3.f3616d;
                        c1021j2.f3766e.f3753j = false;
                        c1021j2.f3768g = false;
                        c1021j2.m2466n();
                        C1023l c1023l2 = c0999d3.f3617e;
                        c1023l2.f3766e.f3753j = false;
                        c1023l2.f3768g = false;
                        c1023l2.m2469m();
                    }
                    i14 = 0;
                    c1000e5.f3610a = false;
                    C1021j c1021j3 = c1000e5.f3616d;
                    c1021j3.f3766e.f3753j = false;
                    c1021j3.f3768g = false;
                    c1021j3.m2466n();
                    C1023l c1023l3 = c1000e5.f3617e;
                    c1023l3.f3766e.f3753j = false;
                    c1023l3.f3768g = false;
                    c1023l3.m2469m();
                    c1016e.m2455c();
                } else {
                    i14 = 0;
                }
                c1016e.m2454b(c1016e.f3739d);
                c1000e5.f3597N = i14;
                c1000e5.f3598O = i14;
                c1000e5.f3616d.f3769h.mo2462d(i14);
                c1000e5.f3617e.f3769h.mo2462d(i14);
                i15 = 1073741824;
                c1000e3 = c1000e;
                if (mode == 1073741824) {
                    zM2424D = c1000e3.m2424D(i14, z6);
                    i16 = mode2;
                    i10 = 1;
                } else {
                    i16 = mode2;
                    i10 = 0;
                    zM2424D = true;
                }
                if (i16 == 1073741824) {
                    zM2424D &= c1000e3.m2424D(1, z6);
                    i10++;
                }
            }
            if (zM2424D) {
                c1000e3.mo2421z(mode == i15, i16 == i15);
            }
        } else {
            c0234d = c0234d4;
            c1040f = c1040f5;
            i7 = size3;
            i8 = iM2407l2;
            i9 = iM2404i;
            i10 = 0;
            zM2424D = false;
        }
        if (zM2424D && i10 == 2) {
            return;
        }
        if (i7 > 0) {
            int size4 = c1000e3.f3639d0.size();
            C1040f c1040f6 = c1000e3.f3642g0;
            int i33 = 0;
            while (i33 < size4) {
                C0999d c0999d4 = (C0999d) c1000e3.f3639d0.get(i33);
                if ((c0999d4 instanceof C1003h) || (c0999d4.f3616d.f3766e.f3753j && c0999d4.f3617e.f3766e.f3753j)) {
                    c0234d3 = c0234d;
                } else {
                    int iM2403h3 = c0999d4.m2403h(0);
                    int iM2403h4 = c0999d4.m2403h(1);
                    if (iM2403h3 != 3 || c0999d4.f3622j == 1 || iM2403h4 != 3 || c0999d4.f3623k == 1) {
                        c0234d3 = c0234d;
                        c0234d3.m655r(c1040f6, c0999d4, false);
                    } else {
                        c0234d3 = c0234d;
                    }
                }
                i33++;
                c0234d = c0234d3;
            }
            c0234d2 = c0234d;
            ConstraintLayout constraintLayout = c1040f6.f3940a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i34 = 0; i34 < childCount2; i34++) {
                constraintLayout.getChildAt(i34);
            }
            ArrayList arrayList3 = constraintLayout.f1259b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i35 = 0; i35 < size5; i35++) {
                    ((AbstractC1037c) arrayList3.get(i35)).getClass();
                }
            }
        } else {
            c0234d2 = c0234d;
        }
        int i36 = c1000e3.f3651p0;
        ArrayList arrayList4 = (ArrayList) c0234d2.f474b;
        int size6 = arrayList4.size();
        int i37 = i8;
        int i38 = i9;
        if (i7 > 0) {
            c0234d2.m659w(c1000e3, i37, i38);
        }
        if (size6 > 0) {
            int[] iArr4 = c1000e3.f3615c0;
            boolean z11 = iArr4[0] == 2;
            boolean z12 = iArr4[1] == 2;
            int iM2407l4 = c1000e.m2407l();
            C1000e c1000e6 = (C1000e) c0234d2.f476d;
            int iMax7 = Math.max(iM2407l4, c1000e6.f3600Q);
            int iMax8 = Math.max(c1000e.m2404i(), c1000e6.f3601R);
            int i39 = 0;
            boolean zM655r = false;
            while (i39 < size6) {
                C0999d c0999d5 = (C0999d) arrayList4.get(i39);
                if (c0999d5 instanceof C1002g) {
                    int iM2407l5 = c0999d5.m2407l();
                    int iM2404i3 = c0999d5.m2404i();
                    i13 = i36;
                    c1040f3 = c1040f;
                    boolean zM655r2 = zM655r | c0234d2.m655r(c1040f3, c0999d5, true);
                    int iM2407l6 = c0999d5.m2407l();
                    int iM2404i4 = c0999d5.m2404i();
                    if (iM2407l6 != iM2407l5) {
                        c0999d5.m2420y(iM2407l6);
                        if (z11 && c0999d5.m2408m() + c0999d5.f3593J > iMax7) {
                            iMax7 = Math.max(iMax7, c0999d5.mo2402g(4).m2390c() + c0999d5.m2408m() + c0999d5.f3593J);
                        }
                        z3 = true;
                    } else {
                        z3 = zM655r2;
                    }
                    if (iM2404i4 != iM2404i3) {
                        c0999d5.m2417v(iM2404i4);
                        if (z12 && c0999d5.m2409n() + c0999d5.f3594K > iMax8) {
                            iMax8 = Math.max(iMax8, c0999d5.mo2402g(5).m2390c() + c0999d5.m2409n() + c0999d5.f3594K);
                        }
                        z3 = true;
                    }
                    zM655r = ((C1002g) c0999d5).f3693l0 | z3;
                } else {
                    i13 = i36;
                    c1040f3 = c1040f;
                }
                i39++;
                c1040f = c1040f3;
                i36 = i13;
            }
            i11 = i36;
            C1040f c1040f7 = c1040f;
            int i40 = 0;
            for (int i41 = 2; i40 < i41; i41 = 2) {
                int i42 = 0;
                while (i42 < size6) {
                    C0999d c0999d6 = (C0999d) arrayList4.get(i42);
                    if (((c0999d6 instanceof AbstractC1004i) && !(c0999d6 instanceof C1002g)) || (c0999d6 instanceof C1003h) || c0999d6.f3605V == 8 || ((c0999d6.f3616d.f3766e.f3753j && c0999d6.f3617e.f3766e.f3753j) || (c0999d6 instanceof C1002g))) {
                        c1040f2 = c1040f7;
                        arrayList = arrayList4;
                        i12 = size6;
                    } else {
                        int iM2407l7 = c0999d6.m2407l();
                        int iM2404i5 = c0999d6.m2404i();
                        arrayList = arrayList4;
                        int i43 = c0999d6.f3599P;
                        i12 = size6;
                        zM655r |= c0234d2.m655r(c1040f7, c0999d6, true);
                        int iM2407l8 = c0999d6.m2407l();
                        c1040f2 = c1040f7;
                        int iM2404i6 = c0999d6.m2404i();
                        if (iM2407l8 != iM2407l7) {
                            c0999d6.m2420y(iM2407l8);
                            if (z11 && c0999d6.m2408m() + c0999d6.f3593J > iMax7) {
                                iMax7 = Math.max(iMax7, c0999d6.mo2402g(4).m2390c() + c0999d6.m2408m() + c0999d6.f3593J);
                            }
                            zM655r = true;
                        }
                        if (iM2404i6 != iM2404i5) {
                            c0999d6.m2417v(iM2404i6);
                            if (z12 && c0999d6.m2409n() + c0999d6.f3594K > iMax8) {
                                iMax8 = Math.max(iMax8, c0999d6.mo2402g(5).m2390c() + c0999d6.m2409n() + c0999d6.f3594K);
                            }
                            zM655r = true;
                        }
                        if (c0999d6.f3635w && i43 != c0999d6.f3599P) {
                            zM655r = true;
                        }
                    }
                    i42++;
                    arrayList4 = arrayList;
                    size6 = i12;
                    c1040f7 = c1040f2;
                }
                C1040f c1040f8 = c1040f7;
                ArrayList arrayList5 = arrayList4;
                int i44 = size6;
                if (zM655r) {
                    c0234d2.m659w(c1000e, i37, i38);
                    zM655r = false;
                }
                i40++;
                c1040f7 = c1040f8;
                arrayList4 = arrayList5;
                size6 = i44;
            }
            c1000e2 = c1000e;
            if (zM655r) {
                c0234d2.m659w(c1000e2, i37, i38);
                if (c1000e.m2407l() < iMax7) {
                    c1000e2.m2420y(iMax7);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c1000e.m2404i() < iMax8) {
                    c1000e2.m2417v(iMax8);
                    z2 = true;
                }
                if (z2) {
                    c0234d2.m659w(c1000e2, i37, i38);
                }
            }
        } else {
            i11 = i36;
            c1000e2 = c1000e3;
        }
        int i45 = i11;
        c1000e2.f3651p0 = i45;
        C0985e.f3485p = (i45 & 256) == 256;
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1265h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1158a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i2;
        Context context = getContext();
        C1039e c1039e = new C1039e(context, attributeSet);
        c1039e.f3903a = -1;
        c1039e.f3905b = -1;
        c1039e.f3907c = -1.0f;
        c1039e.f3909d = -1;
        c1039e.f3911e = -1;
        c1039e.f3913f = -1;
        c1039e.f3915g = -1;
        c1039e.f3917h = -1;
        c1039e.f3919i = -1;
        c1039e.f3921j = -1;
        c1039e.f3923k = -1;
        c1039e.f3925l = -1;
        c1039e.f3926m = -1;
        c1039e.f3927n = 0;
        c1039e.f3928o = 0.0f;
        c1039e.f3929p = -1;
        c1039e.f3930q = -1;
        c1039e.f3931r = -1;
        c1039e.f3932s = -1;
        c1039e.f3933t = -1;
        c1039e.f3934u = -1;
        c1039e.f3935v = -1;
        c1039e.f3936w = -1;
        c1039e.f3937x = -1;
        c1039e.f3938y = -1;
        c1039e.f3939z = 0.5f;
        c1039e.f3877A = 0.5f;
        c1039e.f3878B = null;
        c1039e.f3879C = 1;
        c1039e.f3880D = -1.0f;
        c1039e.f3881E = -1.0f;
        c1039e.f3882F = 0;
        c1039e.f3883G = 0;
        c1039e.f3884H = 0;
        c1039e.f3885I = 0;
        c1039e.f3886J = 0;
        c1039e.f3887K = 0;
        c1039e.f3888L = 0;
        c1039e.f3889M = 0;
        c1039e.f3890N = 1.0f;
        c1039e.f3891O = 1.0f;
        c1039e.f3892P = -1;
        c1039e.f3893Q = -1;
        c1039e.f3894R = -1;
        c1039e.f3895S = false;
        c1039e.f3896T = false;
        c1039e.f3897U = null;
        c1039e.f3898V = true;
        c1039e.f3899W = true;
        c1039e.f3900X = false;
        c1039e.f3901Y = false;
        c1039e.f3902Z = false;
        c1039e.f3904a0 = -1;
        c1039e.f3906b0 = -1;
        c1039e.f3908c0 = -1;
        c1039e.f3910d0 = -1;
        c1039e.f3912e0 = -1;
        c1039e.f3914f0 = -1;
        c1039e.f3916g0 = 0.5f;
        c1039e.f3924k0 = new C0999d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1052r.f4051b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            int i4 = AbstractC1038d.f3876a.get(index);
            switch (i4) {
                case 1:
                    c1039e.f3894R = typedArrayObtainStyledAttributes.getInt(index, c1039e.f3894R);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1039e.f3926m);
                    c1039e.f3926m = resourceId;
                    if (resourceId == -1) {
                        c1039e.f3926m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c1039e.f3927n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1039e.f3927n);
                    break;
                case 4:
                    float f2 = typedArrayObtainStyledAttributes.getFloat(index, c1039e.f3928o) % 360.0f;
                    c1039e.f3928o = f2;
                    if (f2 < 0.0f) {
                        c1039e.f3928o = (360.0f - f2) % 360.0f;
                    }
                    break;
                case 5:
                    c1039e.f3903a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1039e.f3903a);
                    break;
                case 6:
                    c1039e.f3905b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1039e.f3905b);
                    break;
                case 7:
                    c1039e.f3907c = typedArrayObtainStyledAttributes.getFloat(index, c1039e.f3907c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c1039e.f3909d);
                    c1039e.f3909d = resourceId2;
                    if (resourceId2 == -1) {
                        c1039e.f3909d = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c1039e.f3911e);
                    c1039e.f3911e = resourceId3;
                    if (resourceId3 == -1) {
                        c1039e.f3911e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c1039e.f3913f);
                    c1039e.f3913f = resourceId4;
                    if (resourceId4 == -1) {
                        c1039e.f3913f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c1039e.f3915g);
                    c1039e.f3915g = resourceId5;
                    if (resourceId5 == -1) {
                        c1039e.f3915g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c1039e.f3917h);
                    c1039e.f3917h = resourceId6;
                    if (resourceId6 == -1) {
                        c1039e.f3917h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c1039e.f3919i);
                    c1039e.f3919i = resourceId7;
                    if (resourceId7 == -1) {
                        c1039e.f3919i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c1039e.f3921j);
                    c1039e.f3921j = resourceId8;
                    if (resourceId8 == -1) {
                        c1039e.f3921j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c1039e.f3923k);
                    c1039e.f3923k = resourceId9;
                    if (resourceId9 == -1) {
                        c1039e.f3923k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c1039e.f3925l);
                    c1039e.f3925l = resourceId10;
                    if (resourceId10 == -1) {
                        c1039e.f3925l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c1039e.f3929p);
                    c1039e.f3929p = resourceId11;
                    if (resourceId11 == -1) {
                        c1039e.f3929p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c1039e.f3930q);
                    c1039e.f3930q = resourceId12;
                    if (resourceId12 == -1) {
                        c1039e.f3930q = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c1039e.f3931r);
                    c1039e.f3931r = resourceId13;
                    if (resourceId13 == -1) {
                        c1039e.f3931r = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c1039e.f3932s);
                    c1039e.f3932s = resourceId14;
                    if (resourceId14 == -1) {
                        c1039e.f3932s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c1039e.f3933t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1039e.f3933t);
                    break;
                case 22:
                    c1039e.f3934u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1039e.f3934u);
                    break;
                case 23:
                    c1039e.f3935v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1039e.f3935v);
                    break;
                case 24:
                    c1039e.f3936w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1039e.f3936w);
                    break;
                case 25:
                    c1039e.f3937x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1039e.f3937x);
                    break;
                case 26:
                    c1039e.f3938y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1039e.f3938y);
                    break;
                case 27:
                    c1039e.f3895S = typedArrayObtainStyledAttributes.getBoolean(index, c1039e.f3895S);
                    break;
                case 28:
                    c1039e.f3896T = typedArrayObtainStyledAttributes.getBoolean(index, c1039e.f3896T);
                    break;
                case 29:
                    c1039e.f3939z = typedArrayObtainStyledAttributes.getFloat(index, c1039e.f3939z);
                    break;
                case 30:
                    c1039e.f3877A = typedArrayObtainStyledAttributes.getFloat(index, c1039e.f3877A);
                    break;
                case 31:
                    c1039e.f3884H = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    c1039e.f3885I = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        c1039e.f3886J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1039e.f3886J);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1039e.f3886J) == -2) {
                            c1039e.f3886J = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c1039e.f3888L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1039e.f3888L);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1039e.f3888L) == -2) {
                            c1039e.f3888L = -2;
                        }
                    }
                    break;
                case 35:
                    c1039e.f3890N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1039e.f3890N));
                    c1039e.f3884H = 2;
                    break;
                case 36:
                    try {
                        c1039e.f3887K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1039e.f3887K);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1039e.f3887K) == -2) {
                            c1039e.f3887K = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c1039e.f3889M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1039e.f3889M);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1039e.f3889M) == -2) {
                            c1039e.f3889M = -2;
                        }
                    }
                    break;
                case 38:
                    c1039e.f3891O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1039e.f3891O));
                    c1039e.f3885I = 2;
                    break;
                default:
                    switch (i4) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c1039e.f3878B = string;
                            c1039e.f3879C = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = c1039e.f3878B.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i2 = 0;
                                } else {
                                    String strSubstring = c1039e.f3878B.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        c1039e.f3879C = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        c1039e.f3879C = 1;
                                    }
                                    i2 = iIndexOf + 1;
                                }
                                int iIndexOf2 = c1039e.f3878B.indexOf(58);
                                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                    String strSubstring2 = c1039e.f3878B.substring(i2);
                                    if (strSubstring2.length() > 0) {
                                        Float.parseFloat(strSubstring2);
                                    }
                                } else {
                                    String strSubstring3 = c1039e.f3878B.substring(i2, iIndexOf2);
                                    String strSubstring4 = c1039e.f3878B.substring(iIndexOf2 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f3 = Float.parseFloat(strSubstring3);
                                            float f4 = Float.parseFloat(strSubstring4);
                                            if (f3 > 0.0f && f4 > 0.0f) {
                                                if (c1039e.f3879C == 1) {
                                                    Math.abs(f4 / f3);
                                                } else {
                                                    Math.abs(f3 / f4);
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                        }
                                    }
                                }
                            }
                            break;
                        case 45:
                            c1039e.f3880D = typedArrayObtainStyledAttributes.getFloat(index, c1039e.f3880D);
                            break;
                        case 46:
                            c1039e.f3881E = typedArrayObtainStyledAttributes.getFloat(index, c1039e.f3881E);
                            break;
                        case 47:
                            c1039e.f3882F = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c1039e.f3883G = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c1039e.f3892P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1039e.f3892P);
                            break;
                        case 50:
                            c1039e.f3893Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1039e.f3893Q);
                            break;
                        case 51:
                            c1039e.f3897U = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c1039e.m2518a();
        return c1039e;
    }

    public int getMaxHeight() {
        return this.f1264g;
    }

    public int getMaxWidth() {
        return this.f1263f;
    }

    public int getMinHeight() {
        return this.f1262e;
    }

    public int getMinWidth() {
        return this.f1261d;
    }

    public int getOptimizationLevel() {
        return this.f1260c.f3651p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C1039e c1039e = (C1039e) childAt.getLayoutParams();
            C0999d c0999d = c1039e.f3924k0;
            if (childAt.getVisibility() != 8 || c1039e.f3901Y || c1039e.f3902Z || zIsInEditMode) {
                int iM2408m = c0999d.m2408m();
                int iM2409n = c0999d.m2409n();
                childAt.layout(iM2408m, iM2409n, c0999d.m2407l() + iM2408m, c0999d.m2404i() + iM2409n);
            }
        }
        ArrayList arrayList = this.f1259b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC1037c) arrayList.get(i7)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i2, int i3) {
        C1000e c1000e;
        boolean z2;
        int i4;
        int i5;
        C1000e c1000e2;
        C0999d c0999d;
        int i6;
        C0999d c0999d2;
        int i7;
        C0999d c0999d3;
        int i8;
        float f2;
        int i9;
        int i10;
        int i11;
        float fAbs;
        int i12;
        ArrayList arrayList;
        int i13;
        View view;
        ArrayList arrayList2;
        View view2;
        int i14;
        C0999d c0999d4;
        ConstraintLayout constraintLayout = this;
        int i15 = 0;
        boolean z3 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C1000e c1000e3 = constraintLayout.f1260c;
        c1000e3.f3643h0 = z3;
        if (constraintLayout.f1265h) {
            constraintLayout.f1265h = false;
            int childCount = getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 >= childCount) {
                    z2 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i16).isLayoutRequested()) {
                        z2 = true;
                        break;
                    }
                    i16++;
                }
            }
            if (z2) {
                boolean zIsInEditMode = isInEditMode();
                int childCount2 = getChildCount();
                for (int i17 = 0; i17 < childCount2; i17++) {
                    C0999d c0999dM1159b = constraintLayout.m1159b(constraintLayout.getChildAt(i17));
                    if (c0999dM1159b != null) {
                        c0999dM1159b.mo2414s();
                    }
                }
                SparseArray sparseArray = constraintLayout.f1258a;
                if (zIsInEditMode) {
                    for (int i18 = 0; i18 < childCount2; i18++) {
                        View childAt = constraintLayout.getChildAt(i18);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName instanceof String) {
                                if (constraintLayout.f1270m == null) {
                                    constraintLayout.f1270m = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                constraintLayout.f1270m.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                if (viewFindViewById == constraintLayout) {
                                    c0999d4 = c1000e3;
                                    c0999d4.f3606W = resourceName;
                                } else {
                                    c0999d4 = viewFindViewById == null ? null : ((C1039e) viewFindViewById.getLayoutParams()).f3924k0;
                                    c0999d4.f3606W = resourceName;
                                }
                            } else {
                                c0999d4 = c1000e3;
                                c0999d4.f3606W = resourceName;
                            }
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (constraintLayout.f1269l != -1) {
                    for (int i19 = 0; i19 < childCount2; i19++) {
                        constraintLayout.getChildAt(i19).getId();
                    }
                }
                C1048n c1048n = constraintLayout.f1267j;
                if (c1048n != null) {
                    c1048n.m2528a(constraintLayout);
                }
                c1000e3.f3639d0.clear();
                ArrayList arrayList3 = constraintLayout.f1259b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i20 = 0;
                    while (i20 < size) {
                        AbstractC1037c abstractC1037c = (AbstractC1037c) arrayList3.get(i20);
                        if (abstractC1037c.isInEditMode()) {
                            abstractC1037c.setIds(abstractC1037c.f3874e);
                        }
                        AbstractC1004i abstractC1004i = abstractC1037c.f3873d;
                        if (abstractC1004i == null) {
                            arrayList = arrayList3;
                            i13 = size;
                        } else {
                            abstractC1004i.f3714e0 = i15;
                            Arrays.fill(abstractC1004i.f3713d0, (Object) null);
                            int i21 = i15;
                            while (i21 < abstractC1037c.f3871b) {
                                int i22 = abstractC1037c.f3870a[i21];
                                View view3 = (View) constraintLayout.f1258a.get(i22);
                                if (view3 == null) {
                                    Integer numValueOf2 = Integer.valueOf(i22);
                                    HashMap map = abstractC1037c.f3875f;
                                    String str = (String) map.get(numValueOf2);
                                    view = view3;
                                    int iM2516d = abstractC1037c.m2516d(constraintLayout, str);
                                    arrayList2 = arrayList3;
                                    if (iM2516d != 0) {
                                        abstractC1037c.f3870a[i21] = iM2516d;
                                        map.put(Integer.valueOf(iM2516d), str);
                                        view2 = (View) constraintLayout.f1258a.get(iM2516d);
                                    }
                                    if (view2 == null) {
                                        AbstractC1004i abstractC1004i2 = abstractC1037c.f3873d;
                                        C0999d c0999dM1159b2 = constraintLayout.m1159b(view2);
                                        abstractC1004i2.getClass();
                                        if (c0999dM1159b2 == abstractC1004i2 || c0999dM1159b2 == null) {
                                            i14 = size;
                                        } else {
                                            int i23 = abstractC1004i2.f3714e0 + 1;
                                            C0999d[] c0999dArr = abstractC1004i2.f3713d0;
                                            i14 = size;
                                            if (i23 > c0999dArr.length) {
                                                abstractC1004i2.f3713d0 = (C0999d[]) Arrays.copyOf(c0999dArr, c0999dArr.length * 2);
                                            }
                                            C0999d[] c0999dArr2 = abstractC1004i2.f3713d0;
                                            int i24 = abstractC1004i2.f3714e0;
                                            c0999dArr2[i24] = c0999dM1159b2;
                                            abstractC1004i2.f3714e0 = i24 + 1;
                                        }
                                    }
                                    i21++;
                                    size = i14;
                                    arrayList3 = arrayList2;
                                } else {
                                    view = view3;
                                    arrayList2 = arrayList3;
                                }
                                view2 = view;
                                if (view2 == null) {
                                }
                                i21++;
                                size = i14;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            i13 = size;
                            abstractC1037c.f3873d.mo2432B();
                        }
                        i20++;
                        size = i13;
                        arrayList3 = arrayList;
                        i15 = 0;
                    }
                }
                for (int i25 = 0; i25 < childCount2; i25++) {
                    constraintLayout.getChildAt(i25);
                }
                SparseArray sparseArray2 = constraintLayout.f1271n;
                sparseArray2.clear();
                sparseArray2.put(0, c1000e3);
                sparseArray2.put(getId(), c1000e3);
                for (int i26 = 0; i26 < childCount2; i26++) {
                    View childAt2 = constraintLayout.getChildAt(i26);
                    sparseArray2.put(childAt2.getId(), constraintLayout.m1159b(childAt2));
                }
                int i27 = 0;
                while (i27 < childCount2) {
                    View childAt3 = constraintLayout.getChildAt(i27);
                    C0999d c0999dM1159b3 = constraintLayout.m1159b(childAt3);
                    if (c0999dM1159b3 == null) {
                        c1000e2 = c1000e3;
                        i5 = childCount2;
                    } else {
                        C1039e c1039e = (C1039e) childAt3.getLayoutParams();
                        c1000e3.f3639d0.add(c0999dM1159b3);
                        C0999d c0999d5 = c0999dM1159b3.f3592I;
                        if (c0999d5 != null) {
                            ((C1000e) c0999d5).f3639d0.remove(c0999dM1159b3);
                            c0999dM1159b3.f3592I = null;
                        }
                        c0999dM1159b3.f3592I = c1000e3;
                        c1039e.m2518a();
                        c0999dM1159b3.f3605V = childAt3.getVisibility();
                        c0999dM1159b3.f3604U = childAt3;
                        if (childAt3 instanceof AbstractC1037c) {
                            ((AbstractC1037c) childAt3).mo1156f(c0999dM1159b3, c1000e3.f3643h0);
                        }
                        if (c1039e.f3901Y) {
                            C1003h c1003h = (C1003h) c0999dM1159b3;
                            int i28 = c1039e.f3918h0;
                            int i29 = c1039e.f3920i0;
                            float f3 = c1039e.f3922j0;
                            if (f3 != -1.0f) {
                                if (f3 > -1.0f) {
                                    c1003h.f3708d0 = f3;
                                    c1003h.f3709e0 = -1;
                                    c1003h.f3710f0 = -1;
                                }
                            } else if (i28 != -1) {
                                if (i28 > -1) {
                                    c1003h.f3708d0 = -1.0f;
                                    c1003h.f3709e0 = i28;
                                    c1003h.f3710f0 = -1;
                                }
                            } else if (i29 != -1 && i29 > -1) {
                                c1003h.f3708d0 = -1.0f;
                                c1003h.f3709e0 = -1;
                                c1003h.f3710f0 = i29;
                            }
                            c1000e2 = c1000e3;
                            i5 = childCount2;
                        } else {
                            int i30 = c1039e.f3904a0;
                            int i31 = c1039e.f3906b0;
                            int i32 = c1039e.f3908c0;
                            int i33 = c1039e.f3910d0;
                            i5 = childCount2;
                            int i34 = c1039e.f3912e0;
                            int i35 = c1039e.f3914f0;
                            float f4 = c1039e.f3916g0;
                            int i36 = c1039e.f3926m;
                            c1000e2 = c1000e3;
                            if (i36 != -1) {
                                C0999d c0999d6 = (C0999d) sparseArray2.get(i36);
                                if (c0999d6 != null) {
                                    float f5 = c1039e.f3928o;
                                    c0999dM1159b3.m2410o(7, 7, c1039e.f3927n, 0, c0999d6);
                                    c0999dM1159b3.f3634v = f5;
                                }
                            } else {
                                int i37 = -1;
                                if (i30 != -1) {
                                    C0999d c0999d7 = (C0999d) sparseArray2.get(i30);
                                    if (c0999d7 != null) {
                                        c0999dM1159b3.m2410o(2, 2, ((ViewGroup.MarginLayoutParams) c1039e).leftMargin, i34, c0999d7);
                                    }
                                } else {
                                    if (i31 != -1) {
                                        C0999d c0999d8 = (C0999d) sparseArray2.get(i31);
                                        if (c0999d8 != null) {
                                            c0999dM1159b3.m2410o(2, 4, ((ViewGroup.MarginLayoutParams) c1039e).leftMargin, i34, c0999d8);
                                        }
                                    }
                                    if (i32 == i37) {
                                        C0999d c0999d9 = (C0999d) sparseArray2.get(i32);
                                        if (c0999d9 != null) {
                                            c0999dM1159b3.m2410o(4, 2, ((ViewGroup.MarginLayoutParams) c1039e).rightMargin, i35, c0999d9);
                                        }
                                    } else if (i33 != i37 && (c0999d = (C0999d) sparseArray2.get(i33)) != null) {
                                        c0999dM1159b3.m2410o(4, 4, ((ViewGroup.MarginLayoutParams) c1039e).rightMargin, i35, c0999d);
                                    }
                                    i6 = c1039e.f3917h;
                                    if (i6 == -1) {
                                        C0999d c0999d10 = (C0999d) sparseArray2.get(i6);
                                        if (c0999d10 != null) {
                                            c0999dM1159b3.m2410o(3, 3, ((ViewGroup.MarginLayoutParams) c1039e).topMargin, c1039e.f3934u, c0999d10);
                                        }
                                    } else {
                                        int i38 = c1039e.f3919i;
                                        if (i38 != -1 && (c0999d2 = (C0999d) sparseArray2.get(i38)) != null) {
                                            c0999dM1159b3.m2410o(3, 5, ((ViewGroup.MarginLayoutParams) c1039e).topMargin, c1039e.f3934u, c0999d2);
                                        }
                                    }
                                    i7 = c1039e.f3921j;
                                    if (i7 == -1) {
                                        C0999d c0999d11 = (C0999d) sparseArray2.get(i7);
                                        if (c0999d11 != null) {
                                            c0999dM1159b3.m2410o(5, 3, ((ViewGroup.MarginLayoutParams) c1039e).bottomMargin, c1039e.f3936w, c0999d11);
                                        }
                                    } else {
                                        int i39 = c1039e.f3923k;
                                        if (i39 != -1 && (c0999d3 = (C0999d) sparseArray2.get(i39)) != null) {
                                            c0999dM1159b3.m2410o(5, 5, ((ViewGroup.MarginLayoutParams) c1039e).bottomMargin, c1039e.f3936w, c0999d3);
                                        }
                                    }
                                    i8 = c1039e.f3925l;
                                    if (i8 != -1) {
                                        View view4 = (View) sparseArray.get(i8);
                                        C0999d c0999d12 = (C0999d) sparseArray2.get(c1039e.f3925l);
                                        if (c0999d12 != null && view4 != null && (view4.getLayoutParams() instanceof C1039e)) {
                                            C1039e c1039e2 = (C1039e) view4.getLayoutParams();
                                            c1039e.f3900X = true;
                                            c1039e2.f3900X = true;
                                            c0999dM1159b3.mo2402g(6).m2389b(c0999d12.mo2402g(6), 0, -1, true);
                                            c0999dM1159b3.f3635w = true;
                                            c1039e2.f3924k0.f3635w = true;
                                            c0999dM1159b3.mo2402g(3).m2395h();
                                            c0999dM1159b3.mo2402g(5).m2395h();
                                        }
                                    }
                                    if (f4 >= 0.0f) {
                                        c0999dM1159b3.f3602S = f4;
                                    }
                                    f2 = c1039e.f3877A;
                                    if (f2 >= 0.0f) {
                                        c0999dM1159b3.f3603T = f2;
                                    }
                                }
                                i37 = -1;
                                if (i32 == i37) {
                                }
                                i6 = c1039e.f3917h;
                                if (i6 == -1) {
                                }
                                i7 = c1039e.f3921j;
                                if (i7 == -1) {
                                }
                                i8 = c1039e.f3925l;
                                if (i8 != -1) {
                                }
                                if (f4 >= 0.0f) {
                                }
                                f2 = c1039e.f3877A;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (zIsInEditMode && ((i12 = c1039e.f3892P) != -1 || c1039e.f3893Q != -1)) {
                                int i40 = c1039e.f3893Q;
                                c0999dM1159b3.f3597N = i12;
                                c0999dM1159b3.f3598O = i40;
                            }
                            if (c1039e.f3898V) {
                                c0999dM1159b3.m2418w(1);
                                c0999dM1159b3.m2420y(((ViewGroup.MarginLayoutParams) c1039e).width);
                                if (((ViewGroup.MarginLayoutParams) c1039e).width == -2) {
                                    c0999dM1159b3.m2418w(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c1039e).width == -1) {
                                if (c1039e.f3895S) {
                                    c0999dM1159b3.m2418w(3);
                                } else {
                                    c0999dM1159b3.m2418w(4);
                                }
                                c0999dM1159b3.mo2402g(2).f3581e = ((ViewGroup.MarginLayoutParams) c1039e).leftMargin;
                                c0999dM1159b3.mo2402g(4).f3581e = ((ViewGroup.MarginLayoutParams) c1039e).rightMargin;
                            } else {
                                c0999dM1159b3.m2418w(3);
                                c0999dM1159b3.m2420y(0);
                            }
                            if (c1039e.f3899W) {
                                i9 = -1;
                                c0999dM1159b3.m2419x(1);
                                c0999dM1159b3.m2417v(((ViewGroup.MarginLayoutParams) c1039e).height);
                                if (((ViewGroup.MarginLayoutParams) c1039e).height == -2) {
                                    c0999dM1159b3.m2419x(2);
                                }
                            } else {
                                i9 = -1;
                                if (((ViewGroup.MarginLayoutParams) c1039e).height == -1) {
                                    if (c1039e.f3896T) {
                                        c0999dM1159b3.m2419x(3);
                                    } else {
                                        c0999dM1159b3.m2419x(4);
                                    }
                                    c0999dM1159b3.mo2402g(3).f3581e = ((ViewGroup.MarginLayoutParams) c1039e).topMargin;
                                    c0999dM1159b3.mo2402g(5).f3581e = ((ViewGroup.MarginLayoutParams) c1039e).bottomMargin;
                                } else {
                                    c0999dM1159b3.m2419x(3);
                                    c0999dM1159b3.m2417v(0);
                                }
                            }
                            String str2 = c1039e.f3878B;
                            if (str2 == null || str2.length() == 0) {
                                c0999dM1159b3.f3595L = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i10 = i9;
                                    i11 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i10 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i9;
                                    i11 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i11);
                                    fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : 0.0f;
                                    if (fAbs > 0.0f) {
                                        c0999dM1159b3.f3595L = fAbs;
                                        c0999dM1159b3.f3596M = i10;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i11, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f6 = Float.parseFloat(strSubstring3);
                                            float f7 = Float.parseFloat(strSubstring4);
                                            if (f6 > 0.0f && f7 > 0.0f) {
                                                fAbs = i10 == 1 ? Math.abs(f7 / f6) : Math.abs(f6 / f7);
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                        if (fAbs > 0.0f) {
                                        }
                                    }
                                }
                            }
                            float f8 = c1039e.f3880D;
                            float[] fArr = c0999dM1159b3.f3609Z;
                            fArr[0] = f8;
                            fArr[1] = c1039e.f3881E;
                            c0999dM1159b3.f3607X = c1039e.f3882F;
                            c0999dM1159b3.f3608Y = c1039e.f3883G;
                            int i41 = c1039e.f3884H;
                            int i42 = c1039e.f3886J;
                            int i43 = c1039e.f3888L;
                            float f9 = c1039e.f3890N;
                            c0999dM1159b3.f3622j = i41;
                            c0999dM1159b3.f3625m = i42;
                            if (i43 == Integer.MAX_VALUE) {
                                i43 = 0;
                            }
                            c0999dM1159b3.f3626n = i43;
                            c0999dM1159b3.f3627o = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i41 == 0) {
                                c0999dM1159b3.f3622j = 2;
                            }
                            int i44 = c1039e.f3885I;
                            int i45 = c1039e.f3887K;
                            int i46 = c1039e.f3889M;
                            float f10 = c1039e.f3891O;
                            c0999dM1159b3.f3623k = i44;
                            c0999dM1159b3.f3628p = i45;
                            if (i46 == Integer.MAX_VALUE) {
                                i46 = 0;
                            }
                            c0999dM1159b3.f3629q = i46;
                            c0999dM1159b3.f3630r = f10;
                            if (f10 > 0.0f && f10 < 1.0f && i44 == 0) {
                                c0999dM1159b3.f3623k = 2;
                            }
                        }
                    }
                    i27++;
                    constraintLayout = this;
                    childCount2 = i5;
                    c1000e3 = c1000e2;
                }
            }
            c1000e = c1000e3;
            if (z2) {
                ArrayList arrayList4 = (ArrayList) c1000e.f3640e0.f474b;
                arrayList4.clear();
                int size2 = c1000e.f3639d0.size();
                for (int i47 = 0; i47 < size2; i47++) {
                    C0999d c0999d13 = (C0999d) c1000e.f3639d0.get(i47);
                    int[] iArr = c0999d13.f3615c0;
                    int i48 = iArr[0];
                    if (i48 == 3 || i48 == 4 || (i4 = iArr[1]) == 3 || i4 == 4) {
                        arrayList4.add(c0999d13);
                    }
                }
                c1000e.f3641f0.f3737b = true;
            }
        } else {
            c1000e = c1000e3;
        }
        m1162e(c1000e, this.f1266i, i2, i3);
        int iM2407l = c1000e.m2407l();
        int iM2404i = c1000e.m2404i();
        boolean z4 = c1000e.f3652q0;
        boolean z5 = c1000e.f3653r0;
        C1040f c1040f = this.f1272o;
        int i49 = c1040f.f3944e;
        int iResolveSizeAndState = View.resolveSizeAndState(iM2407l + c1040f.f3943d, i2, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iM2404i + i49, i3, 0) & 16777215;
        int iMin = Math.min(this.f1263f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f1264g, iResolveSizeAndState2);
        if (z4) {
            iMin |= 16777216;
        }
        if (z5) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0999d c0999dM1159b = m1159b(view);
        if ((view instanceof C1050p) && !(c0999dM1159b instanceof C1003h)) {
            C1039e c1039e = (C1039e) view.getLayoutParams();
            C1003h c1003h = new C1003h();
            c1039e.f3924k0 = c1003h;
            c1039e.f3901Y = true;
            c1003h.m2436B(c1039e.f3894R);
        }
        if (view instanceof AbstractC1037c) {
            AbstractC1037c abstractC1037c = (AbstractC1037c) view;
            abstractC1037c.m2517g();
            ((C1039e) view.getLayoutParams()).f3902Z = true;
            ArrayList arrayList = this.f1259b;
            if (!arrayList.contains(abstractC1037c)) {
                arrayList.add(abstractC1037c);
            }
        }
        this.f1258a.put(view.getId(), view);
        this.f1265h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1258a.remove(view.getId());
        C0999d c0999dM1159b = m1159b(view);
        this.f1260c.f3639d0.remove(c0999dM1159b);
        c0999dM1159b.f3592I = null;
        this.f1259b.remove(view);
        this.f1265h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1265h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C1048n c1048n) {
        this.f1267j = c1048n;
    }

    @Override // android.view.View
    public void setId(int i2) {
        int id = getId();
        SparseArray sparseArray = this.f1258a;
        sparseArray.remove(id);
        super.setId(i2);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f1264g) {
            return;
        }
        this.f1264g = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f1263f) {
            return;
        }
        this.f1263f = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f1262e) {
            return;
        }
        this.f1262e = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f1261d) {
            return;
        }
        this.f1261d = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC1049o abstractC1049o) {
        C0002c c0002c = this.f1268k;
        if (c0002c != null) {
            c0002c.getClass();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f1266i = i2;
        this.f1260c.f3651p0 = i2;
        C0985e.f3485p = (i2 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1258a = new SparseArray();
        this.f1259b = new ArrayList(4);
        this.f1260c = new C1000e();
        this.f1261d = 0;
        this.f1262e = 0;
        this.f1263f = Integer.MAX_VALUE;
        this.f1264g = Integer.MAX_VALUE;
        this.f1265h = true;
        this.f1266i = 263;
        this.f1267j = null;
        this.f1268k = null;
        this.f1269l = -1;
        this.f1270m = new HashMap();
        this.f1271n = new SparseArray();
        this.f1272o = new C1040f(this);
        m1160c(attributeSet, i2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1039e c1039e = new C1039e(layoutParams);
        c1039e.f3903a = -1;
        c1039e.f3905b = -1;
        c1039e.f3907c = -1.0f;
        c1039e.f3909d = -1;
        c1039e.f3911e = -1;
        c1039e.f3913f = -1;
        c1039e.f3915g = -1;
        c1039e.f3917h = -1;
        c1039e.f3919i = -1;
        c1039e.f3921j = -1;
        c1039e.f3923k = -1;
        c1039e.f3925l = -1;
        c1039e.f3926m = -1;
        c1039e.f3927n = 0;
        c1039e.f3928o = 0.0f;
        c1039e.f3929p = -1;
        c1039e.f3930q = -1;
        c1039e.f3931r = -1;
        c1039e.f3932s = -1;
        c1039e.f3933t = -1;
        c1039e.f3934u = -1;
        c1039e.f3935v = -1;
        c1039e.f3936w = -1;
        c1039e.f3937x = -1;
        c1039e.f3938y = -1;
        c1039e.f3939z = 0.5f;
        c1039e.f3877A = 0.5f;
        c1039e.f3878B = null;
        c1039e.f3879C = 1;
        c1039e.f3880D = -1.0f;
        c1039e.f3881E = -1.0f;
        c1039e.f3882F = 0;
        c1039e.f3883G = 0;
        c1039e.f3884H = 0;
        c1039e.f3885I = 0;
        c1039e.f3886J = 0;
        c1039e.f3887K = 0;
        c1039e.f3888L = 0;
        c1039e.f3889M = 0;
        c1039e.f3890N = 1.0f;
        c1039e.f3891O = 1.0f;
        c1039e.f3892P = -1;
        c1039e.f3893Q = -1;
        c1039e.f3894R = -1;
        c1039e.f3895S = false;
        c1039e.f3896T = false;
        c1039e.f3897U = null;
        c1039e.f3898V = true;
        c1039e.f3899W = true;
        c1039e.f3900X = false;
        c1039e.f3901Y = false;
        c1039e.f3902Z = false;
        c1039e.f3904a0 = -1;
        c1039e.f3906b0 = -1;
        c1039e.f3908c0 = -1;
        c1039e.f3910d0 = -1;
        c1039e.f3912e0 = -1;
        c1039e.f3914f0 = -1;
        c1039e.f3916g0 = 0.5f;
        c1039e.f3924k0 = new C0999d();
        return c1039e;
    }
}
