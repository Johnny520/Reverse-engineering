.class public final Lze/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lud/a;

.field public final b:Lud/a;


# direct methods
.method public constructor <init>(Lud/a;Lud/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lze/a;->a:Lud/a;

    .line 5
    .line 6
    iput-object p2, p0, Lze/a;->b:Lud/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
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
    instance-of v1, p1, Lze/a;

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
    check-cast p1, Lze/a;

    .line 12
    .line 13
    iget-object v1, p0, Lze/a;->a:Lud/a;

    .line 14
    .line 15
    iget-object v3, p1, Lze/a;->a:Lud/a;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lze/a;->b:Lud/a;

    .line 24
    .line 25
    iget-object p1, p1, Lze/a;->b:Lud/a;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lud/a;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    return v0

    .line 34
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lze/a;->a:Lud/a;

    .line 2
    .line 3
    iget v0, v0, Lud/a;->i:I

    .line 4
    .line 5
    iget-object v1, p0, Lze/a;->b:Lud/a;

    .line 6
    .line 7
    iget v1, v1, Lud/a;->i:I

    .line 8
    .line 9
    mul-int/lit8 v1, v1, 0x1f

    .line 10
    .line 11
    add-int/2addr v1, v0

    .line 12
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lze/a;->a:Lud/a;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lze/a;->b:Lud/a;

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", "

    .line 14
    .line 15
    const-string v3, ")"

    .line 16
    .line 17
    const-string v4, "("

    .line 18
    .line 19
    invoke-static {v4, v0, v2, v1, v3}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method
