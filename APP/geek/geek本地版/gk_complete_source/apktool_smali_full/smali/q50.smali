.class public abstract Lq50;
.super Ljava/lang/Object;


# static fields
.field public static final a:Landroid/util/SparseIntArray;

.field public static final b:Ljava/lang/Object;

.field public static volatile c:J

.field public static d:Ljava/lang/Integer;

.field public static e:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "\u06e4\u06e4\u06e3"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    if-ltz v0, :cond_0

    const-string v0, "\u06df\u06e2"

    invoke-static {v0}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v1, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    mul-int/2addr v0, v1

    const v1, 0x1abc8e

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq50;->b:Ljava/lang/Object;

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_1
    const-string v0, "\u06e7\u06e4\u06e7"

    invoke-static {v0}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lq50;->a:Landroid/util/SparseIntArray;

    sget v0, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v1, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    mul-int/lit16 v1, v1, 0x1602

    rem-int/2addr v0, v1

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۦ۟ۥۣ()I

    const-string v0, "\u06e4\u06e4\u06e3"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    div-int/2addr v0, v1

    const v1, -0x1aabd9

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa79d -> :sswitch_0
        0x1aabdb -> :sswitch_1
        0x1aba63 -> :sswitch_2
        0x1ac5aa -> :sswitch_3
    .end sparse-switch
.end method
