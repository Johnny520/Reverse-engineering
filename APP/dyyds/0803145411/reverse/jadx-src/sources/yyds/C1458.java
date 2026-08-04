package yyds;

import android.database.SQLException;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛶᲇᲈᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1458 implements InterfaceC2684, InterfaceC1851 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public volatile boolean f6954;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1586 f6955;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2184 f6956;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f6957;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0217 f6958 = new C0217();

    public C1458(C1586 c1586, C2184 c2184, boolean z) {
        this.f6955 = c1586;
        this.f6956 = c2184;
        this.f6957 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2965(EnumC2065 enumC2065, AbstractC1320 abstractC1320) throws Throwable {
        C0650 c0650;
        C2184 c2184;
        C0217 c0217 = this.f6958;
        if (abstractC1320 instanceof C0650) {
            c0650 = (C0650) abstractC1320;
            int i = c0650.f3135;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0650.f3135 = i - Integer.MIN_VALUE;
            } else {
                c0650 = new C0650(this, abstractC1320);
            }
        }
        Object obj = c0650.f3132;
        int i2 = c0650.f3135;
        C2184 c21842 = this.f6956;
        if (i2 == 0) {
            AbstractC1544.m3189(obj);
            c0650.f3136 = enumC2065;
            c0650.f3134 = c21842;
            c0650.f3135 = 1;
            Object objMo2252 = c21842.f10743.mo2252(c0650);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            if (objMo2252 == enumC1765) {
                return enumC1765;
            }
            c2184 = c21842;
        } else {
            if (i2 != 1) {
                C0188.m800("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C2184 c21843 = c0650.f3134;
            EnumC2065 enumC20652 = c0650.f3136;
            AbstractC1544.m3189(obj);
            c2184 = c21843;
            enumC2065 = enumC20652;
        }
        try {
            int i3 = c0217.f1227;
            if (c0217.isEmpty()) {
                int iOrdinal = enumC2065.ordinal();
                if (iOrdinal == 0) {
                    AbstractC2328.m4335(c21842, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    AbstractC2328.m4335(c21842, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new C1738();
                    }
                    AbstractC2328.m4335(c21842, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                AbstractC2328.m4335(c21842, "SAVEPOINT '" + i3 + '\'');
            }
            c0217.addLast(new C1805(i3));
            C2746 c2746 = C2746.f13459;
            c2184.mo2251(null);
            return c2746;
        } catch (Throwable th) {
            c2184.mo2251(null);
            throw th;
        }
    }

    @Override // yyds.InterfaceC2684
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Boolean mo2546(InterfaceC0274 interfaceC0274) {
        if (this.f6954) {
            AbstractC2328.m4346(21, "Connection is recycled");
            throw null;
        }
        C1978 c1978 = (C1978) ((AbstractC1320) interfaceC0274).f6070.mo423(this.f6955);
        if (c1978 != null && c1978.f9917 == this) {
            return Boolean.valueOf(!this.f6958.isEmpty() || this.f6956.f10741.mo574());
        }
        AbstractC2328.m4346(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // yyds.InterfaceC1851
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final InterfaceC0124 mo885() {
        return this.f6956;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2966(EnumC2065 enumC2065, InterfaceC0477 interfaceC0477, AbstractC1320 abstractC1320) throws Throwable {
        C2194 c2194;
        SQLException e;
        Throwable th;
        int i;
        if (abstractC1320 instanceof C2194) {
            c2194 = (C2194) abstractC1320;
            int i2 = c2194.f10771;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2194.f10771 = i2 - Integer.MIN_VALUE;
            } else {
                c2194 = new C2194(this, abstractC1320);
            }
        }
        Object objMo511 = c2194.f10769;
        int i3 = c2194.f10771;
        Object obj = EnumC1765.f8858;
        try {
            if (i3 == 0) {
                AbstractC1544.m3189(objMo511);
                if (enumC2065 == null) {
                    enumC2065 = EnumC2065.f10216;
                }
                c2194.f10773 = interfaceC0477;
                c2194.f10771 = 1;
                if (m2965(enumC2065, c2194) != obj) {
                }
            }
            if (i3 == 1) {
                interfaceC0477 = (InterfaceC0477) c2194.f10773;
                AbstractC1544.m3189(objMo511);
            } else {
                if (i3 == 2) {
                    i = c2194.f10768;
                    AbstractC1544.m3189(objMo511);
                    boolean z = i != 0;
                    c2194.f10773 = objMo511;
                    c2194.f10771 = 3;
                    return m2967(z, c2194) != obj ? obj : objMo511;
                }
                if (i3 == 3 || i3 == 4) {
                    Object obj2 = c2194.f10773;
                    AbstractC1544.m3189(objMo511);
                    return obj2;
                }
                if (i3 != 5) {
                    C0188.m800("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = c2194.f10770;
                th = (Throwable) c2194.f10773;
                try {
                    AbstractC1544.m3189(objMo511);
                    throw th;
                } catch (SQLException e2) {
                    e = e2;
                    if (th != null) {
                    }
                }
            }
            C0236 c0236 = new C0236(1, this);
            c2194.f10773 = null;
            c2194.f10768 = 1;
            c2194.f10771 = 2;
            objMo511 = interfaceC0477.mo511(c0236, c2194);
            if (objMo511 != obj) {
                i = 1;
                if (i != 0) {
                }
                c2194.f10773 = objMo511;
                c2194.f10771 = 3;
                if (m2967(z, c2194) != obj) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    c2194.f10773 = th;
                    c2194.f10770 = th3;
                    c2194.f10771 = 5;
                    if (m2967(false, c2194) != obj) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    AbstractC1579.m3235(th, e);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // yyds.InterfaceC2349
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo886(String str, InterfaceC1549 interfaceC1549, AbstractC1320 abstractC1320) throws Throwable {
        C1910 c1910;
        C2184 c2184;
        if (abstractC1320 instanceof C1910) {
            c1910 = (C1910) abstractC1320;
            int i = c1910.f9652;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1910.f9652 = i - Integer.MIN_VALUE;
            } else {
                c1910 = new C1910(this, abstractC1320);
            }
        }
        Object obj = c1910.f9650;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        int i2 = c1910.f9652;
        if (i2 == 0) {
            AbstractC1544.m3189(obj);
            if (this.f6954) {
                AbstractC2328.m4346(21, "Connection is recycled");
                throw null;
            }
            C1978 c1978 = (C1978) c1910.f6070.mo423(this.f6955);
            if (c1978 == null || c1978.f9917 != this) {
                AbstractC2328.m4346(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            c2184 = this.f6956;
            c1910.f9654 = str;
            c1910.f9651 = interfaceC1549;
            c1910.f9649 = c2184;
            c1910.f9652 = 1;
            if (c2184.f10743.mo2252(c1910) == enumC1765) {
                return enumC1765;
            }
        } else {
            if (i2 != 1) {
                C0188.m800("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C2184 c21842 = c1910.f9649;
            interfaceC1549 = c1910.f9651;
            String str2 = c1910.f9654;
            AbstractC1544.m3189(obj);
            c2184 = c21842;
            str = str2;
        }
        try {
            C0065 c0065 = new C0065(this, this.f6956.mo575(str));
            try {
                Object objMo371 = interfaceC1549.mo371(c0065);
                AbstractC0797.m1819(c0065, null);
                return objMo371;
            } finally {
            }
        } finally {
            c2184.mo2251(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2967(boolean z, AbstractC1320 abstractC1320) throws Throwable {
        C2037 c2037;
        C2184 c2184;
        C0217 c0217 = this.f6958;
        if (abstractC1320 instanceof C2037) {
            c2037 = (C2037) abstractC1320;
            int i = c2037.f10147;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2037.f10147 = i - Integer.MIN_VALUE;
            } else {
                c2037 = new C2037(this, abstractC1320);
            }
        }
        Object obj = c2037.f10144;
        int i2 = c2037.f10147;
        C2184 c21842 = this.f6956;
        if (i2 == 0) {
            AbstractC1544.m3189(obj);
            c2037.f10146 = c21842;
            c2037.f10148 = z;
            c2037.f10147 = 1;
            Object objMo2252 = c21842.f10743.mo2252(c2037);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            if (objMo2252 == enumC1765) {
                return enumC1765;
            }
            c2184 = c21842;
        } else {
            if (i2 != 1) {
                C0188.m800("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = c2037.f10148;
            c2184 = c2037.f10146;
            AbstractC1544.m3189(obj);
        }
        try {
            if (c0217.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            if (c0217.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            C1805 c1805 = (C1805) c0217.remove(AbstractC2725.m4850(c0217));
            if (z) {
                c1805.getClass();
                if (c0217.isEmpty()) {
                    AbstractC2328.m4335(c21842, "END TRANSACTION");
                } else {
                    AbstractC2328.m4335(c21842, "RELEASE SAVEPOINT '" + c1805.f9077 + '\'');
                }
            } else if (c0217.isEmpty()) {
                AbstractC2328.m4335(c21842, "ROLLBACK TRANSACTION");
            } else {
                AbstractC2328.m4335(c21842, "ROLLBACK TRANSACTION TO SAVEPOINT '" + c1805.f9077 + '\'');
            }
            C2746 c2746 = C2746.f13459;
            c2184.mo2251(null);
            return c2746;
        } catch (Throwable th) {
            c2184.mo2251(null);
            throw th;
        }
    }

    @Override // yyds.InterfaceC2684
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final Object mo2547(EnumC2065 enumC2065, InterfaceC0477 interfaceC0477, AbstractC1861 abstractC1861) {
        if (this.f6954) {
            AbstractC2328.m4346(21, "Connection is recycled");
            throw null;
        }
        C1978 c1978 = (C1978) abstractC1861.f6070.mo423(this.f6955);
        if (c1978 != null && c1978.f9917 == this) {
            return m2966(enumC2065, interfaceC0477, abstractC1861);
        }
        AbstractC2328.m4346(21, "Attempted to use connection on a different coroutine");
        throw null;
    }
}
