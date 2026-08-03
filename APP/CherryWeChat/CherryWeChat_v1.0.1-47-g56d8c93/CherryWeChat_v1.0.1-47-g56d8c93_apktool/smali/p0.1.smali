.class public final Lp0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Lp0;->a:I

    iput-object p2, p0, Lp0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    iget v0, p0, Lp0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/exoplayer2/ui/TrackSelectionView;

    iget-object v1, v0, Lcom/google/android/exoplayer2/ui/TrackSelectionView;->d:Ljava/util/HashMap;

    iget-object v2, v0, Lcom/google/android/exoplayer2/ui/TrackSelectionView;->a:Landroid/widget/CheckedTextView;

    if-ne p1, v2, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcom/google/android/exoplayer2/ui/TrackSelectionView;->h:Z

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lcom/google/android/exoplayer2/ui/TrackSelectionView;->b:Landroid/widget/CheckedTextView;

    const/4 v3, 0x0

    if-ne p1, v2, :cond_1

    iput-boolean v3, v0, Lcom/google/android/exoplayer2/ui/TrackSelectionView;->h:Z

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    :goto_0
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/ui/TrackSelectionView;->a()V

    return-void

    :cond_1
    iput-boolean v3, v0, Lcom/google/android/exoplayer2/ui/TrackSelectionView;->h:Z

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :pswitch_0
    iget-object p1, p0, Lp0;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->M:LpB;

    if-nez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    iget-object p1, p1, LpB;->b:Lqr;

    :goto_1
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lqr;->collapseActionView()Z

    :cond_3
    return-void

    :pswitch_1
    iget-object p1, p0, Lp0;->b:Ljava/lang/Object;

    check-cast p1, LMq;

    iget v0, p1, LMq;->X:I

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    invoke-virtual {p1, v1}, LMq;->D(I)V

    iget-object v0, p1, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Lhi;->y()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x551100d1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_4
    if-ne v0, v1, :cond_5

    invoke-virtual {p1, v2}, LMq;->D(I)V

    iget-object v0, p1, LMq;->Z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Lhi;->y()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x551100d2

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    :cond_5
    :goto_2
    return-void

    :pswitch_2
    const-wide v0, -0x2b6dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v0, -0x2b6ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, p0, Lp0;->b:Ljava/lang/Object;

    check-cast v0, Lvx;

    iget-object v1, v0, Lvx;->c:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    iget-object v1, v0, Lvx;->d:Ljava/io/Serializable;

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    iget-object v1, v0, Lvx;->a:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    iget-object v1, v0, Lvx;->b:Ljava/io/Serializable;

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    new-instance v7, LP3;

    const/16 v1, 0x16

    invoke-direct {v7, v1, v0, p1}, LP3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {v2 .. v7}, Lgf;->Q(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lp0;->b:Ljava/lang/Object;

    check-cast v0, Lv2;

    iget-object v1, v0, Lv2;->h:Landroid/widget/Button;

    if-ne p1, v1, :cond_6

    iget-object v1, v0, Lv2;->j:Landroid/os/Message;

    if-eqz v1, :cond_6

    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    goto :goto_3

    :cond_6
    iget-object v1, v0, Lv2;->k:Landroid/widget/Button;

    if-ne p1, v1, :cond_7

    iget-object v1, v0, Lv2;->m:Landroid/os/Message;

    if-eqz v1, :cond_7

    invoke-static {v1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    goto :goto_3

    :cond_7
    iget-object v1, v0, Lv2;->n:Landroid/widget/Button;

    if-ne p1, v1, :cond_8

    iget-object p1, v0, Lv2;->p:Landroid/os/Message;

    if-eqz p1, :cond_8

    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    move-result-object p1

    goto :goto_3

    :cond_8
    const/4 p1, 0x0

    :goto_3
    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_9
    iget-object p1, v0, Lv2;->D:Lt2;

    const/4 v1, 0x1

    iget-object v0, v0, Lv2;->b:Lx2;

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void

    :pswitch_4
    iget-object p1, p0, Lp0;->b:Ljava/lang/Object;

    check-cast p1, LI0;

    invoke-virtual {p1}, LI0;->a()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
