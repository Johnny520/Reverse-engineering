package p313v9;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import p024b9.AbstractC1061t;
import p081fa.InterfaceC2374c0;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5114x;
import p254r5.C6502h0;
import p313v9.AbstractC8864e0;

/* JADX INFO: renamed from: v9.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8870h0 extends AbstractC8864e0 implements InterfaceC2374c0 {

    /* JADX INFO: renamed from: b */
    public final WildcardType f29443b;

    /* JADX INFO: renamed from: c */
    public final Collection f29444c;

    /* JADX INFO: renamed from: d */
    public final boolean f29445d;

    public C8870h0(WildcardType wildcardType) {
        wildcardType.getClass();
        this.f29443b = wildcardType;
        this.f29444c = AbstractC5114x.m20800o();
    }

    @Override // p081fa.InterfaceC2374c0
    /* JADX INFO: renamed from: M */
    public boolean mo8602M() {
        mo34021U().getUpperBounds().getClass();
        return !AbstractC1061t.m3842c(AbstractC5106t.m20720Z(r0), Object.class);
    }

    @Override // p081fa.InterfaceC2374c0
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public AbstractC8864e0 mo8601F() {
        Type[] upperBounds = mo34021U().getUpperBounds();
        Type[] lowerBounds = mo34021U().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            C6502h0.m25770a("Wildcard types with many bounds are not yet supported: ", mo34021U());
            return null;
        }
        if (lowerBounds.length == 1) {
            AbstractC8864e0.a aVar = AbstractC8864e0.f29430a;
            Object objM20686G0 = AbstractC5106t.m20686G0(lowerBounds);
            objM20686G0.getClass();
            return aVar.m34024a((Type) objM20686G0);
        }
        if (upperBounds.length == 1) {
            Type type = (Type) AbstractC5106t.m20686G0(upperBounds);
            if (!AbstractC1061t.m3842c(type, Object.class)) {
                AbstractC8864e0.a aVar2 = AbstractC8864e0.f29430a;
                type.getClass();
                return aVar2.m34024a(type);
            }
        }
        return null;
    }

    @Override // p313v9.AbstractC8864e0
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public WildcardType mo34021U() {
        return this.f29443b;
    }

    @Override // p081fa.InterfaceC2375d
    public Collection getAnnotations() {
        return this.f29444c;
    }

    @Override // p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: k */
    public boolean mo8604k() {
        return this.f29445d;
    }
}
