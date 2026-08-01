.class final synthetic Lkotlin/reflect/jvm/internal/types/CapturedKType$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


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


# static fields
.field public static final INSTANCE:Lkotlin/reflect/jvm/internal/types/CapturedKType$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/types/CapturedKType$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/types/CapturedKType$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/reflect/jvm/internal/types/CapturedKType$1;->INSTANCE:Lkotlin/reflect/jvm/internal/types/CapturedKType$1;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "javaTypeNotSupported()Ljava/lang/Void;"

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    const-class v2, Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 6
    .line 7
    const-string v3, "javaTypeNotSupported"

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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/types/CapturedKType$1;->invoke()Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Ljava/lang/Void;
    .locals 1

    .line 1
    new-instance p0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    .line 2
    .line 3
    const-string v0, "javaType for captured types is not supported"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
