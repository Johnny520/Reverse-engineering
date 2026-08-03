.class public final synthetic LA7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/ViewGroup;

.field public final synthetic c:Landroid/view/ViewGroup;

.field public final synthetic d:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;Landroid/view/ViewGroup;Landroid/view/View;I)V
    .locals 0

    iput p4, p0, LA7;->a:I

    iput-object p1, p0, LA7;->b:Landroid/view/ViewGroup;

    iput-object p2, p0, LA7;->c:Landroid/view/ViewGroup;

    iput-object p3, p0, LA7;->d:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    iget p1, p0, LA7;->a:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, LB7;

    const/4 p2, 0x0

    iget-object p3, p0, LA7;->b:Landroid/view/ViewGroup;

    iget-object p4, p0, LA7;->c:Landroid/view/ViewGroup;

    iget-object p5, p0, LA7;->d:Landroid/view/View;

    invoke-direct {p1, p3, p4, p5, p2}, LB7;-><init>(Landroid/view/ViewGroup;Landroid/view/ViewGroup;Landroid/view/View;I)V

    invoke-virtual {p3, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_0
    new-instance p1, LB7;

    const/4 p2, 0x1

    iget-object p3, p0, LA7;->b:Landroid/view/ViewGroup;

    iget-object p4, p0, LA7;->c:Landroid/view/ViewGroup;

    iget-object p5, p0, LA7;->d:Landroid/view/View;

    invoke-direct {p1, p3, p4, p5, p2}, LB7;-><init>(Landroid/view/ViewGroup;Landroid/view/ViewGroup;Landroid/view/View;I)V

    invoke-virtual {p3, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
