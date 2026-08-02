.class public final Lri2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lji2;

.field public final b:Lkh2;

.field public final c:Lch2;


# direct methods
.method public constructor <init>(Lji2;Lkh2;Lch2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lri2;->a:Lji2;

    .line 5
    .line 6
    iput-object p2, p0, Lri2;->b:Lkh2;

    .line 7
    .line 8
    iput-object p3, p0, Lri2;->c:Lch2;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/LinkedHashSet;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lri2;->c()Ljp2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljp2;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    :goto_0
    move-object v1, p0

    .line 15
    check-cast v1, Lne1;

    .line 16
    .line 17
    invoke-virtual {v1}, Lne1;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    move-object v1, p0

    .line 24
    check-cast v1, Lne1;

    .line 25
    .line 26
    invoke-virtual {v1}, Lne1;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v2, v1

    .line 31
    check-cast v2, Lef2;

    .line 32
    .line 33
    iget-boolean v2, v2, Lef2;->i:Z

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object v0
.end method

.method public final b()Lpb1;
    .locals 6

    .line 1
    invoke-static {}, Leu;->E()Lpb1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    iget-object v2, p0, Lri2;->b:Lkh2;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget-boolean v3, v2, Lkh2;->a:Z

    .line 11
    .line 12
    if-ne v3, v1, :cond_0

    .line 13
    .line 14
    new-instance v3, Lff2;

    .line 15
    .line 16
    sget-object v4, Lef2;->l:Lef2;

    .line 17
    .line 18
    iget-object v5, v2, Lkh2;->d:Ljava/lang/String;

    .line 19
    .line 20
    invoke-direct {v3, v4, v5}, Lff2;-><init>(Lef2;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v3}, Lpb1;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iget-boolean v3, v2, Lkh2;->b:Z

    .line 29
    .line 30
    if-ne v3, v1, :cond_1

    .line 31
    .line 32
    new-instance v3, Lff2;

    .line 33
    .line 34
    sget-object v4, Lef2;->m:Lef2;

    .line 35
    .line 36
    iget-object v2, v2, Lkh2;->d:Ljava/lang/String;

    .line 37
    .line 38
    invoke-direct {v3, v4, v2}, Lff2;-><init>(Lef2;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v3}, Lpb1;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_1
    iget-object p0, p0, Lri2;->c:Lch2;

    .line 45
    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    iget-boolean v2, p0, Lch2;->b:Z

    .line 49
    .line 50
    if-ne v2, v1, :cond_2

    .line 51
    .line 52
    new-instance v1, Lff2;

    .line 53
    .line 54
    sget-object v2, Lef2;->n:Lef2;

    .line 55
    .line 56
    iget-object p0, p0, Lch2;->c:Ljava/lang/String;

    .line 57
    .line 58
    invoke-direct {v1, v2, p0}, Lff2;-><init>(Lef2;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lpb1;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-static {v0}, Leu;->z(Lpb1;)Lpb1;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method

.method public final c()Ljp2;
    .locals 4

    .line 1
    new-instance v0, Ljp2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljp2;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lri2;->a:Lji2;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v1, Lef2;->j:Lef2;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljp2;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lri2;->c:Lch2;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-boolean v3, v1, Lch2;->a:Z

    .line 21
    .line 22
    if-ne v3, v2, :cond_1

    .line 23
    .line 24
    sget-object v3, Lef2;->k:Lef2;

    .line 25
    .line 26
    invoke-virtual {v0, v3}, Ljp2;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object p0, p0, Lri2;->b:Lkh2;

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    iget-boolean v3, p0, Lkh2;->a:Z

    .line 34
    .line 35
    if-ne v3, v2, :cond_2

    .line 36
    .line 37
    sget-object v3, Lef2;->l:Lef2;

    .line 38
    .line 39
    invoke-virtual {v0, v3}, Ljp2;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_2
    if-eqz p0, :cond_3

    .line 43
    .line 44
    iget-boolean p0, p0, Lkh2;->b:Z

    .line 45
    .line 46
    if-ne p0, v2, :cond_3

    .line 47
    .line 48
    sget-object p0, Lef2;->m:Lef2;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljp2;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_3
    if-eqz v1, :cond_4

    .line 54
    .line 55
    iget-boolean p0, v1, Lch2;->b:Z

    .line 56
    .line 57
    if-ne p0, v2, :cond_4

    .line 58
    .line 59
    sget-object p0, Lef2;->n:Lef2;

    .line 60
    .line 61
    invoke-virtual {v0, p0}, Ljp2;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_4
    iget-object p0, v0, Ljp2;->h:Lpe1;

    .line 65
    .line 66
    invoke-virtual {p0}, Lpe1;->b()Lpe1;

    .line 67
    .line 68
    .line 69
    iget p0, p0, Lpe1;->p:I

    .line 70
    .line 71
    if-lez p0, :cond_5

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_5
    sget-object p0, Ljp2;->i:Ljp2;

    .line 75
    .line 76
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lri2;

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
    check-cast p1, Lri2;

    .line 12
    .line 13
    iget-object v1, p0, Lri2;->a:Lji2;

    .line 14
    .line 15
    iget-object v3, p1, Lri2;->a:Lji2;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lri2;->b:Lkh2;

    .line 25
    .line 26
    iget-object v3, p1, Lri2;->b:Lkh2;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lri2;->c:Lch2;

    .line 36
    .line 37
    iget-object p1, p1, Lri2;->c:Lch2;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lri2;->a:Lji2;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Lji2;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lri2;->b:Lkh2;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    move v2, v0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {v2}, Lkh2;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_1
    add-int/2addr v1, v2

    .line 25
    mul-int/lit8 v1, v1, 0x1f

    .line 26
    .line 27
    iget-object p0, p0, Lri2;->c:Lch2;

    .line 28
    .line 29
    if-nez p0, :cond_2

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    invoke-virtual {p0}, Lch2;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    :goto_2
    add-int/2addr v1, v0

    .line 37
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ScriptPermissions(network="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lri2;->a:Lji2;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", host="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lri2;->b:Lkh2;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", filesystem="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lri2;->c:Lch2;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, ")"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
