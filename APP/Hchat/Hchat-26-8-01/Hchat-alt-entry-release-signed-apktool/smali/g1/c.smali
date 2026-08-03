.class public abstract Lg1/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:I


# direct methods
.method public constructor <init>(ILjava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lg1/c;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p3, p0, Lg1/c;->b:J

    .line 7
    .line 8
    iput p1, p0, Lg1/c;->c:I

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    const/4 p2, -0x1

    .line 17
    if-lt p1, p2, :cond_0

    .line 18
    .line 19
    const/16 p2, 0x3f

    .line 20
    .line 21
    if-gt p1, p2, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string p1, "The id must be between -1 and 63"

    .line 25
    .line 26
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    throw p1

    .line 31
    :cond_1
    const-string p1, "The name of a color space cannot be null and must contain at least 1 character"

    .line 32
    .line 33
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    throw p1
.end method


# virtual methods
.method public abstract a(I)F
.end method

.method public abstract b(I)F
.end method

.method public c()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract d(FFF)J
.end method

.method public abstract e(FFF)F
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    check-cast p1, Lg1/c;

    .line 19
    .line 20
    iget v0, p0, Lg1/c;->c:I

    .line 21
    .line 22
    iget v1, p1, Lg1/c;->c:I

    .line 23
    .line 24
    if-eq v0, v1, :cond_2

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    iget-object v0, p0, Lg1/c;->a:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v1, p1, Lg1/c;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    iget-wide v0, p0, Lg1/c;->b:J

    .line 39
    .line 40
    iget-wide v2, p1, Lg1/c;->b:J

    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, Lg1/b;->a(JJ)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1

    .line 47
    :cond_4
    :goto_0
    const/4 p1, 0x0

    .line 48
    return p1
.end method

.method public abstract f(FFFFLg1/c;)J
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lg1/c;->a:Ljava/lang/String;

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
    sget v2, Lg1/b;->e:I

    .line 11
    .line 12
    iget-wide v2, p0, Lg1/c;->b:J

    .line 13
    .line 14
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v1, p0, Lg1/c;->c:I

    .line 19
    .line 20
    add-int/2addr v0, v1

    .line 21
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg1/c;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " (id="

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget v1, p0, Lg1/c;->c:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, ", model="

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    sget-wide v1, Lg1/b;->a:J

    .line 27
    .line 28
    iget-wide v3, p0, Lg1/c;->b:J

    .line 29
    .line 30
    invoke-static {v3, v4, v1, v2}, Lg1/b;->a(JJ)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    const-string v1, "Rgb"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-wide v1, Lg1/b;->b:J

    .line 40
    .line 41
    invoke-static {v3, v4, v1, v2}, Lg1/b;->a(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    const-string v1, "Xyz"

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    sget-wide v1, Lg1/b;->c:J

    .line 51
    .line 52
    invoke-static {v3, v4, v1, v2}, Lg1/b;->a(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    const-string v1, "Lab"

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    sget-wide v1, Lg1/b;->d:J

    .line 62
    .line 63
    invoke-static {v3, v4, v1, v2}, Lg1/b;->a(JJ)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    const-string v1, "Cmyk"

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    const-string v1, "Unknown"

    .line 73
    .line 74
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const/16 v1, 0x29

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0
.end method
