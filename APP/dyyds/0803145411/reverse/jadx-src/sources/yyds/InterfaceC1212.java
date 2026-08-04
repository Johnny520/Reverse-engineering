package yyds;

/* JADX INFO: renamed from: yyds.ᛵᲇᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1212 extends AutoCloseable {
    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    boolean isNull(int i);

    void reset();

    /* JADX INFO: renamed from: ᛱᲈᲁ */
    String mo430(int i);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    void mo431();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    void mo432(int i);

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ */
    boolean mo433();

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ */
    default boolean mo2234() {
        return getLong(0) != 0;
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ */
    void mo434(int i, String str);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    void mo435(int i, long j);
}
