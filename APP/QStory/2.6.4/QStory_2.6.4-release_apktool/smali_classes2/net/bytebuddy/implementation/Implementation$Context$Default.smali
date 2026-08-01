.class public Lnet/bytebuddy/implementation/Implementation$Context$Default;
.super Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/Implementation$Context;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/Implementation$Context$Default$Factory;,
        Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldSetterDelegation;,
        Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;,
        Lnet/bytebuddy/implementation/Implementation$Context$Default$AccessorMethodDelegation;,
        Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;,
        Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldSetter;,
        Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetter;,
        Lnet/bytebuddy/implementation/Implementation$Context$Default$AccessorMethod;,
        Lnet/bytebuddy/implementation/Implementation$Context$Default$AbstractPropertyAccessorMethod;,
        Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldCacheEntry;,
        Lnet/bytebuddy/implementation/Implementation$Context$Default$CacheValueField;
    }
.end annotation


# static fields
.field public static final ACCESSOR_METHOD_SUFFIX:Ljava/lang/String; = "accessor"

.field public static final FIELD_CACHE_PREFIX:Ljava/lang/String; = "cachedValue"


# instance fields
.field private final auxiliaryClassFileVersion:Lnet/bytebuddy/ClassFileVersion;

.field private final auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

.field private final auxiliaryTypes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;"
        }
    .end annotation
.end field

.field private fieldCacheCanAppendEntries:Z

.field private final registeredAccessorMethods:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;",
            "Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;",
            ">;"
        }
    .end annotation
.end field

.field private final registeredFieldCacheEntries:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldCacheEntry;",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end field

.field private final registeredFieldCacheFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation
.end field

.field private final registeredGetters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            "Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;",
            ">;"
        }
    .end annotation
.end field

.field private final registeredSetters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/field/FieldDescription;",
            "Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;",
            ">;"
        }
    .end annotation
.end field

.field private final suffix:Ljava/lang/String;

.field private final typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p6}, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 5
    .line 6
    iput-object p4, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 7
    .line 8
    iput-object p5, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->auxiliaryClassFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 9
    .line 10
    iput-object p7, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->suffix:Ljava/lang/String;

    .line 11
    .line 12
    new-instance p1, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredAccessorMethods:Ljava/util/Map;

    .line 18
    .line 19
    new-instance p1, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredGetters:Ljava/util/Map;

    .line 25
    .line 26
    new-instance p1, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredSetters:Ljava/util/Map;

    .line 32
    .line 33
    new-instance p1, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->auxiliaryTypes:Ljava/util/Map;

    .line 39
    .line 40
    new-instance p1, Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredFieldCacheEntries:Ljava/util/Map;

    .line 46
    .line 47
    new-instance p1, Ljava/util/HashSet;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredFieldCacheFields:Ljava/util/Set;

    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    iput-boolean p1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->fieldCacheCanAppendEntries:Z

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public cache(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldCacheEntry;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldCacheEntry;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredFieldCacheEntries:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    iget-boolean v1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->fieldCacheCanAppendEntries:Z

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    :goto_0
    new-instance v1, Lnet/bytebuddy/implementation/Implementation$Context$Default$CacheValueField;

    .line 26
    .line 27
    iget-object v2, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 28
    .line 29
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v4, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->suffix:Ljava/lang/String;

    .line 34
    .line 35
    add-int/lit8 v5, p1, 0x1

    .line 36
    .line 37
    invoke-direct {v1, v2, v3, v4, p1}, Lnet/bytebuddy/implementation/Implementation$Context$Default$CacheValueField;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredFieldCacheFields:Ljava/util/Set;

    .line 41
    .line 42
    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredFieldCacheEntries:Ljava/util/Map;

    .line 49
    .line 50
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_1
    move p1, v5

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const-string p1, "Cached values cannot be registered after defining the type initializer for "

    .line 57
    .line 58
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 59
    .line 60
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return-object p0
.end method

.method public drain(Lnet/bytebuddy/dynamic/scaffold/TypeInitializer$Drain;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->fieldCacheCanAppendEntries:Z

    .line 3
    .line 4
    iget-object v0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 5
    .line 6
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredFieldCacheEntries:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 33
    .line 34
    invoke-interface {v3}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 43
    .line 44
    invoke-interface {v3}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 53
    .line 54
    invoke-interface {v3}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 63
    .line 64
    invoke-interface {v3}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getGenericSignature()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    sget-object v9, Lnet/bytebuddy/description/field/FieldDescription;->NO_DEFAULT_VALUE:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v4, p2

    .line 71
    invoke-virtual/range {v4 .. v9}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    if-eqz p2, :cond_0

    .line 76
    .line 77
    invoke-virtual {p2}, Lnet/bytebuddy/jar/asm/FieldVisitor;->visitEnd()V

    .line 78
    .line 79
    .line 80
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    check-cast p2, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldCacheEntry;

    .line 85
    .line 86
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Lnet/bytebuddy/description/field/FieldDescription;

    .line 91
    .line 92
    invoke-virtual {p2, v2}, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldCacheEntry;->storeIn(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-interface {v0, p2}, Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;->expandWith(Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    move-object v0, p2

    .line 101
    :cond_0
    move-object p2, v4

    .line 102
    goto :goto_0

    .line 103
    :cond_1
    move-object v4, p2

    .line 104
    invoke-interface {p1, v4, v0, p0}, Lnet/bytebuddy/dynamic/scaffold/TypeInitializer$Drain;->apply(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/Implementation$Context;)V

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredAccessorMethods:Ljava/util/Map;

    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    if-eqz p2, :cond_2

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    check-cast p2, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;

    .line 128
    .line 129
    invoke-interface {p2, v4, p0, p3}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;->apply(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_2
    iget-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredGetters:Ljava/util/Map;

    .line 134
    .line 135
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    if-eqz p2, :cond_3

    .line 148
    .line 149
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    check-cast p2, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;

    .line 154
    .line 155
    invoke-interface {p2, v4, p0, p3}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;->apply(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_3
    iget-object p1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredSetters:Ljava/util/Map;

    .line 160
    .line 161
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    if-eqz p2, :cond_4

    .line 174
    .line 175
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    check-cast p2, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;

    .line 180
    .line 181
    invoke-interface {p2, v4, p0, p3}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;->apply(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_4
    return-void
.end method

.method public getAuxiliaryTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->auxiliaryTypes:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public isEnabled()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public register(Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;)Lnet/bytebuddy/description/type/TypeDescription;
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->auxiliaryTypes:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lnet/bytebuddy/dynamic/DynamicType;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 12
    .line 13
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    invoke-interface {v0, v1, p1}, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;->name(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->auxiliaryClassFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 20
    .line 21
    invoke-interface {p1, v0, v1, p0}, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;->make(Ljava/lang/String;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/MethodAccessorFactory;)Lnet/bytebuddy/dynamic/DynamicType;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->auxiliaryTypes:Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public registerAccessorFor(Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredAccessorMethods:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Context$Default$AccessorMethodDelegation;

    .line 12
    .line 13
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    iget-object v2, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->suffix:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p2, p1}, Lnet/bytebuddy/implementation/Implementation$Context$Default$AccessorMethodDelegation;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v0, p2}, Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;->with(Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;)Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredAccessorMethods:Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;->getMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public registerGetterFor(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredGetters:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;

    .line 12
    .line 13
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    iget-object v2, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->suffix:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p2, p1}, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;Lnet/bytebuddy/description/field/FieldDescription;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v0, p2}, Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;->with(Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;)Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredGetters:Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;->getMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public registerSetterFor(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;)Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredSetters:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldSetterDelegation;

    .line 12
    .line 13
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView$AbstractBase;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    iget-object v2, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->suffix:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p2, p1}, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldSetterDelegation;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;Lnet/bytebuddy/description/field/FieldDescription;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v0, p2}, Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;->with(Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;)Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default;->registeredSetters:Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;->getMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
