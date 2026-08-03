.class final enum Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/lua/api/CherryXposedAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "HookType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lng;

.field private static final synthetic $VALUES:[Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

.field public static final enum AFTER:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

.field public static final enum BEFORE:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

.field public static final enum NORMAL:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

.field public static final enum REPLACE:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;


# direct methods
.method private static final synthetic $values()[Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;
    .locals 4

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->NORMAL:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    sget-object v1, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->BEFORE:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    sget-object v2, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->AFTER:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    sget-object v3, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->REPLACE:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    filled-new-array {v0, v1, v2, v3}, [Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    const-wide v1, -0x11ccafffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->NORMAL:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    const-wide v1, -0x11cd1fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->BEFORE:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    const-wide v1, -0x11cd8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->AFTER:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    new-instance v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    const-wide v1, -0x11cdefffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->REPLACE:Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    invoke-static {}, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->$values()[Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->$VALUES:[Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    new-instance v1, Log;

    invoke-direct {v1, v0}, Log;-><init>([Ljava/lang/Enum;)V

    sput-object v1, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->$ENTRIES:Lng;

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

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->$ENTRIES:Lng;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;
    .locals 1

    const-class v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    return-object p0
.end method

.method public static values()[Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;->$VALUES:[Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/github/cherrywechat/lua/api/CherryXposedAPI$HookType;

    return-object v0
.end method
