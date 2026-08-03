package p181m6;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p105h6.InterfaceC1623o;
import p194n6.C2901a;
import p208o6.C3066a;

/* JADX INFO: renamed from: m6.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2782a extends AbstractC1622n {

    /* JADX INFO: renamed from: b */
    public static final a f9023b = new a();

    /* JADX INFO: renamed from: a */
    public final SimpleDateFormat f9024a;

    /* JADX INFO: renamed from: m6.a$a */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public class a implements InterfaceC1623o {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p105h6.InterfaceC1623o
        /* JADX INFO: renamed from: a */
        public final AbstractC1622n mo4137a(C1614f c1614f, C2901a c2901a) {
            if (c2901a.f9368a == Date.class) {
                return new C2782a(0);
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C2782a() {
        this.f9024a = new SimpleDateFormat("MMM d, yyyy");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            c3066a.m6508l();
            return;
        }
        synchronized (this) {
            str = this.f9024a.format((java.util.Date) date);
        }
        c3066a.m6516x(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:14) call: m6.a.<init>():void type: THIS */
    public /* synthetic */ C2782a(int i9) {
        this();
    }
}
