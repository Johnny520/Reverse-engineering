.class public final LVl;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source ""


# instance fields
.field public a:Z

.field public final synthetic b:LWl;


# direct methods
.method public constructor <init>(LWl;)V
    .locals 0

    iput-object p1, p0, LVl;->b:LWl;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, LVl;->a:Z

    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 6

    iget-object v0, p0, LVl;->b:LWl;

    iget-object v1, v0, LWl;->m:LUl;

    iget-boolean v2, p0, LVl;->a:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LWl;->i(Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/o;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, v0, LWl;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, LUl;->d()I

    move-result v4

    sget-object v5, LlE;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutDirection()I

    move-result v3

    invoke-static {v4, v3}, LUl;->b(II)I

    move-result v3

    const/high16 v4, 0xff0000

    and-int/2addr v3, v4

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    iget v4, v0, LWl;->l:I

    if-ne v3, v4, :cond_1

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iput v4, v0, LWl;->d:F

    iput p1, v0, LWl;->e:F

    const/4 p1, 0x0

    iput p1, v0, LWl;->i:F

    iput p1, v0, LWl;->h:F

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x2

    invoke-virtual {v0, v2, p1}, LWl;->n(Landroidx/recyclerview/widget/o;I)V

    :cond_1
    :goto_0
    return-void
.end method
