.class public final synthetic Ld0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Lc0/E0;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lc0/E0;I)V
    .locals 0

    iput p3, p0, Ld0/b;->a:I

    iput-object p1, p0, Ld0/b;->b:Landroid/app/Activity;

    iput-object p2, p0, Ld0/b;->c:Lc0/E0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    sget-object v0, LD0/l;->a:LD0/l;

    const/4 v1, 0x1

    const-string v2, "$s"

    iget-object v3, p0, Ld0/b;->c:Lc0/E0;

    const-string v4, "$activity"

    iget-object v5, p0, Ld0/b;->b:Landroid/app/Activity;

    iget v6, p0, Ld0/b;->a:I

    packed-switch v6, :pswitch_data_0

    invoke-static {v5, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lc0/Q1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    sget-object v4, LE0/v;->a:LE0/v;

    const/4 v6, 0x0

    if-eqz v2, :cond_6

    if-eq v2, v1, :cond_4

    const/4 v7, 0x2

    if-eq v2, v7, :cond_2

    const/4 v7, 0x3

    if-ne v2, v7, :cond_1

    const-string v2, "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI"

    invoke-static {v5, v2, v4}, Lc0/Q1;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/util/Map;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "fav"

    const-string v2, ".ui.FavoriteIndexUI"

    invoke-static {v5, v1, v2}, Lc0/Q1;->c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    :cond_1
    new-instance v0, LD0/c;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_2
    const-string v2, "com.tencent.mm.plugin.mall.ui.MallIndexUIv2"

    invoke-static {v5, v2, v4}, Lc0/Q1;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/util/Map;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    const-string v1, "mall"

    const-string v2, ".ui.MallIndexUIv2"

    invoke-static {v5, v1, v2}, Lc0/Q1;->c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    :cond_4
    const-string v2, "com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI"

    invoke-static {v5, v2, v4}, Lc0/Q1;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/util/Map;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_0

    :cond_5
    const-string v1, "offline"

    const-string v2, ".ui.WalletOfflineEntranceUI"

    invoke-static {v5, v1, v2}, Lc0/Q1;->c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    :cond_6
    const-string v2, "com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI"

    invoke-static {v5, v2, v4}, Lc0/Q1;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/util/Map;)Z

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_0

    :cond_7
    const-string v2, "com.tencent.mm.plugin.setting.ui.setting.ColorfulSelfQRCodeUI"

    invoke-static {v5, v2, v4}, Lc0/Q1;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/util/Map;)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_0

    :cond_8
    const-string v2, "setting"

    const-string v4, ".ui.setting.SelfQRCodeUI"

    invoke-static {v5, v2, v4}, Lc0/Q1;->c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_0

    :cond_9
    move v1, v6

    :goto_0
    if-nez v1, :cond_a

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u65e0\u6cd5\u6253\u5f00\u300c"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v3, Lc0/E0;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u300d"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    :cond_a
    return-object v0

    :pswitch_0
    invoke-static {v5, v4}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ld0/b;

    invoke-direct {v2, v5, v3, v1}, Ld0/b;-><init>(Landroid/app/Activity;Lc0/E0;I)V

    invoke-static {v5, v2}, LU/S;->R(Landroid/app/Activity;LP0/a;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
