.class public final enum Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/sun/jna/FunctionMapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Windows32BitFunctionMapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;",
        ">;",
        "Lcom/sun/jna/FunctionMapper;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;

.field public static final enum INSTANCE:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;->$VALUES:[Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;->$VALUES:[Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingJna$Dispatcher$Windows32BitFunctionMapper;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getFunctionName(Lcom/sun/jna/NativeLibrary;Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string p1, "JVM_DefineClass"

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const-string p0, "_JVM_DefineClass@24"

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
