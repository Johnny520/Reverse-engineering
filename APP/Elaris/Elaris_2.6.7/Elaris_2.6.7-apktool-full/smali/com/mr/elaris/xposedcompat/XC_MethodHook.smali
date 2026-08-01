.class public abstract Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.super Lcom/mr/elaris/xposedcompat/callbacks/XCallback;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;,
        Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mr/elaris/xposedcompat/callbacks/XCallback;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/callbacks/XCallback;-><init>(I)V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 0

    .line 1
    return-void
.end method

.method public beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 0

    .line 1
    return-void
.end method
