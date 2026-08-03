.class public final Lua/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:I

.field public final g:D

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lua/d;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lua/d;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lua/d;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lua/d;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput p5, p0, Lua/d;->e:I

    .line 13
    .line 14
    iput p6, p0, Lua/d;->f:I

    .line 15
    .line 16
    iput-wide p7, p0, Lua/d;->g:D

    .line 17
    .line 18
    iput-object p9, p0, Lua/d;->h:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p10, p0, Lua/d;->i:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p11, p0, Lua/d;->j:Ljava/lang/String;

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
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lua/d;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lua/d;

    .line 12
    .line 13
    iget-object v0, p0, Lua/d;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, Lua/d;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, p0, Lua/d;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, p1, Lua/d;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget-object v0, p0, Lua/d;->c:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v1, p1, Lua/d;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    iget-object v0, p0, Lua/d;->d:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v1, p1, Lua/d;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    iget v0, p0, Lua/d;->e:I

    .line 58
    .line 59
    iget v1, p1, Lua/d;->e:I

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    iget v0, p0, Lua/d;->f:I

    .line 65
    .line 66
    iget v1, p1, Lua/d;->f:I

    .line 67
    .line 68
    if-eq v0, v1, :cond_7

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_7
    iget-wide v0, p0, Lua/d;->g:D

    .line 72
    .line 73
    iget-wide v2, p1, Lua/d;->g:D

    .line 74
    .line 75
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_8

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_8
    iget-object v0, p0, Lua/d;->h:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v1, p1, Lua/d;->h:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_9

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_9
    iget-object v0, p0, Lua/d;->i:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v1, p1, Lua/d;->i:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_a

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_a
    iget-object v0, p0, Lua/d;->j:Ljava/lang/String;

    .line 105
    .line 106
    iget-object p1, p1, Lua/d;->j:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-nez p1, :cond_b

    .line 113
    .line 114
    :goto_0
    const/4 p1, 0x0

    .line 115
    return p1

    .line 116
    :cond_b
    :goto_1
    const/4 p1, 0x1

    .line 117
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lua/d;->a:Ljava/lang/String;

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
    iget-object v2, p0, Lua/d;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lua/d;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lua/d;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lua/d;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lua/d;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-wide v2, p0, Lua/d;->g:D

    .line 41
    .line 42
    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    iget-object v0, p0, Lua/d;->h:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v2, v1, v0}, Leh/a;->g(IILjava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v2, p0, Lua/d;->i:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v1, p0, Lua/d;->j:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    add-int/2addr v1, v0

    .line 67
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", transId="

    .line 2
    .line 3
    const-string v1, ", payerUsername="

    .line 4
    .line 5
    const-string v2, "TransferMessageInfo(transactionId="

    .line 6
    .line 7
    iget-object v3, p0, Lua/d;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lua/d;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", receiverUsername="

    .line 16
    .line 17
    const-string v2, ", invalidTime="

    .line 18
    .line 19
    iget-object v3, p0, Lua/d;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, Lua/d;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", totalFee="

    .line 27
    .line 28
    const-string v2, ", amount="

    .line 29
    .line 30
    iget v3, p0, Lua/d;->e:I

    .line 31
    .line 32
    iget v4, p0, Lua/d;->f:I

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-wide v1, p0, Lua/d;->g:D

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", paySubtype="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lua/d;->h:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", transferAttach="

    .line 53
    .line 54
    const-string v2, ", rawXml="

    .line 55
    .line 56
    iget-object v3, p0, Lua/d;->i:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v4, p0, Lua/d;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1, v3, v2, v4}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v1, ")"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0
.end method
