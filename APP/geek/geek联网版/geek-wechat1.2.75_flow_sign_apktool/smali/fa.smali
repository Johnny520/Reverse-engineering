.class public final synthetic Lfa;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ll00;

.field public final c:Landroid/widget/TextView;

.field public final d:Ljava/lang/String;

.field public final e:Ln00;

.field public final f:Ln00;

.field public final g:Landroid/app/Dialog;

.field public final h:Ljava/util/ArrayList;

.field public final i:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ll00;Landroid/widget/TextView;Ljava/lang/String;Ln00;Ln00;Landroid/app/Dialog;Ljava/util/ArrayList;J)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e2\u06e8"

    invoke-static {v1}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p8, p0, Lfa;->h:Ljava/util/ArrayList;

    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    div-int/2addr v0, v2

    const v2, 0x1aaacd

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_1
    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    or-int/lit16 v2, v2, 0xe4c

    mul-int/2addr v0, v2

    if-gtz v0, :cond_0

    const/16 v0, 0x38

    sput v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v0, "\u06e6\u06e0"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    or-int/2addr v0, v2

    const v2, -0x1ab64a

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    iput-object p4, p0, Lfa;->d:Ljava/lang/String;

    const-string v0, "\u06df\u06e2\u06e2"

    goto :goto_1

    :sswitch_3
    iput-object p7, p0, Lfa;->g:Landroid/app/Dialog;

    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    or-int/lit16 v2, v2, 0x20b0

    div-int/2addr v0, v2

    if-eqz v0, :cond_1

    const/16 v0, 0x2c

    sput v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    :goto_2
    const-string v0, "\u06e6\u06e4\u06e7"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    div-int/2addr v0, v2

    const v2, 0xdc41

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-result v0

    if-gtz v0, :cond_5

    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    div-int/lit16 v2, v2, -0x1d30

    xor-int/2addr v0, v2

    if-gtz v0, :cond_2

    const-string v0, "\u06e0\u06df\u06e8"

    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab698

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    iput-object p3, p0, Lfa;->c:Landroid/widget/TextView;

    sget v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/2addr v0, v2

    const v2, 0x1aae1e

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iput-object p6, p0, Lfa;->f:Ln00;

    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    add-int/lit16 v2, v2, 0x149e

    sub-int/2addr v0, v2

    if-ltz v0, :cond_3

    :goto_3
    const-string v0, "\u06e8\u06df\u06e2"

    :goto_4
    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e7\u06e8\u06e5"

    goto :goto_4

    :sswitch_7
    iput-object p1, p0, Lfa;->a:Ljava/util/ArrayList;

    goto :goto_3

    :sswitch_8
    iput-object p2, p0, Lfa;->b:Ll00;

    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/2addr v0, v2

    const v2, 0x1ac879

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab928

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    iput-object p5, p0, Lfa;->e:Ln00;

    goto :goto_2

    :sswitch_b
    const-string v0, "kjSOTVSmHuPrUm"

    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟ۡۦ۠۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v1

    if-ltz v1, :cond_4

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v1, "\u06e3\u06e2\u06e8"

    invoke-static {v1}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06e2\u06e1\u06e4"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_5
    :sswitch_c
    sget v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    mul-int/2addr v0, v2

    const v2, 0x1ad343

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_d
    iput-wide p9, p0, Lfa;->i:J

    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    if-gtz v0, :cond_6

    const/16 v0, 0x30

    sput v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    const-string v0, "\u06df\u06e2\u06e2"

    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    rem-int/2addr v0, v2

    const v2, -0x1ab74a

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_e
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc41 -> :sswitch_0
        0x1aa75f -> :sswitch_a
        0x1aaac9 -> :sswitch_d
        0x1aaec2 -> :sswitch_2
        0x1ab285 -> :sswitch_9
        0x1ab663 -> :sswitch_4
        0x1ab669 -> :sswitch_7
        0x1aba22 -> :sswitch_b
        0x1ababf -> :sswitch_e
        0x1abe7d -> :sswitch_c
        0x1ac1e9 -> :sswitch_6
        0x1ac5a3 -> :sswitch_1
        0x1ac624 -> :sswitch_3
        0x1ac8cb -> :sswitch_8
        0x1ac90d -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 50

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/16 v16, 0x0

    const/4 v15, 0x0

    const/16 v20, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/4 v9, 0x0

    const/16 v26, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/16 v31, 0x0

    const/16 v47, 0x0

    const/16 v46, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/16 v17, 0x0

    const/4 v10, 0x0

    const/16 v40, 0x0

    const/16 v36, 0x0

    const/16 v29, 0x0

    const/16 v28, 0x0

    const/16 v27, 0x0

    const/16 v18, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x0

    const/4 v13, 0x0

    const/4 v12, 0x0

    const/16 v38, 0x0

    const/16 v41, 0x0

    const/4 v2, 0x0

    const/16 v48, 0x0

    const/4 v3, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const-string v42, "\u06e1\u06df\u06e7"

    invoke-static/range {v42 .. v42}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v49

    move-object/from16 v42, v2

    move-object/from16 v43, v5

    move-object/from16 v44, v9

    move-object/from16 v45, v26

    :goto_0
    sparse-switch v49, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move-object v2, v4

    check-cast v2, Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Li50;->Q(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v0, p0

    iget-object v5, v0, Lfa;->h:Ljava/util/ArrayList;

    move/from16 v0, v40

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsx;

    iget-object v2, v2, Lsx;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-static {v9, v0}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v23

    move-object/from16 v0, p0

    iget-wide v0, v0, Lfa;->i:J

    move-wide/from16 v24, v0

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    move-result v19

    if-ltz v19, :cond_13

    const/16 v19, 0x2f

    sput v19, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    :goto_1
    const-string v19, "\u06e0\u06e1\u06e6"

    move-object/from16 v26, v19

    :goto_2
    invoke-static/range {v26 .. v26}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v26

    move-object/from16 v19, v5

    move-object/from16 v20, v9

    move-object/from16 v21, v2

    move/from16 v49, v26

    goto :goto_0

    :sswitch_1
    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v5, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    div-int/lit16 v5, v5, -0x26cd

    add-int/2addr v2, v5

    if-ltz v2, :cond_0

    const/16 v2, 0x10

    sput v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    const-string v2, "\u06e1\u06e2\u06e0"

    move-object v5, v10

    :goto_3
    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v10, v5

    move/from16 v49, v2

    goto :goto_0

    :cond_0
    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v5, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    mul-int/2addr v2, v5

    const v5, 0x1e2b09

    xor-int/2addr v2, v5

    move/from16 v49, v2

    goto :goto_0

    :sswitch_2
    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v5, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    rem-int/lit16 v5, v5, -0x101e

    sub-int/2addr v2, v5

    if-gtz v2, :cond_1

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v2, "\u06e2\u06e0\u06e7"

    :goto_4
    invoke-static {v2}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_1
    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    mul-int/2addr v2, v5

    const v5, 0x1ad569

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_3
    :try_start_0
    sget-object v2, Lmp;->v:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    sget v5, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    if-gtz v5, :cond_2

    const-string v5, "\u06e3\u06df"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v17, v2

    move/from16 v49, v5

    goto/16 :goto_0

    :cond_2
    move/from16 v5, v18

    :goto_5
    const-string v9, "\u06e5\u06e2\u06e6"

    invoke-static {v9}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v17, v2

    move/from16 v18, v5

    move/from16 v49, v9

    goto/16 :goto_0

    :sswitch_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lfa;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/16 v26, 0x0

    const/16 v33, 0x0

    const-string v5, "\u06df\u06e2\u06e2"

    move/from16 v36, v33

    :goto_6
    invoke-static {v5}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v33, v2

    move/from16 v34, v9

    move/from16 v35, v26

    move/from16 v49, v5

    goto/16 :goto_0

    :sswitch_5
    sget-object v9, Lkn;->a:Lkn;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "nick_color_"

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v0, v29

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v27

    iget v5, v0, Ln00;->a:I

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v9, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v26, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    move/from16 v0, v26

    xor-int/lit16 v0, v0, -0x227c

    move/from16 v26, v0

    xor-int v9, v9, v26

    if-ltz v9, :cond_3

    const/16 v9, 0x5c

    sput v9, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v9, "\u06df\u06e7\u06e5"

    invoke-static {v9}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v42, v2

    move/from16 v48, v5

    move/from16 v49, v9

    goto/16 :goto_0

    :cond_3
    sget v9, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v26, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sub-int v9, v9, v26

    const v26, 0x1abc18

    add-int v9, v9, v26

    move-object/from16 v42, v2

    move/from16 v48, v5

    move/from16 v49, v9

    goto/16 :goto_0

    :cond_4
    :sswitch_6
    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    move-result v2

    if-gtz v2, :cond_5

    const/4 v2, 0x2

    sput v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v2, "\u06e7\u06e5\u06e2"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_5
    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v5, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    mul-int/2addr v2, v5

    const v5, -0x19d87d

    xor-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_7
    :try_start_1
    invoke-virtual/range {v32 .. v32}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    or-int/lit16 v5, v5, -0x1da6

    mul-int/2addr v2, v5

    if-gtz v2, :cond_6

    const/16 v2, 0x62

    sput v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    const-string v2, "\u06e1\u06df\u06e7"

    invoke-static {v2}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u06e3\u06e2\u06e7"

    :goto_7
    invoke-static {v2}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_8
    :try_start_2
    instance-of v2, v3, Landroid/widget/BaseAdapter;

    if-eqz v2, :cond_20

    move-object v0, v3

    check-cast v0, Landroid/widget/BaseAdapter;

    move-object v2, v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sget v5, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v9, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    mul-int/lit16 v9, v9, -0x76e

    div-int/2addr v5, v9

    if-eqz v5, :cond_7

    const-string v5, "\u06e7\u06e2\u06e3"

    invoke-static {v5}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v5

    move/from16 v49, v5

    move-object/from16 v30, v2

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06df\u06e7\u06e5"

    move-object v9, v2

    :goto_8
    invoke-static {v5}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    move-object/from16 v30, v9

    goto/16 :goto_0

    :cond_8
    :sswitch_9
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    div-int/lit16 v5, v5, 0x14d9

    xor-int/2addr v2, v5

    if-ltz v2, :cond_9

    const/16 v2, 0x4f

    sput v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v2, "\u06e8\u06e1\u06e0"

    move-object v5, v2

    :goto_9
    invoke-static {v5}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_9
    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sub-int/2addr v2, v5

    const v5, 0x1ab1b8

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_a
    :sswitch_a
    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    if-ltz v2, :cond_b

    const-string v2, "\u06e0\u06e0\u06df"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_b
    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v5, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sub-int/2addr v2, v5

    const v5, 0x1aaa7d

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_b
    move-object v2, v11

    :cond_c
    const-string v5, "\u06e7\u06e5\u06e0"

    move-object v11, v2

    move-object/from16 v9, v30

    goto :goto_8

    :sswitch_c
    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v2, :cond_d

    const/16 v2, 0x2a

    sput v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v2, "\u06e5\u06e8\u06e8"

    :goto_a
    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_d
    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v5, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    rem-int/2addr v2, v5

    const v5, 0x1ab0e8

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v0, v20

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_48

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v2, :cond_e

    const/16 v2, 0x1a

    sput v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    const-string v5, "\u06e8\u06e4\u06df"

    move-object v2, v12

    move v9, v13

    :goto_b
    invoke-static {v5}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v5

    move-object v12, v2

    move v13, v9

    move/from16 v49, v5

    goto/16 :goto_0

    :cond_e
    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v5, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    div-int/2addr v2, v5

    const v5, 0x1ab344

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_e
    :try_start_3
    move-object/from16 v0, v17

    invoke-virtual {v0, v11, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v2

    if-gtz v2, :cond_f

    const-string v2, "\u06e4\u06e8\u06e1"

    move-object v5, v14

    move v9, v15

    :goto_c
    invoke-static {v2}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v14, v5

    move v15, v9

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_f
    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v5, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    div-int/2addr v2, v5

    const v5, 0x1aaf7b

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_10
    move-object v5, v8

    :goto_d
    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v7

    if-ltz v7, :cond_11

    const/16 v7, 0x32

    sput v7, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v7, "\u06e1\u06e3\u06e8"

    move-object v9, v7

    :goto_e
    invoke-static {v9}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v9

    move-object v7, v2

    move-object v8, v5

    move/from16 v49, v9

    goto/16 :goto_0

    :cond_11
    sget v7, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v8, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    rem-int/2addr v7, v8

    const v8, 0x1aabc7

    add-int v9, v7, v8

    move-object v7, v2

    move-object v8, v5

    move/from16 v49, v9

    goto/16 :goto_0

    :sswitch_f
    if-eqz v28, :cond_8

    const/4 v2, 0x1

    move/from16 v0, v28

    if-eq v0, v2, :cond_14

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    xor-int/lit8 v5, v2, -0x20

    move/from16 v0, v28

    if-eq v0, v5, :cond_2e

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v2

    if-gtz v2, :cond_12

    const/16 v2, 0x14

    sput v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    move-object/from16 v2, v17

    goto/16 :goto_5

    :cond_12
    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v9, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/2addr v2, v9

    const v9, 0x1ab36d

    add-int/2addr v2, v9

    move/from16 v18, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_13
    sget v19, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v20, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    or-int v19, v19, v20

    const v20, -0x1abecd

    xor-int v26, v19, v20

    move-object/from16 v19, v5

    move-object/from16 v20, v9

    move-object/from16 v21, v2

    move/from16 v49, v26

    goto/16 :goto_0

    :sswitch_10
    const-string v2, "\u06e4\u06e5\u06e1"

    move-object v5, v2

    move-object/from16 v9, v30

    :goto_f
    invoke-static {v5}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v32, v9

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_14
    :sswitch_11
    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v5, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    xor-int/lit16 v5, v5, 0xac5

    div-int/2addr v2, v5

    if-eqz v2, :cond_15

    const-string v2, "\u06e5\u06df\u06e0"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_15
    const-string v2, "\u06e5\u06e3\u06e4"

    goto/16 :goto_4

    :sswitch_12
    if-eqz v17, :cond_45

    const/4 v2, 0x1

    :try_start_4
    new-array v5, v2, [Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v9, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    add-int/lit16 v9, v9, -0xa7d

    div-int/2addr v2, v9

    if-eqz v2, :cond_16

    const/16 v2, 0xf

    sput v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v2, "\u06e5\u06e3\u06e4"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v10, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_16
    const-string v2, "\u06e2\u06e8\u06e0"

    goto/16 :goto_3

    :sswitch_13
    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    if-ltz v2, :cond_17

    const/16 v2, 0x19

    sput v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v2, "\u06df\u06e1\u06e8"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_17
    const-string v2, "\u06e8\u06e2"

    move-object/from16 v26, v2

    :goto_10
    invoke-static/range {v26 .. v26}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :catchall_0
    move-exception v2

    const-string v2, "\u06e3\u06e6\u06e6"

    goto/16 :goto_a

    :sswitch_14
    :try_start_5
    invoke-virtual {v6}, Landroid/view/View;->invalidate()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v5, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    div-int/lit16 v5, v5, 0x24be

    xor-int/2addr v2, v5

    if-gtz v2, :cond_18

    const/16 v2, 0x43

    sput v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    const-string v2, "\u06e3\u06e2\u06e7"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_18
    const-string v2, "\u06e8\u06e4\u06e5"

    move-object v5, v2

    move-object/from16 v9, v32

    goto/16 :goto_f

    :sswitch_15
    invoke-virtual {v7, v11}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    const/4 v5, 0x1

    if-ne v2, v5, :cond_48

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v5, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    add-int/lit16 v5, v5, 0x1dd4

    mul-int/2addr v2, v5

    if-ltz v2, :cond_19

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    const-string v5, "\u06e4\u06e3\u06e2"

    move-object/from16 v2, v27

    move/from16 v9, v28

    move/from16 v26, v29

    :goto_11
    invoke-static {v5}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v27, v2

    move/from16 v28, v9

    move/from16 v29, v26

    move/from16 v49, v5

    goto/16 :goto_0

    :cond_19
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v5, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    xor-int/2addr v2, v5

    const v5, 0x1aaa5a

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_16
    if-eqz v31, :cond_27

    const/4 v2, 0x1

    :try_start_6
    new-array v2, v2, [Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    sget v5, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v9, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    or-int/lit16 v9, v9, 0xf3e

    xor-int/2addr v5, v9

    if-gtz v5, :cond_1a

    const/16 v5, 0xf

    sput v5, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v5, "\u06e7\u06e5\u06e0"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v47, v2

    move/from16 v49, v5

    goto/16 :goto_0

    :cond_1a
    sget v5, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v9, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sub-int/2addr v5, v9

    const v9, -0x1aa97f

    xor-int/2addr v5, v9

    move-object/from16 v47, v2

    move/from16 v49, v5

    goto/16 :goto_0

    :sswitch_17
    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    if-gtz v2, :cond_1b

    const/16 v2, 0x55

    sput v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v2, "\u06e6\u06e2\u06e3"

    :goto_12
    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_1b
    const-string v2, "\u06e4\u06e5"

    goto :goto_12

    :sswitch_18
    :try_start_7
    sget-object v3, Lt9;->c:Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v5, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    div-int/lit16 v5, v5, -0x5ba

    add-int/2addr v2, v5

    if-gtz v2, :cond_1c

    const/16 v2, 0x42

    sput v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v2, "\u06e3\u06e6\u06e2"

    invoke-static {v2}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_1c
    const-string v2, "\u06e8\u06e8\u06e2"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_19
    sget-object v2, Lkn;->a:Lkn;

    const-string v5, "ukgFF1L1G0G/TBEtY/8XRr5fIyVT+B0=\n"

    const-string v9, "0S18SDyceCo=\n"

    invoke-static {v5, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x1

    invoke-static {v5, v2}, Lkn;->g(Ljava/lang/String;I)V

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    move-result v2

    if-gtz v2, :cond_1d

    const-string v2, "\u06e3\u06e4\u06e3"

    invoke-static {v2}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_1d
    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v5, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    or-int/2addr v2, v5

    const v5, 0x1aad40

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_1a
    invoke-virtual {v8, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    const/4 v5, 0x1

    if-ne v2, v5, :cond_48

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v5, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    mul-int/lit16 v5, v5, 0x22b6

    or-int/2addr v2, v5

    if-ltz v2, :cond_1e

    const/16 v2, 0xb

    sput v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v2, "\u06e4\u06df\u06e2"

    :goto_13
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_1e
    move-object/from16 v5, v19

    move-object/from16 v9, v20

    move-object/from16 v2, v21

    goto/16 :goto_1

    :sswitch_1b
    invoke-static {}, Ljb;->b0()V

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v2

    if-gtz v2, :cond_1f

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v2, "\u06e3\u06e1\u06e3"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_1f
    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v5, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    div-int/2addr v2, v5

    const v5, 0x1abdee

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_1c
    move-object/from16 v0, v45

    move/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual/range {v45 .. v45}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {v44 .. v44}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v0, v20

    invoke-static {v2, v0}, Lkn;->h(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, v19

    move/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsx;

    iget-object v2, v2, Lsx;->a:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    instance-of v5, v2, Landroid/widget/TextView;

    if-eqz v5, :cond_23

    const-string v5, "\u06e5\u06e4\u06e3"

    move-object v6, v2

    goto/16 :goto_9

    :sswitch_1d
    xor-int/lit16 v2, v15, 0x26d

    add-int v2, v2, v40

    move/from16 v36, v16

    :goto_14
    const-string v5, "\u06e7\u06e1\u06e0"

    invoke-static {v5}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v5

    move/from16 v49, v5

    move/from16 v40, v2

    goto/16 :goto_0

    :cond_20
    :sswitch_1e
    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v5, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    add-int/lit16 v5, v5, 0x760

    sub-int/2addr v2, v5

    if-ltz v2, :cond_21

    const-string v2, "\u06e4\u06e7\u06e2"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_21
    const-string v9, "\u06e4\u06e5\u06e1"

    move-object v2, v7

    move-object v5, v8

    goto/16 :goto_e

    :catchall_1
    move-exception v2

    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    add-int/lit16 v5, v5, -0x226e

    sub-int/2addr v2, v5

    if-gtz v2, :cond_22

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    const-string v2, "\u06e8\u06e8\u06e0"

    invoke-static {v2}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_22
    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v5, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    div-int/2addr v2, v5

    const v5, 0x1ab9eb

    xor-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_1f
    move-object v2, v6

    :cond_23
    sget v5, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v6, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    or-int/lit16 v6, v6, 0xbef

    xor-int/2addr v5, v6

    if-ltz v5, :cond_24

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v5, "\u06e3\u06e3\u06e2"

    move-object v6, v2

    move-object/from16 v9, v30

    goto/16 :goto_8

    :cond_24
    const-string v5, "\u06e4\u06e8\u06e1"

    move-object v6, v2

    move-object v9, v5

    :goto_15
    invoke-static {v9}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_20
    :try_start_8
    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    xor-int/lit8 v2, v2, 0xc

    aput-object v21, v10, v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v2

    if-ltz v2, :cond_30

    const-string v2, "\u06e0\u06df\u06df"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_25
    :sswitch_21
    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v5, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    or-int/2addr v2, v5

    const v5, 0x1ab6a9

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_22
    :try_start_9
    sget-object v2, Lmp;->v:Ljava/lang/reflect/Method;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v5

    if-gtz v5, :cond_26

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    :goto_16
    const-string v5, "\u06e2\u06e3\u06e5"

    invoke-static {v5}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v31, v2

    move/from16 v49, v5

    goto/16 :goto_0

    :cond_26
    const-string v5, "\u06e4\u06df\u06e2"

    move-object/from16 v31, v2

    move-object/from16 v9, v32

    goto/16 :goto_f

    :sswitch_23
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    or-int/2addr v2, v5

    const v5, -0x1ab3c0

    xor-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_24
    const-string v26, "\u06e3\u06e4\u06e7"

    move-object/from16 v5, v19

    move-object/from16 v9, v20

    move-object/from16 v2, v21

    goto/16 :goto_2

    :cond_27
    :sswitch_25
    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v5, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    or-int/lit16 v5, v5, -0x12c2

    xor-int/2addr v2, v5

    if-ltz v2, :cond_28

    const-string v2, "\u06e0\u06e0\u06e8"

    :goto_17
    invoke-static {v2}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_28
    const-string v2, "\u06e3\u06e7\u06df"

    invoke-static {v2}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_26
    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v5, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    or-int/lit16 v5, v5, 0x2ae

    mul-int/2addr v2, v5

    if-ltz v2, :cond_29

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    const-string v2, "\u06df\u06df\u06e1"

    goto/16 :goto_7

    :cond_29
    const-string v2, "\u06e2\u06e5"

    :goto_18
    invoke-static {v2}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_27
    move-object/from16 v0, p0

    iget-object v2, v0, Lfa;->b:Ll00;

    iget-boolean v2, v2, Ll00;->a:Z

    if-eqz v2, :cond_25

    move-object/from16 v0, p0

    iget-object v2, v0, Lfa;->c:Landroid/widget/TextView;

    if-eqz v2, :cond_25

    move-object/from16 v0, p0

    iget-object v2, v0, Lfa;->d:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v26

    move-object/from16 v0, p0

    iget-object v2, v0, Lfa;->e:Ln00;

    iget v9, v2, Ln00;->a:I

    move-object/from16 v0, p0

    iget-object v2, v0, Lfa;->f:Ln00;

    const/4 v5, -0x1

    if-eq v9, v5, :cond_39

    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v27, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    move/from16 v0, v27

    mul-int/lit16 v0, v0, 0x1194

    move/from16 v27, v0

    xor-int v5, v5, v27

    if-ltz v5, :cond_2a

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v5, "\u06e6\u06e8\u06e6"

    invoke-static {v5}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v27, v2

    move/from16 v28, v9

    move/from16 v29, v26

    move/from16 v49, v5

    goto/16 :goto_0

    :cond_2a
    const-string v5, "\u06e3\u06df"

    goto/16 :goto_11

    :sswitch_28
    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    if-ltz v2, :cond_2b

    const-string v2, "\u06df\u06e4\u06e1"

    move-object v5, v2

    move-object/from16 v9, v32

    goto/16 :goto_f

    :cond_2b
    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    xor-int/2addr v2, v5

    const v5, 0x1ac85c

    xor-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_29
    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v5, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    or-int/2addr v2, v5

    const v5, 0x1aa966

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_2a
    move/from16 v0, v29

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v38

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v5, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    rem-int/lit16 v5, v5, 0x1483

    add-int/2addr v2, v5

    if-ltz v2, :cond_2c

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v2, "\u06e0\u06df\u06e1"

    move v5, v13

    :goto_19
    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    move/from16 v41, v5

    goto/16 :goto_0

    :cond_2c
    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    xor-int/2addr v2, v5

    const v5, -0x1ab11b

    xor-int/2addr v2, v5

    move/from16 v49, v2

    move/from16 v41, v13

    goto/16 :goto_0

    :sswitch_2b
    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v2, :cond_2d

    const-string v5, "\u06e5\u06e3\u06e8"

    move-object/from16 v2, v33

    move/from16 v9, v34

    move/from16 v26, v35

    goto/16 :goto_6

    :cond_2d
    const-string v2, "\u06e5\u06e8\u06e4"

    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_2c
    sget-object v2, Lkn;->a:Lkn;

    const-string v5, "mlPa62opw7ifV87RWyPPv55E/NlrJMU=\n"

    const-string v9, "8TajtARAoNM=\n"

    invoke-static {v5, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v0, v18

    invoke-static {v5, v0}, Lkn;->g(Ljava/lang/String;I)V

    const-string v2, "4umXyyPkw2Hn7YPxEu7PZub+seEj5MZl++E=\n"

    const-string v5, "iYzulE2NoAo=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v27

    iget v9, v0, Ln00;->a:I

    move-object/from16 v5, v38

    :goto_1a
    const-string v26, "\u06e6\u06df\u06e5"

    move-object/from16 v37, v2

    move-object/from16 v38, v5

    move/from16 v39, v9

    goto/16 :goto_10

    :sswitch_2d
    move/from16 v5, v18

    :cond_2e
    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v9, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    mul-int/lit16 v9, v9, 0x4da

    add-int/2addr v2, v9

    if-ltz v2, :cond_2f

    const/16 v2, 0x58

    sput v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v2, "\u06e8\u06e4\u06e3"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v18, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_2f
    const-string v2, "\u06e1\u06e8\u06e0"

    move-object v9, v2

    move/from16 v18, v5

    goto/16 :goto_15

    :sswitch_2e
    :try_start_a
    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    xor-int/lit8 v2, v2, -0x4d

    aput-object v20, v47, v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/lit16 v5, v5, 0x3d3

    xor-int/2addr v2, v5

    if-ltz v2, :cond_31

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    :cond_30
    const-string v2, "\u06e5\u06e7\u06e7"

    invoke-static {v2}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_31
    const-string v2, "\u06e5\u06e0\u06e4"

    move-object v5, v2

    :goto_1b
    invoke-static {v5}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_2f
    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v2

    if-ltz v2, :cond_32

    move-object/from16 v2, v37

    move-object/from16 v5, v37

    move/from16 v9, v39

    goto :goto_1a

    :cond_32
    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    xor-int/2addr v2, v5

    const v5, 0x1acb20

    add-int/2addr v2, v5

    move-object/from16 v38, v37

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_30
    if-eqz v32, :cond_25

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    mul-int/2addr v2, v5

    const v5, 0x1d95bd

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_31
    if-nez v23, :cond_a

    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_a

    sget-object v2, Lkn;->a:Lkn;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v9, "spoof_"

    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-wide/from16 v0, v24

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, "_"

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v9, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v26, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    move/from16 v0, v26

    add-int/lit16 v0, v0, -0x1d6e

    move/from16 v26, v0

    rem-int v9, v9, v26

    if-gtz v9, :cond_33

    const-string v9, "\u06e4\u06e3\u06e5"

    invoke-static {v9}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v44, v2

    move-object/from16 v45, v5

    move/from16 v49, v9

    goto/16 :goto_0

    :cond_33
    sget v9, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v26, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    mul-int v9, v9, v26

    const v26, 0x124084

    add-int v9, v9, v26

    move-object/from16 v44, v2

    move-object/from16 v45, v5

    move/from16 v49, v9

    goto/16 :goto_0

    :sswitch_32
    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v5, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    or-int/2addr v2, v5

    const v5, 0x1ac619

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_33
    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v5, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    xor-int/lit16 v5, v5, -0x190a

    xor-int/2addr v2, v5

    if-ltz v2, :cond_34

    const/4 v2, 0x6

    sput v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v2, "\u06e5\u06e2\u06e5"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    move/from16 v41, v39

    goto/16 :goto_0

    :cond_34
    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    div-int/2addr v2, v5

    const v5, 0x1ac9c2

    add-int/2addr v2, v5

    move/from16 v49, v2

    move/from16 v41, v39

    goto/16 :goto_0

    :sswitch_34
    const/4 v5, 0x0

    move/from16 v0, v36

    move/from16 v1, v34

    if-ge v0, v1, :cond_43

    move-object/from16 v0, v33

    move/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    xor-int/lit16 v2, v2, 0x1dd

    add-int v16, v36, v2

    sget v9, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    if-ltz v40, :cond_41

    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v14, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    add-int/lit16 v14, v14, -0x26bc

    rem-int/2addr v2, v14

    if-gtz v2, :cond_35

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v2, "\u06e8\u06e7\u06e1"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v14, v5

    move v15, v9

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_35
    const-string v2, "\u06e0\u06e7"

    goto/16 :goto_c

    :sswitch_35
    invoke-virtual/range {v46 .. v46}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, ""

    move-object/from16 v0, v43

    invoke-static {v0, v2}, Lkn;->h(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, v19

    move/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsx;

    iget-object v2, v2, Lsx;->a:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    instance-of v5, v2, Landroid/widget/TextView;

    if-eqz v5, :cond_c

    move-object v5, v2

    check-cast v5, Landroid/widget/TextView;

    move-object/from16 v0, v21

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v5, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v5, :cond_36

    const/16 v5, 0x2c

    sput v5, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    const-string v5, "\u06e2\u06e4\u06e1"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v5

    move-object v11, v2

    move/from16 v49, v5

    goto/16 :goto_0

    :cond_36
    sget v5, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v9, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    div-int/2addr v5, v9

    const v9, 0x1ac56b

    xor-int/2addr v5, v9

    move-object v11, v2

    move/from16 v49, v5

    goto/16 :goto_0

    :sswitch_36
    move-object/from16 v0, v38

    move/from16 v1, v41

    invoke-static {v0, v1}, Lkn;->g(Ljava/lang/String;I)V

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v2

    if-ltz v2, :cond_38

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    :cond_37
    const-string v2, "\u06e0\u06e7\u06e8"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_38
    move-object/from16 v2, v31

    goto/16 :goto_16

    :sswitch_37
    sget-object v5, Lln;->l:Ljava/lang/Class;

    if-eqz v5, :cond_47

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v8, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    mul-int/2addr v2, v8

    const v8, 0x11b946

    add-int/2addr v2, v8

    move-object v8, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_38
    sget-object v5, Lkn;->a:Lkn;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v9, "spoof_"

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-wide/from16 v0, v24

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, "_"

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v0, v40

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget v9, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v26, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    add-int v9, v9, v26

    const v26, 0x1aaaa7

    add-int v9, v9, v26

    move-object/from16 v43, v2

    move-object/from16 v46, v5

    move/from16 v49, v9

    goto/16 :goto_0

    :sswitch_39
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v5, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    rem-int/2addr v2, v5

    const v5, 0x1aaad9

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_3a
    move-object/from16 v2, v27

    move/from16 v9, v28

    move/from16 v26, v29

    :cond_39
    sget v5, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v27, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    move/from16 v0, v27

    rem-int/lit16 v0, v0, -0x1697

    move/from16 v27, v0

    div-int v5, v5, v27

    if-gtz v5, :cond_3a

    const-string v5, "\u06e3\u06e4\u06e1"

    move-object/from16 v27, v2

    move/from16 v28, v9

    move/from16 v29, v26

    goto/16 :goto_1b

    :cond_3a
    sget v5, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v27, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    div-int v5, v5, v27

    const v27, 0x1ac9a9

    xor-int v5, v5, v27

    move-object/from16 v27, v2

    move/from16 v28, v9

    move/from16 v29, v26

    move/from16 v49, v5

    goto/16 :goto_0

    :sswitch_3b
    move-object v2, v6

    check-cast v2, Landroid/widget/TextView;

    move-object/from16 v0, v20

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v5, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    mul-int/lit16 v5, v5, -0x10df

    mul-int/2addr v2, v5

    if-ltz v2, :cond_3b

    const-string v2, "\u06e5\u06e4\u06e3"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_3b
    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sub-int/2addr v2, v5

    const v5, 0x1ac93a

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_3c
    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v5, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    add-int/2addr v2, v5

    const v5, 0x1ab277

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_3d
    sget-object v2, Lkn;->a:Lkn;

    const-string v5, "pTx1etFdrZWgOGFA4FehkqErU0jQUKs=\n"

    const-string v9, "zlkMJb80zv4=\n"

    invoke-static {v5, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v9, 0x0

    const/4 v2, 0x0

    invoke-static {v5, v2}, Lkn;->g(Ljava/lang/String;I)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "nick_color_"

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "\u06e5\u06e8\u06e5"

    goto/16 :goto_b

    :sswitch_3e
    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_4

    const-string v2, "\u06e4\u06e3\u06e5"

    goto/16 :goto_13

    :sswitch_3f
    move-object/from16 v0, v42

    move/from16 v1, v48

    invoke-static {v0, v1}, Lkn;->g(Ljava/lang/String;I)V

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    if-ltz v2, :cond_3c

    const/16 v2, 0x62

    sput v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    move/from16 v2, v40

    goto/16 :goto_14

    :cond_3c
    const-string v2, "\u06e7\u06e2\u06e3"

    goto/16 :goto_13

    :sswitch_40
    const-string v2, "\u06e2\u06e3\u06e8"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_41
    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    move-result v2

    if-ltz v2, :cond_3d

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v2, "\u06df\u06e3\u06df"

    move-object v9, v2

    goto/16 :goto_15

    :cond_3d
    const-string v2, "\u06e1\u06df\u06e7"

    move-object v9, v2

    goto/16 :goto_15

    :sswitch_42
    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v5, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    div-int/lit16 v5, v5, -0x11bd

    xor-int/2addr v2, v5

    if-ltz v2, :cond_3e

    const/16 v2, 0x20

    sput v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    const-string v2, "\u06e3\u06e7\u06df"

    invoke-static {v2}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v32, v14

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_3e
    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v5, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/2addr v2, v5

    const v5, 0x1ac4e4

    add-int/2addr v2, v5

    move-object/from16 v32, v14

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_43
    sget-object v2, Lln;->l:Ljava/lang/Class;

    if-eqz v2, :cond_10

    sget v5, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v7, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    rem-int/lit16 v7, v7, -0x577

    sub-int/2addr v5, v7

    if-ltz v5, :cond_3f

    const-string v5, "\u06e5\u06e0\u06e4"

    invoke-static {v5}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v5

    move-object v7, v2

    move/from16 v49, v5

    goto/16 :goto_0

    :cond_3f
    sget v5, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v7, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    div-int/2addr v5, v7

    const v7, 0x1ac263

    add-int/2addr v5, v7

    move-object v7, v2

    move/from16 v49, v5

    goto/16 :goto_0

    :sswitch_44
    :try_start_b
    invoke-virtual {v11}, Landroid/view/View;->invalidate()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v5, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    xor-int/lit16 v5, v5, -0xfeb

    rem-int/2addr v2, v5

    if-ltz v2, :cond_37

    const-string v2, "\u06e1\u06e5\u06e3"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_45
    const-string v2, "\u06e2\u06e8\u06e1"

    move/from16 v40, v35

    move/from16 v5, v41

    goto/16 :goto_19

    :sswitch_46
    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    or-int/lit16 v5, v5, -0x425

    mul-int/2addr v2, v5

    if-gtz v2, :cond_40

    const/16 v2, 0x1b

    sput v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v2, "\u06e4\u06e3\u06e8"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_40
    const-string v2, "\u06e1\u06e1\u06e1"

    goto/16 :goto_4

    :sswitch_47
    move-object v5, v14

    move v9, v15

    :cond_41
    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    move-result v2

    if-ltz v2, :cond_42

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v2, "\u06e7\u06e0\u06e4"

    move-object v14, v5

    move v15, v9

    goto/16 :goto_18

    :cond_42
    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v14, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int/2addr v2, v14

    const v14, 0x1ab53b

    xor-int/2addr v2, v14

    move-object v14, v5

    move v15, v9

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_48
    move-object/from16 v0, p0

    iget-object v2, v0, Lfa;->g:Landroid/app/Dialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/2addr v2, v5

    const v5, 0x1aa7fc

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_49
    move-object v5, v14

    :cond_43
    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v9, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    mul-int/2addr v2, v9

    const v9, 0x1cb18

    add-int/2addr v2, v9

    move-object v14, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :sswitch_4a
    const/4 v2, 0x0

    throw v2

    :sswitch_4b
    :try_start_c
    move-object/from16 v0, v31

    move-object/from16 v1, v47

    invoke-virtual {v0, v6, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    rem-int/lit16 v5, v5, 0x21b9

    add-int/2addr v2, v5

    if-ltz v2, :cond_44

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    const-string v2, "\u06df\u06e2\u06e2"

    invoke-static {v2}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_44
    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v5, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sub-int/2addr v2, v5

    const v5, 0x1ab46e

    add-int/2addr v2, v5

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_45
    :sswitch_4c
    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    move-result v2

    if-ltz v2, :cond_46

    const/16 v2, 0x2a

    sput v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v2, "\u06e0\u06e8\u06e7"

    invoke-static {v2}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v49, v2

    goto/16 :goto_0

    :cond_46
    const-string v2, "\u06e1\u06e7\u06e1"

    goto/16 :goto_17

    :sswitch_4d
    return-void

    :cond_47
    move-object v2, v7

    goto/16 :goto_d

    :cond_48
    :sswitch_4e
    move-object v2, v7

    move-object v5, v8

    goto/16 :goto_d

    :sswitch_data_0
    .sparse-switch
        0xdc07 -> :sswitch_0
        0xdc43 -> :sswitch_4e
        0xdc5c -> :sswitch_f
        0xdc7b -> :sswitch_27
        0xdc81 -> :sswitch_32
        0xdcdb -> :sswitch_28
        0xdcfa -> :sswitch_32
        0x1aa701 -> :sswitch_3e
        0x1aa746 -> :sswitch_29
        0x1aa75f -> :sswitch_45
        0x1aa7fc -> :sswitch_4d
        0x1aa7fd -> :sswitch_10
        0x1aa819 -> :sswitch_2e
        0x1aa81c -> :sswitch_1f
        0x1aaac0 -> :sswitch_28
        0x1aaac2 -> :sswitch_3a
        0x1aab05 -> :sswitch_22
        0x1aab7c -> :sswitch_35
        0x1aabc1 -> :sswitch_1d
        0x1aabd9 -> :sswitch_3
        0x1aae85 -> :sswitch_a
        0x1aae89 -> :sswitch_4
        0x1aaec1 -> :sswitch_3c
        0x1aaf3f -> :sswitch_c
        0x1aaf7b -> :sswitch_44
        0x1aaf99 -> :sswitch_2c
        0x1ab247 -> :sswitch_32
        0x1ab2c4 -> :sswitch_13
        0x1ab2c7 -> :sswitch_23
        0x1ab2df -> :sswitch_2d
        0x1ab2fd -> :sswitch_7
        0x1ab31b -> :sswitch_4c
        0x1ab33d -> :sswitch_39
        0x1ab33f -> :sswitch_38
        0x1ab35a -> :sswitch_20
        0x1ab35b -> :sswitch_34
        0x1ab60b -> :sswitch_3d
        0x1ab645 -> :sswitch_1c
        0x1ab668 -> :sswitch_48
        0x1ab67f -> :sswitch_4e
        0x1ab6a2 -> :sswitch_17
        0x1ab6a6 -> :sswitch_4e
        0x1ab6df -> :sswitch_1b
        0x1ab6e3 -> :sswitch_21
        0x1ab6fb -> :sswitch_14
        0x1ab6ff -> :sswitch_11
        0x1ab9c7 -> :sswitch_16
        0x1ab9cb -> :sswitch_32
        0x1ab9e9 -> :sswitch_4e
        0x1aba43 -> :sswitch_d
        0x1aba46 -> :sswitch_40
        0x1aba49 -> :sswitch_49
        0x1aba80 -> :sswitch_30
        0x1aba9d -> :sswitch_3f
        0x1ababe -> :sswitch_2
        0x1abadd -> :sswitch_37
        0x1abda9 -> :sswitch_4b
        0x1abdac -> :sswitch_47
        0x1abde8 -> :sswitch_4a
        0x1abde9 -> :sswitch_12
        0x1abe06 -> :sswitch_19
        0x1abe0a -> :sswitch_31
        0x1abe24 -> :sswitch_3b
        0x1abe85 -> :sswitch_e
        0x1abea1 -> :sswitch_4e
        0x1abea2 -> :sswitch_2a
        0x1abea5 -> :sswitch_9
        0x1ac14c -> :sswitch_33
        0x1ac1a7 -> :sswitch_3c
        0x1ac203 -> :sswitch_23
        0x1ac21f -> :sswitch_8
        0x1ac264 -> :sswitch_15
        0x1ac546 -> :sswitch_46
        0x1ac54a -> :sswitch_1a
        0x1ac568 -> :sswitch_18
        0x1ac56b -> :sswitch_26
        0x1ac58c -> :sswitch_21
        0x1ac5c2 -> :sswitch_43
        0x1ac5e4 -> :sswitch_1e
        0x1ac92e -> :sswitch_25
        0x1ac963 -> :sswitch_41
        0x1ac965 -> :sswitch_b
        0x1ac969 -> :sswitch_2b
        0x1ac9aa -> :sswitch_5
        0x1ac9c2 -> :sswitch_2f
        0x1ac9c6 -> :sswitch_36
        0x1ac9c8 -> :sswitch_1
        0x1ac9e0 -> :sswitch_24
        0x1ac9e2 -> :sswitch_42
        0x1ac9e6 -> :sswitch_6
    .end sparse-switch
.end method
