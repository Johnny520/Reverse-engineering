.class final Lty2;
.super Lyh1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lyh1;"
    }
.end annotation


# instance fields
.field public final a:Luz2;


# direct methods
.method public constructor <init>(Luz2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lty2;->a:Luz2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lty2;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lty2;

    .line 10
    .line 11
    iget-object p1, p1, Lty2;->a:Luz2;

    .line 12
    .line 13
    iget-object p0, p0, Lty2;->a:Luz2;

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

.method public final f()Lth1;
    .locals 1

    .line 1
    new-instance v0, Lvy2;

    .line 2
    .line 3
    iget-object p0, p0, Lty2;->a:Luz2;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lvy2;-><init>(Luz2;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final g(Lth1;)V
    .locals 0

    .line 1
    check-cast p1, Lvy2;

    .line 2
    .line 3
    iget-object p0, p0, Lty2;->a:Luz2;

    .line 4
    .line 5
    iput-object p0, p1, Lvy2;->x:Luz2;

    .line 6
    .line 7
    return-void
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lty2;->a:Luz2;

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
