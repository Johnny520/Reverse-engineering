package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public final class Merger {
    private Merger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isPossiblyAssignableFrom(com.android.dx.rop.type.TypeBearer r5, com.android.dx.rop.type.TypeBearer r6) {
            com.android.dx.rop.type.Type r5 = r5.getType()
            com.android.dx.rop.type.Type r6 = r6.getType()
            boolean r0 = r5.equals(r6)
            r1 = 1
            if (r0 == 0) goto L10
            return r1
        L10:
            int r0 = r5.getBasicType()
            int r2 = r6.getBasicType()
            r3 = 10
            r4 = 9
            if (r0 != r3) goto L21
            com.android.dx.rop.type.Type r5 = com.android.dx.rop.type.Type.OBJECT
            r0 = r4
        L21:
            if (r2 != r3) goto L26
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.OBJECT
            r2 = r4
        L26:
            r3 = 0
            if (r0 != r4) goto L70
            if (r2 == r4) goto L2c
            goto L70
        L2c:
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.KNOWN_NULL
            if (r5 != r0) goto L31
            return r3
        L31:
            if (r6 != r0) goto L34
            return r1
        L34:
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.OBJECT
            if (r5 != r0) goto L39
            return r1
        L39:
            boolean r0 = r5.isArray()
            if (r0 == 0) goto L5f
            boolean r0 = r6.isArray()
            if (r0 != 0) goto L46
            return r3
        L46:
            com.android.dx.rop.type.Type r5 = r5.getComponentType()
            com.android.dx.rop.type.Type r6 = r6.getComponentType()
            boolean r0 = r5.isArray()
            if (r0 == 0) goto L5a
            boolean r0 = r6.isArray()
            if (r0 != 0) goto L46
        L5a:
            boolean r5 = isPossiblyAssignableFrom(r5, r6)
            return r5
        L5f:
            boolean r6 = r6.isArray()
            if (r6 == 0) goto L6f
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.SERIALIZABLE
            if (r5 == r6) goto L6f
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.CLONEABLE
            if (r5 != r6) goto L6e
            goto L6f
        L6e:
            r1 = r3
        L6f:
            return r1
        L70:
            boolean r5 = r5.isIntlike()
            if (r5 == 0) goto L7d
            boolean r5 = r6.isIntlike()
            if (r5 == 0) goto L7d
            goto L7e
        L7d:
            r1 = r3
        L7e:
            return r1
    }

    public static com.android.dx.cf.code.OneLocalsArray mergeLocals(com.android.dx.cf.code.OneLocalsArray r5, com.android.dx.cf.code.OneLocalsArray r6) {
            if (r5 != r6) goto L3
            return r5
        L3:
            int r0 = r5.getMaxLocals()
            int r1 = r6.getMaxLocals()
            if (r1 != r0) goto L38
            r1 = 0
            r2 = 0
        Lf:
            if (r2 >= r0) goto L31
            com.android.dx.rop.type.TypeBearer r3 = r5.getOrNull(r2)
            com.android.dx.rop.type.TypeBearer r4 = r6.getOrNull(r2)
            com.android.dx.rop.type.TypeBearer r4 = mergeType(r3, r4)
            if (r4 == r3) goto L2e
            if (r1 != 0) goto L25
            com.android.dx.cf.code.OneLocalsArray r1 = r5.copy()
        L25:
            if (r4 != 0) goto L2b
            r1.invalidate(r2)
            goto L2e
        L2b:
            r1.set(r2, r4)
        L2e:
            int r2 = r2 + 1
            goto Lf
        L31:
            if (r1 != 0) goto L34
            return r5
        L34:
            r1.setImmutable()
            return r1
        L38:
            com.android.dx.cf.code.SimException r5 = new com.android.dx.cf.code.SimException
            java.lang.String r6 = "mismatched maxLocals values"
            r5.<init>(r6)
            throw r5
    }

    public static com.android.dx.cf.code.ExecutionStack mergeStack(com.android.dx.cf.code.ExecutionStack r6, com.android.dx.cf.code.ExecutionStack r7) {
            if (r6 != r7) goto L3
            return r6
        L3:
            int r0 = r6.size()
            int r1 = r7.size()
            if (r1 != r0) goto L74
            r1 = 0
            r2 = 0
        Lf:
            if (r2 >= r0) goto L6d
            com.android.dx.rop.type.TypeBearer r3 = r6.peek(r2)
            com.android.dx.rop.type.TypeBearer r4 = r7.peek(r2)
            com.android.dx.rop.type.TypeBearer r5 = mergeType(r3, r4)
            if (r5 == r3) goto L6a
            if (r1 != 0) goto L25
            com.android.dx.cf.code.ExecutionStack r1 = r6.copy()
        L25:
            if (r5 == 0) goto L2d
            r1.change(r2, r5)     // Catch: com.android.dx.cf.code.SimException -> L2b
            goto L6a
        L2b:
            r6 = move-exception
            goto L4c
        L2d:
            com.android.dx.cf.code.SimException r6 = new com.android.dx.cf.code.SimException     // Catch: com.android.dx.cf.code.SimException -> L2b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: com.android.dx.cf.code.SimException -> L2b
            r7.<init>()     // Catch: com.android.dx.cf.code.SimException -> L2b
            java.lang.String r0 = "incompatible: "
            r7.append(r0)     // Catch: com.android.dx.cf.code.SimException -> L2b
            r7.append(r3)     // Catch: com.android.dx.cf.code.SimException -> L2b
            java.lang.String r0 = ", "
            r7.append(r0)     // Catch: com.android.dx.cf.code.SimException -> L2b
            r7.append(r4)     // Catch: com.android.dx.cf.code.SimException -> L2b
            java.lang.String r7 = r7.toString()     // Catch: com.android.dx.cf.code.SimException -> L2b
            r6.<init>(r7)     // Catch: com.android.dx.cf.code.SimException -> L2b
            throw r6     // Catch: com.android.dx.cf.code.SimException -> L2b
        L4c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "...while merging stack["
            r7.append(r0)
            java.lang.String r0 = com.android.dx.util.Hex.u2(r2)
            r7.append(r0)
            java.lang.String r0 = "]"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.addContext(r7)
            throw r6
        L6a:
            int r2 = r2 + 1
            goto Lf
        L6d:
            if (r1 != 0) goto L70
            return r6
        L70:
            r1.setImmutable()
            return r1
        L74:
            com.android.dx.cf.code.SimException r6 = new com.android.dx.cf.code.SimException
            java.lang.String r7 = "mismatched stack depths"
            r6.<init>(r7)
            throw r6
    }

    public static com.android.dx.rop.type.TypeBearer mergeType(com.android.dx.rop.type.TypeBearer r2, com.android.dx.rop.type.TypeBearer r3) {
            if (r2 == 0) goto L63
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L9
            goto L63
        L9:
            r0 = 0
            if (r3 != 0) goto Ld
            return r0
        Ld:
            com.android.dx.rop.type.Type r2 = r2.getType()
            com.android.dx.rop.type.Type r3 = r3.getType()
            if (r2 != r3) goto L18
            return r2
        L18:
            boolean r1 = r2.isReference()
            if (r1 == 0) goto L53
            boolean r1 = r3.isReference()
            if (r1 == 0) goto L53
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.KNOWN_NULL
            if (r2 != r0) goto L29
            return r3
        L29:
            if (r3 != r0) goto L2c
            return r2
        L2c:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L50
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L50
            com.android.dx.rop.type.Type r2 = r2.getComponentType()
            com.android.dx.rop.type.Type r3 = r3.getComponentType()
            com.android.dx.rop.type.TypeBearer r2 = mergeType(r2, r3)
            if (r2 != 0) goto L49
            com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.OBJECT
            return r2
        L49:
            com.android.dx.rop.type.Type r2 = (com.android.dx.rop.type.Type) r2
            com.android.dx.rop.type.Type r2 = r2.getArrayType()
            return r2
        L50:
            com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.OBJECT
            return r2
        L53:
            boolean r2 = r2.isIntlike()
            if (r2 == 0) goto L62
            boolean r2 = r3.isIntlike()
            if (r2 == 0) goto L62
            com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.INT
            return r2
        L62:
            return r0
        L63:
            return r2
    }
}
