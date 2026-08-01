package p137j4;

import java.util.LinkedHashMap;
import java.util.Map;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: j4.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3594a {

    /* JADX INFO: renamed from: b */
    public static final a f9989b = new a(null);

    /* JADX INFO: renamed from: a */
    public final Map f9990a = new LinkedHashMap();

    /* JADX INFO: renamed from: j4.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC3594a {

        /* JADX INFO: renamed from: c */
        public static final b f9991c = new b();

        @Override // p137j4.AbstractC3594a
        /* JADX INFO: renamed from: a */
        public Object mo13448a(c cVar) {
            cVar.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: j4.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface c {
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo13448a(c cVar);

    /* JADX INFO: renamed from: b */
    public final Map m13449b() {
        return this.f9990a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC3594a) && AbstractC1061t.m3842c(this.f9990a, ((AbstractC3594a) obj).f9990a);
    }

    public int hashCode() {
        return this.f9990a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.f9990a + ')';
    }

    /* JADX INFO: renamed from: j4.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
