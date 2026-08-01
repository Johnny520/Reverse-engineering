package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nt implements java.util.Comparator {
    public final /* synthetic */ com.google.android.material.button.MaterialButtonToggleGroup a;

    public nt(com.google.android.material.button.MaterialButtonToggleGroup r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            boolean r0 = r3.o
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r4.o
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L17
            return r0
        L17:
            boolean r0 = r3.isPressed()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r4.isPressed()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L2e
            return r0
        L2e:
            com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.a
            int r3 = r0.indexOfChild(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r0.indexOfChild(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r3 = r3.compareTo(r4)
            return r3
    }
}
