package Yue;

import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۧ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5693 extends AbstractC6381 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Object f14015;

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String mo17593(String str) {
        m17599();
        return super.mo17593(str);
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public AbstractC6381 mo13684(String str, String str2) {
        if (mo13697() || !str.equals(mo9885())) {
            m17599();
            super.mo13684(str, str2);
        } else {
            this.f14015 = str2;
        }
        return this;
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public String mo17594(String str) {
        return !mo13697() ? mo9885().equals(str) ? (String) this.f14015 : "" : super.mo17594(str);
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public final C3456 mo13685() {
        m17599();
        return (C3456) this.f14015;
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public String mo13686() {
        return m19908() ? mo13701().mo13686() : "";
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public int mo13689() {
        return 0;
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public void mo13692(String str) {
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public AbstractC6381 mo13693() {
        return this;
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public List<AbstractC6381> mo13694() {
        return AbstractC6381.f16146;
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean mo17595(String str) {
        m17599();
        return super.mo17595(str);
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public final boolean mo13697() {
        return this.f14015 instanceof C3456;
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ */
    public AbstractC6381 mo13702(String str) {
        m17599();
        return super.mo13702(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public String m17596() {
        return mo17594(mo9885());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m17597(String str) {
        mo13684(mo9885(), str);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡ۠(LYue/ۥۣۡۢۤ;)LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC5693 mo13691(AbstractC6381 abstractC6381) {
        AbstractC5693 abstractC5693 = (AbstractC5693) super.mo13691(abstractC6381);
        if (mo13697()) {
            abstractC5693.f14015 = ((C3456) this.f14015).clone();
        }
        return abstractC5693;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public final void m17599() {
        if (mo13697()) {
            return;
        }
        Object obj = this.f14015;
        C3456 c3456 = new C3456();
        this.f14015 = c3456;
        if (obj != null) {
            c3456.m9208(mo9885(), (String) obj);
        }
    }
}
