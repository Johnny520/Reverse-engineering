.class public final Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/ۥ۟۟۠ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ(Landroid/view/ViewGroup;LYue/ۥۢ۟ۦۨ;)Landroidx/fragment/app/ۥ۟۟۠ۡ;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢ۟ۦۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "container"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, LYue/ۥۡۥۦ$ۥ۟۟;->ۥ۟:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroidx/fragment/app/ۥ۟۟۠ۡ;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/fragment/app/ۥ۟۟۠ۡ;

    return-object v0

    :cond_0
    invoke-interface {p2, p1}, LYue/ۥۢ۟ۦۨ;->ۥ(Landroid/view/ViewGroup;)Landroidx/fragment/app/ۥ۟۟۠ۡ;

    move-result-object p2

    const-string v0, "factory.createController(container)"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, LYue/ۥۡۥۦ$ۥ۟۟;->ۥ۟:I

    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-object p2
.end method

.method public final ۥ۟(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/ۥ۟۟۠ۡ;
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Landroidx/fragment/app/FragmentManager;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "container"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧ۠()LYue/ۥۢ۟ۦۨ;

    move-result-object p2

    const-string v0, "fragmentManager.specialEffectsControllerFactory"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/ۥ۟۟۠ۡ$ۥ;->ۥ(Landroid/view/ViewGroup;LYue/ۥۢ۟ۦۨ;)Landroidx/fragment/app/ۥ۟۟۠ۡ;

    move-result-object p1

    return-object p1
.end method
