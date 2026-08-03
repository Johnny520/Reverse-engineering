.class Landroidx/viewpager2/adapter/FragmentStateAdapter$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/viewpager2/adapter/FragmentStateAdapter;->ۥ۟۟۠۠(LYue/ۥۣ۠۠;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۠۠;

.field public final synthetic ۥ۟۟۠ۤ:Landroidx/viewpager2/adapter/FragmentStateAdapter;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/adapter/FragmentStateAdapter;LYue/ۥۣ۠۠;)V
    .locals 0

    iput-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$2;->ۥ۟۟۠ۤ:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    iput-object p2, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$2;->ۥۣ۟۟۠:LYue/ۥۣ۠۠;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/Lifecycle$Event;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p2, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$2;->ۥ۟۟۠ۤ:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    invoke-virtual {p2}, Landroidx/viewpager2/adapter/FragmentStateAdapter;->ۥ۟۟۠ۤ()Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/Lifecycle;->removeObserver(Landroidx/lifecycle/LifecycleObserver;)V

    iget-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$2;->ۥۣ۟۟۠:LYue/ۥۣ۠۠;

    invoke-virtual {p1}, LYue/ۥۣ۠۠;->ۥ۟۟()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۢۤۤۦ;->ۥ۟۟ۧۢ(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$2;->ۥ۟۟۠ۤ:Landroidx/viewpager2/adapter/FragmentStateAdapter;

    iget-object p2, p0, Landroidx/viewpager2/adapter/FragmentStateAdapter$2;->ۥۣ۟۟۠:LYue/ۥۣ۠۠;

    invoke-virtual {p1, p2}, Landroidx/viewpager2/adapter/FragmentStateAdapter;->ۥ۟۟۠۠(LYue/ۥۣ۠۠;)V

    :cond_1
    return-void
.end method
