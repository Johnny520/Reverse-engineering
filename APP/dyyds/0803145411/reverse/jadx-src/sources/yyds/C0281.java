package yyds;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛲᛱᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0281 extends AbstractC2026 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public List f1524;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final String f1525;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final String f1526;

    public C0281(String str, ArrayList arrayList) {
        this.f1525 = str + ((arrayList == null || arrayList.size() <= 0) ? "()" : "(...)");
        if (str != null) {
            this.f1526 = str;
            this.f1524 = arrayList;
        } else {
            this.f1526 = null;
            this.f1524 = null;
        }
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo827(String str, AbstractC1614 abstractC1614, Object obj, C1762 c1762) {
        C0989 c0989 = c1762.f8846;
        Map map = AbstractC1837.f9215;
        String str2 = this.f1526;
        Class cls = (Class) map.get(str2);
        if (cls == null) {
            throw new C2569(AbstractC2104.m4014("Function with name: ", str2, " does not exist."));
        }
        try {
            if (cls.newInstance() != null) {
                throw new ClassCastException();
            }
            List<C1869> list = this.f1524;
            if (list != null) {
                for (C1869 c1869 : list) {
                    int iM4012 = AbstractC2104.m4012(c1869.f9408);
                    if (iM4012 != 0) {
                        if (iM4012 == 1) {
                            C2203 c2203 = new C2203(c1869.f9409, c1762.f8845, c0989);
                            if (!c1869.f9411.booleanValue() || !c2203.equals(c1869.f9410)) {
                                c1869.f9410 = c2203;
                                c1869.f9411 = Boolean.TRUE;
                            }
                        }
                    } else if (!c1869.f9411.booleanValue()) {
                        C0052 c0052 = c0989.f4503;
                        c1869.f9410 = new C1985(19);
                        c1869.f9411 = Boolean.TRUE;
                    }
                }
            }
            throw null;
        } catch (Exception e) {
            throw new C2569(AbstractC2104.m4014("Function of name: ", str2, " cannot be created"), e);
        }
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final String mo828() {
        return ".".concat(this.f1525);
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final boolean mo829() {
        return true;
    }
}
