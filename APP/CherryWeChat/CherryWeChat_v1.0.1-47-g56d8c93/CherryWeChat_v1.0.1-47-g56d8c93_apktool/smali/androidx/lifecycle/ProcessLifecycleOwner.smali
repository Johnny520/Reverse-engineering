.class public final Landroidx/lifecycle/ProcessLifecycleOwner;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LYn;


# static fields
.field public static final i:Landroidx/lifecycle/ProcessLifecycleOwner;


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:Z

.field public e:Landroid/os/Handler;

.field public final f:Lao;

.field public final g:LN2;

.field public final h:LXm;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/ProcessLifecycleOwner;

    invoke-direct {v0}, Landroidx/lifecycle/ProcessLifecycleOwner;-><init>()V

    sput-object v0, Landroidx/lifecycle/ProcessLifecycleOwner;->i:Landroidx/lifecycle/ProcessLifecycleOwner;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->c:Z

    iput-boolean v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->d:Z

    new-instance v0, Lao;

    invoke-direct {v0, p0}, Lao;-><init>(LYn;)V

    iput-object v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->f:Lao;

    new-instance v0, LN2;

    const/16 v1, 0x15

    invoke-direct {v0, v1, p0}, LN2;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->g:LN2;

    new-instance v0, LXm;

    const/16 v1, 0xb

    invoke-direct {v0, v1, p0}, LXm;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->h:LXm;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->b:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->f:Lao;

    sget-object v1, LOn;->ON_RESUME:LOn;

    invoke-virtual {v0, v1}, Lao;->e(LOn;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->c:Z

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->e:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->g:LN2;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final getLifecycle()LRn;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/ProcessLifecycleOwner;->f:Lao;

    return-object v0
.end method
