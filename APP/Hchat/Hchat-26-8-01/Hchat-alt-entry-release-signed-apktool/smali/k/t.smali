.class public final Lk/t;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public final a:F

.field public final b:Lf1/t0;

.field public final c:Lv/d;


# direct methods
.method public constructor <init>(FLf1/t0;Lv/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lk/t;->a:F

    .line 5
    .line 6
    iput-object p2, p0, Lk/t;->b:Lf1/t0;

    .line 7
    .line 8
    iput-object p3, p0, Lk/t;->c:Lv/d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lk/t;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lk/t;

    .line 10
    .line 11
    iget v0, p0, Lk/t;->a:F

    .line 12
    .line 13
    iget v1, p1, Lk/t;->a:F

    .line 14
    .line 15
    invoke-static {v0, v1}, Lu2/f;->b(FF)Z

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
    iget-object v0, p0, Lk/t;->b:Lf1/t0;

    .line 23
    .line 24
    iget-object v1, p1, Lk/t;->b:Lf1/t0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lf1/t0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, Lk/t;->c:Lv/d;

    .line 34
    .line 35
    iget-object p1, p1, Lk/t;->c:Lv/d;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lv/d;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_4

    .line 42
    .line 43
    :goto_0
    const/4 p1, 0x0

    .line 44
    return p1

    .line 45
    :cond_4
    :goto_1
    const/4 p1, 0x1

    .line 46
    return p1
.end method

.method public final f()Ly0/n;
    .locals 4

    .line 1
    new-instance v0, Lk/s;

    .line 2
    .line 3
    iget-object v1, p0, Lk/t;->b:Lf1/t0;

    .line 4
    .line 5
    iget-object v2, p0, Lk/t;->c:Lv/d;

    .line 6
    .line 7
    iget v3, p0, Lk/t;->a:F

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Lk/s;-><init>(FLf1/t0;Lv/d;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 3

    .line 1
    check-cast p1, Lk/s;

    .line 2
    .line 3
    iget v0, p1, Lk/s;->x:F

    .line 4
    .line 5
    iget-object v1, p1, Lk/s;->A:Lc1/c;

    .line 6
    .line 7
    iget v2, p0, Lk/t;->a:F

    .line 8
    .line 9
    invoke-static {v0, v2}, Lu2/f;->b(FF)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iput v2, p1, Lk/s;->x:F

    .line 16
    .line 17
    invoke-virtual {v1}, Lc1/c;->k1()V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p1, Lk/s;->y:Lf1/t0;

    .line 21
    .line 22
    iget-object v2, p0, Lk/t;->b:Lf1/t0;

    .line 23
    .line 24
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    iput-object v2, p1, Lk/s;->y:Lf1/t0;

    .line 31
    .line 32
    invoke-virtual {v1}, Lc1/c;->k1()V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object v0, p1, Lk/s;->z:Lv/d;

    .line 36
    .line 37
    iget-object v2, p0, Lk/t;->c:Lv/d;

    .line 38
    .line 39
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    iput-object v2, p1, Lk/s;->z:Lv/d;

    .line 46
    .line 47
    invoke-virtual {v1}, Lc1/c;->k1()V

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, Lx1/k;->n(Lx1/z1;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lk/t;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lk/t;->b:Lf1/t0;

    .line 10
    .line 11
    invoke-virtual {v1}, Lf1/t0;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, Lk/t;->c:Lv/d;

    .line 19
    .line 20
    invoke-virtual {v0}, Lv/d;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BorderModifierNodeElement(width="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lk/t;->a:F

    .line 9
    .line 10
    invoke-static {v1}, Lu2/f;->c(F)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ", brush="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lk/t;->b:Lf1/t0;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", shape="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lk/t;->c:Lv/d;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/16 v1, 0x29

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
.end method
