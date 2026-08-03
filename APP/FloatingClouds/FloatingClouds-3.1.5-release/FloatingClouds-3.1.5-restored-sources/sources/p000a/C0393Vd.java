package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.C1247R;

/* JADX INFO: renamed from: a.Vd */
/* JADX INFO: loaded from: classes.dex */
public final class C0393Vd {

    /* JADX INFO: renamed from: a */
    public C0889w1 f1482a = new C0014Ad();

    /* JADX INFO: renamed from: b */
    public C0889w1 f1483b = new C0014Ad();

    /* JADX INFO: renamed from: c */
    public C0889w1 f1484c = new C0014Ad();

    /* JADX INFO: renamed from: d */
    public C0889w1 f1485d = new C0014Ad();

    /* JADX INFO: renamed from: e */
    public InterfaceC0892w4 f1486e = new C0811s(0.0f);

    /* JADX INFO: renamed from: f */
    public InterfaceC0892w4 f1487f = new C0811s(0.0f);

    /* JADX INFO: renamed from: g */
    public InterfaceC0892w4 f1488g = new C0811s(0.0f);

    /* JADX INFO: renamed from: h */
    public InterfaceC0892w4 f1489h = new C0811s(0.0f);

    /* JADX INFO: renamed from: i */
    public C0134H5 f1490i = new C0134H5();

    /* JADX INFO: renamed from: j */
    public C0134H5 f1491j = new C0134H5();

    /* JADX INFO: renamed from: k */
    public C0134H5 f1492k = new C0134H5();

    /* JADX INFO: renamed from: l */
    public C0134H5 f1493l = new C0134H5();

    /* JADX INFO: renamed from: a.Vd$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public C0889w1 f1494a = new C0014Ad();

        /* JADX INFO: renamed from: b */
        public C0889w1 f1495b = new C0014Ad();

        /* JADX INFO: renamed from: c */
        public C0889w1 f1496c = new C0014Ad();

        /* JADX INFO: renamed from: d */
        public C0889w1 f1497d = new C0014Ad();

        /* JADX INFO: renamed from: e */
        public InterfaceC0892w4 f1498e = new C0811s(0.0f);

        /* JADX INFO: renamed from: f */
        public InterfaceC0892w4 f1499f = new C0811s(0.0f);

        /* JADX INFO: renamed from: g */
        public InterfaceC0892w4 f1500g = new C0811s(0.0f);

        /* JADX INFO: renamed from: h */
        public InterfaceC0892w4 f1501h = new C0811s(0.0f);

        /* JADX INFO: renamed from: i */
        public C0134H5 f1502i = new C0134H5();

        /* JADX INFO: renamed from: j */
        public C0134H5 f1503j = new C0134H5();

        /* JADX INFO: renamed from: k */
        public C0134H5 f1504k = new C0134H5();

        /* JADX INFO: renamed from: l */
        public C0134H5 f1505l = new C0134H5();

        /* JADX INFO: renamed from: b */
        public static float m1027b(C0889w1 c0889w1) {
            if (c0889w1 instanceof C0014Ad) {
                ((C0014Ad) c0889w1).getClass();
                return -1.0f;
            }
            if (c0889w1 instanceof C0079E4) {
                ((C0079E4) c0889w1).getClass();
            }
            return -1.0f;
        }

        /* JADX INFO: renamed from: a */
        public final C0393Vd m1028a() {
            C0393Vd c0393Vd = new C0393Vd();
            c0393Vd.f1482a = this.f1494a;
            c0393Vd.f1483b = this.f1495b;
            c0393Vd.f1484c = this.f1496c;
            c0393Vd.f1485d = this.f1497d;
            c0393Vd.f1486e = this.f1498e;
            c0393Vd.f1487f = this.f1499f;
            c0393Vd.f1488g = this.f1500g;
            c0393Vd.f1489h = this.f1501h;
            c0393Vd.f1490i = this.f1502i;
            c0393Vd.f1491j = this.f1503j;
            c0393Vd.f1492k = this.f1504k;
            c0393Vd.f1493l = this.f1505l;
            return c0393Vd;
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m1022a(Context context, int i, int i2, C0811s c0811s) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C1247R.styleable.ShapeAppearance);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.ShapeAppearance_cornerFamily, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i3);
            InterfaceC0892w4 interfaceC0892w4M1024c = m1024c(typedArrayObtainStyledAttributes, C1247R.styleable.ShapeAppearance_cornerSize, c0811s);
            InterfaceC0892w4 interfaceC0892w4M1024c2 = m1024c(typedArrayObtainStyledAttributes, C1247R.styleable.ShapeAppearance_cornerSizeTopLeft, interfaceC0892w4M1024c);
            InterfaceC0892w4 interfaceC0892w4M1024c3 = m1024c(typedArrayObtainStyledAttributes, C1247R.styleable.ShapeAppearance_cornerSizeTopRight, interfaceC0892w4M1024c);
            InterfaceC0892w4 interfaceC0892w4M1024c4 = m1024c(typedArrayObtainStyledAttributes, C1247R.styleable.ShapeAppearance_cornerSizeBottomRight, interfaceC0892w4M1024c);
            InterfaceC0892w4 interfaceC0892w4M1024c5 = m1024c(typedArrayObtainStyledAttributes, C1247R.styleable.ShapeAppearance_cornerSizeBottomLeft, interfaceC0892w4M1024c);
            a aVar = new a();
            C0889w1 c0889w1M1669l = C0726n9.m1669l(i4);
            aVar.f1494a = c0889w1M1669l;
            a.m1027b(c0889w1M1669l);
            aVar.f1498e = interfaceC0892w4M1024c2;
            C0889w1 c0889w1M1669l2 = C0726n9.m1669l(i5);
            aVar.f1495b = c0889w1M1669l2;
            a.m1027b(c0889w1M1669l2);
            aVar.f1499f = interfaceC0892w4M1024c3;
            C0889w1 c0889w1M1669l3 = C0726n9.m1669l(i6);
            aVar.f1496c = c0889w1M1669l3;
            a.m1027b(c0889w1M1669l3);
            aVar.f1500g = interfaceC0892w4M1024c4;
            C0889w1 c0889w1M1669l4 = C0726n9.m1669l(i7);
            aVar.f1497d = c0889w1M1669l4;
            a.m1027b(c0889w1M1669l4);
            aVar.f1501h = interfaceC0892w4M1024c5;
            return aVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static a m1023b(Context context, AttributeSet attributeSet, int i, int i2) {
        C0811s c0811s = new C0811s(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1247R.styleable.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C1247R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m1022a(context, resourceId, resourceId2, c0811s);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0892w4 m1024c(TypedArray typedArray, int i, InterfaceC0892w4 interfaceC0892w4) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C0811s(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new C0428Xc(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC0892w4;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1025d(RectF rectF) {
        boolean z = this.f1493l.getClass().equals(C0134H5.class) && this.f1491j.getClass().equals(C0134H5.class) && this.f1490i.getClass().equals(C0134H5.class) && this.f1492k.getClass().equals(C0134H5.class);
        float fMo1073a = this.f1486e.mo1073a(rectF);
        return z && ((this.f1487f.mo1073a(rectF) > fMo1073a ? 1 : (this.f1487f.mo1073a(rectF) == fMo1073a ? 0 : -1)) == 0 && (this.f1489h.mo1073a(rectF) > fMo1073a ? 1 : (this.f1489h.mo1073a(rectF) == fMo1073a ? 0 : -1)) == 0 && (this.f1488g.mo1073a(rectF) > fMo1073a ? 1 : (this.f1488g.mo1073a(rectF) == fMo1073a ? 0 : -1)) == 0) && ((this.f1483b instanceof C0014Ad) && (this.f1482a instanceof C0014Ad) && (this.f1484c instanceof C0014Ad) && (this.f1485d instanceof C0014Ad));
    }

    /* JADX INFO: renamed from: e */
    public final a m1026e() {
        a aVar = new a();
        aVar.f1494a = new C0014Ad();
        aVar.f1495b = new C0014Ad();
        aVar.f1496c = new C0014Ad();
        aVar.f1497d = new C0014Ad();
        aVar.f1498e = new C0811s(0.0f);
        aVar.f1499f = new C0811s(0.0f);
        aVar.f1500g = new C0811s(0.0f);
        aVar.f1501h = new C0811s(0.0f);
        aVar.f1502i = new C0134H5();
        aVar.f1503j = new C0134H5();
        aVar.f1504k = new C0134H5();
        new C0134H5();
        aVar.f1494a = this.f1482a;
        aVar.f1495b = this.f1483b;
        aVar.f1496c = this.f1484c;
        aVar.f1497d = this.f1485d;
        aVar.f1498e = this.f1486e;
        aVar.f1499f = this.f1487f;
        aVar.f1500g = this.f1488g;
        aVar.f1501h = this.f1489h;
        aVar.f1502i = this.f1490i;
        aVar.f1503j = this.f1491j;
        aVar.f1504k = this.f1492k;
        aVar.f1505l = this.f1493l;
        return aVar;
    }
}
