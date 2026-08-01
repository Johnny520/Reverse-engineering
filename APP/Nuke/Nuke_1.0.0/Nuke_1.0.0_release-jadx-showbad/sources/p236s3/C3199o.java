package p236s3;

import com.bumptech.glide.AbstractC1924f;
import java.util.List;
import java.util.Set;
import p117X2.AbstractC1665j;
import p225q3.InterfaceC2933d;

/* JADX INFO: renamed from: s3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C3199o implements InterfaceC2933d, InterfaceC3188d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2933d f9971a;

    /* JADX INFO: renamed from: b */
    public final String f9972b;

    /* JADX INFO: renamed from: c */
    public final Set f9973c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3199o(InterfaceC2933d interfaceC2933d) {
        AbstractC1665j.m2985e(interfaceC2933d, "original");
        this.f9971a = interfaceC2933d;
        this.f9972b = interfaceC2933d.mo5131b() + '?';
        this.f9973c = AbstractC3194j.m5459a(interfaceC2933d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: a */
    public final int mo5130a(String str) {
        AbstractC1665j.m2985e(str, "name");
        return this.f9971a.mo5130a(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: b */
    public final String mo5131b() {
        return this.f9972b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: c */
    public final AbstractC1924f mo5132c() {
        return this.f9971a.mo5132c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: d */
    public final int mo5133d() {
        return this.f9971a.mo5133d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: e */
    public final String mo5134e(int i5) {
        return this.f9971a.mo5134e(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3199o) {
            return AbstractC1665j.m2981a(this.f9971a, ((C3199o) obj).f9971a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: f */
    public final boolean mo5135f() {
        return this.f9971a.mo5135f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p236s3.InterfaceC3188d
    /* JADX INFO: renamed from: g */
    public final Set mo5458g() {
        return this.f9973c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    public final List getAnnotations() {
        return this.f9971a.getAnnotations();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: h */
    public final boolean mo5136h() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9971a.hashCode() * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: i */
    public final List mo5137i(int i5) {
        return this.f9971a.mo5137i(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: j */
    public final InterfaceC2933d mo5138j(int i5) {
        return this.f9971a.mo5138j(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p225q3.InterfaceC2933d
    /* JADX INFO: renamed from: k */
    public final boolean mo5139k(int i5) {
        return this.f9971a.mo5139k(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:q3.d:IGET), 63 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9971a);
        sb.append('?');
        return sb.toString();
    }
}
