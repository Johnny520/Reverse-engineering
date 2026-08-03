.class public final L۟/h9;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "L\u06df/qb;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/q8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u06df/q8<",
            "L\u06df/u4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(L۟/q8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u06df/q8<",
            "L\u06df/u4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, L۟/h9;->ۥ:L۟/q8;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, L۟/qb;

    .line 2
    .line 3
    const/16 v0, 0xf

    .line 4
    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    new-array v2, v1, [B

    .line 12
    .line 13
    fill-array-data v2, :array_1

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object p1, L۟/w1;->ۥ:Ljava/lang/String;

    .line 24
    .line 25
    iget-object p1, p0, L۟/h9;->ۥ:L۟/q8;

    .line 26
    .line 27
    iget-object p1, p1, L۟/q8;->ۥ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, L۟/u4;

    .line 30
    .line 31
    iget-object v0, p1, L۟/u4;->ۥ:L۟/v4;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-object v0, v0, L۟/v4;->ۥ۟:Ljava/util/List;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    xor-int/2addr v0, v3

    .line 46
    if-ne v0, v3, :cond_0

    .line 47
    .line 48
    move v0, v3

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v0, v2

    .line 51
    :goto_0
    iget-object p1, p1, L۟/u4;->ۥ:L۟/v4;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    iget-object p1, p1, L۟/v4;->ۥ۟:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, L۟/w4;

    .line 62
    .line 63
    iget-object p1, p1, L۟/w4;->ۥ:Ljava/lang/String;

    .line 64
    .line 65
    if-nez p1, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    if-eqz p1, :cond_2

    .line 69
    .line 70
    iget-object p1, p1, L۟/v4;->ۥ:Ljava/util/List;

    .line 71
    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, L۟/w4;

    .line 79
    .line 80
    if-eqz p1, :cond_2

    .line 81
    .line 82
    iget-object p1, p1, L۟/w4;->ۥ:Ljava/lang/String;

    .line 83
    .line 84
    if-nez p1, :cond_3

    .line 85
    .line 86
    :cond_2
    :goto_1
    const-string p1, ""

    .line 87
    .line 88
    :cond_3
    invoke-static {p1}, L۟/jb;->ۥ۟ۦ(Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object v0, p0, L۟/h9;->ۥ:L۟/q8;

    .line 93
    .line 94
    iget-object v0, v0, L۟/q8;->ۥ:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, L۟/u4;

    .line 97
    .line 98
    iget-object v4, v0, L۟/u4;->ۥ:L۟/v4;

    .line 99
    .line 100
    if-eqz v4, :cond_4

    .line 101
    .line 102
    iget-object v4, v4, L۟/v4;->ۥ۟:Ljava/util/List;

    .line 103
    .line 104
    if-eqz v4, :cond_4

    .line 105
    .line 106
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    xor-int/2addr v4, v3

    .line 111
    if-ne v4, v3, :cond_4

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    move v3, v2

    .line 115
    :goto_2
    const/4 v4, 0x3

    .line 116
    iget-object v0, v0, L۟/u4;->ۥ:L۟/v4;

    .line 117
    .line 118
    if-eqz v3, :cond_5

    .line 119
    .line 120
    iget-object v0, v0, L۟/v4;->ۥ۟:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, L۟/w4;

    .line 127
    .line 128
    iget-object v0, v0, L۟/w4;->ۥ۟:Ljava/lang/String;

    .line 129
    .line 130
    if-nez v0, :cond_7

    .line 131
    .line 132
    new-array v0, v4, [B

    .line 133
    .line 134
    fill-array-data v0, :array_2

    .line 135
    .line 136
    .line 137
    new-array v1, v1, [B

    .line 138
    .line 139
    fill-array-data v1, :array_3

    .line 140
    .line 141
    .line 142
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    goto :goto_3

    .line 147
    :cond_5
    if-eqz v0, :cond_6

    .line 148
    .line 149
    iget-object v0, v0, L۟/v4;->ۥ:Ljava/util/List;

    .line 150
    .line 151
    if-eqz v0, :cond_6

    .line 152
    .line 153
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, L۟/w4;

    .line 158
    .line 159
    if-eqz v0, :cond_6

    .line 160
    .line 161
    iget-object v0, v0, L۟/w4;->ۥ۟:Ljava/lang/String;

    .line 162
    .line 163
    if-nez v0, :cond_7

    .line 164
    .line 165
    :cond_6
    new-array v0, v4, [B

    .line 166
    .line 167
    fill-array-data v0, :array_4

    .line 168
    .line 169
    .line 170
    new-array v1, v1, [B

    .line 171
    .line 172
    fill-array-data v1, :array_5

    .line 173
    .line 174
    .line 175
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    :cond_7
    :goto_3
    invoke-static {v0, p1}, L۟/w1;->ۥ۟(Ljava/lang/String;Ljava/util/List;)V

    .line 180
    .line 181
    .line 182
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 183
    .line 184
    return-object p1

    .line 185
    :array_0
    .array-data 1
        -0x9t
        -0x5ct
        -0x71t
        -0x40t
        0x2at
        0x79t
        -0x9t
        -0x5et
        -0x7et
        -0x36t
        0x3ct
        0x34t
        -0x5bt
        -0x4bt
        -0x6bt
    .end array-data

    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    :array_1
    .array-data 1
        -0x2dt
        -0x30t
        -0x19t
        -0x57t
        0x59t
        0x5dt
    .end array-data

    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    nop

    .line 205
    :array_2
    .array-data 1
        0x4at
        0x10t
        -0xat
    .end array-data

    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    :array_3
    .array-data 1
        0x27t
        0x60t
        -0x3et
        0x4et
        -0x48t
        -0x1ct
    .end array-data

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    nop

    .line 219
    :array_4
    .array-data 1
        -0x3bt
        -0x48t
        -0x19t
    .end array-data

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    :array_5
    .array-data 1
        -0x58t
        -0x38t
        -0x2dt
        0x56t
        0x2ct
        0x50t
    .end array-data
.end method
