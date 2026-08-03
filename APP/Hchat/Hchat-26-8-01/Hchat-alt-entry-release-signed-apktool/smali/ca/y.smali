.class public final synthetic Lca/y;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic h:Landroid/app/Activity;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lfg/l;

.field public final synthetic k:Lca/e0;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/app/Activity;Ljava/lang/Object;Lfg/l;Lca/e0;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lca/y;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    iput-object p2, p0, Lca/y;->h:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lca/y;->i:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lca/y;->j:Lfg/l;

    .line 11
    .line 12
    iput-object p5, p0, Lca/y;->k:Lca/e0;

    .line 13
    .line 14
    iput-wide p6, p0, Lca/y;->l:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lca/y;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Lca/y;->h:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v1, p0, Lca/y;->i:Ljava/lang/Object;

    .line 25
    .line 26
    instance-of v2, v1, Lsf/f;

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    iget-object v2, p0, Lca/y;->j:Lfg/l;

    .line 31
    .line 32
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    iget-object v2, p0, Lca/y;->k:Lca/e0;

    .line 42
    .line 43
    iget-object v3, v2, Lca/e0;->c:Lab/b;

    .line 44
    .line 45
    new-instance v4, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v5, "\u8bfb\u53d6\u6536\u85cf\u8f6c\u53d1\u5185\u5bb9\u5931\u8d25: localId="

    .line 48
    .line 49
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-wide v5, p0, Lca/y;->l:J

    .line 53
    .line 54
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v3, v4, v1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const-string v1, "\u6536\u85cf\u5185\u5bb9\u4e0d\u53ef\u7528"

    .line 72
    .line 73
    :goto_0
    invoke-virtual {v2, v0, v1}, Lca/e0;->r(Landroid/app/Activity;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_1
    return-void
.end method
