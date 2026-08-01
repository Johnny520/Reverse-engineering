package p213o2;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o2.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC2779h {

    /* JADX INFO: renamed from: d */
    public static final C2772a f8781d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC2779h[] f8782e;

    static {
        C2772a c2772a = new C2772a();
        f8781d = c2772a;
        f8782e = new EnumC2779h[]{c2772a, new EnumC2779h() { // from class: o2.b
            @Override // p213o2.EnumC2779h
            /* JADX INFO: renamed from: b */
            public final String mo4968b(Field field) {
                return EnumC2779h.m4970c(field.getName());
            }
        }, new EnumC2779h() { // from class: o2.c
            @Override // p213o2.EnumC2779h
            /* JADX INFO: renamed from: b */
            public final String mo4968b(Field field) {
                return EnumC2779h.m4970c(EnumC2779h.m4969a(field.getName(), ' '));
            }
        }, new EnumC2779h() { // from class: o2.d
            @Override // p213o2.EnumC2779h
            /* JADX INFO: renamed from: b */
            public final String mo4968b(Field field) {
                return EnumC2779h.m4969a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new EnumC2779h() { // from class: o2.e
            @Override // p213o2.EnumC2779h
            /* JADX INFO: renamed from: b */
            public final String mo4968b(Field field) {
                return EnumC2779h.m4969a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC2779h() { // from class: o2.f
            @Override // p213o2.EnumC2779h
            /* JADX INFO: renamed from: b */
            public final String mo4968b(Field field) {
                return EnumC2779h.m4969a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC2779h() { // from class: o2.g
            @Override // p213o2.EnumC2779h
            /* JADX INFO: renamed from: b */
            public final String mo4968b(Field field) {
                return EnumC2779h.m4969a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    /* JADX INFO: renamed from: a */
    public static String m4969a(String str, char c5) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = str.charAt(i5);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c5);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m4970c(String str) {
        int length = str.length();
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char cCharAt = str.charAt(i5);
            if (!Character.isLetter(cCharAt)) {
                i5++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i5 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i5) + upperCase + str.substring(i5 + 1);
            }
        }
        return str;
    }

    public static EnumC2779h valueOf(String str) {
        return (EnumC2779h) Enum.valueOf(EnumC2779h.class, str);
    }

    public static EnumC2779h[] values() {
        return (EnumC2779h[]) f8782e.clone();
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo4968b(Field field);
}
