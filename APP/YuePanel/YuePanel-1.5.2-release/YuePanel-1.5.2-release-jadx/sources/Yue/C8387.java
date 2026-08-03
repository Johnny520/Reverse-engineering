package Yue;

import Yue.C3526;
import Yue.C4128;

/* JADX INFO: renamed from: Yue.ۥۢۥ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8387 extends C5281 {

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public int f24996 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public int f24997 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public int f24998 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public int f24999 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public int f25000 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public int f25001 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public int f25002 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public int f25003 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public boolean f25004 = false;

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public int f25005 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public int f25006 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public C3526.C0169 f25007 = new C3526.C0169();

    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public C3526.InterfaceC0170 f25008 = null;

    @Override // Yue.C5281, Yue.InterfaceC5278
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo16177(C4129 c4129) {
        m27961();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public void m27960(boolean z) {
        int i = this.f25000;
        if (i > 0 || this.f25001 > 0) {
            if (z) {
                this.f25002 = this.f25001;
                this.f25003 = i;
            } else {
                this.f25002 = i;
                this.f25003 = this.f25001;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public void m27961() {
        for (int i = 0; i < this.f12576; i++) {
            C4128 c4128 = this.f12575[i];
            if (c4128 != null) {
                c4128.m11945(true);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public int m27962() {
        return this.f25006;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public int m27963() {
        return this.f25005;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public int m27964() {
        return this.f24997;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public int m27965() {
        return this.f25002;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public int m27966() {
        return this.f25003;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public int m27967() {
        return this.f24996;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۥ */
    public void mo15112(int i, int i2, int i3, int i4) {
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public void m27968(C4128 c4128, C4128.EnumC0339 enumC0339, int i, C4128.EnumC0339 enumC03392, int i2) {
        while (this.f25008 == null && m11876() != null) {
            this.f25008 = ((C4129) m11876()).m11990();
        }
        C3526.C0169 c0169 = this.f25007;
        c0169.f363 = enumC0339;
        c0169.f364 = enumC03392;
        c0169.f5970 = i;
        c0169.f5971 = i2;
        this.f25008.mo594(c4128, c0169);
        c4128.m11965(this.f25007.f5972);
        c4128.m11935(this.f25007.f5973);
        c4128.m11934(this.f25007.f5975);
        c4128.m11917(this.f25007.f5974);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public boolean m27969() {
        C4128 c4128 = this.f8398;
        C3526.InterfaceC0170 interfaceC0170M11990 = c4128 != null ? ((C4129) c4128).m11990() : null;
        if (interfaceC0170M11990 == null) {
            return false;
        }
        for (int i = 0; i < this.f12576; i++) {
            C4128 c41282 = this.f12575[i];
            if (c41282 != null && !(c41282 instanceof C5226)) {
                C4128.EnumC0339 enumC0339M11855 = c41282.m11855(0);
                C4128.EnumC0339 enumC0339M118552 = c41282.m11855(1);
                C4128.EnumC0339 enumC0339 = C4128.EnumC0339.MATCH_CONSTRAINT;
                if (enumC0339M11855 != enumC0339 || c41282.f8366 == 1 || enumC0339M118552 != enumC0339 || c41282.f8367 == 1) {
                    if (enumC0339M11855 == enumC0339) {
                        enumC0339M11855 = C4128.EnumC0339.WRAP_CONTENT;
                    }
                    if (enumC0339M118552 == enumC0339) {
                        enumC0339M118552 = C4128.EnumC0339.WRAP_CONTENT;
                    }
                    C3526.C0169 c0169 = this.f25007;
                    c0169.f363 = enumC0339M11855;
                    c0169.f364 = enumC0339M118552;
                    c0169.f5970 = c41282.m11891();
                    this.f25007.f5971 = c41282.m11859();
                    interfaceC0170M11990.mo594(c41282, this.f25007);
                    c41282.m11965(this.f25007.f5972);
                    c41282.m11935(this.f25007.f5973);
                    c41282.m11917(this.f25007.f5974);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public boolean m27970() {
        return this.f25004;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public void m27971(boolean z) {
        this.f25004 = z;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public void m27972(int i, int i2) {
        this.f25005 = i;
        this.f25006 = i2;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public void m27973(int i) {
        this.f24998 = i;
        this.f24996 = i;
        this.f24999 = i;
        this.f24997 = i;
        this.f25000 = i;
        this.f25001 = i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public void m27974(int i) {
        this.f24997 = i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public void m27975(int i) {
        this.f25001 = i;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public void m27976(int i) {
        this.f24998 = i;
        this.f25002 = i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public void m27977(int i) {
        this.f24999 = i;
        this.f25003 = i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public void m27978(int i) {
        this.f25000 = i;
        this.f25002 = i;
        this.f25003 = i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public void m27979(int i) {
        this.f24996 = i;
    }
}
