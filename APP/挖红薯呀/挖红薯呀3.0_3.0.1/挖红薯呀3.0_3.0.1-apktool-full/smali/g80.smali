.class public final Lg80;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lf80;


# instance fields
.field public final synthetic a:Lkm;

.field public final synthetic b:Z


# direct methods
.method public constructor <init>(Lkm;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg80;->a:Lkm;

    .line 5
    .line 6
    iput-boolean p2, p0, Lg80;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    .line 1
    iget-object p0, p0, Lg80;->a:Lkm;

    .line 2
    .line 3
    invoke-virtual {p0}, Llo0;->m()Lzn0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lzn0;->e:Lum0;

    .line 8
    .line 9
    sget-object v1, Lum0;->d:Lum0;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Llo0;->m()Lzn0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Lzn0;->g()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const-wide v2, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v0, v2

    .line 27
    :goto_0
    long-to-int p0, v0

    .line 28
    return p0

    .line 29
    :cond_0
    invoke-virtual {p0}, Llo0;->m()Lzn0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Lzn0;->g()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    const/16 p0, 0x20

    .line 38
    .line 39
    shr-long/2addr v0, p0

    .line 40
    goto :goto_0
.end method

.method public final b()F
    .locals 2

    .line 1
    iget-object p0, p0, Lg80;->a:Lkm;

    .line 2
    .line 3
    invoke-static {p0}, Lj50;->k(Llo0;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-float p0, v0

    .line 8
    return p0
.end method

.method public final c()Lxe;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-boolean v1, p0, Lg80;->b:Z

    .line 3
    .line 4
    iget-object p0, p0, Lg80;->a:Lkm;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lxe;

    .line 9
    .line 10
    invoke-virtual {p0}, Lkm;->n()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-direct {v1, p0, v0}, Lxe;-><init>(II)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    new-instance v1, Lxe;

    .line 19
    .line 20
    invoke-virtual {p0}, Lkm;->n()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-direct {v1, v0, p0}, Lxe;-><init>(II)V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method

.method public final d(ILl80;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Ll80;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, Lg80;->a:Lkm;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1, v1, v2}, Ll80;-><init>(Ljava/lang/Object;ILik;I)V

    .line 8
    .line 9
    .line 10
    sget-object p1, Lvh0;->d:Lvh0;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0, p2}, Llo0;->d(Lvh0;Lww;Ljk;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, Lna1;->a:Lna1;

    .line 17
    .line 18
    sget-object p2, Lzk;->d:Lzk;

    .line 19
    .line 20
    if-ne p0, p2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p0, p1

    .line 24
    :goto_0
    if-ne p0, p2, :cond_1

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    return-object p1
.end method

.method public final e()I
    .locals 1

    .line 1
    iget-object p0, p0, Lg80;->a:Lkm;

    .line 2
    .line 3
    invoke-virtual {p0}, Llo0;->m()Lzn0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Lzn0;->f:I

    .line 8
    .line 9
    neg-int v0, v0

    .line 10
    invoke-virtual {p0}, Llo0;->m()Lzn0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget p0, p0, Lzn0;->d:I

    .line 15
    .line 16
    add-int/2addr v0, p0

    .line 17
    return v0
.end method

.method public final f()F
    .locals 2

    .line 1
    iget-object p0, p0, Lg80;->a:Lkm;

    .line 2
    .line 3
    invoke-virtual {p0}, Llo0;->m()Lzn0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lkm;->n()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {v0, p0}, Loo0;->a(Lzn0;I)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    long-to-float p0, v0

    .line 16
    return p0
.end method
