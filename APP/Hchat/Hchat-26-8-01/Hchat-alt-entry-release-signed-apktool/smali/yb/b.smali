.class public final Lyb/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:F

.field public final b:J

.field public final c:J

.field public final d:F

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lyb/b;

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/16 v3, 0x1f

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    invoke-direct/range {v0 .. v5}, Lyb/b;-><init>(FFIJ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(FFIJ)V
    .locals 6

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 p1, 0x18

    .line 6
    .line 7
    int-to-float p1, p1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    int-to-float v0, v0

    .line 10
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    int-to-long v0, v0

    .line 15
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    int-to-long v2, v2

    .line 20
    const/16 v4, 0x20

    .line 21
    .line 22
    shl-long/2addr v0, v4

    .line 23
    const-wide v4, 0xffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long/2addr v2, v4

    .line 29
    or-long/2addr v0, v2

    .line 30
    and-int/lit8 v2, p3, 0x4

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    sget-wide p4, Lf1/w;->b:J

    .line 35
    .line 36
    const v2, 0x3e19999a    # 0.15f

    .line 37
    .line 38
    .line 39
    invoke-static {p4, p5, v2}, Lf1/w;->b(JF)J

    .line 40
    .line 41
    .line 42
    move-result-wide p4

    .line 43
    :cond_1
    and-int/lit8 p3, p3, 0x8

    .line 44
    .line 45
    if-eqz p3, :cond_2

    .line 46
    .line 47
    const/high16 p2, 0x3f800000    # 1.0f

    .line 48
    .line 49
    :cond_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput p1, p0, Lyb/b;->a:F

    .line 53
    .line 54
    iput-wide v0, p0, Lyb/b;->b:J

    .line 55
    .line 56
    iput-wide p4, p0, Lyb/b;->c:J

    .line 57
    .line 58
    iput p2, p0, Lyb/b;->d:F

    .line 59
    .line 60
    const/4 p1, 0x3

    .line 61
    iput p1, p0, Lyb/b;->e:I

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lyb/b;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_1
    check-cast p1, Lyb/b;

    .line 11
    .line 12
    iget v0, p0, Lyb/b;->a:F

    .line 13
    .line 14
    iget v2, p1, Lyb/b;->a:F

    .line 15
    .line 16
    invoke-static {v0, v2}, Lu2/f;->b(FF)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    iget-wide v2, p0, Lyb/b;->b:J

    .line 24
    .line 25
    iget-wide v4, p1, Lyb/b;->b:J

    .line 26
    .line 27
    cmp-long v0, v2, v4

    .line 28
    .line 29
    if-nez v0, :cond_5

    .line 30
    .line 31
    iget-wide v2, p0, Lyb/b;->c:J

    .line 32
    .line 33
    iget-wide v4, p1, Lyb/b;->c:J

    .line 34
    .line 35
    invoke-static {v2, v3, v4, v5}, Lf1/w;->c(JJ)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    iget v0, p0, Lyb/b;->d:F

    .line 43
    .line 44
    iget v2, p1, Lyb/b;->d:F

    .line 45
    .line 46
    invoke-static {v0, v2}, Ljava/lang/Float;->compare(FF)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_4
    iget v0, p0, Lyb/b;->e:I

    .line 54
    .line 55
    iget p1, p1, Lyb/b;->e:I

    .line 56
    .line 57
    if-ne v0, p1, :cond_5

    .line 58
    .line 59
    :goto_0
    const/4 p1, 0x1

    .line 60
    return p1

    .line 61
    :cond_5
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lyb/b;->a:F

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
    iget-wide v2, p0, Lyb/b;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget v2, Lf1/w;->h:I

    .line 17
    .line 18
    iget-wide v2, p0, Lyb/b;->c:J

    .line 19
    .line 20
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, Lyb/b;->d:F

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Leh/a;->d(FII)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v1, p0, Lyb/b;->e:I

    .line 31
    .line 32
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-int/2addr v1, v0

    .line 37
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget v0, p0, Lyb/b;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Lu2/f;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, Lyb/b;->b:J

    .line 8
    .line 9
    invoke-static {v1, v2}, Lu2/g;->a(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, Lyb/b;->c:J

    .line 14
    .line 15
    invoke-static {v2, v3}, Lf1/w;->i(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v3, p0, Lyb/b;->e:I

    .line 20
    .line 21
    invoke-static {v3}, Lf1/c0;->A(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-string v4, ", offset="

    .line 26
    .line 27
    const-string v5, ", color="

    .line 28
    .line 29
    const-string v6, "InnerShadow(radius="

    .line 30
    .line 31
    invoke-static {v6, v0, v4, v1, v5}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, ", alpha="

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget v1, p0, Lyb/b;->d:F

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", blendMode="

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ")"

    .line 54
    .line 55
    invoke-static {v0, v3, v1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0
.end method
