package Yue;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: Yue.ۥۡۦۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.ANNOTATION_TYPE})
@InterfaceC7470(version = "1.3")
@InterfaceC7157(EnumC3259.f5012)
@Retention(RetentionPolicy.CLASS)
@InterfaceC7722(allowedTargets = {EnumC3260.f5017})
public @interface InterfaceC7117 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Yue.ۥۡۦۥۧ$ۥ */
    public static final class EnumC1174 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final EnumC1174 f21476 = new EnumC1174("WARNING", 0);

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final EnumC1174 f21477 = new EnumC1174("ERROR", 1);

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final /* synthetic */ EnumC1174[] f21478;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final /* synthetic */ InterfaceC4654 f21479;

        static {
            EnumC1174[] enumC1174ArrM3405 = m3405();
            f21478 = enumC1174ArrM3405;
            f21479 = C4655.m1607(enumC1174ArrM3405);
        }

        public EnumC1174(String str, int i) {
        }

        public static EnumC1174 valueOf(String str) {
            return (EnumC1174) Enum.valueOf(EnumC1174.class, str);
        }

        public static EnumC1174[] values() {
            return (EnumC1174[]) f21478.clone();
        }

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ EnumC1174[] m3405() {
            return new EnumC1174[]{f21476, f21477};
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static InterfaceC4654<EnumC1174> m22228() {
            return f21479;
        }
    }

    EnumC1174 level() default EnumC1174.f21477;

    String message() default "";
}
