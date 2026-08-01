.class final Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;
.super Ljava/util/concurrent/CancellationException;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR#\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;",
        "Ljava/util/concurrent/CancellationException;",
        "Lkotlin/coroutines/cancellation/CancellationException;",
        "",
        "itemOffset",
        "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;",
        "",
        "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
        "previousAnimation",
        "<init>",
        "(ILandroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;)V",
        "I",
        "getItemOffset",
        "()I",
        "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;",
        "getPreviousAnimation",
        "()Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;",
        "foundation"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final itemOffset:I

.field private final previousAnimation:Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILandroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/CancellationException;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;->itemOffset:I

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;->previousAnimation:Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getItemOffset()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;->itemOffset:I

    .line 2
    .line 3
    return p0
.end method

.method public final getPreviousAnimation()Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;->previousAnimation:Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    return-object p0
.end method
