package p000;

/* JADX INFO: renamed from: sx */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0814sx {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f10064;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f10065;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f10066;

    /* JADX INFO: renamed from: δ */
    public final java.util.ArrayList f10067;

    /* JADX INFO: renamed from: ε */
    public final boolean f10068;

    public C0814sx(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.ArrayList r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f10064 = r1
            r0.f10065 = r2
            r0.f10066 = r3
            r0.f10067 = r4
            r0.f10068 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3e
        L3:
            boolean r0 = r3 instanceof p000.C0814sx
            if (r0 != 0) goto L8
            goto L3c
        L8:
            sx r3 = (p000.C0814sx) r3
            java.lang.String r0 = r2.f10064
            java.lang.String r1 = r3.f10064
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            java.lang.String r0 = r2.f10065
            java.lang.String r1 = r3.f10065
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            java.lang.String r0 = r2.f10066
            java.lang.String r1 = r3.f10066
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L3c
        L2b:
            java.util.ArrayList r0 = r2.f10067
            java.util.ArrayList r1 = r3.f10067
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L3c
        L36:
            boolean r2 = r2.f10068
            boolean r3 = r3.f10068
            if (r2 == r3) goto L3e
        L3c:
            r2 = 0
            return r2
        L3e:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f10064
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f10065
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f10066
            int r0 = p000.a12.m15(r0, r1, r2)
            java.util.ArrayList r2 = r3.f10067
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r3 = r3.f10068
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", methodName="
            java.lang.String r1 = ", returnType="
            java.lang.String r2 = "DyDexMethodRef(className="
            java.lang.String r3 = r5.f10064
            java.lang.String r4 = r5.f10065
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f10066
            r0.append(r1)
            java.lang.String r1 = ", parameterTypes="
            r0.append(r1)
            java.util.ArrayList r1 = r5.f10067
            r0.append(r1)
            java.lang.String r1 = ", isStatic="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r5 = r5.f10068
            java.lang.String r5 = p000.lz1.m3693(r0, r5, r1)
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.reflect.Method m5579(java.lang.ClassLoader r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            r1.getClass()
            java.util.concurrent.ConcurrentHashMap r2 = p000.AbstractC0093bx.f1879
            java.lang.String r2 = r0.f10064
            java.lang.Class r2 = p000.AbstractC0093bx.m1082(r1, r2)
            if (r2 != 0) goto L15
        L11:
            r17 = 0
            goto L1a6
        L15:
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            java.util.ArrayList r6 = r0.f10067
            int r5 = p000.AbstractC1021yh.m6889(r6, r5)
            r4.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L26:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lb6
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.concurrent.ConcurrentHashMap r8 = p000.AbstractC0093bx.f1879
            r7.getClass()
            int r8 = r7.hashCode()
            switch(r8) {
                case -1325958191: goto La2;
                case 104431: goto L96;
                case 3039496: goto L8a;
                case 3052374: goto L7e;
                case 3327612: goto L72;
                case 3625364: goto L66;
                case 64711720: goto L5a;
                case 97526364: goto L4e;
                case 109413500: goto L40;
                default: goto L3e;
            }
        L3e:
            goto Laa
        L40:
            java.lang.String r8 = "short"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L4a
            goto Laa
        L4a:
            java.lang.Class r7 = java.lang.Short.TYPE
            goto Lb1
        L4e:
            java.lang.String r8 = "float"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L57
            goto Laa
        L57:
            java.lang.Class r7 = java.lang.Float.TYPE
            goto Lb1
        L5a:
            java.lang.String r8 = "boolean"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L63
            goto Laa
        L63:
            java.lang.Class r7 = java.lang.Boolean.TYPE
            goto Lb1
        L66:
            java.lang.String r8 = "void"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L6f
            goto Laa
        L6f:
            java.lang.Class r7 = java.lang.Void.TYPE
            goto Lb1
        L72:
            java.lang.String r8 = "long"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L7b
            goto Laa
        L7b:
            java.lang.Class r7 = java.lang.Long.TYPE
            goto Lb1
        L7e:
            java.lang.String r8 = "char"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L87
            goto Laa
        L87:
            java.lang.Class r7 = java.lang.Character.TYPE
            goto Lb1
        L8a:
            java.lang.String r8 = "byte"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L93
            goto Laa
        L93:
            java.lang.Class r7 = java.lang.Byte.TYPE
            goto Lb1
        L96:
            java.lang.String r8 = "int"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L9f
            goto Laa
        L9f:
            java.lang.Class r7 = java.lang.Integer.TYPE
            goto Lb1
        La2:
            java.lang.String r8 = "double"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto Laf
        Laa:
            java.lang.Class r7 = p000.AbstractC0093bx.m1082(r1, r7)
            goto Lb1
        Laf:
            java.lang.Class r7 = java.lang.Double.TYPE
        Lb1:
            r4.add(r7)
            goto L26
        Lb6:
            boolean r1 = r4.isEmpty()
            boolean r5 = r0.f10068
            java.lang.String r7 = r0.f10066
            java.lang.String r8 = r0.f10065
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r10 = 0
            r11 = 1
            if (r1 == 0) goto Lc7
            goto Lda
        Lc7:
            java.util.Iterator r0 = r4.iterator()
        Lcb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lda
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L12d
            goto Lcb
        Lda:
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6637(r4)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Object[] r0 = r0.toArray(r1)
            r1 = r0
            java.lang.Class[] r1 = (java.lang.Class[]) r1
            r4 = r2
        Le8:
            if (r4 == 0) goto L12d
            boolean r0 = r4.equals(r9)
            if (r0 != 0) goto L12d
            int r0 = r1.length     // Catch: java.lang.Throwable -> Lfc
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.lang.Throwable -> Lfc
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch: java.lang.Throwable -> Lfc
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r8, r0)     // Catch: java.lang.Throwable -> Lfc
            goto L103
        Lfc:
            r0 = move-exception
            eo1 r12 = new eo1
            r12.<init>(r0)
            r0 = r12
        L103:
            boolean r12 = r0 instanceof p000.eo1
            if (r12 == 0) goto L108
            r0 = 0
        L108:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L128
            java.lang.Class r12 = r0.getReturnType()
            java.lang.String r12 = r12.getName()
            boolean r12 = r12.equals(r7)
            if (r12 == 0) goto L128
            int r12 = r0.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            if (r12 != r5) goto L128
            r0.setAccessible(r11)
            return r0
        L128:
            java.lang.Class r4 = r4.getSuperclass()
            goto Le8
        L12d:
            if (r2 == 0) goto L11
            boolean r0 = r2.equals(r9)
            if (r0 != 0) goto L11
            java.lang.reflect.Method[] r0 = r2.getDeclaredMethods()
            r0.getClass()
            int r1 = r0.length
            r4 = r10
        L13e:
            if (r4 >= r1) goto L196
            r12 = r0[r4]
            java.lang.String r13 = r12.getName()
            boolean r13 = p000.ln0.m3626(r13, r8)
            if (r13 != 0) goto L14f
        L14c:
            r17 = 0
            goto L18b
        L14f:
            java.lang.Class r13 = r12.getReturnType()
            java.lang.String r13 = r13.getName()
            boolean r13 = r13.equals(r7)
            if (r13 != 0) goto L15e
            goto L14c
        L15e:
            int r13 = r12.getModifiers()
            boolean r13 = java.lang.reflect.Modifier.isStatic(r13)
            if (r13 == r5) goto L169
            goto L14c
        L169:
            java.lang.Class[] r13 = r12.getParameterTypes()
            int r14 = r13.length
            int r15 = r6.size()
            if (r14 == r15) goto L175
            goto L14c
        L175:
            int r14 = r13.length
            r15 = r10
        L177:
            if (r15 >= r14) goto L193
            r16 = r13[r15]
            r17 = 0
            java.lang.String r3 = r16.getName()
            java.lang.Object r10 = r6.get(r15)
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L18f
        L18b:
            int r4 = r4 + 1
            r10 = 0
            goto L13e
        L18f:
            int r15 = r15 + 1
            r10 = 0
            goto L177
        L193:
            r17 = 0
            goto L19a
        L196:
            r17 = 0
            r12 = r17
        L19a:
            if (r12 == 0) goto L1a0
            r12.setAccessible(r11)
            return r12
        L1a0:
            java.lang.Class r2 = r2.getSuperclass()
            r10 = 0
            goto L12d
        L1a6:
            return r17
    }
}
