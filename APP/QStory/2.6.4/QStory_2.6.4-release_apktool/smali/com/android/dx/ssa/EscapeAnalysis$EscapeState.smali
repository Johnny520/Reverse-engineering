.class public final enum Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/ssa/EscapeAnalysis;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "EscapeState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

.field public static final enum GLOBAL:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

.field public static final enum INTER:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

.field public static final enum METHOD:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

.field public static final enum NONE:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

.field public static final enum TOP:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;


# direct methods
.method private static synthetic $values()[Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;
    .locals 5

    .line 1
    sget-object v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->TOP:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 2
    .line 3
    sget-object v1, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 4
    .line 5
    sget-object v2, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->METHOD:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 6
    .line 7
    sget-object v3, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->INTER:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 8
    .line 9
    sget-object v4, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->GLOBAL:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 2
    .line 3
    const-string v1, "TOP"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->TOP:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 10
    .line 11
    new-instance v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 12
    .line 13
    const-string v1, "NONE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->NONE:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 20
    .line 21
    new-instance v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 22
    .line 23
    const-string v1, "METHOD"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->METHOD:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 30
    .line 31
    new-instance v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 32
    .line 33
    const-string v1, "INTER"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->INTER:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 40
    .line 41
    new-instance v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 42
    .line 43
    const-string v1, "GLOBAL"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->GLOBAL:Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 50
    .line 51
    invoke-static {}, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->$values()[Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->$VALUES:[Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 56
    .line 57
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

.method public static valueOf(Ljava/lang/String;)Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;
    .locals 1

    .line 1
    const-class v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->$VALUES:[Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/android/dx/ssa/EscapeAnalysis$EscapeState;

    .line 8
    .line 9
    return-object v0
.end method
