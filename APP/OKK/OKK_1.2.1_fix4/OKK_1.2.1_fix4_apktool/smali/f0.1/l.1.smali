.class public final synthetic Lf0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LP0/a;


# direct methods
.method public synthetic constructor <init>(LP0/a;I)V
    .locals 0

    iput p2, p0, Lf0/l;->a:I

    iput-object p1, p0, Lf0/l;->b:LP0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lf0/l;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "$refresh"

    iget-object v1, p0, Lf0/l;->b:LP0/a;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, LP0/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_0
    const-string v0, "$refresh"

    iget-object v1, p0, Lf0/l;->b:LP0/a;

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, LP0/a;->invoke()Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
