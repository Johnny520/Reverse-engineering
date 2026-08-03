.class public final Lci/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk/y0;


# instance fields
.field public final a:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lci/l;->a:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ln/k;)Lx1/i;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lci/k;

    .line 5
    .line 6
    iget-wide v1, p0, Lci/l;->a:J

    .line 7
    .line 8
    invoke-direct {v0, p1, v1, v2}, Lci/k;-><init>(Ln/k;J)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lci/l;

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
    check-cast p1, Lci/l;

    .line 12
    .line 13
    iget-wide v3, p1, Lci/l;->a:J

    .line 14
    .line 15
    iget-wide v5, p0, Lci/l;->a:J

    .line 16
    .line 17
    invoke-static {v5, v6, v3, v4}, Lf1/w;->c(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    sget v0, Lf1/w;->h:I

    .line 2
    .line 3
    iget-wide v0, p0, Lci/l;->a:J

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method
