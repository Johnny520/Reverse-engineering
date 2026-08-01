package p351y2;

/* JADX INFO: renamed from: y2.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9541j implements InterfaceC9537f {

    /* JADX INFO: renamed from: a */
    public final CharSequence f32535a;

    /* JADX INFO: renamed from: b */
    public final C9540i f32536b;

    public C9541j(CharSequence charSequence, C9540i c9540i) {
        this.f32535a = charSequence;
        this.f32536b = c9540i;
    }

    @Override // p351y2.InterfaceC9537f
    /* JADX INFO: renamed from: a */
    public int mo37319a(int i10) {
        do {
            i10 = this.f32536b.m37344p(i10);
            if (i10 == -1 || i10 == this.f32535a.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.f32535a.charAt(i10)));
        return i10;
    }

    @Override // p351y2.InterfaceC9537f
    /* JADX INFO: renamed from: b */
    public int mo37320b(int i10) {
        do {
            i10 = this.f32536b.m37345q(i10);
            if (i10 == -1 || i10 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f32535a.charAt(i10 - 1)));
        return i10;
    }

    @Override // p351y2.InterfaceC9537f
    /* JADX INFO: renamed from: c */
    public int mo37321c(int i10) {
        do {
            i10 = this.f32536b.m37345q(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f32535a.charAt(i10)));
        return i10;
    }

    @Override // p351y2.InterfaceC9537f
    /* JADX INFO: renamed from: d */
    public int mo37322d(int i10) {
        do {
            i10 = this.f32536b.m37344p(i10);
            if (i10 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f32535a.charAt(i10 - 1)));
        return i10;
    }
}
