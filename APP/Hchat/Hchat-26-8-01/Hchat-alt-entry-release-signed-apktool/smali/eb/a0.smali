.class public final Leb/a0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Leb/c0;

.field public final b:Lbsh/Interpreter;

.field public volatile c:Z

.field public volatile d:Z

.field public volatile e:Z

.field public volatile f:Z

.field public volatile g:Z

.field public volatile h:Z

.field public volatile i:Z


# direct methods
.method public constructor <init>(Leb/c0;Lbsh/Interpreter;ZZZZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Leb/a0;->a:Leb/c0;

    .line 5
    .line 6
    iput-object p2, p0, Leb/a0;->b:Lbsh/Interpreter;

    .line 7
    .line 8
    iput-boolean p3, p0, Leb/a0;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Leb/a0;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Leb/a0;->e:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Leb/a0;->f:Z

    .line 15
    .line 16
    iput-boolean p7, p0, Leb/a0;->g:Z

    .line 17
    .line 18
    iput-boolean p8, p0, Leb/a0;->h:Z

    .line 19
    .line 20
    iput-boolean p9, p0, Leb/a0;->i:Z

    .line 21
    .line 22
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
    instance-of v0, p1, Leb/a0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Leb/a0;

    .line 10
    .line 11
    iget-object v0, p0, Leb/a0;->a:Leb/c0;

    .line 12
    .line 13
    iget-object v1, p1, Leb/a0;->a:Leb/c0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Leb/c0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, Leb/a0;->b:Lbsh/Interpreter;

    .line 23
    .line 24
    iget-object v1, p1, Leb/a0;->b:Lbsh/Interpreter;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-boolean v0, p0, Leb/a0;->c:Z

    .line 34
    .line 35
    iget-boolean v1, p1, Leb/a0;->c:Z

    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-boolean v0, p0, Leb/a0;->d:Z

    .line 41
    .line 42
    iget-boolean v1, p1, Leb/a0;->d:Z

    .line 43
    .line 44
    if-eq v0, v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-boolean v0, p0, Leb/a0;->e:Z

    .line 48
    .line 49
    iget-boolean v1, p1, Leb/a0;->e:Z

    .line 50
    .line 51
    if-eq v0, v1, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget-boolean v0, p0, Leb/a0;->f:Z

    .line 55
    .line 56
    iget-boolean v1, p1, Leb/a0;->f:Z

    .line 57
    .line 58
    if-eq v0, v1, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    iget-boolean v0, p0, Leb/a0;->g:Z

    .line 62
    .line 63
    iget-boolean v1, p1, Leb/a0;->g:Z

    .line 64
    .line 65
    if-eq v0, v1, :cond_8

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_8
    iget-boolean v0, p0, Leb/a0;->h:Z

    .line 69
    .line 70
    iget-boolean v1, p1, Leb/a0;->h:Z

    .line 71
    .line 72
    if-eq v0, v1, :cond_9

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_9
    iget-boolean v0, p0, Leb/a0;->i:Z

    .line 76
    .line 77
    iget-boolean p1, p1, Leb/a0;->i:Z

    .line 78
    .line 79
    if-eq v0, p1, :cond_a

    .line 80
    .line 81
    :goto_0
    const/4 p1, 0x0

    .line 82
    return p1

    .line 83
    :cond_a
    :goto_1
    const/4 p1, 0x1

    .line 84
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Leb/a0;->a:Leb/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, Leb/c0;->hashCode()I

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
    iget-object v2, p0, Leb/a0;->b:Lbsh/Interpreter;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-boolean v0, p0, Leb/a0;->c:Z

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, Leh/a;->h(IIZ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-boolean v2, p0, Leb/a0;->d:Z

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, Leb/a0;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-boolean v2, p0, Leb/a0;->f:Z

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-boolean v2, p0, Leb/a0;->g:Z

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-boolean v2, p0, Leb/a0;->h:Z

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-boolean v1, p0, Leb/a0;->i:Z

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v1, v0

    .line 61
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    iget-object v0, p0, Leb/a0;->a:Leb/c0;

    .line 2
    .line 3
    iget-object v1, p0, Leb/a0;->b:Lbsh/Interpreter;

    .line 4
    .line 5
    iget-boolean v2, p0, Leb/a0;->c:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Leb/a0;->d:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Leb/a0;->e:Z

    .line 10
    .line 11
    iget-boolean v5, p0, Leb/a0;->f:Z

    .line 12
    .line 13
    iget-boolean v6, p0, Leb/a0;->g:Z

    .line 14
    .line 15
    iget-boolean v7, p0, Leb/a0;->h:Z

    .line 16
    .line 17
    iget-boolean v8, p0, Leb/a0;->i:Z

    .line 18
    .line 19
    new-instance v9, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v10, "LoadedPlugin(plugin="

    .line 22
    .line 23
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ", interpreter="

    .line 30
    .line 31
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, ", hasSendButtonCallback="

    .line 38
    .line 39
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, ", hasHandleMsgCallback="

    .line 43
    .line 44
    const-string v1, ", hasOpenSettingsCallback="

    .line 45
    .line 46
    invoke-static {v9, v2, v0, v3, v1}, Lp/a;->x(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v0, ", hasMemberChangeCallback="

    .line 50
    .line 51
    const-string v1, ", hasNewFriendCallback="

    .line 52
    .line 53
    invoke-static {v9, v4, v0, v5, v1}, Lp/a;->x(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v0, ", hasProtobufPacketCallback="

    .line 57
    .line 58
    const-string v1, ", hasImageDownloadCallback="

    .line 59
    .line 60
    invoke-static {v9, v6, v0, v7, v1}, Lp/a;->x(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v0, ")"

    .line 64
    .line 65
    invoke-static {v0, v9, v8}, Lp/a;->m(Ljava/lang/String;Ljava/lang/StringBuilder;Z)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0
.end method
