package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛷᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1136 extends AbstractC0789 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final InterfaceC0732 f5216 = AbstractC1090.m2298(C1136.class);

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C1607 f5217;

    public C1136(C1607 c1607) {
        this.f5217 = c1607;
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo827(String str, AbstractC1614 abstractC1614, Object obj, C1762 c1762) {
        int iM408;
        int iIntValue;
        int iMin;
        C0989 c0989 = c1762.f8846;
        C1607 c1607 = this.f5217;
        Integer num = (Integer) c1607.f8180;
        Integer num2 = (Integer) c1607.f8179;
        if (m1778(str, obj, c1762)) {
            int iM4012 = AbstractC2104.m4012(c1607.f8178);
            InterfaceC0732 interfaceC0732 = f5216;
            if (iM4012 == 0) {
                int iM4082 = c0989.f4503.m408(obj);
                int iIntValue2 = num2.intValue();
                if (iIntValue2 < 0) {
                    iIntValue2 += iM4082;
                }
                int iMax = Math.max(0, iIntValue2);
                interfaceC0732.mo1684("Slice from index on array with length: {}. From index: {} to: {}. Input: {}", Integer.valueOf(iM4082), Integer.valueOf(iMax), Integer.valueOf(iM4082 - 1), toString());
                if (iM4082 == 0 || iMax >= iM4082) {
                    return;
                }
                while (iMax < iM4082) {
                    m3901(iMax, str, obj, c1762);
                    iMax++;
                }
                return;
            }
            if (iM4012 != 1) {
                if (iM4012 == 2 && (iIntValue = num2.intValue()) < (iMin = Math.min((iM408 = c0989.f4503.m408(obj)), num.intValue())) && iM408 != 0) {
                    interfaceC0732.mo1684("Slice between indexes on array with length: {}. From index: {} to: {}. Input: {}", Integer.valueOf(iM408), num2, Integer.valueOf(iMin), toString());
                    for (iIntValue = num2.intValue(); iIntValue < iMin; iIntValue++) {
                        m3901(iIntValue, str, obj, c1762);
                    }
                    return;
                }
                return;
            }
            int iM4083 = c0989.f4503.m408(obj);
            if (iM4083 == 0) {
                return;
            }
            int iIntValue3 = num.intValue();
            if (iIntValue3 < 0) {
                iIntValue3 += iM4083;
            }
            int iMin2 = Math.min(iM4083, iIntValue3);
            interfaceC0732.mo1684("Slice to index on array with length: {}. From index: 0 to: {}. Input: {}", Integer.valueOf(iM4083), Integer.valueOf(iMin2), toString());
            for (int i = 0; i < iMin2; i++) {
                m3901(i, str, obj, c1762);
            }
        }
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final String mo828() {
        return this.f5217.toString();
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final boolean mo829() {
        return false;
    }
}
