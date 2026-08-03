.class public Landroidx/fragment/app/Fragment$ۥ۟۟;
.super Landroidx/fragment/app/Fragment$ۥ۟۟۟ۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/Fragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/Fragment$ۥ۟۟;->ۥ:Landroidx/fragment/app/Fragment;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroidx/fragment/app/Fragment$ۥ۟۟۟ۧ;-><init>(Landroidx/fragment/app/Fragment$ۥ۟;)V

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment$ۥ۟۟;->ۥ:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mSavedStateRegistryController:LYue/ۥۡۧۤۡ;

    invoke-virtual {v0}, LYue/ۥۡۧۤۡ;->ۥ۟۟()V

    iget-object v0, p0, Landroidx/fragment/app/Fragment$ۥ۟۟;->ۥ:Landroidx/fragment/app/Fragment;

    invoke-static {v0}, Landroidx/lifecycle/SavedStateHandleSupport;->enableSavedStateHandles(LYue/ۥۡۧۤۢ;)V

    iget-object v0, p0, Landroidx/fragment/app/Fragment$ۥ۟۟;->ۥ:Landroidx/fragment/app/Fragment;

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const-string v1, "registryState"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/Fragment$ۥ۟۟;->ۥ:Landroidx/fragment/app/Fragment;

    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mSavedStateRegistryController:LYue/ۥۡۧۤۡ;

    invoke-virtual {v1, v0}, LYue/ۥۡۧۤۡ;->ۥ۟۟۟(Landroid/os/Bundle;)V

    return-void
.end method
