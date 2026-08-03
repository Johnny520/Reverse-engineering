.class Lbsh/BshArray$SteppedSubList$1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/ListIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbsh/BshArray$SteppedSubList;->listIterator(I)Ljava/util/ListIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/ListIterator<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field lastIndex:I

.field final synthetic this$0:Lbsh/BshArray$SteppedSubList;

.field final synthetic val$sliceIter:Ljava/util/ListIterator;


# direct methods
.method public constructor <init>(Lbsh/BshArray$SteppedSubList;Ljava/util/ListIterator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lbsh/BshArray$SteppedSubList$1;->this$0:Lbsh/BshArray$SteppedSubList;

    .line 2
    .line 3
    iput-object p2, p0, Lbsh/BshArray$SteppedSubList$1;->val$sliceIter:Ljava/util/ListIterator;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lbsh/BshArray$SteppedSubList$1;->lastIndex:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/BshArray$SteppedSubList$1;->this$0:Lbsh/BshArray$SteppedSubList;

    .line 2
    .line 3
    iget v1, p0, Lbsh/BshArray$SteppedSubList$1;->lastIndex:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lbsh/BshArray$SteppedSubList;->add(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lbsh/BshArray$SteppedSubList$1;->val$sliceIter:Ljava/util/ListIterator;

    .line 9
    .line 10
    iget-object v0, p0, Lbsh/BshArray$SteppedSubList$1;->this$0:Lbsh/BshArray$SteppedSubList;

    .line 11
    .line 12
    invoke-static {v0}, Lbsh/BshArray$SteppedSubList;->a(Lbsh/BshArray$SteppedSubList;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget v1, p0, Lbsh/BshArray$SteppedSubList$1;->lastIndex:I

    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-interface {p1, v0}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, -0x1

    .line 28
    iput p1, p0, Lbsh/BshArray$SteppedSubList$1;->lastIndex:I

    .line 29
    .line 30
    return-void
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshArray$SteppedSubList$1;->val$sliceIter:Ljava/util/ListIterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public hasPrevious()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshArray$SteppedSubList$1;->val$sliceIter:Ljava/util/ListIterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/BshArray$SteppedSubList$1;->val$sliceIter:Ljava/util/ListIterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lbsh/BshArray$SteppedSubList$1;->previousIndex()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lbsh/BshArray$SteppedSubList$1;->lastIndex:I

    .line 11
    .line 12
    iget-object v1, p0, Lbsh/BshArray$SteppedSubList$1;->this$0:Lbsh/BshArray$SteppedSubList;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lbsh/BshArray$SteppedSubList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public nextIndex()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshArray$SteppedSubList$1;->val$sliceIter:Ljava/util/ListIterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/BshArray$SteppedSubList$1;->val$sliceIter:Ljava/util/ListIterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lbsh/BshArray$SteppedSubList$1;->nextIndex()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lbsh/BshArray$SteppedSubList$1;->lastIndex:I

    .line 11
    .line 12
    iget-object v1, p0, Lbsh/BshArray$SteppedSubList$1;->this$0:Lbsh/BshArray$SteppedSubList;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Lbsh/BshArray$SteppedSubList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public previousIndex()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/BshArray$SteppedSubList$1;->val$sliceIter:Ljava/util/ListIterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public remove()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/BshArray$SteppedSubList$1;->this$0:Lbsh/BshArray$SteppedSubList;

    .line 2
    .line 3
    iget v1, p0, Lbsh/BshArray$SteppedSubList$1;->lastIndex:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lbsh/BshArray$SteppedSubList;->remove(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lbsh/BshArray$SteppedSubList$1;->val$sliceIter:Ljava/util/ListIterator;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    .line 11
    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    iput v0, p0, Lbsh/BshArray$SteppedSubList$1;->lastIndex:I

    .line 15
    .line 16
    return-void
.end method

.method public set(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/BshArray$SteppedSubList$1;->this$0:Lbsh/BshArray$SteppedSubList;

    .line 2
    .line 3
    iget v1, p0, Lbsh/BshArray$SteppedSubList$1;->lastIndex:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lbsh/BshArray$SteppedSubList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method
