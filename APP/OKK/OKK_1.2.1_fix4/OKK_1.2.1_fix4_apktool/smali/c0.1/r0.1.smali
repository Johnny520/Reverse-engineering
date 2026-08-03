.class public final synthetic Lc0/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lc0/r0;->a:I

    iput-object p2, p0, Lc0/r0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lc0/r0;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "$mainUi"

    iget-object v1, p0, Lc0/r0;->b:Ljava/lang/Object;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/s0;->a:Lc0/s0;

    invoke-virtual {v0, v1}, Lc0/s0;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    const-string v0, "$mainUi"

    iget-object v1, p0, Lc0/r0;->b:Ljava/lang/Object;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/s0;->a:Lc0/s0;

    invoke-virtual {v0, v1}, Lc0/s0;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_1
    const-string v0, "$mainUi"

    iget-object v1, p0, Lc0/r0;->b:Ljava/lang/Object;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/s0;->a:Lc0/s0;

    invoke-virtual {v0, v1}, Lc0/s0;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_2
    const-string v0, "$mainUi"

    iget-object v1, p0, Lc0/r0;->b:Ljava/lang/Object;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/s0;->a:Lc0/s0;

    invoke-virtual {v0, v1}, Lc0/s0;->a(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
