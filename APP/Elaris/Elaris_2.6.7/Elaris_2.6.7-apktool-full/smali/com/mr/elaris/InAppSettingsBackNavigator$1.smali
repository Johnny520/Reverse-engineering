.class Lcom/mr/elaris/InAppSettingsBackNavigator$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsBackNavigator;->registerBackCallback()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mr/elaris/InAppSettingsBackNavigator;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettingsBackNavigator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsBackNavigator$1;->this$0:Lcom/mr/elaris/InAppSettingsBackNavigator;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsBackNavigator$1;->this$0:Lcom/mr/elaris/InAppSettingsBackNavigator;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/mr/elaris/InAppSettingsBackNavigator;->a(Lcom/mr/elaris/InAppSettingsBackNavigator;)Lcom/mr/elaris/InAppSettings;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lcom/mr/elaris/InAppSettings;->handleBackCallbackInvocation(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
