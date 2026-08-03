package p000a;

import java.util.ArrayList;

/* JADX INFO: renamed from: a.hh */
/* JADX INFO: loaded from: classes.dex */
public class C0620hh extends C0240N3 {

    /* JADX INFO: renamed from: e0 */
    public ArrayList<C0240N3> f2295e0 = new ArrayList<>();

    /* JADX INFO: renamed from: B */
    public void mo742B() {
        ArrayList<C0240N3> arrayList = this.f2295e0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0240N3 c0240n3 = this.f2295e0.get(i);
            if (c0240n3 instanceof C0620hh) {
                ((C0620hh) c0240n3).mo742B();
            }
        }
    }

    @Override // p000a.C0240N3
    /* JADX INFO: renamed from: s */
    public void mo655s() {
        this.f2295e0.clear();
        super.mo655s();
    }

    @Override // p000a.C0240N3
    /* JADX INFO: renamed from: u */
    public final void mo657u(C0003A2 c0003a2) {
        super.mo657u(c0003a2);
        int size = this.f2295e0.size();
        for (int i = 0; i < size; i++) {
            this.f2295e0.get(i).mo657u(c0003a2);
        }
    }
}
