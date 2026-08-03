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
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static String m1100(byte[] bArr) {
        String strM915;
        "data";
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
                strM915 = "==";
            } else {
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                if (i4 == length) {
                    char[] cArr2 = f884;
                    stringBuffer.append(cArr2[i3 >>> 2]);
                    stringBuffer.append(cArr2[((i5 & 240) >>> 4) | ((i3 & 3) << 4)]);
                    stringBuffer.append(cArr2[(i5 & 15) << 2]);
                    strM915 = "=";
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
        C0237h4.m1089("toString(...)", string);
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static final Object m1103(Object obj) {
        Field field;
        "<this>";
        "pre";
        Class<?> cls = obj.getClass();
        "<this>";
        "pre";
        Field[] declaredFields = cls.getDeclaredFields();
        C0237h4.m1089("getDeclaredFields(...)", declaredFields);
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            C0237h4.m865(field);
            "it";
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
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
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
        "<this>";
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
