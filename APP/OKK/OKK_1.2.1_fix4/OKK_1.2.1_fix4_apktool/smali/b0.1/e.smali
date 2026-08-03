.class public final synthetic Lb0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/l;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb0/e;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    const-string v0, "com.tencent.mm.ui.MainTabUI"

    const-string v1, "<unused var>"

    const-string v2, "cl"

    const-string v3, "ChatFooter"

    const-string v4, "\u65e0 ChatFooter"

    const-string v5, "args"

    const-string v6, "param"

    const-string v7, "LauncherUI"

    const-string v8, "\u65e0 LauncherUI"

    const-string v9, "MicroMsg.ChatFooter"

    const-string v10, "MicroMsg.SnsInfoStorage"

    const-string v11, "\u65e0\u804a\u5929\u951a\u70b9"

    const-string v12, "com.tencent.mm.ui.widget.MMNeat7extView"

    const-string v13, "MicroMsg.MMNeatTextView"

    const-string v15, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"

    const-string v14, "com.tencent.mm.ui.LauncherUI"

    const-string v16, "MicroMsg.LauncherUI"

    move-object/from16 v17, v1

    const-string v1, "ctx"

    move-object/from16 v19, v0

    move-object/from16 v18, v7

    move-object/from16 v7, p0

    iget v0, v7, Lb0/e;->a:I

    packed-switch v0, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, Lde/robv/android/xposed/b;

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v0, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v1, v0}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    move-object v14, v0

    check-cast v14, Ljava/lang/Number;

    goto :goto_0

    :cond_0
    const/4 v14, 0x0

    :goto_0
    if-eqz v14, :cond_3

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-boolean v1, Lc0/G;->g:Z

    if-nez v1, :cond_1

    sget-object v1, Lc0/G;->c:Ld0/s;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Ld0/s;->e(IZ)V

    :cond_1
    sget-object v1, Lc0/G;->c:Ld0/s;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ld0/s;->f()V

    :cond_2
    sget-object v1, Lc0/G;->a:Lc0/G;

    invoke-static {v0}, Lc0/G;->d(I)V

    :cond_3
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, Lde/robv/android/xposed/b;

    invoke-static {v0, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v1, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-static {v2, v1}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/Number;

    if-eqz v2, :cond_4

    check-cast v1, Ljava/lang/Number;

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_9

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v0, v0, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v0, v5}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-static {v2, v0}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_5

    move-object v14, v0

    check-cast v14, Ljava/lang/Number;

    goto :goto_2

    :cond_5
    const/4 v14, 0x0

    :goto_2
    const/4 v0, 0x0

    if-eqz v14, :cond_6

    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    move-result v2

    goto :goto_3

    :cond_6
    move v2, v0

    :goto_3
    sget-boolean v3, Lc0/G;->g:Z

    if-eqz v3, :cond_7

    sget-object v3, Lc0/G;->c:Ld0/s;

    if-eqz v3, :cond_7

    int-to-float v4, v1

    add-float/2addr v4, v2

    invoke-virtual {v3, v4}, Ld0/s;->setScrollProgress(F)V

    :cond_7
    cmpg-float v0, v2, v0

    if-nez v0, :cond_9

    sget-object v0, Lc0/G;->c:Ld0/s;

    if-eqz v0, :cond_8

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ld0/s;->e(IZ)V

    :cond_8
    sget-object v0, Lc0/G;->a:Lc0/G;

    invoke-static {v1}, Lc0/G;->d(I)V

    :cond_9
    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sget-object v1, Lc0/G;->a:Lc0/G;

    sput-boolean v0, Lc0/G;->n:Z

    invoke-static {}, Lc0/G;->c()V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_2
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lc0/G;->a:Lc0/G;

    if-gez v0, :cond_a

    const/4 v1, 0x0

    goto :goto_4

    :cond_a
    move v1, v0

    :goto_4
    sput v1, Lc0/G;->m:I

    invoke-static {}, Lc0/G;->c()V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_3
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lc0/G;->a:Lc0/G;

    if-gez v0, :cond_b

    const/4 v1, 0x0

    goto :goto_5

    :cond_b
    move v1, v0

    :goto_5
    sput v1, Lc0/G;->l:I

    invoke-static {}, Lc0/G;->c()V

    sget-object v0, LD0/l;->a:LD0/l;

    return-object v0

    :pswitch_4
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    const-string v1, "it"

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x14

    invoke-static {v0, v1}, LW0/j;->Z0(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_5
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_d

    invoke-virtual {v0, v12}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_d

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_6

    :cond_c
    new-instance v0, Lb0/g;

    const-string v1, "\u65e0\u6587\u672c\u63a7\u4ef6"

    invoke-direct {v0, v1}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :cond_d
    :goto_6
    new-instance v0, Lb0/h;

    const-string v1, "\u6587\u672c\u63a7\u4ef6"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_7
    return-object v0

    :pswitch_6
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_f

    invoke-virtual {v0, v12}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_f

    invoke-virtual {v0, v15}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_f

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_8

    :cond_e
    new-instance v0, Lb0/g;

    invoke-direct {v0, v11}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_9

    :cond_f
    :goto_8
    new-instance v0, Lb0/h;

    const-string v1, "\u804a\u5929\u6587\u672c"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_9
    return-object v0

    :pswitch_7
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "MicroMsg.ContactInfoUI"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_11

    const-string v2, "com.tencent.mm.plugin.profile.ui.ContactInfoUI"

    invoke-virtual {v0, v2}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_11

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_a

    :cond_10
    new-instance v0, Lb0/g;

    const-string v1, "\u65e0 ContactInfoUI"

    invoke-direct {v0, v1}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_b

    :cond_11
    :goto_a
    new-instance v0, Lb0/h;

    const-string v1, "ContactInfoUI"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_b
    return-object v0

    :pswitch_8
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_13

    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_13

    invoke-virtual {v0, v14}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    goto :goto_c

    :cond_12
    new-instance v0, Lb0/g;

    const-string v1, "\u65e0\u951a\u70b9"

    invoke-direct {v0, v1}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_d

    :cond_13
    :goto_c
    new-instance v0, Lb0/h;

    const-string v1, "\u670b\u53cb\u5708/\u4e3b\u754c\u9762\u951a\u70b9"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_d
    return-object v0

    :pswitch_9
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "deleteComment"

    const-string v2, "MicroMsg.SnsInfoStorageLogic"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_18

    const-string v1, "commentUsername:%s, actionUsername:%s, removeComment:%s"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_f

    :cond_14
    const-string v1, "MicroMsg.SnsCommentStorage"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_17

    const-string v1, "set sns del"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_15

    goto :goto_e

    :cond_15
    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    new-instance v0, Lb0/i;

    const-string v1, "\u4ec5\u670b\u53cb\u5708\u5b58\u50a8\uff0c\u88c5\u8f7d\u65f6\u518d\u9a8c\u8bc1\u8bc4\u8bba\u70b9"

    invoke-direct {v0, v1}, Lb0/i;-><init>(Ljava/lang/String;)V

    goto :goto_10

    :cond_16
    new-instance v0, Lb0/g;

    const-string v1, "\u65e0\u8bc4\u8bba\u9632\u64a4\u951a\u70b9"

    invoke-direct {v0, v1}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_10

    :cond_17
    :goto_e
    new-instance v0, Lb0/h;

    const-string v1, "SnsComment \u7279\u5f81"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    goto :goto_10

    :cond_18
    :goto_f
    new-instance v0, Lb0/h;

    const-string v1, "deleteComment \u7279\u5f81"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_10
    return-object v0

    :pswitch_a
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1a

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    goto :goto_11

    :cond_19
    new-instance v0, Lb0/g;

    const-string v1, "\u65e0\u670b\u53cb\u5708\u5b58\u50a8\u7279\u5f81"

    invoke-direct {v0, v1}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_12

    :cond_1a
    :goto_11
    new-instance v0, Lb0/h;

    const-string v1, "SnsInfoStorage"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_12
    return-object v0

    :pswitch_b
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1c

    invoke-virtual {v0, v15}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1c

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_13

    :cond_1b
    new-instance v0, Lb0/g;

    invoke-direct {v0, v4}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_14

    :cond_1c
    :goto_13
    new-instance v0, Lb0/h;

    invoke-direct {v0, v3}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_14
    return-object v0

    :pswitch_c
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1e

    invoke-virtual {v0, v12}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1e

    invoke-virtual {v0, v15}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1e

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1d

    goto :goto_15

    :cond_1d
    new-instance v0, Lb0/g;

    invoke-direct {v0, v11}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_16

    :cond_1e
    :goto_15
    new-instance v0, Lb0/h;

    const-string v1, "\u804a\u5929\u533a"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_16
    return-object v0

    :pswitch_d
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_20

    invoke-virtual {v0, v15}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_20

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1f

    goto :goto_17

    :cond_1f
    const/4 v1, 0x0

    goto :goto_18

    :cond_20
    :goto_17
    const/4 v1, 0x1

    :goto_18
    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_22

    invoke-virtual {v0, v12}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_22

    const-string v2, "com.tencent.mm.view.x2c.X2CTextView"

    invoke-virtual {v0, v2}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_22

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_21

    goto :goto_19

    :cond_21
    const/4 v14, 0x0

    goto :goto_1a

    :cond_22
    :goto_19
    const/4 v14, 0x1

    :goto_1a
    if-eqz v1, :cond_23

    if-eqz v14, :cond_23

    new-instance v0, Lb0/h;

    const-string v1, "ChatFooter + \u6587\u672c"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    goto :goto_1c

    :cond_23
    if-nez v1, :cond_25

    if-eqz v14, :cond_24

    goto :goto_1b

    :cond_24
    new-instance v0, Lb0/g;

    invoke-direct {v0, v11}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_1c

    :cond_25
    :goto_1b
    new-instance v0, Lb0/i;

    const-string v1, "\u804a\u5929\u63a7\u4ef6\u4e0d\u5b8c\u6574"

    invoke-direct {v0, v1}, Lb0/i;-><init>(Ljava/lang/String;)V

    :goto_1c
    return-object v0

    :pswitch_e
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "doRevokeMsg xmlSrvMsgId="

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_29

    const-string v1, "doRevokeMsg xmlSrvMsgId=%d talker=%s isGet=%s"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_26

    goto :goto_1f

    :cond_26
    const-string v1, "iy0.u"

    iget-object v0, v0, Lb0/l;->a:Ljava/lang/ClassLoader;

    invoke-static {v0, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v1, v2, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1d

    :catchall_0
    move-exception v0

    move-object v1, v0

    invoke-static {v1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_1d
    instance-of v1, v0, LD0/f;

    if-eqz v1, :cond_27

    const/4 v14, 0x0

    goto :goto_1e

    :cond_27
    move-object v14, v0

    :goto_1e
    check-cast v14, Ljava/lang/Class;

    if-eqz v14, :cond_28

    new-instance v0, Lb0/i;

    const-string v1, "\u4ec5\u6df7\u6dc6\u515c\u5e95\u7c7b"

    invoke-direct {v0, v1}, Lb0/i;-><init>(Ljava/lang/String;)V

    goto :goto_20

    :cond_28
    new-instance v0, Lb0/g;

    const-string v1, "\u672a\u627e\u5230\u64a4\u56de\u5165\u53e3"

    invoke-direct {v0, v1}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_20

    :cond_29
    :goto_1f
    new-instance v0, Lb0/h;

    const-string v1, "doRevokeMsg \u7279\u5f81"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_20
    return-object v0

    :pswitch_f
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2b

    invoke-virtual {v0, v14}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2b

    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2a

    goto :goto_21

    :cond_2a
    new-instance v0, Lb0/g;

    invoke-direct {v0, v8}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_22

    :cond_2b
    :goto_21
    new-instance v0, Lb0/h;

    move-object/from16 v2, v18

    invoke-direct {v0, v2}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_22
    return-object v0

    :pswitch_10
    move-object/from16 v3, p1

    check-cast v3, Lb0/l;

    invoke-static {v3, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2d

    invoke-virtual {v3, v14}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2d

    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2c

    goto :goto_23

    :cond_2c
    const/4 v1, 0x0

    goto :goto_24

    :cond_2d
    :goto_23
    const/4 v1, 0x1

    :goto_24
    const-string v0, "MicroMsg.ConfigStorageLogic"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_30

    const-string v0, "iy0.z1"

    iget-object v4, v3, Lb0/l;->a:Ljava/lang/ClassLoader;

    invoke-static {v4, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    :try_start_1
    invoke-static {v0, v2, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_25

    :catchall_1
    move-exception v0

    move-object v4, v0

    invoke-static {v4}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_25
    instance-of v4, v0, LD0/f;

    if-eqz v4, :cond_2e

    const/4 v14, 0x0

    goto :goto_26

    :cond_2e
    move-object v14, v0

    :goto_26
    check-cast v14, Ljava/lang/Class;

    if-nez v14, :cond_30

    const-string v0, "get userinfo fail"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2f

    goto :goto_27

    :cond_2f
    move v14, v2

    goto :goto_28

    :cond_30
    :goto_27
    const/4 v14, 0x1

    :goto_28
    if-eqz v1, :cond_31

    if-eqz v14, :cond_31

    new-instance v0, Lb0/h;

    const-string v1, "LauncherUI + \u7528\u6237\u4fe1\u606f"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    goto :goto_29

    :cond_31
    if-eqz v1, :cond_32

    new-instance v0, Lb0/i;

    const-string v1, "\u6709\u4e3b\u754c\u9762\uff0c\u7528\u6237\u4fe1\u606f\u7279\u5f81\u5f31"

    invoke-direct {v0, v1}, Lb0/i;-><init>(Ljava/lang/String;)V

    goto :goto_29

    :cond_32
    new-instance v0, Lb0/g;

    const-string v1, "\u65e0\u4e3b\u754c\u9762"

    invoke-direct {v0, v1}, Lb0/g;-><init>(Ljava/lang/String;)V

    :goto_29
    return-object v0

    :pswitch_11
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_34

    invoke-virtual {v0, v15}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_34

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_33

    goto :goto_2a

    :cond_33
    new-instance v0, Lb0/g;

    invoke-direct {v0, v4}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_2b

    :cond_34
    :goto_2a
    new-instance v0, Lb0/h;

    invoke-direct {v0, v3}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_2b
    return-object v0

    :pswitch_12
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    move-object/from16 v1, v17

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb0/h;

    const-string v1, "\u901a\u7528 Bitmap \u8def\u5f84"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_13
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "updateMainTabUnread"

    const-string v2, "MicroMsg.LauncherUITabView"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_37

    const-string v1, "[updateFriendTabUnread]"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_37

    move-object/from16 v2, v19

    invoke-virtual {v0, v2}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_37

    invoke-virtual {v0, v14}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_35

    goto :goto_2c

    :cond_35
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_36

    new-instance v0, Lb0/i;

    const-string v1, "\u4ec5 LauncherUI \u7279\u5f81"

    invoke-direct {v0, v1}, Lb0/i;-><init>(Ljava/lang/String;)V

    goto :goto_2d

    :cond_36
    new-instance v0, Lb0/g;

    const-string v1, "\u65e0\u4e3b\u754c\u9762\u951a\u70b9"

    invoke-direct {v0, v1}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_2d

    :cond_37
    :goto_2c
    new-instance v0, Lb0/h;

    const-string v1, "\u4e3b\u754c\u9762"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_2d
    return-object v0

    :pswitch_14
    move-object/from16 v2, v19

    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "MicroMsg.LauncherUIBottomTabView"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3b

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3b

    const-string v1, "com.tencent.mm.ui.LauncherUIBottomTabView"

    invoke-virtual {v0, v1}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3b

    invoke-virtual {v0, v2}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_38

    goto :goto_2f

    :cond_38
    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3a

    invoke-virtual {v0, v14}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_39

    goto :goto_2e

    :cond_39
    new-instance v0, Lb0/g;

    const-string v1, "\u65e0\u5e95\u680f\u951a\u70b9"

    invoke-direct {v0, v1}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_30

    :cond_3a
    :goto_2e
    new-instance v0, Lb0/i;

    const-string v1, "\u4ec5 LauncherUI"

    invoke-direct {v0, v1}, Lb0/i;-><init>(Ljava/lang/String;)V

    goto :goto_30

    :cond_3b
    :goto_2f
    new-instance v0, Lb0/h;

    const-string v1, "\u5e95\u680f\u7c7b"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_30
    return-object v0

    :pswitch_15
    move-object/from16 v2, v18

    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3d

    invoke-virtual {v0, v14}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3d

    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3c

    goto :goto_31

    :cond_3c
    new-instance v0, Lb0/g;

    invoke-direct {v0, v8}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_32

    :cond_3d
    :goto_31
    new-instance v0, Lb0/h;

    invoke-direct {v0, v2}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_32
    return-object v0

    :pswitch_16
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "summerbig initDownloadAttach msgLocalId[%d], msgXml[%s], downloadPath[%s]"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3e

    const-string v1, "summerbig initDownloadAttach ret[%b], rowid[%d], field_totalLen[%d], type[%d], isLargeFile[%d], destFile[%s], msgLocalId[%s], stack[%s]"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3e

    new-instance v0, Lb0/h;

    const-string v1, "init/insert DownloadAttach \u7279\u5f81"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    goto :goto_34

    :cond_3e
    const-string v1, "summerbig initDownloadAttach"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_40

    const-string v1, "VFS.VFSStrategy"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3f

    goto :goto_33

    :cond_3f
    new-instance v0, Lb0/g;

    const-string v1, "\u65e0\u4e0b\u8f7d\u9644\u4ef6\u951a\u70b9"

    invoke-direct {v0, v1}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_34

    :cond_40
    :goto_33
    new-instance v0, Lb0/i;

    const-string v1, "\u4ec5\u90e8\u5206\u4e0b\u8f7d\u951a\u70b9"

    invoke-direct {v0, v1}, Lb0/i;-><init>(Ljava/lang/String;)V

    :goto_34
    return-object v0

    :pswitch_17
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_42

    invoke-virtual {v0, v14}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_42

    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_41

    goto :goto_35

    :cond_41
    new-instance v0, Lb0/h;

    const-string v1, "\u9009\u70b9\u6865\u63a5"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    goto :goto_36

    :cond_42
    :goto_35
    new-instance v0, Lb0/h;

    const-string v1, "\u4e3b\u754c\u9762 + \u9009\u70b9\u6865\u63a5"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_36
    return-object v0

    :pswitch_18
    const/4 v2, 0x0

    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI"

    const-string v3, "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI2"

    filled-new-array {v1, v3}, [Ljava/lang/String;

    move-result-object v1

    :goto_37
    const/4 v3, 0x2

    if-ge v2, v3, :cond_44

    aget-object v3, v1, v2

    invoke-virtual {v0, v3}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_43

    new-instance v0, Lb0/h;

    const-string v1, "\u767b\u5f55\u9875"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    goto :goto_38

    :cond_43
    const/4 v3, 0x1

    add-int/2addr v2, v3

    goto :goto_37

    :cond_44
    new-instance v0, Lb0/h;

    const-string v1, "\u767b\u5f55\u9875\uff08\u52a8\u6001\u89e3\u6790\uff09"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_38
    return-object v0

    :pswitch_19
    move-object/from16 v1, v17

    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb0/h;

    const-string v1, "\u7cfb\u7edf\u5b9a\u4f4d\u63a5\u53e3"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_1a
    move-object/from16 v2, v18

    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->c([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_46

    invoke-virtual {v0, v14}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_46

    filled-new-array/range {v16 .. v16}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_45

    goto :goto_39

    :cond_45
    new-instance v0, Lb0/g;

    invoke-direct {v0, v8}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_3a

    :cond_46
    :goto_39
    new-instance v0, Lb0/h;

    invoke-direct {v0, v2}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_3a
    return-object v0

    :pswitch_1b
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "com.tencent.tinker.loader.shareutil.ShareTinkerInternals"

    invoke-virtual {v0, v1}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_48

    const-string v1, "Tinker.TinkerInternals"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb0/l;->a([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_47

    goto :goto_3b

    :cond_47
    new-instance v0, Lb0/h;

    const-string v1, "\u70ed\u66f4\u65b0\u62e6\u622a\uff08\u901a\u7528\u8def\u5f84\uff09"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    goto :goto_3c

    :cond_48
    :goto_3b
    new-instance v0, Lb0/h;

    const-string v1, "Tinker"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    :goto_3c
    return-object v0

    :pswitch_1c
    move-object/from16 v0, p1

    check-cast v0, Lb0/l;

    invoke-static {v0, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo"

    invoke-virtual {v0, v1}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "com.tencent.mm.plugin.setting.ui.setting_new.MainSettingsUI"

    if-eqz v1, :cond_49

    invoke-virtual {v0, v2}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_49

    new-instance v0, Lb0/h;

    const-string v1, "MainSettingsUI + PersonalInfo"

    invoke-direct {v0, v1}, Lb0/h;-><init>(Ljava/lang/String;)V

    goto :goto_3e

    :cond_49
    invoke-virtual {v0, v2}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4b

    const-string v1, "com.tencent.mm.plugin.setting.ui.setting.SettingsUI"

    invoke-virtual {v0, v1}, Lb0/l;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4a

    goto :goto_3d

    :cond_4a
    new-instance v0, Lb0/g;

    const-string v1, "\u672a\u627e\u5230\u8bbe\u7f6e\u9875\u7c7b"

    invoke-direct {v0, v1}, Lb0/g;-><init>(Ljava/lang/String;)V

    goto :goto_3e

    :cond_4b
    :goto_3d
    new-instance v0, Lb0/i;

    const-string v1, "\u4ec5\u90e8\u5206\u8bbe\u7f6e\u9875\u7c7b"

    invoke-direct {v0, v1}, Lb0/i;-><init>(Ljava/lang/String;)V

    :goto_3e
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
