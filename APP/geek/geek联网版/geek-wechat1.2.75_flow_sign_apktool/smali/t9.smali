.class public abstract Lt9;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final b:Ljava/util/Map;

.field public static c:Ljava/lang/Object;

.field public static final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final e:Ljava/util/Map;

.field public static final f:Ljava/util/Map;

.field public static g:I

.field public static final h:Ls9;

.field public static final i:Ljava/util/Date;

.field public static final j:Lp00;

.field public static final k:Lp00;

.field public static final l:Lp00;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v2, 0x0

    const-string v0, "\u06e8\u06e6\u06e3"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v1, v2

    move v3, v2

    move v4, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Lf8;

    invoke-direct {v0, v1}, Lf8;-><init>(I)V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/2addr v0, v4

    const v4, 0x1aadfb

    add-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Lf8;

    invoke-direct {v0, v3}, Lf8;-><init>(I)V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lt9;->f:Ljava/util/Map;

    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    rem-int/lit16 v4, v4, -0x11e7

    div-int/2addr v0, v4

    if-eqz v0, :cond_0

    const-string v0, "\u06e8\u06df\u06e2"

    :goto_1
    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06df\u06df\u06e1"

    goto :goto_1

    :sswitch_2
    new-instance v0, Lp00;

    const-string v4, "R9pEiwJ55GEH2DCbZmGSOXfFQoRdeJ0=\n"

    const-string v5, "Kr5xtiBRvwA=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Lp00;-><init>(Ljava/lang/String;)V

    sput-object v0, Lt9;->k:Lp00;

    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    mul-int/2addr v0, v4

    const v4, 0x1a8da1

    add-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :sswitch_3
    sget v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    xor-int/lit8 v0, v0, 0x79

    sget v3, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    div-int/lit16 v4, v4, 0x1d46

    xor-int/2addr v3, v4

    if-gtz v3, :cond_1

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v3, "\u06df\u06df\u06e1"

    invoke-static {v3}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v4

    move v3, v0

    goto :goto_0

    :cond_1
    sget v3, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    div-int/2addr v3, v4

    const v4, 0x1aa704

    xor-int/2addr v4, v3

    move v3, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    xor-int/lit16 v0, v0, 0x448

    const-string v1, "\u06e0\u06e1\u06e0"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move v1, v0

    goto :goto_0

    :sswitch_5
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lt9;->d:Ljava/util/concurrent/ConcurrentHashMap;

    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    xor-int/2addr v0, v4

    const v4, -0x1acbad

    xor-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_6
    new-instance v0, Lf8;

    invoke-direct {v0, v3}, Lf8;-><init>(I)V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lt9;->e:Ljava/util/Map;

    const-string v0, "\u06e8\u06e5\u06e4"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_7
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    sput-object v0, Lt9;->i:Ljava/util/Date;

    const-string v0, "\u06e2\u06e5\u06e4"

    goto :goto_2

    :sswitch_8
    new-instance v0, Lp00;

    const-string v4, "UeNQgE+DgZsnuyCdPZy6\n"

    const-string v5, "CoJ95g6ux6s=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Lp00;-><init>(Ljava/lang/String;)V

    sput-object v0, Lt9;->l:Lp00;

    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    or-int/2addr v0, v4

    const v4, 0x1aab87

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lt9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    div-int/2addr v0, v4

    const v4, 0x1aabd5

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_a
    new-instance v0, Ls9;

    invoke-direct {v0, v2}, Ls9;-><init>(I)V

    sput-object v0, Lt9;->h:Ls9;

    const-string v0, "\u06e5\u06e7\u06e1"

    goto :goto_2

    :sswitch_b
    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    move-result v0

    if-gtz v0, :cond_2

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v0, "\u06e4\u06e3\u06e5"

    goto :goto_2

    :cond_2
    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    div-int/2addr v0, v4

    const v4, 0x1ac9a7

    xor-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_c
    new-instance v0, Lp00;

    const-string v4, "oS7Ee4kITkq8XsHFem+SvLxK\n"

    const-string v5, "4XWaJ/rqzs8=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Lp00;-><init>(Ljava/lang/String;)V

    sput-object v0, Lt9;->j:Lp00;

    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    mul-int/lit16 v4, v4, 0x2201

    sub-int/2addr v0, v4

    if-ltz v0, :cond_3

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    const-string v0, "\u06df\u06e5\u06e3"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    rem-int/2addr v0, v4

    const v4, 0x1aba07

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_d
    new-instance v0, Lf8;

    invoke-direct {v0, v1}, Lf8;-><init>(I)V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lt9;->b:Ljava/util/Map;

    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/lit8 v4, v4, 0x74

    mul-int/2addr v0, v4

    if-ltz v0, :cond_4

    const-string v0, "\u06e7\u06e6\u06e0"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v4, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    xor-int/2addr v0, v4

    const v4, 0x1ab1ea

    xor-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_e
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa701 -> :sswitch_0
        0x1aa708 -> :sswitch_6
        0x1aa7bd -> :sswitch_b
        0x1aaae1 -> :sswitch_a
        0x1aaae4 -> :sswitch_e
        0x1aaaff -> :sswitch_d
        0x1aabd9 -> :sswitch_4
        0x1ab267 -> :sswitch_5
        0x1ab301 -> :sswitch_c
        0x1aba64 -> :sswitch_2
        0x1abe7f -> :sswitch_7
        0x1ac5e1 -> :sswitch_8
        0x1ac8cb -> :sswitch_3
        0x1ac987 -> :sswitch_1
        0x1ac9a5 -> :sswitch_9
    .end sparse-switch
.end method
