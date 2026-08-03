.class public final L۟/s9;
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


# static fields
.field public static final ۥ:L۟/s9;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/s9;

    invoke-direct {v0}, L۟/s9;-><init>()V

    sput-object v0, L۟/s9;->ۥ:L۟/s9;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

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
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 23
    .line 24
    const/16 v0, 0x39

    .line 25
    .line 26
    new-array v0, v0, [B

    .line 27
    .line 28
    fill-array-data v0, :array_2

    .line 29
    .line 30
    .line 31
    new-array v2, v1, [B

    .line 32
    .line 33
    fill-array-data v2, :array_3

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0, p1}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    check-cast p1, Landroid/app/Activity;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    const/4 v2, 0x7

    .line 52
    new-array v2, v2, [B

    .line 53
    .line 54
    fill-array-data v2, :array_4

    .line 55
    .line 56
    .line 57
    new-array v3, v1, [B

    .line 58
    .line 59
    fill-array-data v3, :array_5

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const/4 v0, 0x0

    .line 72
    :goto_0
    const/4 v2, 0x1

    .line 73
    const/4 v3, 0x0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-nez v4, :cond_1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    move v4, v3

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    :goto_1
    move v4, v2

    .line 86
    :goto_2
    if-nez v4, :cond_4

    .line 87
    .line 88
    new-array v2, v2, [B

    .line 89
    .line 90
    const/16 v4, 0x77

    .line 91
    .line 92
    aput-byte v4, v2, v3

    .line 93
    .line 94
    new-array v1, v1, [B

    .line 95
    .line 96
    fill-array-data v1, :array_6

    .line 97
    .line 98
    .line 99
    invoke-static {v2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v0, v1}, L۟/ta;->ۥۡ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_3

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    sget-object v1, L۟/n8;->ۥ:L۟/n8;

    .line 111
    .line 112
    new-instance v2, L۟/r9;

    .line 113
    .line 114
    invoke-direct {v2, v0}, L۟/r9;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {p1, v2}, L۟/n8;->ۥ۟ۢ(Landroid/app/Activity;L۟/f3;)V

    .line 121
    .line 122
    .line 123
    :cond_4
    :goto_3
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 124
    .line 125
    return-object p1

    .line 126
    nop

    .line 127
    :array_0
    .array-data 1
        0x60t
        0x4ft
    .end array-data

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    nop

    .line 133
    :array_1
    .array-data 1
        0x9t
        0x3bt
        0x3et
        0x49t
        -0x6at
        0x72t
    .end array-data

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    nop

    .line 141
    :array_2
    .array-data 1
        0x1et
        0x6dt
        0x36t
        -0x21t
        0x12t
        0x2ct
        0x11t
        0x76t
        0x34t
        -0x24t
        0x46t
        0x6ft
        0x12t
        0x7dt
        0x7at
        -0x30t
        0x53t
        0x3ct
        0x4t
        0x38t
        0x2et
        -0x24t
        0x12t
        0x21t
        0x1ft
        0x76t
        0x77t
        -0x23t
        0x47t
        0x23t
        0x1ct
        0x38t
        0x2et
        -0x36t
        0x42t
        0x2at
        0x50t
        0x79t
        0x34t
        -0x29t
        0x40t
        0x20t
        0x19t
        0x7ct
        0x74t
        -0x2et
        0x42t
        0x3ft
        0x5et
        0x59t
        0x39t
        -0x39t
        0x5bt
        0x39t
        0x19t
        0x6ct
        0x23t
    .end array-data

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
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
    nop

    .line 175
    :array_3
    .array-data 1
        0x70t
        0x18t
        0x5at
        -0x4dt
        0x32t
        0x4ft
    .end array-data

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    nop

    .line 183
    :array_4
    .array-data 1
        0x49t
        0x1at
        0x56t
        0x3ft
        0x3ct
        0x67t
        0x48t
    .end array-data

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    :array_5
    .array-data 1
        0x3at
        0x6et
        0x3ft
        0x5ct
        0x57t
        0x2t
    .end array-data

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    nop

    .line 199
    :array_6
    .array-data 1
        0xct
        -0x54t
        -0x19t
        0x7ct
        0x56t
        0x2dt
    .end array-data
.end method
