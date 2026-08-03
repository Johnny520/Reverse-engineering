.class public final Lr4/t;
.super Lr4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final h:Lv4/y;

.field public final i:Lr4/l;


# direct methods
.method public constructor <init>(Lv4/y;ILi4/a;Lw4/e;)V
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Lr4/s;-><init>(I)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    iput-object p1, p0, Lr4/t;->h:Lv4/y;

    .line 7
    .line 8
    if-nez p3, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lr4/t;->i:Lr4/l;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    and-int/lit8 p2, p2, 0x8

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p2, 0x0

    .line 21
    :goto_0
    new-instance v0, Lr4/l;

    .line 22
    .line 23
    invoke-direct {v0, p1, p3, p2, p4}, Lr4/l;-><init>(Lv4/y;Li4/a;ZLw4/e;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lr4/t;->i:Lr4/l;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    const-string p1, "method == null"

    .line 30
    .line 31
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/t;->h:Lv4/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/w;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lr4/t;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/t;->h:Lv4/y;

    .line 4
    .line 5
    iget-object p1, p1, Lr4/t;->h:Lv4/y;

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

.method public final d(Lr4/p;Lz4/d;II)I
    .locals 7

    .line 1
    iget-object p1, p1, Lr4/p;->j:Lr4/j0;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/t;->h:Lv4/y;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lr4/j0;->l(Lv4/e;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    sub-int p3, p1, p3

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iget-object v2, p0, Lr4/t;->i:Lr4/l;

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    move v2, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v2}, Lr4/l0;->f()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    :goto_0
    const/4 v3, 0x1

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    move v4, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v4, v1

    .line 28
    :goto_1
    iget v5, p0, Lr4/s;->g:I

    .line 29
    .line 30
    and-int/lit16 v6, v5, 0x500

    .line 31
    .line 32
    if-nez v6, :cond_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move v3, v1

    .line 36
    :goto_2
    if-ne v4, v3, :cond_4

    .line 37
    .line 38
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p4

    .line 48
    invoke-virtual {v0}, Lv4/w;->a()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    filled-new-array {p4, v0}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p4

    .line 56
    const-string v0, "  [%x] %s"

    .line 57
    .line 58
    invoke-static {v0, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p4

    .line 62
    invoke-virtual {p2, v1, p4}, Lz4/d;->b(ILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p3}, Lig/a;->c0(I)I

    .line 66
    .line 67
    .line 68
    move-result p4

    .line 69
    invoke-static {p1}, La/a;->Y0(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v1, "    method_idx:   "

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p2, p4, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v5}, Lig/a;->c0(I)I

    .line 83
    .line 84
    .line 85
    move-result p4

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v1, "    access_flags: "

    .line 89
    .line 90
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const v1, 0x31dff

    .line 94
    .line 95
    .line 96
    const/4 v3, 0x3

    .line 97
    invoke-static {v5, v1, v3}, Lbe/h;->A(III)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {p2, p4, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v2}, Lig/a;->c0(I)I

    .line 112
    .line 113
    .line 114
    move-result p4

    .line 115
    invoke-static {v2}, La/a;->Y0(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const-string v1, "    code_off:     "

    .line 120
    .line 121
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {p2, p4, v0}, Lz4/d;->b(ILjava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_3
    invoke-virtual {p2, p3}, Lz4/d;->n(I)I

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2, v5}, Lz4/d;->n(I)I

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v2}, Lz4/d;->n(I)I

    .line 135
    .line 136
    .line 137
    return p1

    .line 138
    :cond_4
    const-string p1, "code vs. access_flags mismatch"

    .line 139
    .line 140
    invoke-static {p1}, Lj8/o;->w(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const/4 p1, 0x0

    .line 144
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lr4/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lr4/t;

    .line 8
    .line 9
    iget-object v0, p0, Lr4/t;->h:Lv4/y;

    .line 10
    .line 11
    iget-object p1, p1, Lr4/t;->h:Lv4/y;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lv4/a;->d(Lv4/a;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_1
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-class v1, Lr4/t;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x7b

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget v1, p0, Lr4/s;->g:I

    .line 23
    .line 24
    invoke-static {v1}, La/a;->X0(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const/16 v1, 0x20

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lr4/t;->h:Lv4/y;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lr4/t;->i:Lr4/l;

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :cond_0
    const/16 v1, 0x7d

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0
.end method
