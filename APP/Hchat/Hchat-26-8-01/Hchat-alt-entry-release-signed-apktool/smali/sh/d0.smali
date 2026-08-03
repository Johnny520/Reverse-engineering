.class public final Lsh/d0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lu2/k;

.field public final b:Lu2/k;

.field public final c:J

.field public final d:J

.field public final e:Lsh/f0;


# direct methods
.method public constructor <init>(Lu2/k;Lu2/k;JJLsh/f0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lsh/d0;->a:Lu2/k;

    .line 14
    .line 15
    iput-object p2, p0, Lsh/d0;->b:Lu2/k;

    .line 16
    .line 17
    iput-wide p3, p0, Lsh/d0;->c:J

    .line 18
    .line 19
    iput-wide p5, p0, Lsh/d0;->d:J

    .line 20
    .line 21
    iput-object p7, p0, Lsh/d0;->e:Lsh/f0;

    .line 22
    .line 23
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
    instance-of v1, p1, Lsh/d0;

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
    check-cast p1, Lsh/d0;

    .line 12
    .line 13
    iget-object v1, p0, Lsh/d0;->a:Lu2/k;

    .line 14
    .line 15
    iget-object v3, p1, Lsh/d0;->a:Lu2/k;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lsh/d0;->b:Lu2/k;

    .line 25
    .line 26
    iget-object v3, p1, Lsh/d0;->b:Lu2/k;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-wide v3, p0, Lsh/d0;->c:J

    .line 36
    .line 37
    iget-wide v5, p1, Lsh/d0;->c:J

    .line 38
    .line 39
    invoke-static {v3, v4, v5, v6}, Lf1/u0;->a(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-wide v3, p0, Lsh/d0;->d:J

    .line 47
    .line 48
    iget-wide v5, p1, Lsh/d0;->d:J

    .line 49
    .line 50
    invoke-static {v3, v4, v5, v6}, Lf1/u0;->a(JJ)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lsh/d0;->e:Lsh/f0;

    .line 58
    .line 59
    iget-object p1, p1, Lsh/d0;->e:Lsh/f0;

    .line 60
    .line 61
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lsh/d0;->a:Lu2/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lu2/k;->hashCode()I

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
    iget-object v2, p0, Lsh/d0;->b:Lu2/k;

    .line 11
    .line 12
    invoke-virtual {v2}, Lu2/k;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    sget v0, Lf1/u0;->c:I

    .line 19
    .line 20
    iget-wide v3, p0, Lsh/d0;->c:J

    .line 21
    .line 22
    invoke-static {v2, v1, v3, v4}, Leh/a;->f(IIJ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-wide v2, p0, Lsh/d0;->d:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v1, p0, Lsh/d0;->e:Lsh/f0;

    .line 33
    .line 34
    invoke-virtual {v1}, Lsh/f0;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    add-int/2addr v1, v0

    .line 39
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-wide v0, p0, Lsh/d0;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lf1/u0;->b(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, Lsh/d0;->d:J

    .line 8
    .line 9
    invoke-static {v1, v2}, Lf1/u0;->b(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "ListPopupLayoutInfo(windowBounds="

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, Lsh/d0;->a:Lu2/k;

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v3, ", popupMargin="

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v3, p0, Lsh/d0;->b:Lu2/k;

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v3, ", effectiveTransformOrigin="

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v3, ", localTransformOrigin="

    .line 41
    .line 42
    const-string v4, ", popupLayoutPosition="

    .line 43
    .line 44
    invoke-static {v2, v0, v3, v1, v4}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lsh/d0;->e:Lsh/f0;

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ")"

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0
.end method
