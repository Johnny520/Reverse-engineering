.class final Lkotlin/uuid/UuidSerialized;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Externalizable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0014\u001a\u0004\u0008\u0019\u0010\u0016\"\u0004\u0008\u001a\u0010\u0018\u00a8\u0006\u001d"
    }
    d2 = {
        "Lkotlin/uuid/UuidSerialized;",
        "Ljava/io/Externalizable;",
        "",
        "mostSignificantBits",
        "leastSignificantBits",
        "<init>",
        "(JJ)V",
        "()V",
        "",
        "readResolve",
        "()Ljava/lang/Object;",
        "Ljava/io/ObjectOutput;",
        "output",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "writeExternal",
        "(Ljava/io/ObjectOutput;)V",
        "Ljava/io/ObjectInput;",
        "input",
        "readExternal",
        "(Ljava/io/ObjectInput;)V",
        "J",
        "getMostSignificantBits",
        "()J",
        "setMostSignificantBits",
        "(J)V",
        "getLeastSignificantBits",
        "setLeastSignificantBits",
        "Companion",
        "kotlin/uuid/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lkotlin/uuid/飘花落叶言子楪世苏兰哲;

.field private static final serialVersionUID:J


# instance fields
.field private leastSignificantBits:J

.field private mostSignificantBits:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkotlin/uuid/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkotlin/uuid/UuidSerialized;->Companion:Lkotlin/uuid/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 9
    invoke-direct {p0, v0, v1, v0, v1}, Lkotlin/uuid/UuidSerialized;-><init>(JJ)V

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lkotlin/uuid/UuidSerialized;->mostSignificantBits:J

    .line 5
    .line 6
    iput-wide p3, p0, Lkotlin/uuid/UuidSerialized;->leastSignificantBits:J

    .line 7
    .line 8
    return-void
.end method

.method private final readResolve()Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkotlin/uuid/Uuid;->Companion:Lkotlin/uuid/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget-wide v1, p0, Lkotlin/uuid/UuidSerialized;->mostSignificantBits:J

    .line 4
    .line 5
    iget-wide v3, p0, Lkotlin/uuid/UuidSerialized;->leastSignificantBits:J

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, v3, v4}, Lkotlin/uuid/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(JJ)Lkotlin/uuid/Uuid;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method


# virtual methods
.method public final getLeastSignificantBits()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lkotlin/uuid/UuidSerialized;->leastSignificantBits:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getMostSignificantBits()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lkotlin/uuid/UuidSerialized;->mostSignificantBits:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public readExternal(Ljava/io/ObjectInput;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/io/DataInput;->readLong()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, Lkotlin/uuid/UuidSerialized;->mostSignificantBits:J

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/io/DataInput;->readLong()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iput-wide v0, p0, Lkotlin/uuid/UuidSerialized;->leastSignificantBits:J

    .line 15
    .line 16
    return-void
.end method

.method public final setLeastSignificantBits(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lkotlin/uuid/UuidSerialized;->leastSignificantBits:J

    .line 2
    .line 3
    return-void
.end method

.method public final setMostSignificantBits(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lkotlin/uuid/UuidSerialized;->mostSignificantBits:J

    .line 2
    .line 3
    return-void
.end method

.method public writeExternal(Ljava/io/ObjectOutput;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Lkotlin/uuid/UuidSerialized;->mostSignificantBits:J

    .line 5
    .line 6
    invoke-interface {p1, v0, v1}, Ljava/io/DataOutput;->writeLong(J)V

    .line 7
    .line 8
    .line 9
    iget-wide v0, p0, Lkotlin/uuid/UuidSerialized;->leastSignificantBits:J

    .line 10
    .line 11
    invoke-interface {p1, v0, v1}, Ljava/io/DataOutput;->writeLong(J)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
