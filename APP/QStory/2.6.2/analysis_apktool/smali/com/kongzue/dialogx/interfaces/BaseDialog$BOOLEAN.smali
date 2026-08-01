.class public final enum Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

.field public static final enum FALSE:Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

.field public static final enum TRUE:Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

    .line 2
    .line 3
    const-string v1, "TRUE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;->TRUE:Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

    .line 10
    .line 11
    new-instance v1, Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

    .line 12
    .line 13
    const-string v2, "FALSE"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;->FALSE:Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;->$VALUES:[Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

    .line 26
    .line 27
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

.method public static valueOf(Ljava/lang/String;)Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;
    .locals 1

    .line 1
    const-class v0, Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;
    .locals 1

    .line 1
    sget-object v0, Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;->$VALUES:[Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/kongzue/dialogx/interfaces/BaseDialog$BOOLEAN;

    .line 8
    .line 9
    return-object v0
.end method
