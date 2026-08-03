package p000;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: G5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0264G5 {

    /* JADX INFO: renamed from: b */
    public static final String f846b;

    /* JADX INFO: renamed from: c */
    public static final String f847c;

    /* JADX INFO: renamed from: d */
    public static final C0264G5 f848d;

    /* JADX INFO: renamed from: e */
    public static final C0264G5 f849e;

    /* JADX INFO: renamed from: a */
    public final boolean f850a;

    static {
        C1037Y5 c1037y5 = AbstractC2447rA.f8574c;
        f846b = Character.toString((char) 8206);
        f847c = Character.toString((char) 8207);
        f848d = new C0264G5(false);
        f849e = new C0264G5(true);
    }

    public C0264G5(boolean z) {
        C1037Y5 c1037y5 = AbstractC2447rA.f8572a;
        this.f850a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r0.f649c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        switch(r0.m435a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        return 0;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m548a(CharSequence charSequence) {
        byte directionality;
        C0221F5 c0221f5 = new C0221F5(charSequence);
        c0221f5.f649c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = c0221f5.f649c;
            if (i4 < c0221f5.f648b && i == 0) {
                CharSequence charSequence2 = c0221f5.f647a;
                char cCharAt = charSequence2.charAt(i4);
                c0221f5.f650d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c0221f5.f649c);
                    c0221f5.f649c = Character.charCount(iCodePointAt) + c0221f5.f649c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c0221f5.f649c++;
                    char c = c0221f5.f650d;
                    directionality = c < 1792 ? C0221F5.f646e[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        return 1;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m549b(CharSequence charSequence) {
        C0221F5 c0221f5 = new C0221F5(charSequence);
        c0221f5.f649c = c0221f5.f648b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (c0221f5.f649c > 0) {
                byte bM435a = c0221f5.m435a();
                if (bM435a == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        break;
                    }
                } else if (bM435a == 1 || bM435a == 2) {
                    if (i != 0) {
                        if (i2 == 0) {
                            break;
                        }
                    }
                } else if (bM435a != 9) {
                    switch (bM435a) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public final SpannableStringBuilder m550c(CharSequence charSequence) {
        C1037Y5 c1037y5 = AbstractC2447rA.f8574c;
        if (charSequence == null) {
            return null;
        }
        boolean zM1985c = c1037y5.m1985c(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM1985c2 = (zM1985c ? AbstractC2447rA.f8573b : AbstractC2447rA.f8572a).m1985c(charSequence, charSequence.length());
        String str = "";
        String str2 = f847c;
        String str3 = f846b;
        boolean z = this.f850a;
        spannableStringBuilder.append((CharSequence) ((z || !(zM1985c2 || m548a(charSequence) == 1)) ? (!z || (zM1985c2 && m548a(charSequence) != -1)) ? "" : str2 : str3));
        if (zM1985c != z) {
            spannableStringBuilder.append(zM1985c ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM1985c3 = (zM1985c ? AbstractC2447rA.f8573b : AbstractC2447rA.f8572a).m1985c(charSequence, charSequence.length());
        if (!z && (zM1985c3 || m549b(charSequence) == 1)) {
            str = str3;
        } else if (z && (!zM1985c3 || m549b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
