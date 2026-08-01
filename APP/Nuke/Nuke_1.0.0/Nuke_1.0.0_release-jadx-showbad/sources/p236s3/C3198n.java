package p236s3;

import com.bumptech.glide.AbstractC1924f;
import java.util.List;
import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p225q3.AbstractC2932c;
import p225q3.InterfaceC2933d;

/* JADX INFO: renamed from: s3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3198n implements InterfaceC2933d {

    /* JADX INFO: renamed from: a */
    public final String f9969a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2932c f9970b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3198n(String str, AbstractC2932c abstractC2932c) {
        AbstractC1665j.m2985e(abstractC2932c, "kind");
        this.f9969a = str;
        this.f9970b = abstractC2932c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: a */
    public final int mo5130a(String str) {
        AbstractC1665j.m2985e(str, "name");
        m5465g();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: b */
    public final String mo5131b() {
        return this.f9969a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: c */
    public final AbstractC1924f mo5132c() {
        return this.f9970b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: d */
    public final int mo5133d() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: e */
    public final String mo5134e(int i5) {
        m5465g();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3198n)) {
            return false;
        }
        C3198n c3198n = (C3198n) obj;
        return AbstractC1665j.m2981a(this.f9969a, c3198n.f9969a) && AbstractC1665j.m2981a(this.f9970b, c3198n.f9970b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m5465g() {
        throw new IllegalStateException(AbstractC0231b.m403n(new StringBuilder("Primitive descriptor "), this.f9969a, " does not have elements"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f9970b.hashCode() * 31) + this.f9969a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: i */
    public final List mo5137i(int i5) {
        m5465g();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: j */
    public final InterfaceC2933d mo5138j(int i5) {
        m5465g();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: k */
    public final boolean mo5139k(int i5) {
        m5465g();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0231b.m402m(new StringBuilder("PrimitiveDescriptor("), this.f9969a, ')');
    }
}
