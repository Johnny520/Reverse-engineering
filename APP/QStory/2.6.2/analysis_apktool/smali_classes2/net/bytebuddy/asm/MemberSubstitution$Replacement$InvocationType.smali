.class public final enum Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Replacement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "InvocationType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

.field public static final enum OTHER:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

.field public static final enum SUPER:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

.field public static final enum VIRTUAL:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 2
    .line 3
    const-string v1, "VIRTUAL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;->VIRTUAL:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 12
    .line 13
    const-string v2, "SUPER"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;->SUPER:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 20
    .line 21
    new-instance v2, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 22
    .line 23
    const-string v3, "OTHER"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;->OTHER:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;->$VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 36
    .line 37
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

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static of(ILnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;
    .locals 1

    .line 1
    const/16 v0, 0xb6

    .line 2
    .line 3
    if-eq p0, v0, :cond_2

    .line 4
    .line 5
    const/16 v0, 0xb7

    .line 6
    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const/16 p1, 0xb9

    .line 10
    .line 11
    if-eq p0, p1, :cond_2

    .line 12
    .line 13
    sget-object p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;->OTHER:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->isVirtual()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    sget-object p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;->SUPER:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    sget-object p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;->OTHER:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    sget-object p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;->VIRTUAL:Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 29
    .line 30
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;->$VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public matches(ZZ)Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/MemberSubstitution$1;->$SwitchMap$net$bytebuddy$asm$MemberSubstitution$Replacement$InvocationType:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aget p0, v0, p0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p0, v0, :cond_1

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    if-eq p0, p1, :cond_0

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    return p2

    .line 17
    :cond_1
    return p1
.end method
