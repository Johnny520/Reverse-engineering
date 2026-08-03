.class public final LYue/ۥۣۣۡۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣۡۥ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:F

.field public final ۥ۟۟۠ۤ:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥۣۣۡۤ;->ۥۣ۟۟۠:F

    iput p2, p0, LYue/ۥۣۣۡۤ;->ۥ۟۟۠ۤ:F

    return-void
.end method

.method private final ۥ۟۟۟ۡ(FF)Z
    .locals 0

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    instance-of v0, p1, LYue/ۥۣۣۡۤ;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LYue/ۥۣۣۡۤ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥۣۣۡۤ;

    invoke-virtual {v0}, LYue/ۥۣۣۡۤ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget v0, p0, LYue/ۥۣۣۡۤ;->ۥۣ۟۟۠:F

    check-cast p1, LYue/ۥۣۣۡۤ;

    iget v1, p1, LYue/ۥۣۣۡۤ;->ۥۣ۟۟۠:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_2

    iget v0, p0, LYue/ۥۣۣۡۤ;->ۥ۟۟۠ۤ:F

    iget p1, p1, LYue/ۥۣۣۡۤ;->ۥ۟۟۠ۤ:F

    cmpg-float p1, v0, p1

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
    .locals 2

    invoke-virtual {p0}, LYue/ۥۣۣۡۤ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    iget v0, p0, LYue/ۥۣۣۡۤ;->ۥۣ۟۟۠:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LYue/ۥۣۣۡۤ;->ۥ۟۟۠ۤ:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    :goto_0
    return v0
.end method

.method public isEmpty()Z
    .locals 2

    iget v0, p0, LYue/ۥۣۣۡۤ;->ۥۣ۟۟۠:F

    iget v1, p0, LYue/ۥۣۣۡۤ;->ۥ۟۟۠ۤ:F

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, LYue/ۥۣۣۡۤ;->ۥۣ۟۟۠:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "..<"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۣۣۡۤ;->ۥ۟۟۠ۤ:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic ۥ(Ljava/lang/Comparable;)Z
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥۣۣۡۤ;->ۥ۟۟(F)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic ۥ۟()Ljava/lang/Comparable;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣۣۡۤ;->ۥ۟۟۟۠()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟(F)Z
    .locals 1

    iget v0, p0, LYue/ۥۣۣۡۤ;->ۥۣ۟۟۠:F

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    iget v0, p0, LYue/ۥۣۣۡۤ;->ۥ۟۟۠ۤ:F

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic ۥ۟۟۟()Ljava/lang/Comparable;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣۣۡۤ;->ۥ۟۟۟۟()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟()Ljava/lang/Float;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget v0, p0, LYue/ۥۣۣۡۤ;->ۥ۟۟۠ۤ:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۠()Ljava/lang/Float;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget v0, p0, LYue/ۥۣۣۡۤ;->ۥۣ۟۟۠:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
