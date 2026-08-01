package p027E4;

import java.lang.reflect.Method;
import java.util.Map;
import me.dartcv.nuke.BuildConfig;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: E4.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0293G extends AbstractC0315b0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f940d;

    /* JADX INFO: renamed from: e */
    public final Method f941e;

    /* JADX INFO: renamed from: f */
    public final int f942f;

    /* JADX INFO: renamed from: g */
    public final boolean f943g;

    public /* synthetic */ C0293G(Method method, int i5, boolean z5, int i6) {
        this.f940d = i6;
        this.f941e = method;
        this.f942f = i5;
        this.f943g = z5;
    }

    @Override // p027E4.AbstractC0315b0
    /* JADX INFO: renamed from: a */
    public final void mo515a(C0303Q c0303q, Object obj) {
        switch (this.f940d) {
            case 0:
                Map map = (Map) obj;
                int i5 = this.f942f;
                Method method = this.f941e;
                if (map == null) {
                    throw AbstractC0315b0.m543n(method, i5, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC0315b0.m543n(method, i5, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC0315b0.m543n(method, i5, AbstractC0231b.m400k("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw AbstractC0315b0.m543n(method, i5, "Field map value '" + value + "' converted to null by " + C0314b.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    c0303q.m522a(str, string, this.f943g);
                }
                return;
            case BuildConfig.VERSION_CODE /* 1 */:
                Map map2 = (Map) obj;
                int i6 = this.f942f;
                Method method2 = this.f941e;
                if (map2 == null) {
                    throw AbstractC0315b0.m543n(method2, i6, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw AbstractC0315b0.m543n(method2, i6, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw AbstractC0315b0.m543n(method2, i6, AbstractC0231b.m400k("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    c0303q.m523b(str2, value2.toString(), this.f943g);
                }
                return;
            default:
                Map map3 = (Map) obj;
                int i7 = this.f942f;
                Method method3 = this.f941e;
                if (map3 == null) {
                    throw AbstractC0315b0.m543n(method3, i7, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw AbstractC0315b0.m543n(method3, i7, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw AbstractC0315b0.m543n(method3, i7, AbstractC0231b.m400k("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw AbstractC0315b0.m543n(method3, i7, "Query map value '" + value3 + "' converted to null by " + C0314b.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    c0303q.m525d(str3, string2, this.f943g);
                }
                return;
        }
    }
}
