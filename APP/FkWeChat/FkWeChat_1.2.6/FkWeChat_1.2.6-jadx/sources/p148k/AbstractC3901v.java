package p148k;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5109u0;

/* JADX INFO: renamed from: k.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3901v {

    /* JADX INFO: renamed from: a */
    public static final a f11360a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final AbstractC3901v f11361b = new C3902w(new C3895p0(null, null, null, null, false, null, 63, null));

    public /* synthetic */ AbstractC3901v(AbstractC1043k abstractC1043k) {
        this();
    }

    /* JADX INFO: renamed from: b */
    public abstract C3895p0 mo15552b();

    /* JADX INFO: renamed from: c */
    public final AbstractC3901v m15553c(AbstractC3901v abstractC3901v) {
        C3905z c3905zM15470c = abstractC3901v.mo15552b().m15470c();
        if (c3905zM15470c == null) {
            c3905zM15470c = mo15552b().m15470c();
        }
        C3887l0 c3887l0M15473f = abstractC3901v.mo15552b().m15473f();
        if (c3887l0M15473f == null) {
            c3887l0M15473f = mo15552b().m15473f();
        }
        C3888m c3888mM15468a = abstractC3901v.mo15552b().m15468a();
        if (c3888mM15468a == null) {
            c3888mM15468a = mo15552b().m15468a();
        }
        C3875f0 c3875f0M15472e = abstractC3901v.mo15552b().m15472e();
        if (c3875f0M15472e == null) {
            c3875f0M15472e = mo15552b().m15472e();
        }
        return new C3902w(new C3895p0(c3905zM15470c, c3887l0M15473f, c3888mM15468a, c3875f0M15472e, false, AbstractC5109u0.m20774o(mo15552b().m15469b(), abstractC3901v.mo15552b().m15469b()), 16, null));
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC3901v) && AbstractC1061t.m3842c(((AbstractC3901v) obj).mo15552b(), mo15552b());
    }

    public int hashCode() {
        return mo15552b().hashCode();
    }

    public String toString() {
        if (AbstractC1061t.m3842c(this, f11361b)) {
            return "EnterTransition.None";
        }
        C3895p0 c3895p0Mo15552b = mo15552b();
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        C3905z c3905zM15470c = c3895p0Mo15552b.m15470c();
        sb2.append(c3905zM15470c != null ? c3905zM15470c.toString() : null);
        sb2.append(",\nSlide - ");
        C3887l0 c3887l0M15473f = c3895p0Mo15552b.m15473f();
        sb2.append(c3887l0M15473f != null ? c3887l0M15473f.toString() : null);
        sb2.append(",\nShrink - ");
        C3888m c3888mM15468a = c3895p0Mo15552b.m15468a();
        sb2.append(c3888mM15468a != null ? c3888mM15468a.toString() : null);
        sb2.append(",\nScale - ");
        C3875f0 c3875f0M15472e = c3895p0Mo15552b.m15472e();
        sb2.append(c3875f0M15472e != null ? c3875f0M15472e.toString() : null);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: k.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC3901v m15554a() {
            return AbstractC3901v.f11361b;
        }

        public a() {
        }
    }

    public AbstractC3901v() {
    }
}
