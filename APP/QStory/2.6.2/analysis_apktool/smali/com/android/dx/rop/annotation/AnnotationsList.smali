.class public final Lcom/android/dx/rop/annotation/AnnotationsList;
.super Lcom/android/dx/util/FixedSizeList;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final EMPTY:Lcom/android/dx/rop/annotation/AnnotationsList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/android/dx/rop/annotation/AnnotationsList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/android/dx/rop/annotation/AnnotationsList;->EMPTY:Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/util/FixedSizeList;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static combine(Lcom/android/dx/rop/annotation/AnnotationsList;Lcom/android/dx/rop/annotation/AnnotationsList;)Lcom/android/dx/rop/annotation/AnnotationsList;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    new-instance v1, Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lcom/android/dx/rop/annotation/AnnotationsList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    if-ge v2, v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lcom/android/dx/rop/annotation/AnnotationsList;->get(I)Lcom/android/dx/rop/annotation/Annotations;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {p1, v2}, Lcom/android/dx/rop/annotation/AnnotationsList;->get(I)Lcom/android/dx/rop/annotation/Annotations;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {v3, v4}, Lcom/android/dx/rop/annotation/Annotations;->combine(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/rop/annotation/Annotations;)Lcom/android/dx/rop/annotation/Annotations;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v1, v2, v3}, Lcom/android/dx/rop/annotation/AnnotationsList;->set(ILcom/android/dx/rop/annotation/Annotations;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_1
    const-string p0, "list1.size() != list2.size()"

    .line 42
    .line 43
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method


# virtual methods
.method public get(I)Lcom/android/dx/rop/annotation/Annotations;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/rop/annotation/Annotations;

    .line 6
    .line 7
    return-object p0
.end method

.method public set(ILcom/android/dx/rop/annotation/Annotations;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Lcom/android/dx/util/MutabilityControl;->throwIfMutable()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
