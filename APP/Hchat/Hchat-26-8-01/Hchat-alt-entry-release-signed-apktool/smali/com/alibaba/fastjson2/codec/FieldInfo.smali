.class public Lcom/alibaba/fastjson2/codec/FieldInfo;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final BACKR_EFERENCE:J = 0x2000000000000000L

.field public static final CONTENT_AS:J = -0x8000000000000000L

.field public static final DISABLE_REFERENCE_DETECT:J = 0x400000000000000L

.field public static final DISABLE_SMART_MATCH:J = 0x200000000000000L

.field public static final DISABLE_UNSAFE:J = 0x80000000000000L

.field public static final FIELD_MASK:J = 0x10000000000000L

.field public static final RAW_VALUE_MASK:J = 0x4000000000000L

.field public static final READ_ONLY:J = 0x100000000000000L

.field public static final READ_USING_MASK:J = 0x8000000000000L

.field public static final RECORD:J = 0x4000000000000000L

.field public static final UNWRAPPED_MASK:J = 0x2000000000000L

.field public static final VALUE_MASK:J = 0x1000000000000L


# instance fields
.field public alternateNames:[Ljava/lang/String;

.field public arrayToMapDuplicateHandler:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public arrayToMapKey:Ljava/lang/String;

.field public contentAs:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public defaultValue:Ljava/lang/String;

.field public features:J

.field public fieldClassMixIn:Z

.field public fieldName:Ljava/lang/String;

.field public format:Ljava/lang/String;

.field public ignore:Z

.field public isTransient:Z

.field public keyUsing:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public label:Ljava/lang/String;

.field public locale:Ljava/util/Locale;

.field public ordinal:I

.field public readUsing:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public required:Z

.field public schema:Ljava/lang/String;

.field public valueUsing:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public writeUsing:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getInitArrayToMapDuplicateHandler()Ljava/util/function/BiConsumer;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->arrayToMapDuplicateHandler:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-class v2, Ljava/util/function/BiConsumer;

    .line 7
    .line 8
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/util/function/BiConsumer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    return-object v0

    .line 29
    :catch_0
    :cond_0
    return-object v1
.end method

.method public getInitReader()Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->readUsing:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-class v2, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 7
    .line 8
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lcom/alibaba/fastjson2/reader/ObjectReader;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    return-object v0

    .line 29
    :catch_0
    :cond_0
    return-object v1
.end method

.method public init()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->label:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput v1, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    iput-wide v2, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 14
    .line 15
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 16
    .line 17
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->required:Z

    .line 18
    .line 19
    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->writeUsing:Ljava/lang/Class;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->keyUsing:Ljava/lang/Class;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->valueUsing:Ljava/lang/Class;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->readUsing:Ljava/lang/Class;

    .line 28
    .line 29
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldClassMixIn:Z

    .line 30
    .line 31
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->isTransient:Z

    .line 32
    .line 33
    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->locale:Ljava/util/Locale;

    .line 36
    .line 37
    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->arrayToMapKey:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->arrayToMapDuplicateHandler:Ljava/lang/Class;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->contentAs:Ljava/lang/Class;

    .line 42
    .line 43
    return-void
.end method
