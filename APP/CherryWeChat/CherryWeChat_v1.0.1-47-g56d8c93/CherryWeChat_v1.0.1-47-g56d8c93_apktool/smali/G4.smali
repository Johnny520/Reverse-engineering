.class public final LG4;
.super Lqa;
.source ""


# instance fields
.field public final b:LF4;


# direct methods
.method public constructor <init>(LQm;)V
    .locals 1

    invoke-direct {p0, p1}, Lqa;-><init>(LQm;)V

    new-instance v0, LF4;

    invoke-interface {p1}, LQm;->getDescriptor()LCx;

    move-result-object p1

    invoke-direct {v0, p1}, Lwo;-><init>(LCx;)V

    iput-object v0, p0, LG4;->b:LF4;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    return p1
.end method

.method public final c(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    return p1
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p1
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/ArrayList;

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    iget-object v0, p0, LG4;->b:LF4;

    return-object v0
.end method

.method public final h(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2, p1, p3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method
