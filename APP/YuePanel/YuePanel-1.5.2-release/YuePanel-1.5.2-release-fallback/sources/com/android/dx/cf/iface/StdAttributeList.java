package com.android.dx.cf.iface;

/* JADX INFO: loaded from: classes.dex */
public final class StdAttributeList extends com.android.dx.util.FixedSizeList implements com.android.dx.cf.iface.AttributeList {
    public StdAttributeList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.android.dx.cf.iface.AttributeList
    public int byteLength() {
            r4 = this;
            int r0 = r4.size()
            r1 = 2
            r2 = 0
        L6:
            if (r2 >= r0) goto L14
            com.android.dx.cf.iface.Attribute r3 = r4.get(r2)
            int r3 = r3.byteLength()
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L6
        L14:
            return r1
    }

    @Override // com.android.dx.cf.iface.AttributeList
    public com.android.dx.cf.iface.Attribute findFirst(java.lang.String r5) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            com.android.dx.cf.iface.Attribute r2 = r4.get(r1)
            java.lang.String r3 = r2.getName()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L16
            return r2
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r5 = 0
            return r5
    }

    @Override // com.android.dx.cf.iface.AttributeList
    public com.android.dx.cf.iface.Attribute findNext(com.android.dx.cf.iface.Attribute r6) {
            r5 = this;
            int r0 = r5.size()
            r1 = 0
        L5:
            r2 = 0
            if (r1 >= r0) goto L29
            com.android.dx.cf.iface.Attribute r3 = r5.get(r1)
            if (r3 != r6) goto L26
            java.lang.String r6 = r6.getName()
        L12:
            int r1 = r1 + 1
            if (r1 >= r0) goto L25
            com.android.dx.cf.iface.Attribute r3 = r5.get(r1)
            java.lang.String r4 = r3.getName()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L12
            return r3
        L25:
            return r2
        L26:
            int r1 = r1 + 1
            goto L5
        L29:
            return r2
    }

    @Override // com.android.dx.cf.iface.AttributeList
    public com.android.dx.cf.iface.Attribute get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.cf.iface.Attribute r1 = (com.android.dx.cf.iface.Attribute) r1
            return r1
    }

    public void set(int r1, com.android.dx.cf.iface.Attribute r2) {
            r0 = this;
            r0.set0(r1, r2)
            return
    }
}
