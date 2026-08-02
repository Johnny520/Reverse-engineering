.class public final Lre0;
.super Lxs1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final l:Lx20;

.field public m:[B


# direct methods
.method public constructor <init>(Lx20;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, -0x1

    .line 3
    invoke-direct {p0, v0, v1}, Lxs1;-><init>(II)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lre0;->l:Lx20;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lre0;->m:[B

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lz70;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lre0;->l:Lx20;

    .line 2
    .line 3
    invoke-static {p1, p0}, Ldq1;->q(Lz70;Ldz;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b()Lg21;
    .locals 0

    .line 1
    sget-object p0, Lg21;->w:Lg21;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(Lxs1;)I
    .locals 0

    .line 1
    check-cast p1, Lre0;

    .line 2
    .line 3
    iget-object p0, p0, Lre0;->l:Lx20;

    .line 4
    .line 5
    iget-object p1, p1, Lre0;->l:Lx20;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ldz;->d(Ldz;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lre0;->l:Lx20;

    .line 2
    .line 3
    invoke-virtual {p0}, Lx20;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final i(Leh1;I)V
    .locals 2

    .line 1
    new-instance p2, Lyn;

    .line 2
    .line 3
    invoke-direct {p2}, Lyn;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldq1;

    .line 7
    .line 8
    iget-object p1, p1, Ljm2;->b:Lz70;

    .line 9
    .line 10
    invoke-direct {v0, p1, p2}, Ldq1;-><init>(Lz70;Lyn;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lre0;->l:Lx20;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, p1, v1}, Ldq1;->X(Lx20;Z)V

    .line 17
    .line 18
    .line 19
    iget p1, p2, Lyn;->c:I

    .line 20
    .line 21
    new-array v0, p1, [B

    .line 22
    .line 23
    iget-object p2, p2, Lyn;->b:[B

    .line 24
    .line 25
    invoke-static {p2, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lre0;->m:[B

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lxs1;->j(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final k(Lz70;Lyn;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lyn;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lxs1;->g()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, " encoded array"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {p2, v0, v1}, Lyn;->c(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Ldq1;

    .line 22
    .line 23
    invoke-direct {v0, p1, p2}, Ldq1;-><init>(Lz70;Lyn;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lre0;->l:Lx20;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-virtual {v0, p0, p1}, Ldq1;->X(Lx20;Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-object p0, p0, Lre0;->m:[B

    .line 34
    .line 35
    invoke-virtual {p2, p0}, Lyn;->h([B)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
