.class public final synthetic LV7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILJA;LKA;LSA;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LV7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LV7;->c:Ljava/lang/Object;

    iput-object p3, p0, LV7;->d:Ljava/lang/Object;

    iput-object p4, p0, LV7;->e:Ljava/lang/Object;

    iput p1, p0, LV7;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/FrameLayout;LX7;ILIv;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, LV7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV7;->c:Ljava/lang/Object;

    iput-object p2, p0, LV7;->d:Ljava/lang/Object;

    iput p3, p0, LV7;->b:I

    iput-object p4, p0, LV7;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    iget p1, p0, LV7;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LV7;->c:Ljava/lang/Object;

    check-cast p1, LJA;

    iget-object v0, p0, LV7;->d:Ljava/lang/Object;

    check-cast v0, LKA;

    iget-object v1, p0, LV7;->e:Ljava/lang/Object;

    check-cast v1, LSA;

    iget-object v2, v0, LKA;->a:Landroid/widget/FrameLayout;

    new-instance v3, La9;

    iget v4, p0, LV7;->b:I

    invoke-direct {v3, v4, p1, v0, v1}, La9;-><init>(ILJA;LKA;LSA;)V

    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const v0, 0x3f733333    # 0.95f

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-wide/16 v0, 0x64

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    new-instance v0, Ln3;

    const/16 v1, 0x10

    invoke-direct {v0, v1, v2, v3}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    return-void

    :pswitch_0
    iget-object p1, p0, LV7;->c:Ljava/lang/Object;

    check-cast p1, Landroid/widget/FrameLayout;

    iget-object v0, p0, LV7;->d:Ljava/lang/Object;

    check-cast v0, LX7;

    iget-object v1, p0, LV7;->e:Ljava/lang/Object;

    check-cast v1, LIv;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x1c7ccfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, LX7;->c:Ljava/util/ArrayList;

    iget v4, p0, LV7;->b:I

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static {p1, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    iget-object p1, v1, LIv;->a:Ljava/lang/Object;

    check-cast p1, Landroid/app/AlertDialog;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    invoke-static {v0}, LX7;->a(LX7;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object v0, Lms;->a:LPg;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-wide v2, -0x1c7d2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v1}, LPg;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
