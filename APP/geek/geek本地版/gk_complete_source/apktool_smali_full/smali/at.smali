.class public final Lat;
.super Lm50;

# interfaces
.implements Lwm;


# instance fields
.field public e:I

.field public final f:Ljava/lang/String;

.field public final g:Landroid/widget/TextView;

.field public final h:Landroid/widget/LinearLayout;

.field public final i:Landroid/app/Activity;

.field public final j:Lon;

.field public final k:Landroid/webkit/WebView;

.field public final l:Landroid/widget/ScrollView;

.field public final m:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/app/Activity;Lon;Landroid/webkit/WebView;Landroid/widget/ScrollView;Landroid/widget/EditText;Lld;)V
    .locals 3

    iput-object p1, p0, Lat;->f:Ljava/lang/String;

    iput-object p2, p0, Lat;->g:Landroid/widget/TextView;

    iput-object p3, p0, Lat;->h:Landroid/widget/LinearLayout;

    iput-object p4, p0, Lat;->i:Landroid/app/Activity;

    iput-object p5, p0, Lat;->j:Lon;

    iput-object p6, p0, Lat;->k:Landroid/webkit/WebView;

    iput-object p7, p0, Lat;->l:Landroid/widget/ScrollView;

    iput-object p8, p0, Lat;->m:Landroid/widget/EditText;

    invoke-direct {p0, p9}, Lm50;-><init>(Lld;)V

    const/4 v1, 0x0

    const-string v0, "\u06e8\u06df\u06e0"

    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "d3493kWcNQdgT56jpISFJT"

    invoke-static {v0}, Lkotlinx/coroutines/ۦۡۧۧ;->ۣۧ۠ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u06e8\u06df\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    mul-int/2addr v0, v2

    const v2, 0x1acdf8

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/lit16 v2, v2, 0x1e79

    div-int/2addr v0, v2

    if-eqz v0, :cond_1

    const/16 v0, 0x46

    sput v0, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    const-string v0, "\u06df\u06e3\u06e3"

    invoke-static {v0}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e4\u06e6\u06e0"

    :goto_1
    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    add-int/2addr v0, v2

    const v2, 0x1ac4b5

    add-int/2addr v0, v2

    goto :goto_0

    :cond_2
    :sswitch_3
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    xor-int/lit16 v2, v2, 0x24c2

    add-int/2addr v0, v2

    if-ltz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v0, "\u06e2\u06e5\u06e0"

    goto :goto_1

    :cond_3
    sget v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    mul-int/2addr v0, v2

    const v2, 0x1abd74

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    move-result v0

    if-gtz v0, :cond_2

    sget v0, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sub-int/2addr v0, v2

    const v2, 0xdc07

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc07 -> :sswitch_0
        0x1aa77f -> :sswitch_2
        0x1aba9e -> :sswitch_5
        0x1abade -> :sswitch_1
        0x1ac54b -> :sswitch_3
        0x1ac8c9 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lld;)Lld;
    .locals 10

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e1\u06e0"

    invoke-static {v1}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move-object v7, v0

    move-object v8, v0

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Lat;

    iget-object v1, p0, Lat;->f:Ljava/lang/String;

    iget-object v2, p0, Lat;->g:Landroid/widget/TextView;

    iget-object v3, p0, Lat;->h:Landroid/widget/LinearLayout;

    iget-object v4, p0, Lat;->i:Landroid/app/Activity;

    iget-object v5, p0, Lat;->j:Lon;

    iget-object v6, p0, Lat;->k:Landroid/webkit/WebView;

    move-object v9, p1

    invoke-direct/range {v0 .. v9}, Lat;-><init>(Ljava/lang/String;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/app/Activity;Lon;Landroid/webkit/WebView;Landroid/widget/ScrollView;Landroid/widget/EditText;Lld;)V

    return-object v0

    :sswitch_1
    iget-object v7, p0, Lat;->l:Landroid/widget/ScrollView;

    sget v0, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    mul-int/lit16 v1, v1, -0x20d4

    sub-int/2addr v0, v1

    if-ltz v0, :cond_0

    const/16 v0, 0x58

    sput v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    const-string v0, "\u06e7\u06e1\u06e0"

    invoke-static {v0}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e3\u06e0\u06e0"

    :goto_1
    invoke-static {v0}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_2
    iget-object v8, p0, Lat;->m:Landroid/widget/EditText;

    sget v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    or-int/lit16 v1, v1, -0x112d

    rem-int/2addr v0, v1

    if-ltz v0, :cond_1

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    :cond_1
    const-string v0, "\u06e0\u06e8\u06e7"

    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    if-ltz v0, :cond_2

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    const-string v0, "\u06e8\u06df"

    goto :goto_1

    :cond_2
    sget v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sub-int/2addr v0, v1

    const v1, -0x1ac64a

    xor-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aabdf -> :sswitch_0
        0x1ab623 -> :sswitch_2
        0x1ab6fd -> :sswitch_3
        0x1ac546 -> :sswitch_1
    .end sparse-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "\u06e0\u06e3\u06e5"

    invoke-static {v0}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move-object v0, p1

    check-cast v0, Loe;

    sget v0, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    mul-int/lit16 v1, v1, -0x8f5

    mul-int/2addr v0, v1

    if-ltz v0, :cond_1

    const/16 v0, 0x48

    sput v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v0, "\u06e7\u06e1\u06e8"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    check-cast p2, Lld;

    invoke-virtual {p0, p2}, Lat;->a(Lld;)Lld;

    move-result-object v0

    check-cast v0, Lat;

    sget-object v1, Lvh;->n:Lvh;

    invoke-virtual {v0, v1}, Lat;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :sswitch_2
    invoke-static {}, Landroidx/activity/ۣ۟۠ۤۢ;->۟۠۠ۤۥ()I

    move-result v0

    if-ltz v0, :cond_0

    const/16 v0, 0xc

    sput v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v0, "\u06e1\u06e8\u06e8"

    :goto_1
    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e0\u06e3\u06e5"

    goto :goto_1

    :cond_1
    sget v0, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v1, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    rem-int/2addr v0, v1

    const v1, 0x1ac97a    # 2.459999E-39f

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aab42 -> :sswitch_0
        0x1ac54e -> :sswitch_2
        0x1ac94d -> :sswitch_1
    .end sparse-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/16 v27, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/4 v11, 0x0

    const/16 v17, 0x0

    const/16 v23, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/16 v21, 0x0

    const/4 v13, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v16, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v33, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v25, 0x0

    const/16 v19, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/16 v22, 0x0

    const-string v7, "\u06e4\u06e5\u06e3"

    invoke-static {v7}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v39

    move-object v7, v3

    move-object/from16 v32, v4

    move-object v9, v6

    move-object/from16 v34, v10

    move-object/from16 v35, v11

    move-object/from16 v36, v12

    move-object/from16 v37, v13

    move-object/from16 v38, v33

    :goto_0
    sparse-switch v39, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move/from16 v0, v20

    move/from16 v1, v30

    if-ge v0, v1, :cond_2

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    if-ltz v3, :cond_1c

    const/16 v3, 0x4d

    sput v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    move-object/from16 v3, v27

    :cond_0
    const-string v4, "\u06e1\u06e7\u06e5"

    invoke-static {v4}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v27, v3

    move/from16 v39, v4

    goto :goto_0

    :sswitch_1
    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v4, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    div-int/lit16 v4, v4, -0x275

    sub-int/2addr v3, v4

    if-gtz v3, :cond_1

    const-string v3, "\u06e3\u06e8\u06e2"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto :goto_0

    :cond_1
    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v4, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sub-int/2addr v3, v4

    const v4, 0x1ab82b

    add-int/2addr v3, v4

    move/from16 v39, v3

    goto :goto_0

    :sswitch_2
    :try_start_0
    move-object/from16 v0, v37

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/io/Reader;->read([C)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v4

    move-object v3, v15

    :goto_1
    const-string v6, "\u06e4\u06e0\u06e0"

    invoke-static {v6}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v6

    move-object v15, v3

    move/from16 v39, v6

    move/from16 v16, v4

    goto :goto_0

    :cond_2
    :sswitch_3
    sget v3, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v4, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    div-int/lit16 v4, v4, 0x18f

    div-int/2addr v3, v4

    if-ltz v3, :cond_3

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v3, "\u06e4\u06e2\u06e5"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto :goto_0

    :cond_3
    sget v3, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    add-int/2addr v3, v4

    const v4, 0x1aa851

    add-int/2addr v3, v4

    move/from16 v39, v3

    goto :goto_0

    :sswitch_4
    :try_start_1
    new-instance v3, Ljava/io/StringWriter;

    invoke-direct {v3}, Ljava/io/StringWriter;-><init>()V

    const/16 v4, 0x2000

    new-array v6, v4, [C
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v10, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    add-int/lit16 v10, v10, 0x268c

    or-int/2addr v4, v10

    if-gtz v4, :cond_4

    move-object v4, v3

    :goto_2
    const-string v3, "\u06e7\u06e5\u06e6"

    invoke-static {v3}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v28, v4

    move-object/from16 v29, v6

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_4
    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v10, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    add-int/2addr v4, v10

    const v10, 0x1aa54c

    add-int/2addr v4, v10

    move-object/from16 v28, v3

    move-object/from16 v29, v6

    move/from16 v39, v4

    goto/16 :goto_0

    :sswitch_5
    :try_start_2
    const-string v3, "ETaNEXWJE1olJ4s9epROAFh90A==\n"

    const-string v4, "dlP5WBv5Zi4=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v36

    invoke-static {v3, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v4, Lc9;->a:Ljava/nio/charset/Charset;

    new-instance v3, Ljava/io/InputStreamReader;

    move-object/from16 v0, v36

    invoke-direct {v3, v0, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object v4, v3

    :goto_3
    const-string v3, "\u06e8\u06e6\u06e3"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v21, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_6
    const/16 v3, 0xbb8

    :try_start_3
    invoke-virtual {v15, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    move-result v3

    if-gtz v3, :cond_5

    const/16 v3, 0x4c

    sput v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    const-string v3, "\u06e0\u06e7\u06e1"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e4\u06e5\u06e4"

    invoke-static {v3}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_7
    :try_start_4
    const-string v3, "Y3ZZzA==\n"

    const-string v4, "Chg/o97NeWI=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v18

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v8, Li00;->b:Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    sget v3, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    or-int/lit8 v4, v4, -0x53

    add-int/2addr v3, v4

    if-ltz v3, :cond_6

    const/16 v3, 0x19

    sput v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    const-string v3, "\u06e5\u06df\u06e6"

    invoke-static {v3}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e5\u06e8\u06e1"

    move-object/from16 v3, v25

    move/from16 v6, v26

    :goto_4
    invoke-static {v4}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v25, v3

    move/from16 v39, v4

    move/from16 v26, v6

    goto/16 :goto_0

    :catch_0
    move-exception v3

    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    rem-int/2addr v3, v4

    const v4, 0x1ac15e

    add-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_7
    :sswitch_8
    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v3

    if-gtz v3, :cond_8

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    const-string v3, "\u06df\u06e4\u06e5"

    :goto_5
    invoke-static {v3}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_8
    sget v3, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sub-int/2addr v3, v4

    const v4, -0x1aae97

    xor-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_9
    sget v3, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    if-ltz v3, :cond_a

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-object/from16 v3, v17

    :cond_9
    const-string v4, "\u06e7\u06e7\u06e4"

    move-object/from16 v17, v3

    :goto_6
    invoke-static {v4}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_a
    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    or-int/2addr v3, v4

    const v4, -0x1aab07

    xor-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_a
    :try_start_5
    move-object/from16 v0, v23

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    const-string v3, "\u06e4\u06e8\u06e1"

    move-object v4, v3

    goto :goto_6

    :sswitch_b
    move-object/from16 v0, p0

    iget v3, v0, Lat;->e:I

    if-eqz v3, :cond_1f

    const/4 v4, 0x1

    if-ne v3, v4, :cond_7

    invoke-static/range {p1 .. p1}, Lct;->y(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    move-result v3

    if-gtz v3, :cond_b

    const/4 v3, 0x7

    sput v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v3, "\u06e4\u06e8\u06e1"

    invoke-static {v3}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_b
    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v4, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    div-int/2addr v3, v4

    const v4, 0x1aae8a

    add-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_c
    :try_start_6
    invoke-virtual/range {v28 .. v28}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v3

    sget v4, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/2addr v4, v6

    const v6, 0x1aaf61

    add-int/2addr v4, v6

    move-object/from16 v38, v3

    move/from16 v39, v4

    goto/16 :goto_0

    :sswitch_d
    sget v3, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v3, :cond_c

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v3, "\u06e6\u06e7\u06e5"

    move-object/from16 v4, v18

    :goto_7
    invoke-static {v3}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v18, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_c
    sget v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v4, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    xor-int/2addr v3, v4

    const v4, 0x1abcd0

    xor-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    move-result v3

    if-ltz v3, :cond_d

    const-string v3, "\u06e2\u06e6\u06e2"

    invoke-static {v3}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_d
    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    xor-int/2addr v3, v4

    const v4, 0x1ab96f

    add-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_f
    :try_start_7
    const-string v3, "MGF4\n"

    const-string v4, "dyQsEFcPpso=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v3

    if-gtz v3, :cond_e

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    const-string v3, "\u06e8\u06e4\u06e0"

    invoke-static {v3}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06e0\u06e1\u06e7"

    invoke-static {v3}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_10
    :try_start_8
    const-string v3, "ZW4jDYOu\n"

    const-string v4, "FhpCefbdaWY=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v18

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "iw==\n"

    const-string v6, "uiZr4rRbbao=\n"

    invoke-static {v4, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    move-result v3

    if-eqz v3, :cond_14

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    move-result v3

    if-gtz v3, :cond_10

    move-object/from16 v3, v19

    :cond_f
    const-string v4, "\u06e7\u06e6\u06e8"

    invoke-static {v4}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v19, v3

    move/from16 v39, v4

    goto/16 :goto_0

    :cond_10
    sget v3, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    add-int/2addr v3, v4

    const v4, 0xe0cd

    add-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_11
    const/16 v3, 0xbb8

    :try_start_9
    invoke-virtual {v15, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {v15}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    move-result-object v3

    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v6, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    or-int/lit16 v6, v6, -0x23a4

    sub-int/2addr v4, v6

    if-gtz v4, :cond_11

    const-string v4, "\u06e0\u06e3\u06e2"

    invoke-static {v4}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v36, v3

    move/from16 v39, v4

    goto/16 :goto_0

    :cond_11
    sget v4, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/2addr v4, v6

    const v6, 0x1ac2db

    xor-int/2addr v4, v6

    move-object/from16 v36, v3

    move/from16 v39, v4

    goto/16 :goto_0

    :sswitch_12
    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v4, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    add-int/lit16 v4, v4, -0x133b

    sub-int/2addr v3, v4

    if-gtz v3, :cond_12

    const-string v3, "\u06e1\u06e0\u06e1"

    :goto_8
    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_12
    const-string v3, "\u06e4\u06e5\u06e3"

    goto :goto_8

    :sswitch_13
    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v4, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    rem-int/lit16 v4, v4, -0xee0

    xor-int/2addr v3, v4

    if-ltz v3, :cond_13

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v3, "\u06e5\u06e8\u06e5"

    move/from16 v4, v20

    :goto_9
    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_13
    const-string v3, "\u06e0\u06e6\u06e8"

    invoke-static {v3}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_14
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "hD3LgIvpUvvALsKf3vBY/Mc+worE71j7wDXJmsT2WPzHK86Yw71etJUz0pjC81g=\n"

    const-string v5, "51yn7KudPds=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_14
    :sswitch_15
    sget v3, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v3, :cond_15

    const-string v3, "\u06e4\u06e2\u06e8"

    invoke-static {v3}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_15
    sget v3, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v4, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    mul-int/2addr v3, v4

    const v4, 0x1860c3

    xor-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_16
    const-string v3, "\u06e5\u06e5\u06e4"

    :goto_a
    invoke-static {v3}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_17
    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v4, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    or-int/2addr v3, v4

    const v4, 0x1abb8f

    add-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_18
    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-result v3

    if-gtz v3, :cond_16

    const-string v3, "\u06e3\u06e8\u06e7"

    invoke-static {v3}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    move/from16 v26, v16

    goto/16 :goto_0

    :cond_16
    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    add-int/2addr v3, v4

    const v4, 0x1aab64

    add-int/2addr v3, v4

    move/from16 v39, v3

    move/from16 v26, v16

    goto/16 :goto_0

    :sswitch_19
    :try_start_a
    throw v19
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    :sswitch_1a
    sget v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v4, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/lit16 v4, v4, -0x2429

    sub-int/2addr v3, v4

    if-gtz v3, :cond_17

    const-string v3, "\u06e2\u06e3\u06e8"

    goto :goto_a

    :cond_17
    sget v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v4, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    add-int/2addr v3, v4

    const v4, 0x1ac2e8

    xor-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_1b
    :try_start_b
    const-string v3, "&extensions=all"

    move-object/from16 v0, v23

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/net/URL;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    sget v4, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    if-ltz v4, :cond_9

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-object/from16 v4, v21

    move-object/from16 v17, v3

    goto/16 :goto_3

    :catchall_0
    move-exception v3

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v4

    if-gtz v4, :cond_18

    const-string v4, "\u06e4\u06e5\u06e3"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v25, v3

    move/from16 v39, v4

    goto/16 :goto_0

    :cond_18
    const-string v4, "\u06e7\u06e0\u06e5"

    move/from16 v6, v26

    goto/16 :goto_4

    :sswitch_1c
    :try_start_c
    invoke-interface/range {v37 .. v37}, Ljava/io/Closeable;->close()V

    new-instance v4, Lorg/json/JSONObject;

    move-object/from16 v0, v38

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    if-gtz v3, :cond_19

    :goto_b
    const-string v3, "\u06e0\u06e5\u06e7"

    invoke-static {v3}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v18, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_19
    const-string v3, "\u06e2\u06e4"

    goto/16 :goto_7

    :sswitch_1d
    if-ltz v26, :cond_1a

    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    mul-int/2addr v3, v4

    const v4, 0x1adc8c

    add-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_1e
    :try_start_d
    throw v25
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    :catchall_1
    move-exception v3

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v4, :cond_f

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v4, "\u06e7\u06e8\u06e3"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v19, v3

    move/from16 v39, v4

    goto/16 :goto_0

    :cond_1a
    :sswitch_1f
    sget v3, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v4, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    div-int/lit16 v4, v4, 0x16b7

    sub-int/2addr v3, v4

    if-gtz v3, :cond_1b

    const/16 v3, 0x48

    sput v3, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    const-string v3, "\u06e6\u06e4\u06e7"

    :goto_c
    invoke-static {v3}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_1b
    const-string v3, "\u06e7\u06e8\u06e3"

    goto :goto_c

    :sswitch_20
    move-object/from16 v0, v27

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v6, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    div-int/2addr v4, v6

    const v6, 0x1ab24b

    add-int/2addr v4, v6

    move-object/from16 v35, v3

    move/from16 v39, v4

    goto/16 :goto_0

    :sswitch_21
    :try_start_e
    move-object/from16 v0, v37

    move-object/from16 v1, v25

    invoke-static {v0, v1}, Lff;->j(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0

    invoke-static {}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۦۧۢ۟()I

    move-result v3

    if-ltz v3, :cond_1d

    const/16 v3, 0x5a

    sput v3, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    :cond_1c
    const-string v3, "\u06e1\u06e1\u06e5"

    invoke-static {v3}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_1d
    move-object/from16 v4, v18

    goto/16 :goto_b

    :sswitch_22
    :try_start_f
    const-string v3, "KJ4zyQ==\n"

    const-string v4, "WPFaurZctko=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v18

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    iput-object v3, v5, Li00;->b:Ljava/lang/Object;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0

    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v4, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    add-int/lit16 v4, v4, -0x1e7e

    xor-int/2addr v3, v4

    if-ltz v3, :cond_1e

    const/16 v3, 0xf

    sput v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v3, "\u06e8\u06e1\u06e5"

    invoke-static {v3}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_1e
    const-string v3, "\u06e8\u06e1\u06e5"

    goto/16 :goto_8

    :sswitch_23
    :try_start_10
    new-instance v3, Ljava/io/BufferedReader;

    const/16 v4, 0x2000

    move-object/from16 v0, v21

    invoke-direct {v3, v0, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_0

    sget v4, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v6, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    mul-int/2addr v4, v6

    const v6, 0x1a6931

    xor-int/2addr v4, v6

    move-object/from16 v37, v3

    move/from16 v39, v4

    goto/16 :goto_0

    :sswitch_24
    :try_start_11
    invoke-virtual/range {v17 .. v17}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_0

    move-result-object v14

    const-string v3, "\u06e2\u06e3\u06e8"

    invoke-static {v3}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_1f
    :sswitch_25
    const-string v3, "\u06df\u06e7\u06e3"

    goto/16 :goto_5

    :sswitch_26
    sget v3, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    if-gtz v3, :cond_20

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    const-string v3, "\u06e0\u06e1\u06e0"

    :goto_d
    invoke-static {v3}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_20
    sget v3, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v4, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    xor-int/2addr v3, v4

    const v4, 0xd913

    add-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_27
    move-object/from16 v3, v22

    :cond_21
    sget v4, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    div-int/2addr v4, v6

    const v6, 0x1ac50f

    add-int/2addr v4, v6

    move-object/from16 v22, v3

    move/from16 v39, v4

    goto/16 :goto_0

    :sswitch_28
    invoke-static/range {p1 .. p1}, Lct;->y(Ljava/lang/Object;)V

    const/16 v3, 0xa

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v6, "8A9AZFYYMlTzC0YzBB4+VKcOQDEDGG5Q9gcTNQBMPVQ=\n"

    const-string v10, "xj52ATN8CzE=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    const/4 v4, 0x1

    const-string v6, "pKu05bPOWijzpLex4ZQNLaGi5bLslAwqo6ri5LeeDS8=\n"

    const-string v10, "wpKDgNWtaR0=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    const/4 v4, 0x2

    const-string v6, "hljt3IQP8+iDUO/VhQv1v4IK7IGCX6e40Qzt0tJY8ro=\n"

    const-string v10, "s2je5Oc8l4o=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    const/4 v4, 0x3

    const-string v6, "gZdsNzpaeZvaz2hvOwB6zoqSZj88Ci3O25dnPG0Bfc8=\n"

    const-string v10, "ufZeDgw4SKw=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    const/4 v4, 0x4

    const-string v6, "o2bRiEg9WaX0MIPaGmADr/I3ho1NPVn1oWPR2UtpUfM=\n"

    const-string v10, "kFSz6ylZYZc=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    const/4 v4, 0x5

    const-string v6, "sHDhuoJPF/m3cLXt1k0c/ex3sL2HSBal5CKz6dEaTK8=\n"

    const-string v10, "1UCF3OF8Lpw=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    const/4 v4, 0x6

    const-string v6, "geIhTw91T6GGvy1OD3EX/4a5dh9adkir0OogH15zSvs=\n"

    const-string v10, "4tsULG5HLpk=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    const/4 v4, 0x7

    const-string v6, "DRgSAA1EY3QOTBIBXRVicwEcQFtREGV2C0FGC1lFYCc=\n"

    const-string v10, "OHkkOGl0V0Y=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    const/16 v4, 0x8

    const-string v6, "davryeCbYzMkrO2d45tiYieut5m2mmM+J/zqybuZY2I=\n"

    const-string v10, "EJmPr4L/UQc=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    const/16 v4, 0x9

    const-string v6, "Y9AUqGWZi3813BGuMJ7cdzCLE60ym4x8MNhC+mSb1no=\n"

    const-string v10, "U+lymFP9704=\n"

    invoke-static {v6, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v3, v4

    invoke-static {v3}, Lbb;->f0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v3, "XVmNEus=\n"

    const-string v6, "CA3LP9N6hZ4=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v6, v0, Lat;->f:Ljava/lang/String;

    invoke-static {v6, v3}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget v6, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v10, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    add-int/lit16 v10, v10, -0xfbf

    rem-int/2addr v6, v10

    if-ltz v6, :cond_22

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    const-string v6, "\u06e3\u06e3\u06e4"

    invoke-static {v6}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v32, v3

    move-object/from16 v34, v4

    move/from16 v39, v6

    goto/16 :goto_0

    :cond_22
    sget v6, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v10, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sub-int/2addr v6, v10

    const v10, 0x1ac5b4

    add-int/2addr v6, v10

    move-object/from16 v32, v3

    move-object/from16 v34, v4

    move/from16 v39, v6

    goto/16 :goto_0

    :sswitch_29
    const-string v3, "\u06e2\u06df\u06e8"

    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_2a
    new-instance v5, Li00;

    invoke-direct {v5}, Li00;-><init>()V

    new-instance v8, Li00;

    invoke-direct {v8}, Li00;-><init>()V

    const-string v3, "BTzn55grus9gZM64xT/Jm002kLGhX+n2BBbA\n"

    const-string v4, "4oF2ACO3X3M=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v8, Li00;->b:Ljava/lang/Object;

    new-instance v3, Ljava/util/ArrayList;

    move-object/from16 v0, v34

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v6, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    mul-int/lit16 v6, v6, 0x835

    rem-int/2addr v4, v6

    if-gtz v4, :cond_0

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    const-string v4, "\u06e0\u06e7\u06e5"

    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v27, v3

    move/from16 v39, v4

    goto/16 :goto_0

    :sswitch_2b
    const/4 v3, 0x0

    :try_start_12
    move-object/from16 v0, v28

    move-object/from16 v1, v29

    move/from16 v2, v26

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/Writer;->write([CII)V

    move-object/from16 v0, v37

    move-object/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/io/Reader;->read([C)I
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    move-result v4

    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v6, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    or-int/lit16 v6, v6, 0x119f

    mul-int/2addr v3, v6

    if-ltz v3, :cond_23

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move-object/from16 v3, v23

    :goto_e
    const-string v6, "\u06e5\u06e4\u06e8"

    invoke-static {v6}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v23, v3

    move/from16 v39, v6

    move/from16 v24, v4

    goto/16 :goto_0

    :cond_23
    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v6, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int/2addr v3, v6

    const v6, 0x1ab46e

    add-int/2addr v3, v6

    move/from16 v39, v3

    move/from16 v24, v4

    goto/16 :goto_0

    :sswitch_2c
    sget v3, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    if-ltz v3, :cond_24

    const/4 v3, 0x6

    sput v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v3, "\u06df\u06e7\u06e3"

    move-object v4, v3

    :goto_f
    invoke-static {v4}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_24
    const-string v3, "\u06e6\u06e0\u06df"

    :goto_10
    invoke-static {v3}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_2d
    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    move-result v3

    if-gtz v3, :cond_25

    const-string v4, "\u06e5\u06e8\u06e8"

    move-object/from16 v3, v25

    move/from16 v6, v24

    goto/16 :goto_4

    :cond_25
    sget v3, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sub-int/2addr v3, v4

    const v4, 0x1aa1f4

    add-int/2addr v3, v4

    move/from16 v39, v3

    move/from16 v26, v24

    goto/16 :goto_0

    :sswitch_2e
    rsub-int/lit8 v3, v20, 0x0

    rsub-int/lit8 v4, v3, 0x1

    sget v3, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v6, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    add-int/lit16 v6, v6, 0x188f

    sub-int/2addr v3, v6

    if-ltz v3, :cond_26

    const-string v3, "\u06e0\u06e3\u06e8"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    move/from16 v20, v4

    goto/16 :goto_0

    :cond_26
    const-string v3, "\u06df\u06df\u06e1"

    goto/16 :goto_9

    :sswitch_2f
    const/4 v3, 0x1

    move-object/from16 v0, p0

    iput v3, v0, Lat;->e:I

    move-object/from16 v0, p0

    invoke-static {v9, v7, v0}, La80;->I(Lge;Lwm;Lm50;)Ljava/lang/Object;

    move-result-object v4

    sget-object v3, Lpe;->a:Lpe;

    if-ne v4, v3, :cond_21

    sget v4, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v6, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    rem-int/lit16 v6, v6, 0x154f

    rem-int/2addr v4, v6

    if-ltz v4, :cond_27

    const-string v4, "\u06e8\u06e1"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v22, v3

    move/from16 v39, v4

    goto/16 :goto_0

    :cond_27
    const-string v4, "\u06e0\u06e3\u06e2"

    move-object/from16 v22, v3

    goto :goto_f

    :sswitch_30
    sget v3, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    if-gtz v3, :cond_28

    const/4 v3, 0x7

    sput v3, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v3, "\u06e8\u06e2\u06e2"

    invoke-static {v3}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_28
    const-string v3, "\u06e3\u06e8\u06e4"

    move/from16 v4, v30

    move/from16 v6, v31

    :goto_11
    invoke-static {v3}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v30, v4

    move/from16 v31, v6

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_31
    sget-object v22, Lvh;->n:Lvh;

    :sswitch_32
    return-object v22

    :sswitch_33
    :try_start_13
    move-object/from16 v0, v23

    move-object/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_0

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v3

    if-gtz v3, :cond_29

    const-string v3, "\u06e1\u06e2\u06e3"

    invoke-static {v3}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_29
    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v4, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    rem-int/2addr v3, v4

    const v4, 0x1aab42

    add-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_34
    sget-object v3, Lwg;->a:Lxf;

    sget-object v33, Lls;->a:Ljo;

    move-object/from16 v0, p0

    iget-object v12, v0, Lat;->m:Landroid/widget/EditText;

    new-instance v3, Lzs;

    move-object/from16 v0, p0

    iget-object v4, v0, Lat;->g:Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v6, v0, Lat;->h:Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    iget-object v7, v0, Lat;->i:Landroid/app/Activity;

    move-object/from16 v0, p0

    iget-object v9, v0, Lat;->j:Lon;

    move-object/from16 v0, p0

    iget-object v10, v0, Lat;->k:Landroid/webkit/WebView;

    move-object/from16 v0, p0

    iget-object v11, v0, Lat;->l:Landroid/widget/ScrollView;

    const/4 v13, 0x0

    invoke-direct/range {v3 .. v13}, Lzs;-><init>(Landroid/widget/TextView;Li00;Landroid/widget/LinearLayout;Landroid/app/Activity;Li00;Lon;Landroid/webkit/WebView;Landroid/widget/ScrollView;Landroid/widget/EditText;Lld;)V

    sget v4, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v6, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    rem-int/2addr v4, v6

    const v6, 0x1abe5f

    add-int/2addr v4, v6

    move-object v7, v3

    move-object/from16 v9, v33

    move/from16 v39, v4

    goto/16 :goto_0

    :sswitch_35
    invoke-static/range {v27 .. v27}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v6, 0x0

    const-string v3, "\u06e1\u06e3\u06e3"

    goto :goto_11

    :sswitch_36
    :try_start_14
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v4, v24

    goto/16 :goto_e

    :sswitch_37
    const-string v3, "https://restapi.amap.com/v3/place/text?keywords="

    move-object/from16 v0, v23

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_0

    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    if-ltz v3, :cond_2a

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    const-string v3, "\u06e2\u06e5\u06e3"

    invoke-static {v3}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_2a
    const-string v3, "\u06e5\u06e8\u06e8"

    move-object v4, v3

    goto/16 :goto_f

    :sswitch_38
    :try_start_15
    const-string v3, "5LHX1KdYA7Tkq8+Y5V5Cueu3z5jzVEK05aqW1vJXDvr+vcvdp1EDrOvq1d3zFSqu/rTu6st4DbTk\nodjM7lQM\n"

    const-string v4, "isS7uIc7Yto=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v14}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v0, v14

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v3, v0
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_0

    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v6, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    add-int/lit16 v6, v6, 0x25ab

    rem-int/2addr v4, v6

    if-ltz v4, :cond_2b

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    move/from16 v4, v16

    goto/16 :goto_1

    :cond_2b
    move-object v15, v3

    move-object/from16 v4, v28

    move-object/from16 v6, v29

    goto/16 :goto_2

    :sswitch_39
    :try_start_16
    const-string v3, "toString(...)"

    move-object/from16 v0, v38

    invoke-static {v3, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v4, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    div-int/lit16 v4, v4, 0x1ea4

    xor-int/2addr v3, v4

    if-gtz v3, :cond_2c

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    const-string v3, "\u06e7\u06e3\u06e5"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_2c
    sget v3, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    rem-int/2addr v3, v4

    const v4, -0x1abd1d

    xor-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_3a
    sget v3, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    rem-int/lit16 v4, v4, -0x26cf

    rem-int/2addr v3, v4

    if-gtz v3, :cond_2d

    const-string v3, "\u06e3\u06e4\u06e6"

    move/from16 v4, v30

    move/from16 v6, v31

    goto/16 :goto_11

    :cond_2d
    const-string v3, "\u06e3\u06e0\u06e6"

    goto/16 :goto_d

    :sswitch_3b
    :try_start_17
    const-string v3, "&offset=15&page=1&key="

    move-object/from16 v0, v23

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_0

    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    div-int/lit16 v4, v4, -0x1630

    add-int/2addr v3, v4

    if-gtz v3, :cond_2e

    const-string v3, "\u06e2\u06e4"

    invoke-static {v3}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v39, v3

    goto/16 :goto_0

    :cond_2e
    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    div-int/2addr v3, v4

    const v4, 0x1aabbf

    add-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_3c
    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v4, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    mul-int/lit16 v4, v4, -0xf5

    rem-int/2addr v3, v4

    if-ltz v3, :cond_2f

    const-string v3, "\u06df\u06e6\u06df"

    goto/16 :goto_10

    :cond_2f
    sget v3, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    add-int/2addr v3, v4

    const v4, 0xdcd2

    add-int/2addr v3, v4

    move/from16 v39, v3

    goto/16 :goto_0

    :sswitch_3d
    sget v3, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v4, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    rem-int/2addr v3, v4

    const v4, 0xdd4f

    add-int/2addr v3, v4

    move/from16 v39, v3

    move/from16 v20, v31

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc41 -> :sswitch_0
        0xdc42 -> :sswitch_10
        0xdc61 -> :sswitch_26
        0xdcd8 -> :sswitch_1e
        0xdcf9 -> :sswitch_22
        0x1aa701 -> :sswitch_16
        0x1aa706 -> :sswitch_34
        0x1aa73e -> :sswitch_2
        0x1aa7f9 -> :sswitch_3
        0x1aa7fa -> :sswitch_e
        0x1aa7fb -> :sswitch_28
        0x1aab05 -> :sswitch_3
        0x1aab06 -> :sswitch_6
        0x1aab3f -> :sswitch_32
        0x1aab45 -> :sswitch_3b
        0x1aab82 -> :sswitch_19
        0x1aaba2 -> :sswitch_1d
        0x1aabba -> :sswitch_14
        0x1aabbe -> :sswitch_3c
        0x1aabbf -> :sswitch_a
        0x1aae87 -> :sswitch_1a
        0x1aaec5 -> :sswitch_20
        0x1aaee2 -> :sswitch_39
        0x1aaf01 -> :sswitch_3d
        0x1aaf7f -> :sswitch_35
        0x1ab24b -> :sswitch_36
        0x1ab2c7 -> :sswitch_38
        0x1ab2e4 -> :sswitch_d
        0x1ab300 -> :sswitch_30
        0x1ab31e -> :sswitch_12
        0x1ab624 -> :sswitch_29
        0x1ab629 -> :sswitch_4
        0x1ab684 -> :sswitch_1f
        0x1ab6e3 -> :sswitch_15
        0x1ab71f -> :sswitch_2c
        0x1ab721 -> :sswitch_13
        0x1ab722 -> :sswitch_2d
        0x1ab9e4 -> :sswitch_18
        0x1aba82 -> :sswitch_b
        0x1aba83 -> :sswitch_11
        0x1abaa4 -> :sswitch_2b
        0x1abadd -> :sswitch_1b
        0x1abd8c -> :sswitch_21
        0x1abd8d -> :sswitch_1c
        0x1abe29 -> :sswitch_37
        0x1abe44 -> :sswitch_26
        0x1abe47 -> :sswitch_27
        0x1abe84 -> :sswitch_2f
        0x1abe9e -> :sswitch_2e
        0x1abea5 -> :sswitch_33
        0x1ac165 -> :sswitch_3c
        0x1ac167 -> :sswitch_27
        0x1ac1c8 -> :sswitch_d
        0x1ac206 -> :sswitch_5
        0x1ac220 -> :sswitch_3a
        0x1ac50e -> :sswitch_31
        0x1ac52c -> :sswitch_30
        0x1ac568 -> :sswitch_13
        0x1ac589 -> :sswitch_2a
        0x1ac5c8 -> :sswitch_f
        0x1ac5e9 -> :sswitch_1
        0x1ac604 -> :sswitch_24
        0x1ac605 -> :sswitch_25
        0x1ac622 -> :sswitch_c
        0x1ac8cc -> :sswitch_8
        0x1ac8d0 -> :sswitch_7
        0x1ac90c -> :sswitch_9
        0x1ac964 -> :sswitch_17
        0x1ac9a5 -> :sswitch_23
    .end sparse-switch
.end method
