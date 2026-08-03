.class public final synthetic Lc0/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(ILandroid/widget/ImageView;I)V
    .locals 0

    iput p3, p0, Lc0/v0;->a:I

    iput p1, p0, Lc0/v0;->b:I

    iput-object p2, p0, Lc0/v0;->c:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    const-string v0, "$iv"

    iget v1, p0, Lc0/v0;->a:I

    packed-switch v1, :pswitch_data_0

    iget v1, p0, Lc0/v0;->b:I

    iget-object v2, p0, Lc0/v0;->c:Landroid/widget/ImageView;

    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lc0/D0;->x:I

    if-ne v1, v0, :cond_0

    sget-object v0, Lc0/D0;->a:Lc0/D0;

    invoke-static {v2}, Lc0/D0;->c(Landroid/widget/ImageView;)V

    :cond_0
    return-void

    :pswitch_0
    iget v1, p0, Lc0/v0;->b:I

    iget-object v2, p0, Lc0/v0;->c:Landroid/widget/ImageView;

    invoke-static {v2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lc0/D0;->x:I

    if-ne v1, v0, :cond_1

    sget-object v0, Lc0/D0;->a:Lc0/D0;

    invoke-static {v2}, Lc0/D0;->c(Landroid/widget/ImageView;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
