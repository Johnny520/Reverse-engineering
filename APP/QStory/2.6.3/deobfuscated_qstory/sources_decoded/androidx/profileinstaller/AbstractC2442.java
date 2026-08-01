package androidx.profileinstaller;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.ui.InterfaceC2129;
import bsh.C2614;
import bsh.ParseException;
import com.alibaba.fastjson2.AbstractC2899;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import com.esotericsoftware.kryo.KryoException;
import com.materialkolor.dynamiccolor.C3796;
import com.materialkolor.dynamiccolor.C3805;
import java.util.Iterator;
import kotlin.jvm.internal.C4397;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.matcher.ElementMatcher;
import p052.InterfaceC6554;
import p097.InterfaceC7231;
import p287.AbstractC8405;
import p329.C8766;

/* JADX INFO: renamed from: androidx.profileinstaller.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2442 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static String m4560(StringBuilder sb, int i) {
        sb.append(Hex.u2(i));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m4561(StringBuilder sb, String str, String str2, KryoException kryoException) {
        sb.append(str);
        sb.append(str2);
        kryoException.addTrace(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m4562(C1324 c1324, InterfaceC2129 interfaceC2129, InterfaceC6554 interfaceC6554, int i, int i2) {
        AbstractC1367.m2472(c1324, interfaceC2129, interfaceC6554);
        AbstractC8405.m13972(i);
        AbstractC8405.m13972(i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m4563(int i, StringBuilder sb, AnnotatedOutput annotatedOutput, int i2) {
        sb.append(Hex.u4(i));
        annotatedOutput.annotate(i2, sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static StringBuilder m4564(String str, InterfaceC7231 interfaceC7231, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(interfaceC7231);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static String m4565(TypeDescription typeDescription, String str) {
        return typeDescription + str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m4566(TypeDefinition typeDefinition, int i) {
        return typeDefinition.getStackSize().getSize() + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m4567(MethodDescription methodDescription, int i, int i2) {
        return (methodDescription.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m4568(MethodDescription.InDefinedShape inDefinedShape, int i, int i2) {
        return (inDefinedShape.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m4569(int i, int i2, Class cls) {
        return (cls.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m4570(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m4571(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) * i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static String m4572(String str, TypeDescription typeDescription) {
        return str + typeDescription;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static String m4573(String str, MethodDescription methodDescription) {
        return str + methodDescription;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static String m4574(StringBuilder sb, ElementMatcher elementMatcher, String str) {
        sb.append(elementMatcher);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static String m4575(C4397 c4397, Class cls, StringBuilder sb) {
        sb.append(c4397.mo8917(cls));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static String m4576(StringBuilder sb, int i) {
        sb.append(Integer.toString(i));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static String m4577(StringBuilder sb, String str, String str2, AbstractC2899 abstractC2899) {
        sb.append(str);
        sb.append(str2);
        return abstractC2899.mo6170(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static ClassCastException m4578(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C3805 m4579(C3796 c3796) {
        c3796.getClass();
        return new C3805();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static String m4580(Object obj, String str, StringBuilder sb) {
        sb.append(obj.getClass());
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static String m4581(Object obj, StringBuilder sb) {
        sb.append(obj.getClass());
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static String m4582(int i, C8766 c8766, String str) {
        AbstractC8405.m13972(i);
        c8766.getClass();
        return AbstractC8405.m13973(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static String m4583(long j, String str) {
        return str + j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m4584(TypeDescription typeDescription, int i, int i2) {
        return (typeDescription.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m4585(TypeDescription.Generic generic, int i, int i2) {
        return (generic.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int m4586(ElementMatcher elementMatcher, int i, int i2) {
        return (elementMatcher.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static ParseException m4587(C2614 c2614, int i) {
        c2614.m5283(i);
        return new ParseException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m4588(StackManipulation stackManipulation, int i, int i2) {
        return (stackManipulation.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static int m4589(Assigner assigner, int i, int i2) {
        return (assigner.hashCode() + i) * i2;
    }
}
