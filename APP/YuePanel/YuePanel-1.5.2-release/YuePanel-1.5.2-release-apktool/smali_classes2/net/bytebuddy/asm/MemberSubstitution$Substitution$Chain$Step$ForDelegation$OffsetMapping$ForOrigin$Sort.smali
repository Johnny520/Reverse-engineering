.class public abstract enum Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Sort"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

.field public static final enum CONSTRUCTOR:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

.field public static final enum EXECUTABLE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

.field public static final enum FIELD:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

.field public static final enum LOOKUP:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

.field public static final enum METHOD:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

.field public static final enum METHOD_HANDLE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

.field public static final enum METHOD_TYPE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

.field public static final enum STRING:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

.field public static final enum TYPE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$1;

    const-string v1, "METHOD"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->METHOD:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

    new-instance v1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$2;

    const-string v3, "CONSTRUCTOR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$2;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->CONSTRUCTOR:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

    new-instance v3, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$3;

    const-string v5, "FIELD"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$3;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->FIELD:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

    new-instance v5, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$4;

    const-string v7, "EXECUTABLE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$4;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->EXECUTABLE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

    new-instance v7, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$5;

    const-string v9, "TYPE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$5;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->TYPE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

    new-instance v9, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$6;

    const-string v11, "LOOKUP"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$6;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->LOOKUP:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

    new-instance v11, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$7;

    const-string v13, "METHOD_HANDLE"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$7;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->METHOD_HANDLE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

    new-instance v13, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$8;

    const-string v15, "METHOD_TYPE"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$8;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->METHOD_TYPE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

    new-instance v15, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$9;

    const-string v14, "STRING"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$9;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->STRING:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

    const/16 v14, 0x9

    new-array v14, v14, [Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

    aput-object v0, v14, v2

    aput-object v1, v14, v4

    aput-object v3, v14, v6

    aput-object v5, v14, v8

    aput-object v7, v14, v10

    const/4 v0, 0x5

    aput-object v9, v14, v0

    const/4 v0, 0x6

    aput-object v11, v14, v0

    const/4 v0, 0x7

    aput-object v13, v14, v0

    aput-object v15, v14, v12

    sput-object v14, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->$VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

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
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;
    .locals 1

    const-class v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;
    .locals 1

    sget-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->$VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

    invoke-virtual {v0}, [Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort;

    return-object v0
.end method


# virtual methods
.method public abstract isRepresentable(Lnet/bytebuddy/description/ByteCodeElement$Member;)Z
.end method

.method public abstract resolve(Lnet/bytebuddy/description/ByteCodeElement$Member;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
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
.end method
