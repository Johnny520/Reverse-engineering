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

/* JADX INFO: renamed from: oc */
/* JADX INFO: loaded from: classes.dex */
public final class C0554oc {

    /* JADX INFO: renamed from: d */
    public static final int[] f3524d = {0, 4, 8};

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f3525e;

    /* JADX INFO: renamed from: a */
    public final HashMap f3526a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final boolean f3527b = true;

    /* JADX INFO: renamed from: c */
    public final HashMap f3528c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3525e = sparseIntArray;
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
    public static int[] m2006c(C0141d7 c0141d7, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c0141d7.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC0651qy.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c0141d7.isInEditMode() && (c0141d7.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c0141d7.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f412m;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f412m.get(strTrim);
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
    public static C0369jc m2007d(Context context, AttributeSet attributeSet) {
        C0369jc c0369jc = new C0369jc();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0688ry.f4349a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            C0443lc c0443lc = c0369jc.f2615c;
            C0517nc c0517nc = c0369jc.f2617e;
            C0406kc c0406kc = c0369jc.f2616d;
            if (index != 1 && 23 != index && 24 != index) {
                c0443lc.getClass();
                c0406kc.getClass();
                c0517nc.getClass();
            }
            SparseIntArray sparseIntArray = f3525e;
            int i2 = sparseIntArray.get(index);
            C0480mc c0480mc = c0369jc.f2614b;
            switch (i2) {
                case Base64.NO_PADDING /* 1 */:
                    c0406kc.f2866o = m2008f(typedArrayObtainStyledAttributes, index, c0406kc.f2866o);
                    break;
                case Base64.NO_WRAP /* 2 */:
                    c0406kc.f2822F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2822F);
                    break;
                case 3:
                    c0406kc.f2865n = m2008f(typedArrayObtainStyledAttributes, index, c0406kc.f2865n);
                    break;
                case 4:
                    c0406kc.f2864m = m2008f(typedArrayObtainStyledAttributes, index, c0406kc.f2864m);
                    break;
                case 5:
                    c0406kc.f2873v = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c0406kc.f2877z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0406kc.f2877z);
                    break;
                case 7:
                    c0406kc.f2817A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0406kc.f2817A);
                    break;
                case 8:
                    c0406kc.f2823G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2823G);
                    break;
                case 9:
                    c0406kc.f2870s = m2008f(typedArrayObtainStyledAttributes, index, c0406kc.f2870s);
                    break;
                case 10:
                    c0406kc.f2869r = m2008f(typedArrayObtainStyledAttributes, index, c0406kc.f2869r);
                    break;
                case 11:
                    c0406kc.f2828L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2828L);
                    break;
                case 12:
                    c0406kc.f2829M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2829M);
                    break;
                case 13:
                    c0406kc.f2825I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2825I);
                    break;
                case 14:
                    c0406kc.f2827K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2827K);
                    break;
                case 15:
                    c0406kc.f2830N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2830N);
                    break;
                case 16:
                    c0406kc.f2826J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2826J);
                    break;
                case 17:
                    c0406kc.f2849d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0406kc.f2849d);
                    break;
                case 18:
                    c0406kc.f2851e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0406kc.f2851e);
                    break;
                case 19:
                    c0406kc.f2853f = typedArrayObtainStyledAttributes.getFloat(index, c0406kc.f2853f);
                    break;
                case 20:
                    c0406kc.f2871t = typedArrayObtainStyledAttributes.getFloat(index, c0406kc.f2871t);
                    break;
                case 21:
                    c0406kc.f2847c = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0406kc.f2847c);
                    break;
                case 22:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, c0480mc.f3190a);
                    c0480mc.f3190a = i3;
                    c0480mc.f3190a = f3524d[i3];
                    break;
                case 23:
                    c0406kc.f2845b = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0406kc.f2845b);
                    break;
                case 24:
                    c0406kc.f2819C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2819C);
                    break;
                case 25:
                    c0406kc.f2855g = m2008f(typedArrayObtainStyledAttributes, index, c0406kc.f2855g);
                    break;
                case 26:
                    c0406kc.f2857h = m2008f(typedArrayObtainStyledAttributes, index, c0406kc.f2857h);
                    break;
                case 27:
                    c0406kc.f2818B = typedArrayObtainStyledAttributes.getInt(index, c0406kc.f2818B);
                    break;
                case 28:
                    c0406kc.f2820D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2820D);
                    break;
                case 29:
                    c0406kc.f2859i = m2008f(typedArrayObtainStyledAttributes, index, c0406kc.f2859i);
                    break;
                case 30:
                    c0406kc.f2861j = m2008f(typedArrayObtainStyledAttributes, index, c0406kc.f2861j);
                    break;
                case 31:
                    c0406kc.f2824H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2824H);
                    break;
                case 32:
                    c0406kc.f2867p = m2008f(typedArrayObtainStyledAttributes, index, c0406kc.f2867p);
                    break;
                case 33:
                    c0406kc.f2868q = m2008f(typedArrayObtainStyledAttributes, index, c0406kc.f2868q);
                    break;
                case 34:
                    c0406kc.f2821E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2821E);
                    break;
                case 35:
                    c0406kc.f2863l = m2008f(typedArrayObtainStyledAttributes, index, c0406kc.f2863l);
                    break;
                case 36:
                    c0406kc.f2862k = m2008f(typedArrayObtainStyledAttributes, index, c0406kc.f2862k);
                    break;
                case 37:
                    c0406kc.f2872u = typedArrayObtainStyledAttributes.getFloat(index, c0406kc.f2872u);
                    break;
                case 38:
                    c0369jc.f2613a = typedArrayObtainStyledAttributes.getResourceId(index, c0369jc.f2613a);
                    break;
                case 39:
                    c0406kc.f2832P = typedArrayObtainStyledAttributes.getFloat(index, c0406kc.f2832P);
                    break;
                case 40:
                    c0406kc.f2831O = typedArrayObtainStyledAttributes.getFloat(index, c0406kc.f2831O);
                    break;
                case 41:
                    c0406kc.f2833Q = typedArrayObtainStyledAttributes.getInt(index, c0406kc.f2833Q);
                    break;
                case 42:
                    c0406kc.f2834R = typedArrayObtainStyledAttributes.getInt(index, c0406kc.f2834R);
                    break;
                case 43:
                    c0480mc.f3192c = typedArrayObtainStyledAttributes.getFloat(index, c0480mc.f3192c);
                    break;
                case 44:
                    c0517nc.f3383k = true;
                    c0517nc.f3384l = typedArrayObtainStyledAttributes.getDimension(index, c0517nc.f3384l);
                    break;
                case 45:
                    c0517nc.f3374b = typedArrayObtainStyledAttributes.getFloat(index, c0517nc.f3374b);
                    break;
                case 46:
                    c0517nc.f3375c = typedArrayObtainStyledAttributes.getFloat(index, c0517nc.f3375c);
                    break;
                case 47:
                    c0517nc.f3376d = typedArrayObtainStyledAttributes.getFloat(index, c0517nc.f3376d);
                    break;
                case 48:
                    c0517nc.f3377e = typedArrayObtainStyledAttributes.getFloat(index, c0517nc.f3377e);
                    break;
                case 49:
                    c0517nc.f3378f = typedArrayObtainStyledAttributes.getDimension(index, c0517nc.f3378f);
                    break;
                case 50:
                    c0517nc.f3379g = typedArrayObtainStyledAttributes.getDimension(index, c0517nc.f3379g);
                    break;
                case 51:
                    c0517nc.f3380h = typedArrayObtainStyledAttributes.getDimension(index, c0517nc.f3380h);
                    break;
                case 52:
                    c0517nc.f3381i = typedArrayObtainStyledAttributes.getDimension(index, c0517nc.f3381i);
                    break;
                case 53:
                    c0517nc.f3382j = typedArrayObtainStyledAttributes.getDimension(index, c0517nc.f3382j);
                    break;
                case 54:
                    c0406kc.f2835S = typedArrayObtainStyledAttributes.getInt(index, c0406kc.f2835S);
                    break;
                case 55:
                    c0406kc.f2836T = typedArrayObtainStyledAttributes.getInt(index, c0406kc.f2836T);
                    break;
                case 56:
                    c0406kc.f2837U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2837U);
                    break;
                case 57:
                    c0406kc.f2838V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2838V);
                    break;
                case 58:
                    c0406kc.f2839W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2839W);
                    break;
                case 59:
                    c0406kc.f2840X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2840X);
                    break;
                case 60:
                    c0517nc.f3373a = typedArrayObtainStyledAttributes.getFloat(index, c0517nc.f3373a);
                    break;
                case 61:
                    c0406kc.f2874w = m2008f(typedArrayObtainStyledAttributes, index, c0406kc.f2874w);
                    break;
                case 62:
                    c0406kc.f2875x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2875x);
                    break;
                case 63:
                    c0406kc.f2876y = typedArrayObtainStyledAttributes.getFloat(index, c0406kc.f2876y);
                    break;
                case 64:
                    c0443lc.f3042a = m2008f(typedArrayObtainStyledAttributes, index, c0443lc.f3042a);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        c0443lc.getClass();
                    } else {
                        String str = AbstractC0222ff.f1946m[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        c0443lc.getClass();
                    }
                    break;
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    c0443lc.getClass();
                    break;
                case 67:
                    c0443lc.f3045d = typedArrayObtainStyledAttributes.getFloat(index, c0443lc.f3045d);
                    break;
                case 68:
                    c0480mc.f3193d = typedArrayObtainStyledAttributes.getFloat(index, c0480mc.f3193d);
                    break;
                case 69:
                    c0406kc.f2841Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c0406kc.f2842Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0406kc.f2844a0 = typedArrayObtainStyledAttributes.getInt(index, c0406kc.f2844a0);
                    break;
                case 73:
                    c0406kc.f2846b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0406kc.f2846b0);
                    break;
                case 74:
                    c0406kc.f2852e0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c0406kc.f2860i0 = typedArrayObtainStyledAttributes.getBoolean(index, c0406kc.f2860i0);
                    break;
                case 76:
                    c0443lc.f3043b = typedArrayObtainStyledAttributes.getInt(index, c0443lc.f3043b);
                    break;
                case 77:
                    c0406kc.f2854f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c0480mc.f3191b = typedArrayObtainStyledAttributes.getInt(index, c0480mc.f3191b);
                    break;
                case 79:
                    c0443lc.f3044c = typedArrayObtainStyledAttributes.getFloat(index, c0443lc.f3044c);
                    break;
                case 80:
                    c0406kc.f2856g0 = typedArrayObtainStyledAttributes.getBoolean(index, c0406kc.f2856g0);
                    break;
                case 81:
                    c0406kc.f2858h0 = typedArrayObtainStyledAttributes.getBoolean(index, c0406kc.f2858h0);
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
        return c0369jc;
    }

    /* JADX INFO: renamed from: f */
    public static int m2008f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    public final void m2009a(ConstraintLayout constraintLayout) {
        int i;
        HashSet hashSet;
        int i2;
        int i3;
        String resourceEntryName;
        C0554oc c0554oc = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c0554oc.f3528c;
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
                if (c0554oc.f3527b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        C0369jc c0369jc = (C0369jc) map.get(Integer.valueOf(id));
                        if (childAt instanceof C0141d7) {
                            c0369jc.f2616d.f2848c0 = 1;
                        }
                        C0406kc c0406kc = c0369jc.f2616d;
                        C0480mc c0480mc = c0369jc.f2614b;
                        C0517nc c0517nc = c0369jc.f2617e;
                        int i5 = c0406kc.f2848c0;
                        if (i5 != -1 && i5 == 1) {
                            C0141d7 c0141d7 = (C0141d7) childAt;
                            c0141d7.setId(id);
                            c0141d7.setType(c0406kc.f2844a0);
                            c0141d7.setMargin(c0406kc.f2846b0);
                            c0141d7.setAllowsGoneWidget(c0406kc.f2860i0);
                            int[] iArr = c0406kc.f2850d0;
                            if (iArr != null) {
                                c0141d7.setReferencedIds(iArr);
                            } else {
                                String str = c0406kc.f2852e0;
                                if (str != null) {
                                    int[] iArrM2006c = m2006c(c0141d7, str);
                                    c0406kc.f2850d0 = iArrM2006c;
                                    c0141d7.setReferencedIds(iArrM2006c);
                                }
                            }
                        }
                        C0256gc c0256gc = (C0256gc) childAt.getLayoutParams();
                        c0256gc.m1268a();
                        c0369jc.m1584a(c0256gc);
                        HashMap map2 = c0369jc.f2618f;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : map2.keySet()) {
                            C0146dc c0146dc = (C0146dc) map2.get(str2);
                            int i6 = childCount;
                            HashSet hashSet3 = hashSet2;
                            String str3 = "set" + str2;
                            try {
                                int iM2775t = z30.m2775t(c0146dc.f1412a);
                                Class cls2 = Integer.TYPE;
                                Class cls3 = Float.TYPE;
                                switch (iM2775t) {
                                    case Base64.DEFAULT /* 0 */:
                                        i3 = i4;
                                        cls.getMethod(str3, cls2).invoke(childAt, Integer.valueOf(c0146dc.f1413b));
                                        break;
                                    case Base64.NO_PADDING /* 1 */:
                                        i3 = i4;
                                        cls.getMethod(str3, cls3).invoke(childAt, Float.valueOf(c0146dc.f1414c));
                                        break;
                                    case Base64.NO_WRAP /* 2 */:
                                        i3 = i4;
                                        cls.getMethod(str3, cls2).invoke(childAt, Integer.valueOf(c0146dc.f1417f));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(str3, Drawable.class);
                                        i3 = i4;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c0146dc.f1417f);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException e) {
                                            e = e;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                        } catch (NoSuchMethodException e2) {
                                            e = e2;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + str3);
                                        } catch (InvocationTargetException e3) {
                                            e = e3;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                        }
                                        break;
                                    case 4:
                                        cls.getMethod(str3, CharSequence.class).invoke(childAt, c0146dc.f1415d);
                                        i3 = i4;
                                        break;
                                    case 5:
                                        cls.getMethod(str3, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0146dc.f1416e));
                                        i3 = i4;
                                        break;
                                    case 6:
                                        cls.getMethod(str3, cls3).invoke(childAt, Float.valueOf(c0146dc.f1414c));
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
                        childAt.setLayoutParams(c0256gc);
                        if (c0480mc.f3191b == 0) {
                            childAt.setVisibility(c0480mc.f3190a);
                        }
                        childAt.setAlpha(c0480mc.f3192c);
                        childAt.setRotation(c0517nc.f3373a);
                        childAt.setRotationX(c0517nc.f3374b);
                        childAt.setRotationY(c0517nc.f3375c);
                        childAt.setScaleX(c0517nc.f3376d);
                        childAt.setScaleY(c0517nc.f3377e);
                        if (!Float.isNaN(c0517nc.f3378f)) {
                            childAt.setPivotX(c0517nc.f3378f);
                        }
                        if (!Float.isNaN(c0517nc.f3379g)) {
                            childAt.setPivotY(c0517nc.f3379g);
                        }
                        childAt.setTranslationX(c0517nc.f3380h);
                        childAt.setTranslationY(c0517nc.f3381i);
                        childAt.setTranslationZ(c0517nc.f3382j);
                        if (c0517nc.f3383k) {
                            childAt.setElevation(c0517nc.f3384l);
                        }
                    } else {
                        i = childCount;
                        hashSet = hashSet2;
                        i2 = i4;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i4 = i2 + 1;
                c0554oc = this;
                childCount = i;
                hashSet2 = hashSet;
            }
            i = childCount;
            hashSet = hashSet2;
            i2 = i4;
            i4 = i2 + 1;
            c0554oc = this;
            childCount = i;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            C0369jc c0369jc2 = (C0369jc) map.get(num);
            C0406kc c0406kc2 = c0369jc2.f2616d;
            int i7 = c0406kc2.f2848c0;
            if (i7 != -1 && i7 == 1) {
                Context context = constraintLayout.getContext();
                C0141d7 c0141d72 = new C0141d7(context);
                c0141d72.f1766a = new int[32];
                c0141d72.f1771f = new HashMap();
                c0141d72.f1768c = context;
                C0177e7 c0177e7 = new C0177e7();
                c0177e7.f1742f0 = 0;
                c0177e7.f1743g0 = true;
                c0177e7.f1744h0 = 0;
                c0141d72.f1397i = c0177e7;
                c0141d72.f1769d = c0177e7;
                c0141d72.m1014g();
                c0141d72.setVisibility(8);
                c0141d72.setId(num.intValue());
                int[] iArr2 = c0406kc2.f2850d0;
                if (iArr2 != null) {
                    c0141d72.setReferencedIds(iArr2);
                } else {
                    String str4 = c0406kc2.f2852e0;
                    if (str4 != null) {
                        int[] iArrM2006c2 = m2006c(c0141d72, str4);
                        c0406kc2.f2850d0 = iArrM2006c2;
                        c0141d72.setReferencedIds(iArrM2006c2);
                    }
                }
                c0141d72.setType(c0406kc2.f2844a0);
                c0141d72.setMargin(c0406kc2.f2846b0);
                C0256gc c0256gcM208a = ConstraintLayout.m208a();
                c0141d72.m1014g();
                c0369jc2.m1584a(c0256gcM208a);
                constraintLayout.addView(c0141d72, c0256gcM208a);
            }
            if (c0406kc2.f2843a) {
                View c0231fo = new C0231fo(constraintLayout.getContext());
                c0231fo.setId(num.intValue());
                C0256gc c0256gcM208a2 = ConstraintLayout.m208a();
                c0369jc2.m1584a(c0256gcM208a2);
                constraintLayout.addView(c0231fo, c0256gcM208a2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2010b(ConstraintLayout constraintLayout) {
        C0554oc c0554oc = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c0554oc.f3528c;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0256gc c0256gc = (C0256gc) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0554oc.f3527b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C0369jc());
            }
            C0369jc c0369jc = (C0369jc) map.get(Integer.valueOf(id));
            HashMap map2 = new HashMap();
            Class<?> cls = childAt.getClass();
            HashMap map3 = c0554oc.f3526a;
            for (String str : map3.keySet()) {
                C0146dc c0146dc = (C0146dc) map3.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map2.put(str, new C0146dc(c0146dc, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map2.put(str, new C0146dc(c0146dc, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e2) {
                    e2.printStackTrace();
                } catch (InvocationTargetException e3) {
                    e3.printStackTrace();
                }
            }
            c0369jc.f2618f = map2;
            C0480mc c0480mc = c0369jc.f2614b;
            C0406kc c0406kc = c0369jc.f2616d;
            C0517nc c0517nc = c0369jc.f2617e;
            c0369jc.f2613a = id;
            c0406kc.f2855g = c0256gc.f2092d;
            c0406kc.f2857h = c0256gc.f2094e;
            c0406kc.f2859i = c0256gc.f2096f;
            c0406kc.f2861j = c0256gc.f2098g;
            c0406kc.f2862k = c0256gc.f2100h;
            c0406kc.f2863l = c0256gc.f2102i;
            c0406kc.f2864m = c0256gc.f2104j;
            c0406kc.f2865n = c0256gc.f2106k;
            c0406kc.f2866o = c0256gc.f2108l;
            c0406kc.f2867p = c0256gc.f2112p;
            c0406kc.f2868q = c0256gc.f2113q;
            c0406kc.f2869r = c0256gc.f2114r;
            c0406kc.f2870s = c0256gc.f2115s;
            c0406kc.f2871t = c0256gc.f2122z;
            c0406kc.f2872u = c0256gc.f2060A;
            c0406kc.f2873v = c0256gc.f2061B;
            c0406kc.f2874w = c0256gc.f2109m;
            c0406kc.f2875x = c0256gc.f2110n;
            c0406kc.f2876y = c0256gc.f2111o;
            c0406kc.f2877z = c0256gc.f2075P;
            c0406kc.f2817A = c0256gc.f2076Q;
            c0406kc.f2818B = c0256gc.f2077R;
            c0406kc.f2853f = c0256gc.f2090c;
            c0406kc.f2849d = c0256gc.f2086a;
            c0406kc.f2851e = c0256gc.f2088b;
            c0406kc.f2845b = ((ViewGroup.MarginLayoutParams) c0256gc).width;
            c0406kc.f2847c = ((ViewGroup.MarginLayoutParams) c0256gc).height;
            c0406kc.f2819C = ((ViewGroup.MarginLayoutParams) c0256gc).leftMargin;
            c0406kc.f2820D = ((ViewGroup.MarginLayoutParams) c0256gc).rightMargin;
            c0406kc.f2821E = ((ViewGroup.MarginLayoutParams) c0256gc).topMargin;
            c0406kc.f2822F = ((ViewGroup.MarginLayoutParams) c0256gc).bottomMargin;
            c0406kc.f2831O = c0256gc.f2064E;
            c0406kc.f2832P = c0256gc.f2063D;
            c0406kc.f2834R = c0256gc.f2066G;
            c0406kc.f2833Q = c0256gc.f2065F;
            c0406kc.f2856g0 = c0256gc.f2078S;
            c0406kc.f2858h0 = c0256gc.f2079T;
            c0406kc.f2835S = c0256gc.f2067H;
            c0406kc.f2836T = c0256gc.f2068I;
            c0406kc.f2837U = c0256gc.f2071L;
            c0406kc.f2838V = c0256gc.f2072M;
            c0406kc.f2839W = c0256gc.f2069J;
            c0406kc.f2840X = c0256gc.f2070K;
            c0406kc.f2841Y = c0256gc.f2073N;
            c0406kc.f2842Z = c0256gc.f2074O;
            c0406kc.f2854f0 = c0256gc.f2080U;
            c0406kc.f2826J = c0256gc.f2117u;
            c0406kc.f2828L = c0256gc.f2119w;
            c0406kc.f2825I = c0256gc.f2116t;
            c0406kc.f2827K = c0256gc.f2118v;
            c0406kc.f2830N = c0256gc.f2120x;
            c0406kc.f2829M = c0256gc.f2121y;
            c0406kc.f2823G = c0256gc.getMarginEnd();
            c0406kc.f2824H = c0256gc.getMarginStart();
            c0480mc.f3190a = childAt.getVisibility();
            c0480mc.f3192c = childAt.getAlpha();
            c0517nc.f3373a = childAt.getRotation();
            c0517nc.f3374b = childAt.getRotationX();
            c0517nc.f3375c = childAt.getRotationY();
            c0517nc.f3376d = childAt.getScaleX();
            c0517nc.f3377e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                c0517nc.f3378f = pivotX;
                c0517nc.f3379g = pivotY;
            }
            c0517nc.f3380h = childAt.getTranslationX();
            c0517nc.f3381i = childAt.getTranslationY();
            c0517nc.f3382j = childAt.getTranslationZ();
            if (c0517nc.f3383k) {
                c0517nc.f3384l = childAt.getElevation();
            }
            if (childAt instanceof C0141d7) {
                C0141d7 c0141d7 = (C0141d7) childAt;
                c0406kc.f2860i0 = c0141d7.f1397i.f1743g0;
                c0406kc.f2850d0 = c0141d7.getReferencedIds();
                c0406kc.f2844a0 = c0141d7.getType();
                c0406kc.f2846b0 = c0141d7.getMargin();
            }
            i++;
            c0554oc = this;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2011e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0369jc c0369jcM2007d = m2007d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c0369jcM2007d.f2616d.f2843a = true;
                    }
                    this.f3528c.put(Integer.valueOf(c0369jcM2007d.f2613a), c0369jcM2007d);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
