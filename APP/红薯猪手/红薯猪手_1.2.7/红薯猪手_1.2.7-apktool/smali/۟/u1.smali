.class public final L۟/u1;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Landroid/app/Activity;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟:Landroid/widget/TextView;

.field public final synthetic ۥ۟۟:I

.field public final synthetic ۥ۟۠:L۟/p8;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/widget/TextView;IL۟/p8;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/widget/TextView;",
            "I",
            "L\u06df/p8;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, L۟/u1;->ۥ:Ljava/util/List;

    iput-object p2, p0, L۟/u1;->ۥ۟:Landroid/widget/TextView;

    iput p3, p0, L۟/u1;->ۥ۟۟:I

    iput-object p4, p0, L۟/u1;->ۥ۟۠:L۟/p8;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Landroid/app/Activity;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    new-array v2, v1, [B

    .line 11
    .line 12
    fill-array-data v2, :array_1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, L۟/u1;->ۥ:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    const/16 v0, 0xb

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x1

    .line 32
    if-ne p1, v3, :cond_0

    .line 33
    .line 34
    iget-object p1, p0, L۟/u1;->ۥ۟:Landroid/widget/TextView;

    .line 35
    .line 36
    new-array v0, v0, [B

    .line 37
    .line 38
    fill-array-data v0, :array_2

    .line 39
    .line 40
    .line 41
    new-array v4, v1, [B

    .line 42
    .line 43
    fill-array-data v4, :array_3

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget v4, p0, L۟/u1;->ۥ۟۟:I

    .line 51
    .line 52
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v0, v4}, L۟/r2;->ۥ(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-array v3, v3, [B

    .line 61
    .line 62
    const/16 v4, 0x17

    .line 63
    .line 64
    aput-byte v4, v3, v2

    .line 65
    .line 66
    new-array v1, v1, [B

    .line 67
    .line 68
    fill-array-data v1, :array_4

    .line 69
    .line 70
    .line 71
    invoke-static {v3, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    iget-object p1, p0, L۟/u1;->ۥ۟:Landroid/widget/TextView;

    .line 87
    .line 88
    new-instance v4, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    iget-object v5, p0, L۟/u1;->ۥ۟۠:L۟/p8;

    .line 94
    .line 95
    iget v5, v5, L۟/p8;->ۥ:I

    .line 96
    .line 97
    add-int/2addr v5, v3

    .line 98
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    new-array v5, v3, [B

    .line 102
    .line 103
    const/16 v6, 0x2b

    .line 104
    .line 105
    aput-byte v6, v5, v2

    .line 106
    .line 107
    new-array v6, v1, [B

    .line 108
    .line 109
    fill-array-data v6, :array_5

    .line 110
    .line 111
    .line 112
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget-object v5, p0, L۟/u1;->ۥ:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    new-array v0, v0, [B

    .line 129
    .line 130
    fill-array-data v0, :array_6

    .line 131
    .line 132
    .line 133
    new-array v5, v1, [B

    .line 134
    .line 135
    fill-array-data v5, :array_7

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    iget v0, p0, L۟/u1;->ۥ۟۟:I

    .line 146
    .line 147
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    new-array v0, v3, [B

    .line 151
    .line 152
    const/16 v3, -0x43

    .line 153
    .line 154
    aput-byte v3, v0, v2

    .line 155
    .line 156
    new-array v1, v1, [B

    .line 157
    .line 158
    fill-array-data v1, :array_8

    .line 159
    .line 160
    .line 161
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    .line 170
    .line 171
    :goto_0
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 172
    .line 173
    return-object p1

    .line 174
    nop

    .line 175
    :array_0
    .array-data 1
        -0x1ct
        0xet
    .end array-data

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    nop

    .line 181
    :array_1
    .array-data 1
        -0x73t
        0x7at
        -0x1dt
        -0x8t
        0x65t
        0x1ft
    .end array-data

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    nop

    .line 189
    :array_2
    .array-data 1
        -0x45t
        0x3bt
        0x64t
        0x3at
        0x4et
        -0x31t
        -0x45t
        0x3bt
        0x42t
        -0x18t
        -0x2dt
    .end array-data

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    :array_3
    .array-data 1
        0x5ft
        -0x7dt
        -0x11t
        -0x2et
        -0xdt
        0x72t
    .end array-data

    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    nop

    .line 207
    :array_4
    .array-data 1
        0x32t
        -0x74t
        -0x11t
        -0x68t
        -0x66t
        -0x1dt
    .end array-data

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    nop

    .line 215
    :array_5
    .array-data 1
        0x4t
        -0x17t
        -0xct
        0x1ft
        -0x78t
        -0x18t
    .end array-data

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    nop

    .line 223
    :array_6
    .array-data 1
        -0x20t
        -0x63t
        -0x49t
        -0x32t
        0x5ft
        -0x2dt
        0x57t
        -0x63t
        -0x49t
        -0x18t
        -0x73t
    .end array-data

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    :array_7
    .array-data 1
        -0x16t
        0x79t
        0xft
        0x45t
        -0x49t
        0x6et
    .end array-data

    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    nop

    .line 241
    :array_8
    .array-data 1
        -0x68t
        -0xat
        -0x5bt
        0x2et
        0x68t
        0x4dt
    .end array-data
.end method
