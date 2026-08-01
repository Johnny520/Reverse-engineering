package io.ktor.http.content;

import kotlin.Metadata;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import net.bytebuddy.description.method.MethodDescription;
import p236.C8096;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/content/VersionCheckResult;", "", "L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;", "statusCode", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IL飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;)V", "L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;", "getStatusCode", "()L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;", "OK", "NOT_MODIFIED", "PRECONDITION_FAILED", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VersionCheckResult {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ VersionCheckResult[] $VALUES;
    public static final VersionCheckResult NOT_MODIFIED;
    public static final VersionCheckResult OK;
    public static final VersionCheckResult PRECONDITION_FAILED;
    private final C8096 statusCode;

    private static final /* synthetic */ VersionCheckResult[] $values() {
        return new VersionCheckResult[]{OK, NOT_MODIFIED, PRECONDITION_FAILED};
    }

    static {
        C8096 c8096 = C8096.f22359;
        OK = new VersionCheckResult("OK", 0, C8096.f22353);
        NOT_MODIFIED = new VersionCheckResult("NOT_MODIFIED", 1, C8096.f22358);
        PRECONDITION_FAILED = new VersionCheckResult("PRECONDITION_FAILED", 2, C8096.f22343);
        VersionCheckResult[] versionCheckResultArr$values = $values();
        $VALUES = versionCheckResultArr$values;
        $ENTRIES = AbstractC4363.m8876(versionCheckResultArr$values);
    }

    private VersionCheckResult(String str, int i, C8096 c8096) {
        this.statusCode = c8096;
    }

    public static InterfaceC4364 getEntries() {
        return $ENTRIES;
    }

    public static VersionCheckResult valueOf(String str) {
        return (VersionCheckResult) Enum.valueOf(VersionCheckResult.class, str);
    }

    public static VersionCheckResult[] values() {
        return (VersionCheckResult[]) $VALUES.clone();
    }

    public final C8096 getStatusCode() {
        return this.statusCode;
    }
}
