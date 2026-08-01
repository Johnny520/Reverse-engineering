.class public final Lorg/luckypray/dexkit/util/InstanceUtil;
.super Ljava/lang/Object;
.source "InstanceUtil.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInstanceUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstanceUtil.kt\norg/luckypray/dexkit/util/InstanceUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000e\u001a\u0006\u0012\u0002\u0008\u00030\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u0006\u0012\u0002\u0008\u00030\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u0006\u0012\u0002\u0008\u00030\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016R(\u0010\u0003\u001a\u001c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0005\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00070\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0008\u001a\u0018\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u0018\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lorg/luckypray/dexkit/util/InstanceUtil;",
        "",
        "()V",
        "constructorCache",
        "Lorg/luckypray/dexkit/util/WeakCache;",
        "Ljava/lang/Class;",
        "",
        "Ljava/lang/reflect/Constructor;",
        "fieldsCache",
        "Ljava/lang/reflect/Field;",
        "methodsCache",
        "Ljava/lang/reflect/Method;",
        "signCache",
        "",
        "getClassInstance",
        "classLoader",
        "Ljava/lang/ClassLoader;",
        "typeName",
        "dexClass",
        "Lorg/luckypray/dexkit/wrap/DexClass;",
        "getConstructorInstance",
        "dexMethod",
        "Lorg/luckypray/dexkit/wrap/DexMethod;",
        "getFieldInstance",
        "dexField",
        "Lorg/luckypray/dexkit/wrap/DexField;",
        "getMethodInstance",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

.field private static final constructorCache:Lorg/luckypray/dexkit/util/WeakCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/luckypray/dexkit/util/WeakCache<",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/reflect/Constructor<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final fieldsCache:Lorg/luckypray/dexkit/util/WeakCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/luckypray/dexkit/util/WeakCache<",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/reflect/Field;",
            ">;"
        }
    .end annotation
.end field

.field private static final methodsCache:Lorg/luckypray/dexkit/util/WeakCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/luckypray/dexkit/util/WeakCache<",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field

.field private static final signCache:Lorg/luckypray/dexkit/util/WeakCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/luckypray/dexkit/util/WeakCache<",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/luckypray/dexkit/util/InstanceUtil;

    invoke-direct {v0}, Lorg/luckypray/dexkit/util/InstanceUtil;-><init>()V

    sput-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    .line 38
    new-instance v0, Lorg/luckypray/dexkit/util/WeakCache;

    invoke-direct {v0}, Lorg/luckypray/dexkit/util/WeakCache;-><init>()V

    sput-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->constructorCache:Lorg/luckypray/dexkit/util/WeakCache;

    .line 39
    new-instance v0, Lorg/luckypray/dexkit/util/WeakCache;

    invoke-direct {v0}, Lorg/luckypray/dexkit/util/WeakCache;-><init>()V

    sput-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->fieldsCache:Lorg/luckypray/dexkit/util/WeakCache;

    .line 40
    new-instance v0, Lorg/luckypray/dexkit/util/WeakCache;

    invoke-direct {v0}, Lorg/luckypray/dexkit/util/WeakCache;-><init>()V

    sput-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->methodsCache:Lorg/luckypray/dexkit/util/WeakCache;

    .line 41
    new-instance v0, Lorg/luckypray/dexkit/util/WeakCache;

    invoke-direct {v0}, Lorg/luckypray/dexkit/util/WeakCache;-><init>()V

    sput-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->signCache:Lorg/luckypray/dexkit/util/WeakCache;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 4
    .param p1, "classLoader"    # Ljava/lang/ClassLoader;
    .param p2, "typeName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    const/4 v0, 0x0

    const-string v1, "[]"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p2, v1, v2, v3, v0}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    invoke-virtual {p2, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 52
    .local v0, "clazz":Ljava/lang/Class;
    invoke-static {v0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    return-object v1

    .line 54
    .end local v0    # "clazz":Ljava/lang/Class;
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :goto_0
    goto/16 :goto_1

    :sswitch_0
    const-string v0, "short"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    goto/16 :goto_2

    :sswitch_1
    const-string v0, "float"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    goto :goto_2

    :sswitch_2
    const-string v0, "boolean"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :sswitch_3
    const-string v0, "void"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 63
    :cond_3
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    goto :goto_2

    .line 54
    :sswitch_4
    const-string v0, "long"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    goto :goto_2

    :sswitch_5
    const-string v0, "char"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    goto :goto_2

    :sswitch_6
    const-string v0, "byte"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    goto :goto_2

    :sswitch_7
    const-string v0, "int"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    goto :goto_2

    :sswitch_8
    const-string v0, "double"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    goto :goto_2

    .line 64
    :goto_1
    invoke-virtual {p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 54
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_8
        0x197ef -> :sswitch_7
        0x2e6108 -> :sswitch_6
        0x2e9356 -> :sswitch_5
        0x32c67c -> :sswitch_4
        0x375194 -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch
.end method

.method public final getClassInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexClass;)Ljava/lang/Class;
    .locals 1
    .param p1, "classLoader"    # Ljava/lang/ClassLoader;
    .param p2, "dexClass"    # Lorg/luckypray/dexkit/wrap/DexClass;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dexClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexClass;->getTypeName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final getConstructorInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;)Ljava/lang/reflect/Constructor;
    .locals 8
    .param p1, "classLoader"    # Ljava/lang/ClassLoader;
    .param p2, "dexMethod"    # Lorg/luckypray/dexkit/wrap/DexMethod;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ")",
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dexMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->isConstructor()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 93
    nop

    .line 94
    :try_start_0
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .local v0, "clz":Lkotlin/jvm/internal/Ref$ObjectRef;
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 96
    :goto_0
    sget-object v1, Lorg/luckypray/dexkit/util/InstanceUtil;->constructorCache:Lorg/luckypray/dexkit/util/WeakCache;

    iget-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    const-string v3, "clz"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lorg/luckypray/dexkit/util/InstanceUtil$getConstructorInstance$declaredConstructors$1;

    invoke-direct {v3, v0}, Lorg/luckypray/dexkit/util/InstanceUtil$getConstructorInstance$declaredConstructors$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-virtual {v1, v2, v3}, Lorg/luckypray/dexkit/util/WeakCache;->get(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/reflect/Constructor;

    .line 97
    .local v1, "declaredConstructors":[Ljava/lang/reflect/Constructor;
    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 98
    .local v4, "constructor":Ljava/lang/reflect/Constructor;
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodSign()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lorg/luckypray/dexkit/util/InstanceUtil;->signCache:Lorg/luckypray/dexkit/util/WeakCache;

    new-instance v7, Lorg/luckypray/dexkit/util/InstanceUtil$getConstructorInstance$1;

    invoke-direct {v7, v4}, Lorg/luckypray/dexkit/util/InstanceUtil$getConstructorInstance$1;-><init>(Ljava/lang/reflect/Constructor;)V

    check-cast v7, Lkotlin/jvm/functions/Function0;

    invoke-virtual {v6, v4, v7}, Lorg/luckypray/dexkit/util/WeakCache;->get(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 99
    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 100
    return-object v4

    .line 97
    .end local v4    # "constructor":Ljava/lang/reflect/Constructor;
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 103
    .end local v1    # "declaredConstructors":[Ljava/lang/reflect/Constructor;
    :cond_1
    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    move-object v2, v1

    .line 134
    .local v2, "it":Ljava/lang/Class;
    const/4 v3, 0x0

    .line 103
    .local v3, "$i$a$-also-InstanceUtil$getConstructorInstance$2":I
    iput-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .end local v2    # "it":Ljava/lang/Class;
    .end local v3    # "$i$a$-also-InstanceUtil$getConstructorInstance$2":I
    if-eqz v1, :cond_2

    goto :goto_0

    .line 104
    :cond_2
    new-instance v1, Ljava/lang/NoSuchMethodException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Constructor "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " not found"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .end local p1    # "classLoader":Ljava/lang/ClassLoader;
    .end local p2    # "dexMethod":Lorg/luckypray/dexkit/wrap/DexMethod;
    throw v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    .end local v0    # "clz":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local p1    # "classLoader":Ljava/lang/ClassLoader;
    .restart local p2    # "dexMethod":Lorg/luckypray/dexkit/wrap/DexMethod;
    :catch_0
    move-exception v0

    .line 106
    .local v0, "e":Ljava/lang/ClassNotFoundException;
    new-instance v1, Ljava/lang/NoSuchMethodException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No such method: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    invoke-virtual {v1, v2}, Ljava/lang/NoSuchMethodException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v1

    const-string v2, "NoSuchMethodException(\"N\u2026$dexMethod\").initCause(e)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    throw v1

    .line 91
    .end local v0    # "e":Ljava/lang/ClassNotFoundException;
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not a constructor"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getFieldInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexField;)Ljava/lang/reflect/Field;
    .locals 8
    .param p1, "classLoader"    # Ljava/lang/ClassLoader;
    .param p2, "dexField"    # Lorg/luckypray/dexkit/wrap/DexField;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dexField"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    nop

    .line 71
    :try_start_0
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .local v0, "clz":Lkotlin/jvm/internal/Ref$ObjectRef;
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexField;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 73
    :goto_0
    sget-object v1, Lorg/luckypray/dexkit/util/InstanceUtil;->fieldsCache:Lorg/luckypray/dexkit/util/WeakCache;

    iget-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    const-string v3, "clz"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lorg/luckypray/dexkit/util/InstanceUtil$getFieldInstance$declaredFields$1;

    invoke-direct {v3, v0}, Lorg/luckypray/dexkit/util/InstanceUtil$getFieldInstance$declaredFields$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-virtual {v1, v2, v3}, Lorg/luckypray/dexkit/util/WeakCache;->get(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/reflect/Field;

    .line 74
    .local v1, "declaredFields":[Ljava/lang/reflect/Field;
    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 75
    .local v4, "field":Ljava/lang/reflect/Field;
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexField;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 76
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeSign()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lorg/luckypray/dexkit/util/InstanceUtil;->signCache:Lorg/luckypray/dexkit/util/WeakCache;

    new-instance v7, Lorg/luckypray/dexkit/util/InstanceUtil$getFieldInstance$1;

    invoke-direct {v7, v4}, Lorg/luckypray/dexkit/util/InstanceUtil$getFieldInstance$1;-><init>(Ljava/lang/reflect/Field;)V

    check-cast v7, Lkotlin/jvm/functions/Function0;

    invoke-virtual {v6, v4, v7}, Lorg/luckypray/dexkit/util/WeakCache;->get(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 77
    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 78
    return-object v4

    .line 74
    .end local v4    # "field":Ljava/lang/reflect/Field;
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 81
    .end local v1    # "declaredFields":[Ljava/lang/reflect/Field;
    :cond_1
    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    move-object v2, v1

    .line 134
    .local v2, "it":Ljava/lang/Class;
    const/4 v3, 0x0

    .line 81
    .local v3, "$i$a$-also-InstanceUtil$getFieldInstance$2":I
    iput-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .end local v2    # "it":Ljava/lang/Class;
    .end local v3    # "$i$a$-also-InstanceUtil$getFieldInstance$2":I
    if-eqz v1, :cond_2

    goto :goto_0

    .line 82
    :cond_2
    new-instance v1, Ljava/lang/NoSuchFieldException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Field "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " not found"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .end local p1    # "classLoader":Ljava/lang/ClassLoader;
    .end local p2    # "dexField":Lorg/luckypray/dexkit/wrap/DexField;
    throw v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .end local v0    # "clz":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local p1    # "classLoader":Ljava/lang/ClassLoader;
    .restart local p2    # "dexField":Lorg/luckypray/dexkit/wrap/DexField;
    :catch_0
    move-exception v0

    .line 84
    .local v0, "e":Ljava/lang/ClassNotFoundException;
    new-instance v1, Ljava/lang/NoSuchFieldException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No such field: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    invoke-virtual {v1, v2}, Ljava/lang/NoSuchFieldException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v1

    const-string v2, "NoSuchFieldException(\"No\u2026 $dexField\").initCause(e)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    throw v1
.end method

.method public final getMethodInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;)Ljava/lang/reflect/Method;
    .locals 8
    .param p1, "classLoader"    # Ljava/lang/ClassLoader;
    .param p2, "dexMethod"    # Lorg/luckypray/dexkit/wrap/DexMethod;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dexMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->isMethod()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 115
    nop

    .line 116
    :try_start_0
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .local v0, "clz":Lkotlin/jvm/internal/Ref$ObjectRef;
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 118
    :goto_0
    sget-object v1, Lorg/luckypray/dexkit/util/InstanceUtil;->methodsCache:Lorg/luckypray/dexkit/util/WeakCache;

    iget-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    const-string v3, "clz"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lorg/luckypray/dexkit/util/InstanceUtil$getMethodInstance$declaredMethods$1;

    invoke-direct {v3, v0}, Lorg/luckypray/dexkit/util/InstanceUtil$getMethodInstance$declaredMethods$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-virtual {v1, v2, v3}, Lorg/luckypray/dexkit/util/WeakCache;->get(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/reflect/Method;

    .line 119
    .local v1, "declaredMethods":[Ljava/lang/reflect/Method;
    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 120
    .local v4, "method":Ljava/lang/reflect/Method;
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 121
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodSign()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lorg/luckypray/dexkit/util/InstanceUtil;->signCache:Lorg/luckypray/dexkit/util/WeakCache;

    new-instance v7, Lorg/luckypray/dexkit/util/InstanceUtil$getMethodInstance$1;

    invoke-direct {v7, v4}, Lorg/luckypray/dexkit/util/InstanceUtil$getMethodInstance$1;-><init>(Ljava/lang/reflect/Method;)V

    check-cast v7, Lkotlin/jvm/functions/Function0;

    invoke-virtual {v6, v4, v7}, Lorg/luckypray/dexkit/util/WeakCache;->get(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 122
    const/4 v2, 0x1

    invoke-virtual {v4, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 123
    return-object v4

    .line 119
    .end local v4    # "method":Ljava/lang/reflect/Method;
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 126
    .end local v1    # "declaredMethods":[Ljava/lang/reflect/Method;
    :cond_1
    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    move-object v2, v1

    .line 134
    .local v2, "it":Ljava/lang/Class;
    const/4 v3, 0x0

    .line 126
    .local v3, "$i$a$-also-InstanceUtil$getMethodInstance$2":I
    iput-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .end local v2    # "it":Ljava/lang/Class;
    .end local v3    # "$i$a$-also-InstanceUtil$getMethodInstance$2":I
    if-eqz v1, :cond_2

    goto :goto_0

    .line 127
    :cond_2
    new-instance v1, Ljava/lang/NoSuchMethodException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Method "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " not found"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .end local p1    # "classLoader":Ljava/lang/ClassLoader;
    .end local p2    # "dexMethod":Lorg/luckypray/dexkit/wrap/DexMethod;
    throw v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    .end local v0    # "clz":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local p1    # "classLoader":Ljava/lang/ClassLoader;
    .restart local p2    # "dexMethod":Lorg/luckypray/dexkit/wrap/DexMethod;
    :catch_0
    move-exception v0

    .line 129
    .local v0, "e":Ljava/lang/ClassNotFoundException;
    new-instance v1, Ljava/lang/NoSuchMethodException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No such method: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    invoke-virtual {v1, v2}, Ljava/lang/NoSuchMethodException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v1

    const-string v2, "NoSuchMethodException(\"N\u2026$dexMethod\").initCause(e)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    throw v1

    .line 113
    .end local v0    # "e":Ljava/lang/ClassNotFoundException;
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " not a method"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
