.class public final Llt;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUn;
.implements LL6;


# instance fields
.field public final a:LRn;

.field public final b:Lri;

.field public c:Lmt;

.field public final synthetic d:Lot;


# direct methods
.method public constructor <init>(Lot;LRn;Lri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llt;->d:Lot;

    iput-object p2, p0, Llt;->a:LRn;

    iput-object p3, p0, Llt;->b:Lri;

    invoke-virtual {p2, p0}, LRn;->a(LXn;)V

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget-object v0, p0, Llt;->a:LRn;

    invoke-virtual {v0, p0}, LRn;->b(LXn;)V

    iget-object v0, p0, Llt;->b:Lri;

    iget-object v0, v0, Lri;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Llt;->c:Lmt;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lmt;->cancel()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Llt;->c:Lmt;

    return-void
.end method

.method public final onStateChanged(LYn;LOn;)V
    .locals 7

    sget-object p1, LOn;->ON_START:LOn;

    if-ne p2, p1, :cond_0

    iget-object v3, p0, Llt;->d:Lot;

    iget-object p1, v3, Lot;->b:LD4;

    iget-object p2, p0, Llt;->b:Lri;

    invoke-virtual {p1, p2}, LD4;->addLast(Ljava/lang/Object;)V

    new-instance p1, Lmt;

    invoke-direct {p1, v3, p2}, Lmt;-><init>(Lot;Lri;)V

    iget-object v0, p2, Lri;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lot;->d()V

    new-instance v0, Lnt;

    const-string v5, "updateEnabledCallbacks()V"

    const/4 v6, 0x1

    const/4 v1, 0x0

    const-class v2, Lot;

    const-string v4, "updateEnabledCallbacks"

    invoke-direct/range {v0 .. v6}, Lnt;-><init>(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;I)V

    iput-object v0, p2, Lri;->c:Lpj;

    iput-object p1, p0, Llt;->c:Lmt;

    return-void

    :cond_0
    sget-object p1, LOn;->ON_STOP:LOn;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Llt;->c:Lmt;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lmt;->cancel()V

    return-void

    :cond_1
    sget-object p1, LOn;->ON_DESTROY:LOn;

    if-ne p2, p1, :cond_2

    invoke-virtual {p0}, Llt;->cancel()V

    :cond_2
    return-void
.end method
