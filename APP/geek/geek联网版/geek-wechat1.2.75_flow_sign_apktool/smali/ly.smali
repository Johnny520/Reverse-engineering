.class public abstract Lly;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/Map;

.field public static final b:Ljava/util/Set;

.field public static final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public static d:I

.field public static e:I

.field public static f:F

.field public static final g:Lp00;

.field public static final h:Ljy;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, -0x1

    const-string v0, "\u06e6\u06df\u06e1"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Lp00;

    const-string v1, "zR9rmXnEODPl95VG61hJMr31klidUUhWy/bnSQ==\n"

    const-string v2, "lt3OdsZhZW8=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lp00;-><init>(Ljava/lang/String;)V

    sput-object v0, Lly;->g:Lp00;

    const-string v0, "\u06e4\u06e5\u06e7"

    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Ljy;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljy;-><init>(I)V

    sput-object v0, Lly;->h:Ljy;

    const-string v0, "\u06e7\u06e1\u06e7"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    sput v3, Lly;->e:I

    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    div-int/2addr v0, v1

    const v1, 0x1ab264

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/2addr v0, v1

    const v1, 0x1ac153

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    sput v3, Lly;->d:I

    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    mul-int/2addr v0, v1

    const v1, 0x1ae71e

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_5
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lly;->c:Ljava/util/concurrent/ConcurrentHashMap;

    sget v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v1, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    add-int/lit16 v1, v1, -0x1818

    div-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/16 v0, 0x3a

    sput v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    :cond_0
    const-string v0, "\u06e6\u06e4\u06e7"

    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_6
    const/high16 v0, -0x40800000    # -1.0f

    sput v0, Lly;->f:F

    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v1, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    div-int/lit16 v1, v1, 0x14b2

    sub-int/2addr v0, v1

    if-ltz v0, :cond_1

    const/16 v0, 0x43

    sput v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    const-string v0, "\u06e4\u06e7\u06e5"

    :goto_2
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    or-int/2addr v0, v1

    const v1, 0x1aa97f

    add-int/2addr v0, v1

    goto/16 :goto_0

    :sswitch_7
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lly;->a:Ljava/util/Map;

    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    add-int/lit16 v1, v1, 0x1bf0

    sub-int/2addr v0, v1

    if-ltz v0, :cond_2

    const/16 v0, 0x2f

    sput v0, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v0, "\u06e4\u06e2\u06e4"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_2
    const-string v0, "\u06e1\u06e8\u06e4"

    goto :goto_2

    :sswitch_8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lly;->b:Ljava/util/Set;

    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    div-int/lit16 v1, v1, 0x315

    xor-int/2addr v0, v1

    if-ltz v0, :cond_3

    const-string v0, "\u06e4\u06e5\u06e7"

    goto/16 :goto_1

    :cond_3
    const-string v0, "\u06e4\u06e7\u06e5"

    goto/16 :goto_1

    :sswitch_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa77d -> :sswitch_0
        0x1aaea1 -> :sswitch_3
        0x1aaf9d -> :sswitch_8
        0x1ab263 -> :sswitch_6
        0x1aba26 -> :sswitch_2
        0x1aba86 -> :sswitch_1
        0x1abac2 -> :sswitch_5
        0x1ac148 -> :sswitch_7
        0x1ac1e9 -> :sswitch_4
        0x1ac54d -> :sswitch_9
    .end sparse-switch
.end method
