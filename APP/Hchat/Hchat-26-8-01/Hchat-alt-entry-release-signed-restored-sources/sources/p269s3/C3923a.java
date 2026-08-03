package p269s3;

import java.util.List;
import p254r3.C3654a;
import p254r3.C3656c;
import p254r3.C3657d;

/* JADX INFO: renamed from: s3.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3923a {

    /* JADX INFO: renamed from: a */
    public C3656c f12878a;

    /* JADX INFO: renamed from: b */
    public List f12879b;

    /* JADX INFO: renamed from: c */
    public List f12880c;

    /* JADX INFO: renamed from: d */
    public boolean f12881d;

    /* JADX INFO: renamed from: e */
    public boolean f12882e;

    /* JADX INFO: renamed from: f */
    public C3654a f12883f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m8120a() {
        C3654a c3654a = this.f12883f;
        if (c3654a == null || !c3654a.f11853d.remove(this)) {
            return;
        }
        C3657d c3657d = c3654a.f11851b;
        c3657d.getClass();
        c3657d.f11859b.remove(this);
        c3657d.f11860c.remove(this);
        this.f12883f = null;
        c3657d.m7636a();
    }
}
