package p151k6;

import java.io.IOException;
import java.util.Calendar;
import p105h6.AbstractC1622n;
import p208o6.C3066a;

/* JADX INFO: renamed from: k6.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2312q0 extends AbstractC1622n {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            c3066a.m6508l();
            return;
        }
        c3066a.m6502c();
        c3066a.m6506i("year");
        c3066a.m6514u(r4.get(1));
        c3066a.m6506i("month");
        c3066a.m6514u(r4.get(2));
        c3066a.m6506i("dayOfMonth");
        c3066a.m6514u(r4.get(5));
        c3066a.m6506i("hourOfDay");
        c3066a.m6514u(r4.get(11));
        c3066a.m6506i("minute");
        c3066a.m6514u(r4.get(12));
        c3066a.m6506i("second");
        c3066a.m6514u(r4.get(13));
        c3066a.m6505h();
    }
}
