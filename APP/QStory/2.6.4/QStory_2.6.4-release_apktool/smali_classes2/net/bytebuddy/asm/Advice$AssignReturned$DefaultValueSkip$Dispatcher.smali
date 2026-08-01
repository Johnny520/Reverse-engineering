.class public abstract enum Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Dispatcher"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

.field public static final enum DOUBLE:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

.field public static final enum FLOAT:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

.field public static final enum INTEGER:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

.field public static final enum LONG:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

.field public static final enum REFERENCE:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher$1;

    .line 2
    .line 3
    const-string v1, "INTEGER"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;->INTEGER:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher$2;

    .line 12
    .line 13
    const-string v3, "LONG"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;->LONG:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 20
    .line 21
    new-instance v3, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher$3;

    .line 22
    .line 23
    const-string v5, "FLOAT"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher$3;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;->FLOAT:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 30
    .line 31
    new-instance v5, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher$4;

    .line 32
    .line 33
    const-string v7, "DOUBLE"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher$4;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;->DOUBLE:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 40
    .line 41
    new-instance v7, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher$5;

    .line 42
    .line 43
    const-string v9, "REFERENCE"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher$5;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;->REFERENCE:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 50
    .line 51
    const/4 v9, 0x5

    .line 52
    new-array v9, v9, [Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 53
    .line 54
    aput-object v0, v9, v2

    .line 55
    .line 56
    aput-object v1, v9, v4

    .line 57
    .line 58
    aput-object v3, v9, v6

    .line 59
    .line 60
    aput-object v5, v9, v8

    .line 61
    .line 62
    aput-object v7, v9, v10

    .line 63
    .line 64
    sput-object v9, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;->$VALUES:[Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 65
    .line 66
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

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/asm/Advice$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;->$VALUES:[Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract apply(Lnet/bytebuddy/jar/asm/MethodVisitor;ILnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
.end method
