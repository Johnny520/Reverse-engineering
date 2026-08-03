.class public abstract LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;
.super LYue/ۥ۟ۢ۠;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۥۤ۠;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۨ۠ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06e2\u06e0<",
        "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ۟:LYue/ۥ۠ۨ۠ۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟:LYue/ۥ۠ۨ۠ۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠ۨ۠ۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥ۟ۢ۠;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LYue/ۥ۠ۨ۠ۥ;

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;->ۥ۟۟۟ۤ(LYue/ۥ۠ۨ۠ۥ;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۟ۤ(LYue/ۥ۠ۨ۠ۥ;Ljava/lang/Object;)V
    .locals 2
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    goto :goto_1

    :cond_1
    iget-object v0, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ;

    :goto_1
    if-eqz v0, :cond_2

    sget-object v1, LYue/ۥ۠ۨ۠ۥ;->ۥۣ۟۟۠:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p1, p0, v0}, LYue/ۥ۟۟ۢۡ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    iget-object p1, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;->ۥ۟:LYue/ۥ۠ۨ۠ۥ;

    iget-object p2, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ;

    invoke-static {p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-static {p1, p2}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۤ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)V

    :cond_2
    return-void
.end method
