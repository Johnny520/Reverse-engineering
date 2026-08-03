.class public LYue/ۥ۠ۢۧۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:LYue/ۥ۠ۢۨ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e2\u06e8<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠ۢۨ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e8<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    return-void
.end method

.method public static ۥ۟(LYue/ۥ۠ۢۨ;)LYue/ۥ۠ۢۧۨ;
    .locals 2
    .param p0    # LYue/ۥ۠ۢۨ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e8<",
            "*>;)",
            "LYue/\u06e5\u06e0\u06e2\u06e7\u06e8;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۧۨ;

    const-string v1, "callbacks == null"

    invoke-static {p0, v1}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYue/ۥ۠ۢۨ;

    invoke-direct {v0, p0}, LYue/ۥ۠ۢۧۨ;-><init>(LYue/ۥ۠ۢۨ;)V

    return-object v0
.end method


# virtual methods
.method public ۥ(Landroidx/fragment/app/Fragment;)V
    .locals 2
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v1, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v1, v0, v0, p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟۠ۢ(LYue/ۥ۠ۢۨ;LYue/ۥ۠ۢۧۧ;Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public ۥ۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۡۤ()V

    return-void
.end method

.method public ۥ۟۟۟(Landroid/content/res/Configuration;)V
    .locals 2
    .param p1    # Landroid/content/res/Configuration;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۡۦ(Landroid/content/res/Configuration;Z)V

    return-void
.end method

.method public ۥ۟۟۟۟(Landroid/view/MenuItem;)Z
    .locals 1
    .param p1    # Landroid/view/MenuItem;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۡۧ(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۠()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۡۨ()V

    return-void
.end method

.method public ۥ۟۟۟ۡ(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 1
    .param p1    # Landroid/view/Menu;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/MenuInflater;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0, p1, p2}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۢ(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۢ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۢ۟()V

    return-void
.end method

.method public ۥۣ۟۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۢ۠()V

    return-void
.end method

.method public ۥ۟۟۟ۤ()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۢۡ(Z)V

    return-void
.end method

.method public ۥ۟۟۟ۥ(Z)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۢۢ(ZZ)V

    return-void
.end method

.method public ۥ۟۟۟ۦ(Landroid/view/MenuItem;)Z
    .locals 1
    .param p1    # Landroid/view/MenuItem;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۢۥ(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۧ(Landroid/view/Menu;)V
    .locals 1
    .param p1    # Landroid/view/Menu;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۢۦ(Landroid/view/Menu;)V

    return-void
.end method

.method public ۥ۟۟۟ۨ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۢۨ()V

    return-void
.end method

.method public ۥ۟۟۠(Z)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/FragmentManager;->ۥۣ۟۟(ZZ)V

    return-void
.end method

.method public ۥ۟۟۠۟(Landroid/view/Menu;)Z
    .locals 1
    .param p1    # Landroid/view/Menu;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->ۥۣ۟۟۟(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۠۠()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public ۥ۟۟۠ۡ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥۣ۟۟ۡ()V

    return-void
.end method

.method public ۥ۟۟۠ۢ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥۣ۟۟ۢ()V

    return-void
.end method

.method public ۥۣ۟۟۠()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥۣ۟۟ۤ()V

    return-void
.end method

.method public ۥ۟۟۠ۤ()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public ۥ۟۟۠ۥ()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public ۥ۟۟۠ۦ()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public ۥ۟۟۠ۧ(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public ۥ۟۟۠ۨ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/io/FileDescriptor;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Ljava/io/PrintWriter;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # [Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public ۥ۟۟ۡ()Z
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۤۡ(Z)Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۡ۟(Ljava/lang/String;)Landroidx/fragment/app/Fragment;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۥ۠(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡ۠(Ljava/util/List;)Ljava/util/List;
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    iget-object p1, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object p1, p1, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۥۧ()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۡ()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۥۦ()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۡۢ()Landroidx/fragment/app/FragmentManager;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    return-object v0
.end method

.method public ۥۣ۟۟ۡ()LYue/ۥۣ۠ۧۦ;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟ۡۤ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۠۟ۢ()V

    return-void
.end method

.method public ۥ۟۟ۡۥ(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۧ()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/LayoutInflater$Factory2;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡۦ()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public ۥ۟۟ۡۧ(Landroid/os/Parcelable;LYue/ۥ۠ۢۨۥ;)V
    .locals 1
    .param p1    # Landroid/os/Parcelable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۢۨۥ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0, p1, p2}, Landroidx/fragment/app/FragmentManager;->ۥ۟۠ۡۡ(Landroid/os/Parcelable;LYue/ۥ۠ۢۨۥ;)V

    return-void
.end method

.method public ۥ۟۟ۡۨ(Landroid/os/Parcelable;Ljava/util/List;)V
    .locals 3
    .param p1    # Landroid/os/Parcelable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcelable;",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    new-instance v1, LYue/ۥ۠ۢۨۥ;

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2, v2}, LYue/ۥ۠ۢۨۥ;-><init>(Ljava/util/Collection;Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۠ۡۡ(Landroid/os/Parcelable;LYue/ۥ۠ۢۨۥ;)V

    return-void
.end method

.method public ۥ۟۟ۢ(LYue/ۥۢ۟ۡ;)V
    .locals 0
    .param p1    # LYue/ۥۢ۟ۡ;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06df\u06e1<",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e6;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public ۥ۟۟ۢ۟(Landroid/os/Parcelable;)V
    .locals 2
    .param p1    # Landroid/os/Parcelable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    instance-of v1, v0, Landroidx/lifecycle/ViewModelStoreOwner;

    if-eqz v1, :cond_0

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۠ۡۤ(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you\'re still using retainNestedNonConfig()."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟ۢ۠()LYue/ۥۢ۟ۡ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e2\u06df\u06e1<",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e6;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟ۢۡ()LYue/ۥ۠ۢۨۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۠ۡۦ()LYue/ۥ۠ۢۨۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۢۢ()Ljava/util/List;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۠ۡۦ()LYue/ۥ۠ۢۨۥ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۠ۢۨۥ;->ۥ۟()Ljava/util/Collection;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, LYue/ۥ۠ۢۨۥ;->ۥ۟()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public ۥۣ۟۟ۢ()Landroid/os/Parcelable;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۧۨ;->ۥ:LYue/ۥ۠ۢۨ;

    iget-object v0, v0, LYue/ۥ۠ۢۨ;->ۥ۟۟۠ۧ:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۠ۡۨ()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method
