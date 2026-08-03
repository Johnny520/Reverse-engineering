.class public final synthetic Lf8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LQ4;


# direct methods
.method public synthetic constructor <init>(LQ4;I)V
    .locals 0

    iput p2, p0, Lf8;->a:I

    iput-object p1, p0, Lf8;->b:LQ4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lf8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf8;->b:LQ4;

    invoke-virtual {v0}, LQ4;->a()Ljava/lang/Object;

    return-void

    :pswitch_0
    iget-object v0, p0, Lf8;->b:LQ4;

    invoke-virtual {v0}, LQ4;->a()Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
