package net.bytebuddy.jar.asm.commons;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Remapper {
    public Remapper() {
            r0 = this;
            r0.<init>()
            return
    }

    private net.bytebuddy.jar.asm.Type mapType(net.bytebuddy.jar.asm.Type r4) {
            r3 = this;
            int r0 = r4.getSort()
            switch(r0) {
                case 9: goto L24;
                case 10: goto L15;
                case 11: goto L8;
                default: goto L7;
            }
        L7:
            return r4
        L8:
            java.lang.String r4 = r4.getDescriptor()
            java.lang.String r4 = r3.mapMethodDesc(r4)
            net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getMethodType(r4)
            return r4
        L15:
            java.lang.String r0 = r4.getInternalName()
            java.lang.String r0 = r3.map(r0)
            if (r0 == 0) goto L23
            net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getObjectType(r0)
        L23:
            return r4
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L2a:
            int r2 = r4.getDimensions()
            if (r1 >= r2) goto L38
            r2 = 91
            r0.append(r2)
            int r1 = r1 + 1
            goto L2a
        L38:
            net.bytebuddy.jar.asm.Type r4 = r4.getElementType()
            net.bytebuddy.jar.asm.Type r4 = r3.mapType(r4)
            java.lang.String r4 = r4.getDescriptor()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getType(r4)
            return r4
    }

    @java.lang.Deprecated
    public net.bytebuddy.jar.asm.signature.SignatureVisitor createRemappingSignatureAdapter(net.bytebuddy.jar.asm.signature.SignatureVisitor r1) {
            r0 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r0.createSignatureRemapper(r1)
            return r1
    }

    public net.bytebuddy.jar.asm.signature.SignatureVisitor createSignatureRemapper(net.bytebuddy.jar.asm.signature.SignatureVisitor r2) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.SignatureRemapper r0 = new net.bytebuddy.jar.asm.commons.SignatureRemapper
            r0.<init>(r2, r1)
            return r0
    }

    public java.lang.String map(java.lang.String r1) {
            r0 = this;
            return r1
    }

    public java.lang.String mapAnnotationAttributeName(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            return r2
    }

    public java.lang.String mapDesc(java.lang.String r1) {
            r0 = this;
            net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getType(r1)
            net.bytebuddy.jar.asm.Type r1 = r0.mapType(r1)
            java.lang.String r1 = r1.getDescriptor()
            return r1
    }

    public java.lang.String mapFieldName(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            return r2
    }

    public java.lang.String mapInnerClassName(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            java.lang.String r5 = r3.mapType(r4)
            boolean r0 = r5.equals(r4)
            if (r0 == 0) goto Lb
            return r6
        Lb:
            r0 = 47
            int r1 = r4.lastIndexOf(r0)
            int r0 = r5.lastIndexOf(r0)
            r2 = -1
            if (r1 == r2) goto L29
            if (r0 == r2) goto L29
            java.lang.String r4 = r4.substring(r1)
            java.lang.String r0 = r5.substring(r0)
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L29
            return r6
        L29:
            java.lang.String r4 = "$"
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L4f
            r4 = 36
            int r4 = r5.lastIndexOf(r4)
        L37:
            int r4 = r4 + 1
            int r6 = r5.length()
            if (r4 >= r6) goto L4a
            char r6 = r5.charAt(r4)
            boolean r6 = java.lang.Character.isDigit(r6)
            if (r6 == 0) goto L4a
            goto L37
        L4a:
            java.lang.String r4 = r5.substring(r4)
            return r4
        L4f:
            return r6
    }

    public java.lang.String mapInvokeDynamicMethodName(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            return r1
    }

    public java.lang.String mapMethodDesc(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "()V"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L9
            return r6
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            net.bytebuddy.jar.asm.Type[] r1 = net.bytebuddy.jar.asm.Type.getArgumentTypes(r6)
            int r2 = r1.length
            r3 = 0
        L16:
            if (r3 >= r2) goto L28
            r4 = r1[r3]
            net.bytebuddy.jar.asm.Type r4 = r5.mapType(r4)
            java.lang.String r4 = r4.getDescriptor()
            r0.append(r4)
            int r3 = r3 + 1
            goto L16
        L28:
            net.bytebuddy.jar.asm.Type r6 = net.bytebuddy.jar.asm.Type.getReturnType(r6)
            net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.VOID_TYPE
            if (r6 != r1) goto L36
            java.lang.String r6 = ")V"
            r0.append(r6)
            goto L46
        L36:
            r1 = 41
            r0.append(r1)
            net.bytebuddy.jar.asm.Type r6 = r5.mapType(r6)
            java.lang.String r6 = r6.getDescriptor()
            r0.append(r6)
        L46:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public java.lang.String mapMethodName(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            return r2
    }

    public java.lang.String mapModuleName(java.lang.String r1) {
            r0 = this;
            return r1
    }

    public java.lang.String mapPackageName(java.lang.String r1) {
            r0 = this;
            return r1
    }

    public java.lang.String mapRecordComponentName(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            return r2
    }

    public java.lang.String mapSignature(java.lang.String r3, boolean r4) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            net.bytebuddy.jar.asm.signature.SignatureReader r0 = new net.bytebuddy.jar.asm.signature.SignatureReader
            r0.<init>(r3)
            net.bytebuddy.jar.asm.signature.SignatureWriter r3 = new net.bytebuddy.jar.asm.signature.SignatureWriter
            r3.<init>()
            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r2.createSignatureRemapper(r3)
            if (r4 == 0) goto L18
            r0.acceptType(r1)
            goto L1b
        L18:
            r0.accept(r1)
        L1b:
            java.lang.String r3 = r3.toString()
            return r3
    }

    public java.lang.String mapType(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            net.bytebuddy.jar.asm.Type r1 = net.bytebuddy.jar.asm.Type.getObjectType(r1)
            net.bytebuddy.jar.asm.Type r1 = r0.mapType(r1)
            java.lang.String r1 = r1.getInternalName()
            return r1
    }

    public java.lang.String[] mapTypes(java.lang.String[] r4) {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r4.length
            if (r1 >= r2) goto L1a
            r2 = r4[r1]
            java.lang.String r2 = r3.mapType(r2)
            if (r2 == 0) goto L17
            if (r0 != 0) goto L15
            java.lang.Object r0 = r4.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
        L15:
            r0[r1] = r2
        L17:
            int r1 = r1 + 1
            goto L2
        L1a:
            if (r0 == 0) goto L1d
            r4 = r0
        L1d:
            return r4
    }

    public java.lang.Object mapValue(java.lang.Object r9) {
            r8 = this;
            boolean r0 = r9 instanceof net.bytebuddy.jar.asm.Type
            if (r0 == 0) goto Lb
            net.bytebuddy.jar.asm.Type r9 = (net.bytebuddy.jar.asm.Type) r9
            net.bytebuddy.jar.asm.Type r9 = r8.mapType(r9)
            return r9
        Lb:
            boolean r0 = r9 instanceof net.bytebuddy.jar.asm.Handle
            r1 = 0
            if (r0 == 0) goto L6b
            net.bytebuddy.jar.asm.Handle r9 = (net.bytebuddy.jar.asm.Handle) r9
            int r0 = r9.getTag()
            r2 = 4
            if (r0 > r2) goto L1a
            r1 = 1
        L1a:
            net.bytebuddy.jar.asm.Handle r0 = new net.bytebuddy.jar.asm.Handle
            int r3 = r9.getTag()
            java.lang.String r2 = r9.getOwner()
            java.lang.String r4 = r8.mapType(r2)
            if (r1 == 0) goto L3c
            java.lang.String r2 = r9.getOwner()
            java.lang.String r5 = r9.getName()
            java.lang.String r6 = r9.getDesc()
            java.lang.String r2 = r8.mapFieldName(r2, r5, r6)
        L3a:
            r5 = r2
            goto L4d
        L3c:
            java.lang.String r2 = r9.getOwner()
            java.lang.String r5 = r9.getName()
            java.lang.String r6 = r9.getDesc()
            java.lang.String r2 = r8.mapMethodName(r2, r5, r6)
            goto L3a
        L4d:
            if (r1 == 0) goto L59
            java.lang.String r1 = r9.getDesc()
            java.lang.String r1 = r8.mapDesc(r1)
        L57:
            r6 = r1
            goto L62
        L59:
            java.lang.String r1 = r9.getDesc()
            java.lang.String r1 = r8.mapMethodDesc(r1)
            goto L57
        L62:
            boolean r7 = r9.isInterface()
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L6b:
            boolean r0 = r9 instanceof net.bytebuddy.jar.asm.ConstantDynamic
            if (r0 == 0) goto La6
            net.bytebuddy.jar.asm.ConstantDynamic r9 = (net.bytebuddy.jar.asm.ConstantDynamic) r9
            int r0 = r9.getBootstrapMethodArgumentCount()
            java.lang.Object[] r2 = new java.lang.Object[r0]
        L77:
            if (r1 >= r0) goto L86
            java.lang.Object r3 = r9.getBootstrapMethodArgument(r1)
            java.lang.Object r3 = r8.mapValue(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L77
        L86:
            java.lang.String r0 = r9.getDescriptor()
            net.bytebuddy.jar.asm.ConstantDynamic r1 = new net.bytebuddy.jar.asm.ConstantDynamic
            java.lang.String r3 = r9.getName()
            java.lang.String r3 = r8.mapInvokeDynamicMethodName(r3, r0)
            java.lang.String r0 = r8.mapDesc(r0)
            net.bytebuddy.jar.asm.Handle r9 = r9.getBootstrapMethod()
            java.lang.Object r9 = r8.mapValue(r9)
            net.bytebuddy.jar.asm.Handle r9 = (net.bytebuddy.jar.asm.Handle) r9
            r1.<init>(r3, r0, r9, r2)
            return r1
        La6:
            return r9
    }
}
