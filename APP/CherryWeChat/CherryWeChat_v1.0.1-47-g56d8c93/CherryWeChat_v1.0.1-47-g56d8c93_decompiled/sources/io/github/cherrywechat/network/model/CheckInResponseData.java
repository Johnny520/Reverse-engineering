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
    public static final Companion Companion = new Companion(null);
    private final String msg;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return CheckInResponseData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckInResponseData() {
        this((String) null, 1, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ CheckInResponseData copy$default(CheckInResponseData checkInResponseData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkInResponseData.msg;
        }
        return checkInResponseData.copy(str);
    }

    public static final /* synthetic */ void write$Self$app_release(CheckInResponseData checkInResponseData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(checkInResponseData.msg, "")) {
            return;
        }
        String str = checkInResponseData.msg;
        interfaceC0962Wa.m1842d();
    }

    public final String component1() {
        return this.msg;
    }

    public final CheckInResponseData copy(String str) {
        return new CheckInResponseData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckInResponseData) && AbstractC0585Nj.m1134a(this.msg, ((CheckInResponseData) obj).msg);
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

    public /* synthetic */ CheckInResponseData(int i, String str, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.msg = "";
        } else {
            this.msg = str;
        }
    }

    public CheckInResponseData(String str) {
        this.msg = str;
    }

    public /* synthetic */ CheckInResponseData(String str, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str);
    }
}
