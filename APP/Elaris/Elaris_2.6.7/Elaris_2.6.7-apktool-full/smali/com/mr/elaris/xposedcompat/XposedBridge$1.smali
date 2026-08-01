.class Lcom/mr/elaris/xposedcompat/XposedBridge$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lio/github/libxposed/api/XposedInterface$Hooker;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$callback:Lcom/mr/elaris/xposedcompat/XC_MethodHook;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/xposedcompat/XC_MethodHook;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/xposedcompat/XposedBridge$1;->val$callback:Lcom/mr/elaris/xposedcompat/XC_MethodHook;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public intercept(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/xposedcompat/XposedBridge$1;->val$callback:Lcom/mr/elaris/xposedcompat/XC_MethodHook;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->a(Lio/github/libxposed/api/XposedInterface$Chain;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
