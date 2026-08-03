.class public final LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۨ۠ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public ۥ:J

.field public ۥ۟:I

.field public ۥ۟۟:J

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:J

.field public ۥ۟۟۟۠:F

.field public ۥ۟۟۟ۡ:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟(J)LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;

    const/16 p1, 0x66

    .line 3
    iput p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟:I

    const-wide p1, 0x7fffffffffffffffL

    .line 4
    iput-wide p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟:J

    const p1, 0x7fffffff

    .line 5
    iput p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟:I

    const-wide/16 p1, -0x1

    .line 6
    iput-wide p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟۟:J

    const/4 p1, 0x0

    .line 7
    iput p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟۠:F

    const-wide/16 p1, 0x0

    .line 8
    iput-wide p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟ۡ:J

    return-void
.end method

.method public constructor <init>(LYue/ۥ۠ۨ۠ۢ;)V
    .locals 2
    .param p1    # LYue/ۥ۠ۨ۠ۢ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iget-wide v0, p1, LYue/ۥ۠ۨ۠ۢ;->ۥ۟:J

    iput-wide v0, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ:J

    .line 11
    iget v0, p1, LYue/ۥ۠ۨ۠ۢ;->ۥ:I

    iput v0, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟:I

    .line 12
    iget-wide v0, p1, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟:J

    iput-wide v0, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟:J

    .line 13
    iget v0, p1, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۟:I

    iput v0, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟:I

    .line 14
    iget-wide v0, p1, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟:J

    iput-wide v0, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟۟:J

    .line 15
    iget v0, p1, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۠:F

    iput v0, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟۠:F

    .line 16
    iget-wide v0, p1, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟ۡ:J

    iput-wide v0, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟ۡ:J

    return-void
.end method


# virtual methods
.method public ۥ()LYue/ۥ۠ۨ۠ۢ;
    .locals 14
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-wide v0, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-wide v0, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟۟:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-string v1, "passive location requests must have an explicit minimum update interval"

    invoke-static {v0, v1}, LYue/ۥۡۤۧ;->ۥ۟۟۠(ZLjava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۨ۠ۢ;

    iget-wide v3, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ:J

    iget v5, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟:I

    iget-wide v6, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟:J

    iget v8, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟:I

    iget-wide v1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟۟:J

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    iget v11, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟۠:F

    iget-wide v12, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟ۡ:J

    move-object v2, v0

    invoke-direct/range {v2 .. v13}, LYue/ۥ۠ۨ۠ۢ;-><init>(JIJIJFJ)V

    return-object v0
.end method

.method public ۥ۟()LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟۟:J

    return-object p0
.end method

.method public ۥ۟۟(J)LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;
    .locals 7
    .param p1    # J
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x1L
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const-wide v4, 0x7fffffffffffffffL

    const-string v6, "durationMillis"

    const-wide/16 v2, 0x1

    move-wide v0, p1

    invoke-static/range {v0 .. v6}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۢ(JJJLjava/lang/String;)J

    move-result-wide p1

    iput-wide p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟:J

    return-object p0
.end method

.method public ۥ۟۟۟(J)LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;
    .locals 7
    .param p1    # J
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const-wide v4, 0x7fffffffffffffffL

    const-string v6, "intervalMillis"

    const-wide/16 v2, 0x0

    move-wide v0, p1

    invoke-static/range {v0 .. v6}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۢ(JJJLjava/lang/String;)J

    move-result-wide p1

    iput-wide p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ:J

    return-object p0
.end method

.method public ۥ۟۟۟۟(J)LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;
    .locals 7
    .param p1    # J
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-wide p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟ۡ:J

    const-wide v4, 0x7fffffffffffffffL

    const-string v6, "maxUpdateDelayMillis"

    const-wide/16 v2, 0x0

    move-wide v0, p1

    invoke-static/range {v0 .. v6}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۢ(JJJLjava/lang/String;)J

    move-result-wide p1

    iput-wide p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟ۡ:J

    return-object p0
.end method

.method public ۥ۟۟۟۠(I)LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;
    .locals 3
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x1L
            to = 0x7fffffffL
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const v0, 0x7fffffff

    const-string v1, "maxUpdates"

    const/4 v2, 0x1

    invoke-static {p1, v2, v0, v1}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۡ(IIILjava/lang/String;)I

    move-result p1

    iput p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟:I

    return-object p0
.end method

.method public ۥ۟۟۟ۡ(F)LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;
    .locals 3
    .param p1    # F
        .annotation build LYue/ۥ۠ۢۢۧ;
            from = 0.0
            to = 3.4028234663852886E38
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟۠:F

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    const-string v1, "minUpdateDistanceMeters"

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, LYue/ۥۡۤۧ;->ۥ۟۟۟۠(FFFLjava/lang/String;)F

    move-result p1

    iput p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟۠:F

    return-object p0
.end method

.method public ۥ۟۟۟ۢ(J)LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;
    .locals 7
    .param p1    # J
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const-wide v4, 0x7fffffffffffffffL

    const-string v6, "minUpdateIntervalMillis"

    const-wide/16 v2, 0x0

    move-wide v0, p1

    invoke-static/range {v0 .. v6}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۢ(JJJLjava/lang/String;)J

    move-result-wide p1

    iput-wide p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟۟۟۟:J

    return-object p0
.end method

.method public ۥۣ۟۟۟(I)LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;
    .locals 3
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/16 v0, 0x68

    if-eq p1, v0, :cond_1

    const/16 v0, 0x66

    if-eq p1, v0, :cond_1

    const/16 v0, 0x64

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "quality must be a defined QUALITY constant, not %d"

    invoke-static {v0, v2, v1}, LYue/ۥۡۤۧ;->ۥ۟۟(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput p1, p0, LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;->ۥ۟:I

    return-object p0
.end method
