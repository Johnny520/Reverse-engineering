package kotlin.jvm.internal;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3057;
import io.ktor.util.C4207;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4391 implements InterfaceC5087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f12966;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f12967;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5092 f12968;

    public C4391(InterfaceC5092 interfaceC5092, List list, int i) {
        interfaceC5092.getClass();
        list.getClass();
        this.f12968 = interfaceC5092;
        this.f12966 = list;
        this.f12967 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4391)) {
            return false;
        }
        C4391 c4391 = (C4391) obj;
        return AbstractC4395.m8907(this.f12968, c4391.f12968) && AbstractC4395.m8907(this.f12966, c4391.f12966) && this.f12967 == c4391.f12967;
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12967) + AbstractC0053.m160(this.f12966, this.f12968.hashCode() * 31, 31);
    }

    public final String toString() {
        return m8897(false).concat(" (Kotlin reflection is not available)");
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo8896() {
        return (this.f12967 & 1) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String m8897(boolean z) {
        InterfaceC5092 interfaceC5092 = this.f12968;
        InterfaceC5093 interfaceC5093 = interfaceC5092 instanceof InterfaceC5093 ? (InterfaceC5093) interfaceC5092 : null;
        Class clsM6756 = interfaceC5093 != null ? AbstractC3057.m6756(interfaceC5093) : null;
        int i = 4;
        return (clsM6756 == null ? interfaceC5092.toString() : (this.f12967 & 4) != 0 ? "kotlin.Nothing" : clsM6756.isArray() ? clsM6756.equals(boolean[].class) ? "kotlin.BooleanArray" : clsM6756.equals(char[].class) ? "kotlin.CharArray" : clsM6756.equals(byte[].class) ? "kotlin.ByteArray" : clsM6756.equals(short[].class) ? "kotlin.ShortArray" : clsM6756.equals(int[].class) ? "kotlin.IntArray" : clsM6756.equals(float[].class) ? "kotlin.FloatArray" : clsM6756.equals(long[].class) ? "kotlin.LongArray" : clsM6756.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z && clsM6756.isPrimitive()) ? AbstractC3057.m6757((InterfaceC5093) interfaceC5092).getName() : clsM6756.getName()) + (this.f12966.isEmpty() ? "" : AbstractC4344.m8810(this.f12966, ", ", "<", ">", new C4207(this, i), 24)) + (mo8896() ? TypeDescription.Generic.OfWildcardType.SYMBOL : "");
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final List mo8898() {
        return this.f12966;
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5092 mo8899() {
        return this.f12968;
    }
}
