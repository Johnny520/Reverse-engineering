.class public final LS4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LS4;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS4;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lvy;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LS4;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS4;->c:Ljava/lang/Object;

    iput-boolean p2, p0, LS4;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, LS4;->a:I

    iget-object v1, p0, LS4;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lvy;

    iget-boolean v0, p0, LS4;->b:Z

    invoke-static {}, LvD;->a()V

    iget-object v1, v1, Lvy;->b:Ljava/lang/Object;

    check-cast v1, LZd;

    iget-boolean v2, v1, LZd;->a:Z

    iput-boolean v0, v1, LZd;->a:Z

    if-eq v2, v0, :cond_0

    iget-object v1, v1, LZd;->b:Ljava/lang/Object;

    check-cast v1, Luy;

    invoke-virtual {v1, v0}, Luy;->a(Z)V

    :cond_0
    return-void

    :pswitch_0
    const/4 v0, 0x0

    iput-boolean v0, p0, LS4;->b:Z

    check-cast v1, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    sget v0, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;->d:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
