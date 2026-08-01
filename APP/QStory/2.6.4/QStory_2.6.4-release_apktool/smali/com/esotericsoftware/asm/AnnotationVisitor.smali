.class public abstract Lcom/esotericsoftware/asm/AnnotationVisitor;
.super Ljava/lang/Object;


# instance fields
.field protected final api:I

.field protected av:Lcom/esotericsoftware/asm/AnnotationVisitor;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 23
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/asm/AnnotationVisitor;-><init>(ILcom/esotericsoftware/asm/AnnotationVisitor;)V

    return-void
.end method

.method public constructor <init>(ILcom/esotericsoftware/asm/AnnotationVisitor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x40000

    .line 5
    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/high16 v0, 0x50000

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0

    .line 18
    :cond_1
    :goto_0
    iput p1, p0, Lcom/esotericsoftware/asm/AnnotationVisitor;->api:I

    .line 19
    .line 20
    iput-object p2, p0, Lcom/esotericsoftware/asm/AnnotationVisitor;->av:Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public visit(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/AnnotationVisitor;->av:Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitAnnotation(Ljava/lang/String;Ljava/lang/String;)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/AnnotationVisitor;->av:Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visitAnnotation(Ljava/lang/String;Ljava/lang/String;)Lcom/esotericsoftware/asm/AnnotationVisitor;

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

.method public visitArray(Ljava/lang/String;)Lcom/esotericsoftware/asm/AnnotationVisitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/AnnotationVisitor;->av:Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visitArray(Ljava/lang/String;)Lcom/esotericsoftware/asm/AnnotationVisitor;

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

.method public visitEnd()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/AnnotationVisitor;->av:Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visitEnd()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitEnum(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/asm/AnnotationVisitor;->av:Lcom/esotericsoftware/asm/AnnotationVisitor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/asm/AnnotationVisitor;->visitEnum(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
