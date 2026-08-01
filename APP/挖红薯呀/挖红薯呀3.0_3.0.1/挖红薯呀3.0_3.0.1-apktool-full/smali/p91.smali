.class public final Lp91;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ltt;


# instance fields
.field public final a:I

.field public final b:Lbr;


# direct methods
.method public constructor <init>(ILbr;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lp91;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lp91;->b:Lbr;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lq91;)Lmb1;
    .locals 3

    .line 1
    new-instance p1, Lbw;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lp91;->a:I

    .line 7
    .line 8
    iput v0, p1, Lbw;->d:I

    .line 9
    .line 10
    new-instance v1, Ly2;

    .line 11
    .line 12
    new-instance v2, Lgu;

    .line 13
    .line 14
    iget-object p0, p0, Lp91;->b:Lbr;

    .line 15
    .line 16
    invoke-direct {v2, v0, p0}, Lgu;-><init>(ILbr;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v2}, Ly2;-><init>(Leu;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p1, Lbw;->e:Ljava/lang/Object;

    .line 23
    .line 24
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lp91;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lp91;

    .line 6
    .line 7
    iget v0, p1, Lp91;->a:I

    .line 8
    .line 9
    iget v1, p0, Lp91;->a:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Lp91;->b:Lbr;

    .line 14
    .line 15
    iget-object p0, p0, Lp91;->b:Lbr;

    .line 16
    .line 17
    invoke-static {p1, p0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lp91;->a:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object p0, p0, Lp91;->b:Lbr;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    add-int/2addr p0, v0

    .line 12
    mul-int/lit8 p0, p0, 0x1f

    .line 13
    .line 14
    return p0
.end method
