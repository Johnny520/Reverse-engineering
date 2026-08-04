package yyds;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲈᲁᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2775 extends AbstractC1413 {
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m4890(C1397 c1397) {
        C1397 c13972 = this.f6686;
        c13972.f6518.add(c1397);
        c1397.f6519.add(c13972);
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1394() {
        C0944 c0944 = this.f6690;
        if (c0944 instanceof C0411) {
            int i = ((C0411) c0944).f2144;
            C1397 c1397 = this.f6686;
            if (i == 0 || i == 1) {
                c0944.f4371 = c1397.f6517;
            } else {
                c0944.f4354 = c1397.f6517;
            }
        }
    }

    @Override // yyds.InterfaceC2299
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1395(InterfaceC2299 interfaceC2299) {
        C0411 c0411 = (C0411) this.f6690;
        int i = c0411.f2144;
        C1397 c1397 = this.f6686;
        Iterator it = c1397.f6519.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C1397) it.next()).f6517;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c1397.mo612(i3 + c0411.f2147);
        } else {
            c1397.mo612(i2 + c0411.f2147);
        }
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final boolean mo1396() {
        return false;
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo1398() {
        this.f6693 = null;
        this.f6686.m2810();
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo1399() {
        C0944 c0944 = this.f6690;
        if (c0944 instanceof C0411) {
            C1397 c1397 = this.f6686;
            c1397.f6516 = true;
            ArrayList arrayList = c1397.f6519;
            C0411 c0411 = (C0411) c0944;
            int i = c0411.f2144;
            boolean z = c0411.f2145;
            int i2 = 0;
            if (i == 0) {
                c1397.f6514 = 4;
                while (i2 < c0411.f2142) {
                    C0944 c09442 = c0411.f2143[i2];
                    if (z || c09442.f20 != 8) {
                        C1397 c13972 = c09442.f4400.f6686;
                        c13972.f6518.add(c1397);
                        arrayList.add(c13972);
                    }
                    i2++;
                }
                m4890(this.f6690.f4400.f6686);
                m4890(this.f6690.f4400.f6687);
                return;
            }
            if (i == 1) {
                c1397.f6514 = 5;
                while (i2 < c0411.f2142) {
                    C0944 c09443 = c0411.f2143[i2];
                    if (z || c09443.f20 != 8) {
                        C1397 c13973 = c09443.f4400.f6687;
                        c13973.f6518.add(c1397);
                        arrayList.add(c13973);
                    }
                    i2++;
                }
                m4890(this.f6690.f4400.f6686);
                m4890(this.f6690.f4400.f6687);
                return;
            }
            if (i == 2) {
                c1397.f6514 = 6;
                while (i2 < c0411.f2142) {
                    C0944 c09444 = c0411.f2143[i2];
                    if (z || c09444.f20 != 8) {
                        C1397 c13974 = c09444.f4349.f6686;
                        c13974.f6518.add(c1397);
                        arrayList.add(c13974);
                    }
                    i2++;
                }
                m4890(this.f6690.f4349.f6686);
                m4890(this.f6690.f4349.f6687);
                return;
            }
            if (i != 3) {
                return;
            }
            c1397.f6514 = 7;
            while (i2 < c0411.f2142) {
                C0944 c09445 = c0411.f2143[i2];
                if (z || c09445.f20 != 8) {
                    C1397 c13975 = c09445.f4349.f6687;
                    c13975.f6518.add(c1397);
                    arrayList.add(c13975);
                }
                i2++;
            }
            m4890(this.f6690.f4349.f6686);
            m4890(this.f6690.f4349.f6687);
        }
    }
}
