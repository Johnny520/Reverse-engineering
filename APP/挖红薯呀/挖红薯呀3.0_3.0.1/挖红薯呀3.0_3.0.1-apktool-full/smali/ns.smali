.class final Lns;
.super Lte0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lte0;"
    }
.end annotation


# instance fields
.field public final a:Lb91;

.field public final b:Lw81;

.field public final c:Lw81;

.field public final d:Lvs;

.field public final e:Ljt;

.field public final f:Lhw;

.field public final g:Los;


# direct methods
.method public constructor <init>(Lb91;Lw81;Lw81;Lvs;Ljt;Lhw;Los;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lns;->a:Lb91;

    .line 5
    .line 6
    iput-object p2, p0, Lns;->b:Lw81;

    .line 7
    .line 8
    iput-object p3, p0, Lns;->c:Lw81;

    .line 9
    .line 10
    iput-object p4, p0, Lns;->d:Lvs;

    .line 11
    .line 12
    iput-object p5, p0, Lns;->e:Ljt;

    .line 13
    .line 14
    iput-object p6, p0, Lns;->f:Lhw;

    .line 15
    .line 16
    iput-object p7, p0, Lns;->g:Los;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final e()Loe0;
    .locals 8

    .line 1
    new-instance v0, Lus;

    .line 2
    .line 3
    iget-object v6, p0, Lns;->f:Lhw;

    .line 4
    .line 5
    iget-object v7, p0, Lns;->g:Los;

    .line 6
    .line 7
    iget-object v1, p0, Lns;->a:Lb91;

    .line 8
    .line 9
    iget-object v2, p0, Lns;->b:Lw81;

    .line 10
    .line 11
    iget-object v3, p0, Lns;->c:Lw81;

    .line 12
    .line 13
    iget-object v4, p0, Lns;->d:Lvs;

    .line 14
    .line 15
    iget-object v5, p0, Lns;->e:Ljt;

    .line 16
    .line 17
    invoke-direct/range {v0 .. v7}, Lus;-><init>(Lb91;Lw81;Lw81;Lvs;Ljt;Lhw;Los;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lns;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lns;

    .line 6
    .line 7
    iget-object v0, p1, Lns;->a:Lb91;

    .line 8
    .line 9
    iget-object v1, p0, Lns;->a:Lb91;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p1, Lns;->b:Lw81;

    .line 15
    .line 16
    iget-object v1, p0, Lns;->b:Lw81;

    .line 17
    .line 18
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p1, Lns;->c:Lw81;

    .line 25
    .line 26
    iget-object v1, p0, Lns;->c:Lw81;

    .line 27
    .line 28
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p1, Lns;->d:Lvs;

    .line 35
    .line 36
    iget-object v1, p0, Lns;->d:Lvs;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lvs;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object v0, p1, Lns;->e:Ljt;

    .line 45
    .line 46
    iget-object v1, p0, Lns;->e:Ljt;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljt;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    iget-object v0, p1, Lns;->f:Lhw;

    .line 55
    .line 56
    iget-object v1, p0, Lns;->f:Lhw;

    .line 57
    .line 58
    if-ne v0, v1, :cond_1

    .line 59
    .line 60
    iget-object p1, p1, Lns;->g:Los;

    .line 61
    .line 62
    iget-object p0, p0, Lns;->g:Los;

    .line 63
    .line 64
    invoke-static {p1, p0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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

.method public final f(Loe0;)V
    .locals 1

    .line 1
    check-cast p1, Lus;

    .line 2
    .line 3
    iget-object v0, p0, Lns;->a:Lb91;

    .line 4
    .line 5
    iput-object v0, p1, Lus;->r:Lb91;

    .line 6
    .line 7
    iget-object v0, p0, Lns;->b:Lw81;

    .line 8
    .line 9
    iput-object v0, p1, Lus;->s:Lw81;

    .line 10
    .line 11
    iget-object v0, p0, Lns;->c:Lw81;

    .line 12
    .line 13
    iput-object v0, p1, Lus;->t:Lw81;

    .line 14
    .line 15
    iget-object v0, p0, Lns;->d:Lvs;

    .line 16
    .line 17
    iput-object v0, p1, Lus;->u:Lvs;

    .line 18
    .line 19
    iget-object v0, p0, Lns;->e:Ljt;

    .line 20
    .line 21
    iput-object v0, p1, Lus;->v:Ljt;

    .line 22
    .line 23
    iget-object v0, p0, Lns;->f:Lhw;

    .line 24
    .line 25
    iput-object v0, p1, Lus;->w:Lhw;

    .line 26
    .line 27
    iget-object p0, p0, Lns;->g:Los;

    .line 28
    .line 29
    iput-object p0, p1, Lus;->x:Los;

    .line 30
    .line 31
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lns;->a:Lb91;

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
    iget-object v2, p0, Lns;->b:Lw81;

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
    iget-object v2, p0, Lns;->c:Lw81;

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
    iget-object v1, p0, Lns;->d:Lvs;

    .line 35
    .line 36
    iget-object v1, v1, Lvs;->a:Lc91;

    .line 37
    .line 38
    invoke-virtual {v1}, Lc91;->hashCode()I

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
    iget-object v0, p0, Lns;->e:Ljt;

    .line 46
    .line 47
    iget-object v0, v0, Ljt;->a:Lc91;

    .line 48
    .line 49
    invoke-virtual {v0}, Lc91;->hashCode()I

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
    iget-object v1, p0, Lns;->f:Lhw;

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
    iget-object p0, p0, Lns;->g:Los;

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
