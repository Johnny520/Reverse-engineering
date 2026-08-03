.class public final LcD;
.super Ljava/util/AbstractList;
.source ""

# interfaces
.implements LIn;
.implements Ljava/util/RandomAccess;


# instance fields
.field public final a:LHn;


# direct methods
.method public constructor <init>(LHn;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, LcD;->a:LHn;

    return-void
.end method


# virtual methods
.method public final d(Ly6;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LcD;->a:LHn;

    invoke-virtual {v0, p1}, LHn;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, LbD;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, LcD;->a:LHn;

    invoke-virtual {v1}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    iput-object v1, v0, LbD;->a:Ljava/util/Iterator;

    return-object v0
.end method

.method public final l()LIn;
    .locals 0

    return-object p0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 2

    new-instance v0, LaD;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, LcD;->a:LHn;

    invoke-virtual {v1, p1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    iput-object p1, v0, LaD;->a:Ljava/util/ListIterator;

    return-object v0
.end method

.method public final m(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LcD;->a:LHn;

    iget-object v0, v0, LHn;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final o()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LcD;->a:LHn;

    iget-object v0, v0, LHn;->b:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LcD;->a:LHn;

    invoke-virtual {v0}, LHn;->size()I

    move-result v0

    return v0
.end method
