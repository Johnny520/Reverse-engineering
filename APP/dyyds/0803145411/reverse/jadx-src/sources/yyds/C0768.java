package yyds;

import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛴᛱᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0768 implements InterfaceC2633, InterfaceC0306 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public List f3541;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f3542;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC2662 f3543;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public InterfaceC1410 f3544;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public File f3545;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public volatile C1199 f3546;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final List f3547;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f3548 = -1;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1008 f3549;

    public C0768(List list, C1008 c1008, InterfaceC2662 interfaceC2662) {
        this.f3547 = list;
        this.f3549 = c1008;
        this.f3543 = interfaceC2662;
    }

    @Override // yyds.InterfaceC2633
    public final void cancel() {
        C1199 c1199 = this.f3546;
        if (c1199 != null) {
            c1199.f5473.cancel();
        }
    }

    @Override // yyds.InterfaceC0306
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo546(Object obj) {
        this.f3543.mo2883(this.f3544, obj, this.f3546.f5473, 3, this.f3544);
    }

    @Override // yyds.InterfaceC0306
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo567(Exception exc) {
        this.f3543.mo2884(this.f3544, exc, this.f3546.f5473, 3);
    }

    @Override // yyds.InterfaceC2633
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean mo1721() {
        while (true) {
            List list = this.f3541;
            boolean z = false;
            if (list != null && this.f3542 < list.size()) {
                this.f3546 = null;
                while (!z && this.f3542 < this.f3541.size()) {
                    List list2 = this.f3541;
                    int i = this.f3542;
                    this.f3542 = i + 1;
                    InterfaceC0894 interfaceC0894 = (InterfaceC0894) list2.get(i);
                    File file = this.f3545;
                    C1008 c1008 = this.f3549;
                    this.f3546 = interfaceC0894.mo940(file, c1008.f4584, c1008.f4596, c1008.f4583);
                    if (this.f3546 != null && this.f3549.m2188(this.f3546.f5473.mo417()) != null) {
                        this.f3546.f5473.mo514(this.f3549.f4586, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f3548 + 1;
            this.f3548 = i2;
            if (i2 >= this.f3547.size()) {
                return false;
            }
            InterfaceC1410 interfaceC1410 = (InterfaceC1410) this.f3547.get(this.f3548);
            C1008 c10082 = this.f3549;
            File fileMo949 = c10082.f4581.m1635().mo949(new C0440(interfaceC1410, c10082.f4580));
            this.f3545 = fileMo949;
            if (fileMo949 != null) {
                this.f3544 = interfaceC1410;
                this.f3541 = this.f3549.f4594.m4645().m3230(fileMo949);
                this.f3542 = 0;
            }
        }
    }
}
