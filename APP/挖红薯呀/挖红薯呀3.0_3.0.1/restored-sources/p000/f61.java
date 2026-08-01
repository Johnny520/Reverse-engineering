package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class f61 extends av0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: f */
    public long f1609f;

    /* JADX INFO: renamed from: g */
    public int f1610g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f1611h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ nr0 f1612i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(nr0 nr0Var, InterfaceC0322ik interfaceC0322ik) {
        super(interfaceC0322ik);
        this.f1612i = nr0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        f61 f61Var = new f61(this.f1612i, interfaceC0322ik);
        f61Var.f1611h = obj;
        return f61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((f61) mo15g((r51) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:12:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo16m(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f1610g
            r1 = 1
            if (r0 == 0) goto L18
            if (r0 != r1) goto L11
            long r2 = r6.f1609f
            java.lang.Object r0 = r6.f1611h
            r51 r0 = (p000.r51) r0
            p000.w60.m4891M(r7)
            goto L3f
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p000.C0921xc.m5134o(r6)
            r6 = 0
            return r6
        L18:
            p000.w60.m4891M(r7)
            java.lang.Object r7 = r6.f1611h
            r51 r7 = (p000.r51) r7
            nr0 r0 = r6.f1612i
            long r2 = r0.f4306b
            nc1 r0 = r7.m3389f()
            r0.getClass()
            r4 = 40
            long r4 = r4 + r2
            r0 = r7
            r2 = r4
        L2f:
            r6.f1611h = r0
            r6.f1609f = r2
            r6.f1610g = r1
            r7 = 3
            java.lang.Object r7 = p000.m61.m2439c(r0, r6, r7)
            zk r4 = p000.EnumC1007zk.f7916d
            if (r7 != r4) goto L3f
            return r4
        L3f:
            nr0 r7 = (p000.nr0) r7
            long r4 = r7.f4306b
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L2f
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f61.mo16m(java.lang.Object):java.lang.Object");
    }
}
