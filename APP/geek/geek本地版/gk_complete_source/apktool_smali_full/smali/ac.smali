.class public abstract Lac;
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

    const-string v0, "\u06e6\u06e0\u06e7"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/4 v0, 0x1

    sput v0, Lac;->m:I

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    move-result v0

    if-ltz v0, :cond_6

    const/16 v0, 0x46

    sput v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    :goto_1
    const-string v0, "\u06e6\u06e2\u06e6"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    const-string v0, "WcmoJdFarA==\n"

    const-string v1, "eviZHOhs7uk=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lac;->s:Ljava/lang/String;

    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v0, :cond_0

    const-string v0, "\u06df\u06e7\u06e5"

    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v1, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    add-int/2addr v0, v1

    const v1, 0x1aca53

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    const-string v0, "Piwd0q1YPw58QiCq\n"

    const-string v1, "2Ke7NCXy2Zw=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lac;->k:Ljava/lang/String;

    :goto_2
    const-string v0, "\u06df\u06e2\u06e1"

    :goto_3
    invoke-static {v0}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    sput v2, Lac;->n:I

    sget v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    if-ltz v0, :cond_1

    invoke-static {}, Landroidx/appcompat/widget/۟ۢۨۦ;->۟ۦۡ۟۠()I

    goto :goto_2

    :cond_1
    const-string v0, "\u06e7\u06e6\u06e1"

    goto :goto_3

    :sswitch_4
    sget v0, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    if-gtz v0, :cond_2

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    const-string v0, "\u06e1\u06e6\u06e1"

    :goto_4
    invoke-static {v0}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sub-int/2addr v0, v1

    const v1, 0x1ac141

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_5
    const-string v0, "BTlclMrJ8w==\n"

    const-string v1, "JgkZrP/8sO8=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lac;->t:Ljava/lang/String;

    sget v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    if-gtz v0, :cond_3

    const-string v0, "\u06e6\u06e0\u06e7"

    :goto_5
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e8\u06e8\u06e6"

    invoke-static {v0}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "ijx/rDvNxA==\n"

    const-string v1, "qQ1N7QOL8K8=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lac;->r:Ljava/lang/String;

    sget v0, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    if-ltz v0, :cond_4

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    const-string v0, "\u06e7\u06e6\u06e1"

    invoke-static {v0}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_7
    sput v2, Lac;->o:I

    sget v0, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    if-gtz v0, :cond_5

    :cond_4
    const-string v0, "\u06e1\u06e6\u06e3"

    invoke-static {v0}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06df\u06e7\u06e5"

    goto :goto_4

    :cond_6
    const-string v0, "\u06e7\u06e6\u06e3"

    goto :goto_5

    :sswitch_8
    const-string v0, "35whdTisVw==\n"

    const-string v1, "/K8VNgDqEqM=\n"

    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lac;->q:Ljava/lang/String;

    goto/16 :goto_1

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa75e -> :sswitch_0
        0x1aa7fd -> :sswitch_8
        0x1aaf5e -> :sswitch_1
        0x1abdc8 -> :sswitch_4
        0x1ac16d -> :sswitch_2
        0x1ac1aa -> :sswitch_6
        0x1ac5e2 -> :sswitch_7
        0x1ac5e4 -> :sswitch_3
        0x1ac8ef -> :sswitch_5
        0x1ac9e6 -> :sswitch_9
    .end sparse-switch
.end method

.method public static a()V
    .locals 9

    const/4 v1, 0x0

    const/4 v8, 0x1

    const/4 v6, 0x0

    const-string v0, "\u06e1\u06e6\u06e5"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    move-object v4, v1

    move-object v0, v1

    move v5, v6

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "NbHrxNRE1s8ysc342V3b3wGx/P8=\n"

    const-string v3, "XtSSm7YxtK0=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "mUu8QxFGlA==\n"

    const-string v7, "unqOAikAoDc=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lac;->r:Ljava/lang/String;

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v1

    if-gtz v1, :cond_15

    const/16 v1, 0x5b

    sput v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    const-string v1, "\u06e5\u06e7"

    invoke-static {v1}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_1
    const-string v1, "+x4aWkIHHD31JAZrRRkUN/MePGpf\n"

    const-string v3, "kHtjBTFrdVk=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lgn;->e(Ljava/lang/String;)Z

    move-result v1

    sput-boolean v1, Lac;->l:Z

    sget v1, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    xor-int/lit16 v3, v3, -0x1540

    xor-int/2addr v1, v3

    if-ltz v1, :cond_10

    const/4 v1, 0x2

    sput v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    const-string v1, "\u06e4\u06e6\u06e1"

    invoke-static {v1}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_2
    const-string v1, "/HHRvzhGe2b7cfeUMlZ0Ych9zJg=\n"

    const-string v3, "lxSo4FozGQQ=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Lgn;->b(Ljava/lang/String;I)I

    move-result v1

    sput v1, Lac;->p:I

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v1

    if-gtz v1, :cond_0

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    const-string v1, "\u06e0\u06e8\u06e2"

    invoke-static {v1}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_0
    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    rem-int/2addr v1, v3

    const v3, 0x1ab6bf

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_3
    const-string v1, "i3Aedsu6/fq/ZgJFxYz46YFhBls=\n"

    const-string v3, "4BVnKaPTmZ8=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lgn;->e(Ljava/lang/String;)Z

    move-result v1

    sput-boolean v1, Lac;->f:Z

    sget v1, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sub-int/2addr v1, v3

    const v3, 0xdce2

    xor-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "4usqsoKRHHjl6wyOj4gRaNb9J4ySkCF04Ok7mQ==\n"

    const-string v3, "iY5T7eDkfho=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "S3UawmrWBA==\n"

    const-string v7, "aEQr+1PgRn4=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lac;->s:Ljava/lang/String;

    move-object v1, v2

    :goto_1
    const-string v2, "\u06e1\u06e0\u06df"

    move-object v3, v2

    :goto_2
    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "kjV47rGiqgaYM3jurLGwGw==\n"

    const-string v3, "+VABscHQw3A=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lgn;->e(Ljava/lang/String;)Z

    sget v1, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    if-gtz v1, :cond_2

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    :cond_1
    const-string v1, "\u06e7\u06e7\u06e2"

    invoke-static {v1}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_2
    sget v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v3, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    div-int/2addr v1, v3

    const v3, 0x1ab680

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_6
    invoke-static {v4, v8}, Lgn;->a(Ljava/lang/String;Z)Z

    move-result v1

    sput-boolean v1, Lac;->b:Z

    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-result v1

    if-gtz v1, :cond_4

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    :cond_3
    const-string v1, "\u06e0\u06e1\u06e8"

    :goto_3
    invoke-static {v1}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_4
    sget v1, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    xor-int/2addr v1, v3

    const v3, 0x1abb84

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "9StXogCTxw39K3GcDpDtDPARS5MWmcA=\n"

    const-string v3, "nk4u/WL8smM=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lgn;->e(Ljava/lang/String;)Z

    move-result v1

    sput-boolean v1, Lac;->j:Z

    const-string v1, "\u06e6\u06df\u06e0"

    :goto_4
    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_8
    invoke-static {v2, v5}, Lgn;->b(Ljava/lang/String;I)I

    move-result v1

    sput v1, Lac;->n:I

    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    move-result v1

    if-gtz v1, :cond_5

    const-string v1, "\u06e5\u06e1\u06e2"

    invoke-static {v1}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e0\u06e8\u06e2"

    goto :goto_3

    :sswitch_9
    const-string v1, "9S+HNrx0SuTyL6EKsW1H9MEvkA2Bb0Hh9j4=\n"

    const-string v3, "nkr+ad4BKIY=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "yAwSQQDT4g==\n"

    const-string v7, "6zxXeTXmoXM=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lac;->t:Ljava/lang/String;

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v1

    if-ltz v1, :cond_6

    const/4 v1, 0x4

    sput v1, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    const-string v1, "\u06e6\u06df\u06e3"

    invoke-static {v1}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e0\u06e6\u06e2"

    invoke-static {v1}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_a
    const-string v1, "Pk/6U7R3B3wwdepis2UAfzxe+g==\n"

    const-string v2, "VSqDDMcAbgw=\n"

    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    div-int/lit16 v3, v3, 0xbb8

    xor-int/2addr v2, v3

    if-ltz v2, :cond_7

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    goto/16 :goto_1

    :cond_7
    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sub-int/2addr v2, v3

    const v3, -0x1ac572

    xor-int/2addr v3, v2

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_b
    const-string v1, "vVNtWbVIHXqvaX1oq0gfZb9CbQ==\n"

    const-string v3, "1jYUBt8tcRY=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lgn;->b(Ljava/lang/String;I)I

    move-result v1

    sput v1, Lac;->o:I

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    move-result v1

    if-gtz v1, :cond_9

    const/16 v1, 0x17

    sput v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    :cond_8
    const-string v1, "\u06e7\u06e5\u06e5"

    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_9
    sget v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v3, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    xor-int/2addr v1, v3

    const v3, 0x1ac4fb

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_c
    const-string v1, "PMNzDwcIBy0Ix2Q5CT8JNw==\n"

    const-string v3, "V6YKUGRgZlk=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    mul-int/2addr v3, v4

    const v4, 0x1a606f

    add-int/2addr v3, v4

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_d
    const-string v1, "EoGL/hqyksgYh4v+CKyOzCaNnNUProjXDZ0=\n"

    const-string v3, "eeTyoWrA+74=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v5}, Lgn;->b(Ljava/lang/String;I)I

    sget v1, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v1, :cond_a

    const-string v1, "\u06df\u06e2\u06e8"

    invoke-static {v1}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_a
    sget v1, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    mul-int/2addr v1, v3

    const v3, 0x1652c5

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_e
    const-string v1, "GgDacX743eYUOsVBeuDV9xU=\n"

    const-string v3, "cWWjLgiXtIU=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lgn;->e(Ljava/lang/String;)Z

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move-result v1

    if-ltz v1, :cond_b

    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    const-string v1, "\u06e0\u06e5\u06e7"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_b
    sget v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v3, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    or-int/2addr v1, v3

    const v3, 0x1ac14d

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_f
    const-string v1, "yr46XA4I9kLAuDpcDQ7mWMQ=\n"

    const-string v3, "odtDA356nzQ=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Lgn;->b(Ljava/lang/String;I)I

    sget v1, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    mul-int/2addr v1, v3

    const v3, 0x1d629f

    xor-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_10
    const-string v1, "0L6o2Ne0IJDktqLg+6gmit4=\n"

    const-string v3, "u9vRh6TcT+c=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lgn;->e(Ljava/lang/String;)Z

    move-result v1

    sput-boolean v1, Lac;->h:Z

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v1

    if-gtz v1, :cond_c

    const/16 v1, 0x1a

    sput v1, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    const-string v1, "\u06e3\u06e3\u06e2"

    invoke-static {v1}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u06df\u06e2\u06e8"

    goto/16 :goto_4

    :sswitch_11
    sget v1, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v3, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    or-int/lit16 v3, v3, -0xa02

    add-int/2addr v1, v3

    if-ltz v1, :cond_d

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    const-string v1, "\u06e5\u06e1\u06e5"

    goto/16 :goto_4

    :cond_d
    const-string v1, "\u06e1\u06e6\u06e5"

    goto/16 :goto_4

    :sswitch_12
    const-string v1, "WAMR4MObFPlfCjfL1IYD\n"

    const-string v3, "M2Zov7H+d5g=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "soc/4mFs1FLw6QKa\n"

    const-string v7, "VAyZBOnGMsA=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lac;->k:Ljava/lang/String;

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v1

    if-gtz v1, :cond_e

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    const-string v1, "\u06e1\u06e6\u06e5"

    invoke-static {v1}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_e
    const-string v1, "\u06e8\u06e1\u06e6"

    invoke-static {v1}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_13
    const-string v1, "mASzEVVxkzqWPqsgT2ulOYcYpis=\n"

    const-string v3, "82HKTiYG+ko=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8}, Lgn;->b(Ljava/lang/String;I)I

    move-result v1

    sput v1, Lac;->m:I

    const-string v1, "\u06e5\u06e7"

    goto/16 :goto_3

    :sswitch_14
    const-string v1, "maYwFJ75lCGdrhYpiO6FOZc=\n"

    const-string v3, "8sNJS/2M51U=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lgn;->e(Ljava/lang/String;)Z

    move-result v1

    sput-boolean v1, Lac;->e:Z

    const-string v1, "\u06e4\u06e6\u06e1"

    goto/16 :goto_4

    :sswitch_15
    const-string v1, "QWkvXgUpSxBGaQliCDBGAHV/ImAVKA==\n"

    const-string v3, "KgxWAWdcKXI=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "tZOfkDL/hw==\n"

    const-string v7, "lqCr0wq5wpg=\n"

    invoke-static {v3, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lac;->q:Ljava/lang/String;

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    move-result v1

    if-gtz v1, :cond_f

    const-string v1, "\u06e2\u06e4\u06e5"

    invoke-static {v1}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_f
    const-string v1, "\u06e1\u06e4"

    :goto_5
    invoke-static {v1}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_16
    const-string v1, "8jH2XYf1v+v4Ouxnvfql8PQL/Hab964=\n"

    const-string v3, "mVSPAuKby5k=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8}, Lgn;->b(Ljava/lang/String;I)I

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v1

    if-ltz v1, :cond_8

    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    const-string v1, "\u06e6\u06df\u06e0"

    invoke-static {v1}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_17
    const-string v1, "JHnY3B1iWZEQetPqEGVZqy5qwPcUeQ==\n"

    const-string v3, "Txyhg3ULPfQ=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lgn;->e(Ljava/lang/String;)Z

    move-result v1

    sput-boolean v1, Lac;->g:Z

    sget v1, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v3, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    rem-int/lit16 v3, v3, 0x1e6d

    xor-int/2addr v1, v3

    if-ltz v1, :cond_1

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    :cond_10
    const-string v1, "\u06e5\u06df"

    goto :goto_5

    :sswitch_18
    const-string v1, "o7PCJRCMp8Okug==\n"

    const-string v3, "yNa7emLpxKI=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lgn;->e(Ljava/lang/String;)Z

    move-result v1

    sput-boolean v1, Lac;->i:Z

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v1

    if-gtz v1, :cond_11

    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    const-string v1, "\u06e8\u06e1\u06e7"

    invoke-static {v1}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_11
    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    rem-int/2addr v1, v3

    const v3, -0x1ab2e6

    xor-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_19
    sget v1, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/lit16 v1, v1, 0x34e

    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v5, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    div-int/lit16 v5, v5, 0x1c5b

    xor-int/2addr v3, v5

    if-gtz v3, :cond_12

    const-string v3, "\u06e7\u06e0\u06e2"

    invoke-static {v3}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v3

    move v5, v1

    goto/16 :goto_0

    :cond_12
    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v5, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    or-int/2addr v3, v5

    const v5, 0x1ac62e

    add-int/2addr v3, v5

    move v5, v1

    goto/16 :goto_0

    :sswitch_1a
    const-string v1, "OGFWOkgLU4YMckAMSht4nTxbWwBRCg==\n"

    const-string v3, "UwQvZSl+J+k=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lgn;->e(Ljava/lang/String;)Z

    move-result v1

    sput-boolean v1, Lac;->c:Z

    const-string v3, "\u06e1\u06e8\u06e1"

    move-object v1, v2

    goto/16 :goto_2

    :sswitch_1b
    const-string v1, "PxALhCPkzMgxKhO4JPrK1g==\n"

    const-string v3, "VHVy21CTpbg=\n"

    invoke-static {v1, v3}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lgn;->e(Ljava/lang/String;)Z

    move-result v1

    sput-boolean v1, Lac;->d:Z

    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v3, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int/lit16 v3, v3, -0x575

    div-int/2addr v1, v3

    if-eqz v1, :cond_13

    const-string v1, "\u06e1\u06e8\u06e1"

    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_13
    sget v1, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    rem-int/2addr v1, v3

    const v3, 0x1abd39

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_1c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v1, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    or-int/lit16 v3, v3, -0x537

    or-int/2addr v1, v3

    if-ltz v1, :cond_14

    const-string v1, "\u06e8\u06e7"

    invoke-static {v1}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_14
    const-string v1, "\u06e1\u06e2\u06e6"

    goto/16 :goto_3

    :cond_15
    sget v1, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v3, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sub-int/2addr v1, v3

    const v3, 0x1aae16

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_1d
    sget-object v0, Lgn;->a:Lgn;

    sget v1, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/lit8 v3, v3, 0x1d

    div-int/2addr v1, v3

    if-ltz v1, :cond_3

    const-string v1, "\u06e4\u06e0\u06e3"

    invoke-static {v1}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_1e
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc23 -> :sswitch_0
        0xdc9a -> :sswitch_16
        0xdca2 -> :sswitch_a
        0xdcff -> :sswitch_17
        0x1aa765 -> :sswitch_18
        0x1aaac5 -> :sswitch_1c
        0x1aab07 -> :sswitch_c
        0x1aab82 -> :sswitch_d
        0x1aab9c -> :sswitch_1e
        0x1aabda -> :sswitch_b
        0x1aae87 -> :sswitch_4
        0x1aaea0 -> :sswitch_9
        0x1aaee5 -> :sswitch_6
        0x1aaf60 -> :sswitch_1d
        0x1aaf9a -> :sswitch_1b
        0x1ab2e3 -> :sswitch_7
        0x1ab603 -> :sswitch_2
        0x1ab606 -> :sswitch_15
        0x1ab682 -> :sswitch_f
        0x1ab9e7 -> :sswitch_1a
        0x1aba9f -> :sswitch_e
        0x1abdc6 -> :sswitch_14
        0x1ac147 -> :sswitch_12
        0x1ac14a -> :sswitch_3
        0x1ac529 -> :sswitch_19
        0x1ac565 -> :sswitch_5
        0x1ac5c7 -> :sswitch_13
        0x1ac602 -> :sswitch_10
        0x1ac90d -> :sswitch_1
        0x1ac90e -> :sswitch_11
        0x1ac9a5 -> :sswitch_8
    .end sparse-switch
.end method
