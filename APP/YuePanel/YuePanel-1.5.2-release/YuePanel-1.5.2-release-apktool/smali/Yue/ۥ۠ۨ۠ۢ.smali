.class public final LYue/ۥ۠ۨ۠ۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۨ۠ۢ$ۥ۟;,
        LYue/ۥ۠ۨ۠ۢ$ۥ;,
        LYue/ۥ۠ۨ۠ۢ$ۥ۟۟;,
        LYue/ۥ۠ۨ۠ۢ$ۥ۟۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۢ:J = 0x7fffffffffffffffL

.field public static final ۥۣ۟۟۟:I = 0x64

.field public static final ۥ۟۟۟ۤ:I = 0x66

.field public static final ۥ۟۟۟ۥ:I = 0x68

.field public static final ۥ۟۟۟ۦ:J = -0x1L


# instance fields
.field public final ۥ:I

.field public final ۥ۟:J

.field public final ۥ۟۟:J

.field public final ۥ۟۟۟:J

.field public final ۥ۟۟۟۟:I

.field public final ۥ۟۟۟۠:F

.field public final ۥ۟۟۟ۡ:J


# direct methods
.method public constructor <init>(JIJIJFJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟:J

    iput p3, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ:I

    iput-wide p7, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟:J

    iput-wide p4, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟:J

    iput p6, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۟:I

    iput p9, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۠:F

    iput-wide p10, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟ۡ:J

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥ۠ۨ۠ۢ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥ۠ۨ۠ۢ;

    iget v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ:I

    iget v3, p1, LYue/ۥ۠ۨ۠ۢ;->ۥ:I

    if-ne v1, v3, :cond_2

    iget-wide v3, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟:J

    iget-wide v5, p1, LYue/ۥ۠ۨ۠ۢ;->ۥ۟:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟:J

    iget-wide v5, p1, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟:J

    iget-wide v5, p1, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۟:I

    iget v3, p1, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۟:I

    if-ne v1, v3, :cond_2

    iget v1, p1, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۠:F

    iget v3, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۠:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-nez v1, :cond_2

    iget-wide v3, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟ۡ:J

    iget-wide v5, p1, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟ۡ:J

    cmp-long p1, v3, v5

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 6

    iget v0, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ:I

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟:J

    const-wide v3, 0x7fffffffffffffffL

    cmp-long v1, v1, v3

    if-eqz v1, :cond_3

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟:J

    invoke-static {v1, v2, v0}, LYue/ۥۢۡۤ;->ۥ۟۟۟۟(JLjava/lang/StringBuilder;)V

    iget v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ:I

    const/16 v2, 0x64

    if-eq v1, v2, :cond_2

    const/16 v2, 0x66

    if-eq v1, v2, :cond_1

    const/16 v2, 0x68

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, " LOW_POWER"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, " BALANCED"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    const-string v1, " HIGH_ACCURACY"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    const-string v1, "PASSIVE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    iget-wide v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_4

    const-string v1, ", duration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟:J

    invoke-static {v1, v2, v0}, LYue/ۥۢۡۤ;->ۥ۟۟۟۟(JLjava/lang/StringBuilder;)V

    :cond_4
    iget v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۟:I

    const v2, 0x7fffffff

    if-eq v1, v2, :cond_5

    const-string v1, ", maxUpdates="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۟:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_5
    iget-wide v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟:J

    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    if-eqz v3, :cond_6

    iget-wide v3, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟:J

    cmp-long v1, v1, v3

    if-gez v1, :cond_6

    const-string v1, ", minUpdateInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟:J

    invoke-static {v1, v2, v0}, LYue/ۥۢۡۤ;->ۥ۟۟۟۟(JLjava/lang/StringBuilder;)V

    :cond_6
    iget v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۠:F

    float-to-double v1, v1

    const-wide/16 v3, 0x0

    cmpl-double v1, v1, v3

    if-lez v1, :cond_7

    const-string v1, ", minUpdateDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۠:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    :cond_7
    iget-wide v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟ۡ:J

    const-wide/16 v3, 0x2

    div-long/2addr v1, v3

    iget-wide v3, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟:J

    cmp-long v1, v1, v3

    if-lez v1, :cond_8

    const-string v1, ", maxUpdateDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟ۡ:J

    invoke-static {v1, v2, v0}, LYue/ۥۢۡۤ;->ۥ۟۟۟۟(JLjava/lang/StringBuilder;)V

    :cond_8
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()J
    .locals 2
    .annotation build LYue/ۥ۠ۥۤ;
        from = 0x1L
    .end annotation

    iget-wide v0, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟:J

    return-wide v0
.end method

.method public ۥ۟()J
    .locals 2
    .annotation build LYue/ۥ۠ۥۤ;
        from = 0x0L
    .end annotation

    iget-wide v0, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟:J

    return-wide v0
.end method

.method public ۥ۟۟()J
    .locals 2
    .annotation build LYue/ۥ۠ۥۤ;
        from = 0x0L
    .end annotation

    iget-wide v0, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟ۡ:J

    return-wide v0
.end method

.method public ۥ۟۟۟()I
    .locals 1
    .annotation build LYue/ۥ۠ۥۤ;
        from = 0x1L
        to = 0x7fffffffL
    .end annotation

    iget v0, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۟:I

    return v0
.end method

.method public ۥ۟۟۟۟()F
    .locals 1
    .annotation build LYue/ۥ۠ۢۢۧ;
        from = 0.0
        to = 3.4028234663852886E38
    .end annotation

    iget v0, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟۠:F

    return v0
.end method

.method public ۥ۟۟۟۠()J
    .locals 4
    .annotation build LYue/ۥ۠ۥۤ;
        from = 0x0L
    .end annotation

    iget-wide v0, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    iget-wide v0, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ۟:J

    :cond_0
    return-wide v0
.end method

.method public ۥ۟۟۟ۡ()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۨ۠ۢ;->ۥ:I

    return v0
.end method

.method public ۥ۟۟۟ۢ()Landroid/location/LocationRequest;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1f
    .end annotation

    invoke-static {p0}, LYue/ۥ۠ۨ۠ۢ$ۥ۟;->ۥ(LYue/ۥ۠ۨ۠ۢ;)Landroid/location/LocationRequest;

    move-result-object v0

    return-object v0
.end method

.method public ۥۣ۟۟۟(Ljava/lang/String;)Landroid/location/LocationRequest;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۢ;->ۥ۟۟۟ۢ()Landroid/location/LocationRequest;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۠ۨ۠ۢ$ۥ;->ۥ(LYue/ۥ۠ۨ۠ۢ;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۨ۠ۡ;->ۥ(Ljava/lang/Object;)Landroid/location/LocationRequest;

    move-result-object p1

    return-object p1
.end method
