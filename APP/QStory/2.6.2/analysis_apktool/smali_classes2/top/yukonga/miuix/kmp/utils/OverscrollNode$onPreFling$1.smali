.class final Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "top.yukonga.miuix.kmp.utils.OverscrollNode"
    f = "Overscroll.kt"
    l = {
        0x16d,
        0x173
    }
    m = "onPreFling-QWom1Mo"
    v = 0x2
.end annotation


# instance fields
.field I$0:I

.field J$0:J

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;


# direct methods
.method public constructor <init>(Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltop/yukonga/miuix/kmp/utils/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iput-object p1, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Ltop/yukonga/miuix/kmp/utils/OverscrollNode$onPreFling$1;->this$0:Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, p0}, Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏世哲兰楪(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
