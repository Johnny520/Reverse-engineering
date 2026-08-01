.class final synthetic Lkotlin/reflect/jvm/internal/impl/km/Attributes$isNegated$2;
.super Lkotlin/jvm/internal/MutablePropertyReference1Impl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final INSTANCE:Lkotlin/reflect/jvm/internal/impl/km/Attributes$isNegated$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/km/Attributes$isNegated$2;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/km/Attributes$isNegated$2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/km/Attributes$isNegated$2;->INSTANCE:Lkotlin/reflect/jvm/internal/impl/km/Attributes$isNegated$2;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const-string v0, "getFlags$kotlin_metadata()I"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-class v2, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世楪兰哲苏;

    .line 5
    .line 6
    const-string v3, "flags"

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
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    iget p0, p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public set(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    iput p0, p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 10
    .line 11
    return-void
.end method
