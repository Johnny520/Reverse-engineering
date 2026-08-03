.class public final Lcom/google/gson/GsonBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final DEFAULT:Lcom/google/gson/GsonBuilder;

.field private static final DEFAULT_COMPLEX_MAP_KEYS:Z = false

.field static final DEFAULT_CONSTRUCTOR_CONSTRUCTOR:Lcom/google/gson/internal/ConstructorConstructor;

.field private static final DEFAULT_DATE_PATTERN:Ljava/lang/String;

.field private static final DEFAULT_ESCAPE_HTML:Z = true

.field private static final DEFAULT_FIELD_NAMING_STRATEGY:Lcom/google/gson/FieldNamingStrategy;

.field private static final DEFAULT_FORMATTING_STYLE:Lcom/google/gson/FormattingStyle;

.field static final DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

.field private static final DEFAULT_JSON_NON_EXECUTABLE:Z = false

.field private static final DEFAULT_NUMBER_TO_NUMBER_STRATEGY:Lcom/google/gson/ToNumberStrategy;

.field private static final DEFAULT_OBJECT_TO_NUMBER_STRATEGY:Lcom/google/gson/ToNumberStrategy;

.field private static final DEFAULT_SERIALIZE_NULLS:Z = false

.field private static final DEFAULT_SPECIALIZE_FLOAT_VALUES:Z = false

.field private static final DEFAULT_STRICTNESS:Lcom/google/gson/Strictness; = null

.field static final DEFAULT_TYPE_ADAPTER_FACTORIES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/gson/TypeAdapterFactory;",
            ">;"
        }
    .end annotation
.end field

.field private static final DEFAULT_USE_JDK_UNSAFE:Z = true


# instance fields
.field complexMapKeySerialization:Z

.field datePattern:Ljava/lang/String;

.field dateStyle:I

.field escapeHtmlChars:Z

.field excluder:Lcom/google/gson/internal/Excluder;

.field final factories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/gson/TypeAdapterFactory;",
            ">;"
        }
    .end annotation
.end field

.field fieldNamingPolicy:Lcom/google/gson/FieldNamingStrategy;

.field formattingStyle:Lcom/google/gson/FormattingStyle;

.field generateNonExecutableJson:Z

.field final hierarchyFactories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/gson/TypeAdapterFactory;",
            ">;"
        }
    .end annotation
.end field

.field final instanceCreators:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Lcom/google/gson/InstanceCreator<",
            "*>;>;"
        }
    .end annotation
.end field

.field longSerializationPolicy:Lcom/google/gson/LongSerializationPolicy;

.field numberToNumberStrategy:Lcom/google/gson/ToNumberStrategy;

.field objectToNumberStrategy:Lcom/google/gson/ToNumberStrategy;

.field final reflectionFilters:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/google/gson/ReflectionAccessFilter;",
            ">;"
        }
    .end annotation
.end field

.field serializeNulls:Z

.field serializeSpecialFloatingPointValues:Z

.field strictness:Lcom/google/gson/Strictness;

.field timeStyle:I

.field useJdkUnsafe:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lcom/google/gson/FormattingStyle;->COMPACT:Lcom/google/gson/FormattingStyle;

    sput-object v0, Lcom/google/gson/GsonBuilder;->DEFAULT_FORMATTING_STYLE:Lcom/google/gson/FormattingStyle;

    const/4 v0, 0x0

    sput-object v0, Lcom/google/gson/GsonBuilder;->DEFAULT_DATE_PATTERN:Ljava/lang/String;

    sget-object v0, Lcom/google/gson/FieldNamingPolicy;->IDENTITY:Lcom/google/gson/FieldNamingPolicy;

    sput-object v0, Lcom/google/gson/GsonBuilder;->DEFAULT_FIELD_NAMING_STRATEGY:Lcom/google/gson/FieldNamingStrategy;

    sget-object v0, Lcom/google/gson/ToNumberPolicy;->DOUBLE:Lcom/google/gson/ToNumberPolicy;

    sput-object v0, Lcom/google/gson/GsonBuilder;->DEFAULT_OBJECT_TO_NUMBER_STRATEGY:Lcom/google/gson/ToNumberStrategy;

    sget-object v0, Lcom/google/gson/ToNumberPolicy;->LAZILY_PARSED_NUMBER:Lcom/google/gson/ToNumberPolicy;

    sput-object v0, Lcom/google/gson/GsonBuilder;->DEFAULT_NUMBER_TO_NUMBER_STRATEGY:Lcom/google/gson/ToNumberStrategy;

    new-instance v0, Lcom/google/gson/internal/ConstructorConstructor;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/gson/internal/ConstructorConstructor;-><init>(Ljava/util/Map;ZLjava/util/List;)V

    sput-object v0, Lcom/google/gson/GsonBuilder;->DEFAULT_CONSTRUCTOR_CONSTRUCTOR:Lcom/google/gson/internal/ConstructorConstructor;

    new-instance v1, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    invoke-direct {v1, v0}, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;-><init>(Lcom/google/gson/internal/ConstructorConstructor;)V

    sput-object v1, Lcom/google/gson/GsonBuilder;->DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY:Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;

    new-instance v2, Lcom/google/gson/GsonBuilder;

    invoke-direct {v2}, Lcom/google/gson/GsonBuilder;-><init>()V

    sput-object v2, Lcom/google/gson/GsonBuilder;->DEFAULT:Lcom/google/gson/GsonBuilder;

    invoke-virtual {v2, v0, v1}, Lcom/google/gson/GsonBuilder;->createFactories(Lcom/google/gson/internal/ConstructorConstructor;Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/google/gson/GsonBuilder;->DEFAULT_TYPE_ADAPTER_FACTORIES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lcom/google/gson/internal/Excluder;->DEFAULT:Lcom/google/gson/internal/Excluder;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    .line 3
    sget-object v0, Lcom/google/gson/LongSerializationPolicy;->DEFAULT:Lcom/google/gson/LongSerializationPolicy;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->longSerializationPolicy:Lcom/google/gson/LongSerializationPolicy;

    .line 4
    sget-object v0, Lcom/google/gson/GsonBuilder;->DEFAULT_FIELD_NAMING_STRATEGY:Lcom/google/gson/FieldNamingStrategy;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->fieldNamingPolicy:Lcom/google/gson/FieldNamingStrategy;

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->instanceCreators:Ljava/util/Map;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->factories:Ljava/util/List;

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->serializeNulls:Z

    .line 9
    sget-object v1, Lcom/google/gson/GsonBuilder;->DEFAULT_DATE_PATTERN:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    const/4 v1, 0x2

    .line 10
    iput v1, p0, Lcom/google/gson/GsonBuilder;->dateStyle:I

    .line 11
    iput v1, p0, Lcom/google/gson/GsonBuilder;->timeStyle:I

    .line 12
    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->complexMapKeySerialization:Z

    .line 13
    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z

    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Lcom/google/gson/GsonBuilder;->escapeHtmlChars:Z

    .line 15
    sget-object v2, Lcom/google/gson/GsonBuilder;->DEFAULT_FORMATTING_STYLE:Lcom/google/gson/FormattingStyle;

    iput-object v2, p0, Lcom/google/gson/GsonBuilder;->formattingStyle:Lcom/google/gson/FormattingStyle;

    .line 16
    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->generateNonExecutableJson:Z

    .line 17
    sget-object v0, Lcom/google/gson/GsonBuilder;->DEFAULT_STRICTNESS:Lcom/google/gson/Strictness;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->strictness:Lcom/google/gson/Strictness;

    .line 18
    iput-boolean v1, p0, Lcom/google/gson/GsonBuilder;->useJdkUnsafe:Z

    .line 19
    sget-object v0, Lcom/google/gson/GsonBuilder;->DEFAULT_OBJECT_TO_NUMBER_STRATEGY:Lcom/google/gson/ToNumberStrategy;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->objectToNumberStrategy:Lcom/google/gson/ToNumberStrategy;

    .line 20
    sget-object v0, Lcom/google/gson/GsonBuilder;->DEFAULT_NUMBER_TO_NUMBER_STRATEGY:Lcom/google/gson/ToNumberStrategy;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->numberToNumberStrategy:Lcom/google/gson/ToNumberStrategy;

    .line 21
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->reflectionFilters:Ljava/util/ArrayDeque;

    return-void
.end method

.method public constructor <init>(Lcom/google/gson/Gson;)V
    .locals 6

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    sget-object v0, Lcom/google/gson/internal/Excluder;->DEFAULT:Lcom/google/gson/internal/Excluder;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    .line 24
    sget-object v0, Lcom/google/gson/LongSerializationPolicy;->DEFAULT:Lcom/google/gson/LongSerializationPolicy;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->longSerializationPolicy:Lcom/google/gson/LongSerializationPolicy;

    .line 25
    sget-object v0, Lcom/google/gson/GsonBuilder;->DEFAULT_FIELD_NAMING_STRATEGY:Lcom/google/gson/FieldNamingStrategy;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->fieldNamingPolicy:Lcom/google/gson/FieldNamingStrategy;

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->instanceCreators:Ljava/util/Map;

    .line 27
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/gson/GsonBuilder;->factories:Ljava/util/List;

    .line 28
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/google/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;

    const/4 v3, 0x0

    .line 29
    iput-boolean v3, p0, Lcom/google/gson/GsonBuilder;->serializeNulls:Z

    .line 30
    sget-object v4, Lcom/google/gson/GsonBuilder;->DEFAULT_DATE_PATTERN:Ljava/lang/String;

    iput-object v4, p0, Lcom/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    const/4 v4, 0x2

    .line 31
    iput v4, p0, Lcom/google/gson/GsonBuilder;->dateStyle:I

    .line 32
    iput v4, p0, Lcom/google/gson/GsonBuilder;->timeStyle:I

    .line 33
    iput-boolean v3, p0, Lcom/google/gson/GsonBuilder;->complexMapKeySerialization:Z

    .line 34
    iput-boolean v3, p0, Lcom/google/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z

    const/4 v4, 0x1

    .line 35
    iput-boolean v4, p0, Lcom/google/gson/GsonBuilder;->escapeHtmlChars:Z

    .line 36
    sget-object v5, Lcom/google/gson/GsonBuilder;->DEFAULT_FORMATTING_STYLE:Lcom/google/gson/FormattingStyle;

    iput-object v5, p0, Lcom/google/gson/GsonBuilder;->formattingStyle:Lcom/google/gson/FormattingStyle;

    .line 37
    iput-boolean v3, p0, Lcom/google/gson/GsonBuilder;->generateNonExecutableJson:Z

    .line 38
    sget-object v3, Lcom/google/gson/GsonBuilder;->DEFAULT_STRICTNESS:Lcom/google/gson/Strictness;

    iput-object v3, p0, Lcom/google/gson/GsonBuilder;->strictness:Lcom/google/gson/Strictness;

    .line 39
    iput-boolean v4, p0, Lcom/google/gson/GsonBuilder;->useJdkUnsafe:Z

    .line 40
    sget-object v3, Lcom/google/gson/GsonBuilder;->DEFAULT_OBJECT_TO_NUMBER_STRATEGY:Lcom/google/gson/ToNumberStrategy;

    iput-object v3, p0, Lcom/google/gson/GsonBuilder;->objectToNumberStrategy:Lcom/google/gson/ToNumberStrategy;

    .line 41
    sget-object v3, Lcom/google/gson/GsonBuilder;->DEFAULT_NUMBER_TO_NUMBER_STRATEGY:Lcom/google/gson/ToNumberStrategy;

    iput-object v3, p0, Lcom/google/gson/GsonBuilder;->numberToNumberStrategy:Lcom/google/gson/ToNumberStrategy;

    .line 42
    new-instance v3, Ljava/util/ArrayDeque;

    invoke-direct {v3}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v3, p0, Lcom/google/gson/GsonBuilder;->reflectionFilters:Ljava/util/ArrayDeque;

    .line 43
    iget-object v4, p1, Lcom/google/gson/Gson;->excluder:Lcom/google/gson/internal/Excluder;

    iput-object v4, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    .line 44
    iget-object v4, p1, Lcom/google/gson/Gson;->fieldNamingStrategy:Lcom/google/gson/FieldNamingStrategy;

    iput-object v4, p0, Lcom/google/gson/GsonBuilder;->fieldNamingPolicy:Lcom/google/gson/FieldNamingStrategy;

    .line 45
    iget-object v4, p1, Lcom/google/gson/Gson;->instanceCreators:Ljava/util/Map;

    invoke-interface {v0, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 46
    iget-boolean v0, p1, Lcom/google/gson/Gson;->serializeNulls:Z

    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->serializeNulls:Z

    .line 47
    iget-boolean v0, p1, Lcom/google/gson/Gson;->complexMapKeySerialization:Z

    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->complexMapKeySerialization:Z

    .line 48
    iget-boolean v0, p1, Lcom/google/gson/Gson;->generateNonExecutableJson:Z

    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->generateNonExecutableJson:Z

    .line 49
    iget-boolean v0, p1, Lcom/google/gson/Gson;->htmlSafe:Z

    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->escapeHtmlChars:Z

    .line 50
    iget-object v0, p1, Lcom/google/gson/Gson;->formattingStyle:Lcom/google/gson/FormattingStyle;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->formattingStyle:Lcom/google/gson/FormattingStyle;

    .line 51
    iget-object v0, p1, Lcom/google/gson/Gson;->strictness:Lcom/google/gson/Strictness;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->strictness:Lcom/google/gson/Strictness;

    .line 52
    iget-boolean v0, p1, Lcom/google/gson/Gson;->serializeSpecialFloatingPointValues:Z

    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z

    .line 53
    iget-object v0, p1, Lcom/google/gson/Gson;->longSerializationPolicy:Lcom/google/gson/LongSerializationPolicy;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->longSerializationPolicy:Lcom/google/gson/LongSerializationPolicy;

    .line 54
    iget-object v0, p1, Lcom/google/gson/Gson;->datePattern:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    .line 55
    iget v0, p1, Lcom/google/gson/Gson;->dateStyle:I

    iput v0, p0, Lcom/google/gson/GsonBuilder;->dateStyle:I

    .line 56
    iget v0, p1, Lcom/google/gson/Gson;->timeStyle:I

    iput v0, p0, Lcom/google/gson/GsonBuilder;->timeStyle:I

    .line 57
    iget-object v0, p1, Lcom/google/gson/Gson;->builderFactories:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 58
    iget-object v0, p1, Lcom/google/gson/Gson;->builderHierarchyFactories:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 59
    iget-boolean v0, p1, Lcom/google/gson/Gson;->useJdkUnsafe:Z

    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->useJdkUnsafe:Z

    .line 60
    iget-object v0, p1, Lcom/google/gson/Gson;->objectToNumberStrategy:Lcom/google/gson/ToNumberStrategy;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->objectToNumberStrategy:Lcom/google/gson/ToNumberStrategy;

    .line 61
    iget-object v0, p1, Lcom/google/gson/Gson;->numberToNumberStrategy:Lcom/google/gson/ToNumberStrategy;

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->numberToNumberStrategy:Lcom/google/gson/ToNumberStrategy;

    .line 62
    iget-object p1, p1, Lcom/google/gson/Gson;->reflectionFilters:Ljava/util/List;

    invoke-virtual {v3, p1}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private addDateTypeAdapters(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/gson/TypeAdapterFactory;",
            ">;)V"
        }
    .end annotation

    sget-boolean v0, Lcom/google/gson/internal/sql/SqlTypesSupport;->SUPPORTS_SQL_TYPES:Z

    iget-object v1, p0, Lcom/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;->DATE:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    iget-object v3, p0, Lcom/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;->createAdapterFactory(Ljava/lang/String;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v1

    if-eqz v0, :cond_0

    sget-object v2, Lcom/google/gson/internal/sql/SqlTypesSupport;->TIMESTAMP_DATE_TYPE:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    iget-object v3, p0, Lcom/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;->createAdapterFactory(Ljava/lang/String;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v2

    sget-object v3, Lcom/google/gson/internal/sql/SqlTypesSupport;->DATE_DATE_TYPE:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    iget-object v4, p0, Lcom/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;->createAdapterFactory(Ljava/lang/String;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v3

    goto :goto_1

    :cond_0
    move-object v3, v2

    goto :goto_1

    :cond_1
    iget v1, p0, Lcom/google/gson/GsonBuilder;->dateStyle:I

    const/4 v3, 0x2

    if-ne v1, v3, :cond_3

    iget v4, p0, Lcom/google/gson/GsonBuilder;->timeStyle:I

    if-eq v4, v3, :cond_2

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :goto_0
    sget-object v3, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;->DATE:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    iget v4, p0, Lcom/google/gson/GsonBuilder;->timeStyle:I

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;->createAdapterFactory(II)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v1

    if-eqz v0, :cond_0

    sget-object v2, Lcom/google/gson/internal/sql/SqlTypesSupport;->TIMESTAMP_DATE_TYPE:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    iget v3, p0, Lcom/google/gson/GsonBuilder;->dateStyle:I

    iget v4, p0, Lcom/google/gson/GsonBuilder;->timeStyle:I

    invoke-virtual {v2, v3, v4}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;->createAdapterFactory(II)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v2

    sget-object v3, Lcom/google/gson/internal/sql/SqlTypesSupport;->DATE_DATE_TYPE:Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;

    iget v4, p0, Lcom/google/gson/GsonBuilder;->dateStyle:I

    iget v5, p0, Lcom/google/gson/GsonBuilder;->timeStyle:I

    invoke-virtual {v3, v4, v5}, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter$DateType;->createAdapterFactory(II)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v3

    :goto_1
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_4

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-void
.end method

.method private addUserDefinedAdapters(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/gson/TypeAdapterFactory;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    iget-object v0, p0, Lcom/google/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/google/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    return-void
.end method

.method private static checkDateFormatStyle(I)I
    .locals 3

    if-ltz p0, :cond_0

    const/4 v0, 0x3

    if-gt p0, v0, :cond_0

    return p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid style: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private doubleAdapter()Lcom/google/gson/TypeAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/gson/internal/bind/TypeAdapters;->DOUBLE:Lcom/google/gson/TypeAdapter;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/gson/internal/bind/TypeAdapters;->DOUBLE_STRICT:Lcom/google/gson/TypeAdapter;

    :goto_0
    return-object v0
.end method

.method private floatAdapter()Lcom/google/gson/TypeAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/gson/internal/bind/TypeAdapters;->FLOAT:Lcom/google/gson/TypeAdapter;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/gson/internal/bind/TypeAdapters;->FLOAT_STRICT:Lcom/google/gson/TypeAdapter;

    :goto_0
    return-object v0
.end method

.method private static hasNonOverridableAdapter(Ljava/lang/reflect/Type;)Z
    .locals 1

    const-class v0, Ljava/lang/Object;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static newImmutableList(Ljava/util/Collection;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TE;>;)",
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public addDeserializationExclusionStrategy(Lcom/google/gson/ExclusionStrategy;)Lcom/google/gson/GsonBuilder;
    .locals 3
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/gson/internal/Excluder;->withExclusionStrategy(Lcom/google/gson/ExclusionStrategy;ZZ)Lcom/google/gson/internal/Excluder;

    move-result-object p1

    iput-object p1, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    return-object p0
.end method

.method public addReflectionAccessFilter(Lcom/google/gson/ReflectionAccessFilter;)Lcom/google/gson/GsonBuilder;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/gson/GsonBuilder;->reflectionFilters:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    return-object p0
.end method

.method public addSerializationExclusionStrategy(Lcom/google/gson/ExclusionStrategy;)Lcom/google/gson/GsonBuilder;
    .locals 3
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/google/gson/internal/Excluder;->withExclusionStrategy(Lcom/google/gson/ExclusionStrategy;ZZ)Lcom/google/gson/internal/Excluder;

    move-result-object p1

    iput-object p1, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    return-object p0
.end method

.method public create()Lcom/google/gson/Gson;
    .locals 1

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0, p0}, Lcom/google/gson/Gson;-><init>(Lcom/google/gson/GsonBuilder;)V

    return-object v0
.end method

.method public createFactories(Lcom/google/gson/internal/ConstructorConstructor;Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/internal/ConstructorConstructor;",
            "Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/gson/TypeAdapterFactory;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->JSON_ELEMENT_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/gson/GsonBuilder;->objectToNumberStrategy:Lcom/google/gson/ToNumberStrategy;

    invoke-static {v1}, Lcom/google/gson/internal/bind/ObjectTypeAdapter;->getFactory(Lcom/google/gson/ToNumberStrategy;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-direct {p0, v0}, Lcom/google/gson/GsonBuilder;->addUserDefinedAdapters(Ljava/util/List;)V

    invoke-direct {p0, v0}, Lcom/google/gson/GsonBuilder;->addDateTypeAdapters(Ljava/util/List;)V

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->STRING_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->INTEGER_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->BOOLEAN_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->BYTE_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->SHORT_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/gson/GsonBuilder;->longSerializationPolicy:Lcom/google/gson/LongSerializationPolicy;

    invoke-virtual {v1}, Lcom/google/gson/LongSerializationPolicy;->typeAdapter()Lcom/google/gson/TypeAdapter;

    move-result-object v1

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Long;

    invoke-static {v2, v3, v1}, Lcom/google/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Double;

    invoke-direct {p0}, Lcom/google/gson/GsonBuilder;->doubleAdapter()Lcom/google/gson/TypeAdapter;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/google/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Float;

    invoke-direct {p0}, Lcom/google/gson/GsonBuilder;->floatAdapter()Lcom/google/gson/TypeAdapter;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/google/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/google/gson/GsonBuilder;->numberToNumberStrategy:Lcom/google/gson/ToNumberStrategy;

    invoke-static {v2}, Lcom/google/gson/internal/bind/NumberTypeAdapter;->getFactory(Lcom/google/gson/ToNumberStrategy;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Lcom/google/gson/internal/bind/TypeAdapters;->ATOMIC_INTEGER_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v2, Lcom/google/gson/internal/bind/TypeAdapters;->ATOMIC_BOOLEAN_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-class v2, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v1}, Lcom/google/gson/internal/bind/TypeAdapters;->atomicLongAdapter(Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapter;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-class v2, Ljava/util/concurrent/atomic/AtomicLongArray;

    invoke-static {v1}, Lcom/google/gson/internal/bind/TypeAdapters;->atomicLongArrayAdapter(Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapter;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/google/gson/internal/bind/TypeAdapters;->newFactory(Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->ATOMIC_INTEGER_ARRAY_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->CHARACTER_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->STRING_BUILDER_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->STRING_BUFFER_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->BIG_DECIMAL_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->BIG_INTEGER_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->LAZILY_PARSED_NUMBER_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->URL_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->URI_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->UUID_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->CURRENCY_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->LOCALE_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->INET_ADDRESS_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->BIT_SET_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/DefaultDateTypeAdapter;->DEFAULT_STYLE_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->CALENDAR_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/google/gson/internal/bind/TypeAdapters;->javaTimeTypeAdapterFactory()Lcom/google/gson/TypeAdapterFactory;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object v1, Lcom/google/gson/internal/sql/SqlTypesSupport;->SQL_TYPE_FACTORIES:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    sget-object v1, Lcom/google/gson/internal/bind/ArrayTypeAdapter;->FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->CLASS_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;

    invoke-direct {v1, p1}, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;-><init>(Lcom/google/gson/internal/ConstructorConstructor;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;

    iget-boolean v2, p0, Lcom/google/gson/GsonBuilder;->complexMapKeySerialization:Z

    invoke-direct {v1, p1, v2}, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;-><init>(Lcom/google/gson/internal/ConstructorConstructor;Z)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/google/gson/internal/bind/TypeAdapters;->ENUM_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;

    iget-object v4, p0, Lcom/google/gson/GsonBuilder;->fieldNamingPolicy:Lcom/google/gson/FieldNamingStrategy;

    iget-object v5, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    iget-object v2, p0, Lcom/google/gson/GsonBuilder;->reflectionFilters:Ljava/util/ArrayDeque;

    invoke-static {v2}, Lcom/google/gson/GsonBuilder;->newImmutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v7

    move-object v2, v1

    move-object v3, p1

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;-><init>(Lcom/google/gson/internal/ConstructorConstructor;Lcom/google/gson/FieldNamingStrategy;Lcom/google/gson/internal/Excluder;Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->trimToSize()V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public disableHtmlEscaping()Lcom/google/gson/GsonBuilder;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->escapeHtmlChars:Z

    return-object p0
.end method

.method public disableInnerClassSerialization()Lcom/google/gson/GsonBuilder;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    iget-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    invoke-virtual {v0}, Lcom/google/gson/internal/Excluder;->disableInnerClassSerialization()Lcom/google/gson/internal/Excluder;

    move-result-object v0

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    return-object p0
.end method

.method public disableJdkUnsafe()Lcom/google/gson/GsonBuilder;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->useJdkUnsafe:Z

    return-object p0
.end method

.method public enableComplexMapKeySerialization()Lcom/google/gson/GsonBuilder;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->complexMapKeySerialization:Z

    return-object p0
.end method

.method public varargs excludeFieldsWithModifiers([I)Lcom/google/gson/GsonBuilder;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    invoke-virtual {v0, p1}, Lcom/google/gson/internal/Excluder;->withModifiers([I)Lcom/google/gson/internal/Excluder;

    move-result-object p1

    iput-object p1, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    return-object p0
.end method

.method public excludeFieldsWithoutExposeAnnotation()Lcom/google/gson/GsonBuilder;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    iget-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    invoke-virtual {v0}, Lcom/google/gson/internal/Excluder;->excludeFieldsWithoutExposeAnnotation()Lcom/google/gson/internal/Excluder;

    move-result-object v0

    iput-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    return-object p0
.end method

.method public generateNonExecutableJson()Lcom/google/gson/GsonBuilder;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->generateNonExecutableJson:Z

    return-object p0
.end method

.method public registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;
    .locals 3
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p2, Lcom/google/gson/JsonSerializer;

    if-nez v0, :cond_1

    instance-of v1, p2, Lcom/google/gson/JsonDeserializer;

    if-nez v1, :cond_1

    instance-of v1, p2, Lcom/google/gson/InstanceCreator;

    if-nez v1, :cond_1

    instance-of v1, p2, Lcom/google/gson/TypeAdapter;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " does not implement any supported type adapter class or interface"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lcom/google/gson/GsonBuilder;->hasNonOverridableAdapter(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-nez v1, :cond_6

    instance-of v1, p2, Lcom/google/gson/InstanceCreator;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/gson/GsonBuilder;->instanceCreators:Ljava/util/Map;

    move-object v2, p2

    check-cast v2, Lcom/google/gson/InstanceCreator;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-nez v0, :cond_3

    instance-of v0, p2, Lcom/google/gson/JsonDeserializer;

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    iget-object v1, p0, Lcom/google/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-static {v0, p2}, Lcom/google/gson/internal/bind/TreeTypeAdapter;->newFactoryWithMatchRawType(Lcom/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    instance-of v0, p2, Lcom/google/gson/TypeAdapter;

    if-eqz v0, :cond_5

    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p1

    check-cast p2, Lcom/google/gson/TypeAdapter;

    invoke-static {p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters;->newFactory(Lcom/google/gson/reflect/TypeToken;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object p1

    iget-object p2, p0, Lcom/google/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object p0

    :cond_6
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot override built-in adapter for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public registerTypeAdapterFactory(Lcom/google/gson/TypeAdapterFactory;)Lcom/google/gson/GsonBuilder;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public registerTypeHierarchyAdapter(Ljava/lang/Class;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;
    .locals 2
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/gson/GsonBuilder;"
        }
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p2, Lcom/google/gson/JsonSerializer;

    if-nez v0, :cond_1

    instance-of v1, p2, Lcom/google/gson/JsonDeserializer;

    if-nez v1, :cond_1

    instance-of v1, p2, Lcom/google/gson/TypeAdapter;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " does not implement any supported type adapter class or interface"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    instance-of v1, p2, Lcom/google/gson/JsonDeserializer;

    if-nez v1, :cond_2

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/google/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;

    invoke-static {p1, p2}, Lcom/google/gson/internal/bind/TreeTypeAdapter;->newTypeHierarchyFactory(Ljava/lang/Class;Ljava/lang/Object;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    instance-of v0, p2, Lcom/google/gson/TypeAdapter;

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/gson/TypeAdapter;

    invoke-static {p1, p2}, Lcom/google/gson/internal/bind/TypeAdapters;->newTypeHierarchyFactory(Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;

    move-result-object p1

    iget-object p2, p0, Lcom/google/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object p0
.end method

.method public serializeNulls()Lcom/google/gson/GsonBuilder;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->serializeNulls:Z

    return-object p0
.end method

.method public serializeSpecialFloatingPointValues()Lcom/google/gson/GsonBuilder;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z

    return-object p0
.end method

.method public setDateFormat(I)Lcom/google/gson/GsonBuilder;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    invoke-static {p1}, Lcom/google/gson/GsonBuilder;->checkDateFormatStyle(I)I

    move-result p1

    iput p1, p0, Lcom/google/gson/GsonBuilder;->dateStyle:I

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    return-object p0
.end method

.method public setDateFormat(II)Lcom/google/gson/GsonBuilder;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .line 6
    invoke-static {p1}, Lcom/google/gson/GsonBuilder;->checkDateFormatStyle(I)I

    move-result p1

    iput p1, p0, Lcom/google/gson/GsonBuilder;->dateStyle:I

    .line 7
    invoke-static {p2}, Lcom/google/gson/GsonBuilder;->checkDateFormatStyle(I)I

    move-result p1

    iput p1, p0, Lcom/google/gson/GsonBuilder;->timeStyle:I

    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lcom/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    return-object p0
.end method

.method public setDateFormat(Ljava/lang/String;)Lcom/google/gson/GsonBuilder;
    .locals 4
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-direct {v0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The date pattern \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' is not valid"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 3
    :cond_0
    :goto_0
    iput-object p1, p0, Lcom/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    return-object p0
.end method

.method public varargs setExclusionStrategies([Lcom/google/gson/ExclusionStrategy;)Lcom/google/gson/GsonBuilder;
    .locals 5
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    iget-object v3, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v4, v4}, Lcom/google/gson/internal/Excluder;->withExclusionStrategy(Lcom/google/gson/ExclusionStrategy;ZZ)Lcom/google/gson/internal/Excluder;

    move-result-object v2

    iput-object v2, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public setFieldNamingPolicy(Lcom/google/gson/FieldNamingPolicy;)Lcom/google/gson/GsonBuilder;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/gson/GsonBuilder;->setFieldNamingStrategy(Lcom/google/gson/FieldNamingStrategy;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    return-object p1
.end method

.method public setFieldNamingStrategy(Lcom/google/gson/FieldNamingStrategy;)Lcom/google/gson/GsonBuilder;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/gson/FieldNamingStrategy;

    iput-object p1, p0, Lcom/google/gson/GsonBuilder;->fieldNamingPolicy:Lcom/google/gson/FieldNamingStrategy;

    return-object p0
.end method

.method public setFormattingStyle(Lcom/google/gson/FormattingStyle;)Lcom/google/gson/GsonBuilder;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/gson/GsonBuilder;->formattingStyle:Lcom/google/gson/FormattingStyle;

    return-object p0
.end method

.method public setLenient()Lcom/google/gson/GsonBuilder;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    .annotation build Lcom/google/errorprone/annotations/InlineMe;
        imports = {
            "com.google.gson.Strictness"
        }
        replacement = "this.setStrictness(Strictness.LENIENT)"
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lcom/google/gson/Strictness;->LENIENT:Lcom/google/gson/Strictness;

    invoke-virtual {p0, v0}, Lcom/google/gson/GsonBuilder;->setStrictness(Lcom/google/gson/Strictness;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setLongSerializationPolicy(Lcom/google/gson/LongSerializationPolicy;)Lcom/google/gson/GsonBuilder;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/gson/GsonBuilder;->longSerializationPolicy:Lcom/google/gson/LongSerializationPolicy;

    return-object p0
.end method

.method public setNumberToNumberStrategy(Lcom/google/gson/ToNumberStrategy;)Lcom/google/gson/GsonBuilder;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/gson/ToNumberStrategy;

    iput-object p1, p0, Lcom/google/gson/GsonBuilder;->numberToNumberStrategy:Lcom/google/gson/ToNumberStrategy;

    return-object p0
.end method

.method public setObjectToNumberStrategy(Lcom/google/gson/ToNumberStrategy;)Lcom/google/gson/GsonBuilder;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/gson/ToNumberStrategy;

    iput-object p1, p0, Lcom/google/gson/GsonBuilder;->objectToNumberStrategy:Lcom/google/gson/ToNumberStrategy;

    return-object p0
.end method

.method public setPrettyPrinting()Lcom/google/gson/GsonBuilder;
    .locals 1
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    sget-object v0, Lcom/google/gson/FormattingStyle;->PRETTY:Lcom/google/gson/FormattingStyle;

    invoke-virtual {p0, v0}, Lcom/google/gson/GsonBuilder;->setFormattingStyle(Lcom/google/gson/FormattingStyle;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setStrictness(Lcom/google/gson/Strictness;)Lcom/google/gson/GsonBuilder;
    .locals 0
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/gson/GsonBuilder;->strictness:Lcom/google/gson/Strictness;

    return-object p0
.end method

.method public setVersion(D)Lcom/google/gson/GsonBuilder;
    .locals 3
    .annotation build Lcom/google/errorprone/annotations/CanIgnoreReturnValue;
    .end annotation

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    cmpg-double v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/internal/Excluder;->withVersion(D)Lcom/google/gson/internal/Excluder;

    move-result-object p1

    iput-object p1, p0, Lcom/google/gson/GsonBuilder;->excluder:Lcom/google/gson/internal/Excluder;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid version: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
