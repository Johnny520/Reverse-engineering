.class public final synthetic Lu9;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    const-string v0, "\u06e3\u06e6\u06e5"

    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v1, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    xor-int/2addr v0, v1

    const v1, 0x1ab7a6

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab07 -> :sswitch_0
        0x1ab6e2 -> :sswitch_1
    .end sparse-switch
.end method
