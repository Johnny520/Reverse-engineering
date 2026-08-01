.class Lcom/android/dx/util/ListIntSet$1;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/util/IntIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/util/ListIntSet;->iterator()Lcom/android/dx/util/IntIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field private idx:I

.field final synthetic this$0:Lcom/android/dx/util/ListIntSet;


# direct methods
.method public constructor <init>(Lcom/android/dx/util/ListIntSet;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/util/ListIntSet$1;->this$0:Lcom/android/dx/util/ListIntSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lcom/android/dx/util/ListIntSet$1;->idx:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/util/ListIntSet$1;->idx:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/util/ListIntSet$1;->this$0:Lcom/android/dx/util/ListIntSet;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/util/ListIntSet;->ints:Lcom/android/dx/util/IntList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/android/dx/util/IntList;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-ge v0, p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public next()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/ListIntSet$1;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/android/dx/util/ListIntSet$1;->this$0:Lcom/android/dx/util/ListIntSet;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/android/dx/util/ListIntSet;->ints:Lcom/android/dx/util/IntList;

    .line 10
    .line 11
    iget v1, p0, Lcom/android/dx/util/ListIntSet$1;->idx:I

    .line 12
    .line 13
    add-int/lit8 v2, v1, 0x1

    .line 14
    .line 15
    iput v2, p0, Lcom/android/dx/util/ListIntSet$1;->idx:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

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
