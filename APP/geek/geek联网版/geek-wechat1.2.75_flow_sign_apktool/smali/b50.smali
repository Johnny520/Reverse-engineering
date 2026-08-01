.class public abstract Lb50;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/github/megatronking/stringfog/xor/StringFogImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/github/megatronking/stringfog/xor/StringFogImpl;

    invoke-direct {v0}, Lcom/github/megatronking/stringfog/xor/StringFogImpl;-><init>()V

    sput-object v0, Lb50;->a:Lcom/github/megatronking/stringfog/xor/StringFogImpl;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v1, 0x0

    const/4 v4, 0x0

    const-string v0, "\u06e4\u06e4\u06e6"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v0, v1

    move-object v2, v1

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v3, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    rem-int/2addr v1, v3

    const v3, 0x1ab86f

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_1
    sget-object v1, Lb50;->a:Lcom/github/megatronking/stringfog/xor/StringFogImpl;

    invoke-virtual {v1, v0, v2}, Lcom/github/megatronking/stringfog/xor/StringFogImpl;->decrypt([B[B)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_2
    invoke-static {p0, v4}, Lcom/github/megatronking/stringfog/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    sget v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v3, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    mul-int/2addr v1, v3

    const v3, 0x187da6

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p1, v4}, Lcom/github/megatronking/stringfog/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v3, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    div-int/2addr v2, v3

    const v3, 0x1aabdd

    add-int/2addr v3, v2

    move-object v2, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdcbb -> :sswitch_0
        0x1aabde -> :sswitch_1
        0x1aba66 -> :sswitch_2
        0x1abac4 -> :sswitch_3
    .end sparse-switch
.end method
