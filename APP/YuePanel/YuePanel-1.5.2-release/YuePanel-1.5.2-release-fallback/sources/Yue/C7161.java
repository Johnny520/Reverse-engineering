package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7161 extends Yue.C7163 {
    public C7161() {
            r0 = this;
            r0.<init>()
            return
    }

    public C7161(java.io.Writer r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static void m27545(java.lang.String[] r4) throws java.lang.Exception {
            Yue.ۥۢۦۡۧ r0 = Yue.AbstractC7152.m27518()
            Yue.AbstractC7153.m27520()
            java.io.FileReader r1 = new java.io.FileReader
            r2 = 0
            r4 = r4[r2]
            r1.<init>(r4)
            Yue.ۥۢۦۢۤ r4 = r0.mo15566(r1)
            Yue.ۥۢۦۢۥ r0 = new Yue.ۥۢۦۢۥ
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            java.lang.String r3 = "out.stream"
            r2.<init>(r3)
            r1.<init>(r2)
            r0.<init>(r1)
        L24:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L31
            r0.mo19667(r4)
            r4.next()
            goto L24
        L31:
            r0.mo19667(r4)
            r0.flush()
            return
    }

    @Override // Yue.C7163, Yue.InterfaceC7162
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo27546(java.lang.String r2) throws Yue.C7158 {
            r1 = this;
            java.lang.String r0 = "[["
            r1.m27597(r0)
            r1.m27597(r2)
            java.lang.String r2 = "],[utf-8]]"
            r1.m27597(r2)
            return
    }

    @Override // Yue.C7163, Yue.InterfaceC7162
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo27547(java.lang.String r2) throws Yue.C7158 {
            r1 = this;
            java.lang.String r0 = "[[DEFAULT]["
            r1.m27597(r0)
            boolean r0 = r1.m27587()
            if (r0 == 0) goto L28
            java.lang.String r0 = "xmlns]"
            r1.m27597(r0)
            java.lang.String r0 = "=["
            r1.m27597(r0)
            r1.m27597(r2)
            java.lang.String r0 = "]"
            r1.m27597(r0)
            java.lang.String r0 = ""
            r1.mo27564(r0, r2)
            r2 = 93
            r1.m27596(r2)
            return
        L28:
            Yue.ۥۢۦۢۢ r2 = new Yue.ۥۢۦۢۢ
            java.lang.String r0 = "A start element must be written before the default namespace"
            r2.<init>(r0)
            throw r2
    }

    @Override // Yue.C7163, Yue.InterfaceC7162
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo27548(java.lang.String r2) throws Yue.C7158 {
            r1 = this;
            java.lang.String r0 = "["
            r1.m27597(r0)
            super.m27597(r2)
            java.lang.String r2 = "]"
            r1.m27597(r2)
            return
    }

    @Override // Yue.C7163, Yue.InterfaceC7162
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo27549(java.lang.String r4, java.lang.String r5) throws Yue.C7158 {
            r3 = this;
            r3.m27583()
            java.lang.String r0 = "["
            r3.m27597(r0)
            java.lang.String r1 = "]"
            if (r4 == 0) goto L21
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            r3.m27597(r4)
        L21:
            if (r5 == 0) goto L3a
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.String r0 = ",["
            r4.append(r0)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r3.m27597(r4)
        L3a:
            r3.m27597(r1)
            return
    }

    @Override // Yue.C7163, Yue.InterfaceC7162
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void mo27550(java.lang.String r2, java.lang.String r3) throws Yue.C7158 {
            r1 = this;
            boolean r0 = r1.m27587()
            if (r0 == 0) goto L40
            if (r2 == 0) goto L3c
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "xmlns"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L19
            goto L3c
        L19:
            java.lang.String r0 = "[[NAMESPACE]["
            r1.m27597(r0)
            java.lang.String r0 = "xmlns:"
            r1.m27597(r0)
            r1.m27597(r2)
            java.lang.String r0 = "]=["
            r1.m27597(r0)
            r1.m27597(r3)
            java.lang.String r0 = "]"
            r1.m27597(r0)
            r1.mo27564(r2, r3)
            r2 = 93
            r1.m27596(r2)
            return
        L3c:
            r1.mo27547(r3)
            return
        L40:
            Yue.ۥۢۦۢۢ r2 = new Yue.ۥۢۦۢۢ
            java.lang.String r3 = "A start element must be written before a namespace"
            r2.<init>(r3)
            throw r2
    }

    @Override // Yue.C7163, Yue.InterfaceC7162
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void mo27551(java.lang.String r2, java.lang.String r3, java.lang.String r4) throws Yue.C7158 {
            r1 = this;
            java.lang.String r0 = "[[ATTRIBUTE]"
            r1.m27597(r0)
            java.lang.String r0 = ""
            r1.mo27562(r0, r2, r3)
            java.lang.String r2 = "="
            r1.m27597(r2)
            char[] r2 = r4.toCharArray()
            int r3 = r4.length()
            r4 = 1
            r0 = 0
            r1.mo27561(r2, r0, r3, r4)
            java.lang.String r2 = "]"
            r1.m27597(r2)
            return
    }

    @Override // Yue.C7163, Yue.InterfaceC7162
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void mo27552(java.lang.String r2) throws Yue.C7158 {
            r1 = this;
            java.lang.String r0 = "["
            r1.m27597(r0)
            super.mo27552(r2)
            java.lang.String r2 = "]"
            r1.m27597(r2)
            return
    }

    @Override // Yue.C7163, Yue.InterfaceC7162
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void mo27553(java.lang.String r2) throws Yue.C7158 {
            r1 = this;
            java.lang.String r0 = "["
            r1.m27597(r0)
            if (r2 == 0) goto La
            r1.m27597(r2)
        La:
            java.lang.String r2 = "]"
            r1.m27597(r2)
            return
    }

    @Override // Yue.C7163, Yue.InterfaceC7162
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void mo27554(java.lang.String r2, java.lang.String r3) throws Yue.C7158 {
            r1 = this;
            java.lang.String r0 = "[["
            r1.m27597(r0)
            r1.m27597(r3)
            java.lang.String r3 = "],["
            r1.m27597(r3)
            r1.m27597(r2)
            java.lang.String r2 = "]]"
            r1.m27597(r2)
            return
    }

    @Override // Yue.C7163, Yue.InterfaceC7162
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void mo27555(java.lang.String r2) throws Yue.C7158 {
            r1 = this;
            r1.m27583()
            java.lang.String r0 = "["
            r1.m27597(r0)
            if (r2 == 0) goto Ld
            r1.m27597(r2)
        Ld:
            java.lang.String r2 = "]"
            r1.m27597(r2)
            return
    }

    @Override // Yue.C7163, Yue.InterfaceC7162
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void mo27556() throws Yue.C7158 {
            r1 = this;
            java.lang.String r0 = "[[1.0],[utf-8]]"
            r1.m27597(r0)
            return
    }

    @Override // Yue.C5207
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public void mo19667(Yue.InterfaceC7160 r2) throws Yue.C7158 {
            r1 = this;
            int r0 = r2.mo15450()
            r1.m27563(r0)
            super.mo19667(r2)
            boolean r2 = r1.m27587()
            if (r2 != 0) goto L15
            java.lang.String r2 = ";\n"
            r1.m27597(r2)
        L15:
            return
    }

    @Override // Yue.C7163
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void mo27557() throws Yue.C7158 {
            r1 = this;
            r0 = 93
            r1.m27596(r0)
            return
    }

    @Override // Yue.C7163
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void mo27558() throws Yue.C7158 {
            r1 = this;
            java.lang.String r0 = "];\n"
            r1.m27597(r0)
            return
    }

    @Override // Yue.C7163
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void mo27559() throws Yue.C7158 {
            r1 = this;
            r0 = 91
            r1.m27596(r0)
            return
    }

    @Override // Yue.C7163
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void mo27560() throws Yue.C7158 {
            r1 = this;
            r0 = 91
            r1.m27596(r0)
            return
    }

    @Override // Yue.C7163
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public void mo27561(char[] r1, int r2, int r3, boolean r4) throws Yue.C7158 {
            r0 = this;
            if (r3 != 0) goto L8
            java.lang.String r1 = "[]"
            r0.m27597(r1)
            goto L15
        L8:
            java.lang.String r4 = "["
            r0.m27597(r4)
            r0.m27599(r1, r2, r3)
            java.lang.String r1 = "]"
            r0.m27597(r1)
        L15:
            return
    }

    @Override // Yue.C7163
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public java.lang.String mo27562(java.lang.String r3, java.lang.String r4, java.lang.String r5) throws Yue.C7158 {
            r2 = this;
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L22
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "['"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "':"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.m27597(r0)
            goto L27
        L22:
            java.lang.String r0 = "["
            r2.m27597(r0)
        L27:
            java.lang.String r3 = super.mo27562(r3, r4, r5)
            r4 = 93
            r2.m27596(r4)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public void m27563(int r2) throws Yue.C7158 {
            r1 = this;
            r1.m27583()
            r0 = 91
            r1.m27596(r0)
            java.lang.String r2 = Yue.C2107.m9935(r2)
            r1.m27597(r2)
            r2 = 93
            r1.m27596(r2)
            return
    }
}
