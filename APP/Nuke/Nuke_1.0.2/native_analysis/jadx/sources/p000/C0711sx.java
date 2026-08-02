package p000;

/* JADX INFO: renamed from: sx */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0711sx extends C0559ox {

    /* JADX INFO: renamed from: j */
    public final boolean f10395j;

    public C0711sx(C0133dk c0133dk, boolean z) {
        super(c0133dk);
        this.f10395j = z;
    }

    @Override // p000.C0559ox
    /* JADX INFO: renamed from: d */
    public final void mo3650d(byte b) {
        if (this.f10395j) {
            mo3655i(String.valueOf(b & 255));
            return;
        }
        String strValueOf = String.valueOf(b & 255);
        strValueOf.getClass();
        ((C0133dk) this.f7866i).m1045w(strValueOf);
    }

    @Override // p000.C0559ox
    /* JADX INFO: renamed from: f */
    public final void mo3652f(int i) {
        boolean z = this.f10395j;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            mo3655i(unsignedString);
        } else {
            unsignedString.getClass();
            ((C0133dk) this.f7866i).m1045w(unsignedString);
        }
    }

    @Override // p000.C0559ox
    /* JADX INFO: renamed from: g */
    public final void mo3653g(long j) {
        boolean z = this.f10395j;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            mo3655i(unsignedString);
        } else {
            unsignedString.getClass();
            ((C0133dk) this.f7866i).m1045w(unsignedString);
        }
    }

    @Override // p000.C0559ox
    /* JADX INFO: renamed from: h */
    public final void mo3654h(short s) {
        if (this.f10395j) {
            mo3655i(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((C0133dk) this.f7866i).m1045w(strValueOf);
    }
}
