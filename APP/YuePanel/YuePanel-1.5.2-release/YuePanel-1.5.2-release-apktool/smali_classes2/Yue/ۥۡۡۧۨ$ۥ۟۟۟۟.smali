.class public final LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;
.super LYue/ۥ۟ۢ۟ۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡۧۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۡۧۨ$ۥ۟۟۟۟$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ۟:LYue/ۥۡۡۧۨ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟:Ljava/lang/Object;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۡۧۨ;Ljava/lang/Object;)V
    .locals 0
    .param p1    # LYue/ۥۡۡۧۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥ۟ۢ۟ۥ;-><init>()V

    iput-object p1, p0, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;->ۥ۟:LYue/ۥۡۡۧۨ;

    iput-object p2, p0, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;->ۥ۟۟:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥ۟ۢ۠;Ljava/lang/Object;)V
    .locals 2
    .param p1    # LYue/ۥ۟ۢ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟()LYue/ۥ۠۠ۧۤ;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p2, p0, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;->ۥ۟۟:Ljava/lang/Object;

    if-nez p2, :cond_1

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟()LYue/ۥ۠۠ۧۤ;

    move-result-object p2

    goto :goto_0

    :cond_1
    new-instance v0, LYue/ۥ۠۠ۧۤ;

    invoke-direct {v0, p2}, LYue/ۥ۠۠ۧۤ;-><init>(Ljava/lang/Object;)V

    move-object p2, v0

    :goto_0
    iget-object v0, p0, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;->ۥ۟:LYue/ۥۡۡۧۨ;

    sget-object v1, LYue/ۥۡۡۧۨ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, v0, p1, p2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟۟(LYue/ۥ۟ۢ۠;)Ljava/lang/Object;
    .locals 3
    .param p1    # LYue/ۥ۟ۢ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟$ۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟$ۥ;-><init>(LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;LYue/ۥ۟ۢ۠;)V

    iget-object p1, p0, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;->ۥ۟:LYue/ۥۡۡۧۨ;

    sget-object v1, LYue/ۥۡۡۧۨ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟()LYue/ۥ۠۠ۧۤ;

    move-result-object v2

    invoke-static {v1, p1, v2, v0}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟۠()LYue/ۥۢ۠ۦۢ;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟;->ۥ۟:LYue/ۥۡۡۧۨ;

    invoke-virtual {v0, p1}, LYue/ۥۡۡۧۨ$ۥ۟۟۟۟$ۥ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
