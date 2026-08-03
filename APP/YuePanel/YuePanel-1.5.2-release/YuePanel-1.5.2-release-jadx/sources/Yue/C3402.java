package Yue;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nArraysJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,61:1\n26#2:62\n*S KotlinDebug\n*F\n+ 1 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n18#1:62\n*E\n"})
public class C3402 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final <T> T[] m489(@InterfaceC6399 T[] tArr, int i) {
        C5499.m17103(tArr, Name.REFER);
        Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        C5499.m17101(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) objNewInstance);
    }

    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    @InterfaceC5572(name = "contentDeepHashCode")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> int m490(@InterfaceC6489 T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m7052(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ <T> T[] m7053(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        C5499.m17112(0, "T?");
        return (T[]) new Object[0];
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String m7054(byte[] bArr, Charset charset) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(charset, "charset");
        return new String(bArr, charset);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ <T> T[] m7055(Collection<? extends T> collection) {
        C5499.m17103(collection, "<this>");
        C5499.m17112(0, "T?");
        return (T[]) collection.toArray(new Object[0]);
    }
}
