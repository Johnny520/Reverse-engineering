.class public abstract Ln9;
.super Ljava/lang/Object;


# static fields
.field public static a:Ljava/lang/Class;

.field public static b:Z

.field public static c:Ljava/lang/Boolean;

.field public static d:J

.field public static final e:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Ln9;->e:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 6

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e1\u06df"

    invoke-static {v1}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v1

    if-gtz v1, :cond_1

    sget v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    if-gtz v1, :cond_7

    const/16 v1, 0x63

    sput v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    const-string v1, "\u06df\u06e1\u06df"

    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v1

    if-gtz v1, :cond_0

    const-string v1, "\u06e1\u06e8\u06e7"

    invoke-static {v1}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/2addr v1, v2

    const v2, 0x1ac7fe

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    sget v1, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    mul-int/2addr v1, v2

    const v2, 0x19b6c5

    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    :sswitch_3
    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    move-result v1

    if-gtz v1, :cond_2

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    const-string v1, "\u06e6\u06e0\u06e4"

    :goto_1
    invoke-static {v1}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e7\u06df\u06e3"

    goto :goto_1

    :sswitch_4
    const-string v1, "ttXS\n"

    const-string v2, "wrS1oN8q1Zs=\n"

    const-string v3, "Dg==\n"

    const-string v4, "a4/9w+gFbuc=\n"

    invoke-static {v1, v2, p0, v3, v4}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    div-int/2addr v1, v2

    const v2, 0x1ac58b

    add-int/2addr v1, v2

    goto :goto_0

    :cond_3
    :sswitch_5
    sget v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    mul-int/lit16 v2, v2, -0x1d53

    rem-int/2addr v1, v2

    if-ltz v1, :cond_4

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    const-string v1, "\u06e7\u06e0\u06e8"

    :goto_2
    invoke-static {v1}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    const-string v1, "\u06e8\u06e3"

    goto :goto_2

    :sswitch_6
    const-string v0, "GzxsWEN92Ya0cxFxuNli9"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->۟ۡۦۤۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    if-gtz v1, :cond_6

    const/16 v1, 0x41

    sput v1, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    :cond_5
    const-string v1, "\u06e1\u06e3\u06e5"

    :goto_3
    invoke-static {v1}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_6
    sget v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    mul-int/2addr v1, v2

    const v2, 0x1b85d7

    add-int/2addr v1, v2

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e1\u06e8\u06e7"

    goto :goto_3

    :sswitch_7
    sget-object v1, Ln9;->e:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3

    sget v1, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    rem-int/lit16 v2, v2, 0x2e1

    add-int/2addr v1, v2

    if-ltz v1, :cond_5

    const/16 v1, 0x40

    sput v1, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v1, "\u06e4\u06e2\u06e8"

    invoke-static {v1}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "Nwje\n"

    const-string v2, "Q2m5jaPP2Zc=\n"

    const-string v3, " (\u9632\u6296)"

    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Fg==\n"

    const-string v5, "c8HJlSTQVfc=\n"

    invoke-static {v1, v2, v3, v4, v5}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    rem-int/lit16 v2, v2, -0x1b60

    xor-int/2addr v1, v2

    if-gtz v1, :cond_8

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    const-string v1, "\u06e6\u06e0\u06e7"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_8
    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sub-int/2addr v1, v2

    const v2, 0xdd2e

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcfb -> :sswitch_0
        0x1aa73d -> :sswitch_4
        0x1aaf03 -> :sswitch_8
        0x1aafa0 -> :sswitch_6
        0x1ab60b -> :sswitch_1
        0x1ab9cd -> :sswitch_3
        0x1aba2a -> :sswitch_5
        0x1ac16d -> :sswitch_2
        0x1ac50b -> :sswitch_9
        0x1ac58b -> :sswitch_7
    .end sparse-switch
.end method
