package androidx.compose.runtime;

import androidx.collection.C0276;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1353 implements InterfaceC4360 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3924;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C0276 f3922 = new C0276(7);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ C1353 f3923 = new C1353(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C1353 f3919 = new C1353(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C1353 f3918 = new C1353(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C1353 f3920 = new C1353(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C1353 f3921 = new C1353(5);

    public /* synthetic */ C1353(int i) {
        this.f3924 = i;
    }

    public String toString() {
        switch (this.f3924) {
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
    public boolean m2426(Object obj, Object obj2) {
        switch (this.f3924) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return AbstractC4394.m8917(obj, obj2);
        }
    }
}
