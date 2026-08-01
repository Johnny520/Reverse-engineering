.class Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;
.super Lnet/bytebuddy/jar/asm/ClassVisitor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/AnnotationRemoval;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AnnotationRemovingClassVisitor"
.end annotation


# instance fields
.field private final annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final annotations:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end field

.field private final fields:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end field

.field private final methodMatcher:Lnet/bytebuddy/matcher/ElementMatcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final methods:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final parameters:I


# direct methods
.method private constructor <init>(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;ILjava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/jar/asm/ClassVisitor;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Lnet/bytebuddy/matcher/ElementMatcher<",
            "-",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/ClassVisitor;-><init>(ILnet/bytebuddy/jar/asm/ClassVisitor;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->methodMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 11
    .line 12
    iput p5, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->parameters:I

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->fields:Ljava/util/Map;

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->methods:Ljava/util/Map;

    .line 17
    .line 18
    iput-object p8, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->annotations:Ljava/util/Map;

    .line 19
    .line 20
    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;ILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lnet/bytebuddy/asm/AnnotationRemoval$1;)V
    .locals 0

    .line 21
    invoke-direct/range {p0 .. p8}, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;-><init>(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;Lnet/bytebuddy/matcher/ElementMatcher;ILjava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;
    .locals 2
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->annotations:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-super {p0, p1, p2}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p4, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-object p4

    .line 9
    :cond_0
    iget-object p5, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->fields:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-interface {p5, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 31
    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    iget-object p3, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->fieldMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 35
    .line 36
    invoke-interface {p3, p2}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    if-eqz p3, :cond_2

    .line 41
    .line 42
    new-instance p3, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {p2}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result p5

    .line 59
    if-eqz p5, :cond_1

    .line 60
    .line 61
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p5

    .line 65
    check-cast p5, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 66
    .line 67
    invoke-interface {p5}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p3, v0, p5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    new-instance p2, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingFieldVisitor;

    .line 80
    .line 81
    iget-object p0, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 82
    .line 83
    invoke-direct {p2, p1, p0, p3, p4}, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingFieldVisitor;-><init>(Lnet/bytebuddy/jar/asm/FieldVisitor;Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/Map;Lnet/bytebuddy/asm/AnnotationRemoval$1;)V

    .line 84
    .line 85
    .line 86
    return-object p2

    .line 87
    :cond_2
    return-object p1
.end method

.method public visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;
    .locals 5
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    invoke-super/range {p0 .. p5}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    iget-object p4, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->methods:Ljava/util/Map;

    .line 10
    .line 11
    new-instance p5, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-interface {p4, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Lnet/bytebuddy/description/method/MethodDescription;

    .line 31
    .line 32
    if-eqz p2, :cond_7

    .line 33
    .line 34
    iget-object p3, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->methodMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 35
    .line 36
    invoke-interface {p3, p2}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    if-eqz p3, :cond_7

    .line 41
    .line 42
    new-instance p3, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    iget p4, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->parameters:I

    .line 48
    .line 49
    const/4 p5, -0x3

    .line 50
    if-gez p4, :cond_1

    .line 51
    .line 52
    const/4 v0, -0x1

    .line 53
    if-eq p4, v0, :cond_1

    .line 54
    .line 55
    if-ne p4, p5, :cond_4

    .line 56
    .line 57
    :cond_1
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p4

    .line 65
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Lnet/bytebuddy/description/method/ParameterDescription;

    .line 76
    .line 77
    new-instance v1, Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-interface {v0}, Lnet/bytebuddy/description/method/ParameterDescription;->getIndex()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    iget v3, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->parameters:I

    .line 87
    .line 88
    if-eq v2, v3, :cond_2

    .line 89
    .line 90
    if-gez v3, :cond_3

    .line 91
    .line 92
    :cond_2
    invoke-interface {v0}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_3

    .line 105
    .line 106
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 111
    .line 112
    invoke-interface {v3}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-interface {v4}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    invoke-interface {v0}, Lnet/bytebuddy/description/method/ParameterDescription;->getIndex()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {p3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_4
    new-instance p4, Ljava/util/HashMap;

    .line 137
    .line 138
    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    .line 139
    .line 140
    .line 141
    iget v0, p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->parameters:I

    .line 142
    .line 143
    const/4 v1, -0x2

    .line 144
    if-eq v0, v1, :cond_6

    .line 145
    .line 146
    if-ne v0, p5, :cond_5

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_5
    move-object p2, p0

    .line 150
    goto :goto_4

    .line 151
    :cond_6
    :goto_2
    invoke-interface {p2}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result p5

    .line 163
    if-eqz p5, :cond_5

    .line 164
    .line 165
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p5

    .line 169
    check-cast p5, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 170
    .line 171
    invoke-interface {p5}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {p4, v0, p5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :goto_4
    new-instance p0, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingMethodVisitor;

    .line 184
    .line 185
    iget-object p2, p2, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingClassVisitor;->annotationMatcher:Lnet/bytebuddy/matcher/ElementMatcher;

    .line 186
    .line 187
    const/4 p5, 0x0

    .line 188
    invoke-direct/range {p0 .. p5}, Lnet/bytebuddy/asm/AnnotationRemoval$AnnotationRemovingMethodVisitor;-><init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/matcher/ElementMatcher;Ljava/util/Map;Ljava/util/Map;Lnet/bytebuddy/asm/AnnotationRemoval$1;)V

    .line 189
    .line 190
    .line 191
    return-object p0

    .line 192
    :cond_7
    return-object p1
.end method
