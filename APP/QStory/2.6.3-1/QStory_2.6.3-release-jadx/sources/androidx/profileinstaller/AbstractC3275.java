package androidx.profileinstaller;

import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import bsh.C3447;
import bsh.ParseException;
import com.alibaba.fastjson2.AbstractC3732;
import com.android.p002dx.util.AnnotatedOutput;
import com.android.p002dx.util.Hex;
import com.esotericsoftware.kryo.KryoException;
import com.materialkolor.dynamiccolor.C4628;
import com.materialkolor.dynamiccolor.C4637;
import java.util.Iterator;
import kotlin.jvm.internal.C5229;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.matcher.ElementMatcher;
import p068.InterfaceC7383;
import p113.InterfaceC8060;
import p303.AbstractC9234;
import p345.C9595;

/* JADX INFO: renamed from: androidx.profileinstaller.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3275 {
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static String m5120(StringBuilder sb, int i) {
        sb.append(Hex.m28u2(i));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static void m5121(StringBuilder sb, String str, String str2, KryoException kryoException) {
        sb.append(str);
        sb.append(str2);
        kryoException.addTrace(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static void m5122(C2159 c2159, InterfaceC2962 interfaceC2962, InterfaceC7383 interfaceC7383, int i, int i2) {
        AbstractC2202.m3032(c2159, interfaceC2962, interfaceC7383);
        AbstractC9234.m14531(i);
        AbstractC9234.m14531(i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static void m5123(int i, StringBuilder sb, AnnotatedOutput annotatedOutput, int i2) {
        sb.append(Hex.m30u4(i));
        annotatedOutput.annotate(i2, sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static StringBuilder m5124(String str, InterfaceC8060 interfaceC8060, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(interfaceC8060);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static String m5125(TypeDescription typeDescription, String str) {
        return typeDescription + str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m5126(TypeDefinition typeDefinition, int i) {
        return typeDefinition.getStackSize().getSize() + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m5127(MethodDescription methodDescription, int i, int i2) {
        return (methodDescription.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static int m5128(MethodDescription.InDefinedShape inDefinedShape, int i, int i2) {
        return (inDefinedShape.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m5129(int i, int i2, Class cls) {
        return (cls.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m5130(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m5131(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) * i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static String m5132(String str, TypeDescription typeDescription) {
        return str + typeDescription;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static String m5133(String str, MethodDescription methodDescription) {
        return str + methodDescription;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static String m5134(StringBuilder sb, ElementMatcher elementMatcher, String str) {
        sb.append(elementMatcher);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static String m5135(C5229 c5229, Class cls, StringBuilder sb) {
        sb.append(c5229.mo9476(cls));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static String m5136(StringBuilder sb, int i) {
        sb.append(Integer.toString(i));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static String m5137(StringBuilder sb, String str, String str2, AbstractC3732 abstractC3732) {
        sb.append(str);
        sb.append(str2);
        return abstractC3732.mo6730(sb.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static ClassCastException m5138(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C4637 m5139(C4628 c4628) {
        c4628.getClass();
        return new C4637();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static String m5140(Object obj, String str, StringBuilder sb) {
        sb.append(obj.getClass());
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static String m5141(Object obj, StringBuilder sb) {
        sb.append(obj.getClass());
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static String m5142(int i, C9595 c9595, String str) {
        AbstractC9234.m14531(i);
        c9595.getClass();
        return AbstractC9234.m14532(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static String m5143(long j, String str) {
        return str + j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m5144(TypeDescription typeDescription, int i, int i2) {
        return (typeDescription.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m5145(TypeDescription.Generic generic, int i, int i2) {
        return (generic.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static int m5146(ElementMatcher elementMatcher, int i, int i2) {
        return (elementMatcher.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static ParseException m5147(C3447 c3447, int i) {
        c3447.m5843(i);
        return new ParseException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m5148(StackManipulation stackManipulation, int i, int i2) {
        return (stackManipulation.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static int m5149(Assigner assigner, int i, int i2) {
        return (assigner.hashCode() + i) * i2;
    }
}
