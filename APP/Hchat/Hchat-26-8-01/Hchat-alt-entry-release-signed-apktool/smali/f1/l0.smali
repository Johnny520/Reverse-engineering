.class public final Lf1/l0;
.super Lf1/c0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final f:Le1/d;

.field public final g:Lf1/j;


# direct methods
.method public constructor <init>(Le1/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf1/l0;->f:Le1/d;

    .line 5
    .line 6
    invoke-static {p1}, Lbe/h;->D(Le1/d;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lf1/l;->a()Lf1/j;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0, p1}, Lf1/j;->c(Lf1/j;Le1/d;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    iput-object v0, p0, Lf1/l0;->g:Lf1/j;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lf1/l0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lf1/l0;

    .line 10
    .line 11
    iget-object p1, p1, Lf1/l0;->f:Le1/d;

    .line 12
    .line 13
    iget-object v0, p0, Lf1/l0;->f:Le1/d;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Le1/d;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_2

    .line 20
    .line 21
    :goto_0
    const/4 p1, 0x0

    .line 22
    return p1

    .line 23
    :cond_2
    :goto_1
    const/4 p1, 0x1

    .line 24
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf1/l0;->f:Le1/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Le1/d;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final k()Le1/c;
    .locals 5

    .line 1
    new-instance v0, Le1/c;

    .line 2
    .line 3
    iget-object v1, p0, Lf1/l0;->f:Le1/d;

    .line 4
    .line 5
    iget v2, v1, Le1/d;->a:F

    .line 6
    .line 7
    iget v3, v1, Le1/d;->b:F

    .line 8
    .line 9
    iget v4, v1, Le1/d;->c:F

    .line 10
    .line 11
    iget v1, v1, Le1/d;->d:F

    .line 12
    .line 13
    invoke-direct {v0, v2, v3, v4, v1}, Le1/c;-><init>(FFFF)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
