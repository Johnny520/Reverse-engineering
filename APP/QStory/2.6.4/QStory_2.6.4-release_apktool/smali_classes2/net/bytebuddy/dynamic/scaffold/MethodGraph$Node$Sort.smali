.class public final enum Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Sort"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

.field public static final enum AMBIGUOUS:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

.field public static final enum RESOLVED:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

.field public static final enum UNRESOLVED:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

.field public static final enum VISIBLE:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;


# instance fields
.field private final madeVisible:Z

.field private final resolved:Z

.field private final unique:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    const/4 v5, 0x1

    .line 5
    const-string v1, "VISIBLE"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;-><init>(Ljava/lang/String;IZZZ)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;->VISIBLE:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 13
    .line 14
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    const-string v2, "RESOLVED"

    .line 18
    .line 19
    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;-><init>(Ljava/lang/String;IZZZ)V

    .line 20
    .line 21
    .line 22
    sput-object v1, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;->RESOLVED:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 23
    .line 24
    new-instance v2, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    const-string v3, "AMBIGUOUS"

    .line 28
    .line 29
    const/4 v4, 0x2

    .line 30
    invoke-direct/range {v2 .. v7}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;-><init>(Ljava/lang/String;IZZZ)V

    .line 31
    .line 32
    .line 33
    sput-object v2, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;->AMBIGUOUS:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 34
    .line 35
    new-instance v3, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    const-string v4, "UNRESOLVED"

    .line 39
    .line 40
    const/4 v5, 0x3

    .line 41
    invoke-direct/range {v3 .. v8}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;-><init>(Ljava/lang/String;IZZZ)V

    .line 42
    .line 43
    .line 44
    sput-object v3, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;->UNRESOLVED:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 45
    .line 46
    filled-new-array {v0, v1, v2, v3}, [Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;->$VALUES:[Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 51
    .line 52
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;->resolved:Z

    .line 5
    .line 6
    iput-boolean p4, p0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;->unique:Z

    .line 7
    .line 8
    iput-boolean p5, p0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;->madeVisible:Z

    .line 9
    .line 10
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;->$VALUES:[Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public isMadeVisible()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;->madeVisible:Z

    .line 2
    .line 3
    return p0
.end method

.method public isResolved()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;->resolved:Z

    .line 2
    .line 3
    return p0
.end method

.method public isUnique()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Sort;->unique:Z

    .line 2
    .line 3
    return p0
.end method
