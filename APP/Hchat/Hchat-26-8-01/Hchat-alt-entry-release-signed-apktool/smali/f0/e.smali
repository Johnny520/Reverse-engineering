.class public final Lf0/e;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public final a:Ln2/z;

.field public final b:Ln2/s;

.field public final c:Lw/q0;

.field public final d:Z

.field public final e:Lb5/k;

.field public final f:Lh0/d1;

.field public final g:Ln2/j;

.field public final h:Ld1/v;


# direct methods
.method public constructor <init>(Ln2/z;Ln2/s;Lw/q0;ZLb5/k;Lh0/d1;Ln2/j;Ld1/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf0/e;->a:Ln2/z;

    .line 5
    .line 6
    iput-object p2, p0, Lf0/e;->b:Ln2/s;

    .line 7
    .line 8
    iput-object p3, p0, Lf0/e;->c:Lw/q0;

    .line 9
    .line 10
    iput-boolean p4, p0, Lf0/e;->d:Z

    .line 11
    .line 12
    iput-object p5, p0, Lf0/e;->e:Lb5/k;

    .line 13
    .line 14
    iput-object p6, p0, Lf0/e;->f:Lh0/d1;

    .line 15
    .line 16
    iput-object p7, p0, Lf0/e;->g:Ln2/j;

    .line 17
    .line 18
    iput-object p8, p0, Lf0/e;->h:Ld1/v;

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
    instance-of v0, p1, Lf0/e;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lf0/e;

    .line 10
    .line 11
    iget-object v0, p0, Lf0/e;->a:Ln2/z;

    .line 12
    .line 13
    iget-object v1, p1, Lf0/e;->a:Ln2/z;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ln2/z;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lf0/e;->b:Ln2/s;

    .line 23
    .line 24
    iget-object v1, p1, Lf0/e;->b:Ln2/s;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lf0/e;->c:Lw/q0;

    .line 34
    .line 35
    iget-object v1, p1, Lf0/e;->c:Lw/q0;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-boolean v0, p0, Lf0/e;->d:Z

    .line 45
    .line 46
    iget-boolean v1, p1, Lf0/e;->d:Z

    .line 47
    .line 48
    if-eq v0, v1, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-object v0, p0, Lf0/e;->e:Lb5/k;

    .line 52
    .line 53
    iget-object v1, p1, Lf0/e;->e:Lb5/k;

    .line 54
    .line 55
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget-object v0, p0, Lf0/e;->f:Lh0/d1;

    .line 63
    .line 64
    iget-object v1, p1, Lf0/e;->f:Lh0/d1;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_7

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_7
    iget-object v0, p0, Lf0/e;->g:Ln2/j;

    .line 74
    .line 75
    iget-object v1, p1, Lf0/e;->g:Ln2/j;

    .line 76
    .line 77
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_8

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_8
    iget-object v0, p0, Lf0/e;->h:Ld1/v;

    .line 85
    .line 86
    iget-object p1, p1, Lf0/e;->h:Ld1/v;

    .line 87
    .line 88
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_9

    .line 93
    .line 94
    :goto_0
    const/4 p1, 0x0

    .line 95
    return p1

    .line 96
    :cond_9
    :goto_1
    const/4 p1, 0x1

    .line 97
    return p1
.end method

.method public final f()Ly0/n;
    .locals 4

    .line 1
    new-instance v0, Lf0/i;

    .line 2
    .line 3
    invoke-direct {v0}, Lx1/j;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lf0/e;->a:Ln2/z;

    .line 7
    .line 8
    iput-object v1, v0, Lf0/i;->w:Ln2/z;

    .line 9
    .line 10
    iget-object v1, p0, Lf0/e;->b:Ln2/s;

    .line 11
    .line 12
    iput-object v1, v0, Lf0/i;->x:Ln2/s;

    .line 13
    .line 14
    iget-object v1, p0, Lf0/e;->c:Lw/q0;

    .line 15
    .line 16
    iput-object v1, v0, Lf0/i;->y:Lw/q0;

    .line 17
    .line 18
    iget-boolean v1, p0, Lf0/e;->d:Z

    .line 19
    .line 20
    iput-boolean v1, v0, Lf0/i;->z:Z

    .line 21
    .line 22
    iget-object v1, p0, Lf0/e;->e:Lb5/k;

    .line 23
    .line 24
    iput-object v1, v0, Lf0/i;->A:Lb5/k;

    .line 25
    .line 26
    iget-object v1, p0, Lf0/e;->f:Lh0/d1;

    .line 27
    .line 28
    iput-object v1, v0, Lf0/i;->B:Lh0/d1;

    .line 29
    .line 30
    iget-object v2, p0, Lf0/e;->g:Ln2/j;

    .line 31
    .line 32
    iput-object v2, v0, Lf0/i;->C:Ln2/j;

    .line 33
    .line 34
    iget-object v2, p0, Lf0/e;->h:Ld1/v;

    .line 35
    .line 36
    iput-object v2, v0, Lf0/i;->D:Ld1/v;

    .line 37
    .line 38
    new-instance v2, Lf0/f;

    .line 39
    .line 40
    const/4 v3, 0x4

    .line 41
    invoke-direct {v2, v0, v3}, Lf0/f;-><init>(Lf0/i;I)V

    .line 42
    .line 43
    .line 44
    iput-object v2, v1, Lh0/d1;->f:Lfg/a;

    .line 45
    .line 46
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 8

    .line 1
    check-cast p1, Lf0/i;

    .line 2
    .line 3
    iget-boolean v0, p1, Lf0/i;->z:Z

    .line 4
    .line 5
    iget-object v1, p1, Lf0/i;->C:Ln2/j;

    .line 6
    .line 7
    iget-object v2, p1, Lf0/i;->B:Lh0/d1;

    .line 8
    .line 9
    iget-object v3, p0, Lf0/e;->a:Ln2/z;

    .line 10
    .line 11
    iput-object v3, p1, Lf0/i;->w:Ln2/z;

    .line 12
    .line 13
    iget-object v3, p0, Lf0/e;->b:Ln2/s;

    .line 14
    .line 15
    iput-object v3, p1, Lf0/i;->x:Ln2/s;

    .line 16
    .line 17
    iget-object v4, p0, Lf0/e;->c:Lw/q0;

    .line 18
    .line 19
    iput-object v4, p1, Lf0/i;->y:Lw/q0;

    .line 20
    .line 21
    iget-boolean v4, p0, Lf0/e;->d:Z

    .line 22
    .line 23
    iput-boolean v4, p1, Lf0/i;->z:Z

    .line 24
    .line 25
    iget-object v5, p0, Lf0/e;->e:Lb5/k;

    .line 26
    .line 27
    iput-object v5, p1, Lf0/i;->A:Lb5/k;

    .line 28
    .line 29
    iget-object v5, p0, Lf0/e;->f:Lh0/d1;

    .line 30
    .line 31
    iput-object v5, p1, Lf0/i;->B:Lh0/d1;

    .line 32
    .line 33
    iget-object v6, p0, Lf0/e;->g:Ln2/j;

    .line 34
    .line 35
    iput-object v6, p1, Lf0/i;->C:Ln2/j;

    .line 36
    .line 37
    iget-object v7, p0, Lf0/e;->h:Ld1/v;

    .line 38
    .line 39
    iput-object v7, p1, Lf0/i;->D:Ld1/v;

    .line 40
    .line 41
    if-ne v4, v0, :cond_0

    .line 42
    .line 43
    if-ne v4, v0, :cond_0

    .line 44
    .line 45
    invoke-static {v6, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    iget-wide v0, v3, Ln2/s;->b:J

    .line 52
    .line 53
    invoke-static {v0, v1}, Li2/m0;->c(J)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    :cond_0
    invoke-static {p1}, Lx1/k;->n(Lx1/z1;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_2

    .line 67
    .line 68
    new-instance v0, Lf0/f;

    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    invoke-direct {v0, p1, v1}, Lf0/f;-><init>(Lf0/i;I)V

    .line 72
    .line 73
    .line 74
    iput-object v0, v5, Lh0/d1;->f:Lfg/a;

    .line 75
    .line 76
    :cond_2
    return-void
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lf0/e;->a:Ln2/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln2/z;->hashCode()I

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
    iget-object v2, p0, Lf0/e;->b:Ln2/s;

    .line 11
    .line 12
    invoke-virtual {v2}, Ln2/s;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lf0/e;->c:Lw/q0;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-boolean v3, p0, Lf0/e;->d:Z

    .line 32
    .line 33
    invoke-static {v0, v1, v3}, Leh/a;->h(IIZ)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v2, p0, Lf0/e;->e:Lb5/k;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    add-int/2addr v2, v0

    .line 48
    mul-int/2addr v2, v1

    .line 49
    iget-object v0, p0, Lf0/e;->f:Lh0/d1;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    add-int/2addr v0, v2

    .line 56
    mul-int/2addr v0, v1

    .line 57
    iget-object v2, p0, Lf0/e;->g:Ln2/j;

    .line 58
    .line 59
    invoke-virtual {v2}, Ln2/j;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    add-int/2addr v2, v0

    .line 64
    mul-int/2addr v2, v1

    .line 65
    iget-object v0, p0, Lf0/e;->h:Ld1/v;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    add-int/2addr v0, v2

    .line 72
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CoreTextFieldSemanticsModifier(transformedText="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lf0/e;->a:Ln2/z;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", value="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lf0/e;->b:Ln2/s;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", state="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lf0/e;->c:Lw/q0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", readOnly=false, enabled="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, Lf0/e;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", isPassword=false, offsetMapping="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lf0/e;->e:Lb5/k;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", manager="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lf0/e;->f:Lh0/d1;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", imeOptions="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lf0/e;->g:Ln2/j;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", focusRequester="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lf0/e;->h:Ld1/v;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const/16 v1, 0x29

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0
.end method
