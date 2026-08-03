package com.android.dx.io;

/* JADX INFO: loaded from: classes.dex */
public final class DexIndexPrinter {
    private final com.android.dex.Dex dex;
    private final com.android.dex.TableOfContents tableOfContents;

    public DexIndexPrinter(java.io.File r2) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            com.android.dex.Dex r0 = new com.android.dex.Dex
            r0.<init>(r2)
            r1.dex = r0
            com.android.dex.TableOfContents r2 = r0.getTableOfContents()
            r1.tableOfContents = r2
            return
    }

    public static void main(java.lang.String[] r3) throws java.io.IOException {
            com.android.dx.io.DexIndexPrinter r0 = new com.android.dx.io.DexIndexPrinter
            java.io.File r1 = new java.io.File
            r2 = 0
            r3 = r3[r2]
            r1.<init>(r3)
            r0.<init>(r1)
            r0.printMap()
            r0.printStrings()
            r0.printTypeIds()
            r0.printProtoIds()
            r0.printFieldIds()
            r0.printMethodIds()
            r0.printTypeLists()
            r0.printClassDefs()
            return
    }

    private void printClassDefs() {
            r6 = this;
            com.android.dex.Dex r0 = r6.dex
            java.lang.Iterable r0 = r0.classDefs()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            com.android.dex.ClassDef r2 = (com.android.dex.ClassDef) r2
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "class def "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ": "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.println(r2)
            int r1 = r1 + 1
            goto Lb
        L38:
            return
    }

    private void printFieldIds() throws java.io.IOException {
            r6 = this;
            com.android.dex.Dex r0 = r6.dex
            java.util.List r0 = r0.fieldIds()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            com.android.dex.FieldId r2 = (com.android.dex.FieldId) r2
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "field "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ": "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.println(r2)
            int r1 = r1 + 1
            goto Lb
        L38:
            return
    }

    private void printMap() {
            r7 = this;
            com.android.dex.TableOfContents r0 = r7.tableOfContents
            com.android.dex.TableOfContents$Section[] r0 = r0.sections
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L58
            r3 = r0[r2]
            int r4 = r3.off
            r5 = -1
            if (r4 == r5) goto L55
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "section "
            r5.append(r6)
            short r6 = r3.type
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            r5.append(r6)
            java.lang.String r6 = " off="
            r5.append(r6)
            int r6 = r3.off
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            r5.append(r6)
            java.lang.String r6 = " size="
            r5.append(r6)
            int r6 = r3.size
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            r5.append(r6)
            java.lang.String r6 = " byteCount="
            r5.append(r6)
            int r3 = r3.byteCount
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.println(r3)
        L55:
            int r2 = r2 + 1
            goto L6
        L58:
            return
    }

    private void printMethodIds() throws java.io.IOException {
            r6 = this;
            com.android.dex.Dex r0 = r6.dex
            java.util.List r0 = r0.methodIds()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            com.android.dex.MethodId r2 = (com.android.dex.MethodId) r2
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "methodId "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ": "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.println(r2)
            int r1 = r1 + 1
            goto Lb
        L38:
            return
    }

    private void printProtoIds() throws java.io.IOException {
            r6 = this;
            com.android.dex.Dex r0 = r6.dex
            java.util.List r0 = r0.protoIds()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            com.android.dex.ProtoId r2 = (com.android.dex.ProtoId) r2
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "proto "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ": "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.println(r2)
            int r1 = r1 + 1
            goto Lb
        L38:
            return
    }

    private void printStrings() throws java.io.IOException {
            r6 = this;
            com.android.dex.Dex r0 = r6.dex
            java.util.List r0 = r0.strings()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "string "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ": "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.println(r2)
            int r1 = r1 + 1
            goto Lb
        L38:
            return
    }

    private void printTypeIds() throws java.io.IOException {
            r6 = this;
            com.android.dex.Dex r0 = r6.dex
            java.util.List r0 = r0.typeIds()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "type "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ": "
            r4.append(r5)
            com.android.dex.Dex r5 = r6.dex
            java.util.List r5 = r5.strings()
            int r2 = r2.intValue()
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.println(r2)
            int r1 = r1 + 1
            goto Lb
        L48:
            return
    }

    private void printTypeLists() throws java.io.IOException {
            r9 = this;
            com.android.dex.TableOfContents r0 = r9.tableOfContents
            com.android.dex.TableOfContents$Section r0 = r0.typeLists
            int r0 = r0.off
            r1 = -1
            if (r0 != r1) goto L11
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "No type lists"
            r0.println(r1)
            return
        L11:
            com.android.dex.Dex r1 = r9.dex
            com.android.dex.Dex$Section r0 = r1.open(r0)
            r1 = 0
            r2 = r1
        L19:
            com.android.dex.TableOfContents r3 = r9.tableOfContents
            com.android.dex.TableOfContents$Section r3 = r3.typeLists
            int r3 = r3.size
            if (r2 >= r3) goto L84
            int r3 = r0.readInt()
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Type list i="
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", size="
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = ", elements="
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.print(r5)
            r4 = r1
        L49:
            if (r4 >= r3) goto L74
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = " "
            r6.append(r7)
            com.android.dex.Dex r7 = r9.dex
            java.util.List r7 = r7.typeNames()
            short r8 = r0.readShort()
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.print(r6)
            int r4 = r4 + 1
            goto L49
        L74:
            int r3 = r3 % 2
            r4 = 1
            if (r3 != r4) goto L7c
            r0.readShort()
        L7c:
            java.io.PrintStream r3 = java.lang.System.out
            r3.println()
            int r2 = r2 + 1
            goto L19
        L84:
            return
    }
}
