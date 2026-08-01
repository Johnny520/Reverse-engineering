.class public final Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/suzhelan/qstory/entity/proto/InfoSyncPush;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SyncRecallOperateInfo"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$$serializer;,
        Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$Companion;,
        Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody;,
        Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 12\u00020\u0001:\u00042341B/\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tB?\u0008\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J8\u0010\u001d\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001a\u0010&\u001a\u00020%2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008&\u0010\'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010(\u0012\u0004\u0008*\u0010+\u001a\u0004\u0008)\u0010\u0019R&\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010,\u0012\u0004\u0008.\u0010+\u001a\u0004\u0008-\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010(\u0012\u0004\u00080\u0010+\u001a\u0004\u0008/\u0010\u0019\u00a8\u00065"
    }
    d2 = {
        "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;",
        "",
        "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;",
        "syncInfoHead",
        "",
        "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody;",
        "syncInfoBodyList",
        "subHead",
        "<init>",
        "(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;)V",
        "",
        "seen0",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5b50\u82cf\u696a\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u696a\u5170\u4e16;",
        "serializationConstructorMarker",
        "(ILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5b50\u82cf\u696a\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u696a\u5170\u4e16;)V",
        "self",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5b50\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "output",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5b50\u696a\u82cf\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
        "serialDesc",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "write$Self$QStory_app_publishRelease",
        "(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5b50\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5b50\u696a\u82cf\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;)V",
        "write$Self",
        "component1",
        "()Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "copy",
        "(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;",
        "getSyncInfoHead",
        "getSyncInfoHead$annotations",
        "()V",
        "Ljava/util/List;",
        "getSyncInfoBodyList",
        "getSyncInfoBodyList$annotations",
        "getSubHead",
        "getSubHead$annotations",
        "Companion",
        "SyncInfoHead",
        "SyncInfoBody",
        "$serializer",
        "QStory:app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field private static final $childSerializers:[Lkotlin/飘花落叶言子楪苏世哲兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$Companion;


# instance fields
.field private final subHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

.field private final syncInfoBodyList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody;",
            ">;"
        }
    .end annotation
.end field

.field private final syncInfoHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$Companion;-><init>(Lkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->Companion:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->$stable:I

    .line 12
    .line 13
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 14
    .line 15
    new-instance v2, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 16
    .line 17
    const/4 v3, 0x7

    .line 18
    invoke-direct {v2, v3}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v2}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v2, 0x3

    .line 26
    new-array v2, v2, [Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    aput-object v1, v2, v3

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    aput-object v0, v2, v3

    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    aput-object v1, v2, v0

    .line 36
    .line 37
    sput-object v2, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->$childSerializers:[Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 35
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;-><init>(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    return-void
.end method

.method public constructor <init>(ILtop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;L飘花落叶言世哲子苏楪兰/飘花落叶言子苏哲楪兰世;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p5, p1, 0x1

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-nez p5, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p2, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 13
    .line 14
    :goto_0
    and-int/lit8 p2, p1, 0x2

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    sget-object p2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 19
    .line 20
    iput-object p2, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoBodyList:Ljava/util/List;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    iput-object p3, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoBodyList:Ljava/util/List;

    .line 24
    .line 25
    :goto_1
    and-int/lit8 p1, p1, 0x4

    .line 26
    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    iput-object v0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->subHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    iput-object p4, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->subHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;",
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody;",
            ">;",
            "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;",
            ")V"
        }
    .end annotation

    const/16 v0, 0x656

    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 38
    iput-object p2, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoBodyList:Ljava/util/List;

    .line 39
    iput-object p3, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->subHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    return-void
.end method

.method public constructor <init>(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 40
    sget-object p2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 41
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;-><init>(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    sget-object v1, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody$$serializer;->INSTANCE:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody$$serializer;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;I)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lkotlin/飘花落叶言子楪苏世哲兰;
    .locals 1

    .line 1
    sget-object v0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->$childSerializers:[Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic copy$default(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;ILjava/lang/Object;)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoBodyList:Ljava/util/List;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->subHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 18
    .line 19
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->copy(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static synthetic getSubHead$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏兰哲;
        number = 0x5
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getSyncInfoBodyList$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏兰哲;
        number = 0x4
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getSyncInfoHead$annotations()V
    .locals 0
    .annotation runtime L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏兰哲;
        number = 0x3
    .end annotation

    .line 1
    return-void
.end method

.method public static final write$Self$QStory_app_publishRelease(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)V
    .locals 4

    .line 1
    sget-object v0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->$childSerializers:[Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    invoke-interface {p1, p2}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲苏楪兰(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    :goto_0
    sget-object v1, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead$$serializer;->INSTANCE:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead$$serializer;

    .line 15
    .line 16
    iget-object v2, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-interface {p1, p2, v3, v1, v2}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲苏世(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-interface {p1, p2}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲苏楪兰(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoBodyList:Ljava/util/List;

    .line 30
    .line 31
    sget-object v2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 32
    .line 33
    invoke-static {v1, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_3

    .line 38
    .line 39
    :goto_1
    const/4 v1, 0x1

    .line 40
    aget-object v0, v0, v1

    .line 41
    .line 42
    invoke-interface {v0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 47
    .line 48
    iget-object v2, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoBodyList:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {p1, p2, v1, v0, v2}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-interface {p1, p2}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲苏楪兰(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    iget-object v0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->subHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 61
    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    :goto_2
    sget-object v0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead$$serializer;->INSTANCE:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead$$serializer;

    .line 65
    .line 66
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->subHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 67
    .line 68
    const/4 v1, 0x2

    .line 69
    invoke-interface {p1, p2, v1, v0, p0}, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲苏世(L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;IL飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_5
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰()L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->_childSerializers$_anonymous_()L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method


# virtual methods
.method public final component1()Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoBodyList:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->subHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;",
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody;",
            ">;",
            "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;",
            ")",
            "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;"
        }
    .end annotation

    .line 1
    const/16 p0, 0x656

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    .line 10
    .line 11
    invoke-direct {p0, p1, p2, p3}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;-><init>(Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;Ljava/util/List;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;)V

    .line 12
    .line 13
    .line 14
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
    instance-of v1, p1, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

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
    check-cast p1, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;

    .line 12
    .line 13
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 14
    .line 15
    iget-object v3, p1, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoBodyList:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p1, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoBodyList:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->subHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 36
    .line 37
    iget-object p1, p1, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->subHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 38
    .line 39
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final getSubHead()Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->subHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSyncInfoBodyList()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoBody;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoBodyList:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSyncInfoHead()Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    const/16 v2, 0x1f

    .line 13
    .line 14
    mul-int/2addr v0, v2

    .line 15
    iget-object v3, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoBodyList:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v3, v0, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->subHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 22
    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-virtual {p0}, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    :goto_1
    add-int/2addr v0, v1

    .line 31
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x554

    .line 7
    .line 8
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const/16 v1, 0x659

    .line 21
    .line 22
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->syncInfoBodyList:Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const/16 v1, 0x556

    .line 35
    .line 36
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo;->subHead:Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncRecallOperateInfo$SyncInfoHead;

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const/16 p0, 0x29

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method
