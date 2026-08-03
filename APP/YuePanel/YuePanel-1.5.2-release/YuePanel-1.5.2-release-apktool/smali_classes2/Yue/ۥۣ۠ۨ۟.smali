.class public final LYue/ۥۣ۠ۨ۟;
.super LYue/ۥ۠ۨۢۨ;
.source "SourceFile"


# instance fields
.field public final ۥۣ۟۟۠:J

.field public final ۥ۟۟۠ۤ:J

.field public ۥ۟۟۠ۥ:Z

.field public ۥ۟۟۠ۦ:J


# direct methods
.method public constructor <init>(JJJ)V
    .locals 2

    invoke-direct {p0}, LYue/ۥ۠ۨۢۨ;-><init>()V

    iput-wide p5, p0, LYue/ۥۣ۠ۨ۟;->ۥۣ۟۟۠:J

    iput-wide p3, p0, LYue/ۥۣ۠ۨ۟;->ۥ۟۟۠ۤ:J

    const-wide/16 v0, 0x0

    cmp-long p5, p5, v0

    const/4 p6, 0x0

    const/4 v0, 0x1

    if-lez p5, :cond_0

    cmp-long p5, p1, p3

    if-gtz p5, :cond_1

    :goto_0
    move p6, v0

    goto :goto_1

    :cond_0
    cmp-long p5, p1, p3

    if-ltz p5, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    iput-boolean p6, p0, LYue/ۥۣ۠ۨ۟;->ۥ۟۟۠ۥ:Z

    if-eqz p6, :cond_2

    goto :goto_2

    :cond_2
    move-wide p1, p3

    :goto_2
    iput-wide p1, p0, LYue/ۥۣ۠ۨ۟;->ۥ۟۟۠ۦ:J

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۠ۨ۟;->ۥ۟۟۠ۥ:Z

    return v0
.end method

.method public ۥ۟()J
    .locals 4

    iget-wide v0, p0, LYue/ۥۣ۠ۨ۟;->ۥ۟۟۠ۦ:J

    iget-wide v2, p0, LYue/ۥۣ۠ۨ۟;->ۥ۟۟۠ۤ:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    iget-boolean v2, p0, LYue/ۥۣ۠ۨ۟;->ۥ۟۟۠ۥ:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    iput-boolean v2, p0, LYue/ۥۣ۠ۨ۟;->ۥ۟۟۠ۥ:Z

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_1
    iget-wide v2, p0, LYue/ۥۣ۠ۨ۟;->ۥۣ۟۟۠:J

    add-long/2addr v2, v0

    iput-wide v2, p0, LYue/ۥۣ۠ۨ۟;->ۥ۟۟۠ۦ:J

    :goto_0
    return-wide v0
.end method

.method public final ۥ۟۟()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۣ۠ۨ۟;->ۥۣ۟۟۠:J

    return-wide v0
.end method
