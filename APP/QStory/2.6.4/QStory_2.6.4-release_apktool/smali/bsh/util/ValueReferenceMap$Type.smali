.class public final enum Lbsh/util/ValueReferenceMap$Type;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbsh/util/ValueReferenceMap$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lbsh/util/ValueReferenceMap$Type;

.field public static final enum Soft:Lbsh/util/ValueReferenceMap$Type;

.field public static final enum Weak:Lbsh/util/ValueReferenceMap$Type;


# direct methods
.method private static synthetic $values()[Lbsh/util/ValueReferenceMap$Type;
    .locals 2

    .line 1
    sget-object v0, Lbsh/util/ValueReferenceMap$Type;->Weak:Lbsh/util/ValueReferenceMap$Type;

    .line 2
    .line 3
    sget-object v1, Lbsh/util/ValueReferenceMap$Type;->Soft:Lbsh/util/ValueReferenceMap$Type;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lbsh/util/ValueReferenceMap$Type;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lbsh/util/ValueReferenceMap$Type;

    .line 2
    .line 3
    const-string v1, "Weak"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lbsh/util/ValueReferenceMap$Type;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lbsh/util/ValueReferenceMap$Type;->Weak:Lbsh/util/ValueReferenceMap$Type;

    .line 10
    .line 11
    new-instance v0, Lbsh/util/ValueReferenceMap$Type;

    .line 12
    .line 13
    const-string v1, "Soft"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lbsh/util/ValueReferenceMap$Type;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lbsh/util/ValueReferenceMap$Type;->Soft:Lbsh/util/ValueReferenceMap$Type;

    .line 20
    .line 21
    invoke-static {}, Lbsh/util/ValueReferenceMap$Type;->$values()[Lbsh/util/ValueReferenceMap$Type;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lbsh/util/ValueReferenceMap$Type;->$VALUES:[Lbsh/util/ValueReferenceMap$Type;

    .line 26
    .line 27
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbsh/util/ValueReferenceMap$Type;
    .locals 1

    .line 1
    const-class v0, Lbsh/util/ValueReferenceMap$Type;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbsh/util/ValueReferenceMap$Type;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lbsh/util/ValueReferenceMap$Type;
    .locals 1

    .line 1
    sget-object v0, Lbsh/util/ValueReferenceMap$Type;->$VALUES:[Lbsh/util/ValueReferenceMap$Type;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lbsh/util/ValueReferenceMap$Type;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lbsh/util/ValueReferenceMap$Type;

    .line 8
    .line 9
    return-object v0
.end method
