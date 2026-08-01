.class public abstract Ljc;
.super Ljava/lang/Object;


# static fields
.field public static a:Z = false

.field public static b:Z = true

.field public static c:Z

.field public static d:Z

.field public static e:Z

.field public static f:Z

.field public static g:Z

.field public static h:Z

.field public static i:Z

.field public static j:Z

.field public static k:Ljava/lang/String;

.field public static l:Z

.field public static m:I

.field public static n:I

.field public static o:I

.field public static p:I

.field public static q:Ljava/lang/String;

.field public static r:Ljava/lang/String;

.field public static s:Ljava/lang/String;

.field public static t:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v2, 0x64

    const-string v0, "\u06e3\u06e3\u06e4"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sput v2, Ljc;->o:I

    :cond_0
    const-string v0, "\u06e4\u06df\u06e4"

    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    const-string v0, "yw1wRcCqAA==\n"

    const-string v1, "6DxBfPmcQtM=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ljc;->s:Ljava/lang/String;

    sget v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v1, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    add-int/lit16 v1, v1, 0xa3c

    div-int/2addr v0, v1

    if-nez v0, :cond_0

    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v1, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    rem-int/2addr v0, v1

    const v1, 0x1aa680

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    const-string v0, "2lWL9uEOamOYO7aO\n"

    const-string v1, "PN4tEGmkjPE=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ljc;->k:Ljava/lang/String;

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    rem-int/lit16 v1, v1, 0x5a1

    rem-int/2addr v0, v1

    if-ltz v0, :cond_1

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    :cond_1
    const-string v0, "\u06e0\u06e6\u06e7"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    const-string v0, "4cvcnEM/tA==\n"

    const-string v1, "wvuZpHYK98o=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ljc;->t:Ljava/lang/String;

    const-string v0, "\u06e2\u06e8\u06e1"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_4
    const-string v0, "NSf4EmRhbA==\n"

    const-string v1, "FhbKU1wnWOo=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ljc;->r:Ljava/lang/String;

    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v1, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    div-int/lit16 v1, v1, -0x2460

    sub-int/2addr v0, v1

    if-gtz v0, :cond_2

    const-string v0, "\u06e4\u06e7\u06e4"

    invoke-static {v0}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v1, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    div-int/2addr v0, v1

    const v1, 0x1aaac2

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    move-result v0

    if-gtz v0, :cond_3

    const/16 v0, 0x1e

    sput v0, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v0, "\u06e0\u06e2\u06df"

    goto :goto_1

    :cond_3
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v1, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    or-int/2addr v0, v1

    const v1, -0x1ab6e5

    xor-int/2addr v0, v1

    goto/16 :goto_0

    :sswitch_6
    sput v2, Ljc;->n:I

    sget v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    or-int/lit16 v1, v1, -0xfe3

    div-int/2addr v0, v1

    if-gtz v0, :cond_5

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    :cond_4
    const-string v0, "\u06e4\u06e4\u06e2"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    rem-int/2addr v0, v1

    const v1, 0xdd73

    add-int/2addr v0, v1

    goto/16 :goto_0

    :sswitch_7
    const/4 v0, 0x1

    sput v0, Ljc;->m:I

    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v1, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    or-int/lit16 v1, v1, 0x895

    add-int/2addr v0, v1

    if-gtz v0, :cond_6

    const/16 v0, 0x39

    sput v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    :cond_6
    const-string v0, "\u06e5\u06e3\u06e5"

    invoke-static {v0}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "Jxraa0plyg==\n"

    const-string v1, "BCnuKHIjjxo=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ljc;->q:Ljava/lang/String;

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    add-int/lit16 v1, v1, 0xc46

    xor-int/2addr v0, v1

    if-ltz v0, :cond_4

    const-string v0, "\u06e8\u06e7"

    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcff -> :sswitch_0
        0x1aa765 -> :sswitch_3
        0x1aaac2 -> :sswitch_1
        0x1aaba1 -> :sswitch_7
        0x1ab35b -> :sswitch_9
        0x1ab684 -> :sswitch_2
        0x1ab9c9 -> :sswitch_8
        0x1aba62 -> :sswitch_4
        0x1abac1 -> :sswitch_5
        0x1abe07 -> :sswitch_6
    .end sparse-switch
.end method

.method public static a()V
    .locals 11

    const/4 v3, 0x0

    const/4 v10, 0x1

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-string v0, "\u06e1\u06df\u06e4"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v8

    move-object v0, v3

    move-object v1, v3

    move-object v2, v3

    move v4, v5

    :goto_0
    sparse-switch v8, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "x7wGd9FDzX3VhhZGz0PPYsWtBg==\n"

    const-string v8, "rNl/KLsmoRE=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkn;->b(Ljava/lang/String;I)I

    move-result v3

    sput v3, Ljc;->o:I

    const-string v3, "CZvsTFDd0g0DnexMTc7IEA==\n"

    const-string v8, "Yv6VEyCvu3s=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkn;->e(Ljava/lang/String;)Z

    sget v3, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    if-ltz v3, :cond_7

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    const-string v3, "\u06e6\u06e8\u06e2"

    :goto_1
    invoke-static {v3}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto :goto_0

    :sswitch_1
    const-string v3, "239+Hc9WaNnvaWIuwWBtytFuZjA=\n"

    const-string v8, "sBoHQqc/DLw=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkn;->e(Ljava/lang/String;)Z

    move-result v3

    sput-boolean v3, Ljc;->f:Z

    const-string v3, "q3s20yi+7PqfeD3lJbnswKFoLvghpQ==\n"

    const-string v8, "wB5PjEDXiJ8=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkn;->e(Ljava/lang/String;)Z

    move-result v3

    sput-boolean v3, Ljc;->g:Z

    sget v3, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v8, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    mul-int/lit16 v8, v8, 0x2059

    xor-int/2addr v3, v8

    if-ltz v3, :cond_c

    const/16 v3, 0x15

    sput v3, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v3, "\u06e6\u06e8\u06e6"

    invoke-static {v3}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto :goto_0

    :sswitch_2
    const-string v3, "72gdKMKbOGboaDsDyIs3YdtkAA8=\n"

    const-string v8, "hA1kd6DuWgQ=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lkn;->b(Ljava/lang/String;I)I

    move-result v3

    sput v3, Ljc;->p:I

    const-string v3, "6J5h7YLm6jDvnkfRj//nINyIbNOS5w==\n"

    const-string v8, "g/sYsuCTiFI=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v8, "BeFns3MovQ==\n"

    const-string v9, "JtJT8Etu+Ag=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Ljc;->q:Ljava/lang/String;

    sget v3, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v8, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    mul-int/lit16 v8, v8, -0x70a

    rem-int/2addr v3, v8

    if-gtz v3, :cond_0

    :goto_2
    const-string v3, "\u06e1\u06e3\u06e7"

    invoke-static {v3}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto/16 :goto_0

    :cond_0
    const-string v3, "\u06e7\u06e1\u06e4"

    :goto_3
    invoke-static {v3}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto/16 :goto_0

    :sswitch_3
    sget-object v2, Lkn;->a:Lkn;

    const-string v0, "mBXY5D4Mj9msEc/SMDuBww==\n"

    const-string v3, "83Chu11k7q0=\n"

    invoke-static {v0, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v3

    if-ltz v3, :cond_1

    const/16 v3, 0x9

    sput v3, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v3, "\u06e2\u06df\u06e7"

    invoke-static {v3}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto/16 :goto_0

    :cond_1
    const-string v3, "\u06e7\u06e6\u06e6"

    :goto_4
    invoke-static {v3}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto/16 :goto_0

    :sswitch_4
    const-string v3, "zZgXA2wiR67HnhcDbyRXtMM=\n"

    const-string v8, "pv1uXBxQLtg=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lkn;->b(Ljava/lang/String;I)I

    const-string v3, "rlSBxJrYwl2kUoHEiMbeWZpYlu+PxNhCsUg=\n"

    const-string v8, "xTH4m+qqqys=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkn;->b(Ljava/lang/String;I)I

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    move-result v3

    if-ltz v3, :cond_2

    :goto_5
    const-string v3, "\u06e0\u06e5"

    invoke-static {v3}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06e6\u06df\u06e0"

    :goto_6
    invoke-static {v3}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto/16 :goto_0

    :sswitch_5
    const-string v3, "xeaxnJ/GGs7x9aeqndYx1cHcvKaGxw==\n"

    const-string v8, "roPIw/6zbqE=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkn;->e(Ljava/lang/String;)Z

    move-result v3

    sput-boolean v3, Ljc;->c:Z

    const-string v3, "P8KPGXZ0KmEx+JclcWosfw==\n"

    const-string v8, "VKf2RgUDQxE=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkn;->e(Ljava/lang/String;)Z

    move-result v3

    sput-boolean v3, Ljc;->d:Z

    sget v3, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v8, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    mul-int/lit16 v8, v8, 0xacd

    div-int/2addr v3, v8

    if-eqz v3, :cond_3

    const/16 v3, 0x2d

    sput v3, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v3, "\u06e7\u06e6\u06e6"

    invoke-static {v3}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e4\u06e6"

    goto/16 :goto_1

    :sswitch_6
    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v8, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    div-int/lit16 v8, v8, 0x2111

    add-int/2addr v3, v8

    if-ltz v3, :cond_4

    const/16 v3, 0x24

    sput v3, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    const-string v3, "\u06e4\u06e7\u06e2"

    goto :goto_6

    :cond_4
    sget v3, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v8, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    div-int/2addr v3, v8

    const v8, 0x1aae86

    add-int/2addr v3, v8

    move v8, v3

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "XnVYBPmfN3VQT0A144UBdkFpTT4=\n"

    const-string v3, "NRAhW4roXgU=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v10}, Lkn;->b(Ljava/lang/String;I)I

    move-result v1

    sput v1, Ljc;->m:I

    const-string v1, "VNXvWX1npGNa7/9oenWjYFbE7w==\n"

    const-string v3, "P7CWBg4QzRM=\n"

    invoke-static {v1, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v3, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    if-gtz v3, :cond_5

    const/16 v3, 0x63

    sput v3, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    const-string v3, "\u06e7\u06e0"

    goto/16 :goto_4

    :cond_5
    sget v3, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v8, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    mul-int/2addr v3, v8

    const v8, 0x1a7b97

    xor-int/2addr v3, v8

    move v8, v3

    goto/16 :goto_0

    :sswitch_8
    const-string v3, "fgjcoEmsO0V2CPqeR68RRHsywJFfpjw=\n"

    const-string v8, "FW2l/yvDTis=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkn;->e(Ljava/lang/String;)Z

    move-result v3

    sput-boolean v3, Ljc;->j:Z

    const-string v3, "+AmCdTtht1H/AKReLHyg\n"

    const-string v8, "k2z7KkkE1DA=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v8, "sZwmyhPOOeHz8huy\n"

    const-string v9, "VxeALJtk33M=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Ljc;->k:Ljava/lang/String;

    sget v3, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    if-ltz v3, :cond_6

    const-string v3, "\u06e1\u06df\u06e4"

    invoke-static {v3}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto/16 :goto_0

    :cond_6
    sget v3, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v8, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    add-int/2addr v3, v8

    const v8, 0x1abf91

    add-int/2addr v3, v8

    move v8, v3

    goto/16 :goto_0

    :cond_7
    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v8, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    div-int/2addr v3, v8

    const v8, 0x1ab665

    xor-int/2addr v3, v8

    move v8, v3

    goto/16 :goto_0

    :sswitch_9
    const-string v3, "z390Nz1k8aLBRWgGOnr5qMd/Ugcg\n"

    const-string v8, "pBoNaE4ImMY=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkn;->e(Ljava/lang/String;)Z

    move-result v3

    sput-boolean v3, Ljc;->l:Z

    const-string v3, "cSIoA0xh6vB7KTI5dm7w63cYIihQY/s=\n"

    const-string v8, "GkdRXCkPnoI=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v10}, Lkn;->b(Ljava/lang/String;I)I

    goto/16 :goto_5

    :sswitch_a
    const-string v3, "rk17gIV8Wj+pTV28iGVXL5pNbLu4Z1E6rVw=\n"

    const-string v8, "xSgC3+cJOF0=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v8, "nQrf7w1NoQ==\n"

    const-string v9, "vjqa1zh44tQ=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Ljc;->t:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v3

    if-gtz v3, :cond_f

    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    move-result v3

    if-ltz v3, :cond_9

    const/16 v3, 0x26

    sput v3, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    :cond_8
    const-string v3, "\u06e8\u06e6"

    goto/16 :goto_3

    :cond_9
    sget v3, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v8, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sub-int/2addr v3, v8

    const v8, 0x1ac3d6

    xor-int/2addr v3, v8

    move v8, v3

    goto/16 :goto_0

    :sswitch_b
    const-string v3, "bDkC17GZ7a1YMQjvnYXrt2I=\n"

    const-string v8, "B1x7iMLxgto=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkn;->e(Ljava/lang/String;)Z

    move-result v3

    sput-boolean v3, Ljc;->h:Z

    const-string v3, "jT6Gc1Y7dzmKNw==\n"

    const-string v8, "5lv/LCReFFg=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkn;->e(Ljava/lang/String;)Z

    move-result v3

    sput-boolean v3, Ljc;->i:Z

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v8, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    xor-int/lit16 v8, v8, 0x7a9

    sub-int/2addr v3, v8

    if-gtz v3, :cond_a

    const-string v3, "\u06e0\u06df"

    invoke-static {v3}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto/16 :goto_0

    :cond_a
    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v8, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    rem-int/2addr v3, v8

    const v8, 0xdc3c

    add-int/2addr v3, v8

    move v8, v3

    goto/16 :goto_0

    :sswitch_c
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v6, v7}, Ljava/io/PrintStream;->println(J)V

    sget v3, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v8, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    div-int/lit16 v8, v8, -0xa99

    add-int/2addr v3, v8

    if-ltz v3, :cond_b

    const/16 v3, 0x62

    sput v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v3, "\u06e5\u06e6\u06e1"

    :goto_7
    invoke-static {v3}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e7\u06e1\u06e5"

    goto :goto_7

    :sswitch_d
    sget v3, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    xor-int/lit16 v4, v3, -0x252

    invoke-static {v1, v4}, Lkn;->b(Ljava/lang/String;I)I

    move-result v3

    sput v3, Ljc;->n:I

    sget v3, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v8, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    div-int/lit16 v8, v8, -0xca8

    sub-int/2addr v3, v8

    if-gtz v3, :cond_d

    const/16 v3, 0x1e

    sput v3, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    :cond_c
    const-string v3, "\u06e0\u06e5\u06e5"

    invoke-static {v3}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e0\u06df"

    goto/16 :goto_6

    :sswitch_e
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v10}, Lkn;->a(Ljava/lang/String;Z)Z

    move-result v3

    sput-boolean v3, Ljc;->b:Z

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v3, :cond_e

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    const-string v3, "\u06e7\u06e8\u06e7"

    invoke-static {v3}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06e0\u06e3\u06e8"

    invoke-static {v3}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto/16 :goto_0

    :sswitch_f
    const-string v3, "+GZX0Y6lNqv8bnHsmLIns/Y=\n"

    const-string v8, "kwMuju3QRd8=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkn;->e(Ljava/lang/String;)Z

    move-result v3

    sput-boolean v3, Ljc;->e:Z

    const-string v3, "K6pntuY3sDElkHiG4i+4ICQ=\n"

    const-string v8, "QM8e6ZBY2VI=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkn;->e(Ljava/lang/String;)Z

    goto/16 :goto_2

    :sswitch_10
    const-string v3, "nPwh4XORd/Wb/Afdfoh65aj8Nto=\n"

    const-string v8, "95lYvhHkFZc=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v8, "pu5PIBsb2w==\n"

    const-string v9, "hd99YSNd70c=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Ljc;->r:Ljava/lang/String;

    const-string v3, "xk09vp0UiqfBTRuCkA2Ht/JbMICNFberxE8slQ==\n"

    const-string v8, "rShE4f9h6MU=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v8, "vhmIeCO3Tw==\n"

    const-string v9, "nSi5QRqBDUQ=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sput-object v3, Ljc;->s:Ljava/lang/String;

    sget v3, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v8, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    rem-int/2addr v3, v8

    const v8, 0x1ab271

    xor-int/2addr v3, v8

    move v8, v3

    goto/16 :goto_0

    :sswitch_11
    const-string v3, "y5juYGj0Ec4gbjoJZJKJYQ2"

    invoke-static {v3}, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦ۠۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    sget v3, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v3, :cond_8

    const/16 v3, 0x30

    sput v3, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    const-string v3, "\u06e3\u06e2\u06e6"

    invoke-static {v3}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v3

    move v8, v3

    goto/16 :goto_0

    :cond_f
    :sswitch_12
    sget v3, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v8, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/2addr v3, v8

    const v8, 0x1ac3a7

    add-int/2addr v3, v8

    move v8, v3

    goto/16 :goto_0

    :sswitch_13
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbff -> :sswitch_0
        0xdc05 -> :sswitch_7
        0xdc82 -> :sswitch_f
        0xdcd9 -> :sswitch_8
        0xdcfe -> :sswitch_c
        0x1aab45 -> :sswitch_5
        0x1aab80 -> :sswitch_b
        0x1aae86 -> :sswitch_3
        0x1aaf05 -> :sswitch_1
        0x1ab24a -> :sswitch_a
        0x1ab667 -> :sswitch_4
        0x1abe60 -> :sswitch_6
        0x1ac147 -> :sswitch_2
        0x1ac260 -> :sswitch_11
        0x1ac264 -> :sswitch_12
        0x1ac50f -> :sswitch_d
        0x1ac54a -> :sswitch_10
        0x1ac54b -> :sswitch_13
        0x1ac5e7 -> :sswitch_e
        0x1ac626 -> :sswitch_9
    .end sparse-switch
.end method
