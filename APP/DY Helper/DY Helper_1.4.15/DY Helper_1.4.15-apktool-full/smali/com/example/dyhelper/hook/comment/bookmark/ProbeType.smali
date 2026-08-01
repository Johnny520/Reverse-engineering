.class public final enum Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lqz;

.field private static final synthetic $VALUES:[Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

.field public static final enum COMMENT:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

.field public static final enum PROFILE:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;


# direct methods
.method private static final synthetic $values()[Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;
    .locals 2

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;->COMMENT:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 2
    .line 3
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;->PROFILE:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 2
    .line 3
    const-string v1, "COMMENT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;->COMMENT:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 10
    .line 11
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 12
    .line 13
    const-string v1, "PROFILE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;->PROFILE:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 20
    .line 21
    invoke-static {}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;->$values()[Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;->$VALUES:[Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 26
    .line 27
    invoke-static {v0}, Lkn0;->τ([Ljava/lang/Enum;)Lrz;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;->$ENTRIES:Lqz;

    .line 32
    .line 33
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

.method public static getEntries()Lqz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqz;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;->$ENTRIES:Lqz;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;
    .locals 1

    .line 1
    const-class v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;->$VALUES:[Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 8
    .line 9
    return-object v0
.end method
