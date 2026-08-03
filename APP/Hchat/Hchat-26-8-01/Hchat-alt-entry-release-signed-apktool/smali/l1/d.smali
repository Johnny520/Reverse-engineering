.class public final Ll1/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:F

.field public final b:F

.field public final c:I

.field public final d:J

.field public final e:F


# direct methods
.method public constructor <init>(FFJ)V
    .locals 8

    const/4 v0, 0x0

    int-to-float v3, v0

    const-wide/16 v0, 0x10

    cmp-long v0, p3, v0

    if-eqz v0, :cond_0

    :goto_0
    move-wide v4, p3

    goto :goto_1

    .line 22
    :cond_0
    sget-wide p3, Lf1/w;->b:J

    goto :goto_0

    :goto_1
    const/4 v7, 0x3

    move-object v1, p0

    move v2, p1

    move v6, p2

    .line 23
    invoke-direct/range {v1 .. v7}, Ll1/d;-><init>(FFJFI)V

    return-void
.end method

.method public constructor <init>(FFJFI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ll1/d;->a:F

    .line 5
    .line 6
    iput p2, p0, Ll1/d;->b:F

    .line 7
    .line 8
    iput p6, p0, Ll1/d;->c:I

    .line 9
    .line 10
    iput-wide p3, p0, Ll1/d;->d:J

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    const/high16 p2, 0x3f800000    # 1.0f

    .line 14
    .line 15
    invoke-static {p5, p1, p2}, Lr9/e0;->q(FFF)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Ll1/d;->e:F

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Ll1/d;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Ll1/d;

    .line 10
    .line 11
    iget v0, p1, Ll1/d;->a:F

    .line 12
    .line 13
    iget v1, p0, Ll1/d;->a:F

    .line 14
    .line 15
    invoke-static {v1, v0}, Lu2/f;->b(FF)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget v0, p0, Ll1/d;->b:F

    .line 23
    .line 24
    iget v1, p1, Ll1/d;->b:F

    .line 25
    .line 26
    invoke-static {v0, v1}, Lu2/f;->b(FF)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    iget v0, p0, Ll1/d;->e:F

    .line 34
    .line 35
    iget v1, p1, Ll1/d;->e:F

    .line 36
    .line 37
    cmpg-float v0, v0, v1

    .line 38
    .line 39
    if-nez v0, :cond_5

    .line 40
    .line 41
    iget v0, p0, Ll1/d;->c:I

    .line 42
    .line 43
    iget v1, p1, Ll1/d;->c:I

    .line 44
    .line 45
    if-ne v0, v1, :cond_5

    .line 46
    .line 47
    iget-wide v0, p0, Ll1/d;->d:J

    .line 48
    .line 49
    iget-wide v2, p1, Ll1/d;->d:J

    .line 50
    .line 51
    invoke-static {v0, v1, v2, v3}, Lf1/w;->c(JJ)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_4
    :goto_0
    const/4 p1, 0x1

    .line 59
    return p1

    .line 60
    :cond_5
    :goto_1
    const/4 p1, 0x0

    .line 61
    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Ll1/d;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

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
    iget v2, p0, Ll1/d;->b:F

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Leh/a;->d(FII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Ll1/d;->e:F

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Leh/a;->d(FII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Ll1/d;->c:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sget v2, Lf1/w;->h:I

    .line 35
    .line 36
    iget-wide v2, p0, Ll1/d;->d:J

    .line 37
    .line 38
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Shadow(radius="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Ll1/d;->a:F

    .line 9
    .line 10
    invoke-static {v1}, Lu2/f;->c(F)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ", spread="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget v1, p0, Ll1/d;->b:F

    .line 23
    .line 24
    invoke-static {v1}, Lu2/f;->c(F)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", offset="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-wide/16 v1, 0x0

    .line 37
    .line 38
    invoke-static {v1, v2}, Lu2/g;->a(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, ", alpha="

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget v1, p0, Ll1/d;->e:F

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", blendMode="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget v1, p0, Ll1/d;->c:I

    .line 61
    .line 62
    invoke-static {v1}, Lf1/c0;->A(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, ", color="

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-wide v1, p0, Ll1/d;->d:J

    .line 75
    .line 76
    invoke-static {v1, v2}, Lf1/w;->i(J)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", brush=null)"

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
