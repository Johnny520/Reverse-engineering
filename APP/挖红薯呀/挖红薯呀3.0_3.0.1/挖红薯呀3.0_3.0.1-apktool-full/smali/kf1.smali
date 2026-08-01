.class public final Lkf1;
.super Lio/github/libxposed/api/XposedModule;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkf1$a;
    }
.end annotation


# static fields
.field public static final G:Lkf1$a;

.field public static final H:I

.field private static volatile I:Lkf1; = null

.field private static volatile J:Z = false

.field private static final K:Ljava/lang/String; = "DBF2DDFE68DC6C3D7BDBD1C70AAE13993F50FA99B51D6F0C668A284EE9E6FDCD"

.field private static final L:Ljava/lang/String; = "F375F0F6AF7C94C364B35CD6F6A66D64AEFAE66E32F935B48773C0FAAD04C121"


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:Z

.field private F:Z

.field private a:Z

.field private b:Z

.field private c:Z

.field private final d:Lu60;

.field private final e:Lu60;

.field private final f:Lu60;

.field private final g:Lu60;

.field private final h:Lu60;

.field private final i:Lu60;

.field private final j:Lu60;

.field private final k:Lu60;

.field private final l:Lu60;

.field private final m:Lu60;

.field private final n:Lu60;

.field private final o:Lu60;

.field private final p:Lu60;

.field private final q:Lu60;

.field private final r:Lu60;

.field private s:Ljava/lang/ClassLoader;

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:J

.field private x:Ljava/lang/String;

.field private y:Ljava/lang/String;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkf1$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkf1$a;-><init>(Lpl;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lkf1;->G:Lkf1$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lkf1;->H:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lio/github/libxposed/api/XposedModule;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcc1;

    .line 5
    .line 6
    const/16 v1, 0x1d

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcc1;-><init>(I)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lx51;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lkf1;->d:Lu60;

    .line 17
    .line 18
    new-instance v0, Lcc1;

    .line 19
    .line 20
    const/16 v1, 0x14

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lcc1;-><init>(I)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lx51;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Lkf1;->e:Lu60;

    .line 31
    .line 32
    new-instance v0, Lcc1;

    .line 33
    .line 34
    const/16 v1, 0x15

    .line 35
    .line 36
    invoke-direct {v0, v1}, Lcc1;-><init>(I)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lx51;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lkf1;->f:Lu60;

    .line 45
    .line 46
    new-instance v0, Lcc1;

    .line 47
    .line 48
    const/16 v1, 0x16

    .line 49
    .line 50
    invoke-direct {v0, v1}, Lcc1;-><init>(I)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Lx51;

    .line 54
    .line 55
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, Lkf1;->g:Lu60;

    .line 59
    .line 60
    new-instance v0, Lcc1;

    .line 61
    .line 62
    const/16 v1, 0x17

    .line 63
    .line 64
    invoke-direct {v0, v1}, Lcc1;-><init>(I)V

    .line 65
    .line 66
    .line 67
    new-instance v1, Lx51;

    .line 68
    .line 69
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 70
    .line 71
    .line 72
    iput-object v1, p0, Lkf1;->h:Lu60;

    .line 73
    .line 74
    new-instance v0, Lcc1;

    .line 75
    .line 76
    const/16 v1, 0x18

    .line 77
    .line 78
    invoke-direct {v0, v1}, Lcc1;-><init>(I)V

    .line 79
    .line 80
    .line 81
    new-instance v1, Lx51;

    .line 82
    .line 83
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Lkf1;->i:Lu60;

    .line 87
    .line 88
    new-instance v0, Lcc1;

    .line 89
    .line 90
    const/16 v1, 0x19

    .line 91
    .line 92
    invoke-direct {v0, v1}, Lcc1;-><init>(I)V

    .line 93
    .line 94
    .line 95
    new-instance v1, Lx51;

    .line 96
    .line 97
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 98
    .line 99
    .line 100
    iput-object v1, p0, Lkf1;->j:Lu60;

    .line 101
    .line 102
    new-instance v0, Lcc1;

    .line 103
    .line 104
    const/16 v1, 0x1a

    .line 105
    .line 106
    invoke-direct {v0, v1}, Lcc1;-><init>(I)V

    .line 107
    .line 108
    .line 109
    new-instance v1, Lx51;

    .line 110
    .line 111
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 112
    .line 113
    .line 114
    iput-object v1, p0, Lkf1;->k:Lu60;

    .line 115
    .line 116
    new-instance v0, Lcc1;

    .line 117
    .line 118
    const/16 v1, 0x1b

    .line 119
    .line 120
    invoke-direct {v0, v1}, Lcc1;-><init>(I)V

    .line 121
    .line 122
    .line 123
    new-instance v1, Lx51;

    .line 124
    .line 125
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 126
    .line 127
    .line 128
    iput-object v1, p0, Lkf1;->l:Lu60;

    .line 129
    .line 130
    new-instance v0, Lcc1;

    .line 131
    .line 132
    const/16 v1, 0x1c

    .line 133
    .line 134
    invoke-direct {v0, v1}, Lcc1;-><init>(I)V

    .line 135
    .line 136
    .line 137
    new-instance v1, Lx51;

    .line 138
    .line 139
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 140
    .line 141
    .line 142
    iput-object v1, p0, Lkf1;->m:Lu60;

    .line 143
    .line 144
    new-instance v0, Ljf1;

    .line 145
    .line 146
    const/4 v1, 0x0

    .line 147
    invoke-direct {v0, v1}, Ljf1;-><init>(I)V

    .line 148
    .line 149
    .line 150
    new-instance v1, Lx51;

    .line 151
    .line 152
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 153
    .line 154
    .line 155
    iput-object v1, p0, Lkf1;->n:Lu60;

    .line 156
    .line 157
    new-instance v0, Ljf1;

    .line 158
    .line 159
    const/4 v1, 0x1

    .line 160
    invoke-direct {v0, v1}, Ljf1;-><init>(I)V

    .line 161
    .line 162
    .line 163
    new-instance v1, Lx51;

    .line 164
    .line 165
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 166
    .line 167
    .line 168
    iput-object v1, p0, Lkf1;->o:Lu60;

    .line 169
    .line 170
    new-instance v0, Ljf1;

    .line 171
    .line 172
    const/4 v1, 0x2

    .line 173
    invoke-direct {v0, v1}, Ljf1;-><init>(I)V

    .line 174
    .line 175
    .line 176
    new-instance v1, Lx51;

    .line 177
    .line 178
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 179
    .line 180
    .line 181
    iput-object v1, p0, Lkf1;->p:Lu60;

    .line 182
    .line 183
    new-instance v0, Ljf1;

    .line 184
    .line 185
    const/4 v1, 0x3

    .line 186
    invoke-direct {v0, v1}, Ljf1;-><init>(I)V

    .line 187
    .line 188
    .line 189
    new-instance v1, Lx51;

    .line 190
    .line 191
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 192
    .line 193
    .line 194
    iput-object v1, p0, Lkf1;->q:Lu60;

    .line 195
    .line 196
    new-instance v0, Lcc1;

    .line 197
    .line 198
    const/16 v1, 0x13

    .line 199
    .line 200
    invoke-direct {v0, v1}, Lcc1;-><init>(I)V

    .line 201
    .line 202
    .line 203
    new-instance v1, Lx51;

    .line 204
    .line 205
    invoke-direct {v1, v0}, Lx51;-><init>(Lhw;)V

    .line 206
    .line 207
    .line 208
    iput-object v1, p0, Lkf1;->r:Lu60;

    .line 209
    .line 210
    sput-object p0, Lkf1;->I:Lkf1;

    .line 211
    .line 212
    sget-object v0, Llb0;->a:Llb0;

    .line 213
    .line 214
    invoke-virtual {v0, p0}, Llb0;->g(Lio/github/libxposed/api/XposedModule;)V

    .line 215
    .line 216
    .line 217
    const-string v0, "unknown"

    .line 218
    .line 219
    iput-object v0, p0, Lkf1;->x:Ljava/lang/String;

    .line 220
    .line 221
    const-string v0, ""

    .line 222
    .line 223
    iput-object v0, p0, Lkf1;->y:Ljava/lang/String;

    .line 224
    .line 225
    return-void
.end method

.method public static synthetic A()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->O()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic A0(Lkf1;Landroid/app/Activity;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lkf1;->z0(Landroid/app/Activity;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic B(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkf1;->P0(Landroid/content/DialogInterface;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final B0()V
    .locals 7

    .line 1
    const-string v0, "|"

    .line 2
    .line 3
    const-string v1, "30121|"

    .line 4
    .line 5
    iget-object v2, p0, Lkf1;->u:Ljava/lang/String;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    new-instance v3, Ljava/io/File;

    .line 11
    .line 12
    const-string v4, "files/xp1_scan_suppress"

    .line 13
    .line 14
    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-wide v4, p0, Lkf1;->w:J

    .line 18
    .line 19
    iget-object v2, p0, Lkf1;->x:Ljava/lang/String;

    .line 20
    .line 21
    iget-object p0, p0, Lkf1;->y:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v6, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0, v3}, Lpt;->d0(Ljava/lang/String;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    :catch_0
    :goto_0
    return-void
.end method

.method public static synthetic C()Landroid/os/Handler;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->y0()Landroid/os/Handler;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final C0(Landroid/app/Activity;)V
    .locals 16

    .line 1
    const/4 v0, 0x1

    .line 2
    move-object/from16 v3, p0

    .line 3
    .line 4
    iput-boolean v0, v3, Lkf1;->c:Z

    .line 5
    .line 6
    sget-object v1, Lhn;->a:Lhn;

    .line 7
    .line 8
    invoke-virtual {v1}, Lhn;->L()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v1}, Lhn;->K()Lrn$a;

    .line 16
    .line 17
    .line 18
    move-result-object v8

    .line 19
    if-nez v8, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-direct {v3}, Lkf1;->N0()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    :goto_0
    return-void

    .line 29
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v4, v2, Landroid/util/DisplayMetrics;->density:F

    .line 38
    .line 39
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    .line 48
    .line 49
    and-int/lit8 v2, v2, 0x30

    .line 50
    .line 51
    const/16 v5, 0x20

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    if-ne v2, v5, :cond_3

    .line 55
    .line 56
    move v2, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move v2, v6

    .line 59
    :goto_1
    const/4 v5, -0x1

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    const/16 v7, 0xff

    .line 63
    .line 64
    const/16 v9, 0x23

    .line 65
    .line 66
    const/16 v10, 0x1e

    .line 67
    .line 68
    invoke-static {v7, v10, v10, v9}, Landroid/graphics/Color;->argb(IIII)I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move v7, v5

    .line 74
    :goto_2
    if-eqz v2, :cond_5

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    const/high16 v5, -0x1000000

    .line 78
    .line 79
    :goto_3
    if-eqz v2, :cond_6

    .line 80
    .line 81
    const/16 v2, 0xd2

    .line 82
    .line 83
    const/16 v9, 0xc8

    .line 84
    .line 85
    invoke-static {v9, v9, v9, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    :goto_4
    move v11, v2

    .line 90
    goto :goto_5

    .line 91
    :cond_6
    const v2, -0x777778

    .line 92
    .line 93
    .line 94
    goto :goto_4

    .line 95
    :goto_5
    invoke-virtual {v8}, Lrn$a;->U()I

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    invoke-virtual {v8}, Lrn$a;->B()I

    .line 100
    .line 101
    .line 102
    move-result v13

    .line 103
    sub-int v14, v12, v13

    .line 104
    .line 105
    if-lt v13, v12, :cond_7

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_7
    move v0, v6

    .line 109
    :goto_6
    invoke-virtual {v1}, Lhn;->O()J

    .line 110
    .line 111
    .line 112
    move-result-wide v9

    .line 113
    invoke-direct {v3}, Lkf1;->i0()Landroid/os/Handler;

    .line 114
    .line 115
    .line 116
    move-result-object v15

    .line 117
    new-instance v1, Lif1;

    .line 118
    .line 119
    move-object/from16 v2, p1

    .line 120
    .line 121
    move v6, v7

    .line 122
    move v7, v0

    .line 123
    invoke-direct/range {v1 .. v14}, Lif1;-><init>(Landroid/app/Activity;Lkf1;FIIZLrn$a;JIIII)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v15, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method private static final D()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/16 v2, 0x52

    .line 6
    .line 7
    filled-new-array {v1, v2}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private static final D0(Landroid/app/Activity;Lkf1;FIIZLrn$a;ZJIIII)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    move/from16 v6, p2

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Landroid/widget/LinearLayout;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 28
    .line 29
    .line 30
    const/16 v3, 0x11

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 33
    .line 34
    .line 35
    const/16 v4, 0x10

    .line 36
    .line 37
    invoke-direct {v5, v4, v6}, Lkf1;->d0(IF)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    invoke-virtual {v0, v2, v2, v2, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 42
    .line 43
    .line 44
    new-instance v4, Landroid/widget/TextView;

    .line 45
    .line 46
    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 47
    .line 48
    .line 49
    const-string v7, "\u6316\u7ea2\u85af\u5440-WHS"

    .line 50
    .line 51
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    const/high16 v7, 0x41b00000    # 22.0f

    .line 55
    .line 56
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 57
    .line 58
    .line 59
    move/from16 v7, p3

    .line 60
    .line 61
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 62
    .line 63
    .line 64
    sget-object v8, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 65
    .line 66
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    new-instance v4, Landroid/widget/TextView;

    .line 73
    .line 74
    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 75
    .line 76
    .line 77
    const-string v9, "3.0"

    .line 78
    .line 79
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    const/high16 v9, 0x41500000    # 13.0f

    .line 83
    .line 84
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 85
    .line 86
    .line 87
    const/4 v9, -0x1

    .line 88
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 95
    .line 96
    .line 97
    new-instance v8, Landroid/graphics/drawable/GradientDrawable;

    .line 98
    .line 99
    invoke-direct {v8}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 103
    .line 104
    .line 105
    const/4 v9, 0x4

    .line 106
    invoke-direct {v5, v9, v6}, Lkf1;->d0(IF)I

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    int-to-float v9, v9

    .line 111
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 112
    .line 113
    .line 114
    const/16 v9, 0x96

    .line 115
    .line 116
    const/16 v10, 0xf3

    .line 117
    .line 118
    const/16 v11, 0xff

    .line 119
    .line 120
    const/16 v12, 0x21

    .line 121
    .line 122
    invoke-static {v11, v12, v9, v10}, Landroid/graphics/Color;->argb(IIII)I

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    invoke-virtual {v8, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 130
    .line 131
    .line 132
    const/16 v8, 0x8

    .line 133
    .line 134
    invoke-direct {v5, v8, v6}, Lkf1;->d0(IF)I

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    const/4 v10, 0x3

    .line 139
    invoke-direct {v5, v10, v6}, Lkf1;->d0(IF)I

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    invoke-direct {v5, v8, v6}, Lkf1;->d0(IF)I

    .line 144
    .line 145
    .line 146
    move-result v12

    .line 147
    invoke-direct {v5, v10, v6}, Lkf1;->d0(IF)I

    .line 148
    .line 149
    .line 150
    move-result v10

    .line 151
    invoke-virtual {v4, v9, v11, v12, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 152
    .line 153
    .line 154
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 155
    .line 156
    const/4 v10, -0x2

    .line 157
    invoke-direct {v9, v10, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 158
    .line 159
    .line 160
    invoke-direct {v5, v8, v6}, Lkf1;->d0(IF)I

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    invoke-virtual {v9, v10, v2, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 171
    .line 172
    .line 173
    new-instance v4, Landroid/widget/TextView;

    .line 174
    .line 175
    invoke-direct {v4, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 176
    .line 177
    .line 178
    const-string v9, "\u60a8\u597d\u5440\uff0c\u6316\u5440\u6316\u5440\u6316..."

    .line 179
    .line 180
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    const/high16 v9, 0x41900000    # 18.0f

    .line 184
    .line 185
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextSize(F)V

    .line 186
    .line 187
    .line 188
    const-string v9, "#E65100"

    .line 189
    .line 190
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 191
    .line 192
    .line 193
    move-result v9

    .line 194
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 198
    .line 199
    .line 200
    invoke-direct {v5, v8, v6}, Lkf1;->d0(IF)I

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    const/16 v10, 0xc

    .line 205
    .line 206
    invoke-direct {v5, v10, v6}, Lkf1;->d0(IF)I

    .line 207
    .line 208
    .line 209
    move-result v10

    .line 210
    invoke-virtual {v4, v2, v9, v2, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 211
    .line 212
    .line 213
    new-instance v9, Landroid/widget/ProgressBar;

    .line 214
    .line 215
    invoke-direct {v9, v1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    .line 216
    .line 217
    .line 218
    const/4 v10, 0x1

    .line 219
    invoke-virtual {v9, v10}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 220
    .line 221
    .line 222
    const/16 v11, 0x28

    .line 223
    .line 224
    invoke-direct {v5, v11, v6}, Lkf1;->d0(IF)I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    invoke-direct {v5, v8, v6}, Lkf1;->d0(IF)I

    .line 229
    .line 230
    .line 231
    move-result v13

    .line 232
    invoke-direct {v5, v11, v6}, Lkf1;->d0(IF)I

    .line 233
    .line 234
    .line 235
    move-result v11

    .line 236
    invoke-direct {v5, v8, v6}, Lkf1;->d0(IF)I

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    invoke-virtual {v9, v12, v13, v11, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 241
    .line 242
    .line 243
    new-instance v8, Landroid/widget/LinearLayout;

    .line 244
    .line 245
    invoke-direct {v8, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v8, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v8, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 252
    .line 253
    .line 254
    move/from16 v15, p4

    .line 255
    .line 256
    invoke-virtual {v8, v15}, Landroid/view/View;->setBackgroundColor(I)V

    .line 257
    .line 258
    .line 259
    const/16 v3, 0x20

    .line 260
    .line 261
    invoke-direct {v5, v3, v6}, Lkf1;->d0(IF)I

    .line 262
    .line 263
    .line 264
    move-result v10

    .line 265
    const/16 v11, 0x18

    .line 266
    .line 267
    invoke-direct {v5, v11, v6}, Lkf1;->d0(IF)I

    .line 268
    .line 269
    .line 270
    move-result v12

    .line 271
    invoke-direct {v5, v3, v6}, Lkf1;->d0(IF)I

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    invoke-direct {v5, v11, v6}, Lkf1;->d0(IF)I

    .line 276
    .line 277
    .line 278
    move-result v11

    .line 279
    invoke-virtual {v8, v10, v12, v3, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v8, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 289
    .line 290
    .line 291
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 292
    .line 293
    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v8}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    if-eqz v3, :cond_1

    .line 316
    .line 317
    new-instance v4, Landroid/graphics/drawable/ColorDrawable;

    .line 318
    .line 319
    invoke-direct {v4, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3, v4}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 323
    .line 324
    .line 325
    :cond_1
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 326
    .line 327
    .line 328
    const/16 v2, 0x1c

    .line 329
    .line 330
    invoke-direct {v5, v0, v2, v6}, Lkf1;->L0(Landroid/app/AlertDialog;IF)V

    .line 331
    .line 332
    .line 333
    invoke-direct {v5}, Lkf1;->i0()Landroid/os/Handler;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    move-object v3, v2

    .line 338
    move-object v2, v0

    .line 339
    new-instance v0, Lgf1;

    .line 340
    .line 341
    move-object/from16 v4, p6

    .line 342
    .line 343
    move/from16 v8, p7

    .line 344
    .line 345
    move-wide/from16 v9, p8

    .line 346
    .line 347
    move/from16 v11, p10

    .line 348
    .line 349
    move/from16 v12, p11

    .line 350
    .line 351
    move/from16 v13, p12

    .line 352
    .line 353
    move/from16 v14, p13

    .line 354
    .line 355
    move-object/from16 v16, v3

    .line 356
    .line 357
    move/from16 v3, p5

    .line 358
    .line 359
    invoke-direct/range {v0 .. v15}, Lgf1;-><init>(Landroid/app/Activity;Landroid/app/AlertDialog;ZLrn$a;Lkf1;FIZJIIIII)V

    .line 360
    .line 361
    .line 362
    const-wide/16 v1, 0x5dc

    .line 363
    .line 364
    move-object/from16 v3, v16

    .line 365
    .line 366
    invoke-virtual {v3, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 367
    .line 368
    .line 369
    :catch_0
    :cond_2
    :goto_0
    return-void
.end method

.method private static final E()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/16 v2, 0x53

    .line 6
    .line 7
    filled-new-array {v1, v2}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private static final E0(Landroid/app/Activity;Landroid/app/AlertDialog;ZLrn$a;Lkf1;FIZJIIIII)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move/from16 v2, p5

    move/from16 v3, p10

    move/from16 v4, p11

    move/from16 v5, p12

    .line 1
    const-string v6, "#FE2C55"

    const-string v7, "\u627e\u5230"

    const-string v8, "\u8017\u65f6 "

    .line 2
    :try_start_0
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v9

    if-nez v9, :cond_16

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v9, :cond_0

    goto/16 :goto_5

    .line 3
    :cond_0
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Landroid/app/Dialog;->dismiss()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    if-eqz p2, :cond_1

    .line 4
    :try_start_2
    const-string v9, "\u2705 \u9002\u914d\u6210\u529f"

    goto :goto_0

    .line 5
    :cond_1
    const-string v9, "\u26a0\ufe0f \u9002\u914d\u4e0d\u5b8c\u6574"

    .line 6
    :goto_0
    new-instance v10, Landroid/widget/LinearLayout;

    invoke-direct {v10, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v11, 0x0

    .line 7
    invoke-virtual {v10, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v12, 0x11

    .line 8
    invoke-virtual {v10, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v13, 0xc

    .line 9
    invoke-direct {v1, v13, v2}, Lkf1;->d0(IF)I

    move-result v13

    invoke-virtual {v10, v11, v11, v11, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 10
    new-instance v13, Landroid/widget/TextView;

    invoke-direct {v13, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 11
    const-string v14, "\u6316\u7ea2\u85af\u5440-WHS"

    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v14, 0x41a00000    # 20.0f

    .line 12
    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setTextSize(F)V

    move/from16 v15, p6

    .line 13
    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    sget-object v15, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 15
    invoke-virtual {v10, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 16
    new-instance v13, Landroid/widget/TextView;

    invoke-direct {v13, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 17
    const-string v14, "3.0"

    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v14, 0x41400000    # 12.0f

    .line 18
    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v14, -0x1

    .line 19
    invoke-virtual {v13, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 20
    invoke-virtual {v13, v15}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 21
    invoke-virtual {v13, v12}, Landroid/widget/TextView;->setGravity(I)V

    .line 22
    new-instance v15, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v15}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 23
    invoke-virtual {v15, v11}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    const/4 v14, 0x4

    .line 24
    invoke-direct {v1, v14, v2}, Lkf1;->d0(IF)I

    move-result v12

    int-to-float v12, v12

    invoke-virtual {v15, v12}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/16 v12, 0x96

    const/16 v14, 0xf3

    const/16 v11, 0xff

    move-object/from16 v16, v6

    const/16 v6, 0x21

    .line 25
    invoke-static {v11, v6, v12, v14}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    invoke-virtual {v15, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 26
    invoke-virtual {v13, v15}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v6, 0x6

    .line 27
    invoke-direct {v1, v6, v2}, Lkf1;->d0(IF)I

    move-result v11

    const/4 v12, 0x2

    invoke-direct {v1, v12, v2}, Lkf1;->d0(IF)I

    move-result v14

    invoke-direct {v1, v6, v2}, Lkf1;->d0(IF)I

    move-result v15

    invoke-direct {v1, v12, v2}, Lkf1;->d0(IF)I

    move-result v12

    invoke-virtual {v13, v11, v14, v15, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 28
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x2

    invoke-direct {v11, v12, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v14, 0x8

    .line 29
    invoke-direct {v1, v14, v2}, Lkf1;->d0(IF)I

    move-result v14

    const/4 v15, 0x0

    invoke-virtual {v11, v14, v15, v15, v15}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 30
    invoke-virtual {v13, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 31
    invoke-virtual {v10, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 32
    new-instance v11, Landroid/widget/TextView;

    invoke-direct {v11, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 33
    invoke-virtual {v11, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v9, 0x41a00000    # 20.0f

    .line 34
    invoke-virtual {v11, v9}, Landroid/widget/TextView;->setTextSize(F)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 35
    const-string v9, "#2E7D32"

    const-string v13, "#E65100"

    if-nez p2, :cond_3

    if-eqz p7, :cond_2

    goto :goto_1

    :cond_2
    :try_start_3
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    :goto_2
    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v14, 0x11

    .line 36
    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setGravity(I)V

    .line 37
    invoke-direct {v1, v6, v2}, Lkf1;->d0(IF)I

    move-result v14

    const/4 v15, 0x4

    invoke-direct {v1, v15, v2}, Lkf1;->d0(IF)I

    move-result v12

    const/4 v15, 0x0

    invoke-virtual {v11, v15, v14, v15, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 38
    new-instance v12, Landroid/widget/TextView;

    invoke-direct {v12, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 39
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v8, v7

    move-wide/from16 v6, p8

    invoke-virtual {v14, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, "ms"

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v12, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41500000    # 13.0f

    .line 40
    invoke-virtual {v12, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 41
    invoke-virtual {v12, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v14, 0x11

    .line 42
    invoke-virtual {v12, v14}, Landroid/widget/TextView;->setGravity(I)V

    .line 43
    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 44
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v15, "\u9897\u79cd\u5b50"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v14, 0x41600000    # 14.0f

    .line 45
    invoke-virtual {v7, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 46
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v15, 0x11

    .line 47
    invoke-virtual {v7, v15}, Landroid/widget/TextView;->setGravity(I)V

    .line 48
    new-instance v15, Landroid/widget/TextView;

    invoke-direct {v15, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 49
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "\u9897\uff0c\u5931\u8d25"

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v8, p13

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "\u9897"

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v15, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v8, 0x41800000    # 16.0f

    .line 50
    invoke-virtual {v15, v8}, Landroid/widget/TextView;->setTextSize(F)V

    if-eqz p2, :cond_4

    .line 51
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    goto :goto_3

    :cond_4
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    :goto_3
    invoke-virtual {v15, v8}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v14, 0x11

    .line 52
    invoke-virtual {v15, v14}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v8, 0x4

    .line 53
    invoke-direct {v1, v8, v2}, Lkf1;->d0(IF)I

    move-result v9

    invoke-direct {v1, v8, v2}, Lkf1;->d0(IF)I

    move-result v13

    const/4 v8, 0x0

    invoke-virtual {v15, v8, v9, v8, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 54
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    if-nez p2, :cond_14

    .line 55
    const-string v9, "\u672a\u627e\u5230\u7684\u76ee\u6807:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    invoke-virtual/range {p3 .. p3}, Lrn$a;->E()Ljava/lang/Class;

    move-result-object v9
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    const-string v13, "\n- "

    if-nez v9, :cond_5

    :try_start_4
    invoke-direct {v1}, Lkf1;->k0()Ljava/lang/String;

    move-result-object v9

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    :cond_5
    invoke-virtual/range {p3 .. p3}, Lrn$a;->K()Ljava/lang/Class;

    move-result-object v9

    if-nez v9, :cond_6

    invoke-direct {v1}, Lkf1;->n0()Ljava/lang/String;

    move-result-object v9

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    :cond_6
    invoke-virtual/range {p3 .. p3}, Lrn$a;->F()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-direct {v1}, Lkf1;->o0()Ljava/lang/String;

    move-result-object v9

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    :cond_7
    invoke-virtual/range {p3 .. p3}, Lrn$a;->I()Ljava/lang/Class;

    move-result-object v9

    if-nez v9, :cond_8

    invoke-direct {v1}, Lkf1;->p0()Ljava/lang/String;

    move-result-object v9

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    :cond_8
    invoke-virtual/range {p3 .. p3}, Lrn$a;->V()Ljava/lang/Class;

    move-result-object v9

    if-nez v9, :cond_9

    invoke-direct {v1}, Lkf1;->q0()Ljava/lang/String;

    move-result-object v9

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    :cond_9
    invoke-virtual/range {p3 .. p3}, Lrn$a;->J()Ljava/lang/Class;

    move-result-object v9

    if-nez v9, :cond_a

    invoke-direct {v1}, Lkf1;->r0()Ljava/lang/String;

    move-result-object v9

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    :cond_a
    invoke-virtual/range {p3 .. p3}, Lrn$a;->C()Ljava/lang/Class;

    move-result-object v9

    if-nez v9, :cond_b

    invoke-direct {v1}, Lkf1;->s0()Ljava/lang/String;

    move-result-object v9

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    :cond_b
    invoke-virtual/range {p3 .. p3}, Lrn$a;->y()Ljava/lang/Class;

    move-result-object v9

    if-nez v9, :cond_c

    invoke-direct {v1}, Lkf1;->t0()Ljava/lang/String;

    move-result-object v9

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    :cond_c
    invoke-virtual/range {p3 .. p3}, Lrn$a;->S()Ljava/lang/Class;

    move-result-object v9

    if-nez v9, :cond_d

    invoke-direct {v1}, Lkf1;->u0()Ljava/lang/String;

    move-result-object v9

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    :cond_d
    invoke-virtual/range {p3 .. p3}, Lrn$a;->O()Ljava/lang/Class;

    move-result-object v9

    if-nez v9, :cond_e

    invoke-direct {v1}, Lkf1;->l0()Ljava/lang/String;

    move-result-object v9

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    :cond_e
    invoke-virtual/range {p3 .. p3}, Lrn$a;->D()Ljava/lang/Class;

    move-result-object v9

    if-nez v9, :cond_f

    invoke-direct {v1}, Lkf1;->m0()Ljava/lang/String;

    move-result-object v9

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    :cond_f
    invoke-virtual/range {p3 .. p3}, Lrn$a;->T()Ljava/lang/Class;

    move-result-object v9

    if-nez v9, :cond_10

    const-string v9, "\n- \u4fa7\u8fb9\u680f\u6570\u636e\u6a21\u578b"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    :cond_10
    invoke-virtual/range {p3 .. p3}, Lrn$a;->Q()Ljava/lang/Class;

    move-result-object v9

    if-nez v9, :cond_11

    const-string v9, "\n- \u8bbe\u7f6e\u9875\u6761\u76ee\u6a21\u578b"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    :cond_11
    invoke-virtual/range {p3 .. p3}, Lrn$a;->P()Ljava/lang/Class;

    move-result-object v9

    if-nez v9, :cond_12

    const-string v9, "\n- \u8bbe\u7f6e\u9875\u6761\u76ee\u7c7b\u578b"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    :cond_12
    invoke-virtual/range {p3 .. p3}, Lrn$a;->R()Ljava/lang/Class;

    move-result-object v9

    if-nez v9, :cond_13

    const-string v9, "\n- \u8bbe\u7f6e\u9875\u57cb\u70b9\u6570\u636e"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    :cond_13
    const-string v9, "\n\n\u8bf7\u53cd\u9988\u7ed9\u4f5c\u8005\u66f4\u65b0\u9002\u914d"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 72
    :cond_14
    const-string v9, "\u8bf7\u91cd\u542f\u5c0f\u7ea2\u4e66\u4ee5\u751f\u6548Hook"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    :goto_4
    new-instance v9, Landroid/widget/TextView;

    invoke-direct {v9, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 74
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    invoke-virtual {v9, v6}, Landroid/widget/TextView;->setTextSize(F)V

    .line 76
    invoke-virtual {v9, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v14, 0x11

    .line 77
    invoke-virtual {v9, v14}, Landroid/widget/TextView;->setGravity(I)V

    const/16 v3, 0x10

    .line 78
    invoke-direct {v1, v3, v2}, Lkf1;->d0(IF)I

    move-result v6

    const/4 v8, 0x6

    invoke-direct {v1, v8, v2}, Lkf1;->d0(IF)I

    move-result v13

    move-object v8, v15

    invoke-direct {v1, v3, v2}, Lkf1;->d0(IF)I

    move-result v14

    const/4 v15, 0x4

    invoke-direct {v1, v15, v2}, Lkf1;->d0(IF)I

    move-result v15

    invoke-virtual {v9, v6, v13, v14, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 79
    new-instance v6, Landroid/widget/ProgressBar;

    const/4 v13, 0x0

    const v14, 0x1010078

    invoke-direct {v6, v0, v13, v14}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v15, 0x0

    .line 80
    invoke-virtual {v6, v15}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    .line 81
    invoke-virtual {v6, v4}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 82
    invoke-virtual {v6, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    const/16 v4, 0x28

    .line 83
    invoke-direct {v1, v4, v2}, Lkf1;->d0(IF)I

    move-result v5

    const/4 v15, 0x6

    invoke-direct {v1, v15, v2}, Lkf1;->d0(IF)I

    move-result v13

    invoke-direct {v1, v4, v2}, Lkf1;->d0(IF)I

    move-result v4

    invoke-direct {v1, v15, v2}, Lkf1;->d0(IF)I

    move-result v14

    invoke-virtual {v6, v5, v13, v4, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 84
    new-instance v4, Lzt0;

    .line 85
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 86
    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v13, 0x1

    .line 87
    invoke-virtual {v5, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v14, 0x11

    .line 88
    invoke-virtual {v5, v14}, Landroid/widget/LinearLayout;->setGravity(I)V

    move/from16 v14, p14

    .line 89
    invoke-virtual {v5, v14}, Landroid/view/View;->setBackgroundColor(I)V

    const/16 v14, 0x18

    .line 90
    invoke-direct {v1, v14, v2}, Lkf1;->d0(IF)I

    move-result v15

    const/16 v13, 0x14

    invoke-direct {v1, v13, v2}, Lkf1;->d0(IF)I

    move-result v13

    move-object/from16 p3, v4

    invoke-direct {v1, v14, v2}, Lkf1;->d0(IF)I

    move-result v4

    invoke-direct {v1, v3, v2}, Lkf1;->d0(IF)I

    move-result v3

    invoke-virtual {v5, v15, v13, v4, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 91
    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 92
    invoke-virtual {v5, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 93
    invoke-virtual {v5, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 94
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 95
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 96
    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 97
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 98
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v15, 0x0

    .line 99
    invoke-virtual {v3, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v4, 0x11

    .line 100
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v4, 0xa

    .line 101
    invoke-direct {v1, v4, v2}, Lkf1;->d0(IF)I

    move-result v6

    invoke-virtual {v3, v15, v6, v15, v15}, Landroid/view/View;->setPadding(IIII)V

    .line 102
    new-instance v6, Landroid/widget/Button;

    invoke-direct {v6, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 103
    const-string v7, "\u7acb\u5373\u91cd\u542f"

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v7, 0x41600000    # 14.0f

    .line 104
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v7, -0x1

    .line 105
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 106
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v15, 0x0

    .line 107
    invoke-virtual {v7, v15}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 108
    invoke-direct {v1, v14, v2}, Lkf1;->d0(IF)I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v7, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 109
    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 110
    invoke-virtual {v6, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 111
    new-instance v7, Lff1;

    move-object/from16 v8, p3

    const/4 v9, 0x0

    invoke-direct {v7, v8, v1, v9}, Lff1;-><init>(Lzt0;Lkf1;I)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 112
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v10, 0x2c

    .line 113
    invoke-direct {v1, v10, v2}, Lkf1;->d0(IF)I

    move-result v11

    const/high16 v12, 0x3f800000    # 1.0f

    .line 114
    invoke-direct {v7, v9, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/4 v15, 0x6

    .line 115
    invoke-direct {v1, v15, v2}, Lkf1;->d0(IF)I

    move-result v11

    invoke-virtual {v7, v9, v9, v11, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 116
    invoke-virtual {v3, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    new-instance v6, Landroid/widget/Button;

    invoke-direct {v6, v0}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 118
    const-string v7, "\u7a0d\u540e\u91cd\u542f"

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v7, 0x41600000    # 14.0f

    .line 119
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 120
    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 121
    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v9, 0x0

    .line 122
    invoke-virtual {v7, v9}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 123
    invoke-direct {v1, v14, v2}, Lkf1;->d0(IF)I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v7, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/4 v9, 0x1

    .line 124
    invoke-direct {v1, v9, v2}, Lkf1;->d0(IF)I

    move-result v11

    invoke-static/range {v16 .. v16}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v7, v11, v9}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    const/4 v9, 0x0

    .line 125
    invoke-virtual {v7, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 126
    invoke-virtual {v6, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 127
    new-instance v7, Lff1;

    const/4 v9, 0x1

    invoke-direct {v7, v8, v1, v9}, Lff1;-><init>(Lzt0;Lkf1;I)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 129
    invoke-direct {v1, v10, v2}, Lkf1;->d0(IF)I

    move-result v9

    const/4 v10, 0x0

    .line 130
    invoke-direct {v7, v10, v9, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/4 v15, 0x6

    .line 131
    invoke-direct {v1, v15, v2}, Lkf1;->d0(IF)I

    move-result v9

    invoke-virtual {v7, v9, v10, v10, v10}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 132
    invoke-virtual {v3, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 133
    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v7, 0x118

    .line 134
    invoke-direct {v1, v7, v2}, Lkf1;->d0(IF)I

    move-result v7

    const/4 v9, -0x2

    .line 135
    invoke-direct {v6, v7, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 136
    invoke-direct {v1, v4, v2}, Lkf1;->d0(IF)I

    move-result v4

    iput v4, v6, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    const/16 v14, 0x11

    .line 137
    iput v14, v6, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 138
    invoke-virtual {v5, v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 139
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 140
    invoke-virtual {v3, v5}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v15, 0x0

    .line 141
    invoke-virtual {v0, v15}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 142
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 143
    invoke-virtual {v0, v15}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 144
    iput-object v0, v8, Lzt0;->d:Ljava/lang/Object;

    .line 145
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_15

    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v3, v15}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 146
    :cond_15
    iget-object v0, v8, Lzt0;->d:Ljava/lang/Object;

    check-cast v0, Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 147
    iget-object v0, v8, Lzt0;->d:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Landroid/app/AlertDialog;

    const/16 v3, 0x1c

    invoke-direct {v1, v0, v3, v2}, Lkf1;->L0(Landroid/app/AlertDialog;IF)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    :cond_16
    :goto_5
    return-void
.end method

.method private static final F()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/16 v2, 0x49

    .line 6
    .line 7
    filled-new-array {v1, v2}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private static final F0(Lzt0;Lkf1;Landroid/view/View;)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Lzt0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/app/AlertDialog;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    :catch_0
    :cond_0
    invoke-direct {p1}, Lkf1;->B0()V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private static final G()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/16 v2, 0x4a

    .line 6
    .line 7
    filled-new-array {v1, v2}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private static final G0(Lzt0;Lkf1;Landroid/view/View;)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Lzt0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/app/AlertDialog;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    :catch_0
    :cond_0
    invoke-direct {p1}, Lkf1;->B0()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final H()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/16 v2, 0x4b

    .line 6
    .line 7
    filled-new-array {v1, v2}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private static final H0(Lkf1;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface/range {p1 .. p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface/range {p1 .. p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    instance-of v3, v2, Landroid/app/Activity;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    check-cast v2, Landroid/app/Activity;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v2, v4

    .line 23
    :goto_0
    if-nez v2, :cond_1

    .line 24
    .line 25
    goto/16 :goto_6

    .line 26
    .line 27
    :cond_1
    const/4 v3, 0x1

    .line 28
    :try_start_0
    iget-boolean v5, v0, Lkf1;->C:Z

    .line 29
    .line 30
    if-eqz v5, :cond_2

    .line 31
    .line 32
    invoke-direct {v0, v2}, Lkf1;->O0(Landroid/app/Activity;)V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_2
    iget-boolean v5, v0, Lkf1;->D:Z

    .line 37
    .line 38
    if-nez v5, :cond_b

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    iget-object v6, v0, Lkf1;->v:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v5, v6}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_b

    .line 51
    .line 52
    iput-boolean v3, v0, Lkf1;->D:Z

    .line 53
    .line 54
    invoke-direct {v0, v2}, Lkf1;->K0(Landroid/app/Activity;)Landroid/content/pm/PackageInfo;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    if-eqz v5, :cond_3

    .line 59
    .line 60
    iget-object v6, v5, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 61
    .line 62
    if-eqz v6, :cond_3

    .line 63
    .line 64
    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    move-object v6, v4

    .line 68
    :goto_1
    iput-object v6, v0, Lkf1;->t:Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v5, :cond_4

    .line 71
    .line 72
    iget-object v6, v5, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 73
    .line 74
    if-eqz v6, :cond_4

    .line 75
    .line 76
    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move-object v6, v4

    .line 80
    :goto_2
    iput-object v6, v0, Lkf1;->u:Ljava/lang/String;

    .line 81
    .line 82
    const-wide/16 v6, 0x0

    .line 83
    .line 84
    if-eqz v5, :cond_5

    .line 85
    .line 86
    invoke-virtual {v5}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 87
    .line 88
    .line 89
    move-result-wide v8

    .line 90
    goto :goto_3

    .line 91
    :cond_5
    move-wide v8, v6

    .line 92
    :goto_3
    iput-wide v8, v0, Lkf1;->w:J

    .line 93
    .line 94
    cmp-long v8, v8, v6

    .line 95
    .line 96
    if-nez v8, :cond_6

    .line 97
    .line 98
    if-eqz v5, :cond_6

    .line 99
    .line 100
    iget v8, v5, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 101
    .line 102
    int-to-long v8, v8

    .line 103
    iput-wide v8, v0, Lkf1;->w:J

    .line 104
    .line 105
    :cond_6
    if-eqz v5, :cond_7

    .line 106
    .line 107
    iget-object v5, v5, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 108
    .line 109
    if-nez v5, :cond_8

    .line 110
    .line 111
    :cond_7
    const-string v5, "unknown"

    .line 112
    .line 113
    :cond_8
    iput-object v5, v0, Lkf1;->x:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 114
    .line 115
    :try_start_1
    new-instance v5, Ljava/io/File;

    .line 116
    .line 117
    iget-object v8, v0, Lkf1;->t:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-direct {v5, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    .line 126
    .line 127
    .line 128
    move-result-wide v8

    .line 129
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 130
    .line 131
    .line 132
    move-result-wide v10

    .line 133
    new-instance v5, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v8, "_"

    .line 142
    .line 143
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 153
    goto :goto_4

    .line 154
    :catch_0
    :try_start_2
    const-string v5, ""

    .line 155
    .line 156
    :goto_4
    iput-object v5, v0, Lkf1;->y:Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v0, v4, v3, v4}, Lkf1;->c0(Lkf1;Ljava/lang/String;ILjava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    iput-boolean v4, v0, Lkf1;->z:Z

    .line 163
    .line 164
    if-eqz v4, :cond_9

    .line 165
    .line 166
    iput-boolean v3, v0, Lkf1;->C:Z

    .line 167
    .line 168
    sput-boolean v3, Lkf1;->J:Z

    .line 169
    .line 170
    sget-object v4, Lhn;->a:Lhn;

    .line 171
    .line 172
    invoke-virtual {v4}, Lhn;->G()V

    .line 173
    .line 174
    .line 175
    sget-object v4, Lue0;->a:Lue0;

    .line 176
    .line 177
    invoke-virtual {v4}, Lue0;->c()V

    .line 178
    .line 179
    .line 180
    goto/16 :goto_6

    .line 181
    .line 182
    :cond_9
    iget-object v9, v0, Lkf1;->t:Ljava/lang/String;

    .line 183
    .line 184
    if-eqz v9, :cond_a

    .line 185
    .line 186
    iget-object v10, v0, Lkf1;->u:Ljava/lang/String;

    .line 187
    .line 188
    if-eqz v10, :cond_a

    .line 189
    .line 190
    iget-object v4, v0, Lkf1;->s:Ljava/lang/ClassLoader;

    .line 191
    .line 192
    if-eqz v4, :cond_a

    .line 193
    .line 194
    sget-object v8, Lhn;->a:Lhn;

    .line 195
    .line 196
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    iget-object v11, v0, Lkf1;->s:Ljava/lang/ClassLoader;

    .line 200
    .line 201
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    iget-wide v12, v0, Lkf1;->w:J

    .line 205
    .line 206
    iget-object v14, v0, Lkf1;->x:Ljava/lang/String;

    .line 207
    .line 208
    iget-object v4, v0, Lkf1;->y:Ljava/lang/String;

    .line 209
    .line 210
    const/16 v15, 0x75a9

    .line 211
    .line 212
    move-object/from16 v16, v4

    .line 213
    .line 214
    invoke-virtual/range {v8 .. v16}, Lhn;->M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;JLjava/lang/String;ILjava/lang/String;)Lrn$a;

    .line 215
    .line 216
    .line 217
    :cond_a
    iget-wide v4, v0, Lkf1;->w:J

    .line 218
    .line 219
    cmp-long v6, v4, v6

    .line 220
    .line 221
    if-lez v6, :cond_b

    .line 222
    .line 223
    sget-object v6, Ltu0;->a:Ltu0;

    .line 224
    .line 225
    invoke-virtual {v6, v4, v5}, Ltu0;->d(J)Z

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    if-nez v4, :cond_b

    .line 230
    .line 231
    iput-boolean v3, v0, Lkf1;->A:Z

    .line 232
    .line 233
    sput-boolean v3, Lkf1;->J:Z

    .line 234
    .line 235
    sget-object v4, Lhn;->a:Lhn;

    .line 236
    .line 237
    invoke-virtual {v4}, Lhn;->G()V

    .line 238
    .line 239
    .line 240
    sget-object v4, Lue0;->a:Lue0;

    .line 241
    .line 242
    invoke-virtual {v4}, Lue0;->c()V

    .line 243
    .line 244
    .line 245
    invoke-direct {v0, v2}, Lkf1;->Q0(Landroid/app/Activity;)V

    .line 246
    .line 247
    .line 248
    goto :goto_6

    .line 249
    :cond_b
    iget-boolean v4, v0, Lkf1;->A:Z

    .line 250
    .line 251
    if-eqz v4, :cond_c

    .line 252
    .line 253
    invoke-direct {v0, v2}, Lkf1;->Q0(Landroid/app/Activity;)V

    .line 254
    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_c
    sget-object v4, Lc2;->j:Lc2$a;

    .line 258
    .line 259
    invoke-virtual {v4, v2}, Lc2$a;->g(Landroid/app/Activity;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 260
    .line 261
    .line 262
    :catch_1
    sget-object v4, Lc2;->j:Lc2$a;

    .line 263
    .line 264
    invoke-virtual {v4, v2}, Lc2$a;->f(Landroid/content/Context;)Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-nez v4, :cond_d

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_d
    iget-boolean v4, v0, Lkf1;->F:Z

    .line 272
    .line 273
    if-nez v4, :cond_e

    .line 274
    .line 275
    iget-boolean v4, v0, Lkf1;->E:Z

    .line 276
    .line 277
    if-nez v4, :cond_e

    .line 278
    .line 279
    iput-boolean v3, v0, Lkf1;->F:Z

    .line 280
    .line 281
    sget-object v3, Lwb1;->a:Lwb1;

    .line 282
    .line 283
    iget-wide v4, v0, Lkf1;->w:J

    .line 284
    .line 285
    new-instance v6, Lc;

    .line 286
    .line 287
    const/16 v7, 0x19

    .line 288
    .line 289
    invoke-direct {v6, v7, v0, v2}, Lc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3, v2, v4, v5, v6}, Lwb1;->s(Landroid/content/Context;JLsw;)V

    .line 293
    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_e
    iget-boolean v3, v0, Lkf1;->E:Z

    .line 297
    .line 298
    if-nez v3, :cond_f

    .line 299
    .line 300
    iget-boolean v3, v0, Lkf1;->a:Z

    .line 301
    .line 302
    if-nez v3, :cond_f

    .line 303
    .line 304
    invoke-direct {v0, v2}, Lkf1;->V(Landroid/app/Activity;)V

    .line 305
    .line 306
    .line 307
    :cond_f
    :goto_5
    iget-boolean v3, v0, Lkf1;->c:Z

    .line 308
    .line 309
    if-nez v3, :cond_10

    .line 310
    .line 311
    invoke-direct {v0, v2}, Lkf1;->C0(Landroid/app/Activity;)V

    .line 312
    .line 313
    .line 314
    :cond_10
    :goto_6
    return-object v1
.end method

.method private static final I()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/16 v2, 0x4c

    .line 6
    .line 7
    filled-new-array {v1, v2}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private static final I0(Lkf1;Landroid/app/Activity;Z)Lna1;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lkf1;->F:Z

    .line 3
    .line 4
    iput-boolean p2, p0, Lkf1;->E:Z

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    sget-object p1, Llb0;->a:Llb0;

    .line 9
    .line 10
    invoke-direct {p0}, Lkf1;->x0()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string p2, "vc blocked"

    .line 15
    .line 16
    invoke-virtual {p1, p0, p2}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-boolean p2, p0, Lkf1;->a:Z

    .line 21
    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    invoke-direct {p0, p1}, Lkf1;->V(Landroid/app/Activity;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    sget-object p0, Lna1;->a:Lna1;

    .line 28
    .line 29
    return-object p0
.end method

.method private static final J()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/16 v2, 0x4d

    .line 6
    .line 7
    filled-new-array {v1, v2}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private final J0(Landroid/app/Activity;)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p0, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-wide v2, v0

    .line 24
    :goto_0
    cmp-long p1, v2, v0

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    iget p0, p0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    int-to-long p0, p0

    .line 33
    return-wide p0

    .line 34
    :cond_1
    return-wide v2

    .line 35
    :catch_0
    return-wide v0
.end method

.method private static final K()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/16 v2, 0x4e

    .line 6
    .line 7
    filled-new-array {v1, v2}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private final K0(Landroid/app/Activity;)Landroid/content/pm/PackageInfo;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-object p0

    .line 15
    :catch_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method private static final L()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/16 v2, 0x4f

    .line 6
    .line 7
    filled-new-array {v1, v2}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private final L0(Landroid/app/AlertDialog;IF)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    new-instance v0, Ldf1;

    .line 14
    .line 15
    invoke-direct {v0, p2, p3, p1}, Ldf1;-><init>(IFLandroid/app/AlertDialog;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private static final M()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/16 v2, 0x50

    .line 6
    .line 7
    filled-new-array {v1, v2}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private static final M0(IFLandroid/app/AlertDialog;)V
    .locals 0

    .line 1
    int-to-float p0, p0

    .line 2
    mul-float/2addr p0, p1

    .line 3
    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-virtual {p1, p2}, Landroid/view/View;->setClipToOutline(Z)V

    .line 17
    .line 18
    .line 19
    new-instance p2, Lkf1$b;

    .line 20
    .line 21
    invoke-direct {p2, p0}, Lkf1$b;-><init>(F)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method private static final N()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/16 v2, 0x51

    .line 6
    .line 7
    filled-new-array {v1, v2}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private final N0()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lkf1;->u:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_1

    .line 7
    .line 8
    :cond_0
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 9
    .line 10
    const-string v3, "files/xp1_scan_suppress"

    .line 11
    .line 12
    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :cond_1
    invoke-static {v2}, Lpt;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v2, "|"

    .line 28
    .line 29
    filled-new-array {v2}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const/4 v3, 0x6

    .line 34
    invoke-static {v0, v2, v3}, Lk41;->e0(Ljava/lang/String;[Ljava/lang/String;I)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v3, 0x3

    .line 43
    if-ge v2, v3, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v2}, Lr41;->T(Ljava/lang/String;)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-eqz v2, :cond_5

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const/4 v4, 0x1

    .line 63
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v5}, Lr41;->U(Ljava/lang/String;)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    if-eqz v5, :cond_5

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v5

    .line 79
    const/4 v7, 0x2

    .line 80
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Ljava/lang/String;

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    const/4 v9, 0x4

    .line 91
    if-lt v8, v9, :cond_3

    .line 92
    .line 93
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Ljava/lang/String;

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    const-string v0, ""

    .line 101
    .line 102
    :goto_0
    const/16 v3, 0x75a9

    .line 103
    .line 104
    if-ne v2, v3, :cond_5

    .line 105
    .line 106
    iget-wide v2, p0, Lkf1;->w:J

    .line 107
    .line 108
    cmp-long v2, v5, v2

    .line 109
    .line 110
    if-nez v2, :cond_5

    .line 111
    .line 112
    iget-object v2, p0, Lkf1;->x:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v7, v2}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_5

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-lez v2, :cond_4

    .line 125
    .line 126
    iget-object v2, p0, Lkf1;->y:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-lez v2, :cond_4

    .line 133
    .line 134
    iget-object p0, p0, Lkf1;->y:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    if-nez p0, :cond_4

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_4
    return v4

    .line 144
    :catch_0
    :cond_5
    :goto_1
    return v1
.end method

.method private static final O()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    new-array v1, v1, [I

    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :array_0
    .array-data 4
        0x28
        0x17
        0x1d
        0x1f
        0x33
        0x11
        0x1e
        0x56
        0x22
        0x16
        0x5e
        0x49
        0x23
        0xb
    .end array-data
.end method

.method private final O0(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const-string p0, "\u4e0d\u652f\u6301\u8c37\u6b4c\u5546\u5e97\u6e20\u9053\u7248\u672c\uff0c\u8bf7\u6362\u6210\u6a21\u5757\u9002\u914d\u7684\u5bf9\u5e94\u7248\u672c\u53f7\u7684\u56fd\u5185\u7248\u3002\n\n\u63a8\u8350\u7248\u672c\uff1a"

    .line 2
    .line 3
    :try_start_0
    sget-object v0, Ltu0;->a:Ltu0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ltu0;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    const-string p1, "\u4e0d\u652f\u6301\u8c37\u6b4c\u5546\u5e97\u7248"

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, "\n\n\u4e0d\u4f1a\u52a0\u8f7d\u4efb\u4f55Hook\u529f\u80fd\u3002"

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p1, p0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string p1, "\u786e\u5b9a"

    .line 42
    .line 43
    new-instance v0, Lef1;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v0, v1}, Lef1;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const/4 p1, 0x0

    .line 54
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    :catch_0
    return-void
.end method

.method private static final P()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x58

    .line 4
    .line 5
    const/16 v2, 0x28

    .line 6
    .line 7
    const/16 v3, 0x13

    .line 8
    .line 9
    const/16 v4, 0x49

    .line 10
    .line 11
    const/16 v5, 0x1c

    .line 12
    .line 13
    filled-new-array {v3, v4, v5, v1, v2}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method private static final P0(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Landroid/os/Process;->killProcess(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final Q()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lik0;->a:Lik0;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    const/16 v2, 0x49

    .line 6
    .line 7
    filled-new-array {v1, v2}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lik0;->a([I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method private final Q0(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const-string v0, "\u5f53\u524d\u5bbf\u4e3b\u7248\u672c\u4e0d\u7b26\u5408\u6a21\u5757\u8981\u6c42\uff0c\u8bf7\u66f4\u65b0\u5230\u63a8\u8350\u7248\u672c\uff1a\n\n"

    .line 2
    .line 3
    iget-boolean v1, p0, Lkf1;->B:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lkf1;->B:Z

    .line 10
    .line 11
    :try_start_0
    sget-object p0, Ltu0;->a:Ltu0;

    .line 12
    .line 13
    invoke-virtual {p0}, Ltu0;->b()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    const-string p1, "\u7248\u672c\u4e0d\u5339\u914d"

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p0, "\n\n\u5176\u4ed6\u7248\u672c\u4e0d\u4f1a\u52a0\u8f7d\u4efb\u4f55Hook\u529f\u80fd\u3002"

    .line 37
    .line 38
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p1, p0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string p1, "\u786e\u5b9a"

    .line 50
    .line 51
    new-instance v0, Lef1;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-direct {v0, v1}, Lef1;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    .line 68
    :catch_0
    :goto_0
    return-void
.end method

.method public static final synthetic R()Z
    .locals 1

    .line 1
    sget-boolean v0, Lkf1;->J:Z

    .line 2
    .line 3
    return v0
.end method

.method private static final R0(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    return-void
.end method

.method public static final synthetic S()Lkf1;
    .locals 1

    .line 1
    sget-object v0, Lkf1;->I:Lkf1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic T(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lkf1;->J:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic U(Lkf1;)V
    .locals 0

    .line 1
    sput-object p0, Lkf1;->I:Lkf1;

    .line 2
    .line 3
    return-void
.end method

.method private final V(Landroid/app/Activity;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lkf1;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iget-object v0, p0, Lkf1;->u:Ljava/lang/String;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_1
    iget-object v1, p0, Lkf1;->s:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_2
    invoke-direct {p0}, Lkf1;->j0()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-nez v3, :cond_3

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_3
    sget-object v2, Lcf1;->a:Lcf1;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Lcf1;->f(Ljava/lang/ClassLoader;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_4

    .line 30
    .line 31
    invoke-virtual {v2, v0, v1}, Lcf1;->c(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    move-object v5, v0

    .line 36
    goto :goto_1

    .line 37
    :cond_4
    const/4 v0, 0x0

    .line 38
    goto :goto_0

    .line 39
    :goto_1
    if-eqz v4, :cond_5

    .line 40
    .line 41
    if-nez v5, :cond_6

    .line 42
    .line 43
    :cond_5
    move-object v6, p0

    .line 44
    move-object v7, p1

    .line 45
    goto :goto_3

    .line 46
    :cond_6
    sget-object v0, Ln90;->a:Ln90;

    .line 47
    .line 48
    invoke-virtual {v0, v3, v5}, Ln90;->J(Landroid/content/Context;Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_7

    .line 53
    .line 54
    sget-object v0, Lm90;->m:Lm90$a;

    .line 55
    .line 56
    new-instance v1, Lhf1;

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    invoke-direct {v1, p0, p1, v2}, Lhf1;-><init>(Lkf1;Landroid/app/Activity;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1, v5, v2, v1}, Lm90$a;->b(Landroid/content/Context;Ljava/lang/String;ZLhw;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_7
    invoke-direct {p0, p1}, Lkf1;->z0(Landroid/app/Activity;)V

    .line 67
    .line 68
    .line 69
    sget-object v1, Lhk0;->a:Lhk0;

    .line 70
    .line 71
    invoke-virtual {v1, p1}, Lhk0;->v(Landroid/content/Context;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v3}, Ln90;->x(Landroid/content/Context;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    if-nez v4, :cond_8

    .line 79
    .line 80
    :goto_2
    return-void

    .line 81
    :cond_8
    new-instance v0, Ljava/lang/Thread;

    .line 82
    .line 83
    new-instance v2, Lca;

    .line 84
    .line 85
    move-object v6, p0

    .line 86
    move-object v7, p1

    .line 87
    invoke-direct/range {v2 .. v7}, Lca;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkf1;Landroid/app/Activity;)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :goto_3
    sget-object p0, Lm90;->m:Lm90$a;

    .line 98
    .line 99
    if-nez v5, :cond_9

    .line 100
    .line 101
    const-string v5, ""

    .line 102
    .line 103
    :cond_9
    new-instance p1, Lhf1;

    .line 104
    .line 105
    const/4 v0, 0x0

    .line 106
    invoke-direct {p1, v6, v7, v0}, Lhf1;-><init>(Lkf1;Landroid/app/Activity;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v7, v5, v4, p1}, Lm90$a;->b(Landroid/content/Context;Ljava/lang/String;ZLhw;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method private static final W(Lkf1;Landroid/app/Activity;)Lna1;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lkf1;->z0(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lhk0;->a:Lhk0;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lhk0;->v(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lna1;->a:Lna1;

    .line 10
    .line 11
    return-object p0
.end method

.method private static final X(Lkf1;Landroid/app/Activity;)Lna1;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lkf1;->z0(Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lhk0;->a:Lhk0;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lhk0;->v(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lna1;->a:Lna1;

    .line 10
    .line 11
    return-object p0
.end method

.method private static final Y(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkf1;Landroid/app/Activity;)V
    .locals 1

    .line 1
    sget-object v0, Ln90;->a:Ln90;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Ln90;->O(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ln90$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p3}, Lkf1;->i0()Landroid/os/Handler;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    new-instance v0, Lqy;

    .line 12
    .line 13
    invoke-direct {v0, p1, p0, p4, p2}, Lqy;-><init>(Ln90$a;Landroid/content/Context;Landroid/app/Activity;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private static final Z(Ln90$a;Landroid/content/Context;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ln90$a;->e()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Ln90;->a:Ln90;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ln90;->v(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lm90;->m:Lm90$a;

    .line 13
    .line 14
    new-instance p1, Lcc1;

    .line 15
    .line 16
    const/16 v0, 0x12

    .line 17
    .line 18
    invoke-direct {p1, v0}, Lcc1;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-virtual {p0, p2, p3, v0, p1}, Lm90$a;->b(Landroid/content/Context;Ljava/lang/String;ZLhw;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->P()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final a0()Lna1;
    .locals 1

    .line 1
    sget-object v0, Lna1;->a:Lna1;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic b(Lzt0;Lkf1;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lkf1;->G0(Lzt0;Lkf1;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final b0(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-direct {p0, p1}, Lkf1;->e0(Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    const-string p1, "DBF2DDFE68DC6C3D7BDBD1C70AAE13993F50FA99B51D6F0C668A284EE9E6FDCD"

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return p0

    .line 16
    :catch_0
    return v0
.end method

.method public static synthetic c(Lkf1;Landroid/app/Activity;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lkf1;->I0(Lkf1;Landroid/app/Activity;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c0(Lkf1;Ljava/lang/String;ILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lkf1;->t:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    invoke-direct {p0, p1}, Lkf1;->b0(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static synthetic d(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkf1;->R0(Landroid/content/DialogInterface;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final d0(IF)I
    .locals 0

    .line 1
    int-to-float p0, p1

    .line 2
    mul-float/2addr p0, p2

    .line 3
    float-to-int p0, p0

    .line 4
    return p0
.end method

.method public static synthetic e()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->K()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final e0(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const/4 p0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_3

    .line 5
    .line 6
    :cond_0
    :try_start_0
    new-instance v0, Ljava/util/zip/ZipFile;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    :try_start_1
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v1, Laf;

    .line 19
    .line 20
    invoke-direct {v1, p1}, Laf;-><init>(Ljava/util/Enumeration;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Lqa0;

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-direct {p1, v2, v1}, Lqa0;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Loj;

    .line 30
    .line 31
    invoke-direct {v1, p1}, Loj;-><init>(Lp01;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Loj;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v3, 0x0

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object v4, v1

    .line 50
    check-cast v4, Ljava/util/zip/ZipEntry;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const-string v6, "META-INF/"

    .line 60
    .line 61
    invoke-static {v5, v6, v3}, Lr41;->S(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    const-string v6, ".RSA"

    .line 75
    .line 76
    invoke-static {v5, v6, v3}, Lr41;->Q(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-nez v5, :cond_3

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    const-string v5, ".DSA"

    .line 90
    .line 91
    invoke-static {v4, v5, v3}, Lr41;->Q(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catchall_0
    move-exception p1

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    move-object v1, p0

    .line 101
    :cond_3
    :goto_0
    check-cast v1, Ljava/util/zip/ZipEntry;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    .line 103
    if-nez v1, :cond_4

    .line 104
    .line 105
    :try_start_2
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 106
    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_4
    :try_start_3
    invoke-virtual {v0, v1}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {p1}, Lp30;->S(Ljava/io/InputStream;)[B

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string v1, "X.509"

    .line 121
    .line 122
    invoke-static {v1}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    new-instance v4, Ljava/io/ByteArrayInputStream;

    .line 127
    .line 128
    invoke-direct {v4, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v4}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    const-string v1, "SHA-256"

    .line 136
    .line 137
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getEncoded()[B

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {v1, p1}, Ljava/security/MessageDigest;->digest([B)[B

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    const-string v1, ""

    .line 153
    .line 154
    new-instance v4, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 160
    .line 161
    .line 162
    array-length v5, p1

    .line 163
    move v6, v3

    .line 164
    :goto_1
    if-ge v3, v5, :cond_6

    .line 165
    .line 166
    aget-byte v7, p1, v3

    .line 167
    .line 168
    add-int/2addr v6, v2

    .line 169
    if-le v6, v2, :cond_5

    .line 170
    .line 171
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 172
    .line 173
    .line 174
    :cond_5
    invoke-static {v7}, Lkf1;->g0(B)Ljava/lang/CharSequence;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 179
    .line 180
    .line 181
    add-int/lit8 v3, v3, 0x1

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_6
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 191
    :try_start_4
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 192
    .line 193
    .line 194
    return-object p1

    .line 195
    :goto_2
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 196
    :catchall_1
    move-exception v1

    .line 197
    :try_start_6
    invoke-static {v0, p1}, Li4;->k(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    throw v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 201
    :catch_0
    :goto_3
    return-object p0
.end method

.method public static synthetic f(Lzt0;Lkf1;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lkf1;->F0(Lzt0;Lkf1;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f0(Lkf1;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lkf1;->t:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    invoke-direct {p0, p1}, Lkf1;->e0(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static synthetic g(Landroid/app/Activity;Landroid/app/AlertDialog;ZLrn$a;Lkf1;FIZJIIIII)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p14}, Lkf1;->E0(Landroid/app/Activity;Landroid/app/AlertDialog;ZLrn$a;Lkf1;FIZJIIIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final g0(B)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "%02X"

    .line 15
    .line 16
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static synthetic h()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->H()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final h0()Ljava/lang/String;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, Lkf1;->s:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    goto/16 :goto_3

    .line 8
    .line 9
    :cond_0
    const-string v3, "dalvik.system.BaseDexClassLoader"

    .line 10
    .line 11
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-string v4, "pathList"

    .line 16
    .line 17
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const-string v5, "dexElements"

    .line 34
    .line 35
    invoke-virtual {v3, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    check-cast v2, [Ljava/lang/Object;

    .line 50
    .line 51
    array-length v3, v2

    .line 52
    move v5, v0

    .line 53
    :goto_0
    if-ge v5, v3, :cond_4

    .line 54
    .line 55
    aget-object v6, v2, v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 56
    .line 57
    :try_start_1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    const-string v8, "path"

    .line 62
    .line 63
    invoke-virtual {v7, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    invoke-virtual {v7, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    instance-of v7, v6, Ljava/io/File;

    .line 75
    .line 76
    if-eqz v7, :cond_1

    .line 77
    .line 78
    check-cast v6, Ljava/io/File;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move-object v6, v1

    .line 82
    :goto_1
    if-eqz v6, :cond_3

    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    if-eqz v6, :cond_3

    .line 89
    .line 90
    const-string v7, ".apk"

    .line 91
    .line 92
    invoke-static {v6, v7, v0}, Lr41;->Q(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 96
    if-eqz v7, :cond_2

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    move-object v6, v1

    .line 100
    :goto_2
    if-eqz v6, :cond_3

    .line 101
    .line 102
    return-object v6

    .line 103
    :catch_0
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :catch_1
    :cond_4
    :try_start_2
    invoke-direct {p0}, Lkf1;->j0()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-nez v2, :cond_5

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget-object p0, p0, Lkf1;->v:Ljava/lang/String;

    .line 118
    .line 119
    if-nez p0, :cond_6

    .line 120
    .line 121
    :goto_3
    return-object v1

    .line 122
    :cond_6
    invoke-virtual {v2, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-eqz p0, :cond_7

    .line 127
    .line 128
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 129
    .line 130
    if-eqz p0, :cond_7

    .line 131
    .line 132
    iget-object v1, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 133
    .line 134
    :catch_2
    :cond_7
    return-object v1
.end method

.method public static synthetic i(Lkf1;Landroid/app/Activity;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkf1;->W(Lkf1;Landroid/app/Activity;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final i0()Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->e:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/os/Handler;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic j(Ln90$a;Landroid/content/Context;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lkf1;->Z(Ln90$a;Landroid/content/Context;Landroid/app/Activity;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final j0()Landroid/content/Context;
    .locals 2

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    const-string v0, "android.app.ActivityThread"

    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "currentApplication"

    .line 9
    .line 10
    invoke-virtual {v0, v1, p0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, p0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    instance-of v1, v0, Landroid/content/Context;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    check-cast v0, Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    return-object v0

    .line 25
    :catch_0
    :cond_0
    return-object p0
.end method

.method public static synthetic k()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->Q()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final k0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->f:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic l()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->D()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final l0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->o:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkf1;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lkf1;->Y(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkf1;Landroid/app/Activity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final m0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->p:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic n(Lkf1;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkf1;->H0(Lkf1;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final n0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->g:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic o()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->L()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final o0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->h:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic p()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->N()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final p0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->i:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic q()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->E()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final q0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->j:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic r()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->F()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final r0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->k:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic s()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->G()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final s0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->l:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic t()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->J()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final t0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->m:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic u()Lna1;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->a0()Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final u0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->n:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic v(IFLandroid/app/AlertDialog;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lkf1;->M0(IFLandroid/app/AlertDialog;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final v0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->d:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic w(Lkf1;Landroid/app/Activity;)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkf1;->X(Lkf1;Landroid/app/Activity;)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final w0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->q:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic x()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->M()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final x0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkf1;->r:Lu60;

    .line 2
    .line 3
    invoke-interface {p0}, Lu60;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public static synthetic y(Landroid/app/Activity;Lkf1;FIIZLrn$a;JIIII)V
    .locals 14

    .line 1
    const/4 v7, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move/from16 v2, p2

    .line 5
    .line 6
    move/from16 v3, p3

    .line 7
    .line 8
    move/from16 v4, p4

    .line 9
    .line 10
    move/from16 v5, p5

    .line 11
    .line 12
    move-object/from16 v6, p6

    .line 13
    .line 14
    move-wide/from16 v8, p7

    .line 15
    .line 16
    move/from16 v10, p9

    .line 17
    .line 18
    move/from16 v11, p10

    .line 19
    .line 20
    move/from16 v12, p11

    .line 21
    .line 22
    move/from16 v13, p12

    .line 23
    .line 24
    invoke-static/range {v0 .. v13}, Lkf1;->D0(Landroid/app/Activity;Lkf1;FIIZLrn$a;ZJIIII)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private static final y0()Landroid/os/Handler;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static synthetic z()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lkf1;->I()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final z0(Landroid/app/Activity;)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lkf1;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-direct {p0}, Lkf1;->j0()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sget-object v1, Lwb1;->a:Lwb1;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lwb1;->H(Landroid/content/Context;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    sget-object p1, Llb0;->a:Llb0;

    .line 21
    .line 22
    invoke-direct {p0}, Lkf1;->x0()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "vc blocked (sp)"

    .line 27
    .line 28
    invoke-virtual {p1, p0, v0}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const/4 v1, 0x1

    .line 33
    iput-boolean v1, p0, Lkf1;->a:Z

    .line 34
    .line 35
    iget-object v3, p0, Lkf1;->s:Ljava/lang/ClassLoader;

    .line 36
    .line 37
    const-string v2, "XP1"

    .line 38
    .line 39
    const/4 v4, 0x6

    .line 40
    if-nez v3, :cond_2

    .line 41
    .line 42
    const-string p1, "installAllHooks: null classLoader"

    .line 43
    .line 44
    invoke-virtual {p0, v4, v2, p1}, Lio/github/libxposed/api/XposedModule;->log(ILjava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    move-object v5, v3

    .line 49
    iget-object v3, p0, Lkf1;->t:Ljava/lang/String;

    .line 50
    .line 51
    if-nez v3, :cond_3

    .line 52
    .line 53
    const-string p1, "installAllHooks: null apkPath"

    .line 54
    .line 55
    invoke-virtual {p0, v4, v2, p1}, Lio/github/libxposed/api/XposedModule;->log(ILjava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    move v6, v4

    .line 60
    iget-object v4, p0, Lkf1;->u:Ljava/lang/String;

    .line 61
    .line 62
    if-nez v4, :cond_4

    .line 63
    .line 64
    const-string p1, "installAllHooks: null dataDir"

    .line 65
    .line 66
    invoke-virtual {p0, v6, v2, p1}, Lio/github/libxposed/api/XposedModule;->log(ILjava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_4
    iget-object v2, p0, Lkf1;->v:Ljava/lang/String;

    .line 71
    .line 72
    if-nez v2, :cond_5

    .line 73
    .line 74
    :goto_0
    return-void

    .line 75
    :cond_5
    if-eqz v0, :cond_6

    .line 76
    .line 77
    sget-object v2, Ln90;->a:Ln90;

    .line 78
    .line 79
    invoke-virtual {v2, v0}, Ln90;->x(Landroid/content/Context;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    goto :goto_1

    .line 84
    :cond_6
    const/4 v0, 0x0

    .line 85
    :goto_1
    const/4 v2, 0x0

    .line 86
    if-eqz v0, :cond_7

    .line 87
    .line 88
    sget-object v7, Lik0;->a:Lik0;

    .line 89
    .line 90
    new-array v6, v6, [I

    .line 91
    .line 92
    fill-array-data v6, :array_0

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7, v6}, Lik0;->a([I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-static {v0, v6, v2}, Lr41;->S(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_7

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_7
    move v1, v2

    .line 107
    :goto_2
    sget-object v2, Lhn;->a:Lhn;

    .line 108
    .line 109
    iget-wide v6, p0, Lkf1;->w:J

    .line 110
    .line 111
    iget-object v8, p0, Lkf1;->x:Ljava/lang/String;

    .line 112
    .line 113
    const/16 v9, 0x75a9

    .line 114
    .line 115
    iget-object v10, p0, Lkf1;->y:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual/range {v2 .. v10}, Lhn;->M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;JLjava/lang/String;ILjava/lang/String;)Lrn$a;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    move-object v3, v5

    .line 122
    sget-object v2, Lk11;->a:Lk11;

    .line 123
    .line 124
    invoke-virtual {v0}, Lrn$a;->C()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-virtual {v2, v4}, Lk11;->j(Ljava/lang/Class;)V

    .line 129
    .line 130
    .line 131
    if-eqz p1, :cond_8

    .line 132
    .line 133
    sget-object v2, Lva;->a:Lva;

    .line 134
    .line 135
    invoke-virtual {v2, p1}, Lva;->d(Landroid/app/Activity;)V

    .line 136
    .line 137
    .line 138
    :cond_8
    sget-object p1, Lxa1;->a:Lxa1;

    .line 139
    .line 140
    invoke-virtual {p1, v3}, Lxa1;->g(Ljava/lang/ClassLoader;)V

    .line 141
    .line 142
    .line 143
    sget-object p1, Lvs0;->a:Lvs0;

    .line 144
    .line 145
    invoke-virtual {v0}, Lrn$a;->O()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v0}, Lrn$a;->N()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {p1, v3, v2, v4}, Lvs0;->w(Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    sget-object p1, Lck0;->a:Lck0;

    .line 157
    .line 158
    invoke-virtual {v0}, Lrn$a;->K()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {p1, v3, v2}, Lck0;->D(Ljava/lang/ClassLoader;Ljava/lang/Class;)V

    .line 163
    .line 164
    .line 165
    sget-object p1, Lfk0;->a:Lfk0;

    .line 166
    .line 167
    invoke-virtual {v0}, Lrn$a;->K()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {p1, v3, v2}, Lfk0;->X(Ljava/lang/ClassLoader;Ljava/lang/Class;)V

    .line 172
    .line 173
    .line 174
    sget-object p1, Lo00;->a:Lo00;

    .line 175
    .line 176
    invoke-virtual {v0}, Lrn$a;->F()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {p1, v3, v2}, Lo00;->b(Ljava/lang/ClassLoader;Ljava/util/List;)V

    .line 181
    .line 182
    .line 183
    sget-object p1, Lob0;->a:Lob0;

    .line 184
    .line 185
    invoke-virtual {v0}, Lrn$a;->I()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {p1, v3, v2}, Lob0;->S(Ljava/lang/ClassLoader;Ljava/lang/Class;)V

    .line 190
    .line 191
    .line 192
    sget-object p1, Lec1;->a:Lec1;

    .line 193
    .line 194
    invoke-virtual {v0}, Lrn$a;->V()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {v0}, Lrn$a;->J()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {p1, v3, v2, v4}, Lec1;->t0(Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 203
    .line 204
    .line 205
    sget-object v2, Lmg;->a:Lmg;

    .line 206
    .line 207
    invoke-virtual {v0}, Lrn$a;->S()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-virtual {v0}, Lrn$a;->y()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    invoke-virtual {v0}, Lrn$a;->E()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-virtual {v0}, Lrn$a;->z()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    invoke-virtual {v0}, Lrn$a;->A()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    invoke-virtual/range {v2 .. v8}, Lmg;->f0(Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 228
    .line 229
    .line 230
    if-eqz v1, :cond_a

    .line 231
    .line 232
    invoke-direct {p0}, Lkf1;->j0()Landroid/content/Context;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    if-eqz p1, :cond_9

    .line 237
    .line 238
    sget-object v2, Llt;->a:Llt;

    .line 239
    .line 240
    invoke-virtual {v2, p1}, Llt;->q(Landroid/content/Context;)V

    .line 241
    .line 242
    .line 243
    :cond_9
    sget-object p1, Llt;->a:Llt;

    .line 244
    .line 245
    invoke-virtual {p1, v3}, Llt;->h(Ljava/lang/ClassLoader;)V

    .line 246
    .line 247
    .line 248
    :cond_a
    sget-object p1, Lwy;->a:Lwy;

    .line 249
    .line 250
    invoke-virtual {v0}, Lrn$a;->D()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-virtual {p1, v3, v2}, Lwy;->p(Ljava/lang/ClassLoader;Ljava/lang/Class;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, Lrn$a;->D()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {p1, v3, v2}, Lwy;->s(Ljava/lang/ClassLoader;Ljava/lang/Class;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1, v3}, Lwy;->w(Ljava/lang/ClassLoader;)V

    .line 265
    .line 266
    .line 267
    sget-object p1, Lyy;->a:Lyy;

    .line 268
    .line 269
    invoke-virtual {p1, v3}, Lyy;->O(Ljava/lang/ClassLoader;)V

    .line 270
    .line 271
    .line 272
    if-eqz v1, :cond_b

    .line 273
    .line 274
    sget-object p1, Lae;->a:Lae;

    .line 275
    .line 276
    invoke-virtual {p1, v3}, Lae;->Z(Ljava/lang/ClassLoader;)V

    .line 277
    .line 278
    .line 279
    invoke-direct {p0}, Lkf1;->j0()Landroid/content/Context;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    if-eqz p0, :cond_b

    .line 284
    .line 285
    invoke-virtual {p1, p0}, Lae;->e0(Landroid/content/Context;)V

    .line 286
    .line 287
    .line 288
    :cond_b
    sget-object p0, Lap;->a:Lap;

    .line 289
    .line 290
    invoke-virtual {p0, v3}, Lap;->b(Ljava/lang/ClassLoader;)V

    .line 291
    .line 292
    .line 293
    sget-object p0, Lyu0;->a:Lyu0;

    .line 294
    .line 295
    invoke-virtual {v0}, Lrn$a;->G()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-virtual {v0}, Lrn$a;->H()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-virtual {p0, v3, p1, v1}, Lyu0;->b(Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    sget-object p0, Laf1;->a:Laf1;

    .line 307
    .line 308
    invoke-virtual {p0, v3}, Laf1;->n(Ljava/lang/ClassLoader;)V

    .line 309
    .line 310
    .line 311
    sget-object v2, Lm11;->a:Lm11;

    .line 312
    .line 313
    invoke-virtual {v0}, Lrn$a;->C()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    invoke-virtual {v0}, Lrn$a;->T()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    invoke-virtual {v0}, Lrn$a;->Q()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    invoke-virtual {v0}, Lrn$a;->P()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    invoke-virtual {v0}, Lrn$a;->R()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    move-result-object v8

    .line 333
    invoke-virtual/range {v2 .. v8}, Lm11;->j(Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 334
    .line 335
    .line 336
    sget-object p0, Lzy;->a:Lzy;

    .line 337
    .line 338
    invoke-virtual {v0}, Lrn$a;->L()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-virtual {p0, p1}, Lzy;->v(Ljava/lang/Class;)V

    .line 343
    .line 344
    .line 345
    return-void

    .line 346
    nop

    .line 347
    :array_0
    .array-data 4
        0x1c
        0x30
        0x23
        0x1c
        0x12
        0x55
    .end array-data
.end method


# virtual methods
.method public onModuleLoaded(Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onPackageLoaded(Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onPackageReady(Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getPackageName()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-direct {p0}, Lkf1;->v0()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_1

    .line 19
    .line 20
    :cond_0
    sget-object v0, Li8;->a:Li8;

    .line 21
    .line 22
    invoke-virtual {v0}, Li8;->g()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    sget-object p1, Llb0;->a:Llb0;

    .line 29
    .line 30
    invoke-direct {p0}, Lkf1;->w0()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "at"

    .line 35
    .line 36
    invoke-virtual {p1, v0, v1}, Llb0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    sget-object v0, Lue0;->a:Lue0;

    .line 43
    .line 44
    invoke-virtual {v0}, Lue0;->f()V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getClassLoader()Ljava/lang/ClassLoader;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lkf1;->s:Ljava/lang/ClassLoader;

    .line 52
    .line 53
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getPackageName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lkf1;->v:Ljava/lang/String;

    .line 58
    .line 59
    invoke-direct {p0}, Lkf1;->h0()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const/4 v0, 0x1

    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    invoke-direct {p0, p1}, Lkf1;->b0(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iput-boolean v0, p0, Lkf1;->C:Z

    .line 73
    .line 74
    sput-boolean v0, Lkf1;->J:Z

    .line 75
    .line 76
    :cond_2
    iget-boolean p1, p0, Lkf1;->b:Z

    .line 77
    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    iput-boolean v0, p0, Lkf1;->b:Z

    .line 81
    .line 82
    iget-boolean p1, p0, Lkf1;->C:Z

    .line 83
    .line 84
    if-nez p1, :cond_3

    .line 85
    .line 86
    sget-object p1, Lva;->a:Lva;

    .line 87
    .line 88
    invoke-virtual {p1}, Lva;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    :cond_3
    :try_start_1
    const-class p1, Landroid/app/Activity;

    .line 92
    .line 93
    const-string v0, "onCreate"

    .line 94
    .line 95
    const-class v1, Landroid/os/Bundle;

    .line 96
    .line 97
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p0, p1}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    new-instance v0, Llg;

    .line 110
    .line 111
    const/4 v1, 0x3

    .line 112
    invoke-direct {v0, v1, p0}, Llg;-><init>(ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {p1, v0}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v2, "onPackageReady CRASH: "

    .line 138
    .line 139
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v0, ": "

    .line 146
    .line 147
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    const/4 v0, 0x6

    .line 158
    const-string v1, "XP1"

    .line 159
    .line 160
    invoke-virtual {p0, v0, v1, p1}, Lio/github/libxposed/api/XposedModule;->log(ILjava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :catch_0
    :cond_4
    :goto_1
    return-void
.end method
