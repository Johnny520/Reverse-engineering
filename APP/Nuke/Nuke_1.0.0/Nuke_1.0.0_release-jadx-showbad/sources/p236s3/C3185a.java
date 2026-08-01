package p236s3;

import com.bumptech.glide.AbstractC1924f;
import java.util.List;
import p011B4.AbstractC0231b;
import p061L2.C0981u;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1983k;
import p225q3.C2936g;
import p225q3.InterfaceC2933d;

/* JADX INFO: renamed from: s3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3185a implements InterfaceC2933d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2933d f9936a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3185a(InterfaceC2933d interfaceC2933d) {
        this.f9936a = interfaceC2933d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: a */
    public final int mo5130a(String str) {
        AbstractC1665j.m2985e(str, "name");
        Integer numM3657T = AbstractC1983k.m3657T(str);
        if (numM3657T != null) {
            return numM3657T.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: b */
    public final String mo5131b() {
        return "kotlin.collections.ArrayList";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: c */
    public final AbstractC1924f mo5132c() {
        return C2936g.f9257i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: d */
    public final int mo5133d() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: e */
    public final String mo5134e(int i5) {
        return String.valueOf(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3185a)) {
            return false;
        }
        C3185a c3185a = (C3185a) obj;
        return AbstractC1665j.m2981a(this.f9936a, c3185a.f9936a) && AbstractC1665j.m2981a(mo5131b(), c3185a.mo5131b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return mo5131b().hashCode() + (this.f9936a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: i */
    public final List mo5137i(int i5) {
        if (i5 >= 0) {
            return C0981u.f3047d;
        }
        StringBuilder sbM404o = AbstractC0231b.m404o(i5, "Illegal index ", ", ");
        sbM404o.append(mo5131b());
        sbM404o.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM404o.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: j */
    public final InterfaceC2933d mo5138j(int i5) {
        if (i5 >= 0) {
            return this.f9936a;
        }
        StringBuilder sbM404o = AbstractC0231b.m404o(i5, "Illegal index ", ", ");
        sbM404o.append(mo5131b());
        sbM404o.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM404o.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: k */
    public final boolean mo5139k(int i5) {
        if (i5 >= 0) {
            return false;
        }
        StringBuilder sbM404o = AbstractC0231b.m404o(i5, "Illegal index ", ", ");
        sbM404o.append(mo5131b());
        sbM404o.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbM404o.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return mo5131b() + '(' + this.f9936a + ')';
    }
}
