.class public final Lph0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:J

.field public final γ:J

.field public final δ:I

.field public final ε:I

.field public final ζ:Ljava/lang/String;

.field public final η:Z

.field public final θ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;JJIILjava/lang/String;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lph0;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lph0;->β:J

    .line 7
    .line 8
    iput-wide p4, p0, Lph0;->γ:J

    .line 9
    .line 10
    iput p6, p0, Lph0;->δ:I

    .line 11
    .line 12
    iput p7, p0, Lph0;->ε:I

    .line 13
    .line 14
    iput-object p8, p0, Lph0;->ζ:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p9, p0, Lph0;->η:Z

    .line 17
    .line 18
    iput-boolean p10, p0, Lph0;->θ:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lph0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lph0;

    .line 10
    .line 11
    iget-object v0, p0, Lph0;->α:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Lph0;->α:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-wide v0, p0, Lph0;->β:J

    .line 23
    .line 24
    iget-wide v2, p1, Lph0;->β:J

    .line 25
    .line 26
    cmp-long v0, v0, v2

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-wide v0, p0, Lph0;->γ:J

    .line 32
    .line 33
    iget-wide v2, p1, Lph0;->γ:J

    .line 34
    .line 35
    cmp-long v0, v0, v2

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget v0, p0, Lph0;->δ:I

    .line 41
    .line 42
    iget v1, p1, Lph0;->δ:I

    .line 43
    .line 44
    if-eq v0, v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget v0, p0, Lph0;->ε:I

    .line 48
    .line 49
    iget v1, p1, Lph0;->ε:I

    .line 50
    .line 51
    if-eq v0, v1, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget-object v0, p0, Lph0;->ζ:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v1, p1, Lph0;->ζ:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    iget-boolean v0, p0, Lph0;->η:Z

    .line 66
    .line 67
    iget-boolean v1, p1, Lph0;->η:Z

    .line 68
    .line 69
    if-eq v0, v1, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-boolean p0, p0, Lph0;->θ:Z

    .line 73
    .line 74
    iget-boolean p1, p1, Lph0;->θ:Z

    .line 75
    .line 76
    if-eq p0, p1, :cond_9

    .line 77
    .line 78
    :goto_0
    const/4 p0, 0x0

    .line 79
    return p0

    .line 80
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 81
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lph0;->α:Ljava/lang/String;

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
    iget-wide v2, p0, Lph0;->β:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lph0;->γ:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lph0;->δ:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lph0;->ε:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lph0;->ζ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, Lph0;->η:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean p0, p0, Lph0;->θ:Z

    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int/2addr p0, v0

    .line 53
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "MessageInput(timeText="

    .line 2
    .line 3
    const-string v1, ", senderId="

    .line 4
    .line 5
    iget-object v2, p0, Lph0;->α:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v3, p0, Lph0;->β:J

    .line 8
    .line 9
    invoke-static {v0, v2, v3, v4, v1}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", currentUserId="

    .line 14
    .line 15
    const-string v2, ", msgType="

    .line 16
    .line 17
    iget-wide v3, p0, Lph0;->γ:J

    .line 18
    .line 19
    invoke-static {v0, v1, v3, v4, v2}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, ", subType="

    .line 23
    .line 24
    const-string v2, ", content="

    .line 25
    .line 26
    iget v3, p0, Lph0;->δ:I

    .line 27
    .line 28
    iget v4, p0, Lph0;->ε:I

    .line 29
    .line 30
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lph0;->ζ:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, ", hasAttachment="

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-boolean v1, p0, Lph0;->η:Z

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", hasReference="

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ")"

    .line 54
    .line 55
    iget-boolean p0, p0, Lph0;->θ:Z

    .line 56
    .line 57
    invoke-static {v0, p0, v1}, Llz1;->σ(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method
