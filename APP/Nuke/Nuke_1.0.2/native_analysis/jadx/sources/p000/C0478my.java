package p000;

/* JADX INFO: renamed from: my */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0478my extends e42 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6916b = 0;

    /* JADX INFO: renamed from: c */
    public final Object f6917c;

    public C0478my(in0 in0Var) {
        super(new C0146dy(1));
        this.f6917c = new C0521ny(in0Var);
    }

    @Override // p000.e42
    /* JADX INFO: renamed from: a */
    public final f42 mo1251a(Object obj) {
        switch (this.f6916b) {
            case 0:
                return new f42(this, obj, obj == null, null, true);
            default:
                return new f42(this, obj, obj == null, (ks2) this.f6917c, true);
        }
    }

    @Override // p000.e42
    /* JADX INFO: renamed from: b */
    public m93 mo1252b() {
        switch (this.f6916b) {
            case 0:
                return (C0521ny) this.f6917c;
            default:
                return super.mo1252b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0478my(xm0 xm0Var) {
        super(xm0Var);
        C0700sn c0700sn = C0700sn.f10216T;
        this.f6917c = c0700sn;
    }
}
