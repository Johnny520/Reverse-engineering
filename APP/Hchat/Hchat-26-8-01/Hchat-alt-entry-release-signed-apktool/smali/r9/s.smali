.class public final Lr9/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:Z

.field public final f:Ljava/util/List;


# direct methods
.method public constructor <init>(IIIIZLjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lr9/s;->a:I

    .line 5
    .line 6
    iput p2, p0, Lr9/s;->b:I

    .line 7
    .line 8
    iput p3, p0, Lr9/s;->c:I

    .line 9
    .line 10
    iput p4, p0, Lr9/s;->d:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lr9/s;->e:Z

    .line 13
    .line 14
    iput-object p6, p0, Lr9/s;->f:Ljava/util/List;

    .line 15
    .line 16
    return-void
.end method

.method public static a(Lr9/s;III)Lr9/s;
    .locals 7

    .line 1
    iget v1, p0, Lr9/s;->a:I

    .line 2
    .line 3
    iget v2, p0, Lr9/s;->b:I

    .line 4
    .line 5
    and-int/lit8 v0, p3, 0x4

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p1, p0, Lr9/s;->c:I

    .line 10
    .line 11
    :cond_0
    move v3, p1

    .line 12
    and-int/lit8 p1, p3, 0x8

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget p2, p0, Lr9/s;->d:I

    .line 17
    .line 18
    :cond_1
    move v4, p2

    .line 19
    iget-boolean v5, p0, Lr9/s;->e:Z

    .line 20
    .line 21
    iget-object v6, p0, Lr9/s;->f:Ljava/util/List;

    .line 22
    .line 23
    new-instance v0, Lr9/s;

    .line 24
    .line 25
    invoke-direct/range {v0 .. v6}, Lr9/s;-><init>(IIIIZLjava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-object v0
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
    instance-of v0, p1, Lr9/s;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lr9/s;

    .line 10
    .line 11
    iget v0, p0, Lr9/s;->a:I

    .line 12
    .line 13
    iget v1, p1, Lr9/s;->a:I

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget v0, p0, Lr9/s;->b:I

    .line 19
    .line 20
    iget v1, p1, Lr9/s;->b:I

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget v0, p0, Lr9/s;->c:I

    .line 26
    .line 27
    iget v1, p1, Lr9/s;->c:I

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget v0, p0, Lr9/s;->d:I

    .line 33
    .line 34
    iget v1, p1, Lr9/s;->d:I

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget-boolean v0, p0, Lr9/s;->e:Z

    .line 40
    .line 41
    iget-boolean v1, p1, Lr9/s;->e:Z

    .line 42
    .line 43
    if-eq v0, v1, :cond_6

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_6
    iget-object v0, p0, Lr9/s;->f:Ljava/util/List;

    .line 47
    .line 48
    iget-object p1, p1, Lr9/s;->f:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_7

    .line 55
    .line 56
    :goto_0
    const/4 p1, 0x0

    .line 57
    return p1

    .line 58
    :cond_7
    :goto_1
    const/4 p1, 0x1

    .line 59
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lr9/s;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget v2, p0, Lr9/s;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lr9/s;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lr9/s;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, Lr9/s;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->h(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v1, p0, Lr9/s;->f:Ljava/util/List;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

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
    .locals 5

    .line 1
    const-string v0, ", originalBottom="

    .line 2
    .line 3
    const-string v1, ", appliedTop="

    .line 4
    .line 5
    iget v2, p0, Lr9/s;->a:I

    .line 6
    .line 7
    iget v3, p0, Lr9/s;->b:I

    .line 8
    .line 9
    const-string v4, "AvatarDetailsSpacing(originalTop="

    .line 10
    .line 11
    invoke-static {v2, v3, v4, v0, v1}, Leh/a;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", appliedBottom="

    .line 16
    .line 17
    const-string v2, ", originalClipToPadding="

    .line 18
    .line 19
    iget v3, p0, Lr9/s;->c:I

    .line 20
    .line 21
    iget v4, p0, Lr9/s;->d:I

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, Lwb/en;->p(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-boolean v1, p0, Lr9/s;->e:Z

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", clipStates="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lr9/s;->f:Ljava/util/List;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ")"

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
