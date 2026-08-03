.class public final synthetic Lc0/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ImageView;I)V
    .locals 0

    iput p2, p0, Lc0/w0;->a:I

    iput-object p1, p0, Lc0/w0;->b:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const/4 v0, 0x1

    const-string v1, "$iv"

    iget-object v2, p0, Lc0/w0;->b:Landroid/widget/ImageView;

    iget v3, p0, Lc0/w0;->a:I

    packed-switch v3, :pswitch_data_0

    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/D0;->a:Lc0/D0;

    invoke-static {v2}, Lc0/D0;->m(Landroid/widget/ImageView;)V

    invoke-static {v2}, Lc0/D0;->i(Landroid/widget/ImageView;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v2, v0}, Lc0/D0;->b(Landroid/widget/ImageView;Z)V

    :cond_0
    return-void

    :pswitch_0
    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lc0/D0;->a:Lc0/D0;

    invoke-static {v2}, Lc0/D0;->i(Landroid/widget/ImageView;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v2, v0}, Lc0/D0;->b(Landroid/widget/ImageView;Z)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
