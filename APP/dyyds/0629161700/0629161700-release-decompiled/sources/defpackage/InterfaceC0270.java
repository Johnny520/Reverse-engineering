package defpackage;

/* JADX INFO: renamed from: ᛲᛳᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0270 extends java.lang.AutoCloseable {
    int getColumnCount();

    java.lang.String getColumnName(int r1);

    long getLong(int r1);

    boolean isNull(int r1);

    void reset();

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    java.lang.String mo526(int r1);

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ */
    void mo527(int r1, java.lang.String r2);

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    void mo894();

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    default boolean mo895() {
            r5 = this;
            r0 = 0
            long r1 = r5.getLong(r0)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Ld
            r5 = 1
            return r5
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    void mo528(long r1, int r3);

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    void mo529(int r1);

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ */
    boolean mo530();
}
