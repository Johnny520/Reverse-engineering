.class public final L۟/s7$b;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/s7;-><init>(Landroid/widget/ImageView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/s7;


# direct methods
.method public constructor <init>(L۟/s7;)V
    .locals 0

    iput-object p1, p0, L۟/s7$b;->ۥ:L۟/s7;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    iget-object p1, p0, L۟/s7$b;->ۥ:L۟/s7;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    iget-object p1, p0, L۟/s7$b;->ۥ:L۟/s7;

    .line 2
    .line 3
    iget-object v0, p1, L۟/s7;->ۥۣ۠:Landroid/view/View$OnLongClickListener;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p1, L۟/s7;->ۥ۟ۤ:Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Landroid/view/View$OnLongClickListener;->onLongClick(Landroid/view/View;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
