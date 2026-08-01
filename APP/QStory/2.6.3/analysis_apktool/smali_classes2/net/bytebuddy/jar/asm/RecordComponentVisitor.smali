.class public abstract Lnet/bytebuddy/jar/asm/RecordComponentVisitor;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field protected final api:I

.field protected delegate:Lnet/bytebuddy/jar/asm/RecordComponentVisitor;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;-><init>(ILnet/bytebuddy/jar/asm/RecordComponentVisitor;)V

    return-void
.end method

.method public constructor <init>(ILnet/bytebuddy/jar/asm/RecordComponentVisitor;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x90000

    .line 5
    .line 6
    const/high16 v1, 0x10a0000

    .line 7
    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    const/high16 v0, 0x80000

    .line 11
    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    const/high16 v0, 0x70000

    .line 15
    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    const/high16 v0, 0x60000

    .line 19
    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    const/high16 v0, 0x50000

    .line 23
    .line 24
    if-eq p1, v0, :cond_1

    .line 25
    .line 26
    const/high16 v0, 0x40000

    .line 27
    .line 28
    if-eq p1, v0, :cond_1

    .line 29
    .line 30
    if-ne p1, v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {p1}, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->stringConcat$0(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    throw p0

    .line 42
    :cond_1
    :goto_0
    if-ne p1, v1, :cond_2

    .line 43
    .line 44
    invoke-static {p0}, Lnet/bytebuddy/jar/asm/Constants;->checkAsmExperimental(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iput p1, p0, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->api:I

    .line 48
    .line 49
    iput-object p2, p0, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->delegate:Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 50
    .line 51
    return-void
.end method

.method private static synthetic stringConcat$0(I)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Unsupported api "

    .line 2
    .line 3
    invoke-static {p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public getDelegate()Lnet/bytebuddy/jar/asm/RecordComponentVisitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->delegate:Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 2
    .line 3
    return-object p0
.end method

.method public visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->delegate:Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->delegate:Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->visitAttribute(Lnet/bytebuddy/jar/asm/Attribute;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitEnd()V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->delegate:Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->visitEnd()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->delegate:Lnet/bytebuddy/jar/asm/RecordComponentVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/RecordComponentVisitor;->visitTypeAnnotation(ILnet/bytebuddy/jar/asm/TypePath;Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method
