.class public LYue/ۥۣۢۢۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements LYue/ۥ۠ۦۢۨ;


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.5"
.end annotation

.annotation build LYue/ۥۢۥ۠ۧ;
    markerClass = {
        LYue/ۥ۠ۡۥۣ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۢۢۧ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "LYue/\u06e5\u06e2\u06e2\u06e7\u06df;",
        ">;",
        "LYue/\u06e5\u06e0\u06e6\u06e2\u06e8;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۦ:LYue/ۥۣۢۢۧ$ۥ;
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

    new-instance v0, LYue/ۥۣۢۢۧ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣۢۢۧ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۦ:LYue/ۥۣۢۢۧ$ۥ;

    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p5, v0

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p5, v0

    if-eqz v0, :cond_0

    .line 3
    iput-wide p1, p0, LYue/ۥۣۢۢۧ;->ۥۣ۟۟۠:J

    .line 4
    invoke-static/range {p1 .. p6}, LYue/ۥۢۢۨ;->ۥ۟۟(JJJ)J

    move-result-wide p1

    iput-wide p1, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۤ:J

    .line 5
    iput-wide p5, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۥ:J

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be greater than Long.MIN_VALUE to avoid overflow on negation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be non-zero."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(JJJLYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, LYue/ۥۣۢۢۧ;-><init>(JJJ)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    instance-of v0, p1, LYue/ۥۣۢۢۧ;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۣۢۢۧ;

    invoke-virtual {v0}, LYue/ۥۣۢۢۧ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-wide v0, p0, LYue/ۥۣۢۢۧ;->ۥۣ۟۟۠:J

    check-cast p1, LYue/ۥۣۢۢۧ;

    iget-wide v2, p1, LYue/ۥۣۢۢۧ;->ۥۣ۟۟۠:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-wide v0, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۤ:J

    iget-wide v2, p1, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۤ:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget-wide v0, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۥ:J

    iget-wide v2, p1, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۥ:J

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
    .locals 7

    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    iget-wide v0, p0, LYue/ۥۣۢۢۧ;->ۥۣ۟۟۠:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    invoke-static {v3, v4}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v3

    xor-long/2addr v0, v3

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    long-to-int v0, v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۤ:J

    ushr-long v5, v3, v2

    invoke-static {v5, v6}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v5

    xor-long/2addr v3, v5

    invoke-static {v3, v4}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v3

    long-to-int v1, v3

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۥ:J

    ushr-long v1, v3, v2

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    :goto_0
    return v0
.end method

.method public isEmpty()Z
    .locals 7

    iget-wide v0, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۥ:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-wide v3, p0, LYue/ۥۣۢۢۧ;->ۥۣ۟۟۠:J

    iget-wide v5, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۤ:J

    if-lez v0, :cond_0

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v0

    if-lez v0, :cond_1

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_0
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v0

    if-gez v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return v1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 9
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "LYue/\u06e5\u06e2\u06e2\u06e7\u06df;",
            ">;"
        }
    .end annotation

    new-instance v8, LYue/ۥۢۢۧۤ;

    iget-wide v1, p0, LYue/ۥۣۢۢۧ;->ۥۣ۟۟۠:J

    iget-wide v3, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۤ:J

    iget-wide v5, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۥ:J

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LYue/ۥۢۢۧۤ;-><init>(JJJLYue/ۥ۟ۨۥۢ;)V

    return-object v8
.end method

.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-wide v0, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۥ:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const-string v1, " step "

    if-lez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, p0, LYue/ۥۣۢۢۧ;->ۥۣ۟۟۠:J

    invoke-static {v2, v3}, LYue/ۥۢۢۧ۟;->ۥ۟۟ۤ(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ".."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۤ:J

    invoke-static {v2, v3}, LYue/ۥۢۢۧ۟;->ۥ۟۟ۤ(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۥ:J

    :goto_0
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, p0, LYue/ۥۣۢۢۧ;->ۥۣ۟۟۠:J

    invoke-static {v2, v3}, LYue/ۥۢۢۧ۟;->ۥ۟۟ۤ(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " downTo "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۤ:J

    invoke-static {v2, v3}, LYue/ۥۢۢۧ۟;->ۥ۟۟ۤ(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۥ:J

    neg-long v1, v1

    goto :goto_0

    :goto_1
    return-object v0
.end method

.method public final ۥ۟۟۟۠()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۣۢۢۧ;->ۥۣ۟۟۠:J

    return-wide v0
.end method

.method public final ۥ۟۟۟ۢ()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۤ:J

    return-wide v0
.end method

.method public final ۥۣ۟۟۟()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۥ:J

    return-wide v0
.end method
