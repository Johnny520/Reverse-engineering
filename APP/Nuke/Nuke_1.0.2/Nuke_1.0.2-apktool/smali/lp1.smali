.class public final Llp1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Z

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J


# direct methods
.method public constructor <init>(ZJJJJJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Llp1;->a:Z

    .line 5
    .line 6
    iput-wide p2, p0, Llp1;->b:J

    .line 7
    .line 8
    iput-wide p4, p0, Llp1;->c:J

    .line 9
    .line 10
    iput-wide p6, p0, Llp1;->d:J

    .line 11
    .line 12
    iput-wide p8, p0, Llp1;->e:J

    .line 13
    .line 14
    iput-wide p10, p0, Llp1;->f:J

    .line 15
    .line 16
    iput-wide p12, p0, Llp1;->g:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Llp1;

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
    check-cast p1, Llp1;

    .line 12
    .line 13
    iget-boolean v1, p0, Llp1;->a:Z

    .line 14
    .line 15
    iget-boolean v3, p1, Llp1;->a:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-wide v3, p0, Llp1;->b:J

    .line 21
    .line 22
    iget-wide v5, p1, Llp1;->b:J

    .line 23
    .line 24
    invoke-static {v3, v4, v5, v6}, Lju;->c(JJ)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-wide v3, p0, Llp1;->c:J

    .line 32
    .line 33
    iget-wide v5, p1, Llp1;->c:J

    .line 34
    .line 35
    invoke-static {v3, v4, v5, v6}, Lju;->c(JJ)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-wide v3, p0, Llp1;->d:J

    .line 43
    .line 44
    iget-wide v5, p1, Llp1;->d:J

    .line 45
    .line 46
    invoke-static {v3, v4, v5, v6}, Lju;->c(JJ)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-wide v3, p0, Llp1;->e:J

    .line 54
    .line 55
    iget-wide v5, p1, Llp1;->e:J

    .line 56
    .line 57
    invoke-static {v3, v4, v5, v6}, Lju;->c(JJ)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-wide v3, p0, Llp1;->f:J

    .line 65
    .line 66
    iget-wide v5, p1, Llp1;->f:J

    .line 67
    .line 68
    invoke-static {v3, v4, v5, v6}, Lju;->c(JJ)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget-wide v3, p0, Llp1;->g:J

    .line 76
    .line 77
    iget-wide p0, p1, Llp1;->g:J

    .line 78
    .line 79
    invoke-static {v3, v4, p0, p1}, Lju;->c(JJ)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-nez p0, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Llp1;->a:Z

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
    sget v2, Lju;->h:I

    .line 11
    .line 12
    iget-wide v2, p0, Llp1;->b:J

    .line 13
    .line 14
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-wide v2, p0, Llp1;->c:J

    .line 19
    .line 20
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-wide v2, p0, Llp1;->d:J

    .line 25
    .line 26
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-wide v2, p0, Llp1;->e:J

    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-wide v2, p0, Llp1;->f:J

    .line 37
    .line 38
    invoke-static {v0, v1, v2, v3}, Lhk1;->c(IIJ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-wide v1, p0, Llp1;->g:J

    .line 43
    .line 44
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    add-int/2addr p0, v0

    .line 49
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-wide v0, p0, Llp1;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lju;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, Llp1;->c:J

    .line 8
    .line 9
    invoke-static {v1, v2}, Lju;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, Llp1;->d:J

    .line 14
    .line 15
    invoke-static {v2, v3}, Lju;->i(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-wide v3, p0, Llp1;->e:J

    .line 20
    .line 21
    invoke-static {v3, v4}, Lju;->i(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-wide v4, p0, Llp1;->f:J

    .line 26
    .line 27
    invoke-static {v4, v5}, Lju;->i(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-wide v5, p0, Llp1;->g:J

    .line 32
    .line 33
    invoke-static {v5, v6}, Lju;->i(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    new-instance v6, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v7, "NukeColors(isLight="

    .line 40
    .line 41
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-boolean p0, p0, Llp1;->a:Z

    .line 45
    .line 46
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p0, ", background="

    .line 50
    .line 51
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p0, ", surface="

    .line 58
    .line 59
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p0, ", border="

    .line 63
    .line 64
    const-string v0, ", textPrimary="

    .line 65
    .line 66
    invoke-static {v6, v1, p0, v2, v0}, Lhk1;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const-string p0, ", textSecondary="

    .line 70
    .line 71
    const-string v0, ", accent="

    .line 72
    .line 73
    invoke-static {v6, v3, p0, v4, v0}, Lhk1;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string p0, ")"

    .line 77
    .line 78
    invoke-static {v6, v5, p0}, Lhk1;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method
