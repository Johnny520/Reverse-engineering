package kotlin.jvm.internal;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4206;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import net.bytebuddy.description.type.TypeDescription;
import p053.AbstractC6560;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4390 implements InterfaceC5086 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f12962;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f12963;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5091 f12964;

    public C4390(InterfaceC5091 interfaceC5091, List list, int i) {
        interfaceC5091.getClass();
        list.getClass();
        this.f12964 = interfaceC5091;
        this.f12962 = list;
        this.f12963 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4390)) {
            return false;
        }
        C4390 c4390 = (C4390) obj;
        return AbstractC4394.m8917(this.f12964, c4390.f12964) && AbstractC4394.m8917(this.f12962, c4390.f12962) && this.f12963 == c4390.f12963;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12963) + AbstractC0053.m159(this.f12962, this.f12964.hashCode() * 31, 31);
    }

    public final String toString() {
        return m8907(false).concat(" (Kotlin reflection is not available)");
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo8906() {
        return (this.f12963 & 1) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String m8907(boolean z) {
        InterfaceC5091 interfaceC5091 = this.f12964;
        InterfaceC5092 interfaceC5092 = interfaceC5091 instanceof InterfaceC5092 ? (InterfaceC5092) interfaceC5091 : null;
        Class clsM12029 = interfaceC5092 != null ? AbstractC6560.m12029(interfaceC5092) : null;
        int i = 4;
        return (clsM12029 == null ? interfaceC5091.toString() : (this.f12963 & 4) != 0 ? "kotlin.Nothing" : clsM12029.isArray() ? clsM12029.equals(boolean[].class) ? "kotlin.BooleanArray" : clsM12029.equals(char[].class) ? "kotlin.CharArray" : clsM12029.equals(byte[].class) ? "kotlin.ByteArray" : clsM12029.equals(short[].class) ? "kotlin.ShortArray" : clsM12029.equals(int[].class) ? "kotlin.IntArray" : clsM12029.equals(float[].class) ? "kotlin.FloatArray" : clsM12029.equals(long[].class) ? "kotlin.LongArray" : clsM12029.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z && clsM12029.isPrimitive()) ? AbstractC6560.m12026((InterfaceC5092) interfaceC5091).getName() : clsM12029.getName()) + (this.f12962.isEmpty() ? "" : AbstractC4343.m8813(this.f12962, ", ", "<", ">", new C4206(this, i), 24)) + (mo8906() ? TypeDescription.Generic.OfWildcardType.SYMBOL : "");
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final List mo8908() {
        return this.f12962;
    }

    @Override // kotlin.reflect.InterfaceC5086
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5091 mo8909() {
        return this.f12964;
    }
}
