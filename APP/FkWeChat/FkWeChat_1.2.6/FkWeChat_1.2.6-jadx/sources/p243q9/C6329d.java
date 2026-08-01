package p243q9;

import gb.AbstractC2706r0;
import java.util.Map;
import p213oa.C5692c;
import p229p9.InterfaceC6003g1;
import p243q9.InterfaceC6328c;
import p259ra.AbstractC6569n;

/* JADX INFO: renamed from: q9.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C6329d implements InterfaceC6328c {

    /* JADX INFO: renamed from: a */
    public final AbstractC2706r0 f19851a;

    /* JADX INFO: renamed from: b */
    public final Map f19852b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6003g1 f19853c;

    public C6329d(AbstractC2706r0 abstractC2706r0, Map map, InterfaceC6003g1 interfaceC6003g1) {
        if (abstractC2706r0 == null) {
            m24995b(0);
        }
        if (map == null) {
            m24995b(1);
        }
        if (interfaceC6003g1 == null) {
            m24995b(2);
        }
        this.f19851a = abstractC2706r0;
        this.f19852b = map;
        this.f19853c = interfaceC6003g1;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m24995b(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: a */
    public Map mo5548a() {
        Map map = this.f19852b;
        if (map == null) {
            m24995b(4);
        }
        return map;
    }

    @Override // p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: d */
    public C5692c mo5549d() {
        return InterfaceC6328c.a.m24994a(this);
    }

    @Override // p243q9.InterfaceC6328c
    public InterfaceC6003g1 getSource() {
        InterfaceC6003g1 interfaceC6003g1 = this.f19853c;
        if (interfaceC6003g1 == null) {
            m24995b(5);
        }
        return interfaceC6003g1;
    }

    @Override // p243q9.InterfaceC6328c
    public AbstractC2706r0 getType() {
        AbstractC2706r0 abstractC2706r0 = this.f19851a;
        if (abstractC2706r0 == null) {
            m24995b(3);
        }
        return abstractC2706r0;
    }

    public String toString() {
        return AbstractC6569n.f20552h.mo25907N(this, null);
    }
}
