.class final enum Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$3;
.super Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;-><init>(Ljava/lang/String;ILnet/bytebuddy/asm/MemberSubstitution$1;)V

    return-void
.end method


# virtual methods
.method public isRepresentable(Lnet/bytebuddy/description/ByteCodeElement$Member;)Z
    .locals 0

    instance-of p1, p1, Lnet/bytebuddy/description/field/FieldDescription;

    return p1
.end method

.method public resolve(Lnet/bytebuddy/description/ByteCodeElement$Member;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
        }
    .end annotation

    new-instance p2, Lnet/bytebuddy/implementation/bytecode/constant/FieldConstant;

    check-cast p1, Lnet/bytebuddy/description/field/FieldDescription;

    invoke-interface {p1}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    move-result-object p1

    check-cast p1, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    invoke-direct {p2, p1}, Lnet/bytebuddy/implementation/bytecode/constant/FieldConstant;-><init>(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)V

    return-object p2
.end method
