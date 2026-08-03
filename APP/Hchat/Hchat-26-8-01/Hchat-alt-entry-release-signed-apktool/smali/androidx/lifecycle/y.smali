.class public final Landroidx/lifecycle/y;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/lifecycle/q;


# static fields
.field public static final o:Landroidx/lifecycle/y;


# instance fields
.field public g:I

.field public h:I

.field public i:Z

.field public j:Z

.field public k:Landroid/os/Handler;

.field public final l:Landroidx/lifecycle/s;

.field public final m:La1/a;

.field public final n:Landroidx/lifecycle/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/y;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/lifecycle/y;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/lifecycle/y;->o:Landroidx/lifecycle/y;

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
    iput-boolean v0, p0, Landroidx/lifecycle/y;->i:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Landroidx/lifecycle/y;->j:Z

    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/s;

    .line 10
    .line 11
    invoke-direct {v1, p0, v0}, Landroidx/lifecycle/s;-><init>(Landroidx/lifecycle/q;Z)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Landroidx/lifecycle/y;->l:Landroidx/lifecycle/s;

    .line 15
    .line 16
    new-instance v0, La1/a;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, v1}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/lifecycle/y;->m:La1/a;

    .line 23
    .line 24
    new-instance v0, Landroidx/lifecycle/x;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Landroidx/lifecycle/y;->n:Landroidx/lifecycle/x;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/y;->h:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Landroidx/lifecycle/y;->h:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Landroidx/lifecycle/y;->i:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/lifecycle/y;->l:Landroidx/lifecycle/s;

    .line 14
    .line 15
    sget-object v1, Landroidx/lifecycle/k;->ON_RESUME:Landroidx/lifecycle/k;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/lifecycle/s;->d(Landroidx/lifecycle/k;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Landroidx/lifecycle/y;->i:Z

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/y;->k:Landroid/os/Handler;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Landroidx/lifecycle/y;->m:La1/a;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final f()Landroidx/lifecycle/s;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/y;->l:Landroidx/lifecycle/s;

    .line 2
    .line 3
    return-object v0
.end method
