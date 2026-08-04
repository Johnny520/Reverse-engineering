.class public final Lyyds/ᛱᛲᲀᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛱᲈᲁ:Ljava/lang/String;

.field public final ᛲᛴᛳᛲ:I

.field public final ᛲᲈᲁ:Ljava/lang/String;

.field public final ᛵᛸᛸᛷ:Ljava/lang/String;

.field public final ᛶᛷᛲᲁ:Ljava/lang/String;

.field public final ᲀᛲᛳᲀ:Ljava/lang/String;

.field public final ᲇᲇᲇᛱ:Ljava/util/List;

.field public final ᲇᲈᛵᛷ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛱᛲᲀᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛱᛲᲀᛶ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 11
    .line 12
    iput p5, p0, Lyyds/ᛱᛲᲀᛶ;->ᛲᛴᛳᛲ:I

    .line 13
    .line 14
    iput-object p6, p0, Lyyds/ᛱᛲᲀᛶ;->ᲇᲇᲇᛱ:Ljava/util/List;

    .line 15
    .line 16
    iput-object p7, p0, Lyyds/ᛱᛲᲀᛶ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᛱᛲᲀᛶ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛱᛲᲀᛶ;

    .line 6
    .line 7
    iget-object p1, p1, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

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
    iget-object p0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

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
    iget-object p0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛱᲈᲁ()Ljava/net/URI;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lyyds/ᛱᛲᲀᛶ;->ᲇᲇᲇᛱ()Lyyds/ᛱᛲᛴᛲ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    const-string v2, ""

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const-string v4, "[\"<>^`{|}]"

    .line 19
    .line 20
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v1, v3

    .line 34
    :goto_0
    iput-object v1, p0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v4, 0x0

    .line 41
    move v5, v4

    .line 42
    :goto_1
    if-ge v5, v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Ljava/lang/String;

    .line 49
    .line 50
    const-string v7, "[]"

    .line 51
    .line 52
    const/16 v8, 0x63

    .line 53
    .line 54
    invoke-static {v4, v4, v8, v6, v7}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v0, v5, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    add-int/lit8 v5, v5, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    iget-object v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ljava/util/ArrayList;

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    move v5, v4

    .line 75
    :goto_2
    if-ge v5, v1, :cond_3

    .line 76
    .line 77
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    check-cast v6, Ljava/lang/String;

    .line 82
    .line 83
    if-eqz v6, :cond_2

    .line 84
    .line 85
    const-string v7, "\\^`{|}"

    .line 86
    .line 87
    const/16 v8, 0x43

    .line 88
    .line 89
    invoke-static {v4, v4, v8, v6, v7}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    goto :goto_3

    .line 94
    :cond_2
    move-object v6, v3

    .line 95
    :goto_3
    invoke-interface {v0, v5, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    add-int/lit8 v5, v5, 0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    iget-object v0, p0, Lyyds/ᛱᛲᛴᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Ljava/lang/String;

    .line 104
    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    const-string v1, " \"#<>\\^`{|}"

    .line 108
    .line 109
    const/16 v3, 0x23

    .line 110
    .line 111
    invoke-static {v4, v4, v3, v0, v1}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    :cond_4
    iput-object v3, p0, Lyyds/ᛱᛲᛴᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 116
    .line 117
    invoke-virtual {p0}, Lyyds/ᛱᛲᛴᛲ;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    :try_start_0
    new-instance v0, Ljava/net/URI;

    .line 122
    .line 123
    invoke-direct {v0, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    .line 125
    .line 126
    return-object v0

    .line 127
    :catch_0
    move-exception v0

    .line 128
    :try_start_1
    const-string v1, "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"

    .line 129
    .line 130
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {p0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 143
    .line 144
    .line 145
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 146
    return-object p0

    .line 147
    :catch_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 148
    .line 149
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    throw p0
.end method

.method public final ᛲᛴᛳᛲ()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

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
    iget-object v0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ:Ljava/lang/String;

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
    iget-object p0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v0, v2, p0, v1}, Lyyds/ᛶᲁᛵᛲ;->ᲀᛲᛳᲀ(IILjava/lang/String;Ljava/lang/String;)I

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

.method public final ᛲᲈᲁ()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛲᲀᛶ;->ᲀᛲᛳᲀ:Ljava/lang/String;

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
    iget-object v0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ:Ljava/lang/String;

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
    iget-object p0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 22
    .line 23
    const/16 v2, 0x3a

    .line 24
    .line 25
    invoke-static {p0, v2, v0, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛳᛶᛳ(Ljava/lang/CharSequence;CII)I

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
    invoke-static {p0, v3, v1, v2}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛳᛶᛳ(Ljava/lang/CharSequence;CII)I

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

.method public final ᛵᛸᛸᛷ()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ:Ljava/lang/String;

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
    iget-object p0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 11
    .line 12
    const/16 v2, 0x2f

    .line 13
    .line 14
    invoke-static {p0, v2, v0, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛳᛶᛳ(Ljava/lang/CharSequence;CII)I

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
    invoke-static {v0, v2, p0, v1}, Lyyds/ᛶᲁᛵᛲ;->ᲀᛲᛳᲀ(IILjava/lang/String;Ljava/lang/String;)I

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

.method public final ᛶᛷᛲᲁ()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "/..."

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lyyds/ᛱᛲᛴᛲ;

    .line 4
    .line 5
    invoke-direct {v1}, Lyyds/ᛱᛲᛴᛲ;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, Lyyds/ᛱᛲᛴᛲ;->ᲇᲈᛵᛷ(Lyyds/ᛱᛲᲀᛶ;Ljava/lang/String;)V
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
    const/4 p0, 0x0

    .line 17
    const/16 v0, 0x7b

    .line 18
    .line 19
    const-string v2, ""

    .line 20
    .line 21
    const-string v3, " \"\':;<=>@[]^`{}|/\\?#"

    .line 22
    .line 23
    invoke-static {p0, p0, v0, v2, v3}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iput-object v4, v1, Lyyds/ᛱᛲᛴᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {p0, p0, v0, v2, v3}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iput-object p0, v1, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {v1}, Lyyds/ᛱᛲᛴᛲ;->ᛲᲈᲁ()Lyyds/ᛱᛲᲀᛶ;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object p0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 40
    .line 41
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()Ljava/util/ArrayList;
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ:Ljava/lang/String;

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
    iget-object p0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 11
    .line 12
    const/16 v2, 0x2f

    .line 13
    .line 14
    invoke-static {p0, v2, v0, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛳᛶᛳ(Ljava/lang/CharSequence;CII)I

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
    invoke-static {v0, v3, p0, v1}, Lyyds/ᛶᲁᛵᛲ;->ᲀᛲᛳᲀ(IILjava/lang/String;Ljava/lang/String;)I

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
    invoke-static {p0, v2, v0, v1}, Lyyds/ᛶᲁᛵᛲ;->ᲇᲈᛵᛷ(Ljava/lang/String;CII)I

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

.method public final ᲇᲇᲇᛱ()Lyyds/ᛱᛲᛴᛲ;
    .locals 6

    .line 1
    new-instance v0, Lyyds/ᛱᛲᛴᛲ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛱᛲᛴᛲ;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lyyds/ᛱᛲᛴᛲ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v2, p0, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v2, v0, Lyyds/ᛱᛲᛴᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {p0}, Lyyds/ᛱᛲᲀᛶ;->ᛲᛴᛳᛲ()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iput-object v3, v0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {p0}, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iput-object v3, v0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v3, p0, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 27
    .line 28
    iput-object v3, v0, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 29
    .line 30
    const-string v3, "http"

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const/4 v4, -0x1

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    const/16 v2, 0x50

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string v3, "https"

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    const/16 v2, 0x1bb

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move v2, v4

    .line 54
    :goto_0
    iget v3, p0, Lyyds/ᛱᛲᲀᛶ;->ᛲᛴᛳᛲ:I

    .line 55
    .line 56
    if-eq v3, v2, :cond_2

    .line 57
    .line 58
    move v4, v3

    .line 59
    :cond_2
    iput v4, v0, Lyyds/ᛱᛲᛴᛲ;->ᛵᛸᛸᛷ:I

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lyyds/ᛱᛲᲀᛶ;->ᲀᛲᛳᲀ()Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    const/4 v2, 0x0

    .line 76
    const/4 v3, 0x0

    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    const-string v4, " \"\'<>#"

    .line 80
    .line 81
    const/16 v5, 0x53

    .line 82
    .line 83
    invoke-static {v3, v3, v5, v1, v4}, Lyyds/ᛴᛶᲀᛲ;->ᲇᲈᛵᛷ(IIILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {v1}, Lyyds/ᛱᛲᛴᛲ;->ᲇᲇᲇᛱ(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    move-object v1, v2

    .line 93
    :goto_1
    iput-object v1, v0, Lyyds/ᛱᛲᛴᛲ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 94
    .line 95
    iget-object v1, p0, Lyyds/ᛱᛲᲀᛶ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 96
    .line 97
    if-nez v1, :cond_4

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    const/16 v1, 0x23

    .line 101
    .line 102
    const/4 v2, 0x6

    .line 103
    iget-object p0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {p0, v1, v3, v2}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛳᛶᛳ(Ljava/lang/CharSequence;CII)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    add-int/lit8 v1, v1, 0x1

    .line 110
    .line 111
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    :goto_2
    iput-object v2, v0, Lyyds/ᛱᛲᛴᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 116
    .line 117
    return-object v0
.end method

.method public final ᲇᲈᛵᛷ()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛲᲀᛶ;->ᲇᲇᲇᛱ:Ljava/util/List;

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
    iget-object p0, p0, Lyyds/ᛱᛲᲀᛶ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 10
    .line 11
    const/16 v2, 0x3f

    .line 12
    .line 13
    invoke-static {p0, v2, v0, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛱᛳᛶᛳ(Ljava/lang/CharSequence;CII)I

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
    invoke-static {p0, v1, v0, v2}, Lyyds/ᛶᲁᛵᛲ;->ᲇᲈᛵᛷ(Ljava/lang/String;CII)I

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
