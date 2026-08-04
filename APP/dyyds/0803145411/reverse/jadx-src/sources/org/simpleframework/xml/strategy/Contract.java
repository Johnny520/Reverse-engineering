package org.simpleframework.xml.strategy;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class Contract {
    private String label;
    private String length;
    private String mark;
    private String refer;

    public Contract(String str, String str2, String str3, String str4) {
        this.length = str4;
        this.label = str3;
        this.refer = str2;
        this.mark = str;
    }

    public String getIdentity() {
        return this.mark;
    }

    public String getLabel() {
        return this.label;
    }

    public String getLength() {
        return this.length;
    }

    public String getReference() {
        return this.refer;
    }
}
