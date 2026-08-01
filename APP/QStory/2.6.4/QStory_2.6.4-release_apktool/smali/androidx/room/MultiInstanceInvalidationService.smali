.class public final Landroidx/room/MultiInstanceInvalidationService;
.super Landroid/app/Service;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Landroidx/room/MultiInstanceInvalidationService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "room-runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final 飘花落叶言子楪兰世苏哲:Landroidx/room/飘花落叶言子楪哲世苏兰;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪哲兰苏世:Landroidx/room/飘花落叶言子楪哲世兰苏;

.field public 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/room/MultiInstanceInvalidationService;->飘花落叶言子楪哲兰世苏:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    new-instance v0, Landroidx/room/飘花落叶言子楪哲世兰苏;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Landroidx/room/飘花落叶言子楪哲世兰苏;-><init>(Landroidx/room/MultiInstanceInvalidationService;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/room/MultiInstanceInvalidationService;->飘花落叶言子楪哲兰苏世:Landroidx/room/飘花落叶言子楪哲世兰苏;

    .line 17
    .line 18
    new-instance v0, Landroidx/room/飘花落叶言子楪哲世苏兰;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Landroidx/room/飘花落叶言子楪哲世苏兰;-><init>(Landroidx/room/MultiInstanceInvalidationService;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/room/MultiInstanceInvalidationService;->飘花落叶言子楪兰世苏哲:Landroidx/room/飘花落叶言子楪哲世苏兰;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/room/MultiInstanceInvalidationService;->飘花落叶言子楪兰世苏哲:Landroidx/room/飘花落叶言子楪哲世苏兰;

    .line 5
    .line 6
    return-object p0
.end method
