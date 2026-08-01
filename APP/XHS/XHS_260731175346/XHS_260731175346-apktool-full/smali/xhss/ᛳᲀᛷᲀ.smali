.class public final Lxhss/ᛳᲀᛷᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static ᛱᛱᛲᲇ:I

.field public static final ᛳᲁᲇᛸ:Lxhss/ᛴᛷᛱ;

.field public static final ᛷᛵᛵᲈ:Lxhss/ᛳᲀᛷᲀ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0x86bc1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lxhss/ᛳᲀᛷᲀ;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lxhss/ᛳᲀᛷᲀ;->ᛷᛵᛵᲈ:Lxhss/ᛳᲀᛷᲀ;

    .line 15
    .line 16
    new-instance v0, Lxhss/ᛴᛶᛲᛶ;

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    invoke-direct {v0, v1}, Lxhss/ᛴᛶᛲᛶ;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lxhss/ᛴᛷᛱ;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lxhss/ᛳᲀᛷᲀ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛷᛱ;

    .line 28
    .line 29
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;)V
    .locals 8

    .line 1
    const-wide v0, -0x86321b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_4

    .line 10
    .line 11
    invoke-static {p1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    const-wide v0, -0x86411b858845L

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lxhss/ᛳᛴᛵ;->ᛶᲀᛵᲇ(Ljava/lang/String;)Lxhss/ᛳᛴᛵ;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-static {p1}, Lxhss/ᛳᲀᛷᲀ;->ᛷᛵᛵᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-wide v1, -0x86451b858845L

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-wide v1, -0x86511b858845L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-wide v0, -0xfd001b858845L

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    const-wide v2, -0xfce91b858845L

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1, p1, v2, v3}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛴᛶᛳ(JLjava/lang/String;J)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const/4 v1, 0x0

    .line 94
    :goto_0
    if-ge v1, v0, :cond_3

    .line 95
    .line 96
    add-int/lit16 v2, v1, 0x7d0

    .line 97
    .line 98
    if-le v2, v0, :cond_2

    .line 99
    .line 100
    move v2, v0

    .line 101
    :cond_2
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const-wide v3, -0xfcf11b858845L

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    sget-object v3, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {v1}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    move v1, v2

    .line 122
    goto :goto_0

    .line 123
    :cond_3
    :goto_1
    sget-object p1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᲈᛳᲀ()Lxhss/ᛲᛸᲁᲇ;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    new-instance v1, Lxhss/ᛳᛲᲈᛶ;

    .line 133
    .line 134
    const/4 v7, 0x0

    .line 135
    move-object v4, p0

    .line 136
    move-object v2, p2

    .line 137
    move-object v3, p3

    .line 138
    invoke-direct/range {v1 .. v7}, Lxhss/ᛳᛲᲈᛶ;-><init>(Ljava/lang/Object;Ljava/lang/Boolean;Landroid/content/Context;Ljava/lang/String;Lxhss/ᛳᛴᛵ;Lxhss/ᛱᛴᛶᛴ;)V

    .line 139
    .line 140
    .line 141
    invoke-static {p1, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛷᲈᲈ(Lxhss/ᛲᛸᲁᲇ;Lxhss/ᛵᲇᛱᛴ;)Lxhss/ᛱᲀᛷᛸ;

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_4
    :goto_2
    const-wide p0, -0x863a1b858845L

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, Lxhss/ᲀᲈᛵᛸ;->ᲀᛷᲁᲀ(Ljava/lang/CharSequence;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method public static synthetic ᛳᲁᲇᛸ(Lxhss/ᛳᲀᛷᲀ;Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    invoke-static {p1, p2, p0, v0}, Lxhss/ᛳᲀᛷᲀ;->ᛱᛱᛲᲇ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static ᛷᛵᛵᲈ(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 1
    const-wide v0, -0x853c1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-wide v1, -0x85411b858845L

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-wide v1, -0x85301b858845L

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    const-wide v1, -0x85371b858845L

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    new-instance v1, Lxhss/ᛴᲇᛴᛱ;

    .line 40
    .line 41
    invoke-direct {v1}, Lxhss/ᛴᲇᛴᛱ;-><init>()V

    .line 42
    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-virtual {v1, v2, p0}, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ(Lxhss/ᛷᛶᲁᛵ;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ()Lxhss/ᛷᛶᲁᛵ;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Lxhss/ᛷᛶᲁᛵ;->ᲇᛶᛴᲀ()Lxhss/ᛴᲇᛴᛱ;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iput-object v2, v1, Lxhss/ᛴᲇᛴᛱ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    move v4, v3

    .line 60
    :goto_0
    const/4 v5, 0x2

    .line 61
    if-ge v4, v5, :cond_8

    .line 62
    .line 63
    aget-object v6, v0, v4

    .line 64
    .line 65
    iget-object v7, p0, Lxhss/ᛷᛶᲁᛵ;->ᲇᛶᛴᲀ:Ljava/util/List;

    .line 66
    .line 67
    if-nez v7, :cond_1

    .line 68
    .line 69
    :cond_0
    move-object v5, v2

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    invoke-static {v3, v8}, Lxhss/ᛵᛵᛲᲈ;->ᛲᛴᲀᲈ(II)Lxhss/ᛱᛲᲇᲀ;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-static {v8, v5}, Lxhss/ᛵᛵᛲᲈ;->ᲈᛲᛵᲁ(Lxhss/ᛱᛲᲇᲀ;I)Lxhss/ᲁᛵᛶᲁ;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    iget v8, v5, Lxhss/ᲁᛵᛶᲁ;->ᛱᛱᛲᲇ:I

    .line 84
    .line 85
    iget v9, v5, Lxhss/ᲁᛵᛶᲁ;->ᛳᲁᲇᛸ:I

    .line 86
    .line 87
    iget v5, v5, Lxhss/ᲁᛵᛶᲁ;->ᲇᛴᲇᛵ:I

    .line 88
    .line 89
    if-lez v5, :cond_2

    .line 90
    .line 91
    if-le v8, v9, :cond_3

    .line 92
    .line 93
    :cond_2
    if-gez v5, :cond_0

    .line 94
    .line 95
    if-gt v9, v8, :cond_0

    .line 96
    .line 97
    :cond_3
    :goto_1
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    invoke-virtual {v6, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    if-eqz v10, :cond_4

    .line 106
    .line 107
    add-int/lit8 v8, v8, 0x1

    .line 108
    .line 109
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    check-cast v5, Ljava/lang/String;

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    if-eq v8, v9, :cond_0

    .line 117
    .line 118
    add-int/2addr v8, v5

    .line 119
    goto :goto_1

    .line 120
    :goto_2
    if-eqz v5, :cond_7

    .line 121
    .line 122
    invoke-static {v5}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-nez v7, :cond_5

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    move-object v5, v2

    .line 130
    :goto_3
    if-eqz v5, :cond_7

    .line 131
    .line 132
    iget-object v7, v1, Lxhss/ᛴᲇᛴᛱ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 133
    .line 134
    if-nez v7, :cond_6

    .line 135
    .line 136
    new-instance v7, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    iput-object v7, v1, Lxhss/ᛴᲇᛴᛱ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 142
    .line 143
    :cond_6
    const-string v8, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~"

    .line 144
    .line 145
    const/16 v9, 0x5b

    .line 146
    .line 147
    invoke-static {v6, v3, v3, v8, v9}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    iget-object v6, v1, Lxhss/ᛴᲇᛴᛱ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-static {v5, v3, v3, v8, v9}, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_8
    invoke-virtual {v1}, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ()Lxhss/ᛷᛶᲁᛵ;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    iget-object p0, p0, Lxhss/ᛷᛶᲁᛵ;->ᛸᛴᛶᛳ:Ljava/lang/String;

    .line 171
    .line 172
    return-object p0
.end method

.method public static ᲀᲇᛳᲁ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0, p2}, Lxhss/ᛳᲀᛷᲀ;->ᲇᛶᛴᲀ(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Lxhss/ᛷᛸᲈᛸ;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    iget-object p2, p1, Lxhss/ᛷᛸᲈᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    sget-object p2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 17
    .line 18
    iget-object p1, p1, Lxhss/ᛷᛸᲈᛸ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {p0, p1}, Lxhss/ᲇᲁᛱᛸ;->ᛲᛴᲀᲈ(Landroid/content/Context;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-wide p0, -0x86261b858845L

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᲁᛴᲁ(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    sget-object p0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 42
    .line 43
    new-instance p2, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-wide v0, -0x862b1b858845L

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, Lxhss/ᛷᛸᲈᛸ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Lxhss/ᲇᲁᛱᛸ;->ᲁᲁᛴᲁ(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public static ᲇᛶᛴᲀ(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Lxhss/ᛷᛸᲈᛸ;
    .locals 6

    .line 1
    const-wide v0, -0x85a71b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    new-instance v1, Lxhss/ᲇᛸᛶ;

    .line 11
    .line 12
    const/4 v2, 0x5

    .line 13
    invoke-direct {v1, v2}, Lxhss/ᲇᛸᛶ;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p0}, Lxhss/ᲇᛸᛶ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lxhss/ᛴᛴᛴᛵ;

    .line 20
    .line 21
    invoke-direct {p0, v1}, Lxhss/ᛴᛴᛴᛵ;-><init>(Lxhss/ᲇᛸᛶ;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, Lxhss/ᛳᲀᛷᲀ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛷᛱ;

    .line 25
    .line 26
    invoke-virtual {v1}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lxhss/ᛵᛸᛷᛲ;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v2, Lxhss/ᛸᲇᲇᛶ;

    .line 36
    .line 37
    invoke-direct {v2, v1, p0}, Lxhss/ᛸᲇᲇᛶ;-><init>(Lxhss/ᛵᛸᛷᛲ;Lxhss/ᛴᛴᛴᛵ;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lxhss/ᛸᲇᲇᛶ;->ᛳᲁᲇᛸ()Lxhss/ᲀᛶᛷᲁ;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iget-boolean v1, p0, Lxhss/ᲀᛶᛷᲁ;->ᛸᛶᛴᲈ:Z

    .line 45
    .line 46
    if-eqz v1, :cond_d

    .line 47
    .line 48
    const-wide v1, -0x85b81b858845L

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v2, p0, Lxhss/ᲀᛶᛷᲁ;->ᲀᲇᛳᲁ:Lxhss/ᲁᛸᛱᛵ;

    .line 58
    .line 59
    invoke-virtual {v2, v1}, Lxhss/ᲁᛸᛱᛵ;->ᛷᛵᛵᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-nez v1, :cond_0

    .line 64
    .line 65
    move-object v1, v0

    .line 66
    :cond_0
    if-nez v1, :cond_1

    .line 67
    .line 68
    const-wide v1, -0x85c51b858845L

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    goto :goto_0

    .line 78
    :catch_0
    move-exception p0

    .line 79
    goto/16 :goto_6

    .line 80
    .line 81
    :cond_1
    :goto_0
    const-wide v2, -0x85d01b858845L

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const/4 v3, 0x0

    .line 91
    invoke-static {v1, v2, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛱᲁᛳᛲ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_2

    .line 96
    .line 97
    const-wide v1, -0x85d41b858845L

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    goto/16 :goto_2

    .line 107
    .line 108
    :cond_2
    const-wide v4, -0x85d81b858845L

    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-static {v1, v2, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛱᲁᛳᛲ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-nez v2, :cond_8

    .line 122
    .line 123
    const-wide v4, -0x85dd1b858845L

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-static {v1, v2, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛱᲁᛳᛲ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_3

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    const-wide v4, -0x85e51b858845L

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-static {v1, v2, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛱᲁᛳᛲ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_4

    .line 153
    .line 154
    const-wide v1, -0x85e91b858845L

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    goto :goto_2

    .line 164
    :cond_4
    const-wide v4, -0x85ed1b858845L

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-static {v1, v2, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛱᲁᛳᛲ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_5

    .line 178
    .line 179
    const-wide v1, -0x85f21b858845L

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    goto :goto_2

    .line 189
    :cond_5
    const-wide v4, -0x85f71b858845L

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-static {v1, v2, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛱᲁᛳᛲ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_6

    .line 203
    .line 204
    const-wide v1, -0x85fc1b858845L

    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    goto :goto_2

    .line 214
    :cond_6
    const-wide v4, -0x86011b858845L

    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-static {v1, v2, v3}, Lxhss/ᛲᛱᛲᲀ;->ᛱᲁᛳᛲ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-eqz v1, :cond_7

    .line 228
    .line 229
    const-wide v1, -0x86061b858845L

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    goto :goto_2

    .line 239
    :cond_7
    const-wide v1, -0x860b1b858845L

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    goto :goto_2

    .line 249
    :cond_8
    :goto_1
    const-wide v1, -0x85e11b858845L

    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    :goto_2
    if-nez p1, :cond_a

    .line 259
    .line 260
    const/16 p1, 0x2e

    .line 261
    .line 262
    if-eqz p2, :cond_9

    .line 263
    .line 264
    new-instance v2, Ljava/io/File;

    .line 265
    .line 266
    new-instance v4, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    move-object p1, v2

    .line 288
    goto :goto_3

    .line 289
    :cond_9
    sget-object p2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 290
    .line 291
    new-instance v2, Ljava/lang/StringBuilder;

    .line 292
    .line 293
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 294
    .line 295
    .line 296
    const-wide v4, -0x860f1b858845L

    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 309
    .line 310
    .line 311
    move-result-wide v4

    .line 312
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    sget v4, Lxhss/ᛳᲀᛷᲀ;->ᛱᛱᛲᲇ:I

    .line 316
    .line 317
    add-int/lit8 v5, v4, 0x1

    .line 318
    .line 319
    sput v5, Lxhss/ᛳᲀᛷᲀ;->ᛱᛱᛲᲇ:I

    .line 320
    .line 321
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-static {p1}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛲᲀᛵ(Ljava/lang/String;)Ljava/io/File;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    :cond_a
    :goto_3
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 342
    .line 343
    .line 344
    move-result-object p2

    .line 345
    if-eqz p2, :cond_b

    .line 346
    .line 347
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    .line 348
    .line 349
    .line 350
    :cond_b
    iget-object p0, p0, Lxhss/ᲀᛶᛷᲁ;->ᛸᛴᛶᛳ:Lxhss/ᲇᛷᛱᛸ;

    .line 351
    .line 352
    invoke-virtual {p0}, Lxhss/ᲇᛷᛱᛸ;->ᲀᲇᛳᲁ()Lxhss/ᲀᛶᛷᛳ;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    invoke-interface {p0}, Lxhss/ᲀᛶᛷᛳ;->ᲈᛳᲀ()Ljava/io/InputStream;

    .line 357
    .line 358
    .line 359
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 360
    :try_start_1
    new-instance p2, Ljava/io/FileOutputStream;

    .line 361
    .line 362
    invoke-direct {p2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 363
    .line 364
    .line 365
    const/16 v1, 0x2000

    .line 366
    .line 367
    :try_start_2
    new-array v1, v1, [B

    .line 368
    .line 369
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    :goto_4
    if-ltz v2, :cond_c

    .line 374
    .line 375
    invoke-virtual {p2, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    .line 379
    .line 380
    .line 381
    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 382
    goto :goto_4

    .line 383
    :cond_c
    :try_start_3
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 384
    .line 385
    .line 386
    :try_start_4
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 387
    .line 388
    .line 389
    new-instance p0, Lxhss/ᛷᛸᲈᛸ;

    .line 390
    .line 391
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 392
    .line 393
    const-wide v1, -0x86141b858845L

    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    invoke-direct {p0, p2, p1, v1}, Lxhss/ᛷᛸᲈᛸ;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 407
    .line 408
    .line 409
    return-object p0

    .line 410
    :catchall_0
    move-exception p1

    .line 411
    goto :goto_5

    .line 412
    :catchall_1
    move-exception p1

    .line 413
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 414
    :catchall_2
    move-exception v1

    .line 415
    :try_start_6
    invoke-static {p2, p1}, Lxhss/ᛶᛵᛱ;->ᛳᲁᲇᛸ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 416
    .line 417
    .line 418
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 419
    :goto_5
    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 420
    :catchall_3
    move-exception p2

    .line 421
    :try_start_8
    invoke-static {p0, p1}, Lxhss/ᛶᛵᛱ;->ᛳᲁᲇᛸ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 422
    .line 423
    .line 424
    throw p2

    .line 425
    :cond_d
    new-instance p1, Ljava/lang/Exception;

    .line 426
    .line 427
    new-instance p2, Ljava/lang/StringBuilder;

    .line 428
    .line 429
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 430
    .line 431
    .line 432
    const-wide v1, -0x85ab1b858845L

    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    iget p0, p0, Lxhss/ᲀᛶᛷᲁ;->ᛷᛴᛷᛱ:I

    .line 445
    .line 446
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object p0

    .line 453
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    throw p1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 457
    :goto_6
    const-wide p1, -0x86151b858845L

    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    invoke-static {p1, p2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object p1

    .line 466
    const-wide v1, -0xfd181b858845L

    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    const-wide v1, -0xfd201b858845L

    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    sget-object p2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 483
    .line 484
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    invoke-static {p1, p0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᛲᛴᛴ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 488
    .line 489
    .line 490
    new-instance p1, Lxhss/ᛷᛸᲈᛸ;

    .line 491
    .line 492
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 493
    .line 494
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object p0

    .line 498
    invoke-direct {p1, p2, v0, p0}, Lxhss/ᛷᛸᲈᛸ;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    return-object p1
.end method


# virtual methods
.method public final ᛷᛴᛷᛱ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lxhss/ᲈᲈᛱᛶ;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Lxhss/ᲇᲁᛱᛸ;->ᛸᛲᲀᛵ(Ljava/lang/String;)Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p0, p1, p2, p3, p4}, Lxhss/ᛳᲀᛷᲀ;->ᲇᛴᲇᛵ(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Lxhss/ᛸᛴᛳᛷ;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object p1, Lxhss/ᛸᛴᛸᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛴᛸᲈ;

    .line 15
    .line 16
    if-ne p0, p1, :cond_0

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 20
    .line 21
    return-object p0
.end method

.method public final ᲇᛴᲇᛵ(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Lxhss/ᛸᛴᛳᛷ;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    instance-of v3, v2, Lxhss/ᲈᲀᛱᲈ;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lxhss/ᲈᲀᛱᲈ;

    .line 13
    .line 14
    iget v4, v3, Lxhss/ᲈᲀᛱᲈ;->ᲈᛳᲀ:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lxhss/ᲈᲀᛱᲈ;->ᲈᛳᲀ:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lxhss/ᲈᲀᛱᲈ;

    .line 27
    .line 28
    move-object/from16 v4, p0

    .line 29
    .line 30
    invoke-direct {v3, v4, v2}, Lxhss/ᲈᲀᛱᲈ;-><init>(Lxhss/ᛳᲀᛷᲀ;Lxhss/ᛸᛴᛳᛷ;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v2, v3, Lxhss/ᲈᲀᛱᲈ;->ᛸᛲᲀᛵ:Ljava/lang/Object;

    .line 34
    .line 35
    iget v4, v3, Lxhss/ᲈᲀᛱᲈ;->ᲈᛳᲀ:I

    .line 36
    .line 37
    sget-object v11, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 38
    .line 39
    const/4 v12, 0x3

    .line 40
    const/4 v13, 0x2

    .line 41
    const/4 v5, 0x1

    .line 42
    sget-object v14, Lxhss/ᛸᛴᛸᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛸᛴᛸᲈ;

    .line 43
    .line 44
    if-eqz v4, :cond_4

    .line 45
    .line 46
    if-eq v4, v5, :cond_3

    .line 47
    .line 48
    if-eq v4, v13, :cond_2

    .line 49
    .line 50
    if-ne v4, v12, :cond_1

    .line 51
    .line 52
    invoke-static {v2}, Lxhss/ᛶᲈᛴᛲ;->ᛳᛶᛷᲀ(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_e

    .line 56
    .line 57
    :cond_1
    const-wide v0, -0x85771b858845L

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    return-object v0

    .line 71
    :cond_2
    iget-object v1, v3, Lxhss/ᲈᲀᛱᲈ;->ᲇᛶᛴᲀ:Landroid/app/Dialog;

    .line 72
    .line 73
    iget-object v4, v3, Lxhss/ᲈᲀᛱᲈ;->ᛷᛴᛷᛱ:Landroid/content/Context;

    .line 74
    .line 75
    :try_start_0
    invoke-static {v2}, Lxhss/ᛶᲈᛴᛲ;->ᛳᛶᛷᲀ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    .line 78
    goto/16 :goto_e

    .line 79
    .line 80
    :catch_0
    move-exception v0

    .line 81
    move-object v8, v0

    .line 82
    move-object v6, v1

    .line 83
    move-object v7, v4

    .line 84
    :goto_1
    const/4 v9, 0x0

    .line 85
    goto/16 :goto_c

    .line 86
    .line 87
    :cond_3
    iget-wide v0, v3, Lxhss/ᲈᲀᛱᲈ;->ᛸᛴᛶᛳ:J

    .line 88
    .line 89
    iget-object v4, v3, Lxhss/ᲈᲀᛱᲈ;->ᲀᲇᛳᲁ:Ljava/io/File;

    .line 90
    .line 91
    iget-object v5, v3, Lxhss/ᲈᲀᛱᲈ;->ᲇᛶᛴᲀ:Landroid/app/Dialog;

    .line 92
    .line 93
    iget-object v6, v3, Lxhss/ᲈᲀᛱᲈ;->ᛷᛴᛷᛱ:Landroid/content/Context;

    .line 94
    .line 95
    :try_start_1
    invoke-static {v2}, Lxhss/ᛶᲈᛴᛲ;->ᛳᛶᛷᲀ(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 96
    .line 97
    .line 98
    :catch_1
    move-wide v7, v0

    .line 99
    move-object v0, v4

    .line 100
    move-object v1, v6

    .line 101
    const/4 v9, 0x0

    .line 102
    goto/16 :goto_7

    .line 103
    .line 104
    :cond_4
    invoke-static {v2}, Lxhss/ᛶᲈᛴᛲ;->ᛳᛶᛷᲀ(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    const-wide v6, -0x85431b858845L

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7

    .line 131
    const-wide v6, -0xfd001b858845L

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    :try_start_3
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    const-wide v6, -0xfce91b858845L

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    const/4 v6, 0x0

    .line 152
    if-nez v4, :cond_5

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    move v7, v6

    .line 160
    :goto_2
    if-ge v7, v4, :cond_7

    .line 161
    .line 162
    add-int/lit16 v8, v7, 0x7d0

    .line 163
    .line 164
    if-le v8, v4, :cond_6

    .line 165
    .line 166
    move v8, v4

    .line 167
    :cond_6
    invoke-virtual {v2, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    const-wide v15, -0xfcf11b858845L

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    invoke-static/range {v15 .. v16}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    sget-object v10, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 180
    .line 181
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-static {v7}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_9

    .line 185
    .line 186
    .line 187
    move v7, v8

    .line 188
    goto :goto_2

    .line 189
    :cond_7
    :goto_3
    :try_start_4
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-static/range {p1 .. p1}, Lxhss/ᲇᲁᛱᛸ;->ᛴᲈᛱᛴ(Landroid/content/Context;)V

    .line 195
    .line 196
    .line 197
    new-instance v2, Lxhss/ᲇᛸᛶ;

    .line 198
    .line 199
    const/4 v4, 0x5

    .line 200
    invoke-direct {v2, v4}, Lxhss/ᲇᛸᛶ;-><init>(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v1}, Lxhss/ᲇᛸᛶ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    new-instance v1, Lxhss/ᛴᛴᛴᛵ;

    .line 207
    .line 208
    invoke-direct {v1, v2}, Lxhss/ᛴᛴᛴᛵ;-><init>(Lxhss/ᲇᛸᛶ;)V

    .line 209
    .line 210
    .line 211
    sget-object v2, Lxhss/ᛳᲀᛷᲀ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛷᛱ;

    .line 212
    .line 213
    invoke-virtual {v2}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, Lxhss/ᛵᛸᛷᛲ;

    .line 218
    .line 219
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    new-instance v4, Lxhss/ᛸᲇᲇᛶ;

    .line 223
    .line 224
    invoke-direct {v4, v2, v1}, Lxhss/ᛸᲇᲇᛶ;-><init>(Lxhss/ᛵᛸᛷᛲ;Lxhss/ᛴᛴᛴᛵ;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4}, Lxhss/ᛸᲇᲇᛶ;->ᛳᲁᲇᛸ()Lxhss/ᲀᛶᛷᲁ;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    iget-boolean v2, v1, Lxhss/ᲀᛶᛷᲁ;->ᛸᛶᛴᲈ:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7

    .line 232
    .line 233
    if-nez v2, :cond_8

    .line 234
    .line 235
    :try_start_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    .line 239
    .line 240
    const-wide v4, -0x85531b858845L

    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    invoke-static {v4, v5}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    iget v1, v1, Lxhss/ᲀᛶᛷᲁ;->ᛷᛴᛷᛱ:I

    .line 253
    .line 254
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᲁᛴᲁ(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-static {}, Lxhss/ᛳᛴᛵ;->ᛱᛱᛴᲀ()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 265
    .line 266
    .line 267
    return-object v11

    .line 268
    :catch_2
    move-exception v0

    .line 269
    move-object/from16 v7, p1

    .line 270
    .line 271
    move-object v8, v0

    .line 272
    const/4 v6, 0x0

    .line 273
    goto/16 :goto_1

    .line 274
    .line 275
    :cond_8
    const-wide v7, -0x855a1b858845L

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    :try_start_6
    invoke-static {v7, v8}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-static {v2}, Lxhss/ᛳᛴᛵ;->ᲁᛲᲈᛵ(Ljava/lang/String;)Lxhss/ᛳᛴᛵ;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    iget-object v1, v1, Lxhss/ᲀᛶᛷᲁ;->ᛸᛴᛶᛳ:Lxhss/ᲇᛷᛱᛸ;

    .line 289
    .line 290
    invoke-virtual {v1}, Lxhss/ᲇᛷᛱᛸ;->ᛳᲁᲇᛸ()J

    .line 291
    .line 292
    .line 293
    move-result-wide v7

    .line 294
    invoke-virtual {v1}, Lxhss/ᲇᛷᛱᛸ;->ᲀᲇᛳᲁ()Lxhss/ᲀᛶᛷᛳ;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-interface {v1}, Lxhss/ᲀᛶᛷᛳ;->ᲈᛳᲀ()Ljava/io/InputStream;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 303
    .line 304
    .line 305
    move-result-object v4
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    .line 306
    if-eqz v4, :cond_9

    .line 307
    .line 308
    :try_start_7
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    .line 309
    .line 310
    .line 311
    :cond_9
    :try_start_8
    new-instance v4, Ljava/io/FileOutputStream;

    .line 312
    .line 313
    invoke-direct {v4, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    .line 314
    .line 315
    .line 316
    const/high16 v10, 0x10000

    .line 317
    .line 318
    :try_start_9
    new-array v10, v10, [B

    .line 319
    .line 320
    const/4 v15, 0x0

    .line 321
    :goto_4
    invoke-virtual {v1, v10}, Ljava/io/InputStream;->read([B)I

    .line 322
    .line 323
    .line 324
    move-result v12
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 325
    const/4 v13, -0x1

    .line 326
    if-eq v12, v13, :cond_a

    .line 327
    .line 328
    :try_start_a
    invoke-virtual {v4, v10, v6, v12}, Ljava/io/FileOutputStream;->write([BII)V

    .line 329
    .line 330
    .line 331
    int-to-float v12, v12

    .line 332
    add-float/2addr v15, v12

    .line 333
    long-to-float v12, v7

    .line 334
    div-float v12, v15, v12

    .line 335
    .line 336
    const-wide v16, -0x855e1b858845L

    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    invoke-static/range {v16 .. v17}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v13

    .line 345
    const/high16 v16, 0x42c80000    # 100.0f

    .line 346
    .line 347
    mul-float v6, v12, v16

    .line 348
    .line 349
    new-instance v9, Ljava/lang/Float;

    .line 350
    .line 351
    invoke-direct {v9, v6}, Ljava/lang/Float;-><init>(F)V

    .line 352
    .line 353
    .line 354
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    invoke-static {v13, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v6

    .line 366
    const-wide v18, -0x85631b858845L

    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    invoke-static/range {v18 .. v19}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    const/high16 v9, 0x41200000    # 10.0f

    .line 375
    .line 376
    mul-float/2addr v12, v9

    .line 377
    float-to-int v12, v12

    .line 378
    int-to-float v12, v12

    .line 379
    div-float/2addr v12, v9

    .line 380
    iput v12, v2, Lxhss/ᛳᛴᛵ;->ᲁᲁᛴᲁ:F

    .line 381
    .line 382
    invoke-virtual {v2}, Lxhss/ᛳᛴᛵ;->ᛴᛷᛵᛴ()V

    .line 383
    .line 384
    .line 385
    new-instance v9, Ljava/lang/StringBuilder;

    .line 386
    .line 387
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 388
    .line 389
    .line 390
    const-wide v12, -0x856f1b858845L

    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    invoke-static {v12, v13}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v12

    .line 399
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    const-wide v12, -0x85741b858845L

    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    invoke-static {v12, v13}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v6

    .line 414
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v6

    .line 421
    iput-object v6, v2, Lxhss/ᛳᛴᛵ;->ᛲᛴᲀᲈ:Ljava/lang/String;

    .line 422
    .line 423
    invoke-virtual {v2}, Lxhss/ᛳᛴᛵ;->ᛴᛷᛵᛴ()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 424
    .line 425
    .line 426
    const/4 v6, 0x0

    .line 427
    const/4 v13, 0x2

    .line 428
    goto :goto_4

    .line 429
    :goto_5
    move-object/from16 v1, p1

    .line 430
    .line 431
    move-object v2, v0

    .line 432
    const/4 v9, 0x0

    .line 433
    goto/16 :goto_b

    .line 434
    .line 435
    :catchall_0
    move-exception v0

    .line 436
    goto :goto_5

    .line 437
    :cond_a
    :try_start_b
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 438
    .line 439
    .line 440
    :try_start_c
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_7

    .line 441
    .line 442
    .line 443
    :try_start_d
    sget-object v2, Lxhss/ᛳᲈᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᲇ;

    .line 444
    .line 445
    sget-object v2, Lxhss/ᛳᛲᛳᛲ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛲᛳᛲ;

    .line 446
    .line 447
    new-instance v4, Lxhss/ᲈᲇᛶᲈ;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_5

    .line 448
    .line 449
    const/4 v9, 0x0

    .line 450
    :try_start_e
    invoke-direct {v4, v1, v9}, Lxhss/ᲈᲇᛶᲈ;-><init>(Ljava/io/InputStream;Lxhss/ᛱᛴᛶᛴ;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_4

    .line 451
    .line 452
    .line 453
    move-object/from16 v1, p1

    .line 454
    .line 455
    :try_start_f
    iput-object v1, v3, Lxhss/ᲈᲀᛱᲈ;->ᛷᛴᛷᛱ:Landroid/content/Context;

    .line 456
    .line 457
    iput-object v9, v3, Lxhss/ᲈᲀᛱᲈ;->ᲇᛶᛴᲀ:Landroid/app/Dialog;

    .line 458
    .line 459
    iput-object v0, v3, Lxhss/ᲈᲀᛱᲈ;->ᲀᲇᛳᲁ:Ljava/io/File;

    .line 460
    .line 461
    iput-wide v7, v3, Lxhss/ᲈᲀᛱᲈ;->ᛸᛴᛶᛳ:J

    .line 462
    .line 463
    iput v5, v3, Lxhss/ᲈᲀᛱᲈ;->ᲈᛳᲀ:I

    .line 464
    .line 465
    invoke-static {v2, v4, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛶᲇᲈᛸ(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛵᲇᛱᛴ;Lxhss/ᛸᛴᛳᛷ;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v2
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3

    .line 469
    if-ne v2, v14, :cond_b

    .line 470
    .line 471
    goto/16 :goto_d

    .line 472
    .line 473
    :catch_3
    :cond_b
    :goto_6
    move-object v5, v9

    .line 474
    :goto_7
    move-object v6, v5

    .line 475
    move-wide/from16 v20, v7

    .line 476
    .line 477
    move-object v8, v0

    .line 478
    move-object v7, v1

    .line 479
    move-wide/from16 v0, v20

    .line 480
    .line 481
    goto :goto_8

    .line 482
    :catch_4
    move-object/from16 v1, p1

    .line 483
    .line 484
    goto :goto_6

    .line 485
    :catch_5
    move-object/from16 v1, p1

    .line 486
    .line 487
    const/4 v9, 0x0

    .line 488
    goto :goto_6

    .line 489
    :goto_8
    :try_start_10
    sget-object v2, Lxhss/ᛳᲈᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᲇ;

    .line 490
    .line 491
    sget-object v2, Lxhss/ᛲᲇᲀ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛲ;

    .line 492
    .line 493
    new-instance v5, Lxhss/ᛳᲇᲁᛴ;

    .line 494
    .line 495
    const/4 v10, 0x1

    .line 496
    invoke-direct/range {v5 .. v10}, Lxhss/ᛳᲇᲁᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;I)V

    .line 497
    .line 498
    .line 499
    iput-object v7, v3, Lxhss/ᲈᲀᛱᲈ;->ᛷᛴᛷᛱ:Landroid/content/Context;

    .line 500
    .line 501
    iput-object v6, v3, Lxhss/ᲈᲀᛱᲈ;->ᲇᛶᛴᲀ:Landroid/app/Dialog;

    .line 502
    .line 503
    iput-object v9, v3, Lxhss/ᲈᲀᛱᲈ;->ᲀᲇᛳᲁ:Ljava/io/File;

    .line 504
    .line 505
    iput-wide v0, v3, Lxhss/ᲈᲀᛱᲈ;->ᛸᛴᛶᛳ:J

    .line 506
    .line 507
    const/4 v0, 0x2

    .line 508
    iput v0, v3, Lxhss/ᲈᲀᛱᲈ;->ᲈᛳᲀ:I

    .line 509
    .line 510
    invoke-static {v2, v5, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛶᲇᲈᛸ(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛵᲇᛱᛴ;Lxhss/ᛸᛴᛳᛷ;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6

    .line 514
    if-ne v0, v14, :cond_c

    .line 515
    .line 516
    goto :goto_d

    .line 517
    :catch_6
    move-exception v0

    .line 518
    move-object v8, v0

    .line 519
    goto :goto_c

    .line 520
    :catch_7
    move-exception v0

    .line 521
    :goto_9
    move-object/from16 v1, p1

    .line 522
    .line 523
    const/4 v9, 0x0

    .line 524
    :goto_a
    move-object v8, v0

    .line 525
    move-object v7, v1

    .line 526
    move-object v6, v9

    .line 527
    goto :goto_c

    .line 528
    :catchall_1
    move-exception v0

    .line 529
    move-object/from16 v1, p1

    .line 530
    .line 531
    const/4 v9, 0x0

    .line 532
    move-object v2, v0

    .line 533
    :goto_b
    :try_start_11
    throw v2
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 534
    :catchall_2
    move-exception v0

    .line 535
    :try_start_12
    invoke-static {v4, v2}, Lxhss/ᛶᛵᛱ;->ᛳᲁᲇᛸ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 536
    .line 537
    .line 538
    throw v0
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_8

    .line 539
    :catch_8
    move-exception v0

    .line 540
    goto :goto_a

    .line 541
    :catch_9
    move-exception v0

    .line 542
    goto :goto_9

    .line 543
    :goto_c
    sget-object v0, Lxhss/ᛳᲈᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛱᛶᲇ;

    .line 544
    .line 545
    sget-object v0, Lxhss/ᛲᲇᲀ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛲ;

    .line 546
    .line 547
    new-instance v5, Lxhss/ᛳᲇᲁᛴ;

    .line 548
    .line 549
    const/4 v10, 0x2

    .line 550
    invoke-direct/range {v5 .. v10}, Lxhss/ᛳᲇᲁᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;I)V

    .line 551
    .line 552
    .line 553
    iput-object v9, v3, Lxhss/ᲈᲀᛱᲈ;->ᛷᛴᛷᛱ:Landroid/content/Context;

    .line 554
    .line 555
    iput-object v9, v3, Lxhss/ᲈᲀᛱᲈ;->ᲇᛶᛴᲀ:Landroid/app/Dialog;

    .line 556
    .line 557
    iput-object v9, v3, Lxhss/ᲈᲀᛱᲈ;->ᲀᲇᛳᲁ:Ljava/io/File;

    .line 558
    .line 559
    const/4 v1, 0x3

    .line 560
    iput v1, v3, Lxhss/ᲈᲀᛱᲈ;->ᲈᛳᲀ:I

    .line 561
    .line 562
    invoke-static {v0, v5, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛶᲇᲈᛸ(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛵᲇᛱᛴ;Lxhss/ᛸᛴᛳᛷ;)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    if-ne v0, v14, :cond_c

    .line 567
    .line 568
    :goto_d
    return-object v14

    .line 569
    :cond_c
    :goto_e
    return-object v11
.end method
