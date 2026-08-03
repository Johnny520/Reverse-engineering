.class public abstract LYue/ۥۣ۠ۧۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠ۧۦ$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ۟۟(Z)V
    .locals 0

    sput-boolean p0, LYue/ۥۣ۠ۧۧ;->ۥ۟۟۟:Z

    return-void
.end method

.method public static ۥ۟۟۟(Landroidx/lifecycle/LifecycleOwner;)LYue/ۥۣ۠ۧۦ;
    .locals 2
    .param p0    # Landroidx/lifecycle/LifecycleOwner;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/lifecycle/LifecycleOwner;",
            ":",
            "Landroidx/lifecycle/ViewModelStoreOwner;",
            ">(TT;)",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e6;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۧۧ;

    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/ViewModelStoreOwner;

    invoke-interface {v1}, Landroidx/lifecycle/ViewModelStoreOwner;->getViewModelStore()Landroidx/lifecycle/ViewModelStore;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LYue/ۥۣ۠ۧۧ;-><init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/ViewModelStore;)V

    return-object v0
.end method


# virtual methods
.method public abstract ۥ(I)V
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation
.end method

.method public abstract ۥ۟(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract ۥ۟۟۟۟(I)LYue/ۥۣ۠ۧۥ;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I)",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;"
        }
    .end annotation
.end method

.method public ۥ۟۟۟۠()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract ۥ۟۟۟ۡ(ILandroid/os/Bundle;LYue/ۥۣ۠ۧۦ$ۥ;)LYue/ۥۣ۠ۧۥ;
    .param p2    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۧۦ$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroid/os/Bundle;",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e6$\u06e5<",
            "TD;>;)",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;"
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟ۢ()V
.end method

.method public abstract ۥۣ۟۟۟(ILandroid/os/Bundle;LYue/ۥۣ۠ۧۦ$ۥ;)LYue/ۥۣ۠ۧۥ;
    .param p2    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۧۦ$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D:",
            "Ljava/lang/Object;",
            ">(I",
            "Landroid/os/Bundle;",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e6$\u06e5<",
            "TD;>;)",
            "LYue/\u06e5\u06e0\u06e7\u06e3\u06e5<",
            "TD;>;"
        }
    .end annotation
.end method
