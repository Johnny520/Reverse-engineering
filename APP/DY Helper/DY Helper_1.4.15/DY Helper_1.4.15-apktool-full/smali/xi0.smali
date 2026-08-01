.class public final Lxi0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:J

.field public final γ:Ljava/lang/String;

.field public final δ:Ljava/lang/String;

.field public final ε:Lnj0;

.field public final ζ:Z

.field public final η:J

.field public final θ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lnj0;ZJLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxi0;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lxi0;->β:J

    .line 7
    .line 8
    iput-object p4, p0, Lxi0;->γ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Lxi0;->δ:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Lxi0;->ε:Lnj0;

    .line 13
    .line 14
    iput-boolean p7, p0, Lxi0;->ζ:Z

    .line 15
    .line 16
    iput-wide p8, p0, Lxi0;->η:J

    .line 17
    .line 18
    iput-object p10, p0, Lxi0;->θ:Ljava/lang/String;

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
    instance-of v0, p1, Lxi0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lxi0;

    .line 10
    .line 11
    iget-object v0, p0, Lxi0;->α:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Lxi0;->α:Ljava/lang/String;

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
    iget-wide v0, p0, Lxi0;->β:J

    .line 23
    .line 24
    iget-wide v2, p1, Lxi0;->β:J

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
    iget-object v0, p0, Lxi0;->γ:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v1, p1, Lxi0;->γ:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-object v0, p0, Lxi0;->δ:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v1, p1, Lxi0;->δ:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    iget-object v0, p0, Lxi0;->ε:Lnj0;

    .line 54
    .line 55
    iget-object v1, p1, Lxi0;->ε:Lnj0;

    .line 56
    .line 57
    if-eq v0, v1, :cond_6

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_6
    iget-boolean v0, p0, Lxi0;->ζ:Z

    .line 61
    .line 62
    iget-boolean v1, p1, Lxi0;->ζ:Z

    .line 63
    .line 64
    if-eq v0, v1, :cond_7

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_7
    iget-wide v0, p0, Lxi0;->η:J

    .line 68
    .line 69
    iget-wide v2, p1, Lxi0;->η:J

    .line 70
    .line 71
    cmp-long v0, v0, v2

    .line 72
    .line 73
    if-eqz v0, :cond_8

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_8
    iget-object p0, p0, Lxi0;->θ:Ljava/lang/String;

    .line 77
    .line 78
    iget-object p1, p1, Lxi0;->θ:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-nez p0, :cond_9

    .line 85
    .line 86
    :goto_0
    const/4 p0, 0x0

    .line 87
    return p0

    .line 88
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 89
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lxi0;->α:Ljava/lang/String;

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
    iget-wide v2, p0, Lxi0;->β:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lxi0;->γ:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lxi0;->δ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lxi0;->ε:Lnj0;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-boolean v0, p0, Lxi0;->ζ:Z

    .line 37
    .line 38
    invoke-static {v2, v1, v0}, Llz1;->γ(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-wide v2, p0, Lxi0;->η:J

    .line 43
    .line 44
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object p0, p0, Lxi0;->θ:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    add-int/2addr p0, v0

    .line 55
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "IMConversationDeleteItem(conversationId="

    .line 2
    .line 3
    const-string v1, ", otherUid="

    .line 4
    .line 5
    iget-object v2, p0, Lxi0;->α:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v3, p0, Lxi0;->β:J

    .line 8
    .line 9
    invoke-static {v0, v2, v3, v4, v1}, Lnx;->π(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", displayName="

    .line 14
    .line 15
    const-string v2, ", fallbackTitle="

    .line 16
    .line 17
    iget-object v3, p0, Lxi0;->γ:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v4, p0, Lxi0;->δ:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0, v1, v3, v2, v4}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, ", relation="

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lxi0;->ε:Lnj0;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ", isStranger="

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-boolean v1, p0, Lxi0;->ζ:Z

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", updateAt="

    .line 45
    .line 46
    const-string v2, ", searchText="

    .line 47
    .line 48
    iget-wide v3, p0, Lxi0;->η:J

    .line 49
    .line 50
    invoke-static {v0, v1, v3, v4, v2}, Lnx;->Β(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v1, ")"

    .line 54
    .line 55
    iget-object p0, p0, Lxi0;->θ:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v0, p0, v1}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method

.method public final α()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lxi0;->γ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Lxi0;->δ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final β()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lxi0;->γ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Lxi0;->δ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const-string p0, "\u540d\u79f0\u89e3\u6790\u4e2d"

    .line 18
    .line 19
    :cond_0
    return-object p0

    .line 20
    :cond_1
    return-object v0
.end method
