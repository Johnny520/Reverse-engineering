.class public final LYue/ۥۡۡۧۨ$ۥ۟۟۟۟$ۥ;
.super LYue/ۥۣۣۡۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۟ۢ۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟:LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;


# direct methods
.method public constructor <init>(LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;LYue/ۥ۟ۢ۠;)V
    .locals 0
    .param p1    # LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟$ۥ;->ۥ۟:LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;

    invoke-direct {p0}, LYue/ۥۣۣۡۡ;-><init>()V

    iput-object p2, p0, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟$ۥ;->ۥ:LYue/ۥ۟ۢ۠;

    return-void
.end method


# virtual methods
.method public ۥ()LYue/ۥ۟ۢ۠;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟$ۥ;->ۥ:LYue/ۥ۟ۢ۠;

    return-object v0
.end method

.method public ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟$ۥ;->ۥ()LYue/ۥ۟ۢ۠;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟ۢ۠;->ۥ۟۟۟ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟()LYue/ۥ۠۠ۧۤ;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟$ۥ;->ۥ()LYue/ۥ۟ۢ۠;

    move-result-object v0

    :goto_0
    if-eqz p1, :cond_1

    check-cast p1, LYue/ۥۡۡۧۨ;

    sget-object v1, LYue/ۥۡۡۧۨ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p1, p0, v0}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    const/4 p1, 0x0

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
