.class public final LYue/ۥۡۡۧۨ$ۥ۟۟۟۠;
.super LYue/ۥ۟ۢ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡۧۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06e2\u06e0<",
        "LYue/\u06e5\u06e1\u06e1\u06e7\u06e8;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ۟:LYue/ۥۡۡۧۨ$ۥ۟۟۟;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۡۧۨ$ۥ۟۟۟;)V
    .locals 0
    .param p1    # LYue/ۥۡۡۧۨ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥ۟ۢ۠;-><init>()V

    iput-object p1, p0, LYue/ۥۡۡۧۨ$ۥ۟۟۟۠;->ۥ۟:LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LYue/ۥۡۡۧۨ;

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۡۧۨ$ۥ۟۟۟۠;->ۥ۟۟۟ۤ(LYue/ۥۡۡۧۨ;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۡۡۧۨ;

    invoke-virtual {p0, p1}, LYue/ۥۡۡۧۨ$ۥ۟۟۟۠;->ۥ۟۟۟ۥ(LYue/ۥۡۡۧۨ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۤ(LYue/ۥۡۡۧۨ;Ljava/lang/Object;)V
    .locals 1
    .param p1    # LYue/ۥۡۡۧۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    if-nez p2, :cond_0

    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟()LYue/ۥ۠۠ۧۤ;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object p2, p0, LYue/ۥۡۡۧۨ$ۥ۟۟۟۠;->ۥ۟:LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    :goto_0
    sget-object v0, LYue/ۥۡۡۧۨ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p1, p0, p2}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟۟۟ۥ(LYue/ۥۡۡۧۨ;)Ljava/lang/Object;
    .locals 0
    .param p1    # LYue/ۥۡۡۧۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object p1, p0, LYue/ۥۡۡۧۨ$ۥ۟۟۟۠;->ۥ۟:LYue/ۥۡۡۧۨ$ۥ۟۟۟;

    invoke-virtual {p1}, LYue/ۥۣ۠ۨ۠;->ۥ۟۟ۦۥ()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {}, LYue/ۥۡۡۨ;->ۥ۟۟۟ۢ()LYue/ۥۢ۠ۦۢ;

    move-result-object p1

    :goto_0
    return-object p1
.end method
