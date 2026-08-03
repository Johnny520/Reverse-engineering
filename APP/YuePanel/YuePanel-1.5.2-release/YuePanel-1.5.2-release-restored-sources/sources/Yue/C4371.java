package Yue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4371 implements InterfaceC4369 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public AbstractC8432 f8952;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f8954;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f8955;

    /* JADX INFO: renamed from: ۥ */
    public InterfaceC4369 f846 = null;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f847 = false;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f8951 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public EnumC0392 f8953 = EnumC0392.UNKNOWN;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f8956 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C4401 f8957 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean f8958 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public List<InterfaceC4369> f8959 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public List<C4371> f8960 = new ArrayList();

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۨۥ$ۥ */
    public enum EnumC0392 {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C4371(AbstractC8432 abstractC8432) {
        this.f8952 = abstractC8432;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8952.f3497.m11854());
        sb.append(":");
        sb.append(this.f8953);
        sb.append("(");
        sb.append(this.f8958 ? Integer.valueOf(this.f8955) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f8960.size());
        sb.append(":d=");
        sb.append(this.f8959.size());
        sb.append(">");
        return sb.toString();
    }

    @Override // Yue.InterfaceC4369
    /* JADX INFO: renamed from: ۥ */
    public void mo767(InterfaceC4369 interfaceC4369) {
        Iterator<C4371> it = this.f8960.iterator();
        while (it.hasNext()) {
            if (!it.next().f8958) {
                return;
            }
        }
        this.f8951 = true;
        InterfaceC4369 interfaceC43692 = this.f846;
        if (interfaceC43692 != null) {
            interfaceC43692.mo767(this);
        }
        if (this.f847) {
            this.f8952.mo767(this);
            return;
        }
        C4371 c4371 = null;
        int i = 0;
        for (C4371 c43712 : this.f8960) {
            if (!(c43712 instanceof C4401)) {
                i++;
                c4371 = c43712;
            }
        }
        if (c4371 != null && i == 1 && c4371.f8958) {
            C4401 c4401 = this.f8957;
            if (c4401 != null) {
                if (!c4401.f8958) {
                    return;
                } else {
                    this.f8954 = this.f8956 * c4401.f8955;
                }
            }
            mo12660(c4371.f8955 + this.f8954);
        }
        InterfaceC4369 interfaceC43693 = this.f846;
        if (interfaceC43693 != null) {
            interfaceC43693.mo767(this);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m1330(InterfaceC4369 interfaceC4369) {
        this.f8959.add(interfaceC4369);
        if (this.f8958) {
            interfaceC4369.mo767(interfaceC4369);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m12658() {
        this.f8960.clear();
        this.f8959.clear();
        this.f8958 = false;
        this.f8955 = 0;
        this.f8951 = false;
        this.f847 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m12659() {
        String str;
        String strM11854 = this.f8952.f3497.m11854();
        EnumC0392 enumC0392 = this.f8953;
        if (enumC0392 == EnumC0392.LEFT || enumC0392 == EnumC0392.RIGHT) {
            str = strM11854 + "_HORIZONTAL";
        } else {
            str = strM11854 + "_VERTICAL";
        }
        return str + ":" + this.f8953.name();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo12660(int i) {
        if (this.f8958) {
            return;
        }
        this.f8958 = true;
        this.f8955 = i;
        for (InterfaceC4369 interfaceC4369 : this.f8959) {
            interfaceC4369.mo767(interfaceC4369);
        }
    }
}
