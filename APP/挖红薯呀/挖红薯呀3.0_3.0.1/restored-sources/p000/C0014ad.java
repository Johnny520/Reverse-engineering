package p000;

/* JADX INFO: renamed from: ad */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0014ad implements InterfaceC0515nk, InterfaceC0554ok {

    /* JADX INFO: renamed from: e */
    public static final C0675r3 f107e = new C0675r3(9);

    /* JADX INFO: renamed from: f */
    public static final C0014ad f108f = new C0014ad(1);

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f109d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ad.<clinit>():void] */
    public /* synthetic */ C0014ad(int i) {
        this.f109d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0515nk
    public final InterfaceC0554ok getKey() {
        switch (this.f109d) {
            case 0:
                return f107e;
            default:
                return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: h */
    public final InterfaceC0618pk mo63h(InterfaceC0618pk interfaceC0618pk) {
        switch (this.f109d) {
        }
        return pf1.m3034J(this, interfaceC0618pk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: l */
    public final InterfaceC0515nk mo64l(InterfaceC0554ok interfaceC0554ok) {
        switch (this.f109d) {
        }
        return pf1.m3062v(this, interfaceC0554ok);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: p */
    public final Object mo65p(InterfaceC0904ww interfaceC0904ww, Object obj) {
        switch (this.f109d) {
        }
        return interfaceC0904ww.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: t */
    public final InterfaceC0618pk mo66t(InterfaceC0554ok interfaceC0554ok) {
        switch (this.f109d) {
        }
        return pf1.m3030F(this, interfaceC0554ok);
    }
}
