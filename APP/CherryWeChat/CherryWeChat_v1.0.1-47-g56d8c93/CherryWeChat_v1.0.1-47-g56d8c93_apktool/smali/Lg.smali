.class public final synthetic LLg;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/widget/LinearLayout;I)V
    .locals 0

    iput p4, p0, LLg;->a:I

    iput-object p1, p0, LLg;->b:Ljava/lang/Object;

    iput-object p2, p0, LLg;->c:Ljava/lang/Object;

    iput-object p3, p0, LLg;->d:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    iget p1, p0, LLg;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LLg;->b:Ljava/lang/Object;

    check-cast p1, LWg;

    iget-object v0, p0, LLg;->c:Ljava/lang/Object;

    check-cast v0, Landroid/widget/ImageView;

    iget-boolean v1, p1, LWg;->c:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    iput-boolean v1, p1, LWg;->c:Z

    new-instance v3, Landroid/view/animation/RotateAnimation;

    iget-boolean v1, p1, LWg;->c:Z

    const/high16 v4, 0x43340000    # 180.0f

    const/4 v5, 0x0

    move v6, v4

    if-eqz v1, :cond_0

    move v4, v5

    :cond_0
    if-eqz v1, :cond_1

    move v5, v6

    :cond_1
    const/4 v8, 0x1

    const/high16 v9, 0x3f000000    # 0.5f

    const/4 v6, 0x1

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct/range {v3 .. v9}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    const-wide/16 v4, 0x12c

    invoke-virtual {v3, v4, v5}, Landroid/view/animation/Animation;->setDuration(J)V

    invoke-virtual {v3, v2}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    invoke-virtual {v0, v3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    iget-boolean p1, p1, LWg;->c:Z

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    const/16 p1, 0x8

    :goto_0
    iget-object v0, p0, LLg;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :pswitch_0
    iget-object p1, p0, LLg;->b:Ljava/lang/Object;

    check-cast p1, Landroid/widget/TextView;

    iget-object v0, p0, LLg;->c:Ljava/lang/Object;

    check-cast v0, LEC;

    iget-object v1, p0, LLg;->d:Landroid/widget/LinearLayout;

    check-cast v1, LOg;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-wide v3, -0x58ecfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x58fcfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v5, -0x5883fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, LEC;->c:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v5, -0x588efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, LMb;

    const/4 v6, 0x2

    invoke-direct {v5, v0, p1, v1, v6}, LMb;-><init>(Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V

    const/4 p1, 0x0

    invoke-static {v2, v3, v4, v5, p1}, Lgf;->S(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
