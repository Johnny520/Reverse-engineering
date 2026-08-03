package p121i4;

import java.util.ArrayList;
import p295u4.AbstractC4259i;
import p295u4.C4257g;
import p295u4.C4260j;
import p295u4.C4262l;
import p295u4.C4263m;
import p295u4.C4265o;
import p295u4.C4266p;
import p295u4.C4271u;
import p295u4.C4272v;
import p295u4.InterfaceC4258h;
import p311v4.AbstractC4446a;
import p311v4.C4453d0;
import p326w4.C4683c;

/* JADX INFO: renamed from: i4.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1968i implements InterfaceC1970k, InterfaceC4258h {

    /* JADX INFO: renamed from: g */
    public int f6681g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1968i() {
        this.f6681g = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: e */
    public void mo4271e(C4272v c4272v) {
        m4869n(c4272v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: f */
    public int mo2572f() {
        return this.f6681g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: j */
    public void mo4275j(C4260j c4260j) {
        m4869n(c4260j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public int mo4868k() {
        int i9 = this.f6681g;
        this.f6681g = i9 + 1;
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: l */
    public void mo4277l(C4271u c4271u) {
        m4869n(c4271u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: m */
    public void mo4278m(C4262l c4262l) {
        m4869n(c4262l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public void m4869n(AbstractC4259i abstractC4259i) {
        C4265o c4265o = abstractC4259i.f13949i;
        if (c4265o != null) {
            int iM8561j = c4265o.m8561j() + c4265o.f13965g;
            if (iM8561j > this.f6681g) {
                this.f6681g = iM8561j;
            }
        }
        C4266p c4266p = abstractC4259i.f13950j;
        int length = c4266p.f24601h.length;
        for (int i9 = 0; i9 < length; i9++) {
            C4265o c4265o2 = (C4265o) c4266p.m10840l(i9);
            int iM8561j2 = c4265o2.m8561j() + c4265o2.f13965g;
            if (iM8561j2 > this.f6681g) {
                this.f6681g = iM8561j2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: o */
    public void mo4279o(C4263m c4263m) {
        m4869n(c4263m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: u */
    public void mo4281u(C4257g c4257g) {
        m4869n(c4257g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: x */
    public void mo4282x(C4271u c4271u) {
        m4869n(c4271u);
    }

    public C1968i(int i9) {
        this.f6681g = i9;
    }

    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: d */
    public void mo2570d(int i9, int i10) {
    }

    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: a */
    public void mo2567a(int i9, int i10, C4683c c4683c) {
    }

    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: c */
    public void mo2569c(int i9, int i10, C4453d0 c4453d0, ArrayList arrayList) {
    }

    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: g */
    public void mo2573g(int i9, int i10, C1973n c1973n, int i11) {
    }

    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: h */
    public void mo2574h(int i9, int i10, int i11, int i12) {
    }

    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: b */
    public void mo2568b(int i9, int i10, int i11, AbstractC4446a abstractC4446a, int i12) {
    }

    @Override // p121i4.InterfaceC1970k
    /* JADX INFO: renamed from: i */
    public void mo2575i(int i9, int i10, int i11, int i12, C4683c c4683c, int i13) {
    }
}
