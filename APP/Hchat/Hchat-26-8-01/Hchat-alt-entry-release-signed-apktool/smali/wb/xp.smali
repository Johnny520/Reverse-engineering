.class public final synthetic Lwb/xp;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic n:Lqg/t;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Landroid/content/Context;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;

.field public final synthetic u:Li0/a1;

.field public final synthetic v:Li0/a1;

.field public final synthetic w:Li0/a1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lqg/t;)V
    .locals 0

    .line 1
    iput-object p10, p0, Lwb/xp;->n:Lqg/t;

    .line 2
    .line 3
    iput-object p2, p0, Lwb/xp;->o:Li0/a1;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/xp;->p:Li0/a1;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/xp;->q:Li0/a1;

    .line 8
    .line 9
    iput-object p1, p0, Lwb/xp;->r:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/xp;->s:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/xp;->t:Li0/a1;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/xp;->u:Li0/a1;

    .line 16
    .line 17
    iput-object p8, p0, Lwb/xp;->v:Li0/a1;

    .line 18
    .line 19
    iput-object p9, p0, Lwb/xp;->w:Li0/a1;

    .line 20
    .line 21
    const-class p1, Lgg/k;

    .line 22
    .line 23
    invoke-static {p1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    const-string p6, "ScriptPluginMarketPage$requestHistoryInstall(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lh/Hchat/hooks/items/script/market/PluginMarketHistoryVersion;)V"

    .line 28
    .line 29
    const/4 p7, 0x0

    .line 30
    const/4 p3, 0x1

    .line 31
    const-string p5, "requestHistoryInstall"

    .line 32
    .line 33
    move-object p2, p0

    .line 34
    invoke-direct/range {p2 .. p7}, Lgg/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, Lgb/h;

    .line 3
    .line 4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v11, p0, Lwb/xp;->o:Li0/a1;

    .line 8
    .line 9
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    move-object v2, p1

    .line 14
    check-cast v2, Lgb/o;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-object v4, p0, Lwb/xp;->p:Li0/a1;

    .line 19
    .line 20
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/String;

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-object v6, p0, Lwb/xp;->q:Li0/a1;

    .line 29
    .line 30
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object p1, v3, Lgb/h;->a:Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {v4, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Lwb/aq;

    .line 45
    .line 46
    const/4 v13, 0x0

    .line 47
    iget-object v1, p0, Lwb/xp;->r:Landroid/content/Context;

    .line 48
    .line 49
    iget-object v5, p0, Lwb/xp;->n:Lqg/t;

    .line 50
    .line 51
    iget-object v7, p0, Lwb/xp;->s:Li0/a1;

    .line 52
    .line 53
    iget-object v8, p0, Lwb/xp;->t:Li0/a1;

    .line 54
    .line 55
    iget-object v9, p0, Lwb/xp;->u:Li0/a1;

    .line 56
    .line 57
    iget-object v10, p0, Lwb/xp;->v:Li0/a1;

    .line 58
    .line 59
    iget-object v12, p0, Lwb/xp;->w:Li0/a1;

    .line 60
    .line 61
    invoke-direct/range {v0 .. v13}, Lwb/aq;-><init>(Landroid/content/Context;Lgb/o;Lgb/h;Li0/a1;Lqg/t;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 62
    .line 63
    .line 64
    const/4 p1, 0x3

    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-static {v5, v1, v0, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 70
    .line 71
    return-object p1
.end method
