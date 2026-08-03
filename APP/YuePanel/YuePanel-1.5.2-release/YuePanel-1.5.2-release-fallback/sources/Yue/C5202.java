package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5202 implements Yue.InterfaceC4366 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String[] f19543;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String[] f19544;

    public C5202(java.lang.String[] r3, java.lang.String[] r4, int r5) {
            r2 = this;
            r2.<init>()
            java.lang.String[] r0 = new java.lang.String[r5]
            r2.f19543 = r0
            java.lang.String[] r5 = new java.lang.String[r5]
            r2.f19544 = r5
            int r5 = r0.length
            r1 = 0
            java.lang.System.arraycopy(r3, r1, r0, r1, r5)
            java.lang.String[] r3 = r2.f19544
            int r5 = r3.length
            java.lang.System.arraycopy(r4, r1, r3, r1, r5)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m19660(java.lang.String[] r4) throws java.lang.Exception {
            Yue.ۥ۠ۨۤۥ r0 = new Yue.ۥ۠ۨۤۥ
            r0.<init>()
            java.io.FileReader r1 = new java.io.FileReader
            r2 = 0
            r4 = r4[r2]
            r1.<init>(r4)
            r0.m15546(r1)
        L10:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L6a
            boolean r4 = r0.mo15449()
            if (r4 == 0) goto L66
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "context["
            r1.append(r2)
            Yue.ۥۡۢ۠ۥ r2 = r0.mo15438()
            r1.append(r2)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.println(r1)
            Yue.ۥۡۢ۠ۥ r4 = r0.mo15438()
            java.lang.String r1 = "a"
            java.util.Iterator r4 = r4.mo17193(r1)
        L45:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L66
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "Found prefix:"
            r2.append(r3)
            java.lang.Object r3 = r4.next()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            goto L45
        L66:
            r0.next()
            goto L10
        L6a:
            return
    }

    @Override // Yue.InterfaceC4366
    public java.lang.String getPrefix(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L6c
            int r0 = r5.length()
            if (r0 == 0) goto L64
            java.lang.String[] r0 = r4.f19544
            int r0 = r0.length
            int r0 = r0 + (-1)
        Ld:
            if (r0 < 0) goto L4c
            java.lang.String[] r1 = r4.f19544
            r1 = r1[r0]
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L49
            java.lang.String[] r1 = r4.f19543
            r1 = r1[r0]
            if (r1 != 0) goto L33
            java.lang.String[] r1 = r4.f19544
            int r1 = r1.length
            int r1 = r1 + (-1)
        L24:
            if (r1 <= r0) goto L30
            java.lang.String[] r2 = r4.f19543
            r2 = r2[r1]
            if (r2 != 0) goto L2d
            goto L49
        L2d:
            int r1 = r1 + (-1)
            goto L24
        L30:
            java.lang.String r5 = ""
            return r5
        L33:
            java.lang.String[] r2 = r4.f19544
            int r2 = r2.length
            int r2 = r2 + (-1)
        L38:
            if (r2 <= r0) goto L48
            java.lang.String[] r3 = r4.f19543
            r3 = r3[r2]
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L45
            goto L49
        L45:
            int r2 = r2 + (-1)
            goto L38
        L48:
            return r1
        L49:
            int r0 = r0 + (-1)
            goto Ld
        L4c:
            java.lang.String r0 = "http://www.w3.org/XML/1998/namespace"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L57
            java.lang.String r5 = "xml"
            return r5
        L57:
            java.lang.String r0 = "http://www.w3.org/2000/xmlns/"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L62
            java.lang.String r5 = "xmlns"
            return r5
        L62:
            r5 = 0
            return r5
        L64:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "uri may not be empty string"
            r5.<init>(r0)
            throw r5
        L6c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "uri may not be null"
            r5.<init>(r0)
            throw r5
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L6:
            java.lang.String[] r2 = r4.f19544
            int r2 = r2.length
            if (r1 >= r2) goto L3b
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "["
            r2.append(r3)
            java.lang.String[] r3 = r4.f19543
            r3 = r3[r1]
            java.lang.String r3 = r4.m19661(r3)
            r2.append(r3)
            java.lang.String r3 = "<->"
            r2.append(r3)
            java.lang.String[] r3 = r4.f19544
            r3 = r3[r1]
            r2.append(r3)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L3b:
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.String m19661(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            java.lang.String r1 = ""
        L4:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String m19662() {
            r2 = this;
            java.lang.String[] r0 = r2.f19544
            int r0 = r0.length
            int r0 = r0 + (-1)
        L5:
            if (r0 < 0) goto L15
            java.lang.String[] r1 = r2.f19543
            r1 = r1[r0]
            if (r1 != 0) goto L12
            java.lang.String[] r1 = r2.f19544
            r0 = r1[r0]
            return r0
        L12:
            int r0 = r0 + (-1)
            goto L5
        L15:
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC4366
    /* JADX INFO: renamed from: ۥ۟۟ */
    public java.lang.String mo17192(java.lang.String r3) {
            r2 = this;
            if (r3 == 0) goto L4e
            int r0 = r3.length()
            if (r0 <= 0) goto L37
            java.lang.String[] r0 = r2.f19544
            int r0 = r0.length
            int r0 = r0 + (-1)
        Ld:
            if (r0 < 0) goto L21
            java.lang.String[] r1 = r2.f19543
            r1 = r1[r0]
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L1e
            java.lang.String[] r3 = r2.f19544
            r3 = r3[r0]
            return r3
        L1e:
            int r0 = r0 + (-1)
            goto Ld
        L21:
            java.lang.String r0 = "xml"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L2c
            java.lang.String r3 = "http://www.w3.org/XML/1998/namespace"
            return r3
        L2c:
            java.lang.String r0 = "xmlns"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L4c
            java.lang.String r3 = "http://www.w3.org/2000/xmlns/"
            return r3
        L37:
            java.lang.String[] r3 = r2.f19544
            int r3 = r3.length
            int r3 = r3 + (-1)
        L3c:
            if (r3 < 0) goto L4c
            java.lang.String[] r0 = r2.f19543
            r0 = r0[r3]
            if (r0 != 0) goto L49
            java.lang.String[] r0 = r2.f19544
            r3 = r0[r3]
            return r3
        L49:
            int r3 = r3 + (-1)
            goto L3c
        L4c:
            r3 = 0
            return r3
        L4e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Prefix may not be null."
            r3.<init>(r0)
            throw r3
    }

    @Override // Yue.InterfaceC4366
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public java.util.Iterator mo17193(java.lang.String r6) {
            r5 = this;
            if (r6 == 0) goto L6e
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L66
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String[] r1 = r5.f19544
            int r1 = r1.length
            int r1 = r1 + (-1)
        L14:
            if (r1 < 0) goto L61
            java.lang.String[] r2 = r5.f19543
            r2 = r2[r1]
            java.lang.String r2 = r5.m19661(r2)
            java.lang.String[] r3 = r5.f19544
            r3 = r3[r1]
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L5e
            boolean r3 = r0.contains(r2)
            if (r3 == 0) goto L2f
            goto L5e
        L2f:
            int r3 = r2.length()
            if (r3 != 0) goto L46
            java.lang.String[] r3 = r5.f19544
            int r3 = r3.length
            int r3 = r3 + (-1)
        L3a:
            if (r3 <= r1) goto L5b
            java.lang.String[] r4 = r5.f19543
            r4 = r4[r3]
            if (r4 != 0) goto L43
            goto L5e
        L43:
            int r3 = r3 + (-1)
            goto L3a
        L46:
            java.lang.String[] r3 = r5.f19544
            int r3 = r3.length
            int r3 = r3 + (-1)
        L4b:
            if (r3 <= r1) goto L5b
            java.lang.String[] r4 = r5.f19543
            r4 = r4[r3]
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L58
            goto L5e
        L58:
            int r3 = r3 + (-1)
            goto L4b
        L5b:
            r0.add(r2)
        L5e:
            int r1 = r1 + (-1)
            goto L14
        L61:
            java.util.Iterator r6 = r0.iterator()
            return r6
        L66:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "uri may not be empty string"
            r6.<init>(r0)
            throw r6
        L6e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "uri may not be null"
            r6.<init>(r0)
            throw r6
    }
}
