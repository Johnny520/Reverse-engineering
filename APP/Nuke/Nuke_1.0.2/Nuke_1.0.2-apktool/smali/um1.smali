.class final Lum1;
.super Lyh1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lyh1;"
    }
.end annotation


# instance fields
.field public final a:Ltm1;


# direct methods
.method public constructor <init>(Ltm1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lum1;->a:Ltm1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lum1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lum1;

    .line 8
    .line 9
    iget-object p1, p1, Lum1;->a:Ltm1;

    .line 10
    .line 11
    iget-object p0, p0, Lum1;->a:Ltm1;

    .line 12
    .line 13
    if-eq p1, p0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public final f()Lth1;
    .locals 2

    .line 1
    new-instance v0, Lxm1;

    .line 2
    .line 3
    sget-object v1, Lop0;->a:Leb;

    .line 4
    .line 5
    iget-object p0, p0, Lum1;->a:Ltm1;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lxm1;-><init>(Lqm1;Ltm1;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lth1;)V
    .locals 3

    .line 1
    check-cast p1, Lxm1;

    .line 2
    .line 3
    sget-object v0, Lop0;->a:Leb;

    .line 4
    .line 5
    iput-object v0, p1, Lxm1;->v:Lqm1;

    .line 6
    .line 7
    iget-object v0, p1, Lxm1;->w:Ltm1;

    .line 8
    .line 9
    iget-object v1, v0, Ltm1;->a:Lxm1;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v1, p1, :cond_0

    .line 13
    .line 14
    iput-object v2, v0, Ltm1;->a:Lxm1;

    .line 15
    .line 16
    :cond_0
    iget-object p0, p0, Lum1;->a:Ltm1;

    .line 17
    .line 18
    if-eq p0, v0, :cond_1

    .line 19
    .line 20
    iput-object p0, p1, Lxm1;->w:Ltm1;

    .line 21
    .line 22
    :cond_1
    iget-boolean p0, p1, Lth1;->u:Z

    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    iget-object p0, p1, Lxm1;->w:Ltm1;

    .line 27
    .line 28
    iput-object p1, p0, Ltm1;->a:Lxm1;

    .line 29
    .line 30
    iput-object v2, p0, Ltm1;->b:Lxm1;

    .line 31
    .line 32
    iput-object v2, p1, Lxm1;->x:Lxm1;

    .line 33
    .line 34
    new-instance v0, Lea;

    .line 35
    .line 36
    const/16 v1, 0x11

    .line 37
    .line 38
    invoke-direct {v0, v1, p1}, Lea;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Ltm1;->c:Lxm0;

    .line 42
    .line 43
    invoke-virtual {p1}, Lth1;->A0()Lj20;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Ltm1;->d:Lj20;

    .line 48
    .line 49
    :cond_2
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    sget-object v0, Lop0;->a:Leb;

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
    iget-object p0, p0, Lum1;->a:Ltm1;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method
