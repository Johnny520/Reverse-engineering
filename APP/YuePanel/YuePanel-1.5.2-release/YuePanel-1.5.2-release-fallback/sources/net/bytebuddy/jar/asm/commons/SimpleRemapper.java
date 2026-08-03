package net.bytebuddy.jar.asm.commons;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleRemapper extends net.bytebuddy.jar.asm.commons.Remapper {
    private final java.util.Map<java.lang.String, java.lang.String> mapping;

    public SimpleRemapper(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.singletonMap(r1, r2)
            r0.mapping = r1
            return
    }

    public SimpleRemapper(java.util.Map<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.<init>()
            r0.mapping = r1
            return
    }

    @Override // net.bytebuddy.jar.asm.commons.Remapper
    public java.lang.String map(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.mapping
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    @Override // net.bytebuddy.jar.asm.commons.Remapper
    public java.lang.String mapAnnotationAttributeName(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r2 = 46
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = r1.map(r2)
            if (r2 != 0) goto L1b
            goto L1c
        L1b:
            r3 = r2
        L1c:
            return r3
    }

    @Override // net.bytebuddy.jar.asm.commons.Remapper
    public java.lang.String mapFieldName(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r1 = 46
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r0.map(r1)
            if (r1 != 0) goto L1b
            goto L1c
        L1b:
            r2 = r1
        L1c:
            return r2
    }

    @Override // net.bytebuddy.jar.asm.commons.Remapper
    public java.lang.String mapInvokeDynamicMethodName(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 46
            r0.append(r1)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r2.map(r4)
            if (r4 != 0) goto L1b
            goto L1c
        L1b:
            r3 = r4
        L1c:
            return r3
    }

    @Override // net.bytebuddy.jar.asm.commons.Remapper
    public java.lang.String mapMethodName(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r2 = 46
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = r1.map(r2)
            if (r2 != 0) goto L1e
            goto L1f
        L1e:
            r3 = r2
        L1f:
            return r3
    }
}
