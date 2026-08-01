package kotlinx.coroutines;

import androidx.activity.AbstractC0053;
import kotlin.coroutines.AbstractC4358;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5401 extends AbstractC4358 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5452 f15044 = new C5452();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f15045;

    public C5401(String str) {
        super(f15044);
        this.f15045 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5401) && AbstractC4394.m8917(this.f15045, ((C5401) obj).f15045);
    }

    public final int hashCode() {
        return this.f15045.hashCode();
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("CoroutineName("), this.f15045, ')');
    }
}
