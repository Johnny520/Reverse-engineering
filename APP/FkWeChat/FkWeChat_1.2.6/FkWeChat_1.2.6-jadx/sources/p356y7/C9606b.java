package p356y7;

import p024b9.AbstractC1061t;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX INFO: renamed from: y7.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9606b {

    /* JADX INFO: renamed from: a */
    public final String f32703a;

    /* JADX INFO: renamed from: b */
    public final String f32704b;

    /* JADX INFO: renamed from: c */
    public final a f32705c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: y7.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: q */
        public static final a f32706q = new a("STARTED", 0);

        /* JADX INFO: renamed from: r */
        public static final a f32707r = new a("FINISHED", 1);

        /* JADX INFO: renamed from: s */
        public static final /* synthetic */ a[] f32708s;

        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ InterfaceC7197a f32709t;

        static {
            a[] aVarArrM37575a = m37575a();
            f32708s = aVarArrM37575a;
            f32709t = AbstractC7198b.m28437a(aVarArrM37575a);
        }

        public a(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a[] m37575a() {
            return new a[]{f32706q, f32707r};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f32708s.clone();
        }
    }

    public C9606b(String str, String str2, a aVar) {
        str.getClass();
        str2.getClass();
        aVar.getClass();
        this.f32703a = str;
        this.f32704b = str2;
        this.f32705c = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9606b)) {
            return false;
        }
        C9606b c9606b = (C9606b) obj;
        return AbstractC1061t.m3842c(this.f32703a, c9606b.f32703a) && AbstractC1061t.m3842c(this.f32704b, c9606b.f32704b) && this.f32705c == c9606b.f32705c;
    }

    public int hashCode() {
        return (((this.f32703a.hashCode() * 31) + this.f32704b.hashCode()) * 31) + this.f32705c.hashCode();
    }

    public String toString() {
        return "PluginTraceElement(pluginName=" + this.f32703a + ", handler=" + this.f32704b + ", event=" + this.f32705c + ')';
    }
}
