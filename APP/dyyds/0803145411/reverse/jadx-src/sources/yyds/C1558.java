package yyds;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: yyds.ᛷᛵᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1558 extends AbstractC0625 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Field f7953;

    public C1558(Field field) {
        this.f7953 = field;
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final Object m3209() {
        Object c2658;
        try {
            m3482();
            c2658 = this.f7953.get(this.f3014);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (c2658 instanceof C2658) {
            return null;
        }
        return c2658;
    }

    @Override // yyds.AbstractC1741
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final Member mo1373() {
        return this.f7953;
    }

    @Override // yyds.AbstractC0625
    /* JADX INFO: renamed from: ᛷᛸᲇᛶ */
    public final AbstractC0625 mo1374(Object obj) {
        m1524(obj);
        return this;
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final Object m3210() {
        Object c2658;
        try {
            m3482();
            c2658 = this.f7953.get(this.f3014);
            if (c2658 == null) {
                c2658 = null;
            }
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (c2658 instanceof C2658) {
            return null;
        }
        return c2658;
    }
}
