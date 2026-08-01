package bsh;

/* JADX INFO: renamed from: bsh.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1274w extends AbstractC1195i4 {

    /* JADX INFO: renamed from: z */
    public static volatile boolean f3851z = true;

    /* JADX INFO: renamed from: y */
    public Object f3852y;

    public C1274w(int i10) {
        super(i10);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ String mo4038a() {
        return super.mo4038a();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void add(InterfaceC1188h3 interfaceC1188h3) {
        super.add(interfaceC1188h3);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ void mo4040e() {
        super.mo4040e();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 next() {
        return super.next();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 previous() {
        return super.previous();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    public /* bridge */ /* synthetic */ int getLineNumber() {
        return super.getLineNumber();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    public /* bridge */ /* synthetic */ String getText() {
        return super.getText();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ void set(InterfaceC1188h3 interfaceC1188h3) {
        super.set(interfaceC1188h3);
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ boolean hasNext() {
        return super.hasNext();
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator
    public /* bridge */ /* synthetic */ boolean hasPrevious() {
        return super.hasPrevious();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ String mo4044i(String str) {
        return super.mo4044i(str);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void mo4045j(InterfaceC1188h3 interfaceC1188h3, int i10) {
        super.mo4045j(interfaceC1188h3, i10);
    }

    /* JADX INFO: renamed from: k */
    public void m5163k(String str) {
        int length = str.toCharArray().length;
        if (length == 0 || length > 4 || (length > 1 && str.charAt(0) != '\\')) {
            m5165o(str);
            return;
        }
        try {
            char cCharAt = str.charAt(0);
            if (cCharAt == '\\') {
                char cCharAt2 = str.charAt(1);
                if (Character.isDigit(cCharAt2)) {
                    cCharAt = (char) Integer.parseInt(str.substring(1), 8);
                    if (255 < cCharAt) {
                        m5165o(str);
                        return;
                    }
                } else {
                    cCharAt = m5164l(cCharAt2);
                }
            }
            this.f3852y = new Primitive(cCharAt);
        } catch (Exception unused) {
            m5165o(str);
        }
    }

    /* JADX INFO: renamed from: l */
    public final char m5164l(char c10) {
        if (c10 == 'b') {
            return '\b';
        }
        if (c10 == 'f') {
            return '\f';
        }
        if (c10 == 'n') {
            return '\n';
        }
        if (c10 == 'r') {
            return '\r';
        }
        if (c10 != 't') {
            return c10;
        }
        return '\t';
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ void mo4046m(InterfaceC1188h3 interfaceC1188h3) {
        super.mo4046m(interfaceC1188h3);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void mo4047n(String str) {
        super.mo4047n(str);
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator
    public /* bridge */ /* synthetic */ int nextIndex() {
        return super.nextIndex();
    }

    /* JADX INFO: renamed from: o */
    public void m5165o(String str) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\\') {
                int i11 = i10 + 1;
                char cCharAt2 = str.charAt(i11);
                if (!Character.isDigit(cCharAt2) || Integer.parseInt(String.valueOf(cCharAt2)) >= 8) {
                    cCharAt = m5164l(cCharAt2);
                    i10 = i11;
                } else {
                    int iMin = Math.min(i10 + 3, length - 1);
                    int i12 = i11;
                    while (i12 < iMin) {
                        int i13 = i12 + 1;
                        char cCharAt3 = str.charAt(i13);
                        if (!Character.isDigit(cCharAt3) || Integer.parseInt(String.valueOf(cCharAt3)) >= 8) {
                            break;
                        } else {
                            i12 = i13;
                        }
                    }
                    String strSubstring = str.substring(i11, i12 + 1);
                    if (strSubstring.length() != 3 || Integer.parseInt(String.valueOf(cCharAt2)) <= 3) {
                        cCharAt = (char) Integer.parseInt(strSubstring, 8);
                        i10 = i12;
                    } else {
                        i10 = i12 - 1;
                        cCharAt = (char) Integer.parseInt(str.substring(i11, i12), 8);
                    }
                }
            }
            sb2.append(cCharAt);
            i10++;
        }
        String string = sb2.toString();
        if (f3851z) {
            string = string.intern();
        }
        this.f3852y = string;
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) {
        return this.f3852y;
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator
    public /* bridge */ /* synthetic */ int previousIndex() {
        return super.previousIndex();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ InterfaceC1188h3[] mo4049q() {
        return super.mo4049q();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: r */
    public /* bridge */ /* synthetic */ int mo4050r() {
        return super.mo4050r();
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 mo4051s(int i10) {
        return super.mo4051s(i10);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: t */
    public /* bridge */ /* synthetic */ void mo4052t() {
        super.mo4052t();
    }

    @Override // bsh.AbstractC1195i4
    public String toString() {
        return super.toString() + ": " + this.f3852y;
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ void mo4053u(String str) {
        super.mo4053u(str);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: w */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 mo4054w() {
        return super.mo4054w();
    }
}
