.class public Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Target;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Target;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForDynamicInvocation"
.end annotation


# instance fields
.field private final arguments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;"
        }
    .end annotation
.end field

.field private final methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/utility/JavaConstant$MethodType;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/utility/JavaConstant$MethodType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;->methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;->name:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;->arguments:Ljava/util/List;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getArguments()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;->arguments:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMethodType()Lnet/bytebuddy/utility/JavaConstant$MethodType;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;->methodType:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 2
    .line 3
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public isStaticDispatch()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
