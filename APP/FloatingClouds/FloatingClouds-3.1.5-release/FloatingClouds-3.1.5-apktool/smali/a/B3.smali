.class public final synthetic La/B3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/savedstate/a$b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, La/B3;->a:I

    iput-object p2, p0, La/B3;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget v0, p0, La/B3;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/B3;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/m;

    invoke-static {v0}, Landroidx/lifecycle/m;->a(Landroidx/lifecycle/m;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, La/B3;->b:Ljava/lang/Object;

    check-cast v0, La/e7;

    invoke-virtual {v0}, La/e7;->W()Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, La/B3;->b:Ljava/lang/Object;

    check-cast v0, La/X6;

    invoke-static {v0}, La/X6;->f(La/X6;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, La/B3;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/ComponentActivity;

    invoke-static {v0}, Landroidx/activity/ComponentActivity;->b(Landroidx/activity/ComponentActivity;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
