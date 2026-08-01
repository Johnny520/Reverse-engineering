.class public final Lhs;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lhs;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public static volatile d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "\u06e1\u06e4\u06e7"

    invoke-static {v0}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Lhs;

    invoke-direct {v0}, Lhs;-><init>()V

    sput-object v0, Lhs;->a:Lhs;

    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    div-int/2addr v0, v1

    const v1, 0x1ab623

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v1, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    add-int/lit16 v1, v1, 0x240f

    add-int/2addr v0, v1

    if-gtz v0, :cond_0

    const-string v0, "\u06e7\u06e4\u06e0"

    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v1, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    rem-int/2addr v0, v1

    const v1, 0x1ab04c

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lhs;->b:Ljava/util/concurrent/ConcurrentHashMap;

    sget v0, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    add-int/lit16 v1, v1, 0x18f

    div-int/2addr v0, v1

    if-gtz v0, :cond_1

    const/16 v0, 0x42

    sput v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v0, "\u06e2\u06e0\u06e6"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v1, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    mul-int/2addr v0, v1

    const v1, 0x1d885d

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lhs;->c:Ljava/util/concurrent/ConcurrentHashMap;

    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    rem-int/2addr v0, v1

    const v1, 0x1ab26e

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaf24 -> :sswitch_0
        0x1ab243 -> :sswitch_1
        0x1ab268 -> :sswitch_4
        0x1ab623 -> :sswitch_2
        0x1ab625 -> :sswitch_3
    .end sparse-switch
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 23

    const/16 v18, 0x0

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/16 v19, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v10, 0x0

    const-string v14, "\u06e7\u06e0\u06e4"

    invoke-static {v14}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v20, v9

    move/from16 v21, v13

    move/from16 v22, v14

    :goto_0
    sparse-switch v22, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v10, ""

    :goto_1
    :sswitch_1
    return-object v10

    :sswitch_2
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v9

    rsub-int/lit8 v9, v9, 0x0

    sub-int/2addr v9, v8

    rsub-int/lit8 v9, v9, 0x0

    sget v13, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    xor-int/lit16 v13, v13, -0xe1

    add-int/2addr v9, v13

    move-object/from16 v0, p0

    invoke-virtual {v0, v9, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v19

    const-string v9, "+NLNTdBjEZjsj4EQijg=\n"

    const-string v13, "i6evPqQRePY=\n"

    invoke-static {v9, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v0, v19

    invoke-static {v9, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget v9, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v13, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    add-int/2addr v9, v13

    const v13, 0x1aa941

    xor-int/2addr v9, v13

    move/from16 v22, v9

    goto :goto_0

    :sswitch_3
    const-string v3, "SVxci48so4NcQHXM1mf/6Q==\n"

    const-string v9, "PTMQ5PhJ0cA=\n"

    invoke-static {v3, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v17

    invoke-static {v3, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    sget v9, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v13, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    add-int/lit16 v13, v13, 0x1f4f

    add-int/2addr v9, v13

    if-gtz v9, :cond_1

    :cond_0
    const-string v9, "\u06e7\u06e3\u06e5"

    invoke-static {v9}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v9

    move/from16 v22, v9

    goto :goto_0

    :cond_1
    move-object/from16 v9, v16

    :goto_2
    const-string v13, "\u06e0\u06e4\u06e5"

    invoke-static {v13}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v16, v9

    move/from16 v22, v13

    goto :goto_0

    :sswitch_4
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    sget v13, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    xor-int/lit8 v13, v13, -0x10

    sget v14, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v20, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    div-int v14, v14, v20

    const v20, 0x1ab9c9

    add-int v14, v14, v20

    move-object/from16 v20, v9

    move/from16 v21, v13

    move/from16 v22, v14

    goto/16 :goto_0

    :cond_2
    :sswitch_5
    const-string v9, "\u06e2\u06e1"

    invoke-static {v9}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v22, v9

    goto/16 :goto_0

    :sswitch_6
    sget v9, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v10, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    mul-int/lit16 v10, v10, -0x1f8a

    or-int/2addr v9, v10

    if-ltz v9, :cond_3

    const/16 v9, 0x29

    sput v9, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    const-string v9, "\u06e0\u06e0\u06e4"

    invoke-static {v9}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v9

    move-object v10, v4

    move/from16 v22, v9

    goto/16 :goto_0

    :cond_3
    sget v9, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v10, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    rem-int/2addr v9, v10

    const v10, 0x1ab6f9

    add-int/2addr v9, v10

    move-object v10, v4

    move/from16 v22, v9

    goto/16 :goto_0

    :cond_4
    :sswitch_7
    sget v9, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v13, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    add-int/lit16 v13, v13, -0x15cd

    add-int/2addr v9, v13

    if-ltz v9, :cond_5

    const-string v9, "\u06e8\u06df\u06e4"

    :goto_3
    invoke-static {v9}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v22, v9

    goto/16 :goto_0

    :cond_5
    sget v9, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v13, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    add-int/2addr v9, v13

    const v13, 0x1ace8f

    add-int/2addr v9, v13

    move/from16 v22, v9

    goto/16 :goto_0

    :sswitch_8
    const-string v9, "oiqvImVYeufF\n"

    const-string v13, "ngv0YSEZLqY=\n"

    invoke-static {v9, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v13, 0x1

    move-object/from16 v0, v16

    invoke-static {v0, v9, v13}, Lb50;->N(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_9

    sget v9, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    xor-int/lit16 v9, v9, -0x396

    move-object/from16 v0, v16

    invoke-virtual {v0, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v14

    sget v9, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v11, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    rem-int/lit16 v11, v11, 0xcc4

    add-int/2addr v9, v11

    if-gtz v9, :cond_6

    const/16 v9, 0x15

    sput v9, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    const-string v11, "\u06e7\u06e7\u06e6"

    move-object v9, v12

    move-object v13, v11

    :goto_4
    invoke-static {v13}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v13

    move-object v12, v9

    move-object v11, v14

    move/from16 v22, v13

    goto/16 :goto_0

    :cond_6
    sget v9, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v11, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    add-int/2addr v9, v11

    const v11, 0x1ac0aa

    add-int/2addr v9, v11

    move-object v11, v14

    move/from16 v22, v9

    goto/16 :goto_0

    :sswitch_9
    const-string v9, "zNFaFR3zRHrZzXNSRLgYEA==\n"

    const-string v13, "uL4WemqWNjk=\n"

    invoke-static {v9, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v13, "<"

    invoke-direct {v9, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v13, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v14, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    add-int/lit16 v14, v14, 0x1ba6

    xor-int/2addr v13, v14

    if-gtz v13, :cond_7

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v13, "\u06e5\u06df\u06e2"

    :goto_5
    invoke-static {v13}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v13

    move-object v15, v9

    move/from16 v22, v13

    goto/16 :goto_0

    :cond_7
    const-string v13, "\u06e4\u06e8\u06e6"

    :goto_6
    invoke-static {v13}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v13

    move-object v15, v9

    move/from16 v22, v13

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "><![cdata["

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    const-string v9, "\u06e1\u06e5\u06df"

    invoke-static {v9}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v22, v9

    goto/16 :goto_0

    :cond_9
    :sswitch_b
    const-string v9, "\u06e3\u06e6\u06e4"

    goto/16 :goto_3

    :sswitch_c
    const-string v9, "X6U/\n"

    const-string v13, "AvgBDerfYsg=\n"

    invoke-static {v9, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v11, v9}, Lb50;->C(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/4 v4, 0x0

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v9

    sget v13, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    xor-int/lit16 v13, v13, 0xf3

    add-int/2addr v9, v13

    invoke-virtual {v11, v4, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    move-result v9

    if-ltz v9, :cond_0

    const/16 v9, 0x53

    sput v9, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v9, "\u06df\u06e1\u06e0"

    invoke-static {v9}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v22, v9

    goto/16 :goto_0

    :sswitch_d
    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v0, v17

    move-object/from16 v1, v20

    move/from16 v2, v21

    invoke-static {v0, v1, v8, v9, v2}, Lb50;->G(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_4

    sget v9, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    if-gtz v9, :cond_a

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    const-string v9, "\u06e6\u06e4\u06e8"

    invoke-static {v9}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v22, v9

    goto/16 :goto_0

    :cond_a
    const-string v13, "\u06e2\u06e2\u06e0"

    move-object v9, v15

    goto :goto_5

    :sswitch_e
    move-object/from16 v10, v19

    goto/16 :goto_1

    :sswitch_f
    const-string v6, "</"

    const-string v9, ">"

    invoke-static {v6, v3, v9}, Lz30;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x0

    const/4 v13, 0x4

    move-object/from16 v0, v17

    invoke-static {v0, v6, v5, v9, v13}, Lb50;->G(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v6

    const/4 v9, -0x1

    if-eq v6, v9, :cond_2

    sget v9, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v13, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    or-int/2addr v9, v13

    const v13, -0x1abbd3

    xor-int/2addr v9, v13

    move/from16 v22, v9

    goto/16 :goto_0

    :sswitch_10
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v9

    rsub-int/lit8 v9, v9, 0x0

    sub-int v9, v5, v9

    sget v12, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    xor-int/lit8 v12, v12, -0x69

    add-int/2addr v9, v12

    move-object/from16 v0, p0

    invoke-virtual {v0, v9, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    const-string v12, "YPip5oElxBl0peW7234=\n"

    const-string v13, "E43LlfVXrXc=\n"

    invoke-static {v12, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v9}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget v12, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v13, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    mul-int/lit16 v13, v13, 0x25b7

    or-int/2addr v12, v13

    if-gtz v12, :cond_b

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v12, "\u06e7\u06e0\u06e4"

    invoke-static {v12}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v13

    move-object v12, v9

    move/from16 v22, v13

    goto/16 :goto_0

    :cond_b
    const-string v12, "\u06e7\u06e7\u06e6"

    move-object v13, v12

    move-object v14, v11

    goto/16 :goto_4

    :sswitch_11
    sget v9, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    if-ltz v9, :cond_c

    const/16 v9, 0x22

    sput v9, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v13, "\u06e8\u06df\u06e0"

    move-object v9, v15

    goto/16 :goto_6

    :cond_c
    sget v9, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v13, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    div-int/2addr v9, v13

    const v13, 0x1ac52b

    xor-int/2addr v9, v13

    move/from16 v22, v9

    goto/16 :goto_0

    :sswitch_12
    invoke-static {v12}, Lb50;->T(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    move-result v9

    if-ltz v9, :cond_d

    const/16 v9, 0xf

    sput v9, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    move-object v9, v13

    move-object v10, v13

    goto/16 :goto_2

    :cond_d
    sget v9, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v10, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sub-int/2addr v9, v10

    const v10, 0x1ac784

    add-int/2addr v9, v10

    move-object/from16 v16, v13

    move-object v10, v13

    move/from16 v22, v9

    goto/16 :goto_0

    :sswitch_13
    const-string v5, "<"

    const-string v9, ">"

    invoke-static {v5, v3, v9}, Lz30;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v9, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, v17

    move/from16 v1, v21

    invoke-static {v0, v5, v9, v13, v1}, Lb50;->G(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v5

    const/4 v9, -0x1

    if-eq v5, v9, :cond_2

    sget v9, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v13, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    or-int/lit16 v13, v13, 0x1bba

    or-int/2addr v9, v13

    if-ltz v9, :cond_e

    const/16 v9, 0x5a

    sput v9, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v14, "\u06e2\u06e2\u06e8"

    move-object/from16 v9, v17

    move-object/from16 v13, v18

    :goto_7
    invoke-static {v14}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v17, v9

    move-object/from16 v18, v13

    move/from16 v22, v14

    goto/16 :goto_0

    :cond_e
    sget v9, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v13, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sub-int/2addr v9, v13

    const v13, -0x1abcf3

    xor-int/2addr v9, v13

    move/from16 v22, v9

    goto/16 :goto_0

    :sswitch_14
    const-string v7, "]]></"

    const-string v9, ">"

    invoke-static {v7, v3, v9}, Lz30;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x0

    const/4 v13, 0x4

    move-object/from16 v0, v17

    invoke-static {v0, v7, v8, v9, v13}, Lb50;->G(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v7

    const/4 v9, -0x1

    if-eq v7, v9, :cond_4

    sget v9, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v13, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    div-int/lit16 v13, v13, 0x63f

    xor-int/2addr v9, v13

    if-gez v9, :cond_8

    const-string v9, "\u06e5\u06e2\u06e8"

    goto/16 :goto_3

    :sswitch_15
    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    move-object/from16 v0, p0

    invoke-virtual {v0, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    sget v14, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v17, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    move/from16 v0, v17

    add-int/lit16 v0, v0, -0x1ec4

    move/from16 v17, v0

    xor-int v14, v14, v17

    if-gtz v14, :cond_f

    const-string v14, "\u06e3\u06e6\u06e4"

    invoke-static {v14}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v14

    move-object/from16 v17, v9

    move-object/from16 v18, v13

    move/from16 v22, v14

    goto/16 :goto_0

    :cond_f
    const-string v14, "\u06e2\u06e2\u06e8"

    goto :goto_7

    :sswitch_16
    const-string v9, "iHA7WmY3tIGcLXcHPGw=\n"

    const-string v10, "+wVZKRJF3e8=\n"

    invoke-static {v9, v10}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v11}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v9, "\u06e5\u06df\u06e2"

    move-object v10, v11

    goto/16 :goto_3

    :sswitch_17
    const-string v9, "OHbFjIgDJ+IsK4nR0lg=\n"

    const-string v13, "SwOn//xxTow=\n"

    invoke-static {v9, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v4}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    move-result v9

    if-gtz v9, :cond_10

    const-string v9, "\u06e4\u06e8\u06e6"

    invoke-static {v9}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v22, v9

    goto/16 :goto_0

    :cond_10
    sget v9, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v13, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    mul-int/2addr v9, v13

    const v13, 0x1b43c5

    add-int/2addr v9, v13

    move/from16 v22, v9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc3f -> :sswitch_0
        0x1aa73e -> :sswitch_6
        0x1aaae4 -> :sswitch_7
        0x1aab61 -> :sswitch_9
        0x1aabdd -> :sswitch_e
        0x1aaee4 -> :sswitch_5
        0x1aaf3b -> :sswitch_4
        0x1ab2a0 -> :sswitch_14
        0x1ab2a8 -> :sswitch_3
        0x1ab6e1 -> :sswitch_1
        0x1ab9c9 -> :sswitch_d
        0x1aba02 -> :sswitch_10
        0x1abae2 -> :sswitch_a
        0x1abd88 -> :sswitch_c
        0x1abda7 -> :sswitch_f
        0x1abdeb -> :sswitch_2
        0x1ac16c -> :sswitch_11
        0x1ac1e6 -> :sswitch_b
        0x1ac1ea -> :sswitch_16
        0x1ac52b -> :sswitch_15
        0x1ac589 -> :sswitch_17
        0x1ac606 -> :sswitch_12
        0x1ac94b -> :sswitch_8
        0x1ac9a4 -> :sswitch_13
    .end sparse-switch
.end method

.method public static b(Landroid/content/ContentValues;)V
    .locals 12

    const/4 v4, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    const-string v0, "ua8=\n"

    const-string v1, "2tnuwoEiw7Q=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "rmuoYcHAew==\n"

    const-string v1, "zQTGFaSuD0U=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v8, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    const-string v0, "HglB2AeF\n"

    const-string v1, "amgts2L3ouA=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-nez v5, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_2

    :sswitch_7
    const-string v5, ""

    :sswitch_8
    sget-object v0, Lgn;->a:Lgn;

    const-string v1, "WOjpN2VL0fhK0vsNcEnd4VfS8gRoXdn/Wv7k\n"

    const-string v2, "M42QaAk+spM=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, ""

    invoke-static {v1, v0}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lb50;->H(Ljava/lang/CharSequence;)Z

    move-result v2

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v2, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    new-array v0, v4, [Ljava/lang/String;

    const-string v2, "Ow==\n"

    const-string v3, "F61Pn0bp5pE=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v6

    const-string v2, "N+tF\n"

    const-string v3, "2FfJ4WrGEWw=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v7

    invoke-static {v1, v0}, Lb50;->M(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :sswitch_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const v0, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_d
    const v0, 0xbf39

    goto :goto_4

    :sswitch_e
    if-eqz v1, :cond_3

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_f
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lb50;->H(Ljava/lang/CharSequence;)Z

    move-result v4

    const v0, 0xc202

    :goto_5
    const v9, 0xc213

    xor-int/2addr v0, v9

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_10
    if-nez v4, :cond_4

    const v0, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_11
    const v0, 0xc240

    goto :goto_5

    :sswitch_12
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0xc27e

    :goto_6
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :sswitch_13
    const v0, 0xc29d

    goto :goto_6

    :sswitch_14
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const v0, 0xc2fa

    :goto_7
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_15
    if-eqz v1, :cond_5

    const v0, 0xc5e2

    goto :goto_7

    :cond_5
    :sswitch_16
    const v0, 0xc5c3

    goto :goto_7

    :sswitch_17
    const v0, 0xc601

    :goto_8
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :sswitch_18
    const v0, 0xc620

    goto :goto_8

    :sswitch_19
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v1, v6

    :sswitch_1a
    const v0, 0xc67d

    :goto_9
    const v4, 0xc68e

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_9

    goto :goto_9

    :cond_6
    :sswitch_1b
    const v0, 0xc6bb

    goto :goto_9

    :sswitch_1c
    if-ge v1, v3, :cond_6

    const v0, 0xc965

    goto :goto_9

    :sswitch_1d
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    check-cast v0, Ljava/lang/String;

    invoke-static {v8, v0, v7}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    const v0, 0xc984

    :goto_a
    const v9, 0xc995

    xor-int/2addr v0, v9

    sparse-switch v0, :sswitch_data_a

    goto :goto_a

    :sswitch_1e
    if-eqz v4, :cond_7

    const v0, 0xc9e1

    goto :goto_a

    :cond_7
    :sswitch_1f
    const v0, 0xc9c2

    goto :goto_a

    :sswitch_20
    const v0, 0xca00

    :goto_b
    const v1, 0xca11

    xor-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_b

    :goto_c
    :pswitch_1
    :sswitch_21
    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v1

    const v0, 0x17790d

    :goto_d
    const v2, 0x17791e

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_b

    goto :goto_d

    :sswitch_22
    if-gtz v1, :cond_20

    const v0, 0x17796a

    goto :goto_d

    :pswitch_2
    const v0, 0xca1f

    goto :goto_b

    :sswitch_23
    new-instance v3, Li00;

    invoke-direct {v3}, Li00;-><init>()V

    sget-object v0, Lpb0;->Q0:Ljava/lang/String;

    invoke-static {v8, v0}, Lhs;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Li00;->b:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const v0, 0xca7c

    :goto_e
    const v2, 0xca8d

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_c

    goto :goto_e

    :sswitch_24
    if-nez v1, :cond_8

    const v0, 0xcd64

    goto :goto_e

    :cond_8
    :sswitch_25
    const v0, 0xcd45

    goto :goto_e

    :sswitch_26
    const v0, 0xcd83

    :goto_f
    const v1, 0xcd94

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_d

    goto :goto_f

    :sswitch_27
    const v0, 0xcda2

    goto :goto_f

    :sswitch_28
    iget-object v0, v3, Li00;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "dHdBOxU=\n"

    const-string v2, "UhYsSy7vAxg=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Gg==\n"

    const-string v4, "PJ7m2t2Tl/4=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lb50;->L(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Li00;->b:Ljava/lang/Object;

    sget-object v1, Lhs;->b:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "global_"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const v0, 0xcdff

    :goto_10
    const v2, 0xce10

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_e

    goto :goto_10

    :cond_9
    :sswitch_29
    const v0, 0xce3d

    goto :goto_10

    :sswitch_2a
    if-eqz v1, :cond_9

    const v0, 0xd0e7

    goto :goto_10

    :sswitch_2b
    const v0, 0xd106

    :goto_11
    const v1, 0xd117

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_f

    goto :goto_11

    :sswitch_2c
    const v0, 0xd125

    goto :goto_11

    :sswitch_2d
    :try_start_0
    sget-object v0, Lgn;->a:Lgn;

    const-string v1, "ww46ko6I18bRNC2ilpTSxMsKN6SNkw==\n"

    const-string v2, "qGtDzeL9tK0=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lgn;->e(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const v1, 0xd182

    :goto_12
    const v2, 0xd193

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_10

    goto :goto_12

    :sswitch_2e
    const v1, 0xd1a1

    goto :goto_12

    :catchall_0
    move-exception v0

    move v0, v6

    :sswitch_2f
    const v1, 0xd1fe

    :goto_13
    const v2, 0xd20f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_11

    goto :goto_13

    :sswitch_30
    if-eqz v0, :cond_a

    const v1, 0xd4e6

    goto :goto_13

    :cond_a
    :sswitch_31
    const v1, 0xd4c7

    goto :goto_13

    :sswitch_32
    sget-object v0, Lgn;->a:Lgn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, Lgn;->b:Landroid/app/Application;

    const v0, 0xd505

    :goto_14
    const v1, 0xd516

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_12

    goto :goto_14

    :sswitch_33
    if-nez v9, :cond_b

    const v0, 0xd562

    goto :goto_14

    :cond_b
    :sswitch_34
    const v0, 0xd543

    goto :goto_14

    :sswitch_35
    const v0, 0xd581

    :goto_15
    const v1, 0xd592

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_13

    goto :goto_15

    :sswitch_36
    const v0, 0xd5a0

    goto :goto_15

    :sswitch_37
    :try_start_1
    const-string v0, "oNxk09rC+ya62n/U\n"

    const-string v1, "zrMQuryrmEc=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "ez/sHxu1HB97JfRTWbNdEnQ59FNPuV0feiStHU66EVFhM/AWG7cTFWcl6RcVtw0BOwTvB1KwFBJ0\nPukcVZscH3Qt5QE=\n"

    const-string v2, "FUqAczvWfXE=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Landroid/app/NotificationManager;

    const-string v1, "nGxYGnaPpeWQcGIcRo21/6RqVRBHjbXq\n"

    const-string v2, "+wk9cSnj0IY=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-instance v1, Landroid/app/NotificationChannel;

    const-string v2, "L9WL3lt3wAdrroayPWe3VE/Z\n"

    const-string v4, "yUsKN9voJ70=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    invoke-direct {v1, v10, v2, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const-string v2, "TncFGLBLZ7YYMTtQ4X8j2RJ2YHKAJhWIT04BGK1hZ6M/PAJU4G4Y2hFdbH6fJx2b\n"

    const-string v4, "qNSF/gXAgj4=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    const/4 v2, 0x4

    new-array v2, v2, [J

    fill-array-data v2, :array_0

    invoke-virtual {v1, v2}, Landroid/app/NotificationChannel;->setVibrationPattern([J)V

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    const-string v1, "2GyBvMnQwPT1\n"

    const-string v2, "mA/p3b2ir5s=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lb50;->C(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    const v1, 0xd888

    :goto_16
    const v4, 0xd899

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_14

    goto :goto_16

    :sswitch_38
    if-eqz v2, :cond_c

    const v1, 0xd8e5

    goto :goto_16

    :cond_c
    :sswitch_39
    const v1, 0xd8c6

    goto :goto_16

    :sswitch_3a
    const-string v2, "+TvVbZcGAcuvf+svygxupKU6sAen\n"

    const-string v1, "H5hViyKN5EM=\n"

    :sswitch_3b
    invoke-static {v2, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const v1, 0xd904

    :goto_17
    const v4, 0xd915

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_15

    goto :goto_17

    :sswitch_3c
    const v1, 0xd923

    goto :goto_17

    :sswitch_3d
    const-string v2, "UsFd0Pr1GUQesVGPlf9fGTjQ\n"

    const-string v1, "tFXrNXJF/fw=\n"

    const v4, 0xd980

    :goto_18
    const v11, 0xd991

    xor-int/2addr v4, v11

    sparse-switch v4, :sswitch_data_16

    goto :goto_18

    :sswitch_3e
    const v4, 0xdc2a

    goto :goto_18

    :sswitch_3f
    const-string v1, "Gll4fKMbUdsIY29MuwdU2RJddUqgAG3EFER1\n"

    const-string v4, "cTwBI89uMrA=\n"

    invoke-static {v1, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "8gRpgge0dGtTzK8M1nP1+yiJo3yiXLquP8nqYsw+rMubTyI=\n"

    const-string v11, "tWEM6UrbEEs=\n"

    invoke-static {v4, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Landroid/app/Notification$Builder;

    invoke-direct {v4, v9, v10}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v9}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v9

    iget v9, v9, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-virtual {v4, v9}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v1

    const-string v2, "+1VT6muqVrzpXkTOcvYX0aYZ\n"

    const-string v4, "iDAnqx7eOf8=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v2

    invoke-virtual {v1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :sswitch_40
    sget-object v0, Lgn;->a:Lgn;

    const-string v1, "nwPWbd/kPgmNOcJd1/Q=\n"

    const-string v2, "9GavMrORXWI=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v6}, Lgn;->b(Ljava/lang/String;I)I

    move-result v1

    const v0, 0xdc87

    :goto_19
    const v2, 0xdc98

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_17

    goto :goto_19

    :sswitch_41
    if-eqz v1, :cond_d

    const v0, 0xdce4

    goto :goto_19

    :cond_d
    :sswitch_42
    const v0, 0xdcc5

    goto :goto_19

    :sswitch_43
    const v0, 0xdd03

    :goto_1a
    const v2, 0xdd14

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_18

    goto :goto_1a

    :sswitch_44
    if-eq v1, v7, :cond_e

    const v0, 0x170090

    goto :goto_1a

    :cond_e
    :sswitch_45
    const v0, 0xdd41

    goto :goto_1a

    :sswitch_46
    const v0, 0x1700af

    :goto_1b
    const v1, 0x1700c0

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_19

    goto :goto_1b

    :sswitch_47
    const v0, 0x1700ce

    goto :goto_1b

    :sswitch_48
    new-instance v2, Li00;

    invoke-direct {v2}, Li00;-><init>()V

    sget-object v0, Lpb0;->R0:Ljava/lang/String;

    invoke-static {v8, v0}, Lhs;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Li00;->b:Ljava/lang/Object;

    new-instance v4, Li00;

    invoke-direct {v4}, Li00;-><init>()V

    sget-object v0, Lpb0;->S0:Ljava/lang/String;

    invoke-static {v8, v0}, Lhs;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Li00;->b:Ljava/lang/Object;

    sget-object v8, Lpb0;->T0:Ljava/lang/String;

    sget-object v9, Lpb0;->U0:Ljava/lang/String;

    iget-object v0, v2, Li00;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const v0, 0x17012b

    :goto_1c
    const v10, 0x17013c

    xor-int/2addr v0, v10

    sparse-switch v0, :sswitch_data_1a

    goto :goto_1c

    :sswitch_49
    if-nez v1, :cond_f

    const v0, 0x170188

    goto :goto_1c

    :cond_f
    :sswitch_4a
    const v0, 0x170169

    goto :goto_1c

    :sswitch_4b
    const v0, 0x1701a7

    :goto_1d
    const v1, 0x1701b8

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1b

    goto :goto_1d

    :sswitch_4c
    const v0, 0x170451

    goto :goto_1d

    :sswitch_4d
    move v0, v7

    :goto_1e
    const v1, 0x1704ae

    :goto_1f
    const v10, 0x1704bf

    xor-int/2addr v1, v10

    sparse-switch v1, :sswitch_data_1c

    goto :goto_1f

    :sswitch_4e
    if-eqz v0, :cond_10

    const v1, 0x17050b

    goto :goto_1f

    :sswitch_4f
    move v0, v6

    goto :goto_1e

    :cond_10
    :sswitch_50
    const v1, 0x1704ec

    goto :goto_1f

    :sswitch_51
    iget-object v0, v3, Li00;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0, v8, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    const v0, 0x17052a

    :goto_20
    const v10, 0x17053b

    xor-int/2addr v0, v10

    sparse-switch v0, :sswitch_data_1d

    goto :goto_20

    :sswitch_52
    if-eqz v1, :cond_11

    const v0, 0x170812

    goto :goto_20

    :cond_11
    :sswitch_53
    const v0, 0x170568

    goto :goto_20

    :sswitch_54
    iget-object v0, v3, Li00;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v8}, Lb50;->O(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "pA==\n"

    const-string v8, "grUPVWBn/iY=\n"

    invoke-static {v1, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lb50;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Li00;->b:Ljava/lang/Object;

    :sswitch_55
    iget-object v0, v4, Li00;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const v0, 0x170831

    :goto_21
    const v8, 0x170842

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_1e

    goto :goto_21

    :cond_12
    :sswitch_56
    const v0, 0x17086f

    goto :goto_21

    :sswitch_57
    if-nez v1, :cond_12

    const v0, 0x17088e

    goto :goto_21

    :sswitch_58
    const v0, 0x1708ad

    :goto_22
    const v1, 0x1708be

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1f

    goto :goto_22

    :sswitch_59
    const v0, 0x1708cc

    goto :goto_22

    :sswitch_5a
    move v0, v7

    :goto_23
    const v1, 0x170929

    :goto_24
    const v8, 0x17093a

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_20

    goto :goto_24

    :sswitch_5b
    if-eqz v0, :cond_13

    const v1, 0x170c11

    goto :goto_24

    :sswitch_5c
    move v0, v6

    goto :goto_23

    :cond_13
    :sswitch_5d
    const v1, 0x170bf2

    goto :goto_24

    :sswitch_5e
    iget-object v0, v3, Li00;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0, v9, v6}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    const v0, 0x170c30

    :goto_25
    const v8, 0x170c41

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_21

    goto :goto_25

    :cond_14
    :sswitch_5f
    const v0, 0x170c6e

    goto :goto_25

    :sswitch_60
    if-eqz v1, :cond_14

    const v0, 0x170c8d

    goto :goto_25

    :sswitch_61
    iget-object v0, v3, Li00;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v9}, Lb50;->O(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "fg==\n"

    const-string v8, "WEc279lJrVM=\n"

    invoke-static {v1, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lb50;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Li00;->b:Ljava/lang/Object;

    :sswitch_62
    iget-object v0, v2, Li00;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const v0, 0x170cac

    :goto_26
    const v8, 0x170cbd

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_22

    goto :goto_26

    :sswitch_63
    if-lez v1, :cond_15

    const v0, 0x170f94

    goto :goto_26

    :cond_15
    :sswitch_64
    const v0, 0x170cea

    goto :goto_26

    :sswitch_65
    const v0, 0x170fb3

    :goto_27
    const v1, 0x170fc4

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_23

    goto :goto_27

    :sswitch_66
    move v0, v7

    :goto_28
    const v1, 0x17102f

    :goto_29
    const v8, 0x171040

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_24

    goto :goto_29

    :cond_16
    :sswitch_67
    const v1, 0x17106d

    goto :goto_29

    :sswitch_68
    const v0, 0x170fd2

    goto :goto_27

    :sswitch_69
    move v0, v6

    goto :goto_28

    :sswitch_6a
    if-eqz v0, :cond_16

    const v1, 0x17108c

    goto :goto_29

    :sswitch_6b
    iget-object v0, v4, Li00;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const v0, 0x1710ab

    :goto_2a
    const v8, 0x1710bc

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_25

    goto :goto_2a

    :sswitch_6c
    if-lez v1, :cond_17

    const v0, 0x171393

    goto :goto_2a

    :cond_17
    :sswitch_6d
    const v0, 0x171374

    goto :goto_2a

    :sswitch_6e
    const v0, 0x1713b2

    :goto_2b
    const v1, 0x1713c3

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_26

    goto :goto_2b

    :goto_2c
    :sswitch_6f
    const v0, 0x17142e

    :goto_2d
    const v1, 0x17143f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_27

    goto :goto_2d

    :sswitch_70
    if-eqz v7, :cond_18

    const v0, 0x171716

    goto :goto_2d

    :sswitch_71
    const v0, 0x1713d1

    goto :goto_2b

    :sswitch_72
    move v7, v6

    goto :goto_2c

    :cond_18
    :sswitch_73
    const v0, 0x17146c

    goto :goto_2d

    :sswitch_74
    sget-object v0, Lhs;->b:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, v2, Li00;->b:Ljava/lang/Object;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "recv_"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const v0, 0x171735

    :goto_2e
    const v6, 0x171746

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_28

    goto :goto_2e

    :cond_19
    :sswitch_75
    const v0, 0x171773

    goto :goto_2e

    :sswitch_76
    if-nez v1, :cond_19

    const v0, 0x171792

    goto :goto_2e

    :sswitch_77
    sget-object v0, Lhs;->c:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, v2, Li00;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Ld9;->a:Ljava/lang/ClassLoader;

    const v0, 0x1717b1

    :goto_2f
    const v6, 0x1717c2

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_29

    goto :goto_2f

    :cond_1a
    :sswitch_78
    const v0, 0x1717ef

    goto :goto_2f

    :sswitch_79
    if-eqz v1, :cond_1a

    const v0, 0x17180e

    goto :goto_2f

    :sswitch_7a
    sget-object v6, Lhs;->a:Lhs;

    sget-boolean v7, Lhs;->d:Z

    const v0, 0x17182d

    :goto_30
    const v8, 0x17183e

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_2a

    goto :goto_30

    :sswitch_7b
    if-eqz v7, :cond_1b

    const v0, 0x171b15

    goto :goto_30

    :cond_1b
    :sswitch_7c
    const v0, 0x171af6

    goto :goto_30

    :sswitch_7d
    const v0, 0x171b34

    :goto_31
    const v6, 0x171b45

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_2b

    goto :goto_31

    :goto_32
    :sswitch_7e
    sget-object v6, Ld9;->b:Landroid/os/Handler;

    new-instance v0, Les;

    invoke-direct/range {v0 .. v5}, Les;-><init>(Ljava/lang/ClassLoader;Li00;Li00;Li00;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const v0, 0x1722b6

    :goto_33
    const v1, 0x1722c7

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_2c

    goto :goto_33

    :sswitch_7f
    const v0, 0x1722d5

    goto :goto_33

    :sswitch_80
    const v0, 0x171b53

    goto :goto_31

    :sswitch_81
    monitor-enter v6

    :try_start_2
    sget-boolean v7, Lhs;->d:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const v0, 0x171bb0

    :goto_34
    const v8, 0x171bc1

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_2d

    goto :goto_34

    :cond_1c
    :sswitch_82
    const v0, 0x171bee

    goto :goto_34

    :sswitch_83
    if-eqz v7, :cond_1c

    const v0, 0x171e98

    goto :goto_34

    :sswitch_84
    monitor-exit v6

    const v0, 0x171eb7

    :goto_35
    const v6, 0x171ec8

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_2e

    goto :goto_35

    :sswitch_85
    const v0, 0x171ed6

    goto :goto_35

    :sswitch_86
    :try_start_3
    sget-object v0, Lpb0;->m:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    const v0, 0x171f33

    :goto_36
    const v8, 0x171f44

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_2f

    goto :goto_36

    :cond_1d
    :sswitch_87
    const v0, 0x171f71

    goto :goto_36

    :sswitch_88
    if-lez v7, :cond_1d

    const v0, 0x171f90

    goto :goto_36

    :sswitch_89
    sget-object v0, Lpb0;->m:Ljava/lang/String;

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v7

    const v0, 0x171faf

    :goto_37
    const v8, 0x171fc0

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_30

    goto :goto_37

    :sswitch_8a
    if-eqz v7, :cond_1e

    const v0, 0x172297

    goto :goto_37

    :cond_1e
    :sswitch_8b
    const v0, 0x172278

    goto :goto_37

    :sswitch_8c
    sget-object v0, Lpb0;->N0:Ljava/lang/String;

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v9, Lfs;

    const/4 v10, 0x0

    invoke-direct {v9, v1, v10}, Lfs;-><init>(Ljava/lang/ClassLoader;I)V

    const/4 v10, 0x4

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v8, v10, v11

    const/4 v8, 0x1

    const-class v11, Ljava/lang/String;

    aput-object v11, v10, v8

    const/4 v8, 0x2

    const-class v11, Lorg/json/JSONObject;

    aput-object v11, v10, v8

    const/4 v8, 0x3

    aput-object v9, v10, v8

    invoke-static {v7, v0, v10}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    const/4 v0, 0x1

    sput-boolean v0, Lhs;->d:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    :sswitch_8d
    monitor-exit v6

    goto/16 :goto_32

    :catchall_1
    move-exception v0

    monitor-exit v6

    throw v0

    :sswitch_8e
    invoke-static {v5}, Lhs;->c(Ljava/lang/String;)Z

    move-result v1

    const v0, 0x172332

    :goto_38
    const v2, 0x172343

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_31

    goto :goto_38

    :cond_1f
    :sswitch_8f
    const v0, 0x172370

    goto :goto_38

    :sswitch_90
    if-eqz v1, :cond_1f

    const v0, 0x1774ef

    goto :goto_38

    :sswitch_91
    const v0, 0x17750e

    :goto_39
    const v1, 0x17751f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_32

    goto :goto_39

    :sswitch_92
    const v0, 0x17752d

    goto :goto_39

    :sswitch_93
    :try_start_4
    const-string v0, "CQcHYS7QGoQbPRpbLsQA\n"

    const-string v1, "YmJ+PkKlee8=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lgn;->b(Ljava/lang/String;I)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-result v0

    int-to-long v0, v0

    const v2, 0x17758a

    :goto_3a
    const v4, 0x17759b

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_33

    goto :goto_3a

    :sswitch_94
    const v2, 0x1775a9

    goto :goto_3a

    :catchall_2
    move-exception v0

    :try_start_5
    sget-object v0, Lgn;->a:Lgn;

    const-string v1, "0KG4tx45fcDCm6WNHi1n\n"

    const-string v2, "u8TB6HJMHqs=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Dw==\n"

    const-string v4, "Pyr5ug3Or2k=\n"

    invoke-static {v2, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-result-wide v0

    const v2, 0x177606

    :goto_3b
    const v4, 0x177617

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_34

    goto :goto_3b

    :sswitch_95
    const v2, 0x1778b0

    goto :goto_3b

    :catchall_3
    move-exception v0

    const-wide/16 v0, 0x0

    :sswitch_96
    sget-object v2, Ld9;->b:Landroid/os/Handler;

    new-instance v4, Lp1;

    const/16 v5, 0x9

    invoke-direct {v4, v5, v3}, Lp1;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v4, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_c

    :cond_20
    :sswitch_97
    const v0, 0x17794b

    goto/16 :goto_d

    :sswitch_98
    const-string v0, "xb"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۧۨۧ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    :sswitch_99
    return-void

    :catchall_4
    move-exception v0

    const v0, 0x177989

    :goto_3c
    const v1, 0x17799a

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_35

    goto :goto_3c

    :sswitch_9a
    const v0, 0x1779a8

    goto :goto_3c

    :catchall_5
    move-exception v0

    const v0, 0x177c90

    :goto_3d
    const v7, 0x177ca1

    xor-int/2addr v0, v7

    sparse-switch v0, :sswitch_data_36

    goto :goto_3d

    :sswitch_9b
    const v0, 0x177caf

    goto :goto_3d

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_23
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_14
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_c
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_19
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x32 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_23
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_1f
        0x57 -> :sswitch_1a
        0x74 -> :sswitch_20
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        0x13 -> :sswitch_22
        0x32 -> :sswitch_97
        0x55 -> :sswitch_99
        0x74 -> :sswitch_98
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_25
        0x7c8 -> :sswitch_28
        0x7e9 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_27
        0x36 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_29
        0x2d -> :sswitch_2d
        0x3ef -> :sswitch_2a
        0x1ef7 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_2c
        0x32 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_2e
        0x32 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_30
        0x6a7 -> :sswitch_31
        0x6c8 -> :sswitch_40
        0x6e9 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_33
        0x32 -> :sswitch_34
        0x55 -> :sswitch_37
        0x74 -> :sswitch_35
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_36
        0x32 -> :sswitch_40
    .end sparse-switch

    :array_0
    .array-data 8
        0x0
        0xc8
        0x64
        0xc8
    .end array-data

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_38
        0x3e -> :sswitch_39
        0x5f -> :sswitch_3d
        0x7c -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3c
        0x36 -> :sswitch_3f
    .end sparse-switch

    :sswitch_data_16
    .sparse-switch
        0x11 -> :sswitch_3e
        0x5bb -> :sswitch_3b
    .end sparse-switch

    :sswitch_data_17
    .sparse-switch
        0x1f -> :sswitch_41
        0x3e -> :sswitch_42
        0x5d -> :sswitch_8e
        0x7c -> :sswitch_43
    .end sparse-switch

    :sswitch_data_18
    .sparse-switch
        0x17 -> :sswitch_44
        0x36 -> :sswitch_45
        0x55 -> :sswitch_48
        0x17dd84 -> :sswitch_46
    .end sparse-switch

    :sswitch_data_19
    .sparse-switch
        0xe -> :sswitch_21
        0x6f -> :sswitch_47
    .end sparse-switch

    :sswitch_data_1a
    .sparse-switch
        0x17 -> :sswitch_49
        0x55 -> :sswitch_4f
        0x76 -> :sswitch_4a
        0xb4 -> :sswitch_4b
    .end sparse-switch

    :sswitch_data_1b
    .sparse-switch
        0x1f -> :sswitch_4c
        0x5e9 -> :sswitch_4d
    .end sparse-switch

    :sswitch_data_1c
    .sparse-switch
        0x11 -> :sswitch_4e
        0x53 -> :sswitch_55
        0x72 -> :sswitch_50
        0x1b4 -> :sswitch_51
    .end sparse-switch

    :sswitch_data_1d
    .sparse-switch
        0x11 -> :sswitch_52
        0x53 -> :sswitch_55
        0x72 -> :sswitch_53
        0xd29 -> :sswitch_54
    .end sparse-switch

    :sswitch_data_1e
    .sparse-switch
        0x12 -> :sswitch_56
        0x2d -> :sswitch_5c
        0x73 -> :sswitch_57
        0xcc -> :sswitch_58
    .end sparse-switch

    :sswitch_data_1f
    .sparse-switch
        0x13 -> :sswitch_59
        0x72 -> :sswitch_5a
    .end sparse-switch

    :sswitch_data_20
    .sparse-switch
        0x13 -> :sswitch_5b
        0x2c8 -> :sswitch_62
        0x2e9 -> :sswitch_5d
        0x52b -> :sswitch_5e
    .end sparse-switch

    :sswitch_data_21
    .sparse-switch
        0xe -> :sswitch_5f
        0x2f -> :sswitch_62
        0x71 -> :sswitch_60
        0xcc -> :sswitch_61
    .end sparse-switch

    :sswitch_data_22
    .sparse-switch
        0x11 -> :sswitch_63
        0x57 -> :sswitch_69
        0x76 -> :sswitch_64
        0x329 -> :sswitch_65
    .end sparse-switch

    :sswitch_data_23
    .sparse-switch
        0x16 -> :sswitch_66
        0x77 -> :sswitch_68
    .end sparse-switch

    :sswitch_data_24
    .sparse-switch
        0xe -> :sswitch_67
        0x2d -> :sswitch_21
        0x6f -> :sswitch_6a
        0xcc -> :sswitch_6b
    .end sparse-switch

    :sswitch_data_25
    .sparse-switch
        0x17 -> :sswitch_6c
        0x32f -> :sswitch_6e
        0x3c8 -> :sswitch_72
        0x3e9 -> :sswitch_6d
    .end sparse-switch

    :sswitch_data_26
    .sparse-switch
        0x12 -> :sswitch_6f
        0x71 -> :sswitch_71
    .end sparse-switch

    :sswitch_data_27
    .sparse-switch
        0x11 -> :sswitch_70
        0x53 -> :sswitch_21
        0x72 -> :sswitch_73
        0x329 -> :sswitch_74
    .end sparse-switch

    :sswitch_data_28
    .sparse-switch
        0x12 -> :sswitch_75
        0x35 -> :sswitch_21
        0x73 -> :sswitch_76
        0xd4 -> :sswitch_77
    .end sparse-switch

    :sswitch_data_29
    .sparse-switch
        0x12 -> :sswitch_78
        0x2d -> :sswitch_21
        0x73 -> :sswitch_79
        0xfcc -> :sswitch_7a
    .end sparse-switch

    :sswitch_data_2a
    .sparse-switch
        0x13 -> :sswitch_7b
        0x2c8 -> :sswitch_81
        0x2e9 -> :sswitch_7c
        0x32b -> :sswitch_7d
    .end sparse-switch

    :sswitch_data_2b
    .sparse-switch
        0x16 -> :sswitch_7e
        0x71 -> :sswitch_80
    .end sparse-switch

    :sswitch_data_2c
    .sparse-switch
        0x12 -> :sswitch_21
        0x71 -> :sswitch_7f
    .end sparse-switch

    :sswitch_data_2d
    .sparse-switch
        0xe -> :sswitch_82
        0x2f -> :sswitch_86
        0x71 -> :sswitch_83
        0x559 -> :sswitch_84
    .end sparse-switch

    :sswitch_data_2e
    .sparse-switch
        0x1e -> :sswitch_7e
        0x7f -> :sswitch_85
    .end sparse-switch

    :sswitch_data_2f
    .sparse-switch
        0x16 -> :sswitch_87
        0x35 -> :sswitch_8d
        0x77 -> :sswitch_88
        0xd4 -> :sswitch_89
    .end sparse-switch

    :sswitch_data_30
    .sparse-switch
        0x6f -> :sswitch_8a
        0x3d57 -> :sswitch_8c
        0x3d99 -> :sswitch_8b
        0x3db8 -> :sswitch_8d
    .end sparse-switch

    :sswitch_data_31
    .sparse-switch
        0x12 -> :sswitch_8f
        0x33 -> :sswitch_93
        0x71 -> :sswitch_90
        0x57ac -> :sswitch_91
    .end sparse-switch

    :sswitch_data_32
    .sparse-switch
        0x11 -> :sswitch_92
        0x32 -> :sswitch_21
    .end sparse-switch

    :sswitch_data_33
    .sparse-switch
        0x11 -> :sswitch_94
        0x32 -> :sswitch_96
    .end sparse-switch

    :sswitch_data_34
    .sparse-switch
        0x11 -> :sswitch_95
        0xea7 -> :sswitch_96
    .end sparse-switch

    :sswitch_data_35
    .sparse-switch
        0x13 -> :sswitch_9a
        0x32 -> :sswitch_40
    .end sparse-switch

    :sswitch_data_36
    .sparse-switch
        0xe -> :sswitch_8d
        0x31 -> :sswitch_9b
    .end sparse-switch
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 12

    const/4 v0, 0x0

    const-string v1, "\u06e6\u06e3\u06e4"

    invoke-static {v1}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v3

    move-object v9, v0

    move-object v1, v0

    move-object v10, v0

    move-object v11, v0

    move-object v2, v0

    move-object v4, v0

    move-object v5, v0

    move-object v8, v0

    move-object v6, v0

    move v7, v3

    :goto_0
    sparse-switch v7, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    if-gtz v3, :cond_4

    const-string v3, "\u06df\u06df\u06e3"

    invoke-static {v3}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v4, v0

    move v7, v3

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    div-int/lit16 v3, v3, 0xe31

    xor-int/2addr v0, v3

    if-gtz v0, :cond_0

    const-string v0, "\u06e5\u06e3\u06e1"

    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto :goto_0

    :cond_0
    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    or-int/2addr v0, v3

    const v3, 0x1aa412

    add-int/2addr v0, v3

    move v7, v0

    goto :goto_0

    :sswitch_2
    invoke-virtual {v10, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0

    :sswitch_3
    invoke-static {v6, v4}, Lb50;->M(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    const-string v5, "\u06e6\u06df\u06e5"

    move-object v3, v6

    move-object v7, v5

    :goto_1
    invoke-static {v7}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v7

    move-object v5, v0

    move-object v6, v3

    goto :goto_0

    :sswitch_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    move-result v3

    if-ltz v3, :cond_1

    :cond_1
    const-string v3, "\u06e6\u06e6\u06e3"

    invoke-static {v3}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v3

    move-object v10, v0

    move v7, v3

    goto :goto_0

    :cond_2
    :sswitch_5
    sget v0, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    add-int/lit16 v3, v3, -0x10c3

    rem-int/2addr v0, v3

    if-ltz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    const-string v0, "\u06e8\u06df"

    :goto_2
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e6\u06e4\u06e6"

    goto :goto_2

    :sswitch_6
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v3, "\u06df\u06df\u06e3"

    move-object v0, v2

    :goto_3
    invoke-static {v3}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v0

    move v7, v3

    goto :goto_0

    :sswitch_7
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lb50;->H(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v3, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    rem-int/lit16 v3, v3, -0xc2a

    or-int/2addr v0, v3

    if-ltz v0, :cond_5

    move-object v0, v4

    :cond_4
    const-string v3, "\u06e7\u06e5\u06e8"

    invoke-static {v3}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v4, v0

    move v7, v3

    goto/16 :goto_0

    :cond_5
    const-string v7, "\u06e8\u06e5\u06e3"

    move-object v0, v5

    move-object v3, v6

    goto :goto_1

    :sswitch_8
    const-string v0, ""

    invoke-static {v8, v0}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v0, :cond_6

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v6, "\u06e1\u06e2\u06df"

    move-object v0, v5

    move-object v7, v6

    goto :goto_1

    :cond_6
    sget v0, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v6, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    rem-int/2addr v0, v6

    const v6, 0xde8f

    add-int/2addr v0, v6

    move-object v6, v3

    move v7, v0

    goto/16 :goto_0

    :sswitch_9
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    sget v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v7, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    xor-int/2addr v3, v7

    const v7, -0x1ac361

    xor-int/2addr v3, v7

    move-object v9, v0

    move v7, v3

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "1A==\n"

    const-string v2, "+LYuEN9yZMg=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "\u06e5\u06e4"

    move-object v3, v2

    goto :goto_3

    :sswitch_b
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    or-int/lit16 v3, v3, 0x470

    mul-int/2addr v0, v3

    if-ltz v0, :cond_7

    const/16 v0, 0x29

    sput v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v0, "\u06e2\u06e2\u06e6"

    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v3, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    rem-int/2addr v0, v3

    const v3, -0x1ab2fd

    xor-int/2addr v0, v3

    move v7, v0

    goto/16 :goto_0

    :sswitch_c
    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    xor-int/lit8 v0, v0, 0x39

    aput-object v2, v4, v0

    const-string v3, "\u06e0\u06e7\u06e7"

    move-object v0, v8

    :goto_4
    invoke-static {v3}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v3

    move-object v8, v0

    move v7, v3

    goto/16 :goto_0

    :sswitch_d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    sget v0, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v3, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    rem-int/lit16 v3, v3, -0x1fc0

    div-int/2addr v0, v3

    if-ltz v0, :cond_8

    const-string v0, "\u06e0\u06e5\u06e0"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    xor-int/2addr v0, v3

    const v3, 0x1abdc6

    add-int/2addr v0, v3

    move v7, v0

    goto/16 :goto_0

    :sswitch_e
    sget-object v0, Lgn;->a:Lgn;

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v7, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sub-int/2addr v3, v7

    const v7, -0x1abe13

    xor-int/2addr v3, v7

    move-object v11, v0

    move v7, v3

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "3FqrohMlfn/OYLCRHjN2eN5Mpg==\n"

    const-string v3, "tz/S/X9QHRQ=\n"

    invoke-static {v0, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    if-ltz v3, :cond_9

    :goto_5
    const-string v3, "\u06e5\u06e3\u06e5"

    goto :goto_4

    :cond_9
    const-string v3, "\u06e1\u06e2\u06df"

    goto :goto_4

    :sswitch_10
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v3, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    rem-int/lit16 v3, v3, -0x16d9

    mul-int/2addr v0, v3

    if-gtz v0, :cond_a

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    const-string v0, "\u06e2\u06e2\u06e4"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :cond_a
    move-object v0, v8

    goto :goto_5

    :sswitch_11
    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    if-gtz v0, :cond_b

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v0, "\u06e7\u06e4\u06e7"

    invoke-static {v0}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v7, v0

    goto/16 :goto_0

    :cond_b
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    xor-int/2addr v0, v3

    const v3, 0x1ac25d

    add-int/2addr v0, v3

    move v7, v0

    goto/16 :goto_0

    :cond_c
    :sswitch_12
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    if-ltz v0, :cond_d

    const-string v3, "\u06e6\u06e7\u06df"

    move-object v0, v2

    goto/16 :goto_3

    :cond_d
    const-string v0, "\u06e0\u06e5\u06e0"

    goto/16 :goto_2

    :sswitch_data_0
    .sparse-switch
        0xdc9f -> :sswitch_0
        0xdcdf -> :sswitch_a
        0x1aa703 -> :sswitch_1
        0x1aa7d9 -> :sswitch_5
        0x1aab7b -> :sswitch_2
        0x1aabbb -> :sswitch_12
        0x1aabc0 -> :sswitch_3
        0x1aaede -> :sswitch_b
        0x1ab2a4 -> :sswitch_8
        0x1ab2a6 -> :sswitch_11
        0x1abe03 -> :sswitch_10
        0x1abe07 -> :sswitch_7
        0x1abe21 -> :sswitch_f
        0x1ac14c -> :sswitch_4
        0x1ac1c7 -> :sswitch_e
        0x1ac1e8 -> :sswitch_d
        0x1ac223 -> :sswitch_9
        0x1ac5ca -> :sswitch_c
        0x1ac96b -> :sswitch_5
        0x1ac986 -> :sswitch_6
    .end sparse-switch
.end method

.method public static d(Landroid/view/View;)V
    .locals 26

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/4 v12, 0x0

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const-string v14, "\u06e0\u06e3\u06e6"

    invoke-static {v14}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v16

    move-object v14, v8

    move v15, v13

    :goto_0
    sparse-switch v16, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v8, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v8, v7}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v8, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v13, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    div-int/2addr v8, v13

    const v13, 0x1ab249

    add-int/2addr v8, v13

    move/from16 v16, v8

    goto :goto_0

    :sswitch_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v8

    const/16 v13, 0x32

    if-le v8, v13, :cond_8

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v8

    int-to-double v0, v8

    move-wide/from16 v16, v0

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-double v0, v8

    move-wide/from16 v22, v0

    const-wide v24, 0x3fe3333333333333L    # 0.6

    mul-double v22, v22, v24

    cmpg-double v8, v16, v22

    if-gez v8, :cond_8

    const-string v8, "\u06e1\u06e8\u06df"

    move-object v13, v8

    :goto_1
    invoke-static {v13}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto :goto_0

    :sswitch_2
    sget v5, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v8, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    or-int/lit16 v8, v8, 0x17de

    rem-int/2addr v5, v8

    if-ltz v5, :cond_1

    const/16 v5, 0x52

    sput v5, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    move v5, v6

    :cond_0
    const-string v8, "\u06e0\u06e8"

    :goto_2
    invoke-static {v8}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto :goto_0

    :cond_1
    move v5, v6

    :cond_2
    const-string v8, "\u06e2\u06df\u06e2"

    invoke-static {v8}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto :goto_0

    :sswitch_3
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->performClick()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v8, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v13, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/lit16 v13, v13, -0x2411

    sub-int/2addr v8, v13

    if-lez v8, :cond_2

    sget v8, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v13, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    xor-int/2addr v8, v13

    const v13, 0x1abf7b

    add-int/2addr v8, v13

    move/from16 v16, v8

    goto :goto_0

    :sswitch_4
    const-string v8, "/EphA+iGwVvaWz1ursGE\n"

    const-string v13, "my8VQIDvrT8=\n"

    invoke-static {v8, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v10}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v10}, Lhs;->d(Landroid/view/View;)V

    sget v8, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v13, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    or-int/2addr v8, v13

    const v13, 0x1abac2

    add-int/2addr v8, v13

    move/from16 v16, v8

    goto/16 :goto_0

    :catchall_0
    move-exception v8

    const-string v8, "Nwje\n"

    const-string v13, "Q2m5jaPP2Zc=\n"

    invoke-static {v8, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v8, "Fg==\n"

    const-string v13, "c8HJlSTQVfc=\n"

    invoke-static {v8, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :goto_3
    const-string v8, "\u06e2\u06df\u06e1"

    invoke-static {v8}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_5
    sget v8, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    if-ltz v8, :cond_3

    const/16 v8, 0x63

    sput v8, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    const-string v8, "\u06df\u06e0\u06e6"

    :goto_4
    invoke-static {v8}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_3
    sget v8, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v13, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    rem-int/2addr v8, v13

    const v13, 0x1ab02b

    add-int/2addr v8, v13

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_6
    const-string v8, "ITa66yE=\n"

    const-string v13, "Q1rViEo8ya8=\n"

    invoke-static {v8, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    move-result v8

    if-gtz v8, :cond_4

    :goto_5
    const-string v8, "\u06e6\u06e3\u06e1"

    invoke-static {v8}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_4
    sget v8, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v13, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    mul-int/2addr v8, v13

    const v13, 0x18134f

    xor-int/2addr v8, v13

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_7
    const-wide v16, 0x3fdccccccccccccdL    # 0.45

    mul-double v16, v16, v20

    cmpl-double v8, v18, v16

    if-lez v8, :cond_8

    const-wide/high16 v16, 0x3fe8000000000000L    # 0.75

    mul-double v16, v16, v20

    cmpg-double v8, v18, v16

    if-gez v8, :cond_8

    sget v8, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v13, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    rem-int/2addr v8, v13

    const v13, 0x1aa707

    add-int/2addr v8, v13

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_5
    :sswitch_8
    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    move-result v8

    if-ltz v8, :cond_6

    const/16 v8, 0x3c

    sput v8, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    const-string v8, "\u06e0\u06e3\u06e1"

    invoke-static {v8}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_6
    sget v8, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v13, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sub-int/2addr v8, v13

    const v13, 0x1ac365

    add-int/2addr v8, v13

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isClickable()Z

    move-result v8

    if-nez v8, :cond_e

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    move-result v8

    if-gtz v8, :cond_0

    const-string v8, "\u06e8\u06e6"

    invoke-static {v8}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "ddas\n"

    const-string v13, "AbfL95mQedY=\n"

    invoke-static {v8, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v11}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v8

    if-gtz v8, :cond_7

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v8, "\u06e1\u06e7\u06e4"

    :goto_6
    invoke-static {v8}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_7
    sget v8, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v13, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    xor-int/2addr v8, v13

    const v13, 0x1aae4b

    add-int/2addr v8, v13

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_8
    :sswitch_b
    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    move-result v8

    if-gtz v8, :cond_9

    const/16 v8, 0x12

    sput v8, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    const-string v8, "\u06e8\u06e5\u06e5"

    invoke-static {v8}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u06df\u06e2\u06e6"

    :goto_7
    invoke-static {v8}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_c
    sget v8, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v13, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    div-int/2addr v8, v13

    const v13, 0x1abe82

    add-int/2addr v8, v13

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    sget v8, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v13, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    rem-int/lit16 v13, v13, 0xaca

    or-int/2addr v8, v13

    if-ltz v8, :cond_15

    move-object v8, v10

    :cond_a
    const-string v10, "\u06e1\u06df\u06e8"

    invoke-static {v10}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v13

    move-object v10, v8

    move/from16 v16, v13

    goto/16 :goto_0

    :sswitch_e
    add-int/lit8 v8, v3, -0x17

    add-int/2addr v8, v9

    add-int/lit8 v8, v8, 0x17

    int-to-double v0, v8

    move-wide/from16 v18, v0

    int-to-double v0, v4

    move-wide/from16 v20, v0

    sget v8, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    if-ltz v8, :cond_b

    const-string v8, "\u06e5\u06e4\u06e8"

    invoke-static {v8}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_b
    sget v8, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v13, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    rem-int/2addr v8, v13

    const v13, 0x1ab448

    xor-int/2addr v8, v13

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_f
    sget v8, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v13, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    or-int/2addr v8, v13

    const v13, 0x1ab208

    add-int/2addr v8, v13

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v8, 0x1

    aget v9, v14, v8

    sget v8, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v13, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    add-int/lit16 v13, v13, -0x21e5

    add-int/2addr v8, v13

    if-ltz v8, :cond_c

    const/16 v8, 0x26

    sput v8, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    const-string v8, "\u06e8\u06df\u06df"

    invoke-static {v8}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_c
    const-string v8, "\u06e3\u06e2\u06e3"

    goto/16 :goto_6

    :sswitch_11
    if-ge v5, v15, :cond_5

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    sget v10, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v13, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    mul-int/lit16 v13, v13, -0x17cd

    xor-int/2addr v10, v13

    if-ltz v10, :cond_a

    const/16 v10, 0x43

    sput v10, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    move-object v10, v8

    goto/16 :goto_3

    :sswitch_12
    sget v8, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v8, :cond_d

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v8, "\u06df\u06e2\u06e8"

    invoke-static {v8}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_d
    sget v8, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v13, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    rem-int/2addr v8, v13

    const v13, -0x1ac98c

    xor-int/2addr v8, v13

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_13
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getVisibility()I

    move-result v8

    if-nez v8, :cond_8

    const/4 v8, 0x2

    new-array v8, v8, [I

    sget v13, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v14, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    div-int/2addr v13, v14

    const v14, 0x1ac968

    add-int/2addr v13, v14

    move-object v14, v8

    move/from16 v16, v13

    goto/16 :goto_0

    :cond_e
    :sswitch_14
    const-string v8, "\u06e5\u06df\u06e5"

    invoke-static {v8}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_15
    sget v8, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    xor-int/lit8 v8, v8, 0xf

    add-int/2addr v5, v8

    goto/16 :goto_5

    :cond_f
    :sswitch_16
    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    move-result v8

    if-ltz v8, :cond_10

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    const-string v8, "\u06e6\u06e3\u06e7"

    invoke-static {v8}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_10
    const-string v8, "\u06e2\u06df\u06e6"

    goto/16 :goto_4

    :sswitch_17
    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move-result v8

    if-ltz v8, :cond_f

    const-string v7, "h64W3LqhCgD"

    invoke-static {v7}, Lcom/google/android/material/behavior/ۣۡۡۦ;->ۣ۟ۢۨ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    sget v8, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v13, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    mul-int/lit16 v13, v13, 0xd28

    div-int/2addr v8, v13

    if-eqz v8, :cond_11

    const-string v8, "\u06e3\u06e1\u06e5"

    invoke-static {v8}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_11
    const-string v8, "\u06e0\u06e2"

    goto/16 :goto_2

    :sswitch_18
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    const/4 v6, 0x0

    sget v13, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v15, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sub-int/2addr v13, v15

    const v15, 0x1abe00

    xor-int/2addr v13, v15

    move v15, v8

    move/from16 v16, v13

    goto/16 :goto_0

    :sswitch_19
    sget-object v12, Lgn;->a:Lgn;

    const-string v8, "tWra8kw=\n"

    const-string v11, "9gazkSemA4s=\n"

    invoke-static {v8, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    sget v11, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    if-ltz v11, :cond_12

    :goto_8
    const-string v13, "\u06e6\u06e7\u06e6"

    move-object v11, v8

    goto/16 :goto_1

    :cond_12
    sget v11, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v13, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    div-int/2addr v11, v13

    const v13, 0xdcff

    xor-int/2addr v13, v11

    move-object v11, v8

    move/from16 v16, v13

    goto/16 :goto_0

    :sswitch_1a
    sget v8, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v13, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    div-int/lit16 v13, v13, 0x2615

    sub-int/2addr v8, v13

    if-ltz v8, :cond_13

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v8, "\u06e3\u06df"

    goto/16 :goto_7

    :cond_13
    sget v8, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v13, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sub-int/2addr v8, v13

    const v13, 0x1aa6d6

    add-int/2addr v8, v13

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_1b
    sget v8, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v13, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/lit16 v13, v13, -0xd7b

    sub-int/2addr v8, v13

    if-gtz v8, :cond_14

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    const-string v8, "\u06e5\u06df\u06e5"

    invoke-static {v8}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_14
    const-string v8, "\u06e5\u06e8"

    invoke-static {v8}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_1c
    move-object/from16 v0, p0

    instance-of v8, v0, Landroid/view/ViewGroup;

    if-eqz v8, :cond_5

    move-object/from16 v2, p0

    check-cast v2, Landroid/view/ViewGroup;

    sget v8, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v13, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    rem-int/lit16 v13, v13, 0x23ae

    rem-int/2addr v8, v13

    if-gtz v8, :cond_16

    const/16 v8, 0x58

    sput v8, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    :cond_15
    const-string v8, "\u06e5\u06e0\u06e6"

    invoke-static {v8}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_16
    move-object v8, v11

    goto :goto_8

    :sswitch_1d
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->hasOnClickListeners()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    move-result v8

    if-gtz v8, :cond_17

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    const-string v8, "\u06e3\u06e2\u06e3"

    invoke-static {v8}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v8

    move/from16 v16, v8

    goto/16 :goto_0

    :cond_17
    sget v8, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v13, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    xor-int/2addr v8, v13

    const v13, 0x1abc5b

    add-int/2addr v8, v13

    move/from16 v16, v8

    goto/16 :goto_0

    :sswitch_1e
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc02 -> :sswitch_0
        0xdc08 -> :sswitch_1d
        0xdca3 -> :sswitch_5
        0xdcd9 -> :sswitch_5
        0xdcfe -> :sswitch_a
        0x1aa722 -> :sswitch_1
        0x1aa763 -> :sswitch_1c
        0x1aa7de -> :sswitch_c
        0x1aab42 -> :sswitch_6
        0x1aab43 -> :sswitch_13
        0x1aae8a -> :sswitch_4
        0x1aaf7e -> :sswitch_8
        0x1aaf98 -> :sswitch_9
        0x1ab244 -> :sswitch_b
        0x1ab245 -> :sswitch_11
        0x1ab249 -> :sswitch_1e
        0x1ab607 -> :sswitch_b
        0x1ab647 -> :sswitch_7
        0x1ab664 -> :sswitch_d
        0x1ab69f -> :sswitch_16
        0x1abaa3 -> :sswitch_1a
        0x1abac1 -> :sswitch_15
        0x1abd8b -> :sswitch_19
        0x1abdab -> :sswitch_e
        0x1abe29 -> :sswitch_2
        0x1abe82 -> :sswitch_f
        0x1ac165 -> :sswitch_12
        0x1ac1c4 -> :sswitch_1b
        0x1ac245 -> :sswitch_18
        0x1ac604 -> :sswitch_17
        0x1ac8c8 -> :sswitch_14
        0x1ac967 -> :sswitch_10
        0x1ac982 -> :sswitch_3
    .end sparse-switch
.end method

.method public static e(Ljava/lang/ClassLoader;Ljava/lang/Object;)V
    .locals 19

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const-string v15, "\u06e1\u06e2\u06e3"

    invoke-static {v15}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v18

    move-object v15, v2

    move-object/from16 v16, v10

    move-object/from16 v17, v12

    :goto_0
    sparse-switch v18, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v10, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/lit16 v10, v10, -0x1bf6

    div-int/2addr v2, v10

    if-eqz v2, :cond_12

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    const-string v2, "\u06df\u06e4\u06e0"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto :goto_0

    :sswitch_1
    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v10, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    xor-int/2addr v2, v10

    const v10, 0xdf0d

    add-int/2addr v2, v10

    move/from16 v18, v2

    goto :goto_0

    :sswitch_2
    :try_start_0
    invoke-static {v8, v15, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v10, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    or-int/lit16 v10, v10, 0x19eb

    rem-int/2addr v2, v10

    if-ltz v2, :cond_0

    const/4 v2, 0x0

    sput v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    const-string v2, "\u06e4\u06df\u06e7"

    invoke-static {v2}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto :goto_0

    :cond_0
    const-string v2, "\u06e5\u06e6"

    :goto_1
    invoke-static {v2}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto :goto_0

    :sswitch_3
    :try_start_1
    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    xor-int/lit16 v2, v2, 0xd7

    aput-object v7, v6, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v2, "\u06e2\u06e6\u06e5"

    :goto_2
    invoke-static {v2}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto :goto_0

    :sswitch_4
    :try_start_2
    sget-object v2, Lpb0;->D:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget v10, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v12, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    mul-int/lit16 v12, v12, 0x1b7

    or-int/2addr v10, v12

    if-gtz v10, :cond_1

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    const-string v10, "\u06e0\u06e5\u06e8"

    invoke-static {v10}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v10

    move-object v15, v2

    move/from16 v18, v10

    goto :goto_0

    :cond_1
    sget v10, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v12, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    xor-int/2addr v10, v12

    const v12, 0x1ab240

    add-int/2addr v10, v12

    move-object v15, v2

    move/from16 v18, v10

    goto :goto_0

    :catchall_0
    move-exception v2

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v2, :cond_2

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    const-string v2, "\u06e6\u06df\u06e2"

    invoke-static {v2}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_2
    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v10, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    mul-int/2addr v2, v10

    const v10, 0x1a9282

    add-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_5
    :try_start_3
    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    xor-int/lit16 v2, v2, 0x3be

    aput-object v3, v11, v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    if-gtz v2, :cond_3

    const-string v2, "\u06e0\u06e4\u06e8"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_3
    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v10, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/2addr v2, v10

    const v10, 0x1ab419

    add-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_4
    :sswitch_6
    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v10, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    div-int/2addr v2, v10

    const v10, 0x1ab664

    add-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_5
    :sswitch_7
    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v10, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    xor-int/lit16 v10, v10, 0x2460

    xor-int/2addr v2, v10

    if-ltz v2, :cond_6

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v2, "\u06e6\u06e7"

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u06e3\u06e0\u06e6"

    invoke-static {v2}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_8
    const/4 v2, 0x2

    :try_start_4
    new-array v11, v2, [Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v2, "\u06df\u06e0\u06df"

    move-object v10, v2

    move v12, v9

    :goto_4
    invoke-static {v10}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v2

    move v9, v12

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_9
    if-eqz v4, :cond_9

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v10, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sub-int/2addr v2, v10

    const v10, 0x1abccc

    add-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_a
    const-string v2, "\u06e0\u06e4\u06e8"

    invoke-static {v2}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_b
    :try_start_5
    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    xor-int/lit8 v2, v2, -0x23

    aput-object p1, v6, v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v2

    if-gtz v2, :cond_7

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    const-string v2, "\u06e7\u06e6\u06e2"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_7
    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v10, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    rem-int/2addr v2, v10

    const v10, 0x1aba54

    add-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_c
    if-eqz v16, :cond_c

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v10, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    div-int/lit16 v10, v10, -0x1f68

    or-int/2addr v2, v10

    if-ltz v2, :cond_8

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v2, "\u06e1\u06e6\u06e0"

    :goto_5
    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_8
    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v10, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    mul-int/2addr v2, v10

    const v10, 0x180d98

    xor-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_d
    :try_start_6
    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v2

    if-gtz v2, :cond_5

    const-string v2, "G4MTn7dEg5HGxpyY9t"

    invoke-static {v2}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟ۦۦ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result v2

    sget v9, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v9, :cond_15

    const/4 v9, 0x2

    sput v9, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v9, "\u06e5\u06e3\u06e1"

    invoke-static {v9}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v10

    move v9, v2

    move/from16 v18, v10

    goto/16 :goto_0

    :sswitch_e
    if-eqz v13, :cond_9

    sget v2, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v10, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    rem-int/2addr v2, v10

    const v10, 0x1ac27c

    add-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_9
    :sswitch_f
    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    move-result v2

    if-ltz v2, :cond_a

    const/16 v2, 0x8

    sput v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v2, "\u06e1\u06e2\u06e0"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e7\u06e3\u06e3"

    goto/16 :goto_3

    :sswitch_10
    :try_start_7
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v9}, Ljava/io/PrintStream;->println(I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v10, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    mul-int/lit16 v10, v10, -0x191f

    mul-int/2addr v2, v10

    if-ltz v2, :cond_b

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v2, "\u06e1\u06e2\u06e3"

    invoke-static {v2}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_b
    sget v2, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v10, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    mul-int/2addr v2, v10

    const v10, 0x1b0fc5

    add-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_c
    :sswitch_11
    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v10, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    mul-int/lit16 v10, v10, 0xee2

    rem-int/2addr v2, v10

    if-gtz v2, :cond_d

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v2, "\u06e3\u06e4\u06e4"

    :goto_6
    invoke-static {v2}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_d
    const-string v2, "\u06e5\u06e3\u06e1"

    goto :goto_6

    :sswitch_12
    const/4 v2, 0x2

    :try_start_8
    new-array v2, v2, [Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    sget v6, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v10, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    div-int/lit16 v10, v10, 0x1b3e

    add-int/2addr v6, v10

    if-gtz v6, :cond_e

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    :goto_7
    const-string v6, "\u06e6\u06df\u06df"

    invoke-static {v6}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v10

    move-object v6, v2

    move/from16 v18, v10

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u06e4\u06e4\u06e7"

    move-object v10, v6

    move-object v12, v2

    :goto_8
    invoke-static {v10}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v6, v12

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_13
    :try_start_9
    sget-object v2, Lpb0;->i:Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    sget v10, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    if-ltz v10, :cond_f

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    const-string v10, "\u06e7\u06e5\u06e4"

    invoke-static {v10}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    move-object/from16 v17, v2

    move/from16 v18, v10

    goto/16 :goto_0

    :cond_f
    sget v10, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v12, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    mul-int/2addr v10, v12

    const v12, 0x1adf5b

    xor-int/2addr v10, v12

    move-object/from16 v17, v2

    move/from16 v18, v10

    goto/16 :goto_0

    :sswitch_14
    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v4, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/lit16 v4, v4, -0xbdc

    div-int/2addr v2, v4

    if-eqz v2, :cond_10

    const-string v2, "\u06e4\u06e4\u06e7"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v4, v14

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e0\u06e4\u06e8"

    move-object v10, v13

    move-object v4, v14

    :goto_9
    invoke-static {v2}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v13, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_15
    const/4 v2, 0x0

    :try_start_a
    aget-object v5, v16, v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v10, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    or-int/lit16 v10, v10, -0x26a1

    xor-int/2addr v2, v10

    if-gtz v2, :cond_11

    const-string v2, "\u06df\u06e0\u06df"

    invoke-static {v2}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_11
    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v10, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sub-int/2addr v2, v10

    const v10, 0x1ac606

    add-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_12
    const-string v2, "\u06e1\u06e2\u06e3"

    invoke-static {v2}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_13
    :sswitch_16
    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v2

    if-gtz v2, :cond_14

    const-string v2, "\u06e1\u06e7\u06df"

    :goto_a
    invoke-static {v2}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_14
    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v10, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    xor-int/2addr v2, v10

    const v10, 0x1abebd

    add-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_17
    :try_start_b
    move-object/from16 v0, v16

    array-length v2, v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    if-nez v2, :cond_18

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v10, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sub-int/2addr v2, v10

    const v10, 0x1ab02f

    add-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_18
    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v10, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    mul-int/2addr v2, v10

    const v10, -0x1a95a9

    xor-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_19
    if-eqz v13, :cond_c

    :try_start_c
    invoke-virtual {v13}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    move-result-object v2

    sget v10, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v12, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    or-int/2addr v10, v12

    const v12, 0x1acaf5

    xor-int/2addr v10, v12

    move-object/from16 v16, v2

    move/from16 v18, v10

    goto/16 :goto_0

    :sswitch_1a
    if-nez v3, :cond_13

    move-object v2, v6

    goto/16 :goto_7

    :sswitch_1b
    :try_start_d
    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    xor-int/lit16 v2, v2, 0x1e3

    const/4 v10, 0x0

    aput-object v10, v11, v2

    invoke-virtual {v4, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    move-result-object v8

    const-string v2, "\u06df\u06e7\u06e5"

    goto :goto_a

    :sswitch_1c
    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v2

    if-gtz v2, :cond_16

    invoke-static {}, Landroidx/core/content/ۣ۟ۧ۠;->۟۟۠ۢۨ()I

    move-object v4, v5

    move v2, v9

    :cond_15
    const-string v9, "\u06e7\u06e4\u06e8"

    move-object v10, v9

    move v12, v2

    goto/16 :goto_4

    :cond_16
    const-string v2, "\u06e7\u06e6\u06e2"

    move-object v4, v5

    goto/16 :goto_3

    :sswitch_1d
    :try_start_e
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_4

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    move-result-object v10

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    move-result v2

    if-ltz v2, :cond_17

    const-string v2, "\u06e5\u06e6"

    goto/16 :goto_9

    :cond_17
    const-string v2, "\u06e7\u06e5\u06e4"

    invoke-static {v2}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v13, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_18
    :sswitch_1e
    sget v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    if-ltz v2, :cond_19

    const-string v2, "\u06e0\u06e0\u06e6"

    move-object v10, v2

    move-object v12, v6

    goto/16 :goto_8

    :cond_19
    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v10, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    div-int/2addr v2, v10

    const v10, 0x1ab640

    add-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_1f
    :try_start_f
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    const-string v2, "\u06e8\u06e2\u06e8"

    goto/16 :goto_a

    :sswitch_20
    :try_start_10
    invoke-static/range {p0 .. p1}, Luv;->d(Ljava/lang/ClassLoader;Ljava/lang/Object;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    move-result v2

    if-ltz v2, :cond_1a

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v2, "\u06e8\u06e7\u06e6"

    goto/16 :goto_1

    :cond_1a
    const-string v2, "\u06e7\u06e3\u06e3"

    move-object v10, v13

    goto/16 :goto_9

    :sswitch_21
    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v2

    if-gtz v2, :cond_1b

    const-string v2, "\u06e3\u06e5\u06e6"

    invoke-static {v2}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_1b
    const-string v2, "\u06e4\u06df\u06e7"

    goto/16 :goto_6

    :sswitch_22
    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v10, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    mul-int/lit16 v10, v10, -0x1281

    rem-int/2addr v2, v10

    if-ltz v2, :cond_1d

    :cond_1c
    const-string v2, "\u06e2\u06e0\u06e4"

    goto/16 :goto_2

    :cond_1d
    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v10, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    xor-int/2addr v2, v10

    const v10, -0x1ac065

    xor-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_23
    const/4 v14, 0x0

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    if-ltz v2, :cond_1c

    const/4 v2, 0x1

    sput v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v2, "\u06e2\u06e2\u06e0"

    invoke-static {v2}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_24
    :try_start_11
    sget-object v2, Lgn;->a:Lgn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lgn;->b:Landroid/app/Application;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    const-string v2, "\u06e4\u06e2\u06e1"

    goto/16 :goto_5

    :sswitch_25
    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v10, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    xor-int/2addr v2, v10

    const v10, 0x1acd0c

    add-int/2addr v2, v10

    move/from16 v18, v2

    goto/16 :goto_0

    :sswitch_26
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc44 -> :sswitch_0
        0xdc5d -> :sswitch_11
        0xdca1 -> :sswitch_d
        0x1aa71e -> :sswitch_5
        0x1aa7fd -> :sswitch_4
        0x1aab03 -> :sswitch_25
        0x1aab64 -> :sswitch_e
        0x1aab83 -> :sswitch_17
        0x1aaee2 -> :sswitch_18
        0x1aaf21 -> :sswitch_1f
        0x1aaf5b -> :sswitch_1e
        0x1ab266 -> :sswitch_14
        0x1ab2a0 -> :sswitch_1
        0x1ab2c6 -> :sswitch_f
        0x1ab321 -> :sswitch_2
        0x1ab35c -> :sswitch_6
        0x1ab629 -> :sswitch_26
        0x1ab642 -> :sswitch_15
        0x1ab664 -> :sswitch_20
        0x1ab6c4 -> :sswitch_1b
        0x1ab6fc -> :sswitch_1d
        0x1ab9cc -> :sswitch_a
        0x1ab9e5 -> :sswitch_3
        0x1aba23 -> :sswitch_1a
        0x1aba42 -> :sswitch_7
        0x1aba65 -> :sswitch_a
        0x1aba67 -> :sswitch_b
        0x1abe03 -> :sswitch_23
        0x1abe48 -> :sswitch_11
        0x1ac146 -> :sswitch_22
        0x1ac149 -> :sswitch_24
        0x1ac186 -> :sswitch_1c
        0x1ac1a6 -> :sswitch_8
        0x1ac1c5 -> :sswitch_9
        0x1ac260 -> :sswitch_f
        0x1ac52e -> :sswitch_f
        0x1ac587 -> :sswitch_26
        0x1ac5ab -> :sswitch_10
        0x1ac5c6 -> :sswitch_19
        0x1ac5e3 -> :sswitch_21
        0x1ac92e -> :sswitch_12
        0x1ac94c -> :sswitch_c
        0x1ac967 -> :sswitch_13
        0x1ac9c7 -> :sswitch_16
    .end sparse-switch
.end method
