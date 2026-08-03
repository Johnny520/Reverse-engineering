.class public final Lf9/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:J

.field public final d:Z

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>()V
    .locals 10

    const-wide/16 v1, 0x0

    const/4 v9, 0x0

    .line 21
    const-string v3, ""

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lf9/g;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p7, p0, Lf9/g;->a:Z

    .line 5
    .line 6
    iput-boolean p8, p0, Lf9/g;->b:Z

    .line 7
    .line 8
    iput-wide p1, p0, Lf9/g;->c:J

    .line 9
    .line 10
    iput-boolean p9, p0, Lf9/g;->d:Z

    .line 11
    .line 12
    iput-object p3, p0, Lf9/g;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p4, p0, Lf9/g;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p5, p0, Lf9/g;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p6, p0, Lf9/g;->h:Ljava/lang/String;

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
    instance-of v0, p1, Lf9/g;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lf9/g;

    .line 10
    .line 11
    iget-boolean v0, p0, Lf9/g;->a:Z

    .line 12
    .line 13
    iget-boolean v1, p1, Lf9/g;->a:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean v0, p0, Lf9/g;->b:Z

    .line 19
    .line 20
    iget-boolean v1, p1, Lf9/g;->b:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-wide v0, p0, Lf9/g;->c:J

    .line 26
    .line 27
    iget-wide v2, p1, Lf9/g;->c:J

    .line 28
    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_4
    iget-boolean v0, p0, Lf9/g;->d:Z

    .line 35
    .line 36
    iget-boolean v1, p1, Lf9/g;->d:Z

    .line 37
    .line 38
    if-eq v0, v1, :cond_5

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_5
    iget-object v0, p0, Lf9/g;->e:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v1, p1, Lf9/g;->e:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_6

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_6
    iget-object v0, p0, Lf9/g;->f:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v1, p1, Lf9/g;->f:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_7

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_7
    iget-object v0, p0, Lf9/g;->g:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v1, p1, Lf9/g;->g:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_8

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_8
    iget-object v0, p0, Lf9/g;->h:Ljava/lang/String;

    .line 75
    .line 76
    iget-object p1, p1, Lf9/g;->h:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_9

    .line 83
    .line 84
    :goto_0
    const/4 p1, 0x0

    .line 85
    return p1

    .line 86
    :cond_9
    :goto_1
    const/4 p1, 0x1

    .line 87
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lf9/g;->a:Z

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
    iget-boolean v2, p0, Lf9/g;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lf9/g;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, Lf9/g;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lf9/g;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lf9/g;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lf9/g;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v1, p0, Lf9/g;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    add-int/2addr v1, v0

    .line 53
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "EditMessageUpdate(success="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lf9/g;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", requiresReload="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lf9/g;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", msgId="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, Lf9/g;->c:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", isTransfer="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, Lf9/g;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", oldContent="

    .line 44
    .line 45
    const-string v2, ", newContent="

    .line 46
    .line 47
    iget-object v3, p0, Lf9/g;->e:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v4, p0, Lf9/g;->f:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v0, v1, v3, v2, v4}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string v1, ", oldDisplayText="

    .line 55
    .line 56
    const-string v2, ", newDisplayText="

    .line 57
    .line 58
    iget-object v3, p0, Lf9/g;->g:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v4, p0, Lf9/g;->h:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v0, v1, v3, v2, v4}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const-string v1, ")"

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    return-object v0
.end method
