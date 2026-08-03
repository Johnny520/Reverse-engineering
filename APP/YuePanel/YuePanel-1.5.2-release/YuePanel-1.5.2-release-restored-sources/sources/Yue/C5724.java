package Yue;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
public final class C5724 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <E> E[] m17717(int i) {
        if (i >= 0) {
            return (E[]) new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> T[] m17718(@InterfaceC6399 T[] tArr, int i) {
        C5499.m17103(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        C5499.m17102(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <E> void m17719(@InterfaceC6399 E[] eArr, int i) {
        C5499.m17103(eArr, "<this>");
        eArr[i] = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <E> void m17720(@InterfaceC6399 E[] eArr, int i, int i2) {
        C5499.m17103(eArr, "<this>");
        while (i < i2) {
            m17719(eArr, i);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> boolean m17721(T[] tArr, int i, int i2, List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C5499.m17094(tArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> int m17722(T[] tArr, int i, int i2) {
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            T t = tArr[i + i3];
            iHashCode = (iHashCode * 31) + (t != null ? t.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> String m17723(T[] tArr, int i, int i2) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(tArr[i + i3]);
        }
        sb.append("]");
        String string = sb.toString();
        C5499.m17102(string, "sb.toString()");
        return string;
    }
}
