package Yue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
public class C3403 extends C3402 {
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    @InterfaceC5572(name = "contentDeepEquals")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> boolean m7056(@InterfaceC6489 T[] tArr, @InterfaceC6489 T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            Object[] objArr = tArr[i];
            Object[] objArr2 = tArr2[i];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!m7056(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof C8049) && (objArr2 instanceof C8049)) {
                    if (!C8045.m25542(((C8049) objArr).m26262(), ((C8049) objArr2).m26262())) {
                        return false;
                    }
                } else if ((objArr instanceof C8081) && (objArr2 instanceof C8081)) {
                    if (!C8045.m25540(((C8081) objArr).m26659(), ((C8081) objArr2).m26659())) {
                        return false;
                    }
                } else if ((objArr instanceof C8058) && (objArr2 instanceof C8058)) {
                    if (!C8045.m25541(((C8058) objArr).m26389(), ((C8058) objArr2).m26389())) {
                        return false;
                    }
                } else if ((objArr instanceof C8065) && (objArr2 instanceof C8065)) {
                    if (!C8045.m25543(((C8065) objArr).m26479(), ((C8065) objArr2).m26479())) {
                        return false;
                    }
                } else if (!C5499.m17094(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC5572(name = "contentDeepToString")
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> String m7057(@InterfaceC6489 T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder((C7007.m21668(tArr.length, 429496729) * 5) + 2);
        m7058(tArr, sb, new ArrayList());
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> void m7058(T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object[] objArr = tArr[i];
            if (objArr == 0) {
                sb.append("null");
            } else if (objArr instanceof Object[]) {
                m7058(objArr, sb, list);
            } else if (objArr instanceof byte[]) {
                String string = Arrays.toString((byte[]) objArr);
                C5499.m17102(string, "toString(this)");
                sb.append(string);
            } else if (objArr instanceof short[]) {
                String string2 = Arrays.toString((short[]) objArr);
                C5499.m17102(string2, "toString(this)");
                sb.append(string2);
            } else if (objArr instanceof int[]) {
                String string3 = Arrays.toString((int[]) objArr);
                C5499.m17102(string3, "toString(this)");
                sb.append(string3);
            } else if (objArr instanceof long[]) {
                String string4 = Arrays.toString((long[]) objArr);
                C5499.m17102(string4, "toString(this)");
                sb.append(string4);
            } else if (objArr instanceof float[]) {
                String string5 = Arrays.toString((float[]) objArr);
                C5499.m17102(string5, "toString(this)");
                sb.append(string5);
            } else if (objArr instanceof double[]) {
                String string6 = Arrays.toString((double[]) objArr);
                C5499.m17102(string6, "toString(this)");
                sb.append(string6);
            } else if (objArr instanceof char[]) {
                String string7 = Arrays.toString((char[]) objArr);
                C5499.m17102(string7, "toString(this)");
                sb.append(string7);
            } else if (objArr instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) objArr);
                C5499.m17102(string8, "toString(this)");
                sb.append(string8);
            } else if (objArr instanceof C8049) {
                sb.append(C8045.m25548(((C8049) objArr).m26262()));
            } else if (objArr instanceof C8081) {
                sb.append(C8045.m25550(((C8081) objArr).m26659()));
            } else if (objArr instanceof C8058) {
                sb.append(C8045.m25549(((C8058) objArr).m26389()));
            } else if (objArr instanceof C8065) {
                sb.append(C8045.m25551(((C8065) objArr).m26479()));
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(']');
        list.remove(C3880.m10737(list));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> List<T> m7059(@InterfaceC6399 T[][] tArr) {
        C5499.m17103(tArr, "<this>");
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(length);
        for (T[] tArr3 : tArr) {
            C3885.m10773(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;LYue/ۥۣ۠۠ۨ<+TR;>;)TR; */
    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Object m7060(Object[] objArr, InterfaceC5122 interfaceC5122) {
        C5499.m17103(interfaceC5122, "defaultValue");
        return objArr.length == 0 ? interfaceC5122.invoke() : objArr;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean m7061(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T, R> C6599<List<T>, List<R>> m7062(@InterfaceC6399 C6599<? extends T, ? extends R>[] c6599Arr) {
        C5499.m17103(c6599Arr, "<this>");
        ArrayList arrayList = new ArrayList(c6599Arr.length);
        ArrayList arrayList2 = new ArrayList(c6599Arr.length);
        for (C6599<? extends T, ? extends R> c6599 : c6599Arr) {
            arrayList.add(c6599.m20938());
            arrayList2.add(c6599.m20939());
        }
        return C8003.m4014(arrayList, arrayList2);
    }
}
