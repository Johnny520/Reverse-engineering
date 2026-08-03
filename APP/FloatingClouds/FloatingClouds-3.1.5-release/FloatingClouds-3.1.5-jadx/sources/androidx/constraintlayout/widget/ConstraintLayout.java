package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C1050d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p000a.AbstractC0276P3;
import p000a.AbstractC0639ih;
import p000a.C0029B9;
import p000a.C0191K8;
import p000a.C0222M3;
import p000a.C0240N3;
import p000a.C0258O3;
import p000a.C0364U2;
import p000a.C0366U4;
import p000a.C0450Yg;
import p000a.C0478a8;
import p000a.C0497b8;
import p000a.C0548e2;
import p000a.C0573f8;
import p000a.C0620hh;
import p000a.C0684l5;
import p000a.C0752og;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f4142p = 0;

    /* JADX INFO: renamed from: a */
    public final SparseArray<View> f4143a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<AbstractC1049c> f4144b;

    /* JADX INFO: renamed from: c */
    public final C0258O3 f4145c;

    /* JADX INFO: renamed from: d */
    public int f4146d;

    /* JADX INFO: renamed from: e */
    public int f4147e;

    /* JADX INFO: renamed from: f */
    public int f4148f;

    /* JADX INFO: renamed from: g */
    public int f4149g;

    /* JADX INFO: renamed from: h */
    public boolean f4150h;

    /* JADX INFO: renamed from: i */
    public int f4151i;

    /* JADX INFO: renamed from: j */
    public C1051e f4152j;

    /* JADX INFO: renamed from: k */
    public C1050d f4153k;

    /* JADX INFO: renamed from: l */
    public int f4154l;

    /* JADX INFO: renamed from: m */
    public HashMap<String, Integer> f4155m;

    /* JADX INFO: renamed from: n */
    public final SparseArray<C0240N3> f4156n;

    /* JADX INFO: renamed from: o */
    public final C1045b f4157o;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public class C1045b implements C0548e2.b {

        /* JADX INFO: renamed from: a */
        public final ConstraintLayout f4223a;

        /* JADX INFO: renamed from: b */
        public int f4224b;

        /* JADX INFO: renamed from: c */
        public int f4225c;

        /* JADX INFO: renamed from: d */
        public int f4226d;

        /* JADX INFO: renamed from: e */
        public int f4227e;

        /* JADX INFO: renamed from: f */
        public int f4228f;

        /* JADX INFO: renamed from: g */
        public int f4229g;

        public C1045b(ConstraintLayout constraintLayout) {
            this.f4223a = constraintLayout;
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0176 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:106:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0188  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0196  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01a6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x01ec  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0202  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0207  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x020f  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x0214  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0219  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x022a  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0238  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x023a  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0241  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:173:0x025f  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x0265  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x026d  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0275  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x0279  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x016d A[ADDED_TO_REGION] */
        @SuppressLint({"WrongCall"})
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m2414a(C0240N3 c0240n3, C0548e2.a aVar) {
            int i;
            int iMakeMeasureSpec;
            boolean z;
            int iOrdinal;
            int iMakeMeasureSpec2;
            boolean z2;
            boolean z3;
            boolean z4;
            C1044a c1044a;
            int measuredWidth;
            int measuredHeight;
            int baseline;
            int iMax;
            int i2;
            int iMax2;
            int i3;
            int i4;
            boolean z5;
            if (c0240n3 == null) {
                return;
            }
            if (c0240n3.f806X == 8 && !c0240n3.f836x) {
                aVar.f2029e = 0;
                aVar.f2030f = 0;
                aVar.f2031g = 0;
                return;
            }
            C0240N3.a aVar2 = aVar.f2025a;
            C0240N3.a aVar3 = aVar.f2026b;
            int i5 = aVar.f2027c;
            int i6 = aVar.f2028d;
            int i7 = this.f4224b + this.f4225c;
            int i8 = this.f4226d;
            View view = c0240n3.f805W;
            int iOrdinal2 = aVar2.ordinal();
            C0222M3 c0222m3 = c0240n3.f783A;
            C0222M3 c0222m32 = c0240n3.f837y;
            int[] iArr = c0240n3.f819g;
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    i = 2;
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4228f, i8, -2);
                    iArr[2] = -2;
                } else if (iOrdinal2 == 2) {
                    i = 2;
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f4228f, i8, -2);
                    boolean z6 = c0240n3.f822j == 1;
                    iArr[2] = 0;
                    if (aVar.f2034j) {
                        boolean z7 = !(!z6 || iArr[3] == 0 || iArr[0] == c0240n3.m648l()) || (view instanceof C1054h);
                        if (!z6 || z7) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0240n3.m648l(), 1073741824);
                        }
                    }
                } else {
                    if (iOrdinal2 != 3) {
                        i = 2;
                        iMakeMeasureSpec = 0;
                        z = false;
                        iOrdinal = aVar3.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4229g, i7, -2);
                                iArr[3] = -2;
                            } else if (iOrdinal == i) {
                                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4229g, i7, -2);
                                boolean z8 = c0240n3.f823k == 1;
                                iArr[3] = 0;
                                if (aVar.f2034j) {
                                    boolean z9 = !(!z8 || iArr[2] == 0 || iArr[1] == c0240n3.m645i()) || (view instanceof C1054h);
                                    if (!z8 || z9) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0240n3.m645i(), 1073741824);
                                    }
                                }
                            } else {
                                if (iOrdinal != 3) {
                                    iMakeMeasureSpec2 = 0;
                                    z2 = false;
                                    C0240N3.a aVar4 = C0240N3.a.f841c;
                                    boolean z10 = aVar2 == aVar4;
                                    boolean z11 = aVar3 == aVar4;
                                    C0240N3.a aVar5 = C0240N3.a.f842d;
                                    C0240N3.a aVar6 = C0240N3.a.f839a;
                                    boolean z12 = aVar3 == aVar5 || aVar3 == aVar6;
                                    boolean z13 = aVar2 == aVar5 || aVar2 == aVar6;
                                    z3 = z10 && c0240n3.f796N > 0.0f;
                                    z4 = z11 && c0240n3.f796N > 0.0f;
                                    c1044a = (C1044a) view.getLayoutParams();
                                    if (!aVar.f2034j && z10 && c0240n3.f822j == 0 && z11 && c0240n3.f823k == 0) {
                                        iMax = 0;
                                        iMax2 = 0;
                                        baseline = 0;
                                    } else {
                                        if ((view instanceof AbstractC1055i) || !(c0240n3 instanceof C0450Yg)) {
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                        } else {
                                            ((AbstractC1055i) view).mo2408h((C0450Yg) c0240n3, iMakeMeasureSpec, iMakeMeasureSpec2);
                                        }
                                        measuredWidth = view.getMeasuredWidth();
                                        measuredHeight = view.getMeasuredHeight();
                                        baseline = view.getBaseline();
                                        if (z) {
                                            iArr[0] = 0;
                                            iArr[2] = 0;
                                        } else {
                                            iArr[0] = measuredWidth;
                                            iArr[2] = measuredHeight;
                                        }
                                        if (z2) {
                                            iArr[1] = 0;
                                            iArr[3] = 0;
                                        } else {
                                            iArr[1] = measuredHeight;
                                            iArr[3] = measuredWidth;
                                        }
                                        int i9 = c0240n3.f825m;
                                        iMax = i9 <= 0 ? Math.max(i9, measuredWidth) : measuredWidth;
                                        i2 = c0240n3.f826n;
                                        if (i2 > 0) {
                                            iMax = Math.min(i2, iMax);
                                        }
                                        int i10 = c0240n3.f828p;
                                        iMax2 = i10 <= 0 ? Math.max(i10, measuredHeight) : measuredHeight;
                                        i3 = c0240n3.f829q;
                                        if (i3 > 0) {
                                            iMax2 = Math.min(i3, iMax2);
                                        }
                                        if (!z3 && z12) {
                                            iMax = (int) ((iMax2 * c0240n3.f796N) + 0.5f);
                                        } else if (z4 && z13) {
                                            iMax2 = (int) ((iMax / c0240n3.f796N) + 0.5f);
                                        }
                                        if (measuredWidth == iMax || measuredHeight != iMax2) {
                                            if (measuredWidth == iMax) {
                                                i4 = 1073741824;
                                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                                            } else {
                                                i4 = 1073741824;
                                            }
                                            if (measuredHeight != iMax2) {
                                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, i4);
                                            }
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                            iMax = view.getMeasuredWidth();
                                            iMax2 = view.getMeasuredHeight();
                                            baseline = view.getBaseline();
                                        }
                                    }
                                    z5 = baseline != -1;
                                    aVar.f2033i = (iMax == aVar.f2027c && iMax2 == aVar.f2028d) ? false : true;
                                    if (c1044a.f4181X) {
                                        z5 = true;
                                    }
                                    if (z5 && baseline != -1 && c0240n3.f800R != baseline) {
                                        aVar.f2033i = true;
                                    }
                                    aVar.f2029e = iMax;
                                    aVar.f2030f = iMax2;
                                    aVar.f2032h = z5;
                                    aVar.f2031g = baseline;
                                }
                                int i11 = this.f4229g;
                                int i12 = c0222m32 != null ? c0240n3.f838z.f748e : 0;
                                if (c0222m3 != null) {
                                    i12 += c0240n3.f784B.f748e;
                                }
                                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, i7 + i12, -1);
                                iArr[3] = -1;
                            }
                            z2 = true;
                            C0240N3.a aVar42 = C0240N3.a.f841c;
                            if (aVar2 == aVar42) {
                            }
                            if (aVar3 == aVar42) {
                            }
                            C0240N3.a aVar52 = C0240N3.a.f842d;
                            C0240N3.a aVar62 = C0240N3.a.f839a;
                            if (aVar3 == aVar52) {
                            }
                            if (aVar2 == aVar52) {
                            }
                            if (z10) {
                            }
                            if (z11) {
                            }
                            c1044a = (C1044a) view.getLayoutParams();
                            if (!aVar.f2034j) {
                                if (view instanceof AbstractC1055i) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth = view.getMeasuredWidth();
                                    measuredHeight = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                    if (z) {
                                    }
                                    if (z2) {
                                    }
                                    int i92 = c0240n3.f825m;
                                    if (i92 <= 0) {
                                    }
                                    i2 = c0240n3.f826n;
                                    if (i2 > 0) {
                                    }
                                    int i102 = c0240n3.f828p;
                                    if (i102 <= 0) {
                                    }
                                    i3 = c0240n3.f829q;
                                    if (i3 > 0) {
                                    }
                                    if (!z3) {
                                        if (z4) {
                                            iMax2 = (int) ((iMax / c0240n3.f796N) + 0.5f);
                                        }
                                        if (measuredWidth == iMax) {
                                            if (measuredWidth == iMax) {
                                            }
                                            if (measuredHeight != iMax2) {
                                            }
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                            iMax = view.getMeasuredWidth();
                                            iMax2 = view.getMeasuredHeight();
                                            baseline = view.getBaseline();
                                        }
                                    }
                                }
                            }
                            if (baseline != -1) {
                            }
                            aVar.f2033i = (iMax == aVar.f2027c && iMax2 == aVar.f2028d) ? false : true;
                            if (c1044a.f4181X) {
                            }
                            if (z5) {
                                aVar.f2033i = true;
                            }
                            aVar.f2029e = iMax;
                            aVar.f2030f = iMax2;
                            aVar.f2032h = z5;
                            aVar.f2031g = baseline;
                        }
                        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                        iArr[3] = i6;
                        iMakeMeasureSpec2 = iMakeMeasureSpec3;
                        z2 = false;
                        C0240N3.a aVar422 = C0240N3.a.f841c;
                        if (aVar2 == aVar422) {
                        }
                        if (aVar3 == aVar422) {
                        }
                        C0240N3.a aVar522 = C0240N3.a.f842d;
                        C0240N3.a aVar622 = C0240N3.a.f839a;
                        if (aVar3 == aVar522) {
                        }
                        if (aVar2 == aVar522) {
                        }
                        if (z10) {
                        }
                        if (z11) {
                        }
                        c1044a = (C1044a) view.getLayoutParams();
                        if (!aVar.f2034j) {
                        }
                        if (baseline != -1) {
                        }
                        aVar.f2033i = (iMax == aVar.f2027c && iMax2 == aVar.f2028d) ? false : true;
                        if (c1044a.f4181X) {
                        }
                        if (z5) {
                        }
                        aVar.f2029e = iMax;
                        aVar.f2030f = iMax2;
                        aVar.f2032h = z5;
                        aVar.f2031g = baseline;
                    }
                    int i13 = this.f4228f;
                    int i14 = c0222m32 != null ? c0222m32.f748e : 0;
                    if (c0222m3 != null) {
                        i = 2;
                        i14 += c0222m3.f748e;
                    } else {
                        i = 2;
                    }
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i13, i8 + i14, -1);
                    iArr[i] = -1;
                }
                z = true;
                iOrdinal = aVar3.ordinal();
                if (iOrdinal != 0) {
                }
                z2 = false;
                C0240N3.a aVar4222 = C0240N3.a.f841c;
                if (aVar2 == aVar4222) {
                }
                if (aVar3 == aVar4222) {
                }
                C0240N3.a aVar5222 = C0240N3.a.f842d;
                C0240N3.a aVar6222 = C0240N3.a.f839a;
                if (aVar3 == aVar5222) {
                }
                if (aVar2 == aVar5222) {
                }
                if (z10) {
                }
                if (z11) {
                }
                c1044a = (C1044a) view.getLayoutParams();
                if (!aVar.f2034j) {
                }
                if (baseline != -1) {
                }
                aVar.f2033i = (iMax == aVar.f2027c && iMax2 == aVar.f2028d) ? false : true;
                if (c1044a.f4181X) {
                }
                if (z5) {
                }
                aVar.f2029e = iMax;
                aVar.f2030f = iMax2;
                aVar.f2032h = z5;
                aVar.f2031g = baseline;
            }
            i = 2;
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            iArr[2] = i5;
            iMakeMeasureSpec = iMakeMeasureSpec4;
            z = false;
            iOrdinal = aVar3.ordinal();
            if (iOrdinal != 0) {
            }
            z2 = false;
            C0240N3.a aVar42222 = C0240N3.a.f841c;
            if (aVar2 == aVar42222) {
            }
            if (aVar3 == aVar42222) {
            }
            C0240N3.a aVar52222 = C0240N3.a.f842d;
            C0240N3.a aVar62222 = C0240N3.a.f839a;
            if (aVar3 == aVar52222) {
            }
            if (aVar2 == aVar52222) {
            }
            if (z10) {
            }
            if (z11) {
            }
            c1044a = (C1044a) view.getLayoutParams();
            if (!aVar.f2034j) {
            }
            if (baseline != -1) {
            }
            aVar.f2033i = (iMax == aVar.f2027c && iMax2 == aVar.f2028d) ? false : true;
            if (c1044a.f4181X) {
            }
            if (z5) {
            }
            aVar.f2029e = iMax;
            aVar.f2030f = iMax2;
            aVar.f2032h = z5;
            aVar.f2031g = baseline;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4143a = new SparseArray<>();
        this.f4144b = new ArrayList<>(4);
        this.f4145c = new C0258O3();
        this.f4146d = 0;
        this.f4147e = 0;
        this.f4148f = Integer.MAX_VALUE;
        this.f4149g = Integer.MAX_VALUE;
        this.f4150h = true;
        this.f4151i = 263;
        this.f4152j = null;
        this.f4153k = null;
        this.f4154l = -1;
        this.f4155m = new HashMap<>();
        this.f4156n = new SparseArray<>();
        this.f4157o = new C1045b(this);
        m2410c(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* JADX INFO: renamed from: b */
    public final C0240N3 m2409b(View view) {
        if (view == this) {
            return this.f4145c;
        }
        if (view == null) {
            return null;
        }
        return ((C1044a) view.getLayoutParams()).f4207l0;
    }

    /* JADX INFO: renamed from: c */
    public final void m2410c(AttributeSet attributeSet, int i) {
        C0258O3 c0258o3 = this.f4145c;
        c0258o3.f805W = this;
        C1045b c1045b = this.f4157o;
        c0258o3.f929h0 = c1045b;
        c0258o3.f928g0.f1373f = c1045b;
        this.f4143a.put(getId(), this);
        this.f4152j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1046R.styleable.ConstraintLayout_Layout, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C1046R.styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.f4146d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4146d);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.f4147e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4147e);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.f4148f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4148f);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.f4149g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4149g);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f4151i = typedArrayObtainStyledAttributes.getInt(index, this.f4151i);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m2411d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f4153k = null;
                        }
                    }
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1051e c1051e = new C1051e();
                        this.f4152j = c1051e;
                        c1051e.m2428e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f4152j = null;
                    }
                    this.f4154l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i3 = this.f4151i;
        c0258o3.f938q0 = i3;
        C0029B9.f93p = (i3 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1044a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2411d(int i) {
        byte b;
        Context context = getContext();
        C1050d c1050d = new C1050d();
        c1050d.f4255a = new SparseArray<>();
        c1050d.f4256b = new SparseArray<>();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C1050d.a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            b = name.equals("ConstraintSet") ? (byte) 4 : (byte) -1;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b = 3;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    if (b != 0 && b != 1) {
                        if (b == 2) {
                            aVar = new C1050d.a(context, xml);
                            c1050d.f4255a.put(aVar.f4257a, aVar);
                        } else if (b == 3) {
                            C1050d.b bVar = new C1050d.b(context, xml);
                            if (aVar != null) {
                                aVar.f4258b.add(bVar);
                            }
                        } else if (b != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            c1050d.m2422a(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
        this.f4153k = c1050d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC1049c> arrayList = this.f4144b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                arrayList.get(i).getClass();
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e7 A[PHI: r2
  0x01e7: PHI (r2v3 boolean) = (r2v2 boolean), (r2v34 boolean) binds: [B:67:0x0182, B:376:0x01e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0184  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2412e(C0258O3 c0258o3, int i, int i2, int i3) {
        int iMax;
        int i4;
        C0240N3.a aVar;
        int iMax2;
        int i5;
        C0240N3.a aVar2;
        int iM648l;
        C0366U4 c0366u4;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        C0548e2 c0548e2;
        C0548e2.b bVar;
        int i8;
        int i9;
        int i10;
        C0240N3.a aVar3;
        boolean zM745E;
        int i11;
        C0548e2 c0548e22;
        int size;
        boolean z4;
        int i12;
        C0222M3.a aVar4;
        C0222M3.a aVar5;
        boolean z5;
        boolean z6;
        int i13;
        ArrayList<C0240N3> arrayList;
        int i14;
        boolean z7;
        C0548e2.b bVar2;
        int i15;
        int i16;
        boolean z8;
        C0548e2 c0548e23;
        int i17;
        int i18;
        int i19;
        boolean z9;
        boolean z10;
        boolean z11;
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size3 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i20 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C1045b c1045b = this.f4157o;
        c1045b.f4224b = iMax3;
        c1045b.f4225c = iMax4;
        c1045b.f4226d = paddingWidth;
        c1045b.f4227e = i20;
        c1045b.f4228f = i2;
        c1045b.f4229g = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i21 = size2 - paddingWidth;
        int i22 = size3 - i20;
        int i23 = c1045b.f4227e;
        int i24 = c1045b.f4226d;
        C0240N3.a aVar6 = C0240N3.a.f839a;
        int childCount = getChildCount();
        C0240N3.a aVar7 = C0240N3.a.f840b;
        int i25 = Integer.MIN_VALUE;
        if (mode == Integer.MIN_VALUE) {
            iMax = childCount == 0 ? Math.max(0, this.f4146d) : i21;
        } else {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = i23;
                    aVar = aVar6;
                    iMax = 0;
                } else {
                    iMax = Math.min(this.f4148f - i24, i21);
                    i4 = i23;
                    aVar = aVar6;
                }
                if (mode2 != i25) {
                    if (mode2 != 0) {
                        if (mode2 != 1073741824) {
                            i5 = i24;
                            aVar2 = aVar6;
                            iMax2 = 0;
                        } else {
                            iMax2 = Math.min(this.f4149g - i4, i22);
                            i5 = i24;
                            aVar2 = aVar6;
                        }
                    } else if (childCount == 0) {
                        i5 = i24;
                        aVar2 = aVar7;
                        iMax2 = Math.max(0, this.f4147e);
                    } else {
                        iMax2 = 0;
                    }
                    iM648l = c0258o3.m648l();
                    c0366u4 = c0258o3.f928g0;
                    if (iMax == iM648l || iMax2 != c0258o3.m645i()) {
                        c0366u4.f1370c = true;
                    }
                    c0258o3.f798P = 0;
                    c0258o3.f799Q = 0;
                    int i26 = this.f4148f - i5;
                    int[] iArr = c0258o3.f833u;
                    iArr[0] = i26;
                    iArr[1] = this.f4149g - i4;
                    c0258o3.f801S = 0;
                    c0258o3.f802T = 0;
                    c0258o3.m659w(aVar);
                    c0258o3.m661y(iMax);
                    c0258o3.m660x(aVar2);
                    c0258o3.m658v(iMax2);
                    i6 = this.f4146d - i5;
                    if (i6 >= 0) {
                        c0258o3.f801S = 0;
                    } else {
                        c0258o3.f801S = i6;
                    }
                    i7 = this.f4147e - i4;
                    if (i7 >= 0) {
                        c0258o3.f802T = 0;
                    } else {
                        c0258o3.f802T = i7;
                    }
                    c0258o3.f932k0 = iMax5;
                    c0258o3.f933l0 = iMax3;
                    C0548e2 c0548e24 = c0258o3.f927f0;
                    c0548e24.getClass();
                    C0548e2.b bVar3 = c0258o3.f929h0;
                    int size4 = c0258o3.f2295e0.size();
                    int iM648l2 = c0258o3.m648l();
                    int iM645i = c0258o3.m645i();
                    z = (i & 128) != 128;
                    z2 = !z || (i & 64) == 64;
                    C0240N3.a aVar8 = C0240N3.a.f841c;
                    if (z2) {
                        z3 = z2;
                    } else {
                        int i27 = 0;
                        while (i27 < size4) {
                            boolean z12 = z2;
                            C0240N3 c0240n3 = c0258o3.f2295e0.get(i27);
                            int i28 = i27;
                            C0240N3.a[] aVarArr = c0240n3.f792J;
                            boolean z13 = (aVarArr[0] == aVar8) && (aVarArr[1] == aVar8) && c0240n3.f796N > 0.0f;
                            if ((c0240n3.m653q() && z13) || ((c0240n3.m654r() && z13) || (c0240n3 instanceof C0450Yg) || c0240n3.m653q() || c0240n3.m654r())) {
                                z3 = false;
                                break;
                            } else {
                                i27 = i28 + 1;
                                z2 = z12;
                            }
                        }
                        z3 = z2;
                    }
                    if (z3 && ((mode != 1073741824 && mode2 == 1073741824) || z)) {
                        c0548e2 = c0548e24;
                        bVar = bVar3;
                        i8 = size4;
                        i9 = iM648l2;
                        i10 = iM645i;
                        aVar3 = aVar6;
                        zM745E = false;
                        i11 = 0;
                    } else {
                        int iMin = Math.min(iArr[0], i21);
                        int iMin2 = Math.min(iArr[1], i22);
                        int i29 = 1073741824;
                        if (mode == 1073741824) {
                            if (c0258o3.m648l() != iMin) {
                                c0258o3.m661y(iMin);
                                c0258o3.f928g0.f1369b = true;
                            }
                            i29 = 1073741824;
                        }
                        if (mode2 == i29 && c0258o3.m645i() != iMin2) {
                            c0258o3.m658v(iMin2);
                            c0258o3.f928g0.f1369b = true;
                        }
                        if (mode == i29 && mode2 == i29) {
                            boolean z14 = c0366u4.f1369b;
                            C0258O3 c0258o32 = c0366u4.f1368a;
                            if (z14 || c0366u4.f1370c) {
                                for (C0240N3 c0240n32 : c0258o32.f2295e0) {
                                    c0240n32.f809a = false;
                                    c0240n32.f815d.m526n();
                                    c0240n32.f817e.m1774m();
                                }
                                i19 = 0;
                                c0258o32.f809a = false;
                                c0258o32.f815d.m526n();
                                c0258o32.f817e.m1774m();
                                c0366u4.f1370c = false;
                            } else {
                                i19 = 0;
                            }
                            c0366u4.m982b(c0366u4.f1371d);
                            c0258o32.f798P = i19;
                            c0258o32.f799Q = i19;
                            C0240N3.a aVarM644h = c0258o32.m644h(i19);
                            C0240N3.a aVarM644h2 = c0258o32.m644h(1);
                            if (c0366u4.f1369b) {
                                c0366u4.m983c();
                            }
                            int iM649m = c0258o32.m649m();
                            i8 = size4;
                            int iM650n = c0258o32.m650n();
                            bVar = bVar3;
                            C0191K8 c0191k8 = c0258o32.f815d;
                            i9 = iM648l2;
                            c0191k8.f2349h.mo1014d(iM649m);
                            C0752og c0752og = c0258o32.f817e;
                            c0752og.f2349h.mo1014d(iM650n);
                            c0366u4.m987g();
                            ArrayList<AbstractC0639ih> arrayList2 = c0366u4.f1372e;
                            C0684l5 c0684l5 = c0191k8.f2346e;
                            C0684l5 c0684l52 = c0752og.f2346e;
                            if (aVarM644h == aVar7 || aVarM644h2 == aVar7) {
                                if (z) {
                                    Iterator<AbstractC0639ih> it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (!it.next().mo525k()) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                if (z && aVarM644h == aVar7) {
                                    i10 = iM645i;
                                    aVar3 = aVar6;
                                    c0258o32.m659w(aVar3);
                                    c0548e2 = c0548e24;
                                    z9 = z;
                                    c0258o32.m661y(c0366u4.m984d(c0258o32, 0));
                                    c0684l5.mo1014d(c0258o32.m648l());
                                } else {
                                    c0548e2 = c0548e24;
                                    i10 = iM645i;
                                    aVar3 = aVar6;
                                    z9 = z;
                                }
                                if (z9 && aVarM644h2 == aVar7) {
                                    c0258o32.m660x(aVar3);
                                    c0258o32.m658v(c0366u4.m984d(c0258o32, 1));
                                    c0684l52.mo1014d(c0258o32.m645i());
                                }
                            } else {
                                c0548e2 = c0548e24;
                                i10 = iM645i;
                                aVar3 = aVar6;
                            }
                            C0240N3.a[] aVarArr2 = c0258o32.f792J;
                            C0240N3.a aVar9 = aVarArr2[0];
                            C0240N3.a aVar10 = C0240N3.a.f842d;
                            if (aVar9 == aVar3 || aVar9 == aVar10) {
                                int iM648l3 = c0258o32.m648l() + iM649m;
                                c0191k8.f2350i.mo1014d(iM648l3);
                                c0684l5.mo1014d(iM648l3 - iM649m);
                                c0366u4.m987g();
                                C0240N3.a aVar11 = aVarArr2[1];
                                if (aVar11 == aVar3 || aVar11 == aVar10) {
                                    int iM645i2 = c0258o32.m645i() + iM650n;
                                    c0752og.f2350i.mo1014d(iM645i2);
                                    c0684l52.mo1014d(iM645i2 - iM650n);
                                }
                                c0366u4.m987g();
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            for (AbstractC0639ih abstractC0639ih : arrayList2) {
                                if (abstractC0639ih.f2343b != c0258o32 || abstractC0639ih.f2348g) {
                                    abstractC0639ih.mo523e();
                                }
                            }
                            for (AbstractC0639ih abstractC0639ih2 : arrayList2) {
                                if (z10 || abstractC0639ih2.f2343b != c0258o32) {
                                    if (!abstractC0639ih2.f2349h.f1452j || ((!abstractC0639ih2.f2350i.f1452j && !(abstractC0639ih2 instanceof C0497b8)) || (!abstractC0639ih2.f2346e.f1452j && !(abstractC0639ih2 instanceof C0364U2) && !(abstractC0639ih2 instanceof C0497b8)))) {
                                        z11 = false;
                                        break;
                                    }
                                }
                            }
                            z11 = true;
                            c0258o32.m659w(aVarM644h);
                            c0258o32.m660x(aVarM644h2);
                            zM745E = z11;
                            i18 = 1073741824;
                            i11 = 2;
                        } else {
                            c0548e2 = c0548e24;
                            bVar = bVar3;
                            i8 = size4;
                            i9 = iM648l2;
                            i10 = iM645i;
                            aVar3 = aVar6;
                            boolean z15 = c0366u4.f1369b;
                            C0258O3 c0258o33 = c0366u4.f1368a;
                            if (z15) {
                                for (C0240N3 c0240n33 : c0258o33.f2295e0) {
                                    c0240n33.f809a = false;
                                    C0191K8 c0191k82 = c0240n33.f815d;
                                    c0191k82.f2346e.f1452j = false;
                                    c0191k82.f2348g = false;
                                    c0191k82.m526n();
                                    C0752og c0752og2 = c0240n33.f817e;
                                    c0752og2.f2346e.f1452j = false;
                                    c0752og2.f2348g = false;
                                    c0752og2.m1774m();
                                }
                                i17 = 0;
                                c0258o33.f809a = false;
                                C0191K8 c0191k83 = c0258o33.f815d;
                                c0191k83.f2346e.f1452j = false;
                                c0191k83.f2348g = false;
                                c0191k83.m526n();
                                C0752og c0752og3 = c0258o33.f817e;
                                c0752og3.f2346e.f1452j = false;
                                c0752og3.f2348g = false;
                                c0752og3.m1774m();
                                c0366u4.m983c();
                            } else {
                                i17 = 0;
                            }
                            c0366u4.m982b(c0366u4.f1371d);
                            c0258o33.f798P = i17;
                            c0258o33.f799Q = i17;
                            c0258o33.f815d.f2349h.mo1014d(i17);
                            c0258o33.f817e.f2349h.mo1014d(i17);
                            i18 = 1073741824;
                            if (mode == 1073741824) {
                                zM745E = c0258o3.m745E(i17, z);
                                i11 = 1;
                            } else {
                                zM745E = true;
                                i11 = 0;
                            }
                            if (mode2 == 1073741824) {
                                zM745E &= c0258o3.m745E(1, z);
                                i11++;
                            }
                        }
                        if (zM745E) {
                            c0258o3.mo662z(mode == i18, mode2 == i18);
                        }
                    }
                    if (zM745E || i11 != 2) {
                        if (i8 <= 0) {
                            int size5 = c0258o3.f2295e0.size();
                            C0548e2.b bVar4 = c0258o3.f929h0;
                            int i30 = 0;
                            while (i30 < size5) {
                                C0240N3 c0240n34 = c0258o3.f2295e0.get(i30);
                                if (!(c0240n34 instanceof C0478a8) && (!c0240n34.f815d.f2346e.f1452j || !c0240n34.f817e.f2346e.f1452j)) {
                                    C0240N3.a aVarM644h3 = c0240n34.m644h(0);
                                    C0240N3.a aVarM644h4 = c0240n34.m644h(1);
                                    if (aVarM644h3 != aVar8 || c0240n34.f822j == 1 || aVarM644h4 != aVar8 || c0240n34.f823k == 1) {
                                        c0548e23 = c0548e2;
                                        c0548e23.m1320a(bVar4, c0240n34, false);
                                    } else {
                                        c0548e23 = c0548e2;
                                    }
                                }
                                i30++;
                                c0548e2 = c0548e23;
                            }
                            c0548e22 = c0548e2;
                            ConstraintLayout constraintLayout = ((C1045b) bVar4).f4223a;
                            int childCount2 = constraintLayout.getChildCount();
                            for (int i31 = 0; i31 < childCount2; i31++) {
                                View childAt = constraintLayout.getChildAt(i31);
                                if (childAt instanceof C1054h) {
                                    C1054h c1054h = (C1054h) childAt;
                                    if (c1054h.f4374b != null) {
                                        C1044a c1044a = (C1044a) c1054h.getLayoutParams();
                                        C1044a c1044a2 = (C1044a) c1054h.f4374b.getLayoutParams();
                                        C0240N3 c0240n35 = c1044a2.f4207l0;
                                        c0240n35.f806X = 0;
                                        C0240N3 c0240n36 = c1044a.f4207l0;
                                        if (c0240n36.f792J[0] != aVar3) {
                                            c0240n36.m661y(c0240n35.m648l());
                                        }
                                        C0240N3 c0240n37 = c1044a.f4207l0;
                                        if (c0240n37.f792J[1] != aVar3) {
                                            c0240n37.m658v(c1044a2.f4207l0.m645i());
                                        }
                                        c1044a2.f4207l0.f806X = 8;
                                    }
                                }
                            }
                            ArrayList<AbstractC1049c> arrayList3 = constraintLayout.f4144b;
                            int size6 = arrayList3.size();
                            if (size6 > 0) {
                                for (int i32 = 0; i32 < size6; i32++) {
                                    arrayList3.get(i32).getClass();
                                }
                            }
                        } else {
                            c0548e22 = c0548e2;
                        }
                        int i33 = c0258o3.f938q0;
                        ArrayList<C0240N3> arrayList4 = c0548e22.f2022a;
                        size = arrayList4.size();
                        int i34 = i9;
                        int i35 = i10;
                        if (i8 > 0) {
                            c0548e22.m1321b(c0258o3, i34, i35);
                        }
                        if (size <= 0) {
                            C0240N3.a[] aVarArr3 = c0258o3.f792J;
                            z4 = false;
                            boolean z16 = aVarArr3[0] == aVar7;
                            boolean z17 = aVarArr3[1] == aVar7;
                            int iM648l4 = c0258o3.m648l();
                            C0258O3 c0258o34 = c0548e22.f2024c;
                            int iMax7 = Math.max(iM648l4, c0258o34.f801S);
                            int iMax8 = Math.max(c0258o3.m645i(), c0258o34.f802T);
                            int i36 = 0;
                            boolean z18 = false;
                            while (true) {
                                aVar4 = C0222M3.a.f754d;
                                aVar5 = C0222M3.a.f753c;
                                if (i36 >= size) {
                                    break;
                                }
                                C0240N3 c0240n38 = arrayList4.get(i36);
                                boolean z19 = z17;
                                if (c0240n38 instanceof C0450Yg) {
                                    int iM648l5 = c0240n38.m648l();
                                    z7 = z16;
                                    int iM645i3 = c0240n38.m645i();
                                    C0548e2.b bVar5 = bVar;
                                    boolean z20 = z18;
                                    bVar2 = bVar5;
                                    i15 = i36;
                                    boolean zM1320a = z20 | c0548e22.m1320a(bVar2, c0240n38, true);
                                    int iM648l6 = c0240n38.m648l();
                                    i16 = i33;
                                    int iM645i4 = c0240n38.m645i();
                                    if (iM648l6 != iM648l5) {
                                        c0240n38.m661y(iM648l6);
                                        if (z7 && c0240n38.m649m() + c0240n38.f794L > iMax7) {
                                            iMax7 = Math.max(iMax7, c0240n38.mo643g(aVar5).m600c() + c0240n38.m649m() + c0240n38.f794L);
                                        }
                                        zM1320a = true;
                                    }
                                    if (iM645i4 != iM645i3) {
                                        c0240n38.m658v(iM645i4);
                                        if (z19 && c0240n38.m650n() + c0240n38.f795M > iMax8) {
                                            iMax8 = Math.max(iMax8, c0240n38.mo643g(aVar4).m600c() + c0240n38.m650n() + c0240n38.f795M);
                                        }
                                        zM1320a = true;
                                    }
                                    z8 = zM1320a | ((C0450Yg) c0240n38).f1701m0;
                                } else {
                                    i16 = i33;
                                    z7 = z16;
                                    i15 = i36;
                                    z8 = z18;
                                    bVar2 = bVar;
                                }
                                i36 = i15 + 1;
                                bVar = bVar2;
                                z17 = z19;
                                z16 = z7;
                                i33 = i16;
                                z18 = z8;
                            }
                            C0548e2.b bVar6 = bVar;
                            boolean zM1320a2 = z18;
                            int i37 = i33;
                            boolean z21 = z17;
                            boolean z22 = z16;
                            int i38 = 0;
                            while (i38 < 2) {
                                int i39 = 0;
                                while (i39 < size) {
                                    C0240N3 c0240n39 = arrayList4.get(i39);
                                    if ((!(c0240n39 instanceof C0573f8) || (c0240n39 instanceof C0450Yg)) && !(c0240n39 instanceof C0478a8)) {
                                        if (c0240n39.f806X != 8 && ((!c0240n39.f815d.f2346e.f1452j || !c0240n39.f817e.f2346e.f1452j) && !(c0240n39 instanceof C0450Yg))) {
                                            int iM648l7 = c0240n39.m648l();
                                            int iM645i5 = c0240n39.m645i();
                                            i13 = i39;
                                            int i40 = c0240n39.f800R;
                                            arrayList = arrayList4;
                                            zM1320a2 |= c0548e22.m1320a(bVar6, c0240n39, true);
                                            int iM648l8 = c0240n39.m648l();
                                            i14 = size;
                                            int iM645i6 = c0240n39.m645i();
                                            if (iM648l8 != iM648l7) {
                                                c0240n39.m661y(iM648l8);
                                                if (z22 && c0240n39.m649m() + c0240n39.f794L > iMax7) {
                                                    iMax7 = Math.max(iMax7, c0240n39.mo643g(aVar5).m600c() + c0240n39.m649m() + c0240n39.f794L);
                                                }
                                                zM1320a2 = true;
                                            }
                                            if (iM645i6 != iM645i5) {
                                                c0240n39.m658v(iM645i6);
                                                if (z21 && c0240n39.m650n() + c0240n39.f795M > iMax8) {
                                                    iMax8 = Math.max(iMax8, c0240n39.mo643g(aVar4).m600c() + c0240n39.m650n() + c0240n39.f795M);
                                                }
                                                zM1320a2 = true;
                                            }
                                            if (c0240n39.f835w && i40 != c0240n39.f800R) {
                                                zM1320a2 = true;
                                            }
                                        }
                                        i39 = i13 + 1;
                                        arrayList4 = arrayList;
                                        size = i14;
                                    }
                                    i13 = i39;
                                    arrayList = arrayList4;
                                    i14 = size;
                                    i39 = i13 + 1;
                                    arrayList4 = arrayList;
                                    size = i14;
                                }
                                ArrayList<C0240N3> arrayList5 = arrayList4;
                                int i41 = size;
                                if (zM1320a2) {
                                    c0548e22.m1321b(c0258o3, i34, i35);
                                    zM1320a2 = false;
                                }
                                i38++;
                                arrayList4 = arrayList5;
                                size = i41;
                            }
                            if (zM1320a2) {
                                c0548e22.m1321b(c0258o3, i34, i35);
                                if (c0258o3.m648l() < iMax7) {
                                    c0258o3.m661y(iMax7);
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (c0258o3.m645i() < iMax8) {
                                    c0258o3.m658v(iMax8);
                                    z6 = true;
                                } else {
                                    z6 = z5;
                                }
                                if (z6) {
                                    c0548e22.m1321b(c0258o3, i34, i35);
                                }
                            }
                            i12 = i37;
                        } else {
                            z4 = false;
                            i12 = i33;
                        }
                        c0258o3.f938q0 = i12;
                        C0029B9.f93p = (i12 & 256) != 256 ? true : z4;
                    }
                    return;
                }
                iMax2 = childCount == 0 ? Math.max(0, this.f4147e) : i22;
                i5 = i24;
                aVar2 = aVar7;
                iM648l = c0258o3.m648l();
                c0366u4 = c0258o3.f928g0;
                if (iMax == iM648l) {
                    c0366u4.f1370c = true;
                }
                c0258o3.f798P = 0;
                c0258o3.f799Q = 0;
                int i262 = this.f4148f - i5;
                int[] iArr2 = c0258o3.f833u;
                iArr2[0] = i262;
                iArr2[1] = this.f4149g - i4;
                c0258o3.f801S = 0;
                c0258o3.f802T = 0;
                c0258o3.m659w(aVar);
                c0258o3.m661y(iMax);
                c0258o3.m660x(aVar2);
                c0258o3.m658v(iMax2);
                i6 = this.f4146d - i5;
                if (i6 >= 0) {
                }
                i7 = this.f4147e - i4;
                if (i7 >= 0) {
                }
                c0258o3.f932k0 = iMax5;
                c0258o3.f933l0 = iMax3;
                C0548e2 c0548e242 = c0258o3.f927f0;
                c0548e242.getClass();
                C0548e2.b bVar32 = c0258o3.f929h0;
                int size42 = c0258o3.f2295e0.size();
                int iM648l22 = c0258o3.m648l();
                int iM645i7 = c0258o3.m645i();
                if ((i & 128) != 128) {
                }
                if (z) {
                }
                C0240N3.a aVar82 = C0240N3.a.f841c;
                if (z2) {
                }
                if (!(z3 & ((mode != 1073741824 && mode2 == 1073741824) || z))) {
                }
                if (zM745E) {
                }
                if (i8 <= 0) {
                }
                int i332 = c0258o3.f938q0;
                ArrayList<C0240N3> arrayList42 = c0548e22.f2022a;
                size = arrayList42.size();
                int i342 = i9;
                int i352 = i10;
                if (i8 > 0) {
                }
                if (size <= 0) {
                }
                c0258o3.f938q0 = i12;
                C0029B9.f93p = (i12 & 256) != 256 ? true : z4;
            }
            if (childCount == 0) {
                i4 = i23;
                aVar = aVar7;
                iMax = Math.max(0, this.f4146d);
                i25 = Integer.MIN_VALUE;
                if (mode2 != i25) {
                }
                i5 = i24;
                aVar2 = aVar7;
                iM648l = c0258o3.m648l();
                c0366u4 = c0258o3.f928g0;
                if (iMax == iM648l) {
                }
                c0258o3.f798P = 0;
                c0258o3.f799Q = 0;
                int i2622 = this.f4148f - i5;
                int[] iArr22 = c0258o3.f833u;
                iArr22[0] = i2622;
                iArr22[1] = this.f4149g - i4;
                c0258o3.f801S = 0;
                c0258o3.f802T = 0;
                c0258o3.m659w(aVar);
                c0258o3.m661y(iMax);
                c0258o3.m660x(aVar2);
                c0258o3.m658v(iMax2);
                i6 = this.f4146d - i5;
                if (i6 >= 0) {
                }
                i7 = this.f4147e - i4;
                if (i7 >= 0) {
                }
                c0258o3.f932k0 = iMax5;
                c0258o3.f933l0 = iMax3;
                C0548e2 c0548e2422 = c0258o3.f927f0;
                c0548e2422.getClass();
                C0548e2.b bVar322 = c0258o3.f929h0;
                int size422 = c0258o3.f2295e0.size();
                int iM648l222 = c0258o3.m648l();
                int iM645i72 = c0258o3.m645i();
                if ((i & 128) != 128) {
                }
                if (z) {
                }
                C0240N3.a aVar822 = C0240N3.a.f841c;
                if (z2) {
                }
                if (!(z3 & ((mode != 1073741824 && mode2 == 1073741824) || z))) {
                }
                if (zM745E) {
                }
                if (i8 <= 0) {
                }
                int i3322 = c0258o3.f938q0;
                ArrayList<C0240N3> arrayList422 = c0548e22.f2022a;
                size = arrayList422.size();
                int i3422 = i9;
                int i3522 = i10;
                if (i8 > 0) {
                }
                if (size <= 0) {
                }
                c0258o3.f938q0 = i12;
                C0029B9.f93p = (i12 & 256) != 256 ? true : z4;
            }
            iMax = 0;
        }
        i4 = i23;
        aVar = aVar7;
        i25 = Integer.MIN_VALUE;
        if (mode2 != i25) {
        }
        i5 = i24;
        aVar2 = aVar7;
        iM648l = c0258o3.m648l();
        c0366u4 = c0258o3.f928g0;
        if (iMax == iM648l) {
        }
        c0258o3.f798P = 0;
        c0258o3.f799Q = 0;
        int i26222 = this.f4148f - i5;
        int[] iArr222 = c0258o3.f833u;
        iArr222[0] = i26222;
        iArr222[1] = this.f4149g - i4;
        c0258o3.f801S = 0;
        c0258o3.f802T = 0;
        c0258o3.m659w(aVar);
        c0258o3.m661y(iMax);
        c0258o3.m660x(aVar2);
        c0258o3.m658v(iMax2);
        i6 = this.f4146d - i5;
        if (i6 >= 0) {
        }
        i7 = this.f4147e - i4;
        if (i7 >= 0) {
        }
        c0258o3.f932k0 = iMax5;
        c0258o3.f933l0 = iMax3;
        C0548e2 c0548e24222 = c0258o3.f927f0;
        c0548e24222.getClass();
        C0548e2.b bVar3222 = c0258o3.f929h0;
        int size4222 = c0258o3.f2295e0.size();
        int iM648l2222 = c0258o3.m648l();
        int iM645i722 = c0258o3.m645i();
        if ((i & 128) != 128) {
        }
        if (z) {
        }
        C0240N3.a aVar8222 = C0240N3.a.f841c;
        if (z2) {
        }
        if (!(z3 & ((mode != 1073741824 && mode2 == 1073741824) || z))) {
        }
        if (zM745E) {
        }
        if (i8 <= 0) {
        }
        int i33222 = c0258o3.f938q0;
        ArrayList<C0240N3> arrayList4222 = c0548e22.f2022a;
        size = arrayList4222.size();
        int i34222 = i9;
        int i35222 = i10;
        if (i8 > 0) {
        }
        if (size <= 0) {
        }
        c0258o3.f938q0 = i12;
        C0029B9.f93p = (i12 & 256) != 256 ? true : z4;
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f4150h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1044a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1044a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f4149g;
    }

    public int getMaxWidth() {
        return this.f4148f;
    }

    public int getMinHeight() {
        return this.f4147e;
    }

    public int getMinWidth() {
        return this.f4146d;
    }

    public int getOptimizationLevel() {
        return this.f4145c.f938q0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C1044a c1044a = (C1044a) childAt.getLayoutParams();
            C0240N3 c0240n3 = c1044a.f4207l0;
            if ((childAt.getVisibility() != 8 || c1044a.f4182Y || c1044a.f4183Z || zIsInEditMode) && !c1044a.f4185a0) {
                int iM649m = c0240n3.m649m();
                int iM650n = c0240n3.m650n();
                int iM648l = c0240n3.m648l() + iM649m;
                int iM645i = c0240n3.m645i() + iM650n;
                childAt.layout(iM649m, iM650n, iM648l, iM645i);
                if ((childAt instanceof C1054h) && (content = ((C1054h) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iM649m, iM650n, iM648l, iM645i);
                }
            }
        }
        ArrayList<AbstractC1049c> arrayList = this.f4144b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.get(i6).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        C0240N3.a aVar;
        int i3;
        boolean z3;
        int i4;
        C0240N3 c0240n3;
        C0222M3.a aVar2;
        C0240N3 c0240n32;
        C0222M3.a aVar3;
        C0222M3.a aVar4;
        C0222M3.a aVar5;
        C0240N3 c0240n33;
        C0222M3.a aVar6;
        int i5;
        int i6;
        C0222M3.a aVar7;
        C0222M3.a aVar8;
        C0240N3 c0240n34;
        int i7;
        C0222M3.a aVar9;
        C0240N3 c0240n35;
        C0240N3 c0240n36;
        C0222M3.a aVar10;
        int i8;
        SparseArray<C0240N3> sparseArray;
        SparseArray<View> sparseArray2;
        C0222M3.a aVar11;
        int i9;
        int i10;
        int i11;
        int i12;
        float fAbs;
        int i13;
        C0240N3 c0240n37;
        byte b;
        boolean z4;
        ArrayList<AbstractC1049c> arrayList;
        int i14;
        View view;
        ArrayList<AbstractC1049c> arrayList2;
        int i15;
        View view2;
        C0240N3 c0240n38;
        ConstraintLayout constraintLayout = this;
        boolean z5 = true;
        boolean z6 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        C0258O3 c0258o3 = constraintLayout.f4145c;
        c0258o3.f930i0 = z6;
        if (constraintLayout.f4150h) {
            constraintLayout.f4150h = false;
            int childCount = constraintLayout.getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 >= childCount) {
                    z = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i16).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i16++;
                }
            }
            C0240N3.a aVar12 = C0240N3.a.f841c;
            C0240N3.a aVar13 = C0240N3.a.f842d;
            if (z) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount2 = constraintLayout.getChildCount();
                for (int i17 = 0; i17 < childCount2; i17++) {
                    C0240N3 c0240n3M2409b = constraintLayout.m2409b(constraintLayout.getChildAt(i17));
                    if (c0240n3M2409b != null) {
                        c0240n3M2409b.mo655s();
                    }
                }
                SparseArray<View> sparseArray3 = constraintLayout.f4143a;
                int i18 = -1;
                if (zIsInEditMode) {
                    int i19 = 0;
                    while (i19 < childCount2) {
                        View childAt = constraintLayout.getChildAt(i19);
                        boolean z7 = z5;
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (constraintLayout.f4155m == null) {
                                    constraintLayout.f4155m = new HashMap<>();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                constraintLayout.f4155m.put(iIndexOf != i18 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = sparseArray3.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                if (viewFindViewById == constraintLayout) {
                                    c0240n38 = c0258o3;
                                    c0240n38.f807Y = resourceName;
                                } else {
                                    c0240n38 = viewFindViewById == null ? null : ((C1044a) viewFindViewById.getLayoutParams()).f4207l0;
                                    c0240n38.f807Y = resourceName;
                                }
                            } else {
                                c0240n38 = c0258o3;
                                c0240n38.f807Y = resourceName;
                            }
                        } catch (Resources.NotFoundException unused) {
                        }
                        i19++;
                        z5 = z7;
                        i18 = -1;
                    }
                }
                boolean z8 = z5;
                if (constraintLayout.f4154l != -1) {
                    for (int i20 = 0; i20 < childCount2; i20++) {
                        View childAt2 = constraintLayout.getChildAt(i20);
                        if (childAt2.getId() == constraintLayout.f4154l && (childAt2 instanceof C1052f)) {
                            constraintLayout.f4152j = ((C1052f) childAt2).getConstraintSet();
                        }
                    }
                }
                C1051e c1051e = constraintLayout.f4152j;
                if (c1051e != null) {
                    c1051e.m2426a(constraintLayout);
                }
                c0258o3.f2295e0.clear();
                ArrayList<AbstractC1049c> arrayList3 = constraintLayout.f4144b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i21 = 0;
                    while (i21 < size) {
                        AbstractC1049c abstractC1049c = arrayList3.get(i21);
                        if (abstractC1049c.isInEditMode()) {
                            abstractC1049c.setIds(abstractC1049c.f4253e);
                        }
                        C0573f8 c0573f8 = abstractC1049c.f4252d;
                        if (c0573f8 == null) {
                            z4 = z;
                            arrayList = arrayList3;
                            i14 = size;
                        } else {
                            c0573f8.f2135f0 = 0;
                            Arrays.fill(c0573f8.f2134e0, (Object) null);
                            int i22 = 0;
                            while (i22 < abstractC1049c.f4250b) {
                                int i23 = abstractC1049c.f4249a[i22];
                                boolean z9 = z;
                                View view3 = constraintLayout.f4143a.get(i23);
                                if (view3 == null) {
                                    Integer numValueOf2 = Integer.valueOf(i23);
                                    view = view3;
                                    HashMap<Integer, String> map = abstractC1049c.f4254f;
                                    String str = map.get(numValueOf2);
                                    arrayList2 = arrayList3;
                                    int iM2420d = abstractC1049c.m2420d(constraintLayout, str);
                                    i15 = size;
                                    if (iM2420d != 0) {
                                        abstractC1049c.f4249a[i22] = iM2420d;
                                        map.put(Integer.valueOf(iM2420d), str);
                                        view2 = constraintLayout.f4143a.get(iM2420d);
                                    }
                                    if (view2 == null) {
                                        C0573f8 c0573f82 = abstractC1049c.f4252d;
                                        C0240N3 c0240n3M2409b2 = constraintLayout.m2409b(view2);
                                        c0573f82.getClass();
                                        if (c0240n3M2409b2 != c0573f82 && c0240n3M2409b2 != null) {
                                            int i24 = c0573f82.f2135f0 + 1;
                                            C0240N3[] c0240n3Arr = c0573f82.f2134e0;
                                            if (i24 > c0240n3Arr.length) {
                                                c0573f82.f2134e0 = (C0240N3[]) Arrays.copyOf(c0240n3Arr, c0240n3Arr.length * 2);
                                            }
                                            C0240N3[] c0240n3Arr2 = c0573f82.f2134e0;
                                            int i25 = c0573f82.f2135f0;
                                            c0240n3Arr2[i25] = c0240n3M2409b2;
                                            c0573f82.f2135f0 = i25 + 1;
                                        }
                                    }
                                    i22++;
                                    z = z9;
                                    arrayList3 = arrayList2;
                                    size = i15;
                                } else {
                                    view = view3;
                                    arrayList2 = arrayList3;
                                    i15 = size;
                                }
                                view2 = view;
                                if (view2 == null) {
                                }
                                i22++;
                                z = z9;
                                arrayList3 = arrayList2;
                                size = i15;
                            }
                            z4 = z;
                            arrayList = arrayList3;
                            i14 = size;
                            abstractC1049c.f4252d.mo1112B();
                        }
                        i21++;
                        z = z4;
                        arrayList3 = arrayList;
                        size = i14;
                    }
                }
                z2 = z;
                int i26 = 2;
                int i27 = 0;
                while (i27 < childCount2) {
                    View childAt3 = constraintLayout.getChildAt(i27);
                    if (childAt3 instanceof C1054h) {
                        C1054h c1054h = (C1054h) childAt3;
                        if (c1054h.f4373a == -1 && !c1054h.isInEditMode()) {
                            c1054h.setVisibility(c1054h.f4375c);
                        }
                        View viewFindViewById2 = constraintLayout.findViewById(c1054h.f4373a);
                        c1054h.f4374b = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((C1044a) viewFindViewById2.getLayoutParams()).f4185a0 = z8;
                            c1054h.f4374b.setVisibility(0);
                            c1054h.setVisibility(0);
                        }
                    }
                    i27++;
                    z8 = true;
                }
                SparseArray<C0240N3> sparseArray4 = constraintLayout.f4156n;
                sparseArray4.clear();
                sparseArray4.put(0, c0258o3);
                sparseArray4.put(constraintLayout.getId(), c0258o3);
                for (int i28 = 0; i28 < childCount2; i28++) {
                    View childAt4 = constraintLayout.getChildAt(i28);
                    sparseArray4.put(childAt4.getId(), constraintLayout.m2409b(childAt4));
                }
                int i29 = 0;
                while (i29 < childCount2) {
                    View childAt5 = constraintLayout.getChildAt(i29);
                    C0240N3 c0240n3M2409b3 = constraintLayout.m2409b(childAt5);
                    if (c0240n3M2409b3 == null) {
                        sparseArray = sparseArray4;
                        i3 = i29;
                        z3 = zIsInEditMode;
                        i4 = childCount2;
                        sparseArray2 = sparseArray3;
                        i10 = i26;
                    } else {
                        C1044a c1044a = (C1044a) childAt5.getLayoutParams();
                        c0258o3.f2295e0.add(c0240n3M2409b3);
                        C0240N3 c0240n39 = c0240n3M2409b3.f793K;
                        if (c0240n39 != null) {
                            ((C0620hh) c0240n39).f2295e0.remove(c0240n3M2409b3);
                            c0240n3M2409b3.f793K = null;
                        }
                        c0240n3M2409b3.f793K = c0258o3;
                        c1044a.m2413a();
                        c0240n3M2409b3.f806X = childAt5.getVisibility();
                        if (c1044a.f4185a0) {
                            c0240n3M2409b3.f836x = true;
                            c0240n3M2409b3.f806X = 8;
                        }
                        c0240n3M2409b3.f805W = childAt5;
                        if (childAt5 instanceof AbstractC1049c) {
                            ((AbstractC1049c) childAt5).mo2407f(c0240n3M2409b3, c0258o3.f930i0);
                        }
                        if (c1044a.f4182Y) {
                            C0478a8 c0478a8 = (C0478a8) c0240n3M2409b3;
                            int i30 = c1044a.f4201i0;
                            int i31 = c1044a.f4203j0;
                            float f = c1044a.f4205k0;
                            if (f != -1.0f) {
                                if (f > -1.0f) {
                                    c0478a8.f1792e0 = f;
                                    b = -1;
                                    c0478a8.f1793f0 = -1;
                                    c0478a8.f1794g0 = -1;
                                    sparseArray = sparseArray4;
                                    i3 = i29;
                                    z3 = zIsInEditMode;
                                    i4 = childCount2;
                                    sparseArray2 = sparseArray3;
                                    i10 = i26;
                                }
                                sparseArray = sparseArray4;
                                i3 = i29;
                                z3 = zIsInEditMode;
                                i4 = childCount2;
                                sparseArray2 = sparseArray3;
                                i10 = i26;
                            } else {
                                b = -1;
                                if (i30 != -1) {
                                    if (i30 > -1) {
                                        c0478a8.f1792e0 = -1.0f;
                                        c0478a8.f1793f0 = i30;
                                        c0478a8.f1794g0 = -1;
                                    }
                                } else if (i31 != -1 && i31 > -1) {
                                    c0478a8.f1792e0 = -1.0f;
                                    c0478a8.f1793f0 = -1;
                                    c0478a8.f1794g0 = i31;
                                    sparseArray = sparseArray4;
                                    i3 = i29;
                                    z3 = zIsInEditMode;
                                    i4 = childCount2;
                                    sparseArray2 = sparseArray3;
                                    i10 = i26;
                                }
                                sparseArray = sparseArray4;
                                i3 = i29;
                                z3 = zIsInEditMode;
                                i4 = childCount2;
                                sparseArray2 = sparseArray3;
                                i10 = i26;
                            }
                        } else {
                            int i32 = c1044a.f4187b0;
                            int i33 = c1044a.f4189c0;
                            int i34 = c1044a.f4191d0;
                            i3 = i29;
                            int i35 = c1044a.f4193e0;
                            z3 = zIsInEditMode;
                            int i36 = c1044a.f4195f0;
                            int i37 = c1044a.f4197g0;
                            float f2 = c1044a.f4199h0;
                            i4 = childCount2;
                            int i38 = c1044a.f4208m;
                            C0222M3.a aVar14 = C0222M3.a.f753c;
                            C0222M3.a aVar15 = C0222M3.a.f751a;
                            C0222M3.a aVar16 = C0222M3.a.f754d;
                            C0222M3.a aVar17 = C0222M3.a.f752b;
                            if (i38 != -1) {
                                C0240N3 c0240n310 = sparseArray4.get(i38);
                                if (c0240n310 != null) {
                                    float f3 = c1044a.f4210o;
                                    int i39 = c1044a.f4209n;
                                    C0222M3.a aVar18 = C0222M3.a.f756f;
                                    c0240n3M2409b3.m651o(aVar18, c0240n310, aVar18, i39, 0);
                                    c0240n37 = c0240n3M2409b3;
                                    c0240n37.f834v = f3;
                                } else {
                                    c0240n37 = c0240n3M2409b3;
                                }
                                sparseArray = sparseArray4;
                                c0240n36 = c0240n37;
                                sparseArray2 = sparseArray3;
                                aVar6 = aVar14;
                                aVar5 = aVar15;
                                aVar10 = aVar16;
                                aVar9 = aVar17;
                            } else {
                                if (i32 != -1) {
                                    C0240N3 c0240n311 = sparseArray4.get(i32);
                                    if (c0240n311 != null) {
                                        c0240n3 = c0240n3M2409b3;
                                        aVar2 = aVar15;
                                        c0240n3.m651o(aVar2, c0240n311, aVar15, ((ViewGroup.MarginLayoutParams) c1044a).leftMargin, i36);
                                    } else {
                                        c0240n3 = c0240n3M2409b3;
                                        aVar2 = aVar15;
                                    }
                                } else {
                                    c0240n3 = c0240n3M2409b3;
                                    aVar2 = aVar15;
                                    if (i33 != -1 && (c0240n32 = sparseArray4.get(i33)) != null) {
                                        c0240n3.m651o(aVar2, c0240n32, aVar14, ((ViewGroup.MarginLayoutParams) c1044a).leftMargin, i36);
                                        aVar3 = aVar2;
                                        aVar4 = aVar14;
                                    }
                                    if (i34 == -1) {
                                        C0240N3 c0240n312 = sparseArray4.get(i34);
                                        if (c0240n312 != null) {
                                            c0240n3.m651o(aVar4, c0240n312, aVar3, ((ViewGroup.MarginLayoutParams) c1044a).rightMargin, i37);
                                        }
                                        aVar5 = aVar3;
                                    } else {
                                        aVar5 = aVar3;
                                        if (i35 != -1 && (c0240n33 = sparseArray4.get(i35)) != null) {
                                            c0240n3.m651o(aVar4, c0240n33, aVar4, ((ViewGroup.MarginLayoutParams) c1044a).rightMargin, i37);
                                        }
                                    }
                                    aVar6 = aVar4;
                                    i5 = c1044a.f4198h;
                                    if (i5 == -1) {
                                        C0240N3 c0240n313 = sparseArray4.get(i5);
                                        if (c0240n313 != null) {
                                            aVar11 = aVar17;
                                            c0240n3.m651o(aVar11, c0240n313, aVar17, ((ViewGroup.MarginLayoutParams) c1044a).topMargin, c1044a.f4216u);
                                        } else {
                                            aVar11 = aVar17;
                                        }
                                        aVar7 = aVar11;
                                        aVar8 = aVar16;
                                        i6 = -1;
                                    } else {
                                        int i40 = c1044a.f4200i;
                                        i6 = -1;
                                        if (i40 == -1 || (c0240n34 = sparseArray4.get(i40)) == null) {
                                            aVar7 = aVar17;
                                            aVar8 = aVar16;
                                        } else {
                                            c0240n3.m651o(aVar17, c0240n34, aVar16, ((ViewGroup.MarginLayoutParams) c1044a).topMargin, c1044a.f4216u);
                                            aVar7 = aVar17;
                                            aVar8 = aVar16;
                                        }
                                    }
                                    i7 = c1044a.f4202j;
                                    if (i7 == i6) {
                                        C0240N3 c0240n314 = sparseArray4.get(i7);
                                        if (c0240n314 != null) {
                                            c0240n3.m651o(aVar8, c0240n314, aVar7, ((ViewGroup.MarginLayoutParams) c1044a).bottomMargin, c1044a.f4218w);
                                        }
                                        aVar9 = aVar7;
                                    } else {
                                        aVar9 = aVar7;
                                        int i41 = c1044a.f4204k;
                                        if (i41 != i6 && (c0240n35 = sparseArray4.get(i41)) != null) {
                                            c0240n3.m651o(aVar8, c0240n35, aVar8, ((ViewGroup.MarginLayoutParams) c1044a).bottomMargin, c1044a.f4218w);
                                        }
                                    }
                                    c0240n36 = c0240n3;
                                    aVar10 = aVar8;
                                    i8 = c1044a.f4206l;
                                    if (i8 == -1) {
                                        View view4 = sparseArray3.get(i8);
                                        C0240N3 c0240n315 = sparseArray4.get(c1044a.f4206l);
                                        if (c0240n315 == null || view4 == null || !(view4.getLayoutParams() instanceof C1044a)) {
                                            sparseArray = sparseArray4;
                                            sparseArray2 = sparseArray3;
                                        } else {
                                            C1044a c1044a2 = (C1044a) view4.getLayoutParams();
                                            sparseArray = sparseArray4;
                                            c1044a.f4181X = true;
                                            c1044a2.f4181X = true;
                                            C0222M3.a aVar19 = C0222M3.a.f755e;
                                            sparseArray2 = sparseArray3;
                                            c0240n36.mo643g(aVar19).m599b(c0240n315.mo643g(aVar19), 0, -1, true);
                                            c0240n36.f835w = true;
                                            c1044a2.f4207l0.f835w = true;
                                            c0240n36.mo643g(aVar9).m605h();
                                            c0240n36.mo643g(aVar10).m605h();
                                        }
                                        if (f2 >= 0.0f) {
                                            c0240n36.f803U = f2;
                                        }
                                        float f4 = c1044a.f4158A;
                                        if (f4 >= 0.0f) {
                                            c0240n36.f804V = f4;
                                        }
                                    }
                                }
                                aVar3 = aVar2;
                                aVar4 = aVar14;
                                if (i34 == -1) {
                                }
                                aVar6 = aVar4;
                                i5 = c1044a.f4198h;
                                if (i5 == -1) {
                                }
                                i7 = c1044a.f4202j;
                                if (i7 == i6) {
                                }
                                c0240n36 = c0240n3;
                                aVar10 = aVar8;
                                i8 = c1044a.f4206l;
                                if (i8 == -1) {
                                }
                            }
                            if (z3 && ((i13 = c1044a.f4173P) != -1 || c1044a.f4174Q != -1)) {
                                int i42 = c1044a.f4174Q;
                                c0240n36.f798P = i13;
                                c0240n36.f799Q = i42;
                            }
                            boolean z10 = c1044a.f4179V;
                            C0240N3.a aVar20 = C0240N3.a.f840b;
                            C0240N3.a aVar21 = C0240N3.a.f839a;
                            if (z10) {
                                c0240n36.m659w(aVar21);
                                c0240n36.m661y(((ViewGroup.MarginLayoutParams) c1044a).width);
                                if (((ViewGroup.MarginLayoutParams) c1044a).width == -2) {
                                    c0240n36.m659w(aVar20);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c1044a).width == -1) {
                                if (c1044a.f4176S) {
                                    c0240n36.m659w(aVar12);
                                } else {
                                    c0240n36.m659w(aVar13);
                                }
                                c0240n36.mo643g(aVar5).f748e = ((ViewGroup.MarginLayoutParams) c1044a).leftMargin;
                                c0240n36.mo643g(aVar6).f748e = ((ViewGroup.MarginLayoutParams) c1044a).rightMargin;
                            } else {
                                c0240n36.m659w(aVar12);
                                c0240n36.m661y(0);
                            }
                            if (c1044a.f4180W) {
                                i9 = -1;
                                c0240n36.m660x(aVar21);
                                c0240n36.m658v(((ViewGroup.MarginLayoutParams) c1044a).height);
                                if (((ViewGroup.MarginLayoutParams) c1044a).height == -2) {
                                    c0240n36.m660x(aVar20);
                                }
                            } else {
                                i9 = -1;
                                if (((ViewGroup.MarginLayoutParams) c1044a).height == -1) {
                                    if (c1044a.f4177T) {
                                        c0240n36.m660x(aVar12);
                                    } else {
                                        c0240n36.m660x(aVar13);
                                    }
                                    c0240n36.mo643g(aVar9).f748e = ((ViewGroup.MarginLayoutParams) c1044a).topMargin;
                                    c0240n36.mo643g(aVar10).f748e = ((ViewGroup.MarginLayoutParams) c1044a).bottomMargin;
                                } else {
                                    c0240n36.m660x(aVar12);
                                    c0240n36.m658v(0);
                                }
                            }
                            String str2 = c1044a.f4159B;
                            if (str2 == null || str2.length() == 0) {
                                c0240n36.f796N = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i11 = i9;
                                    i12 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i11 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i9;
                                    i12 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i12);
                                    fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : 0.0f;
                                    if (fAbs > 0.0f) {
                                        c0240n36.f796N = fAbs;
                                        c0240n36.f797O = i11;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i12, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f5 = Float.parseFloat(strSubstring3);
                                            float f6 = Float.parseFloat(strSubstring4);
                                            if (f5 > 0.0f && f6 > 0.0f) {
                                                fAbs = i11 == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                        if (fAbs > 0.0f) {
                                        }
                                    }
                                }
                            }
                            float f7 = c1044a.f4161D;
                            float[] fArr = c0240n36.f812b0;
                            fArr[0] = f7;
                            fArr[1] = c1044a.f4162E;
                            c0240n36.f808Z = c1044a.f4163F;
                            c0240n36.f810a0 = c1044a.f4164G;
                            int i43 = c1044a.f4165H;
                            int i44 = c1044a.f4167J;
                            int i45 = c1044a.f4169L;
                            float f8 = c1044a.f4171N;
                            c0240n36.f822j = i43;
                            c0240n36.f825m = i44;
                            if (i45 == Integer.MAX_VALUE) {
                                i45 = 0;
                            }
                            c0240n36.f826n = i45;
                            c0240n36.f827o = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i43 == 0) {
                                c0240n36.f822j = i26;
                            }
                            int i46 = c1044a.f4166I;
                            int i47 = c1044a.f4168K;
                            int i48 = c1044a.f4170M;
                            float f9 = c1044a.f4172O;
                            c0240n36.f823k = i46;
                            c0240n36.f828p = i47;
                            if (i48 == Integer.MAX_VALUE) {
                                i48 = 0;
                            }
                            c0240n36.f829q = i48;
                            c0240n36.f830r = f9;
                            if (f9 <= 0.0f || f9 >= 1.0f || i46 != 0) {
                                i10 = 2;
                            } else {
                                i10 = 2;
                                c0240n36.f823k = 2;
                            }
                        }
                    }
                    i29 = i3 + 1;
                    i26 = i10;
                    sparseArray4 = sparseArray;
                    sparseArray3 = sparseArray2;
                    zIsInEditMode = z3;
                    childCount2 = i4;
                    constraintLayout = this;
                }
            } else {
                z2 = z;
            }
            if (z2) {
                ArrayList<C0240N3> arrayList4 = c0258o3.f927f0.f2022a;
                arrayList4.clear();
                int size2 = c0258o3.f2295e0.size();
                for (int i49 = 0; i49 < size2; i49++) {
                    C0240N3 c0240n316 = c0258o3.f2295e0.get(i49);
                    C0240N3.a[] aVarArr = c0240n316.f792J;
                    C0240N3.a aVar22 = aVarArr[0];
                    if (aVar22 == aVar12 || aVar22 == aVar13 || (aVar = aVarArr[1]) == aVar12 || aVar == aVar13) {
                        arrayList4.add(c0240n316);
                    }
                }
                c0258o3.f928g0.f1369b = true;
            }
        }
        m2412e(c0258o3, this.f4151i, i, i2);
        int iM648l = c0258o3.m648l();
        int iM645i = c0258o3.m645i();
        boolean z11 = c0258o3.f939r0;
        boolean z12 = c0258o3.f940s0;
        C1045b c1045b = this.f4157o;
        int i50 = c1045b.f4227e;
        int iResolveSizeAndState = View.resolveSizeAndState(iM648l + c1045b.f4226d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iM645i + i50, i2, 0) & 16777215;
        int iMin = Math.min(this.f4148f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f4149g, iResolveSizeAndState2);
        if (z11) {
            iMin |= 16777216;
        }
        if (z12) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0240N3 c0240n3M2409b = m2409b(view);
        if ((view instanceof C1053g) && !(c0240n3M2409b instanceof C0478a8)) {
            C1044a c1044a = (C1044a) view.getLayoutParams();
            C0478a8 c0478a8 = new C0478a8();
            c1044a.f4207l0 = c0478a8;
            c1044a.f4182Y = true;
            c0478a8.m1163B(c1044a.f4175R);
        }
        if (view instanceof AbstractC1049c) {
            AbstractC1049c abstractC1049c = (AbstractC1049c) view;
            abstractC1049c.m2421g();
            ((C1044a) view.getLayoutParams()).f4183Z = true;
            ArrayList<AbstractC1049c> arrayList = this.f4144b;
            if (!arrayList.contains(abstractC1049c)) {
                arrayList.add(abstractC1049c);
            }
        }
        this.f4143a.put(view.getId(), view);
        this.f4150h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f4143a.remove(view.getId());
        C0240N3 c0240n3M2409b = m2409b(view);
        this.f4145c.f2295e0.remove(c0240n3M2409b);
        c0240n3M2409b.f793K = null;
        this.f4144b.remove(view);
        this.f4150h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4150h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C1051e c1051e) {
        this.f4152j = c1051e;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray<View> sparseArray = this.f4143a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f4149g) {
            return;
        }
        this.f4149g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f4148f) {
            return;
        }
        this.f4148f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f4147e) {
            return;
        }
        this.f4147e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f4146d) {
            return;
        }
        this.f4146d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0276P3 abstractC0276P3) {
        C1050d c1050d = this.f4153k;
        if (c1050d != null) {
            c1050d.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f4151i = i;
        this.f4145c.f938q0 = i;
        C0029B9.f93p = (i & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1044a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4143a = new SparseArray<>();
        this.f4144b = new ArrayList<>(4);
        this.f4145c = new C0258O3();
        this.f4146d = 0;
        this.f4147e = 0;
        this.f4148f = Integer.MAX_VALUE;
        this.f4149g = Integer.MAX_VALUE;
        this.f4150h = true;
        this.f4151i = 263;
        this.f4152j = null;
        this.f4153k = null;
        this.f4154l = -1;
        this.f4155m = new HashMap<>();
        this.f4156n = new SparseArray<>();
        this.f4157o = new C1045b(this);
        m2410c(attributeSet, i);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C1044a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A */
        public float f4158A;

        /* JADX INFO: renamed from: B */
        public String f4159B;

        /* JADX INFO: renamed from: C */
        public final int f4160C;

        /* JADX INFO: renamed from: D */
        public float f4161D;

        /* JADX INFO: renamed from: E */
        public float f4162E;

        /* JADX INFO: renamed from: F */
        public int f4163F;

        /* JADX INFO: renamed from: G */
        public int f4164G;

        /* JADX INFO: renamed from: H */
        public int f4165H;

        /* JADX INFO: renamed from: I */
        public int f4166I;

        /* JADX INFO: renamed from: J */
        public int f4167J;

        /* JADX INFO: renamed from: K */
        public int f4168K;

        /* JADX INFO: renamed from: L */
        public int f4169L;

        /* JADX INFO: renamed from: M */
        public int f4170M;

        /* JADX INFO: renamed from: N */
        public float f4171N;

        /* JADX INFO: renamed from: O */
        public float f4172O;

        /* JADX INFO: renamed from: P */
        public int f4173P;

        /* JADX INFO: renamed from: Q */
        public int f4174Q;

        /* JADX INFO: renamed from: R */
        public int f4175R;

        /* JADX INFO: renamed from: S */
        public boolean f4176S;

        /* JADX INFO: renamed from: T */
        public boolean f4177T;

        /* JADX INFO: renamed from: U */
        public String f4178U;

        /* JADX INFO: renamed from: V */
        public boolean f4179V;

        /* JADX INFO: renamed from: W */
        public boolean f4180W;

        /* JADX INFO: renamed from: X */
        public boolean f4181X;

        /* JADX INFO: renamed from: Y */
        public boolean f4182Y;

        /* JADX INFO: renamed from: Z */
        public boolean f4183Z;

        /* JADX INFO: renamed from: a */
        public int f4184a;

        /* JADX INFO: renamed from: a0 */
        public boolean f4185a0;

        /* JADX INFO: renamed from: b */
        public int f4186b;

        /* JADX INFO: renamed from: b0 */
        public int f4187b0;

        /* JADX INFO: renamed from: c */
        public float f4188c;

        /* JADX INFO: renamed from: c0 */
        public int f4189c0;

        /* JADX INFO: renamed from: d */
        public int f4190d;

        /* JADX INFO: renamed from: d0 */
        public int f4191d0;

        /* JADX INFO: renamed from: e */
        public int f4192e;

        /* JADX INFO: renamed from: e0 */
        public int f4193e0;

        /* JADX INFO: renamed from: f */
        public int f4194f;

        /* JADX INFO: renamed from: f0 */
        public int f4195f0;

        /* JADX INFO: renamed from: g */
        public int f4196g;

        /* JADX INFO: renamed from: g0 */
        public int f4197g0;

        /* JADX INFO: renamed from: h */
        public int f4198h;

        /* JADX INFO: renamed from: h0 */
        public float f4199h0;

        /* JADX INFO: renamed from: i */
        public int f4200i;

        /* JADX INFO: renamed from: i0 */
        public int f4201i0;

        /* JADX INFO: renamed from: j */
        public int f4202j;

        /* JADX INFO: renamed from: j0 */
        public int f4203j0;

        /* JADX INFO: renamed from: k */
        public int f4204k;

        /* JADX INFO: renamed from: k0 */
        public float f4205k0;

        /* JADX INFO: renamed from: l */
        public int f4206l;

        /* JADX INFO: renamed from: l0 */
        public C0240N3 f4207l0;

        /* JADX INFO: renamed from: m */
        public int f4208m;

        /* JADX INFO: renamed from: n */
        public int f4209n;

        /* JADX INFO: renamed from: o */
        public float f4210o;

        /* JADX INFO: renamed from: p */
        public int f4211p;

        /* JADX INFO: renamed from: q */
        public int f4212q;

        /* JADX INFO: renamed from: r */
        public int f4213r;

        /* JADX INFO: renamed from: s */
        public int f4214s;

        /* JADX INFO: renamed from: t */
        public final int f4215t;

        /* JADX INFO: renamed from: u */
        public int f4216u;

        /* JADX INFO: renamed from: v */
        public final int f4217v;

        /* JADX INFO: renamed from: w */
        public int f4218w;

        /* JADX INFO: renamed from: x */
        public int f4219x;

        /* JADX INFO: renamed from: y */
        public int f4220y;

        /* JADX INFO: renamed from: z */
        public float f4221z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public static final SparseIntArray f4222a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f4222a = sparseIntArray;
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(C1046R.styleable.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1044a(Context context, AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            this.f4184a = -1;
            this.f4186b = -1;
            this.f4188c = -1.0f;
            this.f4190d = -1;
            this.f4192e = -1;
            this.f4194f = -1;
            this.f4196g = -1;
            this.f4198h = -1;
            this.f4200i = -1;
            this.f4202j = -1;
            this.f4204k = -1;
            this.f4206l = -1;
            this.f4208m = -1;
            this.f4209n = 0;
            this.f4210o = 0.0f;
            this.f4211p = -1;
            this.f4212q = -1;
            this.f4213r = -1;
            this.f4214s = -1;
            this.f4215t = -1;
            this.f4216u = -1;
            this.f4217v = -1;
            this.f4218w = -1;
            this.f4219x = -1;
            this.f4220y = -1;
            this.f4221z = 0.5f;
            this.f4158A = 0.5f;
            this.f4159B = null;
            this.f4160C = 1;
            this.f4161D = -1.0f;
            this.f4162E = -1.0f;
            this.f4163F = 0;
            this.f4164G = 0;
            this.f4165H = 0;
            this.f4166I = 0;
            this.f4167J = 0;
            this.f4168K = 0;
            this.f4169L = 0;
            this.f4170M = 0;
            this.f4171N = 1.0f;
            this.f4172O = 1.0f;
            this.f4173P = -1;
            this.f4174Q = -1;
            this.f4175R = -1;
            this.f4176S = false;
            this.f4177T = false;
            this.f4178U = null;
            this.f4179V = true;
            this.f4180W = true;
            this.f4181X = false;
            this.f4182Y = false;
            this.f4183Z = false;
            this.f4185a0 = false;
            this.f4187b0 = -1;
            this.f4189c0 = -1;
            this.f4191d0 = -1;
            this.f4193e0 = -1;
            this.f4195f0 = -1;
            this.f4197g0 = -1;
            this.f4199h0 = 0.5f;
            this.f4207l0 = new C0240N3();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1046R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = a.f4222a.get(index);
                switch (i3) {
                    case 1:
                        this.f4175R = typedArrayObtainStyledAttributes.getInt(index, this.f4175R);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4208m);
                        this.f4208m = resourceId;
                        if (resourceId == -1) {
                            this.f4208m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f4209n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4209n);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.f4210o) % 360.0f;
                        this.f4210o = f;
                        if (f < 0.0f) {
                            this.f4210o = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f4184a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4184a);
                        break;
                    case 6:
                        this.f4186b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4186b);
                        break;
                    case 7:
                        this.f4188c = typedArrayObtainStyledAttributes.getFloat(index, this.f4188c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4190d);
                        this.f4190d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f4190d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4192e);
                        this.f4192e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f4192e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4194f);
                        this.f4194f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f4194f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4196g);
                        this.f4196g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f4196g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4198h);
                        this.f4198h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f4198h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4200i);
                        this.f4200i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f4200i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4202j);
                        this.f4202j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f4202j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4204k);
                        this.f4204k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f4204k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4206l);
                        this.f4206l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f4206l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4211p);
                        this.f4211p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f4211p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4212q);
                        this.f4212q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f4212q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4213r);
                        this.f4213r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f4213r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4214s);
                        this.f4214s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f4214s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f4215t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4215t);
                        break;
                    case 22:
                        this.f4216u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4216u);
                        break;
                    case 23:
                        this.f4217v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4217v);
                        break;
                    case 24:
                        this.f4218w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4218w);
                        break;
                    case 25:
                        this.f4219x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4219x);
                        break;
                    case 26:
                        this.f4220y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4220y);
                        break;
                    case 27:
                        this.f4176S = typedArrayObtainStyledAttributes.getBoolean(index, this.f4176S);
                        break;
                    case 28:
                        this.f4177T = typedArrayObtainStyledAttributes.getBoolean(index, this.f4177T);
                        break;
                    case 29:
                        this.f4221z = typedArrayObtainStyledAttributes.getFloat(index, this.f4221z);
                        break;
                    case 30:
                        this.f4158A = typedArrayObtainStyledAttributes.getFloat(index, this.f4158A);
                        break;
                    case 31:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f4165H = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f4166I = i5;
                        if (i5 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f4167J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4167J);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f4167J) == -2) {
                                this.f4167J = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f4169L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4169L);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f4169L) == -2) {
                                this.f4169L = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f4171N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f4171N));
                        this.f4165H = 2;
                        break;
                    case 36:
                        try {
                            this.f4168K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4168K);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f4168K) == -2) {
                                this.f4168K = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f4170M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4170M);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f4170M) == -2) {
                                this.f4170M = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f4172O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f4172O));
                        this.f4166I = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f4159B = string;
                                this.f4160C = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f4159B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String strSubstring = this.f4159B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f4160C = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f4160C = 1;
                                        }
                                        i = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f4159B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.f4159B.substring(i);
                                        if (strSubstring2.length() > 0) {
                                            Float.parseFloat(strSubstring2);
                                        }
                                    } else {
                                        String strSubstring3 = this.f4159B.substring(i, iIndexOf2);
                                        String strSubstring4 = this.f4159B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f2 = Float.parseFloat(strSubstring3);
                                                float f3 = Float.parseFloat(strSubstring4);
                                                if (f2 > 0.0f && f3 > 0.0f) {
                                                    if (this.f4160C == 1) {
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
                                this.f4161D = typedArrayObtainStyledAttributes.getFloat(index, this.f4161D);
                                break;
                            case 46:
                                this.f4162E = typedArrayObtainStyledAttributes.getFloat(index, this.f4162E);
                                break;
                            case 47:
                                this.f4163F = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f4164G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f4173P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4173P);
                                break;
                            case 50:
                                this.f4174Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4174Q);
                                break;
                            case 51:
                                this.f4178U = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            m2413a();
        }

        /* JADX INFO: renamed from: a */
        public final void m2413a() {
            this.f4182Y = false;
            this.f4179V = true;
            this.f4180W = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f4176S) {
                this.f4179V = false;
                if (this.f4165H == 0) {
                    this.f4165H = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f4177T) {
                this.f4180W = false;
                if (this.f4166I == 0) {
                    this.f4166I = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f4179V = false;
                if (i == 0 && this.f4165H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f4176S = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f4180W = false;
                if (i2 == 0 && this.f4166I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f4177T = true;
                }
            }
            if (this.f4188c == -1.0f && this.f4184a == -1 && this.f4186b == -1) {
                return;
            }
            this.f4182Y = true;
            this.f4179V = true;
            this.f4180W = true;
            if (!(this.f4207l0 instanceof C0478a8)) {
                this.f4207l0 = new C0478a8();
            }
            ((C0478a8) this.f4207l0).m1163B(this.f4175R);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.f4191d0 = -1;
            this.f4193e0 = -1;
            this.f4187b0 = -1;
            this.f4189c0 = -1;
            this.f4195f0 = this.f4215t;
            this.f4197g0 = this.f4217v;
            float f = this.f4221z;
            this.f4199h0 = f;
            int i8 = this.f4184a;
            this.f4201i0 = i8;
            int i9 = this.f4186b;
            this.f4203j0 = i9;
            float f2 = this.f4188c;
            this.f4205k0 = f2;
            if (z2) {
                int i10 = this.f4211p;
                if (i10 != -1) {
                    this.f4191d0 = i10;
                } else {
                    int i11 = this.f4212q;
                    if (i11 != -1) {
                        this.f4193e0 = i11;
                    }
                    i2 = this.f4213r;
                    if (i2 != -1) {
                        this.f4189c0 = i2;
                        z = true;
                    }
                    i3 = this.f4214s;
                    if (i3 != -1) {
                        this.f4187b0 = i3;
                        z = true;
                    }
                    i4 = this.f4219x;
                    if (i4 != -1) {
                        this.f4197g0 = i4;
                    }
                    i5 = this.f4220y;
                    if (i5 != -1) {
                        this.f4195f0 = i5;
                    }
                    if (z) {
                        this.f4199h0 = 1.0f - f;
                    }
                    if (this.f4182Y && this.f4175R == 1) {
                        if (f2 == -1.0f) {
                            this.f4205k0 = 1.0f - f2;
                            this.f4201i0 = -1;
                            this.f4203j0 = -1;
                        } else if (i8 != -1) {
                            this.f4203j0 = i8;
                            this.f4201i0 = -1;
                            this.f4205k0 = -1.0f;
                        } else if (i9 != -1) {
                            this.f4201i0 = i9;
                            this.f4203j0 = -1;
                            this.f4205k0 = -1.0f;
                        }
                    }
                }
                z = true;
                i2 = this.f4213r;
                if (i2 != -1) {
                }
                i3 = this.f4214s;
                if (i3 != -1) {
                }
                i4 = this.f4219x;
                if (i4 != -1) {
                }
                i5 = this.f4220y;
                if (i5 != -1) {
                }
                if (z) {
                }
                if (this.f4182Y) {
                    if (f2 == -1.0f) {
                    }
                }
            } else {
                int i12 = this.f4211p;
                if (i12 != -1) {
                    this.f4189c0 = i12;
                }
                int i13 = this.f4212q;
                if (i13 != -1) {
                    this.f4187b0 = i13;
                }
                int i14 = this.f4213r;
                if (i14 != -1) {
                    this.f4191d0 = i14;
                }
                int i15 = this.f4214s;
                if (i15 != -1) {
                    this.f4193e0 = i15;
                }
                int i16 = this.f4219x;
                if (i16 != -1) {
                    this.f4195f0 = i16;
                }
                int i17 = this.f4220y;
                if (i17 != -1) {
                    this.f4197g0 = i17;
                }
            }
            if (this.f4213r == -1 && this.f4214s == -1 && this.f4212q == -1 && this.f4211p == -1) {
                int i18 = this.f4194f;
                if (i18 != -1) {
                    this.f4191d0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.f4196g;
                    if (i19 != -1) {
                        this.f4193e0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.f4190d;
                if (i20 != -1) {
                    this.f4187b0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.f4192e;
                if (i21 != -1) {
                    this.f4189c0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public C1044a() {
            super(-2, -2);
            this.f4184a = -1;
            this.f4186b = -1;
            this.f4188c = -1.0f;
            this.f4190d = -1;
            this.f4192e = -1;
            this.f4194f = -1;
            this.f4196g = -1;
            this.f4198h = -1;
            this.f4200i = -1;
            this.f4202j = -1;
            this.f4204k = -1;
            this.f4206l = -1;
            this.f4208m = -1;
            this.f4209n = 0;
            this.f4210o = 0.0f;
            this.f4211p = -1;
            this.f4212q = -1;
            this.f4213r = -1;
            this.f4214s = -1;
            this.f4215t = -1;
            this.f4216u = -1;
            this.f4217v = -1;
            this.f4218w = -1;
            this.f4219x = -1;
            this.f4220y = -1;
            this.f4221z = 0.5f;
            this.f4158A = 0.5f;
            this.f4159B = null;
            this.f4160C = 1;
            this.f4161D = -1.0f;
            this.f4162E = -1.0f;
            this.f4163F = 0;
            this.f4164G = 0;
            this.f4165H = 0;
            this.f4166I = 0;
            this.f4167J = 0;
            this.f4168K = 0;
            this.f4169L = 0;
            this.f4170M = 0;
            this.f4171N = 1.0f;
            this.f4172O = 1.0f;
            this.f4173P = -1;
            this.f4174Q = -1;
            this.f4175R = -1;
            this.f4176S = false;
            this.f4177T = false;
            this.f4178U = null;
            this.f4179V = true;
            this.f4180W = true;
            this.f4181X = false;
            this.f4182Y = false;
            this.f4183Z = false;
            this.f4185a0 = false;
            this.f4187b0 = -1;
            this.f4189c0 = -1;
            this.f4191d0 = -1;
            this.f4193e0 = -1;
            this.f4195f0 = -1;
            this.f4197g0 = -1;
            this.f4199h0 = 0.5f;
            this.f4207l0 = new C0240N3();
        }

        public C1044a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4184a = -1;
            this.f4186b = -1;
            this.f4188c = -1.0f;
            this.f4190d = -1;
            this.f4192e = -1;
            this.f4194f = -1;
            this.f4196g = -1;
            this.f4198h = -1;
            this.f4200i = -1;
            this.f4202j = -1;
            this.f4204k = -1;
            this.f4206l = -1;
            this.f4208m = -1;
            this.f4209n = 0;
            this.f4210o = 0.0f;
            this.f4211p = -1;
            this.f4212q = -1;
            this.f4213r = -1;
            this.f4214s = -1;
            this.f4215t = -1;
            this.f4216u = -1;
            this.f4217v = -1;
            this.f4218w = -1;
            this.f4219x = -1;
            this.f4220y = -1;
            this.f4221z = 0.5f;
            this.f4158A = 0.5f;
            this.f4159B = null;
            this.f4160C = 1;
            this.f4161D = -1.0f;
            this.f4162E = -1.0f;
            this.f4163F = 0;
            this.f4164G = 0;
            this.f4165H = 0;
            this.f4166I = 0;
            this.f4167J = 0;
            this.f4168K = 0;
            this.f4169L = 0;
            this.f4170M = 0;
            this.f4171N = 1.0f;
            this.f4172O = 1.0f;
            this.f4173P = -1;
            this.f4174Q = -1;
            this.f4175R = -1;
            this.f4176S = false;
            this.f4177T = false;
            this.f4178U = null;
            this.f4179V = true;
            this.f4180W = true;
            this.f4181X = false;
            this.f4182Y = false;
            this.f4183Z = false;
            this.f4185a0 = false;
            this.f4187b0 = -1;
            this.f4189c0 = -1;
            this.f4191d0 = -1;
            this.f4193e0 = -1;
            this.f4195f0 = -1;
            this.f4197g0 = -1;
            this.f4199h0 = 0.5f;
            this.f4207l0 = new C0240N3();
        }
    }
}
