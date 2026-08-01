.class public final Ls0/K;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(ZIIIIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ls0/K;->a:Z

    .line 5
    .line 6
    iput p2, p0, Ls0/K;->b:I

    .line 7
    .line 8
    iput p3, p0, Ls0/K;->c:I

    .line 9
    .line 10
    iput p4, p0, Ls0/K;->d:I

    .line 11
    .line 12
    iput p5, p0, Ls0/K;->e:I

    .line 13
    .line 14
    iput p6, p0, Ls0/K;->f:I

    .line 15
    .line 16
    iput p7, p0, Ls0/K;->g:I

    .line 17
    .line 18
    iput p8, p0, Ls0/K;->h:I

    .line 19
    .line 20
    iput p9, p0, Ls0/K;->i:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ls0/K;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Ls0/K;

    .line 11
    .line 12
    iget-boolean v1, p1, Ls0/K;->a:Z

    .line 13
    .line 14
    iget-boolean v2, p0, Ls0/K;->a:Z

    .line 15
    .line 16
    if-eq v2, v1, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget v1, p0, Ls0/K;->b:I

    .line 20
    .line 21
    iget v2, p1, Ls0/K;->b:I

    .line 22
    .line 23
    if-eq v1, v2, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    iget v1, p0, Ls0/K;->c:I

    .line 27
    .line 28
    iget v2, p1, Ls0/K;->c:I

    .line 29
    .line 30
    if-eq v1, v2, :cond_4

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_4
    iget v1, p0, Ls0/K;->d:I

    .line 34
    .line 35
    iget v2, p1, Ls0/K;->d:I

    .line 36
    .line 37
    if-eq v1, v2, :cond_5

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_5
    iget v1, p0, Ls0/K;->e:I

    .line 41
    .line 42
    iget v2, p1, Ls0/K;->e:I

    .line 43
    .line 44
    if-eq v1, v2, :cond_6

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_6
    iget v1, p0, Ls0/K;->f:I

    .line 48
    .line 49
    iget v2, p1, Ls0/K;->f:I

    .line 50
    .line 51
    if-eq v1, v2, :cond_7

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_7
    iget v1, p0, Ls0/K;->g:I

    .line 55
    .line 56
    iget v2, p1, Ls0/K;->g:I

    .line 57
    .line 58
    if-eq v1, v2, :cond_8

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_8
    iget v1, p0, Ls0/K;->h:I

    .line 62
    .line 63
    iget v2, p1, Ls0/K;->h:I

    .line 64
    .line 65
    if-eq v1, v2, :cond_9

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_9
    iget v1, p0, Ls0/K;->i:I

    .line 69
    .line 70
    iget p1, p1, Ls0/K;->i:I

    .line 71
    .line 72
    if-eq v1, p1, :cond_a

    .line 73
    .line 74
    :goto_0
    const/4 p1, 0x0

    .line 75
    return p1

    .line 76
    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Ls0/K;->a:Z

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
    iget v2, p0, Ls0/K;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, LL/d;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Ls0/K;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, LL/d;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Ls0/K;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, LL/d;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Ls0/K;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, LL/d;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Ls0/K;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, LL/d;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Ls0/K;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, LL/d;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, Ls0/K;->h:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, LL/d;->a(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v2, p0, Ls0/K;->i:I

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, LL/d;->a(III)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const v2, -0xe95665

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v0, v1}, LL/d;->a(III)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const v2, -0xc38116

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v0, v1}, LL/d;->a(III)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const v2, -0x869728

    .line 73
    .line 74
    .line 75
    invoke-static {v2, v0, v1}, LL/d;->a(III)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const v2, -0xc65c95

    .line 80
    .line 81
    .line 82
    invoke-static {v2, v0, v1}, LL/d;->a(III)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    const v2, -0x25a28b

    .line 87
    .line 88
    .line 89
    invoke-static {v2, v0, v1}, LL/d;->a(III)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const v1, -0x2672de

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    add-int/2addr v1, v0

    .line 101
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Palette(isDark="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Ls0/K;->a:Z

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", header="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Ls0/K;->b:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", pageBg="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v1, p0, Ls0/K;->c:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", card="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, Ls0/K;->d:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", fieldBg="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget v1, p0, Ls0/K;->e:I

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", textPrimary="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget v1, p0, Ls0/K;->f:I

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", textSecondary="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget v1, p0, Ls0/K;->g:I

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", textTertiary="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget v1, p0, Ls0/K;->h:I

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", divider="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget v1, p0, Ls0/K;->i:I

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", accentTeal=-15292005, accentBlue=-12812566, accentPurple=-8820520, accentGreen=-12999829, accentPink=-2466443, accentOrange=-2519774)"

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    return-object v0
.end method
