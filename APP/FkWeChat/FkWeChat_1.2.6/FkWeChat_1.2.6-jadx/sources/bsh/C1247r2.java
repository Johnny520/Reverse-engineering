package bsh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: bsh.r2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1247r2 implements Serializable {

    /* JADX INFO: renamed from: q */
    public List f3796q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public List f3797r = new ArrayList();

    /* JADX INFO: renamed from: s */
    public int f3798s = 0;

    /* JADX INFO: renamed from: t */
    public int f3799t = 0;

    /* JADX INFO: renamed from: u */
    public boolean f3800u;

    /* JADX INFO: renamed from: a */
    public void m5071a(InterfaceC1188h3 interfaceC1188h3) {
        while (this.f3798s > this.f3799t) {
            m5077g();
        }
        this.f3799t = ((Integer) this.f3797r.remove(r2.size() - 1)).intValue();
    }

    /* JADX INFO: renamed from: b */
    public void m5072b(InterfaceC1188h3 interfaceC1188h3, int i10) {
        List list = this.f3797r;
        this.f3799t = ((Integer) list.remove(list.size() - 1)).intValue();
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                interfaceC1188h3.mo4052t();
                m5078h(interfaceC1188h3);
                this.f3800u = true;
                return;
            } else {
                InterfaceC1188h3 interfaceC1188h3M5077g = m5077g();
                interfaceC1188h3M5077g.mo4046m(interfaceC1188h3);
                interfaceC1188h3.mo4045j(interfaceC1188h3M5077g, i11);
                i10 = i11;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5073c(InterfaceC1188h3 interfaceC1188h3, boolean z10) {
        if (!z10) {
            List list = this.f3797r;
            this.f3799t = ((Integer) list.remove(list.size() - 1)).intValue();
            this.f3800u = false;
            return;
        }
        int iM5074d = m5074d();
        List list2 = this.f3797r;
        this.f3799t = ((Integer) list2.remove(list2.size() - 1)).intValue();
        while (true) {
            int i10 = iM5074d - 1;
            if (iM5074d <= 0) {
                interfaceC1188h3.mo4052t();
                m5078h(interfaceC1188h3);
                this.f3800u = true;
                return;
            } else {
                InterfaceC1188h3 interfaceC1188h3M5077g = m5077g();
                interfaceC1188h3M5077g.mo4046m(interfaceC1188h3);
                interfaceC1188h3.mo4045j(interfaceC1188h3M5077g, i10);
                iM5074d = i10;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public int m5074d() {
        return this.f3798s - this.f3799t;
    }

    /* JADX INFO: renamed from: e */
    public boolean m5075e() {
        return this.f3800u;
    }

    /* JADX INFO: renamed from: f */
    public void m5076f(InterfaceC1188h3 interfaceC1188h3) {
        this.f3797r.add(Integer.valueOf(this.f3799t));
        this.f3799t = this.f3798s;
        interfaceC1188h3.mo4040e();
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC1188h3 m5077g() {
        int i10 = this.f3798s - 1;
        this.f3798s = i10;
        if (i10 < this.f3799t) {
            this.f3799t = ((Integer) this.f3797r.remove(r0.size() - 1)).intValue();
        }
        return (InterfaceC1188h3) this.f3796q.remove(r0.size() - 1);
    }

    /* JADX INFO: renamed from: h */
    public void m5078h(InterfaceC1188h3 interfaceC1188h3) {
        this.f3796q.add(interfaceC1188h3);
        this.f3798s++;
    }

    /* JADX INFO: renamed from: i */
    public void m5079i() {
        this.f3796q.clear();
        this.f3797r.clear();
        this.f3798s = 0;
        this.f3799t = 0;
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC1188h3 m5080j() {
        return (InterfaceC1188h3) this.f3796q.get(0);
    }
}
