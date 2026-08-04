.class public final Lyyds/ᛵᲇᛵᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛵᲇᛵᛱ;

.field public static volatile ᛵᛸᛸᛷ:Z

.field public static ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0x29b4ce68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x29bace68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-wide v0, -0x29bbde68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lyyds/ᛵᲇᛵᛱ;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lyyds/ᛵᲇᛵᛱ;->ᛲᲈᲁ:Lyyds/ᛵᲇᛵᛱ;

    .line 31
    .line 32
    return-void
.end method

.method public static ᛱᲈᲁ(Ljava/lang/Integer;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    const-wide v0, -0x295c5e68a836eL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    div-int/lit16 p0, p0, 0x3e8

    .line 22
    .line 23
    div-int/lit8 v0, p0, 0x3c

    .line 24
    .line 25
    rem-int/lit8 p0, p0, 0x3c

    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    if-lez v0, :cond_1

    .line 33
    .line 34
    new-instance v2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const/16 v0, 0x5206

    .line 43
    .line 44
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    :cond_1
    if-lez p0, :cond_2

    .line 55
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const/16 p0, 0x79d2

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method

.method public static ᛲᛳᛶᲁ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-wide v0, -0x2947de68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x29484e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance p0, Ljava/text/SimpleDateFormat;

    .line 23
    .line 24
    const-wide v1, -0x2948be68a836eL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {p0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Ljava/util/Date;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 p0, 0x2e

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

.method public static ᛲᛴᛳᛲ(Landroid/content/Context;Ljava/io/File;Z)V
    .locals 2

    .line 1
    if-eqz p2, :cond_2

    .line 2
    .line 3
    :try_start_0
    sget-object p2, Lyyds/ᛴᲁᲈ;->ᛲᲈᲁ:Lyyds/ᛴᲁᲈ;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-wide v0, -0x2963be68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const-wide v0, -0x26bc0e68a836eL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    const-wide v0, -0x26bc8e68a836eL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lyyds/ᛴᲁᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;)Lyyds/ᲈᛵᛴᛱ;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-nez p1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {p0, p1}, Lyyds/ᛴᲁᲈ;->ᛵᛸᛸᛷ(Landroid/content/Context;Lyyds/ᲈᛵᛴᛱ;)Landroid/net/Uri;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    :goto_0
    return-void

    .line 50
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0, p1}, Landroid/provider/DocumentsContract;->deleteDocument(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catch_0
    move-exception p0

    .line 63
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 64
    .line 65
    const-wide v0, -0x29650e68a836eL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p1, p2, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public static ᛲᲈᲁ(Landroid/content/Context;Ljava/io/File;Ljava/io/File;Z)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p3, :cond_e

    .line 4
    .line 5
    sget-object p3, Lyyds/ᛴᲁᲈ;->ᛲᲈᲁ:Lyyds/ᛴᲁᲈ;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-wide v2, -0x29611e68a836eL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const-wide v2, -0x29626e68a836eL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const-wide v2, -0x26bd1e68a836eL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    const-wide v2, -0x26bd9e68a836eL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    const-wide v2, -0x26bebe68a836eL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Lyyds/ᛴᲁᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;)Lyyds/ᲈᛵᛴᛱ;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_d

    .line 63
    .line 64
    invoke-static {p2}, Lyyds/ᛴᲁᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;)Lyyds/ᲈᛵᛴᛱ;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    if-eqz p3, :cond_c

    .line 69
    .line 70
    iget-object v2, p1, Lyyds/ᲈᛵᛴᛱ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 71
    .line 72
    new-array v3, v1, [C

    .line 73
    .line 74
    const/16 v4, 0x2f

    .line 75
    .line 76
    aput-char v4, v3, v0

    .line 77
    .line 78
    invoke-static {v2, v3}, Lyyds/ᛲᲇᛸᲇ;->ᛷᛴᛴᲁ(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    new-instance v3, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_1

    .line 96
    .line 97
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    move-object v6, v5

    .line 102
    check-cast v6, Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v6}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-nez v6, :cond_0

    .line 109
    .line 110
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    iget-object v2, p3, Lyyds/ᲈᛵᛴᛱ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 115
    .line 116
    new-array v1, v1, [C

    .line 117
    .line 118
    aput-char v4, v1, v0

    .line 119
    .line 120
    invoke-static {v2, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛷᛴᛴᲁ(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    new-instance v1, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_3

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    move-object v4, v2

    .line 144
    check-cast v4, Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v4}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-nez v4, :cond_2

    .line 151
    .line 152
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_3
    invoke-static {v1}, Lyyds/ᛷᛷᛶᲇ;->ᛱᛸᲁᲇ(Ljava/util/List;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    check-cast v0, Ljava/lang/String;

    .line 161
    .line 162
    if-eqz v0, :cond_b

    .line 163
    .line 164
    iget-object v2, p1, Lyyds/ᲈᛵᛴᛱ;->ᛲᲈᲁ:Landroid/net/Uri;

    .line 165
    .line 166
    iget-object v4, p3, Lyyds/ᲈᛵᛴᛱ;->ᛲᲈᲁ:Landroid/net/Uri;

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_a

    .line 173
    .line 174
    invoke-static {v3}, Lyyds/ᛷᛷᛶᲇ;->ᛷᛸᲇᛶ(Ljava/util/List;)Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-static {v1}, Lyyds/ᛷᛷᛶᲇ;->ᛷᛸᲇᛶ(Ljava/util/List;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_a

    .line 187
    .line 188
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-static {p0, p1}, Lyyds/ᛴᲁᲈ;->ᛵᛸᛸᛷ(Landroid/content/Context;Lyyds/ᲈᛵᛴᛱ;)Landroid/net/Uri;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    if-eqz p1, :cond_9

    .line 197
    .line 198
    invoke-static {p0, p3}, Lyyds/ᛴᲁᲈ;->ᛵᛸᛸᛷ(Landroid/content/Context;Lyyds/ᲈᛵᛴᛱ;)Landroid/net/Uri;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    if-eqz p0, :cond_5

    .line 203
    .line 204
    new-instance p3, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v2, "."

    .line 207
    .line 208
    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-wide v2, -0x26c33e68a836eL

    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 227
    .line 228
    .line 229
    move-result-wide v2

    .line 230
    const/16 v4, 0x24

    .line 231
    .line 232
    invoke-static {v4}, Lyyds/ᛸᛳᛷᛳ;->ᲀᛲᛳᲀ(I)V

    .line 233
    .line 234
    .line 235
    invoke-static {v2, v3, v4}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    const-wide v3, -0x26c3ce68a836eL

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p3

    .line 254
    invoke-static {v1, p0, p3}, Landroid/provider/DocumentsContract;->renameDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    if-eqz p0, :cond_4

    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_4
    const-wide p0, -0x26c4ae68a836eL

    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    return-void

    .line 274
    :cond_5
    const/4 p0, 0x0

    .line 275
    :goto_2
    :try_start_0
    invoke-static {v1, p1, v0}, Landroid/provider/DocumentsContract;->renameDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 276
    .line 277
    .line 278
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 279
    if-eqz p1, :cond_7

    .line 280
    .line 281
    if-eqz p0, :cond_6

    .line 282
    .line 283
    :try_start_1
    invoke-static {v1, p0}, Landroid/provider/DocumentsContract;->deleteDocument(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    .line 284
    .line 285
    .line 286
    move-result p0

    .line 287
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 288
    .line 289
    .line 290
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 291
    goto :goto_3

    .line 292
    :catchall_0
    move-exception p0

    .line 293
    new-instance p1, Lyyds/ᲈᛵᛵᛴ;

    .line 294
    .line 295
    invoke-direct {p1, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 296
    .line 297
    .line 298
    move-object p0, p1

    .line 299
    :goto_3
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    if-eqz p0, :cond_6

    .line 304
    .line 305
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 306
    .line 307
    const-wide v0, -0x26c6ae68a836eL

    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p3

    .line 316
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p2

    .line 320
    invoke-virtual {p1, p2, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 321
    .line 322
    .line 323
    :cond_6
    return-void

    .line 324
    :cond_7
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 325
    .line 326
    const-wide v2, -0x26c57e68a836eL

    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object p3

    .line 335
    invoke-direct {p1, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 339
    :catch_0
    move-exception p1

    .line 340
    if-eqz p0, :cond_8

    .line 341
    .line 342
    :try_start_3
    invoke-static {v1, p0, v0}, Landroid/provider/DocumentsContract;->renameDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 343
    .line 344
    .line 345
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 346
    goto :goto_4

    .line 347
    :catchall_1
    move-exception p0

    .line 348
    new-instance p3, Lyyds/ᲈᛵᛵᛴ;

    .line 349
    .line 350
    invoke-direct {p3, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 351
    .line 352
    .line 353
    move-object p0, p3

    .line 354
    :goto_4
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    if-eqz p0, :cond_8

    .line 359
    .line 360
    sget-object p3, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 361
    .line 362
    const-wide v0, -0x26c60e68a836eL

    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object p2

    .line 375
    invoke-virtual {p3, p2, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 376
    .line 377
    .line 378
    :cond_8
    throw p1

    .line 379
    :cond_9
    const-wide p0, -0x26c2be68a836eL

    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    return-void

    .line 392
    :cond_a
    const-wide p0, -0x26c1be68a836eL

    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :cond_b
    const-wide p0, -0x26c13e68a836eL

    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    :cond_c
    const-wide p0, -0x26c06e68a836eL

    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object p0

    .line 427
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    return-void

    .line 431
    :cond_d
    const-wide p0, -0x26bf9e68a836eL

    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object p0

    .line 440
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    return-void

    .line 444
    :cond_e
    :try_start_4
    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    invoke-virtual {p2}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 449
    .line 450
    .line 451
    move-result-object p3

    .line 452
    const/4 v2, 0x2

    .line 453
    new-array v2, v2, [Ljava/nio/file/CopyOption;

    .line 454
    .line 455
    sget-object v3, Ljava/nio/file/StandardCopyOption;->ATOMIC_MOVE:Ljava/nio/file/StandardCopyOption;

    .line 456
    .line 457
    aput-object v3, v2, v0

    .line 458
    .line 459
    sget-object v3, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 460
    .line 461
    aput-object v3, v2, v1

    .line 462
    .line 463
    invoke-static {p0, p3, v2}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    :try_end_4
    .catch Ljava/nio/file/AtomicMoveNotSupportedException; {:try_start_4 .. :try_end_4} :catch_1

    .line 464
    .line 465
    .line 466
    return-void

    .line 467
    :catch_1
    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 468
    .line 469
    .line 470
    move-result-object p0

    .line 471
    invoke-virtual {p2}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 472
    .line 473
    .line 474
    move-result-object p1

    .line 475
    new-array p2, v1, [Ljava/nio/file/CopyOption;

    .line 476
    .line 477
    sget-object p3, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 478
    .line 479
    aput-object p3, p2, v0

    .line 480
    .line 481
    invoke-static {p0, p1, p2}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    .line 482
    .line 483
    .line 484
    return-void
.end method

.method public static ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .line 1
    const-wide v0, -0x29687e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x29692e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance v2, Ljava/io/File;

    .line 28
    .line 29
    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/4 v2, 0x1

    .line 37
    new-array v3, v2, [Ljava/nio/file/CopyOption;

    .line 38
    .line 39
    sget-object v4, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 40
    .line 41
    aput-object v4, v3, v0

    .line 42
    .line 43
    invoke-static {p0, p1, v3}, Ljava/nio/file/Files;->copy(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    return v2

    .line 50
    :catch_0
    move-exception p0

    .line 51
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 52
    .line 53
    new-instance v1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-wide v2, -0x2969be68a836eL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p1, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return v0
.end method

.method public static ᛷᲈᲈᲁ(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-wide v0, -0x2998ee68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p0, v0, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᲈᛴ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const-wide v0, -0x29992e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    const-wide v2, -0x29996e68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {p0, v0, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᲈᛴ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_6

    .line 41
    .line 42
    const-wide v2, -0x2999be68a836eL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {p0, v0, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᲈᛴ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const-wide v2, -0x299a3e68a836eL

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {p0, v0, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᲈᛴ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    const-wide v0, -0x299a7e68a836eL

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :cond_2
    const-wide v2, -0x299abe68a836eL

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {p0, v0, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᲈᛴ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    const-wide v0, -0x299b0e68a836eL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :cond_3
    const-wide v2, -0x299b5e68a836eL

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {p0, v0, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᲈᛴ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_4

    .line 122
    .line 123
    const-wide v0, -0x299bae68a836eL

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :cond_4
    const-wide v2, -0x299bfe68a836eL

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {p0, v0, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᲈᛴ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    if-eqz p0, :cond_5

    .line 147
    .line 148
    const-wide v0, -0x299c4e68a836eL

    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0

    .line 158
    :cond_5
    const-wide v0, -0x299c9e68a836eL

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    :cond_6
    :goto_0
    const-wide v0, -0x2999fe68a836eL

    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0
.end method

.method public static ᲀᛲᛳᲀ(Ljava/io/File;)Ljava/io/File;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-wide v0, -0x295c6e68a836eL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_0
    const/16 v1, 0x2e

    .line 21
    .line 22
    const/4 v2, 0x6

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static {v0, v1, v3, v2}, Lyyds/ᛲᲇᛸᲇ;->ᛷᛶᛷᲀ(Ljava/lang/String;CII)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    const/16 v2, 0x24

    .line 33
    .line 34
    invoke-static {v2}, Lyyds/ᛸᛳᛷᛳ;->ᲀᛲᛳᲀ(I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v4, v5, v2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-wide v4, -0x295cfe68a836eL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    const-string v4, "."

    .line 50
    .line 51
    if-lez v1, :cond_1

    .line 52
    .line 53
    invoke-static {v0}, Lyyds/ᛲᲇᛸᲇ;->ᛵᲀᛵᛸ(Ljava/lang/CharSequence;)I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-ge v1, v5, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    const-wide v5, -0x295dde68a836eL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-wide v5, -0x295ece68a836eL

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    new-instance v1, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-wide v3, -0x295fbe68a836eL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    goto :goto_0

    .line 114
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-wide v3, -0x29606e68a836eL

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    :goto_0
    new-instance v1, Ljava/io/File;

    .line 142
    .line 143
    invoke-virtual {p0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-direct {v1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-object v1
.end method

.method public static ᲇᲇᲇᛱ(Ljava/io/File;Ljava/lang/String;)Z
    .locals 4

    .line 1
    const-wide v0, -0x2965ae68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x29663e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    sget-object p0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 37
    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    const-wide v2, -0x29667e68a836eL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p0, p1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    new-instance p0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-wide v2, -0x29670e68a836eL

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    return v0

    .line 101
    :catch_0
    move-exception p0

    .line 102
    goto :goto_2

    .line 103
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 104
    .line 105
    .line 106
    new-instance v1, Lyyds/ᛷᲀᲇᲈ;

    .line 107
    .line 108
    invoke-direct {v1}, Lyyds/ᛷᲀᲇᲈ;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, p1}, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    new-instance p1, Lyyds/ᲀᲁᲁ;

    .line 115
    .line 116
    invoke-direct {p1, v1}, Lyyds/ᲀᲁᲁ;-><init>(Lyyds/ᛷᲀᲇᲈ;)V

    .line 117
    .line 118
    .line 119
    sget-object v1, Lyyds/ᛶᛵᛲᛲ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛲᛲ;

    .line 120
    .line 121
    invoke-static {}, Lyyds/ᛶᛵᛲᛲ;->ᛲᛴᛳᛲ()Lyyds/ᛶᛲᛷ;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    new-instance v2, Lyyds/ᲈᲀᛱᛷ;

    .line 129
    .line 130
    invoke-direct {v2, v1, p1}, Lyyds/ᲈᲀᛱᛷ;-><init>(Lyyds/ᛶᛲᛷ;Lyyds/ᲀᲁᲁ;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Lyyds/ᲈᲀᛱᛷ;->ᲇᲈᛵᛷ()Lyyds/ᛴᛴᛷᲁ;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    iget-boolean v1, p1, Lyyds/ᛴᛴᛷᲁ;->ᛵᛶᛲᲀ:Z

    .line 138
    .line 139
    if-nez v1, :cond_1

    .line 140
    .line 141
    return v0

    .line 142
    :cond_1
    iget-object p1, p1, Lyyds/ᛴᛴᛷᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛶᲀ;

    .line 143
    .line 144
    invoke-virtual {p1}, Lyyds/ᛲᛶᲀ;->ᛲᲈᲁ()Ljava/io/InputStream;

    .line 145
    .line 146
    .line 147
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    :try_start_1
    new-instance v1, Ljava/io/FileOutputStream;

    .line 149
    .line 150
    invoke-direct {v1, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    .line 152
    .line 153
    const/16 p0, 0x2000

    .line 154
    .line 155
    :try_start_2
    new-array p0, p0, [B

    .line 156
    .line 157
    invoke-virtual {p1, p0}, Ljava/io/InputStream;->read([B)I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    :goto_0
    if-ltz v2, :cond_2

    .line 162
    .line 163
    invoke-virtual {v1, p0, v0, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, p0}, Ljava/io/InputStream;->read([B)I

    .line 167
    .line 168
    .line 169
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 170
    goto :goto_0

    .line 171
    :cond_2
    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 172
    .line 173
    .line 174
    :try_start_4
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 175
    .line 176
    .line 177
    const/4 p0, 0x1

    .line 178
    return p0

    .line 179
    :catchall_0
    move-exception p0

    .line 180
    goto :goto_1

    .line 181
    :catchall_1
    move-exception p0

    .line 182
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 183
    :catchall_2
    move-exception v2

    .line 184
    :try_start_6
    invoke-static {v1, p0}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 188
    :goto_1
    :try_start_7
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 189
    :catchall_3
    move-exception v1

    .line 190
    :try_start_8
    invoke-static {p1, p0}, Lyyds/ᛶᛶᲁᲇ;->ᛵᛸᛸᛷ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    throw v1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 194
    :goto_2
    sget-object p1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 195
    .line 196
    const-wide v1, -0x29679e68a836eL

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {p1, v1, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 206
    .line 207
    .line 208
    new-instance p1, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    const-wide v1, -0x29680e68a836eL

    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 234
    .line 235
    .line 236
    return v0
.end method

.method public static ᲇᲈᛵᛷ(Landroid/content/Context;)V
    .locals 5

    .line 1
    const-wide v0, -0x296a9e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-wide v1, -0x296b1e68a836eL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Landroid/app/NotificationChannel;

    .line 20
    .line 21
    const-wide v3, -0x296bae68a836eL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const/4 v4, 0x2

    .line 31
    invoke-direct {v2, v3, v0, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v1}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-wide v0, -0x296cbe68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-wide v0, -0x296d8e68a836eL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    check-cast p0, Landroid/app/NotificationManager;

    .line 59
    .line 60
    invoke-virtual {p0, v2}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final ᛶᛷᛲᲁ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v3, p1

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    move-object/from16 v0, p4

    .line 6
    .line 7
    sget-object v8, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 8
    .line 9
    instance-of v1, v0, Lyyds/ᛸᛲᛳᲀ;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, Lyyds/ᛸᛲᛳᲀ;

    .line 15
    .line 16
    iget v2, v1, Lyyds/ᛸᛲᛳᲀ;->ᛱᛳᲇ:I

    .line 17
    .line 18
    const/high16 v4, -0x80000000

    .line 19
    .line 20
    and-int v5, v2, v4

    .line 21
    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    sub-int/2addr v2, v4

    .line 25
    iput v2, v1, Lyyds/ᛸᛲᛳᲀ;->ᛱᛳᲇ:I

    .line 26
    .line 27
    :goto_0
    move-object v9, v1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v1, Lyyds/ᛸᛲᛳᲀ;

    .line 30
    .line 31
    move-object/from16 v2, p0

    .line 32
    .line 33
    invoke-direct {v1, v2, v0}, Lyyds/ᛸᛲᛳᲀ;-><init>(Lyyds/ᛵᲇᛵᛱ;Lyyds/ᛶᛴᲀᛲ;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :goto_1
    iget-object v0, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᛵᲇᲀ:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object v10, Lyyds/ᛸᛴᲁᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛴᲁᛴ;

    .line 40
    .line 41
    iget v1, v9, Lyyds/ᛸᛲᛳᲀ;->ᛱᛳᲇ:I

    .line 42
    .line 43
    const/4 v11, 0x5

    .line 44
    const/4 v2, 0x3

    .line 45
    const/4 v4, 0x2

    .line 46
    const/4 v12, 0x4

    .line 47
    const/4 v5, 0x1

    .line 48
    const/4 v13, 0x0

    .line 49
    if-eqz v1, :cond_6

    .line 50
    .line 51
    if-eq v1, v5, :cond_5

    .line 52
    .line 53
    if-eq v1, v4, :cond_4

    .line 54
    .line 55
    if-eq v1, v2, :cond_3

    .line 56
    .line 57
    if-eq v1, v12, :cond_2

    .line 58
    .line 59
    if-ne v1, v11, :cond_1

    .line 60
    .line 61
    iget-object v1, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᲈᲈᲁ:Ljava/io/OutputStream;

    .line 62
    .line 63
    iget-object v2, v9, Lyyds/ᛸᛲᛳᲀ;->ᛲᛳᛶᲁ:Ljava/io/InputStream;

    .line 64
    .line 65
    iget-object v3, v9, Lyyds/ᛸᛲᛳᲀ;->ᛱᲈᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 66
    .line 67
    iget-object v4, v9, Lyyds/ᛸᛲᛳᲀ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 68
    .line 69
    :try_start_0
    invoke-static {v0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    goto/16 :goto_1d

    .line 73
    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object v13, v1

    .line 76
    move-object v14, v3

    .line 77
    move-object v3, v4

    .line 78
    :goto_2
    move-object v1, v0

    .line 79
    goto/16 :goto_23

    .line 80
    .line 81
    :cond_1
    const-wide v0, -0x2995de68a836eL

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-object v13

    .line 94
    :cond_2
    iget-boolean v1, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᛲᲈᛱ:Z

    .line 95
    .line 96
    iget-object v2, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᲈᲈᲁ:Ljava/io/OutputStream;

    .line 97
    .line 98
    iget-object v3, v9, Lyyds/ᛸᛲᛳᲀ;->ᛲᛳᛶᲁ:Ljava/io/InputStream;

    .line 99
    .line 100
    iget-object v4, v9, Lyyds/ᛸᛲᛳᲀ;->ᛱᲈᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 101
    .line 102
    iget-object v5, v9, Lyyds/ᛸᛲᛳᲀ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v6, v9, Lyyds/ᛸᛲᛳᲀ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 105
    .line 106
    :try_start_1
    invoke-static {v0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    .line 108
    .line 109
    move-object v12, v3

    .line 110
    move-object v3, v6

    .line 111
    move-object/from16 v18, v13

    .line 112
    .line 113
    goto/16 :goto_15

    .line 114
    .line 115
    :catchall_1
    move-exception v0

    .line 116
    move-object v1, v0

    .line 117
    move-object v13, v2

    .line 118
    move-object v2, v3

    .line 119
    move-object v14, v4

    .line 120
    move-object v3, v6

    .line 121
    goto/16 :goto_23

    .line 122
    .line 123
    :catch_0
    move-exception v0

    .line 124
    move v15, v1

    .line 125
    move-object v1, v2

    .line 126
    move-object v2, v3

    .line 127
    move-object v14, v4

    .line 128
    move-object v7, v5

    .line 129
    move-object v3, v6

    .line 130
    move-object/from16 v18, v13

    .line 131
    .line 132
    goto/16 :goto_1b

    .line 133
    .line 134
    :cond_3
    iget-boolean v1, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᛲᲈᛱ:Z

    .line 135
    .line 136
    iget-object v2, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᲈᲈᲁ:Ljava/io/OutputStream;

    .line 137
    .line 138
    check-cast v2, Landroid/app/NotificationManager;

    .line 139
    .line 140
    iget-object v2, v9, Lyyds/ᛸᛲᛳᲀ;->ᛲᛳᛶᲁ:Ljava/io/InputStream;

    .line 141
    .line 142
    check-cast v2, Ljava/io/File;

    .line 143
    .line 144
    iget-object v3, v9, Lyyds/ᛸᛲᛳᲀ;->ᛱᲈᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 145
    .line 146
    iget-object v2, v9, Lyyds/ᛸᛲᛳᲀ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v4, v9, Lyyds/ᛸᛲᛳᲀ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 149
    .line 150
    :try_start_2
    invoke-static {v0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 151
    .line 152
    .line 153
    move-object v14, v3

    .line 154
    move-object v3, v4

    .line 155
    goto/16 :goto_8

    .line 156
    .line 157
    :catchall_2
    move-exception v0

    .line 158
    move-object v1, v0

    .line 159
    move-object v14, v3

    .line 160
    move-object v3, v4

    .line 161
    :goto_3
    move-object v2, v13

    .line 162
    goto/16 :goto_23

    .line 163
    .line 164
    :catch_1
    move-exception v0

    .line 165
    move v15, v1

    .line 166
    move-object v7, v2

    .line 167
    move-object v14, v3

    .line 168
    move-object v3, v4

    .line 169
    :goto_4
    move-object v1, v13

    .line 170
    move-object v2, v1

    .line 171
    move-object/from16 v18, v2

    .line 172
    .line 173
    goto/16 :goto_1b

    .line 174
    .line 175
    :cond_4
    iget-object v1, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᲈᲈᲁ:Ljava/io/OutputStream;

    .line 176
    .line 177
    check-cast v1, Ljava/lang/Exception;

    .line 178
    .line 179
    iget-object v1, v9, Lyyds/ᛸᛲᛳᲀ;->ᛲᛳᛶᲁ:Ljava/io/InputStream;

    .line 180
    .line 181
    check-cast v1, Ljava/io/File;

    .line 182
    .line 183
    invoke-static {v0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    return-object v8

    .line 187
    :cond_5
    iget-boolean v1, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᛲᲈᛱ:Z

    .line 188
    .line 189
    iget-object v2, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᲈᲈᲁ:Ljava/io/OutputStream;

    .line 190
    .line 191
    check-cast v2, Ljava/io/File;

    .line 192
    .line 193
    iget-object v2, v9, Lyyds/ᛸᛲᛳᲀ;->ᛲᛳᛶᲁ:Ljava/io/InputStream;

    .line 194
    .line 195
    check-cast v2, Ljava/io/File;

    .line 196
    .line 197
    :try_start_3
    invoke-static {v0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 198
    .line 199
    .line 200
    return-object v8

    .line 201
    :catch_2
    move-exception v0

    .line 202
    goto :goto_6

    .line 203
    :cond_6
    invoke-static {v0}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    const/4 v1, 0x0

    .line 207
    sput-boolean v1, Lyyds/ᛵᲇᛵᛱ;->ᛵᛸᛸᛷ:Z

    .line 208
    .line 209
    new-instance v14, Lyyds/ᛱᛷᛸᲈ;

    .line 210
    .line 211
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 212
    .line 213
    .line 214
    new-instance v6, Ljava/io/File;

    .line 215
    .line 216
    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    sget-object v0, Lyyds/ᛴᲁᲈ;->ᛲᲈᲁ:Lyyds/ᛴᲁᲈ;

    .line 220
    .line 221
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v15

    .line 225
    const-wide v16, -0x2971de68a836eL

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    invoke-static/range {v16 .. v17}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    const-wide v16, -0x26b97e68a836eL

    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    invoke-static/range {v16 .. v17}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    invoke-static {v15}, Lyyds/ᛴᲁᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;)Lyyds/ᲈᛵᛴᛱ;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    if-eqz v0, :cond_7

    .line 249
    .line 250
    move v15, v5

    .line 251
    goto :goto_5

    .line 252
    :cond_7
    move v15, v1

    .line 253
    :goto_5
    if-nez v15, :cond_8

    .line 254
    .line 255
    :try_start_4
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-eqz v0, :cond_8

    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 262
    .line 263
    .line 264
    move-result v16

    .line 265
    if-nez v16, :cond_8

    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 268
    .line 269
    .line 270
    move-result v16

    .line 271
    if-nez v16, :cond_8

    .line 272
    .line 273
    sget-object v1, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 274
    .line 275
    sget-object v1, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 276
    .line 277
    new-instance v2, Lyyds/ᛲᛱᛷᛶ;

    .line 278
    .line 279
    invoke-direct {v2, v0, v13, v5}, Lyyds/ᛲᛱᛷᛶ;-><init>(Ljava/io/File;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 280
    .line 281
    .line 282
    iput-object v13, v9, Lyyds/ᛸᛲᛳᲀ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 283
    .line 284
    iput-object v13, v9, Lyyds/ᛸᛲᛳᲀ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 285
    .line 286
    iput-object v13, v9, Lyyds/ᛸᛲᛳᲀ;->ᛱᲈᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 287
    .line 288
    iput-object v13, v9, Lyyds/ᛸᛲᛳᲀ;->ᛲᛳᛶᲁ:Ljava/io/InputStream;

    .line 289
    .line 290
    iput-object v13, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᲈᲈᲁ:Ljava/io/OutputStream;

    .line 291
    .line 292
    iput-boolean v15, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᛲᲈᛱ:Z

    .line 293
    .line 294
    iput v5, v9, Lyyds/ᛸᛲᛳᲀ;->ᛱᛳᲇ:I

    .line 295
    .line 296
    invoke-static {v1, v2, v9}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 300
    if-ne v0, v10, :cond_20

    .line 301
    .line 302
    goto/16 :goto_1c

    .line 303
    .line 304
    :catch_3
    move-exception v0

    .line 305
    move v1, v15

    .line 306
    :goto_6
    sget-object v2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 307
    .line 308
    const-wide v6, -0x29732e68a836eL

    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-virtual {v2, v3, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 318
    .line 319
    .line 320
    sget-object v2, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 321
    .line 322
    sget-object v2, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 323
    .line 324
    new-instance v3, Lyyds/ᛴᛲᛶᛵ;

    .line 325
    .line 326
    invoke-direct {v3, v0, v13, v5}, Lyyds/ᛴᛲᛶᛵ;-><init>(Ljava/lang/Exception;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 327
    .line 328
    .line 329
    iput-object v13, v9, Lyyds/ᛸᛲᛳᲀ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 330
    .line 331
    iput-object v13, v9, Lyyds/ᛸᛲᛳᲀ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 332
    .line 333
    iput-object v13, v9, Lyyds/ᛸᛲᛳᲀ;->ᛱᲈᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 334
    .line 335
    iput-object v13, v9, Lyyds/ᛸᛲᛳᲀ;->ᛲᛳᛶᲁ:Ljava/io/InputStream;

    .line 336
    .line 337
    iput-object v13, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᲈᲈᲁ:Ljava/io/OutputStream;

    .line 338
    .line 339
    iput-boolean v1, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᛲᲈᛱ:Z

    .line 340
    .line 341
    iput v4, v9, Lyyds/ᛸᛲᛳᲀ;->ᛱᛳᲇ:I

    .line 342
    .line 343
    invoke-static {v2, v3, v9}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    if-ne v0, v10, :cond_20

    .line 348
    .line 349
    goto/16 :goto_1c

    .line 350
    .line 351
    :cond_8
    :try_start_5
    sget-object v0, Lyyds/ᲈᛳᛱᛲ;->ᛲᲈᲁ:Lyyds/ᲈᛳᛱᛲ;

    .line 352
    .line 353
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-static {}, Lyyds/ᲈᛳᛱᛲ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    const-wide v16, -0x27a4fe68a836eL

    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    move/from16 p0, v4

    .line 366
    .line 367
    invoke-static/range {v16 .. v17}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    if-nez v0, :cond_1a

    .line 376
    .line 377
    sget-object v0, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 378
    .line 379
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-static {v3}, Lyyds/ᲈᛷᛵᛷ;->ᲀᛲᛳᲀ(Landroid/content/Context;)Z

    .line 383
    .line 384
    .line 385
    invoke-static {v3}, Lyyds/ᛵᲇᛵᛱ;->ᲇᲈᛵᛷ(Landroid/content/Context;)V

    .line 386
    .line 387
    .line 388
    const-wide v16, -0x29740e68a836eL

    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    invoke-static/range {v16 .. v17}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-virtual {v3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    const-wide v16, -0x2974de68a836eL

    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    invoke-static/range {v16 .. v17}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-object v4, v0

    .line 410
    check-cast v4, Landroid/app/NotificationManager;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_14
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    .line 411
    .line 412
    :try_start_6
    sget-object v0, Lyyds/ᛵᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;

    .line 413
    .line 414
    if-eqz v0, :cond_9

    .line 415
    .line 416
    invoke-virtual {v3, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 417
    .line 418
    .line 419
    sput-object v13, Lyyds/ᛵᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 420
    .line 421
    goto :goto_7

    .line 422
    :catchall_3
    move-exception v0

    .line 423
    move-object v1, v0

    .line 424
    goto/16 :goto_3

    .line 425
    .line 426
    :catch_4
    move-exception v0

    .line 427
    :try_start_7
    sget-object v11, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 428
    .line 429
    const-wide v16, -0x29792e68a836eL

    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    invoke-static/range {v16 .. v17}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-virtual {v11, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 439
    .line 440
    .line 441
    :cond_9
    :goto_7
    new-instance v0, Lyyds/ᛵᛴᲈᛵ;

    .line 442
    .line 443
    invoke-direct {v0, v5, v4}, Lyyds/ᛵᛴᲈᛵ;-><init>(ILjava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    sput-object v0, Lyyds/ᛵᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;

    .line 447
    .line 448
    new-instance v0, Landroid/content/IntentFilter;

    .line 449
    .line 450
    const-wide v16, -0x297a2e68a836eL

    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    invoke-static/range {v16 .. v17}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    invoke-direct {v0, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    sget-object v2, Lyyds/ᛵᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;

    .line 463
    .line 464
    invoke-virtual {v3, v2, v0, v12}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 465
    .line 466
    .line 467
    new-instance v0, Landroid/content/Intent;

    .line 468
    .line 469
    const-wide v16, -0x297d3e68a836eL

    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    invoke-static/range {v16 .. v17}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 486
    .line 487
    .line 488
    const/high16 v2, 0xc000000

    .line 489
    .line 490
    invoke-static {v3, v1, v0, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    new-instance v2, Lyyds/ᲈᛳᛲᲀ;

    .line 495
    .line 496
    const-wide v16, -0x29804e68a836eL

    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    invoke-static/range {v16 .. v17}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v11

    .line 505
    invoke-direct {v2, v3, v11}, Lyyds/ᲈᛳᛲᲀ;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    iget-object v11, v2, Lyyds/ᲈᛳᛲᲀ;->ᛷᛵᲇᲀ:Landroid/app/Notification;

    .line 509
    .line 510
    const v12, 0x1080081

    .line 511
    .line 512
    .line 513
    iput v12, v11, Landroid/app/Notification;->icon:I

    .line 514
    .line 515
    const-wide v11, -0x29815e68a836eL

    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    invoke-static {v11, v12}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v11

    .line 524
    invoke-static {v11}, Lyyds/ᲈᛳᛲᲀ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 525
    .line 526
    .line 527
    move-result-object v11

    .line 528
    iput-object v11, v2, Lyyds/ᲈᛳᛲᲀ;->ᛲᛴᛳᛲ:Ljava/lang/CharSequence;

    .line 529
    .line 530
    const-wide v11, -0x29819e68a836eL

    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    invoke-static {v11, v12}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v11

    .line 539
    invoke-static {v11}, Lyyds/ᲈᛳᛲᲀ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 540
    .line 541
    .line 542
    move-result-object v11

    .line 543
    iput-object v11, v2, Lyyds/ᲈᛳᛲᲀ;->ᲇᲇᲇᛱ:Ljava/lang/CharSequence;

    .line 544
    .line 545
    const/4 v11, -0x1

    .line 546
    iput v11, v2, Lyyds/ᲈᛳᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 547
    .line 548
    iget-object v12, v2, Lyyds/ᲈᛳᛲᲀ;->ᛷᛵᲇᲀ:Landroid/app/Notification;

    .line 549
    .line 550
    iget v5, v12, Landroid/app/Notification;->flags:I

    .line 551
    .line 552
    or-int/lit8 v5, v5, 0x2

    .line 553
    .line 554
    iput v5, v12, Landroid/app/Notification;->flags:I

    .line 555
    .line 556
    const/16 v5, 0x64

    .line 557
    .line 558
    iput v5, v2, Lyyds/ᲈᛳᛲᲀ;->ᛱᲈᲁ:I

    .line 559
    .line 560
    iput v1, v2, Lyyds/ᲈᛳᛲᲀ;->ᛲᛳᛶᲁ:I

    .line 561
    .line 562
    const-wide v19, -0x29821e68a836eL

    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    invoke-static/range {v19 .. v20}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v12

    .line 571
    iget-object v5, v2, Lyyds/ᲈᛳᛲᲀ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 572
    .line 573
    new-instance v1, Lyyds/ᛳᛵᛱᲇ;

    .line 574
    .line 575
    invoke-direct {v1, v12, v0}, Lyyds/ᛳᛵᛱᲇ;-><init>(Ljava/lang/String;Landroid/app/PendingIntent;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    const-wide v0, -0x29826e68a836eL

    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v2}, Lyyds/ᲈᛳᛲᲀ;->ᛲᲈᲁ()Landroid/app/Notification;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    const/16 v1, 0x3e9

    .line 594
    .line 595
    invoke-virtual {v4, v1, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 596
    .line 597
    .line 598
    new-instance v0, Lyyds/ᛷᲀᲇᲈ;

    .line 599
    .line 600
    invoke-direct {v0}, Lyyds/ᛷᲀᲇᲈ;-><init>()V

    .line 601
    .line 602
    .line 603
    move-object/from16 v5, p3

    .line 604
    .line 605
    invoke-virtual {v0, v5}, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    new-instance v5, Lyyds/ᲀᲁᲁ;

    .line 609
    .line 610
    invoke-direct {v5, v0}, Lyyds/ᲀᲁᲁ;-><init>(Lyyds/ᛷᲀᲇᲈ;)V

    .line 611
    .line 612
    .line 613
    sget-object v0, Lyyds/ᛶᛵᛲᛲ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛲᛲ;

    .line 614
    .line 615
    invoke-static {}, Lyyds/ᛶᛵᛲᛲ;->ᛲᛴᛳᛲ()Lyyds/ᛶᛲᛷ;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-virtual {v0, v5}, Lyyds/ᛶᛲᛷ;->ᛲᲈᲁ(Lyyds/ᲀᲁᲁ;)Lyyds/ᲈᲀᛱᛷ;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-virtual {v0}, Lyyds/ᲈᲀᛱᛷ;->ᲇᲈᛵᛷ()Lyyds/ᛴᛴᛷᲁ;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    iput-object v0, v14, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 628
    .line 629
    iget-boolean v5, v0, Lyyds/ᛴᛴᛷᲁ;->ᛵᛶᛲᲀ:Z
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_14
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 630
    .line 631
    if-nez v5, :cond_c

    .line 632
    .line 633
    :try_start_8
    sget-object v0, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 634
    .line 635
    sget-object v0, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 636
    .line 637
    new-instance v1, Lyyds/ᲇᲈᲈᛶ;

    .line 638
    .line 639
    const/4 v2, 0x7

    .line 640
    invoke-direct {v1, v14, v4, v13, v2}, Lyyds/ᲇᲈᲈᛶ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 641
    .line 642
    .line 643
    iput-object v3, v9, Lyyds/ᛸᛲᛳᲀ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 644
    .line 645
    iput-object v7, v9, Lyyds/ᛸᛲᛳᲀ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 646
    .line 647
    iput-object v14, v9, Lyyds/ᛸᛲᛳᲀ;->ᛱᲈᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 648
    .line 649
    iput-object v13, v9, Lyyds/ᛸᛲᛳᲀ;->ᛲᛳᛶᲁ:Ljava/io/InputStream;

    .line 650
    .line 651
    iput-object v13, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᲈᲈᲁ:Ljava/io/OutputStream;

    .line 652
    .line 653
    iput-boolean v15, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᛲᲈᛱ:Z

    .line 654
    .line 655
    const/4 v2, 0x3

    .line 656
    iput v2, v9, Lyyds/ᛸᛲᛳᲀ;->ᛱᛳᲇ:I

    .line 657
    .line 658
    invoke-static {v0, v1, v9}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 662
    if-ne v0, v10, :cond_a

    .line 663
    .line 664
    goto/16 :goto_1c

    .line 665
    .line 666
    :cond_a
    :goto_8
    :try_start_9
    iget-object v0, v14, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v0, Lyyds/ᛴᛴᛷᲁ;

    .line 669
    .line 670
    if-eqz v0, :cond_b

    .line 671
    .line 672
    invoke-virtual {v0}, Lyyds/ᛴᛴᛷᲁ;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    .line 673
    .line 674
    .line 675
    goto :goto_9

    .line 676
    :catch_5
    move-exception v0

    .line 677
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 678
    .line 679
    const-wide v4, -0x29845e68a836eL

    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 689
    .line 690
    .line 691
    :cond_b
    :goto_9
    :try_start_a
    sget-object v0, Lyyds/ᛵᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;

    .line 692
    .line 693
    if-eqz v0, :cond_20

    .line 694
    .line 695
    invoke-virtual {v3, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 696
    .line 697
    .line 698
    sput-object v13, Lyyds/ᛵᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    .line 699
    .line 700
    goto/16 :goto_22

    .line 701
    .line 702
    :catch_6
    move-exception v0

    .line 703
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 704
    .line 705
    const-wide v2, -0x2984ce68a836eL

    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    :goto_a
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 715
    .line 716
    .line 717
    goto/16 :goto_22

    .line 718
    .line 719
    :catch_7
    move-exception v0

    .line 720
    goto/16 :goto_4

    .line 721
    .line 722
    :cond_c
    :try_start_b
    iget-object v0, v0, Lyyds/ᛴᛴᛷᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛶᲀ;

    .line 723
    .line 724
    move-object v5, v2

    .line 725
    invoke-virtual {v0}, Lyyds/ᛲᛶᲀ;->ᛶᛷᛲᲁ()J

    .line 726
    .line 727
    .line 728
    move-result-wide v1

    .line 729
    invoke-virtual {v0}, Lyyds/ᛲᛶᲀ;->ᛲᲈᲁ()Ljava/io/InputStream;

    .line 730
    .line 731
    .line 732
    move-result-object v12
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_14
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 733
    if-eqz v15, :cond_e

    .line 734
    .line 735
    :try_start_c
    sget-object v0, Lyyds/ᛴᲁᲈ;->ᛲᲈᲁ:Lyyds/ᛴᲁᲈ;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_9
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 736
    .line 737
    move-object/from16 v18, v13

    .line 738
    .line 739
    :try_start_d
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v13

    .line 743
    const-wide v20, -0x2985be68a836eL

    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    invoke-static/range {v20 .. v21}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    invoke-static {v3, v13}, Lyyds/ᛴᲁᲈ;->ᛲᛴᛳᛲ(Landroid/content/Context;Ljava/lang/String;)Ljava/io/OutputStream;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    if-eqz v0, :cond_d

    .line 759
    .line 760
    :goto_b
    move-object v13, v0

    .line 761
    goto :goto_e

    .line 762
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 763
    .line 764
    const-wide v1, -0x29870e68a836eL

    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    throw v0

    .line 777
    :catchall_4
    move-exception v0

    .line 778
    move-object v1, v0

    .line 779
    move-object v2, v12

    .line 780
    move-object/from16 v13, v18

    .line 781
    .line 782
    goto/16 :goto_23

    .line 783
    .line 784
    :catch_8
    move-exception v0

    .line 785
    :goto_c
    move-object v2, v12

    .line 786
    move-object/from16 v1, v18

    .line 787
    .line 788
    goto/16 :goto_1b

    .line 789
    .line 790
    :catchall_5
    move-exception v0

    .line 791
    move-object/from16 v18, v13

    .line 792
    .line 793
    :goto_d
    move-object v1, v0

    .line 794
    move-object v2, v12

    .line 795
    goto/16 :goto_23

    .line 796
    .line 797
    :catch_9
    move-exception v0

    .line 798
    move-object/from16 v18, v13

    .line 799
    .line 800
    goto :goto_c

    .line 801
    :cond_e
    move-object/from16 v18, v13

    .line 802
    .line 803
    new-instance v0, Ljava/io/FileOutputStream;

    .line 804
    .line 805
    invoke-direct {v0, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_8
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 806
    .line 807
    .line 808
    goto :goto_b

    .line 809
    :goto_e
    const/high16 v0, 0x10000

    .line 810
    .line 811
    :try_start_e
    new-array v0, v0, [B

    .line 812
    .line 813
    const/16 v20, 0x0

    .line 814
    .line 815
    const-wide/16 v21, 0x0

    .line 816
    .line 817
    move-object/from16 v23, v5

    .line 818
    .line 819
    :goto_f
    invoke-virtual {v12, v0}, Ljava/io/InputStream;->read([B)I

    .line 820
    .line 821
    .line 822
    move-result v5

    .line 823
    if-eq v5, v11, :cond_15

    .line 824
    .line 825
    sget-boolean v24, Lyyds/ᛵᲇᛵᛱ;->ᛵᛸᛸᛷ:Z

    .line 826
    .line 827
    if-eqz v24, :cond_13

    .line 828
    .line 829
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 830
    .line 831
    const-wide v1, -0x2987be68a836eL

    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v1

    .line 840
    invoke-virtual {v0, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_f
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 841
    .line 842
    .line 843
    if-eqz v15, :cond_11

    .line 844
    .line 845
    :try_start_f
    sget-object v0, Lyyds/ᛴᲁᲈ;->ᛲᲈᲁ:Lyyds/ᛴᲁᲈ;

    .line 846
    .line 847
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    const-wide v4, -0x29888e68a836eL

    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 860
    .line 861
    .line 862
    const-wide v4, -0x26bc0e68a836eL

    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    const-wide v4, -0x26bc8e68a836eL

    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    invoke-static {v1}, Lyyds/ᛴᲁᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;)Lyyds/ᲈᛵᛴᛱ;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    if-nez v0, :cond_f

    .line 883
    .line 884
    goto :goto_11

    .line 885
    :cond_f
    invoke-static {v3, v0}, Lyyds/ᛴᲁᲈ;->ᛵᛸᛸᛷ(Landroid/content/Context;Lyyds/ᲈᛵᛴᛱ;)Landroid/net/Uri;

    .line 886
    .line 887
    .line 888
    move-result-object v0

    .line 889
    if-nez v0, :cond_10

    .line 890
    .line 891
    goto :goto_11

    .line 892
    :cond_10
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 893
    .line 894
    .line 895
    move-result-object v1

    .line 896
    invoke-static {v1, v0}, Landroid/provider/DocumentsContract;->deleteDocument(Landroid/content/ContentResolver;Landroid/net/Uri;)Z

    .line 897
    .line 898
    .line 899
    goto :goto_11

    .line 900
    :catchall_6
    move-exception v0

    .line 901
    goto :goto_d

    .line 902
    :catch_a
    move-exception v0

    .line 903
    goto :goto_10

    .line 904
    :cond_11
    invoke-virtual {v6}, Ljava/io/File;->delete()Z
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_a
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 905
    .line 906
    .line 907
    goto :goto_11

    .line 908
    :goto_10
    :try_start_10
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 909
    .line 910
    const-wide v4, -0x2989de68a836eL

    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v2

    .line 919
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_f
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 920
    .line 921
    .line 922
    :goto_11
    :try_start_11
    invoke-virtual {v13}, Ljava/io/OutputStream;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_b

    .line 923
    .line 924
    .line 925
    goto :goto_12

    .line 926
    :catch_b
    move-exception v0

    .line 927
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 928
    .line 929
    const-wide v4, -0x298a7e68a836eL

    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v2

    .line 938
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 939
    .line 940
    .line 941
    :goto_12
    :try_start_12
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_c

    .line 942
    .line 943
    .line 944
    goto :goto_13

    .line 945
    :catch_c
    move-exception v0

    .line 946
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 947
    .line 948
    const-wide v4, -0x298afe68a836eL

    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 954
    .line 955
    .line 956
    move-result-object v2

    .line 957
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 958
    .line 959
    .line 960
    :goto_13
    :try_start_13
    iget-object v0, v14, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 961
    .line 962
    check-cast v0, Lyyds/ᛴᛴᛷᲁ;

    .line 963
    .line 964
    if-eqz v0, :cond_12

    .line 965
    .line 966
    invoke-virtual {v0}, Lyyds/ᛴᛴᛷᲁ;->close()V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_d

    .line 967
    .line 968
    .line 969
    goto :goto_14

    .line 970
    :catch_d
    move-exception v0

    .line 971
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 972
    .line 973
    const-wide v4, -0x298b7e68a836eL

    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v2

    .line 982
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 983
    .line 984
    .line 985
    :cond_12
    :goto_14
    :try_start_14
    sget-object v0, Lyyds/ᛵᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;

    .line 986
    .line 987
    if-eqz v0, :cond_20

    .line 988
    .line 989
    invoke-virtual {v3, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 990
    .line 991
    .line 992
    sput-object v18, Lyyds/ᛵᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_e

    .line 993
    .line 994
    goto/16 :goto_22

    .line 995
    .line 996
    :catch_e
    move-exception v0

    .line 997
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 998
    .line 999
    const-wide v2, -0x298bee68a836eL

    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    goto/16 :goto_a

    .line 1005
    .line 1006
    :catch_f
    move-exception v0

    .line 1007
    move-object v2, v12

    .line 1008
    move-object v1, v13

    .line 1009
    goto/16 :goto_1b

    .line 1010
    .line 1011
    :cond_13
    const/4 v11, 0x0

    .line 1012
    :try_start_15
    invoke-virtual {v13, v0, v11, v5}, Ljava/io/OutputStream;->write([BII)V

    .line 1013
    .line 1014
    .line 1015
    int-to-float v5, v5

    .line 1016
    add-float v20, v20, v5

    .line 1017
    .line 1018
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1019
    .line 1020
    .line 1021
    move-result-wide v24

    .line 1022
    sub-long v26, v24, v21

    .line 1023
    .line 1024
    const-wide/16 v28, 0xc8

    .line 1025
    .line 1026
    cmp-long v5, v26, v28

    .line 1027
    .line 1028
    if-ltz v5, :cond_14

    .line 1029
    .line 1030
    long-to-float v5, v1

    .line 1031
    div-float v5, v20, v5

    .line 1032
    .line 1033
    const/high16 v21, 0x42c80000    # 100.0f

    .line 1034
    .line 1035
    mul-float v5, v5, v21

    .line 1036
    .line 1037
    float-to-int v5, v5

    .line 1038
    const-wide v21, -0x298cde68a836eL

    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v11

    .line 1047
    move-object/from16 v27, v0

    .line 1048
    .line 1049
    int-to-float v0, v5

    .line 1050
    move-wide/from16 v28, v1

    .line 1051
    .line 1052
    new-instance v1, Ljava/lang/Float;

    .line 1053
    .line 1054
    invoke-direct {v1, v0}, Ljava/lang/Float;-><init>(F)V

    .line 1055
    .line 1056
    .line 1057
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    const/4 v1, 0x1

    .line 1062
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    invoke-static {v11, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v0

    .line 1070
    const-wide v21, -0x298d2e68a836eL

    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-object/from16 v2, v23

    .line 1079
    .line 1080
    const/16 v11, 0x64

    .line 1081
    .line 1082
    iput v11, v2, Lyyds/ᲈᛳᛲᲀ;->ᛱᲈᲁ:I

    .line 1083
    .line 1084
    iput v5, v2, Lyyds/ᲈᛳᛲᲀ;->ᛲᛳᛶᲁ:I

    .line 1085
    .line 1086
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1087
    .line 1088
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1089
    .line 1090
    .line 1091
    const-wide v21, -0x298dee68a836eL

    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    invoke-static/range {v21 .. v22}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v1

    .line 1100
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1104
    .line 1105
    .line 1106
    const/16 v0, 0x25

    .line 1107
    .line 1108
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    invoke-static {v0}, Lyyds/ᲈᛳᛲᲀ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v0

    .line 1119
    iput-object v0, v2, Lyyds/ᲈᛳᛲᲀ;->ᲇᲇᲇᛱ:Ljava/lang/CharSequence;

    .line 1120
    .line 1121
    invoke-virtual {v2}, Lyyds/ᲈᛳᛲᲀ;->ᛲᲈᲁ()Landroid/app/Notification;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v0

    .line 1125
    const/16 v1, 0x3e9

    .line 1126
    .line 1127
    invoke-virtual {v4, v1, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 1128
    .line 1129
    .line 1130
    move-object/from16 v23, v2

    .line 1131
    .line 1132
    move-wide/from16 v21, v24

    .line 1133
    .line 1134
    move-object/from16 v0, v27

    .line 1135
    .line 1136
    move-wide/from16 v1, v28

    .line 1137
    .line 1138
    :cond_14
    const/4 v11, -0x1

    .line 1139
    goto/16 :goto_f

    .line 1140
    .line 1141
    :cond_15
    move-object/from16 v2, v23

    .line 1142
    .line 1143
    invoke-virtual {v13}, Ljava/io/OutputStream;->flush()V

    .line 1144
    .line 1145
    .line 1146
    sget-object v0, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 1147
    .line 1148
    sget-object v11, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 1149
    .line 1150
    new-instance v0, Lyyds/ᛷᲁᛴᲇ;

    .line 1151
    .line 1152
    const/4 v5, 0x0

    .line 1153
    move-object v1, v2

    .line 1154
    move-object v2, v4

    .line 1155
    move-object v4, v6

    .line 1156
    const/4 v6, 0x6

    .line 1157
    invoke-direct/range {v0 .. v6}, Lyyds/ᛷᲁᛴᲇ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 1158
    .line 1159
    .line 1160
    iput-object v3, v9, Lyyds/ᛸᛲᛳᲀ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 1161
    .line 1162
    iput-object v7, v9, Lyyds/ᛸᛲᛳᲀ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 1163
    .line 1164
    iput-object v14, v9, Lyyds/ᛸᛲᛳᲀ;->ᛱᲈᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 1165
    .line 1166
    iput-object v12, v9, Lyyds/ᛸᛲᛳᲀ;->ᛲᛳᛶᲁ:Ljava/io/InputStream;

    .line 1167
    .line 1168
    iput-object v13, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᲈᲈᲁ:Ljava/io/OutputStream;

    .line 1169
    .line 1170
    iput-boolean v15, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᛲᲈᛱ:Z

    .line 1171
    .line 1172
    const/4 v1, 0x4

    .line 1173
    iput v1, v9, Lyyds/ᛸᛲᛳᲀ;->ᛱᛳᲇ:I

    .line 1174
    .line 1175
    invoke-static {v11, v0, v9}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v0
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_f
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    .line 1179
    if-ne v0, v10, :cond_16

    .line 1180
    .line 1181
    goto/16 :goto_1c

    .line 1182
    .line 1183
    :cond_16
    move-object v2, v13

    .line 1184
    move-object v4, v14

    .line 1185
    :goto_15
    if-eqz v2, :cond_17

    .line 1186
    .line 1187
    :try_start_16
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_10

    .line 1188
    .line 1189
    .line 1190
    goto :goto_16

    .line 1191
    :catch_10
    move-exception v0

    .line 1192
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1193
    .line 1194
    const-wide v5, -0x298e4e68a836eL

    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v2

    .line 1203
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1204
    .line 1205
    .line 1206
    :cond_17
    :goto_16
    if-eqz v12, :cond_18

    .line 1207
    .line 1208
    :try_start_17
    invoke-virtual {v12}, Ljava/io/InputStream;->close()V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_11

    .line 1209
    .line 1210
    .line 1211
    goto :goto_17

    .line 1212
    :catch_11
    move-exception v0

    .line 1213
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1214
    .line 1215
    const-wide v5, -0x298ece68a836eL

    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v2

    .line 1224
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1225
    .line 1226
    .line 1227
    :cond_18
    :goto_17
    :try_start_18
    iget-object v0, v4, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 1228
    .line 1229
    check-cast v0, Lyyds/ᛴᛴᛷᲁ;

    .line 1230
    .line 1231
    if-eqz v0, :cond_19

    .line 1232
    .line 1233
    invoke-virtual {v0}, Lyyds/ᛴᛴᛷᲁ;->close()V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_12

    .line 1234
    .line 1235
    .line 1236
    goto :goto_18

    .line 1237
    :catch_12
    move-exception v0

    .line 1238
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1239
    .line 1240
    const-wide v4, -0x298f4e68a836eL

    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v2

    .line 1249
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1250
    .line 1251
    .line 1252
    :cond_19
    :goto_18
    :try_start_19
    sget-object v0, Lyyds/ᛵᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;

    .line 1253
    .line 1254
    if-eqz v0, :cond_20

    .line 1255
    .line 1256
    invoke-virtual {v3, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1257
    .line 1258
    .line 1259
    sput-object v18, Lyyds/ᛵᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_13

    .line 1260
    .line 1261
    goto/16 :goto_22

    .line 1262
    .line 1263
    :catch_13
    move-exception v0

    .line 1264
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1265
    .line 1266
    const-wide v2, -0x298fbe68a836eL

    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    goto/16 :goto_a

    .line 1272
    .line 1273
    :catchall_7
    move-exception v0

    .line 1274
    move-object/from16 v18, v13

    .line 1275
    .line 1276
    :goto_19
    move-object v1, v0

    .line 1277
    move-object/from16 v2, v18

    .line 1278
    .line 1279
    move-object v13, v2

    .line 1280
    goto/16 :goto_23

    .line 1281
    .line 1282
    :catch_14
    move-exception v0

    .line 1283
    move-object/from16 v18, v13

    .line 1284
    .line 1285
    :goto_1a
    move-object/from16 v1, v18

    .line 1286
    .line 1287
    move-object v2, v1

    .line 1288
    goto :goto_1b

    .line 1289
    :cond_1a
    move-object/from16 v18, v13

    .line 1290
    .line 1291
    :try_start_1a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1292
    .line 1293
    const-wide v1, -0x29739e68a836eL

    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v1

    .line 1302
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1303
    .line 1304
    .line 1305
    throw v0
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_15
    .catchall {:try_start_1a .. :try_end_1a} :catchall_8

    .line 1306
    :catchall_8
    move-exception v0

    .line 1307
    goto :goto_19

    .line 1308
    :catch_15
    move-exception v0

    .line 1309
    goto :goto_1a

    .line 1310
    :goto_1b
    :try_start_1b
    sget-boolean v4, Lyyds/ᛵᲇᛵᛱ;->ᛵᛸᛸᛷ:Z

    .line 1311
    .line 1312
    if-nez v4, :cond_1c

    .line 1313
    .line 1314
    sget-object v4, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1315
    .line 1316
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1317
    .line 1318
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1319
    .line 1320
    .line 1321
    const-wide v11, -0x2990ae68a836eL

    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    invoke-static {v11, v12}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v6

    .line 1330
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v5

    .line 1340
    invoke-virtual {v4, v5, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1341
    .line 1342
    .line 1343
    sget-object v4, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 1344
    .line 1345
    sget-object v4, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 1346
    .line 1347
    new-instance v5, Lyyds/ᲇᲈᲈᛶ;

    .line 1348
    .line 1349
    const/16 v6, 0x8

    .line 1350
    .line 1351
    move-object/from16 v7, v18

    .line 1352
    .line 1353
    invoke-direct {v5, v3, v0, v7, v6}, Lyyds/ᲇᲈᲈᛶ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 1354
    .line 1355
    .line 1356
    iput-object v3, v9, Lyyds/ᛸᛲᛳᲀ;->ᲇᲇᲇᛱ:Landroid/content/Context;

    .line 1357
    .line 1358
    iput-object v7, v9, Lyyds/ᛸᛲᛳᲀ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 1359
    .line 1360
    iput-object v14, v9, Lyyds/ᛸᛲᛳᲀ;->ᛱᲈᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 1361
    .line 1362
    iput-object v2, v9, Lyyds/ᛸᛲᛳᲀ;->ᛲᛳᛶᲁ:Ljava/io/InputStream;

    .line 1363
    .line 1364
    iput-object v1, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᲈᲈᲁ:Ljava/io/OutputStream;

    .line 1365
    .line 1366
    iput-boolean v15, v9, Lyyds/ᛸᛲᛳᲀ;->ᛷᛲᲈᛱ:Z

    .line 1367
    .line 1368
    const/4 v6, 0x5

    .line 1369
    iput v6, v9, Lyyds/ᛸᛲᛳᲀ;->ᛱᛳᲇ:I

    .line 1370
    .line 1371
    invoke-static {v4, v5, v9}, Lyyds/ᲀᲀᛸᛱ;->ᛶᛳᛶᛵ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)Ljava/lang/Object;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_9

    .line 1375
    if-ne v0, v10, :cond_1b

    .line 1376
    .line 1377
    :goto_1c
    return-object v10

    .line 1378
    :cond_1b
    move-object v4, v3

    .line 1379
    move-object v3, v14

    .line 1380
    :goto_1d
    move-object v14, v3

    .line 1381
    move-object v3, v4

    .line 1382
    goto :goto_1e

    .line 1383
    :catchall_9
    move-exception v0

    .line 1384
    move-object v13, v1

    .line 1385
    goto/16 :goto_2

    .line 1386
    .line 1387
    :cond_1c
    :goto_1e
    if-eqz v1, :cond_1d

    .line 1388
    .line 1389
    :try_start_1c
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_16

    .line 1390
    .line 1391
    .line 1392
    goto :goto_1f

    .line 1393
    :catch_16
    move-exception v0

    .line 1394
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1395
    .line 1396
    const-wide v4, -0x29911e68a836eL

    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v4

    .line 1405
    invoke-virtual {v1, v4, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1406
    .line 1407
    .line 1408
    :cond_1d
    :goto_1f
    if-eqz v2, :cond_1e

    .line 1409
    .line 1410
    :try_start_1d
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_17

    .line 1411
    .line 1412
    .line 1413
    goto :goto_20

    .line 1414
    :catch_17
    move-exception v0

    .line 1415
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1416
    .line 1417
    const-wide v4, -0x29919e68a836eL

    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v2

    .line 1426
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1427
    .line 1428
    .line 1429
    :cond_1e
    :goto_20
    :try_start_1e
    iget-object v0, v14, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 1430
    .line 1431
    check-cast v0, Lyyds/ᛴᛴᛷᲁ;

    .line 1432
    .line 1433
    if-eqz v0, :cond_1f

    .line 1434
    .line 1435
    invoke-virtual {v0}, Lyyds/ᛴᛴᛷᲁ;->close()V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_18

    .line 1436
    .line 1437
    .line 1438
    goto :goto_21

    .line 1439
    :catch_18
    move-exception v0

    .line 1440
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1441
    .line 1442
    const-wide v4, -0x29921e68a836eL

    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v2

    .line 1451
    invoke-virtual {v1, v2, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1452
    .line 1453
    .line 1454
    :cond_1f
    :goto_21
    :try_start_1f
    sget-object v0, Lyyds/ᛵᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;

    .line 1455
    .line 1456
    if-eqz v0, :cond_20

    .line 1457
    .line 1458
    invoke-virtual {v3, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1459
    .line 1460
    .line 1461
    const/16 v18, 0x0

    .line 1462
    .line 1463
    sput-object v18, Lyyds/ᛵᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_19

    .line 1464
    .line 1465
    goto :goto_22

    .line 1466
    :catch_19
    move-exception v0

    .line 1467
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1468
    .line 1469
    const-wide v2, -0x29928e68a836eL

    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    goto/16 :goto_a

    .line 1475
    .line 1476
    :cond_20
    :goto_22
    return-object v8

    .line 1477
    :goto_23
    if-eqz v13, :cond_21

    .line 1478
    .line 1479
    :try_start_20
    invoke-virtual {v13}, Ljava/io/OutputStream;->close()V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_1a

    .line 1480
    .line 1481
    .line 1482
    goto :goto_24

    .line 1483
    :catch_1a
    move-exception v0

    .line 1484
    sget-object v4, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1485
    .line 1486
    const-wide v5, -0x29937e68a836eL

    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v5

    .line 1495
    invoke-virtual {v4, v5, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1496
    .line 1497
    .line 1498
    :cond_21
    :goto_24
    if-eqz v2, :cond_22

    .line 1499
    .line 1500
    :try_start_21
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_1b

    .line 1501
    .line 1502
    .line 1503
    goto :goto_25

    .line 1504
    :catch_1b
    move-exception v0

    .line 1505
    sget-object v2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1506
    .line 1507
    const-wide v4, -0x2993fe68a836eL

    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v4

    .line 1516
    invoke-virtual {v2, v4, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1517
    .line 1518
    .line 1519
    :cond_22
    :goto_25
    :try_start_22
    iget-object v0, v14, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 1520
    .line 1521
    check-cast v0, Lyyds/ᛴᛴᛷᲁ;

    .line 1522
    .line 1523
    if-eqz v0, :cond_23

    .line 1524
    .line 1525
    invoke-virtual {v0}, Lyyds/ᛴᛴᛷᲁ;->close()V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_1c

    .line 1526
    .line 1527
    .line 1528
    goto :goto_26

    .line 1529
    :catch_1c
    move-exception v0

    .line 1530
    sget-object v2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1531
    .line 1532
    const-wide v4, -0x29947e68a836eL

    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v4

    .line 1541
    invoke-virtual {v2, v4, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1542
    .line 1543
    .line 1544
    :cond_23
    :goto_26
    :try_start_23
    sget-object v0, Lyyds/ᛵᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;

    .line 1545
    .line 1546
    if-eqz v0, :cond_24

    .line 1547
    .line 1548
    invoke-virtual {v3, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1549
    .line 1550
    .line 1551
    const/16 v18, 0x0

    .line 1552
    .line 1553
    sput-object v18, Lyyds/ᛵᲇᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛴᲈᛵ;
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_1d

    .line 1554
    .line 1555
    goto :goto_27

    .line 1556
    :catch_1d
    move-exception v0

    .line 1557
    sget-object v2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 1558
    .line 1559
    const-wide v3, -0x2994ee68a836eL

    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v3

    .line 1568
    invoke-virtual {v2, v3, v0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1569
    .line 1570
    .line 1571
    :cond_24
    :goto_27
    throw v1
.end method
