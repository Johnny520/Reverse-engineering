package p168;

import android.text.SpannableStringBuilder;
import androidx.appcompat.app.C0911;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8423 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8423 f20927;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8423 f20928;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f20929;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f20930;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f20931;

    static {
        C0911 c0911 = AbstractC8419.f20919;
        f20930 = Character.toString((char) 8206);
        f20929 = Character.toString((char) 8207);
        f20928 = new C8423(false);
        f20927 = new C8423(true);
    }

    public C8423(boolean z) {
        C0911 c0911 = AbstractC8419.f20921;
        this.f20931 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        return 1;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m13380(CharSequence charSequence) {
        C8424 c8424 = new C8424(charSequence);
        c8424.f20934 = c8424.f20935;
        int i = 0;
        while (true) {
            int i2 = i;
            while (c8424.f20934 > 0) {
                byte bM13383 = c8424.m13383();
                if (bM13383 == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        break;
                    }
                } else if (bM13383 == 1 || bM13383 == 2) {
                    if (i != 0) {
                        if (i2 == 0) {
                            break;
                        }
                    }
                } else if (bM13383 != 9) {
                    switch (bM13383) {
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

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (r0.f20934 <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        switch(r0.m13383()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        return 0;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m13381(CharSequence charSequence) {
        byte directionality;
        C8424 c8424 = new C8424(charSequence);
        c8424.f20934 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = c8424.f20934;
            if (i4 < c8424.f20935 && i == 0) {
                CharSequence charSequence2 = c8424.f20936;
                char cCharAt = charSequence2.charAt(i4);
                c8424.f20933 = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = c8424.f20934;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    c8424.f20934 = Character.charCount(iCodePointAt) + c8424.f20934;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c8424.f20934 = i5 + 1;
                    char c = c8424.f20933;
                    directionality = c < 1792 ? C8424.f20932[c] : Character.getDirectionality(c);
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final SpannableStringBuilder m13382(CharSequence charSequence) {
        C0911 c0911 = AbstractC8419.f20919;
        if (charSequence == null) {
            return null;
        }
        boolean zM746 = c0911.m746(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM7462 = (zM746 ? AbstractC8419.f20920 : AbstractC8419.f20921).m746(charSequence.length(), charSequence);
        String str = "";
        String str2 = f20929;
        String str3 = f20930;
        boolean z = this.f20931;
        spannableStringBuilder.append((CharSequence) ((z || !(zM7462 || m13381(charSequence) == 1)) ? (!z || (zM7462 && m13381(charSequence) != -1)) ? "" : str2 : str3));
        if (zM746 != z) {
            spannableStringBuilder.append(zM746 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM7463 = (zM746 ? AbstractC8419.f20920 : AbstractC8419.f20921).m746(charSequence.length(), charSequence);
        if (!z && (zM7463 || m13380(charSequence) == 1)) {
            str = str3;
        } else if (z && (!zM7463 || m13380(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
