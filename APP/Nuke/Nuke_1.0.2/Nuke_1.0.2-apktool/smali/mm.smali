.class final Lmm;
.super Lyh1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lyh1;"
    }
.end annotation


# instance fields
.field public final a:Lom;


# direct methods
.method public constructor <init>(Lom;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmm;->a:Lom;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lmm;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lmm;

    .line 8
    .line 9
    iget-object p1, p1, Lmm;->a:Lom;

    .line 10
    .line 11
    iget-object p0, p0, Lmm;->a:Lom;

    .line 12
    .line 13
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public final f()Lth1;
    .locals 1

    .line 1
    new-instance v0, Lpm;

    .line 2
    .line 3
    invoke-direct {v0}, Lth1;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lmm;->a:Lom;

    .line 7
    .line 8
    iput-object p0, v0, Lpm;->v:Lom;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lth1;)V
    .locals 1

    .line 1
    check-cast p1, Lpm;

    .line 2
    .line 3
    iget-object v0, p1, Lpm;->v:Lom;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lom;->a:Lzk1;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lzk1;->j(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lmm;->a:Lom;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lom;->a:Lzk1;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lzk1;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iput-object p0, p1, Lpm;->v:Lom;

    .line 22
    .line 23
    return-void
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lmm;->a:Lom;

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
