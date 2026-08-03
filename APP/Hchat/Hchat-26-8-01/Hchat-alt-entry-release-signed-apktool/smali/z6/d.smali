.class public final Lz6/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lf1/r0;


# instance fields
.field public final a:F

.field public final b:Lz6/c;


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lz6/d;->a:F

    .line 5
    .line 6
    sget-object p1, Lz6/c;->h:Lz6/c;

    .line 7
    .line 8
    iput-object p1, p0, Lz6/d;->b:Lz6/c;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(JLu2/m;Lu2/c;)Lf1/c0;
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget p3, p0, Lz6/d;->a:F

    .line 8
    .line 9
    invoke-interface {p4, p3}, Lu2/c;->x0(F)F

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-static {p1, p2}, Le1/e;->b(J)F

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    const/high16 v0, 0x3f000000    # 0.5f

    .line 18
    .line 19
    mul-float/2addr p4, v0

    .line 20
    const/4 v0, 0x0

    .line 21
    cmpg-float v1, p3, v0

    .line 22
    .line 23
    if-gez v1, :cond_0

    .line 24
    .line 25
    move p3, v0

    .line 26
    :cond_0
    cmpl-float v0, p3, p4

    .line 27
    .line 28
    if-lez v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move p4, p3

    .line 32
    :goto_0
    iget-object p3, p0, Lz6/d;->b:Lz6/c;

    .line 33
    .line 34
    invoke-static {p1, p2, p4, p3}, Lac/p;->K(JFLz6/c;)Lf1/c0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
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
    instance-of v0, p1, Lz6/d;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lz6/d;

    .line 10
    .line 11
    iget v0, p1, Lz6/d;->a:F

    .line 12
    .line 13
    iget v1, p0, Lz6/d;->a:F

    .line 14
    .line 15
    invoke-static {v1, v0}, Lu2/f;->b(FF)Z

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
    iget-object v0, p0, Lz6/d;->b:Lz6/c;

    .line 23
    .line 24
    iget-object p1, p1, Lz6/d;->b:Lz6/c;

    .line 25
    .line 26
    if-eq v0, p1, :cond_3

    .line 27
    .line 28
    :goto_0
    const/4 p1, 0x0

    .line 29
    return p1

    .line 30
    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 31
    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lz6/d;->a:F

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
    iget-object v1, p0, Lz6/d;->b:Lz6/c;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lz6/d;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Lu2/f;->c(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "RoundedRectangle(cornerRadius="

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v0, ", style="

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lz6/d;->b:Lz6/c;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ")"

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method
