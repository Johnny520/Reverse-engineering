.class public final Lue0;
.super Lte0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final i:Ln30;

.field public final j:Lyt;


# direct methods
.method public constructor <init>(Ln30;ILkj1;Ld63;)V
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Lte0;-><init>(I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    iput-object p1, p0, Lue0;->i:Ln30;

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    iput-object v0, p0, Lue0;->j:Lyt;

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
    new-instance v0, Lyt;

    .line 22
    .line 23
    invoke-direct {v0, p1, p3, p2, p4}, Lyt;-><init>(Ln30;Lkj1;ZLd63;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lue0;->j:Lyt;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    const-string p0, "method == null"

    .line 30
    .line 31
    invoke-static {p0}, Lum2;->f(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lue0;->i:Ln30;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm30;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lue0;

    .line 2
    .line 3
    iget-object p0, p0, Lue0;->i:Ln30;

    .line 4
    .line 5
    iget-object p1, p1, Lue0;->i:Ln30;

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

.method public final d(Lz70;Lyn;II)I
    .locals 6

    .line 1
    iget-object p1, p1, Lz70;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lxg1;

    .line 4
    .line 5
    iget-object v0, p0, Lue0;->i:Ln30;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lxg1;->l(Ln30;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    sub-int p3, p1, p3

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iget-object v2, p0, Lue0;->j:Lyt;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    move v2, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v2}, Lxs1;->f()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_0
    const/4 v3, 0x1

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    move v4, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v4, v1

    .line 30
    :goto_1
    iget p0, p0, Lte0;->h:I

    .line 31
    .line 32
    and-int/lit16 v5, p0, 0x500

    .line 33
    .line 34
    if-nez v5, :cond_2

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move v3, v1

    .line 38
    :goto_2
    if-ne v4, v3, :cond_4

    .line 39
    .line 40
    invoke-virtual {p2}, Lyn;->d()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p4

    .line 50
    invoke-virtual {v0}, Lm30;->b()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    filled-new-array {p4, v0}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    const-string v0, "  [%x] %s"

    .line 59
    .line 60
    invoke-static {v0, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p4

    .line 64
    invoke-virtual {p2, p4, v1}, Lyn;->c(Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    invoke-static {p3}, Lpp0;->M(I)I

    .line 68
    .line 69
    .line 70
    move-result p4

    .line 71
    invoke-static {p1}, Lpp0;->K(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v1, "    method_idx:   "

    .line 76
    .line 77
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p2, v0, p4}, Lyn;->c(Ljava/lang/String;I)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0}, Lpp0;->M(I)I

    .line 85
    .line 86
    .line 87
    move-result p4

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v1, "    access_flags: "

    .line 91
    .line 92
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const v1, 0x31dff

    .line 96
    .line 97
    .line 98
    const/4 v3, 0x3

    .line 99
    invoke-static {p0, v1, v3}, Lup0;->x(III)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p2, v0, p4}, Lyn;->c(Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    invoke-static {v2}, Lpp0;->M(I)I

    .line 114
    .line 115
    .line 116
    move-result p4

    .line 117
    invoke-static {v2}, Lpp0;->K(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    const-string v1, "    code_off:     "

    .line 122
    .line 123
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {p2, v0, p4}, Lyn;->c(Ljava/lang/String;I)V

    .line 128
    .line 129
    .line 130
    :cond_3
    invoke-virtual {p2, p3}, Lyn;->m(I)I

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, p0}, Lyn;->m(I)I

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, v2}, Lyn;->m(I)I

    .line 137
    .line 138
    .line 139
    return p1

    .line 140
    :cond_4
    const-string p0, "code vs. access_flags mismatch"

    .line 141
    .line 142
    invoke-static {p0}, Lc80;->t(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lue0;

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
    check-cast p1, Lue0;

    .line 8
    .line 9
    iget-object p0, p0, Lue0;->i:Ln30;

    .line 10
    .line 11
    iget-object p1, p1, Lue0;->i:Ln30;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ldz;->d(Ldz;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

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
    const-class v1, Lue0;

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
    iget v1, p0, Lte0;->h:I

    .line 23
    .line 24
    invoke-static {v1}, Lpp0;->J(I)Ljava/lang/String;

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
    iget-object v2, p0, Lue0;->i:Ln30;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Lue0;->j:Lyt;

    .line 42
    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :cond_0
    const/16 p0, 0x7d

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method
