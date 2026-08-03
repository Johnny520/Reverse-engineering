.class public final LR7;
.super LUl;
.source ""


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Landroidx/recyclerview/widget/g;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/g;I)V
    .locals 0

    iput p2, p0, LR7;->d:I

    iput-object p1, p0, LR7;->e:Landroidx/recyclerview/widget/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, LUl;->a:I

    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o;)V
    .locals 2

    iget v0, p0, LR7;->d:I

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x179bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x179efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-super {p0, p1, p2}, LUl;->a(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o;)V

    iget-object p1, p2, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setPressed(Z)V

    return-void

    :pswitch_0
    const-wide v0, -0xe4dafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0xe4ddfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-super {p0, p1, p2}, LUl;->a(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o;)V

    iget-object p1, p2, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setPressed(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()I
    .locals 2

    iget v0, p0, LR7;->d:I

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x1781fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1784fffff835L

    :goto_0
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const v0, 0x30003

    return v0

    :pswitch_0
    const-wide v0, -0xe4c0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0xe4c3fffff835L

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l(Landroidx/recyclerview/widget/o;Landroidx/recyclerview/widget/o;)V
    .locals 3

    iget v0, p0, LR7;->d:I

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x1787fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x178afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1791fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p0, LR7;->e:Landroidx/recyclerview/widget/g;

    check-cast v0, LQ7;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->getAdapterPosition()I

    move-result p1

    invoke-virtual {p2}, Landroidx/recyclerview/widget/o;->getAdapterPosition()I

    move-result p2

    iget-object v1, v0, LQ7;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LHb;

    invoke-virtual {v1, p2, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/g;->notifyItemMoved(II)V

    return-void

    :pswitch_0
    const-wide v0, -0xe4c6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0xe4c9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0xe4d0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p0, LR7;->e:Landroidx/recyclerview/widget/g;

    check-cast v0, LQ7;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->getAdapterPosition()I

    move-result p1

    invoke-virtual {p2}, Landroidx/recyclerview/widget/o;->getAdapterPosition()I

    move-result p2

    iget-object v1, v0, LQ7;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO7;

    invoke-virtual {v1, p2, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/g;->notifyItemMoved(II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Landroidx/recyclerview/widget/o;I)V
    .locals 1

    iget v0, p0, LR7;->d:I

    packed-switch v0, :pswitch_data_0

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setPressed(Z)V

    :cond_0
    return-void

    :pswitch_0
    if-eqz p2, :cond_1

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroidx/recyclerview/widget/o;->itemView:Landroid/view/View;

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setPressed(Z)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n()V
    .locals 2

    iget v0, p0, LR7;->d:I

    packed-switch v0, :pswitch_data_0

    const-wide v0, -0x1798fffff835L

    :goto_0
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void

    :pswitch_0
    const-wide v0, -0xe4d7fffff835L

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
