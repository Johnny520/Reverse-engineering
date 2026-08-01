package androidx.compose.runtime;

import androidx.collection.C1123;
import kotlin.coroutines.InterfaceC5193;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2188 implements InterfaceC5193 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4270;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1123 f4268 = new C1123(7);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ C2188 f4269 = new C2188(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C2188 f4265 = new C2188(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C2188 f4264 = new C2188(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C2188 f4266 = new C2188(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C2188 f4267 = new C2188(5);

    public /* synthetic */ C2188(int i) {
        this.f4270 = i;
    }

    public String toString() {
        switch (this.f4270) {
            case 2:
                return "NeverEqualPolicy";
            case 3:
                return "ReferentialEqualityPolicy";
            case 4:
            case 6:
            default:
                return super.toString();
            case 5:
                return "StructuralEqualityPolicy";
            case 7:
                return "Empty";
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean m2996(Object obj, Object obj2) {
        switch (this.f4270) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return AbstractC5227.m9466(obj, obj2);
        }
    }
}
