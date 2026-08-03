.class public final L۟/w1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:Ljava/lang/String;

.field public static ۥ۟:Ljava/lang/String;

.field public static ۥ۟۟:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    sput-object v0, L۟/w1;->ۥ:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, L۟/w1;->ۥ۟:Ljava/lang/String;

    sput-object v0, L۟/w1;->ۥ۟۟:Ljava/lang/String;

    return-void

    nop

    :array_0
    .array-data 1
        0x2et
        0x5t
        -0xet
    .end array-data

    :array_1
    .array-data 1
        0x44t
        0x75t
        -0x6bt
        -0x56t
        0x56t
        0x23t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final ۥ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, L۟/w1;->ۥ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0, v0}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p0, :cond_2

    .line 10
    .line 11
    sget-object p0, L۟/w1;->ۥ۟:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p0, "/Download/xhs/"

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    sput-object p0, L۟/w1;->ۥ۟:Ljava/lang/String;

    .line 49
    .line 50
    :cond_1
    sget-object p0, L۟/w1;->ۥ۟:Ljava/lang/String;

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    sget-object p0, L۟/w1;->ۥ۟۟:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move v0, v1

    .line 63
    :goto_1
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p0, "/Download/xhs/video/"

    .line 82
    .line 83
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    sput-object p0, L۟/w1;->ۥ۟۟:Ljava/lang/String;

    .line 91
    .line 92
    :cond_4
    sget-object p0, L۟/w1;->ۥ۟۟:Ljava/lang/String;

    .line 93
    .line 94
    :goto_2
    return-object p0
.end method

.method public static ۥ۟(Ljava/lang/String;Ljava/util/List;)V
    .locals 4

    .line 1
    const/4 v0, 0x7

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    new-array v3, v2, [B

    .line 9
    .line 10
    fill-array-data v3, :array_1

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-array v0, v0, [B

    .line 21
    .line 22
    fill-array-data v0, :array_2

    .line 23
    .line 24
    .line 25
    new-array v1, v2, [B

    .line 26
    .line 27
    fill-array-data v1, :array_3

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, L۟/m;->ۥ:L۟/m;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget-object v0, L۟/m;->ۥۣ۟:Ljava/lang/String;

    .line 43
    .line 44
    sget-object v1, L۟/n8;->ۥ:L۟/n8;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {}, L۟/n8;->ۥ()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v0, v1}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_0

    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    const/16 v1, 0x21

    .line 63
    .line 64
    if-lt v0, v1, :cond_1

    .line 65
    .line 66
    const/16 v0, 0x24

    .line 67
    .line 68
    new-array v0, v0, [B

    .line 69
    .line 70
    fill-array-data v0, :array_4

    .line 71
    .line 72
    .line 73
    new-array v1, v2, [B

    .line 74
    .line 75
    fill-array-data v1, :array_5

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    goto :goto_0

    .line 83
    :cond_1
    const/16 v0, 0x29

    .line 84
    .line 85
    new-array v0, v0, [B

    .line 86
    .line 87
    fill-array-data v0, :array_6

    .line 88
    .line 89
    .line 90
    new-array v1, v2, [B

    .line 91
    .line 92
    fill-array-data v1, :array_7

    .line 93
    .line 94
    .line 95
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :goto_0
    invoke-static {v0}, L۟/r7;->ۥ(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    sget-object v0, L۟/q;->ۥ۟:L۟/kb;

    .line 106
    .line 107
    invoke-static {}, L۟/q$c;->ۥ۟()Landroid/os/Handler;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    new-instance v1, L۟/ib;

    .line 112
    .line 113
    const/16 v2, 0x8

    .line 114
    .line 115
    invoke-direct {v1, p0, p1, v2}, L۟/ib;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 119
    .line 120
    .line 121
    :cond_2
    return-void

    .line 122
    nop

    .line 123
    :array_0
    .array-data 1
        -0x31t
        -0x80t
        -0x62t
        0x77t
        0x7dt
        -0x10t
        -0x32t
    .end array-data

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    :array_1
    .array-data 1
        -0x46t
        -0xet
        -0xet
        0x3bt
        0x14t
        -0x7dt
    .end array-data

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    nop

    .line 139
    :array_2
    .array-data 1
        0x2dt
        -0x1ct
        0x4at
        0x52t
        0x20t
        -0x4at
        0x2dt
    .end array-data

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    :array_3
    .array-data 1
        0x48t
        -0x64t
        0x3et
        0x1ct
        0x41t
        -0x25t
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
    :array_4
    .array-data 1
        -0x70t
        0x6ct
        0x9t
        0x28t
        -0x4et
        0x2bt
        -0x6bt
        0x2ct
        0x1dt
        0x3ft
        -0x51t
        0x2ft
        -0x68t
        0x71t
        0x1et
        0x33t
        -0x4et
        0x2ct
        -0x21t
        0x50t
        0x28t
        0x1bt
        -0x67t
        0x1dt
        -0x44t
        0x47t
        0x29t
        0x13t
        -0x64t
        0x1dt
        -0x48t
        0x4ft
        0x2ct
        0x1dt
        -0x68t
        0x11t
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
    :array_5
    .array-data 1
        -0xft
        0x2t
        0x6dt
        0x5at
        -0x23t
        0x42t
    .end array-data

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    nop

    .line 185
    :array_6
    .array-data 1
        -0x50t
        -0x2bt
        -0x18t
        0x2at
        0x78t
        -0x6et
        -0x4bt
        -0x6bt
        -0x4t
        0x3dt
        0x65t
        -0x6at
        -0x48t
        -0x38t
        -0x1t
        0x31t
        0x78t
        -0x6bt
        -0x1t
        -0x14t
        -0x22t
        0x11t
        0x43t
        -0x42t
        -0x72t
        -0x2t
        -0x2ct
        0xct
        0x52t
        -0x57t
        -0x61t
        -0x6t
        -0x40t
        0x7t
        0x44t
        -0x51t
        -0x62t
        -0x17t
        -0x33t
        0x1ft
        0x52t
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
    nop

    .line 211
    :array_7
    .array-data 1
        -0x2ft
        -0x45t
        -0x74t
        0x58t
        0x17t
        -0x5t
    .end array-data
.end method

.method public static synthetic ۥ۟۟(Ljava/util/List;)V
    .locals 2

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, L۟/w1;->ۥ۟(Ljava/lang/String;Ljava/util/List;)V

    return-void

    :array_0
    .array-data 1
        -0x73t
        0x65t
        -0x6bt
    .end array-data

    :array_1
    .array-data 1
        -0x19t
        0x15t
        -0xet
        0x4t
        0x21t
        -0xat
    .end array-data
.end method

.method public static ۥ۟۠(Ljava/lang/String;Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-gt v0, v1, :cond_3

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    if-eq v2, v1, :cond_1

    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, L۟/jb;->ۥ۟ۦ(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    sget-object v0, L۟/d2;->ۥ:L۟/d2;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    sget-object p1, L۟/n8;->ۥ:L۟/n8;

    .line 51
    .line 52
    new-instance v2, L۟/t1;

    .line 53
    .line 54
    invoke-direct {v2, p0, v0}, L۟/t1;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const/16 p0, 0x8

    .line 61
    .line 62
    new-array p0, p0, [B

    .line 63
    .line 64
    fill-array-data p0, :array_0

    .line 65
    .line 66
    .line 67
    const/4 p1, 0x6

    .line 68
    new-array p1, p1, [B

    .line 69
    .line 70
    fill-array-data p1, :array_1

    .line 71
    .line 72
    .line 73
    invoke-static {p0, p1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    invoke-static {}, L۟/l3;->ۥ()Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-eqz p0, :cond_4

    .line 81
    .line 82
    new-instance p0, L۟/z4;

    .line 83
    .line 84
    invoke-static {}, L۟/l3;->ۥ۟()Landroid/app/Activity;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-direct {p0, p1}, L۟/z4;-><init>(Landroid/app/Activity;)V

    .line 89
    .line 90
    .line 91
    const/high16 p1, 0x42f00000    # 120.0f

    .line 92
    .line 93
    invoke-static {v1, p1}, L۟/c4;->ۥۣ۟(IF)F

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    float-to-int v0, v0

    .line 98
    invoke-static {v1, p1}, L۟/c4;->ۥۣ۟(IF)F

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    float-to-int p1, p1

    .line 103
    iput v0, p0, L۟/ya;->ۥ۟ۢ:I

    .line 104
    .line 105
    iput p1, p0, L۟/ya;->ۥۣ۟:I

    .line 106
    .line 107
    invoke-virtual {p0}, L۟/z4;->show()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 114
    .line 115
    .line 116
    new-instance p1, L۟/m8;

    .line 117
    .line 118
    invoke-direct {p1}, L۟/m8;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, L۟/z4;->ۥ۠ۤ:L۟/kb;

    .line 125
    .line 126
    invoke-virtual {p1}, L۟/kb;->ۥ()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    check-cast p1, Landroid/widget/TextView;

    .line 131
    .line 132
    invoke-virtual {v2, p1, p0}, L۟/t1;->ۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    :cond_4
    return-void

    .line 136
    nop

    .line 137
    :array_0
    .array-data 1
        0x33t
        -0x7ct
        -0x5ct
        -0x8t
        0x3bt
        -0x2t
        0x33t
        -0x72t
    .end array-data

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    :array_1
    .array-data 1
        0x50t
        -0x1bt
        -0x38t
        -0x6ct
        0x59t
        -0x61t
    .end array-data
.end method
