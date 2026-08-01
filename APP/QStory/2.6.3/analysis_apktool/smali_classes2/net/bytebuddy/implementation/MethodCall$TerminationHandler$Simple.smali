.class public abstract enum Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;
.implements Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Simple"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;",
        ">;",
        "Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;",
        "Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Factory;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

.field public static final enum DROPPING:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

.field public static final enum IGNORING:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

.field public static final enum RETURNING:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple$1;

    .line 2
    .line 3
    const-string v1, "RETURNING"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;->RETURNING:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple$2;

    .line 12
    .line 13
    const-string v3, "DROPPING"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;->DROPPING:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

    .line 20
    .line 21
    new-instance v3, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple$3;

    .line 22
    .line 23
    const-string v5, "IGNORING"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple$3;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;->IGNORING:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    new-array v5, v5, [Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

    .line 33
    .line 34
    aput-object v0, v5, v2

    .line 35
    .line 36
    aput-object v1, v5, v4

    .line 37
    .line 38
    aput-object v3, v5, v6

    .line 39
    .line 40
    sput-object v5, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;->$VALUES:[Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

    .line 41
    .line 42
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

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/implementation/MethodCall$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;->$VALUES:[Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/MethodCall$TerminationHandler$Simple;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public make(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;
    .locals 0

    .line 1
    return-object p0
.end method

.method public prepare()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 2
    .line 3
    return-object p0
.end method
