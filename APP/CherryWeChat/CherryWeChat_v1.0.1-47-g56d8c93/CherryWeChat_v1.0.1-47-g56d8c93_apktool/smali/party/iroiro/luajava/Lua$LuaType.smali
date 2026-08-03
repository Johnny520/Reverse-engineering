.class public final enum Lparty/iroiro/luajava/Lua$LuaType;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lparty/iroiro/luajava/Lua;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "LuaType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lparty/iroiro/luajava/Lua$LuaType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lparty/iroiro/luajava/Lua$LuaType;

.field public static final enum BOOLEAN:Lparty/iroiro/luajava/Lua$LuaType;

.field public static final enum FUNCTION:Lparty/iroiro/luajava/Lua$LuaType;

.field public static final enum LIGHTUSERDATA:Lparty/iroiro/luajava/Lua$LuaType;

.field public static final enum NIL:Lparty/iroiro/luajava/Lua$LuaType;

.field public static final enum NONE:Lparty/iroiro/luajava/Lua$LuaType;

.field public static final enum NUMBER:Lparty/iroiro/luajava/Lua$LuaType;

.field public static final enum STRING:Lparty/iroiro/luajava/Lua$LuaType;

.field public static final enum TABLE:Lparty/iroiro/luajava/Lua$LuaType;

.field public static final enum THREAD:Lparty/iroiro/luajava/Lua$LuaType;

.field public static final enum USERDATA:Lparty/iroiro/luajava/Lua$LuaType;


# direct methods
.method private static synthetic $values()[Lparty/iroiro/luajava/Lua$LuaType;
    .locals 10

    sget-object v0, Lparty/iroiro/luajava/Lua$LuaType;->BOOLEAN:Lparty/iroiro/luajava/Lua$LuaType;

    sget-object v1, Lparty/iroiro/luajava/Lua$LuaType;->FUNCTION:Lparty/iroiro/luajava/Lua$LuaType;

    sget-object v2, Lparty/iroiro/luajava/Lua$LuaType;->LIGHTUSERDATA:Lparty/iroiro/luajava/Lua$LuaType;

    sget-object v3, Lparty/iroiro/luajava/Lua$LuaType;->NIL:Lparty/iroiro/luajava/Lua$LuaType;

    sget-object v4, Lparty/iroiro/luajava/Lua$LuaType;->NONE:Lparty/iroiro/luajava/Lua$LuaType;

    sget-object v5, Lparty/iroiro/luajava/Lua$LuaType;->NUMBER:Lparty/iroiro/luajava/Lua$LuaType;

    sget-object v6, Lparty/iroiro/luajava/Lua$LuaType;->STRING:Lparty/iroiro/luajava/Lua$LuaType;

    sget-object v7, Lparty/iroiro/luajava/Lua$LuaType;->TABLE:Lparty/iroiro/luajava/Lua$LuaType;

    sget-object v8, Lparty/iroiro/luajava/Lua$LuaType;->THREAD:Lparty/iroiro/luajava/Lua$LuaType;

    sget-object v9, Lparty/iroiro/luajava/Lua$LuaType;->USERDATA:Lparty/iroiro/luajava/Lua$LuaType;

    filled-new-array/range {v0 .. v9}, [Lparty/iroiro/luajava/Lua$LuaType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lparty/iroiro/luajava/Lua$LuaType;

    const-string v1, "BOOLEAN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/Lua$LuaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/Lua$LuaType;->BOOLEAN:Lparty/iroiro/luajava/Lua$LuaType;

    new-instance v0, Lparty/iroiro/luajava/Lua$LuaType;

    const-string v1, "FUNCTION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/Lua$LuaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/Lua$LuaType;->FUNCTION:Lparty/iroiro/luajava/Lua$LuaType;

    new-instance v0, Lparty/iroiro/luajava/Lua$LuaType;

    const-string v1, "LIGHTUSERDATA"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/Lua$LuaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/Lua$LuaType;->LIGHTUSERDATA:Lparty/iroiro/luajava/Lua$LuaType;

    new-instance v0, Lparty/iroiro/luajava/Lua$LuaType;

    const-string v1, "NIL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/Lua$LuaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/Lua$LuaType;->NIL:Lparty/iroiro/luajava/Lua$LuaType;

    new-instance v0, Lparty/iroiro/luajava/Lua$LuaType;

    const-string v1, "NONE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/Lua$LuaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/Lua$LuaType;->NONE:Lparty/iroiro/luajava/Lua$LuaType;

    new-instance v0, Lparty/iroiro/luajava/Lua$LuaType;

    const-string v1, "NUMBER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/Lua$LuaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/Lua$LuaType;->NUMBER:Lparty/iroiro/luajava/Lua$LuaType;

    new-instance v0, Lparty/iroiro/luajava/Lua$LuaType;

    const-string v1, "STRING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/Lua$LuaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/Lua$LuaType;->STRING:Lparty/iroiro/luajava/Lua$LuaType;

    new-instance v0, Lparty/iroiro/luajava/Lua$LuaType;

    const-string v1, "TABLE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/Lua$LuaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/Lua$LuaType;->TABLE:Lparty/iroiro/luajava/Lua$LuaType;

    new-instance v0, Lparty/iroiro/luajava/Lua$LuaType;

    const-string v1, "THREAD"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/Lua$LuaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/Lua$LuaType;->THREAD:Lparty/iroiro/luajava/Lua$LuaType;

    new-instance v0, Lparty/iroiro/luajava/Lua$LuaType;

    const-string v1, "USERDATA"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/Lua$LuaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/Lua$LuaType;->USERDATA:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-static {}, Lparty/iroiro/luajava/Lua$LuaType;->$values()[Lparty/iroiro/luajava/Lua$LuaType;

    move-result-object v0

    sput-object v0, Lparty/iroiro/luajava/Lua$LuaType;->$VALUES:[Lparty/iroiro/luajava/Lua$LuaType;

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

.method public static valueOf(Ljava/lang/String;)Lparty/iroiro/luajava/Lua$LuaType;
    .locals 1

    const-class v0, Lparty/iroiro/luajava/Lua$LuaType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lparty/iroiro/luajava/Lua$LuaType;

    return-object p0
.end method

.method public static values()[Lparty/iroiro/luajava/Lua$LuaType;
    .locals 1

    sget-object v0, Lparty/iroiro/luajava/Lua$LuaType;->$VALUES:[Lparty/iroiro/luajava/Lua$LuaType;

    invoke-virtual {v0}, [Lparty/iroiro/luajava/Lua$LuaType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lparty/iroiro/luajava/Lua$LuaType;

    return-object v0
.end method
