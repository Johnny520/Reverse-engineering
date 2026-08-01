.class public final Lr8;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ls8;

.field public final synthetic b:Lou;

.field public final synthetic c:Lku;

.field public final synthetic d:Ll0;


# direct methods
.method public constructor <init>(Ll0;Ls8;Lou;Lku;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr8;->d:Ll0;

    .line 5
    .line 6
    iput-object p2, p0, Lr8;->a:Ls8;

    .line 7
    .line 8
    iput-object p3, p0, Lr8;->b:Lou;

    .line 9
    .line 10
    iput-object p4, p0, Lr8;->c:Lku;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lr8;->d:Ll0;

    .line 2
    .line 3
    iget-object v0, v0, Ll0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lt8;

    .line 6
    .line 7
    iget-object v1, p0, Lr8;->a:Ls8;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    iput-boolean v2, v0, Lt8;->z:Z

    .line 13
    .line 14
    iget-object v1, v1, Ls8;->b:Lku;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v1, v2}, Lku;->c(Z)V

    .line 18
    .line 19
    .line 20
    iput-boolean v2, v0, Lt8;->z:Z

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lr8;->b:Lou;

    .line 23
    .line 24
    invoke-virtual {v0}, Lou;->isEnabled()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Lou;->hasSubMenu()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    const/4 v2, 0x0

    .line 38
    iget-object v3, p0, Lr8;->c:Lku;

    .line 39
    .line 40
    invoke-virtual {v3, v0, v2, v1}, Lku;->q(Landroid/view/MenuItem;Ldv;I)Z

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method
