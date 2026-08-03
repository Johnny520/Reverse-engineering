.class public final synthetic Lca/w;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic i:Lwb/kv;

.field public final synthetic j:Landroid/app/Activity;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lfg/l;

.field public final synthetic m:Lca/e0;

.field public final synthetic n:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Landroid/app/Activity;Ljava/lang/Object;Lfg/l;Lca/e0;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lca/w;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    iput-object p2, p0, Lca/w;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    iput-object p3, p0, Lca/w;->i:Lwb/kv;

    .line 9
    .line 10
    iput-object p4, p0, Lca/w;->j:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p5, p0, Lca/w;->k:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p6, p0, Lca/w;->l:Lfg/l;

    .line 15
    .line 16
    iput-object p7, p0, Lca/w;->m:Lca/e0;

    .line 17
    .line 18
    iput-wide p8, p0, Lca/w;->n:J

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v1, p0, Lca/w;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    iget-object v2, p0, Lca/w;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lca/w;->i:Lwb/kv;

    .line 17
    .line 18
    invoke-interface {v0}, Lwb/kv;->close()V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lca/w;->j:Landroid/app/Activity;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    if-eqz v8, :cond_1

    .line 34
    .line 35
    new-instance v0, Lca/y;

    .line 36
    .line 37
    iget-object v3, p0, Lca/w;->k:Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v4, p0, Lca/w;->l:Lfg/l;

    .line 40
    .line 41
    iget-object v5, p0, Lca/w;->m:Lca/e0;

    .line 42
    .line 43
    iget-wide v6, p0, Lca/w;->n:J

    .line 44
    .line 45
    invoke-direct/range {v0 .. v7}, Lca/y;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/app/Activity;Ljava/lang/Object;Lfg/l;Lca/e0;J)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v8, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    return-void
.end method
