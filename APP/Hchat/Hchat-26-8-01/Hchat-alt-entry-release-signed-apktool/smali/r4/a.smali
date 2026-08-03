.class public final Lr4/a;
.super Lr4/l0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final n:La9/h;


# instance fields
.field public final k:Lt4/a;

.field public l:Lr4/s0;

.field public m:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La9/h;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-direct {v0, v1}, La9/h;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lr4/a;->n:La9/h;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lr4/p;Lt4/a;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, -0x1

    .line 3
    invoke-direct {p0, v0, v1}, Lr4/l0;-><init>(II)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    iput-object p2, p0, Lr4/a;->k:Lt4/a;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    iput-object p2, p0, Lr4/a;->l:Lr4/s0;

    .line 12
    .line 13
    iput-object p2, p0, Lr4/a;->m:[B

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lr4/a;->a(Lr4/p;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p1, "annotation == null"

    .line 20
    .line 21
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    throw p1
.end method


# virtual methods
.method public final a(Lr4/p;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lr4/p;->g:Lr4/h0;

    .line 2
    .line 3
    iget-object v1, p0, Lr4/a;->k:Lt4/a;

    .line 4
    .line 5
    iget-object v2, v1, Lt4/a;->h:Lv4/d0;

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Lr4/h0;->p(Lv4/d0;)Lr4/s0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lr4/a;->l:Lr4/s0;

    .line 12
    .line 13
    invoke-static {p1, v1}, Lp4/t;->i(Lr4/p;Lt4/a;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->A:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Lr4/l0;)I
    .locals 1

    .line 1
    check-cast p1, Lr4/a;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/a;->k:Lt4/a;

    .line 4
    .line 5
    iget-object p1, p1, Lr4/a;->k:Lt4/a;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lt4/a;->m(Lt4/a;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/a;->k:Lt4/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt4/a;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final j(Lr4/k0;I)V
    .locals 2

    .line 1
    new-instance p2, Lz4/d;

    .line 2
    .line 3
    invoke-direct {p2}, Lz4/d;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lp4/t;

    .line 7
    .line 8
    iget-object p1, p1, Lr4/o0;->b:Lr4/p;

    .line 9
    .line 10
    invoke-direct {v0, p1, p2}, Lp4/t;-><init>(Lr4/p;Lz4/d;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lr4/a;->k:Lt4/a;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, p1, v1}, Lp4/t;->I(Lt4/a;Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Lz4/d;->h()[B

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lr4/a;->m:[B

    .line 24
    .line 25
    array-length p1, p1

    .line 26
    add-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lr4/l0;->k(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/a;->k:Lt4/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt4/a;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final m(Lr4/p;Lz4/d;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lr4/a;->k:Lt4/a;

    .line 6
    .line 7
    iget v2, v1, Lt4/a;->i:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    invoke-virtual {p0}, Lr4/l0;->g()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    const-string v6, " annotation"

    .line 18
    .line 19
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-virtual {p2, v3, v5}, Lz4/d;->b(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    if-eq v2, v5, :cond_3

    .line 28
    .line 29
    const/4 v5, 0x2

    .line 30
    if-eq v2, v5, :cond_2

    .line 31
    .line 32
    const/4 v5, 0x3

    .line 33
    if-eq v2, v5, :cond_1

    .line 34
    .line 35
    const/4 v5, 0x4

    .line 36
    if-eq v2, v5, :cond_0

    .line 37
    .line 38
    const-string v5, "null"

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string v5, "EMBEDDED"

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const-string v5, "SYSTEM"

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const-string v5, "BUILD"

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const-string v5, "RUNTIME"

    .line 51
    .line 52
    :goto_0
    const-string v6, "  visibility: VISBILITY_"

    .line 53
    .line 54
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {p2, v4, v5}, Lz4/d;->b(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_4
    invoke-static {v2}, Lt3/c;->b(I)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_7

    .line 66
    .line 67
    if-eq v2, v4, :cond_6

    .line 68
    .line 69
    const/4 v3, 0x2

    .line 70
    if-ne v2, v3, :cond_5

    .line 71
    .line 72
    invoke-virtual {p2, v3}, Lz4/d;->j(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_5
    const-string p1, "shouldn\'t happen"

    .line 77
    .line 78
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_6
    invoke-virtual {p2, v3}, Lz4/d;->j(I)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_7
    invoke-virtual {p2, v4}, Lz4/d;->j(I)V

    .line 87
    .line 88
    .line 89
    :goto_1
    if-eqz v0, :cond_8

    .line 90
    .line 91
    new-instance v0, Lp4/t;

    .line 92
    .line 93
    invoke-direct {v0, p1, p2}, Lp4/t;-><init>(Lr4/p;Lz4/d;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1, v4}, Lp4/t;->I(Lt4/a;Z)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_8
    iget-object p1, p0, Lr4/a;->m:[B

    .line 101
    .line 102
    invoke-virtual {p2, p1}, Lz4/d;->i([B)V

    .line 103
    .line 104
    .line 105
    return-void
.end method
