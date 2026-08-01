.class public final Lv3;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv3;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/16 p1, 0x48

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 1

    .line 1
    const-string v0, "clean_emoji_panel_entries"

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
    goto :goto_1

    .line 10
    :cond_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    instance-of v0, p1, Ljava/util/List;

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    check-cast p1, Ljava/util/List;

    .line 24
    .line 25
    invoke-static {p1}, Lz3;->f(Ljava/util/List;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-lez p1, :cond_3

    .line 30
    .line 31
    iget-object p0, p0, Lv3;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p0, p1}, Lz3;->b(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    :cond_3
    :goto_1
    return-void
.end method
