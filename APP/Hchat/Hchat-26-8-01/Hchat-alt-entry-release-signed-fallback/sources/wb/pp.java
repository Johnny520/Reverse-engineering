package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pp implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18501g;

    public /* synthetic */ pp(int r1) {
            r0 = this;
            r0.f18501g = r1
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f18501g
            r1 = 0
            switch(r0) {
                case 0: goto L4c;
                case 1: goto L45;
                case 2: goto L3e;
                case 3: goto L39;
                case 4: goto L36;
                case 5: goto L33;
                case 6: goto L2b;
                default: goto L6;
            }
        L6:
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            r1 = 30
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            okhttp3.OkHttpClient$Builder r0 = r0.connectTimeout(r1, r3)
            r1 = 300(0x12c, double:1.48E-321)
            okhttp3.OkHttpClient$Builder r0 = r0.readTimeout(r1, r3)
            okhttp3.OkHttpClient$Builder r0 = r0.writeTimeout(r1, r3)
            r1 = 1
            okhttp3.OkHttpClient$Builder r0 = r0.followRedirects(r1)
            okhttp3.OkHttpClient$Builder r0 = r0.followSslRedirects(r1)
            okhttp3.OkHttpClient r0 = r0.build()
            return r0
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LocalWindowListPopupState not provided"
            r0.<init>(r1)
            throw r0
        L33:
            i0.m2 r0 = x0.g.f20829a
            return r1
        L36:
            i0.m2 r0 = x0.e.f20827a
            return r1
        L39:
            i0.j1 r0 = i0.r.u(r1)
            return r0
        L3e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            return r0
        L45:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            return r0
        L4c:
            java.lang.String r0 = ""
            i0.j1 r0 = i0.r.u(r0)
            return r0
    }
}
