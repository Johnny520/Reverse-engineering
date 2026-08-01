package p247u2;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.C2789r;
import p213o2.InterfaceC2771C;
import p252v2.C3352a;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: u2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3332b extends AbstractC2770B {

    /* JADX INFO: renamed from: b */
    public static final a f10371b = new a();

    /* JADX INFO: renamed from: a */
    public final SimpleDateFormat f10372a;

    /* JADX INFO: renamed from: u2.b$a */
    public class a implements InterfaceC2771C {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p213o2.InterfaceC2771C
        /* JADX INFO: renamed from: a */
        public final AbstractC2770B mo4967a(C2785n c2785n, C3352a c3352a) {
            if (c3352a.f10417a == Time.class) {
                return new C3332b(0);
            }
            return null;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: u2.b.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3332b(int i5) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        Time time;
        if (c3390a.m5630J() == 9) {
            c3390a.m5626F();
            return null;
        }
        String strM5628H = c3390a.m5628H();
        synchronized (this) {
            TimeZone timeZone = this.f10372a.getTimeZone();
            try {
                try {
                    time = new Time(this.f10372a.parse(strM5628H).getTime());
                } catch (ParseException e5) {
                    throw new C2789r("Failed parsing '" + strM5628H + "' as SQL Time; at path " + c3390a.m5646m(true), e5);
                }
            } finally {
                this.f10372a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c3391b.m5666n();
            return;
        }
        synchronized (this) {
            str = this.f10372a.format((Date) time);
        }
        c3391b.m5655E(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private C3332b() {
        this.f10372a = new SimpleDateFormat("hh:mm:ss a");
    }
}
