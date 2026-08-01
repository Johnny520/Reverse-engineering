.class public final Lxhss/ᛷᛶᲁᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/String;

.field public final ᛳᲁᲇᛸ:Ljava/lang/String;

.field public final ᛷᛴᛷᛱ:I

.field public final ᛷᛵᛵᲈ:Ljava/lang/String;

.field public final ᛸᛴᛶᛳ:Ljava/lang/String;

.field public final ᲀᲇᛳᲁ:Ljava/lang/String;

.field public final ᲇᛴᲇᛵ:Ljava/lang/String;

.field public final ᲇᛶᛴᲀ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛷᛶᲁᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛷᛶᲁᛵ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᛷᛶᲁᛵ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 11
    .line 12
    iput p5, p0, Lxhss/ᛷᛶᲁᛵ;->ᛷᛴᛷᛱ:I

    .line 13
    .line 14
    iput-object p6, p0, Lxhss/ᛷᛶᲁᛵ;->ᲇᛶᛴᲀ:Ljava/util/List;

    .line 15
    .line 16
    iput-object p7, p0, Lxhss/ᛷᛶᲁᛵ;->ᲀᲇᛳᲁ:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lxhss/ᛷᛶᲁᛵ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lxhss/ᛷᛶᲁᛵ;

    .line 6
    .line 7
    iget-object p1, p1, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛱᛱᛲᲇ()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, 0x3

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    iget-object p0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 11
    .line 12
    const/16 v2, 0x2f

    .line 13
    .line 14
    invoke-static {p0, v2, v0, v1}, Lxhss/ᛲᛱᛲᲀ;->ᛷᛸᛷ(Ljava/lang/CharSequence;CII)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const-string v1, "?#"

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-static {v0, v2, p0, v1}, Lxhss/ᛶᛸᛲ;->ᛱᛱᛲᲇ(IILjava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ()Ljava/util/ArrayList;
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, 0x3

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    iget-object p0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 11
    .line 12
    const/16 v2, 0x2f

    .line 13
    .line 14
    invoke-static {p0, v2, v0, v1}, Lxhss/ᛲᛱᛲᲀ;->ᛷᛸᛷ(Ljava/lang/CharSequence;CII)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const-string v1, "?#"

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-static {v0, v3, p0, v1}, Lxhss/ᛶᛸᛲ;->ᛱᛱᛲᲇ(IILjava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    new-instance v3, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    :goto_0
    if-ge v0, v1, :cond_0

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    invoke-static {p0, v2, v0, v1}, Lxhss/ᛶᛸᛲ;->ᛳᲁᲇᛸ(Ljava/lang/String;CII)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-virtual {p0, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move v0, v4

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-object v3
.end method

.method public final ᛷᛴᛷᛱ()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string p0, ""

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object v0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int/lit8 v0, v0, 0x3

    .line 19
    .line 20
    const-string v1, ":@"

    .line 21
    .line 22
    iget-object p0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v0, v2, p0, v1}, Lxhss/ᛶᛸᛲ;->ᛱᛱᛲᲇ(IILjava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string p0, ""

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object v0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int/lit8 v0, v0, 0x3

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    iget-object p0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 22
    .line 23
    const/16 v2, 0x3a

    .line 24
    .line 25
    invoke-static {p0, v2, v0, v1}, Lxhss/ᛲᛱᛲᲀ;->ᛷᛸᛷ(Ljava/lang/CharSequence;CII)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    const/4 v2, 0x6

    .line 33
    const/16 v3, 0x40

    .line 34
    .line 35
    invoke-static {p0, v3, v1, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛷᛸᛷ(Ljava/lang/CharSequence;CII)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public final ᛸᛴᛶᛳ()Ljava/net/URI;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lxhss/ᛷᛶᲁᛵ;->ᲇᛶᛴᲀ()Lxhss/ᛴᲇᛴᛱ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛶᛴᲀ:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 8
    .line 9
    const-string v2, ""

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const-string v4, "[\"<>^`{|}]"

    .line 15
    .line 16
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v1, v3

    .line 30
    :goto_0
    iput-object v1, p0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/4 v4, 0x0

    .line 37
    move v5, v4

    .line 38
    :goto_1
    if-ge v5, v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    check-cast v6, Ljava/lang/String;

    .line 45
    .line 46
    const-string v7, "[]"

    .line 47
    .line 48
    const/16 v8, 0x63

    .line 49
    .line 50
    invoke-static {v6, v4, v4, v7, v8}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-virtual {v0, v5, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iget-object v0, p0, Lxhss/ᛴᲇᛴᛱ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    move v5, v4

    .line 69
    :goto_2
    if-ge v5, v1, :cond_3

    .line 70
    .line 71
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v6, :cond_2

    .line 78
    .line 79
    const-string v7, "\\^`{|}"

    .line 80
    .line 81
    const/16 v8, 0x43

    .line 82
    .line 83
    invoke-static {v6, v4, v4, v7, v8}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    goto :goto_3

    .line 88
    :cond_2
    move-object v6, v3

    .line 89
    :goto_3
    invoke-interface {v0, v5, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    add-int/lit8 v5, v5, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    iget-object v0, p0, Lxhss/ᛴᲇᛴᛱ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    const-string v1, " \"#<>\\^`{|}"

    .line 100
    .line 101
    const/16 v3, 0x23

    .line 102
    .line 103
    invoke-static {v0, v4, v4, v1, v3}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    :cond_4
    iput-object v3, p0, Lxhss/ᛴᲇᛴᛱ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {p0}, Lxhss/ᛴᲇᛴᛱ;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    :try_start_0
    new-instance v0, Ljava/net/URI;

    .line 114
    .line 115
    invoke-direct {v0, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :catch_0
    move-exception v0

    .line 120
    :try_start_1
    const-string v1, "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"

    .line 121
    .line 122
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 135
    .line 136
    .line 137
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 138
    return-object p0

    .line 139
    :catch_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 140
    .line 141
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    throw p0
.end method

.method public final ᲀᲇᛳᲁ()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "/..."

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lxhss/ᛴᲇᛴᛱ;

    .line 4
    .line 5
    invoke-direct {v1}, Lxhss/ᛴᲇᛴᛱ;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ(Lxhss/ᛷᛶᲁᛵ;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catch_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string p0, ""

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const-string v2, " \"\':;<=>@[]^`{}|/\\?#"

    .line 20
    .line 21
    const/16 v3, 0x7b

    .line 22
    .line 23
    invoke-static {p0, v0, v0, v2, v3}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iput-object v4, v1, Lxhss/ᛴᲇᛴᛱ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p0, v0, v0, v2, v3}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iput-object p0, v1, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v1}, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ()Lxhss/ᛷᛶᲁᛵ;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object p0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 40
    .line 41
    return-object p0
.end method

.method public final ᲇᛴᲇᛵ()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛶᲁᛵ;->ᲇᛶᛴᲀ:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x6

    .line 9
    iget-object p0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 10
    .line 11
    const/16 v2, 0x3f

    .line 12
    .line 13
    invoke-static {p0, v2, v0, v1}, Lxhss/ᛲᛱᛲᲀ;->ᛷᛸᛷ(Ljava/lang/CharSequence;CII)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    const/16 v1, 0x23

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {p0, v1, v0, v2}, Lxhss/ᛶᛸᛲ;->ᛳᲁᲇᛸ(Ljava/lang/String;CII)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final ᲇᛶᛴᲀ()Lxhss/ᛴᲇᛴᛱ;
    .locals 6

    .line 1
    new-instance v0, Lxhss/ᛴᲇᛴᛱ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᛴᲇᛴᛱ;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lxhss/ᛷᛶᲁᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v1, v0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p0}, Lxhss/ᛷᛶᲁᛵ;->ᛷᛴᛷᛱ()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iput-object v2, v0, Lxhss/ᛴᲇᛴᛱ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p0}, Lxhss/ᛷᛶᲁᛵ;->ᛷᛵᛵᲈ()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iput-object v2, v0, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v2, p0, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v2, v0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 25
    .line 26
    const-string v2, "http"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/4 v3, -0x1

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    const/16 v1, 0x50

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string v2, "https"

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    const/16 v1, 0x1bb

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v1, v3

    .line 50
    :goto_0
    iget v2, p0, Lxhss/ᛷᛶᲁᛵ;->ᛷᛴᛷᛱ:I

    .line 51
    .line 52
    if-eq v2, v1, :cond_2

    .line 53
    .line 54
    move v3, v2

    .line 55
    :cond_2
    iput v3, v0, Lxhss/ᛴᲇᛴᛱ;->ᛷᛴᛷᛱ:I

    .line 56
    .line 57
    iget-object v1, v0, Lxhss/ᛴᲇᛴᛱ;->ᲇᛶᛴᲀ:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lxhss/ᛷᛶᲁᛵ;->ᛳᲁᲇᛸ()Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const/4 v2, 0x0

    .line 74
    const/4 v3, 0x0

    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    const-string v4, " \"\'<>#"

    .line 78
    .line 79
    const/16 v5, 0x53

    .line 80
    .line 81
    invoke-static {v1, v3, v3, v4, v5}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v1}, Lxhss/ᛴᲇᛴᛱ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    move-object v1, v2

    .line 91
    :goto_1
    iput-object v1, v0, Lxhss/ᛴᲇᛴᛱ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 92
    .line 93
    iget-object v1, p0, Lxhss/ᛷᛶᲁᛵ;->ᲀᲇᛳᲁ:Ljava/lang/String;

    .line 94
    .line 95
    if-nez v1, :cond_4

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    const/16 v1, 0x23

    .line 99
    .line 100
    const/4 v2, 0x6

    .line 101
    iget-object p0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {p0, v1, v3, v2}, Lxhss/ᛲᛱᛲᲀ;->ᛷᛸᛷ(Ljava/lang/CharSequence;CII)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    :goto_2
    iput-object v2, v0, Lxhss/ᛴᲇᛴᛱ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 114
    .line 115
    return-object v0
.end method
