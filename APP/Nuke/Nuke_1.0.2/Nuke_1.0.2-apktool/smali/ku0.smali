.class public final Lku0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic h:Ly62;

.field public final synthetic i:Ll80;

.field public final synthetic j:Lo72;


# direct methods
.method public constructor <init>(Ly62;Ll80;Lo72;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lku0;->h:Ly62;

    .line 5
    .line 6
    iput-object p2, p0, Lku0;->i:Ll80;

    .line 7
    .line 8
    iput-object p3, p0, Lku0;->j:Lo72;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lku0;->h:Ly62;

    .line 8
    .line 9
    iget-boolean v0, p1, Ly62;->h:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p1, Ly62;->h:Z

    .line 16
    .line 17
    iget-object p1, p0, Lku0;->i:Ll80;

    .line 18
    .line 19
    invoke-virtual {p1}, Ll80;->a()V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iget-object p0, p0, Lku0;->j:Lo72;

    .line 24
    .line 25
    iput-object p1, p0, Lo72;->i:Ljava/lang/Object;

    .line 26
    .line 27
    return-void
.end method
