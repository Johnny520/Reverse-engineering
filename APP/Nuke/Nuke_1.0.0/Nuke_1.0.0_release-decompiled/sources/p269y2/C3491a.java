package p269y2;

import java.util.List;
import java.util.Map;
import p000A.C0045X;
import p025E2.AbstractC0284d;
import p056K2.C0882h;
import p061L2.AbstractC0984x;
import p117X2.AbstractC1665j;
import p275z2.AbstractC3517c;
import p275z2.C3516b;

/* JADX INFO: renamed from: y2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3491a extends AbstractC3517c {

    /* JADX INFO: renamed from: g */
    public Class f10868g;

    @Override // p275z2.AbstractC3517c
    /* JADX INFO: renamed from: a */
    public final Map mo5749a() {
        return AbstractC0984x.m2036H(super.mo5749a(), AbstractC0984x.m2035G(new C0882h("isEnumConstant", null), new C0882h("isEnumConstantNot", null), new C0882h("type", this.f10868g), new C0882h("typeCondition", null), new C0882h("genericType", null), new C0882h("genericTypeCondition", null)));
    }

    /* JADX INFO: renamed from: b */
    public final List m5750b() {
        C3516b c3516b = this.f10964a;
        if (c3516b == null) {
            throw new IllegalArgumentException("You must provide a configuration to resolve the member use build(configuration).");
        }
        List listM501o = AbstractC0284d.m501o(this, c3516b, c3516b.f10961a, new C0045X(3, this, c3516b));
        AbstractC1665j.m2983c(listM501o, "null cannot be cast to non-null type kotlin.collections.List<R of com.highcapable.kavaref.resolver.processor.MemberProcessor.resolve>");
        return listM501o;
    }
}
