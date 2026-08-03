package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public final class ConcreteMethod implements com.android.dx.cf.iface.Method {
    private final com.android.dx.cf.attrib.AttCode attCode;
    private final com.android.dx.cf.iface.ClassFile classFile;
    private final com.android.dx.cf.code.LineNumberList lineNumbers;
    private final com.android.dx.cf.code.LocalVariableList localVariables;
    private final com.android.dx.cf.iface.Method method;

    public ConcreteMethod(com.android.dx.cf.iface.Method r2, com.android.dx.cf.iface.ClassFile r3, boolean r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r1.method = r2
            r1.classFile = r3
            com.android.dx.cf.iface.AttributeList r2 = r2.getAttributes()
            java.lang.String r3 = "Code"
            com.android.dx.cf.iface.Attribute r2 = r2.findFirst(r3)
            com.android.dx.cf.attrib.AttCode r2 = (com.android.dx.cf.attrib.AttCode) r2
            r1.attCode = r2
            com.android.dx.cf.iface.AttributeList r2 = r2.getAttributes()
            com.android.dx.cf.code.LineNumberList r3 = com.android.dx.cf.code.LineNumberList.EMPTY
            if (r4 == 0) goto L36
            java.lang.String r4 = "LineNumberTable"
            com.android.dx.cf.iface.Attribute r4 = r2.findFirst(r4)
            com.android.dx.cf.attrib.AttLineNumberTable r4 = (com.android.dx.cf.attrib.AttLineNumberTable) r4
        L25:
            if (r4 == 0) goto L36
            com.android.dx.cf.code.LineNumberList r0 = r4.getLineNumbers()
            com.android.dx.cf.code.LineNumberList r3 = com.android.dx.cf.code.LineNumberList.concat(r3, r0)
            com.android.dx.cf.iface.Attribute r4 = r2.findNext(r4)
            com.android.dx.cf.attrib.AttLineNumberTable r4 = (com.android.dx.cf.attrib.AttLineNumberTable) r4
            goto L25
        L36:
            r1.lineNumbers = r3
            com.android.dx.cf.code.LocalVariableList r3 = com.android.dx.cf.code.LocalVariableList.EMPTY
            if (r5 == 0) goto L7a
            java.lang.String r4 = "LocalVariableTable"
            com.android.dx.cf.iface.Attribute r4 = r2.findFirst(r4)
            com.android.dx.cf.attrib.AttLocalVariableTable r4 = (com.android.dx.cf.attrib.AttLocalVariableTable) r4
        L44:
            if (r4 == 0) goto L55
            com.android.dx.cf.code.LocalVariableList r5 = r4.getLocalVariables()
            com.android.dx.cf.code.LocalVariableList r3 = com.android.dx.cf.code.LocalVariableList.concat(r3, r5)
            com.android.dx.cf.iface.Attribute r4 = r2.findNext(r4)
            com.android.dx.cf.attrib.AttLocalVariableTable r4 = (com.android.dx.cf.attrib.AttLocalVariableTable) r4
            goto L44
        L55:
            com.android.dx.cf.code.LocalVariableList r4 = com.android.dx.cf.code.LocalVariableList.EMPTY
            java.lang.String r5 = "LocalVariableTypeTable"
            com.android.dx.cf.iface.Attribute r5 = r2.findFirst(r5)
            com.android.dx.cf.attrib.AttLocalVariableTypeTable r5 = (com.android.dx.cf.attrib.AttLocalVariableTypeTable) r5
        L5f:
            if (r5 == 0) goto L70
            com.android.dx.cf.code.LocalVariableList r0 = r5.getLocalVariables()
            com.android.dx.cf.code.LocalVariableList r4 = com.android.dx.cf.code.LocalVariableList.concat(r4, r0)
            com.android.dx.cf.iface.Attribute r5 = r2.findNext(r5)
            com.android.dx.cf.attrib.AttLocalVariableTypeTable r5 = (com.android.dx.cf.attrib.AttLocalVariableTypeTable) r5
            goto L5f
        L70:
            int r2 = r4.size()
            if (r2 == 0) goto L7a
            com.android.dx.cf.code.LocalVariableList r3 = com.android.dx.cf.code.LocalVariableList.mergeDescriptorsAndSignatures(r3, r4)
        L7a:
            r1.localVariables = r3
            return
    }

    @Override // com.android.dx.cf.iface.Member
    public int getAccessFlags() {
            r1 = this;
            com.android.dx.cf.iface.Method r0 = r1.method
            int r0 = r0.getAccessFlags()
            return r0
    }

    @Override // com.android.dx.cf.iface.Member, com.android.dx.cf.iface.HasAttribute
    public com.android.dx.cf.iface.AttributeList getAttributes() {
            r1 = this;
            com.android.dx.cf.iface.Method r0 = r1.method
            com.android.dx.cf.iface.AttributeList r0 = r0.getAttributes()
            return r0
    }

    public com.android.dx.cf.code.ByteCatchList getCatches() {
            r1 = this;
            com.android.dx.cf.attrib.AttCode r0 = r1.attCode
            com.android.dx.cf.code.ByteCatchList r0 = r0.getCatches()
            return r0
    }

    public com.android.dx.cf.code.BytecodeArray getCode() {
            r1 = this;
            com.android.dx.cf.attrib.AttCode r0 = r1.attCode
            com.android.dx.cf.code.BytecodeArray r0 = r0.getCode()
            return r0
    }

    @Override // com.android.dx.cf.iface.Member
    public com.android.dx.rop.cst.CstType getDefiningClass() {
            r1 = this;
            com.android.dx.cf.iface.Method r0 = r1.method
            com.android.dx.rop.cst.CstType r0 = r0.getDefiningClass()
            return r0
    }

    @Override // com.android.dx.cf.iface.Member
    public com.android.dx.rop.cst.CstString getDescriptor() {
            r1 = this;
            com.android.dx.cf.iface.Method r0 = r1.method
            com.android.dx.rop.cst.CstString r0 = r0.getDescriptor()
            return r0
    }

    @Override // com.android.dx.cf.iface.Method
    public com.android.dx.rop.type.Prototype getEffectiveDescriptor() {
            r1 = this;
            com.android.dx.cf.iface.Method r0 = r1.method
            com.android.dx.rop.type.Prototype r0 = r0.getEffectiveDescriptor()
            return r0
    }

    public com.android.dx.cf.code.LineNumberList getLineNumbers() {
            r1 = this;
            com.android.dx.cf.code.LineNumberList r0 = r1.lineNumbers
            return r0
    }

    public com.android.dx.cf.code.LocalVariableList getLocalVariables() {
            r1 = this;
            com.android.dx.cf.code.LocalVariableList r0 = r1.localVariables
            return r0
    }

    public int getMaxLocals() {
            r1 = this;
            com.android.dx.cf.attrib.AttCode r0 = r1.attCode
            int r0 = r0.getMaxLocals()
            return r0
    }

    public int getMaxStack() {
            r1 = this;
            com.android.dx.cf.attrib.AttCode r0 = r1.attCode
            int r0 = r0.getMaxStack()
            return r0
    }

    @Override // com.android.dx.cf.iface.Member
    public com.android.dx.rop.cst.CstString getName() {
            r1 = this;
            com.android.dx.cf.iface.Method r0 = r1.method
            com.android.dx.rop.cst.CstString r0 = r0.getName()
            return r0
    }

    @Override // com.android.dx.cf.iface.Member
    public com.android.dx.rop.cst.CstNat getNat() {
            r1 = this;
            com.android.dx.cf.iface.Method r0 = r1.method
            com.android.dx.rop.cst.CstNat r0 = r0.getNat()
            return r0
    }

    public com.android.dx.rop.cst.CstString getSourceFile() {
            r1 = this;
            com.android.dx.cf.iface.ClassFile r0 = r1.classFile
            com.android.dx.rop.cst.CstString r0 = r0.getSourceFile()
            return r0
    }

    public final boolean isDefaultOrStaticInterfaceMethod() {
            r1 = this;
            com.android.dx.cf.iface.ClassFile r0 = r1.classFile
            int r0 = r0.getAccessFlags()
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L16
            com.android.dx.rop.cst.CstNat r0 = r1.getNat()
            boolean r0 = r0.isClassInit()
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public final boolean isStaticMethod() {
            r1 = this;
            int r0 = r1.getAccessFlags()
            r0 = r0 & 8
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public com.android.dx.rop.code.SourcePosition makeSourcePosistion(int r4) {
            r3 = this;
            com.android.dx.rop.code.SourcePosition r0 = new com.android.dx.rop.code.SourcePosition
            com.android.dx.rop.cst.CstString r1 = r3.getSourceFile()
            com.android.dx.cf.code.LineNumberList r2 = r3.lineNumbers
            int r2 = r2.pcToLine(r4)
            r0.<init>(r1, r4, r2)
            return r0
    }
}
