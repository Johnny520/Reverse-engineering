.class public final Leq;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:I


# direct methods
.method public constructor <init>(ILjava/lang/String;ILjava/lang/String;I)V
    .locals 2

    const-wide v0, -0x2e013fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x2e019fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Leq;->a:I

    iput-object p2, p0, Leq;->b:Ljava/lang/String;

    iput p3, p0, Leq;->c:I

    iput-object p4, p0, Leq;->d:Ljava/lang/String;

    iput p5, p0, Leq;->e:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Leq;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Leq;

    iget v0, p0, Leq;->a:I

    iget v1, p1, Leq;->a:I

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Leq;->b:Ljava/lang/String;

    iget-object v1, p1, Leq;->b:Ljava/lang/String;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget v0, p0, Leq;->c:I

    iget v1, p1, Leq;->c:I

    if-eq v0, v1, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Leq;->d:Ljava/lang/String;

    iget-object v1, p1, Leq;->d:Ljava/lang/String;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget v0, p0, Leq;->e:I

    iget p1, p1, Leq;->e:I

    if-eq v0, p1, :cond_6

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Leq;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Leq;->b:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget v2, p0, Leq;->c:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget-object v2, p0, Leq;->d:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget v1, p0, Leq;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x2e037fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Leq;->a:I

    const-wide v2, -0x2e0c4fffff835L

    invoke-static {v0, v1, v2, v3}, LEy;->p(Ljava/lang/StringBuilder;IJ)V

    iget-object v1, p0, Leq;->b:Ljava/lang/String;

    const-wide v2, -0x2e0cdfffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget v1, p0, Leq;->c:I

    const-wide v2, -0x2e0dafffff835L

    invoke-static {v0, v1, v2, v3}, LEy;->p(Ljava/lang/StringBuilder;IJ)V

    iget-object v1, p0, Leq;->d:Ljava/lang/String;

    const-wide v2, -0x2e0e9fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget v1, p0, Leq;->e:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, LEy;->f(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
