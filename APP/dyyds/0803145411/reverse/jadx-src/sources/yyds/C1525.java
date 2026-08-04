package yyds;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛷᛴᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1525 extends AbstractC1183 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Class f7354;

    public C1525(C0644 c0644, Class cls) {
        super(c0644);
        this.f7354 = cls;
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1659(Object obj, String str, Object obj2) {
        ((Map) obj).put(str, obj2);
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1660(Object obj, Object obj2) {
        ((List) obj).add(obj2);
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final AbstractC1183 mo1662(String str) {
        return this;
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final Object mo1663() {
        try {
            return this.f7354.getConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final AbstractC1183 mo1664(String str) {
        return this;
    }

    @Override // yyds.AbstractC1183
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final Object mo1665() {
        try {
            return this.f7354.getConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
