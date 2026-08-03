package p002B;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: B.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0052b {

    /* JADX INFO: renamed from: d */
    public static final String f185d;

    /* JADX INFO: renamed from: e */
    public static final String f186e;

    /* JADX INFO: renamed from: f */
    public static final C0052b f187f;

    /* JADX INFO: renamed from: g */
    public static final C0052b f188g;

    /* JADX INFO: renamed from: a */
    public final boolean f189a;

    /* JADX INFO: renamed from: b */
    public final int f190b;

    /* JADX INFO: renamed from: c */
    public final C0057g f191c;

    static {
        C0057g c0057g = AbstractC0058h.f201c;
        f185d = Character.toString((char) 8206);
        f186e = Character.toString((char) 8207);
        f187f = new C0052b(false);
        f188g = new C0052b(true);
    }

    public C0052b(boolean z2) {
        C0057g c0057g = AbstractC0058h.f201c;
        this.f189a = z2;
        this.f190b = 2;
        this.f191c = c0057g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        if (r0.f183c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        switch(r0.m166a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return 0;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m167a(CharSequence charSequence) {
        byte directionality;
        C0051a c0051a = new C0051a(charSequence);
        c0051a.f183c = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = c0051a.f183c;
            if (i5 < c0051a.f182b && i2 == 0) {
                CharSequence charSequence2 = c0051a.f181a;
                char cCharAt = charSequence2.charAt(i5);
                c0051a.f184d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c0051a.f183c);
                    c0051a.f183c = Character.charCount(iCodePointAt) + c0051a.f183c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c0051a.f183c++;
                    char c = c0051a.f184d;
                    directionality = c < 1792 ? C0051a.f180e[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i4 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i4++;
                                i3 = -1;
                                continue;
                            case 16:
                            case 17:
                                i4++;
                                i3 = 1;
                                continue;
                            case 18:
                                i4--;
                                i3 = 0;
                                continue;
                        }
                    }
                } else if (i4 == 0) {
                }
                i2 = i4;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
    
        return 1;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m168b(CharSequence charSequence) {
        C0051a c0051a = new C0051a(charSequence);
        c0051a.f183c = c0051a.f182b;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            while (c0051a.f183c > 0) {
                byte bM166a = c0051a.m166a();
                if (bM166a != 0) {
                    if (bM166a == 1 || bM166a == 2) {
                        if (i2 != 0) {
                            if (i3 == 0) {
                                break;
                            }
                        }
                    } else if (bM166a != 9) {
                        switch (bM166a) {
                            case 14:
                            case 15:
                                if (i3 == i2) {
                                }
                                i2--;
                                break;
                            case 16:
                            case 17:
                                if (i3 == i2) {
                                }
                                i2--;
                                break;
                            case 18:
                                i2++;
                                break;
                            default:
                                if (i3 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else if (i2 != 0) {
                    if (i3 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final SpannableStringBuilder m169c(CharSequence charSequence) {
        C0057g c0057g = AbstractC0058h.f201c;
        if (charSequence == null) {
            return null;
        }
        boolean zM196b = c0057g.m196b(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = this.f190b & 2;
        String str = "";
        String str2 = f186e;
        String str3 = f185d;
        boolean z2 = this.f189a;
        if (i2 != 0) {
            boolean zM196b2 = (zM196b ? AbstractC0058h.f200b : AbstractC0058h.f199a).m196b(charSequence.length(), charSequence);
            spannableStringBuilder.append((CharSequence) ((z2 || !(zM196b2 || m167a(charSequence) == 1)) ? (!z2 || (zM196b2 && m167a(charSequence) != -1)) ? "" : str2 : str3));
        }
        if (zM196b != z2) {
            spannableStringBuilder.append(zM196b ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM196b3 = (zM196b ? AbstractC0058h.f200b : AbstractC0058h.f199a).m196b(charSequence.length(), charSequence);
        if (!z2 && (zM196b3 || m168b(charSequence) == 1)) {
            str = str3;
        } else if (z2 && (!zM196b3 || m168b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
