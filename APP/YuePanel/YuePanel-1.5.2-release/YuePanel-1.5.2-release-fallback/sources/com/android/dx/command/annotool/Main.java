package com.android.dx.command.annotool;

/* JADX INFO: loaded from: classes.dex */
public class Main {

    public static class Arguments {
        java.lang.String aclass;
        java.util.EnumSet<java.lang.annotation.ElementType> eTypes;
        java.lang.String[] files;
        java.util.EnumSet<com.android.dx.command.annotool.Main.PrintType> printTypes;

        public Arguments() {
                r1 = this;
                r1.<init>()
                java.lang.Class<java.lang.annotation.ElementType> r0 = java.lang.annotation.ElementType.class
                java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
                r1.eTypes = r0
                java.lang.Class<com.android.dx.command.annotool.Main$PrintType> r0 = com.android.dx.command.annotool.Main.PrintType.class
                java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
                r1.printTypes = r0
                return
        }

        public void parse(java.lang.String[] r9) throws com.android.dx.command.annotool.Main.InvalidArgumentException {
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                int r2 = r9.length
                if (r1 >= r2) goto Lae
                r2 = r9[r1]
                java.lang.String r3 = "--annotation="
                boolean r3 = r2.startsWith(r3)
                r4 = 61
                if (r3 == 0) goto L32
                int r3 = r2.indexOf(r4)
                int r3 = r3 + 1
                java.lang.String r2 = r2.substring(r3)
                java.lang.String r3 = r8.aclass
                if (r3 != 0) goto L2a
                r3 = 46
                r4 = 47
                java.lang.String r2 = r2.replace(r3, r4)
                r8.aclass = r2
                goto L98
            L2a:
                com.android.dx.command.annotool.Main$InvalidArgumentException r9 = new com.android.dx.command.annotool.Main$InvalidArgumentException
                java.lang.String r0 = "--annotation can only be specified once."
                r9.<init>(r0)
                throw r9
            L32:
                java.lang.String r3 = "--element="
                boolean r3 = r2.startsWith(r3)
                java.lang.String r5 = ","
                if (r3 == 0) goto L6a
                int r3 = r2.indexOf(r4)
                int r3 = r3 + 1
                java.lang.String r2 = r2.substring(r3)
                java.lang.String[] r2 = r2.split(r5)     // Catch: java.lang.IllegalArgumentException -> L62
                int r3 = r2.length     // Catch: java.lang.IllegalArgumentException -> L62
                r4 = r0
            L4c:
                if (r4 >= r3) goto L98
                r5 = r2[r4]     // Catch: java.lang.IllegalArgumentException -> L62
                java.util.EnumSet<java.lang.annotation.ElementType> r6 = r8.eTypes     // Catch: java.lang.IllegalArgumentException -> L62
                java.util.Locale r7 = java.util.Locale.ROOT     // Catch: java.lang.IllegalArgumentException -> L62
                java.lang.String r5 = r5.toUpperCase(r7)     // Catch: java.lang.IllegalArgumentException -> L62
                java.lang.annotation.ElementType r5 = java.lang.annotation.ElementType.valueOf(r5)     // Catch: java.lang.IllegalArgumentException -> L62
                r6.add(r5)     // Catch: java.lang.IllegalArgumentException -> L62
                int r4 = r4 + 1
                goto L4c
            L62:
                com.android.dx.command.annotool.Main$InvalidArgumentException r9 = new com.android.dx.command.annotool.Main$InvalidArgumentException
                java.lang.String r0 = "invalid --element"
                r9.<init>(r0)
                throw r9
            L6a:
                java.lang.String r3 = "--print="
                boolean r3 = r2.startsWith(r3)
                if (r3 == 0) goto La4
                int r3 = r2.indexOf(r4)
                int r3 = r3 + 1
                java.lang.String r2 = r2.substring(r3)
                java.lang.String[] r2 = r2.split(r5)     // Catch: java.lang.IllegalArgumentException -> L9c
                int r3 = r2.length     // Catch: java.lang.IllegalArgumentException -> L9c
                r4 = r0
            L82:
                if (r4 >= r3) goto L98
                r5 = r2[r4]     // Catch: java.lang.IllegalArgumentException -> L9c
                java.util.EnumSet<com.android.dx.command.annotool.Main$PrintType> r6 = r8.printTypes     // Catch: java.lang.IllegalArgumentException -> L9c
                java.util.Locale r7 = java.util.Locale.ROOT     // Catch: java.lang.IllegalArgumentException -> L9c
                java.lang.String r5 = r5.toUpperCase(r7)     // Catch: java.lang.IllegalArgumentException -> L9c
                com.android.dx.command.annotool.Main$PrintType r5 = com.android.dx.command.annotool.Main.PrintType.valueOf(r5)     // Catch: java.lang.IllegalArgumentException -> L9c
                r6.add(r5)     // Catch: java.lang.IllegalArgumentException -> L9c
                int r4 = r4 + 1
                goto L82
            L98:
                int r1 = r1 + 1
                goto L2
            L9c:
                com.android.dx.command.annotool.Main$InvalidArgumentException r9 = new com.android.dx.command.annotool.Main$InvalidArgumentException
                java.lang.String r0 = "invalid --print"
                r9.<init>(r0)
                throw r9
            La4:
                int r2 = r9.length
                int r2 = r2 - r1
                java.lang.String[] r2 = new java.lang.String[r2]
                r8.files = r2
                int r3 = r2.length
                java.lang.System.arraycopy(r9, r1, r2, r0, r3)
            Lae:
                java.lang.String r9 = r8.aclass
                if (r9 == 0) goto Lef
                java.util.EnumSet<com.android.dx.command.annotool.Main$PrintType> r9 = r8.printTypes
                boolean r9 = r9.isEmpty()
                if (r9 == 0) goto Lc1
                java.util.EnumSet<com.android.dx.command.annotool.Main$PrintType> r9 = r8.printTypes
                com.android.dx.command.annotool.Main$PrintType r0 = com.android.dx.command.annotool.Main.PrintType.CLASS
                r9.add(r0)
            Lc1:
                java.util.EnumSet<java.lang.annotation.ElementType> r9 = r8.eTypes
                boolean r9 = r9.isEmpty()
                if (r9 == 0) goto Ld0
                java.util.EnumSet<java.lang.annotation.ElementType> r9 = r8.eTypes
                java.lang.annotation.ElementType r0 = java.lang.annotation.ElementType.TYPE
                r9.add(r0)
            Ld0:
                java.util.EnumSet<java.lang.annotation.ElementType> r9 = r8.eTypes
                java.util.EnumSet r9 = r9.clone()
                java.lang.annotation.ElementType r0 = java.lang.annotation.ElementType.TYPE
                r9.remove(r0)
                java.lang.annotation.ElementType r0 = java.lang.annotation.ElementType.PACKAGE
                r9.remove(r0)
                boolean r9 = r9.isEmpty()
                if (r9 == 0) goto Le7
                return
            Le7:
                com.android.dx.command.annotool.Main$InvalidArgumentException r9 = new com.android.dx.command.annotool.Main$InvalidArgumentException
                java.lang.String r0 = "only --element parameters 'type' and 'package' supported"
                r9.<init>(r0)
                throw r9
            Lef:
                com.android.dx.command.annotool.Main$InvalidArgumentException r9 = new com.android.dx.command.annotool.Main$InvalidArgumentException
                java.lang.String r0 = "--annotation must be specified"
                r9.<init>(r0)
                throw r9
        }
    }

    public static class InvalidArgumentException extends java.lang.Exception {
        public InvalidArgumentException() {
                r0 = this;
                r0.<init>()
                return
        }

        public InvalidArgumentException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public enum PrintType extends java.lang.Enum<com.android.dx.command.annotool.Main.PrintType> {
        private static final /* synthetic */ com.android.dx.command.annotool.Main.PrintType[] $VALUES = null;
        public static final com.android.dx.command.annotool.Main.PrintType CLASS = null;
        public static final com.android.dx.command.annotool.Main.PrintType INNERCLASS = null;
        public static final com.android.dx.command.annotool.Main.PrintType METHOD = null;
        public static final com.android.dx.command.annotool.Main.PrintType PACKAGE = null;

        static {
                com.android.dx.command.annotool.Main$PrintType r0 = new com.android.dx.command.annotool.Main$PrintType
                java.lang.String r1 = "CLASS"
                r2 = 0
                r0.<init>(r1, r2)
                com.android.dx.command.annotool.Main.PrintType.CLASS = r0
                com.android.dx.command.annotool.Main$PrintType r1 = new com.android.dx.command.annotool.Main$PrintType
                java.lang.String r2 = "INNERCLASS"
                r3 = 1
                r1.<init>(r2, r3)
                com.android.dx.command.annotool.Main.PrintType.INNERCLASS = r1
                com.android.dx.command.annotool.Main$PrintType r2 = new com.android.dx.command.annotool.Main$PrintType
                java.lang.String r3 = "METHOD"
                r4 = 2
                r2.<init>(r3, r4)
                com.android.dx.command.annotool.Main.PrintType.METHOD = r2
                com.android.dx.command.annotool.Main$PrintType r3 = new com.android.dx.command.annotool.Main$PrintType
                java.lang.String r4 = "PACKAGE"
                r5 = 3
                r3.<init>(r4, r5)
                com.android.dx.command.annotool.Main.PrintType.PACKAGE = r3
                com.android.dx.command.annotool.Main$PrintType[] r0 = new com.android.dx.command.annotool.Main.PrintType[]{r0, r1, r2, r3}
                com.android.dx.command.annotool.Main.PrintType.$VALUES = r0
                return
        }

        PrintType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.android.dx.command.annotool.Main.PrintType valueOf(java.lang.String r1) {
                java.lang.Class<com.android.dx.command.annotool.Main$PrintType> r0 = com.android.dx.command.annotool.Main.PrintType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.android.dx.command.annotool.Main$PrintType r1 = (com.android.dx.command.annotool.Main.PrintType) r1
                return r1
        }

        public static com.android.dx.command.annotool.Main.PrintType[] values() {
                com.android.dx.command.annotool.Main$PrintType[] r0 = com.android.dx.command.annotool.Main.PrintType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.android.dx.command.annotool.Main$PrintType[] r0 = (com.android.dx.command.annotool.Main.PrintType[]) r0
                return r0
        }
    }

    private Main() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void main(java.lang.String[] r1) {
            com.android.dx.command.annotool.Main$Arguments r0 = new com.android.dx.command.annotool.Main$Arguments
            r0.<init>()
            r0.parse(r1)     // Catch: com.android.dx.command.annotool.Main.InvalidArgumentException -> L11
            com.android.dx.command.annotool.AnnotationLister r1 = new com.android.dx.command.annotool.AnnotationLister
            r1.<init>(r0)
            r1.process()
            return
        L11:
            r1 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = r1.getMessage()
            r0.println(r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "usage"
            r1.<init>(r0)
            throw r1
    }
}
