.class public abstract enum Lnet/bytebuddy/asm/MemberSubstitution$Source;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Source"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/MemberSubstitution$Source;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Source;

.field public static final enum ENCLOSING_METHOD:Lnet/bytebuddy/asm/MemberSubstitution$Source;

.field public static final enum SUBSTITUTED_ELEMENT:Lnet/bytebuddy/asm/MemberSubstitution$Source;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Source$1;

    const-string v1, "SUBSTITUTED_ELEMENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/MemberSubstitution$Source$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Source;->SUBSTITUTED_ELEMENT:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    new-instance v1, Lnet/bytebuddy/asm/MemberSubstitution$Source$2;

    const-string v3, "ENCLOSING_METHOD"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/asm/MemberSubstitution$Source$2;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lnet/bytebuddy/asm/MemberSubstitution$Source;->ENCLOSING_METHOD:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    const/4 v3, 0x2

    new-array v3, v3, [Lnet/bytebuddy/asm/MemberSubstitution$Source;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lnet/bytebuddy/asm/MemberSubstitution$Source;->$VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Source;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/asm/MemberSubstitution$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Source;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/MemberSubstitution$Source;
    .locals 1

    const-class v0, Lnet/bytebuddy/asm/MemberSubstitution$Source;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/asm/MemberSubstitution$Source;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/MemberSubstitution$Source;
    .locals 1

    sget-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Source;->$VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Source;

    invoke-virtual {v0}, [Lnet/bytebuddy/asm/MemberSubstitution$Source;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/asm/MemberSubstitution$Source;

    return-object v0
.end method


# virtual methods
.method public abstract argument(ILnet/bytebuddy/description/type/TypeList$Generic;Ljava/util/Map;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract arguments(ZLnet/bytebuddy/description/type/TypeList$Generic;Ljava/util/Map;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Ljava/util/List<",
            "Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;",
            ">;"
        }
    .end annotation
.end method

.method public abstract element(Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/ByteCodeElement$Member;
.end method

.method public abstract handle(Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;
.end method

.method public abstract isRepresentable(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/method/MethodDescription;)Z
.end method

.method public abstract resolve(Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method

.method public abstract self(Lnet/bytebuddy/description/type/TypeList$Generic;Ljava/util/Map;Lnet/bytebuddy/description/ByteCodeElement$Member;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lnet/bytebuddy/description/ByteCodeElement$Member;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method
