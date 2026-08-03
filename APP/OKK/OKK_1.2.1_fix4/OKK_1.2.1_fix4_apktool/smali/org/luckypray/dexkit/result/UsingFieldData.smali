.class public final Lorg/luckypray/dexkit/result/UsingFieldData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;
    }
.end annotation


# static fields
.field public static final -Companion:Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;


# instance fields
.field private final field:Lorg/luckypray/dexkit/result/FieldData;

.field private final usingType:Lorg/luckypray/dexkit/result/FieldUsingType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/result/UsingFieldData;->-Companion:Lorg/luckypray/dexkit/result/UsingFieldData$-Companion;

    return-void
.end method

.method public constructor <init>(Lorg/luckypray/dexkit/result/FieldData;Lorg/luckypray/dexkit/result/FieldUsingType;)V
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usingType"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/luckypray/dexkit/result/UsingFieldData;->field:Lorg/luckypray/dexkit/result/FieldData;

    iput-object p2, p0, Lorg/luckypray/dexkit/result/UsingFieldData;->usingType:Lorg/luckypray/dexkit/result/FieldUsingType;

    return-void
.end method

.method public static synthetic copy$default(Lorg/luckypray/dexkit/result/UsingFieldData;Lorg/luckypray/dexkit/result/FieldData;Lorg/luckypray/dexkit/result/FieldUsingType;ILjava/lang/Object;)Lorg/luckypray/dexkit/result/UsingFieldData;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lorg/luckypray/dexkit/result/UsingFieldData;->field:Lorg/luckypray/dexkit/result/FieldData;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lorg/luckypray/dexkit/result/UsingFieldData;->usingType:Lorg/luckypray/dexkit/result/FieldUsingType;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/result/UsingFieldData;->copy(Lorg/luckypray/dexkit/result/FieldData;Lorg/luckypray/dexkit/result/FieldUsingType;)Lorg/luckypray/dexkit/result/UsingFieldData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lorg/luckypray/dexkit/result/FieldData;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/UsingFieldData;->field:Lorg/luckypray/dexkit/result/FieldData;

    return-object v0
.end method

.method public final component2()Lorg/luckypray/dexkit/result/FieldUsingType;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/UsingFieldData;->usingType:Lorg/luckypray/dexkit/result/FieldUsingType;

    return-object v0
.end method

.method public final copy(Lorg/luckypray/dexkit/result/FieldData;Lorg/luckypray/dexkit/result/FieldUsingType;)Lorg/luckypray/dexkit/result/UsingFieldData;
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usingType"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/luckypray/dexkit/result/UsingFieldData;

    invoke-direct {v0, p1, p2}, Lorg/luckypray/dexkit/result/UsingFieldData;-><init>(Lorg/luckypray/dexkit/result/FieldData;Lorg/luckypray/dexkit/result/FieldUsingType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/luckypray/dexkit/result/UsingFieldData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/luckypray/dexkit/result/UsingFieldData;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/UsingFieldData;->field:Lorg/luckypray/dexkit/result/FieldData;

    iget-object v3, p1, Lorg/luckypray/dexkit/result/UsingFieldData;->field:Lorg/luckypray/dexkit/result/FieldData;

    invoke-static {v1, v3}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lorg/luckypray/dexkit/result/UsingFieldData;->usingType:Lorg/luckypray/dexkit/result/FieldUsingType;

    iget-object p1, p1, Lorg/luckypray/dexkit/result/UsingFieldData;->usingType:Lorg/luckypray/dexkit/result/FieldUsingType;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getField()Lorg/luckypray/dexkit/result/FieldData;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/UsingFieldData;->field:Lorg/luckypray/dexkit/result/FieldData;

    return-object v0
.end method

.method public final getUsingType()Lorg/luckypray/dexkit/result/FieldUsingType;
    .locals 1

    iget-object v0, p0, Lorg/luckypray/dexkit/result/UsingFieldData;->usingType:Lorg/luckypray/dexkit/result/FieldUsingType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lorg/luckypray/dexkit/result/UsingFieldData;->field:Lorg/luckypray/dexkit/result/FieldData;

    invoke-virtual {v0}, Lorg/luckypray/dexkit/result/FieldData;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/luckypray/dexkit/result/UsingFieldData;->usingType:Lorg/luckypray/dexkit/result/FieldUsingType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lorg/luckypray/dexkit/result/UsingFieldData;->field:Lorg/luckypray/dexkit/result/FieldData;

    iget-object v1, p0, Lorg/luckypray/dexkit/result/UsingFieldData;->usingType:Lorg/luckypray/dexkit/result/FieldUsingType;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "UsingFieldData(field="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", usingType="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
