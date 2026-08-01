.class final Lrj;
.super Lte0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lte0;"
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
    iput-object p1, p0, Lrj;->a:Lsw;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final e()Loe0;
    .locals 1

    .line 1
    new-instance v0, Lsj;

    .line 2
    .line 3
    invoke-direct {v0}, Lk20;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lrj;->a:Lsw;

    .line 7
    .line 8
    iput-object p0, v0, Lsj;->t:Lsw;

    .line 9
    .line 10
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lrj;

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
    check-cast p1, Lrj;

    .line 12
    .line 13
    iget-object p1, p1, Lrj;->a:Lsw;

    .line 14
    .line 15
    iget-object p0, p0, Lrj;->a:Lsw;

    .line 16
    .line 17
    if-ne p1, p0, :cond_2

    .line 18
    .line 19
    return v0

    .line 20
    :cond_2
    return v2
.end method

.method public final f(Loe0;)V
    .locals 1

    .line 1
    check-cast p1, Lsj;

    .line 2
    .line 3
    iget-object v0, p1, Lsj;->t:Lsw;

    .line 4
    .line 5
    iget-object p0, p0, Lrj;->a:Lsw;

    .line 6
    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    iput-object p0, p1, Lsj;->t:Lsw;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lrj;->a:Lsw;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
