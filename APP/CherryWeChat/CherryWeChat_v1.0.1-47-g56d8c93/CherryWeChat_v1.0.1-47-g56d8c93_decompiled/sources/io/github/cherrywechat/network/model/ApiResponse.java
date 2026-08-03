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
    private static final InterfaceC0126Cx $cachedDescriptor;
    public static final Companion Companion = new Companion(null);
    private final int code;
    private final T data;
    private final String message;
    private final String msg;

    public static final class Companion {
        private Companion() {
        }

        public final <T> InterfaceC0717Qm serializer(InterfaceC0717Qm interfaceC0717Qm) {
            return new ApiResponse$$serializer(interfaceC0717Qm);
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    static {
        C0809St c0809St = new C0809St("io.github.cherrywechat.network.model.ApiResponse", null, 4);
        c0809St.m1614l("code");
        c0809St.m1614l("msg");
        c0809St.m1614l("message");
        c0809St.m1614l("data");
        $cachedDescriptor = c0809St;
    }

    public ApiResponse() {
        this(0, (String) null, (String) null, (Object) null, 15, (AbstractC0621Oc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResponse copy$default(ApiResponse apiResponse, int i, String str, String str2, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = apiResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = apiResponse.msg;
        }
        if ((i2 & 4) != 0) {
            str2 = apiResponse.message;
        }
        if ((i2 & 8) != 0) {
            obj = apiResponse.data;
        }
        return apiResponse.copy(i, str, str2, obj);
    }

    public static final /* synthetic */ void write$Self$app_release(ApiResponse apiResponse, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx, InterfaceC0717Qm interfaceC0717Qm) {
        if (interfaceC0962Wa.m1845g() || apiResponse.code != -1) {
            int i = apiResponse.code;
            interfaceC0962Wa.m1843e();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(apiResponse.msg, "")) {
            String str = apiResponse.msg;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(apiResponse.message, "")) {
            String str2 = apiResponse.message;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && apiResponse.data == null) {
            return;
        }
        T t = apiResponse.data;
        interfaceC0962Wa.m1844f();
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

    public final ApiResponse<T> copy(int i, String str, String str2, T t) {
        return new ApiResponse<>(i, str, str2, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiResponse)) {
            return false;
        }
        ApiResponse apiResponse = (ApiResponse) obj;
        return this.code == apiResponse.code && AbstractC0585Nj.m1134a(this.msg, apiResponse.msg) && AbstractC0585Nj.m1134a(this.message, apiResponse.message) && AbstractC0585Nj.m1134a(this.data, apiResponse.data);
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
        int iM4810g = AbstractC2374ph.m4810g(this.message, AbstractC2374ph.m4810g(this.msg, Integer.hashCode(this.code) * 31, 31), 31);
        T t = this.data;
        return iM4810g + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "ApiResponse(code=" + this.code + ", msg=" + this.msg + ", message=" + this.message + ", data=" + this.data + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ApiResponse(int i, int i2, String str, String str2, Object obj, AbstractC0298Gx abstractC0298Gx) {
        this.code = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.msg = "";
        } else {
            this.msg = str;
        }
        if ((i & 4) == 0) {
            this.message = "";
        } else {
            this.message = str2;
        }
        if ((i & 8) == 0) {
            this.data = null;
        } else {
            this.data = obj;
        }
    }

    public ApiResponse(int i, String str, String str2, T t) {
        this.code = i;
        this.msg = str;
        this.message = str2;
        this.data = t;
    }

    public /* synthetic */ ApiResponse(int i, String str, String str2, Object obj, int i2, AbstractC0621Oc abstractC0621Oc) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : obj);
    }
}
