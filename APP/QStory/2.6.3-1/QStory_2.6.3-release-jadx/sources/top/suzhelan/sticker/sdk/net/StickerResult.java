package top.suzhelan.sticker.sdk.net;

import androidx.activity.AbstractC0900;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0013J>\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m151d2 = {"Ltop/suzhelan/sticker/sdk/net/StickerResult;", "T", "", "status", "", "message", "", "timestamp", "", "data", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/String;JLjava/lang/Object;)V", "getStatus", "()I", "getMessage", "()Ljava/lang/String;", "getTimestamp", "()J", "getData", "()Ljava/lang/Object;", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, "isSuccess", "", "isError", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;JLjava/lang/Object;)Ltop/suzhelan/sticker/sdk/net/StickerResult;", "equals", "other", "hashCode", "toString", "online-sticker-sdk_release"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final /* data */ class StickerResult<T> {
    private final T data;
    private final String message;
    private final int status;
    private final long timestamp;

    public StickerResult(int i, String str, long j, T t) {
        str.getClass();
        this.status = i;
        this.message = str;
        this.timestamp = j;
        this.data = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickerResult copy$default(StickerResult stickerResult, int i, String str, long j, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = stickerResult.status;
        }
        if ((i2 & 2) != 0) {
            str = stickerResult.message;
        }
        if ((i2 & 4) != 0) {
            j = stickerResult.timestamp;
        }
        if ((i2 & 8) != 0) {
            obj = stickerResult.data;
        }
        Object obj3 = obj;
        return stickerResult.copy(i, str, j, obj3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final T component4() {
        return this.data;
    }

    public final StickerResult<T> copy(int status, String message, long timestamp, T data) {
        message.getClass();
        return new StickerResult<>(status, message, timestamp, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickerResult)) {
            return false;
        }
        StickerResult stickerResult = (StickerResult) other;
        return this.status == stickerResult.status && AbstractC5227.m9466(this.message, stickerResult.message) && this.timestamp == stickerResult.timestamp && AbstractC5227.m9466(this.data, stickerResult.data);
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

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iM702 = AbstractC0900.m702(AbstractC7012.m12131(Integer.hashCode(this.status) * 31, 31, this.message), 31, this.timestamp);
        T t = this.data;
        return iM702 + (t == null ? 0 : t.hashCode());
    }

    public final boolean isError() {
        return this.status != 0;
    }

    public final boolean isSuccess() {
        return this.status == 0;
    }

    public String toString() {
        return "StickerResult(status=" + this.status + ", message=" + this.message + ", timestamp=" + this.timestamp + ", data=" + this.data + ")";
    }
}
