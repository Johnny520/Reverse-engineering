package yyds;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: yyds.ᛸᛶᲈᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1810 extends AbstractC1229 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC2050 f9119;

    public C1810(InterfaceC2050 interfaceC2050, C1821 c1821) {
        super(c1821);
        this.f9119 = interfaceC2050;
    }

    @Override // yyds.AbstractC1229
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final Object mo2501(Object obj) {
        return obj;
    }

    @Override // yyds.AbstractC1229
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo2502(Object obj, C1942 c1942, C1782 c1782) throws IllegalAccessException {
        Field field = c1782.f8975;
        Object objMo484 = c1782.f8978.mo484(c1942);
        if (objMo484 == null && c1782.f8976) {
            return;
        }
        if (c1782.f8972) {
            throw new C1600("Cannot set value of 'static final' ".concat(AbstractC1301.m2589(field, false)));
        }
        field.set(obj, objMo484);
    }

    @Override // yyds.AbstractC1229
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final Object mo2503() {
        return this.f9119.mo807();
    }
}
