package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface CharStream {
    void backup(int r1);

    char beginToken();

    void done();

    int getBeginColumn();

    int getBeginLine();

    int getEndColumn();

    int getEndLine();

    java.lang.String getImage();

    char[] getSuffix(int r1);

    int getTabSize();

    boolean isTrackLineColumn();

    char readChar();

    void setTabSize(int r1);

    void setTrackLineColumn(boolean r1);
}
