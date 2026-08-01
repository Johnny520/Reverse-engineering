package se;

import be.AbstractC1113a;
import be.AbstractC1117e;
import be.C1115c;
import java.util.Collection;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.C2363j;
import p185m8.AbstractC5112w;
import re.AbstractC6629h;
import re.AbstractC6630i;
import re.C6625d;
import re.C6626e;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: se.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7796f {

    /* JADX INFO: renamed from: a */
    public static final a f25992a = new a(null);

    /* JADX INFO: renamed from: se.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6625d m30220a(AbstractC6630i.a aVar) {
            aVar.getClass();
            if (AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3407q) || AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3399i)) {
                return null;
            }
            int iM26270e = aVar.m26270e();
            boolean zM3842c = AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3402l);
            if (zM3842c) {
                aVar = aVar.mo26266a();
            }
            boolean z10 = false;
            while (aVar.m26273h() != null && (!zM3842c || !AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3403m))) {
                if (!zM3842c) {
                    if (AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3398h)) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                    }
                    AbstractC1113a abstractC1113aMo26275j = aVar.mo26275j(1);
                    if (AbstractC6629h.f20760a.m26263c(aVar, 1) || abstractC1113aMo26275j == null) {
                        break;
                    }
                    if (!AbstractC1061t.m3842c(abstractC1113aMo26275j, AbstractC1117e.f3399i)) {
                        continue;
                    } else {
                        if (!z10) {
                            break;
                        }
                        z10 = false;
                    }
                }
                aVar = aVar.mo26266a();
            }
            if (aVar.m26273h() == null || z10) {
                return null;
            }
            return new C6625d(aVar, AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(iM26270e, aVar.m26270e() + 1), C1115c.f3366p)));
        }

        /* JADX INFO: renamed from: b */
        public final C6625d m30221b(AbstractC6630i.a aVar) {
            AbstractC1113a abstractC1113a;
            int iM26270e;
            aVar.getClass();
            if (!AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3400j)) {
                return null;
            }
            int iM26270e2 = aVar.m26270e();
            C6626e c6626e = new C6626e();
            AbstractC6630i.a aVarMo26266a = aVar.mo26266a();
            while (true) {
                AbstractC1113a abstractC1113aM26273h = aVarMo26266a.m26273h();
                abstractC1113a = AbstractC1117e.f3401k;
                if (AbstractC1061t.m3842c(abstractC1113aM26273h, abstractC1113a) || aVarMo26266a.m26273h() == null) {
                    break;
                }
                c6626e.m26254b(aVarMo26266a.m26270e());
                if (AbstractC1061t.m3842c(aVarMo26266a.m26273h(), AbstractC1117e.f3400j)) {
                    break;
                }
                aVarMo26266a = aVarMo26266a.mo26266a();
            }
            if (!AbstractC1061t.m3842c(aVarMo26266a.m26273h(), abstractC1113a) || (iM26270e = aVarMo26266a.m26270e()) == iM26270e2 + 1) {
                return null;
            }
            return new C6625d(aVarMo26266a, (Collection) AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(iM26270e2, iM26270e + 1), C1115c.f3365o)), c6626e.m26253a());
        }

        /* JADX INFO: renamed from: c */
        public final C6625d m30222c(AbstractC6630i.a aVar) {
            aVar.getClass();
            if (!AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3400j)) {
                return null;
            }
            int iM26270e = aVar.m26270e();
            C6626e c6626e = new C6626e();
            AbstractC6630i.a aVarMo26266a = aVar.mo26266a();
            int i10 = 1;
            while (aVarMo26266a.m26273h() != null && (!AbstractC1061t.m3842c(aVarMo26266a.m26273h(), AbstractC1117e.f3401k) || i10 - 1 != 0)) {
                c6626e.m26254b(aVarMo26266a.m26270e());
                if (AbstractC1061t.m3842c(aVarMo26266a.m26273h(), AbstractC1117e.f3400j)) {
                    i10++;
                }
                aVarMo26266a = aVarMo26266a.mo26266a();
            }
            if (AbstractC1061t.m3842c(aVarMo26266a.m26273h(), AbstractC1117e.f3401k)) {
                return new C6625d(aVarMo26266a, (Collection) AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(iM26270e, aVarMo26266a.m26270e() + 1), C1115c.f3368r)), c6626e.m26253a());
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public final C6625d m30223d(AbstractC6630i.a aVar) {
            AbstractC1113a abstractC1113aM26273h;
            aVar.getClass();
            if (AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3407q)) {
                return null;
            }
            int iM26270e = aVar.m26270e();
            if (AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3396f) || AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3397g)) {
                abstractC1113aM26273h = aVar.m26273h();
            } else {
                if (!AbstractC1061t.m3842c(aVar.m26273h(), AbstractC1117e.f3398h)) {
                    return null;
                }
                abstractC1113aM26273h = AbstractC1117e.f3399i;
            }
            AbstractC6630i.a aVarMo26266a = aVar.mo26266a();
            while (aVarMo26266a.m26273h() != null && !AbstractC1061t.m3842c(aVarMo26266a.m26273h(), abstractC1113aM26273h)) {
                aVarMo26266a = aVarMo26266a.mo26266a();
            }
            if (aVarMo26266a.m26273h() != null) {
                return new C6625d(aVarMo26266a, AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(iM26270e, aVarMo26266a.m26270e() + 1), C1115c.f3367q)));
            }
            return null;
        }

        public a() {
        }
    }
}
