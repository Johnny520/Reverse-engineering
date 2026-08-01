.class public final Lth0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:I

.field public final γ:J

.field public final δ:Ljava/lang/String;

.field public final ε:Ljava/lang/String;

.field public final ζ:Ljava/lang/String;

.field public final η:Ljava/lang/String;

.field public final θ:J


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lth0;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lth0;->β:I

    .line 7
    .line 8
    iput-wide p3, p0, Lth0;->γ:J

    .line 9
    .line 10
    iput-object p5, p0, Lth0;->δ:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Lth0;->ε:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p7, p0, Lth0;->ζ:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p8, p0, Lth0;->η:Ljava/lang/String;

    .line 17
    .line 18
    iput-wide p9, p0, Lth0;->θ:J

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
    instance-of v0, p1, Lth0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lth0;

    .line 10
    .line 11
    iget-object v0, p0, Lth0;->α:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Lth0;->α:Ljava/lang/String;

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
    iget v0, p0, Lth0;->β:I

    .line 23
    .line 24
    iget v1, p1, Lth0;->β:I

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-wide v0, p0, Lth0;->γ:J

    .line 30
    .line 31
    iget-wide v2, p1, Lth0;->γ:J

    .line 32
    .line 33
    cmp-long v0, v0, v2

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    iget-object v0, p0, Lth0;->δ:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v1, p1, Lth0;->δ:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget-object v0, p0, Lth0;->ε:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v1, p1, Lth0;->ε:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_6

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_6
    iget-object v0, p0, Lth0;->ζ:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v1, p1, Lth0;->ζ:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_7

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_7
    iget-object v0, p0, Lth0;->η:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v1, p1, Lth0;->η:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_8

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_8
    iget-wide v0, p0, Lth0;->θ:J

    .line 83
    .line 84
    iget-wide p0, p1, Lth0;->θ:J

    .line 85
    .line 86
    cmp-long p0, v0, p0

    .line 87
    .line 88
    if-eqz p0, :cond_9

    .line 89
    .line 90
    :goto_0
    const/4 p0, 0x0

    .line 91
    return p0

    .line 92
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 93
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lth0;->α:Ljava/lang/String;

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
    iget v2, p0, Lth0;->β:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La12;->α(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lth0;->γ:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lth0;->δ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lth0;->ε:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lth0;->ζ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lth0;->η:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v1, p0, Lth0;->θ:J

    .line 47
    .line 48
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

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
    const-string v0, ", conversationType="

    .line 2
    .line 3
    const-string v1, ", otherUid="

    .line 4
    .line 5
    iget v2, p0, Lth0;->β:I

    .line 6
    .line 7
    const-string v3, "Entry(conversationId="

    .line 8
    .line 9
    iget-object v4, p0, Lth0;->α:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v4, v0, v1}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, Lth0;->γ:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", title="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lth0;->δ:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", subtitle="

    .line 31
    .line 32
    const-string v2, ", stableKey="

    .line 33
    .line 34
    iget-object v3, p0, Lth0;->ε:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v4, p0, Lth0;->ζ:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1, v3, v2, v4}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v1, ", searchText="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lth0;->η:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", updateAt="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-wide v1, p0, Lth0;->θ:J

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string p0, ")"

    .line 62
    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

.method public final α()Ljava/lang/String;
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iget-wide v2, p0, Lth0;->γ:J

    .line 4
    .line 5
    cmp-long v0, v2, v0

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    sget-object v1, Lst;->α:Lst;

    .line 10
    .line 11
    invoke-static {v2, v3}, Lst;->ν(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_0
    iget-object v1, p0, Lth0;->δ:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_3

    .line 31
    .line 32
    if-lez v0, :cond_1

    .line 33
    .line 34
    const-string p0, "UID: "

    .line 35
    .line 36
    invoke-static {v2, v3, p0}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_1
    iget-object p0, p0, Lth0;->α:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_2
    const-string p0, "\u672a\u77e5\u4f1a\u8bdd"

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_3
    return-object v1
.end method
