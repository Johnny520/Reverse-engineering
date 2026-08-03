package com.android.dx.command.annotool;

/* JADX INFO: loaded from: classes.dex */
class AnnotationLister {
    private static final java.lang.String PACKAGE_INFO = "package-info";
    private final com.android.dx.command.annotool.Main.Arguments args;
    java.util.HashSet<java.lang.String> matchInnerClassesOf;
    java.util.HashSet<java.lang.String> matchPackages;


    /* JADX INFO: renamed from: com.android.dx.command.annotool.AnnotationLister$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$android$dx$command$annotool$Main$PrintType = null;

        static {
                com.android.dx.command.annotool.Main$PrintType[] r0 = com.android.dx.command.annotool.Main.PrintType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.android.dx.command.annotool.AnnotationLister.AnonymousClass2.$SwitchMap$com$android$dx$command$annotool$Main$PrintType = r0
                com.android.dx.command.annotool.Main$PrintType r1 = com.android.dx.command.annotool.Main.PrintType.CLASS     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.android.dx.command.annotool.AnnotationLister.AnonymousClass2.$SwitchMap$com$android$dx$command$annotool$Main$PrintType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.android.dx.command.annotool.Main$PrintType r1 = com.android.dx.command.annotool.Main.PrintType.INNERCLASS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.android.dx.command.annotool.AnnotationLister.AnonymousClass2.$SwitchMap$com$android$dx$command$annotool$Main$PrintType     // Catch: java.lang.NoSuchFieldError -> L28
                com.android.dx.command.annotool.Main$PrintType r1 = com.android.dx.command.annotool.Main.PrintType.METHOD     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.android.dx.command.annotool.AnnotationLister.AnonymousClass2.$SwitchMap$com$android$dx$command$annotool$Main$PrintType     // Catch: java.lang.NoSuchFieldError -> L33
                com.android.dx.command.annotool.Main$PrintType r1 = com.android.dx.command.annotool.Main.PrintType.PACKAGE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public AnnotationLister(com.android.dx.command.annotool.Main.Arguments r2) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.matchInnerClassesOf = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.matchPackages = r0
            r1.args = r2
            return
    }

    public static /* synthetic */ void access$000(com.android.dx.command.annotool.AnnotationLister r0, com.android.dx.cf.direct.DirectClassFile r1, com.android.dx.cf.attrib.BaseAnnotations r2) {
            r0.visitPackageAnnotation(r1, r2)
            return
    }

    public static /* synthetic */ boolean access$100(com.android.dx.command.annotool.AnnotationLister r0, java.lang.String r1) {
            boolean r0 = r0.isMatchingInnerClass(r1)
            return r0
    }

    public static /* synthetic */ boolean access$200(com.android.dx.command.annotool.AnnotationLister r0, java.lang.String r1) {
            boolean r0 = r0.isMatchingPackage(r1)
            return r0
    }

    public static /* synthetic */ void access$300(com.android.dx.command.annotool.AnnotationLister r0, com.android.dx.cf.direct.DirectClassFile r1) {
            r0.printMatch(r1)
            return
    }

    public static /* synthetic */ void access$400(com.android.dx.command.annotool.AnnotationLister r0, com.android.dx.cf.direct.DirectClassFile r1, com.android.dx.cf.attrib.BaseAnnotations r2) {
            r0.visitClassAnnotation(r1, r2)
            return
    }

    private boolean isMatchingInnerClass(java.lang.String r3) {
            r2 = this;
        L0:
            r0 = 36
            int r0 = r3.lastIndexOf(r0)
            r1 = 0
            if (r0 <= 0) goto L17
            java.lang.String r3 = r3.substring(r1, r0)
            java.util.HashSet<java.lang.String> r0 = r2.matchInnerClassesOf
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L0
            r3 = 1
            return r3
        L17:
            return r1
    }

    private boolean isMatchingPackage(java.lang.String r3) {
            r2 = this;
            r0 = 47
            int r0 = r3.lastIndexOf(r0)
            r1 = -1
            if (r0 != r1) goto Lc
            java.lang.String r3 = ""
            goto L11
        Lc:
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
        L11:
            java.util.HashSet<java.lang.String> r0 = r2.matchPackages
            boolean r3 = r0.contains(r3)
            return r3
    }

    private void printMatch(com.android.dx.cf.direct.DirectClassFile r5) {
            r4 = this;
            com.android.dx.command.annotool.Main$Arguments r0 = r4.args
            java.util.EnumSet<com.android.dx.command.annotool.Main$PrintType> r0 = r0.printTypes
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            com.android.dx.command.annotool.Main$PrintType r1 = (com.android.dx.command.annotool.Main.PrintType) r1
            int[] r2 = com.android.dx.command.annotool.AnnotationLister.AnonymousClass2.$SwitchMap$com$android$dx$command$annotool$Main$PrintType
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L35
            r2 = 2
            if (r1 == r2) goto L23
            goto L8
        L23:
            java.util.HashSet<java.lang.String> r1 = r4.matchInnerClassesOf
            com.android.dx.rop.cst.CstType r2 = r5.getThisClass()
            com.android.dx.rop.type.Type r2 = r2.getClassType()
            java.lang.String r2 = r2.getClassName()
            r1.add(r2)
            goto L8
        L35:
            com.android.dx.rop.cst.CstType r1 = r5.getThisClass()
            com.android.dx.rop.type.Type r1 = r1.getClassType()
            java.lang.String r1 = r1.getClassName()
            r2 = 47
            r3 = 46
            java.lang.String r1 = r1.replace(r2, r3)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r1)
            goto L8
        L4f:
            return
    }

    private void printMatchPackage(java.lang.String r5) {
            r4 = this;
            com.android.dx.command.annotool.Main$Arguments r0 = r4.args
            java.util.EnumSet<com.android.dx.command.annotool.Main$PrintType> r0 = r0.printTypes
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            com.android.dx.command.annotool.Main$PrintType r1 = (com.android.dx.command.annotool.Main.PrintType) r1
            int[] r2 = com.android.dx.command.annotool.AnnotationLister.AnonymousClass2.$SwitchMap$com$android$dx$command$annotool$Main$PrintType
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L37
            r2 = 2
            if (r1 == r2) goto L37
            r2 = 3
            if (r1 == r2) goto L37
            r2 = 4
            if (r1 == r2) goto L29
            goto L8
        L29:
            java.io.PrintStream r1 = java.lang.System.out
            r2 = 47
            r3 = 46
            java.lang.String r2 = r5.replace(r2, r3)
            r1.println(r2)
            goto L8
        L37:
            java.util.HashSet<java.lang.String> r1 = r4.matchPackages
            r1.add(r5)
            goto L8
        L3d:
            return
    }

    private void visitClassAnnotation(com.android.dx.cf.direct.DirectClassFile r3, com.android.dx.cf.attrib.BaseAnnotations r4) {
            r2 = this;
            com.android.dx.command.annotool.Main$Arguments r0 = r2.args
            java.util.EnumSet<java.lang.annotation.ElementType> r0 = r0.eTypes
            java.lang.annotation.ElementType r1 = java.lang.annotation.ElementType.TYPE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            return
        Ld:
            com.android.dx.rop.annotation.Annotations r4 = r4.getAnnotations()
            java.util.Collection r4 = r4.getAnnotations()
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r4.next()
            com.android.dx.rop.annotation.Annotation r0 = (com.android.dx.rop.annotation.Annotation) r0
            com.android.dx.rop.cst.CstType r0 = r0.getType()
            com.android.dx.rop.type.Type r0 = r0.getClassType()
            java.lang.String r0 = r0.getClassName()
            com.android.dx.command.annotool.Main$Arguments r1 = r2.args
            java.lang.String r1 = r1.aclass
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L19
            r2.printMatch(r3)
            goto L19
        L3f:
            return
    }

    private void visitPackageAnnotation(com.android.dx.cf.direct.DirectClassFile r3, com.android.dx.cf.attrib.BaseAnnotations r4) {
            r2 = this;
            com.android.dx.command.annotool.Main$Arguments r0 = r2.args
            java.util.EnumSet<java.lang.annotation.ElementType> r0 = r0.eTypes
            java.lang.annotation.ElementType r1 = java.lang.annotation.ElementType.PACKAGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Ld
            return
        Ld:
            com.android.dx.rop.cst.CstType r3 = r3.getThisClass()
            com.android.dx.rop.type.Type r3 = r3.getClassType()
            java.lang.String r3 = r3.getClassName()
            r0 = 47
            int r0 = r3.lastIndexOf(r0)
            r1 = -1
            if (r0 != r1) goto L25
            java.lang.String r3 = ""
            goto L2a
        L25:
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
        L2a:
            com.android.dx.rop.annotation.Annotations r4 = r4.getAnnotations()
            java.util.Collection r4 = r4.getAnnotations()
            java.util.Iterator r4 = r4.iterator()
        L36:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r4.next()
            com.android.dx.rop.annotation.Annotation r0 = (com.android.dx.rop.annotation.Annotation) r0
            com.android.dx.rop.cst.CstType r0 = r0.getType()
            com.android.dx.rop.type.Type r0 = r0.getClassType()
            java.lang.String r0 = r0.getClassName()
            com.android.dx.command.annotool.Main$Arguments r1 = r2.args
            java.lang.String r1 = r1.aclass
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L36
            r2.printMatchPackage(r3)
            goto L36
        L5c:
            return
    }

    public void process() {
            r7 = this;
            com.android.dx.command.annotool.Main$Arguments r0 = r7.args
            java.lang.String[] r0 = r0.files
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L1b
            r3 = r0[r2]
            com.android.dx.cf.direct.ClassPathOpener r4 = new com.android.dx.cf.direct.ClassPathOpener
            com.android.dx.command.annotool.AnnotationLister$1 r5 = new com.android.dx.command.annotool.AnnotationLister$1
            r5.<init>(r7)
            r6 = 1
            r4.<init>(r3, r6, r5)
            r4.process()
            int r2 = r2 + 1
            goto L6
        L1b:
            return
    }
}
