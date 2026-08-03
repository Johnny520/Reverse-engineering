.class public final enum Lparty/iroiro/luajava/Lua$Conversion;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lparty/iroiro/luajava/Lua;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Conversion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lparty/iroiro/luajava/Lua$Conversion;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lparty/iroiro/luajava/Lua$Conversion;

.field public static final enum FULL:Lparty/iroiro/luajava/Lua$Conversion;

.field public static final enum NONE:Lparty/iroiro/luajava/Lua$Conversion;

.field public static final enum SEMI:Lparty/iroiro/luajava/Lua$Conversion;


# direct methods
.method private static synthetic $values()[Lparty/iroiro/luajava/Lua$Conversion;
    .locals 3

    sget-object v0, Lparty/iroiro/luajava/Lua$Conversion;->FULL:Lparty/iroiro/luajava/Lua$Conversion;

    sget-object v1, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->NONE:Lparty/iroiro/luajava/Lua$Conversion;

    filled-new-array {v0, v1, v2}, [Lparty/iroiro/luajava/Lua$Conversion;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lparty/iroiro/luajava/Lua$Conversion;

    const-string v1, "FULL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/Lua$Conversion;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/Lua$Conversion;->FULL:Lparty/iroiro/luajava/Lua$Conversion;

    new-instance v0, Lparty/iroiro/luajava/Lua$Conversion;

    const-string v1, "SEMI"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/Lua$Conversion;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    new-instance v0, Lparty/iroiro/luajava/Lua$Conversion;

    const-string v1, "NONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/Lua$Conversion;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/Lua$Conversion;->NONE:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-static {}, Lparty/iroiro/luajava/Lua$Conversion;->$values()[Lparty/iroiro/luajava/Lua$Conversion;

    move-result-object v0

    sput-object v0, Lparty/iroiro/luajava/Lua$Conversion;->$VALUES:[Lparty/iroiro/luajava/Lua$Conversion;

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

.method public static valueOf(Ljava/lang/String;)Lparty/iroiro/luajava/Lua$Conversion;
    .locals 1

    const-class v0, Lparty/iroiro/luajava/Lua$Conversion;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lparty/iroiro/luajava/Lua$Conversion;

    return-object p0
.end method

.method public static values()[Lparty/iroiro/luajava/Lua$Conversion;
    .locals 1

    sget-object v0, Lparty/iroiro/luajava/Lua$Conversion;->$VALUES:[Lparty/iroiro/luajava/Lua$Conversion;

    invoke-virtual {v0}, [Lparty/iroiro/luajava/Lua$Conversion;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lparty/iroiro/luajava/Lua$Conversion;

    return-object v0
.end method
