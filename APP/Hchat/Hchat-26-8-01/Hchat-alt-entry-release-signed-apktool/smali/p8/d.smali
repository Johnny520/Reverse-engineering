.class public final Lp8/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIIJI)V
    .locals 2

    .line 1
    and-int/lit8 v0, p8, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p2, ""

    .line 6
    .line 7
    :cond_0
    and-int/lit8 v0, p8, 0x4

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move p3, v1

    .line 13
    :cond_1
    and-int/lit8 v0, p8, 0x8

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    move p4, v1

    .line 18
    :cond_2
    and-int/lit8 v0, p8, 0x10

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    move p5, v1

    .line 23
    :cond_3
    and-int/lit8 p8, p8, 0x20

    .line 24
    .line 25
    if-eqz p8, :cond_4

    .line 26
    .line 27
    const-wide/16 p6, 0x0

    .line 28
    .line 29
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lp8/d;->a:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p2, p0, Lp8/d;->b:Ljava/lang/String;

    .line 38
    .line 39
    iput p3, p0, Lp8/d;->c:I

    .line 40
    .line 41
    iput p4, p0, Lp8/d;->d:I

    .line 42
    .line 43
    iput p5, p0, Lp8/d;->e:I

    .line 44
    .line 45
    iput-wide p6, p0, Lp8/d;->f:J

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lp8/d;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lp8/d;->c:I

    .line 10
    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lp8/d;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lp8/d;

    .line 11
    .line 12
    iget-object v1, p0, Lp8/d;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p1, Lp8/d;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-object v1, p0, Lp8/d;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v2, p1, Lp8/d;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget v1, p0, Lp8/d;->c:I

    .line 35
    .line 36
    iget v2, p1, Lp8/d;->c:I

    .line 37
    .line 38
    if-eq v1, v2, :cond_4

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    iget v1, p0, Lp8/d;->d:I

    .line 42
    .line 43
    iget v2, p1, Lp8/d;->d:I

    .line 44
    .line 45
    if-eq v1, v2, :cond_5

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_5
    iget v1, p0, Lp8/d;->e:I

    .line 49
    .line 50
    iget v2, p1, Lp8/d;->e:I

    .line 51
    .line 52
    if-eq v1, v2, :cond_6

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_6
    iget-wide v1, p0, Lp8/d;->f:J

    .line 56
    .line 57
    iget-wide v3, p1, Lp8/d;->f:J

    .line 58
    .line 59
    cmp-long p1, v1, v3

    .line 60
    .line 61
    if-eqz p1, :cond_7

    .line 62
    .line 63
    :goto_0
    const/4 p1, 0x0

    .line 64
    return p1

    .line 65
    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lp8/d;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, Lp8/d;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lp8/d;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lp8/d;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lp8/d;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, Lp8/d;->f:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const-wide/16 v1, 0x0

    .line 41
    .line 42
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

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
    const-string v0, ", liveVideoPath="

    .line 2
    .line 3
    const-string v1, ", liveVideoDurationMillis="

    .line 4
    .line 5
    const-string v2, "PreparedSnsImage(imagePath="

    .line 6
    .line 7
    iget-object v3, p0, Lp8/d;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lp8/d;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", liveVideoWidth="

    .line 16
    .line 17
    const-string v2, ", liveVideoHeight="

    .line 18
    .line 19
    iget v3, p0, Lp8/d;->c:I

    .line 20
    .line 21
    iget v4, p0, Lp8/d;->d:I

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lp8/d;->e:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", liveVideoSizeBytes="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-wide v1, p0, Lp8/d;->f:J

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", liveVideoCoverTimeMillis=0)"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method
