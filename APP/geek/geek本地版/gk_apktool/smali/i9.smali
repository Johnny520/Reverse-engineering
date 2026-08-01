.class public abstract Li9;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final b:Ljava/util/Map;

.field public static c:Ljava/lang/Object;

.field public static final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final e:Ljava/util/Map;

.field public static final f:Ljava/util/Map;

.field public static g:I

.field public static final h:Lh9;

.field public static final i:Ljava/util/Date;

.field public static final j:Li00;

.field public static final k:Li00;

.field public static final l:Li00;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v6, 0x2b

    const/4 v3, 0x0

    const-string v0, "\u06e6\u06e2\u06e4"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    move v0, v3

    move v2, v3

    move v4, v1

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    xor-int/lit16 v0, v0, 0x382

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v1

    if-ltz v1, :cond_2

    sput v6, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    :cond_0
    const-string v1, "\u06e6\u06df\u06e3"

    :goto_1
    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :sswitch_1
    new-instance v1, Li00;

    const-string v4, "Ln6JjxCVQDMzDowx4/KcxTMa\n"

    const-string v5, "biXX02N3wLY=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Li00;-><init>(Ljava/lang/String;)V

    sput-object v1, Li9;->j:Li00;

    sget v1, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v4, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    xor-int/lit16 v4, v4, -0x2453

    mul-int/2addr v1, v4

    if-gtz v1, :cond_1

    const/16 v1, 0x13

    sput v1, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    const-string v1, "\u06e1\u06e1\u06e7"

    invoke-static {v1}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v4, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    xor-int/2addr v1, v4

    const v4, 0x1aac28

    add-int/2addr v1, v4

    move v4, v1

    goto :goto_0

    :sswitch_2
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    sput-object v1, Li9;->i:Ljava/util/Date;

    sget v1, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    xor-int/lit16 v4, v4, -0x452

    or-int/2addr v1, v4

    if-ltz v1, :cond_3

    const/16 v1, 0x40

    sput v1, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    :cond_2
    const-string v1, "\u06e8\u06e3\u06e4"

    invoke-static {v1}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto :goto_0

    :cond_3
    sget v1, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v4, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    xor-int/2addr v1, v4

    const v4, 0x1aa9a7

    xor-int/2addr v1, v4

    move v4, v1

    goto :goto_0

    :sswitch_3
    new-instance v1, Lv7;

    invoke-direct {v1, v0}, Lv7;-><init>(I)V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Li9;->f:Ljava/util/Map;

    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v4, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    or-int/lit16 v4, v4, 0x2129

    mul-int/2addr v1, v4

    if-gtz v1, :cond_4

    :cond_4
    const-string v1, "\u06e1\u06e2\u06e4"

    invoke-static {v1}, Landroidx/activity/result/ۤ۟ۨۧ;->۟ۧ۟ۦ۠(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :sswitch_4
    new-instance v1, Li00;

    const-string v4, "1TAHrzKjkk+jaHeyQLyp\n"

    const-string v5, "jlEqyXOO1H8=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Li00;-><init>(Ljava/lang/String;)V

    sput-object v1, Li9;->l:Li00;

    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    if-gtz v1, :cond_5

    const-string v1, "\u06e7\u06e4\u06e8"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e0\u06e0\u06e4"

    goto/16 :goto_1

    :sswitch_5
    new-instance v1, Lh9;

    invoke-direct {v1, v3}, Lh9;-><init>(I)V

    sput-object v1, Li9;->h:Lh9;

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v1

    if-gtz v1, :cond_9

    sput v6, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    move v1, v2

    :cond_6
    const-string v2, "\u06e5\u06e3\u06e1"

    invoke-static {v2}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    move v2, v1

    goto/16 :goto_0

    :sswitch_6
    sget v1, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    xor-int/lit16 v1, v1, 0x798

    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    div-int/lit16 v4, v4, -0x2638

    or-int/2addr v2, v4

    if-ltz v2, :cond_6

    :goto_2
    const-string v2, "\u06e3\u06e5\u06e3"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v4

    move v2, v1

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    move-result v1

    if-gtz v1, :cond_7

    const/16 v1, 0x48

    sput v1, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    const-string v1, "\u06e5\u06e7"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_7
    sget v1, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v4, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    div-int/2addr v1, v4

    const v4, 0x1ac1a9

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_8
    new-instance v1, Lv7;

    invoke-direct {v1, v2}, Lv7;-><init>(I)V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    sget v1, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    add-int/lit16 v4, v4, 0x1d0f

    mul-int/2addr v1, v4

    if-gtz v1, :cond_8

    const-string v1, "\u06e8\u06e0\u06e0"

    :goto_3
    invoke-static {v1}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06e7\u06e4\u06e8"

    goto :goto_3

    :sswitch_9
    new-instance v1, Lv7;

    invoke-direct {v1, v2}, Lv7;-><init>(I)V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Li9;->b:Ljava/util/Map;

    move v1, v2

    goto :goto_2

    :sswitch_a
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v1, Li9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    sget v1, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    if-gtz v1, :cond_a

    const/16 v1, 0xc

    sput v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    :cond_9
    const-string v1, "\u06e7\u06e1"

    invoke-static {v1}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_a
    sget v1, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    rem-int/2addr v1, v4

    const v4, 0x1aae90

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_b
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v1, Li9;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Landroid/app/۟ۦۦۤۥ;->ۣۡ۠ۢ()I

    move-result v1

    if-ltz v1, :cond_b

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    const-string v1, "\u06e0\u06e2\u06e5"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_b
    sget v1, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v4, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    add-int/2addr v1, v4

    const v4, 0xde56

    add-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_c
    new-instance v1, Lv7;

    invoke-direct {v1, v0}, Lv7;-><init>(I)V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Li9;->e:Ljava/util/Map;

    sget v1, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v1, :cond_0

    const-string v1, "\u06e3\u06e2\u06e3"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :sswitch_d
    new-instance v1, Li00;

    const-string v4, "mGPh8fbYkSnYYZXhksDncah85/6p2eg=\n"

    const-string v5, "9QfUzNTwykg=\n"

    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Li00;-><init>(Ljava/lang/String;)V

    sput-object v1, Li9;->k:Li00;

    sget v1, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int/lit16 v4, v4, 0xd5

    xor-int/2addr v1, v4

    if-ltz v1, :cond_c

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v1, "\u06e0\u06e0\u06e4"

    invoke-static {v1}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v1

    move v4, v1

    goto/16 :goto_0

    :cond_c
    sget v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    rem-int/2addr v1, v4

    const v4, -0x1ab61a

    xor-int/2addr v1, v4

    move v4, v1

    goto/16 :goto_0

    :sswitch_e
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcc0 -> :sswitch_0
        0xdcda -> :sswitch_2
        0x1aaae4 -> :sswitch_e
        0x1aab23 -> :sswitch_d
        0x1aabda -> :sswitch_1
        0x1aaec7 -> :sswitch_6
        0x1aaee3 -> :sswitch_8
        0x1ab664 -> :sswitch_4
        0x1ab6c1 -> :sswitch_b
        0x1abe03 -> :sswitch_9
        0x1ac14a -> :sswitch_3
        0x1ac1a8 -> :sswitch_a
        0x1ac5ab -> :sswitch_5
        0x1ac8e8 -> :sswitch_7
        0x1ac949 -> :sswitch_c
    .end sparse-switch
.end method
