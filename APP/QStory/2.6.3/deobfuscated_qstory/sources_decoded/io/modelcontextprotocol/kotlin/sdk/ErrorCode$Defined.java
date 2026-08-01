package io.modelcontextprotocol.kotlin.sdk;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;
import p056.C6631;
import p056.C6726;
import p056.InterfaceC6727;
import p087.C7109;
import p089.InterfaceC7181;
import p089.InterfaceC7184;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"io/modelcontextprotocol/kotlin/sdk/ErrorCode$Defined", "L飘花落叶言世子楪兰苏哲/飘花落叶言子苏楪兰世哲;", "", "Lio/modelcontextprotocol/kotlin/sdk/ErrorCode$Defined;", "", "code", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;II)V", "I", "getCode", "()I", "Companion", "飘花落叶言世子楪兰苏哲/飘花落叶言子苏楪世哲兰", "ConnectionClosed", "RequestTimeout", "ParseError", "InvalidRequest", "MethodNotFound", "InvalidParams", "InternalError", "kotlin-sdk"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ErrorCode$Defined implements InterfaceC6727 {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ ErrorCode$Defined[] $VALUES;
    private static final InterfaceC5184 $cachedSerializer$delegate;
    public static final C6726 Companion;
    private final int code;
    public static final ErrorCode$Defined ConnectionClosed = new ErrorCode$Defined("ConnectionClosed", 0, -1);
    public static final ErrorCode$Defined RequestTimeout = new ErrorCode$Defined("RequestTimeout", 1, -2);
    public static final ErrorCode$Defined ParseError = new ErrorCode$Defined("ParseError", 2, -32700);
    public static final ErrorCode$Defined InvalidRequest = new ErrorCode$Defined("InvalidRequest", 3, -32600);
    public static final ErrorCode$Defined MethodNotFound = new ErrorCode$Defined("MethodNotFound", 4, -32601);
    public static final ErrorCode$Defined InvalidParams = new ErrorCode$Defined("InvalidParams", 5, -32602);
    public static final ErrorCode$Defined InternalError = new ErrorCode$Defined("InternalError", 6, -32603);

    private static final /* synthetic */ ErrorCode$Defined[] $values() {
        return new ErrorCode$Defined[]{ConnectionClosed, RequestTimeout, ParseError, InvalidRequest, MethodNotFound, InvalidParams, InternalError};
    }

    static {
        ErrorCode$Defined[] errorCode$DefinedArr$values = $values();
        $VALUES = errorCode$DefinedArr$values;
        $ENTRIES = AbstractC4364.m8866(errorCode$DefinedArr$values);
        Companion = new C6726();
        $cachedSerializer$delegate = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(4));
    }

    private ErrorCode$Defined(String str, int i, int i2) {
        this.code = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7184 _init_$_anonymous_() {
        ErrorCode$Defined[] errorCode$DefinedArrValues = values();
        errorCode$DefinedArrValues.getClass();
        return new C7109("io.modelcontextprotocol.kotlin.sdk.ErrorCode.Defined", errorCode$DefinedArrValues);
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static ErrorCode$Defined valueOf(String str) {
        return (ErrorCode$Defined) Enum.valueOf(ErrorCode$Defined.class, str);
    }

    public static ErrorCode$Defined[] values() {
        return (ErrorCode$Defined[]) $VALUES.clone();
    }

    @Override // p056.InterfaceC6727
    public int getCode() {
        return this.code;
    }
}
