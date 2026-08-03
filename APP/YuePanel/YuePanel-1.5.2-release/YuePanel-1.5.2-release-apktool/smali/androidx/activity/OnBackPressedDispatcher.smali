.class public final Landroidx/activity/OnBackPressedDispatcher;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n1747#2,3:431\n533#2,6:434\n533#2,6:440\n533#2,6:446\n533#2,6:452\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n114#1:431,3\n233#1:434,6\n251#1:440,6\n271#1:446,6\n290#1:452,6\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟۠;,
        Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۡ;,
        Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;,
        Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,430:1\n1747#2,3:431\n533#2,6:434\n533#2,6:440\n533#2,6:446\n533#2,6:452\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n114#1:431,3\n233#1:434,6\n251#1:440,6\n271#1:446,6\n290#1:452,6\n*E\n"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/Runnable;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥ۟ۧ۠ۧ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟:LYue/ۥ۟ۡۧۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e1\u06e7\u06e1<",
            "LYue/\u06e5\u06e1\u06e3\u06e1\u06e2;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟:LYue/ۥۣۡۡۢ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟۟:Landroid/window/OnBackInvokedCallback;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟۠:Landroid/window/OnBackInvokedDispatcher;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟ۡ:Z

.field public ۥ۟۟۟ۢ:Z


# direct methods
.method public constructor <init>()V
    .locals 2
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;ILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, p1, v0}, Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;LYue/ۥ۟ۧ۠ۧ;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Runnable;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 10
    :cond_0
    invoke-direct {p0, p1}, Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;LYue/ۥ۟ۧ۠ۧ;)V
    .locals 3
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧ۠ۧ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ:Ljava/lang/Runnable;

    .line 4
    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟:LYue/ۥ۟ۧ۠ۧ;

    .line 5
    new-instance p1, LYue/ۥ۟ۡۧۡ;

    invoke-direct {p1}, LYue/ۥ۟ۡۧۡ;-><init>()V

    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟:LYue/ۥ۟ۡۧۡ;

    .line 6
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x21

    if-lt p1, p2, :cond_1

    const/16 p2, 0x22

    if-lt p1, p2, :cond_0

    .line 7
    sget-object p1, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۡ;->ۥ:Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۡ;

    new-instance p2, Landroidx/activity/OnBackPressedDispatcher$ۥ;

    invoke-direct {p2, p0}, Landroidx/activity/OnBackPressedDispatcher$ۥ;-><init>(Landroidx/activity/OnBackPressedDispatcher;)V

    new-instance v0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟;

    invoke-direct {v0, p0}, Landroidx/activity/OnBackPressedDispatcher$ۥ۟;-><init>(Landroidx/activity/OnBackPressedDispatcher;)V

    new-instance v1, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟;

    invoke-direct {v1, p0}, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟;-><init>(Landroidx/activity/OnBackPressedDispatcher;)V

    new-instance v2, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟;

    invoke-direct {v2, p0}, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟;-><init>(Landroidx/activity/OnBackPressedDispatcher;)V

    invoke-virtual {p1, p2, v0, v1, v2}, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۡ;->ۥ(LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠۠ۨ;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    goto :goto_0

    .line 8
    :cond_0
    sget-object p1, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟۠;->ۥ:Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟۠;

    new-instance p2, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟۟;

    invoke-direct {p2, p0}, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟۟;-><init>(Landroidx/activity/OnBackPressedDispatcher;)V

    invoke-virtual {p1, p2}, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟۠;->ۥ۟(LYue/ۥۣ۠۠ۨ;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    .line 9
    :goto_0
    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟۟:Landroid/window/OnBackInvokedCallback;

    :cond_1
    return-void
.end method

.method public static final synthetic ۥ(Landroidx/activity/OnBackPressedDispatcher;)LYue/ۥۣۡۡۢ;
    .locals 0

    iget-object p0, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟:LYue/ۥۣۡۡۢ;

    return-object p0
.end method

.method public static final synthetic ۥ۟(Landroidx/activity/OnBackPressedDispatcher;)LYue/ۥ۟ۡۧۡ;
    .locals 0

    iget-object p0, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟:LYue/ۥ۟ۡۧۡ;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟(Landroidx/activity/OnBackPressedDispatcher;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۠()V

    return-void
.end method

.method public static final synthetic ۥ۟۟۟(Landroidx/activity/OnBackPressedDispatcher;LYue/ۥ۟ۢۤۥ;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۠۠(LYue/ۥ۟ۢۤۥ;)V

    return-void
.end method

.method public static final synthetic ۥ۟۟۟۟(Landroidx/activity/OnBackPressedDispatcher;LYue/ۥ۟ۢۤۥ;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۠ۡ(LYue/ۥ۟ۢۤۥ;)V

    return-void
.end method

.method public static final synthetic ۥ۟۟۟۠(Landroidx/activity/OnBackPressedDispatcher;LYue/ۥۣۡۡۢ;)V
    .locals 0

    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟:LYue/ۥۣۡۡۢ;

    return-void
.end method

.method public static final synthetic ۥ۟۟۟ۡ(Landroidx/activity/OnBackPressedDispatcher;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۠ۤ()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟۟ۢ(LYue/ۥۣۡۡۢ;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۡۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    const-string v0, "onBackPressedCallback"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟ۤ(LYue/ۥۣۡۡۢ;)LYue/ۥۣ۟ۨ;

    return-void
.end method

.method public final ۥۣ۟۟۟(Landroidx/lifecycle/LifecycleOwner;LYue/ۥۣۡۡۢ;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۡۡۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    const-string v0, "owner"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressedCallback"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->DESTROYED:Landroidx/lifecycle/Lifecycle$State;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;

    invoke-direct {v0, p0, p1, p2}, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;-><init>(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;LYue/ۥۣۡۡۢ;)V

    invoke-virtual {p2, v0}, LYue/ۥۣۡۡۢ;->addCancellable(LYue/ۥۣ۟ۨ;)V

    invoke-virtual {p0}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۠ۤ()V

    new-instance p1, Landroidx/activity/OnBackPressedDispatcher$ۥۣ۟۟۟;

    invoke-direct {p1, p0}, Landroidx/activity/OnBackPressedDispatcher$ۥۣ۟۟۟;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, LYue/ۥۣۡۡۢ;->setEnabledChangedCallback$activity_release(LYue/ۥۣ۠۠ۨ;)V

    return-void
.end method

.method public final ۥ۟۟۟ۤ(LYue/ۥۣۡۡۢ;)LYue/ۥۣ۟ۨ;
    .locals 2
    .param p1    # LYue/ۥۣۡۡۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "onBackPressedCallback"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟:LYue/ۥ۟ۡۧۡ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۡۧۡ;->add(Ljava/lang/Object;)Z

    new-instance v0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;

    invoke-direct {v0, p0, p1}, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۢ;-><init>(Landroidx/activity/OnBackPressedDispatcher;LYue/ۥۣۡۡۢ;)V

    invoke-virtual {p1, v0}, LYue/ۥۣۡۡۢ;->addCancellable(LYue/ۥۣ۟ۨ;)V

    invoke-virtual {p0}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۠ۤ()V

    new-instance v1, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۤ;

    invoke-direct {v1, p0}, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟ۤ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, LYue/ۥۣۡۡۢ;->setEnabledChangedCallback$activity_release(LYue/ۥۣ۠۠ۨ;)V

    return-object v0
.end method

.method public final ۥ۟۟۟ۥ()V
    .locals 0
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    invoke-virtual {p0}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۠()V

    return-void
.end method

.method public final ۥ۟۟۟ۦ(LYue/ۥ۟ۢۤۥ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۢۤۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    const-string v0, "backEvent"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۠۠(LYue/ۥ۟ۢۤۥ;)V

    return-void
.end method

.method public final ۥ۟۟۟ۧ(LYue/ۥ۟ۢۤۥ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۢۤۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    const-string v0, "backEvent"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۠ۡ(LYue/ۥ۟ۢۤۥ;)V

    return-void
.end method

.method public final ۥ۟۟۟ۨ()Z
    .locals 1
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    iget-boolean v0, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟ۢ:Z

    return v0
.end method

.method public final ۥ۟۟۠()V
    .locals 4
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟:LYue/ۥ۟ۡۧۡ;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LYue/ۥۣۡۡۢ;

    invoke-virtual {v3}, LYue/ۥۣۡۡۢ;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, LYue/ۥۣۡۡۢ;

    iput-object v2, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟:LYue/ۥۣۡۡۢ;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LYue/ۥۣۡۡۢ;->handleOnBackCancelled()V

    :cond_2
    return-void
.end method

.method public final ۥ۟۟۠۟()V
    .locals 4
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟:LYue/ۥ۟ۡۧۡ;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LYue/ۥۣۡۡۢ;

    invoke-virtual {v3}, LYue/ۥۣۡۡۢ;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, LYue/ۥۣۡۡۢ;

    iput-object v2, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟:LYue/ۥۣۡۡۢ;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LYue/ۥۣۡۡۢ;->handleOnBackPressed()V

    return-void

    :cond_2
    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_3
    return-void
.end method

.method public final ۥ۟۟۠۠(LYue/ۥ۟ۢۤۥ;)V
    .locals 3
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟:LYue/ۥ۟ۡۧۡ;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LYue/ۥۣۡۡۢ;

    invoke-virtual {v2}, LYue/ۥۣۡۡۢ;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, LYue/ۥۣۡۡۢ;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, LYue/ۥۣۡۡۢ;->handleOnBackProgressed(LYue/ۥ۟ۢۤۥ;)V

    :cond_2
    return-void
.end method

.method public final ۥ۟۟۠ۡ(LYue/ۥ۟ۢۤۥ;)V
    .locals 3
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟:LYue/ۥ۟ۡۧۡ;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LYue/ۥۣۡۡۢ;

    invoke-virtual {v2}, LYue/ۥۣۡۡۢ;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, LYue/ۥۣۡۡۢ;

    iput-object v1, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟:LYue/ۥۣۡۡۢ;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1}, LYue/ۥۣۡۡۢ;->handleOnBackStarted(LYue/ۥ۟ۢۤۥ;)V

    :cond_2
    return-void
.end method

.method public final ۥ۟۟۠ۢ(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 1
    .param p1    # Landroid/window/OnBackInvokedDispatcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x21
    .end annotation

    const-string v0, "invoker"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟۠:Landroid/window/OnBackInvokedDispatcher;

    iget-boolean p1, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟ۢ:Z

    invoke-virtual {p0, p1}, Landroidx/activity/OnBackPressedDispatcher;->ۥۣ۟۟۠(Z)V

    return-void
.end method

.method public final ۥۣ۟۟۠(Z)V
    .locals 4
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x21
    .end annotation

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟۠:Landroid/window/OnBackInvokedDispatcher;

    iget-object v1, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟۟:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    iget-boolean v3, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟ۡ:Z

    if-nez v3, :cond_0

    sget-object p1, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟۠;->ۥ:Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟۠;

    invoke-virtual {p1, v0, v2, v1}, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟۠;->ۥ۟۟۟(Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟ۡ:Z

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟ۡ:Z

    if-eqz p1, :cond_1

    sget-object p1, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟۠;->ۥ:Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟۠;

    invoke-virtual {p1, v0, v1}, Landroidx/activity/OnBackPressedDispatcher$ۥ۟۟۟۠;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-boolean v2, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟ۡ:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۥ۟۟۠ۤ()V
    .locals 4

    iget-boolean v0, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟ۢ:Z

    iget-object v1, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟:LYue/ۥ۟ۡۧۡ;

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۣۡۡۢ;

    invoke-virtual {v2}, LYue/ۥۣۡۡۢ;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    :cond_2
    :goto_0
    iput-boolean v3, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟ۢ:Z

    if-eq v3, v0, :cond_4

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟:LYue/ۥ۟ۧ۠ۧ;

    if-eqz v0, :cond_3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, LYue/ۥ۟ۧ۠ۧ;->accept(Ljava/lang/Object;)V

    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_4

    invoke-virtual {p0, v3}, Landroidx/activity/OnBackPressedDispatcher;->ۥۣ۟۟۠(Z)V

    :cond_4
    return-void
.end method
