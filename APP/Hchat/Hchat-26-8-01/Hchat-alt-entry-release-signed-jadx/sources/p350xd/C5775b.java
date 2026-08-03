package p350xd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.C2833a;
import p081fc.C1203f;
import p082fd.C1212i;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: xd.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5775b extends AbstractC5774a {

    /* JADX INFO: renamed from: k */
    public final ArrayList f23507k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5775b(InterfaceC4318n interfaceC4318n) {
        super(interfaceC4318n);
        this.f23507k = new ArrayList(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final void m10464H(InterfaceC4314j interfaceC4314j) {
        if (interfaceC4314j instanceof InterfaceC4318n) {
            ((AbstractC5774a) ((InterfaceC4318n) interfaceC4314j)).f23506i = this;
        }
        this.f23507k.add(interfaceC4314j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: b */
    public final void mo8672b(C1212i c1212i, C1203f c1203f) {
        Iterator it = this.f23507k.iterator();
        while (it.hasNext()) {
            c1212i.m3329u(c1203f, (InterfaceC4314j) it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: k */
    public final String mo8644k() {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = this.f23507k;
        int size = arrayList.size();
        sb2.append('(');
        sb2.append(size);
        if (size > 0) {
            sb2.append(':');
            AbstractC5798s.m10518l(sb2, arrayList, "|", new C2833a(23));
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p350xd.AbstractC5774a, p302ud.InterfaceC4318n
    /* JADX INFO: renamed from: l */
    public final boolean mo8674l(InterfaceC4314j interfaceC4314j, InterfaceC4314j interfaceC4314j2) {
        ArrayList arrayList = this.f23507k;
        int iIndexOf = arrayList.indexOf(interfaceC4314j);
        if (iIndexOf == -1) {
            return false;
        }
        arrayList.set(iIndexOf, interfaceC4314j2);
        if (!(interfaceC4314j2 instanceof InterfaceC4318n)) {
            return true;
        }
        ((AbstractC5774a) ((InterfaceC4318n) interfaceC4314j2)).f23506i = this;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "R".concat(mo8644k());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4318n
    /* JADX INFO: renamed from: u */
    public final List mo8675u() {
        return this.f23507k;
    }
}
