.class public final LYue/ۥۡۧ۠ۦ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۧ۠ۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e7\u06e0\u06e3;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟:I


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e7\u06e0\u06e3;",
            ">;)V"
        }
    .end annotation

    const-string v0, "routes"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۧ۠ۦ$ۥ۟;->ۥ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e7\u06e0\u06e3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧ۠ۦ$ۥ۟;->ۥ:Ljava/util/List;

    return-object v0
.end method

.method public final ۥ۟()Z
    .locals 2

    iget v0, p0, LYue/ۥۡۧ۠ۦ$ۥ۟;->ۥ۟:I

    iget-object v1, p0, LYue/ۥۡۧ۠ۦ$ۥ۟;->ۥ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟()LYue/ۥۣۡۧ۠;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۧ۠ۦ$ۥ۟;->ۥ۟()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۧ۠ۦ$ۥ۟;->ۥ:Ljava/util/List;

    iget v1, p0, LYue/ۥۡۧ۠ۦ$ۥ۟;->ۥ۟:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LYue/ۥۡۧ۠ۦ$ۥ۟;->ۥ۟:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣۡۧ۠;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
