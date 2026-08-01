package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: sg */
/* JADX INFO: loaded from: classes.dex */
public class C0707sg extends C0373jg {

    /* JADX INFO: renamed from: m */
    public int f4436m;

    public C0707sg(qb0 qb0Var) {
        super(qb0Var);
        if (qb0Var instanceof C0604po) {
            this.f2625e = 2;
        } else {
            this.f2625e = 3;
        }
    }

    @Override // p000.C0373jg
    /* JADX INFO: renamed from: d */
    public final void mo1597d(int i) {
        if (this.f2630j) {
            return;
        }
        this.f2630j = true;
        this.f2627g = i;
        ArrayList arrayList = this.f2631k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            InterfaceC0297hg interfaceC0297hg = (InterfaceC0297hg) obj;
            interfaceC0297hg.mo1357a(interfaceC0297hg);
        }
    }
}
