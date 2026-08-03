.class public final Laa;
.super LOz;
.source ""

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public e:[B

.field public f:Ljava/io/File;

.field public g:I

.field public final synthetic h:Lqe;

.field public final synthetic i:LDA;

.field public final synthetic j:Landroid/view/View;

.field public final synthetic k:LBA;

.field public final synthetic l:Lca;


# direct methods
.method public constructor <init>(Lca;LEb;Lqe;LBA;LDA;Landroid/view/View;)V
    .locals 0

    iput-object p3, p0, Laa;->h:Lqe;

    iput-object p5, p0, Laa;->i:LDA;

    iput-object p6, p0, Laa;->j:Landroid/view/View;

    iput-object p4, p0, Laa;->k:LBA;

    iput-object p1, p0, Laa;->l:Lca;

    invoke-direct {p0, p2}, LOz;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfc;

    check-cast p2, LEb;

    invoke-virtual {p0, p2, p1}, Laa;->h(LEb;Ljava/lang/Object;)LEb;

    move-result-object p1

    check-cast p1, Laa;

    sget-object p2, LTC;->a:LTC;

    invoke-virtual {p1, p2}, Laa;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(LEb;Ljava/lang/Object;)LEb;
    .locals 7

    new-instance v0, Laa;

    iget-object v4, p0, Laa;->k:LBA;

    iget-object v1, p0, Laa;->l:Lca;

    iget-object v3, p0, Laa;->h:Lqe;

    iget-object v5, p0, Laa;->i:LDA;

    iget-object v6, p0, Laa;->j:Landroid/view/View;

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Laa;-><init>(Lca;LEb;Lqe;LBA;LDA;Landroid/view/View;)V

    return-object v0
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v6, p0

    iget-object v7, v6, Laa;->i:LDA;

    iget-object v8, v7, LDA;->a:Ljava/lang/String;

    iget v0, v6, Laa;->g:I

    const/4 v9, 0x0

    const/4 v10, 0x1

    sget-object v11, LTC;->a:LTC;

    iget-object v12, v6, Laa;->j:Landroid/view/View;

    iget-object v13, v6, Laa;->h:Lqe;

    const/4 v14, 0x0

    sget-object v15, Lgc;->a:Lgc;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v1, -0x5ea3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    :try_start_0
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object v10, v6

    goto/16 :goto_19

    :catch_0
    move-exception v0

    move-object v4, v0

    move-object v10, v6

    :goto_1
    move-object v3, v12

    move-object v2, v13

    :goto_2
    move-object v5, v14

    goto/16 :goto_17

    :pswitch_2
    iget-object v0, v6, Laa;->f:Ljava/io/File;

    :try_start_1
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v10, v6

    goto/16 :goto_a

    :pswitch_3
    iget-object v0, v6, Laa;->e:[B

    :try_start_2
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    move-object v10, v6

    goto/16 :goto_9

    :pswitch_4
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object v10, v6

    goto/16 :goto_7

    :pswitch_5
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v11

    :pswitch_6
    iget-object v0, v6, Laa;->e:[B

    check-cast v0, Ljava/lang/String;

    :try_start_3
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-object v11

    :catch_1
    move-exception v0

    move-object v4, v0

    move-object v10, v6

    move-object v3, v12

    move-object v2, v13

    :goto_3
    move-object v5, v14

    goto/16 :goto_15

    :pswitch_7
    :try_start_4
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-object/from16 v0, p1

    goto :goto_4

    :pswitch_8
    invoke-static/range {p1 .. p1}, LOj;->T(Ljava/lang/Object;)V

    :try_start_5
    sget-object v0, Lm0;->a:Lm0;

    invoke-virtual {v13}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-wide v2, -0x5eccfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v2, LEA;->a:LEA;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, LEA;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, Lm0;->c(Landroid/content/Context;Ljava/lang/String;)Ll0;

    move-result-object v0

    sget-object v1, LNs;->a:LNs;

    iget-object v2, v0, Ll0;->a:Ljava/lang/String;

    iget-object v0, v0, Ll0;->c:Ljava/lang/String;

    iput v10, v6, Laa;->g:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v2, v0, v6}, LNs;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LOz;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v15, :cond_0

    move-object v10, v6

    goto/16 :goto_18

    :cond_0
    :goto_4
    check-cast v0, Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_10

    :try_start_6
    sget-object v1, Lzm;->a:LAm;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lio/github/cherrywechat/network/model/ApiResponse;->Companion:Lio/github/cherrywechat/network/model/ApiResponse$Companion;

    sget-object v3, Lio/github/cherrywechat/network/model/DownloadTokenData;->Companion:Lio/github/cherrywechat/network/model/DownloadTokenData$Companion;

    invoke-virtual {v3}, Lio/github/cherrywechat/network/model/DownloadTokenData$Companion;->serializer()LQm;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/github/cherrywechat/network/model/ApiResponse$Companion;->serializer(LQm;)LQm;

    move-result-object v2

    check-cast v2, LQm;

    invoke-virtual {v1, v2, v0}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_5

    :catch_2
    move-exception v0

    const-wide v1, -0x5edcfffff835L

    :try_start_7
    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-class v1, Lio/github/cherrywechat/network/model/ApiResponse;

    invoke-static {v1}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v1

    invoke-virtual {v1}, LF9;->b()Ljava/lang/String;

    const-wide v1, -0x5ef7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-object v0, v14

    :goto_5
    check-cast v0, Lio/github/cherrywechat/network/model/ApiResponse;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_e

    if-eqz v0, :cond_1

    :try_start_8
    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getCode()I

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    move-object v10, v6

    move-object v3, v13

    goto/16 :goto_f

    :cond_2
    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/cherrywechat/network/model/DownloadTokenData;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_9

    if-eqz v0, :cond_3

    :try_start_9
    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/DownloadTokenData;->getToken()Ljava/lang/String;

    move-result-object v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    move-object v2, v0

    goto :goto_6

    :cond_3
    move-object v2, v14

    :goto_6
    if-eqz v2, :cond_4

    :try_start_a
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9

    if-nez v0, :cond_5

    :cond_4
    move-object v10, v6

    move-object v3, v13

    goto/16 :goto_e

    :cond_5
    :try_start_b
    sget-object v0, LNs;->a:LNs;

    sget-object v1, LEA;->a:LEA;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_7

    :try_start_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, LEA;->c:Ljava/lang/String;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_8

    :try_start_d
    iget-wide v3, v7, LDA;->e:J

    new-instance v5, LV9;

    invoke-direct {v5, v13, v9}, LV9;-><init>(Lqe;I)V

    const/4 v10, 0x5

    iput v10, v6, Laa;->g:I

    invoke-virtual/range {v0 .. v6}, LNs;->b(Ljava/lang/String;Ljava/lang/String;JLfj;LFb;)Ljava/lang/Object;

    move-result-object v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7

    move-object v10, v6

    if-ne v0, v15, :cond_6

    goto/16 :goto_18

    :cond_6
    :goto_7
    :try_start_e
    check-cast v0, [B

    new-instance v1, Ljava/io/File;

    sget-object v2, LEA;->a:LEA;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_5

    :try_start_f
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, LEA;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_6

    :try_start_10
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_5

    if-nez v2, :cond_8

    :try_start_11
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_8

    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-wide v1, -0x5e80fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_3

    :catch_3
    move-exception v0

    move-object v4, v0

    goto/16 :goto_1

    :cond_8
    :goto_8
    :try_start_12
    sget-object v1, Lhe;->a:Lhd;

    sget-object v1, LZp;->a:Lnk;
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_6

    :try_start_13
    new-instance v2, LW9;

    invoke-direct {v2, v13, v14, v9}, LW9;-><init>(Lqe;LEb;I)V

    iput-object v0, v10, Laa;->e:[B

    const/4 v3, 0x6

    iput v3, v10, Laa;->g:I

    invoke-static {v1, v2, v10}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v15, :cond_9

    goto/16 :goto_18

    :cond_9
    :goto_9
    new-instance v1, Ljava/io/File;

    sget-object v2, LEA;->a:LEA;
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_5

    :try_start_14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, LEA;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_6

    :try_start_15
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_5

    :try_start_16
    invoke-virtual {v2, v0}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    :try_start_17
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_5

    :try_start_18
    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_6

    :try_start_19
    new-instance v2, LW9;

    const/4 v3, 0x1

    invoke-direct {v2, v13, v14, v3}, LW9;-><init>(Lqe;LEb;I)V

    iput-object v14, v10, Laa;->e:[B

    iput-object v1, v10, Laa;->f:Ljava/io/File;

    const/4 v3, 0x7

    iput v3, v10, Laa;->g:I

    invoke-static {v0, v2, v10}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v15, :cond_a

    goto/16 :goto_18

    :cond_a
    move-object v0, v1

    :goto_a
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x5e89fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v0}, Lio/github/cherrywechat/theme/ThemeProvider;->extractThemeFiles(Ljava/lang/String;)Z

    move-result v0
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_5

    if-nez v0, :cond_b

    :try_start_1a
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide v1, -0x5e9efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_3

    :cond_b
    :try_start_1b
    sget-object v0, Lhe;->a:Lhd;

    sget-object v8, LZp;->a:Lnk;
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_6

    :try_start_1c
    new-instance v0, LX9;

    iget-object v6, v10, Laa;->j:Landroid/view/View;

    iget-object v4, v10, Laa;->k:LBA;

    iget-object v1, v10, Laa;->l:Lca;
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_5

    const/4 v2, 0x0

    move-object v5, v7

    move-object v3, v13

    :try_start_1d
    invoke-direct/range {v0 .. v6}, LX9;-><init>(Lca;LEb;Lqe;LBA;LDA;Landroid/view/View;)V

    iput-object v14, v10, Laa;->e:[B

    iput-object v14, v10, Laa;->f:Ljava/io/File;

    const/16 v1, 0x8

    iput v1, v10, Laa;->g:I

    invoke-static {v8, v0, v10}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_4

    if-ne v0, v15, :cond_f

    goto/16 :goto_18

    :catch_4
    move-exception v0

    :goto_b
    move-object v4, v0

    move-object v2, v3

    move-object v3, v12

    goto/16 :goto_2

    :catch_5
    move-exception v0

    :goto_c
    move-object v3, v13

    goto :goto_b

    :catch_6
    move-exception v0

    goto :goto_c

    :catchall_0
    move-exception v0

    move-object v3, v13

    move-object v1, v0

    :try_start_1e
    throw v1
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_1f
    invoke-static {v2, v1}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_4

    :catch_7
    move-exception v0

    move-object v10, v6

    goto :goto_c

    :catch_8
    move-exception v0

    move-object v10, v6

    goto :goto_c

    :catch_9
    move-exception v0

    move-object v10, v6

    move-object v3, v13

    :goto_d
    move-object v4, v0

    move-object v2, v3

    move-object v3, v12

    goto/16 :goto_3

    :goto_e
    :try_start_20
    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    new-instance v1, LX4;

    const/4 v2, 0x1

    invoke-direct {v1, v3, v12, v14, v2}, LX4;-><init>(Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    iput-object v14, v10, Laa;->e:[B

    const/4 v2, 0x3

    iput v2, v10, Laa;->g:I

    invoke-static {v0, v1, v10}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v15, :cond_f

    goto/16 :goto_18

    :catch_a
    move-exception v0

    goto :goto_d

    :goto_f
    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_c

    invoke-virtual {v0}, Lio/github/cherrywechat/network/model/ApiResponse;->getMsg()Ljava/lang/String;

    move-result-object v1
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_a

    :cond_c
    if-nez v1, :cond_d

    goto :goto_11

    :cond_d
    :goto_10
    move-object v4, v1

    goto :goto_12

    :cond_e
    :goto_11
    const-wide v0, -0x5efbfffff835L

    :try_start_21
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_c

    goto :goto_10

    :goto_12
    :try_start_22
    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_d

    :try_start_23
    new-instance v1, LZ9;
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_c

    const/4 v6, 0x0

    move-object v2, v3

    move-object v3, v12

    move-object v5, v14

    :try_start_24
    invoke-direct/range {v1 .. v6}, LZ9;-><init>(Lqe;Landroid/view/View;Ljava/lang/String;LEb;I)V

    iput-object v5, v10, Laa;->e:[B

    const/4 v4, 0x2

    iput v4, v10, Laa;->g:I

    invoke-static {v0, v1, v10}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_b

    if-ne v0, v15, :cond_f

    goto :goto_18

    :catch_b
    move-exception v0

    :goto_13
    move-object v4, v0

    goto :goto_15

    :catch_c
    move-exception v0

    move-object v2, v3

    move-object v3, v12

    :goto_14
    move-object v5, v14

    goto :goto_13

    :catch_d
    move-exception v0

    move-object v2, v3

    move-object v3, v12

    goto :goto_14

    :catch_e
    move-exception v0

    move-object v10, v6

    move-object v3, v12

    move-object v2, v13

    goto :goto_14

    :goto_15
    :try_start_25
    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    new-instance v1, LY9;

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v6}, LY9;-><init>(Lqe;Landroid/view/View;Ljava/lang/Exception;LEb;I)V

    iput-object v5, v10, Laa;->e:[B

    const/4 v4, 0x4

    iput v4, v10, Laa;->g:I

    invoke-static {v0, v1, v10}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_f

    if-ne v0, v15, :cond_f

    goto :goto_18

    :catch_f
    move-exception v0

    :goto_16
    move-object v4, v0

    goto :goto_17

    :catch_10
    move-exception v0

    move-object v10, v6

    move-object v3, v12

    move-object v2, v13

    move-object v5, v14

    goto :goto_16

    :goto_17
    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v0, Lhe;->a:Lhd;

    sget-object v0, LZp;->a:Lnk;

    new-instance v1, LY9;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, LY9;-><init>(Lqe;Landroid/view/View;Ljava/lang/Exception;LEb;I)V

    iput-object v5, v10, Laa;->e:[B

    iput-object v5, v10, Laa;->f:Ljava/io/File;

    const/16 v2, 0x9

    iput v2, v10, Laa;->g:I

    invoke-static {v0, v1, v10}, LNj;->N(Lbc;Lkotlin/jvm/functions/Function2;LEb;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v15, :cond_f

    :goto_18
    return-object v15

    :cond_f
    :goto_19
    return-object v11

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
