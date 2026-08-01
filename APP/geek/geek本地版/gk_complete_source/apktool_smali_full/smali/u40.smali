.class public abstract Lu40;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/github/megatronking/stringfog/xor/StringFogImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/github/megatronking/stringfog/xor/StringFogImpl;

    invoke-direct {v0}, Lcom/github/megatronking/stringfog/xor/StringFogImpl;-><init>()V

    sput-object v0, Lu40;->a:Lcom/github/megatronking/stringfog/xor/StringFogImpl;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    const/4 v4, 0x0

    const-string v1, "\u06e7\u06e3\u06e5"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    move-object v2, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    rem-int/2addr v0, v3

    const v3, 0x1ac599

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v4}, Lcom/github/megatronking/stringfog/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    sget v1, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    mul-int/lit16 v3, v3, -0x565

    rem-int/2addr v1, v3

    if-gtz v1, :cond_0

    const/16 v1, 0x4e

    sput v1, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    const-string v1, "\u06e7\u06e3\u06e5"

    invoke-static {v1}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v1, v0

    goto :goto_0

    :cond_0
    sget v1, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    xor-int/2addr v1, v3

    const v3, 0x1ab18e

    add-int/2addr v3, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p1, v4}, Lcom/github/megatronking/stringfog/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    if-ltz v0, :cond_1

    const-string v0, "\u06e2\u06df\u06e2"

    :goto_1
    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e5\u06e1\u06e4"

    goto :goto_1

    :sswitch_3
    sget-object v0, Lu40;->a:Lcom/github/megatronking/stringfog/xor/StringFogImpl;

    invoke-virtual {v0, v1, v2}, Lcom/github/megatronking/stringfog/xor/StringFogImpl;->decrypt([B[B)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab245 -> :sswitch_0
        0x1ab305 -> :sswitch_2
        0x1abdc8 -> :sswitch_3
        0x1ac589 -> :sswitch_1
    .end sparse-switch
.end method
