.class public final Lcom/mr/elaris/e;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/mr/elaris/e;->a:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/mr/elaris/HookEntry;->a()Lcom/mr/elaris/HookConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "block_avatar_pendant"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object p0, p0, Lcom/mr/elaris/e;->a:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, Lv4;->u(Ljava/lang/ClassLoader;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {}, Lcom/mr/elaris/HookEntry;->a()Lcom/mr/elaris/HookConfig;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "block_profile_card_decor"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-static {p0}, Lv4;->w(Ljava/lang/ClassLoader;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-static {}, Lcom/mr/elaris/HookEntry;->a()Lcom/mr/elaris/HookConfig;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "allow_forbid_card"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/mr/elaris/HookConfig;->bool(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-static {p0}, Lv4;->r(Ljava/lang/ClassLoader;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
.end method
