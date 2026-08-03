package p002B;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: B.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0052b {

    /* JADX INFO: renamed from: d */
    public static final String f185d = null;

    /* JADX INFO: renamed from: e */
    public static final String f186e = null;

    /* JADX INFO: renamed from: f */
    public static final C0052b f187f = null;

    /* JADX INFO: renamed from: g */
    public static final C0052b f188g = null;

    /* JADX INFO: renamed from: a */
    public final boolean f189a;

    /* JADX INFO: renamed from: b */
    public final int f190b;

    /* JADX INFO: renamed from: c */
    public final C0057g f191c;

    static {
        C0057g r02 = AbstractC0058h.f201c;
        f185d = Character.toString(8206);
        f186e = Character.toString(8207);
        f187f = new C0052b(false);
        f188g = new C0052b(true);
    }

    public C0052b(boolean r2) {
        C0057g r02 = AbstractC0058h.f201c;
        this.f189a = r2;
        this.f190b = 2;
        this.f191c = r02;
    }

    /* JADX INFO: renamed from: a */
    public static int m167a(CharSequence r9) {
        C0051a r02 = new C0051a(r9);
        r02.f183c = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L3:
        int r4 = r02.f183c;
        if (r4 >= r02.f182b) goto L29;
        if (r1 != 0) goto L29;
        CharSequence r5 = r02.f181a;
        char r42 = r5.charAt(r4);
        r02.f184d = r42;
        if (Character.isHighSurrogate(r42) == false) goto L9;
        int r43 = Character.codePointAt(r5, r02.f183c);
        r02.f183c = Character.charCount(r43) + r02.f183c;
        byte r44 = Character.getDirectionality(r43);
    L13:
        if (r44 == 0) goto L26;
        if (r44 == 1) goto L24;
        if (r44 == 2) goto L24;
        if (r44 == 9) goto L3;
        switch(r44) {
            case 14: goto L23;
            case 15: goto L23;
            case 16: goto L22;
            case 17: goto L22;
            case 18: goto L21;
            default: goto L28;
        };
    L22:
        r3 = r3 + 1;
        r2 = 1;
        goto L3
    L23:
        r3 = r3 + 1;
        r2 = -1;
    L28:
        r1 = r3;
        goto L3
    L21:
        r3 = r3 - 1;
        r2 = 0;
    L24:
        if (r3 != 0) goto L28;
    L44:
        return 1;
    L26:
        if (r3 != 0) goto L28;
    L73:
        return -1;
    L9:
        r02.f183c++;
        char r45 = r02.f184d;
        if (r45 >= 1792) goto L12;
        r44 = C0051a.f180e[r45];
        goto L13
    L12:
        r44 = Character.getDirectionality(r45);
    L29:
        if (r1 == 0) goto L75;
        if (r2 == 0) goto L34;
        return r2;
    L34:
        if (r02.f183c <= 0) goto L76;
        switch(r02.m166a()) {
            case 14: goto L42;
            case 15: goto L42;
            case 16: goto L39;
            case 17: goto L39;
            case 18: goto L38;
            default: goto L34;
        };
    L38:
        r3 = r3 + 1;
        goto L34
    L39:
        if (r1 == r3) goto L44;
    L41:
        r3 = r3 - 1;
        goto L34
    L42:
        if (r1 != r3) goto L41;
    L76:
        return 0;
    L75:
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m168b(CharSequence r7) {
        C0051a r02 = new C0051a(r7);
        r02.f183c = r02.f182b;
        int r1 = 0;
    L3:
        int r2 = r1;
    L5:
        if (r02.f183c <= 0) goto L59;
        byte r3 = r02.m166a();
        if (r3 != 0) goto L9;
        if (r1 == 0) goto L58;
        if (r2 != 0) goto L5;
    L58:
        return -1;
    L9:
        if (r3 == 1) goto L23;
        if (r3 == 2) goto L23;
        if (r3 == 9) goto L5;
        switch(r3) {
            case 14: goto L21;
            case 15: goto L21;
            case 16: goto L18;
            case 17: goto L18;
            case 18: goto L17;
            default: goto L15;
        };
    L17:
        r1 = r1 + 1;
        goto L5
    L18:
        if (r2 == r1) goto L31;
    L20:
        r1 = r1 - 1;
    L31:
        return 1;
    L21:
        if (r2 != r1) goto L20;
    L15:
        if (r2 != 0) goto L5;
    L23:
        if (r1 == 0) goto L31;
        if (r2 != 0) goto L5;
    L59:
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final SpannableStringBuilder m169c(CharSequence r11) {
        C0057g r02 = AbstractC0058h.f201c;
        if (r11 != null) goto L6;
        return null;
    L6:
        boolean r03 = r02.m196b(r11.length(), r11);
        SpannableStringBuilder r1 = new SpannableStringBuilder();
        int r2 = this.f190b & 2;
        String r3 = "";
        String r4 = f186e;
        String r6 = f185d;
        boolean r8 = this.f189a;
        if (r2 == 0) goto L24;
        if (r03 == false) goto L10;
        C0057g r22 = AbstractC0058h.f200b;
    L11:
        boolean r23 = r22.m196b(r11.length(), r11);
        if (r8 == true) goto L17;
        if (r23 == false) goto L15;
    L16:
        String r24 = r6;
    L23:
        r1.append(r24);
        goto L24
    L15:
        if (m167a(r11) == 1) goto L16;
    L17:
        if (r8 == false) goto L22;
        if (r23 == true) goto L20;
    L21:
        r24 = r4;
        goto L23
    L20:
        if (m167a(r11) == (-1)) goto L21;
    L22:
        r24 = "";
        goto L23
    L10:
        r22 = AbstractC0058h.f199a;
    L24:
        if (r03 == r8) goto L29;
        if (r03 == false) goto L27;
        char r25 = 8235;
    L28:
        r1.append(r25);
        r1.append(r11);
        r1.append(8236);
    L30:
        if (r03 == false) goto L32;
        C0057g r04 = AbstractC0058h.f200b;
    L33:
        boolean r05 = r04.m196b(r11.length(), r11);
        if (r8 == true) goto L39;
        if (r05 == false) goto L37;
    L38:
        r3 = r6;
    L44:
        r1.append(r3);
        return r1;
    L37:
        if (m168b(r11) == 1) goto L38;
    L39:
        if (r8 == false) goto L44;
        if (r05 == true) goto L42;
    L43:
        r3 = r4;
        goto L44
    L42:
        if (m168b(r11) != (-1)) goto L44;
    L32:
        r04 = AbstractC0058h.f199a;
        goto L33
    L27:
        r25 = 8234;
        goto L28
    L29:
        r1.append(r11);
        goto L30
    }
}
