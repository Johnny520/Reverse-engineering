.class public final LYue/ۥۡۡۥۧ;
.super LYue/ۥ۟۟ۡۢ;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e1\u06e2<",
        "TE;>;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۤ:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:I


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
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LYue/ۥ۟۟ۡۢ;-><init>()V

    iput-object p1, p0, LYue/ۥۡۡۥۧ;->ۥ۟۟۠ۤ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    sget-object v0, LYue/ۥ۟۟ۡۢ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۢ$ۥ;

    iget v1, p0, LYue/ۥۡۡۥۧ;->ۥ۟۟۠ۦ:I

    invoke-virtual {v0, p1, v1}, LYue/ۥ۟۟ۡۢ$ۥ;->ۥ۟(II)V

    iget-object v0, p0, LYue/ۥۡۡۥۧ;->ۥ۟۟۠ۤ:Ljava/util/List;

    iget v1, p0, LYue/ۥۡۡۥۧ;->ۥ۟۟۠ۥ:I

    add-int/2addr v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ()I
    .locals 1

    iget v0, p0, LYue/ۥۡۡۥۧ;->ۥ۟۟۠ۦ:I

    return v0
.end method

.method public final ۥ۟(II)V
    .locals 2

    sget-object v0, LYue/ۥ۟۟ۡۢ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۢ$ۥ;

    iget-object v1, p0, LYue/ۥۡۡۥۧ;->ۥ۟۟۠ۤ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, p1, p2, v1}, LYue/ۥ۟۟ۡۢ$ۥ;->ۥ۟۟۟(III)V

    iput p1, p0, LYue/ۥۡۡۥۧ;->ۥ۟۟۠ۥ:I

    sub-int/2addr p2, p1

    iput p2, p0, LYue/ۥۡۡۥۧ;->ۥ۟۟۠ۦ:I

    return-void
.end method
