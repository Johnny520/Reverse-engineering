package org.fusesource.jansi;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
