package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5228 implements InterfaceC7068 {

    /* JADX INFO: renamed from: ۥ */
    public final C7583 f1354;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f1355;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C5226 f12446;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f12447 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f12448 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f12449 = 0.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Object f12450;

    public C5228(C7583 c7583) {
        this.f1354 = c7583;
    }

    @Override // Yue.InterfaceC7068
    public void apply() {
        this.f12446.m16018(this.f1355);
        int i = this.f12447;
        if (i != -1) {
            this.f12446.m16013(i);
            return;
        }
        int i2 = this.f12448;
        if (i2 != -1) {
            this.f12446.m16014(i2);
        } else {
            this.f12446.m16015(this.f12449);
        }
    }

    @Override // Yue.InterfaceC7068
    public Object getKey() {
        return this.f12450;
    }

    @Override // Yue.InterfaceC7068
    /* JADX INFO: renamed from: ۥ */
    public void mo1093(C4128 c4128) {
        if (c4128 instanceof C5226) {
            this.f12446 = (C5226) c4128;
        } else {
            this.f12446 = null;
        }
    }

    @Override // Yue.InterfaceC7068
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1094(Object obj) {
        this.f12450 = obj;
    }

    @Override // Yue.InterfaceC7068
    /* JADX INFO: renamed from: ۥ۟۟ */
    public C4128 mo11786() {
        if (this.f12446 == null) {
            this.f12446 = new C5226();
        }
        return this.f12446;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m16020(Object obj) {
        this.f12447 = -1;
        this.f12448 = this.f1354.m23732(obj);
        this.f12449 = 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m16021() {
        return this.f1355;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m16022(float f) {
        this.f12447 = -1;
        this.f12448 = -1;
        this.f12449 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m16023(int i) {
        this.f1355 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m16024(Object obj) {
        this.f12447 = this.f1354.m23732(obj);
        this.f12448 = -1;
        this.f12449 = 0.0f;
    }
}
