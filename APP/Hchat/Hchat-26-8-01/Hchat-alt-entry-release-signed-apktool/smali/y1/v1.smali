.class public final Ly1/v1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ly1/o2;


# instance fields
.field public a:Lfg/a;

.field public b:Li0/j1;

.field public final c:Li0/j1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Ly1/v1;->c:Li0/j1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/v1;->b:Li0/j1;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Ly1/v1;->a:Lfg/a;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ly1/j1;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    :cond_0
    sget-object v0, Ly1/j1;->c:Ly1/j1;

    .line 18
    .line 19
    :cond_1
    invoke-static {v0}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Ly1/v1;->b:Li0/j1;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Ly1/v1;->a:Lfg/a;

    .line 27
    .line 28
    :cond_2
    iget-object v0, p0, Ly1/v1;->b:Li0/j1;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ly1/j1;

    .line 38
    .line 39
    iget-wide v0, v0, Ly1/j1;->b:J

    .line 40
    .line 41
    return-wide v0
.end method
