.class public Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/ۥ۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/emoji2/text/\u06e5\u06df\u06df$\u06e5\u06df\u06df\u06df\u06e1;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/lang/Throwable;

.field public final ۥ۟۟۠ۥ:I


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;I)V
    .locals 1
    .param p1    # Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    const-string v0, "initCallback cannot be null"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;

    filled-new-array {p1}, [Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;-><init>(Ljava/util/Collection;ILjava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;I)V
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/emoji2/text/\u06e5\u06df\u06df$\u06e5\u06df\u06df\u06df\u06e1;",
            ">;I)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;-><init>(Ljava/util/Collection;ILjava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;ILjava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/emoji2/text/\u06e5\u06df\u06df$\u06e5\u06df\u06df\u06df\u06e1;",
            ">;I",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const-string v0, "initCallbacks cannot be null"

    invoke-static {p1, v0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/util/List;

    .line 6
    iput p2, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;->ۥ۟۟۠ۥ:I

    .line 7
    iput-object p3, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;->ۥ۟۟۠ۥ:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    :goto_0
    if-ge v3, v0, :cond_1

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;

    iget-object v2, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;->ۥ۟۟۠ۤ:Ljava/lang/Throwable;

    invoke-virtual {v1, v2}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;->ۥ(Ljava/lang/Throwable;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v3, v0, :cond_1

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;

    invoke-virtual {v1}, Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟ۡ;->ۥ۟()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
