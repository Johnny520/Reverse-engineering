.class final Lth/k;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public final a:Lth/j;


# direct methods
.method public constructor <init>(Lth/j;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lth/k;->a:Lth/j;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lth/k;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Lth/k;

    .line 12
    .line 13
    iget-object p1, p1, Lth/k;->a:Lth/j;

    .line 14
    .line 15
    iget-object v0, p0, Lth/k;->a:Lth/j;

    .line 16
    .line 17
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final f()Ly0/n;
    .locals 2

    .line 1
    new-instance v0, Lth/l;

    .line 2
    .line 3
    iget-object v1, p0, Lth/k;->a:Lth/j;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ly0/n;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, v0, Lth/l;->u:Lth/j;

    .line 12
    .line 13
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 3

    .line 1
    check-cast p1, Lth/l;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lth/l;->u:Lth/j;

    .line 7
    .line 8
    iget-object v1, p0, Lth/k;->a:Lth/j;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    iget-object v0, v0, Lth/j;->c:Li0/j1;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iput-object v1, p1, Lth/l;->u:Lth/j;

    .line 22
    .line 23
    :cond_0
    invoke-static {p1}, Lx1/k;->l(Lx1/m;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lth/k;->a:Lth/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
