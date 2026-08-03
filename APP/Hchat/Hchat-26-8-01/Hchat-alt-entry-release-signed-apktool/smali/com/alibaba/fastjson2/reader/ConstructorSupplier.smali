.class final Lcom/alibaba/fastjson2/reader/ConstructorSupplier;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field final constructor:Ljava/lang/reflect/Constructor;

.field final objectClass:Ljava/lang/Class;

.field final parameterCount:I

.field final useClassNewInstance:Z


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ConstructorSupplier;->constructor:Ljava/lang/reflect/Constructor;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ConstructorSupplier;->objectClass:Ljava/lang/Class;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iput v2, p0, Lcom/alibaba/fastjson2/reader/ConstructorSupplier;->parameterCount:I

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Class;->getModifiers()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v0, 0x0

    .line 46
    :goto_0
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/reader/ConstructorSupplier;->useClassNewInstance:Z

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 3

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/ConstructorSupplier;->useClassNewInstance:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ConstructorSupplier;->objectClass:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/reader/ConstructorSupplier;->parameterCount:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ConstructorSupplier;->constructor:Ljava/lang/reflect/Constructor;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    :try_start_1
    new-array v0, v2, [Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    return-object v0

    .line 34
    :goto_0
    const-string v1, "create instance error"

    .line 35
    .line 36
    invoke-static {v1, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    return-object v0
.end method
