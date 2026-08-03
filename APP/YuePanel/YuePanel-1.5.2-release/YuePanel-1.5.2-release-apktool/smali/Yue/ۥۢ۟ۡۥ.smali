.class public final LYue/ۥۢ۟ۡۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢ۟ۡۥ$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:F

.field public final ۥ۟:F


# direct methods
.method public constructor <init>(FF)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "width"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟(FLjava/lang/String;)F

    move-result p1

    iput p1, p0, LYue/ۥۢ۟ۡۥ;->ۥ:F

    const-string p1, "height"

    invoke-static {p2, p1}, LYue/ۥۡۤۧ;->ۥ۟۟۟(FLjava/lang/String;)F

    move-result p1

    iput p1, p0, LYue/ۥۢ۟ۡۥ;->ۥ۟:F

    return-void
.end method

.method public static ۥ۟۟۟(Landroid/util/SizeF;)LYue/ۥۢ۟ۡۥ;
    .locals 0
    .param p0    # Landroid/util/SizeF;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x15
    .end annotation

    invoke-static {p0}, LYue/ۥۢ۟ۡۥ$ۥ;->ۥ۟(Landroid/util/SizeF;)LYue/ۥۢ۟ۡۥ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥۢ۟ۡۥ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥۢ۟ۡۥ;

    iget v1, p1, LYue/ۥۢ۟ۡۥ;->ۥ:F

    iget v3, p0, LYue/ۥۢ۟ۡۥ;->ۥ:F

    cmpl-float v1, v1, v3

    if-nez v1, :cond_2

    iget p1, p1, LYue/ۥۢ۟ۡۥ;->ۥ۟:F

    iget v1, p0, LYue/ۥۢ۟ۡۥ;->ۥ۟:F

    cmpl-float p1, p1, v1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LYue/ۥۢ۟ۡۥ;->ۥ:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    iget v1, p0, LYue/ۥۢ۟ۡۥ;->ۥ۟:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, LYue/ۥۢ۟ۡۥ;->ۥ:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۢ۟ۡۥ;->ۥ۟:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()F
    .locals 1

    iget v0, p0, LYue/ۥۢ۟ۡۥ;->ۥ۟:F

    return v0
.end method

.method public ۥ۟()F
    .locals 1

    iget v0, p0, LYue/ۥۢ۟ۡۥ;->ۥ:F

    return v0
.end method

.method public ۥ۟۟()Landroid/util/SizeF;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x15
    .end annotation

    invoke-static {p0}, LYue/ۥۢ۟ۡۥ$ۥ;->ۥ(LYue/ۥۢ۟ۡۥ;)Landroid/util/SizeF;

    move-result-object v0

    return-object v0
.end method
