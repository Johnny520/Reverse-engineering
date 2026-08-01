.class public final Lmg1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:I

.field public final β:I

.field public final γ:I

.field public final δ:I

.field public final ε:I

.field public final ζ:I

.field public final η:I

.field public final θ:Ljava/lang/String;


# direct methods
.method public constructor <init>(IIIIIIILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lmg1;->α:I

    .line 5
    .line 6
    iput p2, p0, Lmg1;->β:I

    .line 7
    .line 8
    iput p3, p0, Lmg1;->γ:I

    .line 9
    .line 10
    iput p4, p0, Lmg1;->δ:I

    .line 11
    .line 12
    iput p5, p0, Lmg1;->ε:I

    .line 13
    .line 14
    iput p6, p0, Lmg1;->ζ:I

    .line 15
    .line 16
    iput p7, p0, Lmg1;->η:I

    .line 17
    .line 18
    iput-object p8, p0, Lmg1;->θ:Ljava/lang/String;

    .line 19
    .line 20
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
    instance-of v0, p1, Lmg1;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lmg1;

    .line 10
    .line 11
    iget v0, p0, Lmg1;->α:I

    .line 12
    .line 13
    iget v1, p1, Lmg1;->α:I

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget v0, p0, Lmg1;->β:I

    .line 19
    .line 20
    iget v1, p1, Lmg1;->β:I

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget v0, p0, Lmg1;->γ:I

    .line 26
    .line 27
    iget v1, p1, Lmg1;->γ:I

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget v0, p0, Lmg1;->δ:I

    .line 33
    .line 34
    iget v1, p1, Lmg1;->δ:I

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget v0, p0, Lmg1;->ε:I

    .line 40
    .line 41
    iget v1, p1, Lmg1;->ε:I

    .line 42
    .line 43
    if-eq v0, v1, :cond_6

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_6
    iget v0, p0, Lmg1;->ζ:I

    .line 47
    .line 48
    iget v1, p1, Lmg1;->ζ:I

    .line 49
    .line 50
    if-eq v0, v1, :cond_7

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_7
    iget v0, p0, Lmg1;->η:I

    .line 54
    .line 55
    iget v1, p1, Lmg1;->η:I

    .line 56
    .line 57
    if-eq v0, v1, :cond_8

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_8
    iget-object p0, p0, Lmg1;->θ:Ljava/lang/String;

    .line 61
    .line 62
    iget-object p1, p1, Lmg1;->θ:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-nez p0, :cond_9

    .line 69
    .line 70
    :goto_0
    const/4 p0, 0x0

    .line 71
    return p0

    .line 72
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 73
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lmg1;->α:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget v2, p0, Lmg1;->β:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lmg1;->γ:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lmg1;->δ:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lmg1;->ε:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lmg1;->ζ:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lmg1;->η:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object p0, p0, Lmg1;->θ:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

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
    const-string v0, ", textMessagesSubmitted="

    .line 2
    .line 3
    const-string v1, ", imagesSubmitted="

    .line 4
    .line 5
    const-string v2, "Summary(checkedConversations="

    .line 6
    .line 7
    iget v3, p0, Lmg1;->α:I

    .line 8
    .line 9
    iget v4, p0, Lmg1;->β:I

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", rewardsClaimed="

    .line 16
    .line 17
    const-string v2, ", skippedConversations="

    .line 18
    .line 19
    iget v3, p0, Lmg1;->γ:I

    .line 20
    .line 21
    iget v4, p0, Lmg1;->δ:I

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", failureCount="

    .line 27
    .line 28
    const-string v2, ", retryableFailureCount="

    .line 29
    .line 30
    iget v3, p0, Lmg1;->ε:I

    .line 31
    .line 32
    iget v4, p0, Lmg1;->ζ:I

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget v1, p0, Lmg1;->η:I

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", message="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lmg1;->θ:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p0, ")"

    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method
