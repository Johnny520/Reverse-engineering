package p151k6;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p194n6.C2901a;
import p208o6.C3066a;

/* JADX INFO: renamed from: k6.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2327y extends AbstractC1622n {

    /* JADX INFO: renamed from: a */
    public final C1614f f7654a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1622n f7655b;

    /* JADX INFO: renamed from: c */
    public final Type f7656c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2327y(C1614f c1614f, AbstractC1622n abstractC1622n, Type type) {
        this.f7654a = c1614f;
        this.f7655b = abstractC1622n;
        this.f7656c = type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4127b(C3066a c3066a, Object obj) {
        AbstractC1622n abstractC1622nMo4128c;
        Type type = this.f7656c;
        Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
        AbstractC1622n abstractC1622n = this.f7655b;
        if (type2 != type) {
            AbstractC1622n abstractC1622nM4130b = this.f7654a.m4130b(new C2901a(type2));
            if (abstractC1622nM4130b instanceof AbstractC2315s) {
                AbstractC1622n abstractC1622n2 = abstractC1622n;
                while ((abstractC1622n2 instanceof AbstractC2325x) && (abstractC1622nMo4128c = ((AbstractC2325x) abstractC1622n2).mo4128c()) != abstractC1622n2) {
                    abstractC1622n2 = abstractC1622nMo4128c;
                }
                if (abstractC1622n2 instanceof AbstractC2315s) {
                }
            } else {
                abstractC1622n = abstractC1622nM4130b;
            }
        }
        abstractC1622n.mo4127b(c3066a, obj);
    }
}
