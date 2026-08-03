.class public abstract LYue/ۥ۟ۢۥۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ۟۟۟ۦ:Landroid/content/Context;

.field public ۥ۟۟۟ۧ:LYue/ۥۢ۟ۡ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06df\u06e1<",
            "LYue/\u06e5\u06e2\u06e0\u06e5\u06e3;",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟ۨ:LYue/ۥۢ۟ۡ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06df\u06e1<",
            "LYue/\u06e5\u06e2\u06e0\u06e5\u06e4;",
            "Landroid/view/SubMenu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۦ:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final ۥ۟۟۟۟(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    instance-of v0, p1, LYue/ۥۢ۠ۥۣ;

    if-eqz v0, :cond_2

    check-cast p1, LYue/ۥۢ۠ۥۣ;

    iget-object v0, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۧ:LYue/ۥۢ۟ۡ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۢ۟ۡ;

    invoke-direct {v0}, LYue/ۥۢ۟ۡ;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۧ:LYue/ۥۢ۟ۡ;

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۧ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MenuItem;

    if-nez v0, :cond_1

    new-instance v0, LYue/ۥۡ۠ۦۥ;

    iget-object v1, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۦ:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, LYue/ۥۡ۠ۦۥ;-><init>(Landroid/content/Context;LYue/ۥۢ۠ۥۣ;)V

    iget-object v1, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۧ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1, p1, v0}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public final ۥ۟۟۟۠(Landroid/view/SubMenu;)Landroid/view/SubMenu;
    .locals 2

    instance-of v0, p1, LYue/ۥۢ۠ۥۤ;

    if-eqz v0, :cond_2

    check-cast p1, LYue/ۥۢ۠ۥۤ;

    iget-object v0, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۨ:LYue/ۥۢ۟ۡ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۢ۟ۡ;

    invoke-direct {v0}, LYue/ۥۢ۟ۡ;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۨ:LYue/ۥۢ۟ۡ;

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۨ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/SubMenu;

    if-nez v0, :cond_1

    new-instance v0, LYue/ۥۣۢ۠ۤ;

    iget-object v1, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۦ:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, LYue/ۥۣۢ۠ۤ;-><init>(Landroid/content/Context;LYue/ۥۢ۠ۥۤ;)V

    iget-object v1, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۨ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1, p1, v0}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public final ۥ۟۟۟ۡ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۧ:LYue/ۥۢ۟ۡ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۢ۟ۡ;->clear()V

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۨ:LYue/ۥۢ۟ۡ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYue/ۥۢ۟ۡ;->clear()V

    :cond_1
    return-void
.end method

.method public final ۥ۟۟۟ۢ(I)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۧ:LYue/ۥۢ۟ۡ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۧ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1}, LYue/ۥۢ۟ۡ;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۧ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1, v0}, LYue/ۥۢ۟ۡ;->keyAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢ۠ۥۣ;

    invoke-interface {v1}, Landroid/view/MenuItem;->getGroupId()I

    move-result v1

    if-ne v1, p1, :cond_1

    iget-object v1, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۧ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1, v0}, LYue/ۥۢ۟ۡ;->removeAt(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ۥۣ۟۟۟(I)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۧ:LYue/ۥۢ۟ۡ;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۧ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1}, LYue/ۥۢ۟ۡ;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۧ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1, v0}, LYue/ۥۢ۟ۡ;->keyAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢ۠ۥۣ;

    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    if-ne v1, p1, :cond_1

    iget-object p1, p0, LYue/ۥ۟ۢۥۨ;->ۥ۟۟۟ۧ:LYue/ۥۢ۟ۡ;

    invoke-virtual {p1, v0}, LYue/ۥۢ۟ۡ;->removeAt(I)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method
