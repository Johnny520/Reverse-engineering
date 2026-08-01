package p000;

/* JADX INFO: renamed from: lo */
/* JADX INFO: loaded from: classes.dex */
public final class C0455lo extends vb0 {
    @Override // p000.InterfaceC0333ig
    /* JADX INFO: renamed from: a */
    public final void mo1212a(InterfaceC0333ig interfaceC0333ig) {
        C0410kg c0410kg = this.f4933h;
        if (c0410kg.f2829c && !c0410kg.f2836j) {
            c0410kg.mo1684d((int) ((((C0410kg) c0410kg.f2838l.get(0)).f2833g * ((C0418ko) this.f4927b).f2861d0) + 0.5f));
        }
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: d */
    public final void mo1213d() {
        C0925yc c0925yc = this.f4927b;
        C0418ko c0418ko = (C0418ko) c0925yc;
        int i = c0418ko.f2862e0;
        int i2 = c0418ko.f2863f0;
        int i3 = c0418ko.f2865h0;
        C0410kg c0410kg = this.f4933h;
        if (i3 == 1) {
            if (i != -1) {
                c0410kg.f2838l.add(c0925yc.f5379I.f5403d.f4933h);
                this.f4927b.f5379I.f5403d.f4933h.f2837k.add(c0410kg);
                c0410kg.f2832f = i;
            } else if (i2 != -1) {
                c0410kg.f2838l.add(c0925yc.f5379I.f5403d.f4934i);
                this.f4927b.f5379I.f5403d.f4934i.f2837k.add(c0410kg);
                c0410kg.f2832f = -i2;
            } else {
                c0410kg.f2828b = true;
                c0410kg.f2838l.add(c0925yc.f5379I.f5403d.f4934i);
                this.f4927b.f5379I.f5403d.f4934i.f2837k.add(c0410kg);
            }
            m1773m(this.f4927b.f5403d.f4933h);
            m1773m(this.f4927b.f5403d.f4934i);
            return;
        }
        if (i != -1) {
            c0410kg.f2838l.add(c0925yc.f5379I.f5404e.f4933h);
            this.f4927b.f5379I.f5404e.f4933h.f2837k.add(c0410kg);
            c0410kg.f2832f = i;
        } else if (i2 != -1) {
            c0410kg.f2838l.add(c0925yc.f5379I.f5404e.f4934i);
            this.f4927b.f5379I.f5404e.f4934i.f2837k.add(c0410kg);
            c0410kg.f2832f = -i2;
        } else {
            c0410kg.f2828b = true;
            c0410kg.f2838l.add(c0925yc.f5379I.f5404e.f4934i);
            this.f4927b.f5379I.f5404e.f4934i.f2837k.add(c0410kg);
        }
        m1773m(this.f4927b.f5404e.f4933h);
        m1773m(this.f4927b.f5404e.f4934i);
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: e */
    public final void mo1214e() {
        C0925yc c0925yc = this.f4927b;
        int i = ((C0418ko) c0925yc).f2865h0;
        C0410kg c0410kg = this.f4933h;
        if (i == 1) {
            c0925yc.f5384N = c0410kg.f2833g;
        } else {
            c0925yc.f5385O = c0410kg.f2833g;
        }
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: f */
    public final void mo1215f() {
        this.f4933h.m1683c();
    }

    @Override // p000.vb0
    /* JADX INFO: renamed from: k */
    public final boolean mo1217k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m1773m(C0410kg c0410kg) {
        C0410kg c0410kg2 = this.f4933h;
        c0410kg2.f2837k.add(c0410kg);
        c0410kg.f2838l.add(c0410kg2);
    }
}
