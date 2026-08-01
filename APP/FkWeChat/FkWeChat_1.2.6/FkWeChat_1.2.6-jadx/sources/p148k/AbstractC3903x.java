package p148k;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5109u0;

/* JADX INFO: renamed from: k.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3903x {

    /* JADX INFO: renamed from: a */
    public static final a f11363a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final AbstractC3903x f11364b = new C3904y(new C3895p0(null, null, null, null, false, null, 63, null));

    /* JADX INFO: renamed from: c */
    public static final AbstractC3903x f11365c = new C3904y(new C3895p0(null, null, null, null, true, null, 47, null));

    public /* synthetic */ AbstractC3903x(AbstractC1043k abstractC1043k) {
        this();
    }

    /* JADX INFO: renamed from: b */
    public abstract C3895p0 mo15556b();

    /* JADX INFO: renamed from: c */
    public final AbstractC3903x m15557c(AbstractC3903x abstractC3903x) {
        C3905z c3905zM15470c = abstractC3903x.mo15556b().m15470c();
        if (c3905zM15470c == null) {
            c3905zM15470c = mo15556b().m15470c();
        }
        C3887l0 c3887l0M15473f = abstractC3903x.mo15556b().m15473f();
        if (c3887l0M15473f == null) {
            c3887l0M15473f = mo15556b().m15473f();
        }
        C3888m c3888mM15468a = abstractC3903x.mo15556b().m15468a();
        if (c3888mM15468a == null) {
            c3888mM15468a = mo15556b().m15468a();
        }
        C3875f0 c3875f0M15472e = abstractC3903x.mo15556b().m15472e();
        if (c3875f0M15472e == null) {
            c3875f0M15472e = mo15556b().m15472e();
        }
        return new C3904y(new C3895p0(c3905zM15470c, c3887l0M15473f, c3888mM15468a, c3875f0M15472e, abstractC3903x.mo15556b().m15471d() || mo15556b().m15471d(), AbstractC5109u0.m20774o(mo15556b().m15469b(), abstractC3903x.mo15556b().m15469b())));
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC3903x) && AbstractC1061t.m3842c(((AbstractC3903x) obj).mo15556b(), mo15556b());
    }

    public int hashCode() {
        return mo15556b().hashCode();
    }

    public String toString() {
        if (AbstractC1061t.m3842c(this, f11364b)) {
            return "ExitTransition.None";
        }
        if (AbstractC1061t.m3842c(this, f11365c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        C3895p0 c3895p0Mo15556b = mo15556b();
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        C3905z c3905zM15470c = c3895p0Mo15556b.m15470c();
        sb2.append(c3905zM15470c != null ? c3905zM15470c.toString() : null);
        sb2.append(",\nSlide - ");
        C3887l0 c3887l0M15473f = c3895p0Mo15556b.m15473f();
        sb2.append(c3887l0M15473f != null ? c3887l0M15473f.toString() : null);
        sb2.append(",\nShrink - ");
        C3888m c3888mM15468a = c3895p0Mo15556b.m15468a();
        sb2.append(c3888mM15468a != null ? c3888mM15468a.toString() : null);
        sb2.append(",\nScale - ");
        C3875f0 c3875f0M15472e = c3895p0Mo15556b.m15472e();
        sb2.append(c3875f0M15472e != null ? c3875f0M15472e.toString() : null);
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(c3895p0Mo15556b.m15471d());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: k.x$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC3903x m15558a() {
            return AbstractC3903x.f11364b;
        }

        public a() {
        }
    }

    public AbstractC3903x() {
    }
}
