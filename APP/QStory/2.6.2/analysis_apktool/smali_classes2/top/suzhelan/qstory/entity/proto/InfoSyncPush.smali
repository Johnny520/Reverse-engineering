.class public final Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$$serializer;,
        Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$Companion;,
        Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;,
        Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 52\u00020\u0001:\u00046785B3\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nB?\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\t\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ<\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u0019J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010)\u0012\u0004\u0008+\u0010,\u001a\u0004\u0008*\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010)\u0012\u0004\u0008.\u0010,\u001a\u0004\u0008-\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010/\u0012\u0004\u00081\u0010,\u001a\u0004\u00080\u0010\u001cR\"\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u00102\u0012\u0004\u00084\u0010,\u001a\u0004\u00083\u0010\u001e\u00a8\u00069"
    }
    d2 = {
        "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;",
        "",
        "",
        "type",
        "pushId",
        "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;",
        "syncContent",
        "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;",
        "syncRecallContent",
        "<init>",
        "(IILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;)V",
        "seen0",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u54f2\u5b50\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u696a\u5170;",
        "serializationConstructorMarker",
        "(IIILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u54f2\u5b50\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u696a\u5170;)V",
        "self",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u696a\u54f2\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "output",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u696a\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "serialDesc",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "write$Self$app_publishRelease",
        "(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u696a\u54f2\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u82cf\u5170\u696a\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;)V",
        "write$Self",
        "component1",
        "()I",
        "component2",
        "component3",
        "()Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;",
        "component4",
        "()Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;",
        "copy",
        "(IILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getType",
        "getType$annotations",
        "()V",
        "getPushId",
        "getPushId$annotations",
        "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;",
        "getSyncContent",
        "getSyncContent$annotations",
        "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;",
        "getSyncRecallContent",
        "getSyncRecallContent$annotations",
        "Companion",
        "SyncContent",
        "SyncRecallOperateInfo",
        "$serializer",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation

.annotation runtime L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$Companion;


# instance fields
.field private final pushId:I

.field private final syncContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;

.field private final syncRecallContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

.field private final type:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$Companion;-><init>(Lkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->Companion:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->$stable:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 43
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;-><init>(IILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    return-void
.end method

.method public synthetic constructor <init>(IIILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;L飘花落叶言世苏兰哲子楪/飘花落叶言子苏哲世楪兰;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p6, p1, 0x1

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-nez p6, :cond_0

    .line 8
    .line 9
    iput v0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->type:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput p2, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->type:I

    .line 13
    .line 14
    :goto_0
    and-int/lit8 p2, p1, 0x2

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    iput v0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->pushId:I

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iput p3, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->pushId:I

    .line 22
    .line 23
    :goto_1
    and-int/lit8 p2, p1, 0x4

    .line 24
    .line 25
    const/4 p3, 0x0

    .line 26
    if-nez p2, :cond_2

    .line 27
    .line 28
    iput-object p3, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    iput-object p4, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;

    .line 32
    .line 33
    :goto_2
    and-int/lit8 p1, p1, 0x8

    .line 34
    .line 35
    if-nez p1, :cond_3

    .line 36
    .line 37
    iput-object p3, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncRecallContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    iput-object p5, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncRecallContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    .line 41
    .line 42
    return-void
.end method

.method public constructor <init>(IILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput p1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->type:I

    .line 46
    iput p2, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->pushId:I

    .line 47
    iput-object p3, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;

    .line 48
    iput-object p4, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncRecallContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    return-void
.end method

.method public synthetic constructor <init>(IILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 49
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;-><init>(IILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;)V

    return-void
.end method

.method public static synthetic copy$default(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;IILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;ILjava/lang/Object;)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget p1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->type:I

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    iget p2, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->pushId:I

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 20
    .line 21
    if-eqz p5, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncRecallContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    .line 24
    .line 25
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->copy(IILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static synthetic getPushId$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;
        number = 0x4
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getSyncContent$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;
        number = 0x7
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getSyncRecallContent$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;
        number = 0x8
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世苏兰哲;
        number = 0x3
    .end annotation

    .line 1
    return-void
.end method

.method public static final synthetic write$Self$app_publishRelease(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V
    .locals 3

    .line 1
    invoke-interface {p1, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget v0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->type:I

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :goto_0
    iget v0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->type:I

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-interface {p1, v1, v0, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏(IIL飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-interface {p1, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    iget v0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->pushId:I

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    :goto_1
    iget v0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->pushId:I

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-interface {p1, v1, v0, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏(IIL飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)V

    .line 33
    .line 34
    .line 35
    :cond_3
    invoke-interface {p1, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_4
    iget-object v0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;

    .line 43
    .line 44
    if-eqz v0, :cond_5

    .line 45
    .line 46
    :goto_2
    sget-object v0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent$$serializer;->INSTANCE:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent$$serializer;

    .line 47
    .line 48
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;

    .line 49
    .line 50
    const/4 v2, 0x2

    .line 51
    invoke-interface {p1, p2, v2, v0, v1}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_5
    invoke-interface {p1, p2}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_6

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_6
    iget-object v0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncRecallContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    .line 62
    .line 63
    if-eqz v0, :cond_7

    .line 64
    .line 65
    :goto_3
    sget-object v0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$$serializer;->INSTANCE:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$$serializer;

    .line 66
    .line 67
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncRecallContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    .line 68
    .line 69
    const/4 v1, 0x3

    .line 70
    invoke-interface {p1, p2, v1, v0, p0}, L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世(L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->type:I

    .line 2
    .line 3
    return p0
.end method

.method public final component2()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->pushId:I

    .line 2
    .line 3
    return p0
.end method

.method public final component3()Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncRecallContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(IILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;
    .locals 0

    .line 1
    new-instance p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;-><init>(IILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;

    .line 12
    .line 13
    iget v1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->type:I

    .line 14
    .line 15
    iget v3, p1, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->type:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->pushId:I

    .line 21
    .line 22
    iget v3, p1, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->pushId:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;

    .line 28
    .line 29
    iget-object v3, p1, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;

    .line 30
    .line 31
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncRecallContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    .line 39
    .line 40
    iget-object p1, p1, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncRecallContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    .line 41
    .line 42
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    return v0
.end method

.method public final getPushId()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->pushId:I

    .line 2
    .line 3
    return p0
.end method

.method public final getSyncContent()Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSyncRecallContent()Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncRecallContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getType()I
    .locals 0

    .line 1
    iget p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->type:I

    .line 2
    .line 3
    return p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->type:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->pushId:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    move v2, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v2}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :goto_0
    add-int/2addr v0, v2

    .line 28
    mul-int/2addr v0, v1

    .line 29
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncRecallContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p0}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    :goto_1
    add-int/2addr v0, v3

    .line 39
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide v1, -0x36a5848f051405a7L    # -2.362290525955057E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->type:I

    .line 19
    .line 20
    const-wide v2, -0x36a5847a051405a7L    # -2.3623191096738782E45

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪哲苏兰(Ljava/lang/StringBuilder;IJ)V

    .line 26
    .line 27
    .line 28
    iget v1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->pushId:I

    .line 29
    .line 30
    const-wide v2, -0x36a5846c051405a7L    # -2.3623381654864258E45

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1, v2, v3}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子世楪哲苏兰(Ljava/lang/StringBuilder;IJ)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-wide v1, -0x36a58453051405a7L    # -2.362372193723118E45

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;->syncRecallContent:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const/16 p0, 0x29

    .line 61
    .line 62
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method
