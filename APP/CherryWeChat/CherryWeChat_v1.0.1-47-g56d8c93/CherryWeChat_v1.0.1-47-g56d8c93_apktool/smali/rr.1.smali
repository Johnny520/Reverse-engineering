.class public final Lrr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# instance fields
.field public a:LXm;

.field public final b:Landroid/view/ActionProvider;


# direct methods
.method public constructor <init>(Lur;Landroid/view/ActionProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lrr;->b:Landroid/view/ActionProvider;

    return-void
.end method


# virtual methods
.method public final onActionProviderVisibilityChanged(Z)V
    .locals 1

    iget-object p1, p0, Lrr;->a:LXm;

    if-eqz p1, :cond_0

    iget-object p1, p1, LXm;->b:Ljava/lang/Object;

    check-cast p1, Lqr;

    iget-object p1, p1, Lqr;->n:Llr;

    const/4 v0, 0x1

    iput-boolean v0, p1, Llr;->h:Z

    invoke-virtual {p1, v0}, Llr;->p(Z)V

    :cond_0
    return-void
.end method
