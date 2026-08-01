package p247u2;

import java.sql.Timestamp;
import java.util.Date;
import p213o2.AbstractC2770B;
import p258w2.C3390a;
import p258w2.C3391b;

/* JADX INFO: renamed from: u2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3334d extends AbstractC2770B {

    /* JADX INFO: renamed from: b */
    public static final C3333c f10373b = new C3333c();

    /* JADX INFO: renamed from: a */
    public final AbstractC2770B f10374a;

    public C3334d(AbstractC2770B abstractC2770B) {
        this.f10374a = abstractC2770B;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) {
        Date date = (Date) this.f10374a.mo4964b(c3390a);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    public final void mo4965c(C3391b c3391b, Object obj) {
        this.f10374a.mo4965c(c3391b, (Timestamp) obj);
    }
}
