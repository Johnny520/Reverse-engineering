.class public final Lxhss/ᛸᲀᲈᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Lxhss/ᛷᛴᛱᲀ;

.field public final synthetic ᛷᛵᛵᲈ:Landroid/view/View;


# direct methods
.method public constructor <init>(Lxhss/ᛷᛴᛱᲀ;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛸᲀᲈᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛴᛱᲀ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛸᲀᲈᛳ;->ᛷᛵᛵᲈ:Landroid/view/View;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lxhss/ᛸᲀᲈᛳ;->ᛷᛵᛵᲈ:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object p0, p0, Lxhss/ᛸᲀᲈᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛴᛱᲀ;

    .line 16
    .line 17
    invoke-virtual {p0}, Lxhss/ᛷᛴᛱᲀ;->ᛳᲁᲇᛸ()Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Landroid/view/View;->getWindowInsetsController()Landroid/view/WindowInsetsController;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v2}, Landroid/view/WindowInsetsController;->getSystemBarsBehavior()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    and-int/lit8 v2, v2, 0x10

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 36
    .line 37
    :cond_0
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 38
    .line 39
    sub-int/2addr v1, v0

    .line 40
    iget v0, p0, Lxhss/ᛷᛴᛱᲀ;->ᲀᲇᛳᲁ:I

    .line 41
    .line 42
    if-eq v1, v0, :cond_1

    .line 43
    .line 44
    iput v1, p0, Lxhss/ᛷᛴᛱᲀ;->ᲀᲇᛳᲁ:I

    .line 45
    .line 46
    sget v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛴᲈᛱᛴ:I

    .line 47
    .line 48
    iget-object v0, p0, Lxhss/ᛷᛴᛱᲀ;->ᲇᛶᛴᲀ:Lxhss/ᲇᲇᛱ;

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lxhss/ᛷᛴᛱᲀ;->ᛷᛵᛵᲈ(Lxhss/ᲇᲇᛱ;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method
