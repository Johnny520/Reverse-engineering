.class public abstract Lx50;
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

    const-string v0, "\u06e3\u06e3\u06df"

    invoke-static {v0}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    xor-int/lit16 v1, v1, 0x26e3

    div-int/2addr v0, v1

    if-eqz v0, :cond_1

    const/16 v0, 0x26

    sput v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v0, "\u06e1\u06e5\u06e3"

    :goto_1
    invoke-static {v0}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lx50;->a:Landroid/util/SparseIntArray;

    const-string v0, "\u06e0\u06e0\u06e1"

    goto :goto_1

    :sswitch_2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lx50;->b:Ljava/lang/Object;

    sget v0, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    rem-int/lit16 v1, v1, -0x1b45

    or-int/2addr v0, v1

    if-gtz v0, :cond_0

    const/16 v0, 0x39

    sput v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    :cond_0
    const-string v0, "\u06e0\u06e8\u06e6"

    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e3\u06e3\u06df"

    goto :goto_1

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdce1 -> :sswitch_0
        0x1aaae1 -> :sswitch_2
        0x1aabde -> :sswitch_3
        0x1ab67f -> :sswitch_1
    .end sparse-switch
.end method
