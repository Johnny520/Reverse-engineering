.class Lcom/android/dx/dex/cf/AttributeTranslator;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getAnnotations(Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/rop/annotation/Annotations;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/android/dx/dex/cf/AttributeTranslator;->getAnnotations0(Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/rop/annotation/Annotations;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lcom/android/dx/dex/cf/AttributeTranslator;->getSignature(Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/rop/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p0}, Lcom/android/dx/dex/cf/AttributeTranslator;->getSourceDebugExtension(Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/rop/annotation/Annotation;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/android/dx/rop/annotation/Annotations;->combine(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/rop/annotation/Annotation;)Lcom/android/dx/rop/annotation/Annotations;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-static {v0, p0}, Lcom/android/dx/rop/annotation/Annotations;->combine(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/rop/annotation/Annotation;)Lcom/android/dx/rop/annotation/Annotations;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_1
    return-object v0
.end method

.method private static getAnnotations0(Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/rop/annotation/Annotations;
    .locals 2

    .line 1
    const-string v0, "RuntimeVisibleAnnotations"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/android/dx/cf/attrib/AttRuntimeVisibleAnnotations;

    .line 8
    .line 9
    const-string v1, "RuntimeInvisibleAnnotations"

    .line 10
    .line 11
    invoke-interface {p0, v1}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lcom/android/dx/cf/attrib/AttRuntimeInvisibleAnnotations;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    sget-object p0, Lcom/android/dx/rop/annotation/Annotations;->EMPTY:Lcom/android/dx/rop/annotation/Annotations;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/cf/attrib/BaseAnnotations;->getAnnotations()Lcom/android/dx/rop/annotation/Annotations;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    if-nez p0, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/android/dx/cf/attrib/BaseAnnotations;->getAnnotations()Lcom/android/dx/rop/annotation/Annotations;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_2
    invoke-virtual {v0}, Lcom/android/dx/cf/attrib/BaseAnnotations;->getAnnotations()Lcom/android/dx/rop/annotation/Annotations;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p0}, Lcom/android/dx/cf/attrib/BaseAnnotations;->getAnnotations()Lcom/android/dx/rop/annotation/Annotations;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {v0, p0}, Lcom/android/dx/rop/annotation/Annotations;->combine(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/rop/annotation/Annotations;)Lcom/android/dx/rop/annotation/Annotations;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static getClassAnnotations(Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/dex/cf/CfOptions;)Lcom/android/dx/rop/annotation/Annotations;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getThisClass()Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getAttributes()Lcom/android/dx/cf/iface/AttributeList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lcom/android/dx/dex/cf/AttributeTranslator;->getAnnotations(Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/rop/annotation/Annotations;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v1}, Lcom/android/dx/dex/cf/AttributeTranslator;->translateEnclosingMethod(Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/rop/annotation/Annotation;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v4, 0x0

    .line 22
    :goto_0
    :try_start_0
    invoke-static {v0, v1, v4}, Lcom/android/dx/dex/cf/AttributeTranslator;->translateInnerClasses(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/cf/iface/AttributeList;Z)Lcom/android/dx/rop/annotation/Annotations;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-static {v2, v0}, Lcom/android/dx/rop/annotation/Annotations;->combine(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/rop/annotation/Annotations;)Lcom/android/dx/rop/annotation/Annotations;

    .line 29
    .line 30
    .line 31
    move-result-object v2
    :try_end_0
    .catch Lcom/android/dx/util/Warning; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    goto :goto_1

    .line 33
    :catch_0
    move-exception v0

    .line 34
    iget-object p1, p1, Lcom/android/dx/dex/cf/CfOptions;->warn:Ljava/io/PrintStream;

    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v4, "warning: "

    .line 39
    .line 40
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    :goto_1
    if-eqz v3, :cond_2

    .line 58
    .line 59
    invoke-static {v2, v3}, Lcom/android/dx/rop/annotation/Annotations;->combine(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/rop/annotation/Annotation;)Lcom/android/dx/rop/annotation/Annotations;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    :cond_2
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getAccessFlags()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-static {p1}, Lcom/android/dx/rop/code/AccessFlags;->isAnnotation(I)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    invoke-static {p0}, Lcom/android/dx/dex/cf/AttributeTranslator;->translateAnnotationDefaults(Lcom/android/dx/cf/direct/DirectClassFile;)Lcom/android/dx/rop/annotation/Annotation;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-eqz p0, :cond_3

    .line 78
    .line 79
    invoke-static {v2, p0}, Lcom/android/dx/rop/annotation/Annotations;->combine(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/rop/annotation/Annotation;)Lcom/android/dx/rop/annotation/Annotations;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    :cond_3
    return-object v2
.end method

.method public static getExceptions(Lcom/android/dx/cf/iface/Method;)Lcom/android/dx/rop/type/TypeList;
    .locals 1

    .line 1
    invoke-interface {p0}, Lcom/android/dx/cf/iface/Member;->getAttributes()Lcom/android/dx/cf/iface/AttributeList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "Exceptions"

    .line 6
    .line 7
    invoke-interface {p0, v0}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/android/dx/cf/attrib/AttExceptions;

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    sget-object p0, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/cf/attrib/AttExceptions;->getExceptions()Lcom/android/dx/rop/type/TypeList;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static getMethodAnnotations(Lcom/android/dx/cf/iface/Method;)Lcom/android/dx/rop/annotation/Annotations;
    .locals 2

    .line 1
    invoke-interface {p0}, Lcom/android/dx/cf/iface/Member;->getAttributes()Lcom/android/dx/cf/iface/AttributeList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/android/dx/dex/cf/AttributeTranslator;->getAnnotations(Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/rop/annotation/Annotations;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0}, Lcom/android/dx/dex/cf/AttributeTranslator;->getExceptions(Lcom/android/dx/cf/iface/Method;)Lcom/android/dx/rop/type/TypeList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-static {p0}, Lcom/android/dx/dex/file/AnnotationUtils;->makeThrows(Lcom/android/dx/rop/type/TypeList;)Lcom/android/dx/rop/annotation/Annotation;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {v0, p0}, Lcom/android/dx/rop/annotation/Annotations;->combine(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/rop/annotation/Annotation;)Lcom/android/dx/rop/annotation/Annotations;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_0
    return-object v0
.end method

.method public static getParameterAnnotations(Lcom/android/dx/cf/iface/Method;)Lcom/android/dx/rop/annotation/AnnotationsList;
    .locals 2

    .line 1
    invoke-interface {p0}, Lcom/android/dx/cf/iface/Member;->getAttributes()Lcom/android/dx/cf/iface/AttributeList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "RuntimeVisibleParameterAnnotations"

    .line 6
    .line 7
    invoke-interface {p0, v0}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/android/dx/cf/attrib/AttRuntimeVisibleParameterAnnotations;

    .line 12
    .line 13
    const-string v1, "RuntimeInvisibleParameterAnnotations"

    .line 14
    .line 15
    invoke-interface {p0, v1}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lcom/android/dx/cf/attrib/AttRuntimeInvisibleParameterAnnotations;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    sget-object p0, Lcom/android/dx/rop/annotation/AnnotationsList;->EMPTY:Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/cf/attrib/BaseParameterAnnotations;->getParameterAnnotations()Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    if-nez p0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/android/dx/cf/attrib/BaseParameterAnnotations;->getParameterAnnotations()Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_2
    invoke-virtual {v0}, Lcom/android/dx/cf/attrib/BaseParameterAnnotations;->getParameterAnnotations()Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0}, Lcom/android/dx/cf/attrib/BaseParameterAnnotations;->getParameterAnnotations()Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {v0, p0}, Lcom/android/dx/rop/annotation/AnnotationsList;->combine(Lcom/android/dx/rop/annotation/AnnotationsList;Lcom/android/dx/rop/annotation/AnnotationsList;)Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method private static getSignature(Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/rop/annotation/Annotation;
    .locals 1

    .line 1
    const-string v0, "Signature"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/android/dx/cf/attrib/AttSignature;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/cf/attrib/AttSignature;->getSignature()Lcom/android/dx/rop/cst/CstString;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Lcom/android/dx/dex/file/AnnotationUtils;->makeSignature(Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/rop/annotation/Annotation;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private static getSourceDebugExtension(Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/rop/annotation/Annotation;
    .locals 1

    .line 1
    const-string v0, "SourceDebugExtension"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/android/dx/cf/attrib/AttSourceDebugExtension;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/cf/attrib/AttSourceDebugExtension;->getSmapString()Lcom/android/dx/rop/cst/CstString;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Lcom/android/dx/dex/file/AnnotationUtils;->makeSourceDebugExtension(Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/rop/annotation/Annotation;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private static translateAnnotationDefaults(Lcom/android/dx/cf/direct/DirectClassFile;)Lcom/android/dx/rop/annotation/Annotation;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getThisClass()Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getMethods()Lcom/android/dx/cf/iface/MethodList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Lcom/android/dx/cf/iface/MethodList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    new-instance v2, Lcom/android/dx/rop/annotation/Annotation;

    .line 14
    .line 15
    sget-object v3, Lcom/android/dx/rop/annotation/AnnotationVisibility;->EMBEDDED:Lcom/android/dx/rop/annotation/AnnotationVisibility;

    .line 16
    .line 17
    invoke-direct {v2, v0, v3}, Lcom/android/dx/rop/annotation/Annotation;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/annotation/AnnotationVisibility;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    move v3, v0

    .line 22
    :goto_0
    if-ge v0, v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p0, v0}, Lcom/android/dx/cf/iface/MethodList;->get(I)Lcom/android/dx/cf/iface/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-interface {v4}, Lcom/android/dx/cf/iface/Member;->getAttributes()Lcom/android/dx/cf/iface/AttributeList;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    const-string v6, "AnnotationDefault"

    .line 33
    .line 34
    invoke-interface {v5, v6}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    check-cast v5, Lcom/android/dx/cf/attrib/AttAnnotationDefault;

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    new-instance v3, Lcom/android/dx/rop/annotation/NameValuePair;

    .line 43
    .line 44
    invoke-interface {v4}, Lcom/android/dx/cf/iface/Member;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Lcom/android/dx/rop/cst/CstNat;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v5}, Lcom/android/dx/cf/attrib/AttAnnotationDefault;->getValue()Lcom/android/dx/rop/cst/Constant;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-direct {v3, v4, v5}, Lcom/android/dx/rop/annotation/NameValuePair;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/Constant;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v3}, Lcom/android/dx/rop/annotation/Annotation;->add(Lcom/android/dx/rop/annotation/NameValuePair;)V

    .line 60
    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    if-nez v3, :cond_2

    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    return-object p0

    .line 70
    :cond_2
    invoke-virtual {v2}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 71
    .line 72
    .line 73
    invoke-static {v2}, Lcom/android/dx/dex/file/AnnotationUtils;->makeAnnotationDefault(Lcom/android/dx/rop/annotation/Annotation;)Lcom/android/dx/rop/annotation/Annotation;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0
.end method

.method private static translateEnclosingMethod(Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/rop/annotation/Annotation;
    .locals 2

    .line 1
    const-string v0, "EnclosingMethod"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/android/dx/cf/attrib/AttEnclosingMethod;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/cf/attrib/AttEnclosingMethod;->getEnclosingClass()Lcom/android/dx/rop/cst/CstType;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Lcom/android/dx/cf/attrib/AttEnclosingMethod;->getMethod()Lcom/android/dx/rop/cst/CstNat;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    invoke-static {v0}, Lcom/android/dx/dex/file/AnnotationUtils;->makeEnclosingClass(Lcom/android/dx/rop/cst/CstType;)Lcom/android/dx/rop/annotation/Annotation;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    new-instance v1, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 29
    .line 30
    invoke-direct {v1, v0, p0}, Lcom/android/dx/rop/cst/CstMethodRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Lcom/android/dx/dex/file/AnnotationUtils;->makeEnclosingMethod(Lcom/android/dx/rop/cst/CstMethodRef;)Lcom/android/dx/rop/annotation/Annotation;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method private static translateInnerClasses(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/cf/iface/AttributeList;Z)Lcom/android/dx/rop/annotation/Annotations;
    .locals 9

    .line 1
    const-string v0, "InnerClasses"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/android/dx/cf/attrib/AttInnerClasses;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/cf/attrib/AttInnerClasses;->getInnerClasses()Lcom/android/dx/cf/attrib/InnerClassList;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    new-instance v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    move-object v5, v0

    .line 28
    move v4, v3

    .line 29
    :goto_0
    if-ge v4, v1, :cond_3

    .line 30
    .line 31
    invoke-virtual {p1, v4}, Lcom/android/dx/cf/attrib/InnerClassList;->get(I)Lcom/android/dx/cf/attrib/InnerClassList$Item;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-virtual {v6}, Lcom/android/dx/cf/attrib/InnerClassList$Item;->getInnerClass()Lcom/android/dx/rop/cst/CstType;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-virtual {v7, p0}, Lcom/android/dx/rop/cst/CstType;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-eqz v8, :cond_1

    .line 44
    .line 45
    move-object v5, v6

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v6}, Lcom/android/dx/cf/attrib/InnerClassList$Item;->getOuterClass()Lcom/android/dx/rop/cst/CstType;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {p0, v6}, Lcom/android/dx/rop/cst/CstType;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    invoke-virtual {v7}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez v5, :cond_4

    .line 72
    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_4
    new-instance v0, Lcom/android/dx/rop/annotation/Annotations;

    .line 77
    .line 78
    invoke-direct {v0}, Lcom/android/dx/rop/annotation/Annotations;-><init>()V

    .line 79
    .line 80
    .line 81
    if-eqz v5, :cond_6

    .line 82
    .line 83
    invoke-virtual {v5}, Lcom/android/dx/cf/attrib/InnerClassList$Item;->getInnerName()Lcom/android/dx/rop/cst/CstString;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v5}, Lcom/android/dx/cf/attrib/InnerClassList$Item;->getAccessFlags()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    invoke-static {v1, v4}, Lcom/android/dx/dex/file/AnnotationUtils;->makeInnerClass(Lcom/android/dx/rop/cst/CstString;I)Lcom/android/dx/rop/annotation/Annotation;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v0, v1}, Lcom/android/dx/rop/annotation/Annotations;->add(Lcom/android/dx/rop/annotation/Annotation;)V

    .line 96
    .line 97
    .line 98
    if-eqz p2, :cond_6

    .line 99
    .line 100
    invoke-virtual {v5}, Lcom/android/dx/cf/attrib/InnerClassList$Item;->getOuterClass()Lcom/android/dx/rop/cst/CstType;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    if-eqz p2, :cond_5

    .line 105
    .line 106
    invoke-virtual {v5}, Lcom/android/dx/cf/attrib/InnerClassList$Item;->getOuterClass()Lcom/android/dx/rop/cst/CstType;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, Lcom/android/dx/dex/file/AnnotationUtils;->makeEnclosingClass(Lcom/android/dx/rop/cst/CstType;)Lcom/android/dx/rop/annotation/Annotation;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v0, p0}, Lcom/android/dx/rop/annotation/Annotations;->add(Lcom/android/dx/rop/annotation/Annotation;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    new-instance p1, Lcom/android/dx/util/Warning;

    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstType;->toHuman()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-instance p2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string v0, "Ignoring InnerClasses attribute for an anonymous inner class\n("

    .line 127
    .line 128
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string p0, ") that doesn\'t come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class."

    .line 135
    .line 136
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-direct {p1, p0}, Lcom/android/dx/util/Warning;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_6
    :goto_2
    if-eqz p1, :cond_8

    .line 148
    .line 149
    new-instance p0, Lcom/android/dx/rop/type/StdTypeList;

    .line 150
    .line 151
    invoke-direct {p0, p1}, Lcom/android/dx/rop/type/StdTypeList;-><init>(I)V

    .line 152
    .line 153
    .line 154
    :goto_3
    if-ge v3, p1, :cond_7

    .line 155
    .line 156
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    check-cast p2, Lcom/android/dx/rop/type/Type;

    .line 161
    .line 162
    invoke-virtual {p0, v3, p2}, Lcom/android/dx/rop/type/StdTypeList;->set(ILcom/android/dx/rop/type/Type;)V

    .line 163
    .line 164
    .line 165
    add-int/lit8 v3, v3, 0x1

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_7
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 169
    .line 170
    .line 171
    invoke-static {p0}, Lcom/android/dx/dex/file/AnnotationUtils;->makeMemberClasses(Lcom/android/dx/rop/type/TypeList;)Lcom/android/dx/rop/annotation/Annotation;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {v0, p0}, Lcom/android/dx/rop/annotation/Annotations;->add(Lcom/android/dx/rop/annotation/Annotation;)V

    .line 176
    .line 177
    .line 178
    :cond_8
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 179
    .line 180
    .line 181
    return-object v0
.end method
