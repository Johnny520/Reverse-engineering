.class public final Lyyds/ᛳᲁᛲ;
.super Lyyds/ᲀᛶᛵᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲇᲇᲇᛱ:Lyyds/ᛳᲇᲀᲀ;


# instance fields
.field public final ᛲᛴᛳᛲ:Z

.field public final ᲀᛲᛳᲀ:Lyyds/ᲈᛳᛵᲇ;

.field public final ᲇᲈᛵᛷ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lyyds/ᛳᲁᛲ;

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᛵᛵᛲᲈ;->ᛵᛸᛸᛷ(Ljava/lang/Class;)Lyyds/ᛳᲇᲀᲀ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lyyds/ᛳᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛳᲇᲀᲀ;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Z)V
    .locals 2

    .line 20
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v1, v0, [Lyyds/ᛴᛴᲇᛸ;

    invoke-static {p1, v1}, Lyyds/ᛱᛵᛱᛱ;->ᛷᲈᲈᲁ(Ljava/lang/String;[Lyyds/ᛴᛴᲇᛸ;)Lyyds/ᲈᛳᛵᲇ;

    move-result-object p1

    invoke-direct {p0, p1, v0, p2}, Lyyds/ᛳᲁᛲ;-><init>(Lyyds/ᲈᛳᛵᲇ;ZZ)V

    return-void
.end method

.method public constructor <init>(Lyyds/ᲈᛳᛵᲇ;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᲁᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛳᛵᲇ;

    .line 5
    .line 6
    iput-boolean p2, p0, Lyyds/ᛳᲁᛲ;->ᲇᲈᛵᛷ:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lyyds/ᛳᲁᛲ;->ᛲᛴᛳᛲ:Z

    .line 9
    .line 10
    sget-object p0, Lyyds/ᛳᲁᛲ;->ᲇᲇᲇᛱ:Lyyds/ᛳᲇᲀᲀ;

    .line 11
    .line 12
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-interface {p0, p1, p2}, Lyyds/ᛳᲇᲀᲀ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Ljava/lang/Boolean;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᛳᲁᛲ;->ᲇᲈᛵᛷ:Z

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛳᲁᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛳᛵᲇ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean p0, p0, Lyyds/ᛳᲁᛲ;->ᛲᛴᛳᛲ:Z

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    iget-object p0, v1, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ:Lyyds/ᲈᲁᲁᛶ;

    .line 12
    .line 13
    invoke-virtual {p0}, Lyyds/ᲀᛶᲁᛵ;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 v0, 0x2

    .line 18
    new-array v0, v0, [Ljava/lang/CharSequence;

    .line 19
    .line 20
    const-string v1, "!"

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aput-object v1, v0, v2

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    aput-object p0, v0, v1

    .line 27
    .line 28
    invoke-static {v0}, Lyyds/ᛴᛸᛲ;->ᛵᛸᛸᛷ([Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    iget-object p0, v1, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ:Lyyds/ᲈᲁᲁᛶ;

    .line 34
    .line 35
    invoke-virtual {p0}, Lyyds/ᲀᛶᲁᛵ;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public final ᛷᛲᲈᛱ(Lyyds/ᛴᛵᲀᛴ;)Lyyds/ᲀᛶᛵᲁ;
    .locals 4

    .line 1
    iget-object v0, p1, Lyyds/ᛴᛵᲀᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛳᛶ;

    .line 2
    .line 3
    const-string v1, "Could not convert "

    .line 4
    .line 5
    iget-boolean v2, p0, Lyyds/ᛳᲁᛲ;->ᲇᲈᛵᛷ:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object p0, p0, Lyyds/ᛳᲁᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛳᛵᲇ;

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    :try_start_0
    invoke-static {}, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ()Lyyds/ᛲᛲᲇᲈ;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v0, v0, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 17
    .line 18
    iput-object v0, v1, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 19
    .line 20
    sget-object v0, Lyyds/ᛲᲀᲇᲇ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲀᲇᲇ;

    .line 21
    .line 22
    filled-new-array {v0}, [Lyyds/ᛲᲀᲇᲇ;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v2, v1, Lyyds/ᛲᛲᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Ljava/util/EnumSet;

    .line 29
    .line 30
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ()Lyyds/ᛴᲈᛳᛶ;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p1, Lyyds/ᛴᛵᲀᛴ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object p1, p1, Lyyds/ᛴᛵᲀᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {p0, v1, p1, v0}, Lyyds/ᲈᛳᛵᲇ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛴᲈᛳᛶ;)Lyyds/ᛸᛴᛷᲇ;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0, v3}, Lyyds/ᛸᛴᛷᲇ;->ᲀᛲᛳᲀ(Z)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    sget-object p1, Lyyds/ᛱᛱᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 54
    .line 55
    if-ne p0, p1, :cond_0

    .line 56
    .line 57
    sget-object p0, Lyyds/ᛳᛲᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛲᛱᛵ;

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_0
    sget-object p0, Lyyds/ᛳᛲᲀᛲ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛲᛱᛵ;
    :try_end_0
    .catch Lyyds/ᛷᛵᛳᲈ; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    return-object p0

    .line 63
    :catch_0
    sget-object p0, Lyyds/ᛳᛲᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛲᛱᛵ;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_1
    :try_start_1
    invoke-virtual {p1, p0}, Lyyds/ᛴᛵᲀᛴ;->ᛲᲈᲁ(Lyyds/ᲈᛳᛵᲇ;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    iget-object p1, v0, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    instance-of p1, p0, Ljava/lang/Number;

    .line 76
    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    new-instance p1, Lyyds/ᛸᛱᛷᲇ;

    .line 84
    .line 85
    invoke-direct {p1, p0}, Lyyds/ᛸᛱᛷᲇ;-><init>(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    return-object p1

    .line 89
    :cond_2
    instance-of p1, p0, Ljava/lang/String;

    .line 90
    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    new-instance p1, Lyyds/ᲀᲇᛵᲁ;

    .line 98
    .line 99
    invoke-direct {p1, p0, v3}, Lyyds/ᲀᲇᛵᲁ;-><init>(Ljava/lang/CharSequence;Z)V

    .line 100
    .line 101
    .line 102
    return-object p1

    .line 103
    :cond_3
    instance-of p1, p0, Ljava/lang/Boolean;

    .line 104
    .line 105
    if-eqz p1, :cond_5

    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_4

    .line 120
    .line 121
    sget-object p0, Lyyds/ᛳᛲᲀᛲ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛲᛱᛵ;

    .line 122
    .line 123
    return-object p0

    .line 124
    :cond_4
    sget-object p0, Lyyds/ᛳᛲᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛲᛱᛵ;

    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_5
    instance-of p1, p0, Ljava/time/OffsetDateTime;

    .line 128
    .line 129
    if-eqz p1, :cond_6

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    new-instance p1, Lyyds/ᲈᛲᛲᲁ;

    .line 136
    .line 137
    invoke-direct {p1, p0}, Lyyds/ᲈᛲᛲᲁ;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-object p1

    .line 141
    :cond_6
    if-nez p0, :cond_7

    .line 142
    .line 143
    sget-object p0, Lyyds/ᛳᛲᲀᛲ;->ᛲᲈᲁ:Lyyds/ᛷᛲᛴᲇ;

    .line 144
    .line 145
    return-object p0

    .line 146
    :cond_7
    iget-object p1, v0, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 147
    .line 148
    iget-object v2, v0, Lyyds/ᛴᲈᛳᛶ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲇᛶᲀ;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    instance-of p1, p0, Ljava/util/List;

    .line 154
    .line 155
    if-eqz p1, :cond_8

    .line 156
    .line 157
    const-class p1, Ljava/util/List;

    .line 158
    .line 159
    invoke-virtual {v2, p0, p1, v0}, Lyyds/ᛶᲇᛶᲀ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Class;Lyyds/ᛴᲈᛳᛶ;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    new-instance p1, Lyyds/ᛶᛴᛲᲇ;

    .line 164
    .line 165
    invoke-direct {p1, p0}, Lyyds/ᛶᛴᛲᲇ;-><init>(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    return-object p1

    .line 169
    :cond_8
    iget-object p1, v0, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    instance-of p1, p0, Ljava/util/Map;

    .line 175
    .line 176
    if-eqz p1, :cond_9

    .line 177
    .line 178
    const-class p1, Ljava/util/Map;

    .line 179
    .line 180
    invoke-virtual {v2, p0, p1, v0}, Lyyds/ᛶᲇᛶᲀ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Class;Lyyds/ᛴᲈᛳᛶ;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    new-instance p1, Lyyds/ᛶᛴᛲᲇ;

    .line 185
    .line 186
    invoke-direct {p1, p0}, Lyyds/ᛶᛴᛲᲇ;-><init>(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    return-object p1

    .line 190
    :cond_9
    new-instance p1, Lyyds/ᛸᛳᛵᛳ;

    .line 191
    .line 192
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    new-instance v2, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    const-string v0, ":"

    .line 213
    .line 214
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string p0, " to a ValueNode"

    .line 221
    .line 222
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw p1
    :try_end_1
    .catch Lyyds/ᛷᛵᛳᲈ; {:try_start_1 .. :try_end_1} :catch_1

    .line 233
    :catch_1
    sget-object p0, Lyyds/ᛳᛲᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲀᛳᲁᲁ;

    .line 234
    .line 235
    return-object p0
.end method

.method public final ᛷᲈᲈᲁ(Lyyds/ᛴᛵᲀᛴ;)Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Ljava/lang/Void;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᲇᲇᛱ()Lyyds/ᛳᲁᛲ;
    .locals 0

    .line 1
    return-object p0
.end method
