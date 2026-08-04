package yyds;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲁᛴᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2223 extends AbstractC2383 {

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public AbstractC1183 f10984;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final Class f10985;

    public C2223(C0644 c0644, Class cls) {
        super(c0644);
        this.f10985 = cls.getComponentType();
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo1661(Object obj) {
        List list = (List) obj;
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f10985, list.size());
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final AbstractC1183 mo1662(String str) {
        AbstractC1183 abstractC1183 = this.f10984;
        if (abstractC1183 != null) {
            return abstractC1183;
        }
        AbstractC1183 abstractC1183M1558 = this.f5420.m1558(this.f10985);
        this.f10984 = abstractC1183M1558;
        return abstractC1183M1558;
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final AbstractC1183 mo1664(String str) {
        AbstractC1183 abstractC1183 = this.f10984;
        if (abstractC1183 != null) {
            return abstractC1183;
        }
        AbstractC1183 abstractC1183M1558 = this.f5420.m1558(this.f10985);
        this.f10984 = abstractC1183M1558;
        return abstractC1183M1558;
    }
}
