.class public final Lp8;
.super Lte0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ltz0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lte0;",
        "Ltz0;"
    }
.end annotation


# instance fields
.field public final a:Lsw;


# direct methods
.method public constructor <init>(Lsw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp8;->a:Lsw;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()Lsz0;
    .locals 2

    .line 1
    new-instance v0, Lsz0;

    .line 2
    .line 3
    invoke-direct {v0}, Lsz0;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, v0, Lsz0;->f:Z

    .line 8
    .line 9
    iget-object p0, p0, Lp8;->a:Lsw;

    .line 10
    .line 11
    invoke-interface {p0, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final e()Loe0;
    .locals 2

    .line 1
    new-instance v0, Llk;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lp8;->a:Lsw;

    .line 5
    .line 6
    invoke-direct {v0, p0, v1}, Llk;-><init>(Lsw;Z)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lp8;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lp8;

    .line 10
    .line 11
    iget-object p0, p0, Lp8;->a:Lsw;

    .line 12
    .line 13
    iget-object p1, p1, Lp8;->a:Lsw;

    .line 14
    .line 15
    if-eq p0, p1, :cond_2

    .line 16
    .line 17
    :goto_0
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 20
    return p0
.end method

.method public final f(Loe0;)V
    .locals 0

    .line 1
    check-cast p1, Llk;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lp8;->a:Lsw;

    .line 7
    .line 8
    iput-object p0, p1, Llk;->s:Lsw;

    .line 9
    .line 10
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    mul-int/lit8 v0, v0, 0x1f

    .line 7
    .line 8
    iget-object p0, p0, Lp8;->a:Lsw;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    add-int/2addr p0, v0

    .line 15
    return p0
.end method
