.class public final Lcd;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-boolean p2, p0, Lcd;->a:Z

    .line 2
    .line 3
    iput-object p1, p0, Lcd;->b:Ljava/lang/String;

    .line 4
    .line 5
    const/16 p1, 0x54

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 2

    .line 1
    const-string v0, "media_click_to_load"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-boolean p1, p0, Lcd;->a:Z

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const-string p1, "aio_predownload_register_blocked"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string p1, "aio_predownload_message_blocked"

    .line 22
    .line 23
    :goto_0
    const-string v1, "debug_log"

    .line 24
    .line 25
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_2
    iget-object p0, p0, Lcd;->b:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p1, p0, v0}, Led;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/StackTraceElement;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
