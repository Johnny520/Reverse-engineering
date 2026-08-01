.class public final Lga;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/graphics/BlendModeColorFilter;

.field public final β:J

.field public final γ:I


# direct methods
.method public constructor <init>(J)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/BlendModeColorFilter;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkn0;->Τ(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x5

    .line 8
    invoke-static {v2}, Lxb;->в(I)Landroid/graphics/BlendMode;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-direct {v0, v1, v3}, Landroid/graphics/BlendModeColorFilter;-><init>(ILandroid/graphics/BlendMode;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lga;->α:Landroid/graphics/BlendModeColorFilter;

    .line 19
    .line 20
    iput-wide p1, p0, Lga;->β:J

    .line 21
    .line 22
    iput v2, p0, Lga;->γ:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lga;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lga;

    .line 10
    .line 11
    iget-wide v0, p1, Lga;->β:J

    .line 12
    .line 13
    iget-wide v2, p0, Lga;->β:J

    .line 14
    .line 15
    invoke-static {v2, v3, v0, v1}, Lci;->γ(JJ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget p0, p0, Lga;->γ:I

    .line 23
    .line 24
    iget p1, p1, Lga;->γ:I

    .line 25
    .line 26
    if-ne p0, p1, :cond_3

    .line 27
    .line 28
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    sget v0, Lci;->θ:I

    .line 2
    .line 3
    iget-wide v0, p0, Lga;->β:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget p0, p0, Lga;->γ:I

    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BlendModeColorFilter(color="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, Lga;->β:J

    .line 9
    .line 10
    invoke-static {v1, v2}, Lci;->ι(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ", blendMode="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget p0, p0, Lga;->γ:I

    .line 23
    .line 24
    invoke-static {p0}, Lxb;->г(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const/16 p0, 0x29

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method
