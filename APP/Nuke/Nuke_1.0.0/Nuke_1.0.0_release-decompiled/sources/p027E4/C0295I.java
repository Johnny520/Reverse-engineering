package p027E4;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import p011B4.AbstractC0231b;
import p118X3.AbstractC1682D;
import p118X3.C1707q;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: E4.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0295I extends AbstractC0315b0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f947d = 1;

    /* JADX INFO: renamed from: e */
    public final Method f948e;

    /* JADX INFO: renamed from: f */
    public final int f949f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0327n f950g;

    /* JADX INFO: renamed from: h */
    public final Object f951h;

    public C0295I(Method method, int i5, InterfaceC0327n interfaceC0327n, String str) {
        this.f948e = method;
        this.f949f = i5;
        this.f950g = interfaceC0327n;
        this.f951h = str;
    }

    @Override // p027E4.AbstractC0315b0
    /* JADX INFO: renamed from: a */
    public final void mo515a(C0303Q c0303q, Object obj) {
        int i5 = this.f947d;
        InterfaceC0327n interfaceC0327n = this.f950g;
        Object obj2 = this.f951h;
        Method method = this.f948e;
        int i6 = this.f949f;
        switch (i5) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    c0303q.m524c((C1707q) obj2, (AbstractC1682D) interfaceC0327n.mo63a(obj));
                    return;
                } catch (IOException e5) {
                    throw AbstractC0315b0.m543n(method, i6, "Unable to convert " + obj + " to RequestBody", e5);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw AbstractC0315b0.m543n(method, i6, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC0315b0.m543n(method, i6, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC0315b0.m543n(method, i6, AbstractC0231b.m400k("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", AbstractC0231b.m400k("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    C1707q c1707q = C1707q.f5858e;
                    c0303q.m524c(AbstractC2352g.m4179B(strArr), (AbstractC1682D) interfaceC0327n.mo63a(value));
                }
                return;
        }
    }

    public C0295I(Method method, int i5, C1707q c1707q, InterfaceC0327n interfaceC0327n) {
        this.f948e = method;
        this.f949f = i5;
        this.f951h = c1707q;
        this.f950g = interfaceC0327n;
    }
}
