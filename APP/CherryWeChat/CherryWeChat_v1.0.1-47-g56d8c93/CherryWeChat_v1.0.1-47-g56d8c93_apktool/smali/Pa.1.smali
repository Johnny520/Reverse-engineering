.class public final synthetic LPa;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    iput p4, p0, LPa;->a:I

    iput-object p1, p0, LPa;->b:Ljava/lang/Object;

    iput p3, p0, LPa;->c:I

    iput-object p2, p0, LPa;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, LPa;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LPa;->b:Ljava/lang/Object;

    check-cast v0, LBd;

    iget-object v1, p0, LPa;->d:Ljava/lang/Object;

    iget-object v0, v0, LBd;->b:LBu;

    iget v2, p0, LPa;->c:I

    invoke-interface {v0, v2, v1}, LBu;->b(ILjava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, p0, LPa;->b:Ljava/lang/Object;

    check-cast v0, LQa;

    iget-object v1, p0, LPa;->d:Ljava/lang/Object;

    check-cast v1, Landroid/content/IntentSender$SendIntentException;

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    const-string v3, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object v1

    iget v2, p0, LPa;->c:I

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Lc1;->a(IILandroid/content/Intent;)Z

    return-void

    :pswitch_1
    iget-object v0, p0, LPa;->b:Ljava/lang/Object;

    check-cast v0, LQa;

    iget-object v1, p0, LPa;->d:Ljava/lang/Object;

    check-cast v1, LS0;

    iget-object v1, v1, LS0;->a:Ljava/lang/Object;

    iget-object v2, v0, Lc1;->a:Ljava/util/LinkedHashMap;

    iget v3, p0, LPa;->c:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, v0, Lc1;->e:Ljava/util/LinkedHashMap;

    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LX0;

    if-eqz v3, :cond_1

    iget-object v4, v3, LX0;->a:LR0;

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-nez v4, :cond_2

    iget-object v3, v0, Lc1;->g:Landroid/os/Bundle;

    invoke-virtual {v3, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v0, v0, Lc1;->f:Ljava/util/LinkedHashMap;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iget-object v3, v3, LX0;->a:LR0;

    iget-object v0, v0, Lc1;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3, v1}, LR0;->a(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
