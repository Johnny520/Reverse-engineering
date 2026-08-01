package bsh;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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

    public Token(int i, String str) {
        this.kind = i;
        this.image = str;
    }

    public static Token newToken(int i, String str) {
        return new Token(i, str);
    }

    public Object getValue() {
        return null;
    }

    public String toString() {
        return this.image;
    }

    public static Token newToken(int i) {
        return newToken(i, null);
    }

    public Token(int i) {
        this(i, null);
    }

    public Token() {
    }
}
