.class public final Lt6;
.super Lt50;

# interfaces
.implements Lym;


# instance fields
.field public final e:I


# direct methods
.method public synthetic constructor <init>(Lvd;I)V
    .locals 3

    iput p2, p0, Lt6;->e:I

    invoke-direct {p0, p1}, Lt50;-><init>(Lvd;)V

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e7\u06e3"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-result v0

    if-ltz v0, :cond_2

    const-string v0, "\u06e3\u06e8\u06e0"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "jUF0hXSA5"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->ۣۨۡۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    move-result v1

    if-ltz v1, :cond_0

    const-string v1, "\u06e3\u06e8\u06e0"

    invoke-static {v1}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_0
    sget v1, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    or-int/2addr v1, v2

    const v2, 0x1ab4c6

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    const-string v0, "\u06e3\u06e3\u06e4"

    goto :goto_1

    :cond_1
    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    xor-int/2addr v0, v2

    const v2, 0x1aaf71

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_2
    :sswitch_3
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    const-string v0, "\u06e1\u06e2\u06e5"

    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e2\u06e0\u06e7"

    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    div-int/2addr v0, v2

    const v2, 0x1aaf7e

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaf7d -> :sswitch_0
        0x1ab269 -> :sswitch_5
        0x1ab625 -> :sswitch_2
        0x1ab684 -> :sswitch_3
        0x1ab71b -> :sswitch_1
        0x1ac621 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lvd;)Lvd;
    .locals 2

    const-string v0, "\u06e0\u06e6\u06e3"

    invoke-static {v0}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    const-string v0, "\u06e8\u06e6\u06e4"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Lt6;

    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    xor-int/lit8 v1, v1, -0x4f

    invoke-direct {v0, p1, v1}, Lt6;-><init>(Lvd;I)V

    :goto_2
    return-object v0

    :sswitch_2
    iget v0, p0, Lt6;->e:I

    packed-switch v0, :pswitch_data_0

    :sswitch_3
    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v0, :cond_0

    const-string v0, "\u06e5\u06e5\u06e6"

    :goto_3
    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_4
    new-instance v0, Lt6;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lt6;-><init>(Lvd;I)V

    goto :goto_2

    :cond_0
    const-string v0, "\u06e4\u06e5\u06e4"

    goto :goto_3

    :cond_1
    const-string v0, "\u06e0\u06e6\u06e3"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :pswitch_0
    :sswitch_5
    sget v0, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v0, :cond_2

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v0, "\u06df\u06e6\u06e7"

    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e7\u06df\u06e3"

    goto :goto_1

    :pswitch_1
    :sswitch_6
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sub-int/2addr v0, v1

    const v1, 0x1ac414

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_7
    new-instance v0, Lt6;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lt6;-><init>(Lvd;I)V

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa726 -> :sswitch_0
        0x1aab9d -> :sswitch_2
        0x1ab680 -> :sswitch_3
        0x1aba83 -> :sswitch_1
        0x1abae2 -> :sswitch_6
        0x1ac509 -> :sswitch_4
        0x1ac50b -> :sswitch_7
        0x1ac92e -> :sswitch_5
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v6, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e2\u06e6"

    invoke-static {v1}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    move-object v3, v0

    move-object v4, v0

    move v5, v6

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Lt6;

    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    xor-int/lit16 v1, v1, 0x3db

    invoke-direct {v0, v3, v1}, Lt6;-><init>(Lvd;I)V

    sget-object v1, Lxh;->n:Lxh;

    invoke-virtual {v0, v1}, Lt6;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_1
    :sswitch_1
    return-object v1

    :pswitch_0
    :sswitch_2
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    const-string v0, "\u06e4\u06e4\u06df"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e5\u06e3\u06e7"

    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :pswitch_1
    :sswitch_3
    sget v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    add-int/lit16 v2, v2, 0x1906

    mul-int/2addr v0, v2

    if-gtz v0, :cond_1

    const-string v0, "\u06e5\u06e6\u06df"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab6b7

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    new-instance v0, Lt6;

    const/4 v2, 0x1

    invoke-direct {v0, v3, v2}, Lt6;-><init>(Lvd;I)V

    const-string v2, "\u06e5\u06e6\u06e3"

    invoke-static {v2}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v4, v0

    goto :goto_0

    :sswitch_5
    sget-object v0, Lxh;->n:Lxh;

    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    rem-int/lit16 v2, v2, -0x355

    mul-int/2addr v1, v2

    if-ltz v1, :cond_2

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    const-string v1, "\u06e0\u06e3\u06e5"

    move-object v2, v1

    :goto_2
    invoke-static {v2}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_2
    const-string v1, "\u06e3\u06df\u06e6"

    move-object v2, v1

    :goto_3
    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_6
    invoke-virtual {v4, v1}, Lt6;->g(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    add-int/lit16 v2, v2, -0x1472

    mul-int/2addr v0, v2

    if-ltz v0, :cond_3

    const-string v0, "\u06e3\u06e3\u06e4"

    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    div-int/2addr v0, v2

    const v2, 0x1aab5e

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    new-instance v0, Lt6;

    invoke-direct {v0, v3, v6}, Lt6;-><init>(Lvd;I)V

    sget-object v1, Lxh;->n:Lxh;

    invoke-virtual {v0, v1}, Lt6;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_1

    :sswitch_8
    iget v0, p0, Lt6;->e:I

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v5, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    rem-int/2addr v2, v5

    const v5, 0x1aad42

    add-int/2addr v2, v5

    move v5, v0

    goto/16 :goto_0

    :sswitch_9
    move-object v0, p2

    check-cast v0, Lvd;

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    div-int/2addr v2, v3

    const v3, -0x1ac18d

    xor-int/2addr v2, v3

    move-object v3, v0

    goto/16 :goto_0

    :sswitch_a
    move-object v0, p1

    check-cast v0, Lpe;

    const-string v2, "\u06e0\u06df\u06e1"

    move-object v0, v1

    goto :goto_2

    :sswitch_b
    packed-switch v5, :pswitch_data_0

    :sswitch_c
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    mul-int/lit16 v2, v2, 0x2203

    div-int/2addr v0, v2

    if-eqz v0, :cond_4

    const/16 v0, 0xb

    sput v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v2, "\u06e2\u06e3\u06e3"

    move-object v0, v1

    goto :goto_3

    :cond_4
    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    mul-int/2addr v0, v2

    const v2, 0x1c9e46

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_d
    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    div-int/2addr v0, v2

    const v2, 0x1ac92c

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa706 -> :sswitch_0
        0x1aaac2 -> :sswitch_9
        0x1aab42 -> :sswitch_3
        0x1aab5e -> :sswitch_1
        0x1aae83 -> :sswitch_2
        0x1aae85 -> :sswitch_a
        0x1ab60a -> :sswitch_6
        0x1ab684 -> :sswitch_7
        0x1aba28 -> :sswitch_c
        0x1abe09 -> :sswitch_4
        0x1abe62 -> :sswitch_5
        0x1ac18c -> :sswitch_b
        0x1ac226 -> :sswitch_d
        0x1ac92c -> :sswitch_8
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const/16 v13, 0xc8

    const/4 v7, 0x0

    const/4 v3, 0x2

    const/4 v11, 0x1

    const/4 v5, 0x0

    iget v2, p0, Lt6;->e:I

    packed-switch v2, :pswitch_data_0

    invoke-static {p1}, Lgu;->M(Ljava/lang/Object;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    sget-object v2, Lbw;->b:Ljava/lang/Object;

    if-eqz v2, :cond_2

    :try_start_0
    sget-object v2, Lub0;->E0:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    sget-object v6, Lbw;->b:Ljava/lang/Object;

    const-string v8, "bAUXF7Vy4QU=\n"

    const-string v9, "HmRgRsAXk3w=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-array v3, v3, [Ljava/lang/Object;

    const-string v9, "SELECT username, nickname, conRemark FROM "

    const-string v10, " WHERE (type & 2 != 0 OR username LIKE \'%@chatroom\') AND username NOT LIKE \'gh_%\' AND username NOT LIKE \'%@app\' AND username != \'filehelper\'"

    invoke-static {v9, v2, v10}, Lg40;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v5

    aput-object v7, v3, v11

    invoke-static {v6, v8, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    :try_start_1
    instance-of v2, v3, Landroid/database/Cursor;

    if-eqz v2, :cond_5

    :goto_1
    move-object v0, v3

    check-cast v0, Landroid/database/Cursor;

    move-object v2, v0

    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_b

    move-object v0, v3

    check-cast v0, Landroid/database/Cursor;

    move-object v2, v0

    const/4 v5, 0x0

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object v0, v3

    check-cast v0, Landroid/database/Cursor;

    move-object v2, v0

    const/4 v6, 0x1

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_0

    const-string v6, ""

    :cond_0
    move-object v0, v3

    check-cast v0, Landroid/database/Cursor;

    move-object v2, v0

    const/4 v7, 0x2

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    const-string v2, ""

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_23

    :goto_2
    new-instance v6, Lwv;

    invoke-static {v5}, Lmp;->d(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_4

    :goto_3
    const-string v7, "4FzxEqz6pljN\n"

    const-string v8, "oD+Zc9iIyTc=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Li50;->A(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    invoke-direct {v6, v5, v2, v7}, Lwv;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    :try_start_2
    const-string v2, "QP+yMRORwnl/05YNGIvHf3nAvBEC\n"

    const-string v5, "DYzVYnb/phw=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "06ke\n"

    const-string v6, "p8h5VTpLcuY=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "tw==\n"

    const-string v5, "0vI8ySRxU5w=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    const-string v2, "+0PPDmk=\n"

    const-string v5, "mC+gfQxwjxk=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v3, v2, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_2
    :goto_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_10

    sget-object v2, Lbw;->c:Ljava/util/LinkedHashMap;

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_10

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v6, "SSEhGIZhpoo=\n"

    const-string v7, "rp+F8AfrnKo=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Li50;->K(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/4 v6, 0x4

    invoke-virtual {v3, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    const-string v6, "pJgG60dKbhGwxUq2HRE=\n"

    const-string v7, "1+1kmDM4B38=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    new-instance v6, Lwv;

    const-string v7, "pq7Aq+vjB2GL\n"

    const-string v8, "5s2oyp+RaA4=\n"

    invoke-static {v7, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Li50;->A(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    invoke-direct {v6, v2, v3, v7}, Lwv;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :catchall_1
    move-exception v2

    const-string v2, "NjgzbQmAJT4=\n"

    const-string v6, "RFtcA33hRko=\n"

    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_0

    :cond_4
    move-object v2, v5

    goto/16 :goto_3

    :cond_5
    :try_start_4
    const-string v2, "rO7fCRBkdzWz8t0=\n"

    const-string v5, "wYGpbEQLMVw=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v3, v2, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v5, "de95GNzZubl19WFUnt/4tHrpYVSI1fi5dPQ4GonWtPdv42UR3NG3o3fze1q+1be7fvt7\n"

    const-string v6, "G5oVdPy62Nc=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_b

    :cond_6
    const-string v2, "+U0Z7YvZsUH5\n"

    const-string v5, "nihtvv+r2C8=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ljava/lang/Integer;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Ljava/lang/Integer;-><init>(I)V

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v5, v6, v8

    invoke-static {v3, v2, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Ljava/lang/String;

    if-eqz v5, :cond_c

    check-cast v2, Ljava/lang/String;

    move-object v5, v2

    :goto_6
    if-nez v5, :cond_7

    const-string v5, ""

    :cond_7
    const-string v2, "izzR3HLyX8GL\n"

    const-string v6, "7FmljwaANq8=\n"

    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ljava/lang/Integer;

    const/4 v8, 0x1

    invoke-direct {v6, v8}, Ljava/lang/Integer;-><init>(I)V

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v6, v8, v9

    invoke-static {v3, v2, v8}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v6, v2, Ljava/lang/String;

    if-eqz v6, :cond_d

    check-cast v2, Ljava/lang/String;

    move-object v6, v2

    :goto_7
    if-nez v6, :cond_8

    const-string v6, ""

    :cond_8
    const-string v2, "3TP7rBp1ACzd\n"

    const-string v8, "ulaP/24HaUI=\n"

    invoke-static {v2, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v8, Ljava/lang/Integer;

    const/4 v9, 0x2

    invoke-direct {v8, v9}, Ljava/lang/Integer;-><init>(I)V

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v8, v9, v10

    invoke-static {v3, v2, v9}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v8, v2, Ljava/lang/String;

    if-eqz v8, :cond_e

    check-cast v2, Ljava/lang/String;

    :goto_8
    if-nez v2, :cond_9

    const-string v2, ""

    :cond_9
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_a

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_22

    :goto_9
    new-instance v6, Lwv;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_f

    :goto_a
    const-string v8, "yQjZBGaP42Dk\n"

    const-string v9, "iWuxZRL9jA8=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v5, v8}, Li50;->A(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    invoke-direct {v6, v5, v2, v8}, Lwv;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    const-string v2, "kQVYEwZN5x+EHg==\n"

    const-string v5, "/GoudlIiqXo=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v3, v2, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v5, "XXaaYUk/b7BdbIItCzkuvVJwgi0dMy6wXG3bYxwwYv5HeoZoSTdhql9qmCMrM2GyVmKY\n"

    const-string v6, "MwP2DWlcDt4=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result v2

    if-nez v2, :cond_6

    :cond_b
    :try_start_5
    const-string v2, "0ipgMPc=\n"

    const-string v5, "sUYPQ5IxT5Y=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v3, v2, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto/16 :goto_4

    :catchall_2
    move-exception v2

    goto/16 :goto_4

    :cond_c
    move-object v5, v7

    goto/16 :goto_6

    :cond_d
    move-object v6, v7

    goto/16 :goto_7

    :cond_e
    move-object v2, v7

    goto :goto_8

    :cond_f
    move-object v2, v5

    goto :goto_a

    :catchall_3
    move-exception v2

    :try_start_6
    const-string v4, "A3+WeCo=\n"

    const-string v5, "YBP5C0/SJmk=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v3, v4, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :goto_b
    throw v2

    :cond_10
    move-object v2, v4

    :goto_c
    return-object v2

    :pswitch_0
    sget-object v3, Lxh;->n:Lxh;

    invoke-static {p1}, Lgu;->M(Ljava/lang/Object;)V

    :try_start_7
    new-instance v2, Ljava/net/URL;

    const-string v4, "VoUej9RVqUFZlA+Ull21QF+CA56IDvYHEYdb0NIc4xxhhQuY1A==\n"

    const-string v6, "PvFq/6dvhm4=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    const-string v4, "5SFDV2JXYp3lO1sbIFEjkOonWxs2WyOd5DoCVTdYb9P/LV9eYl5ihep6QV42GkuH/yR6aQ53bJ3l\nMUxPK1tt\n"

    const-string v6, "i1QvO0I0A/M=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Ljava/net/HttpURLConnection;

    const-string v4, "cMMG\n"

    const-string v6, "N4ZS9QIol/I=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/16 v4, 0x1388

    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    if-ne v4, v13, :cond_11

    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    const-string v4, "Kwgqdyku8sofGSxbJjOvkGJDdw==\n"

    const-string v6, "TG1ePkdeh74=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v4, Ln9;->a:Ljava/nio/charset/Charset;

    new-instance v6, Ljava/io/InputStreamReader;

    invoke-direct {v6, v2, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance v2, Ljava/io/BufferedReader;

    const/16 v4, 0x2000

    invoke-direct {v2, v6, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    invoke-static {v2}, Lmu;->D(Ljava/io/BufferedReader;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "stnH+w==\n"

    const-string v6, "1rizmhR+2dw=\n"

    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    if-nez v6, :cond_12

    :cond_11
    :goto_d
    move-object v2, v3

    goto :goto_c

    :cond_12
    new-instance v7, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v7}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v8

    :goto_e
    if-ge v5, v8, :cond_15

    invoke-virtual {v6, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    if-nez v9, :cond_14

    :cond_13
    :goto_f
    add-int/lit8 v2, v5, 0x2

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v5, v2, -0x2

    goto :goto_e

    :cond_14
    const-string v2, "LmiaZQ==\n"

    const-string v4, "WRDzAR0vfFE=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, ""

    invoke-virtual {v9, v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lmp;->d(Ljava/lang/Object;)V

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_13

    const-string v2, "dq3ASg==\n"

    const-string v4, "Asi4PoSCXY4=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "loJFmydUyKI=\n"

    const-string v11, "0ecg8AcEus0=\n"

    invoke-static {v4, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v2, "SUrc4nB81o5BEoafKic=\n"

    const-string v4, "JjqosQQOv+A=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v11}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    :try_start_8
    const-string v2, "09U6vY/3qS0=\n"

    const-string v4, "sbJl3uCbxl8=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    move-result-object v2

    :try_start_9
    const-string v4, "x8GnhWQ2nw==\n"

    const-string v12, "5ISfw1Fzpnw=\n"

    invoke-static {v4, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    move-result v2

    move v4, v2

    :goto_10
    :try_start_a
    const-string v2, "801KtpjhOifoWg==\n"

    const-string v12, "hygywseCVUs=\n"

    invoke-static {v2, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v12, "uVDkXXChkA==\n"

    const-string v13, "mmSnHDaUoNA=\n"

    invoke-static {v12, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v2, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    move-result v2

    :goto_11
    :try_start_b
    const-string v12, "pQ0u0lsviRqlHQ==\n"

    const-string v13, "zH5xtiJB6Hc=\n"

    invoke-static {v12, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v9, v12, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v9

    new-instance v12, Leb;

    invoke-direct {v12, v11, v4, v2, v9}, Leb;-><init>(Ljava/lang/String;IIZ)V

    invoke-virtual {v7, v10, v12}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    goto/16 :goto_f

    :catch_0
    move-exception v2

    const-string v4, "qv/FIwrGfqKk8sQ3Cfdt\n"

    const-string v5, "6ZOqVm6SH8U=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "\u26a0\ufe0f \u6807\u7b7e\u540c\u6b65\u5931\u8d25: "

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lg40;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "ioxU\n"

    const-string v6, "/u0zZ+lqY9I=\n"

    const-string v7, "KFnE\n"

    const-string v8, "RSqjPIOV6WI=\n"

    invoke-static {v5, v6, v4, v7, v8}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_d

    :catch_1
    move-exception v2

    :goto_12
    :try_start_c
    const-string v2, "5GOKntN/jQ==\n"

    const-string v4, "xyay2OY6tG0=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    move v4, v2

    goto :goto_10

    :catch_2
    move-exception v2

    const-string v2, "Yu4Frb+a+g==\n"

    const-string v12, "QdpG7Pmvyv8=\n"

    invoke-static {v2, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    goto :goto_11

    :cond_15
    sget-object v2, Lfb;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    invoke-virtual {v2, v7}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    const-string v4, "8h7acAcEAe/8E9tkBDUS\n"

    const-string v5, "sXK1BWNQYIg=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u2705 \u4e91\u7aef\u6807\u7b7e\u540c\u6b65\u5b8c\u6210\uff0c\u5171\u52a0\u8f7d "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " \u4e2a\u5c0a\u4eab\u7528\u6237"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "ioxU\n"

    const-string v6, "/u0zZ+lqY9I=\n"

    invoke-static {v5, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "KFnE\n"

    const-string v5, "RSqjPIOV6WI=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    goto/16 :goto_d

    :pswitch_1
    invoke-static {p1}, Lgu;->M(Ljava/lang/Object;)V

    sget-object v2, Lu6;->a:Lu6;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lu6;->g:Ljava/lang/String;

    const-string v6, "vh/tZnLPmKW8Ce9s\n"

    const-string v7, "61GmKD2Y1vo=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    sget-object v4, Lu6;->g:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_17

    :cond_16
    new-instance v2, Ljava/lang/Integer;

    const/4 v3, -0x2

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    goto/16 :goto_c

    :cond_17
    :try_start_d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sput-wide v6, Lu6;->e:J

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v8, "3SXFRaaWtnyBZLgf/Q==\n"

    const-string v9, "qUqWMdT/2Bs=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v8, "rw==\n"

    const-string v9, "grVMomtJ2CU=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, ""

    invoke-static {v4, v8, v9}, Li50;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    sget-object v4, Lu6;->g:Ljava/lang/String;

    sget v9, Lu6;->c:I

    const-string v10, "dtLhMsvY8kZi0ucr48PJTwXoyjzx\n"

    const-string v11, "MbeEWYa3lhk=\n"

    invoke-static {v10, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lu6;->a(Lu6;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lu6;->g:Ljava/lang/String;

    const-string v10, "IhZMBsg=\n"

    const-string v11, "d0IKK/ApnZE=\n"

    invoke-static {v10, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v4, v10}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v10, Ljava/net/URL;

    const-string v11, "Me2aaO/DpXY+/Itzrcu5dzjqh3mzj+8rMP+X\n"

    const-string v12, "WZnuGJz5ilk=\n"

    invoke-static {v11, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "?wxid="

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "&ts="

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "&ver="

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "&nonce="

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "&sign="

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v10, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    const-string v4, "oSLYw9Mr+/qhOMCPkS26964kwI+HJ7r6oDmZwYYk9rS7LsTK0yL74q552sqHZtLguyfh/b8L9fqh\nMtfbmif0\n"

    const-string v6, "z1e0r/NImpQ=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Ljava/net/HttpURLConnection;

    const-string v4, "a83u\n"

    const-string v6, "LIi6/EDUwew=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/16 v4, 0x3a98

    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const/16 v4, 0x3a98

    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setReadTimeout(I)V

    const-string v4, "wAV1I8HfTX/7Ag==\n"

    const-string v6, "lXYQUeyeKho=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "UIzh1iwN6BlWnPDVTCHgXXKH8JJUTLk=\n"

    const-string v7, "F+mEvWFijDQ=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "7lo6dj+V\n"

    const-string v6, "rzlZE0/hvQk=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "pWnJ6r4KLuWtdtepvRog/w==\n"

    const-string v7, "xBm5htdpT5E=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v4, v6}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3

    move-result v4

    if-eq v4, v13, :cond_18

    const/16 v6, 0x193

    if-eq v4, v6, :cond_18

    const/16 v6, 0x1aa

    if-eq v4, v6, :cond_18

    const/16 v6, 0x1f7

    if-eq v4, v6, :cond_18

    :goto_13
    new-instance v2, Ljava/lang/Integer;

    const/4 v3, -0x1

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    goto/16 :goto_c

    :cond_18
    const/16 v6, 0x190

    if-lt v4, v6, :cond_1a

    :try_start_e
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v2

    :goto_14
    if-eqz v2, :cond_1b

    sget-object v4, Ln9;->a:Ljava/nio/charset/Charset;

    new-instance v6, Ljava/io/InputStreamReader;

    invoke-direct {v6, v2, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance v2, Ljava/io/BufferedReader;

    const/16 v4, 0x2000

    invoke-direct {v2, v6, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    invoke-static {v2}, Lmu;->D(Ljava/io/BufferedReader;)Ljava/lang/String;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_3

    move-result-object v2

    move-object v4, v2

    :goto_15
    :try_start_f
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_4

    :goto_16
    :try_start_10
    const-string v4, "NVSgZA==\n"

    const-string v6, "UTXUBffbOAY=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, ""

    invoke-virtual {v2, v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "SUxEFw==\n"

    const-string v7, "OiUjeUEoBuc=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4}, Lmp;->d(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_1c

    :cond_19
    sget-object v2, Lu6;->a:Lu6;

    const-string v3, "eNC4ZlKc8b58yw==\n"

    const-string v4, "GaXMDg3ontU=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, ""

    invoke-static {v3, v2}, Lu6;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/Integer;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_3

    goto/16 :goto_c

    :catch_3
    move-exception v2

    const-string v3, "BL59C6wNc7orrg==\n"

    const-string v4, "RcsJY+ljFNM=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\u7f51\u7edc/\u5185\u90e8\u5f02\u5e38: "

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lg40;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "ioxU\n"

    const-string v5, "/u0zZ+lqY9I=\n"

    const-string v6, "KFnE\n"

    const-string v7, "RSqjPIOV6WI=\n"

    invoke-static {v4, v5, v3, v6, v7}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_13

    :cond_1a
    :try_start_11
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    goto/16 :goto_14

    :cond_1b
    const-string v2, "o+M=\n"

    const-string v4, "2J4zAN3hDXg=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v4, v2

    goto :goto_15

    :catch_4
    move-exception v2

    new-instance v2, Lorg/json/JSONObject;

    const-string v4, "3+c=\n"

    const-string v6, "pJo7GMwfl08=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    goto/16 :goto_16

    :cond_1c
    invoke-static {v2}, Lmp;->d(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_19

    sget-object v6, Lu6;->a:Lu6;

    invoke-static {v6, v4, v2}, Lu6;->b(Lu6;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_19

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v4, "pvbRBb4=\n"

    const-string v6, "yJm/ZtsK5u4=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, ""

    invoke-virtual {v2, v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v8}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    const-string v2, "V01ZSk7IKx5TVg==\n"

    const-string v3, "NjgtIhG8RHU=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-static {v2, v3}, Lu6;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/Integer;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    goto/16 :goto_c

    :cond_1d
    const-string v4, "JXunBL9M\n"

    const-string v6, "Vg/GcMo/Sqc=\n"

    invoke-static {v4, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, -0x1

    invoke-virtual {v2, v4, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    const-string v6, "dIio\n"

    const-string v7, "GfvP6dabbN8=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    sput-object v6, Lu6;->d:Ljava/lang/String;

    if-ne v4, v13, :cond_1f

    const-string v6, "rnN70iSoQy8=\n"

    const-string v7, "2BYJu0LBJks=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v2, v6, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_1f

    const-string v3, "Qyg=\n"

    const-string v4, "KFjrII/7HGM=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lmp;->d(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1e

    const-string v3, "05I=\n"

    const-string v4, "uOLlw7ujaNk=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lu6;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_3

    :cond_1e
    :try_start_12
    sget-object v2, Lfb;->a:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v2, Lkn;->a:Lkn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lkn;->i:Lsd;

    sget-object v3, Lyg;->b:Lof;

    new-instance v4, Lt6;

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-direct {v4, v5, v6}, Lt6;-><init>(Lvd;I)V

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5}, Lg80;->u(Lpe;Lhe;Lym;I)Lw40;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    :goto_17
    :try_start_13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sget-object v4, Lu6;->a:Lu6;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lu6;->g:Ljava/lang/String;

    sget v5, Lu6;->c:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "|"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v8, 0x5

    sub-long/2addr v2, v8

    const-wide/32 v8, 0x5265c00

    add-long/2addr v2, v8

    const-wide/16 v8, 0x5

    add-long/2addr v2, v8

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "|"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Sg3zDSKBCyROFg==\n"

    const-string v4, "K3iHZX31ZE8=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Lju;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lu6;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/Integer;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V

    goto/16 :goto_c

    :cond_1f
    const-string v2, "gZLtRTO/HTKFiQ==\n"

    const-string v6, "4OeZLWzLclk=\n"

    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v6, ""

    invoke-static {v2, v6}, Lu6;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x1aa

    if-eq v4, v2, :cond_20

    const/16 v2, 0x1f7

    if-eq v4, v2, :cond_21

    move v3, v5

    :cond_20
    :goto_18
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_3

    goto/16 :goto_c

    :cond_21
    const/4 v2, 0x3

    move v3, v2

    goto :goto_18

    :catchall_4
    move-exception v2

    goto :goto_17

    :catchall_5
    move-exception v3

    goto/16 :goto_b

    :catch_5
    move-exception v2

    goto/16 :goto_12

    :cond_22
    move-object v2, v6

    goto/16 :goto_9

    :cond_23
    move-object v2, v6

    goto/16 :goto_2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
