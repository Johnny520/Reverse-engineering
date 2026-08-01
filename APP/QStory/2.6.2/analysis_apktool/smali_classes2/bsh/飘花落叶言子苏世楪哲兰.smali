.class public final synthetic Lbsh/飘花落叶言子苏世楪哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbsh/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lbsh/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lbsh/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Lbsh/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lorg/apache/commons/io/filefilter/OrFileFilter;

    .line 9
    .line 10
    check-cast p1, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/filefilter/OrFileFilter;->addFileFilter(L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p0, Lorg/apache/commons/io/filefilter/AndFileFilter;

    .line 17
    .line 18
    check-cast p1, L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/filefilter/AndFileFilter;->addFileFilter(L飘花落叶言苏子世哲兰楪/飘花落叶言子楪世兰苏哲;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    check-cast p0, Lorg/apache/commons/lang3/text/StrBuilder;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lorg/apache/commons/lang3/text/StrBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/text/StrBuilder;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_2
    check-cast p0, Lorg/apache/commons/lang3/CharSet;

    .line 31
    .line 32
    check-cast p1, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lorg/apache/commons/lang3/CharSet;->add(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_3
    check-cast p0, Ljava/util/HashMap;

    .line 39
    .line 40
    check-cast p1, Ljava/lang/reflect/Field;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p0, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_4
    check-cast p0, Ljava/util/ArrayList;

    .line 51
    .line 52
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_5
    check-cast p0, Lbsh/GeneratedClass;

    .line 59
    .line 60
    check-cast p1, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {p0, p1}, Lbsh/This;->飘花落叶言子楪世苏哲兰(Lbsh/GeneratedClass;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
