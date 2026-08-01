.class public final synthetic Lj9;
.super Ljava/lang/Object;

# interfaces
.implements Lhm;


# instance fields
.field public final a:I

.field public final b:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;


# direct methods
.method public synthetic constructor <init>(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;I)V
    .locals 3

    iput p2, p0, Lj9;->a:I

    iput-object p1, p0, Lj9;->b:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e4\u06e4"

    invoke-static {v1}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v0, :cond_0

    const-string v0, "\u06e6\u06e3\u06df"

    :goto_1
    invoke-static {v0}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v0

    if-gtz v0, :cond_1

    const-string v0, "\u06e2\u06e8\u06e7"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e6\u06e3\u06df"

    goto :goto_1

    :cond_1
    :sswitch_2
    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    or-int/lit16 v2, v2, -0x837

    add-int/2addr v0, v2

    if-gtz v0, :cond_2

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    const-string v0, "\u06e0\u06e5"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e6\u06e3\u06df"

    :goto_2
    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    const-string v0, "fdBnqFsqsBZx4GgtiWqlUMVUcgO"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣۨۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "\u06df\u06e2\u06e1"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v0, :cond_3

    const-string v0, "\u06e1\u06e0\u06e5"

    goto :goto_2

    :cond_3
    sget v0, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    xor-int/2addr v0, v2

    const v2, 0x1ab6f3

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa75e -> :sswitch_0
        0x1ab2dd -> :sswitch_4
        0x1ab361 -> :sswitch_3
        0x1ab6a3 -> :sswitch_1
        0x1ababc -> :sswitch_2
        0x1ac1c2 -> :sswitch_5
    .end sparse-switch
.end method

.method private final b()Ljava/lang/Object;
    .locals 65

    sget-object v2, Ln9;->a:Ljava/lang/Class;

    sget-boolean v2, Lac;->a:Z

    if-nez v2, :cond_0

    invoke-static {}, Lac;->a()V

    const/4 v2, 0x1

    sput-boolean v2, Lac;->a:Z

    :cond_0
    sget-object v2, Li9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v0, p0

    iget-object v0, v0, Lj9;->b:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    move-object/from16 v22, v0

    move-object/from16 v0, v22

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    sput-object v2, Li9;->c:Ljava/lang/Object;

    sget-object v2, Ln9;->c:Ljava/lang/Boolean;

    sget-boolean v3, Lac;->l:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-boolean v2, Lac;->l:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    sput-object v2, Ln9;->c:Ljava/lang/Boolean;

    :cond_1
    move-object/from16 v0, v22

    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x0

    aget-object v2, v3, v2

    instance-of v4, v2, Ljava/lang/Integer;

    if-eqz v4, :cond_3

    const-string v3, "JWG3YuOK7j4le68uoYyvMypnry63hq8+JHr2YLaF43A/batr44LgJCd9tSCKh/s=\n"

    const-string v4, "SxTbDsPpj1A=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move-object/from16 v0, v22

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v4, 0x1

    aget-object v2, v2, v4

    :goto_0
    move-object v9, v2

    move/from16 v17, v3

    :goto_1
    if-eqz v9, :cond_2

    const/4 v2, -0x1

    move/from16 v0, v17

    if-ne v0, v2, :cond_5

    :cond_2
    :goto_2
    sget-object v2, Lvh;->n:Lvh;

    return-object v2

    :cond_3
    const/4 v2, 0x1

    aget-object v2, v3, v2

    instance-of v3, v2, Ljava/lang/Integer;

    if-eqz v3, :cond_4

    const-string v3, "bcwgs6kc65Zt1jj/6xqqm2LKOP/9EKqWbNdhsfwT5th3wDy6qRTljG/QIvHAEf4=\n"

    const-string v4, "A7lM34l/ivg=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move-object/from16 v0, v22

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v4, 0x0

    aget-object v2, v2, v4

    goto :goto_0

    :cond_4
    const/4 v3, -0x1

    const/4 v9, 0x0

    move/from16 v17, v3

    goto :goto_1

    :cond_5
    sget-object v2, Lin;->i:Ljava/lang/reflect/Method;

    if-nez v2, :cond_6

    :try_start_0
    move-object/from16 v0, v22

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Lpb0;->c0:Ljava/lang/String;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v2, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->findMethodBestMatch(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v2

    if-eqz v2, :cond_1b

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :goto_3
    sput-object v2, Lin;->i:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    :cond_6
    :goto_4
    :try_start_1
    sget-object v2, Lin;->i:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1c

    move-object/from16 v0, v22

    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v2

    :goto_5
    move-object v3, v2

    :goto_6
    if-eqz v3, :cond_2

    sget-object v2, Lin;->a:Lin;

    invoke-static {v3}, Lin;->a(Ljava/lang/Object;)V

    sget-object v2, Lpb0;->J0:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const-wide/16 v20, 0x0

    if-lez v4, :cond_1d

    const/4 v4, 0x0

    :try_start_2
    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v3, v2, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "pghZ111iIMqmEkGbH2Rhx6kOQZsJbmHKpxMY1QhtLYS8BEXeXWou0KQUW5Uxbi/D\n"

    const-string v5, "yH01u30BQaQ=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-wide v4

    move-wide/from16 v18, v4

    :goto_7
    sget-object v2, Lin;->d:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_1e

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v8

    :goto_8
    sget-object v2, Lin;->f:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_1f

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :goto_9
    instance-of v4, v2, Ljava/lang/String;

    if-eqz v4, :cond_20

    check-cast v2, Ljava/lang/String;

    move-object v5, v2

    :goto_a
    if-nez v5, :cond_7

    const-string v5, ""

    :cond_7
    sget-object v2, Lin;->c:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_21

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v6

    :goto_b
    sget-object v2, Lin;->e:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_22

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v4

    :goto_c
    new-instance v23, Li00;

    invoke-direct/range {v23 .. v23}, Li00;-><init>()V

    sget-object v2, Lin;->j:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_24

    :try_start_3
    invoke-virtual {v2, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v10, v2, Landroid/view/View;

    if-eqz v10, :cond_23

    check-cast v2, Landroid/view/View;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :goto_d
    if-nez v2, :cond_8

    instance-of v2, v9, Landroid/view/View;

    if-eqz v2, :cond_25

    move-object v2, v9

    check-cast v2, Landroid/view/View;

    :cond_8
    :goto_e
    move-object/from16 v0, v23

    iput-object v2, v0, Li00;->b:Ljava/lang/Object;

    if-eqz v2, :cond_2

    const/high16 v9, 0x7e060000

    invoke-virtual {v2, v9}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v9, v2, Le9;

    if-eqz v9, :cond_26

    check-cast v2, Le9;

    move-object v10, v2

    :goto_f
    if-nez v10, :cond_9

    new-instance v10, Le9;

    invoke-direct {v10}, Le9;-><init>()V

    new-instance v2, Lg9;

    invoke-direct {v2}, Lg9;-><init>()V

    iput-object v2, v10, Le9;->g:Lg9;

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/high16 v9, 0x7e060000

    invoke-virtual {v2, v9, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_9
    sget-boolean v2, Lac;->d:Z

    if-eqz v2, :cond_27

    const/16 v2, 0x2710

    if-eq v4, v2, :cond_27

    new-instance v2, Lf9;

    invoke-direct/range {v2 .. v8}, Lf9;-><init>(Ljava/lang/Object;ILjava/lang/String;JI)V

    :goto_10
    iput-object v2, v10, Le9;->h:Lf9;

    sget-object v2, Lr9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const-string v9, "KFfghhoxr2s=\n"

    const-string v11, "QSOF60xYyhw=\n"

    invoke-static {v9, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v9, "K9s=\n"

    const-string v11, "XbMHOOijGLQ=\n"

    invoke-static {v9, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    iget-boolean v9, v10, Le9;->a:Z

    if-nez v9, :cond_a

    instance-of v9, v2, Landroid/view/ViewGroup;

    if-nez v9, :cond_28

    :cond_a
    :goto_11
    sget-object v2, Lr9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const-string v9, "/rW14K1Z1Nk=\n"

    const-string v11, "l8HQjfswsa4=\n"

    invoke-static {v9, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v9, "eeo=\n"

    const-string v11, "D4JLp9b3wN4=\n"

    invoke-static {v9, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-boolean v9, Lac;->e:Z

    if-eqz v9, :cond_b

    iget-object v9, v10, Le9;->e:Landroid/view/View;

    if-nez v9, :cond_31

    :cond_b
    :goto_12
    sget-object v2, Lr9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    sget-boolean v9, Lac;->f:Z

    sget-boolean v11, Lac;->g:Z

    sget-boolean v12, Lac;->h:Z

    const-string v13, "Oj4W4ka4AcU=\n"

    const-string v14, "U0pzjxDRZLI=\n"

    invoke-static {v13, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "48E=\n"

    const-string v13, "lalezdXUngg=\n"

    invoke-static {v2, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v2, "2plbNA98\n"

    const-string v13, "rvg3X2oOtsY=\n"

    invoke-static {v2, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    iget-object v13, v10, Le9;->b:Landroid/view/View;

    if-eqz v13, :cond_d

    const/4 v2, 0x1

    if-ne v8, v2, :cond_45

    move v2, v9

    :goto_13
    if-eqz v2, :cond_48

    const/16 v2, 0x8

    invoke-virtual {v13, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v9, v2, Landroid/view/View;

    if-eqz v9, :cond_47

    check-cast v2, Landroid/view/View;

    :goto_14
    if-eqz v2, :cond_c

    const/16 v9, 0x8

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    :cond_c
    :goto_15
    new-instance v2, Lp9;

    const/4 v9, 0x0

    invoke-direct {v2, v9}, Lp9;-><init>(I)V

    invoke-virtual {v13, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_d
    if-eqz v12, :cond_4c

    iget-object v2, v10, Le9;->b:Landroid/view/View;

    if-eqz v2, :cond_4a

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_4a

    const/4 v2, 0x1

    :goto_16
    if-eqz v2, :cond_4c

    const-wide/16 v12, 0x0

    cmp-long v2, v18, v12

    if-lez v2, :cond_4c

    sget-object v9, Li9;->i:Ljava/util/Date;

    move-wide/from16 v0, v18

    invoke-virtual {v9, v0, v1}, Ljava/util/Date;->setTime(J)V

    iget-object v11, v10, Le9;->c:Landroid/widget/TextView;

    if-eqz v11, :cond_e

    sget-object v2, Li9;->h:Lh9;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/text/SimpleDateFormat;

    if-eqz v2, :cond_4b

    invoke-virtual {v2, v9}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    :goto_17
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_e
    iget-object v2, v10, Le9;->c:Landroid/widget/TextView;

    if-eqz v2, :cond_f

    const/4 v9, 0x0

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    :cond_f
    :goto_18
    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    sget-boolean v11, Lac;->i:Z

    const-string v9, "Xipa2wBQzKk=\n"

    const-string v12, "N14/tlY5qd4=\n"

    invoke-static {v9, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v9, "B3A=\n"

    const-string v12, "cRirEfIaxl8=\n"

    invoke-static {v9, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    instance-of v9, v2, Landroid/view/ViewGroup;

    if-nez v9, :cond_4d

    :cond_10
    :goto_19
    move-object/from16 v0, v23

    iget-object v9, v0, Li00;->b:Ljava/lang/Object;

    check-cast v9, Landroid/view/View;

    move v11, v4

    move-wide v12, v6

    move-object v14, v3

    move v15, v8

    move-object/from16 v16, v5

    invoke-static/range {v9 .. v16}, Lip;->g(Landroid/view/View;Le9;IJLjava/lang/Object;ILjava/lang/String;)V

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const-string v4, "C4P3NplFOd4=\n"

    const-string v9, "YveSW88sXKk=\n"

    invoke-static {v4, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "tKU=\n"

    const-string v9, "ws3/Q//J/m8=\n"

    invoke-static {v4, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "c2ooVxmB\n"

    const-string v9, "BwtEPHzz0Jg=\n"

    invoke-static {v4, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v2, v10, v8, v5}, Lr9;->b(Landroid/view/View;Le9;ILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v4

    if-nez v4, :cond_53

    :cond_11
    :goto_1a
    move-object/from16 v0, v22

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sget v3, Li9;->g:I

    if-ne v3, v2, :cond_12

    const-wide/16 v4, 0xd

    sub-long v4, v12, v4

    sget-wide v14, Ln9;->d:J

    sub-long/2addr v4, v14

    const-wide/16 v14, 0xd

    add-long/2addr v4, v14

    const-wide/32 v14, 0xea60

    cmp-long v3, v4, v14

    if-lez v3, :cond_13

    :cond_12
    sput v2, Li9;->g:I

    :cond_13
    sput-wide v12, Ln9;->d:J

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e060011

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/Long;

    if-eqz v3, :cond_5d

    check-cast v2, Ljava/lang/Long;

    :goto_1b
    if-eqz v2, :cond_5e

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    move-wide v4, v2

    :goto_1c
    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e060011

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v2, v3, v9}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget-boolean v2, Lac;->b:Z

    if-eqz v2, :cond_16

    const-wide/32 v2, 0x5f5e100

    cmp-long v2, v2, v18

    if-gtz v2, :cond_5f

    const-wide v2, 0x2540be400L

    cmp-long v2, v18, v2

    if-gez v2, :cond_5f

    const/4 v2, 0x1

    :goto_1d
    if-eqz v2, :cond_14

    const-wide/16 v2, 0x3e8

    mul-long v18, v18, v2

    :cond_14
    const-wide/16 v2, 0x1b

    sub-long v2, v12, v2

    sub-long v2, v2, v18

    const-wide/16 v14, 0x1b

    add-long/2addr v2, v14

    const-wide/16 v14, 0x7d0

    cmp-long v2, v2, v14

    if-gez v2, :cond_60

    const/4 v2, 0x1

    move v3, v2

    :goto_1e
    if-eqz v3, :cond_15

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    const v9, 0x7e120099

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v2, v9, v11}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_15
    cmp-long v2, v4, v6

    if-eqz v2, :cond_61

    const/4 v2, 0x1

    :goto_1f
    if-nez v2, :cond_62

    :cond_16
    :goto_20
    const/4 v2, 0x0

    :goto_21
    if-eqz v2, :cond_6d

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-static {v2, v10}, Lvh;->j(Landroid/view/View;Le9;)V

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e070001

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lh40;

    if-eqz v3, :cond_67

    check-cast v2, Lh40;

    :goto_22
    if-eqz v2, :cond_17

    iget-boolean v3, v2, Lh40;->e:Z

    if-eqz v3, :cond_17

    invoke-virtual {v2}, Lh40;->c()V

    :cond_17
    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e070002

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lh40;

    if-eqz v3, :cond_68

    check-cast v2, Lh40;

    :goto_23
    if-eqz v2, :cond_18

    iget-boolean v3, v2, Lh40;->e:Z

    if-eqz v3, :cond_18

    invoke-virtual {v2}, Lh40;->c()V

    :cond_18
    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e070003

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lh40;

    if-eqz v3, :cond_69

    check-cast v2, Lh40;

    :goto_24
    if-eqz v2, :cond_19

    iget-boolean v3, v2, Lh40;->e:Z

    if-eqz v3, :cond_19

    invoke-virtual {v2}, Lh40;->c()V

    :cond_19
    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e080001

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lh40;

    if-eqz v3, :cond_6a

    check-cast v2, Lh40;

    :goto_25
    if-eqz v2, :cond_1a

    iget-boolean v3, v2, Lh40;->e:Z

    if-eqz v3, :cond_1a

    invoke-virtual {v2}, Lh40;->c()V

    :cond_1a
    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationX(F)V

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationY(F)V

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setRotation(F)V

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setRotationX(F)V

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setRotationY(F)V

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleX(F)V

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleY(F)V

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    sget-boolean v2, Lac;->l:Z

    if-eqz v2, :cond_6c

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e060008

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e060009

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x42f00000    # 120.0f

    mul-float/2addr v2, v3

    const/4 v3, 0x1

    if-ne v8, v3, :cond_6b

    move v3, v2

    :goto_26
    :try_start_4
    sget-object v2, Lob0;->a:Ljava/util/ArrayList;

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    move/from16 v0, v17

    invoke-static {v2, v0, v3, v6, v7}, Lob0;->a(Landroid/view/View;IFJ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v2

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v4, 0xfa

    invoke-virtual {v2, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    goto/16 :goto_2

    :cond_1b
    const/4 v2, 0x0

    goto/16 :goto_3

    :cond_1c
    const/4 v2, 0x0

    goto/16 :goto_5

    :catchall_1
    move-exception v2

    const/4 v3, 0x0

    goto/16 :goto_6

    :catchall_2
    move-exception v2

    :cond_1d
    const-wide/16 v4, 0x0

    move-wide/from16 v18, v4

    goto/16 :goto_7

    :cond_1e
    const/4 v8, 0x0

    goto/16 :goto_8

    :cond_1f
    const/4 v2, 0x0

    goto/16 :goto_9

    :cond_20
    const/4 v5, 0x0

    goto/16 :goto_a

    :cond_21
    const-wide/16 v6, 0x0

    goto/16 :goto_b

    :cond_22
    const/4 v4, 0x0

    goto/16 :goto_c

    :catchall_3
    move-exception v2

    :cond_23
    const/4 v2, 0x0

    goto/16 :goto_d

    :cond_24
    sget-boolean v2, Lin;->k:Z

    if-nez v2, :cond_23

    const/4 v2, 0x1

    sput-boolean v2, Lin;->k:Z

    :try_start_5
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v10, "jF+xJqEiOHw=\n"

    const-string v11, "5SvUS/dLXQs=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v2, v10}, Lde/robv/android/xposed/XposedHelpers;->findFieldIfExists(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    if-eqz v2, :cond_23

    const/4 v10, 0x1

    invoke-virtual {v2, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sput-object v2, Lin;->j:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v10, v2, Landroid/view/View;

    if-eqz v10, :cond_23

    check-cast v2, Landroid/view/View;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto/16 :goto_d

    :cond_25
    const/4 v2, 0x0

    goto/16 :goto_e

    :cond_26
    const/4 v10, 0x0

    goto/16 :goto_f

    :cond_27
    const/4 v2, 0x0

    goto/16 :goto_10

    :cond_28
    invoke-static {v10, v4, v2, v2}, Lr9;->e(Le9;ILandroid/view/View;Landroid/view/View;)V

    iget-object v9, v10, Le9;->f:Landroid/widget/TextView;

    if-nez v9, :cond_29

    sget-object v9, Lpb0;->G0:Ljava/util/List;

    const-string v11, "<this>"

    invoke-static {v11, v9}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v11, 0x2

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_2b

    const/4 v11, 0x2

    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    :goto_27
    check-cast v9, Ljava/lang/String;

    if-nez v9, :cond_78

    const-string v9, "m/kddQsUpSyn5A9kDSK/PQ==\n"

    const-string v11, "+JF8AX99y0s=\n"

    invoke-static {v9, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object v11, v9

    :goto_28
    move-object v9, v2

    check-cast v9, Landroid/view/ViewGroup;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    invoke-virtual {v12}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const-string v12, "UMI=\n"

    const-string v14, "Oab1Cv9iBqw=\n"

    invoke-static {v12, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v11, v12, v13}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v12

    if-nez v12, :cond_77

    :try_start_6
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ".R$id"

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    move-object v0, v2

    check-cast v0, Landroid/view/ViewGroup;

    move-object v9, v0

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v9

    invoke-static {v13, v9}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v9

    invoke-static {v9, v11}, Lde/robv/android/xposed/XposedHelpers;->getStaticIntField(Ljava/lang/Class;Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    move-result v9

    :goto_29
    if-eqz v9, :cond_29

    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    iput-object v9, v10, Le9;->f:Landroid/widget/TextView;

    :cond_29
    iget-object v9, v10, Le9;->b:Landroid/view/View;

    if-eqz v9, :cond_2c

    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v9

    :goto_2a
    instance-of v11, v9, Landroid/view/ViewGroup;

    if-eqz v11, :cond_2d

    check-cast v9, Landroid/view/ViewGroup;

    :goto_2b
    if-eqz v9, :cond_2a

    iget-object v11, v10, Le9;->c:Landroid/widget/TextView;

    if-nez v11, :cond_2a

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    new-instance v12, Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v12, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/high16 v2, 0x41200000    # 10.0f

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v2, -0x1

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v2, 0x40400000    # 3.0f

    const/4 v13, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    const-string v15, "LQzOQLnKR1E+\n"

    const-string v16, "DjT+cIn6d2E=\n"

    invoke-static/range {v15 .. v16}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v15

    invoke-virtual {v12, v2, v13, v14, v15}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    const/4 v2, 0x0

    invoke-virtual {v12, v2}, Landroid/view/View;->setBackgroundColor(I)V

    const/4 v2, 0x0

    invoke-virtual {v12, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/16 v2, 0x11

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setGravity(I)V

    const/16 v2, 0x8

    invoke-virtual {v12, v2}, Landroid/view/View;->setVisibility(I)V

    iput-object v12, v10, Le9;->c:Landroid/widget/TextView;

    instance-of v2, v9, Landroid/widget/FrameLayout;

    if-eqz v2, :cond_2e

    move-object v2, v9

    check-cast v2, Landroid/widget/FrameLayout;

    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v13, -0x2

    const/4 v14, -0x2

    invoke-direct {v9, v13, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v13, 0x51

    iput v13, v9, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    const/high16 v13, 0x40000000    # 2.0f

    mul-float/2addr v11, v13

    float-to-int v11, v11

    iput v11, v9, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v2, v12, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2a
    :goto_2c
    const/4 v2, 0x1

    iput-boolean v2, v10, Le9;->a:Z

    goto/16 :goto_11

    :cond_2b
    const/4 v9, 0x0

    goto/16 :goto_27

    :cond_2c
    const/4 v9, 0x0

    goto :goto_2a

    :cond_2d
    const/4 v9, 0x0

    goto :goto_2b

    :cond_2e
    instance-of v2, v9, Landroid/widget/RelativeLayout;

    if-eqz v2, :cond_2f

    check-cast v9, Landroid/widget/RelativeLayout;

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v13, -0x2

    const/4 v14, -0x2

    invoke-direct {v2, v13, v14}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v13, 0xc

    invoke-virtual {v2, v13}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v13, 0xe

    invoke-virtual {v2, v13}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/high16 v13, 0x40000000    # 2.0f

    mul-float/2addr v11, v13

    float-to-int v11, v11

    iput v11, v2, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v9, v12, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2c

    :cond_2f
    instance-of v2, v9, Landroid/widget/LinearLayout;

    if-eqz v2, :cond_30

    check-cast v9, Landroid/widget/LinearLayout;

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x2

    const/4 v14, -0x2

    invoke-direct {v2, v13, v14}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v13, 0x51

    iput v13, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    const/high16 v13, 0x40000000    # 2.0f

    mul-float/2addr v11, v13

    float-to-int v11, v11

    iput v11, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v9, v12, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2c

    :cond_30
    new-instance v2, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v11, -0x2

    const/4 v13, -0x2

    invoke-direct {v2, v11, v13}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    invoke-virtual {v9, v12, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_2c

    :cond_31
    const/16 v9, 0x22

    if-eq v4, v9, :cond_b

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9}, Lip;->l(Ljava/lang/Object;)V

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    sget v11, Lr9;->b:F

    cmpg-float v11, v11, v2

    if-nez v11, :cond_37

    :goto_2d
    const/4 v2, 0x1

    if-eq v4, v2, :cond_38

    const v2, 0x31000031

    if-eq v4, v2, :cond_38

    :goto_2e
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x1d

    if-lt v2, v11, :cond_39

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v2, v2, Landroid/content/res/Configuration;->uiMode:I

    xor-int/lit8 v9, v2, -0x31

    and-int/2addr v2, v9

    const/16 v9, 0x20

    if-ne v2, v9, :cond_39

    const/4 v2, 0x1

    move v9, v2

    :goto_2f
    sget v13, Lac;->p:I

    sget-object v2, Lgn;->a:Lgn;

    const-string v11, "B2YTGENQOBQCZzUlUEAzHQlcHi9ATzQ=\n"

    const-string v12, "bANqRyUiUXE=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {v11, v2}, Lgn;->b(Ljava/lang/String;I)I

    move-result v14

    const/4 v2, 0x1

    if-ne v8, v2, :cond_3c

    if-eqz v9, :cond_3a

    sget-object v2, Lac;->s:Ljava/lang/String;

    :goto_30
    invoke-static {v2}, Lr9;->a(Ljava/lang/String;)I

    move-result v12

    if-eqz v9, :cond_3b

    sget-object v2, Lac;->t:Ljava/lang/String;

    :goto_31
    invoke-static {v2}, Lr9;->a(Ljava/lang/String;)I

    move-result v2

    move v11, v2

    :goto_32
    const/4 v2, 0x1

    if-eq v4, v2, :cond_32

    const v2, 0x31000031

    if-ne v4, v2, :cond_b

    :cond_32
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v15, "bg_"

    invoke-direct {v2, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v15, "_"

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v15, "_"

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v13, "_"

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    sget-object v15, Li9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v15, v13}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/Drawable$ConstantState;

    if-nez v2, :cond_34

    new-instance v16, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct/range {v16 .. v16}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v2, 0x1

    if-ne v8, v2, :cond_40

    sget v2, Lr9;->c:F

    sget v24, Lr9;->d:F

    const/16 v25, 0x8

    move/from16 v0, v25

    new-array v0, v0, [F

    move-object/from16 v25, v0

    const/16 v26, 0x0

    aput v2, v25, v26

    const/16 v26, 0x1

    aput v2, v25, v26

    const/16 v26, 0x2

    aput v2, v25, v26

    const/16 v26, 0x3

    aput v2, v25, v26

    const/16 v26, 0x4

    aput v24, v25, v26

    const/16 v26, 0x5

    aput v24, v25, v26

    const/16 v24, 0x6

    aput v2, v25, v24

    const/16 v24, 0x7

    aput v2, v25, v24

    move-object/from16 v0, v16

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/16 v24, 0x0

    aput v12, v2, v24

    const/4 v12, 0x1

    aput v11, v2, v12

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->TL_BR:Landroid/graphics/drawable/GradientDrawable$Orientation;

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    :cond_33
    :goto_33
    if-eqz v9, :cond_42

    const-string v2, "LTQy4yi31gpI\n"

    const-string v11, "DgcBpW7xkEw=\n"

    :goto_34
    invoke-static {v2, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v11, Landroid/graphics/drawable/RippleDrawable;

    invoke-static {v2}, Lr9;->a(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    const/4 v12, 0x0

    move-object/from16 v0, v16

    invoke-direct {v11, v2, v0, v12}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v11}, Landroid/graphics/drawable/RippleDrawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v2

    if-eqz v2, :cond_34

    invoke-virtual {v15, v13, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_34
    iget-object v11, v10, Le9;->e:Landroid/view/View;

    if-eqz v11, :cond_35

    if-eqz v2, :cond_43

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_43

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :goto_35
    invoke-virtual {v11, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_35
    const/4 v2, 0x1

    if-eq v8, v2, :cond_36

    if-lez v14, :cond_44

    :cond_36
    const/4 v2, -0x1

    :goto_36
    :try_start_7
    iget-object v9, v10, Le9;->e:Landroid/view/View;

    const-string v11, "oBsZgDW/guO8EgKm\n"

    const-string v12, "035t1FDH9qA=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    const/4 v13, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v12, v13

    invoke-static {v9, v11, v12}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    :goto_37
    iget-object v2, v10, Le9;->e:Landroid/view/View;

    if-eqz v2, :cond_b

    sget v9, Lr9;->e:I

    sget v11, Lr9;->f:I

    invoke-virtual {v2, v9, v11, v9, v11}, Landroid/view/View;->setPadding(IIII)V

    goto/16 :goto_12

    :cond_37
    sput v2, Lr9;->b:F

    const/high16 v11, 0x41500000    # 13.0f

    mul-float/2addr v11, v2

    sput v11, Lr9;->c:F

    const/high16 v11, 0x40800000    # 4.0f

    mul-float/2addr v11, v2

    sput v11, Lr9;->d:F

    const/high16 v11, 0x41300000    # 11.0f

    mul-float/2addr v11, v2

    float-to-int v11, v11

    sput v11, Lr9;->e:I

    const/high16 v11, 0x41000000    # 8.0f

    mul-float/2addr v2, v11

    float-to-int v2, v2

    sput v2, Lr9;->f:I

    goto/16 :goto_2d

    :cond_38
    iget-object v2, v10, Le9;->e:Landroid/view/View;

    invoke-static {v2}, Lip;->l(Ljava/lang/Object;)V

    const/4 v11, 0x0

    :try_start_8
    invoke-virtual {v2, v11}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    new-instance v11, Lp9;

    const/4 v12, 0x1

    invoke-direct {v11, v12}, Lp9;-><init>(I)V

    invoke-virtual {v2, v11}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto/16 :goto_2e

    :catchall_4
    move-exception v2

    sget-object v11, Ln9;->a:Ljava/lang/Class;

    const-string v11, "v1qL5MKPM6OSVo/i8rQ+jJlehuk=\n"

    const-string v12, "/DLqkJfGYcY=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v2}, Ln9;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_2e

    :cond_39
    const/4 v2, 0x0

    move v9, v2

    goto/16 :goto_2f

    :cond_3a
    sget-object v2, Lac;->q:Ljava/lang/String;

    goto/16 :goto_30

    :cond_3b
    sget-object v2, Lac;->r:Ljava/lang/String;

    goto/16 :goto_31

    :cond_3c
    if-lez v14, :cond_3e

    const-string v2, "07M8uphiHQ==\n"

    const-string v11, "8PIF/9lVXPw=\n"

    invoke-static {v2, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v2, "0A6fPooSQQ==\n"

    const-string v12, "8zmsfb9UB+4=\n"

    invoke-static {v2, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v2, "Myw66Kb3SQ==\n"

    const-string v15, "EBp4qp6xD24=\n"

    invoke-static {v2, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v2, "g6ztp73eUg==\n"

    const-string v16, "oJTYnv+bass=\n"

    move-object/from16 v0, v16

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const-string v2, "xfOlFQfkbg==\n"

    const-string v24, "5rKcVDegKOA=\n"

    move-object/from16 v0, v24

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    const-string v2, "e06wFFAJ0g==\n"

    const-string v25, "WA30LRJMl4o=\n"

    move-object/from16 v0, v25

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    const-string v2, "9ANif9f/pg==\n"

    const-string v26, "10UkPea8noc=\n"

    move-object/from16 v0, v26

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    const-string v2, "m5GEo3HKVw==\n"

    const-string v27, "uNfCmzLyZUA=\n"

    move-object/from16 v0, v27

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v27

    const-string v2, "g2x/AgYBKw==\n"

    const-string v28, "oCo5QTY2GCk=\n"

    move-object/from16 v0, v28

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v28

    const-string v2, "10FRRpn5uQ==\n"

    const-string v29, "9AcXAqzN/78=\n"

    move-object/from16 v0, v29

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    const-string v2, "WeXsai8Nlg==\n"

    const-string v30, "eqSpLho1px0=\n"

    move-object/from16 v0, v30

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    const-string v2, "vbCdQn5KTQ==\n"

    const-string v31, "noHcAzp7dGo=\n"

    move-object/from16 v0, v31

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v31

    const-string v2, "pyjVNvq4tw==\n"

    const-string v32, "hBnnD8z89fo=\n"

    move-object/from16 v0, v32

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v32

    const-string v2, "RGnbdkVWfg==\n"

    const-string v33, "Z1nrQwQSSvM=\n"

    move-object/from16 v0, v33

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v33

    const-string v2, "UPqjY1j5Vg==\n"

    const-string v34, "c8nlVmm7Y+4=\n"

    move-object/from16 v0, v34

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v34

    const-string v2, "ZB9RdY+uqA==\n"

    const-string v35, "RyppQLnqnlo=\n"

    move-object/from16 v0, v35

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v35

    const-string v2, "qhiwtgUQ3w==\n"

    const-string v36, "iVn2gzdUmvQ=\n"

    move-object/from16 v0, v36

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v36

    const-string v2, "sjxJAqlcuw==\n"

    const-string v37, "kXoPMO1pjq8=\n"

    move-object/from16 v0, v37

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v37

    const-string v2, "golaZfhIIg==\n"

    const-string v38, "oc8cVrp7Elg=\n"

    move-object/from16 v0, v38

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v38

    const-string v2, "P2blGpqZAw==\n"

    const-string v39, "HCCjI6+pM84=\n"

    move-object/from16 v0, v39

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v39

    const-string v2, "ft1Kf5QUOQ==\n"

    const-string v40, "XZsMPackCco=\n"

    move-object/from16 v0, v40

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v40

    const-string v2, "oEtVEXwzVA==\n"

    const-string v41, "g3MXUk8HFd8=\n"

    move-object/from16 v0, v41

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v41

    const-string v2, "LgjqlP3PGg==\n"

    const-string v42, "DTqroLn+W+I=\n"

    move-object/from16 v0, v42

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v42

    const-string v2, "51gxkJLkJg==\n"

    const-string v43, "xGkJpKfSHoE=\n"

    move-object/from16 v0, v43

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v43

    const-string v2, "OZMOXW2YSA==\n"

    const-string v44, "GqI8biyuDN0=\n"

    move-object/from16 v0, v44

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v44

    const-string v2, "T0sm1H2e5w==\n"

    const-string v45, "bHkX5jyr04I=\n"

    move-object/from16 v0, v45

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v45

    const-string v2, "4S+60b5jNQ==\n"

    const-string v46, "wh3444ZWAgw=\n"

    move-object/from16 v0, v46

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v46

    const-string v2, "BMtx7DQISQ==\n"

    const-string v47, "J/9F3gY9Cuc=\n"

    move-object/from16 v0, v47

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v47

    const-string v2, "HMdT2WQCqA==\n"

    const-string v48, "P/Fl6FYwmls=\n"

    move-object/from16 v0, v48

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v48

    const-string v2, "fUcZ0YpGaA==\n"

    const-string v49, "XnEv4LJ3XI4=\n"

    move-object/from16 v0, v49

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v49

    const-string v2, "32T20KcNSg==\n"

    const-string v50, "/FLA4+U9er8=\n"

    move-object/from16 v0, v50

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v50

    const-string v2, "QODygGycJQ==\n"

    const-string v51, "Y9bEtC6sFRE=\n"

    move-object/from16 v0, v51

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v51

    const-string v2, "RXnWaJE4NQ==\n"

    const-string v52, "ZkrlXNUJdFQ=\n"

    move-object/from16 v0, v52

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v52

    const-string v2, "X6YfvulPYg==\n"

    const-string v53, "fJZeja1/W6M=\n"

    move-object/from16 v0, v53

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v53

    const-string v2, "zi31qEqn1g==\n"

    const-string v54, "7R3Nm3mTk08=\n"

    move-object/from16 v0, v54

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v54

    const-string v2, "vBfnqQTxQw==\n"

    const-string v55, "nyfXmEDFB74=\n"

    move-object/from16 v0, v55

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v55

    const-string v2, "iBNJ7Xd2PQ==\n"

    const-string v56, "qyJ43E9FDjg=\n"

    move-object/from16 v0, v56

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v56

    const-string v2, "wmF/w14l0Q==\n"

    const-string v57, "4VA98h8Wk+Q=\n"

    move-object/from16 v0, v57

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v57

    const-string v2, "7ZuCekq+qw==\n"

    const-string v58, "zqi2S3KKnxU=\n"

    move-object/from16 v0, v58

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v58

    const-string v2, "D6Gwwb6J9w==\n"

    const-string v59, "LJX08fu4zlk=\n"

    move-object/from16 v0, v59

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v59

    const-string v2, "Ug+Gbf+sKg==\n"

    const-string v60, "cTvCXM2cb4o=\n"

    move-object/from16 v0, v60

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v60

    const-string v2, "xhUiYgbZZA==\n"

    const-string v61, "5SFmUELpVMw=\n"

    move-object/from16 v0, v61

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v61

    const-string v2, "VmbxJpbdsg==\n"

    const-string v62, "dVK1Fa7tgho=\n"

    move-object/from16 v0, v62

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v62

    const-string v2, "V/GGMV1Fkg==\n"

    const-string v63, "dMO0Ahl1148=\n"

    move-object/from16 v0, v63

    invoke-static {v2, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v63

    add-int/lit8 v2, v14, -0x1c

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v2, v2, 0x1c

    const/16 v64, 0xa

    move/from16 v0, v64

    invoke-static {v2, v0}, Lgt;->e(II)I

    move-result v64

    if-eqz v9, :cond_3d

    new-instance v2, Lkx;

    const/16 v11, 0xb

    new-array v11, v11, [Ljava/lang/String;

    const/4 v12, 0x0

    aput-object v42, v11, v12

    const/4 v12, 0x1

    aput-object v43, v11, v12

    const/4 v12, 0x2

    aput-object v44, v11, v12

    const/4 v12, 0x3

    aput-object v45, v11, v12

    const/4 v12, 0x4

    aput-object v46, v11, v12

    const/4 v12, 0x5

    aput-object v47, v11, v12

    const/4 v12, 0x6

    aput-object v48, v11, v12

    const/4 v12, 0x7

    aput-object v49, v11, v12

    const/16 v12, 0x8

    aput-object v50, v11, v12

    const/16 v12, 0x9

    aput-object v51, v11, v12

    const/16 v12, 0xa

    aput-object v52, v11, v12

    aget-object v11, v11, v64

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v12, 0xb

    new-array v12, v12, [Ljava/lang/String;

    const/4 v15, 0x0

    aput-object v53, v12, v15

    const/4 v15, 0x1

    aput-object v54, v12, v15

    const/4 v15, 0x2

    aput-object v55, v12, v15

    const/4 v15, 0x3

    aput-object v56, v12, v15

    const/4 v15, 0x4

    aput-object v57, v12, v15

    const/4 v15, 0x5

    aput-object v58, v12, v15

    const/4 v15, 0x6

    aput-object v59, v12, v15

    const/4 v15, 0x7

    aput-object v60, v12, v15

    const/16 v15, 0x8

    aput-object v61, v12, v15

    const/16 v15, 0x9

    aput-object v62, v12, v15

    const/16 v15, 0xa

    aput-object v63, v12, v15

    aget-object v12, v12, v64

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-direct {v2, v11, v12}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v11, v2

    :goto_38
    iget-object v2, v11, Lkx;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v12

    iget-object v2, v11, Lkx;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move v11, v2

    goto/16 :goto_32

    :cond_3d
    new-instance v2, Lkx;

    const/16 v42, 0xb

    move/from16 v0, v42

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v42, v0

    const/16 v43, 0x0

    aput-object v11, v42, v43

    const/4 v11, 0x1

    aput-object v12, v42, v11

    const/4 v11, 0x2

    aput-object v15, v42, v11

    const/4 v11, 0x3

    aput-object v16, v42, v11

    const/4 v11, 0x4

    aput-object v24, v42, v11

    const/4 v11, 0x5

    aput-object v25, v42, v11

    const/4 v11, 0x6

    aput-object v26, v42, v11

    const/4 v11, 0x7

    aput-object v27, v42, v11

    const/16 v11, 0x8

    aput-object v28, v42, v11

    const/16 v11, 0x9

    aput-object v29, v42, v11

    const/16 v11, 0xa

    aput-object v30, v42, v11

    aget-object v11, v42, v64

    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/16 v12, 0xb

    new-array v12, v12, [Ljava/lang/String;

    const/4 v15, 0x0

    aput-object v31, v12, v15

    const/4 v15, 0x1

    aput-object v32, v12, v15

    const/4 v15, 0x2

    aput-object v33, v12, v15

    const/4 v15, 0x3

    aput-object v34, v12, v15

    const/4 v15, 0x4

    aput-object v35, v12, v15

    const/4 v15, 0x5

    aput-object v36, v12, v15

    const/4 v15, 0x6

    aput-object v37, v12, v15

    const/4 v15, 0x7

    aput-object v38, v12, v15

    const/16 v15, 0x8

    aput-object v39, v12, v15

    const/16 v15, 0x9

    aput-object v40, v12, v15

    const/16 v15, 0xa

    aput-object v41, v12, v15

    aget-object v12, v12, v64

    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-direct {v2, v11, v12}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v11, v2

    goto/16 :goto_38

    :cond_3e
    if-eqz v9, :cond_3f

    const-string v2, "C7lP2W85rw==\n"

    const-string v11, "KIsM6ywL6jM=\n"

    :goto_39
    invoke-static {v2, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lr9;->a(Ljava/lang/String;)I

    move-result v2

    move v11, v2

    move v12, v2

    goto/16 :goto_32

    :cond_3f
    const-string v2, "0Kkl4ACVuQ==\n"

    const-string v11, "8+9jpkbT/3k=\n"

    goto :goto_39

    :cond_40
    if-lez v14, :cond_41

    sget v2, Lr9;->d:F

    sget v24, Lr9;->c:F

    const/16 v25, 0x8

    move/from16 v0, v25

    new-array v0, v0, [F

    move-object/from16 v25, v0

    const/16 v26, 0x0

    aput v2, v25, v26

    const/16 v26, 0x1

    aput v2, v25, v26

    const/4 v2, 0x2

    aput v24, v25, v2

    const/4 v2, 0x3

    aput v24, v25, v2

    const/4 v2, 0x4

    aput v24, v25, v2

    const/4 v2, 0x5

    aput v24, v25, v2

    const/4 v2, 0x6

    aput v24, v25, v2

    const/4 v2, 0x7

    aput v24, v25, v2

    move-object/from16 v0, v16

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/16 v24, 0x0

    aput v12, v2, v24

    const/4 v12, 0x1

    aput v11, v2, v12

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    sget-object v2, Landroid/graphics/drawable/GradientDrawable$Orientation;->TR_BL:Landroid/graphics/drawable/GradientDrawable$Orientation;

    move-object/from16 v0, v16

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    goto/16 :goto_33

    :cond_41
    sget v2, Lr9;->d:F

    sget v11, Lr9;->c:F

    const/16 v24, 0x8

    move/from16 v0, v24

    new-array v0, v0, [F

    move-object/from16 v24, v0

    const/16 v25, 0x0

    aput v2, v24, v25

    const/16 v25, 0x1

    aput v2, v24, v25

    const/4 v2, 0x2

    aput v11, v24, v2

    const/4 v2, 0x3

    aput v11, v24, v2

    const/4 v2, 0x4

    aput v11, v24, v2

    const/4 v2, 0x5

    aput v11, v24, v2

    const/4 v2, 0x6

    aput v11, v24, v2

    const/4 v2, 0x7

    aput v11, v24, v2

    move-object/from16 v0, v16

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v12}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    if-nez v9, :cond_33

    const/4 v2, 0x1

    const-string v11, "cxkDk7Qlww==\n"

    const-string v12, "UFw21oFgghQ=\n"

    invoke-static {v11, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lr9;->a(Ljava/lang/String;)I

    move-result v11

    move-object/from16 v0, v16

    invoke-virtual {v0, v2, v11}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    goto/16 :goto_33

    :cond_42
    const-string v2, "e6aTFtblSh9o\n"

    const-string v11, "WJShJubVei8=\n"

    goto/16 :goto_34

    :cond_43
    const/4 v2, 0x0

    goto/16 :goto_35

    :cond_44
    if-nez v9, :cond_36

    const/high16 v2, -0x1000000

    goto/16 :goto_36

    :cond_45
    const-string v2, "+eE+j7suKF/U\n"

    const-string v9, "uYJW7s9cRzA=\n"

    invoke-static {v2, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lb50;->C(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_46

    if-eqz v11, :cond_46

    const/4 v2, 0x1

    goto/16 :goto_13

    :cond_46
    const/4 v2, 0x0

    goto/16 :goto_13

    :cond_47
    const/4 v2, 0x0

    goto/16 :goto_14

    :cond_48
    const/4 v2, 0x0

    invoke-virtual {v13, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v9, v2, Landroid/view/View;

    if-eqz v9, :cond_49

    check-cast v2, Landroid/view/View;

    :goto_3a
    if-eqz v2, :cond_c

    const/4 v9, 0x0

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_15

    :cond_49
    const/4 v2, 0x0

    goto :goto_3a

    :cond_4a
    const/4 v2, 0x0

    goto/16 :goto_16

    :cond_4b
    const/4 v2, 0x0

    goto/16 :goto_17

    :cond_4c
    iget-object v2, v10, Le9;->c:Landroid/widget/TextView;

    if-eqz v2, :cond_f

    const/16 v9, 0x8

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_18

    :cond_4d
    sget-object v12, Li9;->b:Ljava/util/Map;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-interface {v12, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    if-nez v9, :cond_4e

    sget-object v9, Lgn;->a:Lgn;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    const/4 v13, 0x0

    invoke-static {v9, v13}, Lgn;->a(Ljava/lang/String;Z)Z

    move-result v9

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    const-string v13, "pZSCRvHKE1r2mIJWkcsRX6fbyRzykQ==\n"

    const-string v14, "mfPnMty4diw=\n"

    invoke-static {v13, v14}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-interface {v12, v13, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4e
    if-eqz v11, :cond_52

    const-wide/16 v12, 0x0

    cmp-long v11, v6, v12

    if-eqz v11, :cond_52

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v9, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_52

    iget-object v9, v10, Le9;->d:Landroid/widget/TextView;

    if-nez v9, :cond_4f

    move-object v9, v2

    check-cast v9, Landroid/view/ViewGroup;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    new-instance v12, Landroid/widget/TextView;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    invoke-direct {v12, v13}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/high16 v13, 0x41300000    # 11.0f

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v13, -0x1

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v13, 0x1

    invoke-static {v13}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object v13

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/high16 v13, 0x41000000    # 8.0f

    mul-float/2addr v13, v11

    float-to-int v13, v13

    const/high16 v14, 0x40400000    # 3.0f

    mul-float/2addr v14, v11

    float-to-int v14, v14

    invoke-virtual {v12, v13, v14, v13, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    const/16 v13, 0x11

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setGravity(I)V

    new-instance v13, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v13}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v14, "Q05Qsd5CS8lQ\n"

    const-string v15, "YHpgge5ye/k=\n"

    invoke-static {v14, v15}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    invoke-virtual {v13, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v14, 0x40c00000    # 6.0f

    mul-float/2addr v14, v11

    invoke-virtual {v13, v14}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v12, v13}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iput-object v12, v10, Le9;->d:Landroid/widget/TextView;

    instance-of v13, v2, Landroid/widget/RelativeLayout;

    if-eqz v13, :cond_51

    check-cast v2, Landroid/widget/RelativeLayout;

    new-instance v9, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v13, -0x2

    const/4 v14, -0x2

    invoke-direct {v9, v13, v14}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v13, 0xc

    invoke-virtual {v9, v13}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v13, 0xe

    invoke-virtual {v9, v13}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/high16 v13, 0x41400000    # 12.0f

    mul-float/2addr v11, v13

    float-to-int v11, v11

    iput v11, v9, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v2, v12, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_4f
    :goto_3b
    iget-object v2, v10, Le9;->d:Landroid/widget/TextView;

    if-eqz v2, :cond_50

    sget-object v9, Lac;->k:Ljava/lang/String;

    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_50
    iget-object v2, v10, Le9;->d:Landroid/widget/TextView;

    if-eqz v2, :cond_10

    const/4 v9, 0x0

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_19

    :cond_51
    invoke-virtual {v9, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_3b

    :cond_52
    iget-object v2, v10, Le9;->d:Landroid/widget/TextView;

    if-eqz v2, :cond_10

    const/16 v9, 0x8

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_19

    :cond_53
    new-instance v12, Li00;

    invoke-direct {v12}, Li00;-><init>()V

    iput-object v5, v12, Li00;->b:Ljava/lang/Object;

    const/4 v2, 0x1

    if-ne v8, v2, :cond_55

    sget-object v2, Lt6;->a:Ljava/lang/String;

    iput-object v2, v12, Li00;->b:Ljava/lang/Object;

    :cond_54
    :goto_3c
    iget-object v2, v12, Li00;->b:Ljava/lang/Object;

    invoke-static {v2, v5}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    iget-object v2, v12, Li00;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-eqz v2, :cond_11

    iget-object v2, v12, Li00;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "cA==\n"

    const-string v9, "TIds5iarzVs=\n"

    invoke-static {v3, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x0

    invoke-static {v2, v3, v9}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_11

    const v2, 0x7e120021

    iget-object v3, v12, Li00;->b:Ljava/lang/Object;

    invoke-virtual {v4, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    new-instance v15, Lo9;

    const/4 v2, 0x0

    invoke-direct {v15, v4, v2, v12}, Lo9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object v2, Lgn;->a:Lgn;

    const-string v3, "EZxYSeRbfL0li0R3+2x9qxec\n"

    const-string v4, "evkhFpczE8o=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {v3, v2}, Lgn;->a(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_5c

    if-nez v8, :cond_5c

    const-string v2, "3oHHnhTl4vnz\n"

    const-string v3, "nuKv/2CXjZY=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lb50;->C(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5c

    iget-object v2, v12, Li00;->b:Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "real_name_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-static {v2, v3}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_5b

    const-string v2, ""

    invoke-virtual {v15, v2}, Lo9;->f(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v14, Ld9;->a:Ljava/lang/ClassLoader;

    if-eqz v14, :cond_11

    sget-object v2, Lwg;->b:Lnf;

    invoke-static {v2}, Lip;->c(Lge;)Lid;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v11, Lq9;

    const/16 v16, 0x0

    move-object v13, v5

    invoke-direct/range {v11 .. v16}, Lq9;-><init>(Li00;Ljava/lang/String;Ljava/lang/ClassLoader;Lo9;Lld;)V

    const/4 v4, 0x3

    invoke-static {v2, v3, v11, v4}, La80;->r(Loe;Lge;Lwm;I)Lp40;

    goto/16 :goto_1a

    :cond_55
    const-string v2, "DwYPftICw1ci\n"

    const-string v9, "T2VnH6ZwrDg=\n"

    invoke-static {v2, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lb50;->C(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_54

    :try_start_9
    const-string v2, "hHpbirabmuWMZ1uIpg==\n"

    const-string v9, "4hM+5tLE+Yo=\n"

    invoke-static {v2, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    instance-of v9, v2, Ljava/lang/String;

    if-eqz v9, :cond_57

    check-cast v2, Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :goto_3d
    if-nez v2, :cond_56

    :goto_3e
    const-string v2, ""

    :cond_56
    const-string v3, "ucQ=\n"

    const-string v9, "g85zl+iW8Tk=\n"

    invoke-static {v3, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x6

    invoke-static {v2, v3, v9, v11, v13}, Lb50;->G(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v3

    if-lez v3, :cond_5a

    const/4 v9, 0x0

    invoke-virtual {v2, v9, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "o3N/WwrlT0C3LjMGUL4=\n"

    const-string v9, "0AYdKH6XJi4=\n"

    invoke-static {v3, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v2}, Lb50;->T(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v12, Li00;->b:Ljava/lang/Object;

    goto/16 :goto_3c

    :cond_57
    const/4 v2, 0x0

    goto :goto_3d

    :catchall_5
    move-exception v2

    sget-object v2, Lin;->h:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_58

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :goto_3f
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_59

    check-cast v2, Ljava/lang/String;

    :goto_40
    if-nez v2, :cond_56

    goto :goto_3e

    :cond_58
    const/4 v2, 0x0

    goto :goto_3f

    :cond_59
    const/4 v2, 0x0

    goto :goto_40

    :cond_5a
    const-string v3, "AA==\n"

    const-string v9, "OpuvyOT2nw0=\n"

    invoke-static {v3, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x0

    invoke-static {v2, v3, v9}, Lb50;->B(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_54

    const-string v3, "iQ==\n"

    const-string v9, "s1QUfqEJ1/g=\n"

    invoke-static {v3, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x6

    invoke-static {v2, v3, v9, v11, v13}, Lb50;->G(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v3

    if-lez v3, :cond_54

    const/4 v9, 0x0

    invoke-virtual {v2, v9, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "e3tnEaaF0tBvJitM/N4=\n"

    const-string v9, "CA4FYtL3u74=\n"

    invoke-static {v3, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v2}, Lb50;->T(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v12, Li00;->b:Ljava/lang/Object;

    goto/16 :goto_3c

    :cond_5b
    invoke-virtual {v15, v2}, Lo9;->f(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1a

    :cond_5c
    const-string v2, ""

    invoke-virtual {v15, v2}, Lo9;->f(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1a

    :cond_5d
    const/4 v2, 0x0

    goto/16 :goto_1b

    :cond_5e
    const-wide/16 v2, -0x1

    move-wide v4, v2

    goto/16 :goto_1c

    :cond_5f
    const/4 v2, 0x0

    goto/16 :goto_1d

    :cond_60
    const/4 v2, 0x0

    move v3, v2

    goto/16 :goto_1e

    :cond_61
    const/4 v2, 0x0

    goto/16 :goto_1f

    :cond_62
    if-eqz v3, :cond_64

    :cond_63
    const/4 v2, 0x1

    goto/16 :goto_21

    :cond_64
    sget-boolean v2, Lac;->j:Z

    if-eqz v2, :cond_16

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    const v3, 0x7e120099

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/Long;

    if-eqz v3, :cond_65

    check-cast v2, Ljava/lang/Long;

    :goto_41
    if-eqz v2, :cond_76

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    :goto_42
    const-wide/16 v4, 0x3

    add-long/2addr v4, v12

    sub-long v2, v4, v2

    const-wide/16 v4, 0x3

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x1f4

    cmp-long v2, v2, v4

    if-gez v2, :cond_66

    const/4 v2, 0x1

    :goto_43
    if-eqz v2, :cond_63

    goto/16 :goto_20

    :cond_65
    const/4 v2, 0x0

    goto :goto_41

    :cond_66
    const/4 v2, 0x0

    goto :goto_43

    :cond_67
    const/4 v2, 0x0

    goto/16 :goto_22

    :cond_68
    const/4 v2, 0x0

    goto/16 :goto_23

    :cond_69
    const/4 v2, 0x0

    goto/16 :goto_24

    :cond_6a
    const/4 v2, 0x0

    goto/16 :goto_25

    :cond_6b
    neg-float v2, v2

    move v3, v2

    goto/16 :goto_26

    :cond_6c
    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e060008

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e060009

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v2, v3, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x2

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v6}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    new-instance v3, Lm9;

    move-object/from16 v0, v23

    invoke-direct {v3, v0, v4, v5}, Lm9;-><init>(Li00;J)V

    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto/16 :goto_2

    :cond_6d
    move-object/from16 v0, v23

    iget-object v2, v0, Li00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e070001

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lh40;

    if-eqz v4, :cond_72

    check-cast v3, Lh40;

    :goto_44
    if-eqz v3, :cond_6e

    iget-boolean v4, v3, Lh40;->e:Z

    if-eqz v4, :cond_6e

    invoke-virtual {v3}, Lh40;->c()V

    :cond_6e
    const v3, 0x7e070002

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lh40;

    if-eqz v4, :cond_73

    check-cast v3, Lh40;

    :goto_45
    if-eqz v3, :cond_6f

    iget-boolean v4, v3, Lh40;->e:Z

    if-eqz v4, :cond_6f

    invoke-virtual {v3}, Lh40;->c()V

    :cond_6f
    const v3, 0x7e070003

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lh40;

    if-eqz v4, :cond_74

    check-cast v3, Lh40;

    :goto_46
    if-eqz v3, :cond_70

    iget-boolean v4, v3, Lh40;->e:Z

    if-eqz v4, :cond_70

    invoke-virtual {v3}, Lh40;->c()V

    :cond_70
    const v3, 0x7e080001

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lh40;

    if-eqz v4, :cond_75

    check-cast v3, Lh40;

    :goto_47
    if-eqz v3, :cond_71

    iget-boolean v4, v3, Lh40;->e:Z

    if-eqz v4, :cond_71

    invoke-virtual {v3}, Lh40;->c()V

    :cond_71
    const v3, 0x7e060008

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const v3, 0x7e060009

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-static {v2, v10}, Lvh;->j(Landroid/view/View;Le9;)V

    goto/16 :goto_2

    :cond_72
    const/4 v3, 0x0

    goto :goto_44

    :cond_73
    const/4 v3, 0x0

    goto :goto_45

    :cond_74
    const/4 v3, 0x0

    goto :goto_46

    :cond_75
    const/4 v3, 0x0

    goto :goto_47

    :catchall_6
    move-exception v9

    move v9, v12

    goto/16 :goto_29

    :catchall_7
    move-exception v2

    goto/16 :goto_37

    :catchall_8
    move-exception v2

    goto/16 :goto_4

    :cond_76
    move-wide/from16 v2, v20

    goto/16 :goto_42

    :cond_77
    move v9, v12

    goto/16 :goto_29

    :cond_78
    move-object v11, v9

    goto/16 :goto_28
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 14

    const/4 v13, 0x3

    const/4 v3, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v4, 0x0

    iget v2, p0, Lj9;->a:I

    iget-object v11, p0, Lj9;->b:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    packed-switch v2, :pswitch_data_0

    iget-object v7, v11, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const-string v2, "7bCK8zxYuSz6rA==\n"

    const-string v3, "mdjjgHM600k=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "pu8=\n"

    const-string v3, "wo2mtqUYf20=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sput-object v7, Lip;->x:Ljava/lang/Object;

    sget-boolean v2, Lip;->w:Z

    if-eqz v2, :cond_0

    :goto_0
    sget-object v2, Lvh;->n:Lvh;

    :goto_1
    return-object v2

    :cond_0
    const-string v2, "ZnbnFvMUn0hSdfEl8BSIUFJ88A==\n"

    const-string v3, "DROeSZRx+iM=\n"

    sget-object v5, Lgn;->a:Lgn;

    invoke-static {v2, v3, v5}, Lz30;->q(Ljava/lang/String;Ljava/lang/String;Lgn;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v7}, Lip;->R(Ljava/lang/Object;)V

    sput-boolean v6, Lip;->w:Z

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-static {v7}, Lip;->R(Ljava/lang/Object;)V

    const-string v2, "xkU8oBCSUSbyRiqTE5JGEsRENg==\n"

    const-string v3, "rSBF/3f3NE0=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-static {v2, v3}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lb50;->H(Ljava/lang/CharSequence;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    :goto_2
    sput-boolean v6, Lip;->w:Z

    goto :goto_0

    :cond_3
    const/4 v3, 0x1

    :try_start_1
    new-array v3, v3, [Ljava/lang/String;

    const/4 v5, 0x0

    const-string v8, "jg==\n"

    const-string v9, "oqGxh2cmxw8=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v3, v5

    invoke-static {v2, v3}, Lb50;->M(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v0, v3

    check-cast v0, Ljava/lang/String;

    move-object v2, v0

    invoke-static {v2}, Lb50;->H(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v2

    const-string v2, "Nwje\n"

    const-string v3, "Q2m5jaPP2Zc=\n"

    const-string v4, "pTR+Wfhvd3aHI0Rhx254TaYT\n"

    const-string v5, "4lEbMr4AGxI=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Fg==\n"

    const-string v7, "c8HJlSTQVfc=\n"

    invoke-static {v2, v3, v4, v5, v7}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    :try_start_2
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    :goto_4
    if-ge v4, v9, :cond_2

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    rsub-int/lit8 v3, v4, 0x0

    rsub-int/lit8 v5, v3, 0x1

    move-object v0, v2

    check-cast v0, Ljava/lang/String;

    move-object v4, v0

    sget-object v2, Lgn;->a:Lgn;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "key_geek_folder_name_"

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v10, "aZt9a3GaNC0C4UEJBJxnWCu+\n"

    const-string v11, "jwfXjuAn0b0=\n"

    invoke-static {v10, v11}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v10}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v2, ""

    invoke-static {v4, v2}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_8

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v12, "fg==\n"

    const-string v13, "UsMUNnEgD5E=\n"

    invoke-static {v12, v13}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    aput-object v12, v2, v3

    invoke-static {v11, v2}, Lb50;->M(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_6
    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v0, v3

    check-cast v0, Ljava/lang/String;

    move-object v2, v0

    invoke-static {v2}, Lb50;->H(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_7
    const-string v2, "Rg==\n"

    const-string v3, "as4FbhWM7HM=\n"

    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ltc;

    const/4 v13, 0x1

    invoke-direct {v3, v13}, Ltc;-><init>(I)V

    const/16 v13, 0x1e

    invoke-static {v12, v2, v3, v13}, Lab;->j0(Ljava/util/Collection;Ljava/lang/String;Lsm;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_8

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "UPDATE rconversation SET parentRef = \'"

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "\' WHERE username IN ("

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lip;->T(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "REPLACE INTO rcontact (username, nickname, type, verifyFlag) VALUES (\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\', \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\', 3, 0)"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lip;->T(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_9

    const-string v2, "LVYc7KVXo7R8GgKz3GzL52VIQ4SIOOmxLUII7ot9obhxGiyq12zd52Vi\n"

    const-string v3, "yv+mCjPQRw8=\n"

    :goto_6
    invoke-static {v2, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "\n                    REPLACE INTO rconversation (\n                        username, digest, digestUser, isSend, status, \n                        conversationTime, flag, unReadCount, content, msgType, chatmode\n                    ) VALUES (\n                        \'"

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "\', \'"

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\', \'\', 0, 0, \n                        IFNULL((SELECT MAX(conversationTime) FROM rconversation WHERE parentRef = \'"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'), strftime(\'%s\',\'now\') * 1000), \n                        IFNULL((SELECT MAX(flag) FROM rconversation WHERE parentRef = \'"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'), strftime(\'%s\',\'now\') * 1000), \n                        IFNULL((SELECT SUM(unReadCount) FROM rconversation WHERE parentRef = \'"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'), 0), \n                        \'\', 0, 0\n                    )\n                "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lv40;->z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lip;->T(Ljava/lang/String;Ljava/lang/Object;)V

    move v4, v5

    goto/16 :goto_4

    :cond_9
    const-string v2, "CSUlFzq7bLl+TwFRTYoN7G0jRVYD9DWeBAY9\n"

    const-string v3, "7Kmg8qoQiQQ=\n"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_6

    :pswitch_0
    invoke-direct {p0}, Lj9;->b()Ljava/lang/Object;

    move-result-object v2

    goto/16 :goto_1

    :pswitch_1
    sget-object v2, Ln9;->a:Ljava/lang/Class;

    sget-boolean v2, Lac;->a:Z

    if-nez v2, :cond_a

    invoke-static {}, Lac;->a()V

    sput-boolean v6, Lac;->a:Z

    :cond_a
    sget-boolean v2, Lac;->c:Z

    if-nez v2, :cond_c

    :cond_b
    :goto_7
    sget-object v2, Lvh;->n:Lvh;

    goto/16 :goto_1

    :cond_c
    iget-object v7, v11, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v2, v7, v4

    instance-of v8, v2, Ljava/lang/Integer;

    if-eqz v8, :cond_f

    const-string v7, "6G95pO+R57HodWHorZemvOdpYei7naax6XQ4prqe6v/yY2Wt75npq+pze+aGnPI=\n"

    const-string v8, "hhoVyM/yht8=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move v10, v2

    :goto_8
    if-eq v10, v3, :cond_b

    sget-object v2, Lin;->i:Ljava/lang/reflect/Method;

    if-nez v2, :cond_d

    :try_start_3
    iget-object v2, v11, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Lpb0;->c0:Ljava/lang/String;

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v2, v3, v7}, Lde/robv/android/xposed/XposedHelpers;->findMethodBestMatch(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v2

    if-eqz v2, :cond_11

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :goto_9
    sput-object v2, Lin;->i:Ljava/lang/reflect/Method;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    :cond_d
    :goto_a
    :try_start_4
    sget-object v2, Lin;->i:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_12

    iget-object v3, v11, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-virtual {v2, v3, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    move-result-object v2

    move-object v7, v2

    :goto_b
    if-eqz v7, :cond_b

    sget-object v2, Lin;->a:Lin;

    invoke-static {v7}, Lin;->a(Ljava/lang/Object;)V

    sget-object v2, Lin;->e:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_13

    invoke-virtual {v2, v7}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v2

    :goto_c
    sget-object v3, Lin;->d:Ljava/lang/reflect/Field;

    if-eqz v3, :cond_14

    invoke-virtual {v3, v7}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v3

    :goto_d
    const/16 v8, 0x22

    if-ne v2, v8, :cond_b

    if-nez v3, :cond_b

    sget-object v2, Lin;->c:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_15

    invoke-virtual {v2, v7}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v2

    move-wide v8, v2

    :goto_e
    const-wide/16 v2, 0x0

    cmp-long v2, v8, v2

    if-eqz v2, :cond_b

    :try_start_5
    sget-object v2, Lpb0;->O0:Ljava/lang/String;

    invoke-static {v7, v2}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    move-result v2

    xor-int/lit8 v3, v2, -0x41

    and-int/2addr v2, v3

    if-eqz v2, :cond_16

    move v3, v6

    :goto_f
    :try_start_6
    sget-object v2, Lpb0;->P0:Ljava/lang/String;

    invoke-static {v7, v2}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    move-result v2

    :goto_10
    if-lt v2, v13, :cond_b

    sget-object v2, Lgn;->a:Lgn;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v12, "voice_trans_"

    invoke-direct {v6, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v4}, Lgn;->a(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_b

    if-nez v3, :cond_b

    sget-object v2, Li9;->f:Ljava/util/Map;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    const-string v3, "KEgIgwgNh/JwRgOQcxKL/3F7H5ZLDty0OgFD3g==\n"

    const-string v6, "FC9t9yV94pw=\n"

    invoke-static {v3, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_7
    sget-boolean v2, Ln9;->b:Z

    if-nez v2, :cond_e

    const/4 v2, 0x1

    sput-boolean v2, Ln9;->b:Z

    sget-object v2, Lpb0;->z0:Ljava/lang/String;

    sget-object v3, Ld9;->a:Ljava/lang/ClassLoader;

    invoke-static {v2, v3}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    sput-object v2, Ln9;->a:Ljava/lang/Class;

    :cond_e
    sget-object v2, Ln9;->a:Ljava/lang/Class;

    if-eqz v2, :cond_b

    iget-object v2, v11, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    sget-object v3, Lpb0;->W:Ljava/lang/String;

    invoke-static {v2, v3}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_17

    sget-object v3, Lpb0;->X:Ljava/lang/String;

    invoke-static {v2, v3}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    :goto_11
    if-eqz v2, :cond_18

    sget-object v3, Lpb0;->Y:Ljava/lang/String;

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    sget-object v11, Ln9;->a:Ljava/lang/Class;

    aput-object v11, v5, v6

    invoke-static {v2, v3, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :goto_12
    if-eqz v2, :cond_b

    sget-object v3, Lpb0;->a0:Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    const/4 v5, 0x4

    :try_start_8
    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v7, v5, v6

    const/4 v6, 0x1

    aput-object v4, v5, v6

    const/4 v4, 0x2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v4

    const/4 v4, 0x3

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v4

    invoke-static {v2, v3, v5}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto/16 :goto_7

    :catchall_1
    move-exception v4

    const/4 v4, 0x1

    :try_start_9
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v2, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    goto/16 :goto_7

    :catchall_2
    move-exception v2

    :try_start_a
    const-string v3, "C7CUO9Lzxlkns6ob9dvgRS63hyI=\n"

    const-string v4, "SNj1T4e6jjY=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Ln9;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto/16 :goto_7

    :catchall_3
    move-exception v2

    sget-object v3, Li9;->f:Ljava/util/Map;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "H2jmpzVN9n8za9iFD23ddQhy7rQHYcw=\n"

    const-string v4, "XACH02AEvhA=\n"

    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Ln9;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_7

    :cond_f
    aget-object v2, v7, v6

    instance-of v7, v2, Ljava/lang/Integer;

    if-eqz v7, :cond_10

    const-string v7, "go6cw/NYFCiClISPsV5VJY2IhI+nVFUog5XdwaZXGWaYgoDK81AaMoCSnoGaVQE=\n"

    const-string v8, "7Pvwr9M7dUY=\n"

    invoke-static {v7, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move v10, v2

    goto/16 :goto_8

    :cond_10
    move v10, v3

    goto/16 :goto_8

    :cond_11
    move-object v2, v5

    goto/16 :goto_9

    :catchall_4
    move-exception v2

    const-string v3, "wKMVkaipiL/soCu3mIasteC/\n"

    const-string v7, "g8t05f3gwNA=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Ln9;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_a

    :catchall_5
    move-exception v2

    const-string v3, "Z9c/rfDIeoRL1AGQy/ddgEE=\n"

    const-string v7, "JL9e2aWBMus=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Ln9;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_12
    move-object v7, v5

    goto/16 :goto_b

    :cond_13
    move v2, v4

    goto/16 :goto_c

    :cond_14
    move v3, v4

    goto/16 :goto_d

    :cond_15
    const-wide/16 v2, 0x0

    move-wide v8, v2

    goto/16 :goto_e

    :cond_16
    move v3, v4

    goto/16 :goto_f

    :catchall_6
    move-exception v2

    move v3, v4

    :goto_13
    const-string v6, "KXHPIuK2u6IFcvEA2JaQqDltzyLS\n"

    const-string v12, "ahmuVrf/880=\n"

    invoke-static {v6, v12}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Ln9;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v2, v4

    goto/16 :goto_10

    :cond_17
    move-object v2, v5

    goto/16 :goto_11

    :catchall_7
    move-exception v2

    goto :goto_13

    :cond_18
    move-object v2, v5

    goto/16 :goto_12

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
