.class final synthetic Lkotlinx/coroutines/channels/BufferedChannelKt$createSegmentFunction$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lkotlinx/coroutines/channels/BufferedChannelKt$createSegmentFunction$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/channels/BufferedChannelKt$createSegmentFunction$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlinx/coroutines/channels/BufferedChannelKt$createSegmentFunction$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlinx/coroutines/channels/BufferedChannelKt$createSegmentFunction$1;->INSTANCE:Lkotlinx/coroutines/channels/BufferedChannelKt$createSegmentFunction$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    const/4 v1, 0x2

    .line 5
    const-class v2, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    const-string v3, "createSegment"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 17
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    check-cast p2, Lkotlinx/coroutines/channels/飘花落叶言子楪哲世兰苏;

    invoke-virtual {p0, v0, v1, p2}, Lkotlinx/coroutines/channels/BufferedChannelKt$createSegmentFunction$1;->invoke(JLkotlinx/coroutines/channels/飘花落叶言子楪哲世兰苏;)Lkotlinx/coroutines/channels/飘花落叶言子楪哲世兰苏;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(JLkotlinx/coroutines/channels/飘花落叶言子楪哲世兰苏;)Lkotlinx/coroutines/channels/飘花落叶言子楪哲世兰苏;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u5170\u82cf;",
            ")",
            "Lkotlinx/coroutines/channels/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u5170\u82cf;"
        }
    .end annotation

    .line 1
    sget-object p0, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/channels/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    new-instance v0, Lkotlinx/coroutines/channels/飘花落叶言子楪哲世兰苏;

    .line 4
    .line 5
    iget-object v4, p3, Lkotlinx/coroutines/channels/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 6
    .line 7
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    move-wide v1, p1

    .line 12
    move-object v3, p3

    .line 13
    invoke-direct/range {v0 .. v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲世兰苏;-><init>(JLkotlinx/coroutines/channels/飘花落叶言子楪哲世兰苏;Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;I)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
