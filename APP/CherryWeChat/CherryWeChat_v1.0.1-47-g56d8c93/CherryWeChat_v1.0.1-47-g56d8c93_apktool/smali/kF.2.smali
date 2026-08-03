.class public final LkF;
.super LfG;
.source ""


# instance fields
.field public final synthetic g:I

.field public final synthetic h:LmF;


# direct methods
.method public synthetic constructor <init>(LmF;I)V
    .locals 0

    iput p2, p0, LkF;->g:I

    const/16 p2, 0x15

    invoke-direct {p0, p2}, LfG;-><init>(I)V

    iput-object p1, p0, LkF;->h:LmF;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    iget v0, p0, LkF;->g:I

    const/4 v1, 0x0

    iget-object v2, p0, LkF;->h:LmF;

    packed-switch v0, :pswitch_data_0

    iput-object v1, v2, LmF;->t:LHE;

    iget-object v0, v2, LmF;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void

    :pswitch_0
    iget-boolean v0, v2, LmF;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, v2, LmF;->g:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, v2, LmF;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v3}, Landroid/view/View;->setTranslationY(F)V

    :cond_0
    iget-object v0, v2, LmF;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget-object v0, v2, LmF;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    iput-object v1, v2, LmF;->t:LHE;

    iget-object v0, v2, LmF;->k:LP3;

    if-eqz v0, :cond_1

    iget-object v3, v2, LmF;->j:LlF;

    invoke-virtual {v0, v3}, LP3;->h(LI0;)V

    iput-object v1, v2, LmF;->j:LlF;

    iput-object v1, v2, LmF;->k:LP3;

    :cond_1
    iget-object v0, v2, LmF;->c:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_2

    sget-object v1, LlE;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, LcE;->c(Landroid/view/View;)V

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
