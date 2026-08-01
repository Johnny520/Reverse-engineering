.class Lcom/mr/elaris/xposedcompat/XposedBridge$2;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$handle:Lio/github/libxposed/api/XposedInterface$HookHandle;


# direct methods
.method public constructor <init>(Lio/github/libxposed/api/XposedInterface$HookHandle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/xposedcompat/XposedBridge$2;->val$handle:Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/xposedcompat/XposedBridge$2;->val$handle:Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/github/libxposed/api/XposedInterface$HookHandle;->unhook()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
