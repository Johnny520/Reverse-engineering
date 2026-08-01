.class public abstract Lcom/android/dx/rop/cst/CstLiteral64;
.super Lcom/android/dx/rop/cst/CstLiteralBits;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final bits:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/rop/cst/CstLiteralBits;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lcom/android/dx/rop/cst/CstLiteral64;->bits:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public compareTo0(Lcom/android/dx/rop/cst/Constant;)I
    .locals 3

    .line 1
    check-cast p1, Lcom/android/dx/rop/cst/CstLiteral64;

    .line 2
    .line 3
    iget-wide v0, p1, Lcom/android/dx/rop/cst/CstLiteral64;->bits:J

    .line 4
    .line 5
    iget-wide p0, p0, Lcom/android/dx/rop/cst/CstLiteral64;->bits:J

    .line 6
    .line 7
    cmp-long v2, p0, v0

    .line 8
    .line 9
    if-gez v2, :cond_0

    .line 10
    .line 11
    const/4 p0, -0x1

    .line 12
    return p0

    .line 13
    :cond_0
    cmp-long p0, p0, v0

    .line 14
    .line 15
    if-lez p0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lcom/android/dx/rop/cst/CstLiteral64;->bits:J

    .line 14
    .line 15
    check-cast p1, Lcom/android/dx/rop/cst/CstLiteral64;

    .line 16
    .line 17
    iget-wide p0, p1, Lcom/android/dx/rop/cst/CstLiteral64;->bits:J

    .line 18
    .line 19
    cmp-long p0, v0, p0

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final fitsInInt()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/android/dx/rop/cst/CstLiteral64;->bits:J

    .line 2
    .line 3
    long-to-int p0, v0

    .line 4
    int-to-long v2, p0

    .line 5
    cmp-long p0, v2, v0

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final getIntBits()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/android/dx/rop/cst/CstLiteral64;->bits:J

    .line 2
    .line 3
    long-to-int p0, v0

    .line 4
    return p0
.end method

.method public final getLongBits()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/android/dx/rop/cst/CstLiteral64;->bits:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, Lcom/android/dx/rop/cst/CstLiteral64;->bits:J

    .line 2
    .line 3
    long-to-int p0, v0

    .line 4
    const/16 v2, 0x20

    .line 5
    .line 6
    shr-long/2addr v0, v2

    .line 7
    long-to-int v0, v0

    .line 8
    xor-int/2addr p0, v0

    .line 9
    return p0
.end method

.method public final isCategory2()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
