.class public final Landroidx/fragment/app/strictmode/SetUserVisibleHintViolation;
.super Landroidx/fragment/app/strictmode/Violation;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0019\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0008\u001a\u0004\u0008\u0005\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/fragment/app/strictmode/SetUserVisibleHintViolation;",
        "Landroidx/fragment/app/strictmode/Violation;",
        "Landroidx/fragment/app/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "fragment",
        "",
        "isVisibleToUser",
        "<init>",
        "(Landroidx/fragment/app/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;Z)V",
        "Z",
        "()Z",
        "fragment_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final isVisibleToUser:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "Attempting to set user visible hint to "

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, " for fragment "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p0, p1, v0}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-boolean p2, p0, Landroidx/fragment/app/strictmode/SetUserVisibleHintViolation;->isVisibleToUser:Z

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final isVisibleToUser()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/fragment/app/strictmode/SetUserVisibleHintViolation;->isVisibleToUser:Z

    .line 2
    .line 3
    return p0
.end method
