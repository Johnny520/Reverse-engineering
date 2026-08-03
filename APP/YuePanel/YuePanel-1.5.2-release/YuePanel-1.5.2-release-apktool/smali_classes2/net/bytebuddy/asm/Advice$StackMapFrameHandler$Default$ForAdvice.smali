.class public Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForAdvice;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ForAdvice"
.end annotation


# instance fields
.field protected final adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field protected final endTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

.field private intermedate:Z

.field private final intermediateTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field protected final startTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

.field protected final translationMode:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;",
            "Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    iput-object p4, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    iput-object p5, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    iput-object p6, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->translationMode:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;

    iput-object p7, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermedate:Z

    return-void
.end method


# virtual methods
.method public injectCompletionFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 14

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    iget-boolean v1, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->expandFrames:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    invoke-static {v2, v3}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, p1, v1, v2, v3}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->injectFullFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;Ljava/util/List;Ljava/util/List;)V

    goto/16 :goto_2

    :cond_0
    iget v0, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    const/4 v1, 0x0

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermedate:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x4

    if-ge v0, v2, :cond_5

    :cond_1
    iget-boolean v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermedate:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    new-array v5, v4, [Ljava/lang/Object;

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/bytebuddy/description/type/TypeDescription;

    add-int/lit8 v3, v1, 0x1

    sget-object v6, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    invoke-virtual {v6, v2}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v5, v1

    move v1, v3

    goto :goto_0

    :cond_3
    sget-object v7, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    array-length v6, v7

    const/4 v3, 0x1

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    :goto_1
    sget-object v13, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    array-length v10, v13

    array-length v12, v13

    const/4 v9, 0x3

    move-object v8, p1

    move-object v11, v13

    invoke-virtual/range {v8 .. v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    iget v0, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    const/4 v2, 0x3

    if-ge v0, v2, :cond_6

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    iget v4, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    sget-object v7, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    array-length v6, v7

    const/4 v3, 0x2

    move-object v2, p1

    move-object v5, v7

    invoke-virtual/range {v2 .. v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    iput v1, p1, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    goto :goto_2

    :cond_6
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    invoke-static {v2, v3}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, p1, v1, v2, v3}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->injectFullFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;Ljava/util/List;Ljava/util/List;)V

    :goto_2
    return-void
.end method

.method public injectExceptionFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 9

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    iget-boolean v1, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->expandFrames:Z

    const-class v2, Ljava/lang/Throwable;

    if-nez v1, :cond_0

    iget v1, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    if-nez v1, :cond_0

    sget-object v6, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    array-length v5, v6

    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v8

    const/4 v4, 0x4

    const/4 v7, 0x1

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v3, v2}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->injectFullFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;Ljava/util/List;Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public injectIntermediateFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/MethodVisitor;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;)V"
        }
    .end annotation

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    iget-boolean v3, v2, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->expandFrames:Z

    if-eqz v3, :cond_0

    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    invoke-static {v4, v5}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, p1, v3, v4, p2}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->injectFullFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;Ljava/util/List;Ljava/util/List;)V

    goto/16 :goto_1

    :cond_0
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermedate:Z

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v2, v3, :cond_2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v5, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    array-length v2, v5

    array-length v4, v5

    const/4 v1, 0x3

    move-object v0, p1

    move-object v3, v5

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    sget-object v3, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    array-length v2, v3

    sget-object v5, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v5, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v1, 0x4

    const/4 v4, 0x1

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    iget v2, v2, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    if-nez v2, :cond_7

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v5, 0x4

    if-ge v2, v5, :cond_7

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v2, v3, :cond_7

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v5, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    array-length v2, v5

    array-length v4, v5

    const/4 v1, 0x3

    move-object v0, p1

    move-object v3, v5

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_4
    sget-object v3, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    array-length v2, v3

    sget-object v5, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v5, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v1, 0x4

    const/4 v4, 0x1

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnet/bytebuddy/description/type/TypeDescription;

    add-int/lit8 v6, v4, 0x1

    sget-object v7, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    invoke-virtual {v7, v5}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    move-result-object v5

    aput-object v5, v3, v4

    move v4, v6

    goto :goto_0

    :cond_6
    sget-object v5, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    array-length v4, v5

    const/4 v1, 0x1

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto :goto_1

    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    iget v2, v2, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    const/4 v3, 0x3

    if-ge v2, v3, :cond_8

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    iget v2, v1, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    sget-object v5, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    array-length v4, v5

    const/4 v1, 0x2

    move-object v0, p1

    move-object v3, v5

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto :goto_1

    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    invoke-static {v4, v5}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, p1, v3, v4, p2}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->injectFullFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;Ljava/util/List;Ljava/util/List;)V

    :goto_1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermediateTypes:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->endTypes:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->intermedate:Z

    return-void
.end method

.method public injectReturnFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 13

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    iget-boolean v1, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->expandFrames:Z

    if-nez v1, :cond_1

    iget v1, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->currentFrameDivergence:I

    if-nez v1, :cond_1

    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v0

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v6, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    array-length v3, v6

    array-length v5, v6

    const/4 v2, 0x3

    move-object v1, p1

    move-object v4, v6

    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    sget-object v10, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->EMPTY:[Ljava/lang/Object;

    array-length v9, v10

    sget-object v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v1}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v12

    const/4 v8, 0x4

    const/4 v11, 0x1

    move-object v7, p1

    invoke-virtual/range {v7 .. v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFrame(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->initialization:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v3

    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-interface {v3, v4}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    invoke-interface {v3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v3

    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    :goto_0
    invoke-virtual {v0, p1, v1, v2, v3}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->injectFullFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;Ljava/util/List;Ljava/util/List;)V

    :goto_1
    return-void
.end method

.method public translateFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;II[Ljava/lang/Object;I[Ljava/lang/Object;)V
    .locals 11
    .param p4    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # [Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    move-object v0, p0

    iget-object v1, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;

    iget-object v3, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->translationMode:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;

    iget-object v4, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->adviceMethod:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    iget-object v5, v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$ForAdvice;->startTypes:Ljava/util/List;

    move-object v2, p1

    move v6, p2

    move v7, p3

    move-object v8, p4

    move/from16 v9, p5

    move-object/from16 v10, p6

    invoke-virtual/range {v1 .. v10}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;->translateFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$TranslationMode;Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    return-void
.end method
