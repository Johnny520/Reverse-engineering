.class public Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Unhook"
.end annotation


# instance fields
.field private final callback:Lcom/mr/elaris/xposedcompat/XC_MethodHook;

.field private final hookedMethod:Ljava/lang/reflect/Member;

.field private final unhookAction:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;->hookedMethod:Ljava/lang/reflect/Member;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;->callback:Lcom/mr/elaris/xposedcompat/XC_MethodHook;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;->unhookAction:Ljava/lang/Runnable;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getCallback()Lcom/mr/elaris/xposedcompat/XC_MethodHook;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;->callback:Lcom/mr/elaris/xposedcompat/XC_MethodHook;

    .line 2
    .line 3
    return-object p0
.end method

.method public getHookedMethod()Ljava/lang/reflect/Member;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;->hookedMethod:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    return-object p0
.end method

.method public unhook()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;->unhookAction:Ljava/lang/Runnable;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
