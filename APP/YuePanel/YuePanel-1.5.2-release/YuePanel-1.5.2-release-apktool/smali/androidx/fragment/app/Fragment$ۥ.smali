.class public Landroidx/fragment/app/Fragment$ۥ;
.super LYue/ۥ۟۟ۨۦ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/Fragment;->ۥ۟۟۟ۡ(LYue/ۥ۟۟ۨۢ;LYue/ۥۣۣ۠۠;LYue/ۥ۟۟ۨ۠;)LYue/ۥ۟۟ۨۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e8\u06e6<",
        "TI;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic ۥ۟:LYue/ۥ۟۟ۨۢ;

.field public final synthetic ۥ۟۟:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Ljava/util/concurrent/atomic/AtomicReference;LYue/ۥ۟۟ۨۢ;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/Fragment$ۥ;->ۥ۟۟:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/Fragment$ۥ;->ۥ:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Landroidx/fragment/app/Fragment$ۥ;->ۥ۟:LYue/ۥ۟۟ۨۢ;

    invoke-direct {p0}, LYue/ۥ۟۟ۨۦ;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()LYue/ۥ۟۟ۨۢ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06df\u06e8\u06e2<",
            "TI;*>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/Fragment$ۥ;->ۥ۟:LYue/ۥ۟۟ۨۢ;

    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/Object;LYue/ۥ۟۟ۧۨ;)V
    .locals 1
    .param p2    # LYue/ۥ۟۟ۧۨ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;",
            "LYue/\u06e5\u06df\u06df\u06e7\u06e8;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/Fragment$ۥ;->ۥ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟۟ۨۦ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LYue/ۥ۟۟ۨۦ;->ۥ۟۟(Ljava/lang/Object;LYue/ۥ۟۟ۧۨ;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Operation cannot be started before fragment is in created state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟۟()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/Fragment$ۥ;->ۥ:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟۟ۨۦ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥ۟۟ۨۦ;->ۥ۟۟۟()V

    :cond_0
    return-void
.end method
