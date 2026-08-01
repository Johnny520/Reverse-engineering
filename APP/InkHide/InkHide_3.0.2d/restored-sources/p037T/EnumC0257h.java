package p037T;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: T.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC0257h {

    /* JADX INFO: renamed from: a */
    public static final C0250a f606a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0257h[] f607b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0250a c0250a = new C0250a();
        f606a = c0250a;
        f607b = new EnumC0257h[]{c0250a, new EnumC0257h() { // from class: T.b
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p037T.EnumC0257h
            /* JADX INFO: renamed from: b */
            public final String mo471b(Field field) {
                return EnumC0257h.m473c(field.getName());
            }
        }, new EnumC0257h() { // from class: T.c
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p037T.EnumC0257h
            /* JADX INFO: renamed from: b */
            public final String mo471b(Field field) {
                return EnumC0257h.m473c(EnumC0257h.m472a(field.getName(), ' '));
            }
        }, new EnumC0257h() { // from class: T.d
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p037T.EnumC0257h
            /* JADX INFO: renamed from: b */
            public final String mo471b(Field field) {
                return EnumC0257h.m472a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new EnumC0257h() { // from class: T.e
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p037T.EnumC0257h
            /* JADX INFO: renamed from: b */
            public final String mo471b(Field field) {
                return EnumC0257h.m472a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC0257h() { // from class: T.f
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p037T.EnumC0257h
            /* JADX INFO: renamed from: b */
            public final String mo471b(Field field) {
                return EnumC0257h.m472a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC0257h() { // from class: T.g
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p037T.EnumC0257h
            /* JADX INFO: renamed from: b */
            public final String mo471b(Field field) {
                return EnumC0257h.m472a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m472a(String str, char c2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m473c(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (!Character.isLetter(cCharAt)) {
                i2++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i2 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0257h valueOf(String str) {
        return (EnumC0257h) Enum.valueOf(EnumC0257h.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0257h[] values() {
        return (EnumC0257h[]) f607b.clone();
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo471b(Field field);
}
