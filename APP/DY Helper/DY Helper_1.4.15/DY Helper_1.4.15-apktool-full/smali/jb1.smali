.class public final Ljb1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/time/LocalDate;

.field public final β:J

.field public final γ:J

.field public final δ:I

.field public final ε:I

.field public final ζ:I

.field public final η:I


# direct methods
.method public synthetic constructor <init>(Ljava/time/LocalDate;)V
    .locals 10

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 19
    invoke-direct/range {v0 .. v9}, Ljb1;-><init>(Ljava/time/LocalDate;JJIIII)V

    return-void
.end method

.method public constructor <init>(Ljava/time/LocalDate;JJIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljb1;->α:Ljava/time/LocalDate;

    .line 5
    .line 6
    iput-wide p2, p0, Ljb1;->β:J

    .line 7
    .line 8
    iput-wide p4, p0, Ljb1;->γ:J

    .line 9
    .line 10
    iput p6, p0, Ljb1;->δ:I

    .line 11
    .line 12
    iput p7, p0, Ljb1;->ε:I

    .line 13
    .line 14
    iput p8, p0, Ljb1;->ζ:I

    .line 15
    .line 16
    iput p9, p0, Ljb1;->η:I

    .line 17
    .line 18
    return-void
.end method

.method public static α(Ljb1;Ljava/time/LocalDate;JJIIIII)Ljb1;
    .locals 10

    .line 1
    and-int/lit8 v0, p10, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Ljb1;->α:Ljava/time/LocalDate;

    .line 6
    .line 7
    :cond_0
    move-object v1, p1

    .line 8
    and-int/lit8 p1, p10, 0x2

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-wide p2, p0, Ljb1;->β:J

    .line 13
    .line 14
    :cond_1
    move-wide v2, p2

    .line 15
    and-int/lit8 p1, p10, 0x4

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    iget-wide p4, p0, Ljb1;->γ:J

    .line 20
    .line 21
    :cond_2
    move-wide v4, p4

    .line 22
    and-int/lit8 p1, p10, 0x8

    .line 23
    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    iget p1, p0, Ljb1;->δ:I

    .line 27
    .line 28
    move v6, p1

    .line 29
    goto :goto_0

    .line 30
    :cond_3
    move/from16 v6, p6

    .line 31
    .line 32
    :goto_0
    and-int/lit8 p1, p10, 0x10

    .line 33
    .line 34
    if-eqz p1, :cond_4

    .line 35
    .line 36
    iget p1, p0, Ljb1;->ε:I

    .line 37
    .line 38
    move v7, p1

    .line 39
    goto :goto_1

    .line 40
    :cond_4
    move/from16 v7, p7

    .line 41
    .line 42
    :goto_1
    and-int/lit8 p1, p10, 0x20

    .line 43
    .line 44
    if-eqz p1, :cond_5

    .line 45
    .line 46
    iget p1, p0, Ljb1;->ζ:I

    .line 47
    .line 48
    move v8, p1

    .line 49
    goto :goto_2

    .line 50
    :cond_5
    move/from16 v8, p8

    .line 51
    .line 52
    :goto_2
    and-int/lit8 p1, p10, 0x40

    .line 53
    .line 54
    if-eqz p1, :cond_6

    .line 55
    .line 56
    iget p1, p0, Ljb1;->η:I

    .line 57
    .line 58
    move v9, p1

    .line 59
    goto :goto_3

    .line 60
    :cond_6
    move/from16 v9, p9

    .line 61
    .line 62
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v0, Ljb1;

    .line 69
    .line 70
    invoke-direct/range {v0 .. v9}, Ljb1;-><init>(Ljava/time/LocalDate;JJIIII)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ljb1;

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
    check-cast p1, Ljb1;

    .line 12
    .line 13
    iget-object v1, p0, Ljb1;->α:Ljava/time/LocalDate;

    .line 14
    .line 15
    iget-object v3, p1, Ljb1;->α:Ljava/time/LocalDate;

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
    iget-wide v3, p0, Ljb1;->β:J

    .line 25
    .line 26
    iget-wide v5, p1, Ljb1;->β:J

    .line 27
    .line 28
    cmp-long v1, v3, v5

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-wide v3, p0, Ljb1;->γ:J

    .line 34
    .line 35
    iget-wide v5, p1, Ljb1;->γ:J

    .line 36
    .line 37
    cmp-long v1, v3, v5

    .line 38
    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget v1, p0, Ljb1;->δ:I

    .line 43
    .line 44
    iget v3, p1, Ljb1;->δ:I

    .line 45
    .line 46
    if-eq v1, v3, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget v1, p0, Ljb1;->ε:I

    .line 50
    .line 51
    iget v3, p1, Ljb1;->ε:I

    .line 52
    .line 53
    if-eq v1, v3, :cond_6

    .line 54
    .line 55
    return v2

    .line 56
    :cond_6
    iget v1, p0, Ljb1;->ζ:I

    .line 57
    .line 58
    iget v3, p1, Ljb1;->ζ:I

    .line 59
    .line 60
    if-eq v1, v3, :cond_7

    .line 61
    .line 62
    return v2

    .line 63
    :cond_7
    iget p0, p0, Ljb1;->η:I

    .line 64
    .line 65
    iget p1, p1, Ljb1;->η:I

    .line 66
    .line 67
    if-eq p0, p1, :cond_8

    .line 68
    .line 69
    return v2

    .line 70
    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Ljb1;->α:Ljava/time/LocalDate;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/time/LocalDate;->hashCode()I

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
    iget-wide v2, p0, Ljb1;->β:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Ljb1;->γ:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Ljb1;->δ:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Ljb1;->ε:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Ljb1;->ζ:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget p0, p0, Ljb1;->η:I

    .line 41
    .line 42
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v0

    .line 47
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PetElfCampDailyStatistics(date="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ljb1;->α:Ljava/time/LocalDate;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", coinIncome="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, Ljb1;->β:J

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", coinInvestment="

    .line 24
    .line 25
    const-string v2, ", plantCount="

    .line 26
    .line 27
    iget-wide v3, p0, Ljb1;->γ:J

    .line 28
    .line 29
    invoke-static {v0, v1, v3, v4, v2}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v1, ", waterCount="

    .line 33
    .line 34
    const-string v2, ", unknownIncomeCount="

    .line 35
    .line 36
    iget v3, p0, Ljb1;->δ:I

    .line 37
    .line 38
    iget v4, p0, Ljb1;->ε:I

    .line 39
    .line 40
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget v1, p0, Ljb1;->ζ:I

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", unknownInvestmentCount="

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget p0, p0, Ljb1;->η:I

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p0, ")"

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method
