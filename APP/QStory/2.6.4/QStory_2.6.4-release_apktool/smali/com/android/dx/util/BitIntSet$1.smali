.class Lcom/android/dx/util/BitIntSet$1;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/android/dx/util/IntIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/util/BitIntSet;->iterator()Lcom/android/dx/util/IntIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private idx:I

.field final synthetic this$0:Lcom/android/dx/util/BitIntSet;


# direct methods
.method public constructor <init>(Lcom/android/dx/util/BitIntSet;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/android/dx/util/BitIntSet$1;->this$0:Lcom/android/dx/util/BitIntSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lcom/android/dx/util/BitIntSet;->bits:[I

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p1, v0}, Lcom/android/dx/util/Bits;->findFirst([II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iput p1, p0, Lcom/android/dx/util/BitIntSet$1;->idx:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/util/BitIntSet$1;->idx:I

    .line 2
    .line 3
    if-ltz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public next()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/BitIntSet$1;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lcom/android/dx/util/BitIntSet$1;->idx:I

    .line 8
    .line 9
    iget-object v1, p0, Lcom/android/dx/util/BitIntSet$1;->this$0:Lcom/android/dx/util/BitIntSet;

    .line 10
    .line 11
    iget-object v1, v1, Lcom/android/dx/util/BitIntSet;->bits:[I

    .line 12
    .line 13
    add-int/lit8 v2, v0, 0x1

    .line 14
    .line 15
    invoke-static {v1, v2}, Lcom/android/dx/util/Bits;->findFirst([II)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iput v1, p0, Lcom/android/dx/util/BitIntSet$1;->idx:I

    .line 20
    .line 21
    return v0

    .line 22
    :cond_0
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return p0
.end method
