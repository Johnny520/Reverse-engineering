package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: jh */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2103jh {

    /* JADX INFO: renamed from: b */
    public static final EnumC2103jh f7395b;

    /* JADX INFO: renamed from: c */
    public static final EnumC2103jh f7396c;

    /* JADX INFO: renamed from: d */
    public static final EnumC2103jh[] f7397d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC2103jh[] f7398e;

    /* JADX INFO: renamed from: a */
    public final int f7399a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2103jh EF0;

    static {
        EnumC1270cm enumC1270cm = EnumC1270cm.f4319e;
        EnumC2103jh enumC2103jh = new EnumC2103jh("DOUBLE", 0, 0, 1, enumC1270cm);
        EnumC1270cm enumC1270cm2 = EnumC1270cm.f4318d;
        EnumC2103jh enumC2103jh2 = new EnumC2103jh("FLOAT", 1, 1, 1, enumC1270cm2);
        EnumC1270cm enumC1270cm3 = EnumC1270cm.f4317c;
        EnumC2103jh enumC2103jh3 = new EnumC2103jh("INT64", 2, 2, 1, enumC1270cm3);
        EnumC2103jh enumC2103jh4 = new EnumC2103jh("UINT64", 3, 3, 1, enumC1270cm3);
        EnumC1270cm enumC1270cm4 = EnumC1270cm.f4316b;
        EnumC2103jh enumC2103jh5 = new EnumC2103jh("INT32", 4, 4, 1, enumC1270cm4);
        EnumC2103jh enumC2103jh6 = new EnumC2103jh("FIXED64", 5, 5, 1, enumC1270cm3);
        EnumC2103jh enumC2103jh7 = new EnumC2103jh("FIXED32", 6, 6, 1, enumC1270cm4);
        EnumC1270cm enumC1270cm5 = EnumC1270cm.f4320f;
        EnumC2103jh enumC2103jh8 = new EnumC2103jh("BOOL", 7, 7, 1, enumC1270cm5);
        EnumC1270cm enumC1270cm6 = EnumC1270cm.f4321g;
        EnumC2103jh enumC2103jh9 = new EnumC2103jh("STRING", 8, 8, 1, enumC1270cm6);
        EnumC1270cm enumC1270cm7 = EnumC1270cm.f4324j;
        EnumC2103jh enumC2103jh10 = new EnumC2103jh("MESSAGE", 9, 9, 1, enumC1270cm7);
        EnumC1270cm enumC1270cm8 = EnumC1270cm.f4322h;
        EnumC2103jh enumC2103jh11 = new EnumC2103jh("BYTES", 10, 10, 1, enumC1270cm8);
        EnumC2103jh enumC2103jh12 = new EnumC2103jh("UINT32", 11, 11, 1, enumC1270cm4);
        EnumC1270cm enumC1270cm9 = EnumC1270cm.f4323i;
        EnumC2103jh enumC2103jh13 = new EnumC2103jh("ENUM", 12, 12, 1, enumC1270cm9);
        EnumC2103jh enumC2103jh14 = new EnumC2103jh("SFIXED32", 13, 13, 1, enumC1270cm4);
        EnumC2103jh enumC2103jh15 = new EnumC2103jh("SFIXED64", 14, 14, 1, enumC1270cm3);
        EnumC2103jh enumC2103jh16 = new EnumC2103jh("SINT32", 15, 15, 1, enumC1270cm4);
        EnumC2103jh enumC2103jh17 = new EnumC2103jh("SINT64", 16, 16, 1, enumC1270cm3);
        EnumC2103jh enumC2103jh18 = new EnumC2103jh("GROUP", 17, 17, 1, enumC1270cm7);
        EnumC2103jh enumC2103jh19 = new EnumC2103jh("DOUBLE_LIST", 18, 18, 2, enumC1270cm);
        EnumC2103jh enumC2103jh20 = new EnumC2103jh("FLOAT_LIST", 19, 19, 2, enumC1270cm2);
        EnumC2103jh enumC2103jh21 = new EnumC2103jh("INT64_LIST", 20, 20, 2, enumC1270cm3);
        EnumC2103jh enumC2103jh22 = new EnumC2103jh("UINT64_LIST", 21, 21, 2, enumC1270cm3);
        EnumC2103jh enumC2103jh23 = new EnumC2103jh("INT32_LIST", 22, 22, 2, enumC1270cm4);
        EnumC2103jh enumC2103jh24 = new EnumC2103jh("FIXED64_LIST", 23, 23, 2, enumC1270cm3);
        EnumC2103jh enumC2103jh25 = new EnumC2103jh("FIXED32_LIST", 24, 24, 2, enumC1270cm4);
        EnumC2103jh enumC2103jh26 = new EnumC2103jh("BOOL_LIST", 25, 25, 2, enumC1270cm5);
        EnumC2103jh enumC2103jh27 = new EnumC2103jh("STRING_LIST", 26, 26, 2, enumC1270cm6);
        EnumC2103jh enumC2103jh28 = new EnumC2103jh("MESSAGE_LIST", 27, 27, 2, enumC1270cm7);
        EnumC2103jh enumC2103jh29 = new EnumC2103jh("BYTES_LIST", 28, 28, 2, enumC1270cm8);
        EnumC2103jh enumC2103jh30 = new EnumC2103jh("UINT32_LIST", 29, 29, 2, enumC1270cm4);
        EnumC2103jh enumC2103jh31 = new EnumC2103jh("ENUM_LIST", 30, 30, 2, enumC1270cm9);
        EnumC2103jh enumC2103jh32 = new EnumC2103jh("SFIXED32_LIST", 31, 31, 2, enumC1270cm4);
        EnumC2103jh enumC2103jh33 = new EnumC2103jh("SFIXED64_LIST", 32, 32, 2, enumC1270cm3);
        EnumC2103jh enumC2103jh34 = new EnumC2103jh("SINT32_LIST", 33, 33, 2, enumC1270cm4);
        EnumC2103jh enumC2103jh35 = new EnumC2103jh("SINT64_LIST", 34, 34, 2, enumC1270cm3);
        EnumC2103jh enumC2103jh36 = new EnumC2103jh("DOUBLE_LIST_PACKED", 35, 35, 3, enumC1270cm);
        f7395b = enumC2103jh36;
        EnumC2103jh enumC2103jh37 = new EnumC2103jh("FLOAT_LIST_PACKED", 36, 36, 3, enumC1270cm2);
        EnumC2103jh enumC2103jh38 = new EnumC2103jh("INT64_LIST_PACKED", 37, 37, 3, enumC1270cm3);
        EnumC2103jh enumC2103jh39 = new EnumC2103jh("UINT64_LIST_PACKED", 38, 38, 3, enumC1270cm3);
        EnumC2103jh enumC2103jh40 = new EnumC2103jh("INT32_LIST_PACKED", 39, 39, 3, enumC1270cm4);
        EnumC2103jh enumC2103jh41 = new EnumC2103jh("FIXED64_LIST_PACKED", 40, 40, 3, enumC1270cm3);
        EnumC2103jh enumC2103jh42 = new EnumC2103jh("FIXED32_LIST_PACKED", 41, 41, 3, enumC1270cm4);
        EnumC2103jh enumC2103jh43 = new EnumC2103jh("BOOL_LIST_PACKED", 42, 42, 3, enumC1270cm5);
        EnumC2103jh enumC2103jh44 = new EnumC2103jh("UINT32_LIST_PACKED", 43, 43, 3, enumC1270cm4);
        EnumC2103jh enumC2103jh45 = new EnumC2103jh("ENUM_LIST_PACKED", 44, 44, 3, enumC1270cm9);
        EnumC2103jh enumC2103jh46 = new EnumC2103jh("SFIXED32_LIST_PACKED", 45, 45, 3, enumC1270cm4);
        EnumC2103jh enumC2103jh47 = new EnumC2103jh("SFIXED64_LIST_PACKED", 46, 46, 3, enumC1270cm3);
        EnumC2103jh enumC2103jh48 = new EnumC2103jh("SINT32_LIST_PACKED", 47, 47, 3, enumC1270cm4);
        EnumC2103jh enumC2103jh49 = new EnumC2103jh("SINT64_LIST_PACKED", 48, 48, 3, enumC1270cm3);
        f7396c = enumC2103jh49;
        f7398e = new EnumC2103jh[]{enumC2103jh, enumC2103jh2, enumC2103jh3, enumC2103jh4, enumC2103jh5, enumC2103jh6, enumC2103jh7, enumC2103jh8, enumC2103jh9, enumC2103jh10, enumC2103jh11, enumC2103jh12, enumC2103jh13, enumC2103jh14, enumC2103jh15, enumC2103jh16, enumC2103jh17, enumC2103jh18, enumC2103jh19, enumC2103jh20, enumC2103jh21, enumC2103jh22, enumC2103jh23, enumC2103jh24, enumC2103jh25, enumC2103jh26, enumC2103jh27, enumC2103jh28, enumC2103jh29, enumC2103jh30, enumC2103jh31, enumC2103jh32, enumC2103jh33, enumC2103jh34, enumC2103jh35, enumC2103jh36, enumC2103jh37, enumC2103jh38, enumC2103jh39, enumC2103jh40, enumC2103jh41, enumC2103jh42, enumC2103jh43, enumC2103jh44, enumC2103jh45, enumC2103jh46, enumC2103jh47, enumC2103jh48, enumC2103jh49, new EnumC2103jh("GROUP_LIST", 49, 49, 2, enumC1270cm7), new EnumC2103jh("MAP", 50, 50, 4, EnumC1270cm.f4315a)};
        EnumC2103jh[] enumC2103jhArrValues = values();
        f7397d = new EnumC2103jh[enumC2103jhArrValues.length];
        for (EnumC2103jh enumC2103jh50 : enumC2103jhArrValues) {
            f7397d[enumC2103jh50.f7399a] = enumC2103jh50;
        }
    }

    public EnumC2103jh(String str, int i, int i2, int i3, EnumC1270cm enumC1270cm) {
        this.f7399a = i2;
        int iM424v = AbstractC0213Ey.m424v(i3);
        if (iM424v == 1 || iM424v == 3) {
            enumC1270cm.getClass();
        }
        if (i3 == 1) {
            enumC1270cm.ordinal();
        }
    }

    public static EnumC2103jh valueOf(String str) {
        return (EnumC2103jh) Enum.valueOf(EnumC2103jh.class, str);
    }

    public static EnumC2103jh[] values() {
        return (EnumC2103jh[]) f7398e.clone();
    }
}
