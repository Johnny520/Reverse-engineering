package p075p;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;
import p034S.AbstractC0324d;
import p067l.AbstractC0978a;
import p069m.AbstractC0988h;

/* JADX INFO: renamed from: p.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1048n {

    /* JADX INFO: renamed from: d */
    public static final int[] f4045d = {0, 4, 8};

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f4046e;

    /* JADX INFO: renamed from: a */
    public final HashMap f4047a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final boolean f4048b = true;

    /* JADX INFO: renamed from: c */
    public final HashMap f4049c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4046e = sparseIntArray;
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
    public static int[] m2525c(C1035a c1035a, String str) {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(",");
        Context context = c1035a.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC1051q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c1035a.isInEditMode() && (c1035a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c1035a.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.f1270m) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.f1270m.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX INFO: renamed from: d */
    public static C1043i m2526d(Context context, AttributeSet attributeSet) {
        C1043i c1043i = new C1043i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1052r.f4050a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            C1046l c1046l = c1043i.f3956b;
            C1045k c1045k = c1043i.f3957c;
            C1047m c1047m = c1043i.f3959e;
            C1044j c1044j = c1043i.f3958d;
            if (index != 1 && 23 != index && 24 != index) {
                c1045k.getClass();
                c1044j.getClass();
                c1046l.getClass();
                c1047m.getClass();
            }
            SparseIntArray sparseIntArray = f4046e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c1044j.f4011o = m2527f(typedArrayObtainStyledAttributes, index, c1044j.f4011o);
                    break;
                case 2:
                    c1044j.f3967F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3967F);
                    break;
                case 3:
                    c1044j.f4010n = m2527f(typedArrayObtainStyledAttributes, index, c1044j.f4010n);
                    break;
                case 4:
                    c1044j.f4009m = m2527f(typedArrayObtainStyledAttributes, index, c1044j.f4009m);
                    break;
                case 5:
                    c1044j.f4018v = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c1044j.f4022z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1044j.f4022z);
                    break;
                case 7:
                    c1044j.f3962A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1044j.f3962A);
                    break;
                case 8:
                    c1044j.f3968G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3968G);
                    break;
                case 9:
                    c1044j.f4015s = m2527f(typedArrayObtainStyledAttributes, index, c1044j.f4015s);
                    break;
                case 10:
                    c1044j.f4014r = m2527f(typedArrayObtainStyledAttributes, index, c1044j.f4014r);
                    break;
                case 11:
                    c1044j.f3973L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3973L);
                    break;
                case 12:
                    c1044j.f3974M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3974M);
                    break;
                case 13:
                    c1044j.f3970I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3970I);
                    break;
                case 14:
                    c1044j.f3972K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3972K);
                    break;
                case 15:
                    c1044j.f3975N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3975N);
                    break;
                case 16:
                    c1044j.f3971J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3971J);
                    break;
                case 17:
                    c1044j.f3994d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1044j.f3994d);
                    break;
                case 18:
                    c1044j.f3996e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1044j.f3996e);
                    break;
                case 19:
                    c1044j.f3998f = typedArrayObtainStyledAttributes.getFloat(index, c1044j.f3998f);
                    break;
                case 20:
                    c1044j.f4016t = typedArrayObtainStyledAttributes.getFloat(index, c1044j.f4016t);
                    break;
                case 21:
                    c1044j.f3992c = typedArrayObtainStyledAttributes.getLayoutDimension(index, c1044j.f3992c);
                    break;
                case 22:
                    c1046l.f4028a = f4045d[typedArrayObtainStyledAttributes.getInt(index, c1046l.f4028a)];
                    break;
                case 23:
                    c1044j.f3990b = typedArrayObtainStyledAttributes.getLayoutDimension(index, c1044j.f3990b);
                    break;
                case 24:
                    c1044j.f3964C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3964C);
                    break;
                case 25:
                    c1044j.f4000g = m2527f(typedArrayObtainStyledAttributes, index, c1044j.f4000g);
                    break;
                case 26:
                    c1044j.f4002h = m2527f(typedArrayObtainStyledAttributes, index, c1044j.f4002h);
                    break;
                case 27:
                    c1044j.f3963B = typedArrayObtainStyledAttributes.getInt(index, c1044j.f3963B);
                    break;
                case 28:
                    c1044j.f3965D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3965D);
                    break;
                case 29:
                    c1044j.f4004i = m2527f(typedArrayObtainStyledAttributes, index, c1044j.f4004i);
                    break;
                case 30:
                    c1044j.f4006j = m2527f(typedArrayObtainStyledAttributes, index, c1044j.f4006j);
                    break;
                case 31:
                    c1044j.f3969H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3969H);
                    break;
                case 32:
                    c1044j.f4012p = m2527f(typedArrayObtainStyledAttributes, index, c1044j.f4012p);
                    break;
                case 33:
                    c1044j.f4013q = m2527f(typedArrayObtainStyledAttributes, index, c1044j.f4013q);
                    break;
                case 34:
                    c1044j.f3966E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3966E);
                    break;
                case 35:
                    c1044j.f4008l = m2527f(typedArrayObtainStyledAttributes, index, c1044j.f4008l);
                    break;
                case 36:
                    c1044j.f4007k = m2527f(typedArrayObtainStyledAttributes, index, c1044j.f4007k);
                    break;
                case 37:
                    c1044j.f4017u = typedArrayObtainStyledAttributes.getFloat(index, c1044j.f4017u);
                    break;
                case 38:
                    c1043i.f3955a = typedArrayObtainStyledAttributes.getResourceId(index, c1043i.f3955a);
                    break;
                case 39:
                    c1044j.f3977P = typedArrayObtainStyledAttributes.getFloat(index, c1044j.f3977P);
                    break;
                case 40:
                    c1044j.f3976O = typedArrayObtainStyledAttributes.getFloat(index, c1044j.f3976O);
                    break;
                case 41:
                    c1044j.f3978Q = typedArrayObtainStyledAttributes.getInt(index, c1044j.f3978Q);
                    break;
                case 42:
                    c1044j.f3979R = typedArrayObtainStyledAttributes.getInt(index, c1044j.f3979R);
                    break;
                case 43:
                    c1046l.f4030c = typedArrayObtainStyledAttributes.getFloat(index, c1046l.f4030c);
                    break;
                case 44:
                    c1047m.f4043k = true;
                    c1047m.f4044l = typedArrayObtainStyledAttributes.getDimension(index, c1047m.f4044l);
                    break;
                case 45:
                    c1047m.f4034b = typedArrayObtainStyledAttributes.getFloat(index, c1047m.f4034b);
                    break;
                case 46:
                    c1047m.f4035c = typedArrayObtainStyledAttributes.getFloat(index, c1047m.f4035c);
                    break;
                case 47:
                    c1047m.f4036d = typedArrayObtainStyledAttributes.getFloat(index, c1047m.f4036d);
                    break;
                case 48:
                    c1047m.f4037e = typedArrayObtainStyledAttributes.getFloat(index, c1047m.f4037e);
                    break;
                case 49:
                    c1047m.f4038f = typedArrayObtainStyledAttributes.getDimension(index, c1047m.f4038f);
                    break;
                case 50:
                    c1047m.f4039g = typedArrayObtainStyledAttributes.getDimension(index, c1047m.f4039g);
                    break;
                case 51:
                    c1047m.f4040h = typedArrayObtainStyledAttributes.getDimension(index, c1047m.f4040h);
                    break;
                case 52:
                    c1047m.f4041i = typedArrayObtainStyledAttributes.getDimension(index, c1047m.f4041i);
                    break;
                case 53:
                    c1047m.f4042j = typedArrayObtainStyledAttributes.getDimension(index, c1047m.f4042j);
                    break;
                case 54:
                    c1044j.f3980S = typedArrayObtainStyledAttributes.getInt(index, c1044j.f3980S);
                    break;
                case 55:
                    c1044j.f3981T = typedArrayObtainStyledAttributes.getInt(index, c1044j.f3981T);
                    break;
                case 56:
                    c1044j.f3982U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3982U);
                    break;
                case 57:
                    c1044j.f3983V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3983V);
                    break;
                case 58:
                    c1044j.f3984W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3984W);
                    break;
                case 59:
                    c1044j.f3985X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3985X);
                    break;
                case 60:
                    c1047m.f4033a = typedArrayObtainStyledAttributes.getFloat(index, c1047m.f4033a);
                    break;
                case 61:
                    c1044j.f4019w = m2527f(typedArrayObtainStyledAttributes, index, c1044j.f4019w);
                    break;
                case 62:
                    c1044j.f4020x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f4020x);
                    break;
                case 63:
                    c1044j.f4021y = typedArrayObtainStyledAttributes.getFloat(index, c1044j.f4021y);
                    break;
                case 64:
                    c1045k.f4024a = m2527f(typedArrayObtainStyledAttributes, index, c1045k.f4024a);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        c1045k.getClass();
                    } else {
                        String str = AbstractC0978a.f3461a[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        c1045k.getClass();
                    }
                    break;
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1045k.getClass();
                    break;
                case 67:
                    c1045k.f4027d = typedArrayObtainStyledAttributes.getFloat(index, c1045k.f4027d);
                    break;
                case 68:
                    c1046l.f4031d = typedArrayObtainStyledAttributes.getFloat(index, c1046l.f4031d);
                    break;
                case 69:
                    c1044j.f3986Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c1044j.f3987Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    c1044j.f3989a0 = typedArrayObtainStyledAttributes.getInt(index, c1044j.f3989a0);
                    break;
                case 73:
                    c1044j.f3991b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1044j.f3991b0);
                    break;
                case 74:
                    c1044j.f3997e0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c1044j.f4005i0 = typedArrayObtainStyledAttributes.getBoolean(index, c1044j.f4005i0);
                    break;
                case 76:
                    c1045k.f4025b = typedArrayObtainStyledAttributes.getInt(index, c1045k.f4025b);
                    break;
                case 77:
                    c1044j.f3999f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c1046l.f4029b = typedArrayObtainStyledAttributes.getInt(index, c1046l.f4029b);
                    break;
                case 79:
                    c1045k.f4026c = typedArrayObtainStyledAttributes.getFloat(index, c1045k.f4026c);
                    break;
                case 80:
                    c1044j.f4001g0 = typedArrayObtainStyledAttributes.getBoolean(index, c1044j.f4001g0);
                    break;
                case 81:
                    c1044j.f4003h0 = typedArrayObtainStyledAttributes.getBoolean(index, c1044j.f4003h0);
                    break;
                case 82:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c1043i;
    }

    /* JADX INFO: renamed from: f */
    public static int m2527f(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX INFO: renamed from: a */
    public final void m2528a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f4049c;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (this.f4048b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && map.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C1043i c1043i = (C1043i) map.get(Integer.valueOf(id));
                    if (childAt instanceof C1035a) {
                        c1043i.f3958d.f3993c0 = 1;
                    }
                    int i3 = c1043i.f3958d.f3993c0;
                    if (i3 != -1 && i3 == 1) {
                        C1035a c1035a = (C1035a) childAt;
                        c1035a.setId(id);
                        C1044j c1044j = c1043i.f3958d;
                        c1035a.setType(c1044j.f3989a0);
                        c1035a.setMargin(c1044j.f3991b0);
                        c1035a.setAllowsGoneWidget(c1044j.f4005i0);
                        int[] iArr = c1044j.f3995d0;
                        if (iArr != null) {
                            c1035a.setReferencedIds(iArr);
                        } else {
                            String str = c1044j.f3997e0;
                            if (str != null) {
                                int[] iArrM2525c = m2525c(c1035a, str);
                                c1044j.f3995d0 = iArrM2525c;
                                c1035a.setReferencedIds(iArrM2525c);
                            }
                        }
                    }
                    C1039e c1039e = (C1039e) childAt.getLayoutParams();
                    c1039e.m2518a();
                    c1043i.m2520a(c1039e);
                    HashMap map2 = c1043i.f3960f;
                    Class<?> cls = childAt.getClass();
                    for (String str2 : map2.keySet()) {
                        C1036b c1036b = (C1036b) map2.get(str2);
                        String strM725h = AbstractC0324d.m725h("set", str2);
                        try {
                            switch (AbstractC0988h.m2372a(c1036b.f3864a)) {
                                case 0:
                                    cls.getMethod(strM725h, Integer.TYPE).invoke(childAt, Integer.valueOf(c1036b.f3865b));
                                    break;
                                case 1:
                                    cls.getMethod(strM725h, Float.TYPE).invoke(childAt, Float.valueOf(c1036b.f3866c));
                                    break;
                                case 2:
                                    cls.getMethod(strM725h, Integer.TYPE).invoke(childAt, Integer.valueOf(c1036b.f3869f));
                                    break;
                                case 3:
                                    Method method = cls.getMethod(strM725h, Drawable.class);
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(c1036b.f3869f);
                                    method.invoke(childAt, colorDrawable);
                                    break;
                                case 4:
                                    cls.getMethod(strM725h, CharSequence.class).invoke(childAt, c1036b.f3867d);
                                    break;
                                case 5:
                                    cls.getMethod(strM725h, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1036b.f3868e));
                                    break;
                                case 6:
                                    cls.getMethod(strM725h, Float.TYPE).invoke(childAt, Float.valueOf(c1036b.f3866c));
                                    break;
                            }
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (NoSuchMethodException e3) {
                            e3.getMessage();
                        } catch (InvocationTargetException e4) {
                            e4.printStackTrace();
                        }
                    }
                    childAt.setLayoutParams(c1039e);
                    C1046l c1046l = c1043i.f3956b;
                    if (c1046l.f4029b == 0) {
                        childAt.setVisibility(c1046l.f4028a);
                    }
                    childAt.setAlpha(c1046l.f4030c);
                    C1047m c1047m = c1043i.f3959e;
                    childAt.setRotation(c1047m.f4033a);
                    childAt.setRotationX(c1047m.f4034b);
                    childAt.setRotationY(c1047m.f4035c);
                    childAt.setScaleX(c1047m.f4036d);
                    childAt.setScaleY(c1047m.f4037e);
                    if (!Float.isNaN(c1047m.f4038f)) {
                        childAt.setPivotX(c1047m.f4038f);
                    }
                    if (!Float.isNaN(c1047m.f4039g)) {
                        childAt.setPivotY(c1047m.f4039g);
                    }
                    childAt.setTranslationX(c1047m.f4040h);
                    childAt.setTranslationY(c1047m.f4041i);
                    childAt.setTranslationZ(c1047m.f4042j);
                    if (c1047m.f4043k) {
                        childAt.setElevation(c1047m.f4044l);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            C1043i c1043i2 = (C1043i) map.get(num);
            C1044j c1044j2 = c1043i2.f3958d;
            int i4 = c1044j2.f3993c0;
            if (i4 != -1 && i4 == 1) {
                Context context = constraintLayout.getContext();
                C1035a c1035a2 = new C1035a(context);
                c1035a2.f3870a = new int[32];
                c1035a2.f3875f = new HashMap();
                c1035a2.f3872c = context;
                c1035a2.mo1155e(null);
                c1035a2.setVisibility(8);
                c1035a2.setId(num.intValue());
                int[] iArr2 = c1044j2.f3995d0;
                if (iArr2 != null) {
                    c1035a2.setReferencedIds(iArr2);
                } else {
                    String str3 = c1044j2.f3997e0;
                    if (str3 != null) {
                        int[] iArrM2525c2 = m2525c(c1035a2, str3);
                        c1044j2.f3995d0 = iArrM2525c2;
                        c1035a2.setReferencedIds(iArrM2525c2);
                    }
                }
                c1035a2.setType(c1044j2.f3989a0);
                c1035a2.setMargin(c1044j2.f3991b0);
                C1039e c1039eM1158a = ConstraintLayout.m1158a();
                c1035a2.m2517g();
                c1043i2.m2520a(c1039eM1158a);
                constraintLayout.addView(c1035a2, c1039eM1158a);
            }
            if (c1044j2.f3988a) {
                View c1050p = new C1050p(constraintLayout.getContext());
                c1050p.setId(num.intValue());
                C1039e c1039eM1158a2 = ConstraintLayout.m1158a();
                c1043i2.m2520a(c1039eM1158a2);
                constraintLayout.addView(c1050p, c1039eM1158a2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2529b(ConstraintLayout constraintLayout) {
        C1048n c1048n = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c1048n.f4049c;
        map.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            C1039e c1039e = (C1039e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c1048n.f4048b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C1043i());
            }
            C1043i c1043i = (C1043i) map.get(Integer.valueOf(id));
            HashMap map2 = c1048n.f4047a;
            HashMap map3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : map2.keySet()) {
                C1036b c1036b = (C1036b) map2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map3.put(str, new C1036b(c1036b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map3.put(str, new C1036b(c1036b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                } catch (InvocationTargetException e4) {
                    e4.printStackTrace();
                }
            }
            c1043i.f3960f = map3;
            c1043i.f3955a = id;
            int i3 = c1039e.f3909d;
            C1044j c1044j = c1043i.f3958d;
            c1044j.f4000g = i3;
            c1044j.f4002h = c1039e.f3911e;
            c1044j.f4004i = c1039e.f3913f;
            c1044j.f4006j = c1039e.f3915g;
            c1044j.f4007k = c1039e.f3917h;
            c1044j.f4008l = c1039e.f3919i;
            c1044j.f4009m = c1039e.f3921j;
            c1044j.f4010n = c1039e.f3923k;
            c1044j.f4011o = c1039e.f3925l;
            c1044j.f4012p = c1039e.f3929p;
            c1044j.f4013q = c1039e.f3930q;
            c1044j.f4014r = c1039e.f3931r;
            c1044j.f4015s = c1039e.f3932s;
            c1044j.f4016t = c1039e.f3939z;
            c1044j.f4017u = c1039e.f3877A;
            c1044j.f4018v = c1039e.f3878B;
            c1044j.f4019w = c1039e.f3926m;
            c1044j.f4020x = c1039e.f3927n;
            c1044j.f4021y = c1039e.f3928o;
            c1044j.f4022z = c1039e.f3892P;
            c1044j.f3962A = c1039e.f3893Q;
            c1044j.f3963B = c1039e.f3894R;
            c1044j.f3998f = c1039e.f3907c;
            c1044j.f3994d = c1039e.f3903a;
            c1044j.f3996e = c1039e.f3905b;
            c1044j.f3990b = ((ViewGroup.MarginLayoutParams) c1039e).width;
            c1044j.f3992c = ((ViewGroup.MarginLayoutParams) c1039e).height;
            c1044j.f3964C = ((ViewGroup.MarginLayoutParams) c1039e).leftMargin;
            c1044j.f3965D = ((ViewGroup.MarginLayoutParams) c1039e).rightMargin;
            c1044j.f3966E = ((ViewGroup.MarginLayoutParams) c1039e).topMargin;
            c1044j.f3967F = ((ViewGroup.MarginLayoutParams) c1039e).bottomMargin;
            c1044j.f3976O = c1039e.f3881E;
            c1044j.f3977P = c1039e.f3880D;
            c1044j.f3979R = c1039e.f3883G;
            c1044j.f3978Q = c1039e.f3882F;
            c1044j.f4001g0 = c1039e.f3895S;
            c1044j.f4003h0 = c1039e.f3896T;
            c1044j.f3980S = c1039e.f3884H;
            c1044j.f3981T = c1039e.f3885I;
            c1044j.f3982U = c1039e.f3888L;
            c1044j.f3983V = c1039e.f3889M;
            c1044j.f3984W = c1039e.f3886J;
            c1044j.f3985X = c1039e.f3887K;
            c1044j.f3986Y = c1039e.f3890N;
            c1044j.f3987Z = c1039e.f3891O;
            c1044j.f3999f0 = c1039e.f3897U;
            c1044j.f3971J = c1039e.f3934u;
            c1044j.f3973L = c1039e.f3936w;
            c1044j.f3970I = c1039e.f3933t;
            c1044j.f3972K = c1039e.f3935v;
            c1044j.f3975N = c1039e.f3937x;
            c1044j.f3974M = c1039e.f3938y;
            c1044j.f3968G = c1039e.getMarginEnd();
            c1044j.f3969H = c1039e.getMarginStart();
            int visibility = childAt.getVisibility();
            C1046l c1046l = c1043i.f3956b;
            c1046l.f4028a = visibility;
            c1046l.f4030c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            C1047m c1047m = c1043i.f3959e;
            c1047m.f4033a = rotation;
            c1047m.f4034b = childAt.getRotationX();
            c1047m.f4035c = childAt.getRotationY();
            c1047m.f4036d = childAt.getScaleX();
            c1047m.f4037e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                c1047m.f4038f = pivotX;
                c1047m.f4039g = pivotY;
            }
            c1047m.f4040h = childAt.getTranslationX();
            c1047m.f4041i = childAt.getTranslationY();
            c1047m.f4042j = childAt.getTranslationZ();
            if (c1047m.f4043k) {
                c1047m.f4044l = childAt.getElevation();
            }
            if (childAt instanceof C1035a) {
                C1035a c1035a = (C1035a) childAt;
                c1044j.f4005i0 = c1035a.f3863i.f3558g0;
                c1044j.f3995d0 = c1035a.getReferencedIds();
                c1044j.f3989a0 = c1035a.getType();
                c1044j.f3991b0 = c1035a.getMargin();
            }
            i2++;
            c1048n = this;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2530e(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1043i c1043iM2526d = m2526d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c1043iM2526d.f3958d.f3988a = true;
                    }
                    this.f4049c.put(Integer.valueOf(c1043iM2526d.f3955a), c1043iM2526d);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
