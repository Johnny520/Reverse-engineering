.class public LYue/ۥۢ۠ۥ۠;
.super Landroid/view/ActionMode;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢ۠ۥ۠$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:Landroid/content/Context;

.field public final ۥ۟:LYue/ۥ۟۟ۧ۟;


# direct methods
.method public constructor <init>(Landroid/content/Context;LYue/ۥ۟۟ۧ۟;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    iput-object p1, p0, LYue/ۥۢ۠ۥ۠;->ۥ:Landroid/content/Context;

    iput-object p2, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    return-void
.end method


# virtual methods
.method public finish()V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0}, LYue/ۥ۟۟ۧ۟;->ۥ()V

    return-void
.end method

.method public getCustomView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0}, LYue/ۥ۟۟ۧ۟;->ۥ۟()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 3

    new-instance v0, LYue/ۥۡ۠ۧ۠;

    iget-object v1, p0, LYue/ۥۢ۠ۥ۠;->ۥ:Landroid/content/Context;

    iget-object v2, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v2}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟()Landroid/view/Menu;

    move-result-object v2

    check-cast v2, LYue/ۥۢ۠ۥۡ;

    invoke-direct {v0, v1, v2}, LYue/ۥۡ۠ۧ۠;-><init>(Landroid/content/Context;LYue/ۥۢ۠ۥۡ;)V

    return-object v0
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۟()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۟۟()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTag()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۟ۡ()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTitleOptionalHint()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۟ۢ()Z

    move-result v0

    return v0
.end method

.method public invalidate()V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0}, LYue/ۥ۟۟ۧ۟;->ۥۣ۟۟۟()V

    return-void
.end method

.method public isTitleOptional()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۟ۤ()Z

    move-result v0

    return v0
.end method

.method public setCustomView(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۟ۦ(Landroid/view/View;)V

    return-void
.end method

.method public setSubtitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۟ۧ(I)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۟ۨ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTag(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۠(Ljava/lang/Object;)V

    return-void
.end method

.method public setTitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۠۟(I)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۠۠(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitleOptionalHint(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    invoke-virtual {v0, p1}, LYue/ۥ۟۟ۧ۟;->ۥ۟۟۠ۡ(Z)V

    return-void
.end method
