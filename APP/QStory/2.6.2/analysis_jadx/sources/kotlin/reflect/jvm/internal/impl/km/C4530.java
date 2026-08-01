package kotlin.reflect.jvm.internal.impl.km;

import androidx.activity.AbstractC0053;
import p000.AbstractC6087;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4530 extends AbstractC6087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f13196;

    public C4530(int i) {
        this.f13196 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4530) && this.f13196 == ((C4530) obj).f13196;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13196);
    }

    public final String toString() {
        return AbstractC0053.m154(new StringBuilder("TypeParameter(id="), this.f13196, ')');
    }
}
