.class public final enum Lnet/bytebuddy/implementation/SuperMethodCall;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation$Composable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/SuperMethodCall$Appender;,
        Lnet/bytebuddy/implementation/SuperMethodCall$WithoutReturn;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/SuperMethodCall;",
        ">;",
        "Lnet/bytebuddy/implementation/Implementation$Composable;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/SuperMethodCall;

.field public static final enum INSTANCE:Lnet/bytebuddy/implementation/SuperMethodCall;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/SuperMethodCall;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/SuperMethodCall;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/SuperMethodCall;->INSTANCE:Lnet/bytebuddy/implementation/SuperMethodCall;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/implementation/SuperMethodCall;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/implementation/SuperMethodCall;->$VALUES:[Lnet/bytebuddy/implementation/SuperMethodCall;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/SuperMethodCall;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/SuperMethodCall;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/SuperMethodCall;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/SuperMethodCall;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/SuperMethodCall;->$VALUES:[Lnet/bytebuddy/implementation/SuperMethodCall;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/SuperMethodCall;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/SuperMethodCall;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 1

    .line 18
    new-instance p0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;

    sget-object v0, Lnet/bytebuddy/implementation/SuperMethodCall$WithoutReturn;->INSTANCE:Lnet/bytebuddy/implementation/SuperMethodCall$WithoutReturn;

    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;-><init>(Lnet/bytebuddy/implementation/Implementation;Lnet/bytebuddy/implementation/Implementation$Composable;)V

    return-object p0
.end method

.method public andThen(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/implementation/Implementation;
    .locals 3

    .line 1
    new-instance p0, Lnet/bytebuddy/implementation/Implementation$Compound;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [Lnet/bytebuddy/implementation/Implementation;

    .line 5
    .line 6
    sget-object v1, Lnet/bytebuddy/implementation/SuperMethodCall$WithoutReturn;->INSTANCE:Lnet/bytebuddy/implementation/SuperMethodCall$WithoutReturn;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aput-object v1, v0, v2

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    aput-object p1, v0, v1

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lnet/bytebuddy/implementation/Implementation$Compound;-><init>([Lnet/bytebuddy/implementation/Implementation;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 1

    .line 1
    new-instance p0, Lnet/bytebuddy/implementation/SuperMethodCall$Appender;

    .line 2
    .line 3
    sget-object v0, Lnet/bytebuddy/implementation/SuperMethodCall$Appender$TerminationHandler;->RETURNING:Lnet/bytebuddy/implementation/SuperMethodCall$Appender$TerminationHandler;

    .line 4
    .line 5
    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/implementation/SuperMethodCall$Appender;-><init>(Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/SuperMethodCall$Appender$TerminationHandler;)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 1
    return-object p1
.end method
