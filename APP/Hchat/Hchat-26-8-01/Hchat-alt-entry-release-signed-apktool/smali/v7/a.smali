.class public final enum Lv7/a;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum i:Lv7/a;

.field public static final enum j:Lv7/a;

.field public static final enum k:Lv7/a;

.field public static final enum l:Lv7/a;

.field public static final m:[Lv7/a;

.field public static final synthetic n:[Lv7/a;


# instance fields
.field public final g:I

.field public final h:[Lv7/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lv7/a;

    .line 2
    .line 3
    sget-object v1, Lv7/k0;->w:Lv7/k0;

    .line 4
    .line 5
    sget-object v2, Lv7/k0;->h:Lv7/k0;

    .line 6
    .line 7
    sget-object v3, Lv7/k0;->i:Lv7/k0;

    .line 8
    .line 9
    sget-object v4, Lv7/k0;->j:Lv7/k0;

    .line 10
    .line 11
    sget-object v5, Lv7/k0;->v:Lv7/k0;

    .line 12
    .line 13
    filled-new-array {v3, v4, v5, v1, v2}, [Lv7/k0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "REFERENCE"

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-direct {v0, v2, v3, v4, v1}, Lv7/a;-><init>(Ljava/lang/String;II[Lv7/k0;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lv7/a;

    .line 25
    .line 26
    sget-object v2, Lv7/k0;->n:Lv7/k0;

    .line 27
    .line 28
    sget-object v3, Lv7/k0;->o:Lv7/k0;

    .line 29
    .line 30
    filled-new-array {v2, v3}, [Lv7/k0;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    const-string v6, "INTEGER"

    .line 35
    .line 36
    const/4 v7, 0x4

    .line 37
    invoke-direct {v1, v6, v4, v7, v5}, Lv7/a;-><init>(Ljava/lang/String;II[Lv7/k0;)V

    .line 38
    .line 39
    .line 40
    sput-object v1, Lv7/a;->i:Lv7/a;

    .line 41
    .line 42
    move-object v4, v2

    .line 43
    new-instance v2, Lv7/a;

    .line 44
    .line 45
    sget-object v5, Lv7/k0;->p:Lv7/k0;

    .line 46
    .line 47
    filled-new-array {v5}, [Lv7/k0;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    const-string v6, "BOOL"

    .line 52
    .line 53
    const/4 v8, 0x2

    .line 54
    const/16 v9, 0x8

    .line 55
    .line 56
    invoke-direct {v2, v6, v8, v9, v5}, Lv7/a;-><init>(Ljava/lang/String;II[Lv7/k0;)V

    .line 57
    .line 58
    .line 59
    move-object v5, v3

    .line 60
    new-instance v3, Lv7/a;

    .line 61
    .line 62
    sget-object v6, Lv7/k0;->t:Lv7/k0;

    .line 63
    .line 64
    sget-object v10, Lv7/k0;->s:Lv7/k0;

    .line 65
    .line 66
    sget-object v11, Lv7/k0;->q:Lv7/k0;

    .line 67
    .line 68
    sget-object v12, Lv7/k0;->r:Lv7/k0;

    .line 69
    .line 70
    filled-new-array {v11, v12, v6, v10}, [Lv7/k0;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    const-string v10, "COLOR"

    .line 75
    .line 76
    const/4 v11, 0x3

    .line 77
    const/16 v12, 0x10

    .line 78
    .line 79
    invoke-direct {v3, v10, v11, v12, v6}, Lv7/a;-><init>(Ljava/lang/String;II[Lv7/k0;)V

    .line 80
    .line 81
    .line 82
    move-object v6, v4

    .line 83
    new-instance v4, Lv7/a;

    .line 84
    .line 85
    sget-object v10, Lv7/k0;->k:Lv7/k0;

    .line 86
    .line 87
    filled-new-array {v10}, [Lv7/k0;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    const-string v11, "FLOAT"

    .line 92
    .line 93
    const/16 v12, 0x20

    .line 94
    .line 95
    invoke-direct {v4, v11, v7, v12, v10}, Lv7/a;-><init>(Ljava/lang/String;II[Lv7/k0;)V

    .line 96
    .line 97
    .line 98
    move-object v7, v5

    .line 99
    new-instance v5, Lv7/a;

    .line 100
    .line 101
    sget-object v10, Lv7/k0;->l:Lv7/k0;

    .line 102
    .line 103
    filled-new-array {v10}, [Lv7/k0;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    const-string v11, "DIMENSION"

    .line 108
    .line 109
    const/4 v12, 0x5

    .line 110
    const/16 v13, 0x40

    .line 111
    .line 112
    invoke-direct {v5, v11, v12, v13, v10}, Lv7/a;-><init>(Ljava/lang/String;II[Lv7/k0;)V

    .line 113
    .line 114
    .line 115
    move-object v10, v6

    .line 116
    new-instance v6, Lv7/a;

    .line 117
    .line 118
    sget-object v11, Lv7/k0;->m:Lv7/k0;

    .line 119
    .line 120
    filled-new-array {v11}, [Lv7/k0;

    .line 121
    .line 122
    .line 123
    move-result-object v11

    .line 124
    const-string v12, "FRACTION"

    .line 125
    .line 126
    const/4 v13, 0x6

    .line 127
    const/16 v14, 0x80

    .line 128
    .line 129
    invoke-direct {v6, v12, v13, v14, v11}, Lv7/a;-><init>(Ljava/lang/String;II[Lv7/k0;)V

    .line 130
    .line 131
    .line 132
    move-object v11, v7

    .line 133
    new-instance v7, Lv7/a;

    .line 134
    .line 135
    invoke-static {}, Lv7/k0;->values()[Lv7/k0;

    .line 136
    .line 137
    .line 138
    move-result-object v12

    .line 139
    invoke-virtual {v12}, [Lv7/k0;->clone()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v12

    .line 143
    check-cast v12, [Lv7/k0;

    .line 144
    .line 145
    const-string v13, "ANY"

    .line 146
    .line 147
    const/4 v14, 0x7

    .line 148
    const v15, 0xffff

    .line 149
    .line 150
    .line 151
    invoke-direct {v7, v13, v14, v15, v12}, Lv7/a;-><init>(Ljava/lang/String;II[Lv7/k0;)V

    .line 152
    .line 153
    .line 154
    sput-object v7, Lv7/a;->j:Lv7/a;

    .line 155
    .line 156
    move v12, v8

    .line 157
    new-instance v8, Lv7/a;

    .line 158
    .line 159
    const/high16 v13, 0x10000

    .line 160
    .line 161
    filled-new-array {v10, v11}, [Lv7/k0;

    .line 162
    .line 163
    .line 164
    move-result-object v14

    .line 165
    const-string v15, "ENUM"

    .line 166
    .line 167
    invoke-direct {v8, v15, v9, v13, v14}, Lv7/a;-><init>(Ljava/lang/String;II[Lv7/k0;)V

    .line 168
    .line 169
    .line 170
    sput-object v8, Lv7/a;->k:Lv7/a;

    .line 171
    .line 172
    new-instance v9, Lv7/a;

    .line 173
    .line 174
    const/high16 v13, 0x20000

    .line 175
    .line 176
    filled-new-array {v11, v10}, [Lv7/k0;

    .line 177
    .line 178
    .line 179
    move-result-object v10

    .line 180
    const-string v11, "FLAG"

    .line 181
    .line 182
    const/16 v14, 0x9

    .line 183
    .line 184
    invoke-direct {v9, v11, v14, v13, v10}, Lv7/a;-><init>(Ljava/lang/String;II[Lv7/k0;)V

    .line 185
    .line 186
    .line 187
    sput-object v9, Lv7/a;->l:Lv7/a;

    .line 188
    .line 189
    new-instance v10, Lv7/a;

    .line 190
    .line 191
    sget-object v11, Lv7/k0;->u:Lv7/k0;

    .line 192
    .line 193
    filled-new-array {v11}, [Lv7/k0;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    const-string v13, "STRING"

    .line 198
    .line 199
    const/16 v14, 0xa

    .line 200
    .line 201
    invoke-direct {v10, v13, v14, v12, v11}, Lv7/a;-><init>(Ljava/lang/String;II[Lv7/k0;)V

    .line 202
    .line 203
    .line 204
    filled-new-array/range {v0 .. v10}, [Lv7/a;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    sput-object v8, Lv7/a;->n:[Lv7/a;

    .line 209
    .line 210
    move-object v8, v7

    .line 211
    move-object v7, v6

    .line 212
    move-object v6, v5

    .line 213
    move-object v5, v4

    .line 214
    move-object v4, v3

    .line 215
    move-object v3, v2

    .line 216
    move-object v2, v1

    .line 217
    move-object v1, v10

    .line 218
    filled-new-array/range {v0 .. v8}, [Lv7/a;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    sput-object v0, Lv7/a;->m:[Lv7/a;

    .line 223
    .line 224
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II[Lv7/k0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lv7/a;->g:I

    .line 5
    .line 6
    iput-object p4, p0, Lv7/a;->h:[Lv7/k0;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lv7/a;
    .locals 1

    .line 1
    const-class v0, Lv7/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lv7/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lv7/a;
    .locals 1

    .line 1
    sget-object v0, Lv7/a;->n:[Lv7/a;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lv7/a;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lv7/a;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

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
    const/4 v1, 0x0

    .line 23
    :goto_0
    iget-object v2, p0, Lv7/a;->h:[Lv7/k0;

    .line 24
    .line 25
    array-length v3, v2

    .line 26
    if-ge v1, v3, :cond_1

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const/16 v3, 0x2c

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    :cond_0
    aget-object v2, v2, v1

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/16 v1, 0x7d

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
.end method
