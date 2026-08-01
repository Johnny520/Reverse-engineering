.class public abstract Lcom/android/dx/cf/attrib/BaseLocalVariables;
.super Lcom/android/dx/cf/attrib/BaseAttribute;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final localVariables:Lcom/android/dx/cf/code/LocalVariableList;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/android/dx/cf/code/LocalVariableList;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/attrib/BaseAttribute;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p2}, Lcom/android/dx/util/MutabilityControl;->isMutable()Z

    .line 5
    .line 6
    .line 7
    move-result p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    iput-object p2, p0, Lcom/android/dx/cf/attrib/BaseLocalVariables;->localVariables:Lcom/android/dx/cf/code/LocalVariableList;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_1
    new-instance p0, Lcom/android/dx/util/MutabilityException;

    .line 14
    .line 15
    const-string p1, "localVariables.isMutable()"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/android/dx/util/MutabilityException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 21
    :catch_0
    const-string p0, "localVariables == null"

    .line 22
    .line 23
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    throw p0
.end method


# virtual methods
.method public final byteLength()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/BaseLocalVariables;->localVariables:Lcom/android/dx/cf/code/LocalVariableList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0xa

    .line 8
    .line 9
    add-int/lit8 p0, p0, 0x8

    .line 10
    .line 11
    return p0
.end method

.method public final getLocalVariables()Lcom/android/dx/cf/code/LocalVariableList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/BaseLocalVariables;->localVariables:Lcom/android/dx/cf/code/LocalVariableList;

    .line 2
    .line 3
    return-object p0
.end method
