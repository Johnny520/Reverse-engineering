.class public Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Target;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Target;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForMember"
.end annotation


# instance fields
.field private final member:Lnet/bytebuddy/description/ByteCodeElement$Member;

.field private final receiverType:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/ByteCodeElement$Member;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;->receiverType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;->member:Lnet/bytebuddy/description/ByteCodeElement$Member;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getMember()Lnet/bytebuddy/description/ByteCodeElement$Member;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;->member:Lnet/bytebuddy/description/ByteCodeElement$Member;

    .line 2
    .line 3
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;->member:Lnet/bytebuddy/description/ByteCodeElement$Member;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getReceiverType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;->receiverType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public isStaticDispatch()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;->member:Lnet/bytebuddy/description/ByteCodeElement$Member;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;->member:Lnet/bytebuddy/description/ByteCodeElement$Member;

    .line 10
    .line 11
    instance-of v0, p0, Lnet/bytebuddy/description/method/MethodDescription;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p0, Lnet/bytebuddy/description/method/MethodDescription;

    .line 16
    .line 17
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 27
    return p0
.end method
