.class public final enum Lio/github/cherrywechat/lua/loader/ScriptState;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/github/cherrywechat/lua/loader/ScriptState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lng;

.field private static final synthetic $VALUES:[Lio/github/cherrywechat/lua/loader/ScriptState;

.field public static final enum COMPLETED:Lio/github/cherrywechat/lua/loader/ScriptState;

.field public static final enum ERROR:Lio/github/cherrywechat/lua/loader/ScriptState;

.field public static final enum LOADED:Lio/github/cherrywechat/lua/loader/ScriptState;

.field public static final enum RUNNING:Lio/github/cherrywechat/lua/loader/ScriptState;

.field public static final enum UNLOADED:Lio/github/cherrywechat/lua/loader/ScriptState;


# direct methods
.method private static final synthetic $values()[Lio/github/cherrywechat/lua/loader/ScriptState;
    .locals 5

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptState;->LOADED:Lio/github/cherrywechat/lua/loader/ScriptState;

    sget-object v1, Lio/github/cherrywechat/lua/loader/ScriptState;->RUNNING:Lio/github/cherrywechat/lua/loader/ScriptState;

    sget-object v2, Lio/github/cherrywechat/lua/loader/ScriptState;->COMPLETED:Lio/github/cherrywechat/lua/loader/ScriptState;

    sget-object v3, Lio/github/cherrywechat/lua/loader/ScriptState;->ERROR:Lio/github/cherrywechat/lua/loader/ScriptState;

    sget-object v4, Lio/github/cherrywechat/lua/loader/ScriptState;->UNLOADED:Lio/github/cherrywechat/lua/loader/ScriptState;

    filled-new-array {v0, v1, v2, v3, v4}, [Lio/github/cherrywechat/lua/loader/ScriptState;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/github/cherrywechat/lua/loader/ScriptState;

    const-wide v1, -0x1404efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/github/cherrywechat/lua/loader/ScriptState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptState;->LOADED:Lio/github/cherrywechat/lua/loader/ScriptState;

    new-instance v0, Lio/github/cherrywechat/lua/loader/ScriptState;

    const-wide v1, -0x14055fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/github/cherrywechat/lua/loader/ScriptState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptState;->RUNNING:Lio/github/cherrywechat/lua/loader/ScriptState;

    new-instance v0, Lio/github/cherrywechat/lua/loader/ScriptState;

    const-wide v1, -0x1405dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/github/cherrywechat/lua/loader/ScriptState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptState;->COMPLETED:Lio/github/cherrywechat/lua/loader/ScriptState;

    new-instance v0, Lio/github/cherrywechat/lua/loader/ScriptState;

    const-wide v1, -0x14067fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lio/github/cherrywechat/lua/loader/ScriptState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptState;->ERROR:Lio/github/cherrywechat/lua/loader/ScriptState;

    new-instance v0, Lio/github/cherrywechat/lua/loader/ScriptState;

    const-wide v1, -0x1406dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lio/github/cherrywechat/lua/loader/ScriptState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptState;->UNLOADED:Lio/github/cherrywechat/lua/loader/ScriptState;

    invoke-static {}, Lio/github/cherrywechat/lua/loader/ScriptState;->$values()[Lio/github/cherrywechat/lua/loader/ScriptState;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptState;->$VALUES:[Lio/github/cherrywechat/lua/loader/ScriptState;

    new-instance v1, Log;

    invoke-direct {v1, v0}, Log;-><init>([Ljava/lang/Enum;)V

    sput-object v1, Lio/github/cherrywechat/lua/loader/ScriptState;->$ENTRIES:Lng;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lng;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lng;"
        }
    .end annotation

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptState;->$ENTRIES:Lng;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/github/cherrywechat/lua/loader/ScriptState;
    .locals 1

    const-class v0, Lio/github/cherrywechat/lua/loader/ScriptState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/github/cherrywechat/lua/loader/ScriptState;

    return-object p0
.end method

.method public static values()[Lio/github/cherrywechat/lua/loader/ScriptState;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptState;->$VALUES:[Lio/github/cherrywechat/lua/loader/ScriptState;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/github/cherrywechat/lua/loader/ScriptState;

    return-object v0
.end method
