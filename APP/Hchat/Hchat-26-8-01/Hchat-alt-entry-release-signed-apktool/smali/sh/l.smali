.class public final Lsh/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:F

.field public final e:F

.field public final f:F


# direct methods
.method public constructor <init>(JJJFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lsh/l;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Lsh/l;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, Lsh/l;->c:J

    .line 9
    .line 10
    iput p7, p0, Lsh/l;->d:F

    .line 11
    .line 12
    iput p8, p0, Lsh/l;->e:F

    .line 13
    .line 14
    iput p9, p0, Lsh/l;->f:F

    .line 15
    .line 16
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
    instance-of v0, p1, Lsh/l;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lsh/l;

    .line 10
    .line 11
    iget-wide v0, p0, Lsh/l;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, Lsh/l;->a:J

    .line 14
    .line 15
    invoke-static {v0, v1, v2, v3}, Le1/b;->b(JJ)Z

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
    iget-wide v0, p0, Lsh/l;->b:J

    .line 23
    .line 24
    iget-wide v2, p1, Lsh/l;->b:J

    .line 25
    .line 26
    invoke-static {v0, v1, v2, v3}, Le1/b;->b(JJ)Z

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
    iget-wide v0, p0, Lsh/l;->c:J

    .line 34
    .line 35
    iget-wide v2, p1, Lsh/l;->c:J

    .line 36
    .line 37
    invoke-static {v0, v1, v2, v3}, Le1/b;->b(JJ)Z

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
    iget v0, p0, Lsh/l;->d:F

    .line 45
    .line 46
    iget v1, p1, Lsh/l;->d:F

    .line 47
    .line 48
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget v0, p0, Lsh/l;->e:F

    .line 56
    .line 57
    iget v1, p1, Lsh/l;->e:F

    .line 58
    .line 59
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget v0, p0, Lsh/l;->f:F

    .line 67
    .line 68
    iget p1, p1, Lsh/l;->f:F

    .line 69
    .line 70
    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_7

    .line 75
    .line 76
    :goto_0
    const/4 p1, 0x0

    .line 77
    return p1

    .line 78
    :cond_7
    :goto_1
    const/4 p1, 0x1

    .line 79
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lsh/l;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget-wide v2, p0, Lsh/l;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lsh/l;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lsh/l;->d:F

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Leh/a;->d(FII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lsh/l;->e:F

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Leh/a;->d(FII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v1, p0, Lsh/l;->f:F

    .line 35
    .line 36
    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, v0

    .line 41
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, Lsh/l;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Le1/b;->g(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, Lsh/l;->b:J

    .line 8
    .line 9
    invoke-static {v1, v2}, Le1/b;->g(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, Lsh/l;->c:J

    .line 14
    .line 15
    invoke-static {v2, v3}, Le1/b;->g(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, ", middlePoint="

    .line 20
    .line 21
    const-string v4, ", endPoint="

    .line 22
    .line 23
    const-string v5, "CheckmarkCache(startPoint="

    .line 24
    .line 25
    invoke-static {v5, v0, v3, v1, v4}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ", centerX="

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget v1, p0, Lsh/l;->d:F

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", centerY="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget v1, p0, Lsh/l;->e:F

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", strokeWidth="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget v1, p0, Lsh/l;->f:F

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ")"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0
.end method
