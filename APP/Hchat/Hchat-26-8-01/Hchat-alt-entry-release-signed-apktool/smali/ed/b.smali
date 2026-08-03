.class public final Led/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lqd/j;

.field public final b:I

.field public c:[Lqd/j;

.field public d:Ljava/util/Map;

.field public e:Ljava/util/List;

.field public final f:I


# direct methods
.method public constructor <init>(IILqd/j;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 5
    .line 6
    iput-object v0, p0, Led/b;->d:Ljava/util/Map;

    .line 7
    .line 8
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 9
    .line 10
    iput-object v0, p0, Led/b;->e:Ljava/util/List;

    .line 11
    .line 12
    iput-object p3, p0, Led/b;->a:Lqd/j;

    .line 13
    .line 14
    iput p1, p0, Led/b;->b:I

    .line 15
    .line 16
    iput p2, p0, Led/b;->f:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const-class v0, Led/b;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Led/b;

    .line 17
    .line 18
    iget-object v0, p0, Led/b;->a:Lqd/j;

    .line 19
    .line 20
    iget-object p1, p1, Led/b;->a:Lqd/j;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Led/b;->a:Lqd/j;

    .line 2
    .line 3
    iget v0, v0, Lqd/j;->a:I

    .line 4
    .line 5
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Led/b;->a:Lqd/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqd/j;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
