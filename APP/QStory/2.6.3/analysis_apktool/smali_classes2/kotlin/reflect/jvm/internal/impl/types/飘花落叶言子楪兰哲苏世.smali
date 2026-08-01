.class public final Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;
.super Ljava/lang/Object;

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    sget-object p0, L飘花落叶言世子兰苏哲楪/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪苏哲兰:Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lkotlin/reflect/jvm/internal/impl/name/飘花落叶言子楪世哲苏兰;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    xor-int/lit8 p0, p0, 0x1

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p0, "Argument for @NotNull parameter \'name\' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null"

    .line 24
    .line 25
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    :goto_0
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/types/飘花落叶言子世楪苏兰哲;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
