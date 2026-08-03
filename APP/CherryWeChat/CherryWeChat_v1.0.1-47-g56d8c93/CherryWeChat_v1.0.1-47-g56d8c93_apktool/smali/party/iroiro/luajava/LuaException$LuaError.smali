.class public final enum Lparty/iroiro/luajava/LuaException$LuaError;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lparty/iroiro/luajava/LuaException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "LuaError"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lparty/iroiro/luajava/LuaException$LuaError;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lparty/iroiro/luajava/LuaException$LuaError;

.field public static final enum FILE:Lparty/iroiro/luajava/LuaException$LuaError;

.field public static final enum GC:Lparty/iroiro/luajava/LuaException$LuaError;

.field public static final enum HANDLER:Lparty/iroiro/luajava/LuaException$LuaError;

.field public static final enum JAVA:Lparty/iroiro/luajava/LuaException$LuaError;

.field public static final enum MEMORY:Lparty/iroiro/luajava/LuaException$LuaError;

.field public static final enum OK:Lparty/iroiro/luajava/LuaException$LuaError;

.field public static final enum RUNTIME:Lparty/iroiro/luajava/LuaException$LuaError;

.field public static final enum SYNTAX:Lparty/iroiro/luajava/LuaException$LuaError;

.field public static final enum UNKNOWN:Lparty/iroiro/luajava/LuaException$LuaError;

.field public static final enum YIELD:Lparty/iroiro/luajava/LuaException$LuaError;


# direct methods
.method private static synthetic $values()[Lparty/iroiro/luajava/LuaException$LuaError;
    .locals 10

    sget-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->FILE:Lparty/iroiro/luajava/LuaException$LuaError;

    sget-object v1, Lparty/iroiro/luajava/LuaException$LuaError;->GC:Lparty/iroiro/luajava/LuaException$LuaError;

    sget-object v2, Lparty/iroiro/luajava/LuaException$LuaError;->HANDLER:Lparty/iroiro/luajava/LuaException$LuaError;

    sget-object v3, Lparty/iroiro/luajava/LuaException$LuaError;->MEMORY:Lparty/iroiro/luajava/LuaException$LuaError;

    sget-object v4, Lparty/iroiro/luajava/LuaException$LuaError;->OK:Lparty/iroiro/luajava/LuaException$LuaError;

    sget-object v5, Lparty/iroiro/luajava/LuaException$LuaError;->RUNTIME:Lparty/iroiro/luajava/LuaException$LuaError;

    sget-object v6, Lparty/iroiro/luajava/LuaException$LuaError;->SYNTAX:Lparty/iroiro/luajava/LuaException$LuaError;

    sget-object v7, Lparty/iroiro/luajava/LuaException$LuaError;->YIELD:Lparty/iroiro/luajava/LuaException$LuaError;

    sget-object v8, Lparty/iroiro/luajava/LuaException$LuaError;->UNKNOWN:Lparty/iroiro/luajava/LuaException$LuaError;

    sget-object v9, Lparty/iroiro/luajava/LuaException$LuaError;->JAVA:Lparty/iroiro/luajava/LuaException$LuaError;

    filled-new-array/range {v0 .. v9}, [Lparty/iroiro/luajava/LuaException$LuaError;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "FILE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/LuaException$LuaError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->FILE:Lparty/iroiro/luajava/LuaException$LuaError;

    new-instance v0, Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "GC"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/LuaException$LuaError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->GC:Lparty/iroiro/luajava/LuaException$LuaError;

    new-instance v0, Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "HANDLER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/LuaException$LuaError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->HANDLER:Lparty/iroiro/luajava/LuaException$LuaError;

    new-instance v0, Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "MEMORY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/LuaException$LuaError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->MEMORY:Lparty/iroiro/luajava/LuaException$LuaError;

    new-instance v0, Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "OK"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/LuaException$LuaError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->OK:Lparty/iroiro/luajava/LuaException$LuaError;

    new-instance v0, Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "RUNTIME"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/LuaException$LuaError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->RUNTIME:Lparty/iroiro/luajava/LuaException$LuaError;

    new-instance v0, Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "SYNTAX"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/LuaException$LuaError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->SYNTAX:Lparty/iroiro/luajava/LuaException$LuaError;

    new-instance v0, Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "YIELD"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/LuaException$LuaError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->YIELD:Lparty/iroiro/luajava/LuaException$LuaError;

    new-instance v0, Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "UNKNOWN"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/LuaException$LuaError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->UNKNOWN:Lparty/iroiro/luajava/LuaException$LuaError;

    new-instance v0, Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "JAVA"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lparty/iroiro/luajava/LuaException$LuaError;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->JAVA:Lparty/iroiro/luajava/LuaException$LuaError;

    invoke-static {}, Lparty/iroiro/luajava/LuaException$LuaError;->$values()[Lparty/iroiro/luajava/LuaException$LuaError;

    move-result-object v0

    sput-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->$VALUES:[Lparty/iroiro/luajava/LuaException$LuaError;

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

.method public static valueOf(Ljava/lang/String;)Lparty/iroiro/luajava/LuaException$LuaError;
    .locals 1

    const-class v0, Lparty/iroiro/luajava/LuaException$LuaError;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lparty/iroiro/luajava/LuaException$LuaError;

    return-object p0
.end method

.method public static values()[Lparty/iroiro/luajava/LuaException$LuaError;
    .locals 1

    sget-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->$VALUES:[Lparty/iroiro/luajava/LuaException$LuaError;

    invoke-virtual {v0}, [Lparty/iroiro/luajava/LuaException$LuaError;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lparty/iroiro/luajava/LuaException$LuaError;

    return-object v0
.end method
