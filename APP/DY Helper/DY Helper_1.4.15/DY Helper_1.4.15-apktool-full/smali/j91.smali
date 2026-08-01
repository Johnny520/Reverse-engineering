.class final Lj91;
.super Lv01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv01;"
    }
.end annotation


# instance fields
.field public final α:Lba;

.field public final β:Li2;


# direct methods
.method public constructor <init>(Lba;Li2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj91;->α:Lba;

    .line 5
    .line 6
    iput-object p2, p0, Lj91;->β:Li2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lj91;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lj91;

    .line 10
    .line 11
    iget-object v0, p0, Lj91;->α:Lba;

    .line 12
    .line 13
    iget-object v1, p1, Lj91;->α:Lba;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    sget-object v0, Lx;->κ:Laa;

    .line 23
    .line 24
    invoke-virtual {v0, v0}, Laa;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-object p0, p0, Lj91;->β:Li2;

    .line 32
    .line 33
    iget-object p1, p1, Lj91;->β:Li2;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    const/high16 p0, 0x3f800000    # 1.0f

    .line 43
    .line 44
    invoke-static {p0, p0}, Ljava/lang/Float;->compare(FF)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_5

    .line 49
    .line 50
    :goto_0
    const/4 p0, 0x0

    .line 51
    return p0

    .line 52
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 53
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lj91;->α:Lba;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    mul-int/2addr v3, v1

    .line 21
    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    add-int/2addr v2, v3

    .line 26
    add-int/2addr v2, v0

    .line 27
    mul-int/2addr v2, v1

    .line 28
    iget-object p0, p0, Lj91;->β:Li2;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v2

    .line 35
    mul-int/2addr p0, v1

    .line 36
    const/high16 v0, 0x3f800000    # 1.0f

    .line 37
    .line 38
    invoke-static {v0, p0, v1}, Llz1;->α(FII)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PainterElement(painter="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lj91;->α:Lba;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", sizeToIntrinsics=true, alignment="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    sget-object v1, Lx;->κ:Laa;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", contentScale="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lj91;->β:Li2;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, ", alpha=1.0, colorFilter=null)"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public final δ()Lq01;
    .locals 3

    .line 1
    new-instance v0, Lk91;

    .line 2
    .line 3
    sget-object v1, Lx;->κ:Laa;

    .line 4
    .line 5
    invoke-direct {v0}, Lq01;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lj91;->α:Lba;

    .line 9
    .line 10
    iput-object v2, v0, Lk91;->τ:Lba;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    iput-boolean v2, v0, Lk91;->υ:Z

    .line 14
    .line 15
    iput-object v1, v0, Lk91;->φ:Laa;

    .line 16
    .line 17
    iget-object p0, p0, Lj91;->β:Li2;

    .line 18
    .line 19
    iput-object p0, v0, Lk91;->χ:Li2;

    .line 20
    .line 21
    const/high16 p0, 0x3f800000    # 1.0f

    .line 22
    .line 23
    iput p0, v0, Lk91;->ψ:F

    .line 24
    .line 25
    return-object v0
.end method

.method public final ε(Lq01;)V
    .locals 7

    .line 1
    check-cast p1, Lk91;

    .line 2
    .line 3
    iget-boolean v0, p1, Lk91;->υ:Z

    .line 4
    .line 5
    iget-object v1, p0, Lj91;->α:Lba;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v0, v2, :cond_1

    .line 9
    .line 10
    iget-object v0, p1, Lk91;->τ:Lba;

    .line 11
    .line 12
    iget-wide v3, v0, Lba;->ζ:J

    .line 13
    .line 14
    invoke-static {v3, v4}, Ls1;->Ζ(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    iget-wide v5, v1, Lba;->ζ:J

    .line 19
    .line 20
    invoke-static {v5, v6}, Ls1;->Ζ(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    invoke-static {v3, v4, v5, v6}, Ljw1;->α(JJ)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    move v0, v2

    .line 34
    :goto_1
    iput-object v1, p1, Lk91;->τ:Lba;

    .line 35
    .line 36
    iput-boolean v2, p1, Lk91;->υ:Z

    .line 37
    .line 38
    sget-object v1, Lx;->κ:Laa;

    .line 39
    .line 40
    iput-object v1, p1, Lk91;->φ:Laa;

    .line 41
    .line 42
    iget-object p0, p0, Lj91;->β:Li2;

    .line 43
    .line 44
    iput-object p0, p1, Lk91;->χ:Li2;

    .line 45
    .line 46
    const/high16 p0, 0x3f800000    # 1.0f

    .line 47
    .line 48
    iput p0, p1, Lk91;->ψ:F

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-static {p1}, Lbd;->Α(Lqp0;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-static {p1}, Lyh;->Σ(Lbw;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method
