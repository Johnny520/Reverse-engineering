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


# static fields
.field public static final Companion:Lorg/luckypray/dexkit/wrap/DexField$Companion;


# instance fields
.field private final className:Ljava/lang/String;

.field private final name:Ljava/lang/String;

.field private final typeName:Ljava/lang/String;

.field private final typeSign$delegate:LD0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/wrap/DexField$Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/wrap/DexField;->Companion:Lorg/luckypray/dexkit/wrap/DexField$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 5

    const-string v0, "descriptor"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField$typeSign$2;

    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/wrap/DexField$typeSign$2;-><init>(Lorg/luckypray/dexkit/wrap/DexField;)V

    invoke-static {v0}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeSign$delegate:LD0/b;

    .line 3
    const-string v0, "->"

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {p1, v0, v1, v1, v2}, LW0/j;->P0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v0

    add-int/lit8 v2, v0, 0x1

    const/4 v3, 0x4

    .line 4
    const-string v4, ":"

    invoke-static {p1, v4, v2, v1, v3}, LW0/j;->P0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v2

    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    if-eq v2, v3, :cond_0

    .line 5
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v1, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x2

    .line 6
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    add-int/lit8 v2, v2, 0x1

    .line 7
    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "(this as java.lang.String).substring(startIndex)"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalAccessError;

    const-string v1, "not field descriptor: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalAccessError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 2

    const-string v0, "field"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Lorg/luckypray/dexkit/wrap/DexField$typeSign$2;

    invoke-direct {v0, p0}, Lorg/luckypray/dexkit/wrap/DexField$typeSign$2;-><init>(Lorg/luckypray/dexkit/wrap/DexField;)V

    invoke-static {v0}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeSign$delegate:LD0/b;

    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "field.declaringClass"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "field.name"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p1

    const-string v0, "field.type"

    invoke-static {p1, v0}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

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

    sget-object v0, Lorg/luckypray/dexkit/wrap/DexField;->Companion:Lorg/luckypray/dexkit/wrap/DexField$Companion;

    invoke-virtual {v0, p0}, Lorg/luckypray/dexkit/wrap/DexField$Companion;->deserialize(Ljava/lang/String;)Lorg/luckypray/dexkit/wrap/DexField;

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

    invoke-static {v1, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    iget-object v3, p1, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    invoke-static {v1, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    iget-object p1, p1, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    invoke-static {v1, p1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

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

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeclaredClassName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->className:Ljava/lang/String;

    return-object v0
.end method

.method public final getFieldInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;
        }
    .end annotation

    const-string v0, "classLoader"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    invoke-virtual {v0, p1, p0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getFieldInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexField;)Ljava/lang/reflect/Field;

    move-result-object p1

    return-object p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getTypeName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    return-object v0
.end method

.method public final getTypeSign()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeSign$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

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

    add-int/2addr v1, v0

    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexField;->typeName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public serialize()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lorg/luckypray/dexkit/wrap/ISerializable$DefaultImpls;->serialize(Lorg/luckypray/dexkit/wrap/ISerializable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

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

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
