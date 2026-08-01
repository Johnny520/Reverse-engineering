.class public abstract Lcom/android/dx/io/instructions/BaseCodeCursor;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/io/instructions/CodeCursor;


# instance fields
.field private final baseAddressMap:Lcom/android/dx/io/instructions/AddressMap;

.field private cursor:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/android/dx/io/instructions/AddressMap;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/io/instructions/AddressMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/io/instructions/BaseCodeCursor;->baseAddressMap:Lcom/android/dx/io/instructions/AddressMap;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/android/dx/io/instructions/BaseCodeCursor;->cursor:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final advance(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/io/instructions/BaseCodeCursor;->cursor:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iput v0, p0, Lcom/android/dx/io/instructions/BaseCodeCursor;->cursor:I

    .line 5
    .line 6
    return-void
.end method

.method public final baseAddressForCursor()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/io/instructions/BaseCodeCursor;->baseAddressMap:Lcom/android/dx/io/instructions/AddressMap;

    .line 2
    .line 3
    iget v1, p0, Lcom/android/dx/io/instructions/BaseCodeCursor;->cursor:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/android/dx/io/instructions/AddressMap;->get(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    iget p0, p0, Lcom/android/dx/io/instructions/BaseCodeCursor;->cursor:I

    .line 13
    .line 14
    return p0
.end method

.method public final cursor()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/BaseCodeCursor;->cursor:I

    .line 2
    .line 3
    return p0
.end method

.method public final setBaseAddress(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/instructions/BaseCodeCursor;->baseAddressMap:Lcom/android/dx/io/instructions/AddressMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/io/instructions/AddressMap;->put(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
