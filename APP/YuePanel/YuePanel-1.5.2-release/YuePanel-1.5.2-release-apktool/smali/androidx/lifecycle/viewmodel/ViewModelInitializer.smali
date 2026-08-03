.class public final Landroidx/lifecycle/viewmodel/ViewModelInitializer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroidx/lifecycle/ViewModel;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B.\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0008\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bR \u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR+\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0008\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/lifecycle/viewmodel/ViewModelInitializer;",
        "Landroidx/lifecycle/ViewModel;",
        "T",
        "",
        "Ljava/lang/Class;",
        "clazz",
        "Lkotlin/Function1;",
        "Landroidx/lifecycle/viewmodel/CreationExtras;",
        "LYue/\u06e5\u06e0\u06e1\u06e5\u06e7;",
        "initializer",
        "<init>",
        "(Ljava/lang/Class;LYue/\u06e5\u06e0\u06e3\u06e1\u06df;)V",
        "Ljava/lang/Class;",
        "getClazz$lifecycle_viewmodel_release",
        "()Ljava/lang/Class;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df;",
        "getInitializer$lifecycle_viewmodel_release",
        "()LYue/\u06e5\u06e0\u06e3\u06e1\u06df;",
        "lifecycle-viewmodel_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final clazz:Ljava/lang/Class;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final initializer:LYue/ۥۣ۠ۡ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Landroidx/lifecycle/viewmodel/CreationExtras;",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;LYue/ۥۣ۠ۡ۟;)V
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroidx/lifecycle/viewmodel/CreationExtras;",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "clazz"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializer"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/viewmodel/ViewModelInitializer;->clazz:Ljava/lang/Class;

    iput-object p2, p0, Landroidx/lifecycle/viewmodel/ViewModelInitializer;->initializer:LYue/ۥۣ۠ۡ۟;

    return-void
.end method


# virtual methods
.method public final getClazz$lifecycle_viewmodel_release()Ljava/lang/Class;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/lifecycle/viewmodel/ViewModelInitializer;->clazz:Ljava/lang/Class;

    return-object v0
.end method

.method public final getInitializer$lifecycle_viewmodel_release()LYue/ۥۣ۠ۡ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Landroidx/lifecycle/viewmodel/CreationExtras;",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/lifecycle/viewmodel/ViewModelInitializer;->initializer:LYue/ۥۣ۠ۡ۟;

    return-object v0
.end method
