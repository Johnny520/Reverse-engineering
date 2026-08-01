.class public final Landroidx/lifecycle/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/s;


# static fields
.field public static final j:Landroidx/lifecycle/B;


# instance fields
.field public b:I

.field public c:I

.field public d:Z

.field public e:Z

.field public f:Landroid/os/Handler;

.field public final g:Landroidx/lifecycle/u;

.field public final h:Landroidx/activity/b;

.field public final i:LC/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/B;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/lifecycle/B;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/lifecycle/B;->j:Landroidx/lifecycle/B;

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
    iput-boolean v0, p0, Landroidx/lifecycle/B;->d:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Landroidx/lifecycle/B;->e:Z

    .line 8
    .line 9
    new-instance v0, Landroidx/lifecycle/u;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Landroidx/lifecycle/u;-><init>(Landroidx/lifecycle/s;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/lifecycle/B;->g:Landroidx/lifecycle/u;

    .line 15
    .line 16
    new-instance v0, Landroidx/activity/b;

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    invoke-direct {v0, v1, p0}, Landroidx/activity/b;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Landroidx/lifecycle/B;->h:Landroidx/activity/b;

    .line 23
    .line 24
    new-instance v0, LC/j;

    .line 25
    .line 26
    const/16 v1, 0xd

    .line 27
    .line 28
    invoke-direct {v0, v1, p0}, LC/j;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Landroidx/lifecycle/B;->i:LC/j;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/B;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Landroidx/lifecycle/B;->c:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Landroidx/lifecycle/B;->d:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/lifecycle/B;->g:Landroidx/lifecycle/u;

    .line 14
    .line 15
    sget-object v1, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Landroidx/lifecycle/B;->d:Z

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/B;->f:Landroid/os/Handler;

    .line 25
    .line 26
    invoke-static {v0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Landroidx/lifecycle/B;->h:Landroidx/activity/b;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final c()Landroidx/lifecycle/u;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/B;->g:Landroidx/lifecycle/u;

    .line 2
    .line 3
    return-object v0
.end method
