package yyds;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: yyds.ᛳᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0595 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final SparseIntArray f2815;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final int[] f2816 = {0, 4, 8};

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final SparseIntArray f2817;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final HashMap f2818 = new HashMap();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final HashMap f2819 = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2817 = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f2815 = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
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
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static int m1470(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static int[] m1471(C1019 c1019, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c1019.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC2341.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, Name.MARK, context.getPackageName());
            }
            if (iIntValue == 0 && c1019.isInEditMode() && (c1019.getParent() instanceof AbstractC1340)) {
                AbstractC1340 abstractC1340 = (AbstractC1340) c1019.getParent();
                if (strTrim != null) {
                    HashMap map = abstractC1340.f6212;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = abstractC1340.f6212.get(strTrim);
                    }
                } else {
                    abstractC1340.getClass();
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

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static void m1472(C1357 c1357, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c1357.f6302 = str;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static C2049 m1473(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        C2049 c2049 = new C2049();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? AbstractC1164.f5358 : AbstractC1164.f5354);
        String[] strArr = AbstractC0879.f3999;
        C2047 c2047 = c2049.f10186;
        C1457 c1457 = c2049.f10184;
        C1253 c1253 = c2049.f10187;
        C1894 c1894 = c2049.f10189;
        int[] iArr = f2816;
        SparseIntArray sparseIntArray = f2817;
        if (z) {
            C1517 c1517 = new C1517();
            c1517.f7327 = new int[10];
            c1517.f7328 = new int[10];
            c1517.f7333 = 0;
            c1517.f7335 = new int[10];
            c1517.f7326 = new float[10];
            c1517.f7334 = 0;
            c1517.f7329 = new int[5];
            c1517.f7324 = new String[5];
            c1517.f7325 = 0;
            c1517.f7332 = new int[4];
            c1517.f7330 = new boolean[4];
            c1517.f7331 = 0;
            int i3 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (f2815.get(index)) {
                    case 2:
                        i2 = indexCount;
                        c1517.m3138(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9601));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = indexCount;
                        c1517.m3139(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case 6:
                        i2 = indexCount;
                        c1517.m3138(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1894.f9537));
                        break;
                    case 7:
                        i2 = indexCount;
                        c1517.m3138(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1894.f9584));
                        break;
                    case 8:
                        i2 = indexCount;
                        c1517.m3138(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9542));
                        break;
                    case 11:
                        i2 = indexCount;
                        c1517.m3138(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9576));
                        break;
                    case 12:
                        i2 = indexCount;
                        c1517.m3138(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9549));
                        break;
                    case 13:
                        i2 = indexCount;
                        c1517.m3138(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9593));
                        break;
                    case 14:
                        i2 = indexCount;
                        c1517.m3138(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9550));
                        break;
                    case 15:
                        i2 = indexCount;
                        c1517.m3138(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9568));
                        break;
                    case 16:
                        i2 = indexCount;
                        c1517.m3138(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9573));
                        break;
                    case 17:
                        i2 = indexCount;
                        c1517.m3138(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1894.f9598));
                        break;
                    case 18:
                        i2 = indexCount;
                        c1517.m3138(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1894.f9547));
                        break;
                    case 19:
                        i2 = indexCount;
                        c1517.m3137(19, typedArrayObtainStyledAttributes.getFloat(index, c1894.f9596));
                        break;
                    case 20:
                        i2 = indexCount;
                        c1517.m3137(20, typedArrayObtainStyledAttributes.getFloat(index, c1894.f9565));
                        break;
                    case 21:
                        i2 = indexCount;
                        c1517.m3138(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c1894.f9588));
                        break;
                    case 22:
                        i2 = indexCount;
                        c1517.m3138(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c2047.f10178)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        c1517.m3138(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c1894.f9563));
                        break;
                    case 24:
                        i2 = indexCount;
                        c1517.m3138(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9590));
                        break;
                    case 27:
                        i2 = indexCount;
                        c1517.m3138(27, typedArrayObtainStyledAttributes.getInt(index, c1894.f9586));
                        break;
                    case 28:
                        i2 = indexCount;
                        c1517.m3138(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9578));
                        break;
                    case 31:
                        i2 = indexCount;
                        c1517.m3138(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9539));
                        break;
                    case 34:
                        i2 = indexCount;
                        c1517.m3138(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9580));
                        break;
                    case 37:
                        i2 = indexCount;
                        c1517.m3137(37, typedArrayObtainStyledAttributes.getFloat(index, c1894.f9548));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c2049.f10185);
                        c2049.f10185 = resourceId;
                        c1517.m3138(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        c1517.m3137(39, typedArrayObtainStyledAttributes.getFloat(index, c1894.f9553));
                        break;
                    case 40:
                        i2 = indexCount;
                        c1517.m3137(40, typedArrayObtainStyledAttributes.getFloat(index, c1894.f9592));
                        break;
                    case 41:
                        i2 = indexCount;
                        c1517.m3138(41, typedArrayObtainStyledAttributes.getInt(index, c1894.f9557));
                        break;
                    case 42:
                        i2 = indexCount;
                        c1517.m3138(42, typedArrayObtainStyledAttributes.getInt(index, c1894.f9566));
                        break;
                    case 43:
                        i2 = indexCount;
                        c1517.m3137(43, typedArrayObtainStyledAttributes.getFloat(index, c2047.f10180));
                        break;
                    case 44:
                        i2 = indexCount;
                        c1517.m3140(44, true);
                        c1517.m3137(44, typedArrayObtainStyledAttributes.getDimension(index, c1457.f6942));
                        break;
                    case 45:
                        i2 = indexCount;
                        c1517.m3137(45, typedArrayObtainStyledAttributes.getFloat(index, c1457.f6946));
                        break;
                    case 46:
                        i2 = indexCount;
                        c1517.m3137(46, typedArrayObtainStyledAttributes.getFloat(index, c1457.f6951));
                        break;
                    case 47:
                        i2 = indexCount;
                        c1517.m3137(47, typedArrayObtainStyledAttributes.getFloat(index, c1457.f6953));
                        break;
                    case 48:
                        i2 = indexCount;
                        c1517.m3137(48, typedArrayObtainStyledAttributes.getFloat(index, c1457.f6944));
                        break;
                    case 49:
                        i2 = indexCount;
                        c1517.m3137(49, typedArrayObtainStyledAttributes.getDimension(index, c1457.f6952));
                        break;
                    case 50:
                        i2 = indexCount;
                        c1517.m3137(50, typedArrayObtainStyledAttributes.getDimension(index, c1457.f6947));
                        break;
                    case 51:
                        i2 = indexCount;
                        c1517.m3137(51, typedArrayObtainStyledAttributes.getDimension(index, c1457.f6943));
                        break;
                    case 52:
                        i2 = indexCount;
                        c1517.m3137(52, typedArrayObtainStyledAttributes.getDimension(index, c1457.f6950));
                        break;
                    case 53:
                        i2 = indexCount;
                        c1517.m3137(53, typedArrayObtainStyledAttributes.getDimension(index, c1457.f6948));
                        break;
                    case 54:
                        i2 = indexCount;
                        c1517.m3138(54, typedArrayObtainStyledAttributes.getInt(index, c1894.f9569));
                        break;
                    case 55:
                        i2 = indexCount;
                        c1517.m3138(55, typedArrayObtainStyledAttributes.getInt(index, c1894.f9552));
                        break;
                    case 56:
                        i2 = indexCount;
                        c1517.m3138(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9597));
                        break;
                    case 57:
                        i2 = indexCount;
                        c1517.m3138(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9559));
                        break;
                    case 58:
                        i2 = indexCount;
                        c1517.m3138(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9600));
                        break;
                    case 59:
                        i2 = indexCount;
                        c1517.m3138(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9545));
                        break;
                    case 60:
                        i2 = indexCount;
                        c1517.m3137(60, typedArrayObtainStyledAttributes.getFloat(index, c1457.f6945));
                        break;
                    case 62:
                        i2 = indexCount;
                        c1517.m3138(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9544));
                        break;
                    case 63:
                        i2 = indexCount;
                        c1517.m3137(63, typedArrayObtainStyledAttributes.getFloat(index, c1894.f9579));
                        break;
                    case 64:
                        i2 = indexCount;
                        c1517.m3138(64, m1470(typedArrayObtainStyledAttributes, index, c1253.f5770));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c1517.m3139(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            c1517.m3139(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i2 = indexCount;
                        c1517.m3138(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        c1517.m3137(67, typedArrayObtainStyledAttributes.getFloat(index, c1253.f5769));
                        break;
                    case 68:
                        i2 = indexCount;
                        c1517.m3137(68, typedArrayObtainStyledAttributes.getFloat(index, c2047.f10181));
                        break;
                    case 69:
                        i2 = indexCount;
                        c1517.m3137(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        c1517.m3137(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        c1517.m3138(72, typedArrayObtainStyledAttributes.getInt(index, c1894.f28));
                        break;
                    case 73:
                        i2 = indexCount;
                        c1517.m3138(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9585));
                        break;
                    case 74:
                        i2 = indexCount;
                        c1517.m3139(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = indexCount;
                        c1517.m3140(75, typedArrayObtainStyledAttributes.getBoolean(index, c1894.f9570));
                        break;
                    case 76:
                        i2 = indexCount;
                        c1517.m3138(76, typedArrayObtainStyledAttributes.getInt(index, c1253.f5773));
                        break;
                    case 77:
                        i2 = indexCount;
                        c1517.m3139(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = indexCount;
                        c1517.m3138(78, typedArrayObtainStyledAttributes.getInt(index, c2047.f10179));
                        break;
                    case 79:
                        i2 = indexCount;
                        c1517.m3137(79, typedArrayObtainStyledAttributes.getFloat(index, c1253.f5775));
                        break;
                    case 80:
                        i2 = indexCount;
                        c1517.m3140(80, typedArrayObtainStyledAttributes.getBoolean(index, c1894.f9562));
                        break;
                    case 81:
                        i2 = indexCount;
                        c1517.m3140(81, typedArrayObtainStyledAttributes.getBoolean(index, c1894.f9595));
                        break;
                    case 82:
                        i2 = indexCount;
                        c1517.m3138(82, typedArrayObtainStyledAttributes.getInteger(index, c1253.f5771));
                        break;
                    case 83:
                        i2 = indexCount;
                        c1517.m3138(83, m1470(typedArrayObtainStyledAttributes, index, c1457.f6941));
                        break;
                    case 84:
                        i2 = indexCount;
                        c1517.m3138(84, typedArrayObtainStyledAttributes.getInteger(index, c1253.f5772));
                        break;
                    case 85:
                        i2 = indexCount;
                        c1517.m3137(85, typedArrayObtainStyledAttributes.getFloat(index, c1253.f5774));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c1253.f5768 = resourceId2;
                            c1517.m3138(89, resourceId2);
                            if (c1253.f5768 != -1) {
                                c1517.m3138(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c1253.f5767 = string;
                            c1517.m3139(90, string);
                            if (c1253.f5767.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c1253.f5768 = resourceId3;
                                c1517.m3138(89, resourceId3);
                                c1517.m3138(88, -2);
                            } else {
                                c1517.m3138(88, -1);
                            }
                        } else {
                            c1517.m3138(88, typedArrayObtainStyledAttributes.getInteger(index, c1253.f5768));
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        c1517.m3138(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9583));
                        break;
                    case 94:
                        i2 = indexCount;
                        c1517.m3138(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1894.f9540));
                        break;
                    case 95:
                        i2 = indexCount;
                        m1474(c1517, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        m1474(c1517, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        c1517.m3138(97, typedArrayObtainStyledAttributes.getInt(index, c1894.f9599));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = AbstractC1501.f7080;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c2049.f10185 = typedArrayObtainStyledAttributes.getResourceId(index, c2049.f10185);
                        }
                        break;
                    case 99:
                        i2 = indexCount;
                        c1517.m3140(99, typedArrayObtainStyledAttributes.getBoolean(index, c1894.f9571));
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        c1894.f9594 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9594);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        c1894.f9601 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9601);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        c1894.f9555 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9555);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        c1894.f9538 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9538);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        c1894.f9602 = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        c1894.f9537 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1894.f9537);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        c1894.f9584 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1894.f9584);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        c1894.f9542 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9542);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        c1894.f9572 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9572);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        c1894.f9574 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9574);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        c1894.f9576 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9576);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        c1894.f9549 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9549);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        c1894.f9593 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9593);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        c1894.f9550 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9550);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        c1894.f9568 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9568);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        c1894.f9573 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9573);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        c1894.f9598 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1894.f9598);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        c1894.f9547 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c1894.f9547);
                        continue;
                        i7++;
                        break;
                    case 19:
                        i = indexCount2;
                        c1894.f9596 = typedArrayObtainStyledAttributes.getFloat(index2, c1894.f9596);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        c1894.f9565 = typedArrayObtainStyledAttributes.getFloat(index2, c1894.f9565);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        c1894.f9588 = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1894.f9588);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, c2047.f10178);
                        c2047.f10178 = i8;
                        c2047.f10178 = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        c1894.f9563 = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c1894.f9563);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        c1894.f9590 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9590);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        c1894.f9541 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9541);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        c1894.f9546 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9546);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        c1894.f9586 = typedArrayObtainStyledAttributes.getInt(index2, c1894.f9586);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        c1894.f9578 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9578);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        c1894.f9582 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9582);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        c1894.f9575 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9575);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        c1894.f9539 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9539);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        c1894.f9587 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9587);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        c1894.f9554 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9554);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        c1894.f9580 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9580);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        c1894.f9543 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9543);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        c1894.f9577 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9577);
                        continue;
                        i7++;
                        break;
                    case 37:
                        i = indexCount2;
                        c1894.f9548 = typedArrayObtainStyledAttributes.getFloat(index2, c1894.f9548);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        c2049.f10185 = typedArrayObtainStyledAttributes.getResourceId(index2, c2049.f10185);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        c1894.f9553 = typedArrayObtainStyledAttributes.getFloat(index2, c1894.f9553);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        c1894.f9592 = typedArrayObtainStyledAttributes.getFloat(index2, c1894.f9592);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        c1894.f9557 = typedArrayObtainStyledAttributes.getInt(index2, c1894.f9557);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        c1894.f9566 = typedArrayObtainStyledAttributes.getInt(index2, c1894.f9566);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        c2047.f10180 = typedArrayObtainStyledAttributes.getFloat(index2, c2047.f10180);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        c1457.f6949 = true;
                        c1457.f6942 = typedArrayObtainStyledAttributes.getDimension(index2, c1457.f6942);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        c1457.f6946 = typedArrayObtainStyledAttributes.getFloat(index2, c1457.f6946);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        c1457.f6951 = typedArrayObtainStyledAttributes.getFloat(index2, c1457.f6951);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        c1457.f6953 = typedArrayObtainStyledAttributes.getFloat(index2, c1457.f6953);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        c1457.f6944 = typedArrayObtainStyledAttributes.getFloat(index2, c1457.f6944);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        c1457.f6952 = typedArrayObtainStyledAttributes.getDimension(index2, c1457.f6952);
                        continue;
                        i7++;
                        break;
                    case 50:
                        i = indexCount2;
                        c1457.f6947 = typedArrayObtainStyledAttributes.getDimension(index2, c1457.f6947);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        c1457.f6943 = typedArrayObtainStyledAttributes.getDimension(index2, c1457.f6943);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        c1457.f6950 = typedArrayObtainStyledAttributes.getDimension(index2, c1457.f6950);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        c1457.f6948 = typedArrayObtainStyledAttributes.getDimension(index2, c1457.f6948);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        c1894.f9569 = typedArrayObtainStyledAttributes.getInt(index2, c1894.f9569);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        c1894.f9552 = typedArrayObtainStyledAttributes.getInt(index2, c1894.f9552);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        c1894.f9597 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9597);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        c1894.f9559 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9559);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        c1894.f9600 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9600);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        c1894.f9545 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9545);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        c1457.f6945 = typedArrayObtainStyledAttributes.getFloat(index2, c1457.f6945);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        c1894.f9564 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9564);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        c1894.f9544 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9544);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        c1894.f9579 = typedArrayObtainStyledAttributes.getFloat(index2, c1894.f9579);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        c1253.f5770 = m1470(typedArrayObtainStyledAttributes, index2, c1253.f5770);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            i7++;
                        }
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        c1253.f5769 = typedArrayObtainStyledAttributes.getFloat(index2, c1253.f5769);
                        break;
                    case 68:
                        i = indexCount2;
                        c2047.f10181 = typedArrayObtainStyledAttributes.getFloat(index2, c2047.f10181);
                        break;
                    case 69:
                        i = indexCount2;
                        c1894.f9558 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        c1894.f9581 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        c1894.f28 = typedArrayObtainStyledAttributes.getInt(index2, c1894.f28);
                        break;
                    case 73:
                        i = indexCount2;
                        c1894.f9585 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9585);
                        break;
                    case 74:
                        i = indexCount2;
                        c1894.f9556 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        c1894.f9570 = typedArrayObtainStyledAttributes.getBoolean(index2, c1894.f9570);
                        break;
                    case 76:
                        i = indexCount2;
                        c1253.f5773 = typedArrayObtainStyledAttributes.getInt(index2, c1253.f5773);
                        break;
                    case 77:
                        i = indexCount2;
                        c1894.f9560 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        c2047.f10179 = typedArrayObtainStyledAttributes.getInt(index2, c2047.f10179);
                        break;
                    case 79:
                        i = indexCount2;
                        c1253.f5775 = typedArrayObtainStyledAttributes.getFloat(index2, c1253.f5775);
                        break;
                    case 80:
                        i = indexCount2;
                        c1894.f9562 = typedArrayObtainStyledAttributes.getBoolean(index2, c1894.f9562);
                        break;
                    case 81:
                        i = indexCount2;
                        c1894.f9595 = typedArrayObtainStyledAttributes.getBoolean(index2, c1894.f9595);
                        break;
                    case 82:
                        i = indexCount2;
                        c1253.f5771 = typedArrayObtainStyledAttributes.getInteger(index2, c1253.f5771);
                        break;
                    case 83:
                        i = indexCount2;
                        c1457.f6941 = m1470(typedArrayObtainStyledAttributes, index2, c1457.f6941);
                        break;
                    case 84:
                        i = indexCount2;
                        c1253.f5772 = typedArrayObtainStyledAttributes.getInteger(index2, c1253.f5772);
                        break;
                    case 85:
                        i = indexCount2;
                        c1253.f5774 = typedArrayObtainStyledAttributes.getFloat(index2, c1253.f5774);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            c1253.f5768 = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c1253.f5767 = string2;
                            if (string2.indexOf("/") > 0) {
                                c1253.f5768 = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c1253.f5768);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        c1894.f9567 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9567);
                        break;
                    case 92:
                        i = indexCount2;
                        c1894.f9561 = m1470(typedArrayObtainStyledAttributes, index2, c1894.f9561);
                        break;
                    case 93:
                        i = indexCount2;
                        c1894.f9583 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9583);
                        break;
                    case 94:
                        i = indexCount2;
                        c1894.f9540 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c1894.f9540);
                        break;
                    case 95:
                        i = indexCount2;
                        m1474(c1894, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        m1474(c1894, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        c1894.f9599 = typedArrayObtainStyledAttributes.getInt(index2, c1894.f9599);
                        break;
                }
                i7++;
            }
            if (c1894.f9556 != null) {
                c1894.f9589 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c2049;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1474(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 == 3) {
            String string = typedArray.getString(i);
            if (string == null) {
                return;
            }
            int iIndexOf = string.indexOf(61);
            int length = string.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                return;
            }
            String strSubstring = string.substring(0, iIndexOf);
            String strSubstring2 = string.substring(iIndexOf + 1);
            if (strSubstring2.length() > 0) {
                String strTrim = strSubstring.trim();
                String strTrim2 = strSubstring2.trim();
                if ("ratio".equalsIgnoreCase(strTrim)) {
                    if (obj instanceof C1357) {
                        C1357 c1357 = (C1357) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c1357).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c1357).height = 0;
                        }
                        m1472(c1357, strTrim2);
                        return;
                    }
                    if (obj instanceof C1894) {
                        ((C1894) obj).f9602 = strTrim2;
                        return;
                    } else {
                        if (obj instanceof C1517) {
                            ((C1517) obj).m3139(5, strTrim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(strTrim)) {
                        float f = Float.parseFloat(strTrim2);
                        if (obj instanceof C1357) {
                            C1357 c13572 = (C1357) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c13572).width = 0;
                                c13572.f6304 = f;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c13572).height = 0;
                                c13572.f6325 = f;
                                return;
                            }
                        }
                        if (obj instanceof C1894) {
                            C1894 c1894 = (C1894) obj;
                            if (i2 == 0) {
                                c1894.f9563 = 0;
                                c1894.f9553 = f;
                                return;
                            } else {
                                c1894.f9588 = 0;
                                c1894.f9592 = f;
                                return;
                            }
                        }
                        if (obj instanceof C1517) {
                            C1517 c1517 = (C1517) obj;
                            if (i2 == 0) {
                                c1517.m3138(23, 0);
                                c1517.m3137(39, f);
                                return;
                            } else {
                                c1517.m3138(21, 0);
                                c1517.m3137(40, f);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(strTrim)) {
                        float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                        if (obj instanceof C1357) {
                            C1357 c13573 = (C1357) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) c13573).width = 0;
                                c13573.f6292 = fMax;
                                c13573.f6307 = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) c13573).height = 0;
                                c13573.f6264 = fMax;
                                c13573.f6317 = 2;
                                return;
                            }
                        }
                        if (obj instanceof C1894) {
                            C1894 c18942 = (C1894) obj;
                            if (i2 == 0) {
                                c18942.f9563 = 0;
                                c18942.f9558 = fMax;
                                c18942.f9569 = 2;
                                return;
                            } else {
                                c18942.f9588 = 0;
                                c18942.f9581 = fMax;
                                c18942.f9552 = 2;
                                return;
                            }
                        }
                        if (obj instanceof C1517) {
                            C1517 c15172 = (C1517) obj;
                            if (i2 == 0) {
                                c15172.m3138(23, 0);
                                c15172.m3138(54, 2);
                                return;
                            } else {
                                c15172.m3138(21, 0);
                                c15172.m3138(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (!(obj instanceof C1357)) {
                C1357 c13574 = (C1357) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c13574).width = i4;
                    c13574.f6290 = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c13574).height = i4;
                    c13574.f6293 = z;
                    return;
                }
            }
            if (obj instanceof C1894) {
                C1894 c18943 = (C1894) obj;
                if (i2 == 0) {
                    c18943.f9563 = i4;
                    c18943.f9562 = z;
                    return;
                } else {
                    c18943.f9588 = i4;
                    c18943.f9595 = z;
                    return;
                }
            }
            if (obj instanceof C1517) {
                C1517 c15173 = (C1517) obj;
                if (i2 == 0) {
                    c15173.m3138(23, i4);
                    c15173.m3140(80, z);
                    return;
                } else {
                    c15173.m3138(21, i4);
                    c15173.m3140(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof C1357)) {
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1475(Context context, int i) {
        AbstractC1340 abstractC1340;
        int i2;
        HashMap map;
        int i3;
        int i4;
        C0595 c0595 = this;
        AbstractC1340 abstractC13402 = (AbstractC1340) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = abstractC13402.getChildCount();
        HashMap map2 = c0595.f2819;
        map2.clear();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = abstractC13402.getChildAt(i5);
            C1357 c1357 = (C1357) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new C2049());
            }
            C2049 c2049 = (C2049) map2.get(Integer.valueOf(id));
            if (c2049 == null) {
                abstractC1340 = abstractC13402;
                i2 = childCount;
                map = map2;
                i3 = i5;
            } else {
                C2047 c2047 = c2049.f10186;
                C1894 c1894 = c2049.f10189;
                C1457 c1457 = c2049.f10184;
                abstractC1340 = abstractC13402;
                HashMap map3 = new HashMap();
                i2 = childCount;
                Class<?> cls = childAt.getClass();
                map = map2;
                HashMap map4 = c0595.f2818;
                for (String str : map4.keySet()) {
                    C1315 c1315 = (C1315) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            i4 = i5;
                            try {
                                map3.put(str, new C1315(c1315, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                e = e;
                                StringBuilder sbM3998 = AbstractC2104.m3998(" Custom Attribute \"", str, "\" not found on ");
                                sbM3998.append(cls.getName());
                                Log.e("TransitionLayout", sbM3998.toString(), e);
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                StringBuilder sbM39982 = AbstractC2104.m3998(" Custom Attribute \"", str, "\" not found on ");
                                sbM39982.append(cls.getName());
                                Log.e("TransitionLayout", sbM39982.toString(), e);
                            }
                        } else {
                            i4 = i5;
                            map3.put(str, new C1315(c1315, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        i4 = i5;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        i4 = i5;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        i4 = i5;
                    }
                    map4 = map5;
                    i5 = i4;
                }
                i3 = i5;
                c2049.f10188 = map3;
                c2049.f10185 = id;
                c1894.f9541 = c1357.f6271;
                c1894.f9546 = c1357.f6320;
                c1894.f9582 = c1357.f6295;
                c1894.f9575 = c1357.f6265;
                c1894.f9577 = c1357.f6270;
                c1894.f9543 = c1357.f6306;
                c1894.f9538 = c1357.f6299;
                c1894.f9555 = c1357.f6301;
                c1894.f9594 = c1357.f6267;
                c1894.f9567 = c1357.f6261;
                c1894.f9561 = c1357.f6279;
                c1894.f9587 = c1357.f6311;
                c1894.f9554 = c1357.f6278;
                c1894.f9574 = c1357.f6298;
                c1894.f9572 = c1357.f6296;
                c1894.f9565 = c1357.f6310;
                c1894.f9548 = c1357.f6314;
                c1894.f9602 = c1357.f6302;
                c1894.f9564 = c1357.f6318;
                c1894.f9544 = c1357.f6291;
                c1894.f9579 = c1357.f6285;
                c1894.f9537 = c1357.f6316;
                c1894.f9584 = c1357.f6277;
                c1894.f9586 = c1357.f6281;
                c1894.f9596 = c1357.f6312;
                c1894.f9598 = c1357.f6275;
                c1894.f9547 = c1357.f6287;
                c1894.f9563 = ((ViewGroup.MarginLayoutParams) c1357).width;
                c1894.f9588 = ((ViewGroup.MarginLayoutParams) c1357).height;
                c1894.f9590 = ((ViewGroup.MarginLayoutParams) c1357).leftMargin;
                c1894.f9578 = ((ViewGroup.MarginLayoutParams) c1357).rightMargin;
                c1894.f9580 = ((ViewGroup.MarginLayoutParams) c1357).topMargin;
                c1894.f9601 = ((ViewGroup.MarginLayoutParams) c1357).bottomMargin;
                c1894.f9583 = c1357.f6308;
                c1894.f9592 = c1357.f6325;
                c1894.f9553 = c1357.f6304;
                c1894.f9566 = c1357.f6263;
                c1894.f9557 = c1357.f6266;
                c1894.f9562 = c1357.f6290;
                c1894.f9595 = c1357.f6293;
                c1894.f9569 = c1357.f6307;
                c1894.f9552 = c1357.f6317;
                c1894.f9597 = c1357.f6300;
                c1894.f9559 = c1357.f6273;
                c1894.f9600 = c1357.f6297;
                c1894.f9545 = c1357.f6274;
                c1894.f9558 = c1357.f6292;
                c1894.f9581 = c1357.f6264;
                c1894.f9560 = c1357.f6276;
                c1894.f9573 = c1357.f6272;
                c1894.f9576 = c1357.f6288;
                c1894.f9593 = c1357.f6289;
                c1894.f9550 = c1357.f6326;
                c1894.f9568 = c1357.f6268;
                c1894.f9549 = c1357.f6303;
                c1894.f9540 = c1357.f6260;
                c1894.f9599 = c1357.f6321;
                c1894.f9542 = c1357.getMarginEnd();
                c1894.f9539 = c1357.getMarginStart();
                c2047.f10178 = childAt.getVisibility();
                c2047.f10180 = childAt.getAlpha();
                c1457.f6945 = childAt.getRotation();
                c1457.f6946 = childAt.getRotationX();
                c1457.f6951 = childAt.getRotationY();
                c1457.f6953 = childAt.getScaleX();
                c1457.f6944 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c1457.f6952 = pivotX;
                    c1457.f6947 = pivotY;
                }
                c1457.f6943 = childAt.getTranslationX();
                c1457.f6950 = childAt.getTranslationY();
                c1457.f6948 = childAt.getTranslationZ();
                if (c1457.f6949) {
                    c1457.f6942 = childAt.getElevation();
                }
                if (childAt instanceof C1019) {
                    C1019 c1019 = (C1019) childAt;
                    c1894.f9570 = c1019.getAllowsGoneWidget();
                    c1894.f9589 = c1019.getReferencedIds();
                    c1894.f28 = c1019.getType();
                    c1894.f9585 = c1019.getMargin();
                }
            }
            i5 = i3 + 1;
            c0595 = this;
            abstractC13402 = abstractC1340;
            childCount = i2;
            map2 = map;
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m1476(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C2049 c2049M1473 = m1473(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c2049M1473.f10189.f9551 = true;
                    }
                    this.f2819.put(Integer.valueOf(c2049M1473.f10185), c2049M1473);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }
}
