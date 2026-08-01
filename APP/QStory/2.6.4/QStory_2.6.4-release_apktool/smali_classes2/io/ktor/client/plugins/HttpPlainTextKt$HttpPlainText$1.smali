.class final synthetic Lio/ktor/client/plugins/HttpPlainTextKt$HttpPlainText$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lio/ktor/client/plugins/HttpPlainTextKt$HttpPlainText$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/ktor/client/plugins/HttpPlainTextKt$HttpPlainText$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/ktor/client/plugins/HttpPlainTextKt$HttpPlainText$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/ktor/client/plugins/HttpPlainTextKt$HttpPlainText$1;->INSTANCE:Lio/ktor/client/plugins/HttpPlainTextKt$HttpPlainText$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "<init>()V"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const-class v2, Lio/ktor/client/plugins/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    const-string v3, "<init>"

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
.method public final invoke()Lio/ktor/client/plugins/飘花落叶言子楪苏兰哲世;
    .locals 1

    .line 1
    new-instance p0, Lio/ktor/client/plugins/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 17
    .line 18
    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 19
    invoke-virtual {p0}, Lio/ktor/client/plugins/HttpPlainTextKt$HttpPlainText$1;->invoke()Lio/ktor/client/plugins/飘花落叶言子楪苏兰哲世;

    move-result-object p0

    return-object p0
.end method
