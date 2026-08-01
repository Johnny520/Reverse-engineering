.class public Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/attribute/AnnotationAppender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForTypeAnnotations"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
        "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
        ">;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final COMPONENT_TYPE_PATH:C = '['

.field private static final EMPTY_TYPE_PATH:Ljava/lang/String; = ""

.field private static final INDEXED_TYPE_DELIMITER:C = ';'

.field private static final INNER_CLASS_PATH:C = '.'

.field private static final SUPER_CLASS_INDEX:I = -0x1

.field public static final VARIABLE_ON_INVOKEABLE:Z = false

.field public static final VARIABLE_ON_TYPE:Z = true

.field private static final WILDCARD_TYPE_PATH:C = '*'


# instance fields
.field private final annotationAppender:Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

.field private final annotationValueFilter:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

.field private final typePath:Ljava/lang/String;

.field private final typeReference:I


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationAppender:Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationValueFilter:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 7
    .line 8
    iput p3, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typeReference:I

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typePath:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;Lnet/bytebuddy/jar/asm/TypeReference;)V
    .locals 1

    .line 13
    invoke-virtual {p3}, Lnet/bytebuddy/jar/asm/TypeReference;->getValue()I

    move-result p3

    const-string v0, ""

    invoke-direct {p0, p1, p2, p3, v0}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ILjava/lang/String;)V

    return-void
.end method

.method private apply(Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/lang/String;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationAppender:Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 2
    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 22
    .line 23
    iget-object v2, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationValueFilter:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 24
    .line 25
    iget v3, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typeReference:I

    .line 26
    .line 27
    invoke-interface {v0, v1, v2, v3, p2}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender;->append(Lnet/bytebuddy/description/annotation/AnnotationDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ILjava/lang/String;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-object v0
.end method

.method public static ofExceptionType(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;I)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;",
            "I)",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;

    .line 2
    .line 3
    invoke-static {p2}, Lnet/bytebuddy/jar/asm/TypeReference;->newExceptionReference(I)Lnet/bytebuddy/jar/asm/TypeReference;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-direct {v0, p0, p1, p2}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;Lnet/bytebuddy/jar/asm/TypeReference;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static ofFieldType(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;",
            ")",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-static {v1}, Lnet/bytebuddy/jar/asm/TypeReference;->newTypeReference(I)Lnet/bytebuddy/jar/asm/TypeReference;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;Lnet/bytebuddy/jar/asm/TypeReference;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static ofInterfaceType(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;I)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;",
            "I)",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;

    .line 2
    .line 3
    invoke-static {p2}, Lnet/bytebuddy/jar/asm/TypeReference;->newSuperTypeReference(I)Lnet/bytebuddy/jar/asm/TypeReference;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-direct {v0, p0, p1, p2}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;Lnet/bytebuddy/jar/asm/TypeReference;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static ofMethodParameterType(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;I)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;",
            "I)",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;

    .line 2
    .line 3
    invoke-static {p2}, Lnet/bytebuddy/jar/asm/TypeReference;->newFormalParameterReference(I)Lnet/bytebuddy/jar/asm/TypeReference;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-direct {v0, p0, p1, p2}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;Lnet/bytebuddy/jar/asm/TypeReference;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static ofMethodReturnType(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;",
            ")",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-static {v1}, Lnet/bytebuddy/jar/asm/TypeReference;->newTypeReference(I)Lnet/bytebuddy/jar/asm/TypeReference;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;Lnet/bytebuddy/jar/asm/TypeReference;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static ofReceiverType(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;",
            ")",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-static {v1}, Lnet/bytebuddy/jar/asm/TypeReference;->newTypeReference(I)Lnet/bytebuddy/jar/asm/TypeReference;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;Lnet/bytebuddy/jar/asm/TypeReference;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static ofSuperClass(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;",
            ")",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-static {v1}, Lnet/bytebuddy/jar/asm/TypeReference;->newSuperTypeReference(I)Lnet/bytebuddy/jar/asm/TypeReference;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-direct {v0, p0, p1, v1}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;Lnet/bytebuddy/jar/asm/TypeReference;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static ofTypeVariable(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ZILjava/util/List;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;",
            "ZI",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/16 p2, 0x11

    .line 6
    .line 7
    move v2, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 p2, 0x12

    .line 10
    .line 11
    move v2, v0

    .line 12
    :goto_0
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-interface {p4, p3, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p4

    .line 20
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p4

    .line 24
    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_4

    .line 29
    .line 30
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 35
    .line 36
    invoke-static {v2, p3}, Lnet/bytebuddy/jar/asm/TypeReference;->newTypeParameterReference(II)Lnet/bytebuddy/jar/asm/TypeReference;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v4}, Lnet/bytebuddy/jar/asm/TypeReference;->getValue()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-interface {v3}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    check-cast v6, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 63
    .line 64
    const-string v7, ""

    .line 65
    .line 66
    invoke-interface {p0, v6, p1, v4, v7}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender;->append(Lnet/bytebuddy/description/annotation/AnnotationDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ILjava/lang/String;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getUpperBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 80
    .line 81
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDefinition;->getSort()Lnet/bytebuddy/description/type/TypeDefinition$Sort;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v4}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->isTypeVariable()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-nez v4, :cond_2

    .line 90
    .line 91
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getUpperBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 100
    .line 101
    invoke-interface {v4}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_2

    .line 106
    .line 107
    move v4, v0

    .line 108
    goto :goto_3

    .line 109
    :cond_2
    move v4, v1

    .line 110
    :goto_3
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getUpperBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v5, :cond_3

    .line 123
    .line 124
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    check-cast v5, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 129
    .line 130
    new-instance v6, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;

    .line 131
    .line 132
    add-int/lit8 v7, v4, 0x1

    .line 133
    .line 134
    invoke-static {p2, p3, v4}, Lnet/bytebuddy/jar/asm/TypeReference;->newTypeParameterBoundReference(III)Lnet/bytebuddy/jar/asm/TypeReference;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-direct {v6, p0, p1, v4}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;Lnet/bytebuddy/jar/asm/TypeReference;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v5, v6}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    check-cast p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 146
    .line 147
    move v4, v7

    .line 148
    goto :goto_4

    .line 149
    :cond_3
    add-int/lit8 p3, p3, 0x1

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_4
    return-object p0
.end method

.method public static ofTypeVariable(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ZLjava/util/List;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;",
            "Z",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)",
            "Lnet/bytebuddy/implementation/attribute/AnnotationAppender;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 153
    invoke-static {p0, p1, p2, v0, p3}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->ofTypeVariable(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ZILjava/util/List;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget v2, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typeReference:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typeReference:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typePath:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typePath:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationAppender:Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationAppender:Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationValueFilter:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 52
    .line 53
    iget-object p1, p1, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationValueFilter:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationAppender:Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object v0, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationValueFilter:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/lit8 v0, v0, 0x1f

    .line 28
    .line 29
    iget v1, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typeReference:I

    .line 30
    .line 31
    add-int/2addr v0, v1

    .line 32
    mul-int/lit8 v0, v0, 0x1f

    .line 33
    .line 34
    iget-object p0, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typePath:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method

.method public bridge synthetic onGenericArray(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 40
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->onGenericArray(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    move-result-object p0

    return-object p0
.end method

.method public onGenericArray(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;
    .locals 6

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;

    .line 6
    .line 7
    iget-object v2, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typePath:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0, p1, v2}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->apply(Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/lang/String;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v2, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationValueFilter:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 14
    .line 15
    iget v3, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typeReference:I

    .line 16
    .line 17
    new-instance v4, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typePath:Ljava/lang/String;

    .line 23
    .line 24
    const/16 v5, 0x5b

    .line 25
    .line 26
    invoke-static {v4, p0, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v1, p1, v2, v3, p0}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 38
    .line 39
    return-object p0
.end method

.method public bridge synthetic onNonGenericType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 71
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->onNonGenericType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    move-result-object p0

    return-object p0
.end method

.method public onNonGenericType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typePath:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->getInnerClassCount()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_0

    .line 18
    .line 19
    const/16 v2, 0x2e

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->apply(Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/lang/String;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    new-instance v1, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;

    .line 42
    .line 43
    iget-object v2, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationValueFilter:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 44
    .line 45
    iget v3, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typeReference:I

    .line 46
    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typePath:Ljava/lang/String;

    .line 53
    .line 54
    const/16 v5, 0x5b

    .line 55
    .line 56
    invoke-static {v4, p0, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-direct {v1, v0, v2, v3, p0}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_1
    return-object v0
.end method

.method public bridge synthetic onParameterizedType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 124
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->onParameterizedType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    move-result-object p0

    return-object p0
.end method

.method public onParameterizedType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typePath:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    :goto_0
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription;->getInnerClassCount()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-ge v2, v3, :cond_0

    .line 19
    .line 20
    const/16 v3, 0x2e

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-direct {p0, p1, v2}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->apply(Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/lang/String;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getOwnerType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    new-instance v4, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;

    .line 43
    .line 44
    iget-object v5, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationValueFilter:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 45
    .line 46
    iget v6, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typeReference:I

    .line 47
    .line 48
    iget-object v7, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typePath:Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {v4, v2, v5, v6, v7}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v3, v4}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 58
    .line 59
    :cond_1
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getTypeArguments()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_2

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    check-cast v3, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 78
    .line 79
    new-instance v4, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;

    .line 80
    .line 81
    iget-object v5, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationValueFilter:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 82
    .line 83
    iget v6, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typeReference:I

    .line 84
    .line 85
    new-instance v7, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    add-int/lit8 v8, v1, 0x1

    .line 98
    .line 99
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const/16 v1, 0x3b

    .line 103
    .line 104
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-direct {v4, v2, v5, v6, v1}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ILjava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v3, v4}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    move-object v2, v1

    .line 119
    check-cast v2, Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 120
    .line 121
    move v1, v8

    .line 122
    goto :goto_1

    .line 123
    :cond_2
    return-object v2
.end method

.method public bridge synthetic onTypeVariable(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->onTypeVariable(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    move-result-object p0

    return-object p0
.end method

.method public onTypeVariable(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typePath:Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->apply(Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/lang/String;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public bridge synthetic onWildcard(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 63
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->onWildcard(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    move-result-object p0

    return-object p0
.end method

.method public onWildcard(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;
    .locals 6

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getLowerBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->getUpperBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-interface {v0}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 27
    .line 28
    :goto_0
    new-instance v1, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;

    .line 29
    .line 30
    iget-object v2, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typePath:Ljava/lang/String;

    .line 31
    .line 32
    invoke-direct {p0, p1, v2}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->apply(Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/lang/String;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v2, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->annotationValueFilter:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 37
    .line 38
    iget v3, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typeReference:I

    .line 39
    .line 40
    new-instance v4, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->typePath:Ljava/lang/String;

    .line 46
    .line 47
    const/16 v5, 0x2a

    .line 48
    .line 49
    invoke-static {v4, p0, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-direct {v1, p1, v2, v3, p0}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;ILjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 61
    .line 62
    return-object p0
.end method
