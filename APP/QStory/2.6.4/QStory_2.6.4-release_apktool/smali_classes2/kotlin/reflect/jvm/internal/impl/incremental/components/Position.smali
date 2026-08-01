.class public final Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final Companion:L飘花落叶言世楪苏哲兰子/飘花落叶言子楪世哲苏兰;

.field private static final NO_POSITION:Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;


# instance fields
.field private final column:I

.field private final line:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言世楪苏哲兰子/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;->Companion:L飘花落叶言世楪苏哲兰子/飘花落叶言子楪世哲苏兰;

    .line 7
    .line 8
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    invoke-direct {v0, v1, v1}, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;-><init>(II)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;->NO_POSITION:Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;->line:I

    .line 5
    .line 6
    iput p2, p0, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;->column:I

    .line 7
    .line 8
    return-void
.end method

.method public static final synthetic access$getNO_POSITION$cp()Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;->NO_POSITION:Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;

    .line 12
    .line 13
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;->line:I

    .line 14
    .line 15
    iget v3, p1, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;->line:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;->column:I

    .line 21
    .line 22
    iget p1, p1, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;->column:I

    .line 23
    .line 24
    if-eq p0, p1, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;->line:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;->column:I

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Position(line="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;->line:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", column="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/incremental/components/Position;->column:I

    .line 19
    .line 20
    const/16 v1, 0x29

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
