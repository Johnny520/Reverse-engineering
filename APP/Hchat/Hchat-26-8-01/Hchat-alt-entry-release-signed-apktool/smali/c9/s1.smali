.class public final Lc9/s1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:J

.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:J

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IIIJLjava/lang/String;IJLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc9/s1;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lc9/s1;->b:I

    .line 7
    .line 8
    iput p3, p0, Lc9/s1;->c:I

    .line 9
    .line 10
    iput p4, p0, Lc9/s1;->d:I

    .line 11
    .line 12
    iput-wide p5, p0, Lc9/s1;->e:J

    .line 13
    .line 14
    iput-object p7, p0, Lc9/s1;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput p8, p0, Lc9/s1;->g:I

    .line 17
    .line 18
    iput-wide p9, p0, Lc9/s1;->h:J

    .line 19
    .line 20
    iput-object p11, p0, Lc9/s1;->i:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p12, p0, Lc9/s1;->j:Ljava/lang/String;

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
    instance-of v0, p1, Lc9/s1;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lc9/s1;

    .line 11
    .line 12
    iget-object v0, p0, Lc9/s1;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p1, Lc9/s1;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget v0, p0, Lc9/s1;->b:I

    .line 24
    .line 25
    iget v1, p1, Lc9/s1;->b:I

    .line 26
    .line 27
    if-eq v0, v1, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget v0, p0, Lc9/s1;->c:I

    .line 31
    .line 32
    iget v1, p1, Lc9/s1;->c:I

    .line 33
    .line 34
    if-eq v0, v1, :cond_4

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_4
    iget v0, p0, Lc9/s1;->d:I

    .line 38
    .line 39
    iget v1, p1, Lc9/s1;->d:I

    .line 40
    .line 41
    if-eq v0, v1, :cond_5

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_5
    iget-wide v0, p0, Lc9/s1;->e:J

    .line 45
    .line 46
    iget-wide v2, p1, Lc9/s1;->e:J

    .line 47
    .line 48
    cmp-long v0, v0, v2

    .line 49
    .line 50
    if-eqz v0, :cond_6

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_6
    iget-object v0, p0, Lc9/s1;->f:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v1, p1, Lc9/s1;->f:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_7

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_7
    iget v0, p0, Lc9/s1;->g:I

    .line 65
    .line 66
    iget v1, p1, Lc9/s1;->g:I

    .line 67
    .line 68
    if-eq v0, v1, :cond_8

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_8
    iget-wide v0, p0, Lc9/s1;->h:J

    .line 72
    .line 73
    iget-wide v2, p1, Lc9/s1;->h:J

    .line 74
    .line 75
    cmp-long v0, v0, v2

    .line 76
    .line 77
    if-eqz v0, :cond_9

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_9
    iget-object v0, p0, Lc9/s1;->i:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v1, p1, Lc9/s1;->i:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_a

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_a
    iget-object v0, p0, Lc9/s1;->j:Ljava/lang/String;

    .line 92
    .line 93
    iget-object p1, p1, Lc9/s1;->j:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-nez p1, :cond_b

    .line 100
    .line 101
    :goto_0
    const/4 p1, 0x0

    .line 102
    return p1

    .line 103
    :cond_b
    :goto_1
    const/4 p1, 0x1

    .line 104
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lc9/s1;->a:Ljava/lang/String;

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
    iget v2, p0, Lc9/s1;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lc9/s1;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lc9/s1;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, Lc9/s1;->e:J

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lc9/s1;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lc9/s1;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, Lc9/s1;->h:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, Lc9/s1;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v1, p0, Lc9/s1;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/2addr v1, v0

    .line 65
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", unreadCount="

    .line 2
    .line 3
    const-string v1, ", status="

    .line 4
    .line 5
    iget v2, p0, Lc9/s1;->b:I

    .line 6
    .line 7
    const-string v3, "ConversationRecord(username="

    .line 8
    .line 9
    iget-object v4, p0, Lc9/s1;->a:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v4, v0, v1}, Leh/a;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", isSend="

    .line 16
    .line 17
    const-string v2, ", conversationTime="

    .line 18
    .line 19
    iget v3, p0, Lc9/s1;->c:I

    .line 20
    .line 21
    iget v4, p0, Lc9/s1;->d:I

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-wide v1, p0, Lc9/s1;->e:J

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", content="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lc9/s1;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", messageType="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget v1, p0, Lc9/s1;->g:I

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", flag="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-wide v1, p0, Lc9/s1;->h:J

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", digest="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lc9/s1;->i:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ", digestUser="

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lc9/s1;->j:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v1, ")"

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0
.end method
