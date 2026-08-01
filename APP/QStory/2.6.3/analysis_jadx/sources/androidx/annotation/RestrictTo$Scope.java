package androidx.annotation;

import kotlin.InterfaceC5169;
import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"androidx/annotation/RestrictTo$Scope", "", "Landroidx/annotation/RestrictTo$Scope;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "LIBRARY", "LIBRARY_GROUP", "LIBRARY_GROUP_PREFIX", "GROUP_ID", "TESTS", "SUBCLASSES", "annotation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RestrictTo$Scope {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ RestrictTo$Scope[] $VALUES;
    public static final RestrictTo$Scope LIBRARY = new RestrictTo$Scope("LIBRARY", 0);
    public static final RestrictTo$Scope LIBRARY_GROUP = new RestrictTo$Scope("LIBRARY_GROUP", 1);
    public static final RestrictTo$Scope LIBRARY_GROUP_PREFIX = new RestrictTo$Scope("LIBRARY_GROUP_PREFIX", 2);

    @InterfaceC5169
    public static final RestrictTo$Scope GROUP_ID = new RestrictTo$Scope("GROUP_ID", 3);
    public static final RestrictTo$Scope TESTS = new RestrictTo$Scope("TESTS", 4);
    public static final RestrictTo$Scope SUBCLASSES = new RestrictTo$Scope("SUBCLASSES", 5);

    private static final /* synthetic */ RestrictTo$Scope[] $values() {
        return new RestrictTo$Scope[]{LIBRARY, LIBRARY_GROUP, LIBRARY_GROUP_PREFIX, GROUP_ID, TESTS, SUBCLASSES};
    }

    static {
        RestrictTo$Scope[] restrictTo$ScopeArr$values = $values();
        $VALUES = restrictTo$ScopeArr$values;
        $ENTRIES = AbstractC4364.m8866(restrictTo$ScopeArr$values);
    }

    private RestrictTo$Scope(String str, int i) {
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static RestrictTo$Scope valueOf(String str) {
        return (RestrictTo$Scope) Enum.valueOf(RestrictTo$Scope.class, str);
    }

    public static RestrictTo$Scope[] values() {
        return (RestrictTo$Scope[]) $VALUES.clone();
    }
}
