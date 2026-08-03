.class public final Lmi;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic a:LHi;

.field public final synthetic b:Lni;


# direct methods
.method public constructor <init>(Lni;LHi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmi;->b:Lni;

    iput-object p2, p0, Lmi;->a:LHi;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lmi;->a:LHi;

    iget-object v0, p1, LHi;->c:Lhi;

    invoke-virtual {p1}, LHi;->k()V

    iget-object p1, v0, Lhi;->E:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Lmi;->b:Lni;

    iget-object v0, v0, Lni;->a:Lzi;

    invoke-virtual {v0}, Lzi;->F()LPg;

    const v0, 0x550a01fc

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lnd;

    if-eqz v2, :cond_0

    check-cast v1, Lnd;

    goto :goto_0

    :cond_0
    new-instance v1, Lnd;

    invoke-direct {v1, p1}, Lnd;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :goto_0
    invoke-virtual {v1}, Lnd;->e()V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
