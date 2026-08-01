package qa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;
import qa.AbstractC6353j;

/* JADX INFO: renamed from: qa.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C6351h {

    /* JADX INFO: renamed from: b */
    public static final C6351h f19991b = new C6351h(true);

    /* JADX INFO: renamed from: a */
    public final Map f19992a;

    /* JADX INFO: renamed from: qa.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Object f19993a;

        /* JADX INFO: renamed from: b */
        public final int f19994b;

        public a(Object obj, int i10) {
            this.f19993a = obj;
            this.f19994b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19993a == aVar.f19993a && this.f19994b == aVar.f19994b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f19993a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f19994b;
        }
    }

    public C6351h() {
        this.f19992a = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public static C6351h m25181c() {
        return f19991b;
    }

    /* JADX INFO: renamed from: d */
    public static C6351h m25182d() {
        return new C6351h();
    }

    /* JADX INFO: renamed from: a */
    public final void m25183a(AbstractC6353j.f fVar) {
        this.f19992a.put(new a(fVar.m25244b(), fVar.m25246d()), fVar);
    }

    /* JADX INFO: renamed from: b */
    public AbstractC6353j.f m25184b(InterfaceC6360q interfaceC6360q, int i10) {
        return (AbstractC6353j.f) this.f19992a.get(new a(interfaceC6360q, i10));
    }

    public C6351h(boolean z10) {
        this.f19992a = Collections.EMPTY_MAP;
    }
}
