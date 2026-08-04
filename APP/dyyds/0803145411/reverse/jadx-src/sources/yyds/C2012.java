package yyds;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: renamed from: yyds.ᲀᛵᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2012 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C2013 f10071 = new C2013();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final SimpleDateFormat f10072;

    /* JADX INFO: renamed from: yyds.ᲀᛵᲀᛳ$ᛲᲈᲁ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public class C2013 implements InterfaceC0652 {
        @Override // yyds.InterfaceC0652
        /* JADX INFO: renamed from: ᛲᲈᲁ */
        public final AbstractC2720 mo976(C0114 c0114, C2805 c2805) {
            if (c2805.f13682 == Date.class) {
                return new C2012(0);
            }
            return null;
        }
    }

    private C2012() {
        this.f10072 = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        Date date;
        if (c1942.m3744() == 9) {
            c1942.m3767();
            return null;
        }
        String strM3745 = c1942.m3745();
        synchronized (this) {
            TimeZone timeZone = this.f10072.getTimeZone();
            try {
                try {
                    date = new Date(this.f10072.parse(strM3745).getTime());
                } catch (ParseException e) {
                    throw new C1600("Failed parsing '" + strM3745 + "' as SQL Date; at path " + c1942.m3749(true), e);
                }
            } finally {
                this.f10072.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c1405.m2857();
            return;
        }
        synchronized (this) {
            str = this.f10072.format((java.util.Date) date);
        }
        c1405.m2852(str);
    }

    public /* synthetic */ C2012(int i) {
        this();
    }
}
