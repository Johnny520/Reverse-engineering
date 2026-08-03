.class public final Landroidx/recyclerview/widget/ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/ۥ۟۟$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final ۥ:Ljava/util/concurrent/Executor;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public final ۥ۟:Ljava/util/concurrent/Executor;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06df\u06e1$\u06e5\u06df\u06df\u06df<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;)V
    .locals 0
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06df\u06e1$\u06e5\u06df\u06df\u06df<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟;->ۥ:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Landroidx/recyclerview/widget/ۥ۟۟;->ۥ۟:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Landroidx/recyclerview/widget/ۥ۟۟;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;

    return-void
.end method


# virtual methods
.method public ۥ()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟;->ۥ۟:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public ۥ۟()Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06df\u06e1$\u06e5\u06df\u06df\u06df<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;

    return-object v0
.end method

.method public ۥ۟۟()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟;->ۥ:Ljava/util/concurrent/Executor;

    return-object v0
.end method
