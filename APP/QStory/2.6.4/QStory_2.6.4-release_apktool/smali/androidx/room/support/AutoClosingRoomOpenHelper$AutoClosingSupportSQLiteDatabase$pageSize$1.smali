.class final synthetic Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1;
.super Lkotlin/jvm/internal/MutablePropertyReference1Impl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1;->INSTANCE:Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const-string v0, "getPageSize()J"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-class v2, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    const-string v3, "pageSize"

    .line 7
    .line 8
    invoke-direct {p0, v2, v3, v0, v1}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-interface {p1}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰楪苏()J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-interface {p1, v0, v1}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子哲世兰楪苏(J)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
