.class public final Lnd/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnd/q;->a:I

    .line 5
    .line 6
    iput p2, p0, Lnd/q;->b:I

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
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    const-class v2, Lnd/q;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    if-eq v2, v3, :cond_2

    .line 16
    .line 17
    return v1

    .line 18
    :cond_2
    check-cast p1, Lnd/q;

    .line 19
    .line 20
    iget v2, p0, Lnd/q;->b:I

    .line 21
    .line 22
    iget v3, p1, Lnd/q;->b:I

    .line 23
    .line 24
    if-ne v2, v3, :cond_3

    .line 25
    .line 26
    iget v2, p0, Lnd/q;->a:I

    .line 27
    .line 28
    iget p1, p1, Lnd/q;->a:I

    .line 29
    .line 30
    if-ne v2, p1, :cond_3

    .line 31
    .line 32
    return v0

    .line 33
    :cond_3
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lnd/q;->b:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget v1, p0, Lnd/q;->a:I

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lnd/q;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Lxe/m;->d(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lnd/q;->b:I

    .line 8
    .line 9
    invoke-static {v1}, Lxe/m;->d(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "JUMP: "

    .line 14
    .line 15
    const-string v3, " -> "

    .line 16
    .line 17
    invoke-static {v2, v0, v3, v1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method
