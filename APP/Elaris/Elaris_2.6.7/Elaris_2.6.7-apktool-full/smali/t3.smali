.class public final Lt3;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/mr/elaris/ElarisStatusActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/mr/elaris/ElarisStatusActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lt3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lt3;->b:Lcom/mr/elaris/ElarisStatusActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget v0, p0, Lt3;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lt3;->b:Lcom/mr/elaris/ElarisStatusActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/mr/elaris/ElarisStatusActivity;->a(Lcom/mr/elaris/ElarisStatusActivity;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-static {p0, p1}, Lcom/mr/elaris/ElarisStatusActivity;->d(Lcom/mr/elaris/ElarisStatusActivity;Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
