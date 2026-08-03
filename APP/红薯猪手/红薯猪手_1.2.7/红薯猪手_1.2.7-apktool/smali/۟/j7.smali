.class public final L۟/j7;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/m7;


# direct methods
.method public constructor <init>(L۟/m7;)V
    .locals 0

    iput-object p1, p0, L۟/j7;->ۥ:L۟/m7;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

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
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 23
    .line 24
    const/16 v2, 0x39

    .line 25
    .line 26
    new-array v3, v2, [B

    .line 27
    .line 28
    fill-array-data v3, :array_2

    .line 29
    .line 30
    .line 31
    new-array v4, v1, [B

    .line 32
    .line 33
    fill-array-data v4, :array_3

    .line 34
    .line 35
    .line 36
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v3, v0}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    check-cast v0, Landroid/app/Activity;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    sget-object v3, L۟/k8;->ۥۣ۟:L۟/k;

    .line 52
    .line 53
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget-object v3, v3, L۟/k;->ۥۦۥ:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    iget-object v3, v3, L۟/k;->ۥۦۦ:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v0, v3}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_0

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    const-string v0, ""

    .line 85
    .line 86
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    const/4 v4, 0x0

    .line 91
    if-lez v3, :cond_1

    .line 92
    .line 93
    const/4 v3, 0x1

    .line 94
    goto :goto_1

    .line 95
    :cond_1
    move v3, v4

    .line 96
    :goto_1
    if-eqz v3, :cond_2

    .line 97
    .line 98
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 99
    .line 100
    new-array v2, v2, [B

    .line 101
    .line 102
    fill-array-data v2, :array_4

    .line 103
    .line 104
    .line 105
    new-array v1, v1, [B

    .line 106
    .line 107
    fill-array-data v1, :array_5

    .line 108
    .line 109
    .line 110
    invoke-static {v2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-static {v1, p1}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    check-cast p1, Landroid/app/Activity;

    .line 118
    .line 119
    const v1, 0x1020002

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    check-cast p1, Landroid/widget/FrameLayout;

    .line 127
    .line 128
    iget-object v1, p0, L۟/j7;->ۥ:L۟/m7;

    .line 129
    .line 130
    new-instance v2, L۟/h7;

    .line 131
    .line 132
    invoke-direct {v2, p1, v1, v0, v4}, L۟/h7;-><init>(Landroid/widget/FrameLayout;L۟/m7;Ljava/lang/String;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 136
    .line 137
    .line 138
    :cond_2
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 139
    .line 140
    return-object p1

    .line 141
    :array_0
    .array-data 1
        -0x36t
        0x2et
    .end array-data

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    nop

    .line 147
    :array_1
    .array-data 1
        -0x5dt
        0x5at
        0x22t
        -0x59t
        -0x1at
        0x5at
    .end array-data

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    nop

    .line 155
    :array_2
    .array-data 1
        -0x30t
        -0x4ft
        0x3t
        0x34t
        0x5et
        -0x19t
        -0x21t
        -0x56t
        0x1t
        0x37t
        0xat
        -0x5ct
        -0x24t
        -0x5ft
        0x4ft
        0x3bt
        0x1ft
        -0x9t
        -0x36t
        -0x1ct
        0x1bt
        0x37t
        0x5et
        -0x16t
        -0x2ft
        -0x56t
        0x42t
        0x36t
        0xbt
        -0x18t
        -0x2et
        -0x1ct
        0x1bt
        0x21t
        0xet
        -0x1ft
        -0x62t
        -0x5bt
        0x1t
        0x3ct
        0xct
        -0x15t
        -0x29t
        -0x60t
        0x41t
        0x39t
        0xet
        -0xct
        -0x70t
        -0x7bt
        0xct
        0x2ct
        0x17t
        -0xet
        -0x29t
        -0x50t
        0x16t
    .end array-data

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    nop

    .line 189
    :array_3
    .array-data 1
        -0x42t
        -0x3ct
        0x6ft
        0x58t
        0x7et
        -0x7ct
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
    :array_4
    .array-data 1
        -0x5ct
        -0x70t
        -0x3t
        -0x1ft
        0x73t
        0x42t
        -0x55t
        -0x75t
        -0x1t
        -0x1et
        0x27t
        0x1t
        -0x58t
        -0x80t
        -0x4ft
        -0x12t
        0x32t
        0x52t
        -0x42t
        -0x3bt
        -0x1bt
        -0x1et
        0x73t
        0x4ft
        -0x5bt
        -0x75t
        -0x44t
        -0x1dt
        0x26t
        0x4dt
        -0x5at
        -0x3bt
        -0x1bt
        -0xct
        0x23t
        0x44t
        -0x16t
        -0x7ct
        -0x1t
        -0x17t
        0x21t
        0x4et
        -0x5dt
        -0x7ft
        -0x41t
        -0x14t
        0x23t
        0x51t
        -0x1ct
        -0x5ct
        -0xet
        -0x7t
        0x3at
        0x57t
        -0x5dt
        -0x6ft
        -0x18t
    .end array-data

    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    nop

    .line 231
    :array_5
    .array-data 1
        -0x36t
        -0x1bt
        -0x6ft
        -0x73t
        0x53t
        0x21t
    .end array-data
.end method
