.class public final Lmo;
.super Lgq;

# interfaces
.implements Lum;


# instance fields
.field public final synthetic b:Lno;

.field public final synthetic c:Lh1;


# direct methods
.method public constructor <init>(Lno;Lh1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmo;->b:Lno;

    .line 2
    .line 3
    iput-object p2, p0, Lmo;->c:Lh1;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lgq;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-object p1, p0, Lmo;->b:Lno;

    .line 4
    .line 5
    iget-object p1, p1, Lno;->c:Landroid/os/Handler;

    .line 6
    .line 7
    iget-object v0, p0, Lmo;->c:Lh1;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, Lxh;->n:Lxh;

    .line 13
    .line 14
    return-object p1
.end method
