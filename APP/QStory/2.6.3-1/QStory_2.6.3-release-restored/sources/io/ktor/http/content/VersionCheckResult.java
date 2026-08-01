package io.ktor.http.content;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;
import p252.C8926;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m151d2 = {"Lio/ktor/http/content/VersionCheckResult;", "", "L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;", "statusCode", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IL飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;)V", "L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;", "getStatusCode", "()L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;", "OK", "NOT_MODIFIED", "PRECONDITION_FAILED", "ktor-http"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class VersionCheckResult {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ VersionCheckResult[] $VALUES;
    public static final VersionCheckResult NOT_MODIFIED;

    /* JADX INFO: renamed from: OK */
    public static final VersionCheckResult f295OK;
    public static final VersionCheckResult PRECONDITION_FAILED;
    private final C8926 statusCode;

    private static final /* synthetic */ VersionCheckResult[] $values() {
        return new VersionCheckResult[]{f295OK, NOT_MODIFIED, PRECONDITION_FAILED};
    }

    static {
        C8926 c8926 = C8926.f22702;
        f295OK = new VersionCheckResult("OK", 0, C8926.f22696);
        NOT_MODIFIED = new VersionCheckResult("NOT_MODIFIED", 1, C8926.f22701);
        PRECONDITION_FAILED = new VersionCheckResult("PRECONDITION_FAILED", 2, C8926.f22686);
        VersionCheckResult[] versionCheckResultArr$values = $values();
        $VALUES = versionCheckResultArr$values;
        $ENTRIES = AbstractC5196.m9425(versionCheckResultArr$values);
    }

    private VersionCheckResult(String str, int i, C8926 c8926) {
        this.statusCode = c8926;
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static VersionCheckResult valueOf(String str) {
        return (VersionCheckResult) Enum.valueOf(VersionCheckResult.class, str);
    }

    public static VersionCheckResult[] values() {
        return (VersionCheckResult[]) $VALUES.clone();
    }

    public final C8926 getStatusCode() {
        return this.statusCode;
    }
}
