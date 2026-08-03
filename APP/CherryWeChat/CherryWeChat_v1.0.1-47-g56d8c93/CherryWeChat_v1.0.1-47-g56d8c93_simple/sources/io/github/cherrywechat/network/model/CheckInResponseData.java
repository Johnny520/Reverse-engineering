package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class CheckInResponseData {
    public static final Companion Companion = null;
    private final String msg;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return CheckInResponseData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckInResponseData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CheckInResponseData copy$default(CheckInResponseData r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.msg;
    L6:
        return r0.copy(r1);
    }

    public static final /* synthetic */ void write$Self$app_release(CheckInResponseData r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        String r12 = r1.msg;
        r2.m1842d();
        return;
    L6:
        if (AbstractC0585Nj.m1134a(r1.msg, "") == false) goto L7;
    }

    public final String component1() {
        return this.msg;
    }

    public final CheckInResponseData copy(String r2) {
        return new CheckInResponseData(r2);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof CheckInResponseData) == true) goto L9;
        return false;
    L9:
        if (AbstractC0585Nj.m1134a(this.msg, ((CheckInResponseData) r4).msg) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        return this.msg.hashCode();
    }

    public String toString() {
        return AbstractC2374ph.m4815l(new StringBuilder("CheckInResponseData(msg="), this.msg, ')');
    }

    public /* synthetic */ CheckInResponseData(int r1, String r2, AbstractC0298Gx r3) {
        if ((r1 & 1) != 0) goto L6;
        this.msg = "";
        return;
    L6:
        this.msg = r2;
    }

    public CheckInResponseData(String r1) {
        this.msg = r1;
    }

    public /* synthetic */ CheckInResponseData(String r1, int r2, AbstractC0621Oc r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
