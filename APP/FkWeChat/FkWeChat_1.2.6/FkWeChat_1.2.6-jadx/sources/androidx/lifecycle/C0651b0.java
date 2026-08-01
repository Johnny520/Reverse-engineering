package androidx.lifecycle;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import p024b9.AbstractC1043k;
import p105h4.C2871b;
import p181m4.AbstractC4967d;
import p181m4.C4970g;

/* JADX INFO: renamed from: androidx.lifecycle.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0651b0 {

    /* JADX INFO: renamed from: c */
    public static final a f1928c = new a(null);

    /* JADX INFO: renamed from: a */
    public final Map f1929a;

    /* JADX INFO: renamed from: b */
    public C2871b f1930b;

    public C0651b0(Map map) {
        map.getClass();
        this.f1929a = new LinkedHashMap();
        this.f1930b = new C2871b(map);
    }

    /* JADX INFO: renamed from: a */
    public final C4970g.b m2583a() {
        return this.f1930b.m10312b();
    }

    /* JADX INFO: renamed from: androidx.lifecycle.b0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0651b0 m2584a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new C0651b0();
            }
            ClassLoader classLoader = C0651b0.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            return new C0651b0(AbstractC4967d.m20064g(AbstractC4967d.m20058a(bundle)));
        }

        public a() {
        }
    }

    public C0651b0() {
        this.f1929a = new LinkedHashMap();
        this.f1930b = new C2871b(null, 1, null);
    }
}
