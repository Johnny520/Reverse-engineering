package p000a;

import android.text.SpannableStringBuilder;
import p000a.C0430Xe;

/* JADX INFO: renamed from: a.f2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0567f2 {

    /* JADX INFO: renamed from: b */
    public static final String f2114b;

    /* JADX INFO: renamed from: c */
    public static final String f2115c;

    /* JADX INFO: renamed from: d */
    public static final C0567f2 f2116d;

    /* JADX INFO: renamed from: e */
    public static final C0567f2 f2117e;

    /* JADX INFO: renamed from: a */
    public final boolean f2118a;

    /* JADX INFO: renamed from: a.f2$a */
    public static class a {

        /* JADX INFO: renamed from: e */
        public static final byte[] f2119e = new byte[1792];

        /* JADX INFO: renamed from: a */
        public final CharSequence f2120a;

        /* JADX INFO: renamed from: b */
        public final int f2121b;

        /* JADX INFO: renamed from: c */
        public int f2122c;

        /* JADX INFO: renamed from: d */
        public char f2123d;

        static {
            for (int i = 0; i < 1792; i++) {
                f2119e[i] = Character.getDirectionality(i);
            }
        }

        public a(CharSequence charSequence) {
            this.f2120a = charSequence;
            this.f2121b = charSequence.length();
        }

        /* JADX INFO: renamed from: a */
        public final byte m1411a() {
            int i = this.f2122c - 1;
            CharSequence charSequence = this.f2120a;
            char cCharAt = charSequence.charAt(i);
            this.f2123d = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(charSequence, this.f2122c);
                this.f2122c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f2122c--;
            char c = this.f2123d;
            return c < 1792 ? f2119e[c] : Character.getDirectionality(c);
        }
    }

    static {
        C0430Xe.c cVar = C0430Xe.f1611c;
        f2114b = Character.toString((char) 8206);
        f2115c = Character.toString((char) 8207);
        f2116d = new C0567f2(false);
        f2117e = new C0567f2(true);
    }

    public C0567f2(boolean z) {
        C0430Xe.c cVar = C0430Xe.f1609a;
        this.f2118a = z;
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
    
        if (r0.f2122c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        switch(r0.m1411a()) {
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
    public static int m1408a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f2122c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = aVar.f2122c;
            if (i4 < aVar.f2121b && i == 0) {
                CharSequence charSequence2 = aVar.f2120a;
                char cCharAt = charSequence2.charAt(i4);
                aVar.f2123d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, aVar.f2122c);
                    aVar.f2122c = Character.charCount(iCodePointAt) + aVar.f2122c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.f2122c++;
                    char c = aVar.f2123d;
                    directionality = c < 1792 ? a.f2119e[c] : Character.getDirectionality(c);
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
    public static int m1409b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f2122c = aVar.f2121b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (aVar.f2122c > 0) {
                byte bM1411a = aVar.m1411a();
                if (bM1411a == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        break;
                    }
                } else if (bM1411a == 1 || bM1411a == 2) {
                    if (i != 0) {
                        if (i2 == 0) {
                            break;
                        }
                    }
                } else if (bM1411a != 9) {
                    switch (bM1411a) {
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
    public final SpannableStringBuilder m1410c(CharSequence charSequence) {
        C0430Xe.c cVar = C0430Xe.f1611c;
        if (charSequence == null) {
            return null;
        }
        boolean zM1076b = cVar.m1076b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM1076b2 = (zM1076b ? C0430Xe.f1610b : C0430Xe.f1609a).m1076b(charSequence, charSequence.length());
        String str = "";
        String str2 = f2115c;
        String str3 = f2114b;
        boolean z = this.f2118a;
        spannableStringBuilder.append((CharSequence) ((z || !(zM1076b2 || m1408a(charSequence) == 1)) ? (!z || (zM1076b2 && m1408a(charSequence) != -1)) ? "" : str2 : str3));
        if (zM1076b != z) {
            spannableStringBuilder.append(zM1076b ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM1076b3 = (zM1076b ? C0430Xe.f1610b : C0430Xe.f1609a).m1076b(charSequence, charSequence.length());
        if (!z && (zM1076b3 || m1409b(charSequence) == 1)) {
            str = str3;
        } else if (z && (!zM1076b3 || m1409b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
