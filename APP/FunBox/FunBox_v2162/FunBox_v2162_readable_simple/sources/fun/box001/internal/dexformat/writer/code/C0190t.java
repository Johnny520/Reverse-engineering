package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexformat.output.C0200b;
import fun.box001.internal.dexformat.writer.data.C0195c;

/* JADX INFO: renamed from: k.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0190t extends AbstractC0192v {

    /* JADX INFO: renamed from: a */
    private final String f697a;

    /* JADX INFO: renamed from: b */
    private final C0200b f698b;

    static {
        new C0190t("");
    }

    public C0190t(String r11) {
        if (r11 == null) goto L18;
        this.f697a = r11.intern();
        int r1 = r11.length();
        byte[] r2 = new byte[r1 * 3];
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r4 >= r1) goto L15;
        char r6 = r11.charAt(r4);
        if (r6 == 0) goto L11;
        if (r6 >= 128) goto L11;
        r2[r5] = (byte) r6;
        r5 = r5 + 1;
    L14:
        r4 = r4 + 1;
    L11:
        if (r6 >= 2048) goto L13;
        r2[r5] = (byte) (((r6 >> 6) & 31) | 192);
        r2[r5 + 1] = (byte) ((r6 & '?') | 128);
        r5 = r5 + 2;
        goto L14
    L13:
        r2[r5] = (byte) (((r6 >> '\f') & 15) | 224);
        r2[r5 + 1] = (byte) (((r6 >> 6) & 63) | 128);
        r2[r5 + 2] = (byte) ((r6 & '?') | 128);
        r5 = r5 + 3;
        goto L14
    L15:
        byte[] r112 = new byte[r5];
        System.arraycopy(r2, 0, r112, 0, r5);
        this.f698b = new C0200b(r112);
        return;
    L18:
        throw new NullPointerException("string == null");
    }

    @Override // fun.box001.internal.dexformat.output.InterfaceC0209k
    /* JADX INFO: renamed from: a */
    public final String mo107a() {
        String r0 = this.f697a;
        int r1 = r0.length();
        StringBuilder r2 = new StringBuilder((r1 * 3) / 2);
        int r4 = 0;
    L3:
        if (r4 >= r1) goto L47;
        char r5 = r0.charAt(r4);
        if (r5 < ' ') goto L13;
        if (r5 >= 127) goto L13;
        if (r5 != '\'') goto L10;
    L12:
        r2.append('\\');
    L44:
        r2.append(r5);
    L45:
        r4 = r4 + 1;
        goto L3
    L10:
        if (r5 == '\"') goto L12;
        if (r5 != '\\') goto L44;
    L13:
        if (r5 <= 127) goto L15;
        r2.append("\\u");
        r2.append(Character.forDigit(r5 >> '\f', 16));
        r2.append(Character.forDigit((r5 >> '\b') & 15, 16));
        r2.append(Character.forDigit((r5 >> 4) & 15, 16));
        r5 = Character.forDigit(r5 & 15, 16);
        goto L44
    L15:
        if (r5 != '\t') goto L17;
        String r52 = "\\t";
    L42:
        r2.append(r52);
        goto L45
    L17:
        if (r5 != '\n') goto L19;
        r52 = "\\n";
        goto L42
    L19:
        if (r5 != '\r') goto L21;
        r52 = "\\r";
        goto L42
    L21:
        if (r4 >= (r1 - 1)) goto L23;
        char r6 = r0.charAt(r4 + 1);
    L25:
        if (r6 >= '0') goto L27;
    L29:
        boolean r62 = false;
    L30:
        r2.append('\\');
        int r8 = 6;
    L31:
        if (r8 < 0) goto L37;
        char r10 = (char) (((r5 >> r8) & 7) + 48);
        if (r10 != '0') goto L35;
        if (r62 == true) goto L35;
    L36:
        r8 = r8 - 3;
    L35:
        r2.append(r10);
        r62 = true;
        goto L36
    L37:
        if (r62 == true) goto L45;
        r2.append('0');
        goto L45
    L27:
        if (r6 > '7') goto L29;
        r62 = true;
        goto L30
    L23:
        r6 = 0;
        goto L25
    L47:
        return r2.toString();
    }

    @Override // fun.box001.internal.dexformat.writer.data.InterfaceC0196d
    /* JADX INFO: renamed from: c */
    public final C0195c mo379c() {
        return C0195c.f777v;
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: e */
    protected final int mo426e(AbstractC0171a r2) {
        String r22 = ((C0190t) r2).f697a;
        return this.f697a.compareTo(r22);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C0190t) == true) goto L6;
        return false;
    L6:
        String r22 = ((C0190t) r2).f697a;
        return this.f697a.equals(r22);
    }

    @Override // fun.box001.internal.dexformat.writer.code.AbstractC0171a
    /* JADX INFO: renamed from: f */
    public final String mo427f() {
        return "utf8";
    }

    /* JADX INFO: renamed from: g */
    public final C0200b m444g() {
        return this.f698b;
    }

    /* JADX INFO: renamed from: h */
    public final String m445h() {
        return this.f697a;
    }

    public final int hashCode() {
        return this.f697a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final int m446i() {
        return this.f697a.length();
    }

    /* JADX INFO: renamed from: j */
    public final int m447j() {
        return this.f698b.m478b();
    }

    /* JADX INFO: renamed from: k */
    public final String m448k() {
        return "\"" + mo107a() + '\"';
    }

    public final String toString() {
        return "string{\"" + mo107a() + "\"}";
    }
}
