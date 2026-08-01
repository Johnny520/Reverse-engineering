package io.modelcontextprotocol.kotlin.sdk;

import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;
import p072.C7449;
import p072.C7460;
import p103.C7938;
import p105.InterfaceC8010;
import p105.InterfaceC8013;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m151d2 = {"io/modelcontextprotocol/kotlin/sdk/CreateMessageRequest$IncludeContext", "", "Lio/modelcontextprotocol/kotlin/sdk/CreateMessageRequest$IncludeContext;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Companion", "飘花落叶言世子楪兰苏哲/飘花落叶言子世哲楪苏兰", "none", "thisServer", "allServers", "kotlin-sdk"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class CreateMessageRequest$IncludeContext {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ CreateMessageRequest$IncludeContext[] $VALUES;
    private static final InterfaceC6016 $cachedSerializer$delegate;
    public static final C7449 Companion;
    public static final CreateMessageRequest$IncludeContext none = new CreateMessageRequest$IncludeContext("none", 0);
    public static final CreateMessageRequest$IncludeContext thisServer = new CreateMessageRequest$IncludeContext("thisServer", 1);
    public static final CreateMessageRequest$IncludeContext allServers = new CreateMessageRequest$IncludeContext("allServers", 2);

    private static final /* synthetic */ CreateMessageRequest$IncludeContext[] $values() {
        return new CreateMessageRequest$IncludeContext[]{none, thisServer, allServers};
    }

    static {
        CreateMessageRequest$IncludeContext[] createMessageRequest$IncludeContextArr$values = $values();
        $VALUES = createMessageRequest$IncludeContextArr$values;
        $ENTRIES = AbstractC5196.m9425(createMessageRequest$IncludeContextArr$values);
        Companion = new C7449();
        $cachedSerializer$delegate = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(2));
    }

    private CreateMessageRequest$IncludeContext(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC8013 _init_$_anonymous_() {
        CreateMessageRequest$IncludeContext[] createMessageRequest$IncludeContextArrValues = values();
        createMessageRequest$IncludeContextArrValues.getClass();
        return new C7938("io.modelcontextprotocol.kotlin.sdk.CreateMessageRequest.IncludeContext", createMessageRequest$IncludeContextArrValues);
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static CreateMessageRequest$IncludeContext valueOf(String str) {
        return (CreateMessageRequest$IncludeContext) Enum.valueOf(CreateMessageRequest$IncludeContext.class, str);
    }

    public static CreateMessageRequest$IncludeContext[] values() {
        return (CreateMessageRequest$IncludeContext[]) $VALUES.clone();
    }
}
