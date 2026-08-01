package top.suzhelan.plugin.sdk.online.net;

import androidx.activity.AbstractC0053;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J4\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Ltop/suzhelan/plugin/sdk/online/net/QSResult;", "T", "", "status", "", "data", "message", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/Object;Ljava/lang/String;)V", "getStatus", "()I", "getData", "()Ljava/lang/Object;", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, "getMessage", "()Ljava/lang/String;", "isSuccess", "", "isError", "component1", "component2", "component3", "copy", "(ILjava/lang/Object;Ljava/lang/String;)Ltop/suzhelan/plugin/sdk/online/net/QSResult;", "equals", "other", "hashCode", "toString", "online-plugin-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class QSResult<T> {
    private final T data;
    private final String message;
    private final int status;

    public QSResult(int i, T t, String str) {
        str.getClass();
        this.status = i;
        this.data = t;
        this.message = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QSResult copy$default(QSResult qSResult, int i, Object obj, String str, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = qSResult.status;
        }
        if ((i2 & 2) != 0) {
            obj = qSResult.data;
        }
        if ((i2 & 4) != 0) {
            str = qSResult.message;
        }
        return qSResult.copy(i, obj, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final T component2() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final QSResult<T> copy(int status, T data, String message) {
        message.getClass();
        return new QSResult<>(status, data, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QSResult)) {
            return false;
        }
        QSResult qSResult = (QSResult) other;
        return this.status == qSResult.status && AbstractC4394.m8917(this.data, qSResult.data) && AbstractC4394.m8917(this.message, qSResult.message);
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.status) * 31;
        T t = this.data;
        return this.message.hashCode() + ((iHashCode + (t == null ? 0 : t.hashCode())) * 31);
    }

    public final boolean isError() {
        return this.status != 200;
    }

    public final boolean isSuccess() {
        return this.status == 200;
    }

    public String toString() {
        int i = this.status;
        T t = this.data;
        String str = this.message;
        StringBuilder sb = new StringBuilder("QSResult(status=");
        sb.append(i);
        sb.append(", data=");
        sb.append(t);
        sb.append(", message=");
        return AbstractC0053.m146(sb, str, ")");
    }
}
