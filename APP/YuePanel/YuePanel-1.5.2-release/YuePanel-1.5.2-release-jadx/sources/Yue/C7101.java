package Yue;

import Yue.C5256;
import Yue.C5385;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۡۦۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1864#2,3:299\n*S KotlinDebug\n*F\n+ 1 Request.kt\nokhttp3/Request\n*L\n119#1:299,3\n*E\n"})
public final class C7101 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final C5385 f2677;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final String f2678;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final C5256 f21447;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final AbstractC7103 f21448;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final Map<Class<?>, Object> f21449;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public C3641 f21450;

    public C7101(@InterfaceC6399 C5385 c5385, @InterfaceC6399 String str, @InterfaceC6399 C5256 c5256, @InterfaceC6489 AbstractC7103 abstractC7103, @InterfaceC6399 Map<Class<?>, ? extends Object> map) {
        C5499.m17103(c5385, "url");
        C5499.m17103(str, "method");
        C5499.m17103(c5256, "headers");
        C5499.m17103(map, "tags");
        this.f2677 = c5385;
        this.f2678 = str;
        this.f21447 = c5256;
        this.f21448 = abstractC7103;
        this.f21449 = map;
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f2678);
        sb.append(", url=");
        sb.append(this.f2677);
        if (this.f21447.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (C6599<? extends String, ? extends String> c6599 : this.f21447) {
                int i2 = i + 1;
                if (i < 0) {
                    C3880.m10753();
                }
                C6599<? extends String, ? extends String> c65992 = c6599;
                String strM3062 = c65992.m3062();
                String strM3063 = c65992.m3063();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(strM3062);
                sb.append(':');
                sb.append(strM3063);
                i = i2;
            }
            sb.append(']');
        }
        if (!this.f21449.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f21449);
        }
        sb.append(C6193.f1885);
        String string = sb.toString();
        C5499.m17102(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = C5905.f14739, imports = {}))
    @InterfaceC5572(name = "-deprecated_body")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final AbstractC7103 m3390() {
        return this.f21448;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "cacheControl", imports = {}))
    @InterfaceC5572(name = "-deprecated_cacheControl")
    /* JADX INFO: renamed from: ۥ۟ */
    public final C3641 m3391() {
        return m22150();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "headers", imports = {}))
    @InterfaceC5572(name = "-deprecated_headers")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C5256 m22146() {
        return this.f21447;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "method", imports = {}))
    @InterfaceC5572(name = "-deprecated_method")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final String m22147() {
        return this.f2678;
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "moved to val", replaceWith = @InterfaceC7097(expression = "url", imports = {}))
    @InterfaceC5572(name = "-deprecated_url")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final C5385 m22148() {
        return this.f2677;
    }

    @InterfaceC5572(name = C5905.f14739)
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final AbstractC7103 m22149() {
        return this.f21448;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "cacheControl")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final C3641 m22150() {
        C3641 c3641 = this.f21450;
        if (c3641 != null) {
            return c3641;
        }
        C3641 c3641M9962 = C3641.f6415.m9962(this.f21447);
        this.f21450 = c3641M9962;
        return c3641M9962;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Map<Class<?>, Object> m22151() {
        return this.f21449;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final String m22152(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        return this.f21447.m16111(str);
    }

    @InterfaceC6399
    @InterfaceC5572(name = "headers")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final C5256 m22153() {
        return this.f21447;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final List<String> m22154(@InterfaceC6399 String str) {
        C5499.m17103(str, "name");
        return this.f21447.m16119(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final boolean m22155() {
        return this.f2677.m16773();
    }

    @InterfaceC6399
    @InterfaceC5572(name = "method")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final String m22156() {
        return this.f2678;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final C1165 m22157() {
        return new C1165(this);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final Object m22158() {
        return m22159(Object.class);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final <T> T m22159(@InterfaceC6399 Class<? extends T> cls) {
        C5499.m17103(cls, "type");
        return cls.cast(this.f21449.get(cls));
    }

    @InterfaceC6399
    @InterfaceC5572(name = "url")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final C5385 m22160() {
        return this.f2677;
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۤۧ$ۥ */
    @InterfaceC7507({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
    public static class C1165 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6489
        public C5385 f2679;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6399
        public String f2680;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public C5256.C0687 f21451;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6489
        public AbstractC7103 f21452;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6399
        public Map<Class<?>, Object> f21453;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1165() {
            this.f21453 = new LinkedHashMap();
            this.f2680 = "GET";
            this.f21451 = new C5256.C0687();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ C1165 m22161(C1165 c1165, AbstractC7103 abstractC7103, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 1) != 0) {
                abstractC7103 = C8158.f24178;
            }
            return c1165.m22164(abstractC7103);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public C1165 m3392(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
            C5499.m17103(str, "name");
            C5499.m17103(str2, "value");
            this.f21451.m2022(str, str2);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public C7101 m3393() {
            C5385 c5385 = this.f2679;
            if (c5385 != null) {
                return new C7101(c5385, this.f2680, this.f21451.m16126(), this.f21452, C8158.m26890(this.f21453));
            }
            throw new IllegalStateException("url == null".toString());
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C1165 m22162(@InterfaceC6399 C3641 c3641) {
            C5499.m17103(c3641, "cacheControl");
            String string = c3641.toString();
            return string.length() == 0 ? m22178("Cache-Control") : m22172("Cache-Control", string);
        }

        @InterfaceC6399
        @InterfaceC5573
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C1165 m22163() {
            return m22161(this, null, 1, null);
        }

        @InterfaceC6399
        @InterfaceC5573
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C1165 m22164(@InterfaceC6489 AbstractC7103 abstractC7103) {
            return m22174("DELETE", abstractC7103);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C1165 m22165() {
            return m22174("GET", null);
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final AbstractC7103 m22166() {
            return this.f21452;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final C5256.C0687 m22167() {
            return this.f21451;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final String m22168() {
            return this.f2680;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final Map<Class<?>, Object> m22169() {
            return this.f21453;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final C5385 m22170() {
            return this.f2679;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public C1165 m22171() {
            return m22174("HEAD", null);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public C1165 m22172(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
            C5499.m17103(str, "name");
            C5499.m17103(str2, "value");
            this.f21451.m16130(str, str2);
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public C1165 m22173(@InterfaceC6399 C5256 c5256) {
            C5499.m17103(c5256, "headers");
            this.f21451 = c5256.m16116();
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public C1165 m22174(@InterfaceC6399 String str, @InterfaceC6489 AbstractC7103 abstractC7103) {
            C5499.m17103(str, "method");
            if (str.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (abstractC7103 == null) {
                if (!(!C5383.m16739(str))) {
                    throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                }
            } else if (!C5383.m2138(str)) {
                throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
            }
            this.f2680 = str;
            this.f21452 = abstractC7103;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public C1165 m22175(@InterfaceC6399 AbstractC7103 abstractC7103) {
            C5499.m17103(abstractC7103, C5905.f14739);
            return m22174("PATCH", abstractC7103);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public C1165 m22176(@InterfaceC6399 AbstractC7103 abstractC7103) {
            C5499.m17103(abstractC7103, C5905.f14739);
            return m22174("POST", abstractC7103);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public C1165 m22177(@InterfaceC6399 AbstractC7103 abstractC7103) {
            C5499.m17103(abstractC7103, C5905.f14739);
            return m22174("PUT", abstractC7103);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public C1165 m22178(@InterfaceC6399 String str) {
            C5499.m17103(str, "name");
            this.f21451.m16129(str);
            return this;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final void m22179(@InterfaceC6489 AbstractC7103 abstractC7103) {
            this.f21452 = abstractC7103;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final void m22180(@InterfaceC6399 C5256.C0687 c0687) {
            C5499.m17103(c0687, "<set-?>");
            this.f21451 = c0687;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final void m22181(@InterfaceC6399 String str) {
            C5499.m17103(str, "<set-?>");
            this.f2680 = str;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final void m22182(@InterfaceC6399 Map<Class<?>, Object> map) {
            C5499.m17103(map, "<set-?>");
            this.f21453 = map;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final void m22183(@InterfaceC6489 C5385 c5385) {
            this.f2679 = c5385;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public <T> C1165 m22184(@InterfaceC6399 Class<? super T> cls, @InterfaceC6489 T t) {
            C5499.m17103(cls, "type");
            if (t == null) {
                this.f21453.remove(cls);
            } else {
                if (this.f21453.isEmpty()) {
                    this.f21453 = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f21453;
                T tCast = cls.cast(t);
                C5499.m17100(tCast);
                map.put(cls, tCast);
            }
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public C1165 m22185(@InterfaceC6489 Object obj) {
            return m22184(Object.class, obj);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public C1165 m22186(@InterfaceC6399 C5385 c5385) {
            C5499.m17103(c5385, "url");
            this.f2679 = c5385;
            return this;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public C1165 m22187(@InterfaceC6399 String str) {
            C5499.m17103(str, "url");
            if (C7627.m24006(str, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String strSubstring = str.substring(3);
                C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                str = sb.toString();
            } else if (C7627.m24006(str, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String strSubstring2 = str.substring(4);
                C5499.m17102(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                str = sb2.toString();
            }
            return m22186(C5385.f13231.m16855(str));
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public C1165 m22188(@InterfaceC6399 URL url) {
            C5499.m17103(url, "url");
            C5385.C0736 c0736 = C5385.f13231;
            String string = url.toString();
            C5499.m17102(string, "url.toString()");
            return m22186(c0736.m16855(string));
        }

        public C1165(@InterfaceC6399 C7101 c7101) {
            Map<Class<?>, Object> mapM18646;
            C5499.m17103(c7101, "request");
            this.f21453 = new LinkedHashMap();
            this.f2679 = c7101.m22160();
            this.f2680 = c7101.m22156();
            this.f21452 = c7101.m22149();
            if (c7101.m22151().isEmpty()) {
                mapM18646 = new LinkedHashMap<>();
            } else {
                mapM18646 = C5943.m18646(c7101.m22151());
            }
            this.f21453 = mapM18646;
            this.f21451 = c7101.m22153().m16116();
        }
    }
}
