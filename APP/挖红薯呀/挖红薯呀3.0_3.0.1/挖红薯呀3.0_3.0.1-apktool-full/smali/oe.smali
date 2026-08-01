.class final Loe;
.super Lte0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lte0;"
    }
.end annotation


# instance fields
.field public final a:Lxg0;

.field public final b:Lf10;

.field public final c:Z

.field public final d:Z

.field public final e:Lhw;


# direct methods
.method public constructor <init>(Lxg0;Lf10;ZZLhw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loe;->a:Lxg0;

    .line 5
    .line 6
    iput-object p2, p0, Loe;->b:Lf10;

    .line 7
    .line 8
    iput-boolean p3, p0, Loe;->c:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Loe;->d:Z

    .line 11
    .line 12
    iput-object p5, p0, Loe;->e:Lhw;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final e()Loe0;
    .locals 7

    .line 1
    new-instance v0, Lqe;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    iget-object v6, p0, Loe;->e:Lhw;

    .line 5
    .line 6
    iget-object v1, p0, Loe;->a:Lxg0;

    .line 7
    .line 8
    iget-object v2, p0, Loe;->b:Lf10;

    .line 9
    .line 10
    iget-boolean v3, p0, Loe;->c:Z

    .line 11
    .line 12
    iget-boolean v4, p0, Loe;->d:Z

    .line 13
    .line 14
    invoke-direct/range {v0 .. v6}, Ln;-><init>(Lxg0;Lf10;ZZLxv0;Lhw;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    if-nez p1, :cond_1

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_1
    const-class v0, Loe;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_2
    check-cast p1, Loe;

    .line 17
    .line 18
    iget-object v0, p0, Loe;->a:Lxg0;

    .line 19
    .line 20
    iget-object v1, p1, Loe;->a:Lxg0;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, Loe;->b:Lf10;

    .line 30
    .line 31
    iget-object v1, p1, Loe;->b:Lf10;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-boolean v0, p0, Loe;->c:Z

    .line 41
    .line 42
    iget-boolean v1, p1, Loe;->c:Z

    .line 43
    .line 44
    if-eq v0, v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-boolean v0, p0, Loe;->d:Z

    .line 48
    .line 49
    iget-boolean v1, p1, Loe;->d:Z

    .line 50
    .line 51
    if-eq v0, v1, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget-object p0, p0, Loe;->e:Lhw;

    .line 55
    .line 56
    iget-object p1, p1, Loe;->e:Lhw;

    .line 57
    .line 58
    if-eq p0, p1, :cond_7

    .line 59
    .line 60
    :goto_0
    const/4 p0, 0x0

    .line 61
    return p0

    .line 62
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 63
    return p0
.end method

.method public final f(Loe0;)V
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lqe;

    .line 3
    .line 4
    const/4 v5, 0x0

    .line 5
    iget-object v6, p0, Loe;->e:Lhw;

    .line 6
    .line 7
    iget-object v1, p0, Loe;->a:Lxg0;

    .line 8
    .line 9
    iget-object v2, p0, Loe;->b:Lf10;

    .line 10
    .line 11
    iget-boolean v3, p0, Loe;->c:Z

    .line 12
    .line 13
    iget-boolean v4, p0, Loe;->d:Z

    .line 14
    .line 15
    invoke-virtual/range {v0 .. v6}, Ln;->K0(Lxg0;Lf10;ZZLxv0;Lhw;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Loe;->a:Lxg0;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    const/16 v2, 0x1f

    .line 13
    .line 14
    mul-int/2addr v1, v2

    .line 15
    iget-object v3, p0, Loe;->b:Lf10;

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v3}, Lf10;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    :cond_1
    add-int/2addr v1, v0

    .line 24
    mul-int/2addr v1, v2

    .line 25
    iget-boolean v0, p0, Loe;->c:Z

    .line 26
    .line 27
    invoke-static {v1, v2, v0}, Lt1;->c(IIZ)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-boolean v1, p0, Loe;->d:Z

    .line 32
    .line 33
    const/16 v2, 0x745f

    .line 34
    .line 35
    invoke-static {v0, v2, v1}, Lt1;->c(IIZ)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object p0, p0, Loe;->e:Lhw;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    add-int/2addr p0, v0

    .line 46
    return p0
.end method
