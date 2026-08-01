.class public abstract Ldy;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/Map;

.field public static final b:Ljava/util/Set;

.field public static final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public static d:I

.field public static e:I

.field public static f:F

.field public static final g:Li00;

.field public static final h:Lay;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, -0x1

    const-string v0, "\u06e1\u06e3\u06df"

    invoke-static {v0}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    const-string v0, "\u06e7\u06df"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    sput v3, Ldy;->e:I

    const-string v0, "\u06e4\u06e5"

    :goto_1
    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    const/high16 v0, -0x40800000    # -1.0f

    sput v0, Ldy;->f:F

    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    if-ltz v0, :cond_0

    const-string v0, "\u06e1\u06e8"

    :goto_2
    invoke-static {v0}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v1, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    or-int/2addr v0, v1

    const v1, 0x1ab366

    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    sget v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v1, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    or-int/2addr v0, v1

    const v1, 0x1ab12a

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ldy;->b:Ljava/util/Set;

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v0

    if-gtz v0, :cond_4

    const/16 v0, 0x36

    sput v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v0, "\u06e2\u06e7\u06e8"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_4
    new-instance v0, Lay;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lay;-><init>(I)V

    sput-object v0, Ldy;->h:Lay;

    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    if-ltz v0, :cond_3

    const/16 v0, 0x55

    sput v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    :cond_2
    const-string v0, "\u06e0\u06e3\u06e1"

    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    or-int/2addr v0, v1

    const v1, 0x1abfaa

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_5
    new-instance v0, Li00;

    const-string v1, "UusOPfE9PIR6A/DiY6FNhSIB9/wVqEzhVAKC7Q==\n"

    const-string v2, "CSmr0k6YYdg=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Li00;-><init>(Ljava/lang/String;)V

    sput-object v0, Ldy;->g:Li00;

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v0

    if-gtz v0, :cond_2

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    const-string v0, "\u06e5\u06e4\u06e6"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_6
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Ldy;->c:Ljava/util/concurrent/ConcurrentHashMap;

    sget v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    add-int/lit16 v1, v1, -0x25d7

    rem-int/2addr v0, v1

    if-ltz v0, :cond_5

    :cond_4
    const-string v0, "\u06e4\u06e7\u06e7"

    invoke-static {v0}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e3\u06e1\u06e8"

    goto/16 :goto_2

    :sswitch_7
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Ldy;->a:Ljava/util/Map;

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v0

    if-gtz v0, :cond_6

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    const-string v0, "\u06e1\u06e3\u06df"

    goto/16 :goto_1

    :cond_6
    const-string v0, "\u06e3\u06e7\u06e0"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_8
    sput v3, Ldy;->d:I

    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    or-int/lit16 v1, v1, -0x183

    mul-int/2addr v0, v1

    if-ltz v0, :cond_7

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    const-string v0, "\u06e4\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e8\u06e3"

    goto/16 :goto_1

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc27 -> :sswitch_0
        0xdc81 -> :sswitch_2
        0xdcfb -> :sswitch_1
        0x1aab3e -> :sswitch_4
        0x1aaefd -> :sswitch_7
        0x1ab343 -> :sswitch_5
        0x1ab64a -> :sswitch_8
        0x1ab6fc -> :sswitch_3
        0x1abac4 -> :sswitch_6
        0x1abe27 -> :sswitch_9
    .end sparse-switch
.end method
