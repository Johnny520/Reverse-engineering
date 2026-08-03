.class public abstract Lqa;
.super Lt;
.source ""


# instance fields
.field public final a:LQm;


# direct methods
.method public constructor <init>(LQm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqa;->a:LQm;

    return-void
.end method


# virtual methods
.method public e(LVa;ILjava/lang/Object;)V
    .locals 3

    invoke-interface {p0}, LQm;->getDescriptor()LCx;

    move-result-object v0

    iget-object v1, p0, Lqa;->a:LQm;

    check-cast v1, LQm;

    const/4 v2, 0x0

    invoke-interface {p1, v0, p2, v1, v2}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p2, p3, p1}, Lqa;->h(ILjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public abstract h(ILjava/lang/Object;Ljava/lang/Object;)V
.end method

.method public serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p2}, Lt;->c(Ljava/lang/Object;)I

    invoke-interface {p0}, LQm;->getDescriptor()LCx;

    const/4 p1, 0x0

    throw p1
.end method
