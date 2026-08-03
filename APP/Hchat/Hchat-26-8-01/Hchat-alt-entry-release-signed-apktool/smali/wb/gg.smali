.class public final synthetic Lwb/gg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZZLi0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/gg;->g:Landroid/content/Context;

    .line 5
    .line 6
    iput-boolean p2, p0, Lwb/gg;->h:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lwb/gg;->i:Z

    .line 9
    .line 10
    iput-object p4, p0, Lwb/gg;->j:Li0/a1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/gg;->k:Li0/a1;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    sget-object v0, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 2
    .line 3
    iget-object v4, p0, Lwb/gg;->g:Landroid/content/Context;

    .line 4
    .line 5
    iget-boolean v1, p0, Lwb/gg;->h:Z

    .line 6
    .line 7
    invoke-virtual {v0, v4, v1}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->setGlobalEnabled-gIAlu-s(Landroid/content/Context;Z)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lia/l;

    .line 21
    .line 22
    iget-boolean v3, p0, Lwb/gg;->i:Z

    .line 23
    .line 24
    iget-object v5, p0, Lwb/gg;->j:Li0/a1;

    .line 25
    .line 26
    iget-object v6, p0, Lwb/gg;->k:Li0/a1;

    .line 27
    .line 28
    invoke-direct/range {v1 .. v6}, Lia/l;-><init>(Ljava/lang/Object;ZLandroid/content/Context;Li0/a1;Li0/a1;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method
