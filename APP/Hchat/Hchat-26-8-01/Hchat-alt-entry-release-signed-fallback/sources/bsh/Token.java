package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Token implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    public int beginColumn;
    public int beginLine;
    public int endColumn;
    public int endLine;
    public java.lang.String image;
    public int kind;
    public bsh.Token next;
    public bsh.Token specialToken;

    public Token() {
            r0 = this;
            r0.<init>()
            return
    }

    public Token(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Token(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.kind = r1
            r0.image = r2
            return
    }

    public static bsh.Token newToken(int r1) {
            r0 = 0
            bsh.Token r1 = newToken(r1, r0)
            return r1
    }

    public static bsh.Token newToken(int r1, java.lang.String r2) {
            bsh.Token r0 = new bsh.Token
            r0.<init>(r1, r2)
            return r0
    }

    public java.lang.Object getValue() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.image
            return r0
    }
}
