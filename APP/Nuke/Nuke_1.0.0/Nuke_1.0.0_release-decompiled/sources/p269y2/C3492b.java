package p269y2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p000A.C0045X;
import p025E2.AbstractC0284d;
import p056K2.C0882h;
import p061L2.AbstractC0984x;
import p117X2.AbstractC1665j;
import p275z2.AbstractC3517c;
import p275z2.C3516b;

/* JADX INFO: renamed from: y2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3492b extends AbstractC3517c {

    /* JADX INFO: renamed from: A */
    public Class f10869A;

    /* JADX INFO: renamed from: g */
    public final ArrayList f10870g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final ArrayList f10871h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final LinkedHashSet f10872i = new LinkedHashSet();

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f10873j = new LinkedHashSet();

    /* JADX INFO: renamed from: k */
    public final LinkedHashSet f10874k = new LinkedHashSet();

    /* JADX INFO: renamed from: l */
    public final LinkedHashSet f10875l = new LinkedHashSet();

    /* JADX INFO: renamed from: m */
    public final LinkedHashSet f10876m = new LinkedHashSet();

    /* JADX INFO: renamed from: n */
    public final LinkedHashSet f10877n = new LinkedHashSet();

    /* JADX INFO: renamed from: o */
    public final LinkedHashSet f10878o = new LinkedHashSet();

    /* JADX INFO: renamed from: p */
    public final LinkedHashSet f10879p = new LinkedHashSet();

    /* JADX INFO: renamed from: q */
    public final ArrayList f10880q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public final ArrayList f10881r = new ArrayList();

    /* JADX INFO: renamed from: s */
    public final LinkedHashSet f10882s = new LinkedHashSet();

    /* JADX INFO: renamed from: t */
    public final LinkedHashSet f10883t = new LinkedHashSet();

    /* JADX INFO: renamed from: u */
    public final LinkedHashSet f10884u = new LinkedHashSet();

    /* JADX INFO: renamed from: v */
    public final LinkedHashSet f10885v = new LinkedHashSet();

    /* JADX INFO: renamed from: w */
    public final LinkedHashSet f10886w = new LinkedHashSet();

    /* JADX INFO: renamed from: x */
    public final LinkedHashSet f10887x = new LinkedHashSet();

    /* JADX INFO: renamed from: y */
    public final LinkedHashSet f10888y = new LinkedHashSet();

    /* JADX INFO: renamed from: z */
    public final LinkedHashSet f10889z = new LinkedHashSet();

    @Override // p275z2.AbstractC3517c
    /* JADX INFO: renamed from: a */
    public final Map mo5749a() {
        return AbstractC0984x.m2036H(AbstractC0984x.m2036H(super.mo5749a(), AbstractC0984x.m2035G(new C0882h("parameters", this.f10870g), new C0882h("parametersNot", this.f10871h), new C0882h("parametersCondition", null), new C0882h("parameterCount", null), new C0882h("parameterCountCondition", null), new C0882h("typeParameters", this.f10872i), new C0882h("typeParametersNot", this.f10873j), new C0882h("exceptionTypes", this.f10874k), new C0882h("exceptionTypesNot", this.f10875l), new C0882h("genericExceptionTypes", this.f10876m), new C0882h("genericExceptionTypesNot", this.f10877n), new C0882h("genericParameters", this.f10878o), new C0882h("genericParametersNot", this.f10879p), new C0882h("isVarArgs", null), new C0882h("isVarArgsNot", null), new C0882h("parameterAnnotations", this.f10880q), new C0882h("parameterAnnotationsNot", this.f10881r), new C0882h("annotatedReturnType", this.f10882s), new C0882h("annotatedReturnTypeNot", this.f10883t), new C0882h("annotatedReceiverType", this.f10884u), new C0882h("annotatedReceiverTypeNot", this.f10885v), new C0882h("annotatedParameterTypes", this.f10886w), new C0882h("annotatedParameterTypesNot", this.f10887x), new C0882h("annotatedExceptionTypes", this.f10888y), new C0882h("annotatedExceptionTypesNot", this.f10889z))), AbstractC0984x.m2035G(new C0882h("returnType", this.f10869A), new C0882h("returnTypeCondition", null), new C0882h("isBridge", null), new C0882h("isBridgeNot", null), new C0882h("isDefault", null), new C0882h("isDefaultNot", null)));
    }

    /* JADX INFO: renamed from: b */
    public final List m5751b() {
        C3516b c3516b = this.f10964a;
        if (c3516b == null) {
            throw new IllegalArgumentException("You must provide a configuration to resolve the member use build(configuration).");
        }
        List listM501o = AbstractC0284d.m501o(this, c3516b, c3516b.f10961a, new C0045X(2, this, c3516b));
        AbstractC1665j.m2983c(listM501o, "null cannot be cast to non-null type kotlin.collections.List<R of com.highcapable.kavaref.resolver.processor.MemberProcessor.resolve>");
        return listM501o;
    }
}
