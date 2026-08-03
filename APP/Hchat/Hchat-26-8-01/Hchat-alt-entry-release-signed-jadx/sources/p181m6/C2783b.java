package p181m6;

import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p105h6.InterfaceC1623o;
import p194n6.C2901a;
import p208o6.C3066a;

/* JADX INFO: renamed from: m6.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2783b extends AbstractC1622n {

    /* JADX INFO: renamed from: b */
    public static final a f9025b = new a();

    /* JADX INFO: renamed from: a */
    public final SimpleDateFormat f9026a;

    /* JADX INFO: renamed from: m6.b$a */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public class a implements InterfaceC1623o {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p105h6.InterfaceC1623o
        /* JADX INFO: renamed from: a */
        public final AbstractC1622n mo4137a(C1614f c1614f, C2901a c2901a) {
            if (c2901a.f9368a == Time.class) {
                return new C2783b(0);
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C2783b() {
        this.f9026a = new SimpleDateFormat("hh:mm:ss a");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c3066a.m6508l();
            return;
        }
        synchronized (this) {
            str = this.f9026a.format((Date) time);
        }
        c3066a.m6516x(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:14) call: m6.b.<init>():void type: THIS */
    public /* synthetic */ C2783b(int i9) {
        this();
    }
}
