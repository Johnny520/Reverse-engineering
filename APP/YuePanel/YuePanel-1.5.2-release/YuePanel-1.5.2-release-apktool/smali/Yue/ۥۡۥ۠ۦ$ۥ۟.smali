.class public LYue/ۥۡۥ۠ۦ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۥ۠ۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

.field public ۥ۟۟۠ۤ:LYue/ۥۡۥ۠ۦ;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۡۥ۠ۦ;


# direct methods
.method public constructor <init>(LYue/ۥۡۥ۠ۦ;LYue/ۥۡۥ۠ۦ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥۡۥ۠ۦ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥۡۥ۠ۦ;

    return-void
.end method


# virtual methods
.method public compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, LYue/ۥۣۣۢ۟;

    iget-object v0, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    iget v0, v0, LYue/ۥۣۣۢ۟;->ۥ۟۟:I

    iget p1, p1, LYue/ۥۣۣۢ۟;->ۥ۟۟:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    const-string v1, "[ "

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    const/16 v2, 0x9

    if-ge v0, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    iget-object v1, v1, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    aget v1, v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(LYue/ۥۣۣۢ۟;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x9

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    iget-object v1, v1, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    aget v2, v1, v0

    iget-object v3, p1, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    aget v3, v3, v0

    add-float/2addr v2, v3

    aput v2, v1, v0

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const v2, 0x38d1b717    # 1.0E-4f

    cmpg-float v1, v1, v2

    if-gez v1, :cond_0

    iget-object v1, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    iget-object v1, v1, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    const/4 v2, 0x0

    aput v2, v1, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public ۥ۟۟۟(LYue/ۥۣۣۢ۟;F)Z
    .locals 9

    iget-object v0, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    iget-boolean v0, v0, LYue/ۥۣۣۢ۟;->ۥ:Z

    const v1, 0x38d1b717    # 1.0E-4f

    const/16 v2, 0x9

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v0, :cond_3

    move v0, v4

    :goto_0
    if-ge v0, v2, :cond_1

    iget-object v6, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    iget-object v6, v6, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    aget v7, v6, v0

    iget-object v8, p1, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    aget v8, v8, v0

    mul-float/2addr v8, p2

    add-float/2addr v7, v8

    aput v7, v6, v0

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v1

    if-gez v6, :cond_0

    iget-object v6, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    iget-object v6, v6, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    aput v3, v6, v0

    goto :goto_1

    :cond_0
    move v5, v4

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz v5, :cond_2

    iget-object p1, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥۡۥ۠ۦ;

    iget-object p2, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    invoke-static {p1, p2}, LYue/ۥۡۥ۠ۦ;->ۥ۟۟ۡۦ(LYue/ۥۡۥ۠ۦ;LYue/ۥۣۣۢ۟;)V

    :cond_2
    return v4

    :cond_3
    :goto_2
    if-ge v4, v2, :cond_6

    iget-object v0, p1, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    aget v0, v0, v4

    cmpl-float v6, v0, v3

    if-eqz v6, :cond_5

    mul-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpg-float v6, v6, v1

    if-gez v6, :cond_4

    move v0, v3

    :cond_4
    iget-object v6, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    iget-object v6, v6, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    aput v0, v6, v4

    goto :goto_3

    :cond_5
    iget-object v0, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    iget-object v0, v0, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    aput v3, v0, v4

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    return v5
.end method

.method public ۥ۟۟۟۟(LYue/ۥۣۣۢ۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    return-void
.end method

.method public final ۥ۟۟۟۠()Z
    .locals 5

    const/16 v0, 0x8

    :goto_0
    const/4 v1, 0x0

    if-ltz v0, :cond_2

    iget-object v2, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    iget-object v2, v2, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    aget v2, v2, v0

    const/4 v3, 0x0

    cmpl-float v4, v2, v3

    if-lez v4, :cond_0

    return v1

    :cond_0
    cmpg-float v1, v2, v3

    if-gez v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final ۥ۟۟۟ۡ()Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/16 v2, 0x9

    if-ge v1, v2, :cond_1

    iget-object v2, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    iget-object v2, v2, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    aget v2, v2, v1

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final ۥۣ۟۟۟(LYue/ۥۣۣۢ۟;)Z
    .locals 5

    const/16 v0, 0x8

    :goto_0
    const/4 v1, 0x0

    if-ltz v0, :cond_1

    iget-object v2, p1, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    aget v2, v2, v0

    iget-object v3, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    iget-object v3, v3, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    aget v3, v3, v0

    cmpl-float v4, v3, v2

    if-nez v4, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    cmpg-float p1, v3, v2

    if-gez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public ۥ۟۟۟ۤ()V
    .locals 2

    iget-object v0, p0, LYue/ۥۡۥ۠ۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۢ۟;

    iget-object v0, v0, LYue/ۥۣۣۢ۟;->ۥۣ۟۟۟:[F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    return-void
.end method
