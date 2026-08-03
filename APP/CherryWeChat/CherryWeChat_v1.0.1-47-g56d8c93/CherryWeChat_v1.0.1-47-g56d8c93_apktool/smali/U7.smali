.class public final LU7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:I

.field public final f:J


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;IIJ)V
    .locals 2

    const-wide v0, -0x1c74bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1c751fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU7;->a:Ljava/lang/String;

    iput p2, p0, LU7;->b:I

    iput-object p3, p0, LU7;->c:Ljava/lang/String;

    iput p4, p0, LU7;->d:I

    iput p5, p0, LU7;->e:I

    iput-wide p6, p0, LU7;->f:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, LU7;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LU7;

    iget-object v0, p0, LU7;->a:Ljava/lang/String;

    iget-object v1, p1, LU7;->a:Ljava/lang/String;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget v0, p0, LU7;->b:I

    iget v1, p1, LU7;->b:I

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, LU7;->c:Ljava/lang/String;

    iget-object v1, p1, LU7;->c:Ljava/lang/String;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget v0, p0, LU7;->d:I

    iget v1, p1, LU7;->d:I

    if-eq v0, v1, :cond_5

    goto :goto_0

    :cond_5
    iget v0, p0, LU7;->e:I

    iget v1, p1, LU7;->e:I

    if-eq v0, v1, :cond_6

    goto :goto_0

    :cond_6
    iget-wide v0, p0, LU7;->f:J

    iget-wide v2, p1, LU7;->f:J

    cmp-long p1, v0, v2

    if-eqz p1, :cond_7

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_7
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, LU7;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, LU7;->b:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget-object v2, p0, LU7;->c:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget v2, p0, LU7;->d:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget v2, p0, LU7;->e:I

    invoke-static {v2, v0, v1}, LEy;->a(III)I

    move-result v0

    iget-wide v1, p0, LU7;->f:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x1c773fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LU7;->a:Ljava/lang/String;

    const-wide v2, -0x1c707fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget v1, p0, LU7;->b:I

    const-wide v2, -0x1c711fffff835L

    invoke-static {v0, v1, v2, v3}, LEy;->p(Ljava/lang/StringBuilder;IJ)V

    iget-object v1, p0, LU7;->c:Ljava/lang/String;

    const-wide v2, -0x1c722fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget v1, p0, LU7;->d:I

    const-wide v2, -0x1c728fffff835L

    invoke-static {v0, v1, v2, v3}, LEy;->p(Ljava/lang/StringBuilder;IJ)V

    iget v1, p0, LU7;->e:I

    const-wide v2, -0x1c731fffff835L

    invoke-static {v0, v1, v2, v3}, LEy;->p(Ljava/lang/StringBuilder;IJ)V

    iget-wide v1, p0, LU7;->f:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
