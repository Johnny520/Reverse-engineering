.class public final Lorg/luckypray/dexkit/wrap/DexField;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/luckypray/dexkit/wrap/ISerializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/wrap/DexField$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0011\u0018\u0000 &2\u00020\u0001:\u0001&B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\nJ\u001a\u0010\u0014\u001a\u00020\r2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\nR\u0017\u0010\u001c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001a\u001a\u0004\u0008\u001d\u0010\nR\u0017\u0010\u001e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001a\u001a\u0004\u0008\u001f\u0010\nR\u001b\u0010#\u001a\u00020\u00028FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010\nR\u0011\u0010%\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010\n\u00a8\u0006\'"
    }
    d2 = {
        "Lorg/luckypray/dexkit/wrap/DexField;",
        "Lorg/luckypray/dexkit/wrap/ISerializable;",
        "",
        "descriptor",
        "<init>",
        "(Ljava/lang/String;)V",
        "Ljava/lang/reflect/Field;",
        "field",
        "(Ljava/lang/reflect/Field;)V",
        "getSign",
        "()Ljava/lang/String;",
        "Ljava/lang/ClassLoader;",
        "classLoader",
        "",
        "isStatic",
        "getFieldInstance",
        "(Ljava/lang/ClassLoader;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;",
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
        "typeName",
        "getTypeName",
        "typeSign$delegate",
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06e8;",
        "getTypeSign",
        "typeSign",
        "getDeclaredClassName",
        "declaredClassName",
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
.field public static final Companion:Lorg/luckypray/dexkit/wrap/DexField$Companion;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field private final className:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private final typeName:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field private final typeSign$delegate:LYue/ۥ۠ۦۨۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/wrap/DexField$Companion;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, Lorg/luckypray/dexkit/wrap/DexField;->Companion:Lorg/luckypray/dexkit/wrap/DexField$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "descriptor"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField$typeSign$2;

    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/wrap/DexField$typeSign$2;-><init>(Lorg/luckypray/dexkit/wrap/DexField;)V

    invoke-static {v0}, LYue/ۥ۠ۧ۟ۡ;->ۥ(LYue/ۥۣ۠۠ۨ;)LYue/ۥ۠ۦۨۨ;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeSign$delegate:LYue/ۥ۠ۦۨۨ;

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
    const-string v2, ":"

    invoke-static/range {v1 .. v6}, LYue/ۥۢ۠ۢۥ;->ۥ۟۠ۨۨ(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    if-eq v1, v2, :cond_0

    const/4 v2, 0x0

    .line 5
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v2, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x2

    .line 6
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    add-int/lit8 v1, v1, 0x1

    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "(this as java.lang.String).substring(startIndex)"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalAccessError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not field descriptor: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 2
    .param p1    # Ljava/lang/reflect/Field;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "field"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField$typeSign$2;

    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/wrap/DexField$typeSign$2;-><init>(Lorg/luckypray/dexkit/wrap/DexField;)V

    invoke-static {v0}, LYue/ۥ۠ۧ۟ۡ;->ۥ(LYue/ۥۣ۠۠ۨ;)LYue/ۥ۠ۦۨۨ;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeSign$delegate:LYue/ۥ۠ۦۨۨ;

    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "field.declaringClass"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "field.name"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p1

    const-string v0, "field.type"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getSign(Lorg/luckypray/dexkit/wrap/DexField;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lorg/luckypray/dexkit/wrap/DexField;->getSign()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, Lorg/luckypray/dexkit/wrap/DexField;->Companion:Lorg/luckypray/dexkit/wrap/DexField$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/wrap/DexField$Companion;->deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getFieldInstance$default(Lorg/luckypray/dexkit/wrap/DexField;Ljava/lang/ClassLoader;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/lang/reflect/Field;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;
        }
    .end annotation

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/wrap/DexField;->getFieldInstance(Ljava/lang/ClassLoader;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0
.end method

.method private final getSign()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    invoke-static {v0}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeSign(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

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
    instance-of v1, p1, Lorg/luckypray/dexkit/wrap/DexField;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    check-cast p1, Lorg/luckypray/dexkit/wrap/DexField;

    iget-object v3, p1, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    iget-object v3, p1, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    iget-object p1, p1, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

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

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeclaredClassName()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    return-object v0
.end method

.method public final getFieldInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;
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
            Ljava/lang/NoSuchFieldException;
        }
    .end annotation

    .line 1
    const-string v0, "classLoader"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lorg/luckypray/dexkit/wrap/DexField;->getFieldInstance$default(Lorg/luckypray/dexkit/wrap/DexField;Ljava/lang/ClassLoader;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/lang/reflect/Field;

    move-result-object p1

    return-object p1
.end method

.method public final getFieldInstance(Ljava/lang/ClassLoader;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;
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
            Ljava/lang/NoSuchFieldException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    invoke-virtual {v0, p1, p0, p2}, Lorg/luckypray/dexkit/util/InstanceUtil;->getFieldInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexField;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;

    move-result-object p1

    return-object p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getTypeName()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    return-object v0
.end method

.method public final getTypeSign()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeSign$delegate:LYue/ۥ۠ۦۨۨ;

    invoke-interface {v0}, LYue/ۥ۠ۦۨۨ;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

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

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    invoke-static {v1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeSign(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeSign()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
