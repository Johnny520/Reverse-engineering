.class public final Loy;
.super Ljava/lang/Object;

# interfaces
.implements Lsq;


# static fields
.field public static final i:Loy;


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:Z

.field public e:Landroid/os/Handler;

.field public final f:Landroidx/lifecycle/a;

.field public final g:Lx8;

.field public final h:Ll0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Loy;

    .line 2
    .line 3
    invoke-direct {v0}, Loy;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Loy;->i:Loy;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Loy;->c:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Loy;->d:Z

    .line 8
    .line 9
    new-instance v0, Landroidx/lifecycle/a;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Landroidx/lifecycle/a;-><init>(Lsq;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Loy;->f:Landroidx/lifecycle/a;

    .line 15
    .line 16
    new-instance v0, Lx8;

    .line 17
    .line 18
    const/16 v1, 0xa

    .line 19
    .line 20
    invoke-direct {v0, v1, p0}, Lx8;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Loy;->g:Lx8;

    .line 24
    .line 25
    new-instance v0, Ll0;

    .line 26
    .line 27
    const/16 v1, 0x17

    .line 28
    .line 29
    invoke-direct {v0, v1, p0}, Ll0;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Loy;->h:Ll0;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, Loy;->b:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Loy;->b:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Loy;->c:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Loy;->f:Landroidx/lifecycle/a;

    .line 14
    .line 15
    sget-object v1, Lmq;->ON_RESUME:Lmq;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/lifecycle/a;->d(Lmq;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Loy;->c:Z

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Loy;->e:Landroid/os/Handler;

    .line 25
    .line 26
    invoke-static {v0}, Lmp;->d(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Loy;->g:Lx8;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final e()Landroidx/lifecycle/a;
    .locals 1

    .line 1
    iget-object v0, p0, Loy;->f:Landroidx/lifecycle/a;

    .line 2
    .line 3
    return-object v0
.end method
