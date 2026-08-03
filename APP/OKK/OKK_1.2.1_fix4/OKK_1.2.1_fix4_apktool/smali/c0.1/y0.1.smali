.class public final synthetic Lc0/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(ILandroid/app/Activity;I)V
    .locals 0

    iput p3, p0, Lc0/y0;->a:I

    iput p1, p0, Lc0/y0;->b:I

    iput-object p2, p0, Lc0/y0;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "$activity"

    iget v3, p0, Lc0/y0;->a:I

    packed-switch v3, :pswitch_data_0

    iget v3, p0, Lc0/y0;->b:I

    iget-object v4, p0, Lc0/y0;->c:Landroid/app/Activity;

    invoke-static {v4, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lc0/D0;->y:I

    if-ne v3, v2, :cond_2

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v4}, Lc0/G1;->p(Landroid/app/Activity;)Z

    move-result v2

    sget-object v3, Lc0/D0;->a:Lc0/D0;

    if-eqz v2, :cond_1

    sget-boolean v2, Lc0/D0;->z:Z

    if-nez v2, :cond_2

    const-string v2, "chat probe -> open, hide"

    invoke-static {v2}, Lc0/D0;->s(Ljava/lang/String;)V

    sput-boolean v0, Lc0/D0;->z:Z

    invoke-static {v1}, Lc0/D0;->r(Z)V

    invoke-static {v1}, LU/S;->n(Z)V

    goto :goto_0

    :cond_1
    sget-boolean v0, Lc0/D0;->z:Z

    if-eqz v0, :cond_2

    const-string v0, "chat probe -> exit, restore"

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    sput-boolean v1, Lc0/D0;->z:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sput-wide v0, Lc0/D0;->A:J

    invoke-static {v4}, Lc0/D0;->q(Landroid/app/Activity;)V

    :cond_2
    :goto_0
    return-void

    :pswitch_0
    iget v3, p0, Lc0/y0;->b:I

    iget-object v4, p0, Lc0/y0;->c:Landroid/app/Activity;

    invoke-static {v4, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lc0/D0;->w:I

    if-eq v3, v2, :cond_3

    goto/16 :goto_7

    :cond_3
    sget-object v2, Lc0/D0;->a:Lc0/D0;

    const-string v2, "apply ok tab="

    invoke-static {v1}, Lc0/D0;->h(Z)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v1}, Lc0/D0;->r(Z)V

    goto/16 :goto_7

    :cond_4
    sget v3, Lc0/D0;->m:I

    if-eqz v3, :cond_5

    invoke-static {v1}, Lc0/D0;->r(Z)V

    goto/16 :goto_7

    :cond_5
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    sget-wide v7, Lc0/D0;->A:J

    sub-long/2addr v5, v7

    const-wide/16 v7, 0x258

    cmp-long v3, v5, v7

    if-gez v3, :cond_6

    move v3, v0

    goto :goto_1

    :cond_6
    move v3, v1

    :goto_1
    sget-boolean v5, Lc0/D0;->z:Z

    if-eqz v5, :cond_7

    const-string v0, "apply skip: chattingOpen"

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    invoke-static {v1}, Lc0/D0;->r(Z)V

    invoke-static {v1}, LU/S;->n(Z)V

    goto/16 :goto_7

    :cond_7
    if-nez v3, :cond_8

    sget-object v3, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {v4}, Lc0/G1;->p(Landroid/app/Activity;)Z

    move-result v3

    if-eqz v3, :cond_8

    const-string v2, "apply skip: chattingForeground -> set chattingOpen"

    invoke-static {v2}, Lc0/D0;->s(Ljava/lang/String;)V

    sput-boolean v0, Lc0/D0;->z:Z

    invoke-static {v1}, Lc0/D0;->r(Z)V

    invoke-static {v1}, LU/S;->n(Z)V

    goto/16 :goto_7

    :cond_8
    :try_start_0
    invoke-static {v4}, Lc0/D0;->e(Landroid/app/Activity;)Landroid/view/View;

    move-result-object v3

    sget-object v5, Lc0/D0;->h:Landroid/widget/ImageView;

    if-eqz v5, :cond_9

    invoke-static {v5}, Lc0/D0;->m(Landroid/widget/ImageView;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_9
    :goto_2
    invoke-static {v0}, Lc0/D0;->r(Z)V

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    instance-of v6, v5, Landroid/view/ViewGroup;

    if-eqz v6, :cond_a

    check-cast v5, Landroid/view/ViewGroup;

    goto :goto_3

    :cond_a
    const/4 v5, 0x0

    :goto_3
    if-eqz v5, :cond_c

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v6

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v7

    sub-int/2addr v7, v0

    if-eq v6, v7, :cond_b

    invoke-virtual {v3}, Landroid/view/View;->bringToFront()V

    :cond_b
    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v6

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v7

    sub-int/2addr v7, v0

    if-eq v6, v7, :cond_c

    invoke-virtual {v5}, Landroid/view/View;->bringToFront()V

    :cond_c
    sget-object v0, Lc0/D0;->h:Landroid/widget/ImageView;

    sget-object v5, Lc0/D0;->o:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_d

    goto :goto_4

    :cond_d
    if-eqz v0, :cond_e

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_e

    invoke-static {v0}, Lc0/D0;->i(Landroid/widget/ImageView;)Z

    move-result v5

    if-eqz v5, :cond_f

    :cond_e
    :goto_4
    if-eqz v0, :cond_f

    invoke-static {v0, v1}, Lc0/D0;->b(Landroid/widget/ImageView;Z)V

    :cond_f
    invoke-static {v4}, Lc0/D0;->n(Landroid/app/Activity;)V

    sget v0, Lc0/D0;->m:I

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " vis="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    sget-object v0, LD0/l;->a:LD0/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :goto_5
    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_6
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "apply fail: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/D0;->s(Ljava/lang/String;)V

    :cond_10
    :goto_7
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
