.class public Lfm;
.super Lkm;
.source ""


# instance fields
.field public final c:Z


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkm;-><init>(Z)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lkm;->B(Ldm;)V

    sget-object v2, Lkm;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh9;

    instance-of v4, v3, Li9;

    if-eqz v4, :cond_0

    check-cast v3, Li9;

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    const/4 v4, 0x0

    if-eqz v3, :cond_6

    iget-object v3, v3, Lhm;->d:Lkm;

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    if-nez v3, :cond_2

    goto :goto_4

    :cond_2
    invoke-virtual {v3}, Lkm;->w()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_5

    :cond_3
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh9;

    instance-of v5, v3, Li9;

    if-eqz v5, :cond_4

    check-cast v3, Li9;

    goto :goto_2

    :cond_4
    move-object v3, v1

    :goto_2
    if-eqz v3, :cond_6

    iget-object v3, v3, Lhm;->d:Lkm;

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    move-object v3, v1

    :goto_3
    if-nez v3, :cond_2

    :cond_6
    :goto_4
    move v0, v4

    :goto_5
    iput-boolean v0, p0, Lfm;->c:Z

    return-void
.end method


# virtual methods
.method public final w()Z
    .locals 1

    iget-boolean v0, p0, Lfm;->c:Z

    return v0
.end method

.method public final x()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
