.class public final Leb/y;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z


# direct methods
.method public constructor <init>(ZZZZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Leb/y;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Leb/y;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Leb/y;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Leb/y;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Leb/y;->e:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Leb/y;->f:Z

    .line 15
    .line 16
    iput-boolean p7, p0, Leb/y;->g:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Leb/y;)Leb/y;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Leb/y;

    .line 5
    .line 6
    iget-boolean v1, p0, Leb/y;->a:Z

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    iget-boolean v1, p1, Leb/y;->a:Z

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v3

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    move v1, v2

    .line 20
    :goto_1
    iget-boolean v4, p0, Leb/y;->b:Z

    .line 21
    .line 22
    if-nez v4, :cond_3

    .line 23
    .line 24
    iget-boolean v4, p1, Leb/y;->b:Z

    .line 25
    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move v4, v2

    .line 30
    move v2, v3

    .line 31
    goto :goto_3

    .line 32
    :cond_3
    :goto_2
    move v4, v2

    .line 33
    :goto_3
    iget-boolean v5, p0, Leb/y;->c:Z

    .line 34
    .line 35
    if-nez v5, :cond_5

    .line 36
    .line 37
    iget-boolean v5, p1, Leb/y;->c:Z

    .line 38
    .line 39
    if-eqz v5, :cond_4

    .line 40
    .line 41
    goto :goto_4

    .line 42
    :cond_4
    move v5, v3

    .line 43
    goto :goto_5

    .line 44
    :cond_5
    :goto_4
    move v5, v3

    .line 45
    move v3, v4

    .line 46
    :goto_5
    iget-boolean v6, p0, Leb/y;->d:Z

    .line 47
    .line 48
    if-nez v6, :cond_7

    .line 49
    .line 50
    iget-boolean v6, p1, Leb/y;->d:Z

    .line 51
    .line 52
    if-eqz v6, :cond_6

    .line 53
    .line 54
    goto :goto_6

    .line 55
    :cond_6
    move v6, v4

    .line 56
    move v4, v5

    .line 57
    goto :goto_7

    .line 58
    :cond_7
    :goto_6
    move v6, v4

    .line 59
    :goto_7
    iget-boolean v7, p0, Leb/y;->e:Z

    .line 60
    .line 61
    if-nez v7, :cond_9

    .line 62
    .line 63
    iget-boolean v7, p1, Leb/y;->e:Z

    .line 64
    .line 65
    if-eqz v7, :cond_8

    .line 66
    .line 67
    goto :goto_8

    .line 68
    :cond_8
    move v7, v5

    .line 69
    goto :goto_9

    .line 70
    :cond_9
    :goto_8
    move v7, v5

    .line 71
    move v5, v6

    .line 72
    :goto_9
    iget-boolean v8, p0, Leb/y;->f:Z

    .line 73
    .line 74
    if-nez v8, :cond_b

    .line 75
    .line 76
    iget-boolean v8, p1, Leb/y;->f:Z

    .line 77
    .line 78
    if-eqz v8, :cond_a

    .line 79
    .line 80
    goto :goto_a

    .line 81
    :cond_a
    move v8, v6

    .line 82
    move v6, v7

    .line 83
    goto :goto_b

    .line 84
    :cond_b
    :goto_a
    move v8, v6

    .line 85
    :goto_b
    iget-boolean v9, p0, Leb/y;->g:Z

    .line 86
    .line 87
    if-nez v9, :cond_c

    .line 88
    .line 89
    iget-boolean p1, p1, Leb/y;->g:Z

    .line 90
    .line 91
    if-eqz p1, :cond_d

    .line 92
    .line 93
    :cond_c
    move v7, v8

    .line 94
    :cond_d
    invoke-direct/range {v0 .. v7}, Leb/y;-><init>(ZZZZZZZ)V

    .line 95
    .line 96
    .line 97
    return-object v0
.end method

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
    instance-of v1, p1, Leb/y;

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
    check-cast p1, Leb/y;

    .line 12
    .line 13
    iget-boolean v1, p0, Leb/y;->a:Z

    .line 14
    .line 15
    iget-boolean v3, p1, Leb/y;->a:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-boolean v1, p0, Leb/y;->b:Z

    .line 21
    .line 22
    iget-boolean v3, p1, Leb/y;->b:Z

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-boolean v1, p0, Leb/y;->c:Z

    .line 28
    .line 29
    iget-boolean v3, p1, Leb/y;->c:Z

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget-boolean v1, p0, Leb/y;->d:Z

    .line 35
    .line 36
    iget-boolean v3, p1, Leb/y;->d:Z

    .line 37
    .line 38
    if-eq v1, v3, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    iget-boolean v1, p0, Leb/y;->e:Z

    .line 42
    .line 43
    iget-boolean v3, p1, Leb/y;->e:Z

    .line 44
    .line 45
    if-eq v1, v3, :cond_6

    .line 46
    .line 47
    return v2

    .line 48
    :cond_6
    iget-boolean v1, p0, Leb/y;->f:Z

    .line 49
    .line 50
    iget-boolean v3, p1, Leb/y;->f:Z

    .line 51
    .line 52
    if-eq v1, v3, :cond_7

    .line 53
    .line 54
    return v2

    .line 55
    :cond_7
    iget-boolean v1, p0, Leb/y;->g:Z

    .line 56
    .line 57
    iget-boolean p1, p1, Leb/y;->g:Z

    .line 58
    .line 59
    if-eq v1, p1, :cond_8

    .line 60
    .line 61
    return v2

    .line 62
    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Leb/y;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v2, p0, Leb/y;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Leb/y;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, Leb/y;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, Leb/y;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, Leb/y;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v1, p0, Leb/y;->g:Z

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v1, v0

    .line 47
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CallbackFlags(hasSendButton="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Leb/y;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", hasHandleMsg="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Leb/y;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", hasOpenSettings="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", hasMemberChange="

    .line 29
    .line 30
    const-string v2, ", hasNewFriend="

    .line 31
    .line 32
    iget-boolean v3, p0, Leb/y;->c:Z

    .line 33
    .line 34
    iget-boolean v4, p0, Leb/y;->d:Z

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, Lp/a;->x(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", hasProtobufPacket="

    .line 40
    .line 41
    const-string v2, ", hasImageDownload="

    .line 42
    .line 43
    iget-boolean v3, p0, Leb/y;->e:Z

    .line 44
    .line 45
    iget-boolean v4, p0, Leb/y;->f:Z

    .line 46
    .line 47
    invoke-static {v0, v3, v1, v4, v2}, Lp/a;->x(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v1, ")"

    .line 51
    .line 52
    iget-boolean v2, p0, Leb/y;->g:Z

    .line 53
    .line 54
    invoke-static {v1, v0, v2}, Lp/a;->m(Ljava/lang/String;Ljava/lang/StringBuilder;Z)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0
.end method
