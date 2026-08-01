.class final Ld10;
.super Lte0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lte0;"
    }
.end annotation


# instance fields
.field public final a:Lg30;

.field public final b:Lf10;


# direct methods
.method public constructor <init>(Lg30;Lf10;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld10;->a:Lg30;

    .line 5
    .line 6
    iput-object p2, p0, Ld10;->b:Lf10;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e()Loe0;
    .locals 2

    .line 1
    new-instance v0, Le10;

    .line 2
    .line 3
    iget-object v1, p0, Ld10;->b:Lf10;

    .line 4
    .line 5
    iget-object p0, p0, Ld10;->a:Lg30;

    .line 6
    .line 7
    invoke-interface {v1, p0}, Lf10;->a(Lg30;)Lrm;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0}, Lsm;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p0, v0, Le10;->t:Lrm;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lsm;->w0(Lrm;)Lrm;

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

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
    instance-of v1, p1, Ld10;

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
    check-cast p1, Ld10;

    .line 12
    .line 13
    iget-object v1, p1, Ld10;->a:Lg30;

    .line 14
    .line 15
    iget-object v3, p0, Ld10;->a:Lg30;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object p0, p0, Ld10;->b:Lf10;

    .line 25
    .line 26
    iget-object p1, p1, Ld10;->b:Lf10;

    .line 27
    .line 28
    invoke-static {p0, p1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final f(Loe0;)V
    .locals 1

    .line 1
    check-cast p1, Le10;

    .line 2
    .line 3
    iget-object v0, p0, Ld10;->b:Lf10;

    .line 4
    .line 5
    iget-object p0, p0, Ld10;->a:Lg30;

    .line 6
    .line 7
    invoke-interface {v0, p0}, Lf10;->a(Lg30;)Lrm;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object v0, p1, Le10;->t:Lrm;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lsm;->x0(Lrm;)V

    .line 14
    .line 15
    .line 16
    iput-object p0, p1, Le10;->t:Lrm;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Lsm;->w0(Lrm;)Lrm;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Ld10;->a:Lg30;

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
    iget-object p0, p0, Ld10;->b:Lf10;

    .line 10
    .line 11
    invoke-interface {p0}, Lf10;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method
