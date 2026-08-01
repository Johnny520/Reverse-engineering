.class public final Luw;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Lsm;

.field public final synthetic b:Lsm;

.field public final synthetic c:Lhm;

.field public final synthetic d:Lhm;


# direct methods
.method public constructor <init>(Lsm;Lsm;Lhm;Lhm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Luw;->a:Lsm;

    .line 5
    .line 6
    iput-object p2, p0, Luw;->b:Lsm;

    .line 7
    .line 8
    iput-object p3, p0, Luw;->c:Lhm;

    .line 9
    .line 10
    iput-object p4, p0, Luw;->d:Lhm;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    .line 1
    iget-object v0, p0, Luw;->d:Lhm;

    .line 2
    .line 3
    invoke-interface {v0}, Lhm;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    .line 1
    iget-object v0, p0, Luw;->c:Lhm;

    .line 2
    .line 3
    invoke-interface {v0}, Lhm;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, La7;

    .line 7
    .line 8
    invoke-direct {v0, p1}, La7;-><init>(Landroid/window/BackEvent;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Luw;->b:Lsm;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Lsm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, La7;

    .line 7
    .line 8
    invoke-direct {v0, p1}, La7;-><init>(Landroid/window/BackEvent;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Luw;->a:Lsm;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Lsm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method
