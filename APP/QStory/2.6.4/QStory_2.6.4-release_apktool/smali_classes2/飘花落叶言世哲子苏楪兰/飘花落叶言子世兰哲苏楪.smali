.class public final L飘花落叶言世哲子苏楪兰/飘花落叶言子世兰哲苏楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子苏楪兰/飘花落叶言子世兰哲楪苏;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子世兰哲苏楪;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子世兰哲苏楪;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子世兰哲苏楪;

    .line 7
    .line 8
    sget-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子世兰哲楪苏;

    .line 9
    .line 10
    sput-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子苏楪兰/飘花落叶言子世兰哲楪苏;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final deserialize(L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 2
    .line 3
    const-string p1, "\'kotlin.Nothing\' does not have instances"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final getDescriptor()L飘花落叶言世哲子楪苏兰/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 1
    sget-object p0, L飘花落叶言世哲子苏楪兰/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲子苏楪兰/飘花落叶言子世兰哲楪苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, Lkotlinx/serialization/SerializationException;

    .line 7
    .line 8
    const-string p1, "\'kotlin.Nothing\' cannot be serialized"

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lkotlinx/serialization/SerializationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method
