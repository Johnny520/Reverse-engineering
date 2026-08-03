package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C0809St;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ApiResponse<T> {
    private static final InterfaceC0126Cx $cachedDescriptor = null;
    public static final Companion Companion = null;
    private final int code;
    private final T data;
    private final String message;
    private final String msg;

    public static final class Companion {
        private Companion() {
        }

        public final <T> InterfaceC0717Qm serializer(InterfaceC0717Qm r2) {
            return new ApiResponse$$serializer(r2);
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        C0809St r0 = new C0809St("io.github.cherrywechat.network.model.ApiResponse", null, 4);
        r0.m1614l("code");
        r0.m1614l("msg");
        r0.m1614l("message");
        r0.m1614l("data");
        $cachedDescriptor = r0;
    }

    public ApiResponse() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        Object r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResponse copy$default(ApiResponse r0, int r1, String r2, String r3, Object r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.code;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.msg;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.message;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.data;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public static final /* synthetic */ void write$Self$app_release(ApiResponse r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3, InterfaceC0717Qm r4) {
        if (r2.m1845g() == false) goto L6;
    L7:
        int r32 = r1.code;
        r2.m1843e();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        String r33 = r1.msg;
        r2.m1842d();
    L15:
        if (r2.m1845g() == false) goto L18;
    L19:
        String r34 = r1.message;
        r2.m1842d();
    L21:
        if (r2.m1845g() == false) goto L24;
    L25:
        T r12 = r1.data;
        r2.m1844f();
        return;
    L24:
        if (r1.data != null) goto L25;
        return;
    L18:
        if (AbstractC0585Nj.m1134a(r1.message, "") == true) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r1.msg, "") == true) goto L15;
    L6:
        if (r1.code == (-1)) goto L9;
        goto L7
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.msg;
    }

    public final String component3() {
        return this.message;
    }

    public final T component4() {
        return this.data;
    }

    public final ApiResponse<T> copy(int r2, String r3, String r4, T r5) {
        return new ApiResponse(r2, r3, r4, r5);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ApiResponse) == true) goto L8;
        return false;
    L8:
        ApiResponse r52 = (ApiResponse) r5;
        if (this.code == r52.code) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.msg, r52.msg) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.message, r52.message) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.data, r52.data) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        int r0 = Integer.hashCode(this.code) * 31;
        int r02 = AbstractC2374ph.m4810g(this.msg, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.message, r02, 31);
        T r1 = this.data;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r03 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ApiResponse(code=" + this.code + ", msg=" + this.msg + ", message=" + this.message + ", data=" + this.data + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ApiResponse(int r1, int r2, String r3, String r4, Object r5, AbstractC0298Gx r6) {
        if ((r1 & 1) != 0) goto L5;
        r2 = -1;
    L5:
        this.code = r2;
        if ((r1 & 2) != 0) goto L8;
        this.msg = "";
    L10:
        if ((r1 & 4) != 0) goto L12;
        this.message = "";
    L14:
        if ((r1 & 8) != 0) goto L17;
        this.data = null;
        return;
    L17:
        this.data = r5;
        return;
    L12:
        this.message = r4;
        goto L14
    L8:
        this.msg = r3;
        goto L10
    }

    public ApiResponse(int r1, String r2, String r3, T r4) {
        this.code = r1;
        this.msg = r2;
        this.message = r3;
        this.data = r4;
    }

    public /* synthetic */ ApiResponse(int r2, String r3, String r4, Object r5, int r6, AbstractC0621Oc r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = -1;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
