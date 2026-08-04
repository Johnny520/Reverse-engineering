package org.simpleframework.xml.core;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class Revision {
    private boolean equal = true;

    public boolean compare(Object obj, Object obj2) {
        if (obj2 != null) {
            this.equal = obj2.equals(obj);
        } else if (obj != null) {
            this.equal = obj.equals(Double.valueOf(1.0d));
        }
        return this.equal;
    }

    public double getDefault() {
        return 1.0d;
    }

    public boolean isEqual() {
        return this.equal;
    }
}
