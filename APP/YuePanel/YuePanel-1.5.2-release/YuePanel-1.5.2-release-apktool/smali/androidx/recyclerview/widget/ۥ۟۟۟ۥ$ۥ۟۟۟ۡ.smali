.class public Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۡ;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06e1"
.end annotation


# instance fields
.field public ۥ:Z

.field public final synthetic ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۡ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۡ;->ۥ:Z

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 3

    iget-boolean v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۡ;->ۥ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۡ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۟ۨ(Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۡ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;

    iget-object v1, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۠ۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۡ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;

    iget-object v2, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟۠;

    iget-object v1, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۠ۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1, v0}, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟۠;->ۥ۟۟۠۟(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iget-object v2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۡ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;

    iget v2, v2, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۟ۦ:I

    if-ne v1, v2, :cond_2

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۡ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;

    iput v2, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۟:F

    iput p1, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۟۟:F

    const/4 p1, 0x0

    iput p1, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥۣ۟۟۟:F

    iput p1, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۟ۢ:F

    iget-object p1, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟۠;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۡ;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ;->ۥ۟۟ۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;I)V

    :cond_2
    return-void
.end method

.method public ۥ()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۡ;->ۥ:Z

    return-void
.end method
