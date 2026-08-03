package Yue;

import Yue.C4371;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5280 extends AbstractC8432 {
    public C5280(C4128 c4128) {
        super(c4128);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    private void m16180(C4371 c4371) {
        this.f25275.f8959.add(c4371);
        c4371.f8960.add(this.f25275);
    }

    @Override // Yue.AbstractC8432, Yue.InterfaceC4369
    /* JADX INFO: renamed from: ۥ */
    public void mo767(InterfaceC4369 interfaceC4369) {
        C3507 c3507 = (C3507) this.f3497;
        int iM9347 = c3507.m9347();
        Iterator<C4371> it = this.f25275.f8960.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = it.next().f8955;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (iM9347 == 0 || iM9347 == 2) {
            this.f25275.mo12660(i2 + c3507.m9348());
        } else {
            this.f25275.mo12660(i + c3507.m9348());
        }
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo10130() {
        C4128 c4128 = this.f3497;
        if (c4128 instanceof C3507) {
            this.f25275.f847 = true;
            C3507 c3507 = (C3507) c4128;
            int iM9347 = c3507.m9347();
            boolean zM9346 = c3507.m9346();
            int i = 0;
            if (iM9347 == 0) {
                this.f25275.f8953 = C4371.EnumC0392.LEFT;
                while (i < c3507.f12576) {
                    C4128 c41282 = c3507.f12575[i];
                    if (zM9346 || c41282.m11890() != 8) {
                        C4371 c4371 = c41282.f8355.f25275;
                        c4371.f8959.add(this.f25275);
                        this.f25275.f8960.add(c4371);
                    }
                    i++;
                }
                m16180(this.f3497.f8355.f25275);
                m16180(this.f3497.f8355.f25276);
                return;
            }
            if (iM9347 == 1) {
                this.f25275.f8953 = C4371.EnumC0392.RIGHT;
                while (i < c3507.f12576) {
                    C4128 c41283 = c3507.f12575[i];
                    if (zM9346 || c41283.m11890() != 8) {
                        C4371 c43712 = c41283.f8355.f25276;
                        c43712.f8959.add(this.f25275);
                        this.f25275.f8960.add(c43712);
                    }
                    i++;
                }
                m16180(this.f3497.f8355.f25275);
                m16180(this.f3497.f8355.f25276);
                return;
            }
            if (iM9347 == 2) {
                this.f25275.f8953 = C4371.EnumC0392.TOP;
                while (i < c3507.f12576) {
                    C4128 c41284 = c3507.f12575[i];
                    if (zM9346 || c41284.m11890() != 8) {
                        C4371 c43713 = c41284.f8356.f25275;
                        c43713.f8959.add(this.f25275);
                        this.f25275.f8960.add(c43713);
                    }
                    i++;
                }
                m16180(this.f3497.f8356.f25275);
                m16180(this.f3497.f8356.f25276);
                return;
            }
            if (iM9347 != 3) {
                return;
            }
            this.f25275.f8953 = C4371.EnumC0392.BOTTOM;
            while (i < c3507.f12576) {
                C4128 c41285 = c3507.f12575[i];
                if (zM9346 || c41285.m11890() != 8) {
                    C4371 c43714 = c41285.f8356.f25276;
                    c43714.f8959.add(this.f25275);
                    this.f25275.f8960.add(c43714);
                }
                i++;
            }
            m16180(this.f3497.f8356.f25275);
            m16180(this.f3497.f8356.f25276);
        }
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo10131() {
        C4128 c4128 = this.f3497;
        if (c4128 instanceof C3507) {
            int iM9347 = ((C3507) c4128).m9347();
            if (iM9347 == 0 || iM9347 == 1) {
                this.f3497.m11967(this.f25275.f8955);
            } else {
                this.f3497.m11968(this.f25275.f8955);
            }
        }
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo10132() {
        this.f25270 = null;
        this.f25275.m12658();
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo10134() {
        this.f25275.f8958 = false;
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public boolean mo10135() {
        return false;
    }
}
