.class final Lb70;
.super Lte0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lte0;"
    }
.end annotation


# instance fields
.field public final a:Lf70;

.field public final b:Leb;

.field public final c:Lum0;


# direct methods
.method public constructor <init>(Lf70;Leb;Lum0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb70;->a:Lf70;

    .line 5
    .line 6
    iput-object p2, p0, Lb70;->b:Leb;

    .line 7
    .line 8
    iput-object p3, p0, Lb70;->c:Lum0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final e()Loe0;
    .locals 2

    .line 1
    new-instance v0, Le70;

    .line 2
    .line 3
    invoke-direct {v0}, Loe0;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lb70;->a:Lf70;

    .line 7
    .line 8
    iput-object v1, v0, Le70;->r:Lf70;

    .line 9
    .line 10
    iget-object v1, p0, Lb70;->b:Leb;

    .line 11
    .line 12
    iput-object v1, v0, Le70;->s:Leb;

    .line 13
    .line 14
    iget-object p0, p0, Lb70;->c:Lum0;

    .line 15
    .line 16
    iput-object p0, v0, Le70;->t:Lum0;

    .line 17
    .line 18
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lb70;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lb70;

    .line 10
    .line 11
    iget-object v0, p1, Lb70;->a:Lf70;

    .line 12
    .line 13
    iget-object v1, p0, Lb70;->a:Lf70;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, Lb70;->b:Leb;

    .line 23
    .line 24
    iget-object v1, p1, Lb70;->b:Leb;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object p0, p0, Lb70;->c:Lum0;

    .line 34
    .line 35
    iget-object p1, p1, Lb70;->c:Lum0;

    .line 36
    .line 37
    if-eq p0, p1, :cond_4

    .line 38
    .line 39
    :goto_0
    const/4 p0, 0x0

    .line 40
    return p0

    .line 41
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 42
    return p0
.end method

.method public final f(Loe0;)V
    .locals 1

    .line 1
    check-cast p1, Le70;

    .line 2
    .line 3
    iget-object v0, p0, Lb70;->a:Lf70;

    .line 4
    .line 5
    iput-object v0, p1, Le70;->r:Lf70;

    .line 6
    .line 7
    iget-object v0, p0, Lb70;->b:Leb;

    .line 8
    .line 9
    iput-object v0, p1, Le70;->s:Leb;

    .line 10
    .line 11
    iget-object p0, p0, Lb70;->c:Lum0;

    .line 12
    .line 13
    iput-object p0, p1, Le70;->t:Lum0;

    .line 14
    .line 15
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lb70;->a:Lf70;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lb70;->b:Leb;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {v2, v1, v0}, Lt1;->c(IIZ)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object p0, p0, Lb70;->c:Lum0;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    add-int/2addr p0, v0

    .line 30
    return p0
.end method
