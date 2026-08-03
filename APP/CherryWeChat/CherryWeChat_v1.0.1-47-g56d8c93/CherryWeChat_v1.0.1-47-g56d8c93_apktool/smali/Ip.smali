.class public final synthetic LIp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LRp;


# direct methods
.method public synthetic constructor <init>(LRp;I)V
    .locals 0

    iput p2, p0, LIp;->a:I

    iput-object p1, p0, LIp;->b:LRp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, LIp;->a:I

    check-cast p1, Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x1b7effffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p0, LIp;->b:LRp;

    iget-object v1, v0, LRp;->h:Landroid/os/Handler;

    new-instance v2, LMp;

    const/4 v3, 0x1

    invoke-direct {v2, v0, p1, v3}, LMp;-><init>(LRp;Ljava/lang/String;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    sget-object p1, LTC;->a:LTC;

    return-object p1

    :pswitch_0
    const-wide v0, -0x1b7c7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p0, LIp;->b:LRp;

    iget-object v1, v0, LRp;->h:Landroid/os/Handler;

    new-instance v2, LMp;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p1, v3}, LMp;-><init>(LRp;Ljava/lang/String;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
