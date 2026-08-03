.class public final Lp4/c;
.super Lz4/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final i:Lp4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp4/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lz4/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lp4/c;->i:Lp4/c;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p0, v0, v0}, Lp4/c;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lp4/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lp4/c;->o(Lp4/c;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final o(Lp4/c;)I
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    iget-object v1, p0, Lz4/e;->h:[Ljava/lang/Object;

    .line 6
    .line 7
    array-length v1, v1

    .line 8
    iget-object v2, p1, Lz4/e;->h:[Ljava/lang/Object;

    .line 9
    .line 10
    array-length v2, v2

    .line 11
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    move v4, v0

    .line 16
    :goto_0
    if-ge v4, v3, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0, v4}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Lp4/b;

    .line 23
    .line 24
    invoke-virtual {p1, v4}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    check-cast v6, Lp4/b;

    .line 29
    .line 30
    invoke-virtual {v5, v6}, Lp4/b;->a(Lp4/b;)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    return v5

    .line 37
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    if-ge v1, v2, :cond_3

    .line 41
    .line 42
    const/4 p1, -0x1

    .line 43
    return p1

    .line 44
    :cond_3
    if-le v1, v2, :cond_4

    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    return p1

    .line 48
    :cond_4
    :goto_1
    return v0
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

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
    iget-object v1, p0, Lz4/e;->h:[Ljava/lang/Object;

    .line 9
    .line 10
    array-length v1, v1

    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p2, "catch "

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    move v2, p2

    .line 24
    :goto_0
    if-ge v2, v1, :cond_4

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lp4/b;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    const-string v4, ",\n"

    .line 35
    .line 36
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v4, "  "

    .line 43
    .line 44
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :cond_0
    add-int/lit8 v4, v1, -0x1

    .line 48
    .line 49
    if-ne v2, v4, :cond_2

    .line 50
    .line 51
    iget-object v4, p0, Lz4/e;->h:[Ljava/lang/Object;

    .line 52
    .line 53
    array-length v4, v4

    .line 54
    if-nez v4, :cond_1

    .line 55
    .line 56
    move v4, p2

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int/lit8 v4, v4, -0x1

    .line 59
    .line 60
    invoke-virtual {p0, v4}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Lp4/b;

    .line 65
    .line 66
    iget-object v4, v4, Lp4/b;->g:Lv4/d0;

    .line 67
    .line 68
    sget-object v5, Lv4/d0;->j:Lv4/d0;

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Lv4/d0;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    :goto_1
    if-eqz v4, :cond_2

    .line 75
    .line 76
    const-string v4, "<any>"

    .line 77
    .line 78
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    iget-object v4, v3, Lp4/b;->g:Lv4/d0;

    .line 83
    .line 84
    iget-object v4, v4, Lv4/d0;->g:Lw4/c;

    .line 85
    .line 86
    invoke-virtual {v4}, Lw4/c;->a()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    :goto_2
    const-string v4, " -> "

    .line 94
    .line 95
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget v3, v3, Lp4/b;->h:I

    .line 99
    .line 100
    int-to-char v4, v3

    .line 101
    if-ne v3, v4, :cond_3

    .line 102
    .line 103
    invoke-static {v3}, La/a;->X0(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    invoke-static {v3}, La/a;->Y0(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    :goto_3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    add-int/lit8 v2, v2, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1
.end method
