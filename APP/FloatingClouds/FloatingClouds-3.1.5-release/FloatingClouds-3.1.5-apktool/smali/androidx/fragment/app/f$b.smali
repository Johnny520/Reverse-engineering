.class public final Landroidx/fragment/app/f$b;
.super Landroidx/fragment/app/f$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final l:Landroidx/fragment/app/e;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/f$c$b;Landroidx/fragment/app/f$c$a;Landroidx/fragment/app/e;)V
    .locals 2

    iget-object v0, p3, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    const-string v1, "fragmentStateManager.fragment"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, v0}, Landroidx/fragment/app/f$c;-><init>(Landroidx/fragment/app/f$c$b;Landroidx/fragment/app/f$c$a;Landroidx/fragment/app/b;)V

    iput-object p3, p0, Landroidx/fragment/app/f$b;->l:Landroidx/fragment/app/e;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/f$c;->b()V

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/b;

    iput-boolean v0, v1, Landroidx/fragment/app/b;->m:Z

    iget-object v0, p0, Landroidx/fragment/app/f$b;->l:Landroidx/fragment/app/e;

    invoke-virtual {v0}, Landroidx/fragment/app/e;->k()V

    return-void
.end method

.method public final e()V
    .locals 7

    iget-boolean v0, p0, Landroidx/fragment/app/f$c;->h:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/f$c;->h:Z

    iget-object v0, p0, Landroidx/fragment/app/f$c;->b:Landroidx/fragment/app/f$c$a;

    sget-object v1, Landroidx/fragment/app/f$c$a;->b:Landroidx/fragment/app/f$c$a;

    const-string v2, " for Fragment "

    const-string v3, "FragmentManager"

    const/4 v4, 0x2

    const-string v5, "fragmentStateManager.fragment"

    iget-object v6, p0, Landroidx/fragment/app/f$b;->l:Landroidx/fragment/app/e;

    if-ne v0, v1, :cond_5

    iget-object v0, v6, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    invoke-static {v0, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Landroidx/fragment/app/b;->G:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/b;->b()Landroidx/fragment/app/b$d;

    move-result-object v5

    iput-object v1, v5, Landroidx/fragment/app/b$d;->k:Landroid/view/View;

    invoke-static {v4}, La/e7;->J(I)Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "requestFocus: Saved focused view "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/f$c;->c:Landroidx/fragment/app/b;

    invoke-virtual {v1}, Landroidx/fragment/app/b;->B()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    invoke-virtual {v6}, Landroidx/fragment/app/e;->b()V

    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v2

    cmpg-float v2, v2, v3

    if-nez v2, :cond_3

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_3

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    iget-object v0, v0, Landroidx/fragment/app/b;->J:Landroidx/fragment/app/b$d;

    if-nez v0, :cond_4

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_4
    iget v0, v0, Landroidx/fragment/app/b$d;->j:F

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void

    :cond_5
    sget-object v1, Landroidx/fragment/app/f$c$a;->c:Landroidx/fragment/app/f$c$a;

    if-ne v0, v1, :cond_7

    iget-object v0, v6, Landroidx/fragment/app/e;->c:Landroidx/fragment/app/b;

    invoke-static {v0, v5}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/b;->B()Landroid/view/View;

    move-result-object v1

    invoke-static {v4}, La/e7;->J(I)Z

    move-result v4

    if-eqz v4, :cond_6

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Clearing focus "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

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

    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->clearFocus()V

    :cond_7
    :goto_1
    return-void
.end method
