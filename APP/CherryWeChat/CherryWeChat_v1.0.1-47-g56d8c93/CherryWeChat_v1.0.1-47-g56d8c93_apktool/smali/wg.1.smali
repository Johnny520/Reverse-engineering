.class public final synthetic Lwg;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lxg;


# direct methods
.method public synthetic constructor <init>(Lxg;I)V
    .locals 0

    iput p2, p0, Lwg;->a:I

    iput-object p1, p0, Lwg;->b:Lxg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    iget p1, p0, Lwg;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lwg;->b:Lxg;

    iget-object p1, p1, Lxg;->a:LQC;

    invoke-virtual {p1}, LQC;->h()V

    return-void

    :pswitch_0
    iget-object p1, p0, Lwg;->b:Lxg;

    iget-object p1, p1, Lxg;->a:LQC;

    invoke-virtual {p1}, LQC;->h()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
