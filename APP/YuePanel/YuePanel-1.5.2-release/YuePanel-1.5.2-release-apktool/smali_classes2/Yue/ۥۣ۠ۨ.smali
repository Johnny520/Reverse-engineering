.class public LYue/ۥۣ۠ۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements LYue/ۥ۠ۦۢۨ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠ۨ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Long;",
        ">;",
        "LYue/\u06e5\u06e0\u06e6\u06e2\u06e8;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۦ:LYue/ۥۣ۠ۨ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥۣ۟۟۠:J

.field public final ۥ۟۟۠ۤ:J

.field public final ۥ۟۟۠ۥ:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۣ۠ۨ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣ۠ۨ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۨ$ۥ;

    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p5, v0

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p5, v0

    if-eqz v0, :cond_0

    iput-wide p1, p0, LYue/ۥۣ۠ۨ;->ۥۣ۟۟۠:J

    invoke-static/range {p1 .. p6}, LYue/ۥۡۥۢۦ;->ۥ۟۟۟(JJJ)J

    move-result-wide p1

    iput-wide p1, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۤ:J

    iput-wide p5, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۥ:J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be greater than Long.MIN_VALUE to avoid overflow on negation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be non-zero."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    instance-of v0, p1, LYue/ۥۣ۠ۨ;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۣ۠ۨ;

    invoke-virtual {v0}, LYue/ۥۣ۠ۨ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-wide v0, p0, LYue/ۥۣ۠ۨ;->ۥۣ۟۟۠:J

    check-cast p1, LYue/ۥۣ۠ۨ;

    iget-wide v2, p1, LYue/ۥۣ۠ۨ;->ۥۣ۟۟۠:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-wide v0, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۤ:J

    iget-wide v2, p1, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۤ:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-wide v0, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۥ:J

    iget-wide v2, p1, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۥ:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 9

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x1f

    int-to-long v0, v0

    iget-wide v2, p0, LYue/ۥۣ۠ۨ;->ۥۣ۟۟۠:J

    const/16 v4, 0x20

    ushr-long v5, v2, v4

    xor-long/2addr v2, v5

    mul-long/2addr v2, v0

    iget-wide v5, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۤ:J

    ushr-long v7, v5, v4

    xor-long/2addr v5, v7

    add-long/2addr v2, v5

    mul-long/2addr v0, v2

    iget-wide v2, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۥ:J

    ushr-long v4, v2, v4

    xor-long/2addr v2, v4

    add-long/2addr v0, v2

    long-to-int v0, v0

    :goto_0
    return v0
.end method

.method public isEmpty()Z
    .locals 7

    iget-wide v0, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۥ:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-wide v3, p0, LYue/ۥۣ۠ۨ;->ۥۣ۟۟۠:J

    iget-wide v5, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۤ:J

    if-lez v0, :cond_0

    cmp-long v0, v3, v5

    if-lez v0, :cond_1

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_0
    cmp-long v0, v3, v5

    if-gez v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return v1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->ۥ۟۟۟ۤ()LYue/ۥ۠ۨۢۨ;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-wide v0, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۥ:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const-string v1, " step "

    if-lez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, p0, LYue/ۥۣ۠ۨ;->ۥۣ۟۟۠:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ".."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۤ:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۥ:J

    :goto_0
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, p0, LYue/ۥۣ۠ۨ;->ۥۣ۟۟۠:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " downTo "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۤ:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۥ:J

    neg-long v1, v1

    goto :goto_0

    :goto_1
    return-object v0
.end method

.method public final ۥ۟۟۟۠()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۣ۠ۨ;->ۥۣ۟۟۠:J

    return-wide v0
.end method

.method public final ۥ۟۟۟ۢ()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۤ:J

    return-wide v0
.end method

.method public final ۥۣ۟۟۟()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۥ:J

    return-wide v0
.end method

.method public ۥ۟۟۟ۤ()LYue/ۥ۠ۨۢۨ;
    .locals 8
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v7, LYue/ۥۣ۠ۨ۟;

    iget-wide v1, p0, LYue/ۥۣ۠ۨ;->ۥۣ۟۟۠:J

    iget-wide v3, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۤ:J

    iget-wide v5, p0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۥ:J

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LYue/ۥۣ۠ۨ۟;-><init>(JJJ)V

    return-object v7
.end method
