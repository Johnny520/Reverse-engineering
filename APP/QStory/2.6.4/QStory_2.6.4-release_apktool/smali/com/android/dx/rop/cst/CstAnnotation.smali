.class public final Lcom/android/dx/rop/cst/CstAnnotation;
.super Lcom/android/dx/rop/cst/Constant;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final annotation:Lcom/android/dx/rop/annotation/Annotation;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/annotation/Annotation;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/rop/cst/Constant;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/android/dx/util/MutabilityControl;->throwIfMutable()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstAnnotation;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p0, "annotation == null"

    .line 13
    .line 14
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    throw p0
.end method


# virtual methods
.method public compareTo0(Lcom/android/dx/rop/cst/Constant;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstAnnotation;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 2
    .line 3
    check-cast p1, Lcom/android/dx/rop/cst/CstAnnotation;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/android/dx/rop/cst/CstAnnotation;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/annotation/Annotation;->compareTo(Lcom/android/dx/rop/annotation/Annotation;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/android/dx/rop/cst/CstAnnotation;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstAnnotation;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 8
    .line 9
    check-cast p1, Lcom/android/dx/rop/cst/CstAnnotation;

    .line 10
    .line 11
    iget-object p1, p1, Lcom/android/dx/rop/cst/CstAnnotation;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/annotation/Annotation;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public getAnnotation()Lcom/android/dx/rop/annotation/Annotation;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstAnnotation;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstAnnotation;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/annotation/Annotation;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isCategory2()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstAnnotation;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/annotation/Annotation;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstAnnotation;->annotation:Lcom/android/dx/rop/annotation/Annotation;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/annotation/Annotation;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public typeName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "annotation"

    .line 2
    .line 3
    return-object p0
.end method
