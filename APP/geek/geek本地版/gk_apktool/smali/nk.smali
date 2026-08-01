.class public final synthetic Lnk;
.super Ljava/lang/Object;

# interfaces
.implements Lsm;


# instance fields
.field public final a:Li00;

.field public final b:Ljava/util/ArrayList;

.field public final c:Landroid/widget/TextView;

.field public final d:Lon;

.field public final e:Ljava/lang/String;

.field public final f:Landroid/view/View;

.field public final g:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Lon;Li00;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e2\u06e1"

    invoke-static {v1}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p3, p0, Lnk;->f:Landroid/view/View;

    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    add-int/lit16 v2, v2, 0x2f0

    xor-int/2addr v1, v2

    if-ltz v1, :cond_4

    const-string v1, "\u06e8\u06e4\u06e0"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    iput-object p1, p0, Lnk;->d:Lon;

    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/lit16 v2, v2, 0x1f34

    rem-int/2addr v1, v2

    if-ltz v1, :cond_0

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    const-string v1, "\u06e8\u06e5\u06e3"

    invoke-static {v1}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e0\u06e2"

    :goto_1
    invoke-static {v1}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    iput-object p7, p0, Lnk;->b:Ljava/util/ArrayList;

    const-string v1, "\u06e6\u06e6\u06df"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    iput-object p5, p0, Lnk;->g:Landroid/widget/TextView;

    sget v1, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    add-int/lit16 v2, v2, 0x202c

    xor-int/2addr v1, v2

    if-ltz v1, :cond_1

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v1, "\u06e4\u06e8\u06e5"

    invoke-static {v1}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e4\u06e8\u06e5"

    :goto_3
    invoke-static {v1}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_4
    iput-object p2, p0, Lnk;->a:Li00;

    sget v1, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    if-gtz v1, :cond_2

    const/16 v1, 0x22

    sput v1, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v1, "\u06e5\u06e6\u06e3"

    :goto_4
    invoke-static {v1}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e8\u06e5\u06e3"

    goto :goto_4

    :sswitch_5
    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    move-result v1

    if-gtz v1, :cond_8

    sget v1, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    if-ltz v1, :cond_3

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    :cond_3
    const-string v1, "\u06e8\u06e8\u06e4"

    invoke-static {v1}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_6
    const-string v0, "1sMwjcEnjEVgKMxoriIFyhR"

    invoke-static {v0}, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۦۣۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    move-result v1

    if-gtz v1, :cond_5

    :cond_4
    const-string v1, "\u06e6\u06e2\u06e4"

    invoke-static {v1}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e6\u06e1"

    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_7
    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    mul-int/2addr v1, v2

    const v2, -0x185c12

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_8
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    if-ltz v1, :cond_6

    const/4 v1, 0x2

    sput v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    const-string v1, "\u06e6\u06e6\u06df"

    invoke-static {v1}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_6
    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sub-int/2addr v1, v2

    const v2, 0x1ab6ba

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_9
    iput-object p4, p0, Lnk;->c:Landroid/widget/TextView;

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    move-result v1

    if-ltz v1, :cond_7

    const/16 v1, 0x1f

    sput v1, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v1, "\u06e0\u06e2"

    goto/16 :goto_3

    :cond_7
    sget v1, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    xor-int/2addr v1, v2

    const v2, 0x1abd27

    add-int/2addr v1, v2

    goto/16 :goto_0

    :cond_8
    :sswitch_a
    sget v1, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    rem-int/lit16 v2, v2, -0xe3b

    rem-int/2addr v1, v2

    if-gtz v1, :cond_9

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    const-string v1, "\u06df\u06e6\u06e6"

    goto/16 :goto_2

    :cond_9
    const-string v1, "\u06e2\u06df\u06e5"

    goto/16 :goto_2

    :sswitch_b
    iput-object p6, p0, Lnk;->e:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move-result v1

    if-ltz v1, :cond_a

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v1, "\u06e5\u06e1\u06e4"

    goto/16 :goto_1

    :cond_a
    sget v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    or-int/2addr v1, v2

    const v2, 0xdc02

    add-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe1 -> :sswitch_0
        0xdc02 -> :sswitch_b
        0xdcbb -> :sswitch_8
        0x1ab248 -> :sswitch_c
        0x1ab2a1 -> :sswitch_4
        0x1abae1 -> :sswitch_5
        0x1abdc8 -> :sswitch_a
        0x1abe62 -> :sswitch_1
        0x1ac1a8 -> :sswitch_3
        0x1ac21f -> :sswitch_9
        0x1ac964 -> :sswitch_7
        0x1ac986 -> :sswitch_2
        0x1ac9e4 -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e6\u06e5"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    move-object v8, v0

    move-object v7, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const-string v0, "\u06df\u06e7\u06e7"

    :goto_1
    invoke-static {v0}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    sget v0, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v2, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    rem-int/lit16 v2, v2, 0x39c

    rem-int/2addr v0, v2

    if-gtz v0, :cond_1

    const/16 v0, 0x1a

    sput v0, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    :goto_2
    const-string v0, "\u06e2\u06e4\u06e1"

    invoke-static {v0}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v2, "\u06e3\u06e2\u06e6"

    move-object v0, v7

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v2

    move-object v7, v0

    goto :goto_0

    :sswitch_2
    iget-object v1, p0, Lnk;->a:Li00;

    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    rem-int/lit16 v2, v2, -0x18a3

    rem-int/2addr v0, v2

    if-gtz v0, :cond_2

    const/16 v0, 0x5c

    sput v0, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    const-string v0, "\u06e8\u06e7\u06e4"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sub-int/2addr v0, v2

    const v2, 0x1ab7bb

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    if-ltz v0, :cond_3

    const-string v0, "\u06e0\u06e8\u06e4"

    goto :goto_1

    :cond_3
    sget v0, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    rem-int/2addr v0, v2

    const v2, 0x1ab7e8

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget-object v0, Lvh;->n:Lvh;

    return-object v0

    :sswitch_5
    iput-object v7, v1, Li00;->b:Ljava/lang/Object;

    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/2addr v0, v2

    const v2, 0x1ac326

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_6
    const-string v0, "BkpwJpsd\n"

    const-string v2, "aC8Hbv5lR4Q=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    div-int/lit8 v2, v2, -0x40

    or-int/2addr v0, v2

    if-ltz v0, :cond_4

    const-string v0, "\u06e3\u06e2\u06e6"

    invoke-static {v0}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sub-int/2addr v0, v2

    const v2, 0x1aab0f

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    move-result v2

    if-ltz v2, :cond_5

    const/16 v2, 0x4f

    sput v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    const-string v2, "\u06e2\u06df\u06e3"

    goto/16 :goto_3

    :cond_5
    const-string v2, "\u06e7\u06e2"

    goto/16 :goto_3

    :sswitch_8
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    add-int/lit16 v3, v3, 0x795

    or-int/2addr v2, v3

    if-gtz v2, :cond_6

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    const-string v2, "\u06e7\u06e2"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v8, v0

    goto/16 :goto_0

    :cond_6
    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    add-int/2addr v2, v3

    const v3, -0x1ac802

    xor-int/2addr v2, v3

    move-object v8, v0

    goto/16 :goto_0

    :sswitch_9
    iget-object v0, p0, Lnk;->d:Lon;

    iget-object v2, p0, Lnk;->f:Landroid/view/View;

    iget-object v3, p0, Lnk;->c:Landroid/widget/TextView;

    iget-object v4, p0, Lnk;->g:Landroid/widget/TextView;

    iget-object v5, p0, Lnk;->e:Ljava/lang/String;

    iget-object v6, p0, Lnk;->b:Ljava/util/ArrayList;

    invoke-static/range {v0 .. v6}, Lff;->R(Lon;Li00;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;Ljava/util/ArrayList;)V

    sget v0, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    xor-int/2addr v0, v2

    const v2, -0x1aa65f

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "Nw0OANCYEqkiET5YjtNOww==\n"

    const-string v2, "Q2JbcKD9YOo=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe5 -> :sswitch_0
        0xdcdb -> :sswitch_a
        0x1aa7ff -> :sswitch_4
        0x1aab23 -> :sswitch_1
        0x1ab246 -> :sswitch_3
        0x1ab2df -> :sswitch_2
        0x1ab667 -> :sswitch_7
        0x1ab6e2 -> :sswitch_8
        0x1aba40 -> :sswitch_5
        0x1ac16e -> :sswitch_9
        0x1ac9c5 -> :sswitch_6
    .end sparse-switch
.end method
