package p369yd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p025bc.AbstractC0255e;
import p081fc.C1203f;
import p082fd.C1212i;
import p302ud.InterfaceC4313i;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p350xd.AbstractC5774a;

/* JADX INFO: renamed from: yd.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6029c extends AbstractC6027a implements InterfaceC4313i {

    /* JADX INFO: renamed from: m */
    public InterfaceC4314j f24480m;

    /* JADX INFO: renamed from: n */
    public InterfaceC4314j f24481n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: b */
    public final void mo8672b(C1212i c1212i, C1203f c1203f) {
        c1212i.m3328t(this, c1203f, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p350xd.AbstractC5774a, p302ud.InterfaceC4313i
    /* JADX INFO: renamed from: i */
    public final List mo8673i() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f24480m);
        arrayList.add(this.f24481n);
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: k */
    public final String mo8644k() {
        StringBuilder sb2 = new StringBuilder();
        InterfaceC4314j interfaceC4314j = this.f24480m;
        if (interfaceC4314j != null) {
            sb2.append(interfaceC4314j.mo8644k());
        }
        InterfaceC4314j interfaceC4314j2 = this.f24481n;
        if (interfaceC4314j2 != null) {
            sb2.append(interfaceC4314j2.mo8644k());
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p350xd.AbstractC5774a, p302ud.InterfaceC4318n
    /* JADX INFO: renamed from: l */
    public final boolean mo8674l(InterfaceC4314j interfaceC4314j, InterfaceC4314j interfaceC4314j2) {
        if (interfaceC4314j == this.f24480m) {
            this.f24480m = interfaceC4314j2;
            if (interfaceC4314j2 instanceof InterfaceC4318n) {
                ((AbstractC5774a) ((InterfaceC4318n) interfaceC4314j2)).f23506i = this;
                return true;
            }
        } else {
            if (interfaceC4314j != this.f24481n) {
                return false;
            }
            this.f24481n = interfaceC4314j2;
            if (interfaceC4314j2 instanceof InterfaceC4318n) {
                ((AbstractC5774a) ((InterfaceC4318n) interfaceC4314j2)).f23506i = this;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strValueOf = String.valueOf(this.f24476l);
        String strValueOf2 = String.valueOf(this.f24480m);
        String strValueOf3 = String.valueOf(this.f24481n);
        StringBuilder sbM1027p = AbstractC0255e.m1027p("IF ", strValueOf, " THEN: ", strValueOf2, " ELSE: ");
        sbM1027p.append(strValueOf3);
        return sbM1027p.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4318n
    /* JADX INFO: renamed from: u */
    public final List mo8675u() {
        List list = this.f24476l;
        ArrayList arrayList = new ArrayList(list.size() + 2);
        arrayList.addAll(list);
        InterfaceC4314j interfaceC4314j = this.f24480m;
        if (interfaceC4314j != null) {
            arrayList.add(interfaceC4314j);
        }
        InterfaceC4314j interfaceC4314j2 = this.f24481n;
        if (interfaceC4314j2 != null) {
            arrayList.add(interfaceC4314j2);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
