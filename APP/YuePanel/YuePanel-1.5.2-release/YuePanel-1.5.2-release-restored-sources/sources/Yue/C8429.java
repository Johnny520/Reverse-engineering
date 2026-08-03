package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8429 {

    /* JADX INFO: renamed from: Yue.ۥۢۥۢۨ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.selects.WhileSelectKt", m1273f = "WhileSelect.kt", m1274i = {0}, m1275l = {37}, m1276m = "whileSelect", m1277n = {"builder"}, m1278s = {"L$0"})
    public static final class C1527 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f25254;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f25255;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f25256;

        public C1527(InterfaceC4199<? super C1527> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f25255 = obj;
            this.f25256 |= Integer.MIN_VALUE;
            return C8429.m4408(null, this);
        }
    }

    /* JADX DEBUG: Duplicate block (B:23:0x0056) to fix multi-entry loop: BACK_EDGE: B:23:0x0056 -> B:25:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Yue.InterfaceC4764
    @Yue.InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m4408(@Yue.InterfaceC6399 Yue.InterfaceC5124<? super Yue.InterfaceC7281<? super java.lang.Boolean>, Yue.C8107> r4, @Yue.InterfaceC6399 Yue.InterfaceC4199<? super Yue.C8107> r5) {
        /*
            boolean r0 = r5 instanceof Yue.C8429.C1527
            if (r0 == 0) goto L13
            r0 = r5
            Yue.ۥۢۥۢۨ$ۥ r0 = (Yue.C8429.C1527) r0
            int r1 = r0.f25256
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25256 = r1
            goto L18
        L13:
            Yue.ۥۢۥۢۨ$ۥ r0 = new Yue.ۥۢۥۢۨ$ۥ
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f25255
            java.lang.Object r1 = Yue.C5508.m17142()
            int r2 = r0.f25256
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f25254
            Yue.ۥۣ۠ۡ۟ r4 = (Yue.InterfaceC5124) r4
            Yue.C7149.m22422(r5)
            goto L59
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            Yue.C7149.m22422(r5)
        L38:
            r0.f25254 = r4
            r0.f25256 = r3
            Yue.ۥۡۧۨۥ r5 = new Yue.ۥۡۧۨۥ
            r5.<init>(r0)
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r2 = move-exception
            r5.m22769(r2)
        L49:
            java.lang.Object r5 = r5.m22768()
            java.lang.Object r2 = Yue.C5508.m17142()
            if (r5 != r2) goto L56
            Yue.C4324.m12513(r0)
        L56:
            if (r5 != r1) goto L59
            return r1
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L38
            Yue.ۥۣۢ۠ۤ r4 = Yue.C8107.f3222
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Yue.C8429.m4408(Yue.ۥۣ۠ۡ۟, Yue.ۥ۟ۧۤۢ):java.lang.Object");
    }

    @InterfaceC4764
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Object m4409(InterfaceC5124<? super InterfaceC7281<? super Boolean>, C8107> interfaceC5124, InterfaceC4199<? super C8107> interfaceC4199) throws Throwable {
        Object objM22768;
        do {
            C5437.m16931(0);
            C7282 c7282 = new C7282(interfaceC4199);
            try {
                interfaceC5124.invoke(c7282);
            } catch (Throwable th) {
                c7282.m22769(th);
            }
            objM22768 = c7282.m22768();
            if (objM22768 == C5508.m17142()) {
                C4324.m12513(interfaceC4199);
            }
            C5437.m16931(1);
        } while (((Boolean) objM22768).booleanValue());
        return C8107.f3222;
    }
}
