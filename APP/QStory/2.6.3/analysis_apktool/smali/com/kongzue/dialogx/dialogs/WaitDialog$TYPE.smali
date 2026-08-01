.class public final enum Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

.field public static final enum ERROR:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

.field public static final enum NONE:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum PROGRESSING:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum SUCCESS:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

.field public static final enum WARNING:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 2
    .line 3
    const-string v1, "NONE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->NONE:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 10
    .line 11
    new-instance v1, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 12
    .line 13
    const-string v2, "SUCCESS"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->SUCCESS:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 20
    .line 21
    new-instance v2, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 22
    .line 23
    const-string v3, "WARNING"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->WARNING:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 30
    .line 31
    new-instance v3, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 32
    .line 33
    const-string v4, "ERROR"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5}, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->ERROR:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 40
    .line 41
    new-instance v4, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 42
    .line 43
    const-string v5, "PROGRESSING"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6}, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v4, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->PROGRESSING:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 50
    .line 51
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->$VALUES:[Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

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

.method public static valueOf(Ljava/lang/String;)Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;
    .locals 1

    .line 1
    const-class v0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;
    .locals 1

    .line 1
    sget-object v0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->$VALUES:[Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 8
    .line 9
    return-object v0
.end method
