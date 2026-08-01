.class public Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;
.super Lnet/bytebuddy/description/annotation/AnnotationDescription$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/annotation/AnnotationDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForLoadedAnnotation"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S::",
        "Ljava/lang/annotation/Annotation;",
        ">",
        "Lnet/bytebuddy/description/annotation/AnnotationDescription$AbstractBase;",
        "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
        "TS;>;"
    }
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final NO_ARGUMENT:[Ljava/lang/Object;


# instance fields
.field private final annotation:Ljava/lang/annotation/Annotation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TS;"
        }
    .end annotation
.end field

.field private final annotationType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TS;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "java.security.AccessController"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "net.bytebuddy.securitymanager"

    .line 9
    .line 10
    const-string v2, "true"

    .line 11
    .line 12
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sput-boolean v1, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const/4 v1, 0x1

    .line 24
    sput-boolean v1, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_1
    sput-boolean v0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->ACCESS_CONTROLLER:Z

    .line 28
    .line 29
    :goto_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 30
    .line 31
    sput-object v0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->NO_ARGUMENT:[Ljava/lang/Object;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Ljava/lang/annotation/Annotation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;-><init>(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;",
            "Ljava/lang/Class<",
            "TS;>;)V"
        }
    .end annotation

    .line 9
    invoke-direct {p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$AbstractBase;-><init>()V

    .line 10
    iput-object p1, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotation:Ljava/lang/annotation/Annotation;

    .line 11
    iput-object p2, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotationType:Ljava/lang/Class;

    return-void
.end method

.method private static asValue(Ljava/lang/annotation/Annotation;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;>;"
        }
    .end annotation

    .line 209
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 210
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_4

    aget-object v4, v1, v3

    const/4 v5, 0x0

    .line 211
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->NO_ARGUMENT:[Ljava/lang/Object;

    invoke-virtual {v4, p0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    invoke-static {v7, v8}, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->asValue(Ljava/lang/Object;Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception v6

    goto :goto_2

    .line 212
    :goto_1
    const-string v0, "Cannot access "

    invoke-static {v0, v4, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v5

    .line 213
    :goto_2
    invoke-virtual {v6}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v6

    .line 214
    instance-of v7, v6, Ljava/lang/TypeNotPresentException;

    if-eqz v7, :cond_0

    .line 215
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType;

    check-cast v6, Ljava/lang/TypeNotPresentException;

    invoke-virtual {v6}, Ljava/lang/TypeNotPresentException;->typeName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 216
    :cond_0
    instance-of v7, v6, Ljava/lang/EnumConstantNotPresentException;

    if-eqz v7, :cond_1

    .line 217
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lnet/bytebuddy/description/annotation/AnnotationValue$ForEnumerationDescription$WithUnknownConstant;

    new-instance v7, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    check-cast v6, Ljava/lang/EnumConstantNotPresentException;

    .line 218
    invoke-virtual {v6}, Ljava/lang/EnumConstantNotPresentException;->enumType()Ljava/lang/Class;

    move-result-object v8

    invoke-direct {v7, v8}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 219
    invoke-virtual {v6}, Ljava/lang/EnumConstantNotPresentException;->constantName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v7, v6}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForEnumerationDescription$WithUnknownConstant;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;)V

    .line 220
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 221
    :cond_1
    instance-of v7, v6, Ljava/lang/annotation/AnnotationTypeMismatchException;

    if-eqz v7, :cond_2

    .line 222
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMismatchedType;

    new-instance v7, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    check-cast v6, Ljava/lang/annotation/AnnotationTypeMismatchException;

    .line 223
    invoke-virtual {v6}, Ljava/lang/annotation/AnnotationTypeMismatchException;->element()Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-direct {v7, v8}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 224
    invoke-virtual {v6}, Ljava/lang/annotation/AnnotationTypeMismatchException;->foundType()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v7, v6}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMismatchedType;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/lang/String;)V

    .line 225
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 226
    :cond_2
    instance-of v7, v6, Ljava/lang/annotation/IncompleteAnnotationException;

    if-eqz v7, :cond_3

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 227
    :cond_3
    const-string p0, "Cannot read "

    invoke-static {p0, v4, v6}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v5

    :cond_4
    return-object v0
.end method

.method public static asValue(Ljava/lang/Object;Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;"
        }
    .end annotation

    .line 1
    const-class v0, Ljava/lang/Enum;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p1, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;

    .line 10
    .line 11
    check-cast p0, Ljava/lang/Enum;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;-><init>(Ljava/lang/Enum;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForEnumerationDescription;->of(Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    const-class v0, [Ljava/lang/Enum;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    check-cast p0, [Ljava/lang/Enum;

    .line 31
    .line 32
    array-length v0, p0

    .line 33
    new-array v0, v0, [Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 34
    .line 35
    array-length v2, p0

    .line 36
    move v3, v1

    .line 37
    :goto_0
    if-ge v1, v2, :cond_1

    .line 38
    .line 39
    aget-object v4, p0, v1

    .line 40
    .line 41
    add-int/lit8 v5, v3, 0x1

    .line 42
    .line 43
    new-instance v6, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;

    .line 44
    .line 45
    invoke-direct {v6, v4}, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;-><init>(Ljava/lang/Enum;)V

    .line 46
    .line 47
    .line 48
    aput-object v6, v0, v3

    .line 49
    .line 50
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    move v3, v5

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;->of(Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_2
    const-class v0, Ljava/lang/annotation/Annotation;

    .line 68
    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p0, Ljava/lang/annotation/Annotation;

    .line 80
    .line 81
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->asValue(Ljava/lang/annotation/Annotation;)Ljava/util/Map;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p1, p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForAnnotationDescription;->of(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/Map;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :cond_3
    const-class v0, [Ljava/lang/annotation/Annotation;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    check-cast p0, [Ljava/lang/annotation/Annotation;

    .line 99
    .line 100
    check-cast p0, [Ljava/lang/annotation/Annotation;

    .line 101
    .line 102
    array-length v0, p0

    .line 103
    new-array v0, v0, [Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 104
    .line 105
    array-length v2, p0

    .line 106
    move v3, v1

    .line 107
    :goto_1
    if-ge v1, v2, :cond_4

    .line 108
    .line 109
    aget-object v4, p0, v1

    .line 110
    .line 111
    add-int/lit8 v5, v3, 0x1

    .line 112
    .line 113
    new-instance v6, Lnet/bytebuddy/description/annotation/AnnotationDescription$Latent;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-static {v7}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-static {v4}, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->asValue(Ljava/lang/annotation/Annotation;)Ljava/util/Map;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-direct {v6, v7, v4}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/Map;)V

    .line 128
    .line 129
    .line 130
    aput-object v6, v0, v3

    .line 131
    .line 132
    add-int/lit8 v1, v1, 0x1

    .line 133
    .line 134
    move v3, v5

    .line 135
    goto :goto_1

    .line 136
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {p0, v0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;->of(Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/annotation/AnnotationDescription;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :cond_5
    const-class v0, Ljava/lang/Class;

    .line 150
    .line 151
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_6

    .line 156
    .line 157
    check-cast p0, Ljava/lang/Class;

    .line 158
    .line 159
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForTypeDescription;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    :cond_6
    const-class v0, [Ljava/lang/Class;

    .line 169
    .line 170
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_8

    .line 175
    .line 176
    check-cast p0, [Ljava/lang/Class;

    .line 177
    .line 178
    array-length p1, p0

    .line 179
    new-array p1, p1, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 180
    .line 181
    array-length v0, p0

    .line 182
    move v2, v1

    .line 183
    :goto_2
    if-ge v1, v0, :cond_7

    .line 184
    .line 185
    aget-object v3, p0, v1

    .line 186
    .line 187
    add-int/lit8 v4, v2, 0x1

    .line 188
    .line 189
    invoke-static {v3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    aput-object v3, p1, v2

    .line 194
    .line 195
    add-int/lit8 v1, v1, 0x1

    .line 196
    .line 197
    move v2, v4

    .line 198
    goto :goto_2

    .line 199
    :cond_7
    invoke-static {p1}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForDescriptionArray;->of([Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    return-object p0

    .line 204
    :cond_8
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForConstant;->of(Ljava/lang/Object;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    return-object p0
.end method

.method private static doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/security/PrivilegedAction<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->ACCESS_CONTROLLER:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static of(Ljava/lang/annotation/Annotation;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U::",
            "Ljava/lang/annotation/Annotation;",
            ">(TU;)",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "TU;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;-><init>(Ljava/lang/annotation/Annotation;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public getAnnotationType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotation:Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            ")",
            "Lnet/bytebuddy/description/annotation/AnnotationValue<",
            "**>;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotation:Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_7

    .line 17
    .line 18
    :try_start_0
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPublic()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    instance-of v2, p1, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    move-object v2, p1

    .line 31
    check-cast v2, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 32
    .line 33
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;->getLoadedMethod()Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :catch_1
    move-exception p0

    .line 41
    goto :goto_2

    .line 42
    :cond_0
    move-object v2, v1

    .line 43
    :goto_0
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iget-object v4, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotation:Ljava/lang/annotation/Annotation;

    .line 50
    .line 51
    invoke-interface {v4}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    if-ne v3, v4, :cond_1

    .line 56
    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-nez v3, :cond_2

    .line 64
    .line 65
    :cond_1
    iget-object v2, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotation:Ljava/lang/annotation/Annotation;

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-nez v0, :cond_2

    .line 80
    .line 81
    new-instance v0, Lnet/bytebuddy/utility/privilege/SetAccessibleAction;

    .line 82
    .line 83
    invoke-direct {v0, v2}, Lnet/bytebuddy/utility/privilege/SetAccessibleAction;-><init>(Ljava/lang/reflect/AccessibleObject;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotation:Ljava/lang/annotation/Annotation;

    .line 90
    .line 91
    sget-object v0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->NO_ARGUMENT:[Ljava/lang/Object;

    .line 92
    .line 93
    invoke-virtual {v2, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {p0, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->asValue(Ljava/lang/Object;Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->filter(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 106
    .line 107
    .line 108
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    return-object p0

    .line 110
    :goto_1
    const-string v0, "Cannot access annotation property "

    .line 111
    .line 112
    invoke-static {v0, p1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    return-object v1

    .line 116
    :goto_2
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    instance-of v0, p0, Ljava/lang/TypeNotPresentException;

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    new-instance p1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType;

    .line 125
    .line 126
    check-cast p0, Ljava/lang/TypeNotPresentException;

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/TypeNotPresentException;->typeName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-direct {p1, p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingType;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object p1

    .line 136
    :cond_3
    instance-of v0, p0, Ljava/lang/EnumConstantNotPresentException;

    .line 137
    .line 138
    if-eqz v0, :cond_4

    .line 139
    .line 140
    new-instance p1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForEnumerationDescription$WithUnknownConstant;

    .line 141
    .line 142
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 143
    .line 144
    check-cast p0, Ljava/lang/EnumConstantNotPresentException;

    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/lang/EnumConstantNotPresentException;->enumType()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Ljava/lang/EnumConstantNotPresentException;->constantName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-direct {p1, v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForEnumerationDescription$WithUnknownConstant;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-object p1

    .line 161
    :cond_4
    instance-of v0, p0, Ljava/lang/annotation/AnnotationTypeMismatchException;

    .line 162
    .line 163
    if-eqz v0, :cond_5

    .line 164
    .line 165
    new-instance p1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMismatchedType;

    .line 166
    .line 167
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 168
    .line 169
    check-cast p0, Ljava/lang/annotation/AnnotationTypeMismatchException;

    .line 170
    .line 171
    invoke-virtual {p0}, Ljava/lang/annotation/AnnotationTypeMismatchException;->element()Ljava/lang/reflect/Method;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Ljava/lang/annotation/AnnotationTypeMismatchException;->foundType()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-direct {p1, v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMismatchedType;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-object p1

    .line 186
    :cond_5
    instance-of v0, p0, Ljava/lang/annotation/IncompleteAnnotationException;

    .line 187
    .line 188
    if-eqz v0, :cond_6

    .line 189
    .line 190
    new-instance p1, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingValue;

    .line 191
    .line 192
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 193
    .line 194
    check-cast p0, Ljava/lang/annotation/IncompleteAnnotationException;

    .line 195
    .line 196
    invoke-virtual {p0}, Ljava/lang/annotation/IncompleteAnnotationException;->annotationType()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Ljava/lang/annotation/IncompleteAnnotationException;->elementName()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-direct {p1, v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationValue$ForMissingValue;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return-object p1

    .line 211
    :cond_6
    const-string v0, "Error reading annotation property "

    .line 212
    .line 213
    invoke-static {v0, p1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    return-object v1

    .line 217
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotation:Ljava/lang/annotation/Annotation;

    .line 226
    .line 227
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    const-string p1, " does not represent "

    .line 232
    .line 233
    invoke-static {v0, p1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    return-object v1
.end method

.method public load()Ljava/lang/annotation/Annotation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotationType:Ljava/lang/Class;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotation:Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotation:Ljava/lang/annotation/Annotation;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotationType:Ljava/lang/Class;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotationType:Ljava/lang/Class;

    .line 21
    .line 22
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotation:Ljava/lang/annotation/Annotation;

    .line 23
    .line 24
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->asValue(Ljava/lang/annotation/Annotation;)Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {v0, v1, p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$AnnotationInvocationHandler;->of(Ljava/lang/ClassLoader;Ljava/lang/Class;Ljava/util/Map;)Ljava/lang/annotation/Annotation;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public prepare(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/annotation/Annotation;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotation:Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotation:Ljava/lang/annotation/Annotation;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-ne p1, v0, :cond_0

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;

    .line 31
    .line 32
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotation:Ljava/lang/annotation/Annotation;

    .line 33
    .line 34
    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;-><init>(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lnet/bytebuddy/description/annotation/AnnotationDescription$ForLoadedAnnotation;->annotation:Ljava/lang/annotation/Annotation;

    .line 47
    .line 48
    invoke-interface {p0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string p1, " does not represent "

    .line 53
    .line 54
    invoke-static {v0, p1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0
.end method
