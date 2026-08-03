.class public abstract Lo5/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public g:I

.field public h:Ljava/lang/Object;

.field public final i:La5/a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput v0, p0, Lo5/t;->g:I

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, La5/a;

    .line 11
    .line 12
    const/4 v1, 0x5

    .line 13
    invoke-direct {v0, p2, v1, p1}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lo5/t;->i:La5/a;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public abstract a(La5/a;)Ljava/lang/Object;
.end method

.method public final hasNext()Z
    .locals 3

    .line 1
    iget v0, p0, Lo5/t;->g:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v2, 0x3

    .line 7
    if-eq v0, v2, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    iput v0, p0, Lo5/t;->g:I

    .line 11
    .line 12
    iget-object v0, p0, Lo5/t;->i:La5/a;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lo5/t;->a(La5/a;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lo5/t;->h:Ljava/lang/Object;

    .line 19
    .line 20
    iget v0, p0, Lo5/t;->g:I

    .line 21
    .line 22
    if-eq v0, v2, :cond_0

    .line 23
    .line 24
    iput v1, p0, Lo5/t;->g:I

    .line 25
    .line 26
    return v1

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0

    .line 29
    :cond_1
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lo5/t;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    iput v0, p0, Lo5/t;->g:I

    .line 9
    .line 10
    iget-object v0, p0, Lo5/t;->h:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, p0, Lo5/t;->h:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-static {}, Lbsh/j;->e()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method
