.class final Lyf;
.super Lte0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lte0;"
    }
.end annotation


# instance fields
.field public final a:Lhw;

.field public final b:Lhw;


# direct methods
.method public constructor <init>(Lhw;Lhw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyf;->a:Lhw;

    .line 5
    .line 6
    iput-object p2, p0, Lyf;->b:Lhw;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e()Loe0;
    .locals 2

    .line 1
    new-instance v0, Ldg;

    .line 2
    .line 3
    iget-object v1, p0, Lyf;->a:Lhw;

    .line 4
    .line 5
    iget-object p0, p0, Lyf;->b:Lhw;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Ldg;-><init>(Lhw;Lhw;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-nez p1, :cond_1

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_1
    const-class v1, Lyf;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eq v1, v2, :cond_2

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_2
    check-cast p1, Lyf;

    .line 18
    .line 19
    iget-object v1, p0, Lyf;->a:Lhw;

    .line 20
    .line 21
    iget-object v2, p1, Lyf;->a:Lhw;

    .line 22
    .line 23
    if-eq v1, v2, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    iget-object p0, p0, Lyf;->b:Lhw;

    .line 27
    .line 28
    iget-object p1, p1, Lyf;->b:Lhw;

    .line 29
    .line 30
    if-eq p0, p1, :cond_4

    .line 31
    .line 32
    :goto_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_4
    return v0
.end method

.method public final f(Loe0;)V
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Ldg;

    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, v0, Ldg;->P:Z

    .line 6
    .line 7
    iget-object v1, v0, Ldg;->O:Lhw;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    move v1, p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v1, v2

    .line 15
    :goto_0
    iget-object v3, p0, Lyf;->b:Lhw;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    move v4, p1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v4, v2

    .line 22
    :goto_1
    if-eq v1, v4, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Ln;->C0()V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lz60;->D(Lvz0;)V

    .line 28
    .line 29
    .line 30
    move v2, p1

    .line 31
    :cond_2
    iput-object v3, v0, Ldg;->O:Lhw;

    .line 32
    .line 33
    iget-boolean v1, v0, Ln;->x:Z

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    if-eq v1, v4, :cond_3

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    move p1, v2

    .line 40
    :goto_2
    const/4 v1, 0x0

    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x1

    .line 43
    const/4 v5, 0x0

    .line 44
    iget-object v6, p0, Lyf;->a:Lhw;

    .line 45
    .line 46
    invoke-virtual/range {v0 .. v6}, Ln;->K0(Lxg0;Lf10;ZZLxv0;Lhw;)V

    .line 47
    .line 48
    .line 49
    if-eqz p1, :cond_4

    .line 50
    .line 51
    iget-object p0, v0, Ln;->B:Ls51;

    .line 52
    .line 53
    if-eqz p0, :cond_4

    .line 54
    .line 55
    invoke-virtual {p0}, Ls51;->x0()V

    .line 56
    .line 57
    .line 58
    :cond_4
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    mul-int/lit8 v1, v1, 0x1f

    .line 7
    .line 8
    const/16 v2, 0x745f

    .line 9
    .line 10
    invoke-static {v1, v2, v0}, Lt1;->c(IIZ)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object v2, p0, Lyf;->a:Lhw;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    add-int/2addr v2, v1

    .line 21
    mul-int/lit16 v2, v2, 0x3c1

    .line 22
    .line 23
    iget-object p0, p0, Lyf;->b:Lhw;

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    :goto_0
    add-int/2addr v2, p0

    .line 34
    mul-int/lit16 v2, v2, 0x3c1

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v2

    .line 41
    return p0
.end method
