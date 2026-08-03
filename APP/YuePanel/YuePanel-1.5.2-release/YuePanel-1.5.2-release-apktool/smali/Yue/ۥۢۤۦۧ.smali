.class public LYue/ۥۢۤۦۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06e2\u06e4\u06e6\u06e6;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟:J

.field public ۥ۟۟:Landroid/view/animation/Interpolator;

.field public ۥ۟۟۟:LYue/ۥۢۤۦۨ;

.field public ۥ۟۟۟۟:Z

.field public final ۥ۟۟۟۠:LYue/ۥۢۤۧ;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LYue/ۥۢۤۦۧ;->ۥ۟:J

    new-instance v0, LYue/ۥۢۤۦۧ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۢۤۦۧ$ۥ;-><init>(LYue/ۥۢۤۦۧ;)V

    iput-object v0, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۠:LYue/ۥۢۤۧ;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۢۤۦۧ;->ۥ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 2

    iget-boolean v0, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۟:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥۢۤۦۧ;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۤۦۦ;

    invoke-virtual {v1}, LYue/ۥۢۤۦۦ;->ۥ۟۟۟()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۟:Z

    return-void
.end method

.method public ۥ۟()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۟:Z

    return-void
.end method

.method public ۥ۟۟(LYue/ۥۢۤۦۦ;)LYue/ۥۢۤۦۧ;
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۟:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۤۦۧ;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public ۥ۟۟۟(LYue/ۥۢۤۦۦ;LYue/ۥۢۤۦۦ;)LYue/ۥۢۤۦۧ;
    .locals 2

    iget-object v0, p0, LYue/ۥۢۤۦۧ;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, LYue/ۥۢۤۦۦ;->ۥ۟۟۟۟()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, LYue/ۥۢۤۦۦ;->ۥ۟۟۠ۦ(J)LYue/ۥۢۤۦۦ;

    iget-object p1, p0, LYue/ۥۢۤۦۧ;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public ۥ۟۟۟۟(J)LYue/ۥۢۤۦۧ;
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۟:Z

    if-nez v0, :cond_0

    iput-wide p1, p0, LYue/ۥۢۤۦۧ;->ۥ۟:J

    :cond_0
    return-object p0
.end method

.method public ۥ۟۟۟۠(Landroid/view/animation/Interpolator;)LYue/ۥۢۤۦۧ;
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۟:Z

    if-nez v0, :cond_0

    iput-object p1, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟:Landroid/view/animation/Interpolator;

    :cond_0
    return-object p0
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥۢۤۦۨ;)LYue/ۥۢۤۦۧ;
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۟:Z

    if-nez v0, :cond_0

    iput-object p1, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟۟:LYue/ۥۢۤۦۨ;

    :cond_0
    return-object p0
.end method

.method public ۥ۟۟۟ۢ()V
    .locals 6

    iget-boolean v0, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۟:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥۢۤۦۧ;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۤۦۦ;

    iget-wide v2, p0, LYue/ۥۢۤۦۧ;->ۥ۟:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-ltz v4, :cond_1

    invoke-virtual {v1, v2, v3}, LYue/ۥۢۤۦۦ;->ۥ۟۟۠ۢ(J)LYue/ۥۢۤۦۦ;

    :cond_1
    iget-object v2, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟:Landroid/view/animation/Interpolator;

    if-eqz v2, :cond_2

    invoke-virtual {v1, v2}, LYue/ۥۢۤۦۦ;->ۥۣ۟۟۠(Landroid/view/animation/Interpolator;)LYue/ۥۢۤۦۦ;

    :cond_2
    iget-object v2, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟۟:LYue/ۥۢۤۦۨ;

    if-eqz v2, :cond_3

    iget-object v2, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۠:LYue/ۥۢۤۧ;

    invoke-virtual {v1, v2}, LYue/ۥۢۤۦۦ;->ۥ۟۟۠ۤ(LYue/ۥۢۤۦۨ;)LYue/ۥۢۤۦۦ;

    :cond_3
    invoke-virtual {v1}, LYue/ۥۢۤۦۦ;->ۥ۟۟۠ۨ()V

    goto :goto_0

    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢۤۦۧ;->ۥ۟۟۟۟:Z

    return-void
.end method
