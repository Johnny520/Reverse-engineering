.class public Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory<",
        "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
        ">;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

.field private final index:I


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;I)V
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lnet/bytebuddy/description/field/FieldDescription$ForLoadedField;-><init>(Ljava/lang/reflect/Field;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory;-><init>(Lnet/bytebuddy/description/field/FieldDescription;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/field/FieldDescription;I)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 12
    iput p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory;->index:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory;->index:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory;->index:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory;->index:I

    .line 21
    .line 22
    add-int/2addr v1, p0

    .line 23
    return v1
.end method

.method public make(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step<",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p3, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write;

    .line 2
    .line 3
    iget-object p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 4
    .line 5
    iget p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory;->index:I

    .line 6
    .line 7
    invoke-direct {p3, p4, p1, p2, p0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write;-><init>(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;I)V

    .line 8
    .line 9
    .line 10
    return-object p3
.end method
