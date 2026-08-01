.class public final synthetic Ly6;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    const-string v0, "\u06e8\u06e1\u06e4"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    if-ltz v0, :cond_0

    const-string v0, "\u06e4\u06e4\u06e8"

    :goto_1
    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e8\u06e1\u06e4"

    goto :goto_1

    :sswitch_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab249 -> :sswitch_0
        0x1ac90b -> :sswitch_1
    .end sparse-switch
.end method
