package p046Z;

import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p022L.AbstractC0174d;
import p037T.AbstractC0274y;
import p037T.C0265p;
import p042W.C0329a;
import p051b0.C0493b;
import p051b0.C0494c;

/* JADX INFO: renamed from: Z.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0358a extends AbstractC0274y {

    /* JADX INFO: renamed from: c */
    public static final C0329a f835c = new C0329a(3);

    /* JADX INFO: renamed from: d */
    public static final C0329a f836d = new C0329a(4);

    /* JADX INFO: renamed from: e */
    public static final C0329a f837e = new C0329a(5);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f838a;

    /* JADX INFO: renamed from: b */
    public final Object f839b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0358a(int i2) {
        this.f838a = i2;
        switch (i2) {
            case 1:
                this.f839b = new SimpleDateFormat("hh:mm:ss a");
                break;
            default:
                this.f839b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: a */
    public final Object mo476a(C0493b c0493b) {
        Date date;
        Time time;
        switch (this.f838a) {
            case 0:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                String strMo584v = c0493b.mo584v();
                try {
                    synchronized (this) {
                        date = ((SimpleDateFormat) this.f839b).parse(strMo584v);
                        break;
                    }
                    return new java.sql.Date(date.getTime());
                } catch (ParseException e2) {
                    StringBuilder sbM357m = AbstractC0174d.m357m("Failed parsing '", strMo584v, "' as SQL Date; at path ");
                    sbM357m.append(c0493b.mo576j());
                    throw new C0265p(sbM357m.toString(), e2);
                }
            case 1:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                String strMo584v2 = c0493b.mo584v();
                try {
                    synchronized (this) {
                        time = new Time(((SimpleDateFormat) this.f839b).parse(strMo584v2).getTime());
                        break;
                    }
                    return time;
                } catch (ParseException e3) {
                    StringBuilder sbM357m2 = AbstractC0174d.m357m("Failed parsing '", strMo584v2, "' as SQL Time; at path ");
                    sbM357m2.append(c0493b.mo576j());
                    throw new C0265p(sbM357m2.toString(), e3);
                }
            default:
                Date date2 = (Date) ((AbstractC0274y) this.f839b).mo476a(c0493b);
                if (date2 != null) {
                    return new Timestamp(date2.getTime());
                }
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: b */
    public final void mo477b(C0494c c0494c, Object obj) throws IOException {
        String str;
        String str2;
        switch (this.f838a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    c0494c.mo591i();
                    return;
                }
                synchronized (this) {
                    str = ((SimpleDateFormat) this.f839b).format((Date) date);
                    break;
                }
                c0494c.mo596p(str);
                return;
            case 1:
                Time time = (Time) obj;
                if (time == null) {
                    c0494c.mo591i();
                    return;
                }
                synchronized (this) {
                    str2 = ((SimpleDateFormat) this.f839b).format((Date) time);
                    break;
                }
                c0494c.mo596p(str2);
                return;
            default:
                ((AbstractC0274y) this.f839b).mo477b(c0494c, (Timestamp) obj);
                return;
        }
    }

    public C0358a(AbstractC0274y abstractC0274y) {
        this.f838a = 2;
        this.f839b = abstractC0274y;
    }
}
