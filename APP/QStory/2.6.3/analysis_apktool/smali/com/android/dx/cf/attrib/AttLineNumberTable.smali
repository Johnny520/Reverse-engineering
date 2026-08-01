.class public final Lcom/android/dx/cf/attrib/AttLineNumberTable;
.super Lcom/android/dx/cf/attrib/BaseAttribute;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final ATTRIBUTE_NAME:Ljava/lang/String; = "LineNumberTable"


# instance fields
.field private final lineNumbers:Lcom/android/dx/cf/code/LineNumberList;


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/code/LineNumberList;)V
    .locals 1

    .line 1
    const-string v0, "LineNumberTable"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/android/dx/cf/attrib/BaseAttribute;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p1}, Lcom/android/dx/util/MutabilityControl;->isMutable()Z

    .line 7
    .line 8
    .line 9
    move-result v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lcom/android/dx/cf/attrib/AttLineNumberTable;->lineNumbers:Lcom/android/dx/cf/code/LineNumberList;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    :try_start_1
    new-instance p0, Lcom/android/dx/util/MutabilityException;

    .line 16
    .line 17
    const-string p1, "lineNumbers.isMutable()"

    .line 18
    .line 19
    invoke-direct {p0, p1}, Lcom/android/dx/util/MutabilityException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p0
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 23
    :catch_0
    const-string p0, "lineNumbers == null"

    .line 24
    .line 25
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method


# virtual methods
.method public byteLength()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/AttLineNumberTable;->lineNumbers:Lcom/android/dx/cf/code/LineNumberList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x4

    .line 8
    .line 9
    add-int/lit8 p0, p0, 0x8

    .line 10
    .line 11
    return p0
.end method

.method public getLineNumbers()Lcom/android/dx/cf/code/LineNumberList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/AttLineNumberTable;->lineNumbers:Lcom/android/dx/cf/code/LineNumberList;

    .line 2
    .line 3
    return-object p0
.end method
