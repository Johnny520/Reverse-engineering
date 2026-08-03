.class public final Lr4/q0;
.super Lr4/l0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Lv4/c0;


# direct methods
.method public constructor <init>(Lv4/c0;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lv4/c0;->g:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lig/a;->c0(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p1, Lv4/c0;->h:Lg8/b;

    .line 12
    .line 13
    iget v1, v1, Lg8/b;->c:I

    .line 14
    .line 15
    add-int/2addr v0, v1

    .line 16
    const/4 v1, 0x1

    .line 17
    add-int/2addr v0, v1

    .line 18
    invoke-direct {p0, v1, v0}, Lr4/l0;-><init>(II)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lr4/q0;->k:Lv4/c0;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Lr4/p;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->y:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Lr4/l0;)I
    .locals 1

    .line 1
    check-cast p1, Lr4/q0;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/q0;->k:Lv4/c0;

    .line 4
    .line 5
    iget-object p1, p1, Lr4/q0;->k:Lv4/c0;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lv4/a;->d(Lv4/a;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/q0;->k:Lv4/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/c0;->l()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final m(Lr4/p;Lz4/d;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lr4/q0;->k:Lv4/c0;

    .line 2
    .line 3
    iget-object v0, p1, Lv4/c0;->h:Lg8/b;

    .line 4
    .line 5
    iget-object v1, p1, Lv4/c0;->g:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {v1}, Lig/a;->c0(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {v1}, La/a;->Y0(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-string v4, "utf16_size: "

    .line 26
    .line 27
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p2, v2, v3}, Lz4/d;->b(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget v2, v0, Lg8/b;->c:I

    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    invoke-virtual {p1}, Lv4/c0;->l()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p2, v2, p1}, Lz4/d;->b(ILjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p2, v1}, Lz4/d;->n(I)I

    .line 46
    .line 47
    .line 48
    iget p1, v0, Lg8/b;->c:I

    .line 49
    .line 50
    iget v1, p2, Lz4/d;->c:I

    .line 51
    .line 52
    add-int/2addr p1, v1

    .line 53
    iget-boolean v2, p2, Lz4/d;->a:Z

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    invoke-virtual {p2, p1}, Lz4/d;->f(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    iget-object v2, p2, Lz4/d;->b:[B

    .line 62
    .line 63
    array-length v2, v2

    .line 64
    if-gt p1, v2, :cond_3

    .line 65
    .line 66
    :goto_0
    iget-object v2, p2, Lz4/d;->b:[B

    .line 67
    .line 68
    array-length v3, v2

    .line 69
    sub-int/2addr v3, v1

    .line 70
    iget v4, v0, Lg8/b;->c:I

    .line 71
    .line 72
    if-lt v3, v4, :cond_2

    .line 73
    .line 74
    iget-object v0, v0, Lg8/b;->b:[B

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-static {v0, v3, v2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 78
    .line 79
    .line 80
    iput p1, p2, Lz4/d;->c:I

    .line 81
    .line 82
    invoke-virtual {p2, v3}, Lz4/d;->j(I)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    const-string p1, "(out.length - offset) < size()"

    .line 87
    .line 88
    invoke-static {p1}, Lokio/a;->i(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    invoke-static {}, Lz4/d;->g()V

    .line 93
    .line 94
    .line 95
    const/4 p1, 0x0

    .line 96
    throw p1
.end method
