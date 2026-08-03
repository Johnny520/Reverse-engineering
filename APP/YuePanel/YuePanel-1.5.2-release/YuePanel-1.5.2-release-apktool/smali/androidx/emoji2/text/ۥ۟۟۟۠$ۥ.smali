.class public Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/emoji2/text/ۥ۟۟۟۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroidx/emoji2/text/\u06e5\u06df\u06df\u06df\u06e0$\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟:LYue/ۥۢۢۤۥ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, v0}, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0, p1}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public ۥ(I)Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ:Landroid/util/SparseArray;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    :goto_0
    return-object p1
.end method

.method public final ۥ۟()LYue/ۥۢۢۤۥ;
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ۟:LYue/ۥۢۢۤۥ;

    return-object v0
.end method

.method public ۥ۟۟(LYue/ۥۢۢۤۥ;II)V
    .locals 3
    .param p1    # LYue/ۥۢۢۤۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p1, p2}, LYue/ۥۢۢۤۥ;->ۥ۟(I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ(I)Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;

    invoke-direct {v0}, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;-><init>()V

    iget-object v1, p0, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ:Landroid/util/SparseArray;

    invoke-virtual {p1, p2}, LYue/ۥۢۢۤۥ;->ۥ۟(I)I

    move-result v2

    invoke-virtual {v1, v2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    if-le p3, p2, :cond_1

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {v0, p1, p2, p3}, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ۟۟(LYue/ۥۢۢۤۥ;II)V

    goto :goto_0

    :cond_1
    iput-object p1, v0, Landroidx/emoji2/text/ۥ۟۟۟۠$ۥ;->ۥ۟:LYue/ۥۢۢۤۥ;

    :goto_0
    return-void
.end method
