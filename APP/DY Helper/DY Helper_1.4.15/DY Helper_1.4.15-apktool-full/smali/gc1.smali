.class public final Lgc1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:Ljava/lang/String;

.field public final γ:I

.field public final δ:I

.field public final ε:I

.field public final ζ:I

.field public final η:I

.field public final θ:I

.field public final ι:Z


# direct methods
.method public synthetic constructor <init>(IIILjava/lang/String;)V
    .locals 10

    .line 1
    and-int/lit16 p3, p3, 0x100

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :goto_0
    move v9, p3

    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 p3, 0x1

    .line 9
    goto :goto_0

    .line 10
    :goto_1
    const-string v1, "\u6b63\u5728\u5237\u65b0\u8425\u5730"

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    move-object v0, p0

    .line 17
    move v3, p1

    .line 18
    move v4, p2

    .line 19
    move-object v2, p4

    .line 20
    invoke-direct/range {v0 .. v9}, Lgc1;-><init>(Ljava/lang/String;Ljava/lang/String;IIIIIIZ)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIIIIIZ)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lgc1;->α:Ljava/lang/String;

    .line 26
    iput-object p2, p0, Lgc1;->β:Ljava/lang/String;

    .line 27
    iput p3, p0, Lgc1;->γ:I

    .line 28
    iput p4, p0, Lgc1;->δ:I

    .line 29
    iput p5, p0, Lgc1;->ε:I

    .line 30
    iput p6, p0, Lgc1;->ζ:I

    .line 31
    iput p7, p0, Lgc1;->η:I

    .line 32
    iput p8, p0, Lgc1;->θ:I

    .line 33
    iput-boolean p9, p0, Lgc1;->ι:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lgc1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lgc1;

    .line 12
    .line 13
    iget-object v1, p0, Lgc1;->α:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lgc1;->α:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lgc1;->β:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lgc1;->β:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget v1, p0, Lgc1;->γ:I

    .line 36
    .line 37
    iget v3, p1, Lgc1;->γ:I

    .line 38
    .line 39
    if-eq v1, v3, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget v1, p0, Lgc1;->δ:I

    .line 43
    .line 44
    iget v3, p1, Lgc1;->δ:I

    .line 45
    .line 46
    if-eq v1, v3, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget v1, p0, Lgc1;->ε:I

    .line 50
    .line 51
    iget v3, p1, Lgc1;->ε:I

    .line 52
    .line 53
    if-eq v1, v3, :cond_6

    .line 54
    .line 55
    return v2

    .line 56
    :cond_6
    iget v1, p0, Lgc1;->ζ:I

    .line 57
    .line 58
    iget v3, p1, Lgc1;->ζ:I

    .line 59
    .line 60
    if-eq v1, v3, :cond_7

    .line 61
    .line 62
    return v2

    .line 63
    :cond_7
    iget v1, p0, Lgc1;->η:I

    .line 64
    .line 65
    iget v3, p1, Lgc1;->η:I

    .line 66
    .line 67
    if-eq v1, v3, :cond_8

    .line 68
    .line 69
    return v2

    .line 70
    :cond_8
    iget v1, p0, Lgc1;->θ:I

    .line 71
    .line 72
    iget v3, p1, Lgc1;->θ:I

    .line 73
    .line 74
    if-eq v1, v3, :cond_9

    .line 75
    .line 76
    return v2

    .line 77
    :cond_9
    iget-boolean p0, p0, Lgc1;->ι:Z

    .line 78
    .line 79
    iget-boolean p1, p1, Lgc1;->ι:Z

    .line 80
    .line 81
    if-eq p0, p1, :cond_a

    .line 82
    .line 83
    return v2

    .line 84
    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lgc1;->α:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, Lgc1;->β:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lgc1;->γ:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lgc1;->δ:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lgc1;->ε:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lgc1;->ζ:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lgc1;->η:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, Lgc1;->θ:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean p0, p0, Lgc1;->ι:Z

    .line 53
    .line 54
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    add-int/2addr p0, v0

    .line 59
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", detail="

    .line 2
    .line 3
    const-string v1, ", completedPeople="

    .line 4
    .line 5
    const-string v2, "TaskProgress(title="

    .line 6
    .line 7
    iget-object v3, p0, Lgc1;->α:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lgc1;->β:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", totalPeople="

    .line 16
    .line 17
    const-string v2, ", processedOperations="

    .line 18
    .line 19
    iget v3, p0, Lgc1;->γ:I

    .line 20
    .line 21
    iget v4, p0, Lgc1;->δ:I

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", totalOperations="

    .line 27
    .line 28
    const-string v2, ", successfulOperations="

    .line 29
    .line 30
    iget v3, p0, Lgc1;->ε:I

    .line 31
    .line 32
    iget v4, p0, Lgc1;->ζ:I

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", failedOperations="

    .line 38
    .line 39
    const-string v2, ", isIndeterminate="

    .line 40
    .line 41
    iget v3, p0, Lgc1;->η:I

    .line 42
    .line 43
    iget v4, p0, Lgc1;->θ:I

    .line 44
    .line 45
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v1, ")"

    .line 49
    .line 50
    iget-boolean p0, p0, Lgc1;->ι:Z

    .line 51
    .line 52
    invoke-static {v0, p0, v1}, Llz1;->σ(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method
