.class public final Lf40;
.super Lt50;

# interfaces
.implements Lym;


# instance fields
.field public e:I

.field public f:Ljava/util/Iterator;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/Object;

.field public i:J

.field public j:I

.field public final k:Lp00;

.field public final l:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Lp00;Ljava/lang/ClassLoader;Lvd;)V
    .locals 3

    iput-object p1, p0, Lf40;->k:Lp00;

    iput-object p2, p0, Lf40;->l:Ljava/lang/ClassLoader;

    invoke-direct {p0, p3}, Lt50;-><init>(Lvd;)V

    const/4 v1, 0x0

    const-string v0, "\u06e1\u06e0\u06e2"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    if-ltz v0, :cond_5

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v0, "\u06df\u06e3\u06e6"

    invoke-static {v0}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v0, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v0, :cond_1

    const/16 v0, 0x32

    sput v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    const-string v0, "\u06e3\u06e5\u06e5"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sub-int/2addr v0, v2

    const v2, 0x1abb29

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(F)V

    sget v0, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    if-ltz v0, :cond_2

    const/16 v0, 0x10

    sput v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    const-string v0, "\u06e7\u06e4\u06e5"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    mul-int/2addr v0, v2

    const v2, -0x1b563e

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_3
    const-string v0, "qpHLnm9ZxTr9AyuOiTTS2HfW"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۣۢۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    move-result v0

    if-ltz v0, :cond_3

    const/16 v0, 0x2f

    sput v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v0, "\u06e0\u06e0\u06e7"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e7\u06e4\u06e5"

    goto :goto_1

    :sswitch_4
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-result v0

    if-ltz v0, :cond_4

    const/16 v0, 0x52

    sput v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    const-string v0, "\u06e7\u06e6\u06e6"

    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    div-int/2addr v0, v2

    const v2, 0x1ac16a

    add-int/2addr v0, v2

    goto/16 :goto_0

    :cond_5
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    add-int/2addr v0, v2

    const v2, 0x1aaf28

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaae7 -> :sswitch_0
        0x1aaea3 -> :sswitch_4
        0x1abe08 -> :sswitch_5
        0x1ac16b -> :sswitch_3
        0x1ac5a8 -> :sswitch_2
        0x1ac5e7 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lvd;)Lvd;
    .locals 3

    const-string v0, "\u06e5\u06e7\u06e7"

    invoke-static {v0}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v1, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    add-int/2addr v0, v1

    const v1, 0x1abfdc

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    new-instance v0, Lf40;

    iget-object v1, p0, Lf40;->k:Lp00;

    iget-object v2, p0, Lf40;->l:Ljava/lang/ClassLoader;

    invoke-direct {v0, v1, v2, p1}, Lf40;-><init>(Lp00;Ljava/lang/ClassLoader;Lvd;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1ab245 -> :sswitch_0
        0x1abe85 -> :sswitch_1
    .end sparse-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "\u06e3\u06e8\u06df"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    add-int/lit16 v1, v1, 0x22a9

    or-int/2addr v0, v1

    if-gtz v0, :cond_0

    const/16 v0, 0x28

    sput v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    const-string v0, "\u06e7\u06e1\u06e1"

    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    move-object v0, p1

    check-cast v0, Lpe;

    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v1, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    xor-int/2addr v0, v1

    const v1, 0x1ac25f

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v1, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    or-int/2addr v0, v1

    const v1, 0x1ab79d

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    check-cast p2, Lvd;

    invoke-virtual {p0, p2}, Lf40;->a(Lvd;)Lvd;

    move-result-object v0

    check-cast v0, Lf40;

    sget-object v1, Lxh;->n:Lxh;

    invoke-virtual {v0, v1}, Lf40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1aab04 -> :sswitch_0
        0x1ab71a -> :sswitch_1
        0x1ac1ca -> :sswitch_2
    .end sparse-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object/from16 v0, p0

    iget v2, v0, Lf40;->j:I

    move-object/from16 v0, p0

    iget-object v11, v0, Lf40;->l:Ljava/lang/ClassLoader;

    if-eqz v2, :cond_3

    if-ne v2, v4, :cond_2

    move-object/from16 v0, p0

    iget-wide v8, v0, Lf40;->i:J

    move-object/from16 v0, p0

    iget v4, v0, Lf40;->e:I

    move-object/from16 v0, p0

    iget-object v2, v0, Lf40;->h:Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v6, v0, Lf40;->g:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v5, v0, Lf40;->f:Ljava/util/Iterator;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-object v7, v6

    move-object v3, v5

    :goto_0
    :try_start_1
    sget-object v5, Lbw;->a:Landroid/os/Handler;

    invoke-static {v2}, Lmp;->d(Ljava/lang/Object;)V

    invoke-static {v11, v2}, Lbw;->d(Ljava/lang/ClassLoader;Ljava/lang/Object;)Z

    const-string v2, "uLjkisWee3SCvfI=\n"

    const-string v5, "69aXy7DqFDg=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v6, "ioxU\n"

    const-string v7, "/u0zZ+lqY9I=\n"

    invoke-static {v6, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "KFnE\n"

    const-string v6, "RSqjPIOV6WI=\n"

    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    rsub-int/lit8 v2, v4, 0x0

    add-int/lit8 v2, v2, -0x1

    rsub-int/lit8 v2, v2, 0x0

    :try_start_2
    new-instance v5, Ljava/lang/Integer;

    invoke-direct {v5, v4}, Ljava/lang/Integer;-><init>(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move v4, v2

    move-object v5, v3

    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    const-string v2, "B61Qsx3crBlA\n"

    const-string v3, "acgoxzXygjc=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v6}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_3
    sget-object v2, Lub0;->s1:Ljava/lang/String;

    invoke-static {v6, v2}, Lde/robv/android/xposed/XposedHelpers;->getLongField(Ljava/lang/Object;Ljava/lang/String;)J

    move-result-wide v8

    const-string v2, "3aw6SvUAxbw=\n"

    const-string v3, "iN9fOJthqNk=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_4

    check-cast v2, Ljava/lang/String;

    move-object v7, v2

    :goto_2
    if-eqz v7, :cond_0

    sget-object v2, Lu6;->a:Lu6;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, Lu6;->g:Ljava/lang/String;

    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Lkn;->a:Lkn;

    const-string v3, "R8y2sRyqYPNAwKSLMKZ/zU/Co4ccsA==\n"

    const-string v13, "LKnP7m/EE6w=\n"

    invoke-static {v3, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, ""

    invoke-static {v3, v2}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-result-object v2

    const/4 v3, 0x1

    :try_start_4
    new-array v3, v3, [Ljava/lang/String;

    const/4 v13, 0x0

    const-string v14, "GA==\n"

    const-string v15, "NHkR/EoHcN0=\n"

    invoke-static {v14, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    aput-object v14, v3, v13

    invoke-static {v2, v3}, Li50;->J(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

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

    invoke-static {v2}, Li50;->F(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v6

    move v2, v4

    move-object v3, v5

    :goto_4
    const-string v4, "TJEedk5qRFl2lAhoeGxKZnc=\n"

    const-string v5, "H/9tNzseKxU=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "\u6267\u884c\u5f02\u5e38: "

    invoke-static {v6}, Lgf;->X(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "ioxU\n"

    const-string v7, "/u0zZ+lqY9I=\n"

    const-string v8, "KFnE\n"

    const-string v9, "RSqjPIOV6WI=\n"

    invoke-static {v6, v7, v4, v8, v9}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    move v4, v2

    move-object v5, v3

    goto/16 :goto_1

    :cond_2
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "9ah/Kzr33aGxu3Y0b+7XprardiF18dehsaB9MXXo16a2vnozcqPR7uSmZjNz7dc=\n"

    const-string v4, "lskTRxqDsoE=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lf40;->k:Lp00;

    iget-object v2, v2, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-string v4, "9dmm+8JROw20g+2nig==\n"

    const-string v5, "nK3DiaMlVH8=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    move v4, v3

    move-object v5, v2

    goto/16 :goto_1

    :cond_4
    move-object v7, v10

    goto/16 :goto_2

    :cond_5
    :try_start_5
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result v2

    if-nez v2, :cond_0

    :try_start_6
    const-string v2, "OLg3y98NjxA4uC/a\n"

    const-string v3, "dNFcrop+6mI=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v2, "40rNBEiMegWiEIZYAA==\n"

    const-string v6, "ij6odin4FXc=\n"

    invoke-static {v2, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    sget-object v6, Lub0;->x1:Ljava/lang/String;

    invoke-static {v2, v6}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v6, v2, Ljava/lang/String;

    if-eqz v6, :cond_8

    check-cast v2, Ljava/lang/String;

    :goto_6
    invoke-static {v2, v12}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

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

    :try_start_7
    const-string v2, "sFiQdiDOdrCKXYZoFtJ8n4h6ikQh\n"

    const-string v3, "4zbjN1W6Gfw=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "06ke\n"

    const-string v6, "p8h5VTpLcuY=\n"

    invoke-static {v3, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "tw==\n"

    const-string v3, "0vI8ySRxU5w=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :cond_9
    sget-object v2, Lub0;->f1:Ljava/lang/String;

    invoke-static {v2, v11}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Jg==\n"

    const-string v6, "Qknh5D2I3Do=\n"

    invoke-static {v3, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v12}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v3, "dQ==\n"

    const-string v6, "EJO5NQeFnBk=\n"

    invoke-static {v3, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v7}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v3, Lub0;->w1:Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const/4 v6, 0x1

    :try_start_8
    invoke-static {v2, v3, v6}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :try_start_9
    const-string v3, "IA==\n"

    const-string v6, "TpXU1MTgQII=\n"

    invoke-static {v3, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    move-result-object v3

    const/4 v6, 0x0

    :try_start_a
    invoke-static {v2, v3, v6}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :goto_7
    :try_start_b
    sget-object v3, Lub0;->v1:Ljava/lang/String;

    invoke-static {v3, v11}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    const-string v6, "Yw==\n"

    const-string v12, "B+PcjPqvaTM=\n"

    invoke-static {v6, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6, v8, v9}, Lde/robv/android/xposed/XposedHelpers;->setLongField(Ljava/lang/Object;Ljava/lang/String;J)V

    const-string v6, "oQ==\n"

    const-string v12, "x8bnXSGecCA=\n"

    invoke-static {v6, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6, v2}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v2, Lub0;->u1:Ljava/lang/String;

    invoke-static {v2, v11}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v6

    sget-object v2, Lub0;->y1:Lum;

    invoke-static {v3}, Lmp;->d(Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Lum;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    array-length v3, v2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6, v2}, Lde/robv/android/xposed/XposedHelpers;->newInstance(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    new-instance v2, Llp;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    const/16 v3, 0x5dc

    const/16 v12, 0xdac

    const/4 v13, 0x1

    :try_start_c
    invoke-direct {v2, v3, v12, v13}, Llp;-><init>(III)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :try_start_d
    sget-object v3, Lhz;->a:Lm;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    :try_start_e
    invoke-static {v2}, Lgu;->C(Llp;)I
    :try_end_e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    move-result v2

    int-to-long v2, v2

    :try_start_f
    move-object/from16 v0, p0

    iput-object v5, v0, Lf40;->f:Ljava/util/Iterator;

    move-object/from16 v0, p0

    iput-object v7, v0, Lf40;->g:Ljava/lang/String;

    move-object/from16 v0, p0

    iput-object v6, v0, Lf40;->h:Ljava/lang/Object;

    move-object/from16 v0, p0

    iput v4, v0, Lf40;->e:I

    move-object/from16 v0, p0

    iput-wide v8, v0, Lf40;->i:J
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    const/4 v12, 0x1

    :try_start_10
    move-object/from16 v0, p0

    iput v12, v0, Lf40;->j:I

    move-object/from16 v0, p0

    invoke-static {v2, v3, v0}, Lg80;->i(JLt50;)Ljava/lang/Object;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    move-result-object v3

    sget-object v2, Lqe;->a:Lqe;

    if-ne v3, v2, :cond_c

    :goto_8
    return-object v2

    :catchall_2
    move-exception v4

    move-object v6, v4

    goto/16 :goto_4

    :catch_0
    move-exception v2

    :try_start_11
    new-instance v3, Ljava/util/NoSuchElementException;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    :catchall_3
    move-exception v6

    move-object v3, v5

    move v2, v4

    goto/16 :goto_4

    :cond_a
    if-lez v4, :cond_b

    const-string v2, "28TQEb+Hw4/hwcY=\n"

    const-string v3, "iKqjUMrzrMM=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "\u2705 \u672c\u6b21\u5171\u81ea\u52a8\u70b9\u8d5e "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " \u6761\u3002"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "ioxU\n"

    const-string v5, "/u0zZ+lqY9I=\n"

    const-string v6, "KFnE\n"

    const-string v7, "RSqjPIOV6WI=\n"

    invoke-static {v4, v5, v2, v6, v7}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_b
    sget-object v2, Lxh;->n:Lxh;

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
