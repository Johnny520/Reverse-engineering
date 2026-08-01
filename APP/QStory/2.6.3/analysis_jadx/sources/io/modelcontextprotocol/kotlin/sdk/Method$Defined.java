package io.modelcontextprotocol.kotlin.sdk;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.AbstractC4364;
import kotlin.enums.InterfaceC4365;
import net.bytebuddy.description.method.MethodDescription;
import p056.C6631;
import p056.C6824;
import p056.InterfaceC6816;
import p087.C7109;
import p089.InterfaceC7181;
import p089.InterfaceC7184;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b!\b\u0087\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"io/modelcontextprotocol/kotlin/sdk/Method$Defined", "L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;", "", "Lio/modelcontextprotocol/kotlin/sdk/Method$Defined;", "", "value", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "飘花落叶言世子楪兰苏哲/飘花落叶言楪子苏兰哲世", "Initialize", "Ping", "ResourcesList", "ResourcesTemplatesList", "ResourcesRead", "ResourcesSubscribe", "ResourcesUnsubscribe", "PromptsList", "PromptsGet", "NotificationsCancelled", "NotificationsInitialized", "NotificationsProgress", "NotificationsMessage", "NotificationsResourcesUpdated", "NotificationsResourcesListChanged", "NotificationsToolsListChanged", "NotificationsRootsListChanged", "NotificationsPromptsListChanged", "ToolsList", "ToolsCall", "LoggingSetLevel", "SamplingCreateMessage", "CompletionComplete", "RootsList", "kotlin-sdk"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Method$Defined implements InterfaceC6816 {
    private static final /* synthetic */ InterfaceC4365 $ENTRIES;
    private static final /* synthetic */ Method$Defined[] $VALUES;
    private static final InterfaceC5184 $cachedSerializer$delegate;
    public static final C6824 Companion;
    private final String value;
    public static final Method$Defined Initialize = new Method$Defined("Initialize", 0, "initialize");
    public static final Method$Defined Ping = new Method$Defined("Ping", 1, "ping");
    public static final Method$Defined ResourcesList = new Method$Defined("ResourcesList", 2, "resources/list");
    public static final Method$Defined ResourcesTemplatesList = new Method$Defined("ResourcesTemplatesList", 3, "resources/templates/list");
    public static final Method$Defined ResourcesRead = new Method$Defined("ResourcesRead", 4, "resources/read");
    public static final Method$Defined ResourcesSubscribe = new Method$Defined("ResourcesSubscribe", 5, "resources/subscribe");
    public static final Method$Defined ResourcesUnsubscribe = new Method$Defined("ResourcesUnsubscribe", 6, "resources/unsubscribe");
    public static final Method$Defined PromptsList = new Method$Defined("PromptsList", 7, "prompts/list");
    public static final Method$Defined PromptsGet = new Method$Defined("PromptsGet", 8, "prompts/get");
    public static final Method$Defined NotificationsCancelled = new Method$Defined("NotificationsCancelled", 9, "notifications/cancelled");
    public static final Method$Defined NotificationsInitialized = new Method$Defined("NotificationsInitialized", 10, "notifications/initialized");
    public static final Method$Defined NotificationsProgress = new Method$Defined("NotificationsProgress", 11, "notifications/progress");
    public static final Method$Defined NotificationsMessage = new Method$Defined("NotificationsMessage", 12, "notifications/message");
    public static final Method$Defined NotificationsResourcesUpdated = new Method$Defined("NotificationsResourcesUpdated", 13, "notifications/resources/updated");
    public static final Method$Defined NotificationsResourcesListChanged = new Method$Defined("NotificationsResourcesListChanged", 14, "notifications/resources/list_changed");
    public static final Method$Defined NotificationsToolsListChanged = new Method$Defined("NotificationsToolsListChanged", 15, "notifications/tools/list_changed");
    public static final Method$Defined NotificationsRootsListChanged = new Method$Defined("NotificationsRootsListChanged", 16, "notifications/roots/list_changed");
    public static final Method$Defined NotificationsPromptsListChanged = new Method$Defined("NotificationsPromptsListChanged", 17, "notifications/prompts/list_changed");
    public static final Method$Defined ToolsList = new Method$Defined("ToolsList", 18, "tools/list");
    public static final Method$Defined ToolsCall = new Method$Defined("ToolsCall", 19, "tools/call");
    public static final Method$Defined LoggingSetLevel = new Method$Defined("LoggingSetLevel", 20, "logging/setLevel");
    public static final Method$Defined SamplingCreateMessage = new Method$Defined("SamplingCreateMessage", 21, "sampling/createMessage");
    public static final Method$Defined CompletionComplete = new Method$Defined("CompletionComplete", 22, "completion/complete");
    public static final Method$Defined RootsList = new Method$Defined("RootsList", 23, "roots/list");

    private static final /* synthetic */ Method$Defined[] $values() {
        return new Method$Defined[]{Initialize, Ping, ResourcesList, ResourcesTemplatesList, ResourcesRead, ResourcesSubscribe, ResourcesUnsubscribe, PromptsList, PromptsGet, NotificationsCancelled, NotificationsInitialized, NotificationsProgress, NotificationsMessage, NotificationsResourcesUpdated, NotificationsResourcesListChanged, NotificationsToolsListChanged, NotificationsRootsListChanged, NotificationsPromptsListChanged, ToolsList, ToolsCall, LoggingSetLevel, SamplingCreateMessage, CompletionComplete, RootsList};
    }

    static {
        Method$Defined[] method$DefinedArr$values = $values();
        $VALUES = method$DefinedArr$values;
        $ENTRIES = AbstractC4364.m8866(method$DefinedArr$values);
        Companion = new C6824();
        $cachedSerializer$delegate = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(17));
    }

    private Method$Defined(String str, int i, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7184 _init_$_anonymous_() {
        Method$Defined[] method$DefinedArrValues = values();
        method$DefinedArrValues.getClass();
        return new C7109("io.modelcontextprotocol.kotlin.sdk.Method.Defined", method$DefinedArrValues);
    }

    public static InterfaceC4365 getEntries() {
        return $ENTRIES;
    }

    public static Method$Defined valueOf(String str) {
        return (Method$Defined) Enum.valueOf(Method$Defined.class, str);
    }

    public static Method$Defined[] values() {
        return (Method$Defined[]) $VALUES.clone();
    }

    @Override // p056.InterfaceC6816
    public String getValue() {
        return this.value;
    }
}
