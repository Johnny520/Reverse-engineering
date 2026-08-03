.class public final Lorg/luckypray/dexkit/result/FieldData;
.super Lorg/luckypray/dexkit/result/base/BaseData;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/FieldData$-Companion;
    }
.end annotation


# static fields
.field public static final -Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;


# instance fields
.field private final annotations$delegate:LD0/b;

.field private final classId:I

.field private final declaredClass$delegate:LD0/b;

.field private final descriptor:Ljava/lang/String;

.field private final dexField$delegate:LD0/b;

.field private final modifiers:I

.field private final readers$delegate:LD0/b;

.field private final type$delegate:LD0/b;

.field private final typeId:I

.field private final writers$delegate:LD0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/result/FieldData$-Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/FieldData$-Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/result/FieldData;->-Companion:Lorg/luckypray/dexkit/result/FieldData$-Companion;

    return-void
.end method

.method private constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lorg/luckypray/dexkit/result/base/BaseData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 3
    iput p4, p0, Lorg/luckypray/dexkit/result/FieldData;->classId:I

    .line 4
    iput p5, p0, Lorg/luckypray/dexkit/result/FieldData;->modifiers:I

    .line 5
    iput-object p6, p0, Lorg/luckypray/dexkit/result/FieldData;->descriptor:Ljava/lang/String;

    .line 6
    iput p7, p0, Lorg/luckypray/dexkit/result/FieldData;->typeId:I

    .line 7
    new-instance p4, Lorg/luckypray/dexkit/result/FieldData$dexField$2;

    invoke-direct {p4, p0}, Lorg/luckypray/dexkit/result/FieldData$dexField$2;-><init>(Lorg/luckypray/dexkit/result/FieldData;)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/FieldData;->dexField$delegate:LD0/b;

    .line 8
    new-instance p4, Lorg/luckypray/dexkit/result/FieldData$declaredClass$2;

    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/FieldData$declaredClass$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/FieldData;I)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/FieldData;->declaredClass$delegate:LD0/b;

    .line 9
    new-instance p4, Lorg/luckypray/dexkit/result/FieldData$type$2;

    invoke-direct {p4, p1, p0, p3}, Lorg/luckypray/dexkit/result/FieldData$type$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/FieldData;I)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/FieldData;->type$delegate:LD0/b;

    .line 10
    new-instance p4, Lorg/luckypray/dexkit/result/FieldData$annotations$2;

    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/FieldData$annotations$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/FieldData;II)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/FieldData;->annotations$delegate:LD0/b;

    .line 11
    new-instance p4, Lorg/luckypray/dexkit/result/FieldData$readers$2;

    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/FieldData$readers$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/FieldData;II)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p4

    iput-object p4, p0, Lorg/luckypray/dexkit/result/FieldData;->readers$delegate:LD0/b;

    .line 12
    new-instance p4, Lorg/luckypray/dexkit/result/FieldData$writers$2;

    invoke-direct {p4, p1, p0, p3, p2}, Lorg/luckypray/dexkit/result/FieldData$writers$2;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lorg/luckypray/dexkit/result/FieldData;II)V

    invoke-static {p4}, LA0/p;->E(LP0/a;)LD0/h;

    move-result-object p1

    iput-object p1, p0, Lorg/luckypray/dexkit/result/FieldData;->writers$delegate:LD0/b;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILQ0/d;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lorg/luckypray/dexkit/result/FieldData;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V

    return-void
.end method

.method public static final synthetic access$getClassId$p(Lorg/luckypray/dexkit/result/FieldData;)I
    .locals 0

    iget p0, p0, Lorg/luckypray/dexkit/result/FieldData;->classId:I

    return p0
.end method

.method public static final synthetic access$getEncodeId(Lorg/luckypray/dexkit/result/FieldData;II)J
    .locals 0

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/result/base/BaseData;->getEncodeId(II)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic access$getTypeId$p(Lorg/luckypray/dexkit/result/FieldData;)I
    .locals 0

    iget p0, p0, Lorg/luckypray/dexkit/result/FieldData;->typeId:I

    return p0
.end method

.method private final getDexField()Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/FieldData;->dexField$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/wrap/DexField;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/luckypray/dexkit/result/FieldData;

    if-eqz v1, :cond_1

    check-cast p1, Lorg/luckypray/dexkit/result/FieldData;

    iget-object p1, p1, Lorg/luckypray/dexkit/result/FieldData;->descriptor:Ljava/lang/String;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/FieldData;->descriptor:Ljava/lang/String;

    invoke-static {p1, v1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/luckypray/dexkit/result/AnnotationData;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lorg/luckypray/dexkit/result/FieldData;->annotations$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getClassInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
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

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public final getClassName()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDexField()Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexField;->getClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getDeclaredClass()Lorg/luckypray/dexkit/result/ClassData;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/FieldData;->declaredClass$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    return-object v0
.end method

.method public final getDeclaredClassName()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getClassName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getDescriptor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/FieldData;->descriptor:Ljava/lang/String;

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

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDexField()Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object v0

    invoke-virtual {v0, p1}, Lorg/luckypray/dexkit/wrap/DexField;->getFieldInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;

    move-result-object p1

    return-object p1
.end method

.method public final getFieldName()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDexField()Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexField;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getModifiers()I
    .locals 1

    iget v0, p0, Lorg/luckypray/dexkit/result/FieldData;->modifiers:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDexField()Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexField;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getReaders()Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/FieldData;->readers$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodDataList;

    return-object v0
.end method

.method public final getType()Lorg/luckypray/dexkit/result/ClassData;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/FieldData;->type$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/ClassData;

    return-object v0
.end method

.method public final getTypeInstance(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
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

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getTypeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public final getTypeName()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDexField()Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTypeSign()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDexField()Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object v0

    invoke-virtual {v0}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeSign()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getWriters()Lorg/luckypray/dexkit/result/MethodDataList;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/FieldData;->writers$delegate:LD0/b;

    check-cast v0, LD0/h;

    invoke-virtual {v0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/luckypray/dexkit/result/MethodDataList;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/FieldData;->descriptor:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toDexField()Lorg/luckypray/dexkit/wrap/DexField;
    .locals 1

    invoke-direct {p0}, Lorg/luckypray/dexkit/result/FieldData;->getDexField()Lorg/luckypray/dexkit/wrap/DexField;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lorg/luckypray/dexkit/result/FieldData;->modifiers:I

    const-string v2, " "

    if-lez v1, :cond_0

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getTypeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/luckypray/dexkit/result/FieldData;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
