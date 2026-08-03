.class public final synthetic Lc0/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;I)V
    .locals 0

    iput p2, p0, Lc0/D;->a:I

    iput-object p1, p0, Lc0/D;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const-string v0, "$bar"

    const-string v1, "$viewPager"

    iget-object v2, p0, Lc0/D;->b:Landroid/view/ViewGroup;

    iget v3, p0, Lc0/D;->a:I

    packed-switch v3, :pswitch_data_0

    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lc0/y;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lc0/I;->a:Lc0/I;

    invoke-static {v2}, Lc0/I;->b(Landroid/view/ViewGroup;)V

    :cond_0
    return-void

    :pswitch_0
    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lc0/y;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lc0/I;->a:Lc0/I;

    invoke-static {v2}, Lc0/I;->b(Landroid/view/ViewGroup;)V

    :cond_1
    return-void

    :pswitch_1
    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/G;->a:Lc0/G;

    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->e(Landroid/view/View;)V

    return-void

    :pswitch_2
    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/G;->a:Lc0/G;

    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->e(Landroid/view/View;)V

    return-void

    :pswitch_3
    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc0/G;->a:Lc0/G;

    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lc0/G;->e(Landroid/view/View;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
