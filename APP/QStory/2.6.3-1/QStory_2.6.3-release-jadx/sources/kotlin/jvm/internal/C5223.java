package kotlin.jvm.internal;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.AbstractC3889;
import io.ktor.util.C5039;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: renamed from: kotlin.jvm.internal.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5223 implements InterfaceC5919 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f13311;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f13312;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5924 f13313;

    public C5223(InterfaceC5924 interfaceC5924, List list, int i) {
        interfaceC5924.getClass();
        list.getClass();
        this.f13313 = interfaceC5924;
        this.f13311 = list;
        this.f13312 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5223)) {
            return false;
        }
        C5223 c5223 = (C5223) obj;
        return AbstractC5227.m9466(this.f13313, c5223.f13313) && AbstractC5227.m9466(this.f13311, c5223.f13311) && this.f13312 == c5223.f13312;
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13312) + AbstractC0900.m720(this.f13311, this.f13313.hashCode() * 31, 31);
    }

    public final String toString() {
        return m9456(false).concat(" (Kotlin reflection is not available)");
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo9455() {
        return (this.f13312 & 1) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String m9456(boolean z) {
        InterfaceC5924 interfaceC5924 = this.f13313;
        InterfaceC5925 interfaceC5925 = interfaceC5924 instanceof InterfaceC5925 ? (InterfaceC5925) interfaceC5924 : null;
        Class clsM7316 = interfaceC5925 != null ? AbstractC3889.m7316(interfaceC5925) : null;
        int i = 4;
        return (clsM7316 == null ? interfaceC5924.toString() : (this.f13312 & 4) != 0 ? "kotlin.Nothing" : clsM7316.isArray() ? clsM7316.equals(boolean[].class) ? "kotlin.BooleanArray" : clsM7316.equals(char[].class) ? "kotlin.CharArray" : clsM7316.equals(byte[].class) ? "kotlin.ByteArray" : clsM7316.equals(short[].class) ? "kotlin.ShortArray" : clsM7316.equals(int[].class) ? "kotlin.IntArray" : clsM7316.equals(float[].class) ? "kotlin.FloatArray" : clsM7316.equals(long[].class) ? "kotlin.LongArray" : clsM7316.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : (z && clsM7316.isPrimitive()) ? AbstractC3889.m7317((InterfaceC5925) interfaceC5924).getName() : clsM7316.getName()) + (this.f13311.isEmpty() ? "" : AbstractC5176.m9369(this.f13311, ", ", "<", ">", new C5039(this, i), 24)) + (mo9455() ? TypeDescription.Generic.OfWildcardType.SYMBOL : "");
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final List mo9457() {
        return this.f13311;
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5924 mo9458() {
        return this.f13313;
    }
}
