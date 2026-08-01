.class public final Ln80;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lf70;


# instance fields
.field public final a:Lc90;


# direct methods
.method public constructor <init>(Lc90;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln80;->a:Lc90;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Ln80;->a:Lc90;

    .line 2
    .line 3
    invoke-virtual {p0}, Lc90;->g()Lv80;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget p0, p0, Lv80;->n:I

    .line 8
    .line 9
    return p0
.end method

.method public final b()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ln80;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    iget-object p0, p0, Ln80;->a:Lc90;

    .line 8
    .line 9
    invoke-virtual {p0}, Lc90;->g()Lv80;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p0, p0, Lv80;->k:Ljava/util/List;

    .line 14
    .line 15
    invoke-static {p0}, Lye;->P(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lw80;

    .line 20
    .line 21
    iget p0, p0, Lw80;->a:I

    .line 22
    .line 23
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ln80;->a:Lc90;

    .line 2
    .line 3
    invoke-virtual {p0}, Lc90;->g()Lv80;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lv80;->k:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    xor-int/lit8 p0, p0, 0x1

    .line 14
    .line 15
    return p0
.end method

.method public final d()I
    .locals 6

    .line 1
    iget-object p0, p0, Ln80;->a:Lc90;

    .line 2
    .line 3
    invoke-virtual {p0}, Lc90;->g()Lv80;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lv80;->k:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    invoke-virtual {p0}, Lc90;->g()Lv80;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v2, v0, Lv80;->o:Lum0;

    .line 22
    .line 23
    sget-object v3, Lum0;->d:Lum0;

    .line 24
    .line 25
    if-ne v2, v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Lv80;->g()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    const-wide v4, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v2, v4

    .line 37
    :goto_0
    long-to-int v0, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v0}, Lv80;->g()J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    const/16 v0, 0x20

    .line 44
    .line 45
    shr-long/2addr v2, v0

    .line 46
    goto :goto_0

    .line 47
    :goto_1
    invoke-virtual {p0}, Lc90;->g()Lv80;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iget-object v2, p0, Lv80;->k:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    move v4, v1

    .line 65
    :goto_2
    if-ge v1, v3, :cond_3

    .line 66
    .line 67
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    check-cast v5, Lw80;

    .line 72
    .line 73
    iget v5, v5, Lw80;->j:I

    .line 74
    .line 75
    add-int/2addr v4, v5

    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    div-int/2addr v4, v1

    .line 84
    iget p0, p0, Lv80;->q:I

    .line 85
    .line 86
    add-int v1, v4, p0

    .line 87
    .line 88
    :goto_3
    const/4 p0, 0x1

    .line 89
    if-nez v1, :cond_4

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_4
    div-int/2addr v0, v1

    .line 93
    if-ge v0, p0, :cond_5

    .line 94
    .line 95
    :goto_4
    return p0

    .line 96
    :cond_5
    return v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget-object p0, p0, Ln80;->a:Lc90;

    .line 2
    .line 3
    iget-object p0, p0, Lc90;->e:Lfe;

    .line 4
    .line 5
    iget-object p0, p0, Lfe;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ldp0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ldp0;->g()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method
