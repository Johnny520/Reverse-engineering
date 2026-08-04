package yyds;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: yyds.ᲁᛱᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2167 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C2167 f10636;

    static {
        AbstractC2328.m4341(-534482483053422L);
        f10636 = new C2167();
        Integer.parseInt(AbstractC2328.m4341(-534495367955310L));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static String m4131(int i) {
        int i2 = i / 1000;
        int i3 = i2 / 60;
        return AbstractC2104.m4000(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2 % 60)}, 2, AbstractC2328.m4341(-534293504492398L), -534336454165358L);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static String m4132(Number number, String str) {
        AbstractC2328.m4341(-534160360506222L);
        if (number == null) {
            return AbstractC2328.m4341(-534194720244590L);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        return number.toString().length() == 13 ? simpleDateFormat.format(new Date(number.longValue())) : simpleDateFormat.format(new Date(number.longValue() * 1000));
    }
}
