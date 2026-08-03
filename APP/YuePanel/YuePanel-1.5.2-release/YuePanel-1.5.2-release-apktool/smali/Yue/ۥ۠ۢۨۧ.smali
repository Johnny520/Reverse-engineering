.class public abstract LYue/ۥ۠ۢۨۧ;
.super LYue/ۥۣۡۥۦ;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final ۥ۟۟۟ۤ:Ljava/lang/String; = "FragmentPagerAdapter"

.field public static final ۥ۟۟۟ۥ:Z = false

.field public static final ۥ۟۟۟ۦ:I = 0x0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۧ:I = 0x1


# instance fields
.field public final ۥ۟۟۟۟:Landroidx/fragment/app/FragmentManager;

.field public final ۥ۟۟۟۠:I

.field public ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

.field public ۥ۟۟۟ۢ:Landroidx/fragment/app/Fragment;

.field public ۥۣ۟۟۟:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, LYue/ۥ۠ۢۨۧ;-><init>(Landroidx/fragment/app/FragmentManager;I)V

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/FragmentManager;I)V
    .locals 1
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, LYue/ۥۣۡۥۦ;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    .line 4
    iput-object v0, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۢ:Landroidx/fragment/app/Fragment;

    .line 5
    iput-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟۟:Landroidx/fragment/app/FragmentManager;

    .line 6
    iput p2, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟۠:I

    return-void
.end method

.method public static ۥ۟۟۠ۧ(IJ)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "android:switcher:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ۥ۟(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    check-cast p3, Landroidx/fragment/app/Fragment;

    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    if-nez p1, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟۠ۤ()Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    :cond_0
    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    invoke-virtual {p1, p3}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠ۥ(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/ۥ۟۟۠۟;

    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۢ:Landroidx/fragment/app/Fragment;

    invoke-virtual {p3, p1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۢ:Landroidx/fragment/app/Fragment;

    :cond_1
    return-void
.end method

.method public ۥ۟۟۟(Landroid/view/ViewGroup;)V
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    if-eqz p1, :cond_1

    iget-boolean v0, p0, LYue/ۥ۠ۢۨۧ;->ۥۣ۟۟۟:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, LYue/ۥ۠ۢۨۧ;->ۥۣ۟۟۟:Z

    invoke-virtual {p1}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥۣ۟۟۠()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, LYue/ۥ۠ۢۨۧ;->ۥۣ۟۟۟:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, LYue/ۥ۠ۢۨۧ;->ۥۣ۟۟۟:Z

    throw p1

    :cond_0
    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    :cond_1
    return-void
.end method

.method public ۥ۟۟۟ۤ(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 4
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟۠ۤ()Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    :cond_0
    invoke-virtual {p0, p2}, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۠ۦ(I)J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    invoke-static {v2, v0, v1}, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۠ۧ(IJ)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {v3, v2}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۥ۟(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    invoke-virtual {p1, v2}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۠۟(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/ۥ۟۟۠۟;

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2}, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۠ۥ(I)Landroidx/fragment/app/Fragment;

    move-result-object v2

    iget-object p2, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {p1, v0, v1}, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۠ۧ(IJ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v3, v2, p1}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟۟ۡ(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/ۥ۟۟۠۟;

    :goto_0
    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۢ:Landroidx/fragment/app/Fragment;

    if-eq v2, p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Landroidx/fragment/app/Fragment;->setMenuVisibility(Z)V

    iget p2, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟۠:I

    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    sget-object p2, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    invoke-virtual {p1, v2, p2}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟ۢۢ(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/Lifecycle$State;)Landroidx/fragment/app/ۥ۟۟۠۟;

    goto :goto_1

    :cond_2
    invoke-virtual {v2, p1}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    :cond_3
    :goto_1
    return-object v2
.end method

.method public ۥ۟۟۟ۥ(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    check-cast p2, Landroidx/fragment/app/Fragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p2

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟۟ۨ(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 0
    .param p1    # Landroid/os/Parcelable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/ClassLoader;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    return-void
.end method

.method public ۥ۟۟۠()Landroid/os/Parcelable;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟۠۠(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    check-cast p3, Landroidx/fragment/app/Fragment;

    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۢ:Landroidx/fragment/app/Fragment;

    if-eq p3, p1, :cond_5

    const/4 p2, 0x1

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->setMenuVisibility(Z)V

    iget p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟۠:I

    if-ne p1, p2, :cond_1

    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    if-nez p1, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟۠ۤ()Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    :cond_0
    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    iget-object v0, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۢ:Landroidx/fragment/app/Fragment;

    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟ۢۢ(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/Lifecycle$State;)Landroidx/fragment/app/ۥ۟۟۠۟;

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۢ:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    :cond_2
    :goto_0
    invoke-virtual {p3, p2}, Landroidx/fragment/app/Fragment;->setMenuVisibility(Z)V

    iget p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟۠:I

    if-ne p1, p2, :cond_4

    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    if-nez p1, :cond_3

    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟۟:Landroidx/fragment/app/FragmentManager;

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟۠ۤ()Landroidx/fragment/app/ۥ۟۟۠۟;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    :cond_3
    iget-object p1, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۡ:Landroidx/fragment/app/ۥ۟۟۠۟;

    sget-object p2, Landroidx/lifecycle/Lifecycle$State;->RESUMED:Landroidx/lifecycle/Lifecycle$State;

    invoke-virtual {p1, p3, p2}, Landroidx/fragment/app/ۥ۟۟۠۟;->ۥ۟۟ۢۢ(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/Lifecycle$State;)Landroidx/fragment/app/ۥ۟۟۠۟;

    goto :goto_1

    :cond_4
    invoke-virtual {p3, p2}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    :goto_1
    iput-object p3, p0, LYue/ۥ۠ۢۨۧ;->ۥ۟۟۟ۢ:Landroidx/fragment/app/Fragment;

    :cond_5
    return-void
.end method

.method public ۥۣ۟۟۠(Landroid/view/ViewGroup;)V
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ViewPager with adapter "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " requires a view id"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract ۥ۟۟۠ۥ(I)Landroidx/fragment/app/Fragment;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end method

.method public ۥ۟۟۠ۦ(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method
