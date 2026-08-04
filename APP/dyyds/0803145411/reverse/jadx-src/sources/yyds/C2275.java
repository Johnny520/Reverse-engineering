package yyds;

/* JADX INFO: renamed from: yyds.ᲁᛷᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2275 extends AbstractC1413 {
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final void m4285(C1397 c1397) {
        C1397 c13972 = this.f6686;
        c13972.f6518.add(c1397);
        c1397.f6519.add(c13972);
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1394() {
        C0944 c0944 = this.f6690;
        int i = ((C2076) c0944).f10262;
        C1397 c1397 = this.f6686;
        if (i == 1) {
            c0944.f4371 = c1397.f6517;
        } else {
            c0944.f4354 = c1397.f6517;
        }
    }

    @Override // yyds.InterfaceC2299
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1395(InterfaceC2299 interfaceC2299) {
        C1397 c1397 = this.f6686;
        if (c1397.f6521 && !c1397.f6520) {
            c1397.mo612((int) ((((C1397) c1397.f6519.get(0)).f6517 * ((C2076) this.f6690).f10258) + 0.5f));
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
        this.f6686.m2810();
    }

    @Override // yyds.AbstractC1413
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo1399() {
        C0944 c0944 = this.f6690;
        C2076 c2076 = (C2076) c0944;
        int i = c2076.f10257;
        int i2 = c2076.f10259;
        int i3 = c2076.f10262;
        C1397 c1397 = this.f6686;
        if (i3 == 1) {
            if (i != -1) {
                c1397.f6519.add(c0944.f4342.f4400.f6686);
                this.f6690.f4342.f4400.f6686.f6518.add(c1397);
                c1397.f6522 = i;
            } else if (i2 != -1) {
                c1397.f6519.add(c0944.f4342.f4400.f6687);
                this.f6690.f4342.f4400.f6687.f6518.add(c1397);
                c1397.f6522 = -i2;
            } else {
                c1397.f6516 = true;
                c1397.f6519.add(c0944.f4342.f4400.f6687);
                this.f6690.f4342.f4400.f6687.f6518.add(c1397);
            }
            m4285(this.f6690.f4400.f6686);
            m4285(this.f6690.f4400.f6687);
            return;
        }
        if (i != -1) {
            c1397.f6519.add(c0944.f4342.f4349.f6686);
            this.f6690.f4342.f4349.f6686.f6518.add(c1397);
            c1397.f6522 = i;
        } else if (i2 != -1) {
            c1397.f6519.add(c0944.f4342.f4349.f6687);
            this.f6690.f4342.f4349.f6687.f6518.add(c1397);
            c1397.f6522 = -i2;
        } else {
            c1397.f6516 = true;
            c1397.f6519.add(c0944.f4342.f4349.f6687);
            this.f6690.f4342.f4349.f6687.f6518.add(c1397);
        }
        m4285(this.f6690.f4349.f6686);
        m4285(this.f6690.f4349.f6687);
    }
}
