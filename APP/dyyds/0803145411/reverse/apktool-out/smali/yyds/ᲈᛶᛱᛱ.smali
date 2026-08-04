.class public final Lyyds/ᲈᛶᛱᛱ;
.super Lyyds/ᛲᛵᲇᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/util/LinkedHashMap;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛷᛵᲇᲀ;

.field public final ᲀᛲᛳᲀ:Ljava/util/ArrayList;

.field public final ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>(Lyyds/ᛷᛵᲇᲀ;)V
    .locals 2

    .line 1
    const-wide v0, -0x6ee5e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lyyds/ᛲᛵᲇᛳ;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lyyds/ᲈᛶᛱᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛵᲇᲀ;

    .line 13
    .line 14
    new-instance p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lyyds/ᲈᛶᛱᛱ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 20
    .line 21
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lyyds/ᲈᛶᛱᛱ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 27
    .line 28
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lyyds/ᲈᛶᛱᛱ;->ᛲᛴᛳᛲ:Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    return-void
.end method

.method public static ᛷᲈᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ss/android/ugc/aweme/feed/model/Aweme;->aid:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "@"

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final ᛱᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Lyyds/ᲈᛶᛱᛱ;->ᛷᲈᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lyyds/ᲈᛶᛱᛱ;->ᛲᛴᛳᛲ:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    sget-object v1, Lyyds/ᲈᛲᲀ;->ᛲᲈᲁ:Ljava/util/Map;

    .line 14
    .line 15
    invoke-static {p1}, Lyyds/ᲈᛲᲀ;->ᛱᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v1, 0x1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-static {p1}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    move p1, v1

    .line 32
    :goto_1
    xor-int/2addr p1, v1

    .line 33
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_2
    check-cast v1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0
.end method

.method public final ᛲᛳᛶᲁ()V
    .locals 11

    .line 1
    new-instance v0, Lyyds/ᛳᛳᲀᲀ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lyyds/ᲈᛶᛱᛱ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, Lyyds/ᛳᛳᲀᲀ;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance v3, Lyyds/ᲈᛳᲀᲈ;

    .line 10
    .line 11
    const-wide v1, -0x8930e68a836eL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    const-wide v1, -0x893ce68a836eL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    const/4 v9, 0x0

    .line 30
    const/16 v10, 0xd

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    const-class v6, Lyyds/ᲈᛶᛱᛱ;

    .line 34
    .line 35
    move-object v5, p0

    .line 36
    invoke-direct/range {v3 .. v10}, Lyyds/ᲈᛳᲀᲈ;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v3}, Lyyds/ᛷᛴᛳᛶ;->ᲀᛲᛲᲇ(Lyyds/ᛵᲈᛴᛷ;Lyyds/ᛷᛴᲈᲀ;)Lyyds/ᛲᲈᲁᛱ;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    new-instance v0, Ljava/util/HashSet;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v1, Lyyds/ᛵᛶᛷᛸ;

    .line 49
    .line 50
    invoke-direct {v1, p0}, Lyyds/ᛵᛶᛷᛸ;-><init>(Lyyds/ᛲᲈᲁᛱ;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-virtual {v1}, Lyyds/ᛵᛶᛷᛸ;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_0

    .line 58
    .line 59
    invoke-virtual {v1}, Lyyds/ᛵᛶᛷᛸ;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 64
    .line 65
    invoke-static {p0}, Lyyds/ᲈᛶᛱᛱ;->ᛷᲈᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    iget-object p0, v5, Lyyds/ᲈᛶᛱᛱ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v1, v5, Lyyds/ᲈᛶᛱᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛵᲇᲀ;

    .line 95
    .line 96
    invoke-virtual {v1, p0, v0}, Lyyds/ᛷᛵᲇᲀ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final ᛲᛴᛳᛲ(Lyyds/ᛱᛸᛳᛵ;I)V
    .locals 12

    .line 1
    check-cast p1, Lyyds/ᛷᛴᛲᛷ;

    .line 2
    .line 3
    const-wide v0, -0x6f15e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᲈᛶᛱᛱ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lcom/ss/android/ugc/aweme/feed/model/Aweme;

    .line 18
    .line 19
    iget-object v0, p1, Lyyds/ᛷᛴᛲᛷ;->ᛳᛸᛴᛶ:Lyyds/ᛴᛸᛶᛱ;

    .line 20
    .line 21
    const-wide v1, -0xc267e68a836eL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    iget-object v1, p1, Lyyds/ᛷᛴᛲᛷ;->ᛶᲈᛴᲈ:Lyyds/ᲈᛶᛱᛱ;

    .line 30
    .line 31
    invoke-static {p0}, Lyyds/ᲈᛶᛱᛱ;->ᛷᲈᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, p0}, Lyyds/ᲈᛶᛱᛱ;->ᛱᲈᲁ(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x1

    .line 40
    const/4 v5, 0x0

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    iget-object v6, v1, Lyyds/ᲈᛶᛱᛱ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 44
    .line 45
    invoke-virtual {v6, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    move v2, v4

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move v2, v5

    .line 54
    :goto_0
    iget-object v6, p0, Lcom/ss/android/ugc/aweme/feed/model/Aweme;->video:Lcom/ss/android/ugc/aweme/feed/model/Video;

    .line 55
    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    iget-object v6, v6, Lcom/ss/android/ugc/aweme/feed/model/Video;->cover:Lcom/ss/android/ugc/aweme/base/model/UrlModel;

    .line 59
    .line 60
    if-eqz v6, :cond_1

    .line 61
    .line 62
    iget-object v6, v6, Lcom/ss/android/ugc/aweme/base/model/UrlModel;->urlList:Ljava/util/List;

    .line 63
    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    invoke-static {v6}, Lyyds/ᛷᛷᛶᲇ;->ᲀᛲᛱᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, Ljava/lang/String;

    .line 71
    .line 72
    if-nez v6, :cond_3

    .line 73
    .line 74
    :cond_1
    iget-object v6, p0, Lcom/ss/android/ugc/aweme/feed/model/Aweme;->images:Ljava/util/List;

    .line 75
    .line 76
    if-eqz v6, :cond_2

    .line 77
    .line 78
    invoke-static {v6}, Lyyds/ᛷᛷᛶᲇ;->ᲀᛲᛱᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    check-cast v6, Lcom/ss/ugc/aweme/ImageUrlStruct;

    .line 83
    .line 84
    if-eqz v6, :cond_2

    .line 85
    .line 86
    iget-object v6, v6, Lcom/ss/ugc/aweme/ImageUrlStruct;->urlList:Ljava/util/List;

    .line 87
    .line 88
    if-eqz v6, :cond_2

    .line 89
    .line 90
    invoke-static {v6}, Lyyds/ᛷᛷᛶᲇ;->ᲀᛲᛱᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    check-cast v6, Ljava/lang/String;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    const/4 v6, 0x0

    .line 98
    :cond_3
    :goto_1
    iget-object v7, v0, Lyyds/ᛴᛸᛶᛱ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v7, Landroid/widget/TextView;

    .line 101
    .line 102
    iget-object v8, v0, Lyyds/ᛴᛸᛶᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v8, Landroid/widget/ImageView;

    .line 105
    .line 106
    iget-object v9, v0, Lyyds/ᛴᛸᛶᛱ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v9, Lcom/android/app/CustomCardView;

    .line 109
    .line 110
    add-int/2addr p2, v4

    .line 111
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    if-eqz v3, :cond_4

    .line 119
    .line 120
    const/high16 v4, 0x3f800000    # 1.0f

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    const v4, 0x3f147ae1    # 0.58f

    .line 124
    .line 125
    .line 126
    :goto_2
    invoke-virtual {v9, v4}, Landroid/view/View;->setAlpha(F)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v9, v3}, Landroid/view/View;->setClickable(Z)V

    .line 130
    .line 131
    .line 132
    if-nez v3, :cond_5

    .line 133
    .line 134
    new-instance v4, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-wide v10, -0xc26de68a836eL

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    const-wide v10, -0xc270e68a836eL

    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    goto :goto_3

    .line 168
    :cond_5
    if-eqz v2, :cond_6

    .line 169
    .line 170
    new-instance v4, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    const-wide v10, -0xc27ae68a836eL

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-wide v10, -0xc27de68a836eL

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    goto :goto_3

    .line 204
    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-wide v10, -0xc28ae68a836eL

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-wide v10, -0xc28de68a836eL

    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    :goto_3
    invoke-virtual {v9, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 238
    .line 239
    .line 240
    iget-object p2, v0, Lyyds/ᛴᛸᛶᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast p2, Landroid/view/View;

    .line 243
    .line 244
    const/16 v4, 0x8

    .line 245
    .line 246
    if-eqz v2, :cond_7

    .line 247
    .line 248
    move v7, v5

    .line 249
    goto :goto_4

    .line 250
    :cond_7
    move v7, v4

    .line 251
    :goto_4
    invoke-virtual {p2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 252
    .line 253
    .line 254
    iget-object p2, v0, Lyyds/ᛴᛸᛶᛱ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast p2, Landroid/widget/TextView;

    .line 257
    .line 258
    if-eqz v2, :cond_8

    .line 259
    .line 260
    move v2, v5

    .line 261
    goto :goto_5

    .line 262
    :cond_8
    move v2, v4

    .line 263
    :goto_5
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 264
    .line 265
    .line 266
    iget-object p2, v0, Lyyds/ᛴᛸᛶᛱ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast p2, Landroid/widget/TextView;

    .line 269
    .line 270
    if-eqz v3, :cond_9

    .line 271
    .line 272
    move v2, v4

    .line 273
    goto :goto_6

    .line 274
    :cond_9
    move v2, v5

    .line 275
    :goto_6
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 276
    .line 277
    .line 278
    iget-object p2, v0, Lyyds/ᛴᛸᛶᛱ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast p2, Landroid/widget/TextView;

    .line 281
    .line 282
    iget-object p0, p0, Lcom/ss/android/ugc/aweme/feed/model/Aweme;->images:Ljava/util/List;

    .line 283
    .line 284
    if-eqz p0, :cond_a

    .line 285
    .line 286
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 287
    .line 288
    .line 289
    move-result p0

    .line 290
    if-eqz p0, :cond_b

    .line 291
    .line 292
    :cond_a
    move v5, v4

    .line 293
    :cond_b
    invoke-virtual {p2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 294
    .line 295
    .line 296
    new-instance p0, Lyyds/ᲀᛶᛷᛱ;

    .line 297
    .line 298
    invoke-direct {p0, v3, p1, v1}, Lyyds/ᲀᛶᛷᛱ;-><init>(ZLyyds/ᛷᛴᛲᛷ;Lyyds/ᲈᛶᛱᛱ;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v9, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    invoke-static {p0}, Lcom/bumptech/glide/ᛲᲈᲁ;->ᲇᲈᛵᛷ(Landroid/content/Context;)Lyyds/ᲁᛷᛲ;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    invoke-virtual {p0, v6}, Lyyds/ᲁᛷᛲ;->ᛱᛳᲇ(Ljava/lang/String;)Lyyds/ᛲᲇᛸᛲ;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    sget-object p1, Lyyds/ᲁᲁᲇᛷ;->ᛵᛸᛸᛷ:Lyyds/ᲁᲁᲇᛷ;

    .line 317
    .line 318
    invoke-virtual {p0, p1}, Lyyds/ᛴᛲᛲᛷ;->ᛲᛴᛳᛲ(Lyyds/ᲁᲁᲇᛷ;)Lyyds/ᛴᛲᛲᛷ;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    check-cast p0, Lyyds/ᛲᲇᛸᛲ;

    .line 323
    .line 324
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    sget-object p1, Lyyds/ᛶᛱᛸᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛶᛱᛸᛳ;

    .line 328
    .line 329
    new-instance p2, Lyyds/ᛳᲀᛳᛳ;

    .line 330
    .line 331
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᛲᛲᛷ;->ᛵᛶᛲᲀ(Lyyds/ᛶᛱᛸᛳ;Lyyds/ᲀᲈᛷ;)Lyyds/ᛴᛲᛲᛷ;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    check-cast p0, Lyyds/ᛲᲇᛸᛲ;

    .line 339
    .line 340
    invoke-virtual {p0, v8}, Lyyds/ᛲᲇᛸᛲ;->ᛵᲀᛵᛸ(Landroid/widget/ImageView;)V

    .line 341
    .line 342
    .line 343
    return-void
.end method

.method public final ᛲᲈᲁ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛶᛱᛱ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᛷᛲᲈᛱ(ILjava/util/ArrayList;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    if-gtz p1, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {p2}, Lyyds/ᛷᛷᛶᲇ;->ᛸᛸᛷᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-static {v2, p2}, Lyyds/ᛷᛷᛶᲇ;->ᛲᛳᛴᛸ(ILjava/util/List;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    move v3, v1

    .line 35
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    add-int/lit8 v5, v3, 0x1

    .line 52
    .line 53
    if-ne v4, v5, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    new-instance v5, Lyyds/ᲈᲈᲀᲈ;

    .line 57
    .line 58
    invoke-direct {v5, v1, v3, v2}, Lyyds/ᲇᲁᲁᲁ;-><init>(III)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move v1, v4

    .line 65
    :goto_1
    move v3, v4

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    new-instance p2, Lyyds/ᲈᲈᲀᲈ;

    .line 68
    .line 69
    invoke-direct {p2, v1, v3, v2}, Lyyds/ᲇᲁᲁᲁ;-><init>(III)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    const/16 v1, 0xc

    .line 80
    .line 81
    iget-object p0, p0, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ:Lyyds/ᛴᛲᲇᛵ;

    .line 82
    .line 83
    if-le p2, v1, :cond_3

    .line 84
    .line 85
    const/4 p2, 0x0

    .line 86
    invoke-virtual {p0, p2, p1}, Lyyds/ᛴᛲᲇᛵ;->ᲀᛲᛳᲀ(II)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-eqz p2, :cond_4

    .line 99
    .line 100
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    check-cast p2, Lyyds/ᲈᲈᲀᲈ;

    .line 105
    .line 106
    iget v0, p2, Lyyds/ᲇᲁᲁᲁ;->ᲀᛲᛳᲀ:I

    .line 107
    .line 108
    iget p2, p2, Lyyds/ᲇᲁᲁᲁ;->ᲇᲈᛵᛷ:I

    .line 109
    .line 110
    sub-int/2addr p2, v0

    .line 111
    add-int/2addr p2, v2

    .line 112
    invoke-virtual {p0, v0, p2}, Lyyds/ᛴᛲᲇᛵ;->ᲀᛲᛳᲀ(II)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    :goto_3
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Landroid/view/ViewGroup;I)Lyyds/ᛱᛸᛳᛵ;
    .locals 9

    .line 1
    const-wide v0, -0x6f01e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p2}, Lyyds/ᛵᛶᛵᲈ;->ᛲᲈᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const v0, 0x660c007f

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const p2, 0x6609029e

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p2}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    move-object v3, v0

    .line 33
    check-cast v3, Landroid/widget/ImageView;

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    const p2, 0x660903f3

    .line 38
    .line 39
    .line 40
    invoke-static {p1, p2}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    const p2, 0x66090529

    .line 47
    .line 48
    .line 49
    invoke-static {p1, p2}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v5, v0

    .line 54
    check-cast v5, Landroid/widget/TextView;

    .line 55
    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    const p2, 0x6609054d

    .line 59
    .line 60
    .line 61
    invoke-static {p1, p2}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    move-object v6, v0

    .line 66
    check-cast v6, Landroid/widget/TextView;

    .line 67
    .line 68
    if-eqz v6, :cond_0

    .line 69
    .line 70
    const p2, 0x66090557

    .line 71
    .line 72
    .line 73
    invoke-static {p1, p2}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    move-object v7, v0

    .line 78
    check-cast v7, Landroid/widget/TextView;

    .line 79
    .line 80
    if-eqz v7, :cond_0

    .line 81
    .line 82
    const p2, 0x66090559

    .line 83
    .line 84
    .line 85
    invoke-static {p1, p2}, Lyyds/ᛸᛳᛷᛳ;->ᲇᲇᲇᛱ(Landroid/view/View;I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    move-object v8, v0

    .line 90
    check-cast v8, Landroid/widget/TextView;

    .line 91
    .line 92
    if-eqz v8, :cond_0

    .line 93
    .line 94
    new-instance v1, Lyyds/ᛴᛸᛶᛱ;

    .line 95
    .line 96
    move-object v2, p1

    .line 97
    check-cast v2, Lcom/android/app/CustomCardView;

    .line 98
    .line 99
    invoke-direct/range {v1 .. v8}, Lyyds/ᛴᛸᛶᛱ;-><init>(Lcom/android/app/CustomCardView;Landroid/widget/ImageView;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 100
    .line 101
    .line 102
    const-wide p1, -0x6f08e68a836eL

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    new-instance p1, Lyyds/ᛷᛴᛲᛷ;

    .line 111
    .line 112
    invoke-direct {p1, p0, v1}, Lyyds/ᛷᛴᛲᛷ;-><init>(Lyyds/ᲈᛶᛱᛱ;Lyyds/ᛴᛸᛶᛱ;)V

    .line 113
    .line 114
    .line 115
    return-object p1

    .line 116
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    const-wide p1, -0x62edfe68a836eL

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛱᛳᲇ(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    const/4 p0, 0x0

    .line 141
    return-object p0
.end method
