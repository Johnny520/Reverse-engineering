.class public final synthetic Lwb/wp;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic n:Lqg/t;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Landroid/content/Context;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;

.field public final synthetic u:Li0/a1;

.field public final synthetic v:Li0/a1;


# direct methods
.method public constructor <init>(Lqg/t;Li0/a1;Li0/a1;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwb/wp;->n:Lqg/t;

    .line 2
    .line 3
    iput-object p2, p0, Lwb/wp;->o:Li0/a1;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/wp;->p:Li0/a1;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/wp;->q:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p5, p0, Lwb/wp;->r:Li0/a1;

    .line 10
    .line 11
    iput-object p6, p0, Lwb/wp;->s:Li0/a1;

    .line 12
    .line 13
    iput-object p7, p0, Lwb/wp;->t:Li0/a1;

    .line 14
    .line 15
    iput-object p8, p0, Lwb/wp;->u:Li0/a1;

    .line 16
    .line 17
    iput-object p9, p0, Lwb/wp;->v:Li0/a1;

    .line 18
    .line 19
    const-class p1, Lgg/k;

    .line 20
    .line 21
    invoke-static {p1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p4

    .line 25
    const-string p6, "ScriptPluginMarketPage$requestInstall(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lh/Hchat/hooks/items/script/market/PluginMarketPlugin;)V"

    .line 26
    .line 27
    const/4 p7, 0x0

    .line 28
    const/4 p3, 0x1

    .line 29
    const-string p5, "requestInstall"

    .line 30
    .line 31
    move-object p2, p0

    .line 32
    invoke-direct/range {p2 .. p7}, Lgg/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v1, p1

    .line 2
    check-cast v1, Lgb/o;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v7, p0, Lwb/wp;->u:Li0/a1;

    .line 8
    .line 9
    iget-object v8, p0, Lwb/wp;->v:Li0/a1;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/wp;->q:Landroid/content/Context;

    .line 12
    .line 13
    iget-object v2, p0, Lwb/wp;->o:Li0/a1;

    .line 14
    .line 15
    iget-object v3, p0, Lwb/wp;->p:Li0/a1;

    .line 16
    .line 17
    iget-object v4, p0, Lwb/wp;->r:Li0/a1;

    .line 18
    .line 19
    iget-object v5, p0, Lwb/wp;->s:Li0/a1;

    .line 20
    .line 21
    iget-object v6, p0, Lwb/wp;->t:Li0/a1;

    .line 22
    .line 23
    iget-object v9, p0, Lwb/wp;->n:Lqg/t;

    .line 24
    .line 25
    invoke-static/range {v0 .. v9}, Lwb/y2;->E1(Landroid/content/Context;Lgb/o;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lqg/t;)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    return-object p1
.end method
