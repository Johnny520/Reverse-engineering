.class public final Ly1/s2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic g:Landroid/view/View;

.field public final synthetic h:Li0/y1;


# direct methods
.method public constructor <init>(Landroid/view/View;Li0/y1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/s2;->g:Landroid/view/View;

    .line 5
    .line 6
    iput-object p2, p0, Ly1/s2;->h:Li0/y1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Ly1/s2;->g:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ly1/s2;->h:Li0/y1;

    .line 7
    .line 8
    invoke-virtual {p1}, Li0/y1;->x()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
