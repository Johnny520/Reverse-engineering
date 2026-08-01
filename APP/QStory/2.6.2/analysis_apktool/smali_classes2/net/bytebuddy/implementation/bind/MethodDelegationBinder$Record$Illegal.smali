.class public final enum Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Illegal"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;",
        ">;",
        "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;

.field public static final enum INSTANCE:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;->$VALUES:[Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;

    .line 16
    .line 17
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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;->$VALUES:[Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record$Illegal;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public bind(Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodInvoker;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Illegal;

    .line 2
    .line 3
    return-object p0
.end method
