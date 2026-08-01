.class public final Lz7;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const-string v0, "DU9EUg==\n"

    const-string v1, "Yy4pNwN6l7o=\n"

    const-string v2, "D7pUjA==\n"

    const-string v3, "a9st3z8eLWo=\n"

    invoke-static {v0, v1, p1, v2, v3}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "sfwOxA==\n"

    const-string v2, "1Z13gT/ckLw=\n"

    invoke-static {p2, v0, v1, v2, p3}, Lz30;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "u5YA9HwZ\n"

    const-string v1, "1f9nnAhKejk=\n"

    const-string v2, "MbNj60hA\n"

    const-string v3, "X9oEgzwFaxo=\n"

    invoke-static {v0, v1, p4, v2, v3}, Lz30;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p5}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e0\u06e3\u06e2"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    or-int/lit16 v2, v2, 0x24a9

    add-int/2addr v0, v2

    if-ltz v0, :cond_5

    const-string v0, "\u06e2\u06e2\u06e4"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    iput-object p2, p0, Lz7;->b:Ljava/lang/String;

    sget v0, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    add-int/2addr v0, v2

    const v2, -0x1abfbc

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    iput-object p4, p0, Lz7;->d:Ljava/lang/String;

    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    mul-int/lit16 v2, v2, -0x1a99

    mul-int/2addr v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x6

    sput v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    const-string v0, "\u06e0\u06e1\u06e7"

    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/2addr v0, v2

    const v2, 0x1ab3d6

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    move-result v0

    if-ltz v0, :cond_6

    sget v0, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    div-int/lit16 v2, v2, 0x1813

    or-int/2addr v0, v2

    if-ltz v0, :cond_1

    const/16 v0, 0x26

    sput v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    :goto_1
    const-string v0, "\u06e1\u06e5\u06df"

    invoke-static {v0}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    xor-int/2addr v0, v2

    const v2, 0x1aa931

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    or-int/lit16 v2, v2, 0x2664

    rem-int/2addr v0, v2

    if-gtz v0, :cond_2

    const/16 v0, 0x49

    sput v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    const-string v0, "\u06e0\u06e0\u06e5"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_2
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    mul-int/2addr v0, v2

    const v2, 0x19f99a

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_5
    iput-object p3, p0, Lz7;->c:Ljava/lang/String;

    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    add-int/lit16 v2, v2, 0x266d

    div-int/2addr v0, v2

    if-eqz v0, :cond_3

    const-string v0, "\u06e7\u06df"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    move v0, v1

    :cond_4
    const-string v1, "\u06df\u06e4\u06e2"

    move-object v2, v1

    move v3, v0

    :goto_3
    invoke-static {v2}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v1, v3

    move v2, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    div-int/2addr v0, v2

    const v2, 0x1ac243

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_6
    :sswitch_6
    const-string v0, "\u06e6\u06e7\u06e4"

    goto :goto_2

    :sswitch_7
    iput-object p1, p0, Lz7;->a:Ljava/lang/String;

    goto :goto_1

    :sswitch_8
    const-string v0, "8tqna1FUxRyw74gBZljDba"

    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->ۧۢ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    add-int/lit16 v2, v2, 0x1c8d

    add-int/2addr v1, v2

    if-lez v1, :cond_4

    sget v1, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    mul-int/2addr v1, v2

    const v2, 0x5d499

    xor-int/2addr v2, v1

    move v1, v0

    goto/16 :goto_0

    :sswitch_9
    iput-object p5, p0, Lz7;->e:Ljava/lang/String;

    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    add-int/lit16 v2, v2, 0xdae

    rem-int/2addr v0, v2

    if-gtz v0, :cond_7

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    const-string v0, "\u06e7\u06e8\u06e1"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e3\u06e0\u06df"

    move-object v2, v0

    move v3, v1

    goto :goto_3

    :sswitch_a
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcd8 -> :sswitch_0
        0x1aa79d -> :sswitch_2
        0x1aab06 -> :sswitch_8
        0x1aab3f -> :sswitch_7
        0x1aaf3b -> :sswitch_1
        0x1ab287 -> :sswitch_9
        0x1ab2a4 -> :sswitch_6
        0x1ab622 -> :sswitch_3
        0x1abae3 -> :sswitch_5
        0x1ac243 -> :sswitch_a
        0x1ac620 -> :sswitch_4
    .end sparse-switch
.end method
