.class public final synthetic La/W7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/app/Activity;I)V
    .locals 0

    iput p3, p0, La/W7;->a:I

    iput-object p1, p0, La/W7;->b:Landroid/view/View;

    iput-object p2, p0, La/W7;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    iget p1, p0, La/W7;->a:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, La/X7;

    iget-object v0, p0, La/W7;->c:Landroid/app/Activity;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, La/X7;-><init>(Landroid/app/Activity;I)V

    iget-object v0, p0, La/W7;->b:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x1

    return p1

    :pswitch_0
    new-instance p1, La/X7;

    iget-object v0, p0, La/W7;->c:Landroid/app/Activity;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, La/X7;-><init>(Landroid/app/Activity;I)V

    iget-object v0, p0, La/W7;->b:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
