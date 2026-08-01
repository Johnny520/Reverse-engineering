.class public final Lqc1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lqc1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lqc1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lqc1;->α:Lqc1;

    .line 7
    .line 8
    sget-object v0, Lod;->ζ:Lod;

    .line 9
    .line 10
    sget-object v1, Lod;->η:Lod;

    .line 11
    .line 12
    sget-object v2, Lod;->ε:Lod;

    .line 13
    .line 14
    filled-new-array {v2, v0, v1}, [Lod;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static α(Lzd1;Lid1;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lid1;->ε:Ljava/lang/Integer;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lzd1;->γ()Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_1
    invoke-static {p0}, Lqc1;->β(Lzd1;)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    int-to-long p0, p0

    .line 39
    div-long/2addr v0, p0

    .line 40
    const-wide/32 p0, 0x7fffffff

    .line 41
    .line 42
    .line 43
    cmp-long v2, v0, p0

    .line 44
    .line 45
    if-lez v2, :cond_2

    .line 46
    .line 47
    move-wide v0, p0

    .line 48
    :cond_2
    long-to-int p0, v0

    .line 49
    return p0

    .line 50
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 51
    return p0
.end method

.method public static β(Lzd1;)Ljava/lang/Long;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lzd1;->η:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const-string v0, ","

    .line 19
    .line 20
    const-string v1, ""

    .line 21
    .line 22
    invoke-static {p0, v0, v1}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/16 v0, 0xa

    .line 27
    .line 28
    invoke-static {p0, v0}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public static γ(Ljava/util/List;Lzd1;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Set;J)Loc1;
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-interface {p4, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    const/4 p4, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p4, 0x0

    .line 12
    :goto_0
    const/4 v0, 0x0

    .line 13
    if-eqz p4, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    iget-object p1, p1, Lzd1;->β:Ljava/lang/Integer;

    .line 17
    .line 18
    if-eqz p2, :cond_4

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {p0, p1, p5, p6}, Lqc1;->ι(Ljava/util/List;Ljava/lang/Integer;J)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    move-object p5, p1

    .line 43
    check-cast p5, Lid1;

    .line 44
    .line 45
    iget p5, p5, Lid1;->α:I

    .line 46
    .line 47
    if-ne p5, p2, :cond_2

    .line 48
    .line 49
    move-object v0, p1

    .line 50
    :cond_3
    check-cast v0, Lid1;

    .line 51
    .line 52
    :cond_4
    :goto_1
    new-instance p0, Loc1;

    .line 53
    .line 54
    if-eqz v0, :cond_5

    .line 55
    .line 56
    iget-object p1, v0, Lid1;->β:Ljava/lang/String;

    .line 57
    .line 58
    if-nez p1, :cond_7

    .line 59
    .line 60
    iget p1, v0, Lid1;->α:I

    .line 61
    .line 62
    const-string p2, "\u79cd\u5b50 "

    .line 63
    .line 64
    invoke-static {p2, p1}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    goto :goto_2

    .line 69
    :cond_5
    if-eqz p4, :cond_6

    .line 70
    .line 71
    const-string p1, "\u5f53\u524d\u4f1a\u8bdd\u5df2\u786e\u8ba4\u8be5\u79cd\u5b50\u4e0d\u5728\u6d3b\u52a8\u65f6\u95f4"

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_6
    const-string p1, "\u56fa\u5b9a\u79cd\u5b50\u672a\u9009\u62e9\u3001\u672a\u89e3\u9501\u3001\u5df2\u4e0b\u67b6\u6216\u4e0d\u5728\u6d3b\u52a8\u65f6\u95f4"

    .line 75
    .line 76
    :cond_7
    :goto_2
    sget-object p2, Ltd;->η:Ltd;

    .line 77
    .line 78
    invoke-direct {p0, v0, p2, p3, p1}, Loc1;-><init>(Lid1;Ltd;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object p0
.end method

.method public static δ(Lzd1;Lbb1;Lrc1;)Ljava/util/List;
    .locals 0

    .line 1
    iget p1, p1, Lbb1;->α:I

    .line 2
    .line 3
    iget p2, p2, Lrc1;->α:I

    .line 4
    .line 5
    invoke-static {p1, p2}, Lqc1;->η(II)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0}, Lzd1;->ζ()Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p0, p1}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_0
    return-object p0
.end method

.method public static ε(Lzd1;Ljava/util/List;J)Ljava/lang/Long;
    .locals 10

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {p1, v0}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lex0;->Κ(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v1

    .line 16
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v2, v0

    .line 36
    check-cast v2, Lid1;

    .line 37
    .line 38
    iget v2, v2, Lid1;->α:I

    .line 39
    .line 40
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {p0}, Lzd1;->β()Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance p1, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_7

    .line 66
    .line 67
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Llc1;

    .line 72
    .line 73
    iget-object v2, v0, Llc1;->δ:Ljava/lang/Integer;

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    if-eqz v2, :cond_6

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Lid1;

    .line 91
    .line 92
    if-nez v2, :cond_3

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_3
    iget-object v4, v0, Llc1;->ν:Ljava/lang/Long;

    .line 96
    .line 97
    if-eqz v4, :cond_6

    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v4

    .line 103
    iget-object v6, v2, Lid1;->ο:Ljava/lang/Integer;

    .line 104
    .line 105
    if-eqz v6, :cond_6

    .line 106
    .line 107
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    iget-object v2, v2, Lid1;->ξ:Ljava/lang/Integer;

    .line 112
    .line 113
    if-eqz v2, :cond_5

    .line 114
    .line 115
    iget-object v0, v0, Llc1;->μ:Ljava/lang/Integer;

    .line 116
    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    goto :goto_2

    .line 124
    :cond_4
    const/4 v0, 0x0

    .line 125
    :goto_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-lt v0, v2, :cond_5

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_5
    int-to-long v6, v6

    .line 133
    const-wide/16 v8, 0x3e8

    .line 134
    .line 135
    mul-long/2addr v6, v8

    .line 136
    add-long/2addr v6, v4

    .line 137
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    cmp-long v2, v6, p2

    .line 142
    .line 143
    if-lez v2, :cond_6

    .line 144
    .line 145
    move-object v3, v0

    .line 146
    :cond_6
    :goto_3
    if-eqz v3, :cond_2

    .line 147
    .line 148
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_7
    invoke-static {p1}, Lxh;->У(Ljava/util/ArrayList;)Ljava/lang/Comparable;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, Ljava/lang/Long;

    .line 157
    .line 158
    return-object p0
.end method

.method public static ζ(Lzd1;Lbb1;Lrc1;Lid1;)I
    .locals 0

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    iget p1, p1, Lbb1;->β:I

    .line 6
    .line 7
    iget p2, p2, Lrc1;->β:I

    .line 8
    .line 9
    invoke-static {p1, p2}, Lqc1;->η(II)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p0}, Lzd1;->γ()Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    :goto_0
    invoke-virtual {p0}, Lzd1;->γ()Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-static {p0, p3}, Lqc1;->α(Lzd1;Lid1;)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-static {p2, p0}, Ljava/lang/Math;->min(II)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    return p0
.end method

.method public static η(II)Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-lez p0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    sub-int/2addr p0, p1

    .line 17
    if-gez p0, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_2
    return-object v1
.end method

.method public static ι(Ljava/util/List;Ljava/lang/Integer;J)Ljava/util/List;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljz;->ε:Ljz;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v2, v1

    .line 26
    check-cast v2, Lid1;

    .line 27
    .line 28
    iget-boolean v3, v2, Lid1;->τ:Z

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2, p2, p3}, Lid1;->β(J)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    iget-object v2, v2, Lid1;->θ:Ljava/lang/Integer;

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const v2, 0x7fffffff

    .line 48
    .line 49
    .line 50
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-gt v2, v3, :cond_1

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    return-object v0
.end method

.method public static λ(Lzd1;Ljava/util/List;J)Ljava/util/List;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lzd1;->δ:Ljava/lang/Integer;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v1

    .line 15
    :goto_0
    if-gtz v2, :cond_1

    .line 16
    .line 17
    sget-object p0, Ljz;->ε:Ljz;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    const/16 v2, 0xa

    .line 21
    .line 22
    invoke-static {p1, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {v2}, Lex0;->Κ(I)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/16 v3, 0x10

    .line 31
    .line 32
    if-ge v2, v3, :cond_2

    .line 33
    .line 34
    move v2, v3

    .line 35
    :cond_2
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 36
    .line 37
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    move-object v4, v2

    .line 55
    check-cast v4, Lid1;

    .line 56
    .line 57
    iget v4, v4, Lid1;->α:I

    .line 58
    .line 59
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-virtual {p0}, Lzd1;->β()Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    new-instance p1, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_e

    .line 85
    .line 86
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    move-object v4, v2

    .line 91
    check-cast v4, Llc1;

    .line 92
    .line 93
    iget-object v5, v4, Llc1;->δ:Ljava/lang/Integer;

    .line 94
    .line 95
    const/4 v6, 0x0

    .line 96
    if-eqz v5, :cond_5

    .line 97
    .line 98
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v3, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    check-cast v5, Lid1;

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    move-object v5, v6

    .line 114
    :goto_3
    if-eqz v5, :cond_6

    .line 115
    .line 116
    iget-object v7, v5, Lid1;->ξ:Ljava/lang/Integer;

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_6
    move-object v7, v6

    .line 120
    :goto_4
    if-eqz v5, :cond_7

    .line 121
    .line 122
    iget-object v6, v5, Lid1;->ο:Ljava/lang/Integer;

    .line 123
    .line 124
    :cond_7
    iget-object v5, v4, Llc1;->μ:Ljava/lang/Integer;

    .line 125
    .line 126
    iget-object v8, v4, Llc1;->ν:Ljava/lang/Long;

    .line 127
    .line 128
    if-eqz v7, :cond_9

    .line 129
    .line 130
    if-eqz v5, :cond_9

    .line 131
    .line 132
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    if-lt v9, v10, :cond_9

    .line 141
    .line 142
    :cond_8
    move v9, v1

    .line 143
    goto :goto_5

    .line 144
    :cond_9
    const/4 v9, 0x1

    .line 145
    if-eqz v6, :cond_a

    .line 146
    .line 147
    if-eqz v8, :cond_a

    .line 148
    .line 149
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 150
    .line 151
    .line 152
    move-result-wide v4

    .line 153
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    int-to-long v6, v6

    .line 158
    const-wide/16 v10, 0x3e8

    .line 159
    .line 160
    mul-long/2addr v6, v10

    .line 161
    add-long/2addr v6, v4

    .line 162
    cmp-long v4, v6, p2

    .line 163
    .line 164
    if-gtz v4, :cond_8

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_a
    if-eqz v7, :cond_b

    .line 168
    .line 169
    if-eqz v6, :cond_b

    .line 170
    .line 171
    if-eqz v5, :cond_d

    .line 172
    .line 173
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-nez v4, :cond_8

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_b
    if-eqz v5, :cond_c

    .line 181
    .line 182
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-nez v5, :cond_8

    .line 187
    .line 188
    :cond_c
    if-nez v8, :cond_8

    .line 189
    .line 190
    iget-wide v4, v4, Llc1;->η:J

    .line 191
    .line 192
    const-wide/16 v6, 0x0

    .line 193
    .line 194
    cmp-long v4, v4, v6

    .line 195
    .line 196
    if-nez v4, :cond_8

    .line 197
    .line 198
    :cond_d
    :goto_5
    if-eqz v9, :cond_4

    .line 199
    .line 200
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_e
    if-eqz v0, :cond_f

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    :cond_f
    invoke-static {p1, v1}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    return-object p0
.end method


# virtual methods
.method public final θ(Ljava/util/List;Lzd1;Lqd;Lsd;Ljava/util/Set;J)Loc1;
    .locals 11

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Lsd;->β()Ltd;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    if-eq v1, v3, :cond_1

    .line 20
    .line 21
    if-ne v1, v2, :cond_0

    .line 22
    .line 23
    iget-object v6, p4, Lsd;->ε:Ljava/lang/Integer;

    .line 24
    .line 25
    const-string v7, "\u4eba\u5458\u56fa\u5b9a"

    .line 26
    .line 27
    move-object v4, p1

    .line 28
    move-object v5, p2

    .line 29
    move-object/from16 v8, p5

    .line 30
    .line 31
    move-wide/from16 v9, p6

    .line 32
    .line 33
    invoke-static/range {v4 .. v10}, Lqc1;->γ(Ljava/util/List;Lzd1;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Set;J)Loc1;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    invoke-static {}, Lγ;->κ()V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return-object p0

    .line 43
    :cond_1
    iget v3, p3, Lqd;->ζ:I

    .line 44
    .line 45
    iget-object v4, p4, Lsd;->η:Ljava/util/Set;

    .line 46
    .line 47
    const-string v6, "\u4eba\u5458\u667a\u80fd"

    .line 48
    .line 49
    move-object v0, p0

    .line 50
    move-object v1, p1

    .line 51
    move-object v2, p2

    .line 52
    move-object/from16 v5, p5

    .line 53
    .line 54
    move-wide/from16 v7, p6

    .line 55
    .line 56
    invoke-virtual/range {v0 .. v8}, Lqc1;->κ(Ljava/util/List;Lzd1;ILjava/util/Set;Ljava/util/Set;Ljava/lang/String;J)Loc1;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_2
    invoke-virtual {p3}, Lqd;->α()Ltd;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    const/4 v1, -0x1

    .line 68
    goto :goto_0

    .line 69
    :cond_3
    sget-object v4, Lpc1;->α:[I

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    aget v1, v4, v1

    .line 76
    .line 77
    :goto_0
    if-eq v1, v3, :cond_5

    .line 78
    .line 79
    if-eq v1, v2, :cond_4

    .line 80
    .line 81
    new-instance p0, Loc1;

    .line 82
    .line 83
    const-string p1, "\u5168\u5c40"

    .line 84
    .line 85
    const-string p2, "\u5168\u5c40\u79cd\u5b50\u7b56\u7565\u5c1a\u672a\u8bbe\u7f6e"

    .line 86
    .line 87
    const/4 p3, 0x0

    .line 88
    invoke-direct {p0, p3, p3, p1, p2}, Loc1;-><init>(Lid1;Ltd;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_4
    iget v3, p3, Lqd;->ζ:I

    .line 93
    .line 94
    iget-object v4, p4, Lsd;->η:Ljava/util/Set;

    .line 95
    .line 96
    const-string v6, "\u5168\u5c40\u667a\u80fd"

    .line 97
    .line 98
    move-object v0, p0

    .line 99
    move-object v1, p1

    .line 100
    move-object v2, p2

    .line 101
    move-object/from16 v5, p5

    .line 102
    .line 103
    move-wide/from16 v7, p6

    .line 104
    .line 105
    invoke-virtual/range {v0 .. v8}, Lqc1;->κ(Ljava/util/List;Lzd1;ILjava/util/Set;Ljava/util/Set;Ljava/lang/String;J)Loc1;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :cond_5
    iget-object v2, p3, Lqd;->ε:Ljava/lang/Integer;

    .line 111
    .line 112
    const-string v3, "\u5168\u5c40\u56fa\u5b9a"

    .line 113
    .line 114
    move-object v0, p1

    .line 115
    move-object v1, p2

    .line 116
    move-object/from16 v4, p5

    .line 117
    .line 118
    move-wide/from16 v5, p6

    .line 119
    .line 120
    invoke-static/range {v0 .. v6}, Lqc1;->γ(Ljava/util/List;Lzd1;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Set;J)Loc1;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0
.end method

.method public final κ(Ljava/util/List;Lzd1;ILjava/util/Set;Ljava/util/Set;Ljava/lang/String;J)Loc1;
    .locals 17

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    check-cast v3, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-static {v2, v3}, Lg81;->ο(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v4, v0, Lzd1;->β:Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-static {v0}, Lqc1;->β(Lzd1;)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    if-gez v1, :cond_0

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    :goto_0
    move-object/from16 v7, p1

    .line 25
    .line 26
    move-wide/from16 v8, p7

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    move v6, v1

    .line 30
    goto :goto_0

    .line 31
    :goto_1
    invoke-static {v7, v4, v8, v9}, Lqc1;->ι(Ljava/util/List;Ljava/lang/Integer;J)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    new-instance v7, Lf7;

    .line 36
    .line 37
    const/4 v8, 0x1

    .line 38
    invoke-direct {v7, v8, v4}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance v4, Ltb;

    .line 42
    .line 43
    invoke-direct {v4, v3, v8}, Ltb;-><init>(Ljava/util/LinkedHashSet;I)V

    .line 44
    .line 45
    .line 46
    new-instance v3, Ly30;

    .line 47
    .line 48
    invoke-direct {v3, v7, v8, v4}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 49
    .line 50
    .line 51
    new-instance v4, Lf71;

    .line 52
    .line 53
    const/16 v7, 0x11

    .line 54
    .line 55
    invoke-direct {v4, v7}, Lf71;-><init>(I)V

    .line 56
    .line 57
    .line 58
    new-instance v7, Ly30;

    .line 59
    .line 60
    invoke-direct {v7, v3, v8, v4}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 61
    .line 62
    .line 63
    new-instance v3, Leg;

    .line 64
    .line 65
    const/4 v4, 0x2

    .line 66
    invoke-direct {v3, v6, v4}, Leg;-><init>(II)V

    .line 67
    .line 68
    .line 69
    new-instance v4, Ly30;

    .line 70
    .line 71
    invoke-direct {v4, v7, v8, v3}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 72
    .line 73
    .line 74
    new-instance v3, Lnc1;

    .line 75
    .line 76
    const/4 v6, 0x0

    .line 77
    invoke-direct {v3, v5, v6}, Lnc1;-><init>(Ljava/lang/Long;I)V

    .line 78
    .line 79
    .line 80
    new-instance v5, Ly30;

    .line 81
    .line 82
    invoke-direct {v5, v4, v8, v3}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 83
    .line 84
    .line 85
    new-instance v9, La30;

    .line 86
    .line 87
    const/4 v15, 0x0

    .line 88
    const/16 v16, 0x2

    .line 89
    .line 90
    const/4 v10, 0x2

    .line 91
    const-class v12, Lqc1;

    .line 92
    .line 93
    const-string v13, "compareSmartSeed"

    .line 94
    .line 95
    const-string v14, "compareSmartSeed(Lcom/example/dyhelper/hook/IM/pet/PetElfCampSeedCatalog$Seed;Lcom/example/dyhelper/hook/IM/pet/PetElfCampSeedCatalog$Seed;)I"

    .line 96
    .line 97
    move-object/from16 v11, p0

    .line 98
    .line 99
    invoke-direct/range {v9 .. v16}, La30;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 100
    .line 101
    .line 102
    new-instance v3, Llm;

    .line 103
    .line 104
    const/4 v4, 0x1

    .line 105
    invoke-direct {v3, v4, v9}, Llm;-><init>(ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v5}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-static {v4, v3}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-nez v4, :cond_1

    .line 124
    .line 125
    const/4 v3, 0x0

    .line 126
    goto :goto_2

    .line 127
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    :goto_2
    check-cast v3, Lid1;

    .line 132
    .line 133
    new-instance v4, Loc1;

    .line 134
    .line 135
    if-eqz v3, :cond_5

    .line 136
    .line 137
    iget-object v0, v3, Lid1;->β:Ljava/lang/String;

    .line 138
    .line 139
    if-nez v0, :cond_2

    .line 140
    .line 141
    iget v0, v3, Lid1;->α:I

    .line 142
    .line 143
    const-string v1, "\u79cd\u5b50 "

    .line 144
    .line 145
    invoke-static {v1, v0}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :cond_2
    iget-object v1, v3, Lid1;->ε:Ljava/lang/Integer;

    .line 150
    .line 151
    const-string v2, "?"

    .line 152
    .line 153
    if-nez v1, :cond_3

    .line 154
    .line 155
    move-object v1, v2

    .line 156
    :cond_3
    iget-object v5, v3, Lid1;->ζ:Ljava/lang/Integer;

    .line 157
    .line 158
    if-nez v5, :cond_4

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_4
    move-object v2, v5

    .line 162
    :goto_3
    new-instance v5, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v0, "\uff0c\u4ef7\u683c "

    .line 171
    .line 172
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v0, "\uff0c\u6536\u76ca "

    .line 179
    .line 180
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    goto/16 :goto_4

    .line 191
    .line 192
    :cond_5
    iget-object v5, v0, Lzd1;->β:Ljava/lang/Integer;

    .line 193
    .line 194
    if-nez v5, :cond_6

    .line 195
    .line 196
    const-string v0, "\u8425\u5730\u7b49\u7ea7\u672a\u77e5"

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_6
    invoke-static {v0}, Lqc1;->β(Lzd1;)Ljava/lang/Long;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    if-nez v0, :cond_7

    .line 204
    .line 205
    const-string v0, "\u91d1\u5e01\u672a\u77e5\uff0c\u65e0\u6cd5\u6821\u9a8c\u4ed8\u8d39\u79cd\u5b50"

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    const-string v5, "\u6ca1\u6709\u6ee1\u8db3\u7b49\u7ea7\u3001\u4f59\u989d\u4e0e\u6536\u76ca\u6570\u636e\u7684\u53ef\u4e70\u79cd\u5b50\uff0c\u6d3b\u52a8\u65f6\u95f4\u5df2\u6821\u9a8c"

    .line 211
    .line 212
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    if-lez v1, :cond_8

    .line 216
    .line 217
    new-instance v5, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    const-string v6, "\uff08\u4ef7\u683c\u4e0a\u9650 "

    .line 220
    .line 221
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    const-string v1, "\uff09"

    .line 228
    .line 229
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    :cond_8
    move-object v1, v2

    .line 240
    check-cast v1, Ljava/util/Collection;

    .line 241
    .line 242
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    const-string v5, " \u79cd"

    .line 247
    .line 248
    if-nez v1, :cond_9

    .line 249
    .line 250
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    new-instance v2, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    const-string v6, "\uff0c\u5df2\u6392\u9664 "

    .line 257
    .line 258
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    :cond_9
    move-object/from16 v1, p5

    .line 275
    .line 276
    check-cast v1, Ljava/util/Collection;

    .line 277
    .line 278
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-nez v1, :cond_a

    .line 283
    .line 284
    invoke-interface/range {p5 .. p5}, Ljava/util/Set;->size()I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    new-instance v2, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    const-string v6, "\uff0c\u5f53\u524d\u4f1a\u8bdd\u6d3b\u52a8\u62d2\u7edd "

    .line 291
    .line 292
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    :cond_a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    :goto_4
    sget-object v1, Ltd;->ζ:Ltd;

    .line 313
    .line 314
    move-object/from16 v2, p6

    .line 315
    .line 316
    invoke-direct {v4, v3, v1, v2, v0}, Loc1;-><init>(Lid1;Ltd;Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    return-object v4
.end method
