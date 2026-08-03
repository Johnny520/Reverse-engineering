.class public Landroidx/fragment/app/ۥ۟۟۟۟$ۥ۟۟۟۟;
.super LYue/ۥ۠ۢۧۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/ۥ۟۟۟۟;->createFragmentContainer()LYue/ۥ۠ۢۧۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۢۧۧ;

.field public final synthetic ۥ۟۟۠ۤ:Landroidx/fragment/app/ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/ۥ۟۟۟۟;LYue/ۥ۠ۢۧۧ;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Landroidx/fragment/app/ۥ۟۟۟۟;

    iput-object p2, p0, Landroidx/fragment/app/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۢۧۧ;

    invoke-direct {p0}, LYue/ۥ۠ۢۧۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟(I)Landroid/view/View;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۢۧۧ;

    invoke-virtual {v0}, LYue/ۥ۠ۢۧۧ;->ۥ۟۟۟()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۢۧۧ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۢۧۧ;->ۥ۟۟(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Landroidx/fragment/app/ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/ۥ۟۟۟۟;->onFindViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۢۧۧ;

    invoke-virtual {v0}, LYue/ۥ۠ۢۧۧ;->ۥ۟۟۟()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/ۥ۟۟۟۟$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Landroidx/fragment/app/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/fragment/app/ۥ۟۟۟۟;->onHasView()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
