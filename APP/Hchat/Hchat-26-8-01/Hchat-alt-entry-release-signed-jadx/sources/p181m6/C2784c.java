package p181m6;

import java.sql.Timestamp;
import java.util.Date;
import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p105h6.InterfaceC1623o;
import p194n6.C2901a;

/* JADX INFO: renamed from: m6.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2784c implements InterfaceC1623o {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.InterfaceC1623o
    /* JADX INFO: renamed from: a */
    public final AbstractC1622n mo4137a(C1614f c1614f, C2901a c2901a) {
        if (c2901a.f9368a != Timestamp.class) {
            return null;
        }
        c1614f.getClass();
        return new C2785d(c1614f.m4130b(new C2901a(Date.class)));
    }
}
