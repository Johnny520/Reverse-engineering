.class final Lh/z0;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public final a:Li/r0;


# direct methods
.method public constructor <init>(Li/r0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/z0;->a:Li/r0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lh/z0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lh/z0;

    .line 6
    .line 7
    iget-object p1, p1, Lh/z0;->a:Li/r0;

    .line 8
    .line 9
    iget-object v0, p0, Lh/z0;->a:Li/r0;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Li/r0;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    sget-object p1, Ly0/b;->g:Ly0/g;

    .line 18
    .line 19
    invoke-virtual {p1, p1}, Ly0/g;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final f()Ly0/n;
    .locals 2

    .line 1
    new-instance v0, Lh/d1;

    .line 2
    .line 3
    iget-object v1, p0, Lh/z0;->a:Li/r0;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lh/d1;-><init>(Li/r0;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 1

    .line 1
    check-cast p1, Lh/d1;

    .line 2
    .line 3
    iget-object v0, p0, Lh/z0;->a:Li/r0;

    .line 4
    .line 5
    iput-object v0, p1, Lh/d1;->v:Li/r0;

    .line 6
    .line 7
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lh/z0;->a:Li/r0;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/r0;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    const/high16 v1, -0x40800000    # -1.0f

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    mul-int/lit8 v2, v2, 0x1f

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-int/2addr v1, v2

    .line 22
    add-int/2addr v1, v0

    .line 23
    mul-int/lit8 v1, v1, 0x1f

    .line 24
    .line 25
    return v1
.end method
