.class public abstract Landroidx/fragment/app/strictmode/RetainInstanceUsageViolation;
.super Landroidx/fragment/app/strictmode/Violation;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008&\u0018\u00002\u00020\u0001B\u001d\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/fragment/app/strictmode/RetainInstanceUsageViolation;",
        "Landroidx/fragment/app/strictmode/Violation;",
        "Landroidx/fragment/app/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "fragment",
        "",
        "message",
        "<init>",
        "(Landroidx/fragment/app/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;Ljava/lang/String;)V",
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


# direct methods
.method public constructor <init>(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    invoke-direct {p0, p1, p2}, Landroidx/fragment/app/strictmode/Violation;-><init>(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Ljava/lang/String;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/fragment/app/strictmode/RetainInstanceUsageViolation;-><init>(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
