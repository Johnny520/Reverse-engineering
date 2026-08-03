.class public final synthetic Ld0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LP0/a;


# direct methods
.method public synthetic constructor <init>(LP0/a;I)V
    .locals 0

    iput p2, p0, Ld0/f;->a:I

    iput-object p1, p0, Ld0/f;->b:LP0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Ld0/f;->a:I

    packed-switch p1, :pswitch_data_0

    const-string p1, "$onClick"

    iget-object v0, p0, Ld0/f;->b:LP0/a;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, LP0/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_0
    const-string p1, "$onClick"

    iget-object v0, p0, Ld0/f;->b:LP0/a;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, LP0/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_1
    const-string p1, "$onClick"

    iget-object v0, p0, Ld0/f;->b:LP0/a;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, LP0/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_2
    const-string p1, "$onClick"

    iget-object v0, p0, Ld0/f;->b:LP0/a;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, LP0/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_3
    const-string p1, "$click"

    iget-object v0, p0, Ld0/f;->b:LP0/a;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, LP0/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_4
    const-string p1, "$click"

    iget-object v0, p0, Ld0/f;->b:LP0/a;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, LP0/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_5
    const-string p1, "$onAction"

    iget-object v0, p0, Ld0/f;->b:LP0/a;

    invoke-static {v0, p1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, LP0/a;->invoke()Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
