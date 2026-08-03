.class public final Lorg/luckypray/dexkit/wrap/DexMethod;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/wrap/ISerializable;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nDexMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexMethod.kt\norg/luckypray/dexkit/wrap/DexMethod\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,185:1\n11328#2:186\n11663#2,3:187\n11328#2:190\n11663#2,3:191\n*S KotlinDebug\n*F\n+ 1 DexMethod.kt\norg/luckypray/dexkit/wrap/DexMethod\n*L\n115#1:186\n115#1:187,3\n129#1:190\n129#1:191,3\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/wrap/DexMethod$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDexMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexMethod.kt\norg/luckypray/dexkit/wrap/DexMethod\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,185:1\n11328#2:186\n11663#2,3:187\n11328#2:190\n11663#2,3:191\n*S KotlinDebug\n*F\n+ 1 DexMethod.kt\norg/luckypray/dexkit/wrap/DexMethod\n*L\n115#1:186\n115#1:187,3\n129#1:190\n129#1:191,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0008\u0012\u0018\u0000 42\u00020\u0001:\u00014B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B\u0015\u0008\u0016\u0012\n\u0010\n\u001a\u0006\u0012\u0002\u0008\u00030\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u0010\u001a\u0006\u0012\u0002\u0008\u00030\t2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\rJ\u001a\u0010\u0019\u001a\u00020\u00122\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010\rR\u0017\u0010!\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001f\u001a\u0004\u0008\"\u0010\rR\u001d\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00020#8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u0017\u0010(\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010\u001f\u001a\u0004\u0008)\u0010\rR\u001b\u0010-\u001a\u00020\u00028FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010\rR\u0011\u0010/\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008.\u0010\rR\u0011\u00100\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u00080\u00101R\u0011\u00102\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u00082\u00101R\u0011\u00103\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\u00083\u00101\u00a8\u00065"
    }
    d2 = {
        "Lorg/luckypray/dexkit/wrap/DexMethod;",
        "Lorg/luckypray/dexkit/wrap/ISerializable;",
        "",
        "descriptor",
        "<init>",
        "(Ljava/lang/String;)V",
        "Ljava/lang/reflect/Method;",
        "method",
        "(Ljava/lang/reflect/Method;)V",
        "Ljava/lang/reflect/Constructor;",
        "constructor",
        "(Ljava/lang/reflect/Constructor;)V",
        "getSign",
        "()Ljava/lang/String;",
        "Ljava/lang/ClassLoader;",
        "classLoader",
        "getConstructorInstance",
        "(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;",
        "",
        "isStatic",
        "getMethodInstance",
        "(Ljava/lang/ClassLoader;Ljava/lang/Boolean;)Ljava/lang/reflect/Method;",
        "toString",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "className",
        "Ljava/lang/String;",
        "getClassName",
        "name",
        "getName",
        "",
        "paramTypeNames",
        "Ljava/util/List;",
        "getParamTypeNames",
        "()Ljava/util/List;",
        "returnTypeName",
        "getReturnTypeName",
        "methodSign$delegate",
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06e8;",
        "getMethodSign",
        "methodSign",
        "getDeclaredClassName",
        "declaredClassName",
        "isConstructor",
        "()Z",
        "isStaticInitializer",
        "isMethod",
        "Companion",
        "dexkit-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/wrap/DexMethod$Companion;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field private final className:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private final methodSign$delegate:LYue/ۥ۠ۦۨۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private final paramTypeNames:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final returnTypeName:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/wrap/DexMethod$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/wrap/DexMethod$Companion;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, Lorg/luckypray/dexkit/wrap/DexMethod;->Companion:Lorg/luckypray/dexkit/wrap/DexMethod$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "descriptor"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;

    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;-><init>(Lorg/luckypray/dexkit/wrap/DexMethod;)V

    invoke-static {v0}, LYue/ۥ۠ۧ۟ۡ;->ۥ(LYue/ۥۣ۠۠ۨ;)LYue/ۥ۠ۦۨۨ;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->methodSign$delegate:LYue/ۥ۠ۦۨۨ;

    const/4 v5, 0x6

    const/4 v6, 0x0

    .line 3
    const-string v2, "->"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LYue/ۥۢ۠ۢۥ;->ۥ۟۠ۨۨ(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v3, v0, 0x1

    const/4 v5, 0x4

    .line 4
    const-string v2, "("

    invoke-static/range {v1 .. v6}, LYue/ۥۢ۠ۢۥ;->ۥ۟۠ۨۨ(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v1

    add-int/lit8 v8, v1, 0x1

    const/4 v6, 0x4

    const/4 v7, 0x0

    .line 5
    const-string v3, ")"

    const/4 v5, 0x0

    move-object v2, p1

    move v4, v8

    invoke-static/range {v2 .. v7}, LYue/ۥۢ۠ۢۥ;->ۥ۟۠ۨۨ(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    if-eq v1, v3, :cond_0

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    .line 6
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v3, v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x2

    .line 7
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    .line 8
    invoke-virtual {p1, v8, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lorg/luckypray/dexkit/util/DexSignUtil;->getParamTypeNames(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    add-int/lit8 v2, v2, 0x1

    .line 9
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "(this as java.lang.String).substring(startIndex)"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalAccessError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not method descriptor: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .locals 5
    .param p1    # Ljava/lang/reflect/Constructor;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "constructor"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;

    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;-><init>(Lorg/luckypray/dexkit/wrap/DexMethod;)V

    invoke-static {v0}, LYue/ۥ۠ۧ۟ۡ;->ۥ(LYue/ۥۣ۠۠ۨ;)LYue/ۥ۠ۦۨۨ;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->methodSign$delegate:LYue/ۥ۠ۦۨۨ;

    .line 24
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "constructor.declaringClass.name"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    .line 25
    const-string v0, "<init>"

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    .line 26
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    const-string v0, "constructor.parameterTypes"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    .line 29
    const-string v4, "it"

    invoke-static {v3, v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    .line 30
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 31
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    .line 32
    const-string p1, "void"

    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 6
    .param p1    # Ljava/lang/reflect/Method;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "method"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;

    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;-><init>(Lorg/luckypray/dexkit/wrap/DexMethod;)V

    invoke-static {v0}, LYue/ۥ۠ۧ۟ۡ;->ۥ(LYue/ۥۣ۠۠ۨ;)LYue/ۥ۠ۦۨۨ;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->methodSign$delegate:LYue/ۥ۠ۦۨۨ;

    .line 13
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "method.declaringClass"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "method.name"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    .line 15
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    const-string v1, "method.parameterTypes"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    .line 18
    const-string v5, "it"

    invoke-static {v4, v5}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    .line 19
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 20
    :cond_0
    iput-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    .line 21
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    const-string v0, "method.returnType"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getSign(Lorg/luckypray/dexkit/wrap/DexMethod;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getSign()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexMethod;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/wrap/DexMethod;->Companion:Lorg/luckypray/dexkit/wrap/DexMethod$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/wrap/DexMethod$Companion;->deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexMethod;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getMethodInstance$default(Lorg/luckypray/dexkit/wrap/DexMethod;Ljava/lang/ClassLoader;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;
        }
    .end annotation

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodInstance(Ljava/lang/ClassLoader;Ljava/lang/Boolean;)Ljava/lang/reflect/Method;

    move-result-object p0

    return-object p0
.end method

.method private final getSign()Ljava/lang/String;
    .locals 11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    sget-object v8, Lorg/luckypray/dexkit/wrap/DexMethod$getSign$1$1;->INSTANCE:Lorg/luckypray/dexkit/wrap/DexMethod$getSign$1$1;

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v10}, LYue/ۥ۟ۥۢ۠;->ۥ۟۠ۨۢ(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    invoke-static {v1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeSign(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/luckypray/dexkit/wrap/DexMethod;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    check-cast p1, Lorg/luckypray/dexkit/wrap/DexMethod;

    iget-object v3, p1, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    iget-object v3, p1, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    iget-object v3, p1, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    iget-object p1, p1, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    invoke-static {v1, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public final getClassName()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    return-object v0
.end method

.method public final getConstructorInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;
    .locals 1
    .param p1    # Ljava/lang/ClassLoader;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
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

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getConstructorInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    return-object p1
.end method

.method public final getDeclaredClassName()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    return-object v0
.end method

.method public final getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;
    .locals 2
    .param p1    # Ljava/lang/ClassLoader;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;
        }
    .end annotation

    .line 1
    const-string v0, "classLoader"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodInstance$default(Lorg/luckypray/dexkit/wrap/DexMethod;Ljava/lang/ClassLoader;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1
.end method

.method public final getMethodInstance(Ljava/lang/ClassLoader;Ljava/lang/Boolean;)Ljava/lang/reflect/Method;
    .locals 1
    .param p1    # Ljava/lang/ClassLoader;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡۡ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchMethodException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    invoke-virtual {v0, p1, p0, p2}, Lorg/luckypray/dexkit/util/InstanceUtil;->getMethodInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;Ljava/lang/Boolean;)Ljava/lang/reflect/Method;

    move-result-object p1

    return-object p1
.end method

.method public final getMethodSign()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->methodSign$delegate:LYue/ۥ۠ۦۨۨ;

    invoke-interface {v0}, LYue/ۥ۠ۦۨۨ;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getParamTypeNames()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    return-object v0
.end method

.method public final getReturnTypeName()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->paramTypeNames:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->returnTypeName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isConstructor()Z
    .locals 2

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    const-string v1, "<init>"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final isMethod()Z
    .locals 1

    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->isStaticInitializer()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->isConstructor()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isStaticInitializer()Z
    .locals 2

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    const-string v1, "<clinit>"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public serialize()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p0}, Lorg/luckypray/dexkit/wrap/ISerializable$DefaultImpls;->serialize(Lorg/luckypray/dexkit/wrap/ISerializable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->className:Ljava/lang/String;

    invoke-static {v1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeSign(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexMethod;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodSign()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
