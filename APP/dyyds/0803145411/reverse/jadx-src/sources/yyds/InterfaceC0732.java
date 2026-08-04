package yyds;

/* JADX INFO: renamed from: yyds.ᛳᲇᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0732 {
    String getName();

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    void mo1678(Object obj);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    boolean mo1679();

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    boolean mo1680();

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    default boolean mo1681(int i) {
        char c;
        if (i == 1) {
            c = '(';
        } else if (i == 2) {
            c = 30;
        } else if (i == 3) {
            c = 20;
        } else if (i == 4) {
            c = '\n';
        } else {
            if (i != 5) {
                throw null;
            }
            c = 0;
        }
        if (c == 0) {
            return mo1680();
        }
        if (c == '\n') {
            return mo1691();
        }
        if (c == 20) {
            return mo1688();
        }
        if (c == 30) {
            return mo1689();
        }
        if (c == '(') {
            return mo1679();
        }
        throw new IllegalArgumentException("Level [" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TRACE" : "DEBUG" : "INFO" : "WARN" : "ERROR") + "] not recognized.");
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    void mo1682(String str, Throwable th);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    void mo1683(Object obj);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    void mo1684(String str, Object... objArr);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    void mo1685(String str, Object... objArr);

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    void mo1686(String str);

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    void mo1687(String str);

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    boolean mo1688();

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    boolean mo1689();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    void mo1690(Object obj, Boolean bool);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    boolean mo1691();
}
