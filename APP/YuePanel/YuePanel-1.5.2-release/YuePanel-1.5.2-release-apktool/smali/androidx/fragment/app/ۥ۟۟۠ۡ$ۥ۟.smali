.class public final Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟;
.super Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/ۥ۟۟۠ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ۟۟۟ۢ:Landroidx/fragment/app/ۥ۟۟۟ۧ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ;Landroidx/fragment/app/ۥ۟۟۟ۧ;LYue/ۥۣ۟ۨۧ;)V
    .locals 2
    .param p1    # Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Landroidx/fragment/app/ۥ۟۟۟ۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۟ۨۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "finalState"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleImpact"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentStateManager"

    invoke-static {p3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancellationSignal"

    invoke-static {p4, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroidx/fragment/app/ۥ۟۟۟ۧ;->ۥ۟۟۟ۥ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    const-string v1, "fragmentStateManager.fragment"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, v0, p4}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;-><init>(Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ۟;Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ;Landroidx/fragment/app/Fragment;LYue/ۥۣ۟ۨۧ;)V

    iput-object p3, p0, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟;->ۥ۟۟۟ۢ:Landroidx/fragment/app/ۥ۟۟۟ۧ;

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۟()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟۟()V

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟;->ۥ۟۟۟ۢ:Landroidx/fragment/app/ۥ۟۟۟ۧ;

    invoke-virtual {v0}, Landroidx/fragment/app/ۥ۟۟۟ۧ;->ۥ۟۟۟ۧ()V

    return-void
.end method

.method public ۥ۟۟۟ۨ()V
    .locals 6

    invoke-virtual {p0}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥۣ۟۟۟()Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ;

    move-result-object v0

    sget-object v1, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ;

    const-string v2, " for Fragment "

    const-string v3, "FragmentManager"

    const/4 v4, 0x2

    const-string v5, "fragmentStateManager.fragment"

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟;->ۥ۟۟۟ۢ:Landroidx/fragment/app/ۥ۟۟۟ۧ;

    invoke-virtual {v0}, Landroidx/fragment/app/ۥ۟۟۟ۧ;->ۥ۟۟۟ۥ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-static {v0, v5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setFocusedView(Landroid/view/View;)V

    invoke-static {v4}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧۨ(I)Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "requestFocus: Saved focused view "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥ۟۟۟ۢ()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    move-result-object v1

    const-string v2, "this.fragment.requireView()"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iget-object v2, p0, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟;->ۥ۟۟۟ۢ:Landroidx/fragment/app/ۥ۟۟۟ۧ;

    invoke-virtual {v2}, Landroidx/fragment/app/ۥ۟۟۟ۧ;->ۥ۟()V

    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v2

    cmpg-float v2, v2, v3

    if-nez v2, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getPostOnViewCreatedAlpha()F

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟;->ۥۣ۟۟۟()Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ;

    move-result-object v0

    sget-object v1, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ;->ۥ۟۟۠ۥ:Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟۟$ۥ;

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ۟;->ۥ۟۟۟ۢ:Landroidx/fragment/app/ۥ۟۟۟ۧ;

    invoke-virtual {v0}, Landroidx/fragment/app/ۥ۟۟۟ۧ;->ۥ۟۟۟ۥ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-static {v0, v5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    move-result-object v1

    const-string v5, "fragment.requireView()"

    invoke-static {v1, v5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧۨ(I)Z

    move-result v4

    if-eqz v4, :cond_4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Clearing focus "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " on view "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    :cond_5
    :goto_0
    return-void
.end method
