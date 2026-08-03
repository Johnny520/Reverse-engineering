.class final Lyb/c;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public final a:Lf1/r0;

.field public final b:Lfg/a;


# direct methods
.method public constructor <init>(Lf1/r0;Lfg/a;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lyb/c;->a:Lf1/r0;

    .line 11
    .line 12
    iput-object p2, p0, Lyb/c;->b:Lfg/a;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lyb/c;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lyb/c;

    .line 12
    .line 13
    iget-object v1, p1, Lyb/c;->a:Lf1/r0;

    .line 14
    .line 15
    iget-object v3, p0, Lyb/c;->a:Lf1/r0;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lyb/c;->b:Lfg/a;

    .line 25
    .line 26
    iget-object p1, p1, Lyb/c;->b:Lfg/a;

    .line 27
    .line 28
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final f()Ly0/n;
    .locals 3

    .line 1
    new-instance v0, Lyb/f;

    .line 2
    .line 3
    iget-object v1, p0, Lyb/c;->a:Lf1/r0;

    .line 4
    .line 5
    iget-object v2, p0, Lyb/c;->b:Lfg/a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lyb/f;-><init>(Lf1/r0;Lfg/a;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 1

    .line 1
    check-cast p1, Lyb/f;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyb/c;->a:Lf1/r0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iput-object v0, p1, Lyb/f;->u:Lf1/r0;

    .line 12
    .line 13
    iget-object v0, p0, Lyb/c;->b:Lfg/a;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iput-object v0, p1, Lyb/f;->v:Lfg/a;

    .line 19
    .line 20
    invoke-static {p1}, Lx1/k;->l(Lx1/m;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lyb/c;->a:Lf1/r0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lyb/c;->b:Lfg/a;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1
.end method
