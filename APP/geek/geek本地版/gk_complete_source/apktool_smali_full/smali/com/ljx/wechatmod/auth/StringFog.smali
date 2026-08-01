.class public final Lcom/ljx/wechatmod/auth/StringFog;
.super Ljava/lang/Object;


# static fields
.field public static final INSTANCE:Lcom/ljx/wechatmod/auth/StringFog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ljx/wechatmod/auth/StringFog;

    invoke-direct {v0}, Lcom/ljx/wechatmod/auth/StringFog;-><init>()V

    sput-object v0, Lcom/ljx/wechatmod/auth/StringFog;->INSTANCE:Lcom/ljx/wechatmod/auth/StringFog;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e3\u06e7\u06e5"

    invoke-static {v0}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u06e7\u06e8\u06df"

    :goto_1
    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1ab78c

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    const-string v0, "yL0H11"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢۨۦ;->ۥۦۤۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v1, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    if-ltz v1, :cond_3

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    const-string v1, "\u06e5\u06df\u06e4"

    invoke-static {v1}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_1
    :sswitch_3
    sget v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    if-ltz v0, :cond_2

    const/16 v0, 0x32

    sput v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    const-string v0, "\u06df\u06e6\u06df"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06df\u06e2\u06e7"

    goto :goto_1

    :sswitch_4
    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v0

    if-gtz v0, :cond_1

    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    if-gtz v0, :cond_4

    move-object v0, v1

    :cond_3
    const-string v1, "\u06e1\u06e3\u06e7"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_4
    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sub-int/2addr v0, v2

    const v2, 0x1ab143

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v0

    if-ltz v0, :cond_5

    const/16 v0, 0x4b

    sput v0, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    const-string v0, "\u06e3\u06e3\u06e8"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_5
    sget v0, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/2addr v0, v2

    const v2, -0x1aa5f3

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aa764 -> :sswitch_0
        0x1aaf05 -> :sswitch_5
        0x1ab688 -> :sswitch_2
        0x1ab701 -> :sswitch_4
        0x1aba44 -> :sswitch_1
        0x1abd8a -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final decrypt(Ljava/lang/String;I)Ljava/lang/String;
    .locals 9

    const/4 v0, 0x0

    const/4 v2, 0x0

    const-string v1, "\u06e4\u06df"

    invoke-static {v1}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v8

    move-object v5, v0

    move-object v4, v0

    move v6, v2

    move v7, v2

    move v1, v2

    move v3, v2

    :goto_0
    sparse-switch v8, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v0

    if-ltz v0, :cond_8

    const/16 v0, 0x24

    sput v0, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    const-string v0, "\u06e4\u06df"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    if-gtz v0, :cond_0

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v0, "\u06e3\u06e7\u06e7"

    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e2\u06e5\u06e3"

    invoke-static {v0}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v8, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/lit16 v8, v8, -0x13f9

    xor-int/2addr v0, v8

    if-ltz v0, :cond_2

    const-string v0, "\u06e7\u06e8\u06e8"

    :goto_1
    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto :goto_0

    :cond_2
    sget v0, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v8, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    or-int/2addr v0, v8

    const v8, 0x1ab533

    add-int/2addr v0, v8

    move v8, v0

    goto :goto_0

    :sswitch_3
    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v5

    if-gtz v5, :cond_3

    const/16 v5, 0x35

    sput v5, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    const-string v5, "\u06e2\u06e5\u06e3"

    invoke-static {v5}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v8

    move-object v5, v0

    goto :goto_0

    :cond_3
    sget v5, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v8, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    div-int/2addr v5, v8

    const v8, 0x1ac909

    xor-int/2addr v8, v5

    move-object v5, v0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v0, ""

    :goto_2
    return-object v0

    :sswitch_4
    const-string v0, "\u06e4\u06e4\u06e6"

    move v1, v2

    goto :goto_1

    :sswitch_5
    :try_start_1
    aget-byte v0, v5, v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    sget v6, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v8, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    add-int/lit16 v8, v8, 0x3cc

    add-int/2addr v6, v8

    if-gtz v6, :cond_4

    const-string v6, "\u06e0\u06e7\u06e7"

    invoke-static {v6}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v8

    move v6, v0

    goto/16 :goto_0

    :cond_4
    sget v6, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v8, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    mul-int/2addr v6, v8

    const v8, 0x1b134c

    xor-int/2addr v8, v6

    move v6, v0

    goto/16 :goto_0

    :sswitch_6
    move-object v0, v4

    goto :goto_2

    :sswitch_7
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v8, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    add-int/2addr v0, v8

    const v8, 0x1abf3e

    add-int/2addr v0, v8

    move v8, v0

    goto/16 :goto_0

    :sswitch_8
    sget v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    if-gtz v0, :cond_5

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v0, "\u06e2\u06e7\u06e0"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v8, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int/2addr v0, v8

    const v8, -0x1ab991

    xor-int/2addr v0, v8

    move v8, v0

    goto/16 :goto_0

    :sswitch_9
    sget v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v1, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    or-int/2addr v0, v1

    const v1, -0xdc77

    xor-int/2addr v0, v1

    move v8, v0

    move v1, v3

    goto/16 :goto_0

    :sswitch_a
    :try_start_2
    new-instance v4, Ljava/lang/String;

    sget-object v0, Lc9;->a:Ljava/nio/charset/Charset;

    invoke-direct {v4, v5, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v8, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/lit16 v8, v8, -0x21fa

    or-int/2addr v0, v8

    if-ltz v0, :cond_6

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    const-string v0, "\u06e7\u06e4\u06e4"

    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v8, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    xor-int/2addr v0, v8

    const v8, 0x1ab89e

    xor-int/2addr v0, v8

    move v8, v0

    goto/16 :goto_0

    :sswitch_b
    :try_start_3
    sget v0, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    xor-int/lit8 v0, v0, -0x6c

    add-int v3, v1, v0

    const-string v0, "\u06e0\u06e6\u06e7"

    goto/16 :goto_1

    :sswitch_c
    :try_start_4
    array-length v0, v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    sget v7, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v8, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    add-int/2addr v7, v8

    const v8, 0x1ab4cf

    xor-int/2addr v8, v7

    move v7, v0

    goto/16 :goto_0

    :sswitch_d
    const-string v0, "base64Str"

    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v8, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    div-int/lit16 v8, v8, 0xfee

    xor-int/2addr v0, v8

    if-ltz v0, :cond_7

    const/16 v0, 0x4e

    sput v0, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v0, "\u06e7\u06e8\u06e4"

    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e7\u06e8\u06e4"

    :goto_3
    invoke-static {v0}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :sswitch_e
    xor-int/lit8 v0, v6, -0x1

    and-int/2addr v0, p2

    xor-int/lit8 v8, p2, -0x1

    and-int/2addr v8, v6

    or-int/2addr v0, v8

    int-to-byte v0, v0

    :try_start_5
    aput-byte v0, v5, v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    sget v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v8, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sub-int/2addr v0, v8

    const v8, 0x1ab4f5

    add-int/2addr v0, v8

    move v8, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e3\u06e2\u06e6"

    :goto_4
    invoke-static {v0}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v8, v0

    goto/16 :goto_0

    :sswitch_f
    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v8, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    xor-int/2addr v0, v8

    const v8, 0xdbd9

    add-int/2addr v0, v8

    move v8, v0

    goto/16 :goto_0

    :sswitch_10
    if-ge v1, v7, :cond_1

    sget v0, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v8, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    add-int/lit16 v8, v8, 0x2246

    or-int/2addr v0, v8

    if-gtz v0, :cond_9

    const/16 v0, 0x8

    sput v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    :cond_9
    const-string v0, "\u06e6\u06e5\u06e8"

    goto :goto_3

    :sswitch_11
    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    if-gtz v0, :cond_a

    const-string v0, "\u06e4\u06e4\u06e6"

    goto :goto_4

    :cond_a
    sget v0, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v8, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    xor-int/2addr v0, v8

    const v8, 0x1ab644

    add-int/2addr v0, v8

    move v8, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc5f -> :sswitch_0
        0xdc7b -> :sswitch_d
        0x1aa7a1 -> :sswitch_8
        0x1aaba1 -> :sswitch_9
        0x1aabc0 -> :sswitch_7
        0x1ab300 -> :sswitch_3
        0x1ab301 -> :sswitch_a
        0x1ab608 -> :sswitch_b
        0x1ab667 -> :sswitch_7
        0x1ab680 -> :sswitch_4
        0x1aba07 -> :sswitch_f
        0x1aba66 -> :sswitch_10
        0x1aba87 -> :sswitch_6
        0x1abdc5 -> :sswitch_1
        0x1abe46 -> :sswitch_2
        0x1ac209 -> :sswitch_5
        0x1ac5a7 -> :sswitch_e
        0x1ac623 -> :sswitch_11
        0x1ac909 -> :sswitch_c
    .end sparse-switch
.end method
