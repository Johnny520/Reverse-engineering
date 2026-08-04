package yyds;

import android.database.SQLException;

/* JADX INFO: renamed from: yyds.ᛵᲁᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1208 implements InterfaceC0584 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final long f5498;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public volatile boolean f5500;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1002 f5501;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1002 f5503;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1586 f5499 = new C1586();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final ThreadLocal f5502 = new ThreadLocal();

    public C1208(final C2133 c2133, final String str, int i) {
        C0135 c0135 = AbstractC0848.f3910;
        this.f5498 = AbstractC1367.m2771(30, EnumC0426.SECONDS);
        if (i <= 0) {
            C0188.m798("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i2 = 0;
        this.f5501 = new C1002(i, new InterfaceC2266() { // from class: yyds.ᛳᲈᛵᲁ
            @Override // yyds.InterfaceC2266
            /* JADX INFO: renamed from: ᛲᲈᲁ */
            public final Object mo731() throws Exception {
                int i3 = i2;
                String str2 = str;
                C2133 c21332 = c2133;
                switch (i3) {
                    case 0:
                        InterfaceC0124 interfaceC0124Mo1348 = c21332.mo1348(str2);
                        AbstractC2328.m4335(interfaceC0124Mo1348, "PRAGMA query_only = 1");
                        return interfaceC0124Mo1348;
                    default:
                        return c21332.mo1348(str2);
                }
            }
        });
        final int i3 = 1;
        this.f5503 = new C1002(1, new InterfaceC2266() { // from class: yyds.ᛳᲈᛵᲁ
            @Override // yyds.InterfaceC2266
            /* JADX INFO: renamed from: ᛲᲈᲁ */
            public final Object mo731() throws Exception {
                int i32 = i3;
                String str2 = str;
                C2133 c21332 = c2133;
                switch (i32) {
                    case 0:
                        InterfaceC0124 interfaceC0124Mo1348 = c21332.mo1348(str2);
                        AbstractC2328.m4335(interfaceC0124Mo1348, "PRAGMA query_only = 1");
                        return interfaceC0124Mo1348;
                    default:
                        return c21332.mo1348(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f5500) {
            return;
        }
        this.f5500 = true;
        this.f5501.m2182();
        this.f5503.m2182();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0137 A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #3 {all -> 0x018d, blocks: (B:64:0x0116, B:69:0x012c, B:71:0x0137, B:86:0x0191, B:87:0x0198), top: B:113:0x0116 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0191 A[Catch: all -> 0x018d, TRY_ENTER, TryCatch #3 {all -> 0x018d, blocks: (B:64:0x0116, B:69:0x012c, B:71:0x0137, B:86:0x0191, B:87:0x0198), top: B:113:0x0116 }] */
    /* JADX WARN: Type inference failed for: r11v1, types: [yyds.ᛸᛲᛴᲇ] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [yyds.ᛴᲈᲁᛴ] */
    /* JADX WARN: Type inference failed for: r2v8, types: [yyds.ᛴᲈᲁᛴ] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, yyds.ᛴᲈᲁᛴ] */
    @Override // yyds.InterfaceC0584
    /* JADX INFO: renamed from: ᛲᛶᛱᲈ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1465(boolean z, InterfaceC0477 interfaceC0477, AbstractC1320 abstractC1320) throws Exception {
        C2370 c2370;
        C0172 c0172;
        Throwable th;
        ?? r2;
        InterfaceC2213 interfaceC2213;
        InterfaceC0477 interfaceC04772;
        C1586 c1586;
        ?? r13;
        C0172 c01722;
        ?? r132;
        Object obj;
        C0172 c01723;
        ?? r22;
        C1458 c1458;
        final boolean z2 = z;
        if (abstractC1320 instanceof C2370) {
            c2370 = (C2370) abstractC1320;
            int i = c2370.f11678;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2370.f11678 = i - Integer.MIN_VALUE;
            } else {
                c2370 = new C2370(this, abstractC1320);
            }
        }
        Object objM3955 = c2370.f11676;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        int i2 = c2370.f11678;
        int i3 = 4;
        int i4 = 3;
        InterfaceC2213 interfaceC22132 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        if (i2 == 0) {
            AbstractC1544.m3189(objM3955);
            if (this.f5500) {
                AbstractC2328.m4346(21, "Connection pool is closed");
                throw null;
            }
            C1458 c14582 = (C1458) this.f5502.get();
            if (c14582 == null) {
                C1978 c1978 = (C1978) c2370.f6070.mo423(this.f5499);
                c14582 = c1978 != null ? c1978.f9917 : null;
            }
            if (c14582 == null) {
                ?? r3 = z2 ? this.f5501 : this.f5503;
                c0172 = new C0172();
                try {
                    interfaceC2213 = c2370.f6070;
                    C1586 c15862 = this.f5499;
                    long j = this.f5498;
                    ?? r11 = new InterfaceC2266() { // from class: yyds.ᛸᛲᛴᲇ
                        @Override // yyds.InterfaceC2266
                        /* JADX INFO: renamed from: ᛲᲈᲁ */
                        public final Object mo731() {
                            String str = z2 ? "reader" : "writer";
                            StringBuilder sb = new StringBuilder();
                            sb.append("Timed out attempting to acquire a " + str + " connection.");
                            sb.append("\n\nWriter pool:\n");
                            C1208 c1208 = this.f8700;
                            c1208.f5503.m2183(sb);
                            sb.append("Reader pool:");
                            sb.append('\n');
                            c1208.f5501.m2183(sb);
                            try {
                                AbstractC2328.m4346(5, sb.toString());
                                throw null;
                            } catch (SQLException e) {
                                e.printStackTrace();
                                return C2746.f13459;
                            }
                        }
                    };
                    c2370.f11679 = interfaceC0477;
                    c2370.f11675 = r3;
                    c2370.f11677 = c0172;
                    c2370.f11682 = interfaceC2213;
                    c2370.f11680 = c0172;
                    c2370.f11681 = c15862;
                    c2370.f11683 = z2;
                    c2370.f11678 = 3;
                    Object objM2181 = r3.m2181(j, r11, c2370);
                    if (objM2181 != enumC1765) {
                        interfaceC04772 = interfaceC0477;
                        c1586 = c15862;
                        r13 = r3;
                        objM3955 = objM2181;
                        c01722 = c0172;
                        C2184 c2184 = (C2184) objM3955;
                        c2184.f10739 = interfaceC2213;
                        c2184.f10742 = new Throwable();
                        c01722.f997 = new C1458(c1586, c2184, this.f5501 == this.f5503 && z2);
                        obj = c0172.f997;
                        if (obj != null) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r2 = r3;
                }
            } else {
                if (!z2 && c14582.f6957) {
                    AbstractC2328.m4346(1, "Cannot upgrade connection from reader to writer");
                    throw null;
                }
                if (c2370.f6070.mo423(this.f5499) == null) {
                    InterfaceC2213 interfaceC2213M1960 = AbstractC0879.m1960(new C1978(this.f5499, c14582), new C1820(c14582, this.f5502));
                    C0219 c0219 = new C0219(interfaceC0477, c14582, z3 ? 1 : 0, i4);
                    c2370.f11678 = 1;
                    Object objM39552 = AbstractC2071.m3955(interfaceC2213M1960, c0219, c2370);
                    if (objM39552 != enumC1765) {
                        return objM39552;
                    }
                } else {
                    c2370.f11678 = 2;
                    Object objMo511 = interfaceC0477.mo511(c14582, c2370);
                    if (objMo511 != enumC1765) {
                        return objMo511;
                    }
                }
            }
            return enumC1765;
        }
        if (i2 == 1) {
            AbstractC1544.m3189(objM3955);
            return objM3955;
        }
        if (i2 == 2) {
            AbstractC1544.m3189(objM3955);
            return objM3955;
        }
        if (i2 == 3) {
            z2 = c2370.f11683;
            c1586 = c2370.f11681;
            C0172 c01724 = c2370.f11680;
            InterfaceC2213 interfaceC22133 = c2370.f11682;
            C0172 c01725 = c2370.f11677;
            C1002 c1002 = (C1002) c2370.f11675;
            interfaceC04772 = (InterfaceC0477) c2370.f11679;
            try {
                AbstractC1544.m3189(objM3955);
                c01722 = c01724;
                c0172 = c01725;
                interfaceC2213 = interfaceC22133;
                r13 = c1002;
                try {
                    C2184 c21842 = (C2184) objM3955;
                    c21842.f10739 = interfaceC2213;
                    c21842.f10742 = new Throwable();
                    c01722.f997 = new C1458(c1586, c21842, this.f5501 == this.f5503 && z2);
                    obj = c0172.f997;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    C1458 c14583 = (C1458) obj;
                    InterfaceC2213 interfaceC2213M19602 = AbstractC0879.m1960(new C1978(this.f5499, c14583), new C1820(c14583, this.f5502));
                    C0219 c02192 = new C0219(interfaceC04772, c0172, z4 ? 1 : 0, i3);
                    c2370.f11679 = r13;
                    c2370.f11675 = c0172;
                    c2370.f11677 = null;
                    c2370.f11682 = null;
                    c2370.f11680 = null;
                    c2370.f11681 = null;
                    c2370.f11678 = 4;
                    objM3955 = AbstractC2071.m3955(interfaceC2213M19602, c02192, c2370);
                    if (objM3955 != enumC1765) {
                        c01723 = c0172;
                        r22 = r13;
                        c1458 = (C1458) c01723.f997;
                        if (c1458 != null) {
                        }
                        return objM3955;
                    }
                    return enumC1765;
                } catch (Throwable th3) {
                    th = th3;
                    r132 = r13;
                    r2 = r132;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                c0172 = c01725;
                r132 = c1002;
                r2 = r132;
                throw th;
            }
        }
        if (i2 != 4) {
            C0188.m800("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c01723 = (C0172) c2370.f11675;
        C1002 c10022 = (C1002) c2370.f11679;
        try {
            AbstractC1544.m3189(objM3955);
            r22 = c10022;
            c1458 = (C1458) c01723.f997;
            if (c1458 != null) {
                if (!c1458.f6954) {
                    c1458.f6954 = true;
                    if (c1458.f6956.f10741.mo574()) {
                        AbstractC2328.m4335(c1458.f6956, "ROLLBACK TRANSACTION");
                    }
                }
                C2184 c21843 = c1458.f6956;
                c21843.f10739 = null;
                c21843.f10742 = null;
                r22.m2179(c21843);
            }
            return objM3955;
        } catch (Throwable th5) {
            c0172 = c01723;
            th = th5;
            r2 = c10022;
        }
        try {
            throw th;
        } finally {
        }
    }

    public C1208(C2133 c2133) {
        C0135 c0135 = AbstractC0848.f3910;
        this.f5498 = AbstractC1367.m2771(30, EnumC0426.SECONDS);
        C1002 c1002 = new C1002(1, new C1223(4, c2133));
        this.f5501 = c1002;
        this.f5503 = c1002;
    }
}
