.class public final LYue/ۥۡۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements LYue/ۥ۠ۦۣۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۧ;->listIterator(I)Ljava/util/ListIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/ListIterator<",
        "TT;>;",
        "LYue/\u06e5\u06e0\u06e6\u06e3\u06e2;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/util/ListIterator;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ListIterator<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۡۧ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e7<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۧ;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e7<",
            "TT;>;I)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۧ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۧ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LYue/ۥۡۧ;->ۥ۟۟(LYue/ۥۡۧ;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, p2}, LYue/ۥ۟ۥۢ;->ۥ۟۟ۧۧ(Ljava/util/List;I)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/ListIterator;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/ListIterator;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/ListIterator;

    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    return-void
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public hasPrevious()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public nextIndex()I
    .locals 2

    iget-object v0, p0, LYue/ۥۡۧ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۧ;

    iget-object v1, p0, LYue/ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/ListIterator;

    invoke-interface {v1}, Ljava/util/ListIterator;->previousIndex()I

    move-result v1

    invoke-static {v0, v1}, LYue/ۥ۟ۥۢ;->ۥ۟۟ۧۦ(Ljava/util/List;I)I

    move-result v0

    return v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public previousIndex()I
    .locals 2

    iget-object v0, p0, LYue/ۥۡۧ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۧ;

    iget-object v1, p0, LYue/ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/ListIterator;

    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    move-result v1

    invoke-static {v0, v1}, LYue/ۥ۟ۥۢ;->ۥ۟۟ۧۦ(Ljava/util/List;I)I

    move-result v0

    return v0
.end method

.method public remove()V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    return-void
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/ListIterator;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۥ()Ljava/util/ListIterator;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ListIterator<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/ListIterator;

    return-object v0
.end method
