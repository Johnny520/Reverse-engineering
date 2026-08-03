.class public final Luh/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:F

.field public final b:F

.field public final c:Luh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Luh/b;

    .line 2
    .line 3
    sget-object v1, Luh/a;->g:Luh/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Luh/b;-><init>(Luh/a;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Luh/b;

    .line 9
    .line 10
    sget-object v1, Luh/a;->h:Luh/a;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Luh/b;-><init>(Luh/a;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Luh/b;

    .line 16
    .line 17
    sget-object v1, Luh/a;->i:Luh/a;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Luh/b;-><init>(Luh/a;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Luh/b;

    .line 23
    .line 24
    sget-object v1, Luh/a;->j:Luh/a;

    .line 25
    .line 26
    invoke-direct {v0, v1}, Luh/b;-><init>(Luh/a;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Luh/b;

    .line 30
    .line 31
    sget-object v1, Luh/a;->k:Luh/a;

    .line 32
    .line 33
    invoke-direct {v0, v1}, Luh/b;-><init>(Luh/a;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Luh/b;

    .line 37
    .line 38
    sget-object v1, Luh/a;->l:Luh/a;

    .line 39
    .line 40
    invoke-direct {v0, v1}, Luh/b;-><init>(Luh/a;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(FFLuh/a;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Luh/b;->a:F

    .line 8
    .line 9
    iput p2, p0, Luh/b;->b:F

    .line 10
    .line 11
    iput-object p3, p0, Luh/b;->c:Luh/a;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Luh/a;)V
    .locals 2

    const-wide v0, 0x3fe999999999999aL    # 0.8

    double-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 14
    invoke-direct {p0, v0, v1, p1}, Luh/b;-><init>(FFLuh/a;)V

    return-void
.end method

.method public static a(Luh/b;FLuh/a;I)Luh/b;
    .locals 2

    .line 1
    iget v0, p0, Luh/b;->a:F

    .line 2
    .line 3
    and-int/lit8 v1, p3, 0x2

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget p1, p0, Luh/b;->b:F

    .line 8
    .line 9
    :cond_0
    and-int/lit8 p3, p3, 0x4

    .line 10
    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    iget-object p2, p0, Luh/b;->c:Luh/a;

    .line 14
    .line 15
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance p0, Luh/b;

    .line 22
    .line 23
    invoke-direct {p0, v0, p1, p2}, Luh/b;-><init>(FFLuh/a;)V

    .line 24
    .line 25
    .line 26
    return-object p0
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
    instance-of v0, p1, Luh/b;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Luh/b;

    .line 10
    .line 11
    iget v0, p0, Luh/b;->a:F

    .line 12
    .line 13
    iget v1, p1, Luh/b;->a:F

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
    iget v0, p0, Luh/b;->b:F

    .line 23
    .line 24
    iget v1, p1, Luh/b;->b:F

    .line 25
    .line 26
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, Luh/b;->c:Luh/a;

    .line 34
    .line 35
    iget-object p1, p1, Luh/b;->c:Luh/a;

    .line 36
    .line 37
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Luh/b;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

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
    iget v2, p0, Luh/b;->b:F

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Leh/a;->d(FII)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Luh/b;->c:Luh/a;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/2addr v1, v0

    .line 23
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Luh/b;->a:F

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
    const-string v2, "Highlight(width="

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
    const-string v0, ", alpha="

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget v0, p0, Luh/b;->b:F

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ", style="

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Luh/b;->c:Luh/a;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, ")"

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
.end method
