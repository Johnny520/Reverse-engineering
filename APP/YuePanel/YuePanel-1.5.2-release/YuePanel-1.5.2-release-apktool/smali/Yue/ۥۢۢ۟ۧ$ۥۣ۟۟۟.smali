.class public LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;
.super LYue/ۥۢۢ۠ۧ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۢۡ۠;
.implements LYue/ۥۣ۠۠ۤ$ۥ۟۟۠ۡ;


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x22
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۢ۟ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06e3"
.end annotation


# instance fields
.field public ۥ:J

.field public ۥ۟:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "LYue/\u06e5\u06e2\u06e2\u06e1\u06e0;",
            ">;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "LYue/\u06e5\u06e2\u06e2\u06e1\u06e0;",
            ">;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟:Z

.field public ۥ۟۟۟۟:Z

.field public ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

.field public ۥ۟۟۟ۡ:[LYue/ۥ۟ۧ۠ۧ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "LYue/\u06e5\u06e2\u06e2\u06e1\u06e0;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟ۢ:LYue/ۥۣۢۥۦ;

.field public ۥۣ۟۟۟:Ljava/lang/Runnable;

.field public final synthetic ۥ۟۟۟ۤ:LYue/ۥۢۢ۟ۧ;


# direct methods
.method public constructor <init>(LYue/ۥۢۢ۟ۧ;)V
    .locals 2

    iput-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۤ:LYue/ۥۢۢ۟ۧ;

    invoke-direct {p0}, LYue/ۥۢۢ۠ۧ;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟:Ljava/util/ArrayList;

    iput-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟:Ljava/util/ArrayList;

    iput-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۡ:[LYue/ۥ۟ۧ۠ۧ;

    new-instance p1, LYue/ۥۣۢۥۦ;

    invoke-direct {p1}, LYue/ۥۣۢۥۦ;-><init>()V

    iput-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۢ:LYue/ۥۣۢۥۦ;

    return-void
.end method

.method public static synthetic ۥ۟۟۠۟(LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;LYue/ۥۣ۠۠ۤ;ZFF)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥۣ۟۟۠(LYue/ۥۣ۠۠ۤ;ZFF)V

    return-void
.end method


# virtual methods
.method public onTransitionCancel(LYue/ۥۢۢ۟ۧ;)V
    .locals 0
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۟:Z

    return-void
.end method

.method public ۥ(F)V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۠()J

    move-result-wide v0

    long-to-float v0, v0

    mul-float/2addr p1, v0

    float-to-long v0, p1

    invoke-virtual {p0, v0, v1}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۟(J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "setCurrentFraction() called after animation has been started"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟()J
    .locals 6

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۠()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    iget-wide v4, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public ۥ۟۟(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "LYue/\u06e5\u06e2\u06e2\u06e1\u06e0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟:Ljava/util/ArrayList;

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟:Z

    return v0
.end method

.method public ۥ۟۟۟۟(J)V
    .locals 4

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

    if-nez v0, :cond_5

    iget-wide v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    cmp-long v0, p1, v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۟:Z

    if-nez v0, :cond_3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_1

    iget-wide v2, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    cmp-long v0, v2, v0

    if-lez v0, :cond_1

    const-wide/16 p1, -0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۠()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-nez v2, :cond_2

    iget-wide v2, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_2

    const-wide/16 p1, 0x1

    add-long/2addr p1, v0

    :cond_2
    :goto_0
    iget-wide v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    cmp-long v2, p1, v0

    if-eqz v2, :cond_3

    iget-object v2, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۤ:LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v2, p1, p2, v0, v1}, LYue/ۥۢۢ۟ۧ;->setCurrentPlayTimeMillis(JJ)V

    iput-wide p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    :cond_3
    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۠۠()V

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۢ:LYue/ۥۣۢۥۦ;

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v1

    long-to-float p1, p1

    invoke-virtual {v0, v1, v2, p1}, LYue/ۥۣۢۥۦ;->ۥ(JF)V

    :cond_4
    :goto_1
    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "setCurrentPlayTimeMillis() called after animation has been started"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟۠()V
    .locals 5

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۠ۡ()V

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۠()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    long-to-float v1, v1

    invoke-virtual {v0, v1}, LYue/ۥۢ۟ۧۡ;->ۥ۟۟ۡ(F)V

    return-void
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥۣ۟۟۟:Ljava/lang/Runnable;

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۠ۡ()V

    iget-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LYue/ۥۢ۟ۧۡ;->ۥ۟۟ۡ(F)V

    return-void
.end method

.method public ۥۣ۟۟۟(LYue/ۥۣ۠۠ۤ;FF)V
    .locals 4

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۠()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    float-to-double p1, p2

    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    const-wide/16 v0, -0x1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iget-object p3, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۤ:LYue/ۥۢۢ۟ۧ;

    iget-wide v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    invoke-virtual {p3, p1, p2, v0, v1}, LYue/ۥۢۢ۟ۧ;->setCurrentPlayTimeMillis(JJ)V

    iput-wide p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۠۠()V

    return-void
.end method

.method public ۥ۟۟۟ۥ(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "LYue/\u06e5\u06e2\u06e2\u06e1\u06e0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "LYue/\u06e5\u06e2\u06e2\u06e1\u06e0;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p0}, LYue/ۥ۟ۧ۠ۧ;->accept(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟:Ljava/util/ArrayList;

    :cond_1
    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟۟۟ۧ(LYue/ۥ۟ۧ۠ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "LYue/\u06e5\u06e2\u06e2\u06e1\u06e0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟ۨ()F
    .locals 3

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟()J

    move-result-wide v0

    long-to-float v0, v0

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۠()J

    move-result-wide v1

    long-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public ۥ۟۟۠()J
    .locals 2

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۤ:LYue/ۥۢۢ۟ۧ;

    invoke-virtual {v0}, LYue/ۥۢۢ۟ۧ;->getTotalDurationMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۥ۟۟۠۠()V
    .locals 5

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۡ:[LYue/ۥ۟ۧ۠ۧ;

    if-nez v1, :cond_1

    new-array v1, v0, [LYue/ۥ۟ۧ۠ۧ;

    iput-object v1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۡ:[LYue/ۥ۟ۧ۠ۧ;

    :cond_1
    iget-object v1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟:Ljava/util/ArrayList;

    iget-object v2, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۡ:[LYue/ۥ۟ۧ۠ۧ;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [LYue/ۥ۟ۧ۠ۧ;

    const/4 v2, 0x0

    iput-object v2, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۡ:[LYue/ۥ۟ۧ۠ۧ;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, v1, v3

    invoke-interface {v4, p0}, LYue/ۥ۟ۧ۠ۧ;->accept(Ljava/lang/Object;)V

    aput-object v2, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iput-object v1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۡ:[LYue/ۥ۟ۧ۠ۧ;

    :cond_3
    :goto_1
    return-void
.end method

.method public final ۥ۟۟۠ۡ()V
    .locals 5

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۢ:LYue/ۥۣۢۥۦ;

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    long-to-float v3, v3

    invoke-virtual {v0, v1, v2, v3}, LYue/ۥۣۢۥۦ;->ۥ(JF)V

    new-instance v0, LYue/ۥۢ۟ۧۡ;

    new-instance v1, LYue/ۥۣ۠ۢ;

    invoke-direct {v1}, LYue/ۥۣ۠ۢ;-><init>()V

    invoke-direct {v0, v1}, LYue/ۥۢ۟ۧۡ;-><init>(LYue/ۥۣ۠ۢ;)V

    iput-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

    new-instance v0, LYue/ۥۢ۟ۧۢ;

    invoke-direct {v0}, LYue/ۥۢ۟ۧۢ;-><init>()V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, LYue/ۥۢ۟ۧۢ;->ۥ۟۟۟ۡ(F)LYue/ۥۢ۟ۧۢ;

    const/high16 v1, 0x43480000    # 200.0f

    invoke-virtual {v0, v1}, LYue/ۥۢ۟ۧۢ;->ۥۣ۟۟۟(F)LYue/ۥۢ۟ۧۢ;

    iget-object v1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

    invoke-virtual {v1, v0}, LYue/ۥۢ۟ۧۡ;->ۥ۟۟ۡۢ(LYue/ۥۢ۟ۧۢ;)LYue/ۥۢ۟ۧۡ;

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

    iget-wide v1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    long-to-float v1, v1

    invoke-virtual {v0, v1}, LYue/ۥۣ۠۠ۤ;->ۥۣ۟۟۠(F)LYue/ۥۣ۠۠ۤ;

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

    invoke-virtual {v0, p0}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟(LYue/ۥۣ۠۠ۤ$ۥ۟۟۠ۡ;)LYue/ۥۣ۠۠ۤ;

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

    iget-object v1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۢ:LYue/ۥۣۢۥۦ;

    invoke-virtual {v1}, LYue/ۥۣۢۥۦ;->ۥ۟()F

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۠ۤ(F)LYue/ۥۣ۠۠ۤ;

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۠()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    long-to-float v1, v1

    invoke-virtual {v0, v1}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۠۟(F)LYue/ۥۣ۠۠ۤ;

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {v0, v1}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۠۠(F)LYue/ۥۣ۠۠ۤ;

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {v0, v1}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۠ۡ(F)LYue/ۥۣ۠۠ۤ;

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟۠:LYue/ۥۢ۟ۧۡ;

    new-instance v1, LYue/ۥۢۢ۟ۨ;

    invoke-direct {v1, p0}, LYue/ۥۢۢ۟ۨ;-><init>(LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;)V

    invoke-virtual {v0, v1}, LYue/ۥۣ۠۠ۤ;->ۥ۟(LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۠;)LYue/ۥۣ۠۠ۤ;

    return-void
.end method

.method public ۥ۟۟۠ۢ()V
    .locals 6

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۠()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const-wide/16 v2, 0x1

    :cond_0
    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۤ:LYue/ۥۢۢ۟ۧ;

    iget-wide v4, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    invoke-virtual {v0, v2, v3, v4, v5}, LYue/ۥۢۢ۟ۧ;->setCurrentPlayTimeMillis(JJ)V

    iput-wide v2, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    return-void
.end method

.method public final synthetic ۥۣ۟۟۠(LYue/ۥۣ۠۠ۤ;ZFF)V
    .locals 4

    if-nez p2, :cond_2

    const/high16 p1, 0x3f800000    # 1.0f

    cmpg-float p1, p3, p1

    const/4 p2, 0x0

    if-gez p1, :cond_1

    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۠()J

    move-result-wide p3

    iget-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۤ:LYue/ۥۢۢ۟ۧ;

    check-cast p1, LYue/ۥۢۢۡۡ;

    invoke-virtual {p1, p2}, LYue/ۥۢۢۡۡ;->ۥ۟۟ۡۧ(I)LYue/ۥۢۢ۟ۧ;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۢۢ۟ۧ;->access$000(LYue/ۥۢۢ۟ۧ;)LYue/ۥۢۢ۟ۧ;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p1, v0}, LYue/ۥۢۢ۟ۧ;->access$002(LYue/ۥۢۢ۟ۧ;LYue/ۥۢۢ۟ۧ;)LYue/ۥۢۢ۟ۧ;

    iget-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۤ:LYue/ۥۢۢ۟ۧ;

    iget-wide v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    const-wide/16 v2, -0x1

    invoke-virtual {p1, v2, v3, v0, v1}, LYue/ۥۢۢ۟ۧ;->setCurrentPlayTimeMillis(JJ)V

    iget-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۤ:LYue/ۥۢۢ۟ۧ;

    invoke-virtual {p1, p3, p4, v2, v3}, LYue/ۥۢۢ۟ۧ;->setCurrentPlayTimeMillis(JJ)V

    iput-wide p3, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ:J

    iget-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥۣ۟۟۟:Ljava/lang/Runnable;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_0
    iget-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۤ:LYue/ۥۢۢ۟ۧ;

    iget-object p1, p1, LYue/ۥۢۢ۟ۧ;->mAnimators:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    if-eqz p2, :cond_2

    sget-object p1, LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;->ۥ۟:LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;

    const/4 p3, 0x1

    invoke-virtual {p2, p1, p3}, LYue/ۥۢۢ۟ۧ;->notifyListeners(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;Z)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟ۤ:LYue/ۥۢۢ۟ۧ;

    sget-object p3, LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;->ۥ۟:LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;

    invoke-virtual {p1, p3, p2}, LYue/ۥۢۢ۟ۧ;->notifyListeners(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public ۥ۟۟۠ۤ()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۟:Z

    iget-object v0, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟:Ljava/util/ArrayList;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۟ۧ۠ۧ;

    invoke-interface {v2, p0}, LYue/ۥ۟ۧ۠ۧ;->accept(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۢۢ۟ۧ$ۥۣ۟۟۟;->ۥ۟۟۠۠()V

    return-void
.end method
