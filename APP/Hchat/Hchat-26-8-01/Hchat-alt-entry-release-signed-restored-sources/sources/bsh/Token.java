package bsh;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Token implements Serializable {
    private static final long serialVersionUID = 1;
    public int beginColumn;
    public int beginLine;
    public int endColumn;
    public int endLine;
    public String image;
    public int kind;
    public Token next;
    public Token specialToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Token(int i9, String str) {
        this.kind = i9;
        this.image = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Token newToken(int i9, String str) {
        return new Token(i9, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getValue() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.image;
    }

    public static Token newToken(int i9) {
        return newToken(i9, null);
    }

    public Token(int i9) {
        this(i9, null);
    }

    public Token() {
    }
}
