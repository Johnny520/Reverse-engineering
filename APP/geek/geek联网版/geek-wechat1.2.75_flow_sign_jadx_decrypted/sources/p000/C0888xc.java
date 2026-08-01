package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.megatronking.stringfog.Base64;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: xc */
/* JADX INFO: loaded from: classes.dex */
public final class C0888xc {

    /* JADX INFO: renamed from: d */
    public static final int[] f5231d = {0, 4, 8};

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f5232e;

    /* JADX INFO: renamed from: a */
    public final HashMap f5233a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final boolean f5234b = true;

    /* JADX INFO: renamed from: c */
    public final HashMap f5235c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5232e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    /* JADX INFO: renamed from: c */
    public static int[] m2675c(C0512n7 c0512n7, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c0512n7.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC0910xy.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c0512n7.isInEditMode() && (c0512n7.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0512n7.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f375m;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f375m.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: d */
    public static C0702sc m2676d(Context context, AttributeSet attributeSet) {
        C0702sc c0702sc = new C0702sc();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0947yy.f5509a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            C0776uc c0776uc = c0702sc.f4296c;
            C0851wc c0851wc = c0702sc.f4298e;
            C0739tc c0739tc = c0702sc.f4297d;
            if (index != 1 && 23 != index && 24 != index) {
                c0776uc.getClass();
                c0739tc.getClass();
                c0851wc.getClass();
            }
            SparseIntArray sparseIntArray = f5232e;
            int i2 = sparseIntArray.get(index);
            C0813vc c0813vc = c0702sc.f4295b;
            switch (i2) {
                case Base64.NO_PADDING /* 1 */:
                    c0739tc.f4490o = m2677f(typedArrayObtainStyledAttributes, index, c0739tc.f4490o);
                    break;
                case Base64.NO_WRAP /* 2 */:
                    c0739tc.f4446F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4446F);
                    break;
                case 3:
                    c0739tc.f4489n = m2677f(typedArrayObtainStyledAttributes, index, c0739tc.f4489n);
                    break;
                case 4:
                    c0739tc.f4488m = m2677f(typedArrayObtainStyledAttributes, index, c0739tc.f4488m);
                    break;
                case 5:
                    c0739tc.f4497v = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c0739tc.f4501z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0739tc.f4501z);
                    break;
                case 7:
                    c0739tc.f4441A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0739tc.f4441A);
                    break;
                case 8:
                    c0739tc.f4447G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4447G);
                    break;
                case 9:
                    c0739tc.f4494s = m2677f(typedArrayObtainStyledAttributes, index, c0739tc.f4494s);
                    break;
                case 10:
                    c0739tc.f4493r = m2677f(typedArrayObtainStyledAttributes, index, c0739tc.f4493r);
                    break;
                case 11:
                    c0739tc.f4452L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4452L);
                    break;
                case 12:
                    c0739tc.f4453M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4453M);
                    break;
                case 13:
                    c0739tc.f4449I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4449I);
                    break;
                case 14:
                    c0739tc.f4451K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4451K);
                    break;
                case 15:
                    c0739tc.f4454N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4454N);
                    break;
                case 16:
                    c0739tc.f4450J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4450J);
                    break;
                case 17:
                    c0739tc.f4473d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0739tc.f4473d);
                    break;
                case 18:
                    c0739tc.f4475e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0739tc.f4475e);
                    break;
                case 19:
                    c0739tc.f4477f = typedArrayObtainStyledAttributes.getFloat(index, c0739tc.f4477f);
                    break;
                case 20:
                    c0739tc.f4495t = typedArrayObtainStyledAttributes.getFloat(index, c0739tc.f4495t);
                    break;
                case 21:
                    c0739tc.f4471c = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0739tc.f4471c);
                    break;
                case 22:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, c0813vc.f4936a);
                    c0813vc.f4936a = i3;
                    c0813vc.f4936a = f5231d[i3];
                    break;
                case 23:
                    c0739tc.f4469b = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0739tc.f4469b);
                    break;
                case 24:
                    c0739tc.f4443C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4443C);
                    break;
                case 25:
                    c0739tc.f4479g = m2677f(typedArrayObtainStyledAttributes, index, c0739tc.f4479g);
                    break;
                case 26:
                    c0739tc.f4481h = m2677f(typedArrayObtainStyledAttributes, index, c0739tc.f4481h);
                    break;
                case 27:
                    c0739tc.f4442B = typedArrayObtainStyledAttributes.getInt(index, c0739tc.f4442B);
                    break;
                case 28:
                    c0739tc.f4444D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4444D);
                    break;
                case 29:
                    c0739tc.f4483i = m2677f(typedArrayObtainStyledAttributes, index, c0739tc.f4483i);
                    break;
                case 30:
                    c0739tc.f4485j = m2677f(typedArrayObtainStyledAttributes, index, c0739tc.f4485j);
                    break;
                case 31:
                    c0739tc.f4448H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4448H);
                    break;
                case 32:
                    c0739tc.f4491p = m2677f(typedArrayObtainStyledAttributes, index, c0739tc.f4491p);
                    break;
                case 33:
                    c0739tc.f4492q = m2677f(typedArrayObtainStyledAttributes, index, c0739tc.f4492q);
                    break;
                case 34:
                    c0739tc.f4445E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4445E);
                    break;
                case 35:
                    c0739tc.f4487l = m2677f(typedArrayObtainStyledAttributes, index, c0739tc.f4487l);
                    break;
                case 36:
                    c0739tc.f4486k = m2677f(typedArrayObtainStyledAttributes, index, c0739tc.f4486k);
                    break;
                case 37:
                    c0739tc.f4496u = typedArrayObtainStyledAttributes.getFloat(index, c0739tc.f4496u);
                    break;
                case 38:
                    c0702sc.f4294a = typedArrayObtainStyledAttributes.getResourceId(index, c0702sc.f4294a);
                    break;
                case 39:
                    c0739tc.f4456P = typedArrayObtainStyledAttributes.getFloat(index, c0739tc.f4456P);
                    break;
                case 40:
                    c0739tc.f4455O = typedArrayObtainStyledAttributes.getFloat(index, c0739tc.f4455O);
                    break;
                case 41:
                    c0739tc.f4457Q = typedArrayObtainStyledAttributes.getInt(index, c0739tc.f4457Q);
                    break;
                case 42:
                    c0739tc.f4458R = typedArrayObtainStyledAttributes.getInt(index, c0739tc.f4458R);
                    break;
                case 43:
                    c0813vc.f4938c = typedArrayObtainStyledAttributes.getFloat(index, c0813vc.f4938c);
                    break;
                case 44:
                    c0851wc.f5091k = true;
                    c0851wc.f5092l = typedArrayObtainStyledAttributes.getDimension(index, c0851wc.f5092l);
                    break;
                case 45:
                    c0851wc.f5082b = typedArrayObtainStyledAttributes.getFloat(index, c0851wc.f5082b);
                    break;
                case 46:
                    c0851wc.f5083c = typedArrayObtainStyledAttributes.getFloat(index, c0851wc.f5083c);
                    break;
                case 47:
                    c0851wc.f5084d = typedArrayObtainStyledAttributes.getFloat(index, c0851wc.f5084d);
                    break;
                case 48:
                    c0851wc.f5085e = typedArrayObtainStyledAttributes.getFloat(index, c0851wc.f5085e);
                    break;
                case 49:
                    c0851wc.f5086f = typedArrayObtainStyledAttributes.getDimension(index, c0851wc.f5086f);
                    break;
                case 50:
                    c0851wc.f5087g = typedArrayObtainStyledAttributes.getDimension(index, c0851wc.f5087g);
                    break;
                case 51:
                    c0851wc.f5088h = typedArrayObtainStyledAttributes.getDimension(index, c0851wc.f5088h);
                    break;
                case 52:
                    c0851wc.f5089i = typedArrayObtainStyledAttributes.getDimension(index, c0851wc.f5089i);
                    break;
                case 53:
                    c0851wc.f5090j = typedArrayObtainStyledAttributes.getDimension(index, c0851wc.f5090j);
                    break;
                case 54:
                    c0739tc.f4459S = typedArrayObtainStyledAttributes.getInt(index, c0739tc.f4459S);
                    break;
                case 55:
                    c0739tc.f4460T = typedArrayObtainStyledAttributes.getInt(index, c0739tc.f4460T);
                    break;
                case 56:
                    c0739tc.f4461U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4461U);
                    break;
                case 57:
                    c0739tc.f4462V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4462V);
                    break;
                case 58:
                    c0739tc.f4463W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4463W);
                    break;
                case 59:
                    c0739tc.f4464X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4464X);
                    break;
                case 60:
                    c0851wc.f5081a = typedArrayObtainStyledAttributes.getFloat(index, c0851wc.f5081a);
                    break;
                case 61:
                    c0739tc.f4498w = m2677f(typedArrayObtainStyledAttributes, index, c0739tc.f4498w);
                    break;
                case 62:
                    c0739tc.f4499x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4499x);
                    break;
                case 63:
                    c0739tc.f4500y = typedArrayObtainStyledAttributes.getFloat(index, c0739tc.f4500y);
                    break;
                case 64:
                    c0776uc.f4810a = m2677f(typedArrayObtainStyledAttributes, index, c0776uc.f4810a);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        c0776uc.getClass();
                    } else {
                        String str = AbstractC0259gf.f1968m[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        c0776uc.getClass();
                    }
                    break;
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0776uc.getClass();
                    break;
                case 67:
                    c0776uc.f4813d = typedArrayObtainStyledAttributes.getFloat(index, c0776uc.f4813d);
                    break;
                case 68:
                    c0813vc.f4939d = typedArrayObtainStyledAttributes.getFloat(index, c0813vc.f4939d);
                    break;
                case 69:
                    c0739tc.f4465Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c0739tc.f4466Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0739tc.f4468a0 = typedArrayObtainStyledAttributes.getInt(index, c0739tc.f4468a0);
                    break;
                case 73:
                    c0739tc.f4470b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0739tc.f4470b0);
                    break;
                case 74:
                    c0739tc.f4476e0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c0739tc.f4484i0 = typedArrayObtainStyledAttributes.getBoolean(index, c0739tc.f4484i0);
                    break;
                case 76:
                    c0776uc.f4811b = typedArrayObtainStyledAttributes.getInt(index, c0776uc.f4811b);
                    break;
                case 77:
                    c0739tc.f4478f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c0813vc.f4937b = typedArrayObtainStyledAttributes.getInt(index, c0813vc.f4937b);
                    break;
                case 79:
                    c0776uc.f4812c = typedArrayObtainStyledAttributes.getFloat(index, c0776uc.f4812c);
                    break;
                case 80:
                    c0739tc.f4480g0 = typedArrayObtainStyledAttributes.getBoolean(index, c0739tc.f4480g0);
                    break;
                case 81:
                    c0739tc.f4482h0 = typedArrayObtainStyledAttributes.getBoolean(index, c0739tc.f4482h0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c0702sc;
    }

    /* JADX INFO: renamed from: f */
    public static int m2677f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    public final void m2678a(ConstraintLayout constraintLayout) {
        int i;
        HashSet hashSet;
        int i2;
        int i3;
        String resourceEntryName;
        C0888xc c0888xc = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c0888xc.f5235c;
        HashSet<Integer> hashSet2 = new HashSet(map.keySet());
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c0888xc.f5234b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        C0702sc c0702sc = (C0702sc) map.get(Integer.valueOf(id));
                        if (childAt instanceof C0512n7) {
                            c0702sc.f4297d.f4472c0 = 1;
                        }
                        C0739tc c0739tc = c0702sc.f4297d;
                        C0813vc c0813vc = c0702sc.f4295b;
                        C0851wc c0851wc = c0702sc.f4298e;
                        int i5 = c0739tc.f4472c0;
                        if (i5 != -1 && i5 == 1) {
                            C0512n7 c0512n7 = (C0512n7) childAt;
                            c0512n7.setId(id);
                            c0512n7.setType(c0739tc.f4468a0);
                            c0512n7.setMargin(c0739tc.f4470b0);
                            c0512n7.setAllowsGoneWidget(c0739tc.f4484i0);
                            int[] iArr = c0739tc.f4474d0;
                            if (iArr != null) {
                                c0512n7.setReferencedIds(iArr);
                            } else {
                                String str = c0739tc.f4476e0;
                                if (str != null) {
                                    int[] iArrM2675c = m2675c(c0512n7, str);
                                    c0739tc.f4474d0 = iArrM2675c;
                                    c0512n7.setReferencedIds(iArrM2675c);
                                }
                            }
                        }
                        C0591pc c0591pc = (C0591pc) childAt.getLayoutParams();
                        c0591pc.m2083a();
                        c0702sc.m2362a(c0591pc);
                        HashMap map2 = c0702sc.f4299f;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : map2.keySet()) {
                            C0480mc c0480mc = (C0480mc) map2.get(str2);
                            int i6 = childCount;
                            String strM1155r = g40.m1155r("set", str2);
                            HashSet hashSet3 = hashSet2;
                            try {
                                int iM1158u = g40.m1158u(c0480mc.f3119a);
                                Class cls2 = Integer.TYPE;
                                Class cls3 = Float.TYPE;
                                switch (iM1158u) {
                                    case Base64.DEFAULT /* 0 */:
                                        i3 = i4;
                                        cls.getMethod(strM1155r, cls2).invoke(childAt, Integer.valueOf(c0480mc.f3120b));
                                        break;
                                    case Base64.NO_PADDING /* 1 */:
                                        i3 = i4;
                                        cls.getMethod(strM1155r, cls3).invoke(childAt, Float.valueOf(c0480mc.f3121c));
                                        break;
                                    case Base64.NO_WRAP /* 2 */:
                                        i3 = i4;
                                        cls.getMethod(strM1155r, cls2).invoke(childAt, Integer.valueOf(c0480mc.f3124f));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strM1155r, Drawable.class);
                                        i3 = i4;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c0480mc.f3124f);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException e) {
                                            e = e;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                        } catch (NoSuchMethodException e2) {
                                            e = e2;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strM1155r);
                                        } catch (InvocationTargetException e3) {
                                            e = e3;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                        }
                                        break;
                                    case 4:
                                        cls.getMethod(strM1155r, CharSequence.class).invoke(childAt, c0480mc.f3122d);
                                        i3 = i4;
                                        break;
                                    case 5:
                                        cls.getMethod(strM1155r, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0480mc.f3123e));
                                        i3 = i4;
                                        break;
                                    case 6:
                                        cls.getMethod(strM1155r, cls3).invoke(childAt, Float.valueOf(c0480mc.f3121c));
                                        i3 = i4;
                                        break;
                                    default:
                                        i3 = i4;
                                        break;
                                }
                            } catch (IllegalAccessException e4) {
                                e = e4;
                                i3 = i4;
                            } catch (NoSuchMethodException e5) {
                                e = e5;
                                i3 = i4;
                            } catch (InvocationTargetException e6) {
                                e = e6;
                                i3 = i4;
                            }
                            childCount = i6;
                            hashSet2 = hashSet3;
                            i4 = i3;
                        }
                        i = childCount;
                        hashSet = hashSet2;
                        i2 = i4;
                        childAt.setLayoutParams(c0591pc);
                        if (c0813vc.f4937b == 0) {
                            childAt.setVisibility(c0813vc.f4936a);
                        }
                        childAt.setAlpha(c0813vc.f4938c);
                        childAt.setRotation(c0851wc.f5081a);
                        childAt.setRotationX(c0851wc.f5082b);
                        childAt.setRotationY(c0851wc.f5083c);
                        childAt.setScaleX(c0851wc.f5084d);
                        childAt.setScaleY(c0851wc.f5085e);
                        if (!Float.isNaN(c0851wc.f5086f)) {
                            childAt.setPivotX(c0851wc.f5086f);
                        }
                        if (!Float.isNaN(c0851wc.f5087g)) {
                            childAt.setPivotY(c0851wc.f5087g);
                        }
                        childAt.setTranslationX(c0851wc.f5088h);
                        childAt.setTranslationY(c0851wc.f5089i);
                        childAt.setTranslationZ(c0851wc.f5090j);
                        if (c0851wc.f5091k) {
                            childAt.setElevation(c0851wc.f5092l);
                        }
                    } else {
                        i = childCount;
                        hashSet = hashSet2;
                        i2 = i4;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i4 = i2 + 1;
                c0888xc = this;
                childCount = i;
                hashSet2 = hashSet;
            }
            i = childCount;
            hashSet = hashSet2;
            i2 = i4;
            i4 = i2 + 1;
            c0888xc = this;
            childCount = i;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            C0702sc c0702sc2 = (C0702sc) map.get(num);
            C0739tc c0739tc2 = c0702sc2.f4297d;
            int i7 = c0739tc2.f4472c0;
            if (i7 != -1 && i7 == 1) {
                Context context = constraintLayout.getContext();
                C0512n7 c0512n72 = new C0512n7(context);
                c0512n72.f3263a = new int[32];
                c0512n72.f3268f = new HashMap();
                c0512n72.f3265c = context;
                C0549o7 c0549o7 = new C0549o7();
                c0549o7.f3408f0 = 0;
                c0549o7.f3409g0 = true;
                c0549o7.f3410h0 = 0;
                c0512n72.f3238i = c0549o7;
                c0512n72.f3266d = c0549o7;
                c0512n72.m1942g();
                c0512n72.setVisibility(8);
                c0512n72.setId(num.intValue());
                int[] iArr2 = c0739tc2.f4474d0;
                if (iArr2 != null) {
                    c0512n72.setReferencedIds(iArr2);
                } else {
                    String str3 = c0739tc2.f4476e0;
                    if (str3 != null) {
                        int[] iArrM2675c2 = m2675c(c0512n72, str3);
                        c0739tc2.f4474d0 = iArrM2675c2;
                        c0512n72.setReferencedIds(iArrM2675c2);
                    }
                }
                c0512n72.setType(c0739tc2.f4468a0);
                c0512n72.setMargin(c0739tc2.f4470b0);
                C0591pc c0591pcM193a = ConstraintLayout.m193a();
                c0512n72.m1942g();
                c0702sc2.m2362a(c0591pcM193a);
                constraintLayout.addView(c0512n72, c0591pcM193a);
            }
            if (c0739tc2.f4467a) {
                View c0381jo = new C0381jo(constraintLayout.getContext());
                c0381jo.setId(num.intValue());
                C0591pc c0591pcM193a2 = ConstraintLayout.m193a();
                c0702sc2.m2362a(c0591pcM193a2);
                constraintLayout.addView(c0381jo, c0591pcM193a2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2679b(ConstraintLayout constraintLayout) {
        C0888xc c0888xc = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c0888xc.f5235c;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0591pc c0591pc = (C0591pc) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0888xc.f5234b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C0702sc());
            }
            C0702sc c0702sc = (C0702sc) map.get(Integer.valueOf(id));
            HashMap map2 = new HashMap();
            Class<?> cls = childAt.getClass();
            HashMap map3 = c0888xc.f5233a;
            for (String str : map3.keySet()) {
                C0480mc c0480mc = (C0480mc) map3.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map2.put(str, new C0480mc(c0480mc, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map2.put(str, new C0480mc(c0480mc, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e2) {
                    e2.printStackTrace();
                } catch (InvocationTargetException e3) {
                    e3.printStackTrace();
                }
            }
            c0702sc.f4299f = map2;
            C0813vc c0813vc = c0702sc.f4295b;
            C0739tc c0739tc = c0702sc.f4297d;
            C0851wc c0851wc = c0702sc.f4298e;
            c0702sc.f4294a = id;
            c0739tc.f4479g = c0591pc.f3674d;
            c0739tc.f4481h = c0591pc.f3676e;
            c0739tc.f4483i = c0591pc.f3678f;
            c0739tc.f4485j = c0591pc.f3680g;
            c0739tc.f4486k = c0591pc.f3682h;
            c0739tc.f4487l = c0591pc.f3684i;
            c0739tc.f4488m = c0591pc.f3686j;
            c0739tc.f4489n = c0591pc.f3688k;
            c0739tc.f4490o = c0591pc.f3690l;
            c0739tc.f4491p = c0591pc.f3694p;
            c0739tc.f4492q = c0591pc.f3695q;
            c0739tc.f4493r = c0591pc.f3696r;
            c0739tc.f4494s = c0591pc.f3697s;
            c0739tc.f4495t = c0591pc.f3704z;
            c0739tc.f4496u = c0591pc.f3642A;
            c0739tc.f4497v = c0591pc.f3643B;
            c0739tc.f4498w = c0591pc.f3691m;
            c0739tc.f4499x = c0591pc.f3692n;
            c0739tc.f4500y = c0591pc.f3693o;
            c0739tc.f4501z = c0591pc.f3657P;
            c0739tc.f4441A = c0591pc.f3658Q;
            c0739tc.f4442B = c0591pc.f3659R;
            c0739tc.f4477f = c0591pc.f3672c;
            c0739tc.f4473d = c0591pc.f3668a;
            c0739tc.f4475e = c0591pc.f3670b;
            c0739tc.f4469b = ((ViewGroup.MarginLayoutParams) c0591pc).width;
            c0739tc.f4471c = ((ViewGroup.MarginLayoutParams) c0591pc).height;
            c0739tc.f4443C = ((ViewGroup.MarginLayoutParams) c0591pc).leftMargin;
            c0739tc.f4444D = ((ViewGroup.MarginLayoutParams) c0591pc).rightMargin;
            c0739tc.f4445E = ((ViewGroup.MarginLayoutParams) c0591pc).topMargin;
            c0739tc.f4446F = ((ViewGroup.MarginLayoutParams) c0591pc).bottomMargin;
            c0739tc.f4455O = c0591pc.f3646E;
            c0739tc.f4456P = c0591pc.f3645D;
            c0739tc.f4458R = c0591pc.f3648G;
            c0739tc.f4457Q = c0591pc.f3647F;
            c0739tc.f4480g0 = c0591pc.f3660S;
            c0739tc.f4482h0 = c0591pc.f3661T;
            c0739tc.f4459S = c0591pc.f3649H;
            c0739tc.f4460T = c0591pc.f3650I;
            c0739tc.f4461U = c0591pc.f3653L;
            c0739tc.f4462V = c0591pc.f3654M;
            c0739tc.f4463W = c0591pc.f3651J;
            c0739tc.f4464X = c0591pc.f3652K;
            c0739tc.f4465Y = c0591pc.f3655N;
            c0739tc.f4466Z = c0591pc.f3656O;
            c0739tc.f4478f0 = c0591pc.f3662U;
            c0739tc.f4450J = c0591pc.f3699u;
            c0739tc.f4452L = c0591pc.f3701w;
            c0739tc.f4449I = c0591pc.f3698t;
            c0739tc.f4451K = c0591pc.f3700v;
            c0739tc.f4454N = c0591pc.f3702x;
            c0739tc.f4453M = c0591pc.f3703y;
            c0739tc.f4447G = c0591pc.getMarginEnd();
            c0739tc.f4448H = c0591pc.getMarginStart();
            c0813vc.f4936a = childAt.getVisibility();
            c0813vc.f4938c = childAt.getAlpha();
            c0851wc.f5081a = childAt.getRotation();
            c0851wc.f5082b = childAt.getRotationX();
            c0851wc.f5083c = childAt.getRotationY();
            c0851wc.f5084d = childAt.getScaleX();
            c0851wc.f5085e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                c0851wc.f5086f = pivotX;
                c0851wc.f5087g = pivotY;
            }
            c0851wc.f5088h = childAt.getTranslationX();
            c0851wc.f5089i = childAt.getTranslationY();
            c0851wc.f5090j = childAt.getTranslationZ();
            if (c0851wc.f5091k) {
                c0851wc.f5092l = childAt.getElevation();
            }
            if (childAt instanceof C0512n7) {
                C0512n7 c0512n7 = (C0512n7) childAt;
                c0739tc.f4484i0 = c0512n7.f3238i.f3409g0;
                c0739tc.f4474d0 = c0512n7.getReferencedIds();
                c0739tc.f4468a0 = c0512n7.getType();
                c0739tc.f4470b0 = c0512n7.getMargin();
            }
            i++;
            c0888xc = this;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2680e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0702sc c0702scM2676d = m2676d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c0702scM2676d.f4297d.f4467a = true;
                    }
                    this.f5235c.put(Integer.valueOf(c0702scM2676d.f4294a), c0702scM2676d);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
