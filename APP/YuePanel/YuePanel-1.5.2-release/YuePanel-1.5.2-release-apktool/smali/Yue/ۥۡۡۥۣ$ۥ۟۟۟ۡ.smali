.class public LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۡۥۣ$ۥ۟۟۟۠;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡۥۣ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e1"
.end annotation


# static fields
.field public static ۥ۟:LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;


# instance fields
.field public ۥ:Landroid/view/VelocityTracker;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;

    invoke-direct {v0}, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;-><init>()V

    sput-object v0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ۟:LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ۟۟۟ۢ()LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;
    .locals 2

    sget-object v0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ۟:LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v1

    iput-object v1, v0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/VelocityTracker;

    sget-object v0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ۟:LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;

    return-object v0
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    :cond_0
    return-void
.end method

.method public recycle()V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method

.method public ۥ(IF)V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    :cond_0
    return-void
.end method

.method public ۥ۟(I)F
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟۟(I)F
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ۟۟(I)F

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟۟۟(Landroid/view/MotionEvent;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟۟()F
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟۠()F
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟ۡ(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۡۥۣ$ۥ۟۟۟ۡ;->ۥ:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    :cond_0
    return-void
.end method
