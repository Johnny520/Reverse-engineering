package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
public final class Handle {
    private final java.lang.String descriptor;
    private final boolean isInterface;
    private final java.lang.String name;
    private final java.lang.String owner;
    private final int tag;

    @java.lang.Deprecated
    public Handle(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            r0 = 9
            if (r8 != r0) goto L7
            r0 = 1
        L5:
            r6 = r0
            goto L9
        L7:
            r0 = 0
            goto L5
        L9:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public Handle(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.tag = r1
            r0.owner = r2
            r0.name = r3
            r0.descriptor = r4
            r0.isInterface = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof net.bytebuddy.jar.asm.Handle
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            net.bytebuddy.jar.asm.Handle r5 = (net.bytebuddy.jar.asm.Handle) r5
            int r1 = r4.tag
            int r3 = r5.tag
            if (r1 != r3) goto L37
            boolean r1 = r4.isInterface
            boolean r3 = r5.isInterface
            if (r1 != r3) goto L37
            java.lang.String r1 = r4.owner
            java.lang.String r3 = r5.owner
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L37
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L37
            java.lang.String r1 = r4.descriptor
            java.lang.String r5 = r5.descriptor
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L37
            goto L38
        L37:
            r0 = r2
        L38:
            return r0
    }

    public java.lang.String getDesc() {
            r1 = this;
            java.lang.String r0 = r1.descriptor
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String getOwner() {
            r1 = this;
            java.lang.String r0 = r1.owner
            return r0
    }

    public int getTag() {
            r1 = this;
            int r0 = r1.tag
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.tag
            boolean r1 = r3.isInterface
            if (r1 == 0) goto L9
            r1 = 64
            goto La
        L9:
            r1 = 0
        La:
            int r0 = r0 + r1
            java.lang.String r1 = r3.owner
            int r1 = r1.hashCode()
            java.lang.String r2 = r3.name
            int r2 = r2.hashCode()
            int r1 = r1 * r2
            java.lang.String r2 = r3.descriptor
            int r2 = r2.hashCode()
            int r1 = r1 * r2
            int r0 = r0 + r1
            return r0
    }

    public boolean isInterface() {
            r1 = this;
            boolean r0 = r1.isInterface
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.owner
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = r2.descriptor
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            int r1 = r2.tag
            r0.append(r1)
            boolean r1 = r2.isInterface
            if (r1 == 0) goto L2a
            java.lang.String r1 = " itf"
            goto L2c
        L2a:
            java.lang.String r1 = ""
        L2c:
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
