package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface CharStream {
    void backup(int i9);

    char beginToken();

    void done();

    int getBeginColumn();

    int getBeginLine();

    int getEndColumn();

    int getEndLine();

    String getImage();

    char[] getSuffix(int i9);

    int getTabSize();

    boolean isTrackLineColumn();

    char readChar();

    void setTabSize(int i9);

    void setTrackLineColumn(boolean z9);
}
