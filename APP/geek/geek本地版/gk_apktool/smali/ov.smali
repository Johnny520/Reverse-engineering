.class public final Lov;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    const-string v0, "RFYTuw==\n"

    const-string v1, "My5638tqmdk=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "AdwD0w==\n"

    const-string v1, "b71uthzD8vg=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e3"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p1, p0, Lov;->a:Ljava/lang/String;

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    move-result v1

    if-ltz v1, :cond_5

    :goto_1
    const-string v1, "\u06df\u06e3\u06e1"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    mul-int/lit16 v2, v2, 0xe79

    sub-int/2addr v1, v2

    if-gtz v1, :cond_1

    const/16 v1, 0x1c

    sput v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    const-string v1, "\u06e2\u06e8\u06e0"

    invoke-static {v1}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v2, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    mul-int/2addr v1, v2

    const v2, 0x16aaef

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    if-gtz v1, :cond_2

    const/16 v1, 0x2d

    sput v1, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v1, "\u06e6\u06e2\u06e3"

    invoke-static {v1}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e1\u06e7\u06e0"

    :goto_2
    invoke-static {v1}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    const-string v0, "NjIbwyK3evUjO6HdHwwQWp"

    invoke-static {v0}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۨ۠ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v2, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    div-int/lit16 v2, v2, 0x1394

    mul-int/2addr v1, v2

    if-eqz v1, :cond_3

    :cond_3
    const-string v1, "\u06e5\u06e7\u06e6"

    goto :goto_2

    :sswitch_4
    iput-object p2, p0, Lov;->b:Ljava/lang/String;

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-result v1

    if-gtz v1, :cond_4

    :cond_4
    const-string v1, "\u06e6\u06e8\u06e3"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_5
    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    move-result v1

    if-gtz v1, :cond_0

    sget v1, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    sub-int/2addr v1, v2

    const v2, 0x1ab0d8

    add-int/2addr v1, v2

    goto :goto_0

    :cond_5
    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    rem-int/2addr v1, v2

    const v2, 0x1ac2cf

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_6
    iput p3, p0, Lov;->c:I

    goto/16 :goto_1

    :sswitch_7
    sget v1, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    if-ltz v1, :cond_6

    const/16 v1, 0x1f

    sput v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    const-string v1, "\u06e4\u06e2\u06e3"

    invoke-static {v1}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e4\u06e3"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7f -> :sswitch_0
        0x1aa727 -> :sswitch_7
        0x1aa77d -> :sswitch_5
        0x1aaf7a -> :sswitch_8
        0x1ab2c1 -> :sswitch_3
        0x1abe84 -> :sswitch_2
        0x1ac1a7 -> :sswitch_4
        0x1ac261 -> :sswitch_6
        0x1ac5a3 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v1, 0x0

    const-string v0, "\u06e3\u06e5\u06e6"

    invoke-static {v0}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move v0, v3

    :goto_1
    return v0

    :cond_0
    :sswitch_1
    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    div-int/2addr v0, v2

    const v2, 0x1ab2ee

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lov;->a:Ljava/lang/String;

    iget-object v2, v1, Lov;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    sget v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sub-int/2addr v0, v2

    const v2, 0x1aacb9

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_1
    :sswitch_3
    sget v0, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    add-int/lit16 v2, v2, -0xdaa

    xor-int/2addr v0, v2

    if-ltz v0, :cond_2

    const/16 v0, 0x48

    sput v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v0, "\u06e4\u06e0\u06e6"

    invoke-static {v0}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sub-int/2addr v0, v2

    const v2, 0x1abcd9

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lov;->b:Ljava/lang/String;

    iget-object v2, v1, Lov;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    mul-int/lit16 v2, v2, -0x2224

    xor-int/2addr v0, v2

    if-ltz v0, :cond_3

    const/16 v0, 0xb

    sput v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    :cond_3
    const-string v0, "\u06e7\u06e5\u06e3"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_5
    if-ne p0, p1, :cond_1

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    move-result v0

    if-ltz v0, :cond_4

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    const-string v0, "\u06e2\u06e3\u06df"

    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e3\u06e1"

    :goto_2
    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_6
    move-object v0, p1

    check-cast v0, Lov;

    sget v1, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    if-ltz v1, :cond_5

    const-string v1, "\u06e3\u06e1"

    invoke-static {v1}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e1\u06e2\u06e2"

    move-object v2, v1

    :goto_3
    invoke-static {v2}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_7
    move v0, v4

    goto/16 :goto_1

    :sswitch_8
    move v0, v4

    goto/16 :goto_1

    :cond_6
    :sswitch_9
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v2, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab957

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    move v0, v3

    goto/16 :goto_1

    :sswitch_b
    instance-of v0, p1, Lov;

    if-nez v0, :cond_0

    const-string v0, "\u06e2\u06e3\u06df"

    :goto_4
    invoke-static {v0}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-result v0

    if-gtz v0, :cond_7

    const/16 v0, 0x47

    sput v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    const-string v0, "\u06e4\u06e3\u06e7"

    goto :goto_4

    :cond_7
    sget v0, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    add-int/2addr v0, v2

    const v2, 0x1ab5eb

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_8
    :sswitch_d
    const-string v0, "\u06e6\u06e5"

    goto :goto_4

    :sswitch_e
    move v0, v4

    goto/16 :goto_1

    :sswitch_f
    move v0, v4

    goto/16 :goto_1

    :cond_9
    :sswitch_10
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    move-result v0

    if-gtz v0, :cond_a

    const/16 v0, 0x61

    sput v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v2, "\u06e6\u06e4\u06e2"

    move-object v0, v1

    goto :goto_3

    :cond_a
    sget v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    rem-int/2addr v0, v2

    const v2, 0x1acbfa

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_11
    iget v0, p0, Lov;->c:I

    iget v2, v1, Lov;->c:I

    if-eq v0, v2, :cond_6

    sget v0, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    if-ltz v0, :cond_b

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    const-string v0, "\u06e8\u06e5\u06e8"

    goto/16 :goto_2

    :cond_b
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    or-int/2addr v0, v2

    const v2, 0x1aab80

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc5e -> :sswitch_0
        0xdcbf -> :sswitch_11
        0x1aa7ff -> :sswitch_e
        0x1aaee1 -> :sswitch_2
        0x1ab2be -> :sswitch_8
        0x1ab2c2 -> :sswitch_a
        0x1ab2e4 -> :sswitch_6
        0x1ab2fc -> :sswitch_f
        0x1ab342 -> :sswitch_9
        0x1ab669 -> :sswitch_d
        0x1ab6c4 -> :sswitch_5
        0x1aba7e -> :sswitch_b
        0x1abe06 -> :sswitch_3
        0x1ac25d -> :sswitch_1
        0x1ac5c5 -> :sswitch_7
        0x1ac8cd -> :sswitch_c
        0x1ac8e9 -> :sswitch_10
        0x1ac98b -> :sswitch_4
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 5

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e2"

    invoke-static {v1}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v4

    move v2, v0

    move v1, v0

    move v3, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    xor-int/lit8 v0, v0, 0x42

    sget v3, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    add-int/lit16 v4, v4, 0x2195

    div-int/2addr v3, v4

    if-eqz v3, :cond_2

    const-string v3, "\u06e7\u06e2"

    invoke-static {v3}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v4

    move v3, v0

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lov;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v4, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    add-int/lit16 v4, v4, -0x1076

    xor-int/2addr v2, v4

    if-ltz v2, :cond_0

    const-string v2, "\u06e1\u06e7\u06e2"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۧ۠;->ۥۦۤ۠(Ljava/lang/Object;)I

    move-result v4

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v2, "\u06e2\u06e5"

    invoke-static {v2}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move v2, v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lov;->b:Ljava/lang/String;

    mul-int v1, v2, v3

    invoke-static {v0, v1, v3}, Lz30;->e(Ljava/lang/String;II)I

    move-result v1

    const-string v0, "\u06e3\u06e5\u06e5"

    :goto_1
    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_3
    iget v0, p0, Lov;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    rsub-int/lit8 v1, v1, 0x0

    sub-int/2addr v0, v1

    return v0

    :sswitch_4
    sget v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v4, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    or-int/lit16 v4, v4, 0x134f

    div-int/2addr v0, v4

    if-ltz v0, :cond_1

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    const-string v0, "\u06e5\u06e5\u06e2"

    goto :goto_1

    :cond_1
    const-string v0, "\u06e7\u06e2"

    goto :goto_1

    :cond_2
    sget v3, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v4, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    mul-int/2addr v3, v4

    const v4, 0x1cd203

    add-int/2addr v4, v3

    move v3, v0

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc43 -> :sswitch_0
        0xdcdb -> :sswitch_1
        0x1aaf7c -> :sswitch_4
        0x1ab6c3 -> :sswitch_3
        0x1ac1c7 -> :sswitch_2
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e6\u06e5\u06e8"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    rem-int/lit16 v2, v2, -0x1a55

    sub-int/2addr v1, v2

    if-gtz v1, :cond_4

    const/16 v1, 0x42

    sput v1, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    const-string v1, "\u06e6\u06e5\u06e8"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v1

    if-gtz v1, :cond_0

    const/16 v1, 0x8

    sput v1, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    const-string v1, "\u06e6\u06e8\u06e0"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    add-int/2addr v1, v2

    const v2, 0x1ac8e1

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_3
    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    move-result v1

    if-gtz v1, :cond_1

    const/16 v1, 0x48

    sput v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    const-string v1, "\u06e2\u06e3\u06e2"

    invoke-static {v1}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v2, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/2addr v1, v2

    const v2, 0x1abf33

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/lit16 v2, v2, 0x2282

    sub-int/2addr v1, v2

    if-ltz v1, :cond_2

    :cond_2
    const-string v1, "\u06e8\u06df\u06df"

    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ContactItem(wxid="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "\u06e6\u06e8\u06e0"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_6
    iget-object v1, p0, Lov;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    rem-int/lit16 v2, v2, 0x1adf

    add-int/2addr v1, v2

    if-gtz v1, :cond_3

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    :goto_2
    const-string v1, "\u06e3\u06e5\u06e2"

    invoke-static {v1}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_3
    const-string v1, "\u06e5\u06e6"

    invoke-static {v1}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_7
    iget v1, p0, Lov;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v1, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    div-int/lit16 v2, v2, -0x249a

    add-int/2addr v1, v2

    if-gtz v1, :cond_5

    const/16 v1, 0x2f

    sput v1, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    :cond_4
    const-string v1, "\u06e0\u06e0\u06e4"

    goto :goto_1

    :cond_5
    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/2addr v1, v2

    const v2, -0x1aabe5

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_8
    iget-object v1, p0, Lov;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0xdca1 -> :sswitch_0
        0xdcde -> :sswitch_3
        0x1aaae4 -> :sswitch_8
        0x1aaf04 -> :sswitch_4
        0x1ab6c0 -> :sswitch_1
        0x1ac209 -> :sswitch_5
        0x1ac25e -> :sswitch_6
        0x1ac8c8 -> :sswitch_2
        0x1ac9c8 -> :sswitch_7
    .end sparse-switch
.end method
