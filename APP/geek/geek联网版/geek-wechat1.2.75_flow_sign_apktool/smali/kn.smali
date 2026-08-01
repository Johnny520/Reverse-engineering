.class public final Lkn;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lkn;

.field public static b:Landroid/app/Application;

.field public static c:Lio/fastkv/FastKV;

.field public static d:Ljava/lang/String;

.field public static e:Ljava/lang/String;

.field public static f:Ljava/lang/ref/WeakReference;

.field public static final g:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final i:Lsd;

.field public static j:Lqp;

.field public static k:Lw40;

.field public static final l:Ljava/lang/String;

.field public static final m:Landroid/os/Handler;

.field public static final n:Lgn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e8\u06e1"

    invoke-static {v1}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Ln50;

    invoke-direct {v0}, Ln50;-><init>()V

    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    if-gtz v1, :cond_2

    :cond_0
    const-string v1, "\u06e0\u06e4\u06e4"

    :goto_1
    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    add-int/lit16 v2, v2, -0xb26

    xor-int/2addr v1, v2

    if-gtz v1, :cond_1

    const-string v1, "\u06df\u06e4\u06e1"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    or-int/2addr v1, v2

    const v2, 0xdcfa

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    rem-int/2addr v1, v2

    const v2, 0x1aaf01

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    sget-object v1, Lyg;->a:Lyf;

    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    rem-int/lit16 v2, v2, 0x12b8

    mul-int/2addr v1, v2

    if-gtz v1, :cond_3

    const-string v1, "\u06e6\u06e6"

    :goto_3
    invoke-static {v1}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    sget v1, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sub-int/2addr v1, v2

    const v2, 0x1aaf0f

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    new-instance v1, Lgn;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lgn;-><init>(I)V

    sput-object v1, Lkn;->n:Lgn;

    const-string v1, "\u06e1\u06e4\u06e2"

    goto :goto_2

    :sswitch_4
    const-string v1, ""

    sput-object v1, Lkn;->e:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    move-result v1

    if-ltz v1, :cond_4

    const/16 v1, 0x4c

    sput v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v1, "\u06e8\u06e1"

    invoke-static {v1}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    sget v1, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    div-int/2addr v1, v2

    const v2, 0x1ab700

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lkn;->m:Landroid/os/Handler;

    const-string v1, "\u06e4\u06e3\u06e2"

    goto :goto_3

    :sswitch_6
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v1, Lkn;->h:Ljava/util/concurrent/ConcurrentHashMap;

    sget v1, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    if-ltz v1, :cond_5

    const-string v1, "\u06e0\u06e0\u06e6"

    :goto_4
    invoke-static {v1}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e4\u06e4"

    goto :goto_4

    :sswitch_7
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v1, Lkn;->g:Ljava/util/concurrent/ConcurrentHashMap;

    sget v1, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    or-int/lit16 v2, v2, 0xd3a

    rem-int/2addr v1, v2

    if-gtz v1, :cond_0

    const-string v1, "\u06e7\u06e2\u06e6"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "yFxMnRHl7XvcVkLbHPv4Os8ddOM5zsEQ9HBu/TvG0g==\n"

    const-string v2, "qzMhs32PlVU=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lkn;->l:Ljava/lang/String;

    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    div-int/2addr v1, v2

    const v2, 0x1ab268

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_9
    sget-object v1, Lps;->a:Lno;

    invoke-static {v0, v1}, Lg80;->C(Lfe;Lhe;)Lhe;

    move-result-object v1

    invoke-static {v1}, Lgf;->c(Lhe;)Lsd;

    move-result-object v1

    sput-object v1, Lkn;->i:Lsd;

    const-string v1, "\u06e6\u06e6"

    goto/16 :goto_1

    :sswitch_a
    new-instance v1, Lkn;

    invoke-direct {v1}, Lkn;-><init>()V

    sput-object v1, Lkn;->a:Lkn;

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v1

    if-gtz v1, :cond_6

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v1, "\u06e4\u06e3\u06e2"

    invoke-static {v1}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e5\u06e3"

    goto/16 :goto_1

    :sswitch_b
    const-string v1, ""

    sput-object v1, Lkn;->d:Ljava/lang/String;

    sget v1, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    add-int/2addr v1, v2

    const v2, 0x1ab46d

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_c
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc80 -> :sswitch_0
        0xdc9e -> :sswitch_b
        0xdcc0 -> :sswitch_5
        0xdcf9 -> :sswitch_8
        0x1aaae6 -> :sswitch_9
        0x1aab60 -> :sswitch_6
        0x1aaf01 -> :sswitch_2
        0x1aaf1f -> :sswitch_c
        0x1ab268 -> :sswitch_a
        0x1ab665 -> :sswitch_4
        0x1ab700 -> :sswitch_7
        0x1aba43 -> :sswitch_3
        0x1ac56b -> :sswitch_1
    .end sparse-switch
.end method

.method public static a(Ljava/lang/String;Z)Z
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e5\u06e6"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    if-eqz v1, :cond_1

    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    mul-int/lit16 v2, v2, 0x1e8e

    xor-int/2addr v0, v2

    if-ltz v0, :cond_0

    const/16 v0, 0x1e

    sput v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    :cond_0
    const-string v0, "\u06e5\u06e4\u06e1"

    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    invoke-virtual {v1, p0, p1}, Lio/fastkv/FastKV;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    :sswitch_2
    return p1

    :cond_1
    :sswitch_3
    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    if-gtz v0, :cond_2

    const-string v0, "\u06e6\u06e7\u06e2"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e8\u06e6"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_4
    const-string v0, "fYvI\n"

    const-string v2, "Fu6xhXiG918=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    mul-int/lit16 v2, v2, 0x2563

    add-int/2addr v0, v2

    if-ltz v0, :cond_3

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v0, "\u06df\u06df\u06e7"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e3\u06e6\u06e0"

    goto :goto_1

    :sswitch_5
    sget-object v0, Lkn;->c:Lio/fastkv/FastKV;

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int/2addr v1, v2

    const v2, 0xdb63

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_6
    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v0

    if-gtz v0, :cond_4

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    const-string v0, "\u06e1\u06e7\u06e5"

    goto :goto_1

    :cond_4
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    rem-int/2addr v0, v2

    const v2, 0x1aa833

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc65 -> :sswitch_0
        0xdcfe -> :sswitch_2
        0x1aa707 -> :sswitch_6
        0x1aa7c0 -> :sswitch_4
        0x1ab6dd -> :sswitch_5
        0x1abe22 -> :sswitch_1
        0x1ac8ce -> :sswitch_3
    .end sparse-switch
.end method

.method public static b(Ljava/lang/String;I)I
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e7\u06e1"

    invoke-static {v1}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Lkn;->c:Lio/fastkv/FastKV;

    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    add-int/2addr v1, v2

    const v2, 0x1abf5e

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_1
    invoke-virtual {v0, p0, p1}, Lio/fastkv/FastKV;->getInt(Ljava/lang/String;I)I

    move-result p1

    :sswitch_2
    return p1

    :sswitch_3
    const-string v1, "gQWp\n"

    const-string v2, "6mDQzwUy7lo=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v1, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    mul-int/2addr v1, v2

    const v2, 0x1f6b70

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget v1, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    if-gtz v1, :cond_0

    const/16 v1, 0x56

    sput v1, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v1, "\u06e0\u06df\u06df"

    invoke-static {v1}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/2addr v1, v2

    const v2, -0x1aad8f

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    if-eqz v0, :cond_2

    sget v1, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    add-int/lit16 v2, v2, -0x2355

    sub-int/2addr v1, v2

    if-gtz v1, :cond_1

    const-string v1, "\u06e8\u06e0\u06df"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    div-int/2addr v1, v2

    const v2, 0x1abe06

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_2
    :sswitch_6
    sget v1, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    add-int/2addr v1, v2

    const v2, 0x1aca3f

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aab20 -> :sswitch_0
        0x1aaf7b -> :sswitch_3
        0x1abe06 -> :sswitch_1
        0x1ac146 -> :sswitch_6
        0x1ac18d -> :sswitch_4
        0x1ac227 -> :sswitch_5
        0x1ac8e7 -> :sswitch_2
    .end sparse-switch
.end method

.method public static c(Landroid/widget/TextView;)Ljava/lang/String;
    .locals 12

    const/4 v5, 0x0

    const/4 v10, 0x0

    const-string v0, "\u06df\u06e2"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v11

    move-object v2, v5

    move-object v3, v5

    move-object v1, v5

    move-object v7, v5

    move-object v4, v5

    move-object v9, v5

    move-object v6, v5

    move-object v8, v5

    move-object v0, v5

    :goto_0
    sparse-switch v11, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v5, "DekwNw==\n"

    const-string v10, "e4BVQFx5H6k=\n"

    invoke-static {v5, v10}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v5

    sget v10, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v11, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    or-int/2addr v10, v11

    const v11, -0xdc6e

    xor-int/2addr v11, v10

    move v10, v5

    goto :goto_0

    :sswitch_1
    sget v5, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v11, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    add-int/lit16 v11, v11, 0x58b

    or-int/2addr v5, v11

    if-ltz v5, :cond_0

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    const-string v5, "\u06e6\u06e0\u06e7"

    invoke-static {v5}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto :goto_0

    :cond_0
    sget v5, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v11, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    xor-int/2addr v5, v11

    const v11, 0xdf81

    add-int/2addr v5, v11

    move v11, v5

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v5, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v11, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    xor-int/2addr v5, v11

    const v11, 0x1ac61a

    add-int/2addr v5, v11

    move v11, v5

    goto :goto_0

    :sswitch_3
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    rem-int/lit16 v4, v4, -0xc79

    xor-int/2addr v0, v4

    if-gtz v0, :cond_3

    move-object v4, v5

    move-object v0, v5

    :cond_2
    const-string v5, "\u06e2\u06e4\u06e4"

    :goto_1
    invoke-static {v5}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto :goto_0

    :cond_3
    sget v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    div-int/2addr v0, v4

    const v4, 0x1aaf7e

    add-int v11, v0, v4

    move-object v4, v5

    move-object v0, v5

    goto :goto_0

    :sswitch_4
    const-string v5, "\u06e0\u06e1\u06e8"

    move-object v8, v9

    goto :goto_1

    :sswitch_5
    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v5, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    or-int/lit16 v5, v5, 0xaf2

    xor-int/2addr v0, v5

    if-ltz v0, :cond_4

    const-string v0, "\u06e4\u06e6\u06e0"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v5

    move-object v0, v6

    move v11, v5

    goto :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v5, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    rem-int/2addr v0, v5

    const v5, 0xdc33

    add-int/2addr v5, v0

    move-object v0, v6

    move v11, v5

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    move-result v5

    if-gtz v5, :cond_5

    const/16 v5, 0x15

    sput v5, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v5, "\u06e7\u06e6\u06e2"

    invoke-static {v5}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06e5\u06e4\u06e8"

    :goto_2
    invoke-static {v5}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto/16 :goto_0

    :sswitch_7
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v10}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v9

    sget v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v11, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    div-int/lit16 v11, v11, 0x5f7

    xor-int/2addr v5, v11

    if-ltz v5, :cond_6

    const/16 v5, 0x2e

    sput v5, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v5, "\u06e2\u06e5\u06e4"

    invoke-static {v5}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto/16 :goto_0

    :cond_6
    sget v5, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v11, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    xor-int/2addr v5, v11

    const v11, 0x1aafbb

    xor-int/2addr v5, v11

    move v11, v5

    goto/16 :goto_0

    :sswitch_8
    sget v5, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v11, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    rem-int/lit16 v11, v11, 0x12df

    xor-int/2addr v5, v11

    if-ltz v5, :cond_7

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    const-string v5, "\u06e0\u06e5"

    goto :goto_2

    :cond_7
    sget v5, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v11, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    add-int/2addr v5, v11

    const v11, -0x1aa8a4

    xor-int/2addr v5, v11

    move v11, v5

    goto/16 :goto_0

    :sswitch_9
    if-nez v4, :cond_9

    sget v5, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v11, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    add-int/lit16 v11, v11, 0x814

    mul-int/2addr v5, v11

    if-ltz v5, :cond_8

    const/16 v5, 0x38

    sput v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v5, "\u06e7\u06e6\u06e4"

    :goto_3
    invoke-static {v5}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06e1\u06df\u06e7"

    :goto_4
    invoke-static {v5}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto/16 :goto_0

    :cond_9
    :sswitch_a
    sget v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    if-ltz v5, :cond_a

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v5, "\u06e8\u06e0\u06e6"

    goto :goto_4

    :cond_a
    sget v5, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v11, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int/2addr v5, v11

    const v11, -0xddf8

    xor-int/2addr v5, v11

    move v11, v5

    goto/16 :goto_0

    :cond_b
    :sswitch_b
    sget v5, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v11, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    xor-int/lit16 v11, v11, 0xd49

    add-int/2addr v5, v11

    if-ltz v5, :cond_c

    const-string v5, "\u06e7\u06e6\u06e0"

    invoke-static {v5}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto/16 :goto_0

    :cond_c
    sget v5, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v11, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    mul-int/2addr v5, v11

    const v11, -0x1ab5cd

    xor-int/2addr v5, v11

    move v11, v5

    goto/16 :goto_0

    :sswitch_c
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Lkn;->h:Ljava/util/concurrent/ConcurrentHashMap;

    sget v5, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v5, :cond_2

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    const-string v5, "\u06e0\u06e1"

    :goto_5
    invoke-static {v5}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto/16 :goto_0

    :sswitch_d
    sget v5, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/lit16 v5, v5, 0x2d0

    ushr-int v5, v10, v5

    const/16 v11, 0x7f

    if-eq v5, v11, :cond_e

    sget v5, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    if-gtz v5, :cond_d

    const-string v5, "\u06e1\u06e7\u06e0"

    invoke-static {v5}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto/16 :goto_0

    :cond_d
    sget v5, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v11, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    rem-int/2addr v5, v11

    const v11, 0xdbf8

    add-int/2addr v5, v11

    move v11, v5

    goto/16 :goto_0

    :sswitch_e
    check-cast v0, Ljava/lang/String;

    :goto_6
    return-object v0

    :sswitch_f
    const-string v0, ""

    goto :goto_6

    :cond_e
    :sswitch_10
    sget v5, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v11, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    xor-int/2addr v5, v11

    const v11, 0x1aacc3

    add-int/2addr v5, v11

    move v11, v5

    goto/16 :goto_0

    :sswitch_11
    const-string v5, "\u06e7\u06e6\u06e2"

    invoke-static {v5}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto/16 :goto_0

    :sswitch_12
    invoke-virtual {v3, v2, v8}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_b

    sget v5, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v11, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    div-int/lit16 v11, v11, -0x2688

    xor-int/2addr v5, v11

    if-ltz v5, :cond_f

    const-string v5, "\u06e1\u06e6\u06e6"

    invoke-static {v5}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto/16 :goto_0

    :cond_f
    const-string v5, "\u06e7\u06df\u06e5"

    goto :goto_5

    :sswitch_13
    sget v5, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v11, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    xor-int/lit16 v11, v11, 0x21d2

    rem-int/2addr v5, v11

    if-ltz v5, :cond_10

    const-string v5, "\u06e1\u06e5\u06e6"

    invoke-static {v5}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto/16 :goto_0

    :cond_10
    const-string v5, "\u06e1\u06df\u06e7"

    invoke-static {v5}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-result v5

    if-ltz v5, :cond_11

    const-string v5, "\u06e2\u06e5\u06e7"

    invoke-static {v5}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v5

    move-object v6, v7

    move v11, v5

    goto/16 :goto_0

    :cond_11
    const-string v5, "\u06e6\u06e7\u06e7"

    move-object v6, v7

    goto/16 :goto_1

    :catch_0
    move-exception v5

    sget v5, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v8, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int/lit16 v8, v8, -0x13fc

    rem-int/2addr v5, v8

    if-gtz v5, :cond_12

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v5, "\u06e2\u06e5"

    invoke-static {v5}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    move-object v8, v1

    move v11, v5

    goto/16 :goto_0

    :cond_12
    const-string v5, "\u06e2\u06e7\u06df"

    move-object v8, v1

    goto/16 :goto_5

    :sswitch_15
    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    rem-int/lit16 v5, v5, -0x2630

    add-int/2addr v0, v5

    if-ltz v0, :cond_13

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v0, "\u06e6\u06e7\u06e7"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v5

    move-object v0, v8

    move v11, v5

    goto/16 :goto_0

    :cond_13
    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v5, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    or-int/2addr v0, v5

    const v5, 0x1ab79e

    add-int/2addr v5, v0

    move-object v0, v8

    move v11, v5

    goto/16 :goto_0

    :sswitch_16
    const-string v1, ""

    const/4 v5, -0x1

    if-eq v10, v5, :cond_1

    sget v5, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v11, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    add-int/lit16 v11, v11, 0x949

    add-int/2addr v5, v11

    if-gtz v5, :cond_14

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    const-string v5, "\u06e0\u06df\u06e2"

    invoke-static {v5}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto/16 :goto_0

    :cond_14
    sget v5, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v11, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    add-int/2addr v5, v11

    const v11, -0xddad

    xor-int/2addr v5, v11

    move v11, v5

    goto/16 :goto_0

    :sswitch_17
    const-string v5, "pmKsfoBEEeXpKfYf2w==\n"

    const-string v11, "wQfYMfIUZJE=\n"

    invoke-static {v5, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lmp;->f(Ljava/lang/String;Ljava/lang/Object;)V

    sget v5, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v11, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    div-int/lit16 v11, v11, -0x1bb3

    sub-int/2addr v5, v11

    if-gtz v5, :cond_15

    const-string v5, "\u06e7\u06df\u06e5"

    invoke-static {v5}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v5

    move v11, v5

    goto/16 :goto_0

    :cond_15
    const-string v5, "\u06df\u06e3\u06e8"

    goto/16 :goto_3

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe3 -> :sswitch_0
        0xdbe9 -> :sswitch_11
        0xdc01 -> :sswitch_1
        0xdc43 -> :sswitch_17
        0xdc64 -> :sswitch_16
        0xdcdb -> :sswitch_d
        0x1aa784 -> :sswitch_e
        0x1aaac3 -> :sswitch_c
        0x1aab07 -> :sswitch_12
        0x1aae89 -> :sswitch_7
        0x1aaf20 -> :sswitch_a
        0x1aaf61 -> :sswitch_4
        0x1aaf7a -> :sswitch_9
        0x1ab2c3 -> :sswitch_2
        0x1ab2e2 -> :sswitch_3
        0x1ab301 -> :sswitch_13
        0x1ab304 -> :sswitch_10
        0x1ab33a -> :sswitch_8
        0x1aba9e -> :sswitch_8
        0x1ababc -> :sswitch_6
        0x1abda7 -> :sswitch_14
        0x1abe29 -> :sswitch_a
        0x1ac246 -> :sswitch_5
        0x1ac266 -> :sswitch_b
        0x1ac50d -> :sswitch_15
        0x1ac5e3 -> :sswitch_2
        0x1ac5e5 -> :sswitch_f
    .end sparse-switch
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    const-string v1, "\u06df\u06df\u06df"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    move-object v2, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Lkn;->c:Lio/fastkv/FastKV;

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v2

    if-ltz v2, :cond_4

    const/16 v2, 0x56

    sput v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    const-string v2, "\u06e7\u06e8\u06e6"

    invoke-static {v2}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v0

    goto :goto_0

    :sswitch_1
    if-eqz v2, :cond_7

    sget v0, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v3, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    add-int/lit16 v3, v3, 0xfd6

    or-int/2addr v0, v3

    if-ltz v0, :cond_0

    :cond_0
    const-string v0, "\u06e6\u06e8\u06e8"

    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    const-string v0, "\u06e8\u06e0\u06e7"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v3, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    rem-int/2addr v0, v3

    const v3, 0x1aa9d2

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_3
    const-string v0, "ljzf\n"

    const-string v3, "/VmmcwVz3Ps=\n"

    const-string v4, "IuxUpGoA\n"

    const-string v5, "Roky8gtsPhQ=\n"

    invoke-static {v0, v3, p0, v4, v5}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v3, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    or-int/lit16 v3, v3, 0x1964

    xor-int/2addr v0, v3

    if-gtz v0, :cond_3

    const/16 v0, 0x61

    sput v0, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    :cond_2
    const-string v0, "\u06e8\u06df\u06e7"

    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v3, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sub-int/2addr v0, v3

    const v3, 0xde30

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :cond_4
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v3, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    mul-int/2addr v2, v3

    const v3, 0x145306

    add-int/2addr v3, v2

    move-object v2, v0

    goto :goto_0

    :sswitch_4
    if-nez v1, :cond_5

    sget v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v3, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    or-int/lit16 v3, v3, 0x1896

    xor-int/2addr v0, v3

    if-ltz v0, :cond_2

    const/16 v0, 0x1f

    sput v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    const-string v0, "\u06e0\u06e6\u06e6"

    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :sswitch_5
    move-object p1, v1

    :sswitch_6
    return-object p1

    :cond_5
    :sswitch_7
    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    mul-int/lit16 v3, v3, 0x1bc3

    mul-int/2addr v0, v3

    if-ltz v0, :cond_6

    const/16 v0, 0x4c

    sput v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v0, "\u06e1\u06e5\u06df"

    :goto_1
    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_6
    sget v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v3, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    xor-int/2addr v0, v3

    const v3, 0x1aab15

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :cond_7
    :sswitch_8
    const-string v0, "\u06e7\u06e6\u06e4"

    goto :goto_1

    :sswitch_9
    invoke-virtual {v2, p0, p1}, Lio/fastkv/FastKV;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v0

    if-ltz v0, :cond_8

    const/16 v0, 0x51

    sput v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    const-string v0, "\u06e0\u06e2\u06e7"

    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v3, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sub-int/2addr v0, v3

    const v3, 0x1aaad1    # 2.449E-39f

    xor-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_a
    sget v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v3, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    div-int/2addr v0, v3

    const v3, 0x1aa6ff

    add-int/2addr v0, v3

    move v3, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdbe6 -> :sswitch_0
        0xdcbc -> :sswitch_a
        0x1aa6ff -> :sswitch_3
        0x1aa7d9 -> :sswitch_8
        0x1aab25 -> :sswitch_5
        0x1aaba0 -> :sswitch_4
        0x1ac247 -> :sswitch_7
        0x1ac266 -> :sswitch_9
        0x1ac5e5 -> :sswitch_6
        0x1ac625 -> :sswitch_8
        0x1ac8d0 -> :sswitch_2
        0x1ac8ef -> :sswitch_1
    .end sparse-switch
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 5

    const/4 v1, 0x0

    const-string v0, "\u06e2\u06e8\u06df"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e2\u06e8\u06df"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    const-string v0, "y2PJ\n"

    const-string v2, "oAawZQ72FxA=\n"

    const-string v3, "TcaRoi+LFEhHz7eQKZQPT1Q=\n"

    const-string v4, "JqPo/Ujneyo=\n"

    invoke-static {v0, v2, p0, v3, v4}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lkn;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    rem-int/2addr v0, v2

    const v2, -0x1aaf0a

    xor-int/2addr v0, v2

    goto :goto_0

    :cond_0
    :sswitch_2
    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    add-int/lit16 v2, v2, -0xebc

    div-int/2addr v0, v2

    if-eqz v0, :cond_1

    const-string v0, "\u06e4\u06e1\u06e5"

    :goto_1
    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e1\u06e5\u06e8"

    goto :goto_1

    :sswitch_3
    invoke-static {p0, v1}, Lkn;->a(Ljava/lang/String;Z)Z

    move-result v0

    :goto_2
    return v0

    :sswitch_4
    move v0, v1

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab83 -> :sswitch_0
        0x1aae85 -> :sswitch_2
        0x1aaf44 -> :sswitch_3
        0x1aaf61 -> :sswitch_4
        0x1ab359 -> :sswitch_1
    .end sparse-switch
.end method

.method public static f(Ljava/lang/String;Z)V
    .locals 8

    const/4 v1, 0x0

    const-string v0, "\u06e8\u06e0\u06e8"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v1

    move-object v0, v1

    move-object v2, v1

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    if-eqz v2, :cond_2

    sget v1, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    if-gtz v1, :cond_1

    const-string v1, "\u06e6\u06e1\u06e0"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :sswitch_1
    const-string v1, "MaAY\n"

    const-string v4, "WsVhLmnzkVg=\n"

    invoke-static {v1, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    div-int/2addr v1, v4

    const v4, 0x1ab284

    xor-int/2addr v1, v4

    move v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move-result v1

    if-ltz v1, :cond_0

    const-string v1, "\u06e7\u06e8\u06e1"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v4, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    xor-int/2addr v1, v4

    const v4, 0x1acbcc

    add-int/2addr v1, v4

    move v4, v1

    goto :goto_0

    :cond_1
    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sub-int/2addr v1, v4

    const v4, 0x1aac64

    add-int/2addr v1, v4

    move v4, v1

    goto :goto_0

    :cond_2
    :sswitch_3
    const-string v1, "\u06e0\u06e5\u06e4"

    goto :goto_1

    :sswitch_4
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-result v1

    if-gtz v1, :cond_3

    const-string v1, "\u06e0\u06e5\u06e4"

    invoke-static {v1}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :cond_3
    sget v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sub-int/2addr v1, v4

    const v4, -0x1ab1fa

    xor-int/2addr v1, v4

    move v4, v1

    goto :goto_0

    :sswitch_5
    invoke-virtual {v2, p0, p1}, Lio/fastkv/FastKV;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    sget v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    xor-int/lit16 v4, v4, -0x1f6

    xor-int/2addr v1, v4

    if-gtz v1, :cond_4

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    const-string v1, "\u06df\u06e8\u06e1"

    invoke-static {v1}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06e0\u06e5\u06e4"

    goto :goto_1

    :sswitch_6
    const-wide/16 v4, -0x1b0

    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    int-to-long v6, v1

    xor-long/2addr v4, v6

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v1

    if-gtz v1, :cond_6

    const/16 v1, 0x55

    sput v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    move-object v1, v2

    :cond_5
    const-string v2, "\u06df\u06e0\u06e6"

    invoke-static {v2}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v4

    move-object v2, v1

    goto/16 :goto_0

    :cond_6
    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    or-int/2addr v1, v4

    const v4, 0x1aa705

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_7
    sget-object v0, Lkn;->m:Landroid/os/Handler;

    const-string v1, "\u06e7\u06df\u06e0"

    goto/16 :goto_1

    :sswitch_8
    sget-object v1, Lkn;->c:Lio/fastkv/FastKV;

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    div-int/lit16 v4, v4, 0x1194

    xor-int/2addr v2, v4

    if-ltz v2, :cond_5

    const-string v4, "\u06e0\u06e1\u06e5"

    move-object v2, v1

    :goto_2
    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :sswitch_9
    sget-object v1, Lkn;->n:Lgn;

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    move-result v3

    if-ltz v3, :cond_7

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    const-string v3, "\u06e2\u06e1\u06e3"

    invoke-static {v3}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v1

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e1\u06df\u06e7"

    move-object v3, v1

    goto :goto_2

    :sswitch_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa725 -> :sswitch_0
        0x1aa818 -> :sswitch_5
        0x1aab04 -> :sswitch_a
        0x1aab7f -> :sswitch_7
        0x1aae89 -> :sswitch_4
        0x1ab284 -> :sswitch_8
        0x1ab2df -> :sswitch_6
        0x1aba23 -> :sswitch_3
        0x1ac185 -> :sswitch_2
        0x1ac508 -> :sswitch_9
        0x1ac8f0 -> :sswitch_1
    .end sparse-switch
.end method

.method public static g(Ljava/lang/String;I)V
    .locals 8

    const/4 v3, 0x0

    const-string v0, "\u06e0\u06e8\u06e2"

    invoke-static {v0}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move-object v2, v3

    move-object v0, v3

    move-object v1, v3

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v2, Lkn;->m:Landroid/os/Handler;

    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    add-int/lit16 v4, v4, 0x9be

    mul-int/2addr v3, v4

    if-ltz v3, :cond_2

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    const-string v3, "\u06e0\u06e8\u06e2"

    invoke-static {v3}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v3

    move v4, v3

    goto :goto_0

    :sswitch_1
    sget-object v1, Lkn;->n:Lgn;

    sget v3, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    div-int/lit16 v4, v4, -0xf3d

    xor-int/2addr v3, v4

    if-ltz v3, :cond_1

    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    :cond_0
    const-string v3, "\u06e4\u06e3"

    invoke-static {v3}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v3

    move v4, v3

    goto :goto_0

    :cond_1
    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    xor-int/2addr v3, v4

    const v4, 0x1abc3b

    add-int/2addr v3, v4

    move v4, v3

    goto :goto_0

    :sswitch_2
    if-eqz v0, :cond_4

    const-string v3, "\u06e1\u06e7\u06e2"

    :goto_1
    invoke-static {v3}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v3

    move v4, v3

    goto :goto_0

    :sswitch_3
    const-string v3, "gkhm\n"

    const-string v4, "6S0f4xYYTHs=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v3

    if-gtz v3, :cond_3

    :cond_2
    const-string v3, "\u06e6\u06e4\u06e2"

    invoke-static {v3}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v3

    move v4, v3

    goto :goto_0

    :cond_3
    sget v3, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    rem-int/2addr v3, v4

    const v4, 0x1aa454

    add-int/2addr v3, v4

    move v4, v3

    goto :goto_0

    :sswitch_4
    const-wide/16 v4, 0x14a

    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    int-to-long v6, v3

    xor-long/2addr v4, v6

    invoke-virtual {v2, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    sget v3, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    div-int/lit16 v4, v4, -0x14ed

    sub-int/2addr v3, v4

    if-ltz v3, :cond_6

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v3, "\u06df\u06e6\u06df"

    invoke-static {v3}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v3

    move v4, v3

    goto/16 :goto_0

    :sswitch_5
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-string v3, "\u06e7\u06e7\u06e1"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v3

    move v4, v3

    goto/16 :goto_0

    :sswitch_6
    sget v3, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    rem-int/2addr v3, v4

    const v4, 0x1aab81

    xor-int/2addr v3, v4

    move v4, v3

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {v0, p0, p1}, Lio/fastkv/FastKV;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    sget v3, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    or-int/lit16 v4, v4, 0xdf

    rem-int/2addr v3, v4

    if-gtz v3, :cond_0

    const-string v3, "\u06e5\u06e1\u06e7"

    invoke-static {v3}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v3

    move v4, v3

    goto/16 :goto_0

    :cond_4
    :sswitch_8
    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    move-result v3

    if-ltz v3, :cond_5

    const-string v3, "\u06e0\u06e2\u06e2"

    goto :goto_1

    :cond_5
    const-string v3, "\u06e4\u06e3"

    goto :goto_1

    :sswitch_9
    sget-object v0, Lkn;->c:Lio/fastkv/FastKV;

    sget v3, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    add-int/lit16 v4, v4, -0x22ba

    sub-int/2addr v3, v4

    if-gtz v3, :cond_7

    const/4 v3, 0x4

    sput v3, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    :cond_6
    const-string v3, "\u06e5\u06e5\u06e0"

    :goto_2
    invoke-static {v3}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v3

    move v4, v3

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e7\u06e1\u06e7"

    goto :goto_2

    :sswitch_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7f -> :sswitch_0
        0x1aa7d8 -> :sswitch_9
        0x1aabda -> :sswitch_3
        0x1aaf7c -> :sswitch_7
        0x1abadb -> :sswitch_6
        0x1abdcb -> :sswitch_5
        0x1abe40 -> :sswitch_a
        0x1ac1e4 -> :sswitch_1
        0x1ac54d -> :sswitch_2
        0x1ac601 -> :sswitch_4
        0x1ac602 -> :sswitch_8
    .end sparse-switch
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e4"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v0

    move-object v4, v0

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v1, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    move-result v0

    if-ltz v0, :cond_6

    :goto_1
    const-string v0, "\u06e4\u06e4\u06e7"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v0, :cond_1

    const-string v0, "\u06e5\u06e4\u06e5"

    :goto_2
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e2\u06df\u06e2"

    goto :goto_2

    :sswitch_2
    const-string v0, "X9qp\n"

    const-string v2, "NL/QATIgjHQ=\n"

    const-string v5, "oWkpvMo=\n"

    const-string v6, "1whFya/3aCg=\n"

    invoke-static {v0, v2, p0, v5, v6}, Lg40;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    add-int/lit16 v2, v2, 0x101b

    xor-int/2addr v0, v2

    if-gtz v0, :cond_3

    const/16 v0, 0x8

    sput v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    move-object v0, v1

    :cond_2
    const-string v2, "\u06e0\u06e8\u06e3"

    move-object v1, v0

    :goto_3
    invoke-static {v2}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e5\u06e5\u06e2"

    move-object v2, v0

    goto :goto_3

    :sswitch_3
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    div-int/lit16 v2, v2, -0x140e

    xor-int/2addr v0, v2

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    const-string v0, "\u06e5\u06e8\u06e0"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    mul-int/2addr v0, v2

    const v2, -0xbd33a

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget-object v0, Lkn;->c:Lio/fastkv/FastKV;

    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    if-ltz v2, :cond_7

    const-string v2, "\u06e2\u06e3\u06e3"

    invoke-static {v2}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v0

    goto :goto_0

    :sswitch_5
    const-wide/16 v6, 0x109

    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    int-to-long v8, v0

    xor-long/2addr v6, v8

    invoke-virtual {v1, v4, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    :sswitch_6
    invoke-virtual {v3, p0, p1}, Lio/fastkv/FastKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    div-int/2addr v0, v2

    const v2, 0x1ab247

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    sget-object v0, Lkn;->n:Lgn;

    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    rem-int/lit16 v4, v4, 0x1e3

    add-int/2addr v2, v4

    if-gtz v2, :cond_5

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v2, "\u06e2\u06df\u06e2"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v4, v0

    goto/16 :goto_0

    :cond_5
    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    or-int/2addr v2, v4

    const v4, 0xda09

    add-int/2addr v2, v4

    move-object v4, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    xor-int/2addr v0, v2

    const v2, 0x1aa964

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    if-eqz v3, :cond_0

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    move-result v0

    if-ltz v0, :cond_8

    move-object v0, v3

    :cond_7
    const-string v2, "\u06e2\u06e7\u06e2"

    invoke-static {v2}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sub-int/2addr v0, v2

    const v2, 0x1ab012

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    sget-object v0, Lkn;->m:Landroid/os/Handler;

    sget v1, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    mul-int/lit16 v2, v2, -0x12d5

    div-int/2addr v1, v2

    if-eqz v1, :cond_2

    const/16 v1, 0x59

    sput v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v1, "\u06df\u06e6\u06e8"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_a
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc08 -> :sswitch_0
        0xdc80 -> :sswitch_2
        0x1aa7e1 -> :sswitch_5
        0x1aab7a -> :sswitch_6
        0x1aabdb -> :sswitch_7
        0x1ab245 -> :sswitch_9
        0x1ab2c2 -> :sswitch_1
        0x1ab33d -> :sswitch_8
        0x1aba67 -> :sswitch_a
        0x1abaa5 -> :sswitch_3
        0x1abe42 -> :sswitch_4
    .end sparse-switch
.end method

.method public static i(Landroid/view/View;I)V
    .locals 3

    const/4 v1, 0x0

    const-string v0, "\u06e6\u06df\u06e5"

    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    or-int/lit16 v2, v2, 0x2174

    div-int/2addr v0, v2

    if-ltz v0, :cond_7

    const-string v0, "\u06e3\u06e3\u06e8"

    :goto_1
    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    if-gtz v0, :cond_1

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v0, "\u06e0\u06e6\u06e8"

    :goto_2
    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    xor-int/2addr v0, v2

    const v2, 0x1aac2a

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/lit16 v0, v0, -0x287

    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    move-result v0

    if-gtz v0, :cond_a

    const-string v0, "\u06e4\u06e2\u06e2"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    const-string v0, "loMyd26Ahqq"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟ۢۨۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const-string v0, "\u06e0\u06e6\u06e8"

    :goto_3
    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    move-result v0

    if-gtz v0, :cond_2

    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    rem-int/lit16 v2, v2, 0xce4

    div-int/2addr v0, v2

    if-gtz v0, :cond_4

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v0, "\u06df\u06e5\u06df"

    invoke-static {v0}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_5
    const-string v0, "SqkJbg==\n"

    const-string v2, "PMBsGeHY/9g=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e3\u06e3\u06e5"

    goto :goto_1

    :cond_2
    :sswitch_6
    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    move-result v0

    if-gtz v0, :cond_3

    const-string v0, "\u06e0\u06df\u06e7"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab3db

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_7
    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    if-ltz v0, :cond_5

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    :cond_4
    const-string v0, "\u06e3\u06e2\u06e8"

    :goto_4
    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sub-int/2addr v0, v2

    const v2, 0x1ac692

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_8
    sget v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    xor-int/lit16 v0, v0, -0x1ca

    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    sget v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v0, :cond_6

    const-string v0, "\u06e0\u06e3\u06e2"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e3\u06e6\u06e8"

    goto :goto_4

    :cond_7
    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    xor-int/2addr v0, v2

    const v2, 0x1aaf6c

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_9
    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    xor-int/lit16 v0, v0, 0x1b2

    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    const-string v0, "\u06e5\u06e0\u06df"

    goto :goto_4

    :cond_8
    :sswitch_a
    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    move-result v0

    if-gtz v0, :cond_9

    const/16 v0, 0x2e

    sput v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    const-string v0, "\u06e2\u06e3\u06df"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06e0\u06e3\u06e2"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_b
    const/4 v0, 0x1

    if-eq p1, v0, :cond_c

    sget v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    or-int/lit16 v2, v2, 0x2077

    div-int/2addr v0, v2

    if-ltz v0, :cond_b

    const/16 v0, 0x3f

    sput v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    :cond_a
    const-string v0, "\u06e6\u06e4\u06e5"

    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_b
    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    mul-int/2addr v0, v2

    const v2, 0x115318

    add-int/2addr v0, v2

    goto/16 :goto_0

    :cond_c
    :sswitch_c
    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int/lit16 v2, v2, 0x94f

    or-int/2addr v0, v2

    if-gtz v0, :cond_d

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v0, "\u06e1\u06e0\u06e6"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_d
    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    rem-int/2addr v0, v2

    const v2, 0x1abede

    add-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_d
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_8

    const-string v0, "\u06e7\u06df\u06e6"

    goto/16 :goto_2

    :sswitch_e
    sget v0, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    xor-int/lit8 v0, v0, -0x28

    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    sget v0, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab919

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_f
    sget v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    div-int/lit16 v2, v2, -0x1e59

    sub-int/2addr v0, v2

    if-ltz v0, :cond_e

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    const-string v0, "\u06e6\u06e7\u06e3"

    goto/16 :goto_3

    :cond_e
    sget v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    add-int/2addr v0, v2

    const v2, -0x1ac185

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_10
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7b9 -> :sswitch_0
        0x1aa7bd -> :sswitch_7
        0x1aab3f -> :sswitch_e
        0x1aaba2 -> :sswitch_1
        0x1aae87 -> :sswitch_10
        0x1aaf5e -> :sswitch_8
        0x1ab33c -> :sswitch_6
        0x1ab669 -> :sswitch_3
        0x1ab685 -> :sswitch_d
        0x1ab6e5 -> :sswitch_10
        0x1aba24 -> :sswitch_10
        0x1abda4 -> :sswitch_4
        0x1abdcc -> :sswitch_f
        0x1abea4 -> :sswitch_9
        0x1ac14c -> :sswitch_5
        0x1ac1e7 -> :sswitch_10
        0x1ac50e -> :sswitch_b
        0x1ac56d -> :sswitch_c
        0x1ac944 -> :sswitch_2
        0x1ac986 -> :sswitch_a
    .end sparse-switch
.end method

.method public static j(Ljava/lang/String;Ljm;)V
    .locals 5

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06df\u06e3"

    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v1, "\u06e8\u06e0\u06e7"

    :goto_1
    invoke-static {v1}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v0, "06ke\n"

    const-string v1, "p8h5VTpLcuY=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "tw==\n"

    const-string v1, "0vI8ySRxU5w=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :sswitch_1
    return-void

    :sswitch_2
    :try_start_0
    invoke-interface {p1}, Ljm;->a()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v1, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    or-int/lit16 v2, v2, -0x2096

    div-int/2addr v1, v2

    if-gtz v1, :cond_0

    const/16 v1, 0x1b

    sput v1, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    :cond_0
    const-string v1, "\u06e0\u06e2\u06e4"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    :sswitch_3
    sget v1, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    if-gtz v1, :cond_2

    const/16 v1, 0x46

    sput v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v1, "\u06e0\u06e8\u06e5"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e8\u06e0\u06e7"

    invoke-static {v1}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_4
    const-string v0, "nquDL4BPHDyHCkC31GMuqHjp"

    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۢۡۥۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    rem-int/lit16 v2, v2, 0x15d5

    div-int/2addr v1, v2

    if-gtz v1, :cond_3

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    const-string v1, "\u06e8\u06df\u06df"

    goto :goto_1

    :cond_3
    sget v1, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/2addr v1, v2

    const v2, 0xe06e

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v1

    if-ltz v1, :cond_1

    const-string v1, "\u06e2\u06e5\u06e6"

    goto :goto_1

    :sswitch_6
    sget v1, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    xor-int/lit16 v2, v2, -0xd73

    mul-int/2addr v1, v2

    if-ltz v1, :cond_4

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v1, "\u06e7\u06df"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06e2\u06e8\u06e2"

    invoke-static {v1}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_7
    sget v1, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    if-ltz v1, :cond_5

    const/16 v1, 0x58

    sput v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    const-string v1, "\u06e2\u06df\u06df"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    sget v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    xor-int/2addr v1, v2

    const v2, 0x1aa7c9

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "bdYc\n"

    const-string v2, "Gbd7MCENE9g=\n"

    const-string v3, "MI5Od4o=\n"

    const-string v4, "UuIhFOEuZWs=\n"

    invoke-static {v1, v2, p0, v3, v4}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    div-int/lit16 v2, v2, 0xfd8

    mul-int/2addr v1, v2

    if-eqz v1, :cond_6

    const/16 v1, 0x35

    sput v1, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    :cond_6
    const-string v1, "\u06e2\u06e8\u06e2"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_9
    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sub-int/2addr v1, v2

    const v2, -0x1abbc3

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdbe1 -> :sswitch_0
        0x1aab22 -> :sswitch_5
        0x1ab303 -> :sswitch_4
        0x1ab35c -> :sswitch_2
        0x1ab6be -> :sswitch_6
        0x1ab9c4 -> :sswitch_9
        0x1ab9c8 -> :sswitch_8
        0x1abe43 -> :sswitch_3
        0x1ac8c8 -> :sswitch_7
        0x1ac8ef -> :sswitch_1
    .end sparse-switch
.end method

.method public static k(Landroid/content/Context;Ljava/lang/String;)V
    .locals 47

    const/4 v10, 0x0

    const/16 v36, 0x0

    const/16 v32, 0x0

    const/16 v19, 0x0

    const/4 v5, 0x0

    const/16 v29, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/16 v27, 0x0

    const/4 v6, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x0

    const/16 v37, 0x0

    const/16 v34, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v45, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v11, 0x0

    const/16 v26, 0x0

    const/16 v25, 0x0

    const/16 v20, 0x0

    const/16 v33, 0x0

    const/4 v13, 0x0

    const/16 v24, 0x0

    const/4 v12, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v28, 0x0

    const/16 v16, 0x0

    const/16 v31, 0x0

    const/16 v44, 0x0

    const/16 v30, 0x0

    const-string v39, "\u06e1\u06e8\u06e1"

    invoke-static/range {v39 .. v39}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v46

    move-object/from16 v39, v4

    move-object/from16 v40, v8

    move-object/from16 v41, v9

    move-object/from16 v42, v28

    move-object/from16 v43, v29

    :goto_0
    sparse-switch v46, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v4, "jyVNLQ68GJyd\n"

    const-string v8, "rGB7HD+NKa0=\n"

    invoke-static {v4, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v0, v37

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-static {v4}, Lmp;->p(F)F

    move-result v4

    move-object/from16 v0, v37

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    const/4 v4, 0x1

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    const-string v8, "oZLLHst/z7zE\n"

    const-string v9, "gqD9WI05ifo=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    move-object/from16 v0, v37

    invoke-virtual {v0, v4, v8}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    move-object/from16 v0, v35

    move-object/from16 v1, v37

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/high16 v4, 0x41f00000    # 30.0f

    invoke-static {v4}, Lmp;->p(F)F

    move-result v4

    move-object/from16 v0, v35

    invoke-virtual {v0, v4}, Landroid/view/View;->setElevation(F)V

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v4

    if-gtz v4, :cond_45

    const/16 v4, 0x40

    sput v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v4, "\u06e8\u06e3\u06e7"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v34, v8

    move/from16 v46, v4

    goto :goto_0

    :sswitch_1
    if-nez v36, :cond_43

    move-object/from16 v4, v35

    move-object/from16 v32, v36

    :cond_0
    const-string v8, "\u06e7\u06e8"

    invoke-static {v8}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v35, v4

    move/from16 v46, v8

    goto :goto_0

    :sswitch_2
    const/4 v4, 0x0

    move-object/from16 v0, v30

    move-object/from16 v1, p1

    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    move-object/from16 v4, v25

    move/from16 v8, v26

    :goto_1
    const-string v25, "\u06e8\u06e2\u06e4"

    move-object/from16 v9, v27

    move-object/from16 v28, v25

    move-object/from16 v29, v4

    move/from16 v26, v8

    :goto_2
    invoke-static/range {v28 .. v28}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v27, v9

    move-object/from16 v25, v29

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_3
    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    move-result v4

    if-gtz v4, :cond_1

    const/16 v4, 0x19

    sput v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v4, "\u06e2\u06e0\u06e6"

    invoke-static {v4}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v7, v43

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_1
    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v7, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    add-int/2addr v4, v7

    const v7, 0x1acefa

    add-int/2addr v4, v7

    move-object/from16 v7, v43

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_4
    move-object/from16 v0, v35

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    new-instance v8, Landroid/widget/TextView;

    invoke-direct {v8, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v9, "Xwl7nf9SaoZTEkWY4mhp\n"

    const-string v14, "K2Ya7osNHuM=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/high16 v9, 0x41580000    # 13.5f

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextSize(F)V

    const-string v9, "l/71IGzWkg==\n"

    const-string v14, "tLjAZlmQpyY=\n"

    invoke-static {v9, v14}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v9

    if-gtz v9, :cond_2

    move-object/from16 v9, v16

    :goto_3
    const-string v14, "\u06e8\u06e7"

    invoke-static {v14}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v28

    move-object v14, v4

    move-object v15, v8

    move-object/from16 v16, v9

    move/from16 v46, v28

    goto/16 :goto_0

    :cond_2
    sget v9, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v14, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    div-int/2addr v9, v14

    const v14, 0x1ab666

    add-int/2addr v9, v14

    move-object v14, v4

    move-object v15, v8

    move/from16 v46, v9

    goto/16 :goto_0

    :sswitch_5
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v41

    invoke-virtual {v4, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v8, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    or-int/2addr v4, v8

    const v8, 0x1ab708

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_6
    const/4 v4, 0x0

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v8

    if-ltz v8, :cond_3

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    const-string v8, "\u06e8\u06e0\u06e0"

    invoke-static {v8}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v43, v4

    move/from16 v46, v8

    goto/16 :goto_0

    :cond_3
    const-string v8, "\u06e0\u06e8\u06e5"

    invoke-static {v8}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v43, v4

    move/from16 v46, v8

    goto/16 :goto_0

    :sswitch_7
    const/high16 v4, 0x41700000    # 15.0f

    move-object/from16 v0, v22

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextSize(F)V

    const-string v4, "CzBpTLhDZA==\n"

    const-string v8, "KABZDYwFInE=\n"

    invoke-static {v4, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v0, v22

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    xor-int/lit16 v4, v4, -0x3cd

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static/range {v38 .. v38}, Lmp;->q(I)I

    move-result v9

    iput v9, v8, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    move-object/from16 v0, v22

    invoke-virtual {v0, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget v8, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v9, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    mul-int/lit16 v9, v9, -0x2380

    xor-int/2addr v8, v9

    if-gtz v8, :cond_4

    const-string v8, "\u06e0\u06e8\u06e5"

    invoke-static {v8}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v45, v4

    move/from16 v46, v8

    goto/16 :goto_0

    :cond_4
    sget v8, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v9, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    xor-int/2addr v8, v9

    const v9, 0x1ac47b

    add-int/2addr v8, v9

    move/from16 v45, v4

    move/from16 v46, v8

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual/range {v17 .. v17}, Lo40;->c()V

    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v8, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    rem-int/lit16 v8, v8, 0xf00

    mul-int/2addr v4, v8

    if-ltz v4, :cond_5

    const/16 v4, 0xb

    sput v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v4, "\u06e7\u06e0\u06e3"

    move-object v8, v4

    move-object/from16 v9, v17

    :goto_4
    invoke-static {v8}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v17, v9

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e4\u06e5\u06e0"

    :goto_5
    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_6
    :sswitch_9
    const-string v4, "\u06e8\u06e3\u06e7"

    goto :goto_5

    :sswitch_a
    const-string v4, "L/gaVbkth7E1/1lL8TqLtjE=\n"

    const-string v8, "XJl0JpRe4sM=\n"

    invoke-static {v4, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x0

    invoke-static {v4, v8}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v4

    const/4 v8, 0x1

    invoke-virtual {v15, v4, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const v4, 0x3ca3d70a    # 0.02f

    invoke-virtual {v15, v4}, Landroid/widget/TextView;->setLetterSpacing(F)V

    invoke-virtual {v14, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/view/View;

    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    move/from16 v0, v45

    move/from16 v1, v45

    invoke-direct {v8, v0, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v9, 0x31

    iput v9, v8, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    sget v9, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v28, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    rem-int v9, v9, v28

    const v28, 0x1aa762

    xor-int v9, v9, v28

    move-object/from16 v39, v8

    move-object/from16 v40, v4

    move/from16 v46, v9

    goto/16 :goto_0

    :sswitch_b
    const/4 v9, 0x0

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    move-result v4

    if-ltz v4, :cond_7

    const/16 v4, 0x5c

    sput v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v4, "\u06e8\u06e5\u06df"

    move-object/from16 v8, v19

    :goto_6
    invoke-static {v4}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v19, v8

    move-object/from16 v20, v9

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_7
    sget v4, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v8, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    mul-int/2addr v4, v8

    const v8, 0x133af6

    add-int/2addr v4, v8

    move-object/from16 v20, v9

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_c
    sget v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v5, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    div-int/lit16 v5, v5, -0x9ee

    mul-int/2addr v4, v5

    if-eqz v4, :cond_8

    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    const-string v4, "\u06e4\u06e7\u06e0"

    invoke-static {v4}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v5, v32

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_8
    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v5, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    div-int/2addr v4, v5

    const v5, 0x1ab6c3

    add-int/2addr v4, v5

    move-object/from16 v5, v32

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_d
    const-string v4, "\u06e7\u06e0\u06e3"

    move-object/from16 v9, v20

    move/from16 v28, v34

    :goto_7
    invoke-static {v4}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v33, v9

    move/from16 v34, v28

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_e
    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    const/high16 v8, 0x42700000    # 60.0f

    invoke-static {v8}, Lmp;->p(F)F

    move-result v8

    neg-float v8, v8

    invoke-virtual {v4, v8}, Landroid/view/View;->setTranslationY(F)V

    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    const/4 v8, 0x0

    invoke-virtual {v4, v8}, Landroid/view/View;->setAlpha(F)V

    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    const v8, 0x3f59999a    # 0.85f

    invoke-virtual {v4, v8}, Landroid/view/View;->setScaleX(F)V

    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    const v8, 0x3f59999a    # 0.85f

    invoke-virtual {v4, v8}, Landroid/view/View;->setScaleY(F)V

    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual {v4, v8}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const-wide/16 v8, 0x2b3

    sget v28, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    move/from16 v0, v28

    int-to-long v0, v0

    move-wide/from16 v28, v0

    xor-long v8, v8, v28

    invoke-virtual {v4, v8, v9}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/ViewPropertyAnimator;->start()V

    new-instance v4, Lo40;

    iget-object v8, v6, Lp00;->b:Ljava/lang/Object;

    sget-object v9, Lo40;->n:Lsh;

    invoke-direct {v4, v8, v9}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    sget v8, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v9, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    or-int/2addr v8, v9

    const v9, 0x1aab0a

    add-int/2addr v8, v9

    move-object/from16 v42, v4

    move/from16 v46, v8

    goto/16 :goto_0

    :sswitch_f
    move-object v4, v11

    :cond_9
    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v8

    if-gtz v8, :cond_a

    const-string v8, "\u06e3\u06e8\u06df"

    :goto_8
    invoke-static {v8}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v8

    move-object v11, v4

    move/from16 v46, v8

    goto/16 :goto_0

    :cond_a
    sget v8, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v9, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sub-int/2addr v8, v9

    const v9, 0x1aa9fd

    xor-int/2addr v8, v9

    move-object v11, v4

    move/from16 v46, v8

    goto/16 :goto_0

    :sswitch_10
    const/4 v4, 0x0

    const/high16 v8, 0x43480000    # 200.0f

    const v9, 0x3f19999a    # 0.6f

    invoke-static {v4, v8, v9}, Lg40;->f(FFF)Lp40;

    move-result-object v4

    move-object/from16 v0, v42

    iput-object v4, v0, Lo40;->k:Lp40;

    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    move/from16 v0, v26

    move-object/from16 v1, v42

    invoke-virtual {v4, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual/range {v42 .. v42}, Lo40;->h()V

    new-instance v9, Lo40;

    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    sget-object v8, Lo40;->o:Lsh;

    invoke-direct {v9, v4, v8}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v8, 0x43480000    # 200.0f

    const v16, 0x3f19999a    # 0.6f

    move/from16 v0, v16

    invoke-static {v4, v8, v0}, Lg40;->f(FFF)Lp40;

    move-result-object v4

    iput-object v4, v9, Lo40;->k:Lp40;

    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    invoke-virtual {v4, v13, v9}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    sget v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v8, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    add-int/lit16 v8, v8, 0xce1

    or-int/2addr v4, v8

    if-gtz v4, :cond_b

    const-string v4, "\u06e3\u06e3"

    invoke-static {v4}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v16, v9

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_b
    move-object v4, v14

    move-object v8, v15

    goto/16 :goto_3

    :cond_c
    :sswitch_11
    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    if-ltz v4, :cond_d

    const-string v9, "\u06e5\u06e1\u06e1"

    move-object/from16 v4, v22

    move-object/from16 v8, v23

    :goto_9
    invoke-static {v9}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v22, v4

    move-object/from16 v23, v8

    move/from16 v46, v9

    goto/16 :goto_0

    :cond_d
    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v8, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/2addr v4, v8

    const v8, 0x1ac01a

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_12
    const/4 v8, 0x0

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v4

    if-ltz v4, :cond_27

    const-string v4, "\u06e2\u06e5"

    :goto_a
    invoke-static {v4}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v24, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_e
    :sswitch_13
    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v4

    if-ltz v4, :cond_f

    const-string v4, "\u06df\u06e5\u06df"

    invoke-static {v4}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_f
    sget v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v8, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    rem-int/2addr v4, v8

    const v8, -0x1aa6b7

    xor-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_14
    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/ViewPropertyAnimator;->cancel()V

    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    const v8, 0x7e110303

    sget v9, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    xor-int/2addr v8, v9

    invoke-virtual {v4, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v9, v4, Lo40;

    if-eqz v9, :cond_1c

    check-cast v4, Lo40;

    sget v9, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    if-ltz v9, :cond_10

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    goto/16 :goto_1

    :cond_10
    sget v9, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v25, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    div-int v9, v9, v25

    const v25, 0xdc61

    add-int v9, v9, v25

    move-object/from16 v25, v4

    move/from16 v26, v8

    move/from16 v46, v9

    goto/16 :goto_0

    :sswitch_15
    if-eqz v5, :cond_41

    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    move-result v4

    if-nez v4, :cond_41

    invoke-virtual {v5}, Landroid/app/Activity;->isDestroyed()Z

    move-result v4

    if-eqz v4, :cond_12

    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v8, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    xor-int/lit16 v8, v8, 0x89c

    xor-int/2addr v4, v8

    if-gtz v4, :cond_11

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    const-string v4, "\u06e2\u06e4"

    invoke-static {v4}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_11
    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v8, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sub-int/2addr v4, v8

    const v8, 0x1ac5cc

    xor-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_12
    :sswitch_16
    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v4

    if-ltz v4, :cond_13

    const/16 v4, 0x24

    sput v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    const-string v4, "\u06e1\u06e3"

    move-object/from16 v8, v30

    :goto_b
    invoke-static {v4}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v30, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_13
    sget v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v8, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    add-int/2addr v4, v8

    const v8, 0x1ab12f

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_17
    const-string v4, "\u06e8\u06e7\u06e2"

    :goto_c
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_18
    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget-object v8, Lkn;->i:Lsd;

    const/4 v9, 0x0

    xor-int/lit16 v4, v4, 0x3ce

    move-object/from16 v0, v31

    invoke-static {v8, v9, v0, v4}, Lg80;->u(Lpe;Lhe;Lym;I)Lw40;

    move-result-object v4

    sput-object v4, Lkn;->j:Lqp;

    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v8, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    or-int/2addr v4, v8

    const v8, 0x1ab8fd

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_19
    invoke-virtual/range {v33 .. v33}, Lo40;->c()V

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    move-result v4

    if-ltz v4, :cond_14

    const-string v4, "\u06e0\u06e3\u06e5"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_14
    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v8, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    mul-int/2addr v4, v8

    const v8, 0x2d3e2

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_1a
    sget-object v4, Lkn;->b:Landroid/app/Application;

    if-eqz v4, :cond_20

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    move-result v8

    if-gtz v8, :cond_15

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v8, "\u06e8\u06e6\u06e4"

    invoke-static {v8}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v44, v4

    move-object/from16 v30, v10

    move/from16 v46, v8

    goto/16 :goto_0

    :cond_15
    const-string v8, "\u06e3\u06df\u06e7"

    invoke-static {v8}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v44, v4

    move-object/from16 v30, v10

    move/from16 v46, v8

    goto/16 :goto_0

    :sswitch_1b
    if-eqz v33, :cond_18

    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v8, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    add-int/2addr v4, v8

    const v8, 0x1ab68f

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_1c
    move-object/from16 v0, v40

    move-object/from16 v1, v39

    invoke-virtual {v7, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v8, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    or-int/lit16 v8, v8, -0x1bf6

    add-int/2addr v4, v8

    if-ltz v4, :cond_16

    const/16 v4, 0x25

    sput v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v4, "\u06e0\u06e8\u06e3"

    invoke-static {v4}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_16
    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v8, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/2addr v4, v8

    const v8, -0x1ab2cd

    xor-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_1d
    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    const v8, 0x7e11019d

    sget v9, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int v13, v8, v9

    invoke-virtual {v4, v13}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v8, v4, Lo40;

    if-eqz v8, :cond_e

    check-cast v4, Lo40;

    const-string v9, "\u06e0\u06e4\u06e1"

    move-object v8, v11

    move-object v12, v4

    :goto_d
    invoke-static {v9}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v4

    move-object v11, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_1e
    if-eqz v12, :cond_6

    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    if-ltz v4, :cond_17

    const/16 v4, 0x31

    sput v4, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v4, "\u06e7\u06e7\u06e6"

    invoke-static {v4}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_17
    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v8, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    or-int/2addr v4, v8

    const v8, 0x1aaeaa

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_18
    :sswitch_1f
    const-string v4, "\u06e5\u06e7"

    move-object v9, v4

    :goto_e
    invoke-static {v9}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_20
    invoke-virtual/range {v16 .. v16}, Lo40;->h()V

    new-instance v8, Lo40;

    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    sget-object v9, Lo40;->p:Lsh;

    invoke-direct {v8, v4, v9}, Lo40;-><init>(Ljava/lang/Object;Lgf;)V

    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v9, 0x43480000    # 200.0f

    const v28, 0x3f19999a    # 0.6f

    move/from16 v0, v28

    invoke-static {v4, v9, v0}, Lg40;->f(FFF)Lp40;

    move-result-object v4

    iput-object v4, v8, Lo40;->k:Lp40;

    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    move/from16 v0, v18

    invoke-virtual {v4, v0, v8}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v8}, Lo40;->h()V

    new-instance v4, Ljn;

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-direct/range {v4 .. v9}, Ljn;-><init>(Landroid/app/Activity;Lp00;Landroid/view/ViewGroup;Lvd;I)V

    sget v8, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    if-ltz v8, :cond_19

    const-string v9, "\u06e8\u06e7\u06e4"

    move-object v8, v4

    move-object/from16 v28, v32

    :goto_f
    invoke-static {v9}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v31, v8

    move-object/from16 v32, v28

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_19
    const-string v8, "\u06e4\u06e7\u06e5"

    :goto_10
    invoke-static {v8}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v31, v4

    move/from16 v46, v8

    goto/16 :goto_0

    :sswitch_21
    const/16 v21, 0x0

    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v8, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/lit16 v8, v8, -0x17c3

    or-int/2addr v4, v8

    if-ltz v4, :cond_1a

    const-string v4, "\u06e6\u06df\u06e0"

    invoke-static {v4}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_1a
    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v8, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/2addr v4, v8

    const v8, 0x1aa6b2

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_22
    const-string v4, "kdtG0k/236GC\n"

    const-string v8, "su924n/G75E=\n"

    invoke-static {v4, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v0, v35

    invoke-static {v0, v4}, Lc0;->A(Landroid/widget/LinearLayout;I)V

    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v8, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    add-int/lit16 v8, v8, 0x2346

    sub-int/2addr v4, v8

    if-ltz v4, :cond_1b

    const/16 v4, 0x47

    sput v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    const-string v4, "\u06e4\u06e0\u06e8"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_1b
    const-string v4, "\u06e6\u06e6\u06df"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_23
    move/from16 v8, v26

    :cond_1c
    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    move-result v4

    if-ltz v4, :cond_1d

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    const-string v4, "\u06e1\u06df\u06e4"

    invoke-static {v4}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v26, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_1d
    sget v4, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v9, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    or-int/2addr v4, v9

    const v9, 0x1ab322

    add-int/2addr v4, v9

    move/from16 v26, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_1e
    move-object/from16 v10, p0

    :sswitch_24
    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v8, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    or-int/lit16 v8, v8, 0x17b1

    rem-int/2addr v4, v8

    if-gtz v4, :cond_1f

    const-string v4, "\u06e8\u06e8"

    :goto_11
    invoke-static {v4}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_1f
    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v8, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    or-int/2addr v4, v8

    const v8, 0x1ab026

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_20
    move-object v8, v10

    :goto_12
    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v9, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    rem-int/lit16 v9, v9, -0x673

    mul-int/2addr v4, v9

    if-ltz v4, :cond_21

    const-string v4, "\u06e7\u06e1\u06e4"

    invoke-static {v4}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v30, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_21
    const-string v4, "\u06e0\u06e8\u06e3"

    goto/16 :goto_b

    :sswitch_25
    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v8, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    div-int/2addr v4, v8

    const v8, 0x1ac524

    xor-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_26
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v8, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    rem-int/2addr v4, v8

    const v8, -0x1aafea

    xor-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_27
    if-eqz v17, :cond_29

    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v8, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    add-int/lit16 v8, v8, 0x593

    sub-int/2addr v4, v8

    if-ltz v4, :cond_22

    const-string v4, "\u06e4\u06e4\u06e3"

    invoke-static {v4}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_22
    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v8, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    rem-int/2addr v4, v8

    const v8, 0x1ac5f6

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_28
    const-string v4, "Qkur8ntd6w==\n"

    const-string v8, "ISTFhh4lnx4=\n"

    invoke-static {v4, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p0

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "QiZn\n"

    const-string v8, "L1UAvh5h/lw=\n"

    invoke-static {v4, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-static {v4, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v4, Lkn;->f:Ljava/lang/ref/WeakReference;

    if-eqz v4, :cond_1e

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/Activity;

    sget v8, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v9, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    add-int/lit16 v9, v9, 0xf77

    div-int/2addr v8, v9

    if-eqz v8, :cond_23

    const-string v8, "\u06e3\u06e5\u06e5"

    invoke-static {v8}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v36, v4

    move-object/from16 v10, p0

    move/from16 v46, v8

    goto/16 :goto_0

    :cond_23
    sget v8, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v9, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    rem-int/2addr v8, v9

    const v9, 0x1aaecc

    add-int/2addr v8, v9

    move-object/from16 v36, v4

    move-object/from16 v10, p0

    move/from16 v46, v8

    goto/16 :goto_0

    :sswitch_29
    new-instance v4, Lrp;

    invoke-virtual/range {v27 .. v27}, Laq;->o()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    move-object/from16 v0, v27

    invoke-direct {v4, v8, v9, v0}, Lrp;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Laq;)V

    move-object/from16 v0, v27

    invoke-virtual {v0, v4}, Laq;->m(Ljava/lang/Object;)Z

    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    if-gtz v4, :cond_24

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    const-string v4, "\u06e7\u06e1\u06e5"

    invoke-static {v4}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_24
    sget v4, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v8, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sub-int/2addr v4, v8

    const v8, 0x1ac799

    xor-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_2a
    move-object/from16 v0, v35

    iput-object v0, v6, Lp00;->b:Ljava/lang/Object;

    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v8, "PwHo\n"

    const-string v9, "0axDwFTMOxU=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v8, Lbo;->a:Landroid/graphics/Typeface;

    if-eqz v8, :cond_37

    sget v9, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v22, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    move/from16 v0, v22

    add-int/lit16 v0, v0, 0x1922

    move/from16 v22, v0

    mul-int v9, v9, v22

    if-gtz v9, :cond_46

    const-string v9, "\u06e7\u06e3\u06e8"

    invoke-static {v9}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v22, v4

    move-object/from16 v23, v8

    move/from16 v46, v9

    goto/16 :goto_0

    :sswitch_2b
    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v8, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    add-int/lit16 v8, v8, 0x26f5

    sub-int/2addr v4, v8

    if-ltz v4, :cond_25

    const/16 v4, 0x49

    sput v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    const-string v4, "\u06e1\u06e3\u06e1"

    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_25
    const-string v4, "\u06e3\u06e0\u06e0"

    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_2c
    instance-of v4, v10, Landroid/app/Activity;

    if-eqz v4, :cond_3a

    move-object v4, v10

    check-cast v4, Landroid/app/Activity;

    const-string v9, "\u06e0\u06e0\u06e6"

    move-object/from16 v8, v31

    move-object/from16 v28, v4

    goto/16 :goto_f

    :sswitch_2d
    sget v4, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v4, :cond_26

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۢ۠۟ۨ()I

    const-string v4, "\u06e0\u06e6\u06e3"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_26
    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v8, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    or-int/2addr v4, v8

    const v8, 0x1ac5cd

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_2e
    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    move-result v4

    if-ltz v4, :cond_28

    const/16 v4, 0x41

    sput v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    move-object/from16 v8, v24

    :cond_27
    const-string v4, "\u06e7\u06e2\u06e7"

    move-object/from16 v24, v8

    move-object/from16 v9, v33

    move/from16 v28, v34

    goto/16 :goto_7

    :cond_28
    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v8, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    add-int/2addr v4, v8

    const v8, 0x1ab38f

    xor-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_29
    :sswitch_2f
    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v8, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    mul-int/lit16 v8, v8, -0x1486

    sub-int/2addr v4, v8

    if-ltz v4, :cond_2a

    const/16 v4, 0x5b

    sput v4, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v4, "\u06e6\u06e8\u06e0"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_2a
    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v8, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    div-int/2addr v4, v8

    const v8, 0x1aba7e

    xor-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_30
    new-instance v6, Lp00;

    invoke-direct {v6}, Lp00;-><init>()V

    const-string v4, "txB4f791fD+jAHFxv2JyLqMB\n"

    const-string v8, "0HUdFOAWHU8=\n"

    invoke-static {v4, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v4

    iput-object v4, v6, Lp00;->b:Ljava/lang/Object;

    if-nez v4, :cond_33

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-direct {v4, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const-string v8, "YZAUaou+HM91gB1ki6kS3nWB\n"

    const-string v9, "BvVxAdTdfb8=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    sget v8, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v9, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    div-int/lit16 v9, v9, -0x246e

    xor-int/2addr v8, v9

    if-lez v8, :cond_0

    sget v8, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v9, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sub-int/2addr v8, v9

    const v9, -0x1abae8

    xor-int/2addr v8, v9

    move-object/from16 v35, v4

    move/from16 v46, v8

    goto/16 :goto_0

    :sswitch_31
    sget v4, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v8, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    xor-int/lit16 v8, v8, 0x1df4

    add-int/2addr v4, v8

    if-gtz v4, :cond_2b

    const-string v4, "\u06e3\u06e5\u06e4"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_2b
    const-string v4, "\u06e6\u06e4\u06e0"

    move-object/from16 v8, v24

    goto/16 :goto_a

    :sswitch_32
    invoke-virtual/range {v22 .. v23}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    if-gtz v4, :cond_2c

    const-string v4, "\u06e8\u06e4\u06e5"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_2c
    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v8, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int/2addr v4, v8

    const v8, -0x1ac58b

    xor-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_2d
    :sswitch_33
    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v4, :cond_2e

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v8, "\u06e8\u06e4"

    move-object/from16 v4, v37

    move/from16 v9, v38

    :goto_13
    invoke-static {v8}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v37, v4

    move/from16 v38, v9

    move/from16 v46, v8

    goto/16 :goto_0

    :cond_2e
    const-string v4, "\u06e4\u06df\u06e2"

    :goto_14
    invoke-static {v4}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_34
    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v8, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    div-int/lit16 v8, v8, -0x501

    or-int/2addr v4, v8

    if-ltz v4, :cond_2f

    const/16 v4, 0x37

    sput v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    const-string v4, "\u06e8\u06e1\u06e6"

    invoke-static {v4}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_2f
    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v8, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sub-int/2addr v4, v8

    const v8, 0x1aae5e

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_35
    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v8, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/2addr v4, v8

    const v8, 0x1aad6e

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_30
    :sswitch_36
    const-string v8, "\u06e4\u06e8\u06e5"

    move-object/from16 v4, v37

    move/from16 v9, v38

    goto :goto_13

    :sswitch_37
    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    if-gtz v4, :cond_31

    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    const-string v4, "\u06e8\u06e4\u06e7"

    goto/16 :goto_5

    :cond_31
    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v8, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    or-int/2addr v4, v8

    const v8, -0x1ab565

    xor-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_38
    move-object/from16 v0, p1

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v4, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v8, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    div-int/lit16 v8, v8, 0x2244

    add-int/2addr v4, v8

    if-gtz v4, :cond_32

    const-string v4, "\u06e1\u06e8\u06e1"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_32
    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v8, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    xor-int/2addr v4, v8

    const v8, 0x1aac89

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_33
    :sswitch_39
    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v8, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    add-int/lit16 v8, v8, -0x1c33

    mul-int/2addr v4, v8

    if-ltz v4, :cond_34

    const/16 v4, 0x1d

    sput v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    const-string v8, "\u06e8\u06e4\u06e1"

    move-object/from16 v4, v31

    goto/16 :goto_10

    :cond_34
    sget v4, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v8, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    add-int/2addr v4, v8

    const v8, 0x1ab551

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_35
    :sswitch_3a
    sget v4, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v8, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    mul-int/lit16 v8, v8, -0x179e

    div-int/2addr v4, v8

    if-eqz v4, :cond_36

    const-string v4, "\u06e4\u06e3\u06e0"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_36
    sget v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v8, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    mul-int/2addr v4, v8

    const v8, 0x1cfaf5

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_3b
    move-object/from16 v4, v22

    move-object/from16 v8, v23

    :cond_37
    sget v9, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v22, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    move/from16 v0, v22

    rem-int/lit16 v0, v0, -0x1115

    move/from16 v22, v0

    xor-int v9, v9, v22

    if-gtz v9, :cond_38

    const/16 v9, 0x5c

    sput v9, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    const-string v9, "\u06e5\u06e5\u06e5"

    move-object/from16 v22, v4

    move-object/from16 v23, v8

    goto/16 :goto_e

    :cond_38
    const-string v9, "\u06e7\u06e8\u06e0"

    goto/16 :goto_9

    :sswitch_3c
    invoke-virtual {v12}, Lo40;->c()V

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v4

    if-gtz v4, :cond_39

    const/16 v4, 0x24

    sput v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v4, "\u06e1\u06e3\u06e4"

    :goto_15
    invoke-static {v4}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_39
    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v8, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    or-int/2addr v4, v8

    const v8, 0x1acbed

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_3a
    :sswitch_3d
    const-string v4, "\u06e7\u06e1\u06e5"

    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_3e
    sget v4, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v8, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/lit16 v8, v8, 0x1923

    sub-int/2addr v4, v8

    if-ltz v4, :cond_3b

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v4, "\u06e2\u06e3\u06e0"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_3b
    sget v4, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v8, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    or-int/2addr v4, v8

    const v8, 0x1ac75b

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_3f
    const/4 v4, 0x0

    move-object/from16 v0, v35

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    xor-int/lit8 v4, v4, -0x5c

    move-object/from16 v0, v35

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    xor-int/lit16 v4, v4, 0x28d

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    sget v8, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    xor-int/lit16 v9, v8, -0x316

    invoke-static {v9}, Lmp;->q(I)I

    move-result v8

    sget v28, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    move/from16 v0, v28

    xor-int/lit16 v0, v0, -0x1ef

    move/from16 v28, v0

    invoke-static/range {v28 .. v28}, Lmp;->q(I)I

    move-result v28

    invoke-static {v9}, Lmp;->q(I)I

    move-result v29

    move-object/from16 v0, v35

    move/from16 v1, v28

    move/from16 v2, v29

    invoke-virtual {v0, v4, v8, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget v8, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v28, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    move/from16 v0, v28

    add-int/lit16 v0, v0, -0x2092

    move/from16 v28, v0

    xor-int v8, v8, v28

    if-ltz v8, :cond_3c

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v8, "\u06e3\u06e2\u06e5"

    invoke-static {v8}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v37, v4

    move/from16 v38, v9

    move/from16 v46, v8

    goto/16 :goto_0

    :cond_3c
    const-string v8, "\u06df\u06e1"

    goto/16 :goto_13

    :sswitch_40
    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    const v8, -0x7e110283

    sget v9, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    xor-int v18, v8, v9

    move/from16 v0, v18

    invoke-virtual {v4, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v8, v4, Lo40;

    if-eqz v8, :cond_35

    check-cast v4, Lo40;

    sget v8, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v9, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/lit16 v9, v9, 0x80e

    mul-int/2addr v8, v9

    if-ltz v8, :cond_3d

    const/4 v8, 0x0

    sput v8, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    const-string v8, "\u06e5\u06e2\u06df"

    invoke-static {v8}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v17, v4

    move/from16 v46, v8

    goto/16 :goto_0

    :cond_3d
    const-string v8, "\u06e8\u06e4\u06e5"

    move-object v9, v4

    goto/16 :goto_4

    :sswitch_41
    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v8, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    mul-int/lit16 v8, v8, 0x12df

    xor-int/2addr v4, v8

    if-gtz v4, :cond_3e

    const/16 v4, 0x18

    sput v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v4, "\u06e4\u06e8\u06e5"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_3e
    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v8, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    or-int/2addr v4, v8

    const v8, 0x1acadb

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_3f
    :sswitch_42
    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v8, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    or-int/lit16 v8, v8, 0x21ec

    rem-int/2addr v4, v8

    if-ltz v4, :cond_40

    const-string v4, "\u06e2\u06e7\u06e4"

    goto/16 :goto_c

    :cond_40
    sget v4, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v8, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    add-int/2addr v4, v8

    const v8, 0xded0

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_41
    :sswitch_43
    sget v4, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v8, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    div-int/lit16 v8, v8, -0x2157

    add-int/2addr v4, v8

    if-gtz v4, :cond_42

    const/16 v4, 0x32

    sput v4, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    const-string v4, "\u06e4\u06e7\u06e2"

    invoke-static {v4}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_42
    const-string v4, "\u06e8\u06e7\u06e4"

    goto/16 :goto_5

    :cond_43
    move-object/from16 v32, v36

    :sswitch_44
    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v8, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    div-int/lit16 v8, v8, -0x1509

    mul-int/2addr v4, v8

    if-eqz v4, :cond_44

    const-string v4, "\u06e2\u06e7\u06e2"

    goto/16 :goto_14

    :cond_44
    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v8, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    rem-int/2addr v4, v8

    const v8, 0xdc82

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_45
    const-string v4, "\u06e3\u06e8\u06e4"

    move-object/from16 v9, v33

    move/from16 v28, v8

    goto/16 :goto_7

    :sswitch_45
    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v8, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    mul-int/lit16 v8, v8, -0x95b

    sub-int/2addr v4, v8

    if-ltz v4, :cond_47

    move-object/from16 v4, v22

    move-object/from16 v8, v23

    move-object/from16 v12, v24

    :cond_46
    const-string v9, "\u06df\u06e2\u06e1"

    invoke-static {v9}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v22, v4

    move-object/from16 v23, v8

    move/from16 v46, v9

    goto/16 :goto_0

    :cond_47
    const-string v4, "\u06e1\u06e3\u06e1"

    move-object/from16 v12, v24

    goto/16 :goto_15

    :sswitch_46
    if-nez v7, :cond_30

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    move-result v4

    if-ltz v4, :cond_2d

    const-string v4, "he"

    invoke-static {v4}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->۠ۤۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    sget v8, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v9, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    add-int/2addr v8, v9

    const v9, 0x1ac581

    add-int/2addr v8, v9

    move-object/from16 v41, v4

    move/from16 v46, v8

    goto/16 :goto_0

    :sswitch_47
    sget v4, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v8, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    add-int/2addr v4, v8

    const v8, 0x1aa6d6

    add-int/2addr v4, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_48
    const/16 v4, 0x1c

    move/from16 v0, v34

    if-lt v0, v4, :cond_c

    const-string v4, "W8f8ATlJ2g==\n"

    const-string v8, "ePfMMQl56js=\n"

    invoke-static {v4, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v0, v35

    invoke-static {v0, v4}, Lc0;->r(Landroid/widget/LinearLayout;I)V

    :goto_16
    const-string v4, "\u06e0\u06e0\u06e8"

    invoke-static {v4}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_49
    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v8, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    add-int/lit16 v8, v8, -0x15d4

    sub-int/2addr v4, v8

    if-gtz v4, :cond_48

    const/16 v4, 0x46

    sput v4, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v4, "\u06e6\u06e8\u06e5"

    invoke-static {v4}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v30, v44

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_48
    const-string v4, "\u06e0\u06e8\u06e3"

    invoke-static {v4}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v30, v44

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_4a
    sget v4, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    xor-int/lit16 v4, v4, 0x24c

    invoke-static {v4}, Lmp;->q(I)I

    move-result v4

    move-object/from16 v0, v39

    iput v4, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v8, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    add-int/lit16 v8, v8, 0x1e78

    div-int/2addr v4, v8

    if-eqz v4, :cond_49

    const/16 v4, 0x27

    sput v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v4, "\u06e2\u06e6\u06e8"

    invoke-static {v4}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_49
    const-string v4, "\u06e3\u06e3"

    move-object/from16 v8, v30

    goto/16 :goto_b

    :sswitch_4b
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v4

    instance-of v8, v4, Landroid/view/ViewGroup;

    if-eqz v8, :cond_3f

    check-cast v4, Landroid/view/ViewGroup;

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v7

    if-gtz v7, :cond_4a

    const-string v7, "\u06e4\u06df\u06e5"

    invoke-static {v7}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v8

    move-object v7, v4

    move/from16 v46, v8

    goto/16 :goto_0

    :cond_4a
    sget v7, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v8, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    mul-int/2addr v7, v8

    const v8, 0x1e47f0

    xor-int/2addr v8, v7

    move-object v7, v4

    move/from16 v46, v8

    goto/16 :goto_0

    :sswitch_4c
    sget-object v4, Lkn;->j:Lqp;

    if-eqz v4, :cond_4c

    check-cast v4, Laq;

    sget v8, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v9, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    or-int/lit16 v9, v9, -0xbf7

    xor-int/2addr v8, v9

    if-gtz v8, :cond_4b

    const/16 v8, 0x29

    sput v8, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    move-object/from16 v27, v4

    goto/16 :goto_16

    :cond_4b
    const-string v8, "\u06e5\u06e2\u06df"

    move-object v9, v4

    move-object/from16 v28, v8

    move-object/from16 v29, v25

    goto/16 :goto_2

    :cond_4c
    :sswitch_4d
    const-string v4, "\u06e7\u06e7\u06e8"

    goto/16 :goto_14

    :sswitch_4e
    const/4 v8, 0x0

    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v9, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    mul-int/lit16 v9, v9, 0xf97

    mul-int/2addr v4, v9

    if-gtz v4, :cond_4d

    const/16 v4, 0x36

    sput v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    const-string v4, "\u06e7\u06e6"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v19, v8

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_4d
    const-string v4, "\u06e8\u06e1\u06e6"

    move-object/from16 v9, v20

    goto/16 :goto_6

    :sswitch_4f
    sget v4, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v8, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    mul-int/2addr v4, v8

    const v8, 0x1e02c0

    add-int/2addr v4, v8

    move-object/from16 v33, v25

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_50
    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v4

    if-ltz v4, :cond_4e

    const/4 v4, 0x2

    sput v4, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    const-string v4, "\u06e4\u06e7\u06e5"

    invoke-static {v4}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v17, v21

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_4e
    const-string v8, "\u06e7\u06e0\u06e0"

    move-object v4, v11

    move-object/from16 v17, v21

    goto/16 :goto_8

    :sswitch_51
    sget v4, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v5, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    rem-int/2addr v4, v5

    const v5, 0x1ab619

    xor-int/2addr v4, v5

    move-object/from16 v5, v19

    move/from16 v46, v4

    goto/16 :goto_0

    :sswitch_52
    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    move-result v4

    if-gtz v4, :cond_4f

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v4, "\u06e3\u06df\u06e8"

    invoke-static {v4}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v46, v4

    goto/16 :goto_0

    :cond_4f
    const-string v4, "\u06e3\u06e5\u06e5"

    goto/16 :goto_11

    :sswitch_53
    iget-object v4, v6, Lp00;->b:Ljava/lang/Object;

    check-cast v4, Landroid/widget/LinearLayout;

    const-string v8, "gQwzVlmEO4yNFw1TRL44\n"

    const-string v9, "9WNSJS3bT+k=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_9

    sget v8, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    if-ltz v8, :cond_50

    const-string v9, "\u06e7\u06e0\u06e0"

    move-object v8, v4

    goto/16 :goto_d

    :cond_50
    sget v8, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v9, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sub-int/2addr v8, v9

    const v9, 0x1abbfb

    xor-int/2addr v8, v9

    move-object v11, v4

    move/from16 v46, v8

    goto/16 :goto_0

    :sswitch_54
    return-void

    :sswitch_55
    move-object/from16 v8, v30

    goto/16 :goto_12

    :sswitch_data_0
    .sparse-switch
        0xdbe2 -> :sswitch_0
        0xdc42 -> :sswitch_25
        0xdc43 -> :sswitch_13
        0xdc60 -> :sswitch_1c
        0xdc62 -> :sswitch_4f
        0xdca2 -> :sswitch_1d
        0xdcb9 -> :sswitch_6
        0xdcdf -> :sswitch_c
        0xdce1 -> :sswitch_34
        0xdcff -> :sswitch_20
        0x1aa701 -> :sswitch_2f
        0x1aa741 -> :sswitch_44
        0x1aa75e -> :sswitch_32
        0x1aa760 -> :sswitch_4a
        0x1aa7de -> :sswitch_12
        0x1aa7e0 -> :sswitch_50
        0x1aaae6 -> :sswitch_47
        0x1aaae8 -> :sswitch_22
        0x1aab42 -> :sswitch_21
        0x1aab5d -> :sswitch_2e
        0x1aab9d -> :sswitch_f
        0x1aabdb -> :sswitch_2
        0x1aabdd -> :sswitch_3
        0x1aae85 -> :sswitch_26
        0x1aae87 -> :sswitch_3c
        0x1aae8a -> :sswitch_24
        0x1aaec1 -> :sswitch_16
        0x1aaec2 -> :sswitch_10
        0x1aaee5 -> :sswitch_1
        0x1aaeff -> :sswitch_1e
        0x1aaf02 -> :sswitch_3b
        0x1aaf63 -> :sswitch_14
        0x1aaf79 -> :sswitch_24
        0x1aaf7e -> :sswitch_43
        0x1aaf9a -> :sswitch_28
        0x1ab261 -> :sswitch_b
        0x1ab268 -> :sswitch_3a
        0x1ab2c1 -> :sswitch_d
        0x1ab2e0 -> :sswitch_53
        0x1ab305 -> :sswitch_2c
        0x1ab324 -> :sswitch_4b
        0x1ab609 -> :sswitch_19
        0x1ab60b -> :sswitch_49
        0x1ab60c -> :sswitch_39
        0x1ab623 -> :sswitch_25
        0x1ab664 -> :sswitch_15
        0x1ab666 -> :sswitch_a
        0x1ab6a3 -> :sswitch_35
        0x1ab6c2 -> :sswitch_41
        0x1ab6c3 -> :sswitch_3e
        0x1ab6fc -> :sswitch_54
        0x1ab701 -> :sswitch_52
        0x1ab71f -> :sswitch_48
        0x1ab9c7 -> :sswitch_54
        0x1ab9ca -> :sswitch_11
        0x1ab9e8 -> :sswitch_55
        0x1ab9ec -> :sswitch_4d
        0x1aba44 -> :sswitch_38
        0x1aba63 -> :sswitch_3e
        0x1aba66 -> :sswitch_42
        0x1aba7f -> :sswitch_e
        0x1ababd -> :sswitch_9
        0x1abac2 -> :sswitch_18
        0x1abae1 -> :sswitch_4c
        0x1abae2 -> :sswitch_3f
        0x1abde2 -> :sswitch_29
        0x1ac147 -> :sswitch_44
        0x1ac1a5 -> :sswitch_31
        0x1ac1e2 -> :sswitch_43
        0x1ac1e8 -> :sswitch_4
        0x1ac202 -> :sswitch_33
        0x1ac21f -> :sswitch_2a
        0x1ac222 -> :sswitch_23
        0x1ac263 -> :sswitch_3d
        0x1ac527 -> :sswitch_27
        0x1ac52a -> :sswitch_1b
        0x1ac54b -> :sswitch_4e
        0x1ac56c -> :sswitch_45
        0x1ac58c -> :sswitch_17
        0x1ac5e1 -> :sswitch_5
        0x1ac605 -> :sswitch_36
        0x1ac606 -> :sswitch_8
        0x1ac608 -> :sswitch_30
        0x1ac61f -> :sswitch_7
        0x1ac8e8 -> :sswitch_17
        0x1ac90d -> :sswitch_51
        0x1ac92a -> :sswitch_54
        0x1ac946 -> :sswitch_35
        0x1ac94c -> :sswitch_40
        0x1ac969 -> :sswitch_2b
        0x1ac982 -> :sswitch_1f
        0x1ac986 -> :sswitch_2d
        0x1ac9a6 -> :sswitch_37
        0x1ac9c3 -> :sswitch_46
        0x1ac9c5 -> :sswitch_1a
        0x1ac9c7 -> :sswitch_37
    .end sparse-switch
.end method
