package androidx.profileinstaller;

import bsh.C2613;
import bsh.ParseException;
import com.alibaba.fastjson2.AbstractC2898;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import com.bumptech.glide.AbstractC3056;
import com.esotericsoftware.kryo.KryoException;
import com.materialkolor.dynamiccolor.C3795;
import com.materialkolor.dynamiccolor.C3804;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.C4396;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.matcher.ElementMatcher;
import p097.InterfaceC7230;
import p325.C8758;

/* JADX INFO: renamed from: androidx.profileinstaller.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2442 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static String m4550(StringBuilder sb, int i) {
        sb.append(Hex.u2(i));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m4551(StringBuilder sb, String str, String str2, KryoException kryoException) {
        sb.append(str);
        sb.append(str2);
        kryoException.addTrace(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m4552(int i, StringBuilder sb, AnnotatedOutput annotatedOutput, int i2) {
        sb.append(Hex.u4(i));
        annotatedOutput.annotate(i2, sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static StringBuilder m4553(String str, InterfaceC7230 interfaceC7230, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(interfaceC7230);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static String m4554(TypeDescription typeDescription, String str) {
        return typeDescription + str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static String m4555(C4396 c4396, Class cls, StringBuilder sb) {
        sb.append(c4396.mo8927(cls));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m4556(TypeDefinition typeDefinition, int i) {
        return typeDefinition.getStackSize().getSize() + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m4557(MethodDescription methodDescription, int i, int i2) {
        return (methodDescription.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m4558(MethodDescription.InDefinedShape inDefinedShape, int i, int i2) {
        return (inDefinedShape.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m4559(int i, int i2, Class cls) {
        return (cls.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m4560(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m4561(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) * i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static String m4562(String str, MethodDescription methodDescription) {
        return str + methodDescription;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static String m4563(String str, Locale locale, long j) {
        String lowerCase = str.toLowerCase(locale);
        AbstractC3056.m6668(j);
        lowerCase.getClass();
        return lowerCase;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static String m4564(StringBuilder sb, String str, String str2, AbstractC2898 abstractC2898) {
        sb.append(str);
        sb.append(str2);
        return abstractC2898.mo6124(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static String m4565(StringBuilder sb, ElementMatcher elementMatcher, String str) {
        sb.append(elementMatcher);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static String m4566(String str, TypeDescription typeDescription) {
        return str + typeDescription;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static String m4567(StringBuilder sb, int i) {
        sb.append(Integer.toString(i));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static ClassCastException m4568(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C3804 m4569(C3795 c3795) {
        c3795.getClass();
        return new C3804();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static String m4570(Object obj, String str, StringBuilder sb) {
        sb.append(obj.getClass());
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static String m4571(Object obj, StringBuilder sb) {
        sb.append(obj.getClass());
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static String m4572(long j, String str) {
        return str + j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static String m4573(long j, C8758 c8758, long j2) {
        AbstractC3056.m6668(j);
        c8758.getClass();
        return AbstractC3056.m6668(j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m4574(TypeDescription typeDescription, int i, int i2) {
        return (typeDescription.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m4575(TypeDescription.Generic generic, int i, int i2) {
        return (generic.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int m4576(ElementMatcher elementMatcher, int i, int i2) {
        return (elementMatcher.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static ParseException m4577(C2613 c2613, int i) {
        c2613.m5238(i);
        return new ParseException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m4578(StackManipulation stackManipulation, int i, int i2) {
        return (stackManipulation.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static int m4579(Assigner assigner, int i, int i2) {
        return (assigner.hashCode() + i) * i2;
    }
}
