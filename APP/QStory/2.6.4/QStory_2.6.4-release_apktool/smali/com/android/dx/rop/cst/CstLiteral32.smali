.class public abstract Lcom/android/dx/rop/cst/CstLiteral32;
.super Lcom/android/dx/rop/cst/CstLiteralBits;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final bits:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/rop/cst/CstLiteralBits;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public compareTo0(Lcom/android/dx/rop/cst/Constant;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/android/dx/rop/cst/CstLiteral32;

    .line 2
    .line 3
    iget p1, p1, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    .line 4
    .line 5
    iget p0, p0, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    .line 6
    .line 7
    if-ge p0, p1, :cond_0

    .line 8
    .line 9
    const/4 p0, -0x1

    .line 10
    return p0

    .line 11
    :cond_0
    if-le p0, p1, :cond_1

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_1
    const/4 p0, 0x0

    .line 16
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
    iget p0, p0, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    .line 14
    .line 15
    check-cast p1, Lcom/android/dx/rop/cst/CstLiteral32;

    .line 16
    .line 17
    iget p1, p1, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final fitsInInt()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final getIntBits()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    .line 2
    .line 3
    return p0
.end method

.method public final getLongBits()J
    .locals 2

    .line 1
    iget p0, p0, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    .line 2
    .line 3
    int-to-long v0, p0

    .line 4
    return-wide v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/cst/CstLiteral32;->bits:I

    .line 2
    .line 3
    return p0
.end method

.method public final isCategory2()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
