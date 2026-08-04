package yyds;

/* JADX INFO: renamed from: yyds.ᛵᲀᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1183 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0644 f5420;

    public AbstractC1183(C0644 c0644) {
        this.f5420 = c0644;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public void mo1659(Object obj, String str, Object obj2) {
        throw new RuntimeException("Invalid or non Implemented status setValue in " + getClass() + " key=" + str);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public void mo1660(Object obj, Object obj2) {
        throw new RuntimeException("Invalid or non Implemented status addValue(Object current, Object value) in " + getClass());
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public Object mo1661(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public AbstractC1183 mo1662(String str) {
        throw new RuntimeException("Invalid or non Implemented status startObject(String key) in " + getClass() + " key=" + str);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public Object mo1663() {
        throw new RuntimeException("Invalid or non Implemented status createArray() in " + getClass());
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public AbstractC1183 mo1664(String str) {
        throw new RuntimeException("Invalid or non Implemented status startArray in " + getClass() + " key=" + str);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public Object mo1665() {
        throw new RuntimeException("Invalid or non Implemented status createObject() in " + getClass());
    }
}
