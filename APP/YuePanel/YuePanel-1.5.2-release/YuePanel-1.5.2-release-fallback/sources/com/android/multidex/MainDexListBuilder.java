package com.android.multidex;

/* JADX INFO: loaded from: classes.dex */
public class MainDexListBuilder {
    private static final java.lang.String CLASS_EXTENSION = ".class";
    private static final java.lang.String DISABLE_ANNOTATION_RESOLUTION_WORKAROUND = "--disable-annotation-resolution-workaround";
    private static final java.lang.String EOL = null;
    private static final int STATUS_ERROR = 1;
    private static final java.lang.String USAGE_MESSAGE = null;
    private java.util.Set<java.lang.String> filesToKeep;

    static {
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            com.android.multidex.MainDexListBuilder.EOL = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Usage:"
            r1.append(r2)
            r1.append(r0)
            r1.append(r0)
            java.lang.String r2 = "Short version: Don't use this."
            r1.append(r2)
            r1.append(r0)
            r1.append(r0)
            java.lang.String r2 = "Slightly longer version: This tool is used by mainDexClasses script to build"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "the main dex list."
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.android.multidex.MainDexListBuilder.USAGE_MESSAGE = r0
            return
    }

    public MainDexListBuilder(boolean r5, java.lang.String r6, java.lang.String r7) throws java.io.IOException {
            r4 = this;
            r4.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.filesToKeep = r0
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            com.android.multidex.Path r6 = new com.android.multidex.Path     // Catch: java.lang.Throwable -> L6a
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6a
            com.android.multidex.ClassReferenceListBuilder r7 = new com.android.multidex.ClassReferenceListBuilder     // Catch: java.lang.Throwable -> L48
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L48
            r7.addRoots(r1)     // Catch: java.lang.Throwable -> L48
            java.util.Set r7 = r7.getClassNames()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L48
        L25:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L48
            java.util.Set<java.lang.String> r2 = r4.filesToKeep     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r3.<init>()     // Catch: java.lang.Throwable -> L48
            r3.append(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = ".class"
            r3.append(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L48
            r2.add(r0)     // Catch: java.lang.Throwable -> L48
            goto L25
        L48:
            r5 = move-exception
        L49:
            r0 = r1
            goto L99
        L4b:
            if (r5 == 0) goto L50
            r4.keepAnnotated(r6)     // Catch: java.lang.Throwable -> L48
        L50:
            r1.close()     // Catch: java.io.IOException -> L53
        L53:
            java.util.List<com.android.multidex.ClassPathElement> r5 = r6.elements
            java.util.Iterator r5 = r5.iterator()
        L59:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L69
            java.lang.Object r6 = r5.next()
            com.android.multidex.ClassPathElement r6 = (com.android.multidex.ClassPathElement) r6
            r6.close()     // Catch: java.io.IOException -> L59
            goto L59
        L69:
            return
        L6a:
            r5 = move-exception
            r6 = r0
            goto L49
        L6d:
            r5 = move-exception
            r6 = r0
            goto L99
        L70:
            r5 = move-exception
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r1.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = "\""
            r1.append(r2)     // Catch: java.lang.Throwable -> L6d
            r1.append(r6)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "\" can not be read as a zip archive. ("
            r1.append(r6)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = r5.getMessage()     // Catch: java.lang.Throwable -> L6d
            r1.append(r6)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = ")"
            r1.append(r6)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L6d
            r7.<init>(r6, r5)     // Catch: java.lang.Throwable -> L6d
            throw r7     // Catch: java.lang.Throwable -> L6d
        L99:
            r0.close()     // Catch: java.io.IOException -> L9c
        L9c:
            if (r6 == 0) goto Lb4
            java.util.List<com.android.multidex.ClassPathElement> r6 = r6.elements
            java.util.Iterator r6 = r6.iterator()
        La4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb4
            java.lang.Object r7 = r6.next()
            com.android.multidex.ClassPathElement r7 = (com.android.multidex.ClassPathElement) r7
            r7.close()     // Catch: java.io.IOException -> La4
            goto La4
        Lb4:
            throw r5
    }

    private boolean hasRuntimeVisibleAnnotation(com.android.dx.cf.iface.HasAttribute r2) {
            r1 = this;
            com.android.dx.cf.iface.AttributeList r2 = r2.getAttributes()
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            com.android.dx.cf.iface.Attribute r2 = r2.findFirst(r0)
            if (r2 == 0) goto L1a
            com.android.dx.cf.attrib.AttRuntimeVisibleAnnotations r2 = (com.android.dx.cf.attrib.AttRuntimeVisibleAnnotations) r2
            com.android.dx.rop.annotation.Annotations r2 = r2.getAnnotations()
            int r2 = r2.size()
            if (r2 <= 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }

    private void keepAnnotated(com.android.multidex.Path r9) throws java.io.FileNotFoundException {
            r8 = this;
            java.lang.Iterable r0 = r9.getElements()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r0.next()
            com.android.multidex.ClassPathElement r1 = (com.android.multidex.ClassPathElement) r1
            java.lang.Iterable r1 = r1.list()
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ".class"
            boolean r3 = r2.endsWith(r3)
            if (r3 == 0) goto L1c
            com.android.dx.cf.direct.DirectClassFile r3 = r9.getClass(r2)
            boolean r4 = r8.hasRuntimeVisibleAnnotation(r3)
            if (r4 == 0) goto L40
            java.util.Set<java.lang.String> r3 = r8.filesToKeep
            r3.add(r2)
            goto L1c
        L40:
            com.android.dx.cf.iface.MethodList r4 = r3.getMethods()
            r5 = 0
            r6 = r5
        L46:
            int r7 = r4.size()
            if (r6 >= r7) goto L5f
            com.android.dx.cf.iface.Method r7 = r4.get(r6)
            boolean r7 = r8.hasRuntimeVisibleAnnotation(r7)
            if (r7 == 0) goto L5c
            java.util.Set<java.lang.String> r3 = r8.filesToKeep
            r3.add(r2)
            goto L1c
        L5c:
            int r6 = r6 + 1
            goto L46
        L5f:
            com.android.dx.cf.iface.FieldList r3 = r3.getFields()
        L63:
            int r4 = r3.size()
            if (r5 >= r4) goto L1c
            com.android.dx.cf.iface.Field r4 = r3.get(r5)
            boolean r4 = r8.hasRuntimeVisibleAnnotation(r4)
            if (r4 == 0) goto L79
            java.util.Set<java.lang.String> r3 = r8.filesToKeep
            r3.add(r2)
            goto L1c
        L79:
            int r5 = r5 + 1
            goto L63
        L7c:
            return
    }

    public static void main(java.lang.String[] r7) {
            r0 = 0
            r1 = 1
            r2 = r0
            r3 = r1
        L4:
            int r4 = r7.length
            r5 = 2
            int r4 = r4 - r5
            if (r2 >= r4) goto L36
            r4 = r7[r2]
            java.lang.String r5 = "--disable-annotation-resolution-workaround"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L15
            r3 = r0
            goto L33
        L15:
            java.io.PrintStream r4 = java.lang.System.err
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Invalid option "
            r5.append(r6)
            r6 = r7[r2]
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.println(r5)
            printUsage()
            java.lang.System.exit(r1)
        L33:
            int r2 = r2 + 1
            goto L4
        L36:
            int r0 = r7.length
            int r0 = r0 - r2
            if (r0 == r5) goto L40
            printUsage()
            java.lang.System.exit(r1)
        L40:
            com.android.multidex.MainDexListBuilder r0 = new com.android.multidex.MainDexListBuilder     // Catch: java.io.IOException -> L52
            r4 = r7[r2]     // Catch: java.io.IOException -> L52
            int r2 = r2 + r1
            r7 = r7[r2]     // Catch: java.io.IOException -> L52
            r0.<init>(r3, r4, r7)     // Catch: java.io.IOException -> L52
            java.util.Set r7 = r0.getMainDexList()     // Catch: java.io.IOException -> L52
            printList(r7)     // Catch: java.io.IOException -> L52
            return
        L52:
            r7 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "A fatal error occured: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.println(r7)
            java.lang.System.exit(r1)
            return
    }

    private static void printList(java.util.Set<java.lang.String> r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            goto L4
        L16:
            return
    }

    private static void printUsage() {
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = com.android.multidex.MainDexListBuilder.USAGE_MESSAGE
            r0.print(r1)
            return
    }

    public java.util.Set<java.lang.String> getMainDexList() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.filesToKeep
            return r0
    }
}
