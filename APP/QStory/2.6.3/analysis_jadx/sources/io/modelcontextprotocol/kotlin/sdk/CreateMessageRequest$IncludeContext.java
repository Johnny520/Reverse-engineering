package io.modelcontextprotocol.kotlin.sdk;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;
import p056.C6620;
import p056.C6631;
import p087.C7109;
import p089.InterfaceC7181;
import p089.InterfaceC7184;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"io/modelcontextprotocol/kotlin/sdk/CreateMessageRequest$IncludeContext", "", "Lio/modelcontextprotocol/kotlin/sdk/CreateMessageRequest$IncludeContext;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Companion", "飘花落叶言世子楪兰苏哲/飘花落叶言子世哲楪苏兰", "none", "thisServer", "allServers", "kotlin-sdk"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CreateMessageRequest$IncludeContext {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ CreateMessageRequest$IncludeContext[] $VALUES;
    private static final InterfaceC5184 $cachedSerializer$delegate;
    public static final C6620 Companion;
    public static final CreateMessageRequest$IncludeContext none = new CreateMessageRequest$IncludeContext("none", 0);
    public static final CreateMessageRequest$IncludeContext thisServer = new CreateMessageRequest$IncludeContext("thisServer", 1);
    public static final CreateMessageRequest$IncludeContext allServers = new CreateMessageRequest$IncludeContext("allServers", 2);

    private static final /* synthetic */ CreateMessageRequest$IncludeContext[] $values() {
        return new CreateMessageRequest$IncludeContext[]{none, thisServer, allServers};
    }

    static {
        CreateMessageRequest$IncludeContext[] createMessageRequest$IncludeContextArr$values = $values();
        $VALUES = createMessageRequest$IncludeContextArr$values;
        $ENTRIES = AbstractC4364.m8866(createMessageRequest$IncludeContextArr$values);
        Companion = new C6620();
        $cachedSerializer$delegate = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(2));
    }

    private CreateMessageRequest$IncludeContext(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7184 _init_$_anonymous_() {
        CreateMessageRequest$IncludeContext[] createMessageRequest$IncludeContextArrValues = values();
        createMessageRequest$IncludeContextArrValues.getClass();
        return new C7109("io.modelcontextprotocol.kotlin.sdk.CreateMessageRequest.IncludeContext", createMessageRequest$IncludeContextArrValues);
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static CreateMessageRequest$IncludeContext valueOf(String str) {
        return (CreateMessageRequest$IncludeContext) Enum.valueOf(CreateMessageRequest$IncludeContext.class, str);
    }

    public static CreateMessageRequest$IncludeContext[] values() {
        return (CreateMessageRequest$IncludeContext[]) $VALUES.clone();
    }
}
