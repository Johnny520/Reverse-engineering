.class final Ljf0;
.super Lyh1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lyh1;"
    }
.end annotation


# instance fields
.field public final a:Ly33;

.field public final b:Lu33;

.field public final c:Lu33;

.field public final d:Lsf0;

.field public final e:Lph0;

.field public final f:Lxm0;

.field public final g:Lkf0;


# direct methods
.method public constructor <init>(Ly33;Lu33;Lu33;Lsf0;Lph0;Lxm0;Lkf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljf0;->a:Ly33;

    .line 5
    .line 6
    iput-object p2, p0, Ljf0;->b:Lu33;

    .line 7
    .line 8
    iput-object p3, p0, Ljf0;->c:Lu33;

    .line 9
    .line 10
    iput-object p4, p0, Ljf0;->d:Lsf0;

    .line 11
    .line 12
    iput-object p5, p0, Ljf0;->e:Lph0;

    .line 13
    .line 14
    iput-object p6, p0, Ljf0;->f:Lxm0;

    .line 15
    .line 16
    iput-object p7, p0, Ljf0;->g:Lkf0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Ljf0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Ljf0;

    .line 6
    .line 7
    iget-object v0, p1, Ljf0;->a:Ly33;

    .line 8
    .line 9
    iget-object v1, p0, Ljf0;->a:Ly33;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p1, Ljf0;->b:Lu33;

    .line 15
    .line 16
    iget-object v1, p0, Ljf0;->b:Lu33;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p1, Ljf0;->c:Lu33;

    .line 25
    .line 26
    iget-object v1, p0, Ljf0;->c:Lu33;

    .line 27
    .line 28
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p1, Ljf0;->d:Lsf0;

    .line 35
    .line 36
    iget-object v1, p0, Ljf0;->d:Lsf0;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lsf0;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object v0, p1, Ljf0;->e:Lph0;

    .line 45
    .line 46
    iget-object v1, p0, Ljf0;->e:Lph0;

    .line 47
    .line 48
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    iget-object v0, p1, Ljf0;->f:Lxm0;

    .line 55
    .line 56
    iget-object v1, p0, Ljf0;->f:Lxm0;

    .line 57
    .line 58
    if-ne v0, v1, :cond_1

    .line 59
    .line 60
    iget-object p1, p1, Ljf0;->g:Lkf0;

    .line 61
    .line 62
    iget-object p0, p0, Ljf0;->g:Lkf0;

    .line 63
    .line 64
    invoke-static {p1, p0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_1

    .line 69
    .line 70
    const/4 p0, 0x1

    .line 71
    return p0

    .line 72
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 73
    return p0
.end method

.method public final f()Lth1;
    .locals 8

    .line 1
    new-instance v0, Lrf0;

    .line 2
    .line 3
    iget-object v6, p0, Ljf0;->f:Lxm0;

    .line 4
    .line 5
    iget-object v7, p0, Ljf0;->g:Lkf0;

    .line 6
    .line 7
    iget-object v1, p0, Ljf0;->a:Ly33;

    .line 8
    .line 9
    iget-object v2, p0, Ljf0;->b:Lu33;

    .line 10
    .line 11
    iget-object v3, p0, Ljf0;->c:Lu33;

    .line 12
    .line 13
    iget-object v4, p0, Ljf0;->d:Lsf0;

    .line 14
    .line 15
    iget-object v5, p0, Ljf0;->e:Lph0;

    .line 16
    .line 17
    invoke-direct/range {v0 .. v7}, Lrf0;-><init>(Ly33;Lu33;Lu33;Lsf0;Lph0;Lxm0;Lkf0;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final g(Lth1;)V
    .locals 1

    .line 1
    check-cast p1, Lrf0;

    .line 2
    .line 3
    iget-object v0, p0, Ljf0;->a:Ly33;

    .line 4
    .line 5
    iput-object v0, p1, Lrf0;->v:Ly33;

    .line 6
    .line 7
    iget-object v0, p0, Ljf0;->b:Lu33;

    .line 8
    .line 9
    iput-object v0, p1, Lrf0;->w:Lu33;

    .line 10
    .line 11
    iget-object v0, p0, Ljf0;->c:Lu33;

    .line 12
    .line 13
    iput-object v0, p1, Lrf0;->x:Lu33;

    .line 14
    .line 15
    iget-object v0, p0, Ljf0;->d:Lsf0;

    .line 16
    .line 17
    iput-object v0, p1, Lrf0;->y:Lsf0;

    .line 18
    .line 19
    iget-object v0, p0, Ljf0;->e:Lph0;

    .line 20
    .line 21
    iput-object v0, p1, Lrf0;->z:Lph0;

    .line 22
    .line 23
    iget-object v0, p0, Ljf0;->f:Lxm0;

    .line 24
    .line 25
    iput-object v0, p1, Lrf0;->A:Lxm0;

    .line 26
    .line 27
    iget-object p0, p0, Ljf0;->g:Lkf0;

    .line 28
    .line 29
    iput-object p0, p1, Lrf0;->B:Lkf0;

    .line 30
    .line 31
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Ljf0;->a:Ly33;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iget-object v2, p0, Ljf0;->b:Lu33;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v2, v1

    .line 20
    :goto_0
    add-int/2addr v0, v2

    .line 21
    mul-int/lit8 v0, v0, 0x1f

    .line 22
    .line 23
    iget-object v2, p0, Ljf0;->c:Lu33;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    :cond_1
    add-int/2addr v0, v1

    .line 32
    mul-int/lit16 v0, v0, 0x3c1

    .line 33
    .line 34
    iget-object v1, p0, Ljf0;->d:Lsf0;

    .line 35
    .line 36
    iget-object v1, v1, Lsf0;->a:Lz33;

    .line 37
    .line 38
    invoke-virtual {v1}, Lz33;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/2addr v1, v0

    .line 43
    mul-int/lit8 v1, v1, 0x1f

    .line 44
    .line 45
    iget-object v0, p0, Ljf0;->e:Lph0;

    .line 46
    .line 47
    iget-object v0, v0, Lph0;->a:Lz33;

    .line 48
    .line 49
    invoke-virtual {v0}, Lz33;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    add-int/2addr v0, v1

    .line 54
    mul-int/lit8 v0, v0, 0x1f

    .line 55
    .line 56
    iget-object v1, p0, Ljf0;->f:Lxm0;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    add-int/2addr v1, v0

    .line 63
    mul-int/lit8 v1, v1, 0x1f

    .line 64
    .line 65
    iget-object p0, p0, Ljf0;->g:Lkf0;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    add-int/2addr p0, v1

    .line 72
    return p0
.end method
