.class public LYue/ۥۢ۠ۥ۠$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟۟ۧ۟$ۥ;


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢ۠ۥ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Landroid/view/ActionMode$Callback;

.field public final ۥ۟:Landroid/content/Context;

.field public final ۥ۟۟:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06e2\u06e0\u06e5\u06e0;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟:LYue/ۥۢ۟ۡ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06df\u06e1<",
            "Landroid/view/Menu;",
            "Landroid/view/Menu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟:Landroid/content/Context;

    iput-object p2, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ:Landroid/view/ActionMode$Callback;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟۟:Ljava/util/ArrayList;

    new-instance p1, LYue/ۥۢ۟ۡ;

    invoke-direct {p1}, LYue/ۥۢ۟ۡ;-><init>()V

    iput-object p1, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟۟۟:LYue/ۥۢ۟ۡ;

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥ۟۟ۧ۟;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟۟۟۟(LYue/ۥ۟۟ۧ۟;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-virtual {p0, p2}, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟۟۟۠(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟(LYue/ۥ۟۟ۧ۟;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟۟۟۟(LYue/ۥ۟۟ۧ۟;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-virtual {p0, p2}, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟۟۟۠(Landroid/view/Menu;)Landroid/view/Menu;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟(LYue/ۥ۟۟ۧ۟;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟۟۟۟(LYue/ۥ۟۟ۧ۟;)Landroid/view/ActionMode;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    return-void
.end method

.method public ۥ۟۟۟(LYue/ۥ۟۟ۧ۟;Landroid/view/MenuItem;)Z
    .locals 3

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ:Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟۟۟۟(LYue/ۥ۟۟ۧ۟;)Landroid/view/ActionMode;

    move-result-object p1

    new-instance v1, LYue/ۥۡ۠ۦۥ;

    iget-object v2, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟:Landroid/content/Context;

    check-cast p2, LYue/ۥۢ۠ۥۣ;

    invoke-direct {v1, v2, p2}, LYue/ۥۡ۠ۦۥ;-><init>(Landroid/content/Context;LYue/ۥۢ۠ۥۣ;)V

    invoke-interface {v0, p1, v1}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۟۟ۧ۟;)Landroid/view/ActionMode;
    .locals 4

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢ۠ۥ۠;

    if-eqz v2, :cond_0

    iget-object v3, v2, LYue/ۥۢ۠ۥ۠;->ۥ۟:LYue/ۥ۟۟ۧ۟;

    if-ne v3, p1, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, LYue/ۥۢ۠ۥ۠;

    iget-object v1, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, LYue/ۥۢ۠ۥ۠;-><init>(Landroid/content/Context;LYue/ۥ۟۟ۧ۟;)V

    iget-object p1, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final ۥ۟۟۟۠(Landroid/view/Menu;)Landroid/view/Menu;
    .locals 3

    iget-object v0, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟۟۟:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Menu;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۡ۠ۧ۠;

    iget-object v1, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟:Landroid/content/Context;

    move-object v2, p1

    check-cast v2, LYue/ۥۢ۠ۥۡ;

    invoke-direct {v0, v1, v2}, LYue/ۥۡ۠ۧ۠;-><init>(Landroid/content/Context;LYue/ۥۢ۠ۥۡ;)V

    iget-object v1, p0, LYue/ۥۢ۠ۥ۠$ۥ;->ۥ۟۟۟:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1, p1, v0}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method
