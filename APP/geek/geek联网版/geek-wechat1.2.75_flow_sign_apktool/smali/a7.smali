.class public final synthetic La7;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    const-string v0, "\u06e6\u06e0"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    xor-int/lit16 v1, v1, 0x14e8

    div-int/2addr v0, v1

    if-eqz v0, :cond_0

    const-string v0, "\u06e6\u06e0"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    or-int/2addr v0, v1

    const v1, 0x1abdb3

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v1, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    xor-int/lit16 v1, v1, 0x2627

    add-int/2addr v0, v1

    if-ltz v0, :cond_1

    const/16 v0, 0x13

    sput v0, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v0, "\u06e2\u06e8\u06e4"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sub-int/2addr v0, v1

    const v1, 0xda9b

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcba -> :sswitch_0
        0x1ac16b -> :sswitch_2
        0x1ac600 -> :sswitch_1
    .end sparse-switch
.end method
