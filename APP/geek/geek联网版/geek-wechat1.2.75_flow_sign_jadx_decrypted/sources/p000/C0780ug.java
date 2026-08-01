package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ug */
/* JADX INFO: loaded from: classes.dex */
public class C0780ug extends C0410kg {

    /* JADX INFO: renamed from: m */
    public int f4826m;

    public C0780ug(vb0 vb0Var) {
        super(vb0Var);
        if (vb0Var instanceof C0751to) {
            this.f2831e = 2;
        } else {
            this.f2831e = 3;
        }
    }

    @Override // p000.C0410kg
    /* JADX INFO: renamed from: d */
    public final void mo1684d(int i) {
        if (this.f2836j) {
            return;
        }
        this.f2836j = true;
        this.f2833g = i;
        ArrayList arrayList = this.f2837k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            InterfaceC0333ig interfaceC0333ig = (InterfaceC0333ig) obj;
            interfaceC0333ig.mo1212a(interfaceC0333ig);
        }
    }
}
