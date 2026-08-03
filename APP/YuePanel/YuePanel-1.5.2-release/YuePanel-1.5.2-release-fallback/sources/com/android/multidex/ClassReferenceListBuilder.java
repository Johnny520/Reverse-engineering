package com.android.multidex;

/* JADX INFO: loaded from: classes.dex */
public class ClassReferenceListBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String CLASS_EXTENSION = ".class";
    private final java.util.Set<java.lang.String> classNames;
    private final com.android.multidex.Path path;

    static {
            return
    }

    public ClassReferenceListBuilder(com.android.multidex.Path r2) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.classNames = r0
            r1.path = r2
            return
    }

    private void addClassWithHierachy(java.lang.String r4) {
            r3 = this;
            java.util.Set<java.lang.String> r0 = r3.classNames
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L9
            return
        L9:
            com.android.multidex.Path r0 = r3.path     // Catch: java.io.FileNotFoundException -> L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L4f
            r1.<init>()     // Catch: java.io.FileNotFoundException -> L4f
            r1.append(r4)     // Catch: java.io.FileNotFoundException -> L4f
            java.lang.String r2 = ".class"
            r1.append(r2)     // Catch: java.io.FileNotFoundException -> L4f
            java.lang.String r1 = r1.toString()     // Catch: java.io.FileNotFoundException -> L4f
            com.android.dx.cf.direct.DirectClassFile r0 = r0.getClass(r1)     // Catch: java.io.FileNotFoundException -> L4f
            java.util.Set<java.lang.String> r1 = r3.classNames     // Catch: java.io.FileNotFoundException -> L4f
            r1.add(r4)     // Catch: java.io.FileNotFoundException -> L4f
            com.android.dx.rop.cst.CstType r4 = r0.getSuperclass()     // Catch: java.io.FileNotFoundException -> L4f
            if (r4 == 0) goto L36
            com.android.dx.rop.type.Type r4 = r4.getClassType()     // Catch: java.io.FileNotFoundException -> L4f
            java.lang.String r4 = r4.getClassName()     // Catch: java.io.FileNotFoundException -> L4f
            r3.addClassWithHierachy(r4)     // Catch: java.io.FileNotFoundException -> L4f
        L36:
            com.android.dx.rop.type.TypeList r4 = r0.getInterfaces()     // Catch: java.io.FileNotFoundException -> L4f
            int r0 = r4.size()     // Catch: java.io.FileNotFoundException -> L4f
            r1 = 0
        L3f:
            if (r1 >= r0) goto L4f
            com.android.dx.rop.type.Type r2 = r4.getType(r1)     // Catch: java.io.FileNotFoundException -> L4f
            java.lang.String r2 = r2.getClassName()     // Catch: java.io.FileNotFoundException -> L4f
            r3.addClassWithHierachy(r2)     // Catch: java.io.FileNotFoundException -> L4f
            int r1 = r1 + 1
            goto L3f
        L4f:
            return
    }

    private void addDependencies(com.android.dx.cf.direct.DirectClassFile r7) {
            r6 = this;
            com.android.dx.rop.cst.ConstantPool r0 = r7.getConstantPool()
            com.android.dx.rop.cst.Constant[] r0 = r0.getEntries()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r1) goto L43
            r4 = r0[r3]
            boolean r5 = r4 instanceof com.android.dx.rop.cst.CstType
            if (r5 == 0) goto L21
            com.android.dx.rop.cst.CstType r4 = (com.android.dx.rop.cst.CstType) r4
            com.android.dx.rop.type.Type r4 = r4.getClassType()
            java.lang.String r4 = r4.getDescriptor()
            r6.checkDescriptor(r4)
            goto L40
        L21:
            boolean r5 = r4 instanceof com.android.dx.rop.cst.CstFieldRef
            if (r5 == 0) goto L33
            com.android.dx.rop.cst.CstFieldRef r4 = (com.android.dx.rop.cst.CstFieldRef) r4
            com.android.dx.rop.type.Type r4 = r4.getType()
            java.lang.String r4 = r4.getDescriptor()
            r6.checkDescriptor(r4)
            goto L40
        L33:
            boolean r5 = r4 instanceof com.android.dx.rop.cst.CstBaseMethodRef
            if (r5 == 0) goto L40
            com.android.dx.rop.cst.CstBaseMethodRef r4 = (com.android.dx.rop.cst.CstBaseMethodRef) r4
            com.android.dx.rop.type.Prototype r4 = r4.getPrototype()
            r6.checkPrototype(r4)
        L40:
            int r3 = r3 + 1
            goto Lb
        L43:
            com.android.dx.cf.iface.FieldList r0 = r7.getFields()
            int r1 = r0.size()
            r3 = r2
        L4c:
            if (r3 >= r1) goto L60
            com.android.dx.cf.iface.Field r4 = r0.get(r3)
            com.android.dx.rop.cst.CstString r4 = r4.getDescriptor()
            java.lang.String r4 = r4.getString()
            r6.checkDescriptor(r4)
            int r3 = r3 + 1
            goto L4c
        L60:
            com.android.dx.cf.iface.MethodList r7 = r7.getMethods()
            int r0 = r7.size()
        L68:
            if (r2 >= r0) goto L80
            com.android.dx.cf.iface.Method r1 = r7.get(r2)
            com.android.dx.rop.cst.CstString r1 = r1.getDescriptor()
            java.lang.String r1 = r1.getString()
            com.android.dx.rop.type.Prototype r1 = com.android.dx.rop.type.Prototype.intern(r1)
            r6.checkPrototype(r1)
            int r2 = r2 + 1
            goto L68
        L80:
            return
    }

    private void checkDescriptor(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = ";"
            boolean r0 = r4.endsWith(r0)
            if (r0 == 0) goto L2c
            r0 = 91
            int r0 = r4.lastIndexOf(r0)
            r1 = 1
            if (r0 >= 0) goto L1e
            int r0 = r4.length()
            int r0 = r0 - r1
            java.lang.String r4 = r4.substring(r1, r0)
            r3.addClassWithHierachy(r4)
            goto L2c
        L1e:
            int r0 = r0 + 2
            int r2 = r4.length()
            int r2 = r2 - r1
            java.lang.String r4 = r4.substring(r0, r2)
            r3.addClassWithHierachy(r4)
        L2c:
            return
    }

    private void checkPrototype(com.android.dx.rop.type.Prototype r3) {
            r2 = this;
            com.android.dx.rop.type.Type r0 = r3.getReturnType()
            java.lang.String r0 = r0.getDescriptor()
            r2.checkDescriptor(r0)
            com.android.dx.rop.type.StdTypeList r3 = r3.getParameterTypes()
            r0 = 0
        L10:
            int r1 = r3.size()
            if (r0 >= r1) goto L24
            com.android.dx.rop.type.Type r1 = r3.get(r0)
            java.lang.String r1 = r1.getDescriptor()
            r2.checkDescriptor(r1)
            int r0 = r0 + 1
            goto L10
        L24:
            return
    }

    @java.lang.Deprecated
    public static void main(java.lang.String[] r0) {
            com.android.multidex.MainDexListBuilder.main(r0)
            return
    }

    public void addRoots(java.util.zip.ZipFile r6) throws java.io.IOException {
            r5 = this;
            java.util.Enumeration r0 = r6.entries()
        L4:
            boolean r1 = r0.hasMoreElements()
            java.lang.String r2 = ".class"
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.nextElement()
            java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1
            java.lang.String r1 = r1.getName()
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L4
            java.util.Set<java.lang.String> r2 = r5.classNames
            int r3 = r1.length()
            int r3 = r3 + (-6)
            r4 = 0
            java.lang.String r1 = r1.substring(r4, r3)
            r2.add(r1)
            goto L4
        L2d:
            java.util.Enumeration r6 = r6.entries()
        L31:
            boolean r0 = r6.hasMoreElements()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r6.nextElement()
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0
            java.lang.String r0 = r0.getName()
            boolean r1 = r0.endsWith(r2)
            if (r1 == 0) goto L31
            com.android.multidex.Path r1 = r5.path     // Catch: java.io.FileNotFoundException -> L51
            com.android.dx.cf.direct.DirectClassFile r0 = r1.getClass(r0)     // Catch: java.io.FileNotFoundException -> L51
            r5.addDependencies(r0)
            goto L31
        L51:
            r6 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Class "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " is missing form original class path "
            r2.append(r0)
            com.android.multidex.Path r0 = r5.path
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r6)
            throw r1
        L73:
            return
    }

    public java.util.Set<java.lang.String> getClassNames() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.classNames
            return r0
    }
}
