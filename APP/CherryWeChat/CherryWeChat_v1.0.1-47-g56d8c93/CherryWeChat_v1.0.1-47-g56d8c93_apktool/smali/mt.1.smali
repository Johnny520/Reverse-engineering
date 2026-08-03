.class public final Lmt;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LL6;


# instance fields
.field public final a:Lri;

.field public final synthetic b:Lot;


# direct methods
.method public constructor <init>(Lot;Lri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmt;->b:Lot;

    iput-object p2, p0, Lmt;->a:Lri;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 4

    iget-object v0, p0, Lmt;->b:Lot;

    iget-object v1, v0, Lot;->b:LD4;

    iget-object v2, p0, Lmt;->a:Lri;

    invoke-virtual {v1, v2}, LD4;->remove(Ljava/lang/Object;)Z

    iget-object v1, v0, Lot;->c:Lri;

    invoke-static {v1, v2}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, v0, Lot;->c:Lri;

    :cond_0
    iget-object v0, v2, Lri;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, v2, Lri;->c:Lpj;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LUi;->a()Ljava/lang/Object;

    :cond_1
    iput-object v3, v2, Lri;->c:Lpj;

    return-void
.end method
