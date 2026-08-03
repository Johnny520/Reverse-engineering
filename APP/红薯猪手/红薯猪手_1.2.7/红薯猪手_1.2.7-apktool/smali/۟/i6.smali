.class public final L۟/i6;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Lorg/json/JSONObject;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/f6;


# direct methods
.method public constructor <init>(L۟/f6;)V
    .locals 0

    iput-object p1, p0, L۟/i6;->ۥ:L۟/f6;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lorg/json/JSONObject;

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
    const/4 v0, 0x4

    .line 23
    new-array v0, v0, [B

    .line 24
    .line 25
    fill-array-data v0, :array_2

    .line 26
    .line 27
    .line 28
    new-array v2, v1, [B

    .line 29
    .line 30
    fill-array-data v2, :array_3

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v2, p0, L۟/i6;->ۥ:L۟/f6;

    .line 44
    .line 45
    iget-boolean v3, v2, L۟/f6;->ۥ۟ۦ:Z

    .line 46
    .line 47
    const/4 v4, 0x7

    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    const/16 v3, 0x8

    .line 51
    .line 52
    new-array v3, v3, [B

    .line 53
    .line 54
    fill-array-data v3, :array_4

    .line 55
    .line 56
    .line 57
    new-array v5, v1, [B

    .line 58
    .line 59
    fill-array-data v5, :array_5

    .line 60
    .line 61
    .line 62
    invoke-static {v3, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    new-array v3, v4, [B

    .line 70
    .line 71
    fill-array-data v3, :array_6

    .line 72
    .line 73
    .line 74
    new-array v5, v1, [B

    .line 75
    .line 76
    fill-array-data v5, :array_7

    .line 77
    .line 78
    .line 79
    invoke-static {v3, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :cond_0
    iget-boolean v2, v2, L۟/f6;->ۥ۟ۧ:Z

    .line 87
    .line 88
    if-eqz v2, :cond_2

    .line 89
    .line 90
    new-array v2, v1, [B

    .line 91
    .line 92
    fill-array-data v2, :array_8

    .line 93
    .line 94
    .line 95
    new-array v1, v1, [B

    .line 96
    .line 97
    fill-array-data v1, :array_9

    .line 98
    .line 99
    .line 100
    invoke-static {v2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-static {v1}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-lez v2, :cond_1

    .line 116
    .line 117
    const/4 v2, 0x1

    .line 118
    goto :goto_0

    .line 119
    :cond_1
    const/4 v2, 0x0

    .line 120
    :goto_0
    if-eqz v2, :cond_2

    .line 121
    .line 122
    sget-object v2, L۟/q;->ۥ۟:L۟/kb;

    .line 123
    .line 124
    invoke-static {}, L۟/q$c;->ۥ۟۟()Ljava/util/concurrent/ExecutorService;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    new-instance v3, L۟/ib;

    .line 129
    .line 130
    invoke-direct {v3, v1, v0, v4}, L۟/ib;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 134
    .line 135
    .line 136
    :cond_2
    return-object p1

    .line 137
    :array_0
    .array-data 1
        0x5et
        0x7bt
    .end array-data

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    nop

    .line 143
    :array_1
    .array-data 1
        0x37t
        0xft
        -0x71t
        0x4ft
        0x77t
        -0x5t
    .end array-data

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    nop

    .line 151
    :array_2
    .array-data 1
        -0x74t
        -0xbt
        -0x29t
        0x4ft
    .end array-data

    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    :array_3
    .array-data 1
        -0x18t
        -0x6ct
        -0x5dt
        0x2et
        -0xft
        0x4dt
    .end array-data

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    nop

    .line 165
    :array_4
    .array-data 1
        -0x19t
        -0x3dt
        0x23t
        0x76t
        -0x57t
        0x2ft
        -0x15t
        -0x38t
    .end array-data

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    :array_5
    .array-data 1
        -0x7bt
        -0x51t
        0x4ct
        0x15t
        -0x3et
        0x46t
    .end array-data

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    nop

    .line 181
    :array_6
    .array-data 1
        -0x32t
        -0x21t
        0x5et
        0x52t
        -0x4ft
        0x25t
        -0x38t
    .end array-data

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    :array_7
    .array-data 1
        -0x54t
        -0x4dt
        0x31t
        0x31t
        -0x26t
        0x40t
    .end array-data

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    nop

    .line 197
    :array_8
    .array-data 1
        -0x4bt
        0x52t
        0x64t
        0x6ft
        0x38t
        -0x37t
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
    :array_9
    .array-data 1
        -0x40t
        0x21t
        0x1t
        0x1dt
        0x51t
        -0x53t
    .end array-data
.end method
