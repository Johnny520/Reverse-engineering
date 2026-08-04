package yyds;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: yyds.ᛷᲁᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1634 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C1635 f8336 = new C1635();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final SimpleDateFormat f8337;

    /* JADX INFO: renamed from: yyds.ᛷᲁᛲᛶ$ᛲᲈᲁ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public class C1635 implements InterfaceC0652 {
        @Override // yyds.InterfaceC0652
        /* JADX INFO: renamed from: ᛲᲈᲁ */
        public final AbstractC2720 mo976(C0114 c0114, C2805 c2805) {
            if (c2805.f13682 == Time.class) {
                return new C1634(0);
            }
            return null;
        }
    }

    private C1634() {
        this.f8337 = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        Time time;
        if (c1942.m3744() == 9) {
            c1942.m3767();
            return null;
        }
        String strM3745 = c1942.m3745();
        synchronized (this) {
            TimeZone timeZone = this.f8337.getTimeZone();
            try {
                try {
                    time = new Time(this.f8337.parse(strM3745).getTime());
                } catch (ParseException e) {
                    throw new C1600("Failed parsing '" + strM3745 + "' as SQL Time; at path " + c1942.m3749(true), e);
                }
            } finally {
                this.f8337.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c1405.m2857();
            return;
        }
        synchronized (this) {
            str = this.f8337.format((Date) time);
        }
        c1405.m2852(str);
    }

    public /* synthetic */ C1634(int i) {
        this();
    }
}
