.class public final Landroidx/lifecycle/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/y9;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/j$a;
    }
.end annotation


# static fields
.field public static final i:Landroidx/lifecycle/j;


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:Z

.field public e:Landroid/os/Handler;

.field public final f:Landroidx/lifecycle/h;

.field public final g:La/M2;

.field public final h:Landroidx/lifecycle/j$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/j;

    invoke-direct {v0}, Landroidx/lifecycle/j;-><init>()V

    sput-object v0, Landroidx/lifecycle/j;->i:Landroidx/lifecycle/j;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/j;->c:Z

    iput-boolean v0, p0, Landroidx/lifecycle/j;->d:Z

    new-instance v0, Landroidx/lifecycle/h;

    invoke-direct {v0, p0}, Landroidx/lifecycle/h;-><init>(La/y9;)V

    iput-object v0, p0, Landroidx/lifecycle/j;->f:Landroidx/lifecycle/h;

    new-instance v0, La/M2;

    const/16 v1, 0xd

    invoke-direct {v0, v1, p0}, La/M2;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Landroidx/lifecycle/j;->g:La/M2;

    new-instance v0, Landroidx/lifecycle/j$b;

    invoke-direct {v0, p0}, Landroidx/lifecycle/j$b;-><init>(Landroidx/lifecycle/j;)V

    iput-object v0, p0, Landroidx/lifecycle/j;->h:Landroidx/lifecycle/j$b;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/j;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/j;->b:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroidx/lifecycle/j;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/j;->f:Landroidx/lifecycle/h;

    sget-object v1, Landroidx/lifecycle/e$a;->ON_RESUME:Landroidx/lifecycle/e$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/h;->f(Landroidx/lifecycle/e$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/j;->c:Z

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/j;->e:Landroid/os/Handler;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Landroidx/lifecycle/j;->g:La/M2;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final getLifecycle()Landroidx/lifecycle/e;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/j;->f:Landroidx/lifecycle/h;

    return-object v0
.end method
