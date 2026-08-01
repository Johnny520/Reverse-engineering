.class public final synthetic Lu9;
.super Ljava/lang/Object;

# interfaces
.implements Ljm;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 3

    iput p1, p0, Lu9;->a:I

    iput-object p2, p0, Lu9;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e6\u06e5"

    invoke-static {v1}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(F)V

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    move-result v0

    if-ltz v0, :cond_3

    const-string v0, "\u06e8\u06e6\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v0

    if-ltz v0, :cond_1

    sget v0, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    div-int/lit16 v2, v2, -0xa92

    xor-int/2addr v0, v2

    if-ltz v0, :cond_0

    const-string v0, "\u06df\u06e2\u06e7"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06df\u06e2\u06e7"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    const-string v0, "\u06e6\u06e7\u06e8"

    :goto_2
    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e0\u06e5\u06df"

    goto :goto_2

    :sswitch_3
    const-string v0, "YyWJtCLlxGNLCUZZUcYH"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۢۥۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    div-int/2addr v1, v2

    const v2, 0xdc61

    add-int/2addr v2, v1

    move v1, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e0\u06e5\u06df"

    goto :goto_2

    :sswitch_4
    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/lit16 v2, v2, 0xd4a

    xor-int/2addr v0, v2

    if-ltz v0, :cond_4

    const-string v0, "\u06e0\u06e5\u06e1"

    goto :goto_1

    :cond_4
    const-string v0, "\u06e8\u06e6\u06e5"

    goto :goto_1

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc61 -> :sswitch_0
        0x1aa764 -> :sswitch_3
        0x1aab7a -> :sswitch_5
        0x1ab69f -> :sswitch_2
        0x1ac5c4 -> :sswitch_4
        0x1ac9a7 -> :sswitch_1
    .end sparse-switch
.end method

.method private final b()Ljava/lang/Object;
    .locals 65

    move-object/from16 v0, p0

    iget-object v2, v0, Lu9;->b:Ljava/lang/Object;

    move-object/from16 v17, v2

    check-cast v17, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    sget-object v2, Ly9;->a:Ljava/lang/Class;

    sget-boolean v2, Ljc;->a:Z

    if-nez v2, :cond_0

    invoke-static {}, Ljc;->a()V

    const/4 v2, 0x1

    sput-boolean v2, Ljc;->a:Z

    :cond_0
    sget-object v2, Lt9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v0, v17

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    sput-object v2, Lt9;->c:Ljava/lang/Object;

    sget-object v2, Ly9;->c:Ljava/lang/Boolean;

    sget-boolean v3, Ljc;->l:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-boolean v2, Ljc;->l:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    sput-object v2, Ly9;->c:Ljava/lang/Boolean;

    :cond_1
    move-object/from16 v0, v17

    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x0

    aget-object v2, v3, v2

    instance-of v4, v2, Ljava/lang/Integer;

    if-eqz v4, :cond_3

    const-string v3, "bGPLnxhFDSlsedPTWkNMJGNl09NMSUwpbXiKnU1KAGd2b9eWGE0DM25/yd1xSBg=\n"

    const-string v4, "Ahan8zgmbEc=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move-object/from16 v0, v17

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v4, 0x1

    aget-object v2, v2, v4

    :goto_0
    move-object v9, v2

    move/from16 v22, v3

    :goto_1
    if-eqz v9, :cond_2

    const/4 v2, -0x1

    move/from16 v0, v22

    if-ne v0, v2, :cond_5

    :cond_2
    :goto_2
    sget-object v2, Lxh;->n:Lxh;

    return-object v2

    :cond_3
    const/4 v2, 0x1

    aget-object v2, v3, v2

    instance-of v3, v2, Ljava/lang/Integer;

    if-eqz v3, :cond_4

    const-string v3, "4mCdg+lW3gLieoXPq1CfD+1mhc+9Wp8C43vcgbxZ00z4bIGK6V7QGOB8n8GAW8s=\n"

    const-string v4, "jBXx78k1v2w=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move-object/from16 v0, v17

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v4, 0x0

    aget-object v2, v2, v4

    goto :goto_0

    :cond_4
    const/4 v3, -0x1

    const/4 v9, 0x0

    move/from16 v22, v3

    goto :goto_1

    :cond_5
    sget-object v2, Lln;->i:Ljava/lang/reflect/Method;

    if-nez v2, :cond_6

    :try_start_0
    move-object/from16 v0, v17

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Lub0;->c0:Ljava/lang/String;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v2, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->findMethodBestMatch(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object v2

    if-eqz v2, :cond_1b

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :goto_3
    sput-object v2, Lln;->i:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    :cond_6
    :goto_4
    :try_start_1
    sget-object v2, Lln;->i:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1c

    move-object/from16 v0, v17

    iget-object v3, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

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

    sget-object v2, Lln;->a:Lln;

    invoke-static {v3}, Lln;->a(Ljava/lang/Object;)V

    sget-object v2, Lub0;->J0:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const-wide/16 v20, 0x0

    if-lez v4, :cond_1d

    const/4 v4, 0x0

    :try_start_2
    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v3, v2, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v4, "gowdDwzKL7WClgVDTsxuuI2KBUNYxm61g5dcDVnFIvuYgAEGDMIhr4CQH01gxiC8\n"

    const-string v5, "7PlxYyypTts=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result-wide v4

    move-wide/from16 v18, v4

    :goto_7
    sget-object v2, Lln;->d:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_1e

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v8

    :goto_8
    sget-object v2, Lln;->f:Ljava/lang/reflect/Field;

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
    sget-object v2, Lln;->c:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_21

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v6

    :goto_b
    sget-object v2, Lln;->e:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_22

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v4

    :goto_c
    new-instance v23, Lp00;

    invoke-direct/range {v23 .. v23}, Lp00;-><init>()V

    sget-object v2, Lln;->j:Ljava/lang/reflect/Field;

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

    iput-object v2, v0, Lp00;->b:Ljava/lang/Object;

    if-eqz v2, :cond_2

    const/high16 v9, 0x7e060000

    invoke-virtual {v2, v9}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v9, v2, Lp9;

    if-eqz v9, :cond_26

    check-cast v2, Lp9;

    move-object v10, v2

    :goto_f
    if-nez v10, :cond_9

    new-instance v10, Lp9;

    invoke-direct {v10}, Lp9;-><init>()V

    new-instance v2, Lr9;

    invoke-direct {v2}, Lr9;-><init>()V

    iput-object v2, v10, Lp9;->g:Lr9;

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/high16 v9, 0x7e060000

    invoke-virtual {v2, v9, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_9
    sget-boolean v2, Ljc;->d:Z

    if-eqz v2, :cond_27

    const/16 v2, 0x2710

    if-eq v4, v2, :cond_27

    new-instance v2, Lq9;

    invoke-direct/range {v2 .. v8}, Lq9;-><init>(Ljava/lang/Object;ILjava/lang/String;JI)V

    :goto_10
    iput-object v2, v10, Lp9;->h:Lq9;

    sget-object v2, Lba;->a:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const-string v9, "fVEB62XO7yw=\n"

    const-string v11, "FCVkhjOnils=\n"

    invoke-static {v9, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v9, "VkM=\n"

    const-string v11, "ICvLjwCC11A=\n"

    invoke-static {v9, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    iget-boolean v9, v10, Lp9;->a:Z

    if-nez v9, :cond_a

    instance-of v9, v2, Landroid/view/ViewGroup;

    if-nez v9, :cond_28

    :cond_a
    :goto_11
    sget-object v2, Lba;->a:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const-string v9, "bUF1xrH3vb0=\n"

    const-string v11, "BDUQq+ee2Mo=\n"

    invoke-static {v9, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v9, "rkA=\n"

    const-string v11, "2Ch1CYoLU+c=\n"

    invoke-static {v9, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget-boolean v9, Ljc;->e:Z

    if-eqz v9, :cond_b

    iget-object v9, v10, Lp9;->e:Landroid/view/View;

    if-nez v9, :cond_31

    :cond_b
    :goto_12
    sget-object v2, Lba;->a:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    sget-boolean v9, Ljc;->f:Z

    sget-boolean v11, Ljc;->g:Z

    sget-boolean v12, Ljc;->h:Z

    const-string v13, "rW2IiEFZcL8=\n"

    const-string v14, "xBnt5RcwFcg=\n"

    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "kbA=\n"

    const-string v13, "59hSxk+o90E=\n"

    invoke-static {v2, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v2, "zoxh79H9\n"

    const-string v13, "uu0NhLSPFGo=\n"

    invoke-static {v2, v13}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    iget-object v13, v10, Lp9;->b:Landroid/view/View;

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
    new-instance v2, Lz9;

    const/4 v9, 0x0

    invoke-direct {v2, v9}, Lz9;-><init>(I)V

    invoke-virtual {v13, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_d
    if-eqz v12, :cond_4c

    iget-object v2, v10, Lp9;->b:Landroid/view/View;

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

    sget-object v9, Lt9;->i:Ljava/util/Date;

    move-wide/from16 v0, v18

    invoke-virtual {v9, v0, v1}, Ljava/util/Date;->setTime(J)V

    iget-object v11, v10, Lp9;->c:Landroid/widget/TextView;

    if-eqz v11, :cond_e

    sget-object v2, Lt9;->h:Ls9;

    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/text/SimpleDateFormat;

    if-eqz v2, :cond_4b

    invoke-virtual {v2, v9}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    :goto_17
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_e
    iget-object v2, v10, Lp9;->c:Landroid/widget/TextView;

    if-eqz v2, :cond_f

    const/4 v9, 0x0

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    :cond_f
    :goto_18
    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    sget-boolean v11, Ljc;->i:Z

    const-string v9, "eMF0rJSSh2c=\n"

    const-string v12, "EbURwcL74hA=\n"

    invoke-static {v9, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v9, "0ic=\n"

    const-string v12, "pE/gA9v2Kxc=\n"

    invoke-static {v9, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    instance-of v9, v2, Landroid/view/ViewGroup;

    if-nez v9, :cond_4d

    :cond_10
    :goto_19
    move-object/from16 v0, v23

    iget-object v9, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v9, Landroid/view/View;

    move v11, v4

    move-wide v12, v6

    move-object v14, v3

    move v15, v8

    move-object/from16 v16, v5

    invoke-static/range {v9 .. v16}, Lmp;->a(Landroid/view/View;Lp9;IJLjava/lang/Object;ILjava/lang/String;)V

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const-string v4, "IJy+sLlQ29A=\n"

    const-string v9, "Sejb3e85vqc=\n"

    invoke-static {v4, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "NeI=\n"

    const-string v9, "Q4qteqE5U+s=\n"

    invoke-static {v4, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "N1/UdtXC\n"

    const-string v9, "Qz64HbCwJvI=\n"

    invoke-static {v4, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v2, v10, v8, v5}, Lba;->b(Landroid/view/View;Lp9;ILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v4

    if-nez v4, :cond_53

    :cond_11
    :goto_1a
    move-object/from16 v0, v17

    iget-object v2, v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sget v3, Lt9;->g:I

    if-ne v3, v2, :cond_12

    const-wide/16 v4, 0x1b

    sub-long v4, v12, v4

    sget-wide v14, Ly9;->d:J

    sub-long/2addr v4, v14

    const-wide/16 v14, 0x1b

    add-long/2addr v4, v14

    const-wide/32 v14, 0xea60

    cmp-long v3, v4, v14

    if-lez v3, :cond_13

    :cond_12
    sput v2, Lt9;->g:I

    :cond_13
    sput-wide v12, Ly9;->d:J

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

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

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e060011

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v2, v3, v9}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget-boolean v2, Ljc;->b:Z

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

    add-long/2addr v2, v12

    sub-long v2, v2, v18

    const-wide/16 v14, 0x1b

    sub-long/2addr v2, v14

    const-wide/16 v14, 0x7d0

    cmp-long v2, v2, v14

    if-gez v2, :cond_60

    const/4 v2, 0x1

    move v3, v2

    :goto_1e
    if-eqz v3, :cond_15

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

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

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-static {v2, v10}, Lxh;->p(Landroid/view/View;Lp9;)V

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e070001

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lo40;

    if-eqz v3, :cond_67

    check-cast v2, Lo40;

    :goto_22
    if-eqz v2, :cond_17

    iget-boolean v3, v2, Lo40;->e:Z

    if-eqz v3, :cond_17

    invoke-virtual {v2}, Lo40;->c()V

    :cond_17
    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e070002

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lo40;

    if-eqz v3, :cond_68

    check-cast v2, Lo40;

    :goto_23
    if-eqz v2, :cond_18

    iget-boolean v3, v2, Lo40;->e:Z

    if-eqz v3, :cond_18

    invoke-virtual {v2}, Lo40;->c()V

    :cond_18
    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e070003

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lo40;

    if-eqz v3, :cond_69

    check-cast v2, Lo40;

    :goto_24
    if-eqz v2, :cond_19

    iget-boolean v3, v2, Lo40;->e:Z

    if-eqz v3, :cond_19

    invoke-virtual {v2}, Lo40;->c()V

    :cond_19
    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e080001

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lo40;

    if-eqz v3, :cond_6a

    check-cast v2, Lo40;

    :goto_25
    if-eqz v2, :cond_1a

    iget-boolean v3, v2, Lo40;->e:Z

    if-eqz v3, :cond_1a

    invoke-virtual {v2}, Lo40;->c()V

    :cond_1a
    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationX(F)V

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationY(F)V

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setRotation(F)V

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setRotationX(F)V

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setRotationY(F)V

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleX(F)V

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Landroid/view/View;->setScaleY(F)V

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    sget-boolean v2, Ljc;->l:Z

    if-eqz v2, :cond_6c

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e060008

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e060009

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

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
    sget-object v2, Ltb0;->a:Ljava/util/ArrayList;

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    move/from16 v0, v22

    invoke-static {v2, v0, v3, v6, v7}, Ltb0;->a(Landroid/view/View;IFJ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v2

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

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
    sget-boolean v2, Lln;->k:Z

    if-nez v2, :cond_23

    const/4 v2, 0x1

    sput-boolean v2, Lln;->k:Z

    :try_start_5
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v10, "5C6XjtpuiSk=\n"

    const-string v11, "jVry44wH7F4=\n"

    invoke-static {v10, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v2, v10}, Lde/robv/android/xposed/XposedHelpers;->findFieldIfExists(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    if-eqz v2, :cond_23

    const/4 v10, 0x1

    invoke-virtual {v2, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sput-object v2, Lln;->j:Ljava/lang/reflect/Field;

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
    invoke-static {v10, v4, v2, v2}, Lba;->e(Lp9;ILandroid/view/View;Landroid/view/View;)V

    iget-object v9, v10, Lp9;->f:Landroid/widget/TextView;

    if-nez v9, :cond_29

    sget-object v9, Lub0;->G0:Ljava/util/List;

    const-string v11, "<this>"

    invoke-static {v11, v9}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

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

    const-string v9, "3Wt/2iWpRLPhdm3LI59eog==\n"

    const-string v11, "vgMerlHAKtQ=\n"

    invoke-static {v9, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    const-string v12, "cv4=\n"

    const-string v14, "G5oJSDGgB9Q=\n"

    invoke-static {v12, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    iput-object v9, v10, Lp9;->f:Landroid/widget/TextView;

    :cond_29
    iget-object v9, v10, Lp9;->b:Landroid/view/View;

    if-eqz v9, :cond_2c

    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v9

    :goto_2a
    instance-of v11, v9, Landroid/view/ViewGroup;

    if-eqz v11, :cond_2d

    check-cast v9, Landroid/view/ViewGroup;

    :goto_2b
    if-eqz v9, :cond_2a

    iget-object v11, v10, Lp9;->c:Landroid/widget/TextView;

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

    const-string v15, "mPUEJJwW4NyL\n"

    const-string v16, "u800FKwm0Ow=\n"

    invoke-static/range {v15 .. v16}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    iput-object v12, v10, Lp9;->c:Landroid/widget/TextView;

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

    iput-boolean v2, v10, Lp9;->a:Z

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

    invoke-static {v9}, Lmp;->d(Ljava/lang/Object;)V

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    sget v11, Lba;->b:F

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
    sget v13, Ljc;->p:I

    sget-object v2, Lkn;->a:Lkn;

    const-string v11, "a17iPG2a+CxuX8QBforzJWVk7wtuhfQ=\n"

    const-string v12, "ADubYwvokUk=\n"

    invoke-static {v11, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {v11, v2}, Lkn;->b(Ljava/lang/String;I)I

    move-result v14

    const/4 v2, 0x1

    if-ne v8, v2, :cond_3c

    if-eqz v9, :cond_3a

    sget-object v2, Ljc;->s:Ljava/lang/String;

    :goto_30
    invoke-static {v2}, Lba;->a(Ljava/lang/String;)I

    move-result v12

    if-eqz v9, :cond_3b

    sget-object v2, Ljc;->t:Ljava/lang/String;

    :goto_31
    invoke-static {v2}, Lba;->a(Ljava/lang/String;)I

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

    sget-object v15, Lt9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v15, v13}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/drawable/Drawable$ConstantState;

    if-nez v2, :cond_34

    new-instance v16, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct/range {v16 .. v16}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v2, 0x1

    if-ne v8, v2, :cond_40

    sget v2, Lba;->c:F

    sget v24, Lba;->d:F

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

    const-string v11, "fO7tXWLtjzoZ\n"

    const-string v2, "X93eGySryXw=\n"

    :goto_34
    invoke-static {v11, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v11, Landroid/graphics/drawable/RippleDrawable;

    invoke-static {v2}, Lba;->a(Ljava/lang/String;)I

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
    iget-object v11, v10, Lp9;->e:Landroid/view/View;

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
    iget-object v9, v10, Lp9;->e:Landroid/view/View;

    const-string v11, "ZEoiAFWDepl4Qzkm\n"

    const-string v12, "Fy9WVDD7Dto=\n"

    invoke-static {v11, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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
    iget-object v2, v10, Lp9;->e:Landroid/view/View;

    if-eqz v2, :cond_b

    sget v9, Lba;->e:I

    sget v11, Lba;->f:I

    invoke-virtual {v2, v9, v11, v9, v11}, Landroid/view/View;->setPadding(IIII)V

    goto/16 :goto_12

    :cond_37
    sput v2, Lba;->b:F

    const/high16 v11, 0x41500000    # 13.0f

    mul-float/2addr v11, v2

    sput v11, Lba;->c:F

    const/high16 v11, 0x40800000    # 4.0f

    mul-float/2addr v11, v2

    sput v11, Lba;->d:F

    const/high16 v11, 0x41300000    # 11.0f

    mul-float/2addr v11, v2

    float-to-int v11, v11

    sput v11, Lba;->e:I

    const/high16 v11, 0x41000000    # 8.0f

    mul-float/2addr v2, v11

    float-to-int v2, v2

    sput v2, Lba;->f:I

    goto/16 :goto_2d

    :cond_38
    iget-object v2, v10, Lp9;->e:Landroid/view/View;

    invoke-static {v2}, Lmp;->d(Ljava/lang/Object;)V

    const/4 v11, 0x0

    :try_start_8
    invoke-virtual {v2, v11}, Landroid/view/View;->setStateListAnimator(Landroid/animation/StateListAnimator;)V

    new-instance v11, Lz9;

    const/4 v12, 0x1

    invoke-direct {v11, v12}, Lz9;-><init>(I)V

    invoke-virtual {v2, v11}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto/16 :goto_2e

    :catchall_4
    move-exception v2

    sget-object v11, Ly9;->a:Ljava/lang/Class;

    const-string v11, "FMmFvIoYy2E5xYG6uiPGTjLNiLE=\n"

    const-string v12, "V6HkyN9RmQQ=\n"

    invoke-static {v11, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v2}, Ly9;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_2e

    :cond_39
    const/4 v2, 0x0

    move v9, v2

    goto/16 :goto_2f

    :cond_3a
    sget-object v2, Ljc;->q:Ljava/lang/String;

    goto/16 :goto_30

    :cond_3b
    sget-object v2, Ljc;->r:Ljava/lang/String;

    goto/16 :goto_31

    :cond_3c
    if-lez v14, :cond_3e

    const-string v2, "GlDkO/IwvA==\n"

    const-string v11, "ORHdfrMH/Qo=\n"

    invoke-static {v2, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v2, "kVjFA2Hp2Q==\n"

    const-string v12, "sm/2QFSvn/E=\n"

    invoke-static {v2, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v2, "1Igz5bLH3Q==\n"

    const-string v15, "975xp4qBmwE=\n"

    invoke-static {v2, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v2, "mpU5JRWXQA==\n"

    const-string v16, "ua0MHFfSeOg=\n"

    move-object/from16 v0, v16

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const-string v2, "R3JJukYBPg==\n"

    const-string v24, "ZDNw+3ZFePo=\n"

    move-object/from16 v0, v24

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    const-string v2, "FwYKtcYu8w==\n"

    const-string v25, "NEVOjIRrtl0=\n"

    move-object/from16 v0, v25

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    const-string v2, "TPPsCTlJlw==\n"

    const-string v26, "b7WqSwgKr2M=\n"

    move-object/from16 v0, v26

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    const-string v2, "4sFXHlH43g==\n"

    const-string v27, "wYcRJhLA7CU=\n"

    move-object/from16 v0, v27

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v27

    const-string v2, "G+sgeWAtfw==\n"

    const-string v28, "OK1mOlAaTB8=\n"

    move-object/from16 v0, v28

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v28

    const-string v2, "vkYbXccWAA==\n"

    const-string v29, "nQBdGfIiRjI=\n"

    move-object/from16 v0, v29

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    const-string v2, "alDCRMi8+w==\n"

    const-string v30, "SRGHAP2Eysc=\n"

    move-object/from16 v0, v30

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    const-string v2, "nubA8GNvig==\n"

    const-string v31, "vdeBsSdes/8=\n"

    move-object/from16 v0, v31

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v31

    const-string v2, "rhOF2EoGCA==\n"

    const-string v32, "jSK34XxCSiY=\n"

    move-object/from16 v0, v32

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v32

    const-string v2, "/d1cfWL/Cw==\n"

    const-string v33, "3u1sSCO7P+k=\n"

    move-object/from16 v0, v33

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v33

    const-string v2, "c/lzKpd6Og==\n"

    const-string v34, "UMo1H6Y4D98=\n"

    move-object/from16 v0, v34

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v34

    const-string v2, "ufIHiNmB+w==\n"

    const-string v35, "msc/ve/FzaM=\n"

    move-object/from16 v0, v35

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v35

    const-string v2, "nnp8awKBCA==\n"

    const-string v36, "vTs6XjDFTYU=\n"

    move-object/from16 v0, v36

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v36

    const-string v2, "G9rPekIeYw==\n"

    const-string v37, "OJyJSAYrVvg=\n"

    move-object/from16 v0, v37

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v37

    const-string v2, "ZiPGXVxLZQ==\n"

    const-string v38, "RWWAbh54Vd0=\n"

    move-object/from16 v0, v38

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v38

    const-string v2, "VVOdjv390g==\n"

    const-string v39, "dhXbt8jN4m4=\n"

    move-object/from16 v0, v39

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v39

    const-string v2, "exUA11S0aw==\n"

    const-string v40, "WFNGlWeEW0Q=\n"

    move-object/from16 v0, v40

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v40

    const-string v2, "nQejnuFM2A==\n"

    const-string v41, "vj/h3dJ4mYY=\n"

    move-object/from16 v0, v41

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v41

    const-string v2, "eIkVEK3AYw==\n"

    const-string v42, "W7tUJOnxInQ=\n"

    move-object/from16 v0, v42

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v42

    const-string v2, "dfXIspBFfw==\n"

    const-string v43, "VsTwhqVzR10=\n"

    move-object/from16 v0, v43

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v43

    const-string v2, "mDibeDzS2A==\n"

    const-string v44, "uwmpS33knNQ=\n"

    move-object/from16 v0, v44

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v44

    const-string v2, "OKUcvOuDXw==\n"

    const-string v45, "G5ctjqq2a2g=\n"

    move-object/from16 v0, v45

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v45

    const-string v2, "4UKHOTfDhw==\n"

    const-string v46, "wnDFCw/2sMI=\n"

    move-object/from16 v0, v46

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v46

    const-string v2, "Sx9emoFV1g==\n"

    const-string v47, "aCtqqLNglWA=\n"

    move-object/from16 v0, v47

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v47

    const-string v2, "p6PQVQIDQg==\n"

    const-string v48, "hJXmZDAxcIg=\n"

    move-object/from16 v0, v48

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v48

    const-string v2, "yaqT6iVtzg==\n"

    const-string v49, "6pyl2x1c+mM=\n"

    move-object/from16 v0, v49

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v49

    const-string v2, "Sc2K3rAxWA==\n"

    const-string v50, "avu87fIBaGM=\n"

    move-object/from16 v0, v50

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v50

    const-string v2, "wOGWgi1Gew==\n"

    const-string v51, "49egtm92S04=\n"

    move-object/from16 v0, v51

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v51

    const-string v2, "P4rasLrKLQ==\n"

    const-string v52, "HLnphP77bA8=\n"

    move-object/from16 v0, v52

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v52

    const-string v2, "AuHY7vpHnQ==\n"

    const-string v53, "IdGZ3b53pPY=\n"

    move-object/from16 v0, v53

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v53

    const-string v2, "4clTg6OfFw==\n"

    const-string v54, "wvlrsJCrUiw=\n"

    move-object/from16 v0, v54

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v54

    const-string v2, "VXZ0uQaCWA==\n"

    const-string v55, "dkZEiEK2HBw=\n"

    move-object/from16 v0, v55

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v55

    const-string v2, "/sShfH4iXw==\n"

    const-string v56, "3fWQTUYRbJY=\n"

    move-object/from16 v0, v56

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v56

    const-string v2, "P8t5dFCyzQ==\n"

    const-string v57, "HPo7RRGBj3o=\n"

    move-object/from16 v0, v57

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v57

    const-string v2, "uvrSb1m4ng==\n"

    const-string v58, "mcnmXmGMqgw=\n"

    move-object/from16 v0, v58

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v58

    const-string v2, "uj62GBedZA==\n"

    const-string v59, "mQryKFKsXVw=\n"

    move-object/from16 v0, v59

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v59

    const-string v2, "1K/5K9Tbyw==\n"

    const-string v60, "95u9GubrjuU=\n"

    move-object/from16 v0, v60

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v60

    const-string v2, "9XbvvMgIGQ==\n"

    const-string v61, "1kKrjow4Keo=\n"

    move-object/from16 v0, v61

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v61

    const-string v2, "BLmUG+p2mA==\n"

    const-string v62, "J43QKNJGqO0=\n"

    move-object/from16 v0, v62

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v62

    const-string v2, "oW4n5/Ildw==\n"

    const-string v63, "glwV1LYVMkc=\n"

    move-object/from16 v0, v63

    invoke-static {v2, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v63

    add-int/lit8 v2, v14, -0x4

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v2, v2, 0x4

    const/16 v64, 0xa

    move/from16 v0, v64

    invoke-static {v2, v0}, Lju;->e(II)I

    move-result v64

    if-eqz v9, :cond_3d

    new-instance v2, Lsx;

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

    invoke-direct {v2, v11, v12}, Lsx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v11, v2

    :goto_38
    iget-object v2, v11, Lsx;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v12

    iget-object v2, v11, Lsx;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move v11, v2

    goto/16 :goto_32

    :cond_3d
    new-instance v2, Lsx;

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

    invoke-direct {v2, v11, v12}, Lsx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v11, v2

    goto/16 :goto_38

    :cond_3e
    if-eqz v9, :cond_3f

    const-string v2, "fQwZJTOkcQ==\n"

    const-string v11, "Xj5aF3CWNBc=\n"

    :goto_39
    invoke-static {v2, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lba;->a(Ljava/lang/String;)I

    move-result v2

    move v11, v2

    move v12, v2

    goto/16 :goto_32

    :cond_3f
    const-string v2, "C4k4gyTypg==\n"

    const-string v11, "KM9+xWK04DY=\n"

    goto :goto_39

    :cond_40
    if-lez v14, :cond_41

    sget v2, Lba;->d:F

    sget v24, Lba;->c:F

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
    sget v2, Lba;->d:F

    sget v11, Lba;->c:F

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

    const-string v11, "JEYDJPW3sA==\n"

    const-string v12, "BwM2YcDy8UU=\n"

    invoke-static {v11, v12}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lba;->a(Ljava/lang/String;)I

    move-result v11

    move-object/from16 v0, v16

    invoke-virtual {v0, v2, v11}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    goto/16 :goto_33

    :cond_42
    const-string v11, "zh0/nECm4d/d\n"

    const-string v2, "7S8NrHCW0e8=\n"

    goto/16 :goto_34

    :cond_43
    const/4 v2, 0x0

    goto/16 :goto_35

    :cond_44
    if-nez v9, :cond_36

    const/high16 v2, -0x1000000

    goto/16 :goto_36

    :cond_45
    const-string v2, "B6xFeTUnGi4q\n"

    const-string v9, "R88tGEFVdUE=\n"

    invoke-static {v2, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Li50;->A(Ljava/lang/String;Ljava/lang/String;)Z

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
    iget-object v2, v10, Lp9;->c:Landroid/widget/TextView;

    if-eqz v2, :cond_f

    const/16 v9, 0x8

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_18

    :cond_4d
    sget-object v12, Lt9;->b:Ljava/util/Map;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-interface {v12, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    if-nez v9, :cond_4e

    sget-object v9, Lkn;->a:Lkn;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    const/4 v13, 0x0

    invoke-static {v9, v13}, Lkn;->a(Ljava/lang/String;Z)Z

    move-result v9

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    const-string v13, "ZUUWF1zw2mo2SRYHPPHYb2cKXU1fqw==\n"

    const-string v14, "WSJzY3GCvxw=\n"

    invoke-static {v13, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

    iget-object v9, v10, Lp9;->d:Landroid/widget/TextView;

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

    const-string v14, "zRUf+a8AL1/e\n"

    const-string v15, "7iEvyZ8wH28=\n"

    invoke-static {v14, v15}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v14

    invoke-virtual {v13, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v14, 0x40c00000    # 6.0f

    mul-float/2addr v14, v11

    invoke-virtual {v13, v14}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v12, v13}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iput-object v12, v10, Lp9;->d:Landroid/widget/TextView;

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
    iget-object v2, v10, Lp9;->d:Landroid/widget/TextView;

    if-eqz v2, :cond_50

    sget-object v9, Ljc;->k:Ljava/lang/String;

    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_50
    iget-object v2, v10, Lp9;->d:Landroid/widget/TextView;

    if-eqz v2, :cond_10

    const/4 v9, 0x0

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_19

    :cond_51
    invoke-virtual {v9, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_3b

    :cond_52
    iget-object v2, v10, Lp9;->d:Landroid/widget/TextView;

    if-eqz v2, :cond_10

    const/16 v9, 0x8

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_19

    :cond_53
    new-instance v12, Lp00;

    invoke-direct {v12}, Lp00;-><init>()V

    iput-object v5, v12, Lp00;->b:Ljava/lang/Object;

    const/4 v2, 0x1

    if-ne v8, v2, :cond_55

    sget-object v2, Lu6;->a:Lu6;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lu6;->g:Ljava/lang/String;

    iput-object v2, v12, Lp00;->b:Ljava/lang/Object;

    :cond_54
    :goto_3c
    iget-object v2, v12, Lp00;->b:Ljava/lang/Object;

    invoke-static {v2, v5}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    iget-object v2, v12, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-eqz v2, :cond_11

    iget-object v2, v12, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "Uw==\n"

    const-string v9, "bwlB3NtiU2s=\n"

    invoke-static {v3, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x0

    invoke-static {v2, v3, v9}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-nez v2, :cond_11

    const v2, 0x7e120021

    iget-object v3, v12, Lp00;->b:Ljava/lang/Object;

    invoke-virtual {v4, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    new-instance v15, Le30;

    invoke-direct {v15, v4, v12}, Le30;-><init>(Landroid/widget/TextView;Lp00;)V

    sget-object v2, Lkn;->a:Lkn;

    const-string v3, "YTGqPIVaIRdVJrYCmm0gAWcx\n"

    const-string v4, "ClTTY/YyTmA=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {v3, v2}, Lkn;->a(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_5c

    if-nez v8, :cond_5c

    const-string v2, "/I+/Zwa/gjjR\n"

    const-string v3, "vOzXBnLN7Vc=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Li50;->A(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5c

    iget-object v2, v12, Lp00;->b:Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "real_name_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-static {v2, v3}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_5b

    const-string v2, ""

    invoke-virtual {v15, v2}, Le30;->f(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v14, Lo9;->a:Ljava/lang/ClassLoader;

    if-eqz v14, :cond_11

    sget-object v2, Lyg;->b:Lof;

    invoke-static {v2}, Lgf;->c(Lhe;)Lsd;

    move-result-object v2

    const/4 v3, 0x0

    new-instance v11, Laa;

    const/16 v16, 0x0

    move-object v13, v5

    invoke-direct/range {v11 .. v16}, Laa;-><init>(Lp00;Ljava/lang/String;Ljava/lang/ClassLoader;Le30;Lvd;)V

    const/4 v4, 0x3

    invoke-static {v2, v3, v11, v4}, Lg80;->u(Lpe;Lhe;Lym;I)Lw40;

    goto/16 :goto_1a

    :cond_55
    const-string v2, "nZhdguRu9o+w\n"

    const-string v9, "3fs145AcmeA=\n"

    invoke-static {v2, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Li50;->A(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_54

    :try_start_9
    const-string v2, "62q4ELnMB+Tjd7gSqQ==\n"

    const-string v9, "jQPdfN2TZIs=\n"

    invoke-static {v2, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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
    const-string v3, "dhk=\n"

    const-string v9, "TBNNL9KUl1g=\n"

    invoke-static {v3, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x6

    invoke-static {v2, v3, v9, v11, v13}, Li50;->E(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v3

    if-lez v3, :cond_5a

    const/4 v9, 0x0

    invoke-virtual {v2, v9, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "y+g/0Mt8XgXftXONkSc=\n"

    const-string v9, "uJ1do78ON2s=\n"

    invoke-static {v3, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v2}, Li50;->Q(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v12, Lp00;->b:Ljava/lang/Object;

    goto/16 :goto_3c

    :cond_57
    const/4 v2, 0x0

    goto :goto_3d

    :catchall_5
    move-exception v2

    sget-object v2, Lln;->h:Ljava/lang/reflect/Field;

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
    const-string v3, "/Q==\n"

    const-string v9, "xzPGqMVyEXQ=\n"

    invoke-static {v3, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x0

    invoke-static {v2, v3, v9}, Li50;->z(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_54

    const-string v3, "uQ==\n"

    const-string v9, "g2xt9Xq/mW0=\n"

    invoke-static {v3, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x6

    invoke-static {v2, v3, v9, v11, v13}, Li50;->E(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v3

    if-lez v3, :cond_54

    const/4 v9, 0x0

    invoke-virtual {v2, v9, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "h6k6Se2VyqqT9HYUt84=\n"

    const-string v9, "9NxYOpnno8Q=\n"

    invoke-static {v3, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v2}, Li50;->Q(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v12, Lp00;->b:Ljava/lang/Object;

    goto/16 :goto_3c

    :cond_5b
    invoke-virtual {v15, v2}, Le30;->f(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1a

    :cond_5c
    const-string v2, ""

    invoke-virtual {v15, v2}, Le30;->f(Ljava/lang/Object;)Ljava/lang/Object;

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
    sget-boolean v2, Ljc;->j:Z

    if-eqz v2, :cond_16

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

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
    const-wide/16 v4, 0x9

    add-long/2addr v4, v12

    sub-long v2, v4, v2

    const-wide/16 v4, 0x9

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

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e060008

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e060009

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v2, v3, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const/4 v3, 0x2

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v6}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    new-instance v3, Lx9;

    move-object/from16 v0, v23

    invoke-direct {v3, v0, v4, v5}, Lx9;-><init>(Lp00;J)V

    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto/16 :goto_2

    :cond_6d
    move-object/from16 v0, v23

    iget-object v2, v0, Lp00;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    const v3, 0x7e070001

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lo40;

    if-eqz v4, :cond_72

    check-cast v3, Lo40;

    :goto_44
    if-eqz v3, :cond_6e

    iget-boolean v4, v3, Lo40;->e:Z

    if-eqz v4, :cond_6e

    invoke-virtual {v3}, Lo40;->c()V

    :cond_6e
    const v3, 0x7e070002

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lo40;

    if-eqz v4, :cond_73

    check-cast v3, Lo40;

    :goto_45
    if-eqz v3, :cond_6f

    iget-boolean v4, v3, Lo40;->e:Z

    if-eqz v4, :cond_6f

    invoke-virtual {v3}, Lo40;->c()V

    :cond_6f
    const v3, 0x7e070003

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lo40;

    if-eqz v4, :cond_74

    check-cast v3, Lo40;

    :goto_46
    if-eqz v3, :cond_70

    iget-boolean v4, v3, Lo40;->e:Z

    if-eqz v4, :cond_70

    invoke-virtual {v3}, Lo40;->c()V

    :cond_70
    const v3, 0x7e080001

    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lo40;

    if-eqz v4, :cond_75

    check-cast v3, Lo40;

    :goto_47
    if-eqz v3, :cond_71

    iget-boolean v4, v3, Lo40;->e:Z

    if-eqz v4, :cond_71

    invoke-virtual {v3}, Lo40;->c()V

    :cond_71
    const v3, 0x7e060008

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const v3, 0x7e060009

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-static {v2, v10}, Lxh;->p(Landroid/view/View;Lp9;)V

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
    .locals 50

    const/16 v24, 0x0

    const/16 v23, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/16 v25, 0x0

    const/4 v15, 0x0

    const/4 v14, 0x0

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/16 v38, 0x0

    const/16 v44, 0x0

    const/16 v20, 0x0

    const/16 v33, 0x0

    const/16 v17, 0x0

    const/16 v16, 0x0

    const/16 v22, 0x0

    const/16 v21, 0x0

    const/16 v45, 0x0

    const/16 v18, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v46, 0x0

    const/4 v10, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v36, 0x0

    const/16 v32, 0x0

    const/4 v12, 0x0

    const/16 v37, 0x0

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/16 v19, 0x0

    const/16 v35, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v29, 0x0

    const/16 v28, 0x0

    const/16 v39, 0x0

    const/16 v34, 0x0

    const-string v40, "\u06e7\u06df\u06e8"

    invoke-static/range {v40 .. v40}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v48

    move-object/from16 v40, v2

    move-object/from16 v41, v9

    move-object/from16 v42, v19

    move-object/from16 v43, v20

    :goto_0
    sparse-switch v48, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    :try_start_0
    const-string v2, "zWpX0j8WlrbhaWnyGD6wquhtRMs=\n"

    const-string v9, "jgI2pmpf3tk=\n"

    invoke-static {v2, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v34

    invoke-static {v2, v0}, Ly9;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "\u06e3\u06df\u06e5"

    invoke-static {v2}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto :goto_0

    :sswitch_1
    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v9, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    add-int/lit16 v9, v9, -0x2039

    or-int/2addr v2, v9

    if-ltz v2, :cond_0

    const-string v2, "\u06e1\u06e8"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto :goto_0

    :cond_0
    const-string v2, "\u06e8\u06e4\u06e7"

    move-object v9, v2

    :goto_1
    invoke-static {v9}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    move-result v2

    if-gtz v2, :cond_1

    const/16 v2, 0x37

    sput v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v2, "\u06e1\u06e4"

    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e6\u06e5\u06e3"

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto :goto_0

    :sswitch_3
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v9, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    div-int/2addr v2, v9

    const v9, 0x1ac510

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto :goto_0

    :cond_2
    :sswitch_4
    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    move-result v2

    if-ltz v2, :cond_3

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    const-string v2, "\u06e0\u06e3\u06e8"

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto :goto_0

    :cond_3
    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v9, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    div-int/2addr v2, v9

    const v9, 0x1ac989

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto :goto_0

    :sswitch_5
    if-eqz v43, :cond_24

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v9, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    add-int/lit16 v9, v9, -0x227a

    div-int/2addr v2, v9

    if-eqz v2, :cond_4

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    const-string v2, "\u06e7\u06e0\u06e8"

    invoke-static {v2}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_4
    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v9, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    rem-int/2addr v2, v9

    const v9, 0x1ab73b

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_6
    xor-int/lit8 v2, v10, -0x41

    and-int/2addr v2, v10

    if-eqz v2, :cond_4c

    const/16 v27, 0x1

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    if-ltz v2, :cond_5

    const-string v2, "\u06e1\u06e7\u06e6"

    invoke-static {v2}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u06e1\u06df\u06e1"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_7
    if-eqz v13, :cond_56

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v9, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    mul-int/lit16 v9, v9, 0x24aa

    sub-int/2addr v2, v9

    if-gtz v2, :cond_6

    const/16 v2, 0x38

    sput v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v2, "\u06e1\u06e6\u06e2"

    goto/16 :goto_2

    :cond_6
    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v9, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    mul-int/2addr v2, v9

    const v9, 0x1ac522

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_8
    const-wide/16 v6, 0x0

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v9, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    rem-int/lit16 v9, v9, -0x156e

    or-int/2addr v2, v9

    if-gtz v2, :cond_7

    const-string v2, "\u06e3\u06e8\u06df"

    :goto_4
    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_7
    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v9, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/2addr v2, v9

    const v9, 0x1ac4d1

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_9
    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v2, :cond_8

    :goto_5
    const-string v2, "\u06e0\u06e0\u06e2"

    invoke-static {v2}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_8
    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v9, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    rem-int/2addr v2, v9

    const v9, 0x1ab77d

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_a
    const-string v2, "\u06e1\u06e8\u06e7"

    :goto_6
    invoke-static {v2}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_b
    move-object v2, v8

    :cond_9
    sget v8, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v9, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    mul-int/lit16 v9, v9, 0x23c1

    mul-int/2addr v8, v9

    if-ltz v8, :cond_a

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v9, "\u06e2\u06e6"

    move-object v8, v2

    :goto_7
    invoke-static {v9}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u06e5\u06e4\u06e2"

    move-object v8, v2

    :goto_8
    invoke-static {v9}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_c
    if-eqz v28, :cond_1d

    const-string v2, "\u06e1\u06e1\u06e3"

    goto/16 :goto_3

    :sswitch_d
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v9, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    or-int/lit16 v9, v9, -0x185

    add-int/2addr v2, v9

    if-ltz v2, :cond_c

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move-object v2, v13

    :cond_b
    const-string v9, "\u06df\u06e5\u06e4"

    move-object v13, v2

    :goto_9
    invoke-static {v9}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_c
    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v9, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    or-int/2addr v2, v9

    const v9, 0xd849

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_d
    :sswitch_e
    const-string v2, "\u06e5\u06e2\u06e4"

    :goto_a
    invoke-static {v2}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_f
    const-string v2, "9P4OmGSgyePY/TC6XoDi6ePkBotWjPM=\n"

    const-string v9, "t5Zv7DHpgYw=\n"

    invoke-static {v2, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v41

    invoke-static {v2, v0}, Ly9;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v9, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    mul-int/lit16 v9, v9, 0x1aa0

    xor-int/2addr v2, v9

    if-ltz v2, :cond_e

    const/16 v2, 0x21

    sput v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v2, "\u06e4\u06e3\u06e0"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_e
    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v9, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    add-int/2addr v2, v9

    const v9, -0x1acd0f

    xor-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_10
    sget-boolean v2, Ljc;->c:Z

    if-nez v2, :cond_33

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v9, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sub-int/2addr v2, v9

    const v9, 0xe095

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_11
    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    if-gtz v2, :cond_f

    const/16 v2, 0x49

    sput v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    const-string v2, "\u06e1\u06e5\u06e2"

    :goto_b
    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_f
    const-string v2, "\u06e5\u06e6\u06e3"

    move-object v9, v2

    goto :goto_9

    :sswitch_12
    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    if-gtz v2, :cond_10

    const-string v2, "\u06e7\u06e8\u06e8"

    :goto_c
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_10
    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v9, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    or-int/2addr v2, v9

    const v9, 0x1ab062

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_13
    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v9, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    rem-int/lit16 v9, v9, 0x566

    xor-int/2addr v2, v9

    if-gtz v2, :cond_11

    const/16 v2, 0x38

    sput v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    const-string v2, "\u06e1\u06e4\u06e7"

    :goto_d
    invoke-static {v2}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_11
    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v9, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sub-int/2addr v2, v9

    const v9, 0x1aac36

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_14
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v9, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    xor-int/lit16 v9, v9, 0xcc3

    sub-int/2addr v2, v9

    if-ltz v2, :cond_12

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v2, "\u06e4\u06e3\u06e1"

    invoke-static {v2}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v16, v33

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_12
    move-object/from16 v16, v33

    :goto_e
    const-string v2, "\u06e2\u06e5\u06e6"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_15
    const-string v2, "\u06e3\u06e5\u06e2"

    move/from16 v9, v36

    move/from16 v11, v27

    :goto_f
    invoke-static {v2}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    move/from16 v37, v9

    goto/16 :goto_0

    :sswitch_16
    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v2

    if-gtz v2, :cond_13

    const/16 v2, 0x22

    sput v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    const-string v2, "\u06e4\u06e7\u06e8"

    move v9, v14

    :goto_10
    invoke-static {v2}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    move v14, v9

    goto/16 :goto_0

    :cond_13
    const-string v2, "\u06df\u06e1"

    move/from16 v9, v21

    :goto_11
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    move/from16 v21, v9

    goto/16 :goto_0

    :sswitch_17
    sget-object v2, Lln;->d:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_46

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v9

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v18, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    move/from16 v0, v18

    div-int/lit16 v0, v0, -0xe66

    move/from16 v18, v0

    xor-int v2, v2, v18

    if-gtz v2, :cond_14

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-object/from16 v2, v16

    :goto_12
    const-string v16, "\u06e5\u06df\u06e2"

    move-object/from16 v19, v16

    move-object/from16 v20, v2

    :goto_13
    invoke-static/range {v19 .. v19}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v16, v20

    move/from16 v48, v2

    move/from16 v18, v9

    goto/16 :goto_0

    :cond_14
    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v18, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sub-int v2, v2, v18

    const v18, 0x1ac8dd

    add-int v2, v2, v18

    move/from16 v48, v2

    move/from16 v18, v9

    goto/16 :goto_0

    :cond_15
    :sswitch_18
    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v9, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sub-int/2addr v2, v9

    const v9, -0x1aad81

    xor-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_19
    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v9, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    or-int/lit16 v9, v9, 0x106a

    xor-int/2addr v2, v9

    if-ltz v2, :cond_16

    const-string v2, "\u06e6\u06e7\u06e5"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_16
    const-string v2, "\u06e5\u06e3\u06e2"

    move-object v9, v2

    goto/16 :goto_8

    :sswitch_1a
    move-object v2, v3

    check-cast v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    sget-object v8, Ly9;->a:Ljava/lang/Class;

    sget-boolean v8, Ljc;->a:Z

    if-nez v8, :cond_9

    invoke-static {}, Ljc;->a()V

    sget v8, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    if-gtz v8, :cond_17

    const/16 v8, 0x2c

    sput v8, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v8, "\u06e8\u06e3\u06e3"

    invoke-static {v8}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v9

    move-object v8, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :cond_17
    sget v8, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v9, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    or-int/2addr v8, v9

    const v9, 0x1aaa9d

    add-int/2addr v9, v8

    move-object v8, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :cond_18
    :sswitch_1b
    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    if-gtz v2, :cond_19

    const-string v2, "\u06e3\u06e1\u06e3"

    move/from16 v9, v21

    goto/16 :goto_11

    :cond_19
    const-string v9, "\u06e2\u06e8\u06e5"

    move-object/from16 v2, v25

    :goto_14
    invoke-static {v9}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v25, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :sswitch_1c
    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v9, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    add-int/lit16 v9, v9, 0x2500

    or-int/2addr v2, v9

    if-ltz v2, :cond_1a

    const-string v2, "\u06e5\u06e0\u06df"

    :goto_15
    invoke-static {v2}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_1a
    const-string v2, "\u06e1\u06e4"

    :goto_16
    invoke-static {v2}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_1d
    const/4 v2, 0x1

    sput-boolean v2, Ljc;->a:Z

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    move-result v2

    if-ltz v2, :cond_1b

    const/4 v2, 0x5

    sput v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v2, "\u06df\u06e1\u06e8"

    invoke-static {v2}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_1b
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v9, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    rem-int/2addr v2, v9

    const v9, -0x1abfdc

    xor-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_1e
    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v9, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    mul-int/lit16 v9, v9, 0xa6

    sub-int/2addr v2, v9

    if-gtz v2, :cond_1c

    const/4 v2, 0x5

    sput v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    const-string v2, "\u06e4\u06e6\u06e3"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_1c
    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v9, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    mul-int/2addr v2, v9

    const v9, 0x22fa9d

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_1d
    :sswitch_1f
    move-object v2, v4

    :cond_1e
    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v9, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sub-int/2addr v4, v9

    const v9, 0x1ac90c

    xor-int/2addr v9, v4

    move-object v4, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :sswitch_20
    iget-object v0, v8, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    move-object/from16 v25, v0

    const/4 v2, 0x0

    aget-object v2, v25, v2

    instance-of v9, v2, Ljava/lang/Integer;

    if-eqz v9, :cond_70

    const-string v9, "5j/ZMCF/Gv/mJcF8Y3lb8uk5wXx1c1v/5ySYMnRwF7H8M8U5IXcU5eQj23JIcg8=\n"

    const-string v14, "iEq1XAEce5E=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v14

    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    if-ltz v2, :cond_1f

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    const-string v2, "\u06e1\u06df\u06e5"

    invoke-static {v2}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_1f
    const-string v2, "\u06e6\u06e7\u06e5"

    move/from16 v9, v37

    goto/16 :goto_f

    :sswitch_21
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v9, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    div-int/lit16 v9, v9, -0x213

    mul-int/2addr v2, v9

    if-eqz v2, :cond_20

    const/16 v2, 0x34

    sput v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    const-string v2, "\u06e2\u06df\u06e3"

    invoke-static {v2}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_20
    const-string v2, "\u06e5\u06e4\u06e3"

    move-object v9, v2

    goto/16 :goto_7

    :sswitch_22
    const/16 v30, 0x0

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v9, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sub-int/2addr v2, v9

    const v9, -0x1aba44

    xor-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_23
    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    if-ltz v2, :cond_21

    const/16 v2, 0x1f

    sput v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    const-string v2, "\u06df\u06e2"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    move/from16 v27, v26

    goto/16 :goto_0

    :cond_21
    const-string v2, "\u06e8\u06e3\u06e3"

    move/from16 v9, v26

    :goto_17
    invoke-static {v2}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    move/from16 v27, v9

    goto/16 :goto_0

    :sswitch_24
    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v9, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    mul-int/2addr v2, v9

    const v9, 0x198559

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_25
    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v9, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    add-int/lit16 v9, v9, -0x4a4

    rem-int/2addr v2, v9

    if-ltz v2, :cond_22

    const/16 v2, 0x30

    sput v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v2, "\u06e0\u06e4\u06df"

    invoke-static {v2}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_22
    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v9, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sub-int/2addr v2, v9

    const v9, 0xdbb8

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_26
    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    move-result v2

    if-ltz v2, :cond_23

    const-string v2, "\u06e8\u06e1\u06e0"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_23
    const-string v2, "\u06e0\u06e2\u06e7"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_24
    :sswitch_27
    const-string v2, "\u06e8\u06e2\u06e1"

    :goto_18
    invoke-static {v2}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_28
    const-string v2, "\u06e3\u06e2\u06e7"

    move-object/from16 v9, v30

    :goto_19
    invoke-static {v2}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v31, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_29
    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v9, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    xor-int/lit16 v9, v9, 0x1a81

    xor-int/2addr v2, v9

    if-ltz v2, :cond_25

    const-string v2, "\u06e7\u06e1\u06e8"

    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_25
    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v9, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sub-int/2addr v2, v9

    const v9, 0x1aabc9

    xor-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_26
    :sswitch_2a
    const-string v2, "\u06e4\u06df\u06e1"

    move-object/from16 v9, v35

    :goto_1a
    invoke-static {v2}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v35, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :catchall_0
    move-exception v2

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    move-result v9

    if-gtz v9, :cond_27

    const-string v9, "\u06e3\u06df"

    invoke-static {v9}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v41, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :cond_27
    sget v9, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v19, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sub-int v9, v9, v19

    const v19, 0x1abea2

    add-int v9, v9, v19

    move-object/from16 v41, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :sswitch_2b
    const-string v2, "G3kXOCwGs4I3eikeHCmXiDtl\n"

    const-string v9, "WBF2THlP++0=\n"

    invoke-static {v2, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v40

    invoke-static {v2, v0}, Ly9;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v2

    if-ltz v2, :cond_29

    :cond_28
    const-string v2, "\u06e1\u06e0\u06e3"

    :goto_1b
    invoke-static {v2}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_29
    const-string v2, "\u06e4\u06e5\u06df"

    :goto_1c
    invoke-static {v2}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_2c
    :try_start_1
    sget-object v2, Ly9;->a:Ljava/lang/Class;

    if-eqz v2, :cond_1d

    iget-object v2, v8, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    sget-object v9, Lub0;->W:Ljava/lang/String;

    invoke-static {v2, v9}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v2

    sget v9, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v19, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    move/from16 v0, v19

    add-int/lit16 v0, v0, -0x12ac

    move/from16 v19, v0

    rem-int v9, v9, v19

    if-ltz v9, :cond_2a

    const/16 v9, 0x4a

    sput v9, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v9, "\u06e3\u06e8\u06e3"

    invoke-static {v9}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v42, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :cond_2a
    const-string v9, "\u06e4\u06e8\u06e4"

    invoke-static {v9}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v42, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :pswitch_0
    :sswitch_2d
    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    if-ltz v2, :cond_2b

    const-string v2, "\u06df\u06e1\u06e7"

    goto :goto_1c

    :cond_2b
    const-string v2, "\u06e4\u06e3\u06e0"

    goto :goto_1c

    :cond_2c
    :sswitch_2e
    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v2

    if-gtz v2, :cond_2d

    const-string v2, "\u06e0\u06e5\u06e3"

    move-object/from16 v9, v23

    move/from16 v19, v24

    :goto_1d
    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v23, v9

    move/from16 v24, v19

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_2d
    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v9, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    rem-int/2addr v2, v9

    const v9, 0x1abd94

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_2e
    :sswitch_2f
    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-result v2

    if-gtz v2, :cond_2f

    const/16 v2, 0xa

    sput v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    const-string v2, "\u06e2\u06e0\u06e4"

    invoke-static {v2}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_2f
    const-string v2, "\u06e7\u06e5\u06e2"

    move-object/from16 v9, v35

    goto/16 :goto_1a

    :sswitch_30
    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v9, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    div-int/lit16 v9, v9, -0x1f8

    mul-int/2addr v2, v9

    if-eqz v2, :cond_30

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v2, "\u06e1\u06e3\u06e7"

    invoke-static {v2}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_30
    const-string v2, "\u06e8\u06e3\u06e3"

    move-object v9, v2

    goto/16 :goto_1

    :catchall_1
    move-exception v2

    const/4 v2, 0x1

    :try_start_2
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-static/range {v46 .. v47}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v19

    aput-object v19, v2, v9

    move-object/from16 v0, v28

    move-object/from16 v1, v39

    invoke-static {v0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    if-ltz v2, :cond_31

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    const-string v2, "\u06e0\u06e2\u06e1"

    invoke-static {v2}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_31
    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v9, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    div-int/2addr v2, v9

    const v9, 0x1aab1e

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_31
    const/16 v17, 0x0

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v2

    if-gtz v2, :cond_32

    const-string v2, "\u06e8\u06e4\u06e1"

    invoke-static {v2}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_32
    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v9, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    rem-int/2addr v2, v9

    const v9, 0x1aaaf7

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_33
    :sswitch_32
    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v2

    if-ltz v2, :cond_34

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    const-string v9, "\u06e8\u06df\u06e8"

    move-object/from16 v2, v25

    goto/16 :goto_14

    :cond_34
    const-string v2, "\u06e1\u06e7\u06e6"

    goto/16 :goto_1c

    :sswitch_33
    const/4 v2, 0x1

    :try_start_3
    sput-boolean v2, Ly9;->b:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    move-result v2

    if-gtz v2, :cond_35

    const/16 v2, 0x39

    sput v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    const-string v2, "\u06e0\u06e2\u06e7"

    move/from16 v9, v27

    goto/16 :goto_17

    :cond_35
    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v9, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    mul-int/2addr v2, v9

    const v9, 0x204baa

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_34
    const/4 v2, 0x4

    :try_start_4
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v9, 0x0

    aput-object v16, v2, v9

    const/4 v9, 0x1

    aput-object v5, v2, v9

    const/4 v9, 0x2

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    aput-object v19, v2, v9

    const/4 v9, 0x3

    const/16 v19, 0x0

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    aput-object v19, v2, v9

    move-object/from16 v0, v28

    move-object/from16 v1, v39

    invoke-static {v0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const-string v2, "\u06e1\u06e5\u06e2"

    goto/16 :goto_d

    :sswitch_35
    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v9, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    xor-int/lit16 v9, v9, 0x1f56

    xor-int/2addr v2, v9

    if-gtz v2, :cond_36

    const/16 v2, 0x51

    sput v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v2, "\u06e3\u06e2\u06e5"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_36
    const-string v2, "\u06e4\u06e8\u06e0"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_36
    move-object v2, v3

    check-cast v2, Landroidx/activity/ComponentActivity;

    sget v9, Landroidx/activity/ComponentActivity;->r:I

    invoke-virtual {v2}, Landroidx/activity/ComponentActivity;->reportFullyDrawn()V

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v9, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    or-int/lit16 v9, v9, -0x2c7

    mul-int/2addr v2, v9

    if-ltz v2, :cond_37

    const/16 v2, 0x8

    sput v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    const-string v2, "\u06e4\u06e3\u06df"

    move-object/from16 v9, v28

    :goto_1e
    invoke-static {v2}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v28, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_37
    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v9, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    div-int/2addr v2, v9

    const v9, 0x1aa7fd

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_37
    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v9, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/lit16 v9, v9, -0x294

    rem-int/2addr v2, v9

    if-gtz v2, :cond_38

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v2, "\u06e7\u06e2\u06e2"

    invoke-static {v2}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_38
    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v9, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    or-int/2addr v2, v9

    const v9, 0x1ac08c

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_39
    :sswitch_38
    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v9, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    div-int/lit16 v9, v9, 0x1d75

    sub-int/2addr v2, v9

    if-ltz v2, :cond_3a

    const-string v2, "\u06e4\u06e4\u06e4"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_3a
    const-string v2, "\u06df\u06e1\u06df"

    move-object/from16 v9, v23

    move/from16 v19, v24

    goto/16 :goto_1d

    :sswitch_39
    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    if-gtz v2, :cond_3b

    const/16 v2, 0xf

    sput v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    const-string v2, "\u06e5\u06e8\u06df"

    invoke-static {v2}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_3b
    const-string v2, "\u06e1\u06e2\u06e2"

    goto/16 :goto_18

    :sswitch_3a
    const-string v2, "\u06e6\u06e0\u06e7"

    move-object/from16 v31, v35

    :goto_1f
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_3b
    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v9, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    or-int/lit16 v9, v9, -0x1171

    or-int/2addr v2, v9

    if-ltz v2, :cond_3c

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    const-string v2, "\u06e2\u06e1\u06e2"

    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_3c
    const-string v2, "\u06e3\u06e2\u06e7"

    :goto_20
    invoke-static {v2}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :catchall_2
    move-exception v2

    const/4 v12, 0x0

    sget v9, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v19, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    move/from16 v0, v19

    xor-int/lit16 v0, v0, -0x1c64

    move/from16 v19, v0

    mul-int v9, v9, v19

    if-ltz v9, :cond_3d

    const-string v9, "\u06e3\u06e2\u06e0"

    invoke-static {v9}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v32, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :cond_3d
    sget v9, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v19, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    add-int v9, v9, v19

    const v19, 0x1ab012

    add-int v9, v9, v19

    move-object/from16 v32, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :cond_3e
    :sswitch_3c
    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    if-gtz v2, :cond_3f

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v2, "\u06e4\u06e6\u06df"

    :goto_21
    invoke-static {v2}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_3f
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v9, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sub-int/2addr v2, v9

    const v9, 0x1abb44

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_3d
    :try_start_5
    sget-boolean v2, Ly9;->b:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-nez v2, :cond_6c

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v2

    if-ltz v2, :cond_40

    const-string v2, "\u06e8\u06e5\u06e6"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_40
    const-string v2, "\u06e5\u06e7"

    goto/16 :goto_d

    :sswitch_3e
    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v9, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    mul-int/lit16 v9, v9, -0x11a7

    or-int/2addr v2, v9

    if-ltz v2, :cond_42

    const/16 v2, 0x25

    sput v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    move v14, v15

    :cond_41
    const-string v2, "\u06e2\u06e1\u06e3"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_42
    const-string v2, "\u06e8\u06e4\u06e7"

    move v9, v15

    goto/16 :goto_10

    :catchall_3
    move-exception v2

    sget v9, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v19, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    move/from16 v0, v19

    or-int/lit16 v0, v0, 0x1545

    move/from16 v19, v0

    rem-int v9, v9, v19

    if-ltz v9, :cond_43

    const-string v9, "\u06e2\u06e3"

    invoke-static {v9}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v40, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :cond_43
    sget v9, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v19, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    xor-int v9, v9, v19

    const v19, 0x1aa942

    add-int v9, v9, v19

    move-object/from16 v40, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :catchall_4
    move-exception v2

    const-string v9, "1HQTG5qkO0n4dy0moZscTfI=\n"

    const-string v19, "lxxyb8/tcyY=\n"

    move-object/from16 v0, v19

    invoke-static {v9, v0}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v2}, Ly9;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    move-result v2

    if-ltz v2, :cond_44

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v2, "\u06e6\u06e8\u06df"

    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_44
    const-string v2, "\u06e0\u06e0\u06e4"

    move-object/from16 v9, v31

    goto/16 :goto_19

    :sswitch_3f
    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    move-result v2

    if-ltz v2, :cond_45

    const/16 v2, 0x27

    sput v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    const-string v2, "\u06e4\u06e3\u06e4"

    goto/16 :goto_16

    :cond_45
    const-string v2, "\u06e1\u06df\u06e5"

    goto/16 :goto_16

    :sswitch_40
    if-eqz v31, :cond_39

    :try_start_6
    sget-object v2, Lub0;->Y:Ljava/lang/String;

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    const/16 v19, 0x0

    sget-object v20, Ly9;->a:Ljava/lang/Class;

    aput-object v20, v9, v19

    move-object/from16 v0, v31

    invoke-static {v0, v2, v9}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v29

    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v9, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    or-int/2addr v2, v9

    const v9, 0x1ab0db

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_41
    if-nez v16, :cond_5e

    :goto_22
    const-string v2, "\u06e8\u06e6\u06e1"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_46
    :sswitch_42
    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v2

    if-gtz v2, :cond_47

    const-string v2, "\u06e8\u06e6\u06e4"

    move-object/from16 v9, v31

    goto/16 :goto_19

    :cond_47
    const-string v2, "\u06e8\u06e3\u06e7"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_43
    move-object/from16 v2, v17

    move/from16 v9, v18

    goto/16 :goto_12

    :sswitch_44
    const-string v2, "\u06e7\u06e7\u06e4"

    goto/16 :goto_3

    :sswitch_45
    const/4 v2, 0x1

    :try_start_7
    invoke-virtual {v13, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v2

    if-ltz v2, :cond_48

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    const-string v2, "\u06e8\u06e2\u06e1"

    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v44, v13

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_48
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v9, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    xor-int/2addr v2, v9

    const v9, 0x1abe38

    add-int/2addr v2, v9

    move-object/from16 v44, v13

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_46
    :try_start_8
    sget-object v2, Lub0;->z0:Ljava/lang/String;

    sget-object v9, Lo9;->a:Ljava/lang/ClassLoader;

    invoke-static {v2, v9}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    sput-object v2, Ly9;->a:Ljava/lang/Class;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v2, :cond_49

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    const-string v2, "\u06e8\u06e5\u06e3"

    invoke-static {v2}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_49
    const-string v2, "\u06e5\u06e5\u06e0"

    goto/16 :goto_4

    :sswitch_47
    sget-object v2, Lt9;->f:Ljava/util/Map;

    invoke-static/range {v46 .. v47}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-interface {v2, v9}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v9, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    div-int/2addr v2, v9

    const v9, 0x1aab01

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_48
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    move-result v2

    if-ltz v2, :cond_4a

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    const-string v2, "\u06e1\u06e1\u06e1"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_4a
    const-string v2, "\u06e2\u06e1\u06e3"

    goto/16 :goto_c

    :sswitch_49
    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v9, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/2addr v2, v9

    const v9, -0x1ac566

    xor-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_4a
    const-string v2, "\u06df\u06e1\u06df"

    move-object/from16 v9, v29

    goto/16 :goto_1e

    :sswitch_4b
    const/4 v2, 0x0

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move-result v9

    if-ltz v9, :cond_4b

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    const-string v9, "\u06e1\u06e6"

    invoke-static {v9}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v45, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :cond_4b
    const-string v9, "\u06e6\u06e6\u06e6"

    invoke-static {v9}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v9

    move/from16 v45, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :cond_4c
    :sswitch_4c
    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v9, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/lit16 v9, v9, 0x422

    div-int/2addr v2, v9

    if-eqz v2, :cond_4d

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    const-string v2, "\u06e3\u06e8\u06e1"

    goto/16 :goto_20

    :cond_4d
    const-string v2, "\u06e3\u06e5\u06e8"

    move-object v9, v2

    goto/16 :goto_7

    :sswitch_4d
    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v2, :cond_4e

    const/16 v2, 0x39

    sput v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    const-string v2, "\u06e3\u06e8\u06e8"

    goto/16 :goto_18

    :cond_4e
    const-string v2, "\u06e6\u06df\u06e2"

    move-object v9, v2

    goto/16 :goto_7

    :pswitch_1
    :sswitch_4e
    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v9, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    add-int/2addr v2, v9

    const v9, -0x1abfb7

    xor-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_4f
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move-result v2

    if-ltz v2, :cond_4f

    const/16 v2, 0x29

    sput v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    const-string v2, "\u06e3\u06e2\u06e7"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v28, v23

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_4f
    const-string v2, "\u06e4\u06e5\u06e8"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v28, v23

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_50
    const/4 v2, 0x0

    :goto_23
    return-object v2

    :sswitch_51
    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    if-gtz v2, :cond_50

    const-string v2, "\u06e7\u06e2\u06e4"

    move-object/from16 v9, v32

    move v11, v12

    move/from16 v19, v12

    :goto_24
    invoke-static {v2}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v32, v9

    move/from16 v48, v2

    move/from16 v12, v19

    goto/16 :goto_0

    :cond_50
    const-string v2, "\u06e1\u06e2\u06e2"

    move-object v9, v2

    move v11, v12

    goto/16 :goto_7

    :sswitch_52
    if-eqz v11, :cond_2c

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v9, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    or-int/lit16 v9, v9, -0x2475

    sub-int/2addr v2, v9

    if-gtz v2, :cond_51

    const/16 v2, 0x47

    sput v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    goto/16 :goto_e

    :cond_51
    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v9, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    or-int/2addr v2, v9

    const v9, -0x1abaca

    xor-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_53
    :try_start_9
    sget-object v2, Lub0;->P0:Ljava/lang/String;

    move-object/from16 v0, v16

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    move-result v36

    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v9, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    mul-int/lit16 v9, v9, 0x1033

    mul-int/2addr v2, v9

    if-gtz v2, :cond_64

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v2, "\u06e7\u06e7\u06e3"

    invoke-static {v2}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_54
    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v9, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sub-int/2addr v2, v9

    const v9, 0x1abdd9

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_55
    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v9, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    rem-int/2addr v2, v9

    const v9, -0xdc21

    xor-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_56
    const/4 v2, -0x1

    if-ne v14, v2, :cond_15

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v9, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/lit16 v9, v9, 0x1290

    xor-int/2addr v2, v9

    if-gtz v2, :cond_52

    const/16 v2, 0x5d

    sput v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    const-string v2, "\u06df\u06e6\u06df"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_52
    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v9, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    xor-int/2addr v2, v9

    const v9, 0x1ab35b

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_57
    invoke-static/range {v46 .. v47}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v4, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v2

    if-gtz v2, :cond_41

    move-object/from16 v2, v34

    :goto_25
    const-string v9, "\u06e2\u06e4\u06e7"

    invoke-static {v9}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v34, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :sswitch_58
    :try_start_a
    iget-object v2, v8, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    sget-object v9, Lub0;->c0:Ljava/lang/String;

    const/16 v19, 0x1

    move/from16 v0, v19

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v19, v0

    const/16 v20, 0x0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v48

    aput-object v48, v19, v20

    move-object/from16 v0, v19

    invoke-static {v2, v9, v0}, Lde/robv/android/xposed/XposedHelpers;->findMethodBestMatch(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    move-result-object v2

    sget v9, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v13, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    rem-int/lit16 v13, v13, -0x2427

    div-int/2addr v9, v13

    if-eqz v9, :cond_b

    const-string v9, "\u06e2\u06e6\u06e7"

    invoke-static {v9}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v9

    move-object v13, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :sswitch_59
    packed-switch v24, :pswitch_data_0

    :sswitch_5a
    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v2

    if-ltz v2, :cond_53

    const-string v2, "\u06e2\u06e2\u06e3"

    move-object v9, v2

    goto/16 :goto_8

    :cond_53
    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v9, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    or-int/2addr v2, v9

    const v9, -0x1ac4e5

    xor-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_5b
    const-string v2, "\u06e2\u06e8\u06e2"

    move-object/from16 v9, v31

    goto/16 :goto_19

    :sswitch_5c
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v9, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    add-int/lit16 v9, v9, 0xb8c

    rem-int/2addr v2, v9

    if-ltz v2, :cond_54

    const-string v2, "\u06e8\u06df\u06e7"

    move-object/from16 v9, v35

    goto/16 :goto_1a

    :cond_54
    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v9, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    xor-int/2addr v2, v9

    const v9, -0x1ac805

    xor-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_5d
    :try_start_b
    sput-object v44, Lln;->i:Ljava/lang/reflect/Method;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v9, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    mul-int/lit16 v9, v9, -0x1b0d

    div-int/2addr v2, v9

    if-eqz v2, :cond_55

    const/16 v2, 0x42

    sput v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    const-string v2, "\u06e8\u06e2\u06e7"

    goto/16 :goto_1f

    :cond_55
    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v9, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    xor-int/2addr v2, v9

    const v9, 0xda16

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_56
    :sswitch_5e
    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v2

    if-ltz v2, :cond_57

    const-string v2, "\u06df\u06e8\u06e7"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_57
    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v9, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    rem-int/2addr v2, v9

    const v9, -0x1ab30d

    xor-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_5f
    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v9, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    rem-int/lit16 v9, v9, -0xa69

    xor-int/2addr v2, v9

    if-gtz v2, :cond_58

    const/16 v2, 0x30

    sput v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    const-string v2, "\u06e5\u06df\u06e5"

    invoke-static {v2}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v2

    move-wide/from16 v46, v6

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_58
    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v9, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    add-int/2addr v2, v9

    const v9, 0x1ac59f

    add-int/2addr v2, v9

    move-wide/from16 v46, v6

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_60
    const-string v2, "\u06e2\u06e8\u06e1"

    :goto_26
    invoke-static {v2}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_61
    :try_start_c
    sget-object v2, Lub0;->O0:Ljava/lang/String;

    move-object/from16 v0, v16

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    move-result v10

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    if-gtz v2, :cond_59

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v2, "\u06e3\u06df\u06e5"

    invoke-static {v2}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_59
    const-string v2, "\u06e6\u06e6"

    move-object v9, v2

    goto/16 :goto_7

    :catchall_5
    move-exception v9

    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v12, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    div-int/lit16 v12, v12, -0x103a

    mul-int/2addr v2, v12

    if-eqz v2, :cond_5a

    const/16 v2, 0x5c

    sput v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    const-string v2, "\u06e2\u06e0\u06e7"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v32, v9

    move/from16 v48, v2

    move/from16 v12, v27

    goto/16 :goto_0

    :cond_5a
    const-string v2, "\u06e2\u06e6\u06e6"

    move/from16 v19, v27

    goto/16 :goto_24

    :sswitch_62
    :try_start_d
    iget-object v2, v8, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/4 v9, 0x1

    new-array v9, v9, [Ljava/lang/Object;

    const/16 v19, 0x0

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    aput-object v20, v9, v19

    move-object/from16 v0, v43

    invoke-virtual {v0, v2, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    move-result-object v33

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v2

    if-gtz v2, :cond_5b

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    const-string v2, "\u06e6\u06e5\u06e3"

    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_63
    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    if-gtz v2, :cond_5c

    :cond_5b
    const-string v2, "\u06e7\u06e4\u06e8"

    move/from16 v9, v37

    goto/16 :goto_f

    :cond_5c
    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v9, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    or-int/2addr v2, v9

    const v9, 0xdd5d

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_64
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v2, :cond_5d

    const-string v2, "\u06e6\u06df"

    move-object/from16 v9, v38

    :goto_27
    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v38, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_5d
    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v9, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    xor-int/2addr v2, v9

    const v9, 0x1ac626

    xor-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_5e
    :sswitch_65
    const-string v2, "\u06e7\u06e2\u06e4"

    goto/16 :goto_21

    :sswitch_66
    const-string v2, "\u06e5\u06df\u06e2"

    goto/16 :goto_16

    :sswitch_67
    sget-object v2, Lt9;->f:Ljava/util/Map;

    invoke-static/range {v46 .. v47}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    const-string v4, "dbiUVrWHH1Mttp9FzpgTXiyLg0P2hEQVZ/HfCw==\n"

    const-string v9, "Sd/xIpj3ej0=\n"

    invoke-static {v4, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v9, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    xor-int/lit16 v9, v9, -0x139e

    or-int/2addr v4, v9

    if-ltz v4, :cond_5f

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v4, "\u06e3\u06e5\u06e2"

    invoke-static {v4}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v9

    move-object v4, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :cond_5f
    move-object v4, v2

    goto/16 :goto_5

    :sswitch_68
    const-wide/16 v48, 0x0

    cmp-long v2, v46, v48

    if-nez v2, :cond_26

    const-string v2, "\u06e3\u06e3\u06e2"

    invoke-static {v2}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_69
    invoke-direct/range {p0 .. p0}, Lu9;->b()Ljava/lang/Object;

    move-result-object v2

    goto/16 :goto_23

    :sswitch_6a
    if-eqz v42, :cond_d

    :try_start_e
    sget-object v2, Lub0;->X:Ljava/lang/String;

    move-object/from16 v0, v42

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    move-result-object v9

    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    if-ltz v2, :cond_60

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v2, "\u06e4\u06e1\u06e4"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v35, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_60
    const-string v2, "\u06e7\u06e5\u06df"

    goto/16 :goto_1a

    :sswitch_6b
    const/16 v22, 0x0

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v2

    if-ltz v2, :cond_28

    const-string v2, "\u06e7\u06e5"

    invoke-static {v2}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_6c
    sget-object v2, Lxh;->n:Lxh;

    goto/16 :goto_23

    :sswitch_6d
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v9, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sub-int/2addr v2, v9

    const v9, 0x1abd17

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_6e
    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    move-result v2

    if-gtz v2, :cond_61

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v2, "\u06e5\u06e4\u06e3"

    invoke-static {v2}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    move/from16 v21, v22

    goto/16 :goto_0

    :cond_61
    const-string v2, "\u06e1\u06e6\u06e2"

    move/from16 v9, v22

    goto/16 :goto_11

    :sswitch_6f
    const/4 v9, 0x0

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    if-gtz v2, :cond_62

    const-string v2, "\u06e4\u06e5\u06e8"

    invoke-static {v2}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v38, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_62
    const-string v2, "\u06df\u06e0\u06e5"

    goto/16 :goto_27

    :sswitch_70
    :try_start_f
    sget-object v2, Lln;->i:Ljava/lang/reflect/Method;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    sget v9, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v19, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sub-int v9, v9, v19

    const v19, -0x1ab668

    xor-int v9, v9, v19

    move-object/from16 v43, v2

    move/from16 v48, v9

    goto/16 :goto_0

    :sswitch_71
    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v2

    if-ltz v2, :cond_63

    const-string v2, "\u06e4\u06df\u06e1"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v44, v38

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_63
    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v9, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sub-int/2addr v2, v9

    const v9, 0x1ac293

    add-int/2addr v2, v9

    move-object/from16 v44, v38

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_72
    const-string v2, "\u06e6\u06e6"

    goto/16 :goto_3

    :sswitch_73
    sget-object v2, Lln;->a:Lln;

    invoke-static/range {v16 .. v16}, Lln;->a(Ljava/lang/Object;)V

    sget-object v2, Lln;->e:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_2

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v21

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    move-result v2

    if-gtz v2, :cond_65

    :cond_64
    const-string v2, "\u06e8\u06e2"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_65
    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v9, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    xor-int/2addr v2, v9

    const v9, 0x1aaa32

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_74
    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v9, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    div-int/lit16 v9, v9, -0x63f

    add-int/2addr v2, v9

    if-gtz v2, :cond_66

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    const-string v2, "\u06e5\u06e2\u06e4"

    goto/16 :goto_26

    :cond_66
    const-string v2, "\u06e3\u06e4\u06e2"

    goto/16 :goto_15

    :sswitch_75
    const-string v2, "\u06df\u06df\u06e6"

    move-object/from16 v19, v2

    move-object/from16 v20, v16

    move/from16 v9, v18

    goto/16 :goto_13

    :sswitch_76
    const/16 v2, 0x22

    move/from16 v0, v21

    if-ne v0, v2, :cond_1d

    if-nez v18, :cond_1d

    sget-object v2, Lln;->c:Ljava/lang/reflect/Field;

    if-eqz v2, :cond_2e

    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v46

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v9, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    xor-int/lit16 v9, v9, -0x24b8

    mul-int/2addr v2, v9

    if-ltz v2, :cond_67

    const/16 v2, 0x54

    sput v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v2, "\u06e6\u06e4\u06e3"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_67
    const-string v2, "\u06e7\u06e8\u06e4"

    invoke-static {v2}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_77
    const/4 v2, 0x1

    aget-object v2, v25, v2

    instance-of v9, v2, Ljava/lang/Integer;

    if-eqz v9, :cond_18

    const-string v9, "nHOojufXZHScabDCpdEleZN1sMKz2yV0nWjpjLLYaTqGf7SH599qbp5vqsyO2nE=\n"

    const-string v14, "8gbE4se0BRo=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v14

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v2

    if-ltz v2, :cond_68

    const/16 v2, 0x12

    sput v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v2, "\u06e6\u06e3\u06df"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_68
    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v9, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    or-int/2addr v2, v9

    const v9, 0x1ab41f

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_78
    move-object/from16 v0, p0

    iget v0, v0, Lu9;->a:I

    move/from16 v19, v0

    const/4 v9, 0x0

    move-object/from16 v0, p0

    iget-object v3, v0, Lu9;->b:Ljava/lang/Object;

    const-string v2, "\u06e3\u06e7\u06e2"

    goto/16 :goto_1d

    :sswitch_79
    const/4 v15, -0x1

    const-string v2, "\u06e8\u06e7\u06e1"

    goto/16 :goto_15

    :sswitch_7a
    const/16 v26, 0x0

    const-string v2, "\u06e7\u06e0\u06e6"

    move-object/from16 v9, v39

    :goto_28
    invoke-static {v2}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v39, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_7b
    :try_start_10
    sget-object v9, Lub0;->a0:Ljava/lang/String;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v19, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    move/from16 v0, v19

    add-int/lit16 v0, v0, 0x913

    move/from16 v19, v0

    add-int v2, v2, v19

    if-gtz v2, :cond_69

    const/16 v2, 0x12

    sput v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    const-string v2, "\u06e8\u06e0\u06df"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v39, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_69
    const-string v2, "\u06e0\u06e2\u06e7"

    goto :goto_28

    :sswitch_7c
    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    if-ltz v2, :cond_6a

    const/16 v2, 0x30

    sput v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    const-string v2, "\u06e6\u06e6\u06e6"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_6a
    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v9, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    rem-int/2addr v2, v9

    const v9, 0x1ab613

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_7d
    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v9, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    add-int/lit16 v9, v9, 0x1fa2

    rem-int/2addr v2, v9

    if-ltz v2, :cond_6b

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v2, "\u06e8\u06e3\u06e4"

    move-object/from16 v9, v39

    goto :goto_28

    :cond_6b
    const-string v2, "\u06e4\u06e8\u06e3"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_6c
    :sswitch_7e
    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    if-gtz v2, :cond_6d

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    const-string v2, "\u06e5\u06e3"

    goto/16 :goto_a

    :cond_6d
    const-string v2, "\u06e7\u06e0\u06df"

    move-object/from16 v9, v35

    goto/16 :goto_1a

    :sswitch_7f
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v2

    if-gtz v2, :cond_6e

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v2, "\u06e6\u06df\u06e3"

    invoke-static {v2}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v48, v2

    goto/16 :goto_0

    :cond_6e
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v9, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    add-int/2addr v2, v9

    const v9, 0x1ac535

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_80
    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v9, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    mul-int/2addr v2, v9

    const v9, 0x18808b

    xor-int/2addr v2, v9

    move/from16 v48, v2

    move/from16 v18, v45

    goto/16 :goto_0

    :sswitch_81
    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v9, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    mul-int/2addr v2, v9

    const v9, 0x1af6eb

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_82
    sget-object v2, Lln;->i:Ljava/lang/reflect/Method;

    if-nez v2, :cond_3e

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v2, :cond_6f

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    goto/16 :goto_22

    :cond_6f
    const-string v2, "\u06e1\u06df\u06e5"

    goto/16 :goto_1b

    :cond_70
    :sswitch_83
    move-object/from16 v2, v25

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    move-result v9

    if-ltz v9, :cond_71

    const-string v9, "\u06e2\u06e0\u06e8"

    move-object/from16 v25, v2

    goto/16 :goto_1

    :cond_71
    const-string v9, "\u06e3\u06e7\u06e3"

    goto/16 :goto_14

    :sswitch_84
    const-string v2, "6hZiuKrdFNTGFVyakP0/3voKYria\n"

    const-string v9, "qX4DzP+UXLs=\n"

    invoke-static {v2, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v32

    invoke-static {v2, v0}, Ly9;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/16 v37, 0x0

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v9, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    mul-int/lit16 v9, v9, 0x1e2c

    div-int/2addr v2, v9

    if-eqz v2, :cond_72

    const-string v2, "\u06e5\u06df\u06e0"

    goto/16 :goto_6

    :cond_72
    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v9, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    add-int/2addr v2, v9

    const v9, 0x1abad1

    add-int/2addr v2, v9

    move/from16 v48, v2

    goto/16 :goto_0

    :sswitch_85
    const/4 v2, 0x3

    move/from16 v0, v37

    if-lt v0, v2, :cond_1d

    sget-object v2, Lkn;->a:Lkn;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v19, "voice_trans_"

    move-object/from16 v0, v19

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-wide/from16 v0, v46

    invoke-virtual {v9, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {v9, v2}, Lkn;->a(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_1d

    const-string v2, "\u06e7\u06e3\u06e3"

    goto/16 :goto_b

    :catchall_6
    move-exception v2

    goto/16 :goto_25

    :sswitch_data_0
    .sparse-switch
        0xdbe2 -> :sswitch_0
        0xdbe3 -> :sswitch_13
        0xdc1e -> :sswitch_38
        0xdc23 -> :sswitch_2
        0xdc24 -> :sswitch_1f
        0xdc25 -> :sswitch_75
        0xdc41 -> :sswitch_1b
        0xdc5c -> :sswitch_30
        0xdc65 -> :sswitch_74
        0xdca2 -> :sswitch_33
        0xdcb9 -> :sswitch_e
        0xdcc0 -> :sswitch_6
        0xdcde -> :sswitch_2e
        0xdcfa -> :sswitch_15
        0x1aa6ff -> :sswitch_48
        0x1aa705 -> :sswitch_1f
        0x1aa706 -> :sswitch_1f
        0x1aa724 -> :sswitch_71
        0x1aa73d -> :sswitch_c
        0x1aa740 -> :sswitch_3c
        0x1aa746 -> :sswitch_12
        0x1aa7be -> :sswitch_7
        0x1aa7d8 -> :sswitch_2a
        0x1aa7fb -> :sswitch_50
        0x1aa7fc -> :sswitch_1d
        0x1aa816 -> :sswitch_66
        0x1aaac5 -> :sswitch_3
        0x1aaadf -> :sswitch_26
        0x1aaae2 -> :sswitch_57
        0x1aaae4 -> :sswitch_27
        0x1aaafe -> :sswitch_f
        0x1aab1f -> :sswitch_43
        0x1aab20 -> :sswitch_55
        0x1aab25 -> :sswitch_34
        0x1aabbb -> :sswitch_49
        0x1aabc0 -> :sswitch_7e
        0x1aabdb -> :sswitch_37
        0x1aae83 -> :sswitch_63
        0x1aae87 -> :sswitch_58
        0x1aaea4 -> :sswitch_6e
        0x1aaec3 -> :sswitch_7b
        0x1aaee0 -> :sswitch_2d
        0x1aaee1 -> :sswitch_85
        0x1aaefd -> :sswitch_7f
        0x1aaf03 -> :sswitch_82
        0x1aaf3e -> :sswitch_1e
        0x1aaf5a -> :sswitch_4a
        0x1aaf5d -> :sswitch_17
        0x1aaf7a -> :sswitch_49
        0x1aaf80 -> :sswitch_20
        0x1aafa0 -> :sswitch_1f
        0x1ab246 -> :sswitch_4
        0x1ab264 -> :sswitch_7e
        0x1ab268 -> :sswitch_72
        0x1ab269 -> :sswitch_3b
        0x1ab284 -> :sswitch_3d
        0x1ab2e5 -> :sswitch_16
        0x1ab303 -> :sswitch_21
        0x1ab322 -> :sswitch_7f
        0x1ab323 -> :sswitch_6f
        0x1ab343 -> :sswitch_4d
        0x1ab35b -> :sswitch_3b
        0x1ab35c -> :sswitch_47
        0x1ab35f -> :sswitch_79
        0x1ab361 -> :sswitch_3f
        0x1ab605 -> :sswitch_64
        0x1ab609 -> :sswitch_7d
        0x1ab60b -> :sswitch_44
        0x1ab628 -> :sswitch_39
        0x1ab62a -> :sswitch_5e
        0x1ab647 -> :sswitch_30
        0x1ab661 -> :sswitch_81
        0x1ab666 -> :sswitch_5b
        0x1ab668 -> :sswitch_4f
        0x1ab682 -> :sswitch_a
        0x1ab69e -> :sswitch_6d
        0x1ab6a1 -> :sswitch_1f
        0x1ab6c0 -> :sswitch_7c
        0x1ab6c6 -> :sswitch_7a
        0x1ab6fc -> :sswitch_5c
        0x1ab6fe -> :sswitch_59
        0x1ab6ff -> :sswitch_77
        0x1ab71a -> :sswitch_5
        0x1ab71d -> :sswitch_62
        0x1ab71e -> :sswitch_1f
        0x1ab9c6 -> :sswitch_61
        0x1aba04 -> :sswitch_1
        0x1aba07 -> :sswitch_18
        0x1aba25 -> :sswitch_51
        0x1aba40 -> :sswitch_2f
        0x1aba41 -> :sswitch_1a
        0x1aba42 -> :sswitch_45
        0x1aba43 -> :sswitch_28
        0x1aba7e -> :sswitch_70
        0x1aba81 -> :sswitch_11
        0x1aba87 -> :sswitch_40
        0x1abaa1 -> :sswitch_69
        0x1abadc -> :sswitch_5c
        0x1abadf -> :sswitch_1f
        0x1abae0 -> :sswitch_6a
        0x1abd86 -> :sswitch_24
        0x1abd88 -> :sswitch_41
        0x1abd8b -> :sswitch_12
        0x1abda9 -> :sswitch_67
        0x1abde7 -> :sswitch_22
        0x1abe04 -> :sswitch_1
        0x1abe23 -> :sswitch_10
        0x1abe24 -> :sswitch_66
        0x1abe40 -> :sswitch_29
        0x1abe48 -> :sswitch_4e
        0x1abe62 -> :sswitch_1f
        0x1abe64 -> :sswitch_5b
        0x1abe81 -> :sswitch_44
        0x1ac149 -> :sswitch_5d
        0x1ac16c -> :sswitch_54
        0x1ac16d -> :sswitch_60
        0x1ac1c2 -> :sswitch_5a
        0x1ac1e5 -> :sswitch_65
        0x1ac1e8 -> :sswitch_46
        0x1ac204 -> :sswitch_3c
        0x1ac226 -> :sswitch_80
        0x1ac23e -> :sswitch_83
        0x1ac240 -> :sswitch_4d
        0x1ac244 -> :sswitch_19
        0x1ac25d -> :sswitch_4c
        0x1ac510 -> :sswitch_78
        0x1ac526 -> :sswitch_2c
        0x1ac52d -> :sswitch_23
        0x1ac52f -> :sswitch_1f
        0x1ac54e -> :sswitch_5f
        0x1ac566 -> :sswitch_36
        0x1ac567 -> :sswitch_2b
        0x1ac569 -> :sswitch_73
        0x1ac587 -> :sswitch_52
        0x1ac5ab -> :sswitch_14
        0x1ac5c1 -> :sswitch_3a
        0x1ac5c3 -> :sswitch_25
        0x1ac5c4 -> :sswitch_8
        0x1ac5c7 -> :sswitch_1c
        0x1ac603 -> :sswitch_35
        0x1ac604 -> :sswitch_68
        0x1ac623 -> :sswitch_9
        0x1ac8e7 -> :sswitch_32
        0x1ac927 -> :sswitch_31
        0x1ac92d -> :sswitch_39
        0x1ac948 -> :sswitch_53
        0x1ac949 -> :sswitch_84
        0x1ac94b -> :sswitch_76
        0x1ac94c -> :sswitch_4b
        0x1ac965 -> :sswitch_6c
        0x1ac96b -> :sswitch_56
        0x1ac984 -> :sswitch_1
        0x1ac986 -> :sswitch_b
        0x1ac989 -> :sswitch_6b
        0x1ac9a3 -> :sswitch_d
        0x1ac9c2 -> :sswitch_3e
        0x1ac9e2 -> :sswitch_42
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
