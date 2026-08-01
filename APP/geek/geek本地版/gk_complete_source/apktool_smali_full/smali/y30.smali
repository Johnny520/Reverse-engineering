.class public final Ly30;
.super Lm50;

# interfaces
.implements Lwm;


# instance fields
.field public e:I

.field public f:Ljava/util/Iterator;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/Object;

.field public i:J

.field public j:I

.field public final k:Li00;

.field public final l:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Li00;Ljava/lang/ClassLoader;Lld;)V
    .locals 3

    iput-object p1, p0, Ly30;->k:Li00;

    iput-object p2, p0, Ly30;->l:Ljava/lang/ClassLoader;

    invoke-direct {p0, p3}, Lm50;-><init>(Lld;)V

    const/4 v1, 0x0

    const-string v0, "\u06e8\u06e4\u06e5"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "Vh"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۠ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    const-string v0, "\u06e2\u06e6\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    move-result v0

    if-ltz v0, :cond_1

    sget v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    rem-int/lit16 v2, v2, -0x25ac

    mul-int/2addr v0, v2

    if-ltz v0, :cond_0

    const/16 v0, 0x41

    sput v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    const-string v0, "\u06e0\u06e8\u06e2"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    add-int/2addr v0, v2

    const v2, 0xdce7

    add-int/2addr v0, v2

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    if-ltz v0, :cond_2

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    const-string v0, "\u06e3\u06e0\u06df"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sub-int/2addr v0, v2

    const v2, -0x1ab8aa

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v0, "\u06e4\u06e0\u06e1"

    goto :goto_1

    :sswitch_4
    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    rem-int/2addr v0, v2

    const v2, -0x1acbfb

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc5c -> :sswitch_0
        0x1aabda -> :sswitch_4
        0x1ab31e -> :sswitch_3
        0x1ab9e5 -> :sswitch_5
        0x1abd8c -> :sswitch_2
        0x1ac969 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lld;)Lld;
    .locals 3

    const-string v0, "\u06e1\u06e2\u06e0"

    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Ly30;

    iget-object v1, p0, Ly30;->k:Li00;

    iget-object v2, p0, Ly30;->l:Ljava/lang/ClassLoader;

    invoke-direct {v0, v1, v2, p1}, Ly30;-><init>(Li00;Ljava/lang/ClassLoader;Lld;)V

    return-object v0

    :sswitch_1
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v0, :cond_0

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    const-string v0, "\u06e2\u06e7\u06e4"

    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    xor-int/2addr v0, v1

    const v1, 0x1aafe9

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aaedf -> :sswitch_0
        0x1ab624 -> :sswitch_1
    .end sparse-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "\u06e7\u06e7\u06e8"

    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v1, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    xor-int/2addr v0, v1

    const v1, 0x1ac964

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    move-object v0, p1

    check-cast v0, Loe;

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    :cond_0
    const-string v0, "\u06e2\u06e4\u06e6"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    check-cast p2, Lld;

    invoke-virtual {p0, p2}, Ly30;->a(Lld;)Lld;

    move-result-object v0

    check-cast v0, Ly30;

    sget-object v1, Lvh;->n:Lvh;

    invoke-virtual {v0, v1}, Ly30;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1aaf02 -> :sswitch_0
        0x1ab2e4 -> :sswitch_2
        0x1ac608 -> :sswitch_1
    .end sparse-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object/from16 v0, p0

    iget v2, v0, Ly30;->j:I

    move-object/from16 v0, p0

    iget-object v11, v0, Ly30;->l:Ljava/lang/ClassLoader;

    if-eqz v2, :cond_3

    if-ne v2, v4, :cond_2

    move-object/from16 v0, p0

    iget-wide v8, v0, Ly30;->i:J

    move-object/from16 v0, p0

    iget v4, v0, Ly30;->e:I

    move-object/from16 v0, p0

    iget-object v2, v0, Ly30;->h:Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v5, v0, Ly30;->g:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v3, v0, Ly30;->f:Ljava/util/Iterator;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lct;->y(Ljava/lang/Object;)V

    move-object v7, v5

    :goto_0
    sget-object v5, Luv;->a:Landroid/os/Handler;

    invoke-static {v2}, Lip;->l(Ljava/lang/Object;)V

    invoke-static {v11, v2}, Luv;->d(Ljava/lang/ClassLoader;Ljava/lang/Object;)V

    const-string v2, "zDTyeNPI0w72MeQ=\n"

    const-string v5, "n1qBOaa8vEI=\n"

    invoke-static {v2, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u2764\ufe0f \u53d1\u5305\u6210\u529f -> "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " (SnsId: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, ")"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "xwGO\n"

    const-string v7, "s2Dpd1+FjZU=\n"

    invoke-static {v6, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "53vj\n"

    const-string v6, "igiEy7e+YPk=\n"

    invoke-static {v2, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    add-int/lit8 v2, v4, 0x10

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, -0x10

    :try_start_1
    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v4}, Ljava/lang/Integer;-><init>(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move v4, v2

    move-object v5, v3

    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    const-string v2, "laav7JxaepTS\n"

    const-string v3, "+8PXmLR0VLo=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v6}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_2
    sget-object v2, Lpb0;->s1:Ljava/lang/String;

    invoke-static {v6, v2}, Lde/robv/android/xposed/XposedHelpers;->getLongField(Ljava/lang/Object;Ljava/lang/String;)J

    move-result-wide v8

    const-string v2, "NhLAJ4g/I1s=\n"

    const-string v3, "Y2GlVeZeTj4=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_4

    check-cast v2, Ljava/lang/String;

    move-object v7, v2

    :goto_2
    if-eqz v7, :cond_0

    sget-object v12, Lt6;->a:Ljava/lang/String;

    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Lgn;->a:Lgn;

    const-string v3, "QENyXI2niidHT2BmoauVGUhNZ2qNvQ==\n"

    const-string v13, "KyYLA/7J+Xg=\n"

    invoke-static {v3, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, ""

    invoke-static {v3, v2}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-result-object v2

    const/4 v3, 0x1

    :try_start_3
    new-array v3, v3, [Ljava/lang/String;

    const/4 v13, 0x0

    const-string v14, "LA==\n"

    const-string v15, "AImwIJJ0btg=\n"

    invoke-static {v14, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    aput-object v14, v3, v13

    invoke-static {v2, v3}, Lb50;->M(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_1
    :goto_3
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v0, v3

    check-cast v0, Ljava/lang/String;

    move-object v2, v0

    invoke-static {v2}, Lb50;->H(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v6

    move v2, v4

    move-object v3, v5

    :goto_4
    const-string v4, "z8PF//u0Hiv1xtPhzbIQFPQ=\n"

    const-string v5, "nK22vo7AcWc=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "\u6267\u884c\u5f02\u5e38: "

    invoke-static {v6}, Lip;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "xwGO\n"

    const-string v7, "s2Dpd1+FjZU=\n"

    const-string v8, "53vj\n"

    const-string v9, "igiEy7e+YPk=\n"

    invoke-static {v6, v7, v4, v8, v9}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    move v4, v2

    move-object v5, v3

    goto/16 :goto_1

    :cond_2
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Cuo8TztaxypO+TVQbkPNLUnpNUV0XM0qTuI+VXRFzS1J/DlXcw7LZRvkJVdyQM0=\n"

    const-string v4, "aYtQIxsuqAo=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-static/range {p1 .. p1}, Lct;->y(Ljava/lang/Object;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Ly30;->k:Li00;

    iget-object v2, v2, Li00;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-string v4, "LPPU3X19SHZtqZ+BNQ==\n"

    const-string v5, "RYexrxwJJwQ=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    move v4, v3

    move-object v5, v2

    goto/16 :goto_1

    :cond_4
    move-object v7, v10

    goto/16 :goto_2

    :cond_5
    :try_start_4
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result v2

    if-nez v2, :cond_0

    :try_start_5
    const-string v2, "hV4MptK20tiFXhS3\n"

    const-string v3, "yTdnw4fFt6o=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/util/LinkedList;

    if-eqz v3, :cond_7

    check-cast v2, Ljava/util/LinkedList;

    :goto_5
    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const-string v2, "iCIbWonN1pvJeFAGwQ==\n"

    const-string v6, "4VZ+KOi5uek=\n"

    invoke-static {v2, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    sget-object v6, Lpb0;->x1:Ljava/lang/String;

    invoke-static {v2, v6}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v6, v2, Ljava/lang/String;

    if-eqz v6, :cond_8

    check-cast v2, Ljava/lang/String;

    :goto_6
    invoke-static {v2, v12}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result v2

    if-eqz v2, :cond_6

    goto/16 :goto_1

    :cond_7
    move-object v2, v10

    goto :goto_5

    :cond_8
    move-object v2, v10

    goto :goto_6

    :catchall_1
    move-exception v2

    :try_start_6
    const-string v2, "Wair/tZP2Rpjrb3g4FPTNWGKsczX\n"

    const-string v3, "CsbYv6M7tlY=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Nwje\n"

    const-string v6, "Q2m5jaPP2Zc=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "Fg==\n"

    const-string v3, "c8HJlSTQVfc=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :cond_9
    sget-object v2, Lpb0;->f1:Ljava/lang/String;

    invoke-static {v2, v11}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "6w==\n"

    const-string v6, "j+C4NN4jKsc=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v12}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "tA==\n"

    const-string v6, "0ZbDOTdlRlI=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v7}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v3, Lpb0;->w1:Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const/4 v6, 0x1

    :try_start_7
    invoke-static {v2, v3, v6}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    const-string v3, "qw==\n"

    const-string v6, "xaiFo6vYnks=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    move-result-object v3

    const/4 v6, 0x0

    :try_start_9
    invoke-static {v2, v3, v6}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :goto_7
    :try_start_a
    sget-object v3, Lpb0;->v1:Ljava/lang/String;

    invoke-static {v3, v11}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    const-string v6, "+A==\n"

    const-string v12, "nL5P9sLJlBE=\n"

    invoke-static {v6, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6, v8, v9}, Lde/robv/android/xposed/XposedHelpers;->setLongField(Ljava/lang/Object;Ljava/lang/String;J)V

    const-string v6, "JA==\n"

    const-string v12, "QsQrb15FgDE=\n"

    invoke-static {v6, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6, v2}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v2, Lpb0;->u1:Ljava/lang/String;

    invoke-static {v2, v11}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v6

    sget-object v2, Lpb0;->y1:Lsm;

    invoke-static {v3}, Lip;->l(Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Lsm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    array-length v3, v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6, v2}, Lde/robv/android/xposed/XposedHelpers;->newInstance(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    new-instance v2, Lhp;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    const/16 v3, 0x5dc

    const/16 v12, 0xdac

    const/4 v13, 0x1

    :try_start_b
    invoke-direct {v2, v3, v12, v13}, Lhp;-><init>(III)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :try_start_c
    sget-object v3, Laz;->a:Lm;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :try_start_d
    invoke-static {v2}, Lct;->u(Lhp;)I
    :try_end_d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    move-result v2

    int-to-long v2, v2

    :try_start_e
    move-object/from16 v0, p0

    iput-object v5, v0, Ly30;->f:Ljava/util/Iterator;

    move-object/from16 v0, p0

    iput-object v7, v0, Ly30;->g:Ljava/lang/String;

    move-object/from16 v0, p0

    iput-object v6, v0, Ly30;->h:Ljava/lang/Object;

    move-object/from16 v0, p0

    iput v4, v0, Ly30;->e:I

    move-object/from16 v0, p0

    iput-wide v8, v0, Ly30;->i:J
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    const/4 v12, 0x1

    :try_start_f
    move-object/from16 v0, p0

    iput v12, v0, Ly30;->j:I

    move-object/from16 v0, p0

    invoke-static {v2, v3, v0}, Lff;->n(JLm50;)Ljava/lang/Object;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    move-result-object v3

    sget-object v2, Lpe;->a:Lpe;

    if-ne v3, v2, :cond_c

    :goto_8
    return-object v2

    :catchall_2
    move-exception v4

    move-object v6, v4

    goto/16 :goto_4

    :catch_0
    move-exception v2

    :try_start_10
    new-instance v3, Ljava/util/NoSuchElementException;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    :catchall_3
    move-exception v6

    move-object v3, v5

    move v2, v4

    goto/16 :goto_4

    :cond_a
    if-lez v4, :cond_b

    const-string v2, "CWAjBsJiCcQzZTU=\n"

    const-string v3, "Wg5QR7cWZog=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "\u2705 \u672c\u6b21\u5171\u81ea\u52a8\u70b9\u8d5e "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " \u6761\u3002"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "xwGO\n"

    const-string v5, "s2Dpd1+FjZU=\n"

    const-string v6, "53vj\n"

    const-string v7, "igiEy7e+YPk=\n"

    invoke-static {v4, v5, v2, v6, v7}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_b
    sget-object v2, Lvh;->n:Lvh;

    goto :goto_8

    :catchall_4
    move-exception v3

    goto/16 :goto_7

    :catchall_5
    move-exception v3

    goto/16 :goto_7

    :catchall_6
    move-exception v6

    move v2, v4

    goto/16 :goto_4

    :cond_c
    move-object v2, v6

    move-object v3, v5

    goto/16 :goto_0
.end method
