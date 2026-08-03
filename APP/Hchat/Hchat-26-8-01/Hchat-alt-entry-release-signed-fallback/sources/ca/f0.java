package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f1499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p8.o f1500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0.t f1501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ab.b f1502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.content.SharedPreferences f1503e;

    public f0(r8.g r11, p8.o r12, b0.t r13, ab.b r14) {
            r10 = this;
            r11.getClass()
            r10.<init>()
            r10.f1499a = r11
            r10.f1500b = r12
            r10.f1501c = r13
            r10.f1502d = r14
            android.content.Context r11 = r11.f11620a
            java.lang.String r12 = "Hchat_message_forward_config"
            android.content.SharedPreferences r11 = ub.b.c(r11, r12)
            r10.f1503e = r11
            p8.j r11 = p8.j.f10380a
            p8.i r0 = new p8.i
            b0.v r1 = new b0.v
            java.lang.Class<ca.f0> r11 = ca.f0.class
            java.lang.Class r4 = eh.a.i(r11)
            r8 = 0
            r9 = 1
            r2 = 0
            java.lang.String r5 = "isEnabled"
            java.lang.String r6 = "isEnabled()Z"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r11 = r3
            b0.t r9 = new b0.t
            r12 = 4
            r9.<init>(r10, r12)
            o9.e r8 = new o9.e
            r12 = 9
            r8.<init>(r12)
            r7 = r1
            java.lang.String r1 = "message_forward"
            r2 = 1212371790(0x4843534e, float:200013.22)
            java.lang.String r3 = "转发[H]"
            r4 = 10
            r5 = 0
            java.lang.String r6 = "icons_filled_share"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.concurrent.ConcurrentHashMap r12 = p8.j.f10381b
            r12.put(r1, r0)
            return
    }
}
