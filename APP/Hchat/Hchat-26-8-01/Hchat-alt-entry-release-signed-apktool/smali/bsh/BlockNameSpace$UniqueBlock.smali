.class final Lbsh/BlockNameSpace$UniqueBlock;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/BlockNameSpace;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UniqueBlock"
.end annotation


# instance fields
.field id:I

.field ns:Lbsh/NameSpace;


# direct methods
.method public constructor <init>(Lbsh/NameSpace;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/BlockNameSpace$UniqueBlock;->ns:Lbsh/NameSpace;

    .line 5
    .line 6
    iput p2, p0, Lbsh/BlockNameSpace$UniqueBlock;->id:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lbsh/BlockNameSpace$UniqueBlock;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p1, Lbsh/BlockNameSpace$UniqueBlock;

    .line 11
    .line 12
    iget-object v1, p0, Lbsh/BlockNameSpace$UniqueBlock;->ns:Lbsh/NameSpace;

    .line 13
    .line 14
    iget-object v3, p1, Lbsh/BlockNameSpace$UniqueBlock;->ns:Lbsh/NameSpace;

    .line 15
    .line 16
    if-ne v1, v3, :cond_1

    .line 17
    .line 18
    iget v1, p0, Lbsh/BlockNameSpace$UniqueBlock;->id:I

    .line 19
    .line 20
    iget p1, p1, Lbsh/BlockNameSpace$UniqueBlock;->id:I

    .line 21
    .line 22
    if-ne v1, p1, :cond_1

    .line 23
    .line 24
    return v0

    .line 25
    :cond_1
    return v2
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/BlockNameSpace$UniqueBlock;->ns:Lbsh/NameSpace;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Lbsh/BlockNameSpace$UniqueBlock;->id:I

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    return v1
.end method
