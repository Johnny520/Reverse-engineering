.class public final Lyyds/ᲈᲁᛳᛳ;
.super Lyyds/ᛱᛶᛶᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲇᲇᲇᛱ:Lyyds/ᲈᲁᛳᛳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᲈᲁᛳᛳ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛱᛶᛶᲇ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᲈᲁᛳᛳ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲁᛳᛳ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᲇᲇᲇᛱ()V
    .locals 8

    .line 1
    const-wide v0, -0x316d9e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-wide v0, -0x31707e68a836eL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x3

    .line 20
    const/4 v2, 0x0

    .line 21
    :try_start_0
    invoke-static {p0, v2, v1}, Lyyds/ᛶᛷᛱᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;Ljava/lang/ClassLoader;I)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    const-wide v1, -0x3170ce68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, Lyyds/ᛱᛶᛶᲇ;->ᛵᲀᛵᛸ(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget-object v1, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;

    .line 44
    .line 45
    invoke-static {v0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_0

    .line 50
    .line 51
    sget-object v1, Lyyds/ᛶᛵᛳᛵ;->ᛵᛸᛸᛷ:Ljava/util/LinkedHashSet;

    .line 52
    .line 53
    new-instance v2, Lkotlin/Pair;

    .line 54
    .line 55
    invoke-direct {v2, v0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catch_0
    move-exception v1

    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :cond_0
    return-void

    .line 66
    :cond_1
    sget v3, Lyyds/ᲁᛸᛵᲁ;->ᛲᲈᲁ:I

    .line 67
    .line 68
    invoke-static {v1}, Lyyds/ᛲᲇᲁᛳ;->ᛷᛲᲈᛱ(Ljava/lang/Class;)Lyyds/ᲀᛵᲁᛴ;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v3, v1, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, Lyyds/ᛴᛸᛲᛳ;

    .line 75
    .line 76
    const/4 v4, 0x2

    .line 77
    iput v4, v3, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 78
    .line 79
    sget-object v3, Lyyds/ᲈᲁᛳᛳ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲁᛳᛳ;

    .line 80
    .line 81
    invoke-virtual {v1}, Lyyds/ᲀᛵᲁᛴ;->ᛶᲈᛴᲈ()Lyyds/ᛵᲀᲀᛶ;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sget-object v5, Lyyds/ᲁᛸᲀᛱ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛸᲀᛱ;

    .line 86
    .line 87
    filled-new-array {v5}, [Lyyds/ᲁᛸᲀᛱ;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v1, v5}, Lyyds/ᛵᲀᲀᛶ;->ᛱᲈᲁ([Lyyds/ᲁᛸᲀᛱ;)V

    .line 92
    .line 93
    .line 94
    const-wide v5, -0x3171ee68a836eL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    iput-object v5, v1, Lyyds/ᲇᛴᲇᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 104
    .line 105
    const-wide v5, -0x31728e68a836eL

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    const/4 v6, 0x1

    .line 119
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-virtual {v1, v5}, Lyyds/ᲁᛳᛶᛶ;->ᲇᲇᲇᛱ([Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    const-wide v5, -0x3175ce68a836eL

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    iput-object v5, v1, Lyyds/ᛵᲀᲀᛶ;->ᛱᛳᛶᛳ:Ljava/lang/Object;

    .line 136
    .line 137
    invoke-virtual {v1}, Lyyds/ᛵᲀᲀᛶ;->ᛲᲈᲁ()Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v1}, Lyyds/ᛷᛷᛶᲇ;->ᛸᛸᛷᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, Lyyds/ᛳᛲᛶᛴ;

    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    const-wide v5, -0x3845be68a836eL

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    if-nez v1, :cond_2

    .line 159
    .line 160
    sget-object v1, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 161
    .line 162
    const-wide v2, -0x38460e68a836eL

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v1, v2}, Lyyds/ᲁᲁᲁᛳ;->ᲇᲈᛵᛷ(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_2
    new-instance v5, Lyyds/ᛱᲀᲈᛷ;

    .line 176
    .line 177
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 178
    .line 179
    .line 180
    const-wide v6, -0x317f1e68a836eL

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    new-instance v6, Lyyds/ᛳᛵᛲ;

    .line 189
    .line 190
    invoke-direct {v6, v4}, Lyyds/ᛳᛵᛲ;-><init>(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v5, v6}, Lyyds/ᛱᲀᲈᛷ;->ᛲᲈᲁ(Lyyds/ᛷᛴᲈᲀ;)V

    .line 194
    .line 195
    .line 196
    iget-object v1, v1, Lyyds/ᛳᛲᛶᛴ;->ᛶᛷᛲᲁ:Ljava/lang/reflect/Method;

    .line 197
    .line 198
    new-instance v4, Lyyds/ᛱᛱᛴ;

    .line 199
    .line 200
    const/16 v6, 0x1a

    .line 201
    .line 202
    invoke-direct {v4, v6, v5}, Lyyds/ᛱᛱᛴ;-><init>(ILjava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3, v1, v2, v4}, Lyyds/ᛱᛶᛶᲇ;->ᛶᛷᛲᲁ(Ljava/lang/reflect/Member;Lyyds/ᛷᛴᲁᛸ;Lyyds/ᛱᛳᛶᲈ;)V

    .line 206
    .line 207
    .line 208
    :goto_0
    sget-object p0, Lyyds/ᛶᛵᛳᛵ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛳᛵ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 209
    .line 210
    return-void

    .line 211
    :goto_1
    sget-object v2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 212
    .line 213
    new-instance v3, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    const-wide v4, -0x3177fe68a836eL

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    const-wide v4, -0x31788e68a836eL

    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    invoke-static {v3, p0, v4, v5}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛲᲈᲈ(Ljava/lang/StringBuilder;Ljava/lang/String;J)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-virtual {v2, v3, v1}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    sget-object v1, Lyyds/ᛶᛵᛳᛵ;->ᛵᛸᛸᛷ:Ljava/util/LinkedHashSet;

    .line 240
    .line 241
    invoke-static {p0, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛳᛶᛵ(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashSet;)V

    .line 242
    .line 243
    .line 244
    return-void
.end method
