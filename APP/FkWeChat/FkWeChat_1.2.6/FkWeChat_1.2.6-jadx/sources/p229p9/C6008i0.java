package p229p9;

import java.util.List;
import java.util.Map;
import p185m8.AbstractC5109u0;
import p213oa.C5695f;

/* JADX INFO: renamed from: p9.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6008i0 extends AbstractC6033q1 {

    /* JADX INFO: renamed from: a */
    public final List f18960a;

    /* JADX INFO: renamed from: b */
    public final Map f18961b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6008i0(List list) {
        super(null);
        list.getClass();
        this.f18960a = list;
        this.f18961b = AbstractC5109u0.m20778s(m24015c());
    }

    @Override // p229p9.AbstractC6033q1
    /* JADX INFO: renamed from: a */
    public boolean mo23989a(C5695f c5695f) {
        c5695f.getClass();
        return this.f18961b.containsKey(c5695f);
    }

    /* JADX INFO: renamed from: c */
    public List m24015c() {
        return this.f18960a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + m24015c() + ')';
    }
}
