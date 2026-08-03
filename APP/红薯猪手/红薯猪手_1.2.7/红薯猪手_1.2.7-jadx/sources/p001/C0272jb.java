package p001;

import android.annotation.SuppressLint;
import java.io.Closeable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p001.AbstractC0255i8;

/* JADX INFO: renamed from: ۟.jb */
/* JADX INFO: loaded from: classes.dex */
public class C0272jb {

    /* JADX INFO: renamed from: ۥ */
    public static final char[] f884 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: ۥ۟ */
    public static final byte[] f885 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Object[] f1531 = new Object[0];

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final C0272jb f1532 = new C0272jb();

    /* JADX INFO: renamed from: ۥ */
    public static final ArrayList m874(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0395t(objArr));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m875(Closeable closeable, Throwable th) {
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            if (th != th2) {
                C0185d8.f756.mo837(th, th2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m1098(String str, String str2) {
        str2.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(C0341oa.m915(new byte[]{68, -25}, new byte[]{114, -47, -58, -53, 30, 29}));
        sb.append(C0341oa.m915(new byte[]{120}, new byte[]{78, -103, -108, 65, 64, -119}));
        StringBuilder sbM1039 = C0167c4.m1039(sb.toString());
        sbM1039.append(C0341oa.m915(new byte[]{-50, -62, 74, -91, -119, -14, -50}, new byte[]{-8, -12, 124, -109, -65, -60}));
        char[] charArray = sbM1039.toString().toCharArray();
        int length = charArray.length;
        char[] charArray2 = str.toCharArray();
        int length2 = charArray2.length;
        for (int i = 0; i < length2; i++) {
            charArray2[i] = (char) (charArray2[i] - charArray[i / length]);
        }
        return new String(charArray2);
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static String m1099(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-119, 113, 126, -98, 71, -116, -98}, new byte[]{-22, 30, 16, -22, 34, -30}), str);
        char[] charArray = str.toCharArray();
        C0237h4.m1089(C0341oa.m915(new byte[]{-108, -60, -38, -103, -43, -12, -95, -39, -21, -112, -51, -82, -50, -123, -73, -40}, new byte[]{-32, -85, -103, -15, -76, -122}), charArray);
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            sb.append((char) (c - '\f'));
        }
        String string = sb.toString();
        C0237h4.m1089(C0341oa.m915(new byte[]{-24, 102, 16, 79, -109, -87, -14, 110, 107, 21, -49, -18, -75}, new byte[]{-100, 9, 67, 59, -31, -64}), string);
        return string;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static String m1100(byte[] bArr) {
        String strM915;
        C0341oa.m915(new byte[]{116, -29, -68, -61}, new byte[]{16, -126, -56, -94, 57, -4});
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            if (i2 == length) {
                char[] cArr = f884;
                stringBuffer.append(cArr[i3 >>> 2]);
                stringBuffer.append(cArr[(i3 & 3) << 4]);
                strM915 = C0341oa.m915(new byte[]{-33, -12}, new byte[]{-30, -55, -22, -66, -38, 51});
            } else {
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                if (i4 == length) {
                    char[] cArr2 = f884;
                    stringBuffer.append(cArr2[i3 >>> 2]);
                    stringBuffer.append(cArr2[((i5 & 240) >>> 4) | ((i3 & 3) << 4)]);
                    stringBuffer.append(cArr2[(i5 & 15) << 2]);
                    strM915 = C0341oa.m915(new byte[]{94}, new byte[]{99, -95, -5, 34, -87, 78});
                } else {
                    int i6 = i4 + 1;
                    int i7 = bArr[i4] & 255;
                    char[] cArr3 = f884;
                    stringBuffer.append(cArr3[i3 >>> 2]);
                    stringBuffer.append(cArr3[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                    stringBuffer.append(cArr3[((i5 & 15) << 2) | ((i7 & 192) >>> 6)]);
                    stringBuffer.append(cArr3[i7 & 63]);
                    i = i6;
                }
            }
            stringBuffer.append(strM915);
            break;
        }
        String string = stringBuffer.toString();
        C0237h4.m1089(C0341oa.m915(new byte[]{-112, -26, -55, -124, -51, 81, -118, -18, -78, -34, -111, 22, -51}, new byte[]{-28, -119, -102, -16, -65, 56}), string);
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static String m1101(String str, String str2) {
        int length = str2.toCharArray().length;
        StringBuilder sb = new StringBuilder();
        sb.append(C0341oa.m915(new byte[]{-19}, new byte[]{-37, 71, 56, 14, -35, -60}));
        sb.append(C0341oa.m915(new byte[]{-106}, new byte[]{-96, 125, 105, 106, -126, -79}));
        StringBuilder sbM1039 = C0167c4.m1039(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C0341oa.m915(new byte[]{-106, -40}, new byte[]{-96, -18, -59, 96, -25, -70}));
        sb2.append(C0341oa.m915(new byte[]{109, -23, 70}, new byte[]{91, -33, 112, -41, 34, 96}));
        sb2.append(C0341oa.m915(new byte[]{28, -46}, new byte[]{42, -28, -97, -90, 44, 107}));
        sb2.append(C0341oa.m915(new byte[]{0}, new byte[]{54, 8, 121, -77, 75, -38}));
        sbM1039.append((Object) sb2);
        char[] charArray = sbM1039.toString().toCharArray();
        int length2 = charArray.length;
        char[] charArray2 = str.toCharArray();
        int length3 = charArray2.length;
        for (int i = 0; i < length3; i++) {
            charArray2[i] = (char) (charArray2[i] + charArray[i / length2]);
        }
        return new String(charArray2);
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static String m1102(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-83, -60, 91, -121, 98, 96, -70}, new byte[]{-50, -85, 53, -13, 7, 14}), str);
        char[] charArray = str.toCharArray();
        C0237h4.m1089(C0341oa.m915(new byte[]{-43, 34, 27, 60, 73, 95, -32, 63, 42, 53, 81, 5, -113, 99, 118, 125}, new byte[]{-95, 77, 88, 84, 40, 45}), charArray);
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            sb.append((char) (c + '\f'));
        }
        String string = sb.toString();
        C0237h4.m1089(C0341oa.m915(new byte[]{103, -116, 108, 89, 11, 96, 125, -124, 23, 3, 87, 39, 58}, new byte[]{19, -29, 63, 45, 121, 9}), string);
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static final Object m1103(Object obj) {
        Field field;
        C0341oa.m915(new byte[]{-114, -8, 49, -9, 112, 87}, new byte[]{-78, -116, 89, -98, 3, 105});
        C0341oa.m915(new byte[]{26, -85, 47}, new byte[]{106, -39, 74, -84, -79, 6});
        Class<?> cls = obj.getClass();
        C0341oa.m915(new byte[]{-77, 43, 8, -8, -89, 122}, new byte[]{-113, 95, 96, -111, -44, 68});
        C0341oa.m915(new byte[]{61, -78, 83}, new byte[]{77, -64, 54, 59, -59, 55});
        Field[] declaredFields = cls.getDeclaredFields();
        C0237h4.m1089(C0341oa.m915(new byte[]{2, -20, 123, 104, 47, 56, 9, -24, 125, 73, 46, 29, 12, -20, 99, 72, 57, 115, 75, -89, 33, 5}, new byte[]{101, -119, 15, 44, 74, 91}), declaredFields);
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            C0237h4.m865(field);
            C0341oa.m915(new byte[]{-74, 106}, new byte[]{-33, 30, 101, -79, 111, 121});
            if (Boolean.valueOf(C0237h4.m864(field.getType().getName(), C0283k8.f1632.f1592)).booleanValue()) {
                field.setAccessible(true);
                break;
            }
            i++;
        }
        if (field != null) {
            return field.get(obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static final String m1104(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C0341oa.m915(new byte[]{-10, 30, 109}, new byte[]{-69, 90, 88, -124, -29, -118}));
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i = 0;
            for (byte b : bArrDigest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static final List m1105(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        C0237h4.m1089("singletonList(...)", listSingletonList);
        return listSingletonList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public static final List m1106(Object... objArr) {
        if (objArr.length <= 0) {
            return C0179d2.f753;
        }
        List listAsList = Arrays.asList(objArr);
        C0237h4.m1089("asList(...)", listAsList);
        return listAsList;
    }

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public static final ArrayList m1107(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0395t(objArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠ */
    public static final int m876(AbstractC0255i8.a aVar, C0223g4 c0223g4) {
        if (c0223g4.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + c0223g4);
        }
        int i = c0223g4.f762;
        if (i < Integer.MAX_VALUE) {
            return aVar.mo1057(c0223g4.f761, i + 1);
        }
        int i2 = c0223g4.f761;
        return i2 > Integer.MIN_VALUE ? aVar.mo1057(i2 - 1, i) + 1 : aVar.mo845();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static final Set m1108(Object... objArr) {
        if (objArr.length <= 0) {
            return C0207f2.f778;
        }
        int length = objArr.length;
        if (length == 0) {
            return C0207f2.f778;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            C0237h4.m1089("singleton(...)", setSingleton);
            return setSingleton;
        }
        int length2 = objArr.length;
        if (length2 >= 0) {
            length2 = length2 < 3 ? length2 + 1 : length2 < 1073741824 ? (int) ((length2 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(length2);
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public static final void m1109(AlertDialogC0441w6 alertDialogC0441w6, int i) {
        C0341oa.m915(new byte[]{125, 10, -121, 94, 17, -107}, new byte[]{65, 126, -17, 55, 98, -85});
        if (i > 0) {
            alertDialogC0441w6.setCancelable(false);
            CharSequence text = alertDialogC0441w6.f1486.getText();
            alertDialogC0441w6.f1486.setEnabled(false);
            if (alertDialogC0441w6.f1485.getVisibility() == 0) {
                alertDialogC0441w6.f1485.setEnabled(false);
            }
            new Thread(new RunnableC0244hb(new C0352p8(), i, alertDialogC0441w6, text)).start();
        }
    }

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    public static final Object[] m1110(Collection collection) {
        C0237h4.m1090("collection", collection);
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i3 = 2147483645;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                        C0237h4.m1089("copyOf(...)", objArrCopyOf);
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        C0237h4.m1089("copyOf(...)", objArrCopyOf2);
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            }
        }
        return f1531;
    }

    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public static final Object[] m1111(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        C0237h4.m1090("collection", collection);
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            C0237h4.m1088("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", objNewInstance);
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i3 = 2147483645;
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                C0237h4.m1089("copyOf(...)", objArrCopyOf);
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                C0237h4.m1089("copyOf(...)", objArrCopyOf2);
                return objArrCopyOf2;
            }
            i = i2;
        }
    }
}
