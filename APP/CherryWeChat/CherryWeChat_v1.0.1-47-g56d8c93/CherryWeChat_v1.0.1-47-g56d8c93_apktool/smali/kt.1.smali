.class public final Lkt;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Lht;

.field public final synthetic b:Lht;

.field public final synthetic c:Ljt;

.field public final synthetic d:Ljt;


# direct methods
.method public constructor <init>(Lht;Lht;Ljt;Ljt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkt;->a:Lht;

    iput-object p2, p0, Lkt;->b:Lht;

    iput-object p3, p0, Lkt;->c:Ljt;

    iput-object p4, p0, Lkt;->d:Ljt;

    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    iget-object v0, p0, Lkt;->d:Ljt;

    invoke-virtual {v0}, Ljt;->a()Ljava/lang/Object;

    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Lkt;->c:Ljt;

    invoke-virtual {v0}, Ljt;->a()Ljava/lang/Object;

    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2

    invoke-static {p1}, LY;->k(Landroid/window/BackEvent;)F

    invoke-static {p1}, LY;->l(Landroid/window/BackEvent;)F

    invoke-static {p1}, LY;->h(Landroid/window/BackEvent;)F

    invoke-static {p1}, LY;->j(Landroid/window/BackEvent;)I

    iget-object p1, p0, Lkt;->b:Lht;

    iget-object p1, p1, Lht;->c:Ljava/lang/Object;

    check-cast p1, Lot;

    iget-object v0, p1, Lot;->c:Lri;

    if-nez v0, :cond_2

    iget-object p1, p1, Lot;->b:LD4;

    invoke-virtual {p1}, LD4;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lri;

    iget-boolean v1, v1, Lri;->a:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lri;

    :cond_2
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 3

    invoke-static {p1}, LY;->k(Landroid/window/BackEvent;)F

    invoke-static {p1}, LY;->l(Landroid/window/BackEvent;)F

    invoke-static {p1}, LY;->h(Landroid/window/BackEvent;)F

    invoke-static {p1}, LY;->j(Landroid/window/BackEvent;)I

    iget-object p1, p0, Lkt;->a:Lht;

    iget-object p1, p1, Lht;->c:Ljava/lang/Object;

    check-cast p1, Lot;

    iget-object v0, p1, Lot;->b:LD4;

    invoke-virtual {v0}, LD4;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lri;

    iget-boolean v2, v2, Lri;->a:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lri;

    iget-object v0, p1, Lot;->c:Lri;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lot;->a()V

    :cond_2
    iput-object v1, p1, Lot;->c:Lri;

    return-void
.end method
