.class public final Lcom/android/dx/cf/attrib/RawAttribute;
.super Lcom/android/dx/cf/attrib/BaseAttribute;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final data:Lcom/android/dx/util/ByteArray;

.field private final pool:Lcom/android/dx/rop/cst/ConstantPool;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/android/dx/util/ByteArray;IILcom/android/dx/rop/cst/ConstantPool;)V
    .locals 0

    add-int/2addr p4, p3

    .line 18
    invoke-virtual {p2, p3, p4}, Lcom/android/dx/util/ByteArray;->slice(II)Lcom/android/dx/util/ByteArray;

    move-result-object p2

    invoke-direct {p0, p1, p2, p5}, Lcom/android/dx/cf/attrib/RawAttribute;-><init>(Ljava/lang/String;Lcom/android/dx/util/ByteArray;Lcom/android/dx/rop/cst/ConstantPool;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/android/dx/util/ByteArray;Lcom/android/dx/rop/cst/ConstantPool;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/attrib/BaseAttribute;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/cf/attrib/RawAttribute;->data:Lcom/android/dx/util/ByteArray;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/dx/cf/attrib/RawAttribute;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "data == null"

    .line 12
    .line 13
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method


# virtual methods
.method public byteLength()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/RawAttribute;->data:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/util/ByteArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    add-int/lit8 p0, p0, 0x6

    .line 8
    .line 9
    return p0
.end method

.method public getData()Lcom/android/dx/util/ByteArray;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/RawAttribute;->data:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPool()Lcom/android/dx/rop/cst/ConstantPool;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/RawAttribute;->pool:Lcom/android/dx/rop/cst/ConstantPool;

    .line 2
    .line 3
    return-object p0
.end method
