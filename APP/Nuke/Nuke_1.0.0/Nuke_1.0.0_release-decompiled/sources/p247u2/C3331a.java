package p247u2;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.C2789r;
import p213o2.InterfaceC2771C;
import p252v2.C3352a;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: u2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3331a extends AbstractC2770B {

    /* JADX INFO: renamed from: b */
    public static final a f10369b = new a();

    /* JADX INFO: renamed from: a */
    public final SimpleDateFormat f10370a;

    /* JADX INFO: renamed from: u2.a$a */
    public class a implements InterfaceC2771C {
        @Override // p213o2.InterfaceC2771C
        /* JADX INFO: renamed from: a */
        public final AbstractC2770B mo4967a(C2785n c2785n, C3352a c3352a) {
            if (c3352a.f10417a == Date.class) {
                return new C3331a(0);
            }
            return null;
        }
    }

    public /* synthetic */ C3331a(int i5) {
        this();
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        Date date;
        if (c3390a.m5630J() == 9) {
            c3390a.m5626F();
            return null;
        }
        String strM5628H = c3390a.m5628H();
        synchronized (this) {
            TimeZone timeZone = this.f10370a.getTimeZone();
            try {
                try {
                    date = new Date(this.f10370a.parse(strM5628H).getTime());
                } catch (ParseException e5) {
                    throw new C2789r("Failed parsing '" + strM5628H + "' as SQL Date; at path " + c3390a.m5646m(true), e5);
                }
            } finally {
                this.f10370a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c3391b.m5666n();
            return;
        }
        synchronized (this) {
            str = this.f10370a.format((java.util.Date) date);
        }
        c3391b.m5655E(str);
    }

    private C3331a() {
        this.f10370a = new SimpleDateFormat("MMM d, yyyy");
    }
}
