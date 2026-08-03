.class public final LYue/ۥۣ۠۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠۟ۡ$ۥ;,
        LYue/ۥۣ۠۟ۡ$ۥ۟;,
        LYue/ۥۣ۠۟ۡ$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥ:LYue/ۥۣ۠۟ۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:Ljava/lang/String; = "FragmentStrictMode"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static ۥ۟۟:LYue/ۥۣ۠۟ۡ$ۥ۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۣ۠۟ۡ;

    invoke-direct {v0}, LYue/ۥۣ۠۟ۡ;-><init>()V

    sput-object v0, LYue/ۥۣ۠۟ۡ;->ۥ:LYue/ۥۣ۠۟ۡ;

    sget-object v0, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ۟۟۟۟:LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    sput-object v0, LYue/ۥۣ۠۟ۡ;->ۥ۟۟:LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ۥ(Ljava/lang/String;LYue/ۥۢۥ۟ۡ;)V
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟ۡ(Ljava/lang/String;LYue/ۥۢۥ۟ۡ;)V

    return-void
.end method

.method public static synthetic ۥ۟(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V
    .locals 0

    invoke-static {p0, p1}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟۠(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V

    return-void
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V
    .locals 1

    const-string v0, "$policy"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$violation"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ۟()LYue/ۥۣ۠۟ۡ$ۥ۟;

    move-result-object p0

    invoke-interface {p0, p1}, LYue/ۥۣ۠۟ۡ$ۥ۟;->ۥ(LYue/ۥۢۥ۟ۡ;)V

    return-void
.end method

.method public static final ۥ۟۟۟ۡ(Ljava/lang/String;LYue/ۥۢۥ۟ۡ;)V
    .locals 2

    const-string v0, "$violation"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Policy violation with PENALTY_DEATH in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "FragmentStrictMode"

    invoke-static {v0, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    throw p1
.end method

.method public static final ۥۣ۟۟۟(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V
    .locals 4
    .param p0    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousFragmentId"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣ۠۟;

    invoke-direct {v0, p0, p1}, LYue/ۥۣ۠۟;-><init>(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    sget-object p1, LYue/ۥۣ۠۟ۡ;->ۥ:LYue/ۥۣ۠۟ۡ;

    invoke-virtual {p1, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟ۢ(LYue/ۥۢۥ۟ۡ;)V

    invoke-virtual {p1, p0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟(Landroidx/fragment/app/Fragment;)LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ()Ljava/util/Set;

    move-result-object v2

    sget-object v3, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1, v1, p0, v2}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۠ۥ(LYue/ۥۣ۠۟ۡ$ۥ۟۟;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1, v1, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟۟(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟ۤ(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V
    .locals 4
    .param p0    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣۣ۠۟;

    invoke-direct {v0, p0, p1}, LYue/ۥۣۣ۠۟;-><init>(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V

    sget-object p1, LYue/ۥۣ۠۟ۡ;->ۥ:LYue/ۥۣ۠۟ۡ;

    invoke-virtual {p1, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟ۢ(LYue/ۥۢۥ۟ۡ;)V

    invoke-virtual {p1, p0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟(Landroidx/fragment/app/Fragment;)LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ()Ljava/util/Set;

    move-result-object v2

    sget-object v3, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1, v1, p0, v2}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۠ۥ(LYue/ۥۣ۠۟ۡ$ۥ۟۟;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1, v1, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟۟(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟ۥ(Landroidx/fragment/app/Fragment;)V
    .locals 5
    .param p0    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣ۠ۥ;

    invoke-direct {v0, p0}, LYue/ۥۣ۠ۥ;-><init>(Landroidx/fragment/app/Fragment;)V

    sget-object v1, LYue/ۥۣ۠۟ۡ;->ۥ:LYue/ۥۣ۠۟ۡ;

    invoke-virtual {v1, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟ۢ(LYue/ۥۢۥ۟ۡ;)V

    invoke-virtual {v1, p0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟(Landroidx/fragment/app/Fragment;)LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    move-result-object v2

    invoke-virtual {v2}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ()Ljava/util/Set;

    move-result-object v3

    sget-object v4, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, p0, v3}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۠ۥ(LYue/ۥۣ۠۟ۡ$ۥ۟۟;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v1, v2, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟۟(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟ۦ(Landroidx/fragment/app/Fragment;)V
    .locals 5
    .param p0    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣ۠ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۣ۠ۥ۟;-><init>(Landroidx/fragment/app/Fragment;)V

    sget-object v1, LYue/ۥۣ۠۟ۡ;->ۥ:LYue/ۥۣ۠۟ۡ;

    invoke-virtual {v1, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟ۢ(LYue/ۥۢۥ۟ۡ;)V

    invoke-virtual {v1, p0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟(Landroidx/fragment/app/Fragment;)LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    move-result-object v2

    invoke-virtual {v2}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ()Ljava/util/Set;

    move-result-object v3

    sget-object v4, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟ۡ۟:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, p0, v3}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۠ۥ(LYue/ۥۣ۠۟ۡ$ۥ۟۟;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v1, v2, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟۟(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟ۧ(Landroidx/fragment/app/Fragment;)V
    .locals 5
    .param p0    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣ۠ۥ۠;

    invoke-direct {v0, p0}, LYue/ۥۣ۠ۥ۠;-><init>(Landroidx/fragment/app/Fragment;)V

    sget-object v1, LYue/ۥۣ۠۟ۡ;->ۥ:LYue/ۥۣ۠۟ۡ;

    invoke-virtual {v1, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟ۢ(LYue/ۥۢۥ۟ۡ;)V

    invoke-virtual {v1, p0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟(Landroidx/fragment/app/Fragment;)LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    move-result-object v2

    invoke-virtual {v2}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ()Ljava/util/Set;

    move-result-object v3

    sget-object v4, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟ۡ۟:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, p0, v3}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۠ۥ(LYue/ۥۣ۠۟ۡ$ۥ۟۟;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v1, v2, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟۟(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۠(Landroidx/fragment/app/Fragment;)V
    .locals 5
    .param p0    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣۡۨۧ;

    invoke-direct {v0, p0}, LYue/ۥۣۡۨۧ;-><init>(Landroidx/fragment/app/Fragment;)V

    sget-object v1, LYue/ۥۣ۠۟ۡ;->ۥ:LYue/ۥۣ۠۟ۡ;

    invoke-virtual {v1, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟ۢ(LYue/ۥۢۥ۟ۡ;)V

    invoke-virtual {v1, p0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟(Landroidx/fragment/app/Fragment;)LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    move-result-object v2

    invoke-virtual {v2}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ()Ljava/util/Set;

    move-result-object v3

    sget-object v4, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, p0, v3}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۠ۥ(LYue/ۥۣ۠۟ۡ$ۥ۟۟;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v1, v2, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟۟(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۠۟(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V
    .locals 3
    .param p0    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const-string v0, "violatingFragment"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetFragment"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣۡۨۨ;

    invoke-direct {v0, p0, p1, p2}, LYue/ۥۣۡۨۨ;-><init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V

    sget-object p1, LYue/ۥۣ۠۟ۡ;->ۥ:LYue/ۥۣ۠۟ۡ;

    invoke-virtual {p1, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟ۢ(LYue/ۥۢۥ۟ۡ;)V

    invoke-virtual {p1, p0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟(Landroidx/fragment/app/Fragment;)LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    move-result-object p2

    invoke-virtual {p2}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ()Ljava/util/Set;

    move-result-object v1

    sget-object v2, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟ۡ۟:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, p2, p0, v1}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۠ۥ(LYue/ۥۣ۠۟ۡ$ۥ۟۟;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1, p2, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟۟(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۠۠(Landroidx/fragment/app/Fragment;Z)V
    .locals 4
    .param p0    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۨۤ;

    invoke-direct {v0, p0, p1}, LYue/ۥۡۨۤ;-><init>(Landroidx/fragment/app/Fragment;Z)V

    sget-object p1, LYue/ۥۣ۠۟ۡ;->ۥ:LYue/ۥۣ۠۟ۡ;

    invoke-virtual {p1, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟ۢ(LYue/ۥۢۥ۟ۡ;)V

    invoke-virtual {p1, p0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟(Landroidx/fragment/app/Fragment;)LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ()Ljava/util/Set;

    move-result-object v2

    sget-object v3, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟ۡ:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1, v1, p0, v2}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۠ۥ(LYue/ۥۣ۠۟ۡ$ۥ۟۟;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1, v1, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟۟(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۠ۡ(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V
    .locals 4
    .param p0    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "container"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۢۦ۠ۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥۢۦ۠ۥ;-><init>(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V

    sget-object p1, LYue/ۥۣ۠۟ۡ;->ۥ:LYue/ۥۣ۠۟ۡ;

    invoke-virtual {p1, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟ۢ(LYue/ۥۢۥ۟ۡ;)V

    invoke-virtual {p1, p0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟(Landroidx/fragment/app/Fragment;)LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ()Ljava/util/Set;

    move-result-object v2

    sget-object v3, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟ۡ۠:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1, v1, p0, v2}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۠ۥ(LYue/ۥۣ۠۟ۡ$ۥ۟۟;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1, v1, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟۟(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۠ۢ(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V
    .locals 3
    .param p0    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expectedParentFragment"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۢۦ۠ۦ;

    invoke-direct {v0, p0, p1, p2}, LYue/ۥۢۦ۠ۦ;-><init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V

    sget-object p1, LYue/ۥۣ۠۟ۡ;->ۥ:LYue/ۥۣ۠۟ۡ;

    invoke-virtual {p1, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟ۢ(LYue/ۥۢۥ۟ۡ;)V

    invoke-virtual {p1, p0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟(Landroidx/fragment/app/Fragment;)LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    move-result-object p2

    invoke-virtual {p2}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ()Ljava/util/Set;

    move-result-object v1

    sget-object v2, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, p2, p0, v1}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۠ۥ(LYue/ۥۣ۠۟ۡ$ۥ۟۟;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1, p2, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟۟(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ۥ۟۟()LYue/ۥۣ۠۟ۡ$ۥ۟۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۣ۠۟ۡ;->ۥ۟۟:LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    return-object v0
.end method

.method public final ۥ۟۟۟(Landroidx/fragment/app/Fragment;)LYue/ۥۣ۠۟ۡ$ۥ۟۟;
    .locals 2

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "declaringFragment.parentFragmentManager"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧۡ()LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧۡ()LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, LYue/ۥۣ۠۟ۡ;->ۥ۟۟:LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    return-object p1
.end method

.method public final ۥ۟۟۟۟(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V
    .locals 4

    invoke-virtual {p2}, LYue/ۥۢۥ۟ۡ;->ۥ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ()Ljava/util/Set;

    move-result-object v2

    sget-object v3, LYue/ۥۣ۠۟ۡ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Policy violation in "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "FragmentStrictMode"

    invoke-static {v3, v2, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    invoke-virtual {p1}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ۟()LYue/ۥۣ۠۟ۡ$ۥ۟;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v2, LYue/ۥۣ۠۟۟;

    invoke-direct {v2, p1, p2}, LYue/ۥۣ۠۟۟;-><init>(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V

    invoke-virtual {p0, v0, v2}, LYue/ۥۣ۠۟ۡ;->ۥۣ۟۟۠(Landroidx/fragment/app/Fragment;Ljava/lang/Runnable;)V

    :cond_1
    invoke-virtual {p1}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ()Ljava/util/Set;

    move-result-object p1

    sget-object v2, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, LYue/ۥۣ۠۟۠;

    invoke-direct {p1, v1, p2}, LYue/ۥۣ۠۟۠;-><init>(Ljava/lang/String;LYue/ۥۢۥ۟ۡ;)V

    invoke-virtual {p0, v0, p1}, LYue/ۥۣ۠۟ۡ;->ۥۣ۟۟۠(Landroidx/fragment/app/Fragment;Ljava/lang/Runnable;)V

    :cond_2
    return-void
.end method

.method public final ۥ۟۟۟ۢ(LYue/ۥۢۥ۟ۡ;)V
    .locals 2

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۧۨ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StrictMode violation in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LYue/ۥۢۥ۟ۡ;->ۥ()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public final ۥ۟۟۟ۨ(LYue/ۥۢۥ۟ۡ;)V
    .locals 3
    .param p1    # LYue/ۥۢۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    const-string v0, "violation"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟ۢ(LYue/ۥۢۥ۟ۡ;)V

    invoke-virtual {p1}, LYue/ۥۢۥ۟ۡ;->ۥ()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟(Landroidx/fragment/app/Fragment;)LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p0, v1, v0, v2}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۠ۥ(LYue/ۥۣ۠۟ۡ$ۥ۟۟;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1, p1}, LYue/ۥۣ۠۟ۡ;->ۥ۟۟۟۟(LYue/ۥۣ۠۟ۡ$ۥ۟۟;LYue/ۥۢۥ۟ۡ;)V

    :cond_0
    return-void
.end method

.method public final ۥۣ۟۟۠(Landroidx/fragment/app/Fragment;Ljava/lang/Runnable;)V
    .locals 2

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->ۥ۟۟ۦۦ()LYue/ۥ۠ۢۨ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۠ۢۨ;->ۥ۟۟۟ۡ()Landroid/os/Handler;

    move-result-object p1

    const-string v0, "fragment.parentFragmentManager.host.handler"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void
.end method

.method public final ۥ۟۟۠ۤ(LYue/ۥۣ۠۟ۡ$ۥ۟۟;)V
    .locals 1
    .param p1    # LYue/ۥۣ۠۟ۡ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, LYue/ۥۣ۠۟ۡ;->ۥ۟۟:LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    return-void
.end method

.method public final ۥ۟۟۠ۥ(LYue/ۥۣ۠۟ۡ$ۥ۟۟;Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06df\u06e1$\u06e5\u06df\u06df;",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "LYue/\u06e5\u06e2\u06e5\u06df\u06e1;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;->ۥ۟۟()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    const/4 p2, 0x1

    if-nez p1, :cond_0

    return p2

    :cond_0
    invoke-virtual {p3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, LYue/ۥۢۥ۟ۡ;

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {p1, v0}, LYue/ۥ۟ۥۢ۠;->ۥ۟۠ۢ۠(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-interface {p1, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, p2

    return p1
.end method
