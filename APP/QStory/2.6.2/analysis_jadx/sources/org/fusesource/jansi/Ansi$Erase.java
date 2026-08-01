package org.fusesource.jansi;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum Ansi$Erase {
    FORWARD(0, "FORWARD"),
    BACKWARD(1, "BACKWARD"),
    ALL(2, "ALL");

    private final String name;
    private final int value;

    Ansi$Erase(int i, String str) {
        this.value = i;
        this.name = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public int value() {
        return this.value;
    }
}
