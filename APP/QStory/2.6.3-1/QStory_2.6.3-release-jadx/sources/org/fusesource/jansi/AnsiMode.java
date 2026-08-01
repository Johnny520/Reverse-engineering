package org.fusesource.jansi;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum AnsiMode {
    Strip("Strip all ansi sequences"),
    Default("Print ansi sequences if the stream is a terminal"),
    Force("Always print ansi sequences, even if the stream is redirected");

    private final String description;

    AnsiMode(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }
}
