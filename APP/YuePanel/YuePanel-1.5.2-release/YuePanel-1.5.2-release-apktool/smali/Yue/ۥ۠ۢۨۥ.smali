.class public LYue/ۥ۠ۢۨۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final ۥ:Ljava/util/Collection;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟:Ljava/util/Map;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06e0\u06e2\u06e8\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟:Ljava/util/Map;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/lifecycle/ViewModelStore;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Collection;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06e0\u06e2\u06e8\u06e5;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/lifecycle/ViewModelStore;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۢۨۥ;->ۥ:Ljava/util/Collection;

    iput-object p2, p0, LYue/ۥ۠ۢۨۥ;->ۥ۟:Ljava/util/Map;

    iput-object p3, p0, LYue/ۥ۠ۢۨۥ;->ۥ۟۟:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public ۥ()Ljava/util/Map;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06e0\u06e2\u06e8\u06e5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۨۥ;->ۥ۟:Ljava/util/Map;

    return-object v0
.end method

.method public ۥ۟()Ljava/util/Collection;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۨۥ;->ۥ:Ljava/util/Collection;

    return-object v0
.end method

.method public ۥ۟۟()Ljava/util/Map;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/lifecycle/ViewModelStore;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۨۥ;->ۥ۟۟:Ljava/util/Map;

    return-object v0
.end method

.method public ۥ۟۟۟(Landroidx/fragment/app/Fragment;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۨۥ;->ۥ:Ljava/util/Collection;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
